package com.jet.utils.loader.nestedjar;

import java.net.*;
import java.io.*;

import com.jet.utils.loader.*;

/** 
 * Custom URLStreamHandler.  
 * 
 * This is very useful: 
 * http://java.sun.com/developer/onlineTraining/protocolhandlers/
 * 
 * @author Paul Bemowski
 **/
public class NestedJarURLConnection extends URLConnection {

   NestedJarClassLoader njcl=null;
   
   URL url=null;

   /** */
   public NestedJarURLConnection(NestedJarClassLoader cl, URL u) {
      super(u);
      njcl=cl;
      url=u;
   }

   /** */
   public void connect() {
      // do nothing.
   }

   /** */
   public InputStream getInputStream() 
      throws IOException {
      //System.out.println ("Getting input stream for "+url);
      //System.out.println ("File: "+url.getFile());
      String file=url.getFile(); // this starts with a leading /
      file=file.substring(1);


      byte data[]=njcl.findResourceData(file);
      
      if (data == null)
         throw new IOException("NestedJarClassLoader cannot find resource "+
                               "data for '"+file+"'");

      return new ByteArrayInputStream(data);
   }
}