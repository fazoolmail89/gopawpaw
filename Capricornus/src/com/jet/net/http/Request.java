package com.jet.net.http;

import java.util.Hashtable;
import java.util.Enumeration;

/**
 * The Request object represents an internet request object, in a 
 * request/response protocol situation.
 *
 */
public class Request {
   protected Hashtable headers=new Hashtable();

   public Request(){}

   public void setHeader(String name, String val) {
      headers.put(name, val);
   }

   public String getHeader(String name) {
      return (String)headers.get(name);
   }

   /** */
   public void setHeaders(Hashtable h) {
      if (h.size() > 0) {
         Enumeration keys=h.keys();
         while (keys.hasMoreElements()) {
            String key=(String)keys.nextElement();
            String val=(String)h.get(key);
            headers.put(key, val);
         }
      }
   }
   
   /** */
   public Hashtable getHeaders() {return headers;}
}
