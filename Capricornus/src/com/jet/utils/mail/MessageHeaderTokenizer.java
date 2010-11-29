package com.jet.utils.mail;

import java.io.*;
import java.util.*;

/**
 *
 */
public class MessageHeaderTokenizer
{
   BufferedReader br=null;
   private boolean complete=false;
      
   String nextLine=null;

   public MessageHeaderTokenizer(BufferedReader r)
   {
      br=r;
   }

   public Pair nextHeader()
      throws IOException
   {
      if (complete) return null;

      String line=null;

      if (nextLine != null)
         line=nextLine;
      else
         line=br.readLine();

      String lt=line.trim();

      if (lt.equals(".")) // this is the end of the message
         return null;

      // parse the key, and the begining of the val
      int colon=line.indexOf(":");
      if (colon == -1)
         throw new IOException("Read state error. No key defined in header.");
      String key=line.substring(0, colon+1);
      String value=line.substring(colon+1); // to eol

      nextLine=br.readLine();
      while (nextLine.trim().length() > 0 &&
             Character.isWhitespace(nextLine.charAt(0)))
      {
         value=value+"\n"+nextLine;
         nextLine=br.readLine();
      }

      if (nextLine.trim().length() == 0)
      {
         // read the rest of the lines from the stream. 
         // we're done with the headers
         complete=true;
         //readFully();
         nextLine=null;
      }
         
      return new Pair(key, value);
   }

   private void readFully()
      throws IOException
   {
      String line=br.readLine();
      while (line != null &&
             !line.startsWith("."))
         line=br.readLine();
   }

   public boolean isComplete() {return complete;}
}
