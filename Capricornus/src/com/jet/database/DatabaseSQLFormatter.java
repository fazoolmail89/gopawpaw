package com.jet.database;

import java.text.*;
import java.util.Date;
import java.sql.Timestamp;

import com.jet.utils.properties.EProperties;
import com.jet.utils.StringUtil;

/**
 * The DatabaseSQLHelper is used for DatabaseSpecific
 * data type conversions, and SQL Conditioning.  Most RDBMS systems
 * have quirks about how they want to get specific types of data -- 
 * including dates, times, timestamps, blobs, etc. <p>
 * 
 * This class will work closely with the database.properties file
 * to abstract away from these differencs.
 */
public final class DatabaseSQLFormatter 
   implements SQLFormatter, com.jet.log.Logger
{
   private String dateFormat=null;
   private String dateSQL=null;

   private String timeFormat=null;
   private String timeSQL=null;
   
   private String datetimeFormat=null;
   private String datetimeSQL=null;

   private String timestampFormat=null;
   private String timestampSQL=null;

   private String identifierQuoteString=null;
   private boolean stripNewlines=false;

   EProperties props=null;

   /** */
   public DatabaseSQLFormatter(EProperties props) {
      this.props=props;
      EProperties temp=null;

      // All formatters must include at least this date conversion
      // data.  dateSQL, timeSQL, and timestampSQL will revert to dateTimeSQL 
      // if they are not defined.
      temp=props.getProperties("datetimeConversion");
      if (temp != null) {
         datetimeFormat=temp.getProperty("format");
         datetimeSQL=temp.getProperty("SQL");
      }
      log.writeDebug(3, "DateTime: format: '"+datetimeFormat+
                     "' mask: \""+datetimeSQL);

      if (datetimeFormat == null ||
          datetimeSQL == null) {
         log.writeError(1, "\n\nDatabase's DateTime format is null\n "+
                        "DataEditing will likely not work.  Properties "+
                        "follow: \n"+props+"\n\n");
      }
      
      temp=props.getProperties("timeConversion");
      if (temp != null) {
         timeFormat=temp.getProperty("format");
         timeSQL=temp.getProperty("SQL");
      }
      log.writeDebug(3, "Time: format: '"+timeFormat+
                     "' mask: \""+timeSQL);

      temp=props.getProperties("dateConversion");
      if (temp != null) {
         dateFormat=temp.getProperty("format");
         dateSQL=temp.getProperty("SQL");
      }
      log.writeDebug(3, "Date: format: '"+dateFormat+
                     "' mask: \""+dateSQL);
      
      temp=props.getProperties("timestampConversion");
      if (temp != null) {
         timestampFormat=temp.getProperty("format");
         timestampSQL=temp.getProperty("SQL");
      }
      log.writeDebug(3, "Timestamp: format: '"+timestampFormat+
                     "' mask: \""+timestampSQL);

      identifierQuoteString=props.getProperty("identifierQuoteString");
      stripNewlines=props.getBoolean("stripNewlinesFromSQL", false);
   }

   /** */
   private String formatDate(String format, String sql, Date d) {
      if (d == null) {
         log.writeDebug(3, "Inbound date is null in format date.");
         return "NULL";
      }
      log.writeDebug(8, "Formatting date with '"+format+"' and sql "+sql);
      String key="%value%";
      SimpleDateFormat stf=new SimpleDateFormat(format);

      StringBuffer temp=new StringBuffer(sql);

      int index=temp.toString().indexOf(key);
      log.writeDebug(8, "length: "+temp.toString().length()+" index="+
                     index+" length="+key.length());
      temp.replace(index, index+key.length(), stf.format(d));

      log.writeDebug(8,"DB Date Conversion, result: "+temp.toString());
      return temp.toString();      
   }


   //////////////////  INTERFACE METHODS  /////////////////////
   /** */
   public String dateSQL(java.util.Date d) {
      if (dateFormat != null && dateSQL != null) {
         return formatDate(dateFormat, dateSQL, d);
      } else {
         return datetimeSQL(d);
      }
   }

   /** */
   public String timeSQL(java.util.Date d){
      if (timeFormat != null && timeSQL != null) {
         return formatDate(timeFormat, timeSQL, d);
      } else {
         return datetimeSQL(d);
      }
   }

   /** 
    * If specified, this will attempt to create the proper
    * SQL for timestamps -- including nanoseconds defined in the
    * format at 'nnnnnn'.
    */
   public String timestampSQL(java.sql.Timestamp ts) {
      if (timestampFormat != null &&
          timestampSQL != null) {
                  
         if (timestampFormat.indexOf("nnnnnn") != -1) {
            int index=timestampFormat.indexOf("nnnnnn");

            String tempFormat=
            timestampFormat.substring(0, index)+
            timestampFormat.substring(index+6);
            SimpleDateFormat sdf=new SimpleDateFormat(tempFormat);
            StringBuffer temp=new StringBuffer(sdf.format(ts));
            DecimalFormat df=new DecimalFormat("000000");
            temp.insert(index, df.format(ts.getNanos()));

            String sql=StringUtil.replace("%value%", temp.toString(), timestampSQL);
            
            return sql;
         } else {
            return formatDate(timestampFormat, timestampSQL, ts);
         }
      } else {
         return datetimeSQL(ts);
      }
   }

   /** */
   public String datetimeSQL(java.util.Date d) {
      return formatDate(datetimeFormat, datetimeSQL, d);
   }

   /** */
   public String cleanSQL(String s) {
      if (stripNewlines) {
         s=s.replace('\n', ' ');
         s=s.replace('\r', ' ');
         return s;
      } 
      else
         return s;
   }
   
   /** */
   public String escapeStringForInsert(String s) {
      // here we should deal with at least ', ", and \
      String result=StringUtil.replace("'", "''", s);

      if (props.getBoolean("escapeBackslashes", true)) {
         // Escape backslashes
         result=StringUtil.replace("\\", "\\\\", result);
      }

      return result;
   }

   /** */
   public String formatIdentifier(String s) {
      if (identifierQuoteString != null)
         return identifierQuoteString+s+identifierQuoteString;
      else
         return s;
   }
}




