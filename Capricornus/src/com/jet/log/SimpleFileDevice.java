package com.jet.log;

import java.util.Date;
import java.io.*;

/**
 * A simple log device that dumps data to a stream with which this 
 * device was constructed.
 *
 * @author Paul Bemowski
 */
public class SimpleFileDevice implements LogDevice
{
   private PrintStream printStream=null;

   private File file=null;

   /** 
    *
    */
   public SimpleFileDevice(String file)
      throws IOException
   {
      this(new File(file));
   }

   /**
    *
    */
   public SimpleFileDevice(File f)
      throws IOException 
   {
      file=f;
      FileOutputStream fos=new FileOutputStream(file);
      printStream =new PrintStream(fos);
   }

   public void write(Date d, String data)
   {
      printStream.println(data);
      printStream.flush();
   }

   /**  */
   public String getFile() {return file.getAbsolutePath();}

   public String toString()
   {
      return "SimpleFileDevice: "+file.getAbsolutePath();
   }
}
