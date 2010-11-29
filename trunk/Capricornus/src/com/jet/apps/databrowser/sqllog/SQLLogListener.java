package com.jet.apps.databrowser.sqllog;


/**
 * An event listener interface. 
 */
public interface SQLLogListener
{
   public void logEvent(SQLLogEvent evt);
}