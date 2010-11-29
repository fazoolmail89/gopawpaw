package com.jet.database;

import java.lang.*;
import java.util.*;

import com.jet.log.Logger;

/**
 * Represents an abstract database table that has not yet been
 * created.  This class works with the TableEditor class to 
 * create tables using the sql CREATE command.  It is observed
 * by TableEditor.
 *
 * The JdbcTable object contains a vector of JdbcTableColumn objects
 * and a name.  
 *
 * @author Paul Bemowski
 * @see JdbcTableColumn
 * @see ui.TableEditor
 */
public class SQLTable extends Observable implements Logger, java.io.Serializable
{
   private String name="No_Name";
   private String type="";
   private String schema="";
   private String catalog="";
   private Vector columns=null;
   private Hashtable indices=new Hashtable();

   /** This will set the name of the virtual database for vdb server,
       it is not used in other contexts. */
   private String vdb=null;

   private Vector exportedKeys=null;
   private Vector importedKeys=null;

   /**
    * Constructs a blank JdbcTable object.  Columns are added 
    * with addColumn functions.
    */
   public SQLTable(String n) {
      this(n, "TABLE");
   }

   /**
    *
    */
   public SQLTable(String n, String t) {
      name=n;
      type=t;
   }


   public String getName() {return name;}
   public void setName(String s) {name=s;}

   public String getType() {return type;}
   public void setType(String s) {type=s;}

   public String getSchema() {return schema;}
   public void setSchema(String s) {schema=s;}

   public String getCatalog() {return catalog;}
   public void setCatalog(String s) {catalog=s;}

   public String getVDB() {return vdb;}
   public void setVDB(String s) {vdb=s;}

   public int getColumnIndex(String name) {
      int size=columns.size();
      for (int i=0; i<size; i++) {
         SQLColumn col=(SQLColumn)columns.elementAt(i);
         if (col.name.equalsIgnoreCase(name))
            return i;
      }
      return -1;
   }

   public String toString() {return name;}

   public String debugString() {
      StringBuffer sb=new StringBuffer();
      sb.append("SQL Table '"+name+"' \n");
      for (int i=0; i<columns.size(); i++) {
         SQLColumn col=(SQLColumn)columns.get(i);
         sb.append("  "+col.debugString()+"\n");
      }
      return sb.toString();
   }
  
   /**
    * Adds a Column to the Column vector and updates observers.
    */
   public void addColumn(SQLColumn c) {
      if (columns==null)
         columns=new Vector();
      columns.addElement(c);
      updateObservers();
   }
   
   /** */
   public void removeColumn(int i) {
      // first remove any indices it may have.
      SQLColumn col=columnAt(i);
      removeIndex(col.getName());
      if (columns != null)
         columns.removeElement(col);
      updateObservers();
   }

   /** */
   public void insertColumn(SQLColumn c, int i) {
      if (columns==null)
         columns=new Vector();
      
      if (i <0 || i > columns.size()) 
         addColumn(c);
      else {
         columns.insertElementAt(c, i);
      }
      updateObservers();
   }

   /**
    * Returns the number of columns in the table.
    */
   public int size() {
      if (columns == null)
         return -1;
      else
         return columns.size();
   }

   /**
    * Retrievs the column at the specified location.  Indices
    * run from 0 to n-1.
    */
   public SQLColumn columnAt (int i) {
      if (columns==null)
         return null;
      else if (i >= columns.size())
         return null;
      else 
         return (SQLColumn)columns.elementAt(i);
   }

   /**
    *
    */
   public SQLColumn getColumn(String name)
   {
      if (columns == null ||
          columns.size() == 0)
         return null;
      
      int size=columns.size();
      for (int i=0; i<size; i++)
      {
         SQLColumn col=(SQLColumn)columns.elementAt(i);
         if (col.name.equalsIgnoreCase(name))
            return col;
      }

      return null;
   }

   /** */
   public Vector getColumnNames()
   {
      if (columns == null)
         return null;
      Vector v=new Vector();
      int size=columns.size();
      for (int i=0; i<size; i++)
      {
         SQLColumn col=(SQLColumn)columns.elementAt(i);
         v.addElement(new String(col.getName()));
      }
      return v;
   }

   /**
    *
    */
   private void updateObservers()
   {
      setChanged();
      notifyObservers();
   }

   /**
    *
    */
   public void setPrimaryKeys(Vector cols)
   {
      log.writeDebug(2, "Setting primary keys: "+cols);
      int size=cols.size();
      for (int i=0; i<size; i++) {
         String keyColName=(String)cols.elementAt(i);

         SQLColumn col=getColumn(keyColName);
         if (col != null) 
            col.setPrimaryKey(true);
         else
            log.writeDebug("SQLTable: Setting key cols, can't find "+keyColName+
                        " i have: "+columns);
      }
   }

   /**
    *
    */
   public boolean hasPrimaryKey()
   {
      // whether or not a table has a primary key can be very important 
      // for some functions.
      for (int i=0; i<columns.size(); i++)
      {
         SQLColumn col=(SQLColumn)columns.elementAt(i);
         if (col.isPrimaryKey())
            return true;
      }
      return false;
   }

   /**
    *
    */
   public Vector getPrimaryKeys()
   {
      if (columns == null)
         return null;
      Vector pkeys=new Vector();
      for (int i=0; i<columns.size(); i++)
      {
         SQLColumn col=(SQLColumn)columns.elementAt(i);
         if (col.isPrimaryKey())
         {
            pkeys.addElement(col);
         }
      }
      return pkeys;
   }
   
   /**
    *
    */
   public void addIndex(String indexName, String colName, short type)
   {
      SQLColumn col=getColumn(colName);
      if (col != null) {
         col.setIndexed(true);
         SQLIndex index=new SQLIndex(indexName, col, this, type);
         indices.put(indexName, index);
      }
      else {
         // odd.
         log.writeDebug("Can't find column to build index. ColName="+colName);
      }
   }

   /**
    *
    */
   public void addIndex(String colName)
   {
      String indexName=colName+"_index";
      SQLColumn col=getColumn(colName);
      if (col != null) {
         col.setIndexed(true);
         SQLIndex index=new SQLIndex(indexName, col, this);
         indices.put(indexName, index);
      }
      else {
         // odd.
         log.writeDebug("Can't find column to build index. ColName="+colName);
      }
   }

   /** 
    *
    */
   public void removeIndex(String colName)
   {
      for (Enumeration keys=indices.keys(); 
           keys.hasMoreElements();) {
         Object key=keys.nextElement();
         SQLIndex idx=(SQLIndex)indices.get(key);
         if (idx.containsColumn(colName))
            indices.remove(idx.getName());
      }
   }

   /** */
   public Hashtable getIndices() {
      return indices;
   }

   /***/
   public String getCreateSql()
   {
      String statement;
      statement="CREATE TABLE "+this.getName()+" \n(";

      Vector primarykeys=new Vector();
      int size=this.size();
      for (int i=0; i<size; i++) {
         SQLColumn c=this.columnAt(i);
         statement=statement+c.getCreateSql();

         if (i != size-1)
         {
            statement=statement+", \n";
         }
         if (c.isPrimaryKey())
            primarykeys.addElement(c);
      }

      if (primarykeys.size() > 0) {
         statement=statement+", \nPRIMARY KEY("+vectorToCS(primarykeys)+")";
      }
      else {
         // nothing to add
      }
      

      statement=statement+");";

      return statement;
   }


   public static String vectorToCS(Vector v)
   {
      int size=v.size();
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<size; i++) {
         Object o=v.elementAt(i);
         if (i==size-1)
            sb.append(o.toString());
         else
            sb.append(o.toString()+", ");
      }
      return sb.toString();
   }
}




