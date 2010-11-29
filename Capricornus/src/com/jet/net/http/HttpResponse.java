package com.jet.net.http;

import java.io.*;
import java.net.*;
import java.util.*;

import com.jet.net.utils.Log;

/*
 * $Log: HttpResponse.java,v $
 * Revision 1.4  2004/02/17 16:41:35  bemocvs
 * Added and enabled Chunked stream from apache.
 *
 * Revision 1.3  2003/11/15 16:35:46  bemocvs
 * pre 3.2.2 db release.
 *
 * Revision 1.2  2003/07/24 18:21:27  bemocvs
 * Working, surrounding chunked input stream, bugs in parser
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * Represents and HTTP Response from a client's perspective.  This includs
 * the response code, and all of the HTTP headers returned by the server.
 *
 * @author Paul Bemowski
 */
public class HttpResponse extends Response { 
   /** */
   private static final String CRLF="\r\n";

   private String protocol=null;
   private String code=null;
   private String message=null;

   private InputStream stream=null;

   private Hashtable cookies=null;

   /** EOF character */
   private static final int EOF=-1;
   
   /** Creates and HttpResponse from the inbound stream. */
   public HttpResponse(InputStream is) 
      throws IOException {
      fromStream(is);
      stream=is;
   }

   /** Populates all internal data structures from the response stream. */
   private void fromStream(InputStream is) 
      throws IOException {
      // read headers, hold stream

      String line=readLine(is); // this is the primary response code
      StringTokenizer st=new StringTokenizer(line, " ", false);
      protocol=st.nextToken();
      code=st.nextToken();
      if (st.hasMoreTokens())
         message=st.nextToken();
      else
         message="NO MESSAGE SENT";

      if (HttpConnection.debug) 
         Log.write("ResponseLine: '"+line+"'");

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
            
            if (key.equalsIgnoreCase("set-cookie")) {
               int eqindex=val.indexOf("=");
               int scindex=val.indexOf(";");
               if (eqindex != -1) {
                  String cname=val.substring(0, eqindex);
                  String cval=null;
                  if (scindex != -1) {
                     cval=val.substring(eqindex+1, scindex);
                  } else {
                     cval=val.substring(eqindex+1);
                  }
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
   
   public void toStream(OutputStream os) 
      throws IOException {
      os.write((protocol+" "+code+" "+message+CRLF).getBytes());
      // now cookies
      if (cookies != null && 
          cookies.size() > 0) {
         Enumeration cookieNames=cookies.keys();
         while (cookieNames.hasMoreElements()) {
            String cname=(String)cookieNames.nextElement();
            Cookie cookie=(Cookie)cookies.get(cname);
            os.write(("Set-Cookie: "+cookie.getName()+"="
                      +cookie.getValue()+CRLF).getBytes());
         }
      }
      Enumeration hkeys=headers.keys();
      while(hkeys.hasMoreElements()) {
         String hkey=(String)hkeys.nextElement();
         String hval=(String)headers.get(hkey);
         os.write((hkey+": "+hval+CRLF).getBytes());
      }

      os.write(CRLF.getBytes());
   }
   
   
   /** */
   static String readLine(InputStream is) 
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
   
   /** Returns the internal data stream, positioned after the 
    * headers. */
   public InputStream getInputStream() 
      throws IOException {
      // Fix up the stream for Chunks if necessary
      String transferEncoding=(String)headers.get("transfer-encoding");
      if (transferEncoding != null &&
          transferEncoding.equalsIgnoreCase("chunked")) {
         if (HttpConnection.debug)
            Log.write("Creating Chunked Input Stream");
         return new ApacheChunkedInputStream(stream);
      }

      return stream;
   }   

   /** Closes the underlying stream. */
   public void close() 
      throws IOException{
      if (stream != null)
         stream.close();
   }


   /** Simple String representation of this response. */
   public String toString() {
      return protocol+" "+code+" "+message+"\n"+headers;
   }

   /** Returns a hashtable of all Cookie objects associated with 
    * this response. */
   public Hashtable getCookies() {return cookies;}

   /** Returns the HTTP response code as a string.  */
   public String getCode() {return code;}
   
   /** Returns the requested header if available, otherwise null.  */
   public String getHeader(String key) {
      return (String)headers.get(key.toLowerCase());
   }
}


