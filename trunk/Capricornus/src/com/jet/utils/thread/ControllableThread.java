package com.jet.utils.thread;

import com.jet.log.Logger;


/**
 * A controllable thread.
 *
 */
public abstract class ControllableThread extends Thread implements Logger
{
   /** State variable indicating whether the thread is in a shutdown state. */
   protected volatile boolean shutdown=false;

   /** Variable indicating whether the current thread is sleeping. */
   private volatile boolean sleeping=false;
   
   /** */
   public static void sleep(long millis) 
      throws InterruptedException {
      ControllableThread ct=(ControllableThread)Thread.currentThread();
      try {
         ct.sleeping=true;
         Thread.sleep(millis);
      } finally {
         ct.sleeping=false;
      }
   }

   /** */
   public synchronized void wake() {
      if (sleeping) {
         interrupt();
      }
   }

   /** */
   public boolean isSleeping() {
      return sleeping;
   }

   /** */
   public synchronized void shutdown() {
      log.writeDebug(1, this.getName()+" shutdown called from "+
                     Thread.currentThread().getName());
      shutdown=true;
      wake();
   }
}
