package com.jet.net.http;

import com.jet.net.utils.ProtocolException;

/**
 * Represents an error in the http protocol.  
 */
public class HttpException extends ProtocolException
{
   public HttpException(String msg) {
      super(msg);
   }

   public HttpException(String msg, Throwable t) {
      super(msg, t);
   }
}
