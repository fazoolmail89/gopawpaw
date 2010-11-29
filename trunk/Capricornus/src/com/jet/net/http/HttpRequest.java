package com.jet.net.http;

import java.io.*;
import java.util.*;
import java.net.*;

import com.jet.net.utils.Log;


/*
 * $Log: HttpRequest.java,v $
 * Revision 1.5  2003/11/15 16:35:46  bemocvs
 * pre 3.2.2 db release.
 *
 * Revision 1.4  2003/07/24 18:21:27  bemocvs
 * Working, surrounding chunked input stream, bugs in parser
 *
 * Revision 1.3  2003/03/08 22:34:44  bemocvs
 * Added user agent
 *
 * Revision 1.2  2003/03/05 02:38:01  bemocvs
 * Changed default protocol to http/1.1
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/10/21 21:09:36  bemocvs
 * POST support
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * Represents an HTTP Request from the client's perspective.  This 
 * object is able to serialize itself on a stream to make a request 
 * to and HTTP server. <p>
 *
 * This object currently only supports HTTP GET method.  Upgrades to this
 * object in the future may allow for POST and other request types.
 * 
 * @author Paul Bemowski
 */
public class HttpRequest extends Request
{
   /** */
   public static final int EOF=-1;

   /** Parameter setMethod. */
   public static final String GET="GET";
   
   /** Parameter setMethod. */
   public static final String POST="POST";

   /** */
   private static final String CRLF="\r\n";

   private String method=GET; // default method.
   private String protocol="HTTP/1.1"; // default protocol
   private String file=null;
   private String host=null;
   private int port=80;
   
   private Hashtable cookies=new Hashtable();

   private Hashtable parameters=new Hashtable();

   /** Constructs a request to the specified host for the requested file. 
    * The Host header variable is automatically set for HTTP/1.1 virtual
    * hosts. 
    * @param host The host on which the HTTP server is running.  This should
    * be a valid HTTP/1.1 host name which may or may not return the same
    * data as it's equivalent IP address.
    * @param requestedFile The resource requeste on this server.  */
   public HttpRequest(String host, String requestedFile) {
      this(host, 80, requestedFile);
   }

   /** Constructs a request with a port other than 80. */
   public HttpRequest(String host, int port, String requestedFile) {
      this.host=host;
      this.file=requestedFile;
      this.port=port;

      if (file == null ||
          file.length() == 0)
         file="/";
      // this is required for virtual servers, very commonly used.
      // technically this is a HTTP/1.1 thing, but it works with 1.0 also.
      if (port == 80)
         headers.put("Host", host); 
      else
         headers.put("Host", host+":"+port);          

      // this will be our default header, a user an override if they like.
      headers.put("User-Agent", "Mozilla/4.0 (JET-NET Http Package, http://www.jetools.com/products/jetnet)");

      headers.put("Accept", "*/*");
   }

   /** Constructs and HttpRequest from an input Stream, including 
    * post data if available. */
   public HttpRequest(InputStream is) 
      throws IOException {
      fromStream(is);
   }

   /** */
   public URL getURL() 
      throws MalformedURLException {
      return new URL("http", host, port, file);
   }

   /** Adds a cookie to this request's cookie table. */
   public void addCookie(Cookie cookie) {
      cookies.put(cookie.getName(), cookie);
   }

   /** Adds a cookie as a name/value pair to this request. */
   public void addCookie(String name, String val) {
      cookies.put(name, new Cookie(name, val));
   }

   /** Sets the entire cookie table. */
   public void setCookies(Hashtable c) {
      if (c != null)
         cookies=c;
      else
         cookies=new Hashtable();
   }

   /** Sends this request to a stream.  This will include the initial 
    * request line (method file protocol, as is GET /index.html HTTP/1.0), as
    * well as all of the request headers. 
    * 
    * @param os The stream on which to dump this request object. */
   public void toStream(OutputStream os) 
      throws IOException {
      os.write((method+" "+file+" "+protocol+CRLF).getBytes());

      if (false) {
         os.flush();
         return;
      }
      
      // os.write(("Host: "+host+CRLF).getBytes());

      if (cookies.size() > 0) {
         Enumeration cookieNames=cookies.keys();
         while (cookieNames.hasMoreElements()) {
            String cname=(String)cookieNames.nextElement();
            Cookie cookie=(Cookie)cookies.get(cname);
            os.write(("Cookie: "+cookie.getName()+"="
                      +cookie.getValue()+CRLF).getBytes());
         }
      }

      Enumeration hkeys=headers.keys();
      while(hkeys.hasMoreElements()) {
         String hkey=(String)hkeys.nextElement();
         String hval=(String)headers.get(hkey);
         os.write((hkey+": "+hval+CRLF).getBytes());
      }

      if (method.equals(POST)) {
         String post=getPostString();
         os.write(("Content-Length: "+post.length()+CRLF).getBytes());
         os.write(("Content-type: application/x-www-form-urlencoded").getBytes());
         os.write((CRLF+CRLF).getBytes());
         os.write(post.getBytes());
         // os.write("\n".getBytes()); // not necessary??
      }
      
      os.write(CRLF.getBytes());
      os.flush();
   }


   /** Populates all internal data structures from the request stream. */
   public void fromStream(InputStream is) 
      throws IOException {
      // read headers, hold stream

      String line=readLine(is); // this is the primary response code
      if (HttpConnection.debug) 
         Log.write("RequestLine: '"+line+"'");

      StringTokenizer st=new StringTokenizer(line, " ", false);
      method=st.nextToken();
      file=st.nextToken();
      protocol=st.nextToken();

      line=readLine(is);
      while (line != null &&
             line.trim().length() > 0) {
         if (HttpConnection.debug)
            Log.write("HeaderLine: '"+line+"'");
         // when line.trim().length() == 0, the method should check for 
         // redirects, and then fall thru
         int colonindex=line.indexOf(":");
         if (colonindex != -1) {
            String key=line.substring(0, colonindex);
            String val=line.substring(colonindex+1).trim();
            
            if (key.equalsIgnoreCase("cookie")) {
               int eqindex=val.indexOf("=");
               int scindex=val.indexOf(";");
               if (eqindex != -1) {
                  String cname=val.substring(0, eqindex);
                  String cval=null;
                  cval=val.substring(eqindex+1, scindex);

                  Cookie cookie=new Cookie(cname, cval);
                  if (cookies == null)
                     cookies=new Hashtable();
                  cookies.put(cname, cookie);
               }
               else {
                  System.out.println ("malformed cookie:"+val);
               }
            }
            else { // non-cookie header
               headers.put(key.toLowerCase(), val);
            }
         }
         line=readLine(is);
      }
   }

   /** */
   String readLine(InputStream is) 
      throws IOException{
      StringBuffer sb=new StringBuffer();
      int i=is.read();
      char c=(char)i;
      while (c != '\n' && i != EOF) {
         sb.append(c);

         i=is.read();
         c=(char)i;
      }
      String s=sb.toString();
      if (s.endsWith("\r"))
         return s.substring(0, s.length()-1);
      else
         return s;
   }

   /** Forms the POST string. */
   private final String getPostString() {
      Enumeration parms=parameters.keys();
      StringBuffer sb=new StringBuffer();
      while (parms.hasMoreElements()) {
         String key=(String)parms.nextElement();
         String value=(String)parameters.get(key);
         sb.append(key+"="+value); // already encoded
         if (parms.hasMoreElements())
            sb.append("&");
      }
      return sb.toString();
   }

   /** Sets the method to either GET or POST.  
    * @param method Either GET or POST.  Defaults to GET.
    */
   public void setMethod(String method) {
      this.method=method;
   }
   
   /** Adds a parameter, already URL encoded. 
    * @param key The name of the parameter. 
    * @param value The already-URL-encoded value string. 
    **/
   public void addEncodedParameter(String key, String value) {
      parameters.put(key, value);
   }

   /** Encodes a parameter, then adds it. 
    * @param key The name of the parameter. 
    * @param value The parameter, which will be URL encoded before addition. 
    **/
   public void addParameter(String key, String value) {
      parameters.put(key, URLEncoder.encode(value));
   }

   /** Small, simple testing method. */
   public static void main(String args[]) throws Exception
   {
      HttpRequest req=new HttpRequest("localhost", "/download");
      req.setHeader("user-agent", "BemoSlurp");
      req.addCookie("JSESSIONID", "gDpMhlE8EOuntuoWUYv");
      req.toStream(System.out);
   }
}
