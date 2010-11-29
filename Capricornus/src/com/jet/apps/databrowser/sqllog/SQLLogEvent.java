package com.jet.apps.databrowser.sqllog;


/**
 *
 */
public class SQLLogEvent 
{
   String name=null;

   public SQLLogEvent(String dbname) {
      name=dbname;
   }
   
   public String getName() {
      return name;
   }
}