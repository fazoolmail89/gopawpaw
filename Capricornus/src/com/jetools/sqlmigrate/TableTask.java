package com.jetools.sqlmigrate;

import java.util.*;
import java.sql.*;

import java.text.*;
import com.jet.utils.TimeUtil;
import com.jet.utils.ClassUtil;


/** */
public class TableTask implements Task
{
   /** 
    * Oracle treats empty strings as null, "" == NULL in oracle.  Not
    * so in other databases.  So, we'll hack by inserting a single 
    * space in lieu of an empty string to get around NOT NULL constraints
    * in oracle.
    */
   boolean useOracleNullStringHack=true;

   String select=null;

   String destTable=null;

   List colMaps=null;

   public static boolean verbose=false;
 
   boolean failonerror=false;

   int rowlimit=100000;

   /** count of all rows attempted to be processed. */
   int rowCount=0;

   /** Count of successes. */
   int errors=0;

   /** Count of errors. */
   int successes=0;

   /** interval between which status is logged. */
   int logInterval=100;

   /** */
   int lastLog=0;

   /** */
   long lastLogTime=0;

   /** */
   long startTime=0;

   /** Source DB statement.  Stored here for chunking. */
   Statement statement=null;

   /** */
   String lastVal=null;

   String chunkTable=null;
   String chunkPkey=null;
   int chunkSize=0;
   int chunkCount=0;

   int batchSize=50;

   /** */
   public String toString() {
      StringBuffer sb=new StringBuffer();
      sb.append(ClassUtil.shortClassName(this)+
                "[dest:"+destTable+" chunkTable:"+chunkTable+" pkey:"+
                chunkPkey+" chunkSize:"+chunkSize+"] \n");
      if (colMaps != null) {
         for (int i=0; i<colMaps.size(); i++){
            ColumnMap map=(ColumnMap)colMaps.get(i);
            sb.append("   "+map+"\n");
         }
      }
      return sb.toString();
   }

   /** */
   public TableTask(String s, String d, List cols) {
      select=s;
      destTable=d;
      colMaps=cols;
   }

   /** */
   public TableTask(String dest, List cols, 
                    String table, String pkey, int chunksize) {
      destTable=dest;
      colMaps=cols;
      chunkTable=table;
      chunkPkey=pkey;
      chunkSize=chunksize;
   }

   /** */
   public void setRowLimit(int i) {rowlimit=i;}

   /** */
   public void setLogInterval(int i) {logInterval=i;}

   /** */
   public void setBatchSize(int i) {batchSize=i;}

   /** */
   public void execute(DatabaseConnection source, 
                       DatabaseConnection dest) 
      throws SQLException {
      
      Connection sourceCon=source.getConnection();
      Connection destCon=dest.getConnection();

      destCon.setAutoCommit(false);

      int columns=colMaps.size();

      String insert=buildInsert();

      System.out.println ("Insert: \n"+insert);
      lastLogTime=System.currentTimeMillis();

      int batchCount=0;
      PreparedStatement insertState=null;

      try {
         DatabaseMetaData dbmd=sourceCon.getMetaData();
         if (dbmd.supportsBatchUpdates()) {
            System.out.println ("Batch updates supported.");
         } else {
            System.out.println ("Batch updates not supported.");
         }

         statement=sourceCon.createStatement();
         insertState=destCon.prepareStatement(insert);

         statement.setFetchSize(2000);
         
         // start processing chunks
         System.out.println ("This.class.name="+this.getClass().getName());
         ResultSet chunkSet=this.getNextChunk();

         while (chunkSet != null) {
            chunkCount++;
            System.out.println ("Processing chunk "+chunkCount);
            int chunkRows=0;

            // Process this chunk.
            while (chunkSet.next() && rowCount<rowlimit) {
               // aparently if we're batching, we shouldn't use
               // clearParameters().
               // insertState.clearParameters();
               StringBuffer values=new StringBuffer();
               
               values.append("(");
               for (int i=0; i<columns; i++) {
                  ColumnMap colMap=(ColumnMap)colMaps.get(i);
                  values.append(setColumn(insertState, chunkSet, colMap, i));
                  if (i < columns -1 )
                     values.append(",");
               }
               if (verbose) 
                  System.out.println ("Values "+values);

               rowCount++;
               chunkRows++;

               batchCount++;
               try {
                  insertState.addBatch();

                  if (batchCount == batchSize) {
                     batchCount=0;
                     int[] rows=insertState.executeBatch();
                     processBatchSuccess(rows);
                  }
               } catch (SQLException ex) {
                  if (failonerror)
                     throw (SQLException)ex.fillInStackTrace();
                  else {
                     System.out.println ("ERROR: "+ex.toString());
                     errors++;
                  }
               }

//                try {
//                   int rows=insertState.executeUpdate();
//                   if (false)
//                      System.out.println ("row "+successes+" inserted "+rows);
//                   successes = successes+rows;
//                } catch (SQLException ex) {
//                   if (failonerror) 
//                      throw (SQLException)ex.fillInStackTrace();
//                   else {
//                      System.out.println ("ERROR: "+ex.toString());
//                      errors++;
//                   }
//                }

               // log progress
               if (rowCount >= lastLog+logInterval) {
                  lastLog=rowCount;

                  long totalEt=System.currentTimeMillis()-startTime;
                  double totalRps=((double)rowCount)/((double)totalEt);

                  DecimalFormat df=new DecimalFormat("0.00");
                  System.out.println ("Processed "+rowCount+" rows with "+
                                      successes+" successes and "+
                                      errors+" errors in "+
                                      TimeUtil.formatTime(totalEt)+
                                      " at "+df.format(totalRps)+
                                      " records/sec.");

                  long et=System.currentTimeMillis() - lastLogTime;
                  lastLogTime=System.currentTimeMillis();

                  double rate=(double)logInterval/((double)et/(double)1000);
                  System.out.println ("   last "+logInterval+
                                      " rows took "+
                                      TimeUtil.formatShortTime(et)+
                                      ". Rate is "+df.format(rate)+
                                      " rows/sec");
               }
            } // end while(chunkSet.next()...

            System.out.println ("Committing chunk inserts.");
            destCon.commit();

            // close out the batch if there is still work to be done.
            try {
               batchCount=0;
               int[] rows=insertState.executeBatch();
               processBatchSuccess(rows);
            } catch (SQLException ex) {
               if (failonerror)
                  throw (SQLException)ex.fillInStackTrace();
               else {
                  System.out.println ("ERROR: "+ex.toString());
                  errors++;
               }
            }

            chunkSet.close();
            // get next chunk
            if (chunkRows > 0){
               chunkSet=getNextChunk();
            } else {
               chunkSet=null;
            }
         } // end while(chunkSet != null)
      } finally {
         // close out the batch if there is still work to be done.
         try {
            batchCount=0;
            int[] rows=insertState.executeBatch();
            processBatchSuccess(rows);
         } catch (SQLException ex) {
            if (failonerror)
               throw (SQLException)ex.fillInStackTrace();
            else {
               System.out.println ("ERROR: "+ex.toString());
               errors++;
            }
         }

         if (statement != null)
            statement.close();

         sourceCon.close();
         destCon.commit();
         destCon.close();
      }
   }

   /** 
    * This is a utility method to deal with the results
    * of an executeBatch statement. 
    */
   private void processBatchSuccess(int rows[]) {
      for (int i=0; i<rows.length; i++) {
         if (rows[i] == Statement.SUCCESS_NO_INFO) {
            // Assume success
            successes++;
         } else if (rows[i] == Statement.EXECUTE_FAILED) {
            errors++;
         } else {
            successes=successes+rows[i];
         }
      }
   }

   /** 
    * Assuming the columnMaps exist, this builds the insert
    * prepared statement sql from the columnMaps.
    */
   protected String buildInsert() {
      // build insert
      int columns=colMaps.size();
      StringBuffer sb=new StringBuffer();
      sb.append("INSERT INTO "+destTable+"\n(");
      for (int i=0; i<columns; i++) {
         ColumnMap colMap=(ColumnMap)colMaps.get(i);
         sb.append(colMap.getDestColumn());
         if (i < columns - 1) 
            sb.append(", ");
      }
      sb.append(")\nVALUES\n(");
      for (int i=0; i<columns; i++) {
         sb.append("?");
         if (i < columns - 1) 
            sb.append(", ");
      }
      sb.append(")");
      String insert=sb.toString();

      return insert;
   }

   /**
    * Retrieves a result set chunk of data.  This method is necessary
    * because the MySQL JDBC driver does not use cursors to iterate
    * thru results.  Thus a select(*) on a large table will attempt
    * to return the _entire_ table.  */
   protected ResultSet getNextChunk() 
      throws SQLException {
      String sql=null;

      if (chunkSize > 0) {
         sql="select * from "+chunkTable;
         if (chunkCount > 0) 
            sql=sql+" where "+chunkPkey+" > "+lastVal;

         sql=sql+" order by "+chunkPkey+" asc limit "+chunkSize;
      } else {
         sql=select;
      }
      
      System.out.println ("Chunk SQL: \n"+sql);

      ResultSet rs=statement.executeQuery(sql);

      return rs;
   }


   /** */
   Object setColumn(PreparedStatement ps, ResultSet rs, 
                    ColumnMap colMap, int col) 
      throws SQLException {
      Object retVal=null;

      if (colMap.getType().equals(ColumnMap.STRING)) {
         String val=rs.getString(colMap.getSourceColumn());
         if (val != null) {
            if (colMap.getTrimStrings())
               val=val.trim();

            retVal=val;
            //System.out.println ("Setting string '"+val+"' on col "+(col+1)+
            //                    " "+colMap);

            // see comment above.
            if (val.equals("") && 
                useOracleNullStringHack)
               val=" ";

            ps.setString(col+1, val);
         }
         else {
            switch (colMap.getOnNull()) {
               case ColumnMap.NULL_ALTERNATE:
                  val=rs.getString(colMap.getNullAlternateColumn());
                  retVal=val;
                  ps.setString(col+1, val);
                  break;

               case ColumnMap.NULL_DEFAULT: 

                  val=colMap.getNullDefault();
                  retVal=val;
                  ps.setString(col+1, val);
                  break;

               case ColumnMap.NULL:
               default:
                  retVal="null";
                  ps.setNull(col+1, Types.VARCHAR);
                  break;
            }
         }
      }
      /////////////////////////////////////////////
      else if (colMap.getType().equals("DateTime")) {
         Timestamp val=rs.getTimestamp(colMap.getSourceColumn());
         if (val != null) {
            retVal=val;
            ps.setTimestamp(col+1, val);
         }
         else {
            switch (colMap.getOnNull()) {
               case ColumnMap.NULL_ALTERNATE:
                  val=rs.getTimestamp(colMap.getNullAlternateColumn());
                  retVal=val;
                  ps.setTimestamp(col+1, val);
                  break;

               case ColumnMap.NULL:
               default:
                  retVal="null";
                  ps.setNull(col+1, Types.TIMESTAMP);
                  break;
            }
         }
      } else if (colMap.getType().equals(colMap.INT)) {
         int i=rs.getInt(colMap.getSourceColumn());
         boolean wasNull=rs.wasNull();
         if (wasNull) {
            ps.setNull(col+1, Types.INTEGER);
            retVal="null";
         } else {
            ps.setInt(col+1, i);
            retVal=""+i;
         }
      } else if (colMap.getType().equals(colMap.LONG)) {
         long i=rs.getLong(colMap.getSourceColumn());
         boolean wasNull=rs.wasNull();
         if (wasNull) {
            ps.setNull(col+1, Types.BIGINT);
            retVal="null";
         } else {
            ps.setLong(col+1, i);
            retVal=""+i;
         }
      } else if (colMap.getType().equals(colMap.DOUBLE)) {
         double i=rs.getDouble(colMap.getSourceColumn());
         boolean wasNull=rs.wasNull();
         if (wasNull) {
            ps.setNull(col+1, Types.DOUBLE);
            retVal="null";
         } else {
            ps.setDouble(col+1, i);
            retVal=""+i;
         }
      }

      if (false) 
         System.out.println ("Column "+col+" is "+colMap+" val='"+retVal+"'");

      if (chunkPkey != null) {
         if (chunkPkey.equalsIgnoreCase(colMap.getSourceColumn())) {
            lastVal=retVal.toString();
            if (verbose)
               System.out.println ("ChunkPkey.lastVal="+lastVal);
         }
      }
      return retVal;
   }
}
