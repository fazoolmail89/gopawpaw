package com.jet.net.http;

import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;

import com.jet.net.utils.Log;

/*
 * $Log: HttpConnection.java,v $
 * Revision 1.6  2004/02/17 16:41:35  bemocvs
 * Added and enabled Chunked stream from apache.
 *
 * Revision 1.5  2004/01/24 16:26:38  bemocvs
 * *** empty log message ***
 *
 * Revision 1.4  2003/07/24 18:21:27  bemocvs
 * Working, surrounding chunked input stream, bugs in parser
 *
 * Revision 1.3  2003/07/09 18:31:49  bemocvs
 * working on indexer
 *
 * Revision 1.2  2003/01/15 01:30:35  bemocvs
 * incremental checking from redsite.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.5  2002/10/21 21:09:06  bemocvs
 * added constructor taking request, POST support
 *
 * Revision 1.4  2002/04/08 15:40:23  bemocvs
 * removed some logging.
 *
 * Revision 1.3  2002/03/08 18:52:14  bemocvs
 * removed verbose debugging.
 *
 * Revision 1.2  2001/05/27 18:45:39  bemocvs
 * javadoc updates
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * Represents a single connection to an HttpServer.  The connection 
 * is valid for a single Request/Response pair, however the connection
 * may be re-directed. <p>
 *
 * This connection
 * could be redirected under the same object reference.  The behavior of 
 * redirection is defined by the redirectPolicy variable.  <p>
 *
 * The connection represents a single request response pair, so it should
 * only be accessed by a single thread at any given time.  This connection
 * is stateful, and generally NOT thread safe.
 *
 * @author Paul Bemowski
 */
public class HttpConnection 
{
   private static final DateFormat df=
   new SimpleDateFormat("EEE, DD MMM yyyy HH:mm");

   /** HTTP Redirect responses will not be followed under any circumstances. */
   public static final int NO_REDIRECTION=0;

   /** HTTP Redirect responses will be followed only if they are redirecting
    * to the same host as the originating request.  Remote redirects will
    * not be followed. */
   public static final int LOCAL_REDIRECTION_ONLY=1;
   
   /** All HTTP redirects are followed, local or remote. */
   public static final int ALL_REDIRECTION=2;

   /** Sets the default redirection policy.  Default is 
    * LOCAL_REDIRECTION_ONLY.  If you reset this value, all subsequent
    * HttpConnections will be given this default policy. */
   public static int defaultRedirectPolicy=LOCAL_REDIRECTION_ONLY;

   private int socketTimeout=60000; // 1 min

   private URL url=null;

   // default, but can be overridden per inst.
   private int redirectPolicy=defaultRedirectPolicy; 

   private HttpRequest request=null; // 
   private HttpResponse response=null;

   private Socket socket=null;

   private HttpSession session=null; // may be null;

   /** Enables or disables verbose debugging.  Default is false. */
   public static boolean debug=false;

   /** Constructs a connection to the input URL. 
    * @param u The url for connecion.  Must be fully qualified. */
   public HttpConnection(URL u) {
      url=u;
      request=new HttpRequest(url.getHost(), url.getFile());
   }

   /** Constructs a connection from a request. 
    * @param request An HttpRequest object already formed. This is
    * usefult for POSTing. */
   public HttpConnection(HttpRequest request)
      throws MalformedURLException {
      url=request.getURL();
      this.request=request;
   }
   
   /** Constructs a connection to the input URL String.
    * @param u A string representing a URL. */
   public HttpConnection(String u) 
      throws MalformedURLException {
      this (new URL(u));
   }

   /** Constructs a connection with the url http://host:80/file where
    * host and file are input parameters.
    * @param host The IP address or DNS host name of the http server. */
   public HttpConnection(String host, int port, String file) 
      throws MalformedURLException {
      this(new URL("http", host, port, file));
   }

   /** Sets the socket timeout to the sepecified value in milliseconds.
    * this value defaults to 1 minute (60000). 0 is interpreted as an 
    * infinite timeout. 
    * @param timeout Socket timeout in milliseconds. */
   public void setSocketTimeout(int timeout) {
      socketTimeout=timeout;
   }

   /** Sets the conneciton's redirection policy.  For more info on the
    * available redirection policies, see the public static final variables
    * on this class. 
    * @param policy The redirect policy -- NO_REDIRECTION, 
    * LOCAL_REDIRECTION_ONLY, or ALL_REDIRECTION. */
   public void setRedirectPolicy(int policy) {
      if (policy < NO_REDIRECTION ||
          policy > ALL_REDIRECTION)
         throw new RuntimeException("Invalid redirection policy specified.");
      redirectPolicy=policy; 
   }

   /** Returns the URL of the current connection. */
   public URL getURL() {
      return url;
   }

   /** Sets the USER-AGENT http header to a specified value. */
   public void setUserAgent(String ua) {
      setHeader("User-Agent", ua);
   }
   
   /** Sets a generic HTTP header value. */
   public void setHeader(String key, String val) {
      request.setHeader(key, val);
   }

   /** Sets the entire HTTP header table. */
   public void setHeaders(Hashtable h) {
      request.setHeaders(h);
   }

   /** Sets all of the specified cookies upon the current connection. */
   public void setCookies(Hashtable cookies) {
      request.setCookies(cookies);
   }

   /** Sets the current HttpSession.  This is useful for setting persistent 
    * cookies -- useful for maintaining state on some servers. */
   public void setSession(HttpSession ses) {
      session=ses;
   }

   /** Sets the CONTENT-TYPE HTTP header. */
   public String getContentType() {
      return response.getHeader("content-type");
   }
   
   /** Returns the content length reported by the HTTP server.  If content
    * length is not returned in one of the HTTP headers, this method will
    * return -1. */
   public int getContentLength() {
      String sl=response.getHeader("content-length");
      if (sl == null)
         return -1;

      int l=-1;
      try {l=Integer.parseInt(sl);}
      catch (Exception ex) {}
      return l;
   }

   /** Returns the HTTP response code returned by the server.  A
    * code of 302 may cause the connection to open a new connecion to
    * the specified redirected URL. */
   public String getResponseCode() {
      return response.getCode();
   }

   /** Returns the HTTP response object, encapsulating the the servers's 
    * response to your request.  See the HttpResponse javadoc for further
    * details. */
   public HttpResponse getResponse() {
      return response;
   }

   /** Returns a Date object indicating what the server indicates is
    * the last modified date of the page.  If this data is unavailable, this
    * method will return null. */
   public Date getLastMod() 
      throws HttpException {
      String slm=response.getHeader("last-modified");
      // log.writeDebug("last-mod: "+slm);

      if (slm == null)
         return null;

      Date d=null;

      try {d=df.parse(slm);}
      catch (Exception ex) {
         throw new HttpException("Unable to parse date.", ex);
      }
      return d;
   }

   /** Opens the connection to the HTTP server, sends the HttpRequest object
    * to the server, and constructs the HttpResponse from the resulting
    * request. */
   public void openConnection()
      throws IOException {
      int port=url.getPort();
      if (port == -1)
         port=80;

      Log.write("HttpConnection opening "+url.getHost()+":"+port+
                url.getFile());

      socket=new Socket(url.getHost(), port);
      socket.setSoTimeout(socketTimeout);
      
      OutputStream os=socket.getOutputStream();
      if (debug) 
         Log.write("Sending:");
      
      if (debug)
         request.toStream(Log.getLogStream());
      request.toStream(os);
      // os.write("\r\n".getBytes());

      response=new HttpResponse(socket.getInputStream());

      // set cookies
      if (response.getCookies() != null &&
          session != null) {
         session.addCookies(response.getCookies());
      }
   }

   /** Returns an input stream that contains the content of the response 
    * (not the headers or cookies, they are encapsulated in the HttpResponse
    * object).  If openConnection has not been called, this method implicitly
    * calls it. 
    * 
    * @return Returns an InputStream sitting on the socket immeidatly after
    * the headers have been fully read into the HttpResponse object. */
   public InputStream getInputStream() 
      throws IOException, HttpException {
      if (socket == null)
         openConnection();

      if (response.getCode().equals("302")) {
         // 302 is redirect
         // check locality, and redirectPolicy
         String location=response.getHeader("location");

         if (debug) {
            Log.write("Redirect: "+location);
            Log.write("  Current Policy: "+policyString(redirectPolicy));
         }
         
         switch (redirectPolicy) {
            case (NO_REDIRECTION): 
               break;
            case (LOCAL_REDIRECTION_ONLY) :
               if (session == null) {
                  HttpConnection con=new HttpConnection(url.getHost(), 
                                                        url.getPort(),
                                                        location);
                  con.setHeaders(request.getHeaders());
                  return con.getInputStream();
               }
               else {
                  HttpConnection con=session.getConnection(location);
                  con.setHeaders(request.getHeaders());
                  return con.getInputStream();
               }
            case (ALL_REDIRECTION): 
               break;
            default: 
               throw new HttpException("Invalid redirection policy.");
         }
      }

      if (debug)
         Log.write(response.toString());
      return response.getInputStream();
   }

   /** */
   public void close() 
      throws IOException {
      if (response != null) {
         //try {
         //   InputStream is=response.getInputStream();
         //   if (is != null)
         //      is.close();
         //} catch (Exception ex) {}
         
         response.close();
      }
      if (socket != null) {
         socket.close();
      }
   }

   /** */
   private static final String policyString(int i) {
      switch (i) {
         case NO_REDIRECTION:
            return "NO_REDIRECTION";
         case LOCAL_REDIRECTION_ONLY: 
            return "LOCAL_REDIRECTION_ONLY";
         case ALL_REDIRECTION:
            return "ALL_REDIRECTION";
         default: 
            return "UNKNOWN_REDIRECTION_POLICY_ERROR";
      }
   }
}






