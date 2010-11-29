package com.jet.database;

import java.sql.Types;
import java.util.Hashtable;

/**
 * Maps JDBC/SQL integer types to java types. <p>
 * 
 * ++ As of 11/15/00 this class is Java 2 specific with some new
 * types defined in java.sql.Types.
 */
public class TypeMap 
{
   private static TypeMap _default=null;

   private Hashtable typeMap=null;
   private static Hashtable defaultTypeMap=null;
   
   static {
      defaultTypeMap=new Hashtable();

      defaultTypeMap.put(new Integer(Types.BIT), "boolean");
      defaultTypeMap.put("BIT", "boolean");

      defaultTypeMap.put(new Integer(Types.DECIMAL), "double");
      defaultTypeMap.put(new Integer(Types.NUMERIC), "double");
      defaultTypeMap.put(new Integer(Types.DOUBLE), "double");
      defaultTypeMap.put("DECIMAL", "double");
      defaultTypeMap.put("NUMERIC", "double");
      defaultTypeMap.put("DOUBLE", "double");

      defaultTypeMap.put(new Integer(Types.FLOAT), "float");
      defaultTypeMap.put(new Integer(Types.REAL), "float");
      defaultTypeMap.put("FLOAT", "float");
      defaultTypeMap.put("REAL", "float");

      defaultTypeMap.put(new Integer(Types.SMALLINT), "int");
      defaultTypeMap.put(new Integer(Types.TINYINT), "int");      
      defaultTypeMap.put(new Integer(Types.INTEGER), "int");
      defaultTypeMap.put("SMALLINT", "int");
      defaultTypeMap.put("TINYINT", "int");      
      defaultTypeMap.put("TINYINT", "int");

      defaultTypeMap.put(new Integer(Types.BIGINT), "long");
      defaultTypeMap.put("BIGINT", "long");

      defaultTypeMap.put(new Integer(Types.TIME), "Date");
      defaultTypeMap.put(new Integer(Types.DATE), "Date");
      defaultTypeMap.put(new Integer(Types.TIMESTAMP), "Date");
      defaultTypeMap.put("TIME", "Date");
      defaultTypeMap.put("DATE", "Date");
      defaultTypeMap.put("TIMESTAMP", "Date");


      defaultTypeMap.put(new Integer(Types.LONGVARCHAR), "String");
      defaultTypeMap.put(new Integer(Types.VARCHAR), "String");
      defaultTypeMap.put(new Integer(Types.CHAR), "String");
      defaultTypeMap.put("LONGVARCHAR", "String");
      defaultTypeMap.put("VARCHAR", "String");
      defaultTypeMap.put("CHAR", "String");

      // special types for ACCESS/SQL Server
      defaultTypeMap.put("CURRENCY", "float");
   }


   public TypeMap()
   {
      typeMap=defaultTypeMap;
   }

   public TypeMap(Hashtable h) 
   {
      typeMap=h;
   }

   public static TypeMap getDefault()
   {
      if (_default == null)
         _default=new TypeMap();
      return _default;
   }

   /**
    *
    */
   public String getObjectForPrimitive(String primitive)
   {
      if (primitive.equals("String"))
         return primitive;
      else if (primitive.equals("Date"))
         return primitive;
      else if (primitive.equals("float"))
         return "Float";
      else if (primitive.equals("int"))
         return "Integer";
      else if (primitive.equals("double"))
         return "Double";
      else if (primitive.equals("boolean"))
         return "Boolean";
      else if (primitive.equals("long"))
         return "Long";
      else
         return "Object";
   }

   /**
    *
    */
   public String getRSGetter(SQLType type)
   {
      String primitive=getJavaType(type);
      if (primitive.equals("String"))
         return primitive;
      else if (primitive.equals("Date")) {
         // 8/31/2003
         // This is a quick hack.  May not work for some databases.
         // We really need to make typemap.properties an EProperties
         // object and separate the mapping of Java types and RSGetters, 
         // because they are fundamentally different.
         return "Timestamp";
      }
      else if (primitive.equals("float"))
         return "Float";
      else if (primitive.equals("int"))
         return "Int";
      else if (primitive.equals("double"))
         return "Double";
      else if (primitive.equals("boolean"))
         return "Boolean";
      else if (primitive.equals("long"))
         return "Long";
      else
         return "Object";
   }

   /**
    * This function maps sql integer types to Java primitive types.
    */
   public String getJavaType(SQLType t)
   {
      int itype=t.getIType();
      String stype=t.getName();

      String type=(String)typeMap.get(new Integer(itype));
      if (type == null)
         type=(String)typeMap.get(""+itype);
      if (type == null)
         type=(String)typeMap.get(stype);

      if (type==null) {
         System.out.println ("Using default type for "+t);
         type="Object";
      }

      return type;
   }


   /**
    * This function maps sql integer types to Java primitive types.
    */
   public static boolean isSqlQuoted(int type)
   {
      switch (type)
      {
         case (Types.LONGVARCHAR): 
         case (Types.VARCHAR): 
         case (Types.CHAR): return true;

         case (Types.BIT): 
         case (Types.DOUBLE): 
         case (Types.FLOAT):
         case (Types.SMALLINT): 
         case (Types.TINYINT): 
         case (Types.INTEGER): return false;

         case (Types.TIME): 
         case (Types.TIMESTAMP): 
         case (Types.DATE): return true;

            
         default: 
            // We have no idea what your data type is.  We'll return 
            // maybe we should return Object??
            return true;
      }
   }
}
