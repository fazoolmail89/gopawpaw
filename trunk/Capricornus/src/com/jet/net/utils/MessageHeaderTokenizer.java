package com.jet.net.utils;

import java.io.*;
import java.util.*;

/**
 * The MessageHeaderTokenizer parses a the headers off of an 
 * internet message.  This is useful for SMTP, POP3, NNTP, as well
 * as HTTP Headers.
 *
 * @author Paul Bemowski
 */
public class MessageHeaderTokenizer
{
   /** EOF character */
   private static final int EOF=-1;

   /** */
   Reader reader=null;

   /** */
   private boolean complete=false;
      
   String nextLine=null;

   /** Constructs a MessageHeaderTokenizer on the BufferedReader
    * passed in.
    * @param r A BufferedReader representing the message stream. */
   public MessageHeaderTokenizer(Reader r) {
      reader=r;
   }
   
   /** Returns the next header, until all headers have been read (signified
    * by a single blank line, after which it returns null.
    * @return A Pair object containing a key and a value. */
   public Pair nextHeader()
      throws IOException
   {
      if (complete) return null;

      String line=null;

      if (nextLine != null)
         line=nextLine;
      else
         line=readLine();

      String lt=line.trim();

      // parse the key, and the begining of the val
      int colon=line.indexOf(":");
      if (colon == -1)
         throw new IOException("Read state error. No key defined in header.");
      String key=line.substring(0, colon+1);
      String value=line.substring(colon+1); // to eol

      nextLine=readLine();
      while (nextLine.trim().length() > 0 &&
             Character.isWhitespace(nextLine.charAt(0))) {
         value=value+"\n"+nextLine;
         nextLine=readLine();
      }

      if (nextLine.trim().length() == 0) {
         // we're done with the headers
         complete=true;
         nextLine=null;
      }
         
      return new Pair(key, value);
   }

   /** */
   private String readLine() 
      throws IOException{
      StringBuffer sb=new StringBuffer();
      int i=reader.read();
      char c=(char)i;
      while (c != '\n' && i != EOF) {
         sb.append(c);

         i=reader.read();
         c=(char)i;
      }
      String s=sb.toString();
      if (s.endsWith("\r"))
         return s.substring(0, s.length()-1);
      else
         return s;
   }

   public boolean isComplete() {return complete;}
}
