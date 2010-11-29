package com.jet.utils.web;

import java.io.*;

/**
 *
 */
public class WebStream extends PrintStream
{
   StringBuffer buffer=new StringBuffer();

   public WebStream()
   {
      super(System.out);
   }
   
   public String toString()
   {
      return buffer.toString();
   }


   /**
    *
    */
   public void write(int b) // throws IOException
   {
      if ((char)b == '\n')
         buffer.append("<br>");
      else
         buffer.append(""+(char)b);
   }
   
   /**
    *
    */
   public void flush()
   {
      // no-op, not necessary
   }
   
   
   /**  */
   public void write(byte b[], int off, int len) //throws IOException 
   {
      for (int i = 0 ; i < len ; i++) 
      {
         write(b[off + i]);
      }
   }

   /**  */
   public void write(byte b[]) //throws IOException 
   {
      write(b, 0, b.length);
   }
   

}
