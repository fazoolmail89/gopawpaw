package com.jet.net.utils;


/**
 * Superclass for all jet.net.* protocol exceptions. 
 */
public class ProtocolException extends NestedException
{
   public ProtocolException() {super();}

   public ProtocolException(String msg) {
      super(msg);
   }

   public ProtocolException(String msg, Throwable t) {
      super(msg, t);
   }
}
