package com.jet.apps.databrowser.database;

import java.awt.*;
import javax.swing.*;

import java.sql.*;

// import com.jet.utils.db.*;
import com.jet.utils.ui.*;
import com.jet.utils.icons.*;
import com.jet.utils.properties.*;
import com.jet.core.*;

// import com.jet.apps.jdbcbrowser.ui.*;
import com.jet.apps.databrowser.model.*;

import com.jet.database.*;
import com.jet.log.Logger;

import com.jet.apps.databrowser.sqllog.SQLLog;

/*
 * $Log: QueryThread.java,v $
 * Revision 1.5  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.4  2007/02/18 18:01:29  bemocvs
 * Added SQLLog calls
 *
 * Revision 1.3  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.2  2002/12/31 07:11:18  bemocvs
 * 3.1.0, data io, etc.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.3  2002/05/04 18:49:23  bemocvs
 * Working
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.10  2001/10/12 00:12:31  bemocvs
 * I'm running SQL thru SchemaUtil before sending to database.
 *
 * Revision 1.9  2001/10/11 23:16:12  bemocvs
 * new table panel stuff
 *
 * Revision 1.8  2001/10/03 00:47:35  bemocvs
 * changes for new RSTableModel
 *
 * Revision 1.7  2001/08/14 00:21:47  bemocvs
 * Put some things on the event thread.
 *
 * Revision 1.6  2001/07/31 00:36:56  bemocvs
 * single window operation, kill, cleanup
 *
 * Revision 1.5  2001/06/11 15:13:13  bemocvs
 * changed table view icon
 *
 * Revision 1.4  2001/06/06 18:13:58  bemocvs
 * stupid comment change
 *
 * Revision 1.3  2001/03/15 17:37:22  bemocvs
 * fixed memory bug, now result set windows are GCd
 *
 * Revision 1.2  2001/01/17 16:41:58  bemocvs
 * Added support to refresh query from results pane
 *
 */

/**
 * The query thread is used by the databrowser to execute all methods
 * against the database.
 *
 * @author Paul Bemowski
 */
public class QueryThread extends Thread 
   implements Logger, SQLProcess, SessionPropertyKeys
{
   private boolean isRunning=false;
   private String sql=null;
   private ConnectionInfo connInfo=null;
   private Frame owner;

   private SQLProcessListener processListener=null;

   private Connection conn=null;

   private Statement state=null;

   private static int maxRows=400;

   private int absMaxRows=-1;

   private static EProperties sProps=null;

   private RSPanelModel panelModel=null;
   private RSTableModel tableModel=null;
   private DBSession dbSession=null;

   private static int threadCount=0;

   /**
    *
    */
   public QueryThread(RSPanelModel panelModel) {
      this.panelModel=panelModel;
      this.tableModel=panelModel.getTableModel();
      this.sql=panelModel.getQuery();
      this.connInfo=panelModel.getDBSession().getConnectionInfo();
      this.dbSession=panelModel.getDBSession();

      setName("QueryThread-"+threadCount++);

      maxRows=DBSession.getGlobalProperties().getInt(MAX_RESULTS, 433);

      EProperties dataProps=DBSession.getProperties(DATA_PROPS);
      if (dataProps != null) {
         absMaxRows=dataProps.getInt("absMaxRows");
      }
      conn=connInfo.getConnection();
   }

   /** */
   public void setListener (SQLProcessListener ql) {
      // make this a vector in the future if necessary.
      processListener=ql;
   }

   /**
    *
    */
   public void stopSql()
      throws SQLException 
   {
      if (state != null) {
         log.writeDebug ("Attempting to stop SQL Execution.");
         // Attempt to kill
         state.cancel();
         log.writeDebug ("cancel message sent.");
      }
   }

   /** 
    * This is an attempt at a hard kill funciton.  We'll interrupt the 
    * current thread, and see if we can catch the interrupted exception.  This
    * will likely cause the database connection/stream whatever to be
    * in a very unstable state.  In the GUI we should show a warning dialog
    * before actually executing this command.
    **/
   public void killSql() {
      log.writeDebug(2, "Attempting to interrupt("+this.getName()+")");
      this.interrupt();
   }
   
   /**
    *
    */
   public boolean isRunning() {return isRunning;}

   /**
    *
    */
   public void run()
   {
      log.writeDebug(3, "Starting Query Thread, ConnectionInfo: \n"+
                     connInfo);

      isRunning=true;
      boolean success=false;
      // don't establish a new connection for now
      try
      {
         panelModel.startQueryTimer();
         panelModel.setQueryStatus("Preparing query...");

         // this gives the GUI a chance to catch up -- including
         // repaint the screen after the close of a menu, perhaps starting
         // the busy icon.
         // Paul Bemowski, 21/04/2002.  17:46.  London.
         try {sleep(50);} catch (Exception ex) {}

         state=null;
         ResultSet rs=null;
         try {
            SchemaUtil util=connInfo.getSchemaUtil();
            SQLFormatter sqlFormatter=util.getSQLFormatter();
 
            sql=sqlFormatter.cleanSQL(sql);
            log.writeDebug ("About to execute "+sql);
            state=conn.createStatement();
            
            if (absMaxRows > 0) {
               state.setMaxRows(absMaxRows);
            }
            
            panelModel.setQueryStatus("Executing query on server...");
            rs=state.executeQuery(sql);
            success=true;
            log.writeDebug ("Query completed:  "+sql);
            panelModel.setQueryStatus("Updating headers...");
            panelModel.updateMetaData(rs.getMetaData());

            panelModel.setQueryStatus("Loading results...");
            tableModel.setModelResults(state, rs);
         }
         finally {
            //if (rs != null)
            //   try {rs.close();} catch (Exception ex) {}
            //if (state != null)
            //   try {state.close();} catch (Exception ex) {}
         }
      }
      catch (SQLException ex) {
         log.printStackTrace(ex);
         // SQLExceptionDebugger.debug(owner, ex);

         dbSession.sqlException(ex, sql, panelModel);
      }
      catch (OutOfMemoryError er) {
         System.gc();
         log.writeError(1, "Out of memory: ", er);

         String message=
         "<html>QueryThread encountered an <b>OutOfMemoryError</b>. <br><br>"+
         "Try setting 'Absolue Max Rows' in the DataRetrieval <br>"+
         "section of Preferences (Edit - Preferneces) <br><br>"+
         "<b><font color=red>Further work on this connection will "+
         "be unstable. </font></b></html>";

         MessageWindow.showWarning(owner, "OutOfMemoryError", message);

//          MessageWindow.
//          showWarning(owner, "QueryThread encountered OutOfMemoryError. \n"+
//                      "Try setting 'Absolute Max Rows' in the Data Retrieval "+
//                      "section of preferences. \n");

      }
      catch (Throwable ex)
      {
         // if this thread is sleeping, or in a blocking IO state, calling
         // interrupt on it will give it a hard kill... 
         log.writeError(1, "Caught interrupted exception, probably hard "+
                        "killed.", ex);
         MessageWindow.showWarning(owner, "QueryThread has caught an error. "+
                                   "Further work on this connection may be "+
                                   "unstable.");
      }
      finally {
         log.writeDebug ("Shutting down the QueryThread");
         panelModel.stopQueryTimer();
         dbSession.finishedSQL();
         isRunning=false;
         if (processListener != null)
            processListener.sqlFinished(success);


         String sqlStatus=null;
         if (success)
            sqlStatus="SUCCESS";
         else
            sqlStatus="FAIL";
         SQLLog sqllog=SQLLog.getInstance();
         
         sqllog.log(connInfo, sqlStatus, 
                    tableModel.getRowCount(), sql);
      }
   }
}





