package com.jetools.sqlmigrate;


/** */
public class ColumnMap
{
   public static final int NULL=0;
   public static final int NULL_DEFAULT=1;
   public static final int NULL_ALTERNATE=2;

   public static final String STRING="String";
   public static final String DATETIME="DateTime";
   public static final String INT="int";
   public static final String LONG="long";
   public static final String DOUBLE="double";

   String sourceCol=null;
   String destCol=null;
   String type=null;

   String nullAlternateCol=null;
   String nullDefault=null;

   int onNull=NULL;

   boolean trimStrings=false;

   /** */
   public ColumnMap(String s, String d, String t) {
      sourceCol=s;
      destCol=d;
      type=t;
   }

   /** */
   public ColumnMap(String s, String d, String t, boolean ts) {
      sourceCol=s;
      destCol=d;
      type=t;
      trimStrings=ts;
   }

   public String toString() {
      return "ColumnMap{s:"+sourceCol+" d:"+destCol+" t:"+type+"}";
   }

   public String getSourceColumn() {return sourceCol;}
   public String getDestColumn() {return destCol;}
   public String getType() {return type;}

   public boolean getTrimStrings() {return trimStrings;}
   public void setTrimStrings(boolean b) {trimStrings=b;}

   public void setNullAlternateColumn(String s) {nullAlternateCol=s;}
   public String getNullAlternateColumn() {return nullAlternateCol;}

   public void setNullDefault(String s) {nullDefault=s;}
   public String getNullDefault() {return nullDefault;}

   public void setOnNull(int o) {onNull=o;}
   public int getOnNull() {return onNull;}
}
