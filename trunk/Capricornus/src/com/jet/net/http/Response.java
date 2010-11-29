package com.jet.net.http;

import java.util.*;

/**
 *
 */
public abstract class Response
{
   protected Hashtable headers=new Hashtable();

   public Response() {}

   /** */
   public String getHeader(String key) {
      return (String)headers.get(key);
   }

   /** */
   public Hashtable getHeaders() {return headers;}
}
