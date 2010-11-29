package com.jet.core;

import java.io.*;

import java.text.*;
import java.util.*;

/**
 *
 */
public class BuildID
{
   private static String buildDate="Unknown Build";

   private static DateFormat inputFormat=new SimpleDateFormat("yyyyMMdd_HHmm");
   private static DateFormat outputFormat=new SimpleDateFormat("MMM dd, yyyy hh:mm aa");

   static {
      InputStream is=null;
      try {
         is=BuildID.class.getClassLoader().getResourceAsStream("build.date");
         // is=ClassLoader.getSystemResourceAsStream("build.date");
         if (is == null) {
            //System.out.println ("No version information available "+
            //                    "in this jar.");
            buildDate="Unknown Build";
         }
         else {
            StringBuffer sb=new StringBuffer();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String line=br.readLine();
            while (line != null) {
               sb.append(line);
               line=br.readLine();
            }
            // System.out.println (sb.toString());
            buildDate=sb.toString();
         }
      }
      catch (Exception ex) {
         System.err.println ("Error reading version information from "+
                             "the jar.");
         ex.printStackTrace();
      }
      finally {
         try {is.close();} catch (Exception ex) {}
      }      
   }


   public static String getBuildDate()
   {
      String retval=buildDate;
      try {
         Date d=inputFormat.parse(buildDate.trim());
         retval=outputFormat.format(d);
      }
      catch (Exception ex) {
      }
      return retval;
   }
}

