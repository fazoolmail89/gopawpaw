package com.jet.log;

import java.util.*;
import java.io.*;
import java.text.*;

/**
 * The FileDevice logs data to a file.  It will roll every day at midnight, 
 * as well as beyond a pre-defined file size. 
 *
 * @author Paul Bemowski
 */
public class FileDevice implements LogDevice
{
   /** Calendar representing the current date. */
   Calendar currentCal=null;

   /** Calendar used for comparisons to the current cal. */
   Calendar workingCal=Calendar.getInstance();

   /** The root directory for logging.  Under this directory will be
    * any number of subdirectories, one for each day. */
   File rootDir=null;

   /** The root name of the log files for this virtual machine.  If you 
    * have multiple VM's logging to the same log dir, you may want to give
    * each one an identifier. */
   String rootName=null;

   /** A handle on the current open writer object. */
   PrintWriter writer=null;

   /** The file object representing the FULL PATH to the file that the 
    * writer is currently open on.  */
   File currentFile=null;

   /** A file representing the current logging directory.  This will be
    * the root directory plus a date directory. */
   File currentDir=null;

   /** Number of lines to delay before checking the file system for
    * the size of the log file.  Checking the file system is an expensive
    * call, so we won't check this every time. */
   int fileSizeCheckInterval=10;

   /** The current line count for the file size check interval. */
   int lineCount=0;

   /** The maximum file size.  Default is 1 mb. */
   long maxFileSize=1000000;

   /** Log file suffix. */
   String suffix=".log";

   /** The format of the date directories.  */
   static final DateFormat dirformat=new SimpleDateFormat("MM.dd.yyyy");

   /** Constructor. 
    *
    * @param rd The root directory for this FileDevice. 
    * @param rn The root name to be used when naming files.  
    */
   public FileDevice(String rd, String rn)
   {
      rootDir=new File(rd);
      rootName=rn;

      currentCal=Calendar.getInstance();
      initNewDir(currentCal.getTime());
   }

   /**
    * Constructor.
    * 
    * @param rd The root directory for this FileDevice. 
    * @param rn The root name to be used when naming files. 
    * @param su The suffix for the log files. 
    */
   public FileDevice(String rd, String rn, String su)
   {
      rootDir=new File(rd);
      rootName=rn;
      suffix=su;

      currentCal=Calendar.getInstance();
      initNewDir(currentCal.getTime());
   }

   /////////////////////////////////////////////////////////////////////////
   ////////////////////////  Device State Setters  /////////////////////////
   /////////////////////////////////////////////////////////////////////////
   //public void setSuffix(String s) {suffix=s;}
   /** 
    * The number of lines between which the FileDevice checks the size 
    * of the file currently being written.  Default is 10.
    */
   public void setFileSizeCheckInterval(int i) {fileSizeCheckInterval=i;}

   /**
    * The maximum size of a log file before it is "rolled".  Default is 
    * 1 mb.
    * @param l The max size of the file.
    */
   public void setMaxFileSize(long l) {maxFileSize=l;}

   /**
    * Checks the current directory agains the current date.  Also checks
    * for file size.
    */
   private void checkDir(Date d)
   {
      workingCal.setTime(d);
      
      if (workingCal.get(Calendar.DAY_OF_MONTH) !=
          currentCal.get(Calendar.DAY_OF_MONTH))
      {
         initNewDir(d);
      }
      
      if (lineCount > fileSizeCheckInterval) {
         if (currentFile.length() > maxFileSize) {
            try {initNewFile();}
            catch (IOException ex) {
               ex.printStackTrace();
               throw new RuntimeException("Unable to initialize new file.  "+
                                          "Check the file system.");
            }
         }
         lineCount=0;
      }
      lineCount++;
   }
   
   /**
    * Initializes a new directory for the given date. 
    */
   private void initNewDir(Date d)
   {
      // close existing 
      try {
         String dirname=dirformat.format(d);
            
         currentDir=new File(rootDir, dirname);

         if (!currentDir.exists()) {
            boolean success=false;
            success=currentDir.mkdirs();
            
            if (!success)
               throw new RuntimeException("Unable to create log dir "+
                                          currentDir.getAbsolutePath());
         }
         initNewFile();

         currentCal.setTime(d);
      }
      catch (Exception ex) {
         ex.printStackTrace();
         throw new RuntimeException("Error rolling log dirs");
      }
   }

   /** Initializes a new file in the currentDir. */
   private void initNewFile()
      throws IOException
   {
      if (writer != null) {
         // writer.println ("Closing this log file at "+);
         writer.close();
      }

      String filename=Util.findAvailableFile(currentDir, rootName, suffix);
      currentFile=new File(filename);
      System.out.println ("Initializing new writer: "+filename);
      writer=Util.buildWriter(filename);
   }

   /** */
   public String toString()
   {
      return "FileDevice: RD:"+rootDir.getAbsolutePath()+" RN: "+rootName;
   }

   /** */
   public void finalize()
   {
      if (writer != null)
      {
         try {writer.close();}
         catch (Exception ex) {ex.printStackTrace();}
      }
   }

   /** The low level write method that allows the FileDevice to implement
    * LogDevice. */
   public void write(Date d, String data)
   {
      checkDir(d);
      writer.println(data);
   }
}

