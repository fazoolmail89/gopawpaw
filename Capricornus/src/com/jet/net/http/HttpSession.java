package com.jet.net.http;

import java.io.*;
import java.net.*;
import java.util.*;

/*
 * $Log: HttpSession.java,v $
 * Revision 1.2  2003/01/15 01:30:35  bemocvs
 * incremental checking from redsite.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * An HttpSession is generally defined by a set of cookies that are
 * sent back to a particular server.  <p>
 *
 * A Session as defined here is valid only on a complete host, not on a
 * host/rooturl basis as the cookie spec allows for. 
 *
 * @author Paul Bemowski
 */
public class HttpSession 
{
   private String host=null;
   private int port=80;

   private Hashtable cookies=new Hashtable();

   /** Constructs a session with a specific host. */
   public HttpSession(String host) {
      this.host=host.toLowerCase();
      port=80;
   }
   
   /** */
   public HttpSession(URL url) {
      host=url.getHost();
      port=url.getPort();
   }

   /** Creates a new connection with the context of the current session.  
    * If the server has sent us some cookies, using this method will 
    * create a new connection with the necessary cookies to maintian
    * a stateful session with the server. <p>
    *
    * This method requires that all files within the session are requested
    * from the same host. 
    *
    * @param file The requeste file (NOT the full URL) to the file on 
    * the same host as the rest of the files in the current session. 
    * @return An HttpConnection with the necessary cookies already applied. */
   public HttpConnection getConnection(String file) 
      throws MalformedURLException {
      HttpConnection con=new HttpConnection(host, port, file);
      con.setCookies(cookies);
      con.setSession(this);
      return con;
   }

   /** Creates a Session connection as above.  If the host inside of the
    * requested URL does not match the host of this session, a 
    * HttpException will be thrown.  */
   public HttpConnection getConnection(URL url) 
      throws HttpException, MalformedURLException {
      String urlhost=url.getHost();
      if (urlhost != null &&
          !urlhost.toLowerCase().equals(host)) {
         throw new HttpException ("A Session connection to "+urlhost+
                                  " was requested from a session on "+
                                  host);
      }
      return getConnection(url.getFile());
   }

   /** Adds cookies to the current session.  If a server returns a cookie
    * on connection X, then the cookie is sent back to the server on 
    * request Y if: <ol>
    * <li> X is less than Y</li>
    * <li> All connecitons are made withing the context of this HttpSession. </li>
    *</ol>*/
   public void addCookies(Hashtable newcookies) {
      if (newcookies != null &&
          newcookies.size() > 0) {
         Enumeration keys=newcookies.keys();
         while (keys.hasMoreElements()) {
            String key=(String)keys.nextElement();
            Cookie cookie=(Cookie)newcookies.get(key);
            cookies.put(key, cookie);
         }
      }
   }
}

