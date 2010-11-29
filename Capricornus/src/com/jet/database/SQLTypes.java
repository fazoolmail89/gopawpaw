package com.jet.database;


/** 
 * An internal list of data type.  The SQLType will determin the 
 * type based on heuristics of known databases.
 */
public interface SQLTypes
{
   static final int UNKNOWN_FIELD=-1;

   /** */
   static final int STRING_FIELD=0;
   static final int NUMERIC_FIELD=1;
   static final int DATE_FIELD=2;
   static final int TIME_FIELD=3;
   static final int DATE_TIME_FIELD=4;
   static final int TIMESTAMP_FIELD=5;
}