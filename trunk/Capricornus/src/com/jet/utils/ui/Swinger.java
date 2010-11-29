package com.jet.utils.ui;

import javax.swing.*;

import java.lang.reflect.InvocationTargetException;

/* 
 * $Log: Swinger.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:05  bemocvs
 * featurs for db3
 *
 */

/**
 * A series of simple swing utilities.
 *
 * @author Paul Bemowski
 */
public final class Swinger
{
   /**
    * This method will use the SwingUtilities invokeLater method
    * if the code is being executed outside the AWTEventQueue.  Otherwise
    * it will simply execute it inline.
    */
   public static final void invokeLaterIfNecessary(Runnable r) {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeLater(r);
      } else {
         r.run();
      }
   }

   /** 
    * This method will use the SwingUtilities invokeAndWait method
    * if the code is being executed outside the AWTEventQueue.  Otherwise
    * it will simply execute it inline.
    */
   public static final void invokeAndWaitIfNecessary(Runnable r) 
      throws InterruptedException, InvocationTargetException {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeAndWait(r);
      } else {
         r.run();
      }
   }
}
