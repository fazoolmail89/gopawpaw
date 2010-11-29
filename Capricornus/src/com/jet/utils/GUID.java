package com.jet.utils;

import java.net.*;
import java.text.*;
import java.util.*;

/**
 * A GUID is a global unique identifier.  It consists of 4 parts.  
 * <ol>
 *  <li> A unique object identifier, representing this VM within the 
 *       physical machine.  The hashcode of an Object (if not overriden) in
 *       sun VMs is the memory location of that object (the "pointer" in c)
 *       within the machine's memory space.
 *  <li> The unique identifier of the machine -- we'll use IP.</li>
 *  <li> The system time </li>
 *  <li> A "session" counter, unique within this running process. </li>
 * </ol>
 *
 * This, however, is NOT guarnteed to be unique.  Machines these days are
 * fast enough to execute several differet processes between two system
 * clock 'ticks.'  So, if 2 requests are made for a guid too close together, 
 * we'll sleep for 100 ms.  This will guarntee guid uniqueness 
 *
 *
 */
public class GUID
{
   static final DateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");
   
   /** VM ID, converted to hex */
   static String vmid=getVMID();
   /** Machine ID, converted to hex. */
   static String machineid=getMachineID();
   /** Counter epoch time. */
   static String currentEpoch=getEpoch();
   /** Counter. */
   static int currentCounter=0;

   String thisEpoch=null;
   String thisCounter=null;

   /**
    *
    */
   public GUID()
   {
      thisEpoch=currentEpoch;
      String s=null;
      synchronized (GUID.class) {
         currentCounter++;
         if (currentCounter == Integer.MAX_VALUE) {
            currentCounter=0;
            currentEpoch=getEpoch();
         }
         s=Integer.toHexString(currentCounter).toUpperCase();
      }
      
      thisCounter=pad(s, 8, "0");
   }

   
   /** Converts a 4 element byte array to a 32 bit int. */
   public static int toInt(byte bytes[])
   {
      int retVal = 
      ((bytes[0]<<24) & 0xFF000000) |
      ((bytes[1]<<16) & 0x00FF0000) |
      ((bytes[2]<<8)  & 0x0000FF00) |
      (bytes[3]		 & 0x000000FF);

		return retVal;
   }
   
   /** */
   public static byte[] toBytes(int i)
   {
      byte[] retVal = new byte[4];
      
      retVal[0] = (byte) ((i & 0xFF000000) >> 24);
      retVal[1] = (byte) ((i & 0x00FF0000) >> 16);
      retVal[2] = (byte) ((i & 0x0000FF00) >> 8);
      retVal[3] = (byte)  (i & 0x000000FF);
      return retVal;
   }

   /** 
    *
    */
   private static String getMachineID()
   {
      String val=null;
      try {
         // get the machine's ip.
         InetAddress address=InetAddress.getLocalHost();
         System.out.println ("address="+address);
         byte bytes[]=address.getAddress();

         int i=toInt(bytes);
         val=Integer.toHexString(i).toUpperCase();
      }
      catch(Exception ex) 
      {
         ex.printStackTrace();
      }
      return pad(val, 8, "0");
   }

   /**
    *
    */
   private static String getVMID()
   {
      int i=(new Object().hashCode());
      String s=Integer.toHexString(i).toUpperCase();
      return pad(s, 8, "0");
   }

   /** 
    *
    */
   private static String getEpoch()
   {
      long t=System.currentTimeMillis();
      String s=Long.toHexString(t).toUpperCase();
      return pad(s, 16, "0");
   }

   /**
    *
    */
   private static String pad(String in, int chars, String padchar)
   {
      if (true)
         return in;
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<chars-in.length(); i++)
      {
         sb.append(padchar);
      }
      sb.append(in);
      return sb.toString();
   }

   /**
    *
    */
   public String toString()
   {
      return machineid+"-"+vmid+"-"+thisEpoch+"-"+thisCounter;
   }

   /**
    *
    */
   public static void decode(String guid) {
      // parse the 4 parts, and dump data.
      StringTokenizer st=new StringTokenizer(guid, "-", false);
      if (st.countTokens() != 4) {
         System.out.println ("Invalid GUID format.");
      }

      String machineid=st.nextToken();
      String vmid=st.nextToken();
      String sepoch=st.nextToken();

      long epoch=Long.parseLong(sepoch);

      System.out.println("Machine Id: "+machineid);
      System.out.println("Epoch: "+df.format(new Date(epoch)));

   }

   /**
    *
    */
   public static void main(String args[])
   {
      ArgParser ap=new ArgParser(args);

      String guid=ap.getStringArg("-d");
      if (guid != null)
         decode(guid);
   }
}




