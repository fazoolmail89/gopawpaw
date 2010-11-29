package com.jet.net.mail;


import com.jet.net.utils.ProtocolException;

/**
 * Exception thrown from the mail subsystem.
 *
 * @author Paul Bemowski
 */
public class MailException extends ProtocolException
{
   protected MailServerResponse msr=null;

   /** */
   public MailException () {super();}
  
   /** */
   public MailException (String msg) {super(msg);}

   /** */
   public MailException (String msg, Throwable t) {super (msg, t);}

   /** */
   public MailException (String msg, MailServerResponse m) {
      super(msg);
      msr=m;
   }

   /** */
   public MailServerResponse getMailServerResponse() {return msr;}
   
   /** */
   public void setMailServerResponse(MailServerResponse m) {msr=m;}
}







