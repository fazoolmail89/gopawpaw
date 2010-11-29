package com.jet.apps.databrowser.database.dio;

import com.jet.database.*;

import com.jet.utils.properties.*;
import com.jet.apps.databrowser.database.*;
import com.jet.utils.ui.ProgressWatcher;

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.Vector;

/**
 *
 *
 */
public class DataExportEngine extends Thread
   implements com.jet.log.Logger, DataDateFormat
{
   EProperties props=null;
   ConnectionInfo conInfo=null;
   ProgressWatcher progressListener=null;

   private PrintWriter outputWriter=null;

   /**
    *
    */
   public DataExportEngine(EProperties p, ConnectionInfo ci, 
                           ProgressWatcher pw)
   {
      super();
      this.setName("DataExportEngine");
      props=p;
      conInfo=ci;
      progressListener=pw;

      progressListener.setType(progressListener.SINGLE);
   }

   /**
    *
    */
   public void run()
   {
      export();
   }

   /**
    *
    */
   public void export()
   {
      boolean error=false;

      boolean allRows=props.getBoolean("export.allRows");
      int rowLimit=-1;
      if (!allRows)
         rowLimit=props.getInt("export.rowLimit");

      // first, build the sql statement
      String table=props.getProperty("export.table");
      SQLTable sqlTable=(SQLTable)props.get("export.sqlTable");
      Vector exportCols=(Vector)props.get("export.exportColumns");
      
      Vector exportColNames=new Vector();
      int size=sqlTable.size();
      for (int i=0; i<size; i++)
      {
         boolean ex=((Boolean)exportCols.elementAt(i)).booleanValue();
         if (ex)
            exportColNames.addElement(sqlTable.columnAt(i).getName());
      }
      String colString=SQLUtil.vectorToCS(exportColNames);
      String sql="SELECT "+colString+" FROM "+table+" "+
      props.getProperty("export.where");

      String fileName=props.getProperty("export.file");
      
      int rows=props.getInt("export.rowCount");

      log.writeDebug ("Exporting "+rows+" of data from "+table+" to "+fileName);

      int inc=5; // increment in which to update progressbar
      int index=1;
      int progressIndex=inc;

      progressListener.setPrimaryText("Exporting data from "+table);
      if (!allRows && rowLimit != -1)
         progressListener.setPrimaryRange(0, rowLimit);
      else
         progressListener.setPrimaryRange(0, rows);
      
      FileOutputStream fos=null;
      Statement state=null;
      ResultSet rs=null;

      try
      {
         fos=new FileOutputStream(fileName);
         outputWriter=new PrintWriter(new OutputStreamWriter(fos), true);
         Connection con=conInfo.getConnection();
         state=con.createStatement();

         log.writeDebug ("About to execute "+sql);

         rs=state.executeQuery(sql);
         
         ResultSetMetaData rsmd=rs.getMetaData();
         int colCount=rsmd.getColumnCount();
         
         StringBuffer line=new StringBuffer();
         // Write header.
         for (int i=1; i<=colCount; i++)
         {
            String colName=rsmd.getColumnName(i);
            line.append(colName+(i==colCount?"":","));
         }
         outputWriter.println(line.toString());
         line.setLength(0);

         // Write type header
//          for (int i=1; i<=colCount; i++)
//          {
//             String colType=""+rsmd.getColumnTypeName(i);
//             line.append(colType+(i==colCount?"":","));
//          }
//          outputWriter.println(line.toString());

         line.setLength(0); // clear the buffer.  There's probably a better
         // way to implement this.

         boolean more=rs.next();
         while (more)
         {
            for (int i=1; i<=colCount; i++)
            {
               Object col=rs.getObject(i);

               if (col == null)
               {
                  // append nothing here. 
                  line.append("");
               }
               else if (col instanceof java.util.Date)
               {
                  // this covers java.sql.Date, java.sql.Time, 
                  // and java.sql.Timestamp
                  line.append(ddf.format((java.util.Date)col));
               }
               else if (col instanceof byte[])
               {
                  // Mark Matthews MySQL driver does this with 
                  // CHAR vars in some places.  This could also be a
                  // blob or clob or something, so be careful.
                  line.append(new String((byte[])col));
               }
               else
               {
                  String s=col.toString();
                  if (s.indexOf(",") != -1)
                     s="\""+s+"\"";
                  line.append(s);
               }

               if (i != colCount)
                  line.append(","); // all but the last col
            } // end loop over cols

            outputWriter.println(line.toString());
            line.setLength(0);

            index++;
            if (index >= progressIndex)
            {
               progressListener.setPrimaryValue(index);
               progressIndex=progressIndex+inc;
            }

            more=rs.next();

            if (!allRows && rowLimit != -1)
               if (index > rowLimit)
                  more=false;
         }
         log.writeDebug("Export complete.");
      }
      catch (IOException ex)
      {
         log.writeDebug ("IOExeption while exporting.");
         log.printStackTrace(ex);
         error=true;
      }
      catch (SQLException ex)
      {
         log.writeDebug ("SQLExeption while exporting.");
         log.printStackTrace(ex);
         error=true;
      }
      catch (Exception ex)
      {
         log.writeDebug ("Unknown error exporting.");
         log.printStackTrace(ex);
         error=true;
      }
      finally
      {
         // clean up the mess
         if (fos != null) {
            try {
               fos.flush();
               fos.close();
            } catch (Exception ex) {
               log.printStackTrace(ex);
            }
         }
         
         if (state != null) {
            try {
               state.close();
            } catch (Exception ex) {
               log.printStackTrace(ex);
            }
         }
      } // end finally
      if (!error)
         progressListener.done("Export successful.");
      else
         progressListener.done("An error occured while exporting.  \n"+
                               "See the console window for more detail.");
   } // done exporting


   /**
    *
    */
   public void continueExport()
   {

   }
}

