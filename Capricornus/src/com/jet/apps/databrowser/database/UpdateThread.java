package com.jet.apps.databrowser.database;

import java.awt.*;
import java.sql.*;
import com.jet.database.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.sqllog.SQLLog;

/*
 * $Log: UpdateThread.java,v $
 * Revision 1.10  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.9  2007/02/18 18:01:29  bemocvs
 * Added SQLLog calls
 *
 * Revision 1.8  2006/12/07 14:53:56  bemocvs
 * DataEditor refactor
 *
 * Revision 1.7  2006/12/03 21:24:01  bemocvs
 * Updates for nested jar classloader
 *
 * Revision 1.6  2005/07/30 12:55:47  bemocvs
 * Fixed threaing problem with DataEditor, max+1
 *
 * Revision 1.5  2004/07/12 19:28:40  bemocvs
 * fixed sorted delete
 *
 * Revision 1.4  2003/08/21 20:25:45  bemocvs
 * Fixes for comments in SQL, save
 *
 * Revision 1.3  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
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
 * Revision 1.3  2002/04/21 20:06:40  bemocvs
 * db3 work
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * 
 *
 * @author Paul Bemowski
 */
public class UpdateThread extends Thread implements Logger, SQLProcess
{
   private boolean isRunning=false;
   private String sql=null;
   private ConnectionInfo connInfo=null;

   private Connection conn=null;
   private Statement state=null;

   /** Rows affected by this operation.  -1 indicates an error. */
   private int affectedRows=-1;

   DBSession dbSession=null;

   /** indicates success or failure. */
   boolean success=false;

   /** */
   Throwable exception=null;

   /** */
   public boolean updateGui=true;

   /** */
   private static int threadCount=0;

   /** */
   public UpdateThread(DBSession session, String sql) {
      this(session, sql, true);
   }

   /**
    */
   public UpdateThread(DBSession session, String sql, boolean updateGui) {
      this.sql=sql;
      this.dbSession=session;
      this.connInfo=session.getConnectionInfo();
      this.updateGui=updateGui;

      setName("UpdateThread-"+threadCount++);

      log.writeDebug(3, "Update thread class loader="+getContextClassLoader());
      conn=connInfo.getConnection();
   }
   
   /**
    */
   public void stopSql()
      throws SQLException 
   {
      if (state != null)
      {
         // Attempt to kill
         state.cancel();
      }
   }
   
   /** 
    * This is an attempt at a hard kill funciton.  We'll interrupt the 
    * current thread, and see if we can catch the interrupted exception.  This
    * will likely cause the database connection/stream whatever to be
    * in a very unstable state.  In the GUI we should show a warning dialog
    * before actually executing this command.
    **/
   public void killSql() 
      throws SecurityException {
      this.interrupt();
   }

   /** */
   public boolean isRunning() {return isRunning;}

   /** */
   public int getAffectedRows() {return affectedRows;}

   /**
    *
    */
   public void run()
   {
      isRunning=true;
      affectedRows = 0;
      boolean updateTree=false;

      // boolean success=false; now instance level
      // don't establish a new connection for now
      try
      {
         if (updateGui) 
            dbSession.startSQL(this);

         state=null;
         try {
            state=conn.createStatement();
            SchemaUtil util=connInfo.getSchemaUtil();
            SQLFormatter sqlFormatter=util.getSQLFormatter();
            sql=sqlFormatter.cleanSQL(sql);

            String lsql=sql.toLowerCase();
            if (lsql.startsWith("alter") ||
                lsql.startsWith("drop") ||
                lsql.startsWith("create")) 
               updateTree=true;

            log.writeDebug ("About to execute "+sql);
            affectedRows=state.executeUpdate(sql);
            success=true;
            log.writeDebug ("Update completed:  "+sql);
            log.writeDebug ("Modified "+affectedRows+" rows");

            ResultSet rs=state.getResultSet();
            if (rs != null) {
               log.writeDebug(1, "ResultSet available after update!");
            }
            else
               log.writeDebug(1, "No results available after update.");
            
            if (updateGui) 
               dbSession.updateComplete(affectedRows);
         }
         finally {
            if (state != null)
               try {state.close();} catch (Exception ex) {}
         }
      }
      catch (SQLException ex) {
         log.printStackTrace(ex);
         exception=ex;

         if (updateGui) 
            dbSession.sqlException(ex, sql);
         // SQLExceptionDebugger.debug(owner, ex);
      }
      catch (Throwable ex) {
         log.printStackTrace(ex);
         if (updateGui) 
            dbSession.exception(ex, "An unexpected error occured \n"+
                                "executing SQL.  See System console for \n"+
                                "more detail.");
         exception=ex;
      }
      finally {
         log.writeDebug ("Shutting down the UpdateThread");
         isRunning=false;

         if (updateGui) {
            if (updateTree)
               dbSession.updateTreeModel();
            // stops the spinning icon
            dbSession.finishedSQL(affectedRows);
         }

         String sqlStatus=null;
         if (success)
            sqlStatus="SUCCESS";
         else
            sqlStatus="FAIL";
         SQLLog sqllog=SQLLog.getInstance();
         
         sqllog.log(connInfo, sqlStatus, affectedRows, sql);
      }
   }

   /** */
   public boolean isSuccess() {return success;}

   /** */
   public void setUpdateGui(boolean b) {updateGui=b;}

   /** */
   public Throwable getException() {return exception;}
}

