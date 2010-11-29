package com.jetools.sqlmigrate;

import java.util.*;
import java.sql.*;

import java.text.*;
import com.jet.utils.TimeUtil;

/** */
public class TableJoinTask extends TableTask
{
   String where=null;

   /** */
   public TableJoinTask(String dest, List cols, 
                        String tables, String pkey, String where,
                        int chunksize) {
      super (dest, cols, tables, pkey, chunksize);
      this.where=where;
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

         sql=sql+" "+where;

         if (chunkCount > 0) 
            sql=sql+" and "+chunkPkey+" > "+lastVal;

         sql=sql+" order by "+chunkPkey+" asc limit "+chunkSize;
      } else {
         sql=select;
      }
      

      System.out.println ("Join Chunk SQL: \n"+sql);

      ResultSet rs=statement.executeQuery(sql);

      return rs;
   }
}
