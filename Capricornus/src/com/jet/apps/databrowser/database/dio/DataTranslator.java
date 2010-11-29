package com.jet.apps.databrowser.database.dio;

import java.util.*;
import java.sql.*;

import com.jet.database.*;
import com.jet.log.Logger;


/**
 * Abstraction layer for the Data import/export.  Data written to disk as
 * character data does not always come back in the proper format: <p>
 * + A "BIT" field will be written to disk as "true" or "false", but
 *   we want it converted back to boolean for the insert.<br>
 * + A date field will be written to disk as some date string, but we
 *   need the original Date object back for the set method on the prepared
 *   statement.<br>
 *
 * This class handles that translatioon.  
 */
class DataTranslator implements DataDateFormat, Logger
{
   SQLTable sqlTable;

   SQLType types[]=null;

   int cols=0;

   boolean isAccess=true;

   /** */
   DataTranslator(SQLTable st)
   {
      sqlTable=st;
      
      log.writeDebug ("Constructing DataTranslator for "+sqlTable);

      cols=st.size();
      types=new SQLType[cols];
      for (int i=0; i<cols; i++) {
         SQLColumn sc=st.columnAt(i);
         log.writeDebug ("Translator adding coltype("+i+"): "+sc+" type="+
                         sc.getType());
         types[i]=sc.getType();
      }
   }


   /**
    *
    */
   Object translate(int col, String data)
      throws java.text.ParseException
   {
      // log.writeDebug(3, "data = '"+data+"'");

      if (col<0 || col > cols-1)
         throw new 
            IllegalArgumentException ("Column "+col+" out of range.  "+
                                      "Translator has "+cols+" cols.");
      
      if (data == null)
         return null;
      if (data.equals("null"))
         return null;

      java.util.Date d=null;

      // we could improve performance here
      switch (types[col].getIType())
      {
         case (Types.INTEGER):
         case (Types.BIGINT):
         case (Types.SMALLINT):
         case (Types.TINYINT):
         {
            // null is a valid value for a numeric data type in 
            // most SQL databases
            if (data.equals("null"))
               return null;
            else if (data.equalsIgnoreCase("true"))
              return new Integer(1);
            else if (data.equalsIgnoreCase("false"))
              return new Integer(0);
            else if (data.length() == 0) {
               // this is an empty string: '', so input as 0 for int.
               return new Integer(0);
            }
            int i=Integer.parseInt(data);
            return new Integer(i);
         }

         case (Types.DECIMAL):
         case (Types.FLOAT):
         case (Types.REAL):
         case (Types.DOUBLE):
         case (Types.NUMERIC):
         case (Types.VARCHAR):
         case (Types.CHAR):
            return data;


         case (Types.DATE):
            if (data.equals("null"))
               return null;
            else if (data.equals(""))
              return null;

            d=ddf.parse(data);
            return new java.sql.Date(d.getTime());


         case (Types.TIME):
            if (data.equals("null"))
               return null;
            d=ddf.parse(data);
            return new Time(d.getTime());


         case  (Types.TIMESTAMP):
            if (data.equals("null"))
               return null;
            d=ddf.parse(data);
            return new Timestamp(d.getTime());


         case (Types.BIT):
            String l=data.toLowerCase().trim();
            if (l.equals("true") || l.equals("1") || l.equals("yes"))
               return new Boolean(true);
            else
               return new Boolean(false);

            // on MSAccess this is the DATETIME field
         case (11): 
            if (isAccess){
               if (data.equals("null"))
                  return null;

               d=ddf.parse(data);
               return new Timestamp(d.getTime());
            }
            else {
               return data;
            }
               
         default: // dont know what type it is.  handle DBMS specific stuff
            if (data.equals("null"))
               return null;

            String ts=types[col].getName();

            return data;
      }
   }
}
