package com.jet.apps.databrowser.model;

import java.util.*;
import java.net.*;
import java.io.*;

/*
 * $Log: UPA.java,v $
 * Revision 1.2  2003/07/05 14:36:43  bemocvs
 * making UPA less of a security risk for users
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.3  2002/03/16 19:37:12  bemocvs
 * added debug statement to main
 *
 * Revision 1.2  2001/10/15 21:35:26  bemocvs
 * Adding ip, and databrowser version.
 *
 * Revision 1.1  2001/09/03 20:18:04  bemocvs
 * UPA initial checkin for 2.7.3
 *
 */

/**
 * The UPA class is a VM Singleton that follows Usage Patterns.  It will
 * track a series of events within the GUI, and upon VM shutdown send that
 * data to a central server for later analysis.  UPA -> Usage Pattern Analysis.
 *
 * This class will only be 'active' for certain users.  
 */
public class UPA
{
   private static UPA _instance=null;

   private long startTime=System.currentTimeMillis();

   private Hashtable events=new Hashtable();

   private static int eventID=0;

   private String hostname=null;
   private String ip=null;

   private static boolean debug=false;

   private static final String CRLF="\r\n";
   
   /** */
   private UPA() {
      // in the future we may want to spawn a background thread 
      // to do this work.  It would prevent the potential for DNS slowness
      // on system startup.
      try {
         hostname=InetAddress.getLocalHost().getHostName();
         ip=InetAddress.getLocalHost().getHostAddress();
      }
      catch (Exception ex) {
         // nothing for now
      }
   }

   /** */
   public static final UPA getInstance() {
      if (_instance == null) {
         synchronized (UPA.class) {
            if (_instance == null) {
               _instance=new UPA();
            }
         }
      }
      return _instance;
   }

   /** */
   public synchronized void addEvent(String eventTitle) {
      EventTrack et=(EventTrack)events.get(eventTitle);
      if (et==null) {
         et=new EventTrack(eventTitle);
         events.put(eventTitle, et);
      }
      eventID++;
      et.addHit(eventID);
   }

   /**
    * This is the method that will fire the pattern analysis back to the 
    * server upon shutdown.  Total method execution time should be on 
    * the order of 10 seconds MAX.  We should set short timeouts for all
    * DNS lookups, sockets, etc.
    */
   public void sendUP() {
      Socket s=null;
      try {
         String host="www.jetools.com";
         s=new Socket(host, 80);
         s.setSoTimeout(10);
         OutputStream os=s.getOutputStream();
         // OutputStream os=System.out;
         
         byte data[]=etp();

         os.write("POST /upaproc HTTP/1.1".getBytes());
         os.write(CRLF.getBytes());
         os.write(("Host: "+host).getBytes());
         os.write(CRLF.getBytes());
         os.write("User-Agent: UPA".getBytes());
         os.write(CRLF.getBytes());
         os.write("Content-type: application/x-www-form-urlencoded".getBytes());
         os.write(CRLF.getBytes());
         os.write(("Content-length: "+(data.length)).getBytes());
         os.write(CRLF.getBytes());
         os.write(CRLF.getBytes());
         if (debug)
            System.out.println(new String(data));
         os.write(data);
         os.write(CRLF.getBytes());
         os.write(CRLF.getBytes());
         os.flush();


         // s.getInputSteam();
         //if (debug)
         //   pump(s.getInputStream(), System.out);

         os.close();
      }
      catch (Throwable t) {
         if (debug)
            t.printStackTrace();
      }
      finally {
         try {s.close();} catch (Exception ex) {}
      }
   }
   
   /** etp() is events to parm.  It converts all event data to an HTTP
    * post parm string. */
   private byte[] etp() {
      StringBuffer sb=new StringBuffer();

      // first add common data.
      long uptime=System.currentTimeMillis()-startTime;
      //sb.append("host="+encode(hostname)+"&");
      //sb.append("ip="+encode(ip)+"&");
      //sb.append("user="+encode(System.getProperty("user.name"))
      //          +"&");
      sb.append("os="+encode(System.getProperty("os.name"))+"&");
      sb.append("vmversion="+
                encode(System.getProperty("java.vm.version"))+"&");
      sb.append("dbversion="+
                encode(com.jet.apps.databrowser.Main.version)+"&");
      sb.append("uptime="+encode(""+uptime));
      
      for (Enumeration keys=events.keys(); keys.hasMoreElements();) {
         String key=(String)keys.nextElement();
         EventTrack et=(EventTrack)events.get(key);
         sb.append("&"+et.toParm());
      }
      return sb.toString().getBytes();
   }

   private static final String encode(String s) {
      if (s == null)
         return "null";
      else 
         return URLEncoder.encode(s);
   }

   /** 
    */
   static final void pump(InputStream is, OutputStream os) 
      throws IOException {
      BufferedInputStream bis=new BufferedInputStream(is, 8192);
      BufferedOutputStream bos=new BufferedOutputStream(os);

      int in=bis.read();
      while (in != -1) {
         bos.write((byte)in);
         in=bis.read();
      }
      bos.flush();
      bis.close();
      bos.close();
   }   

   /** 
    */
   static final class EventTrack
   {
      String name=null;
      Vector ids=null;

      public EventTrack(String s) {
         name=s;
         ids=new Vector();
      }
         
      public void addHit(int id) {
         ids.addElement(new Integer(id));
      }
      public String toParm() {
         StringBuffer sb=new StringBuffer();
         sb.append(name+"=");
         int size=ids.size();
         for (int i=0; i<size; i++) {
            sb.append(""+ids.elementAt(i));
            if (i < size-1)
               sb.append(",");
         }
         return encode(sb.toString());
      }
   }

   public static void main(String args[]) {
      debug=true;
      UPA.getInstance().addEvent("event1");
      UPA.getInstance().addEvent("event1");
      UPA.getInstance().addEvent("event3");
      UPA.getInstance().addEvent("event2");
      UPA.getInstance().addEvent("event3");
      UPA.getInstance().addEvent("event1");
      
      UPA.getInstance().sendUP();
   }
}

