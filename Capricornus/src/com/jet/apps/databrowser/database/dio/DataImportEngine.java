package com.jet.apps.databrowser.database.dio;

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;

import com.jet.utils.*;
import com.jet.utils.properties.*;
import com.jet.utils.ui.ProgressWatcher;

import com.jet.database.*;

import com.jet.apps.databrowser.database.*;


/**
 *
 *
 */
public class DataImportEngine extends Thread
   implements com.jet.log.Logger, DataDateFormat
{
   EProperties props=null;
   ConnectionInfo conInfo=null;
   ProgressWatcher progressListener=null;

   DataTranslator translator=null;
   SQLTable sqlTable=null;

   int colITypes[]=null;

   int colCount=0;
   int currentColumn=0;

   private PrintWriter outputWriter=null;

   DataImportMap dataImportMap=null;

   Vector mappedColumns=null;

   /**
    *
    */
   public DataImportEngine(EProperties p, ConnectionInfo ci, 
                           ProgressWatcher pw)
   {
      super();
      this.setName("DataImportEngine");
      props=p;
      conInfo=ci;
      progressListener=pw;

      boolean isAccess=false;
      try {
         DatabaseMetaData dbmd=ci.getMetaData();
         String dbProductName=dbmd.getDatabaseProductName();
         if (dbProductName != null) {
            if (dbProductName.toLowerCase().indexOf("access") != -1) {
               isAccess=true;
            }
         }
      } catch (Exception ex) {
         log.printStackTrace(ex);
      }

      sqlTable=(SQLTable)props.get("import.sqlTable");
      int size=sqlTable.size();
      colITypes=new int[size];
      for (int i=0; i<size; i++)
      {
         colITypes[i]=sqlTable.columnAt(i).getIType();

         // deal with access and timestamps
         if (isAccess && colITypes[i] == 11) // DATETIME in the bridge.
         {
            colITypes[i]=93;
         }
      }

      
      dataImportMap=(DataImportMap)props.get("import.colMap");
      mappedColumns=dataImportMap.getMappedColumns();
      log.writeDebug("Mapped Columns: "+mappedColumns);

      progressListener.setType(progressListener.SINGLE);
   }

   /**
    *
    */
   public void run() {
      importData();
   }

   /**
    *
    */
   private void importData()
   {
      boolean error=false;

      // first, build the sql statement
      String table=props.getProperty("import.table");
      Vector columns=(Vector)props.get("import.columns");
      boolean insertOnly=props.getBoolean("import.insertOnly");
      boolean updateOnly=props.getBoolean("import.updateOnly");
      boolean insertAndUpdate=props.getBoolean("import.insertAndUpdate");
      

      colCount=columns.size();

      // build prepared statements
      String insertPS=
      "INSERT INTO "+table+"\n("+
      SQLUtil.vectorToCS(mappedColumns)+")\n"+
      "VALUES ("+questionMarks(mappedColumns.size())+")";

      String updatePS=
      "UPDATE "+table+" SET \n";
      for (int i=0; i<mappedColumns.size(); i++)
      {
         ColumnMap colMap=
         dataImportMap.getColumnMap((String)mappedColumns.elementAt(i));

         SQLColumn col=colMap.getTableColumn();
         if (!col.isPrimaryKey()) {
            if (i==mappedColumns.size()-1)
               updatePS=updatePS+col.getName()+"=? \nWHERE \n";
            else
               updatePS=updatePS+col.getName()+"=?, \n";
         }
      }

      Vector pkeys=sqlTable.getPrimaryKeys();
      for (int i=0; i<pkeys.size(); i++) {
         SQLColumn c=(SQLColumn)pkeys.elementAt(i);
         if (i == pkeys.size()-1)
            updatePS=updatePS+c.getName()+"= ?";
         else
            updatePS=updatePS+c.getName()+"= ? AND \n";
      }
      
      log.writeDebug("DataImporMap: \n"+dataImportMap);
      
      log.writeDebug("Insert SQL:\n"+insertPS);
      log.writeDebug("Update SQL:\n"+updatePS);

      String fileName=props.getProperty("import.file");
      int rows=props.getInt("import.rowCount");

      log.writeDebug ("Importing "+rows+" of data from "+fileName+" to "+table);


      progressListener.setPrimaryText("Importing data from "+fileName);
      // int inc=progressListener.setPrimaryRange(0, rows);
      int inc=20;

      int index=1;
      int progressIndex=inc;
      

      FileInputStream fis=null;
      PreparedStatement insertState=null;
      PreparedStatement updateState=null;
      ResultSet rs=null;

      int insertSuccess=0;
      int updateSuccess=0;
      int insertFailure=0;
      int updateFailure=0;

      boolean isStopped=false;

      try
      {
         fis=new FileInputStream(fileName);
         BufferedReader br=new BufferedReader(new InputStreamReader(fis));

         Connection con=conInfo.getConnection();
         insertState=con.prepareStatement(insertPS);
         updateState=con.prepareStatement(updatePS);

         String line=null;
         // read the header line off
         line=br.readLine();

         // read the type line off
         line=br.readLine();
         

         translator=new DataTranslator(sqlTable);

         isStopped=false;
         line=br.readLine();  // first line of data
         while (line != null && !isStopped)
         {
            // parse the data columns
            try {
               if (insertOnly || insertAndUpdate)
               {
                  prepareInsert(insertState, line);
                  
                  insertState.executeUpdate();
                  insertSuccess++;
               }
               else if (updateOnly)
               {
                  prepareUpdate(updateState, line);
                  updateState.executeUpdate();
                  updateSuccess ++;
               }
               else
               {
                  throw new Exception ("State error, not inserting or "+
                                       "updating.");
               }
            } catch (SQLException ex) {
               insertFailure++;
               log.writeDebug ("SQL Error inserting row "+index+" "+
                            " currentCol: "+currentColumn+
                            " "+sqlTable.columnAt(currentColumn)+
                            " ex: "+ex.toString());
               log.writeDebug ("SQL State: "+ex.getSQLState()+" Code: "+
                            ex.getErrorCode());
               log.printStackTrace(ex);

               // At this point do we attempt an update?? I think so.
               if (insertAndUpdate && !updateOnly)
               {
                  // run the update
                  try {
                     prepareUpdate(updateState, line);
                     updateState.executeUpdate();
                     updateSuccess ++;
                  } catch (SQLException exx) {
                     updateFailure++;
                     log.writeDebug ("SQLError updating, state: "+
                                  " currentCol: "+currentColumn+
                                  " "+sqlTable.columnAt(currentColumn-1)+
                                  exx.getSQLState()+", "+exx.toString());
                     log.printStackTrace(exx);
                  }
                  catch (Exception exx){
                     updateFailure++;
                     log.writeDebug ("Error inserting row "+index+", "+
                                  " currentCol: "+currentColumn+
                                  " "+sqlTable.columnAt(currentColumn-1)+
                                  " ex: "+exx.toString());
                     log.printStackTrace(exx);
                  }
               }
               
            }
            catch (Exception ex) {
               insertFailure++;
               log.writeDebug ("Error inserting row "+index+", "+
                            " ex: "+ex.toString());
               log.printStackTrace(ex);
               // continue
            }

            index++;
            isStopped=progressListener.isStopped();
            if (index >= progressIndex) {
               progressListener.setPrimaryProgress(index,
                                                   "Insert: "+insertSuccess+" / "+
                                                   (insertSuccess+insertFailure)+
                                                   "  Update: "+updateSuccess+
                                                   " / "+
                                                   (updateSuccess+updateFailure));
               
               // FIXME: This is a hack to let the progress bar and
               // log window update.
               // System.out.println ("Sleeping a bit. ");
               // try {sleep(8000);} catch (Exception ex){}
               progressIndex=progressIndex+inc;
            }

            line=br.readLine();
         }

         log.writeDebug("Import complete.");
      }
      catch (IOException ex)
      {
         log.writeDebug ("IOExeption while importing.");
         log.printStackTrace(ex);
         error=true;
      }
      catch (SQLException ex)
      {
         log.writeDebug ("SQLExeption while importing.");
         log.printStackTrace(ex);
         error=true;
      }
      catch (Exception ex)
      {
         log.writeDebug ("Unknown error importing.");
         log.printStackTrace(ex);
         error=true;
      }
      finally
      {
         // clean up the messz
         if (fis != null) {
            try {
               fis.close();
            } catch (Exception ex) {
               log.printStackTrace(ex);
            }
         }
         
         if (insertState != null) {
            try {
               insertState.close();
            } catch (Exception ex) {
               log.printStackTrace(ex);
            }
         }
      } // end finally
      if (!error && !isStopped)
      {
         String message= "Import Complete.  Statistics:\n"+
         "Insert: "+insertSuccess+" successes from "+
         (insertSuccess+insertFailure)+" attempts.\n"+
         "Update: "+updateSuccess+" successes from "+
         (updateSuccess+updateFailure)+" attempts.";

         progressListener.done(message);
      }
      else if (!error && isStopped)
      {
         String message= "Import Interrupted.  Statistics:\n"+
         "Insert: "+insertSuccess+" successes from "+
         (insertSuccess+insertFailure)+" attempts.\n"+
         "Update: "+updateSuccess+" successes from "+
         (updateSuccess+updateFailure)+" attempts.";

         progressListener.interrupted(message);
      }
      else
         progressListener.done("An error occured while importing.  \n"+
                               "See the console window for more detail.");
   } // done

   /** */
   void prepareUpdate(PreparedStatement ps, String line)
      throws Exception 
   {
      // This function is very inefficient and could be fixed up 
      // fairly easily.  
      DataTokenizer dt=new DataTokenizer(line);

      Vector pkeys=sqlTable.getPrimaryKeys();

      int pkeyCount=pkeys.size();

      String pkeyDat[]=new String[pkeys.size()];
      int pkeyCol[]=new int[pkeyCount];
      int pkeyindex=0;

      ps.clearParameters();

      for (currentColumn=1; currentColumn<=colCount; currentColumn++) {
         String dat=dt.nextToken();

         SQLColumn col=sqlTable.columnAt(currentColumn-1);
         
         if (col.isPrimaryKey())
         {
            pkeyDat[pkeyindex]=dat;
            pkeyCol[pkeyindex]=currentColumn;
            pkeyindex++;
         }
         else
         {
            // try this, can we execute a stored proc without
            // setting one of the parms???
            if (dat!= null) {
               Object o=translator.translate(currentColumn, dat);
               log.writeDebug ("calling setObject with a "+
                            o.getClass().getName());
               ps.setObject(currentColumn, o);
            }
            else {
               ps.setNull(currentColumn, colITypes[currentColumn-1]);
            }
         }
      }
      int loc=colCount-pkeys.size();
      for (int i=0; i<pkeys.size(); i++)
      {
         SQLColumn col=(SQLColumn)pkeys.elementAt(i);
         String dat=pkeyDat[i];
         if (dat != null)
         {
            Object o=translator.translate(pkeyCol[i], dat);
            ps.setObject(loc+i+1, o, col.getIType());
         }
         else {
            ps.setNull(currentColumn, col.getIType());
         }
      }
   }

   Vector getDataVector(String line) {
      Vector v=new Vector();
      DataTokenizer dt=new DataTokenizer(line);
      while (dt.hasMoreTokens()) {
         v.addElement(dt.nextToken());
      }
      return v;
   }

   /** */
   void prepareInsert(PreparedStatement ps, String line)
      throws Exception 
   {
      Vector dataVector=getDataVector(line);

      log.writeDebug ("Operating on line "+line);
      log.writeDebug ("Data Vector: "+dataVector);

      ps.clearParameters();
      int size=mappedColumns.size();      
      for (int i=0; i<size; i++) {
         String colName=(String)mappedColumns.elementAt(i);
         ColumnMap colMap=dataImportMap.getColumnMap(colName);

         String dat=null;
         if (colMap.isMapped()) {
            int index=colMap.getFileColumnIndex();
            if (index != -1)
               dat=(String)dataVector.elementAt(index);
            else {
               log.writeDebug(1, "Error: bad data index "+index+
                              " in colmap "+colMap);
               dat="";
            }
         } else if (colMap.isDefaulted()) {
            dat=colMap.getDefaultValue();
         } else {
            log.writeDebug("What the hell?: "+colMap+" i="+i);
         }

         int currentColumn=sqlTable.getColumnIndex(colName);

         log.writeDebug(7, "Map: "+colMap+" data: '"+dat+"' tableColumn: "+
                        currentColumn);

         // try this, can we execute a stored proc without
         // setting one of the parms???
         if (dat != null) 
         {
            dat=dat.trim();
            Object o=null; 
            try {
              o=translator.translate(currentColumn, dat);
            } catch (ParseException ex) {
              log.writeDebug(1, "Error parsing: Map: "+colMap+" data: '"+
                             dat+"' tableColumn: "+ currentColumn);
              log.writeDebug(1, "Column may be set to null");
            }

            if (o == null){
               //log.writeDebug(3, "Setting col "+currentColumn+" as to null");
               ps.setNull(i+1, colITypes[currentColumn-1]);
            }
            else {
               if (o instanceof String){
                  ps.setString(i+1, (String)o);
               }
               else if (o instanceof Integer){
                  ps.setInt(i+1, ((Integer)o).intValue());
               }
               else if (o instanceof java.sql.Date) {
                  ps.setDate(i+1, (java.sql.Date)o);
               } 
               else if (o instanceof java.sql.Time) {
                  ps.setTime(i+1, (java.sql.Time)o);
               }
               else if (o instanceof java.sql.Timestamp) {
                  ps.setTimestamp(i+1, (java.sql.Timestamp)o);
               }
               else if (o instanceof Boolean) {
                  ps.setBoolean(i+1, ((Boolean)o).booleanValue());
               }
               else {
                  ps.setObject(i+1, o, colITypes[currentColumn-1]);
               }
            }
         }
         else 
            ps.setNull(i+1, colITypes[currentColumn-1]);
      }
   }

   /**
    *
    */
   public void continueExport()
   {

   }


   
   private String questionMarks(int n)
   {
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<n-1; i++)
      {
         sb.append("?,");
      }
      sb.append("?");
      return sb.toString();
   }
}

