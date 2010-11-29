package com.jet.utils;

import java.util.*;
import java.text.*;

/*
 * $Log: Cache.java,v $
 * Revision 1.5  2004/05/03 15:17:44  bemocvs
 * turned default log level from 2 to 8
 *
 * Revision 1.4  2003/07/08 16:02:29  bemocvs
 * search work
 *
 * Revision 1.3  2003/04/21 14:42:07  bemocvs
 * Alert logging context, changed cache internal structure to HashMap
 *
 * Revision 1.2  2003/04/18 00:21:36  bemocvs
 * Fixed line terminators
 *
 * Revision 1.1.1.1  2002/12/05 00:07:59  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/01/30 00:21:58  bemocvs
 * working on null
 *
 * Revision 1.3  2001/04/17 16:13:14  bemocvs
 * code for cache efficiency calculation.
 *
 * Revision 1.2  2001/03/28 21:05:11  bemocvs
 * toned down debug logging on cache monitor.
 *
 * Revision 1.1  2001/03/28 18:04:41  bemocvs
 * initial checkin
 *
 */

/**
 * Generic object cache.  This is a hashtable style object cache.  Behavior
 * can be modified thru several cache parameters. <p>
 *
 * Each instance of the cache object will have a related CacheMonitor thread
 * responsible for monitoring the cached data. <p>
 *
 * The cache is thread safe, not necessarily BLAZING fast.  It will be much
 * faster than making a wire call, or doing disk io. <p> 
 *
 * The Cache is not abstract, so it can be used as a static member variable 
 * in a stand alone fashion.  It will also be 'subclassable' so that specific
 * types of caches can be created for specialized tasks.
 *
 * @author Paul Bemowski
 */
public class Cache  // extends Dictionary
   implements com.jet.log.Logger
{
   /** HashMap containing the cached data. */
   protected HashMap cachedValues=null;
   
   // Changed to HashMap 4/18/2003.  Watch synchronization around
   // iterators.  Modification with an active iterator throws
   // a ConcurrentModificationException;


   /** Monitor thread, this may or may not be started. */
   protected CacheMonitor monitor=null;

   /** The sleep time for the cache monitor thread in millis. */
   protected long cacheMonitorSleep=60000;  // 1 minute

   /** The default life of a cached object.  The object will only remain
    * in the cache for this period of time, after which it is swept out 
    * by the monitor thread.  This is only valid if the monitor thread
    * is running.  */
   protected long cachedObjectLife=3600000; // 1 hour

   /** The maximum size of the cache.  After the max size is reached,
    * new objects will be inserted, and the oldest object in the cache
    * will be removed.  */
   protected int maxCachedObjects=500; 

   /** A flag indicating whether debugging information should be printed
    * to System.out. */
   public static boolean debug=false;

   /** */
   private static final DateFormat df=new SimpleDateFormat("HH:mm:ss.SSS");

   // using the 2 running totals below, we can calculate the cache efficiency
   // defined as hits/requests=eff.
   /** The total number of hits. */
   protected long cacheHits=0;

   /** The total number of requests to the cache. */
   protected long cacheRequests=0;

   
   //////////////////  CONSTRUCTORS  /////////////////
   /** Creates a cache, DOES NOT start the CacheMonitor thread. */
   public Cache() {
      this(false);
   }
   
   /** 
    * Creates a Cache.  
    * @param monitor Boolean indicating wether or not to start the cache 
    * monitor thread on construction.
    **/
   public Cache(boolean monitor) {
      cachedValues=new HashMap();
      if (monitor)
         startMonitor();
   }

   /** 
    * Creates a cache with specified size.  DOES NOT start the monitor thread.
    * @param m Maximum objects retained in cache at any one time.
    */
   public Cache(int m) {
      this(false);
      setMaxCachedObjects(m);
   }

   /**
    * Creates a cache with a maximum size.  When this size is reached, and
    * the cache is full, the oldest object is removed.
    * @param m Maximum objects retained in cache at any one time.
    * @param monitor Boolean indicating wether or not to start the cache 
    * monitor thread on construction.
    */
   public Cache(int m, boolean monitor) {
      this(monitor);
      setMaxCachedObjects(m);
   }

   /** 
    * Defines the maximum time an object will remain in the cache.
    * @param l The maximum life (in millis) of any cached object.
    */
   public synchronized void setCachedObjectLife(long l) {cachedObjectLife=l;}

   /** 
    * Sets the sleept time for the cache monitor.
    * @param s The amount of time the CacheMonitor will sleep between
    * cache sweeps for old objects.
    */
   public synchronized void setCacheMonitorSleep(long s) {cacheMonitorSleep=s;}

   /** 
    * Sets the maximum number of objects that will be stored in the cache.
    */
   public synchronized void setMaxCachedObjects(int max) {maxCachedObjects=max;}

   /** Clears all data from the cache. */
   public synchronized void clear()
   {
      if (debug)
         log("Clearing cache, currently holding "+cachedValues.size()+
             " objects.");
      // simply dump all objects in the cache
      cachedValues.clear();
   }

   /** */
   public double getCacheEfficiency() {
      return (double)cacheHits/(double)cacheRequests;
   }

   /** */
   public synchronized void resetCacheEfficiency() {
      cacheHits=0;
      cacheRequests=0;
   }

   /** Starts the CacheMonitor thread. */
   public synchronized void startMonitor() {
      if (monitor != null)
         return;
      else
      {
         monitor=new CacheMonitor();
         monitor.start();
      }
   }

   /** Shuts down the monitor thread. */
   public synchronized void stopMonitor() {
      if (monitor != null) {
         monitor.shutdown();
         monitor=null;
      }
   }

   /** Removes the oldest object in the cache.  This method will 
    * get more and more expensive as the cache grows. 
    *
    * @return Returns the object that has been removed. 
    */
   protected synchronized CachedValue removeOldest() {
      if (isEmpty())
         return null;

      // loop over all of our objects, track the oldest, and remove it
      Iterator keys=cachedValues.keySet().iterator();
      CachedValue oldest=null;
      Object key=null;
      Object oldestkey=null;
      long oldestage=0;

      // This method could become a KILLER for performance of a large, 
      // heavily used Cache.  The question is, how do we remove the oldest
      // ele without doing this loop.  I think the answer would be the java2
      // collections framework, and a sort funciton based on the object's 
      // age.  If we sorted, rather frequently, the sort should be efficient?
      // But, It may still be more eff to do the below.  (the sort would
      // be efficient relevant to other sorts, but ultimatly somewhere in
      // the sort it must have to do a full loop?)
      // anyway, we're not going to mess w/ it right now.  
      // FIXME: PAB 4/17/01

      while (keys.hasNext()) {
         key=keys.next();
         CachedValue cv=(CachedValue)cachedValues.get(key);
         if (oldest == null ){
            oldest=cv;
            oldestage=cv.getAge();
            oldestkey=key;
         }
         else {
            if (cv.getAge() > oldestage) {
               oldest=cv;
               oldestage=cv.getAge();
               oldestkey=key;
            }
         }
      }
      if (debug)
         log("Removing oldest: "+oldest);
      // I don't know how it happened, but the cache threw a null pointer
      // cause oldestkey was null??? 

      if (oldestkey != null) {
         // cachedValues.remove(oldestkey);
         // this allows subclasses (specifically the sanc cache) 
         // to accurately track accesses to the cache.
         remove(oldestkey);
      }
      else
         log("Oldest key is null?? while removing oldest.");
      return oldest;
   }
   
   //////////////////  java.util.Dictionary methods  /////////////////
   /** Returns the current size of the cache. */
   public synchronized int size() {
      return cachedValues.size();
   }
   
   /** Returns boolean indicating whether the cache is currently empty. */
   public synchronized boolean isEmpty() {
      return cachedValues.isEmpty();
   }
   
   /** Returns a Set of the keys currently in the cache. 
    * Remember to synchronize on the Cache while using this Set to 
    * avoid ConcurrentModificationException. */
   public synchronized Set keys() {
      return cachedValues.keySet();
   }
   
   /** Returns an enumeration of the elements in the cache.  This method
    * is synchronized, and not particularly fast.  It is not anticipated 
    * that this will be a heavily used method, but is included for a 
    * complete definition of the java.util.Dictionary definition. */
   public synchronized Collection elements() {
      // slow, but hopefully never used directly.
//        Vector vals=new Vector();
//        Enumeration elements=cachedValues.elements();
//        while(elements.hasMoreElements()) {
//           CachedValue cv=(CachedValue)elements.nextElement();
//           vals.addElement(cv.getValue());
//        }

//        return vals.elements();
      return cachedValues.values();
   }
   
   /** Returns an object stored in the cache. 
    * @return The cached object if available, null otherwise. */
   public synchronized Object get(Object key)
   {
      CachedValue cv=(CachedValue)cachedValues.get(key);
      cacheRequests++;
      if (cv == null) {
         if (debug) log("Cache miss on key "+key);
         return null;
      }
      else {
         if (debug) log("Cache hit on key "+key);
         cacheHits++;
         return cv.getValue();
      }
   }
   
   /** Puts an object into the cache.  If the cache size currently exceeds 
    * the cache's max size, the oldest object will be removed from the 
    * cache. <p>
    *
    * If an object with this key currently exists in the cache, the old
    * value is overwritten with the new value. 
    *
    * @param key The key of the object */
   public synchronized Object put(Object key,
                                  Object value)
   {
      Object o=cachedValues.remove(key);
      if (o != null && debug)
         log("Overwriting object referenced by key "+key);
      // check size
      if (cachedValues.size() >= maxCachedObjects)
         removeOldest();

      return cachedValues.put(key, new CachedValue(value));
   }
   
   /** */
   public synchronized Object remove(Object parm0) {
      return cachedValues.remove(parm0);
   }

   //////////////////   Static Helpers   ///////////////////////
   protected static void log(String s)
   {
      log.writeDebug(8, s);
      // System.out.println (df.format(new Date())+" ["+Thread.currentThread().getName()+"] "+s);
   }
   
   protected static void log(Throwable t)
   {
      log.writeError(3, "Error in Cache: "+t);
      // log("Exception occured: "+t);
      // t.printStackTrace();
   }

   //////////////////////////////////////////////////////////////
   ////////////////   Cache Helper Classes   ////////////////////
   //////////////////////////////////////////////////////////////
   static int cacheMonitorId=0;
   /** 
    * Thread used to monitor and maintain the cached data.  This thread
    * is not started by default.
    */
   public class CacheMonitor extends Thread
   {
      boolean shutdown=false;
      public CacheMonitor() {
         this.setName("CacheMonitor-"+cacheMonitorId++);
         // The VM is active as long as any non-daemon threads
         // exist.  Registering this as a daemon thread allows
         // the vm to exit if only CacheMonitors are running.  This
         // is expecially important for JUnit tests of classes that
         // internall use monitored Cache objects.
         // PAB, 04/18/2003.
         setDaemon(true); 
      }

      /**  */
      public void run() {
         while (!shutdown) {
            try {
               // sweep cache
               sweepCache();
               if (shutdown)
                  break;
            } catch (Throwable t) {
               t.printStackTrace();
            }

            try {sleep(cacheMonitorSleep);}
            catch (InterruptedException ex) 
            {if (!shutdown) log(ex);}
            catch (Exception ex) {log(ex);}
         }
      }

      /** Shuts down the cache monitor thread. */
      public void shutdown()
      {
         shutdown=true;
         this.interrupt();
      }

      /** Sweeps the cache, removing old objects. */
      public void sweepCache() {
         int elecount=cachedValues.size();
         if (elecount <= 0) return;

         int removeCount=0;
         
         if (false)
            log ("Monitor: Sweeping cache of "+elecount+
                 " elements.");
         
         synchronized (Cache.this) {
            Iterator keys=cachedValues.keySet().iterator();         
            while (keys.hasNext() && !shutdown) {
               Object key=keys.next();
               CachedValue cv=(CachedValue)cachedValues.get(key);
               
               if (cv.getAge() > cachedObjectLife){
                  cachedValues.remove(key);
                  removeCount++;
               }
            }
         }
         
         if (debug && removeCount>0)
            log("Swept "+removeCount+" old objects from cache of "+
                elecount+" objects.");
      }
   } // end CacheMonitor 

   /**
    * Represents a value stored in the cache.  The cached value is a 
    * thin wrapper that stores the value itself, and the time that
    * the object was placed in the cache.
    */
   public final class CachedValue
   {
      Object value=null;
      long cacheTime=-1;

      /** */
      public CachedValue(Object o) {
         value=o;
         cacheTime=System.currentTimeMillis();
      }
      
      /** Returns the age of the object. */
      public long getAge() {return System.currentTimeMillis()-cacheTime;}

      /** Returns the object contained within. */
      public Object getValue() {return value;}

      /** */
      public String toString() {
         return "Cached Value: age="+getAge()+" value="+value;
      }
   } // end CachedValue
}

