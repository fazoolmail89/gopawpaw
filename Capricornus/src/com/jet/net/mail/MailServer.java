package com.jet.net.mail;

/**
 * This is an abstract class that encapsulates the functions of an outbound 
 * mail server. <p>
 *
 * Implementations include a simple thread-in-line SMTPMailServer and
 * the fire-and-forget DeliveryServer which maintains its own thread
 * controls. 
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

