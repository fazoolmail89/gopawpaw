package com.jet.utils.io;


import java.io.*;


/**
 * This is a simple stream wrapper object that counts the number
 * of bytes that passes through it by overriding the fundamentla
 * read methods.
 *
 * @author Paul Bemowski
 */
public class TrackingInputStream extends InputStream
{
   /** Tracks the number of bytes through this stream. */
   private long bytecount=0;

   /** The real InputStream. */
   InputStream is=null;

   /** */
   public TrackingInputStream(InputStream i) {is=i;}

   public long getByteCount() {return bytecount;}

   /////////////////////////////////////////////////////////////////////////
	public int available() throws IOException {return is.available();}
   
   public void close() throws IOException {is.close();}

   public void mark(int readlimit) {is.mark(readlimit);}

   public boolean markSupported() {return is.markSupported();}

   public int read() throws IOException {
      int i=is.read();
      bytecount++;
      return i;
   }

   public int read(byte[] b) throws IOException {
      int i=is.read(b);
      bytecount=bytecount+i;
      return i;
   }
   
   public int read(byte[] b, int off, int len) throws IOException {
      int i=is.read(b, off, len);
      bytecount=bytecount+i;
      return i;
   }

   public void reset() throws IOException {is.reset();}

   public long skip(long n) throws IOException {return is.skip(n);}
}