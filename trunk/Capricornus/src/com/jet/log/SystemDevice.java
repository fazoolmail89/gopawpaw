package com.jet.log;

import java.util.Date;

/**
 * A simple log device that writes data to System.out.
 *
 * @author Paul Bemowski
 */
public class SystemDevice implements LogDevice
{
   /** */
   public SystemDevice()
   {

   }

   public void write(Date d, String data)
   {
      System.out.println(data);
   }

   public String toString()
   {
      return "SystemDevice.";
   }
}
