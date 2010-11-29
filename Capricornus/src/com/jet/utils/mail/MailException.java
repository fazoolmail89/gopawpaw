package com.jet.utils.mail;


import com.jet.utils.exception.*;

/**
 * Exception thrown my and piece of the mail system.
 *
 * @author Paul Bemowski
 * @see com.ztel.zutils.NestedException
 */
public class MailException extends NestedException
{
   /**
    */
   public MailException ()
   {
      super();
   }
  
   /**
    */
   public MailException (String msg)
   {
      super(msg);
   }

   /**
    */
   public MailException (String msg, Throwable t)
   {
      super (msg, t);
   }
}







