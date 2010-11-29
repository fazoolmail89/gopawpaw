package com.jet.log;


import java.util.*;
import java.io.*;
import java.text.*;

import java.sql.SQLException;

import com.jet.utils.properties.*;
import com.jet.utils.web.*;
import com.jet.utils.VectorUtil;

/**
 * The Log singleton object.  The log is used for writing log data to 
 * various devices through the course of the operation of a server side vm. <p>
 *
 * The log object contains provisions to write to 2 distinct "streams" 
 * -- the error stream and debug stream.  Future expansion may include a 
 * benchmark stream. <p>
 * 
 * The log also allows the application programmer to send "alerts" to 
 * the system.  An alert is used for a serious error, and can send 
 * messages to email accounts and email based paging systems.
 *
 * The Log can be used by any class that implements the Logger interface.
 * Because of this construction, the state of the log is defaulted to 
 * a simple System.out style system.  It is STRONGLY RECOMMENDED that 
 * the log be initialized upon startup of the VM.  This may happen in "main" 
 * for standanone apps, or in some type of pre-loaded initailization servelt
 * within servlet VMs. <p>
 *
 * Here is a sample initialization, which adds a file output device to the
 * log, and removes the System.out device.
 * <pre>
 * ...
 * FileDevice fd=new FileDevice("d:/log", "test");
 * fd.setMaxFileSize(1000000); // 1 mb max size.
 * log.setDevice(fd);
 * ...
 * </pre>
 *
 * @author Paul Bemowski
 */
public class Log
{
   /** The one and only Log object in the VM. */
   private static Log _instance=null;

   /** */
   private int debugLevel=3; // cranked

   /** */
   private int errorLevel=3; // cranked

   /** This is used for log lines logged without an explicit level. */
   private int defaultLevel=3;

   /** The vector of LogDevices currently active. */
   private LogDevice[] logDevices=null;

   /** The vector of AlertDevices currently active. */
   private Vector alertDevices=new Vector();

   /** */
   static final DateFormat df=new SimpleDateFormat("HH:mm:ss.SSS");

   /** */
   static final DecimalFormat decFormat=new DecimalFormat("#,##0.000");

   /** */
   private Log() {
      addDevice(new SystemDevice());
      AlertContext.initialize();
   }

   /**
    *
    */
//     public void init()
//     {
//        EProperties props=null;
//        try {
//           InputStream is=ClassLoader.getSystemResourceAsStream("log.properties");
//           if (is == null) {
//              writeError(1,"log.properties not available in classpath.");
//              writeError(1,"log will operate with System device only.");
//           }
//           else {
//              props=new EProperties();
//              props.load(is);
//              props.promoteEnvironment();
//              init(props);
//           }
//        }
//        catch (Exception ex) {
//           writeError(1, "Unable to init log from log.properties.", ex);
//        }
//     }

   /**
    *
    */
//     public synchronized void init(EProperties props)
//     {
//        int itemp=-1;

//        itemp=props.getInt("log.debug.level");
//        debugLevel=(itemp==-1)?debugLevel:itemp;
//        itemp=props.getInt("log.error.level");
//        errorLevel=(itemp==-1)?errorLevel:itemp;
      
//        logDevices=new Vector();
//        if (props.getBoolean("log.file")) {
//           FileDevice fd=new FileDevice(props.getProperty("log.file.root.dir"),
//                                        props.getProperty("log.file.root.name"));
//           logDevices.add(fd);
//        }
//        if (props.getBoolean("log.sysout"))
//           logDevices.add(new SystemDevice());

//        writeDebug(1, "Log initialized.");
//     }

   /** Obtain a handle to the VM singleton log instance. */
   public static Log getInstance()
   {
      if (_instance == null)
         _instance=new Log();
      return _instance;
   }

   public synchronized ArrayList getLogDevices() {
      return new ArrayList(VectorUtil.arrayToVector(logDevices));
   }
   public synchronized ArrayList getAlertDevices() {
      return new ArrayList(alertDevices);
   }

   /** This is here for backwards compatablility with the DataBrowser's
    * bugmail feature.
    */
   public synchronized String getLogFile()
   {
      for (int i=0; i<logDevices.length; i++) {
         if (logDevices[i] instanceof SimpleFileDevice) {
            SimpleFileDevice sfd=(SimpleFileDevice)logDevices[i];
            return sfd.getFile();
         }
      }
      return null;
   }

   /** Sets the debug level. */
   public void setDebugLevel(int i) {debugLevel=i;}
   public int  getDebugLevel() {return debugLevel;}
   
   /** */
   public void setErrorLevel(int i){errorLevel=i;}
   public int getErrorLevel() {return errorLevel;}


   /**
    * Add a LogDevice to the list of available devices.  There can 
    * be any number of log devices used to write log data. 
    *
    * @param ld The log device to be added to the log. */
   public synchronized void addDevice(LogDevice ld)
   {
      System.out.println ("Adding Device:"+ld);
      LogDevice oldDevices[]=logDevices;
      if (oldDevices != null) {
         logDevices=new LogDevice[oldDevices.length+1];
         for (int i=0; i<oldDevices.length; i++){
            logDevices[i]=oldDevices[i];
         }
         logDevices[logDevices.length-1]=ld;
      }
      else {
         logDevices=new LogDevice[1];
         logDevices[0]=ld;
      }
      // logDevices.addElement(ld);
   }

   /** Clear the list of log devices. */
   public synchronized void clearDevices()
   {
      System.out.println ("Clearing all existing log devices.");
      logDevices=new LogDevice[0]; // zero len array;
   }

   /** "Sets" a single log device. */
   public synchronized void setDevice(LogDevice ld) {
      clearDevices();
      addDevice(ld);
   }

   /** */
   public synchronized void removeSystemDevice() {
      ArrayList temp=new ArrayList(logDevices.length);
      for (int i=0; i<logDevices.length; i++) {
         if (!(logDevices[i] instanceof SystemDevice)) {
            temp.add(logDevices[i]);
         }
      }
      logDevices=(LogDevice[])temp.toArray(new LogDevice[temp.size()]);
   }
   
   /** */
   public synchronized void addAlertDevice(AlertDevice ad)
   {
      System.out.println ("Adding Device: "+ad);
      alertDevices.addElement(ad);
   }

   /** Writes a debug messge at the default level. */
   public synchronized void writeDebug(String line)
   {
      if (defaultLevel <= debugLevel)
         dispatch(line, "D", defaultLevel);
   }

   /** Write a "debug" log line. */
   public synchronized void writeDebug(int level, String line)
   {
      if (level <= debugLevel)
         dispatch(line, "D", level);
   }

   /** Write an "error" log line. */
   public synchronized void writeError(int level, String line)
   {
      if (level <= errorLevel)
         dispatch(line, "E", level);
   }
   
   /** Print a stack trace to the error stream. */
   public synchronized void writeError(int level, Throwable t)
   {
      if (level <= errorLevel) {
         ByteArrayOutputStream baos=new ByteArrayOutputStream();
         PrintStream ps=new PrintStream(baos);
         if (t != null)
            t.printStackTrace(ps);

         String line=null;
         if (t instanceof SQLException) {
            SQLException se=(SQLException)t;
            line="SQLCode: "+se.getErrorCode()+" SQLState: "+se.getSQLState()+
            "\n"+baos.toString();
         }
         else
            line=baos.toString();

         dispatch(line, "E", level);
      }
   }

   /** Writes a Throwable to the logs, at level 1. */
   public synchronized void writeError(Throwable t)
   {
      writeError(1, t);
   }

   /** */
   public synchronized void writeError(String s)
   {
      writeError(1, s);
   }

   /** Alias for writeError(1, t). */
   public synchronized void printStackTrace(Throwable t)
   {
      writeError(t);
   }

   /** */
   public synchronized void writeError(int level, String s, Throwable t)
   {
      if (level <= errorLevel)
      {
         writeError(level, s);
         writeError(level, t);
      }
   }

   /** Starts a benchmarking session and returns the 'BenchData' object
    * which is later passed into the lapBench and stopBench methods.*/
   public BenchData startBench(int level, String name) {
      BenchData bd=new BenchData(level, name);
      dispatch("Start. "+bd.toString(), "B", bd.getLevel());
      return bd;
   }

   /** Writes an interm datapoint of Benchmarking.  Like a 'lap' time
    * in a race, it's not done yet though. */
   public synchronized void lapBench(BenchData bd, String detail) {
      long et=System.currentTimeMillis()-bd.getStart();
      double ets=(double)et/1000.0;
      dispatch(bd.toString()+" ET: "+decFormat.format(ets)+"s | "+detail,
               "B", bd.getLevel());
   }

   /** Writes a stop message to the benchmark log. */
   public synchronized void stopBench(BenchData bd) {
      long et=System.currentTimeMillis()-bd.getStart();
      double ets=(double)et/1000.0;
      dispatch("Stop. "+bd.toString()+" ET: "+decFormat.format(ets)+"s",
               "B", bd.getLevel());
   }

   /** This method will execute the defined alert function. */
   public synchronized void writeAlert(String sub, String mess)
   {
      writeAlert(sub, mess, null);
   }
   
   /** */
   public synchronized void writeAlert(String sub, Throwable t) {
      writeAlert(sub, "No message sent", t);
   }

   /** */
   public synchronized void writeAlert(String sub, String message, 
                                       Throwable t) {
      writeError(1, "******** ((((((((  Alert Triggered  )))))))) *********");
      writeError(1, "Sending Alert to "+alertDevices.size()+" alert devices.");

      if (t != null)
         writeError(1, "Subject: "+sub+"\nMessage: "+message, t);
      else
         writeError(1, "Subject: "+sub+"\nMessage: "+message);
      StringBuffer sb=new StringBuffer(message);
      if (t != null) {
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(baos);
        t.printStackTrace(ps);
        ps.flush();
        ps.close();
        // WebStream ws=new WebStream();
        // t.printStackTrace(ws);
         sb.append("\n\n--------------------------------------\n\n");
         sb.append(baos.toString());
      }
      sb.append("\n\n--------------------------------------\n\n");
      sb.append(AlertContext.getAlertContext()); 
      
      String bigmessage=sb.toString();

      if (alertDevices.size() == 0) {
         writeDebug(1, "LOG: No alert devices available. Alert processing finished.");
      } else {
         for (int i=0; i<alertDevices.size(); i++) {
            AlertDevice ad=(AlertDevice)alertDevices.elementAt(i);
            ad.sendAlert(sub, bigmessage);
         }
      }
   }

   /** 
    * Dispatch the log call to all log devices on record.  
    * No snyc is necessary since all callers of this method are synchronized.
    */
   private void dispatch(String line, String stream, int level)
   {
      // add prefix.
      // Date d=Calendar.getInstance().getTime();
      Date d=new Date(System.currentTimeMillis());
      String thread=Thread.currentThread().getName();

      StringBuffer sb=new StringBuffer();
      sb.append(df.format(d));
      sb.append(" ["+thread+"] "+stream+level+": "+line);
      
      for (int i=0; i<logDevices.length; i++) {
         // LogDevice ld=(LogDevice)logDevices.elementAt(i);
         logDevices[i].write(d, sb.toString());
      }
   }

   /** */
   private synchronized void syncDispatch(String line, String stream, int l) {
      dispatch(line, stream, l);
   }

   /** */
   private LogMultiplexerStream lms=null;

   /** */
   public OutputStream getMultiplexerStream() {
      if (lms == null) {
         synchronized (this) {
            if (lms == null) 
               lms=new LogMultiplexerStream();
         }
      }
      return lms;
   }

   /**
    * This class will listen for full lines written to this stream and
    * dispatch them to the various log devices.
    */
   public class LogMultiplexerStream extends OutputStream 
   {
      StringBuffer ibuffer=new StringBuffer(200);

      public LogMultiplexerStream() {}

      public synchronized void write(int i) {
         byte b=(byte)i;
         if (b == '\n'){
            // ibuffer.append((char)b);
            dispatchAndClear();
         }
         else {
            ibuffer.append((char)b);
         }
      }

      void dispatchAndClear() {
         syncDispatch(ibuffer.toString(), "LMS", 1);
         ibuffer.delete(0, ibuffer.length());
      }
   }
}
