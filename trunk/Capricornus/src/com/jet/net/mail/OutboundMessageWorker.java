package com.jet.net.mail;

import java.util.*;

/**
 * This is a thin wrapper around SMTP mail server.  It puts the work of 
 * sending an email into a background thread for the DeliveryServer, and
 * possibly other implementations. 
 *
 * @author Paul Bemowski
 */
public class OutboundMessageWorker extends Thread
{
   private SMTPMailServer mailServer=null;
   
   private EMailMessage message=null;

   private static int threadNum=0;

   /**
    *
    */
   public OutboundMessageWorker(SMTPMailServer ms)
   {
      mailServer=ms;
      setName("OutboundMessageWorker-"+threadNum++);
   }

   /**
    * Sends a message in a background thread.  Eventually, we will
    * need to setup a monitoring interface and GUI.
    */
   public synchronized void sendMessage(EMailMessage email)
      throws MailException 
   {
      if (this.isAlive())
      {
         // Already started!!
         throw new MailException ("This MessageWorker is already running, "+
                                  "build another one.");
      }
      else
      {
         message=email;
         start();
      }
   }

   /**
    *
    */
   public void run() {
      try {
         mailServer.sendMessage(message);
      }
      catch (Exception ex) {
         // log.printStackTrace(ex);
         ex.printStackTrace();
         return;
      }
      // log.writeDebug ("Message Delivered.");
   }
}
