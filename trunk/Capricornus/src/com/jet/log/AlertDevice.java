package com.jet.log;

/**
 * An alert device is capable of sending alert messages to some subsystem.
 * Possible concrete implementations include: email, snmp, system log, etc.
 * 
 * @author Paul Bemowski
 */
public interface AlertDevice
{
   /** Send an alert to this device.  
    * @param message The alert message. */
   public void sendAlert(String message);
   
   /** Send an alert to this device. 
    * @param subject The subject of this alert.
    * @param message The alert message. */
   public void sendAlert(String subject, String message);
}
