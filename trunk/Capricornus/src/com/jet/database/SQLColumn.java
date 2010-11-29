package com.jet.database;

/**
 * Used by JdbcTable and TableEditor to represent a
 * generic column in a RDBMS table.
 * 
 * @author Paul Bemowski
 */
public class SQLColumn implements java.io.Serializable
{
   /** Name of the column. */
   public String name="";

   /** Type of column.  This is an SQL type. */
   SQLType sqlType=null;

   /** SQL modifiers, such as PRIMARY KEY, or NOT NULL */
   public String modifiers="";

   /** */
   private boolean nullable=true;

   /** */
   private boolean primaryKey=false;

   /** */
   private boolean unique=false;

   /** */
   private boolean indexed=false;

   /**
    *
    */
   public SQLColumn(String s) {
      name=s;
      sqlType=new SQLType("", false);
   }

   /** */
   public String getName() {return name;}

   public void setName(String n) {name=n;}

   /** */
   public void setNullable(boolean n) {nullable=n;}

   /** */
   public boolean isNullable() {return nullable;}

   /** */
   public void setPrimaryKey(boolean b) {
      // System.out.println ("Set primary key called: "+b);
      primaryKey=b;
   }

   /** */
   public boolean isPrimaryKey() {return primaryKey;}
          
   /** */
   public void setUnique(boolean b) {unique=b;}

   /** */
   public boolean isUnique() {return unique;}
   
   /** 
    * @deprecated Use the new SQLType class;
    */
   public void setType(String t) {
      sqlType=new SQLType(t, false);
   }

   /** */
   public void setType(SQLType t){sqlType=t;}

   /** */
   public SQLType getType() {
      return sqlType;
   }

   /** */
   public void setIType(int it){sqlType.setIType(it);}

   /** */
   public int getIType() {return sqlType.getIType();}

   /** */
   public void setIndexed(boolean b) {indexed=b;}
   
   /** */
   public boolean isIndexed() {return indexed;}

   /**
    *
    */
   public String getModifiers() {
      String mods=modifiers;

      if (!nullable)
         mods=mods+" NOT NULL";

      // Most databases implement uniqueness with an index.  when 
      // I create a table, and declare a primary key column to be 
      // unique, most of the DBs are erroring.  This includes HSQL, 
      // and Oracle.  So, if a column is a primary key, we don't 
      // seem to need the unique keyword
      // 22.dec.2006. Atlanta.
      if (unique && !primaryKey)
         mods=mods+" UNIQUE";

      return mods;
   }

   /** */
   public String toString() {
      return name;
   }

   /** */
   public String debugString() {
      return "SQLColumn '"+name+"' ("+sqlType.getTypeDetail()+") pkey:"+
      primaryKey+" nullable: "+nullable+
      " unique:"+unique;
   }

   /**
    *
    */
   public String getCreateSql() {
      String s=name+" ";
      s=s+sqlType.getCreateSql();
      
      s=s+" "+getModifiers();

      return s.trim();
   }
}


