package com.jet.apps.databrowser.database;

import java.sql.*;

import com.jet.apps.databrowser.model.*;
import com.jet.log.Logger;

import com.jet.utils.PBE;
import com.jet.utils.properties.*;

/*
 * $Log: ConnectThread.java,v $
 * Revision 1.6  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.5  2006/12/03 21:24:01  bemocvs
 * Updates for nested jar classloader
 *
 * Revision 1.4  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 * Revision 1.3  2006/05/24 13:52:24  barney
 * fixed trivial spelling mistake
 *
 * Revision 1.2  2005/07/30 12:55:47  bemocvs
 * Fixed threaing problem with DataEditor, max+1
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/06/20 16:56:38  bemocvs
 * added UPA
 *
 * Revision 1.3  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * The connect thread will connect to the database, and send it's 
 * progress to the model, which will send notifications to the view.
 *
 * @author Paul Bemowski
 */
public final class ConnectThread extends Thread implements Logger {
   /** */
   private DBSession dbSession=null;

   /** */
   private ConnectionInfo conInfo=null;

   /** */
   private static int threadCount=0;

   /** */
   public ConnectThread(DBSession session, ConnectionInfo ci) {
      dbSession=session;
      // pbe=dbSession.getPBE();
      //if (pbe == null) {
      //   log.writeDebug(1, "Warning, PBE is null in connect thread");
      //}
      conInfo=ci;
      setName("ConnectThread-"+threadCount++);
   }
   
   /** */
   public void run() {
      log.writeDebug(3, "Attempting to connect to "+conInfo);
      try {
         dbSession.busy(); // tell the gui it's busy.
         dbSession.setStatus("Disconnecting");

         dbSession.disconnect(); // do something here.
         PBE pbe=dbSession.getPBE();

         String passwordEncrypted=conInfo.getProperty("password.encrypted");
         if (passwordEncrypted != null) {
            dbSession.setStatus("Decrypting password");
            if (pbe == null) {
               throw new RuntimeException("PBE is null, you need to "+
                                          "login to decrypt the DB password.");
            }
            conInfo.setProperty("password", pbe.decrypt(passwordEncrypted));
         }
         if (conInfo.getProperty("password") == null)
            conInfo.setProperty("password", "");

         dbSession.setStatus("Connecting..."); 

         // this is the actual connection work.
         ConnectionFactory.getInstance().getConnection(conInfo);

         dbSession.setConnection(conInfo);
         
         dbSession.setStatus("Saving session info...");
         
         addToList(conInfo); 

         UPA.getInstance().addEvent("con_"+conInfo.getDriver());

         dbSession.setStatus("done");
      } catch (SQLException ex) {
         log.writeError(1, "SQL Exception connecting.", ex);
         dbSession.sqlException(ex, null);
      } catch (Exception ex) {
         //FIXME: get the xcetion handling right here.
         dbSession.setStatus("Error connecting");
         log.writeError(1, "Unknown exception connecting.", ex);
         dbSession.exception(ex, "Unknown error connecting");
      } catch (Throwable t) {
         dbSession.setStatus("Error connecting");
         log.writeError(1, "Unknown throwable connecting.", t);
         dbSession.exception(t, "Unknown error connecting");
      } finally {
         dbSession.done();
      }
   }

   /**
    *
    */
   public static void addToList(ConnectionInfo ci)
   {
      EProperties recent=DBSession.getProperties("recent");
      // EProperties recent=sProperties.getProperties("recent");
      int numRecent=recent.getInt("numRecentConnections");

      // See if it's already here.  If not, add it
      for (int i=0; i<numRecent; i++)
      {
         EProperties tprops=recent.getProperties(""+i);
         if (tprops != null)
         {
            ConnectionInfo existing=new ConnectionInfo(tprops);
            if (ci.equals(existing)) {
               // update -- for advanced properties
               recent.put(""+i, conInfoToProps(ci));

               if (i != 0) {
                  // if i=0, it is already first.
                  reorderRecent(i, recent);
                  // sProperties.put("recent", recent);
               }
               try {
                  DBSession.save();
               } catch (Exception ex) {
                  log.writeError(1, "Unable to save properties", ex);
               }
               return;
            }
         }
      }

      EProperties temp=null;
      if (recent == null) return;

      for (int i=numRecent-1; i>=0; i--) {
         String key=""+i;
         String nextKey=""+(i+1);
         temp=recent.getProperties(key);
         if (temp != null)
            recent.put(nextKey, temp);
      }
      
      recent.remove(""+(numRecent));
      
      temp=conInfoToProps(ci);
      // System.out.println ("Temp is \n"+temp);
      recent.put("0", temp);
      // System.out.println ("recent is \n"+recent);
      DBSession.getGlobalProperties().put("recent", recent);

      try {
         DBSession.save();
      } catch (Exception ex) {
         log.writeError(1, "Unable to save properties", ex);
      }
   }

   /** */
   private static final void reorderRecent(int newFirst, EProperties recent) {
      EProperties p=new EProperties(recent); // using copy constructor
      // System.out.println ("Replacing recent: "+p);
      int numRecent=recent.getInt("numRecentConnections");

      recent.put("0", p.get(""+newFirst));

      int count=1;
      for (int i=0; i<numRecent; i++) {
         if (i != newFirst) {
            Object x=p.get(""+i);
            if (x == null)
               return; //this is if they have less than 'numRecent' connections
            recent.put(""+count, x);
            count++;
         }
      }
   }
   /** */
   private static final EProperties conInfoToProps(ConnectionInfo ci) {
      return ci.toEProperties();
   }
}






