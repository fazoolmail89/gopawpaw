package com.jet.utils.loader.nestedjar;

import java.net.*;

import com.jet.log.*;

import com.jet.utils.loader.*;

/** 
 * Custom URLStreamHandler.  
 * 
 * This is very useful: 
 * http://java.sun.com/developer/onlineTraining/protocolhandlers/
 * 
 * @author Paul Bemowski
 **/
public class NestedJarURLStreamHandler extends URLStreamHandler 
   implements Logger {
   
   NestedJarClassLoader njcl=null;

   /** */
   public NestedJarURLStreamHandler(NestedJarClassLoader n) {
      njcl=n;
   }

   /** */
   protected URLConnection openConnection(URL url) {
      log.writeDebug(2, "Attmepting to get URLConneciton for "+url);
      
      return new NestedJarURLConnection(njcl, url);
   }
}
