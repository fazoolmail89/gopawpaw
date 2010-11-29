package com.jet.apps.databrowser.database;

import java.sql.*;
import java.util.Map;

import java.util.Date;

import com.jet.log.Logger;
import com.jet.database.*;


/**
 * This is a generic utility used factor database operations out of 
 * the controller code (the Actions).  So the actions (or threads on behalf
 * of actions) delegte to 
 * this utility class to execute database operations.
 *
 * @author Paul Bemowski
 */
public class DatabaseUtil
   implements Logger, SQLTypes
{
   /** This is the current connection's details. */
   ConnectionInfo conInfo=null;

   /** */
   SchemaUtil schemaUtil=null;

   /** */
   public DatabaseUtil(ConnectionInfo ci) {
      conInfo=ci;
      schemaUtil=conInfo.getSchemaUtil();
   }

   /**
    * Used as an ad-hoc primary key scenario.  
    * Selects max+1 from a table and field.  It is assumed that there
    * is some type of integer based number in that column, if not 
    * this will likely throw a SQLException.
    */
   public long getMaxPlusOne(String table, String field) 
      throws SQLException {
      SchemaUtil su=conInfo.getSchemaUtil();

      String sql="select max("+field+") from "+su.tableSQL(table);

      log.writeDebug("SQL: "+sql);

      Connection con=conInfo.getConnection();
      Statement state=null;
      ResultSet rs=null;
      long val=-1;
      try {
         state=con.createStatement();
         rs=state.executeQuery(sql);
         if (rs.next()) {
            // I used to try to getObject() and figure out what it is,
            // but I think it is better to use the database driver's
            // conversion algorithm.  
            // PAB, 5 Dec 2006, 10:30am EST, 767 Dus-Atl
            val=rs.getLong(1);
            

//             Object obj=rs.getObject(1);
//             if (obj == null)
//                return val;

//             if (obj instanceof Number) {
//                Number num=(Number)obj;
//                val=num.longValue();
//             }
//             else if (obj instanceof String) {
//                try {
//                   val=Long.parseLong((String)obj);
//                } catch (Exception ex) {
//                   log.writeDebug("");
//                }
//             }
//             else {
//                log.writeDebug("Don't know how to handle "+
//                               obj.getClass().getName()+
//                               ", going to try parsing toString(): "+
//                               obj.toString());
//                String s=obj.toString();
//                val=Long.parseLong(s);
//            }

         }
      }
      finally {
         if (rs != null) close(rs);
         if (state != null) close(state);
      }
      return val+1;
   }   

   /** Builds a where clause */
   public String whereClause(SQLTable sqlTable, Map values) 
      throws SQLException {
      log.writeDebug("Generating where clause for \n"+sqlTable.debugString());

      StringBuffer sql=new StringBuffer();
      
      boolean firstPrimaryKey=true;

      for (int i=0; i<sqlTable.size(); i++) {
         SQLColumn sqlCol=sqlTable.columnAt(i);
         log.writeDebug(4, "SQL Col: "+sqlCol.debugString());

         if (sqlCol.isPrimaryKey() && firstPrimaryKey) {
            sql.append("   "+sqlCol.getName()+"="+
                       colToSQL(sqlCol, values.get(sqlCol.getName())));
            firstPrimaryKey=false;
         } 
         else if (sqlCol.isPrimaryKey()) {
            sql.append(" AND \n   "+sqlCol.getName()+"="+
                       colToSQL(sqlCol, values.get(sqlCol.getName())));
         }

//          ColumnEditor editor=(ColumnEditor)columnEditors.elementAt(i);
//          if (editor.isPrimaryKey() && firstPrimaryKey){
//             sql.append("   "+editor.getColumn().getName()+"="+
//                        colToSQL(editor));
//             firstPrimaryKey=false;
//          }
//          else if (editor.isPrimaryKey()) {
//             sql.append(" AND \n   "+editor.getColumn().getName()+"="+
//                        colToSQL(editor));
//          }
      }
      // sql.append("\n");
      
      // if we get here, and firstPrimaryKey is still true, we did not
      // generate a valid where clause.  This used to generate an invalid
      // sql statement with no where clause...  So, if for one reason or
      // another we are unable to generate a where clause because there
      // are no known primary keys, we'll generate a big where clause with
      // basically everything that is not a date and not modified in the 
      // where clause.
      // 03/16/2002, Saturday night in London.  Raining.
      
      //if (firstPrimaryKey)
      //   return adhocWhereClause();
      // this code is moved to the action to determine if we should 
      // use adhoc

      log.writeDebug(3, "Where clause: \n"+sql.toString());

      return sql.toString();
   }

   /**
    * adhocWhereClause attempts to cover some rare occurances when we don't
    * know how to form a primary key based where clause.
    */
   public String adHocWhereClause(SQLTable table, Map data) 
      throws SQLException {
      StringBuffer sql=new StringBuffer();
      boolean firstCol=true;

      for (int i=0; i<table.size(); i++) {
         SQLColumn column=table.columnAt(i);
         SQLType sqlType=column.getType();

         int fieldType=sqlType.getFieldType();

         switch (fieldType) {
            case (STRING_FIELD):
            case (NUMERIC_FIELD):
            if (firstCol) {
               sql.append("   "+column.getName()+"="+
                          colToSQL(column, data.get(column.getName())));
               firstCol=false;
            }
            else {
               sql.append(" AND \n   "+column.getName()+"="+
                          colToSQL(column, data.get(column.getName())));
            }
            break;
            default:
               // do nothing
         }
      }
      sql.append("\n");
      log.writeDebug("Using adhoc where clause:\n"+sql.toString());
      return sql.toString();
   }

   /** 
    * This converts a column to valid SQL text for an insert, update
    * or where clause. */
   public String colToSQL(SQLColumn sqlCol, Object value) 
      throws SQLException {
      log.writeDebug("ColToSQL called on "+sqlCol);
      SQLType sqlType=sqlCol.getType();

      SQLFormatter formatter=conInfo.getSchemaUtil().getSQLFormatter();

      // if (ce.isNullChecked()) {
      if (value instanceof Null || value == null) {
         log.writeDebug(3, "colToSQL returning null because value is "+
                        " null or Null object for column "+sqlCol);
         return "NULL";
      }

      Date d=null;

      int fieldType=sqlType.getFieldType();
      switch (fieldType) {
         case STRING_FIELD:
            String data=value.toString();
            return "'"+formatter.escapeStringForInsert(data)+"'";
         case NUMERIC_FIELD:
            data=value.toString();
            return data;
         case DATE_FIELD:
            if (value instanceof Date)
               d=(Date)value;
            else 
               throw new 
               DatabrowserSQLException("Column "+sqlCol+" is DATE_FIELD "+
                                       "but valus is class "+
                                       value.getClass().getName());

            return formatter.dateSQL(d);
         case TIME_FIELD:

            if (value instanceof Date)
               d=(Date)value;
            else 
               throw new 
               DatabrowserSQLException("Column "+sqlCol+" is TIME_FIELD "+
                                       "but valus is class "+
                                       value.getClass().getName());
            // d=ce.getDate();
            return formatter.timeSQL(d);
         case DATE_TIME_FIELD: 
            if (value instanceof Date)
               d=(Date)value;
            else 
               throw new 
               DatabrowserSQLException("Column "+sqlCol+
                                       " is DATE_TIME_FIELD "+
                                       "but valus is class "+
                                       value.getClass().getName());

            // d=ce.getDate();
            return formatter.datetimeSQL(d);            
         case TIMESTAMP_FIELD:
            // Timestamp ts=ce.getTimestamp();
            Timestamp ts=null;

            if (value instanceof Date)
               d=(Date)value;
            else 
               throw new 
               DatabrowserSQLException("Column "+sqlCol+" is DATE_FIELD "+
                                       "but valus is class "+
                                       value.getClass().getName());

            if (d instanceof Timestamp)
               ts=(Timestamp)d;
            else
               ts=new Timestamp(d.getTime());

            return formatter.timestampSQL(ts);
         default:
            data=value.toString();
            return "'"+data+"'";
      }
   }


   /** */
   public String getDeleteSQL(SQLTable table, Map data) 
      throws SQLException {
      StringBuffer sb=new StringBuffer();
      sb.append("delete from "+schemaUtil.tableSQL(table.getName())+"\n");
      
      String whereClause=whereClause(table, data);
      if (whereClause == null || whereClause.length() == 0 ) {
         // ad hoc
         whereClause=adHocWhereClause(table, data);
      }
      sb.append("where \n"+whereClause);

      return sb.toString();
   }


   /** Safely closes a result set */
   public static final void close(ResultSet rs) {
      if (rs != null) 
         try {rs.close();}catch (Exception ex) {}
   }
   /** */
   public static final void close(Statement s) {
      if (s != null) 
         try {s.close();}catch (Exception ex) {}
   }
}