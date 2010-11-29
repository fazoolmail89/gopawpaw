package com.jet.utils.io;

import java.io.*;

/**
 * This is a simple stream wrapper object that counts the number
 * of bytes that passes through it by overriding the fundamental
 * write methods, and delegating everything else;
 *
 * @author Paul Bemowski
 */
public class TrackingOutputStream extends OutputStream
{
   /** Tracks the number of bytes through this stream. */
   private long bytecount=0;

   /** The real OutputStream. */
   OutputStream os=null;

   /** */
   public TrackingOutputStream(OutputStream o) {os=o;}

   public long getByteCount() {return bytecount;}

   /////////////////////////////////////////////////////////////////////////
   public void close() 
      throws IOException {os.close();}

   public void flush()
      throws IOException {os.flush();}

   public void write(byte b[])
      throws IOException {
      bytecount=bytecount+b.length;
      os.write(b);
   }
   
   public void write(byte b[], int off, int len) 
      throws IOException {
      bytecount=bytecount+len;
      os.write(b, off, len);
   }

   public void write(int b) 
      throws IOException {
      bytecount++;
      os.write(b);
   }
}