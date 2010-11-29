package com.jet.utils.rmi;


import java.util.*;
import java.io.*;
import java.net.*;

import com.jet.utils.*;


public class Scanner
{
   private static Properties services=null;

   private static Vector commonPorts=new Vector();

   static {
      commonPorts.addElement(new Integer(11));
      commonPorts.addElement(new Integer(13));
      commonPorts.addElement(new Integer(15));
      commonPorts.addElement(new Integer(17));
      commonPorts.addElement(new Integer(18));
      commonPorts.addElement(new Integer(21));
      commonPorts.addElement(new Integer(22));
      commonPorts.addElement(new Integer(23));
      commonPorts.addElement(new Integer(25));
      commonPorts.addElement(new Integer(37));
      commonPorts.addElement(new Integer(42));
      commonPorts.addElement(new Integer(43));
      commonPorts.addElement(new Integer(70));
      commonPorts.addElement(new Integer(79));
      commonPorts.addElement(new Integer(80));
      commonPorts.addElement(new Integer(109));
      commonPorts.addElement(new Integer(119));
      commonPorts.addElement(new Integer(110));
      commonPorts.addElement(new Integer(389));
      commonPorts.addElement(new Integer(443));
      commonPorts.addElement(new Integer(1099));
      commonPorts.addElement(new Integer(52372));

      // load services from file.
      try {
         services=new Properties();
         FileInputStream fis=null;
         try {
            fis=new FileInputStream(new File("services.properties"));
            services.load(fis);
         } finally {
            if (fis != null)
               fis.close();
         }
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }



   public static void main(String args[])
   {
      try {
         ArgParser ap=new ArgParser(args);
         String host=null;

         host=ap.getStringArg("-h");

         String ports=ap.getStringArg("-ports");
         ScanResults sr=null;
         if (ports == null)
            sr=scan(host, commonPorts);
         else
            sr=scan(host, strToVector(ports));
         
         //System.out.println (sr);
      }
      catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   static Vector strToVector(String ports)
   {
      Vector v=new Vector();
      StringTokenizer st=new StringTokenizer(ports, ",", false);
      while (st.hasMoreTokens()){
         v.addElement(new Integer(Integer.parseInt((String)st.nextToken())));
      }
      return v;
   }

   /**
    *
    */
   public static ScanResults scan(String host, Vector ports)
      throws UnknownHostException 
   {
      System.out.println ("Looking up "+host);
      InetAddress iad=InetAddress.getByName(host);
      System.out.println ("Host: "+iad);

      ScanResults sr=new ScanResults(host);
      int size=ports.size();
      
      for (int i=0; i<size; i++) {
         Object o=ports.elementAt(i);

         if (o instanceof Integer)
         {
            int port=((Integer)o).intValue();
            PortInfo pi=scanPort(iad, port);
            sr.addPortInfo(pi);
         }
         else if (o instanceof Range)
         {
            Range r=(Range)o;
            for (int j=r.getLow(); j<=r.getHigh(); j++)
            {
               PortInfo pi=scanPort(iad, j);
               sr.addPortInfo(pi);
            }
         }
      }
      
      return sr;
   }

   /**
    *
    */
   public static ScanResults scan(String host, Range r)
      throws UnknownHostException 
   {
      Vector v=new Vector();
      v.addElement(r);
      return scan(host, v);
   }

   
   /**
    *
    */
   public static PortInfo scanPort(InetAddress iad, int port)
   {
      System.out.println ("Scanning "+iad.getHostName()+":"+port);
      boolean b=false;
      String res=null;
      try {
         Socket s=new Socket(iad, port);
         b=true;
         try {
            res=readResponse(s, 1500);
         }
         catch (Exception ex) {
            res="no response";
         }
      
      }
      catch (Exception ex) {
         //ex.printStackTrace();
         b=false;
      }
      PortInfo pi=new PortInfo(port, b);
      if (b)
         pi.setResponse(res);

      System.out.println (pi.toString());

      return pi;
   }

   /**
    *
    */
   public static String readResponse(Socket s, int timeout) 
      throws IOException {
      s.setSoTimeout(timeout);
      BufferedReader br=null;
      PrintWriter pw=null;
      String res=null;
      try {
         br=new BufferedReader(new InputStreamReader(s.getInputStream()));
         pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
         try {
            res=br.readLine();
         } catch (Exception ex) {
            res="ping";
         }
         
         if (res.equals("ping"))
         {
            pw.println();
            res=br.readLine();
            res="ping: "+res;
         }
      }
      finally {
         br.close();
         pw.close();
      }
      return res;
   }


   /**
    *
    */
   public static class Range
   {
      int lo;
      int hi;
      
      public Range(int l, int h)
      {
         lo=l;
         hi=h;
      }

      public int getLow() {return lo;}
      public int getHigh() {return hi;}
   }

   
   /**
    *
    */
   public static class ScanResults
   {
      String host=null;
      Vector portInfo=new Vector();
      
      public ScanResults(String s)
      {
         host=s;
      }

      public void addPortInfo(PortInfo pi)
      {
         portInfo.addElement(pi);
      }
      
      public String toString()
      {
         StringBuffer sb=new StringBuffer();
         sb.append(">>>>>>>>>>>>>>>   "+host+"  <<<<<<<<<<<<<<<<\n");
         int size=portInfo.size();
         for (int i=0; i<size; i++) {
            PortInfo pi=(PortInfo)portInfo.elementAt(i);
            sb.append(pi.toString()+"\n");
         }
         sb.append("<<<<<<<<<<<<<<<   "+host+"  >>>>>>>>>>>>>>>>\n\n");
         return sb.toString();
      }
   }

   /**
    *
    */
   public static class PortInfo
   {
      int port;
      boolean listening;
      String desc;
      String response;

      public PortInfo(int p, boolean b, String s)
      {
         port=p;
         listening=b;
         desc=s;

         if (desc == null)
            desc=(String)services.getProperty(""+p);
      }

      public PortInfo(int p, boolean b) {this(p, b, null);}
      
      public void setResponse(String s) {response=s;}

      public boolean isOpen() {return listening;}

      public String toString()
      {
         return ""+port+": "+desc+": "+
         (listening?"is open: "+response:"is closed");
      }
   }
}
