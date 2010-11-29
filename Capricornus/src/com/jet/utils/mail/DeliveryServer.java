package com.jet.utils.mail;


import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;

import com.jet.log.*;

/**
 * An implementation of the MailServer interface wrapped around
 * SMTP. <p>
 *
 * Attachments to e-mails are included as multi-part MIME attachments.
 * They are encoded in base64 (most standard encoding on the 'net) and
 * the mime-type is set to application/octet-stream.
 *
 * <b>WARNING:</b> This class uses a base64 encoder that is encoded in the
 * sun.misc.* package which is included ONLY in the SUN VM's.
 *
 * @author Paul Bemowski
 */
public class DeliveryServer implements MailServer, Logger
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
    *
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
    *
    */
   public static void setMailServer(String s, int p)
   {
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
                     log.writeError(1, "Unable to deliver message to "+
                                    email, me);
                     log.writeError(1, "Removing from queue.");
                  }
                  else
                     log.writeError(2, "Unable to deliver message on "+
                                    "attempt # "+
                                    email.getDeliveryAttempts()+
                                    ", re-queueing.", me);
               }
            }
            
            // sleep
            try {
               // log.writeDebug ("Sleeping for "+sleepInterval);
               sleep(sleepInterval);
            }
            catch (InterruptedException ex) {
               log.writeDebug ("Interruped, back to work.");
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
