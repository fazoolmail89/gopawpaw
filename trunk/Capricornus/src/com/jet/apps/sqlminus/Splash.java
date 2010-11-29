package com.jet.apps.sqlminus;

import java.util.*;
import java.text.*;
import java.io.*;

import com.jet.utils.io.StreamUtil;

/**
 *
 */
public class Splash
{
   static final SimpleDateFormat df=new SimpleDateFormat("dd MMM yyyy");
   static final SimpleDateFormat tf=new SimpleDateFormat("HH:mm");
   static final SimpleDateFormat bdf=new SimpleDateFormat("yyyyMMdd_HHmm");

   Date buildDate=null;

   /** */
   Splash() {
      String dateString=getResourceAsString("build.date");
      if (dateString == null) {
         buildDate=new Date();
      } else {
         try {
            buildDate=bdf.parse(dateString.trim());
         } catch (Exception ex) {
            ex.printStackTrace();
            buildDate=new Date();
         }
      }
   }

   /** */
   public String getResourceAsString(String key) {
      try {
         InputStream is=this.getClass().getClassLoader().getSystemResourceAsStream(key);
         if (is == null) {
            System.out.println ("Cannot find resource "+key);
            return null;
         }
         return StreamUtil.readToString(is);
      } catch (Exception ex) {
         ex.printStackTrace();
         return null;
      }
   }

   /** */
   public void print() {
      String message=
      "       **********************************************************\n"+
      "       * SQL Minus           * J Enterprise Technologies, Inc.  *\n"+
      "       * Version:            * http://www.jetools.com           *\n"+
      "       * Date: "+df.format(buildDate)+
                                "   * support@jetools.com              *\n"+
      "       * Time: "+
      tf.format(buildDate)+
                          "                                            *\n"+
      "       **********************************************************";
      
      System.out.println ("\n"+message+"\n");
   }

}
