package com.jet.log;

/**
 * The Logger interface.
 * All classes that require access to the logging subsystem can simply
 * implement this interface and use the logs. 
 *
 * @author Paul Bemowski
 */
public interface TLogger
{
   /** A handle on the VM singleton transaction log object. */
   public static TLog tlog=TLog.getInstance();
}
