package com.jet.log;

import java.util.Date;
import java.io.*;

/**
 * A simple log device that dumps data to a stream with which this 
 * device was constructed.
 *
 * @author Paul Bemowski
 */
public class StreamDevice implements LogDevice
{
   private PrintStream printStream=null;

   /** 
    * Constructs a stream device from and OutputStream.
    */
   public StreamDevice(OutputStream os) {
      this(new PrintStream(os));
   }

   /**
    * Constructs a stream device from a PrintStream;
    */
   public StreamDevice(PrintStream ps) {
      printStream=ps;
   }

   public void write(Date d, String data) {
      printStream.println(data);
      printStream.flush();
   }

   public String toString() {
      return "StreamDevice - Stream is "+printStream;
   }
}
