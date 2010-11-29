package com.jet.log;

import java.text.*;
import java.io.*;

/**
 *
 *
 */
class Util
{
   /** The 'log decimal format'.  This allows multiple files with the 
    * same root in the same dir.  */
   private static DecimalFormat df=new DecimalFormat("0000");

   /** */
   static String findAvailableFile(File dir, String root, String ext)
   {
      int current=0;
      boolean done=false;
      File file=null;
      while (!done) {
         String filename=root+df.format(current)+ext;
         file=new File(dir, filename);
         if (!file.exists())
            done=true;
         else
            current++;
      }
      return file.getAbsolutePath();
   }

   /** */
   static PrintWriter buildWriter(String filename)
      throws IOException
   {
      File f=new File(filename);
      FileOutputStream fos=new FileOutputStream(f);
      PrintWriter pw=new PrintWriter(new OutputStreamWriter(fos), true);
      return pw;
   }
}
