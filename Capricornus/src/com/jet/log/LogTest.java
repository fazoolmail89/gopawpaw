package com.jet.log;

import java.util.*;


/**
 * Logging subsystem unit test code. 
 * @author Paul Bemowski
 */
public class LogTest implements Logger, TLogger
{

   public static void main(String args[])
   {
      //FileDevice fd=new FileDevice("d:/temp/logtest", "testlog");
      //fd.setMaxFileSize(50000); // 50k
      //log.clearDevices();
      //log.addDevice(fd);

      //AlertDevice ad=new EmailDevice("bemowski@yahoo.com", "mail.surfree.com");
      //log.addAlertDevice(ad);

      //FileDevice tfd=new FileDevice("d:/temp/logtest", "translog", ".tlog");
      //tlog.setDevice(tfd);

      for (int i=0; i<5; i++) {
         LogTestThread t=new LogTestThread(1000);
         t.start();
      }

      for (int i=0; i<5; i++) {
         TLogTestThread t=new TLogTestThread(1000);
         t.start();
      }

      for (int i=0; i<2; i++) {
         AlertTestThread t=new AlertTestThread(10000);
         t.start();
         try {Thread.currentThread().sleep(5000);}catch(Exception ex){}
      }
   }

   public static void crank()
   {
      for (int i=0; i<5000; i++) {
         log.writeDebug(3, "hello world.");
         try {Thread.currentThread().sleep(10);} catch (Exception ex) {}
      }

      for (int i=0; i<5; i++) {
         log.writeError(1, new Exception("text exc."));
      }
   }

   /*public static void main(String args[])
      throws Exception
   {

      tlog.setDevice(new FileDevice("d:/temp/logtest", "trans_test"));

      tlog.writeRaw("This is a rawwrite line.");
      tlog.writeRaw("This is a rawwrite line.");

      for (int i=0; i<100; i++) {
         tlog.writeTransaction("A", "user_9872942", "site_213", "oem_3",
                               "refljljlj", "63.111.0.3", "page hit: /servlet/SearchProcessor?lkjllj");
      }
      }*/


   static class LogTestThread extends Thread
   {
      static int tcount=0;
      Random rand=new Random(System.currentTimeMillis());
      
      long sleeptime=0;

      LogTestThread(int range)
      {
         setName("LogTestThread-"+tcount++);

         sleeptime=(long)rand.nextInt(range)+100;
         log.writeDebug(2, getName()+"'s sleeptime="+sleeptime);
      }

      public void run()
      {
         while(true) {
            log.writeDebug(3, "lklkj "+rand.nextGaussian());
            try {sleep(sleeptime);} catch (Exception ex) {}
         }
      }
   }   

   static class TLogTestThread extends Thread
   {
      static int tcount=0;
      Random rand=new Random(System.currentTimeMillis());
      
      long sleeptime=0;

      TLogTestThread(int range)
      {
         setName("TLogTestThread-"+tcount++);

         sleeptime=(long)rand.nextInt(range)+100;
         log.writeDebug(2, getName()+"'s sleeptime="+sleeptime);
      }

      public void run()
      {
         while(true) {
            tlog.writeTransaction("A", "user_9872942", "site_213", "oem_3",
                                  "refljljlj", "63.111.0.3", 
                                  "page hit: /servlet/SearchProcessor?lkjllj");
            try {sleep(sleeptime);} catch (Exception ex) {}
         }
      }
   }   

   static class AlertTestThread extends Thread
   {
      static int tcount=0;
      Random rand=new Random(System.currentTimeMillis());
      
      long sleeptime=0;

      AlertTestThread(int s)
      {
         setName("AlertTestThread-"+tcount++);

         sleeptime=s;
         log.writeDebug(2, getName()+"'s sleeptime="+sleeptime);
      }

      public void run()
      {
         while(true) {
            log.writeAlert("Alert subject... ", "Something has gone \n"+
                           "TERRIBLY WRONG!!");
            try {sleep(sleeptime);} catch (Exception ex) {}
         }
      }
   }   
}



