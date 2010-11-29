package com.jet.net.utils;

import java.io.*;
import java.text.*;
import java.util.Date;

/**
 * This is a simple debug logging abstraction that will allow log messages
 * including stack traces from the JET-Net package to be sent to 
 * any stream.  It is a static Singleton, that contains an OutputStream.
 * The log stream is user defineable. <p>
 *
 * All methods on this class are synchronized on the class itself, making it
 * both thread safe, and a potential bottleneck.  In active server VMs the
 * logging should be disabled with setEnabled(false), and only turned on 
 * when debugging, or when a problem is suspected.
 *
 * @author Paul Bemowski
 */
public final class Log
{
   private static final DateFormat df=new SimpleDateFormat("HH:mm:ss.SSS");

   private static PrintStream logStream=System.out;

   private static boolean usePrefix=true;

   private static boolean enabled=true;

   public static void setUsePrefix(boolean b) {
      usePrefix=b;
   }
   
   /** Sets the stream on which all logging from JET-Net is written. 
    * The default stream is System.out. 
    * @param os The output stream to write messages to. */
   public static synchronized void setLogStream (OutputStream os) {
      if (os instanceof PrintStream)
         logStream=(PrintStream)os;
      else
         logStream=new PrintStream(os);
   }

   /** Returns the current log stream.
    * @return The current log stream. */
   public static synchronized PrintStream getLogStream() {
      return logStream;
   }

   /** Enables/Disables the logging mechanism.  This method can be called
    * on the fly, at any time. This is defaulted to 'true'. 
    * @param b A boolean indicating whether log messages will be written 
    * to the log stream.
    */
   public static synchronized void setEnabled(boolean b) {
      enabled=b;
   }

   /** Writes a log line to the log stream. */
   public static synchronized void write(String s) {
      if (enabled) {
         try {
            logStream.write((getPrefix()+s+"\n").getBytes());
         } catch (IOException ex) {
            ex.printStackTrace(System.err);
         }
      }
   }

   /** Writes an exception stack trace to the log stream.
    * @param t An exception to be logged. */
   public static synchronized void write(Throwable t) {
      if (enabled) {
         try {
            logStream.write(getPrefix().getBytes());
         } catch (IOException ex) {
            ex.printStackTrace(System.err);
         }
         t.printStackTrace(logStream);
      }
   }

   private static final String getPrefix() {
      if (usePrefix)
         return 
         df.format(new Date())+" ["+
         Thread.currentThread().getName()+"]: ";
      else
         return "";
   }
}
