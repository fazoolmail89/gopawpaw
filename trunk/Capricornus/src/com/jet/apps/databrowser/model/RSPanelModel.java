package com.jet.apps.databrowser.model;

import java.util.Observable;

import java.sql.*;
import com.jet.log.Logger;

import com.jet.apps.databrowser.model.SessionPropertyKeys;
import com.jet.apps.databrowser.event.*;
import com.jet.utils.ui.Swinger;

/**
 *
 */
public class RSPanelModel extends Observable implements Logger, DBEvents, SessionPropertyKeys
{
   /** */
   DBSession dbSession=null;

   /** */
   String query="Unknown";

   /** */
   RSTableModel tableModel=null;

   /** */
   Statement statement=null;

   /** */
   ResultSet resultSet=null;

   /** */
   TimerThread queryTimer=null;

   /** */
   public RSPanelModel(DBSession session) {
      dbSession=session;

      // set the max rows
      int maxrows=session.getGlobalProperties().getInt(MAX_RESULTS, 440);
      tableModel=new RSTableModel(maxrows);
   }

   /** */
   public void updateMetaData(ResultSetMetaData rsmd) {
      notifyNow(new DBEvent(UPDATE_HEADERS, rsmd));
   }

   /** */
   void notifyNow(final DBEvent event) {
      class notifynow implements Runnable {
         public void run() {
            setChanged();
            notifyObservers(event);
         }
      }
      try {
         Swinger.invokeAndWaitIfNecessary(new notifynow());
      } catch (InterruptedException ex) {
         log.writeDebug(3, "notifyNow() interrupted. probably "+
                        "stopping query timeer.");

         // this is not a real error - this can happen
         // withthe stopit() function
      } catch (Exception ex) {
         log.writeError(1, "Error updating", ex);
      }
   }

   /** */
   void notifyWhenever(final DBEvent event) {
      class notifylater implements Runnable {
         public void run() {
            setChanged();
            notifyObservers(event);
         }
      }
      try {
         Swinger.invokeLaterIfNecessary(new notifylater());
      } catch (Exception ex) {
         log.writeError(1, "Error updating", ex);
      }
   }


   /** */
   public void setQuery(String s) {query=s;}

   /** */
   public String getQuery() {return query;}

   /** */
   public void setStatement(Statement s) {statement=s;}
   
   /** */
   public Statement getStatement() {return statement;}

   /** */
   public void setResultSet(ResultSet rs) {resultSet=rs;}

   /** */
   public ResultSet getResultSet() {return resultSet;}
   
   /** */
   public RSTableModel getTableModel() {return tableModel;}

   /** */
   public DBSession getDBSession() {return dbSession;}

   /** */
   public synchronized void setQueryStatus(String s) {
      DBEvent qstat=new DBEvent(QUERY_STATUS_UPDATE, s);
      notifyWhenever(qstat);
   }

   /** */
   public synchronized void startQueryTimer() {
      notifyWhenever(new DBEvent(QUERY_STARTED));
      queryTimer=new TimerThread();
      queryTimer.start();
   }

   /** */
   public synchronized void stopQueryTimer() {
      if (queryTimer == null)
         return;

      try {
         queryTimer.stopit();
         notifyWhenever(queryTimer.getFinalEvent());
         queryTimer=null;

         notifyWhenever(new DBEvent(QUERY_STATUS_UPDATE, "Done"));
         notifyWhenever(new DBEvent(QUERY_FINISHED));
      }catch (Exception ex) {
         log.writeError(1, "Error stopping query timer.", ex);
      }
   }

   /** */
   class TimerThread extends Thread  {
      long start=System.currentTimeMillis();
      DBEvent update=null;
      boolean stopped=false;
      public TimerThread() {setName("QueryTimer");}
      public void stopit() {
         stopped=true;
         try {interrupt();}catch (Exception ex) {}
      }
      public void run() {
         try {
            update=new DBEvent(QUERY_TIME_UPDATE, 
                               new Long(System.currentTimeMillis()-start));
            notifyNow(update);

            while(true && !stopped) {
               sleep(200);
               update.setData(new Long(System.currentTimeMillis()-start));
               notifyNow(update);
            }
         }catch (InterruptedException ex) {
            // this is ok.
            log.writeDebug("Stopping query time updater");
            update.setData(new Long(System.currentTimeMillis()-start));
         }
      }
      public DBEvent getFinalEvent() {
         return update;
      }
   }
}
