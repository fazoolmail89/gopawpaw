package com.jet.utils.mail;



/**
 * This is an abstract class that encapsulates the functions of a 
 * mail server.  Subclasses might include SMTPMailServer, IMAPMailServer,
 * POP3MailServer.
 *
 *
 * @author Paul Bemowski
 */
public interface MailServer
{
   /**
    * Send the e-mail message.
    * @param email A fully formed e-mail message.  May have attachments.
    */
   public void sendMessage(EMailMessage email) throws MailException;
}

