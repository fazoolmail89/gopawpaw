package com.jet.log;

import java.util.Date;

/**
 * A simple interface describing all devices capable of recording data 
 * withing the Logging subsystem.
 *
 * @author Paul Bemowski
 */
interface LogDevice
{
   /** 
    * Writes data to the underlying device.
    * @param d The date object representing the time that this log line
    * was written.  Date is a thin wrapper around a long representing the 
    * number of milliseconds since 12:00 am Jan, 1 1970.
    * @param data The data to be written to the log. It should be fully 
    * formatted.
    */
   public void write(Date d, String data);
}
