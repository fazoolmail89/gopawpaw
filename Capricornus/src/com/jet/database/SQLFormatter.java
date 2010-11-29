package com.jet.database;


/** 
 *
 *
 */
public interface SQLFormatter
{
   public String dateSQL(java.util.Date d);

   public String timeSQL(java.util.Date d);

   public String datetimeSQL(java.util.Date d);

   public String timestampSQL(java.sql.Timestamp ts);

   public String cleanSQL(String s); 
   
   public String escapeStringForInsert(String s);

   public String formatIdentifier(String s);
}
