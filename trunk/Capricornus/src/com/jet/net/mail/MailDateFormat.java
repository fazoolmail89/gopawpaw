package com.jet.net.mail;

import java.text.*;
import java.util.*;

/** 
 * Attempt to format date as follows:
 * Fri, 20 Feb 2004 02:57:51 +0000 (GMT)
 */
public class MailDateFormat 
{
   SimpleDateFormat df1=new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
   SimpleDateFormat df2=new SimpleDateFormat("(z)");

   DecimalFormat df=new DecimalFormat("00");

   public MailDateFormat() {
   }


   public String format(Date d) {
      return df1.format(d)+tzoffset(d);
   }

   public String tzoffset(Date d) {
      Calendar cal=Calendar.getInstance();
      TimeZone tz=cal.getTimeZone();
      int offset=0;
      if (tz.inDaylightTime(d)) {
         offset=cal.get(cal.DST_OFFSET);
      } else {
         offset=cal.get(cal.ZONE_OFFSET);
      }
      
      String sign="+";
      if (offset < 0) {
         offset=-offset;
         sign="-";
      }

      double hours=(double)offset/1000/60/60;
      double minutes=(double)offset-(hours*1000*60*60);
      minutes=minutes/1000/60;

      // System.out.println ("Current timezone: "+tz);
      // System.out.println ("offset: "+offset);
      return " "+sign+df.format(hours)+df.format(minutes)+" ";
   }

   public static void main(String args[]) {
      MailDateFormat mdf=new MailDateFormat();

      System.out.println (mdf.format(new Date()));
   }
}
