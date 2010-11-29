package com.jet.utils;

import java.util.*;
import java.io.*;
import java.text.*;

import com.jet.log.*;

/**
 * This is a queue of messages. <p>
 *
 * The initial implementation will use a simple vector (which is a 
 * poor data structure here). <p>
 * 
 * June 28, 2000: <br>
 * Making queue persistent.  The queue interface will remain the same.  Now, 
 * the queue will write each queued object to disk.  If the VM fails, the 
 * queue will re-initialize itself from disk.  <p>
 * 
 * This adds significant overhead!!  The queue can operate is persistent
 * or transient modes.  Transient is very fast, but cannot provide for 
 * failover.  Persisent mode provides for failover, but is much slower.
 */
public class Queue implements Logger
{
   private ArrayList queue=new ArrayList();
   private HashMap persistHash=new HashMap();

   private long uniqueLong=0;

   private boolean persistQueue=false;

   /** Location on the file system where the queue will persist to. */
   private File queueDir=null;

   /** */
   public boolean debug=false;

   /** */
   int dequeuedObjects=0;

   /** A common name indicating what this queue contains. */
   String name=null;
   

   public Queue(String name) {
      this(name, null);
   }

   /** */
   public Queue(String name, File queueDir)
   {
      this.queueDir=queueDir;
      this.name=name;
      if (queueDir != null)
         persistQueue=true;


      if (!queueDir.exists()) {
         queueDir.mkdirs();
         if (!queueDir.exists())
            throw new RuntimeException("Queue ["+name+"]: Cannot mkdirs() for "+
                                       "queue dir: "+queueDir.getAbsolutePath());
      }
      

      if (persistQueue) {
         // check the queue dir, re-read all the objects therein back 
         // into the queue.
         String queuedObjectFiles[]=queueDir.list();
         if (queuedObjectFiles != null) {
            log.writeDebug(2, "Queue["+name+"]: Restoring "+
                           queuedObjectFiles.length+" queued objects.");
            for (int i=0; i<queuedObjectFiles.length; i++) {
               File f=new File(queueDir, queuedObjectFiles[i]);
               
               FileInputStream fis=null;
               
               try {
                  fis=new FileInputStream(f);
                  ObjectInputStream ois=new ObjectInputStream(fis);
                  Object queObj=ois.readObject();
                  queue.add(queObj);
                  persistHash.put(queObj, f.getAbsolutePath());
               }
               catch (Exception ex) {
                  log.printStackTrace(ex);
               }
               catch (Throwable t) {
                  // if the class changed this could throw some bad 
                  // java.lang.Error subclass
                  log.printStackTrace(t);
               }
               finally {
                  try {
                     if (fis != null)
                        fis.close(); 
                  }
                  catch (Exception ex) {}
               }
            }
         }
         log.writeDebug(2, "Queue["+name+"]: Objects re-queued.");
      } // if (persistQueue);
   }

   /**
    *
    */
   public String getState()
   {
      String state=null;
      
      if (persistQueue) {
         state="Queue is persistent.  QueueDir: "+queueDir.getAbsolutePath();
      } else {
         state="Queue is not persistent.";
      }

      state=state+"\nMessages in queue: "+queue.size()+" Dequeued Messages: "+
      dequeuedObjects;
      return state;
   }
   
   
   /** 
    * Places a message in the queue.
    */
   public synchronized void enqueue(Object obj)
   {
      queue.add(obj);
         
      if (persistQueue) {
         // if we are not persisting, skip all this shit.
         if (obj instanceof Serializable) {
            try {
               persistObject((Serializable)obj);
            }
            catch (IOException ex) {
               // I'm basically changing ioexcpeion to a runtime
               // exception here.  The IO for the queue should be 
               // very stable and fast.
               throw new RuntimeException("IOException persisting object:"+
                                          ex.toString());
            }
         }
         else {
            throw new RuntimeException("Persistent queue requires "+
                                       "serializable objects: "+
                                       obj.getClass().getName());
         }
      } // end if(persistQueue)
   }

   /** 
    * Retrieves the next message from the queue.
    */
   public synchronized Object dequeue()
   {
      if (queue.size() == 0) 
         return null;
      
      Object obj=queue.get(0);
      queue.remove(0);
      
      if (persistQueue) {
         try {
            destroyObject(obj);
         } catch (IOException ex) {
            throw new RuntimeException("IOException dequeueing object: "+
                                       ex.toString());
         }
      }
      dequeuedObjects++;
      return obj;
   }

   /**
    *
    * @param s A serializable object to be persised.
    * @return The object's persistent file name.
    */
   private String persistObject(Serializable s)
      throws IOException
   {
      File f=new File(queueDir, (new GUID()).toString()+".obj");
      FileOutputStream fos=null;

      try {
         fos=new FileOutputStream(f);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(s);

         persistHash.put(s, f.getAbsolutePath());
      }
      finally {
         if (fos != null) {
            try { 
               fos.flush(); fos.close(); 
            }
            catch (Exception ex) {}
         }
      }
      return f.getAbsolutePath();
   }

   /**
    * Used to delete the persistent object upon de-queueing.
    * @param obj Object coming off the queue.
    */
   private void destroyObject(Object obj)
      throws IOException 
   {
      String persistentFile=(String)persistHash.get(obj);

      if (persistentFile != null){
         File f=new File(persistentFile);
         f.delete();
      }
   }

   /**
    * This is not synchronized, so it's a best guess.
    */
   public int getQueuedItemCount() {
      return queue.size();
   }

   public int size() {
      return queue.size();
   }

   /**
    * The Shutdown method should be called when a VM using the Queue is 
    * being shutdown.  At this time we will have it dump all pending 
    * messages.  In the future we may want it to stream it's queue
    * to disk on a shutdown event, and later re-read the data.
    */
   public synchronized void shutdown()
   {
      log.writeDebug(1, "Queue["+name+"]: Shutdown called, "+
                     "dumping queued items.");
      if (queue.size() > 0) {
         for (int i=queue.size()-1; i>=0; i--) {
            log.writeDebug(1, "Item: "+i+" -------------------------");
            log.writeDebug(1, queue.get(i).toString());
         }
      }
   }

   /**
    * Test code for the Queue.
    * 
    */
   public static void main(String args[])
   {
      try {
         Queue queue=new Queue("Queue.main() persist test", 
                               new File("./queuetemp"));

         log("\n\nWriting 1000 persistent objects");
         for (int i=0; i<1000; i++) {
            TestObject obj=new TestObject("xxx "+i, "llkjlj"+(i*4));
            queue.enqueue(obj);
         }
         log("Done.\n\n");

         queue=new Queue("Queue.main() non-persist test");
         log("Writing 1000 transient objects");
         for (int i=0; i<1000; i++) {
            TestObject obj=new TestObject("xxx "+i, "llkjlj"+(i*4));
            queue.enqueue(obj);
         }
         log("Done.\n\n");
         
         log("De-queueing all messages");
         while (queue.dequeue() != null) ;
         log("Done dequeueing.");
      }
      catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   static DateFormat ldf=new SimpleDateFormat("HH:mm:ss.SSS");
   static void log(String s)
   {
      System.out.println (ldf.format(new Date(System.currentTimeMillis()))+
                          " ("+Thread.currentThread().getName()+")| "+s);
   }

   
   /** Object for testing queue. */
   private static class TestObject implements Serializable
   {
      String s1=null;
      String s2=null;

      public TestObject (String x, String xx)
      {
         s1=x;
         s2=xx;
      }
   }
}

