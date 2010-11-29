package com.jet.log;

/**
 * The Logger interface.
 * All classes that require access to the logging subsystem can simply
 * implement this interface and use the logs. 
 *
 * @author Paul Bemowski
 */
public interface Logger
{
   /** Always printed. */
   public static final int SYSTEM=0;

   /** Often printed. */
   public static final int INTERNAL=1; // Undefined

   /** Printed for debugging. */
   public static final int VERBOSE=3;

   /** always printed. */
   public static final int ERROR=0;

   /** A handle on the VM singleton log object. */
   public static Log log=Log.getInstance();
}
