package com.jet.utils.io;

import java.io.*;

/*
 * $Log: TeeOutputStream.java,v $
 * Revision 1.2  2003/04/18 00:21:36  bemocvs
 * Fixed line terminators
 *
 * Revision 1.1.1.1  2002/12/05 00:07:59  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/05 15:49:29  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 17:34:54  bemowskip
 * cc
 *
 */

/**
 * A TeeOutputStream works similar to unix tee, piping identical 
 * output to two different streams.
 */
public class TeeOutputStream extends OutputStream 
{
   OutputStream os1=null;
   OutputStream os2=null;
   /** */
   public TeeOutputStream(OutputStream os1, OutputStream os2) {
      this.os1=os1;
      this.os2=os2;
   }
   
   /** */
   public void write(int b) 
      throws IOException {
      os1.write(b);
      os2.write(b);
   }

   /** */
   public void write(byte[] b, int off, int len) 
      throws IOException {
      os1.write(b, off, len);
      os2.write(b, off, len);
   }

   /** */
   public void flush() 
      throws IOException {
      os1.flush();
      os2.flush();
   }
}
