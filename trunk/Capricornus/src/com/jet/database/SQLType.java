package com.jet.database;

import java.lang.*;
import java.util.*;

import java.sql.*;

/*
 * $Log: SQLType.java,v $
 * Revision 1.4  2007/02/15 11:36:09  bemocvs
 * Fixes for oracle number types.
 *
 * Revision 1.3  2006/12/12 01:41:37  bemocvs
 * removed redundant if statement.
 *
 * Revision 1.2  2006/12/07 14:43:17  bemocvs
 * Debug strings.  Added code to support new data editor
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.4  2001/07/31 00:51:38  bemocvs
 * nothing.
 *
 */

/**
 * Represents the data type of a column.  In practice, the JDBC
 * integer data types are not sufficient to decribe the type of a
 * column.  This class encapsulates all of the available type information.
 *
 * 
 * @author Paul Bemowski
 */
public class SQLType implements SQLTypes, java.io.Serializable
{
   private String name=null;
   private boolean allowsParameters=true;
   private String parameterString=null;
   private String parameterDescription=null;
   private int itype=0;

   private int scale=0;
   private int precision=0;

   /** Copy constructor. */
   public SQLType(SQLType t) {
      name                  = t.name;
      allowsParameters      = t.allowsParameters;
      parameterString       = t.parameterString;
      parameterDescription  = t.parameterDescription;
      itype                 = t.itype;
   }

   /**
    */
   public SQLType(String n, boolean ap) {
      name=n;
      allowsParameters=ap;
   }

   /**
    */
   public SQLType(String n, String p) {
      name=n;
      allowsParameters=true;
      parameterString=p;
   }
   
   /**
    */
   public SQLType(ResultSet rs)
      throws SQLException
   {
      name=rs.getString("TYPE_NAME");
      
      String parms=rs.getString("CREATE_PARAMS");
      if (parms == null) {
         allowsParameters=false;
         if (name.toLowerCase().startsWith("varchar") ||
             name.toLowerCase().startsWith("char") ||
             name.toLowerCase().startsWith("number")) {
            allowsParameters=true;
         }
      }
      else {
         allowsParameters=true;
         parameterString=parms;
      }
      itype=rs.getInt("DATA_TYPE");

      precision=rs.getInt("PRECISION");
   }

   /** */
   public boolean allowsParameters() {
      return true;
   }

   /** */
   public String getName(){ return name;}

   /** */
   public void setName(String s) {
      name=s;
   }
   
   /** */
   public void setIType(int i) {itype=i;}
   
   /** */
   public int getIType() {return itype;}
      
   // public String getJavaType() {return TypeMap.getJavaType(itype);}

   /** */
   public void setScale(int i) {scale=i;}
   public int getScale() {return scale;}
   
   /** */
   public void setPrecision(int i) {precision=i;}
   public int getPrecision() {return precision;}

   /** 
    * This is the most common type of parameter sent as a parameter to a 
    * column constructor in SQL.  Ex: VARCHAR(100) <p>
    * Here the "size" is 100.
    */
   public void setSize(int i) {
      parameterString=""+i;
   }

   /** */
   public void setParameterString(String s) {parameterString=s;}

   /** */
   public String getParameterString() {return parameterString;}

   /**
    **/
   public String getParameterDescription() {
      if (allowsParameters)
         return parameterDescription;
      else
         return "Parameters not allowed for this type";
   }
   
   /** */
   public String getCreateSql() {
      String sql=name;

      if (allowsParameters &&
          parameterString != null) {
         String s=parameterString.trim();
         if (s.startsWith("("))
            s=s.substring(1);
         if (s.endsWith(")"))
            s=s.substring(s.length()-1);

         sql=sql+"("+s+")";
      }
      return sql;
   }

   /** For debugging types. */
   public String getTypeDetail() {
      return "Type '"+name+"' itype="+itype+" allowsParms?='"+allowsParameters+
      "' parmString='"+parameterString+"'";
   }

   /** */
   public String detailString() {
      return "Type(SQL:"+name+" I:"+itype+")";
   }

   /**
    */
   public String toString() {
      //return "Type(SQL:"+name+" I:"+itype+")";
      return name;
   }

   public int getFieldType() {
      int fieldType=UNKNOWN_FIELD;

      if (name.equalsIgnoreCase("char") ||
          name.equalsIgnoreCase("varchar") ||
          name.equalsIgnoreCase("varchar2") ||
          itype == Types.CHAR ||
          itype == Types.LONGVARCHAR ||
          itype == Types.VARCHAR) 
         fieldType=STRING_FIELD;
      else if (itype == Types.DATE) 
         fieldType=DATE_FIELD;
      else if (itype == Types.TIME)
         fieldType=TIME_FIELD;
      else if (itype == Types.TIMESTAMP)
         fieldType=TIMESTAMP_FIELD;
//       else if (itype == 93)// this is Access's DATETIME field.
//          fieldType=DATE_TIME_FIELD;
      else if (itype == Types.DECIMAL ||
               itype == Types.DOUBLE ||
               itype == Types.FLOAT ||
               itype == Types.INTEGER ||
               itype == Types.REAL ||
               itype == Types.SMALLINT ||
               itype == Types.TINYINT) {
         fieldType=NUMERIC_FIELD;
      }
      else
         fieldType=UNKNOWN_FIELD;
      
      return fieldType;
   }
}
