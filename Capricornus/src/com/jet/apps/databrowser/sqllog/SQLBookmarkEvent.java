package com.jet.apps.databrowser.sqllog;


/**
 *
 */
public class SQLBookmarkEvent 
{
   String type=null;

   /** */
   public SQLBookmarkEvent(String t) {
      type=t;
   }

   /** */
   public String getType() {
      return type;
   }
}