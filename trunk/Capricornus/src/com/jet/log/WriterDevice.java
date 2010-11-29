package com.jet.log;

import java.util.Date;
import java.io.*;

/**
 * A simple log device that dumps data to a stream with which this 
 * device was constructed.
 *
 * @author Paul Bemowski
 */
public class WriterDevice implements LogDevice
{
   private PrintWriter printWriter=null;

   /** 
    * Constructs a stream device from and OutputWriter.
    */
   public WriterDevice(Writer w) {
      this(new PrintWriter(w));
   }

   /**
    * Constructs a stream device from a PrintWriter;
    */
   public WriterDevice(PrintWriter pw) {
      printWriter=pw;
   }

   public void write(Date d, String data) {
      printWriter.println(data);
      printWriter.flush();
   }

   public String toString() {
      return "WriterDevice - Writer is "+printWriter;
   }
}
