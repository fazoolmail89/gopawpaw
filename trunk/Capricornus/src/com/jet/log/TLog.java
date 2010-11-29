package com.jet.log;

import java.text.*;
import java.io.*;
import java.util.*;

import com.jet.utils.*;

/**
 * Transaction logging. <p>
 *
 * The transaction log is used to write discrete, trackable events to
 * a transaction log file with a generic format.  The file uses a simple
 * comma delimited line format.  The format is as follows: 
 *  
 * <pre> 
 * 16:25:04.609,0A82CB4F-43D4454A-000000E2974229E1-00000001,A, ...
 * </pre>
 * 
 * The first value is the exact time that the transaction occured. <br>
 * The second value is a globally unique transaction identifier. <br>
 * The third value is a code representing the type of transaction. <br>
 * Additional parameters are generally in a comma delimeted format, but
 * are free form beyond that restriction.<p>
 *
 * Each line of the transaction log must be atomic, because the transaction
 * log is allowed to split files between lines -- for the purposes of 
 * rolling dates, etc.
 *
 * @author Paul Bemowski
 */
public class TLog
{
   /** The vm static instance*/
   private static TLog _instance=null;

   /** The 'log date format'.  Used for writeing timestamp to the tlog.*/
   private DateFormat ldf=new SimpleDateFormat("HH:mm:ss.SSS");

   /** The transaction log device. */
   LogDevice transactionDevice=null;

   /** */
   private TLog()
   {
      setDevice(new SystemDevice());
   }

   /** Obtain a handle on the VM wide singleton. */
   public static TLog getInstance()
   {
      if (_instance == null)
         _instance=new TLog();
      return _instance;
   }

   /** Sets the log device for the transaction log. The transaction log
    * is only allowed a single output device. 
    * @param ld The log device for transaction logging. */
   public synchronized void setDevice(LogDevice ld)
   {
      transactionDevice=ld;
   }

   //////////////////////////////////////////////////////////////////////
   ///////////////////////   Public Logging Methods   ///////////////////
   //////////////////////////////////////////////////////////////////////
   
   /** 
    *
    */
   public GUID writeTransaction(String type, String user_id, 
                                String site_id,
                                String oem_id, String reference,
                                String rhost, String data)
   {
      GUID guid=writeRaw(type+","+user_id+","+site_id+","+oem_id+","+
               reference+","+rhost+","+data);
      return guid;
   }

   /**
    *
    */
   public synchronized GUID writeRaw(String line)
   {
      Date d=new Date();
      GUID guid=new GUID();
      String l=ldf.format(d)+","+guid+","+line;
      transactionDevice.write(d, l);
      return guid;
   }
}










