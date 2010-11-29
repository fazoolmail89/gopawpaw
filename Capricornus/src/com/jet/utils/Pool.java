package com.jet.utils;

import java.util.*;

/**
 * An abstract class representing a pool of objects.  The abstract
 * pool maintains the handles of the free and in-use objects. <p>
 *
 * This class is the general superclass for a pool of ANY type of objects
 * including database connections, threads, sockets, etc.  It handles
 * the lists of objects in terms of total, free, and inuse. It handles
 * as much synchronization as possible, and is guarnteed thread safe.<p>
 *
 * This class makes the folowing assumptions about the objects it is 
 * pooling:
 * <ol>
 *  <li> The objects are identical, in as much as a client of the
 *       pool will not care which particular object is returned
 *       when requested, only that an object is returned. </li>
 *  
 * </ol>
 *
 * It
 * does not define any algorithms for the the expansion and contraction 
 * of the pool itself.
 * @author Paul Bemowski
 */
public abstract class Pool implements com.jet.log.Logger
{
   /** A list of objects that are NOT in use. */
   protected Vector freeObjects=new Vector();
   
   /** A list of objects in the pool that are currently in use. */
   protected Vector inuseObjects=new Vector();

   /** A Random number generator. */
   protected Random random=new Random(System.currentTimeMillis());


   /** */
   public void initializePool(int count)
      throws PoolException
   {
      synchronized(this)
      {
         for (int i=0; i<count; i++)
         {
            try {
               Object obj=buildPoolObject();
               freeObjects.addElement(obj);
            }
            catch (Exception ex)
            {
               throw new PoolException("Unable to initialize pool due to "+
                                       "exception building object "+i, ex);
            }
         }
      }
   }

   /**
    * Returns a pooled object.
    */
   public Object getObject()
      throws PoolException
   {
      Object ret=null;

      synchronized (this) {
         if (freeObjects.size() > 0) {
            int rloc=randomInt(freeObjects.size());
            ret=freeObjects.elementAt(rloc);
            freeObjects.removeElementAt(rloc);
            inuseObjects.addElement(ret);
         }
         else {
            // can I build another object?
            throw new PoolException("Pool cannot expand at this time");
         }
      }
      return ret;
   }

   /**
    *
    */
   public void releaseObject(Object obj)
      throws PoolException
   {
      synchronized (this)
      {
         boolean success=inuseObjects.removeElement(obj);
         if (!success)
            throw new PoolException("This object is not currently in use.");
         freeObjects.addElement(obj);
      }
   }


   /**
    * Returns a randomly selected object from the vector passed in.
    *
    * If we pass in 10, this will generate a random number from 0 to 9
    */
   private int randomInt(int size)
   {
      int index=(int)((double)random.nextDouble() * (double)size);
      if (index < 0) index=0;
      if (index > size) index=size;
      return index;
   }


   public boolean containsObject(Object obj)
   {
      return inuseObjects.contains(obj);
   }

   /**
    */
   protected abstract Object buildPoolObject() throws Exception;

   /**
    */
   protected abstract void destroyPoolObject(Object obj)throws Exception;
      
   /** 
    * Destroys all objects in a pool.  This is used so that we can 
    * destroy the pool upon re-start. <p>
    *
    * Because this will be called from a finalizer
    */
   public void destroyPool() {
      log.writeDebug(1, 
                     "\n*****************************************\n"+
                     "      Destroying pool "+this.getClass().getName()+"\n"+
                     "*****************************************");
      synchronized (this) {
         int freesize=freeObjects.size();
         int inusesize=inuseObjects.size();
         log.writeDebug(1, "There are "+freesize+" objects free, and "+
                        inusesize+" objects in use");
         for (int i=freesize - 1; i>=0; i--) {
            Object obj=freeObjects.elementAt(i);
            try {destroyPoolObject(obj);}
            catch (Exception ex) {log.writeError(1, "Error destroying pooled object: "+obj);}
            freeObjects.removeElementAt(i);
         }
            
         for (int i=inusesize -1; i>=0; i++) {
            Object obj=inuseObjects.elementAt(i);
            try {destroyPoolObject(obj);}
            catch (Exception ex) {log.writeError(1, "Error destroying pooled object: "+obj);}
            inuseObjects.removeElementAt(i);
         }
      }
      log.writeDebug(1, 
                     "\n*****************************************\n"+
                     "      Pool destroy complete \n"+
                     "*****************************************");      
   }

   public static void main(String args[])
   {
      for (int i=0; i<30;i++)
      {

         // System.out.println (""+randomInt(10));
      }
   }
}
