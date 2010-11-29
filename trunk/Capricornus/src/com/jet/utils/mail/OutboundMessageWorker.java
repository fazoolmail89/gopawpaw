package com.jet.utils.mail;


import java.util.*;

import com.jet.log.*;

/**
 * This is a thin wrapper around SMTP mail server.  It puts the work of 
 * sending an email into the background.
 *
 * @author Paul Bemowski
 */
public class OutboundMessageWorker extends Thread
   implements Logger
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
   public void run()
   {
      try
      {
         mailServer.sendMessage(message);
      }
      catch (Exception ex)
      {
         log.printStackTrace(ex);
         return;
      }
      log.writeDebug ("Message Delivered.");
   }
}
