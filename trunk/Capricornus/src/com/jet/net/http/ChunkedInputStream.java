package com.jet.net.http;

import java.io.*;


/**
 * Reads a Chunked stream.  The format of a chunked stream
 * is: 
 * C\r\n
 * C bytes
 * C\r\n
 * C bytes
 * 0\r\n
 *
 * Where C is the chunk size.  The chunked stream is terminated by 
 * a 0 length chunk.
 *
 */
public class ChunkedInputStream extends InputStream
{
   /** */
   InputStream is=null;

   /** */
   Chunk currentChunk=null;

   /** */
   public ChunkedInputStream (InputStream is) {
      this.is=is;
   }

   /** */
   public int read() 
      throws IOException {
      if (currentChunk == null ||
          currentChunk.done) {
         currentChunk=readChunk();
      }
      
      if (currentChunk.size == 0)
         return -1;
      
      return currentChunk.read();
   }

   Chunk readChunk() 
      throws IOException {
      StringBuffer sb=new StringBuffer();

      int i=is.read();
      while ((char)i != '\r') {
         sb.append((char)i);
         i=is.read();
      }
      i=is.read();
      if ((char)i != '\n')
         throw new IOException("Bad chunk format, \\r not followed by \\n" +
                               " on chunk "+chunkNumber);

      try {
         String ssize=sb.toString().trim();
         Integer size=Integer.valueOf(ssize, 16);
         Chunk chunk= new Chunk(size.intValue());
         System.out.println ("returning: "+chunk.toString());
         return chunk;
      } catch (NumberFormatException ex) {
         throw new IOException("Bad chunk header '"+sb.toString()+
                               "' on chunk "+chunkNumber);
      }
   }


   private int chunkNumber=0;

   /** 
    *
    */
   private final class Chunk {
      public boolean done=false;
      
      int size=-1;

      int number=-1;
      
      private int count=0;

      Chunk (int size) {
         this.size=size;
         this.number=chunkNumber;
         chunkNumber++;
      }

      int read() 
         throws IOException {
         count++;
         
         if (count == size)
            done=true;

         return is.read();
      }

      public String toString() {return "Chunk: size="+size+" number="+number;}
   }
}
