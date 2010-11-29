package com.jet.net.mail;

import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;

import com.jet.net.utils.Log;

/*
 * $Log: DeliveryServer.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.5  2001/06/08 17:21:32  bemocvs
 * undeliverable messages were not being removed from the queue
 *
 */

/**
 * A DeliveryServer is an implementation of MailServer that 
 * queues delivery of messages into the background.  From the clients
 * perspective the email is sent instantly, however it is really
 * queued for later delivery.  This is in contrast to the SMTP mail server 
 * where all messages are sent inline with the calling thread. <p>
 *
 * This MailServer wrapper is a singleton, designed for use inside of
 * a server VM.  To use it, you must first call the setMailServer() static
 * method.  Then, obtain a handle to the singleton with getInstance(), and
 * call sendMessage(). <p>
 *
 * This class is designed for access from multiple thread, and is thread
 * safe. <p>
 * 
 * Attachments to e-mails are included as multi-part MIME attachments.
 * They are encoded in base64 (most standard encoding on the 'net) and
 * the mime-type is set to application/octet-stream. <p>
 *
 * <b>WARNING:</b> This class uses a base64 encoder that is encoded in the
 * sun.misc.* package.  This is available in most SUN and IBM virtual 
 * machines. <p>
 *
 * @author Paul Bemowski
 */
public class DeliveryServer implements MailServer
{
   private static DeliveryServer sInstance=null;

   private MessageDeliveryThread deliveryThread=null;

   private static Vector messagesToDeliver=new Vector();

   private static String mailServer="mail.jetools.com"; // default ok??
   private static int mailPort=25;

   /**
    *
    */
   private DeliveryServer()
   {
      deliveryThread = new MessageDeliveryThread();
      deliveryThread.start();
   }

   /**
    * Obtain a handle to the singleton instance of this class.  You 
    * should first call setMailServer() to set the mail server context.
    *
    * @return The singleton instance of this server. 
    */
   public static DeliveryServer getInstance()
   {
      if (sInstance == null) {
         synchronized(DeliveryServer.class) {
            if (sInstance == null)
               sInstance=new DeliveryServer();
         }
      }
      return sInstance;
   }

   /**
    * Sets the mail server context for this object.  All outbound mail
    * delivery will go thru whatever server is set.  This should be set
    * before the first call to getInstance(), and not called thereafter.
    *
    * @param s The server host or IP.
    * @param p The server mail port -- SMTP default is 25. 
    */
   public static void setMailServer(String s, int p) {
      mailServer=s;
      mailPort=p;
   }
   

   /**
    * In the delivery server, this just adds the message to the 
    * delivery que.
    */
   public void sendMessage(EMailMessage msg)
   {
      messagesToDeliver.addElement(msg);

      deliveryThread.interrupt();
   }

   /**
    * Worker thread for the delivery of e-mails to multiple email boxes.
    * Needs to have a local message storage capability.
    *
    */
   private class MessageDeliveryThread extends Thread
   {
      // int sleepInterval=3600000; // 1 hour
      int sleepInterval=1000*60; // 1 min

      /** This is the maximum number of times this server will 
       * attempt to deliver this message. */
      int maxAttempts=10;

      MailServer staticMailServer=null;

      public MessageDeliveryThread()
      {
         this.setName("MailDeliveryThread");
         staticMailServer=new SMTPMailServer(mailServer, mailPort);
      }

      public void run() 
      {
         while (true)
         {
            int messageCount=messagesToDeliver.size();

            for (int i=0; i<messageCount; i++) 
            {
               EMailMessage email=(EMailMessage)messagesToDeliver.elementAt(i);
               email.addDeliveryAttempt();

               // Deliver some messages
               try {
                  // it's ok to hold a static ref here, the SMTPMailServer
                  // object is stateless other than the host/port.  Which
                  // would actually be an argument for not holding a
                  // 'static' reference to it?? Oh well...
                  staticMailServer.sendMessage(email);
                  
                  // success
                  messagesToDeliver.removeElement(email);
               }
               catch (MailException me) {
                  if (email.getDeliveryAttempts() > maxAttempts) {
                     messagesToDeliver.removeElement(email);
                     Log.write("Unable to deliver message to "+
                               email+" removeing from queue.");
                     Log.write(me);
                  }
                  else {
                     Log.write("Unable to deliver message on "+
                               "attempt # "+
                               email.getDeliveryAttempts()+
                               ", re-queueing. ");
                     Log.write(me);
                  }
               }
            }
            
            // sleep
            try {
               // log.writeDebug ("Sleeping for "+sleepInterval);
               sleep(sleepInterval);
            }
            catch (InterruptedException ex) {
               Log.write("Interruped, back to work.");
            }
         }
         
      } // end while true
   }

   
   /**
    *
    */
   private class DeliveryStatus 
   {
      EMailMessage email=null;
      Hashtable addressesNotSuccessfullySent=new Hashtable();
      Hashtable addressesSuccessfullySent=new Hashtable();

      public DeliveryStatus(EMailMessage em)
      {
         email=em;

         // build address table.
         Vector recipients=email.getAllRecipients();
         
      }      
   }
}

