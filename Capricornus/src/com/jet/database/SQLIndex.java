package com.jet.database;

import java.sql.DatabaseMetaData;

/**
 *
 */
public class SQLIndex implements java.io.Serializable
{
   String indexName;
   SQLColumn column;  // FIXME, deal with multi-column indices
   SQLTable table=null;

   short type=-1;
   
   /** */
   public SQLIndex(String iname, SQLColumn c, SQLTable t) {
      this(iname, c, t, (short)-1);
   }

   /**
    *
    */
   public SQLIndex(String iname, SQLColumn c, SQLTable t,
                   short type) {
      indexName=iname;
      table = t;
      column=c;
      this.type=type;
   }

   /**
    *
    */
   public String getCreateSql() {
      String statement="CREATE INDEX "+indexName+" ON "+
      table.getName()+" ("+column.getName()+");";
      // add columns in order
      return statement;
   }

   /**
    *
    */
   public boolean containsColumn(String c) {
      if (column.getName().equalsIgnoreCase(c))
         return true;
      else 
         return false;
   }

   /** */
   public String getName() {return indexName;}

   /** */
   public SQLColumn getColumn() {return column;}

   /** */
   public short getType() {return type;}

   /** */
   public String getTypeName() {
      switch (type) {
         case (-1): return "Unknown";
         case (DatabaseMetaData.tableIndexStatistic): return "Statistic";
         case (DatabaseMetaData.tableIndexClustered): return "Clustered";
         case (DatabaseMetaData.tableIndexHashed): return "Hashed";
         case (DatabaseMetaData.tableIndexOther): return "Other";
         default: return "Out of Range";
      }
   }
}
