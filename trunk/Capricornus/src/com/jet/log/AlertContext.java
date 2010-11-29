package com.jet.log;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Date;

import com.jet.utils.TimeUtil;

/**
 * The alert context is sent with every alert.  It includes machine
 * information, memory status, runtime user, OS, and VM information. 
 * It will give the alert recipient some context regarding the 
 * error that has occcured.
 *
 * @author Paul Bemowski 
 */
class AlertContext
{
   private static boolean initialized=false;

   private static String systemContext=null;

   /** */
   static final synchronized void initialize() {
      StringBuffer sb=new StringBuffer();
      // Get Hostname
      String hostname=null;
      String ip=null;
      try {
         InetAddress localhost=InetAddress.getLocalHost();
         ip=localhost.getHostAddress();
         hostname=localhost.getHostName();
      } catch (UnknownHostException ex) {
         if (ip == null)
            ip="Error: "+ex.toString();
         if (hostname == null)
            hostname="Error: "+ex.toString();
      }

      sb.append("Host: "+hostname+"/"+ip+"\n\n");
      sb.append("VM: "+System.getProperty("java.vm.vendor")+" "+
                System.getProperty("java.vm.version")+"\n");
      sb.append("OS: "+System.getProperty("os.name")+" "+
                System.getProperty("os.version")+"\n");
      sb.append("User: '"+System.getProperty("user.name")+"'\n");

      systemContext=sb.toString();


      // this has to be a system property because with Resin
      // things can get re-loaded, but the System properties survive
      // the classloader cleanup.
      System.setProperty("jet.log.starttime", ""+System.currentTimeMillis());

      initialized=true;
   }

   /** */
   static final String getAlertContext() {
      if (!initialized)
         initialize();
      Runtime runtime=Runtime.getRuntime();
      SimpleDateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");
      DecimalFormat decFormat=new DecimalFormat("###,###,###,###");


      StringBuffer sb=new StringBuffer();    
      sb.append("Alert Time: "+df.format(new Date())+"\n");
      sb.append("Server Uptime: "+uptime()+"\n");
      sb.append("Total Memory: "+
                decFormat.format(runtime.totalMemory())+
                " Free Memory: "+
                decFormat.format(runtime.freeMemory())+"\n");
      sb.append("\n");
      sb.append(systemContext);
      return sb.toString();
   }

   private static final String uptime(){
      String start=System.getProperty("jet.log.starttime");
      long starttime=Long.parseLong(start);
      long endtime=System.currentTimeMillis();

      return TimeUtil.formatElapsedTime(endtime-starttime);
   }
}
