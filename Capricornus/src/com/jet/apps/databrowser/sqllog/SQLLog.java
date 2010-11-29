package com.jet.apps.databrowser.sqllog;

import java.util.Date;
import java.util.*;
import java.sql.*;
import com.jet.log.Logger;
import java.text.*;


import com.jet.utils.StringUtil;
import com.jet.utils.GUID;
import com.jet.utils.exception.NestedRuntimeException;

import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.sqllog.*;

/**
 *
 *
 */
public class SQLLog implements Logger
{
   /** The connection to the HSQL instance. */
   Connection connection=null;
   
   private static SQLLog _instance=null;

   public static boolean debug=true;
   
   /** */
   String driver="org.hsqldb.jdbcDriver";

   /** */
   String url=null;

   /** */
   List listeners=new ArrayList();
   
   /** */
   static final String sqllogsql=
   "CREATE TABLE SQL_LOG \n"+
   "(ID VARCHAR(50)  NOT NULL, \n"+
   "CONNECTION_NAME VARCHAR(200) NOT NULL, \n"+
   "DRIVER VARCHAR(200)  NOT NULL, \n"+
   "CONNECTION_URL VARCHAR(1000) NOT NULL, \n"+
   "USERNAME VARCHAR(200), \n"+
   "DATE_TIME TIMESTAMP  NOT NULL, \n"+
   "BATCH_ID VARCHAR(50), \n"+
   "STATUS VARCHAR(20), \n"+
   "ROWS_AFFECTED INTEGER  NOT NULL, \n"+
   "SQL VARCHAR(10000)  NOT NULL, \n"+
   "PRIMARY KEY(ID))";

   ConnectionInfo conInfo=null;

   /** */
   public SQLLog() 
      throws SQLException {
      log.writeDebug("Initializing sqllog with "+url);
      ConnectionFactory connectionFactory=ConnectionFactory.getInstance();
      conInfo=connectionFactory.newInternalConnection();

      connection=conInfo.getConnection();

      initialize();
   }

   /** */
   public void addListener(SQLLogListener listener) {
      listeners.add(listener);
   }

   /** */
   public void removeListener(SQLLogListener listener) {
      listeners.remove(listener);
   }

   public void fireEvent(SQLLogEvent evt) {
      int size=listeners.size();
      for (int i=0; i<size; i++) {
         SQLLogListener listener=(SQLLogListener)listeners.get(i);
         listener.logEvent(evt);
      }
   }

   /** */
   private void initialize() {
      log.writeDebug(2, "Initializing SQLLog...");
      // if this is a brand new db, then we have to 
      // create the table
      String sql="select count(*) from sql_log";
      boolean sqlLogExists=false;
      int sqlLogRows=-1;

      synchronized(connection) {
         Statement state=null;
         ResultSet rs=null;
         try {
            state=connection.createStatement();
            rs=state.executeQuery(sql);
            
            if (rs.next()) {
               sqlLogExists=true;
               sqlLogRows=rs.getInt(1);
            }
         } catch (Exception ex) {
            log.writeError(1, "Error getting sql log count...", ex);
         } finally {
            close(rs);
            close(state);
         }
      }

      if (sqlLogExists)
         log.writeDebug("SQL Log has "+sqlLogRows+" rows");
      
      if (!sqlLogExists) {
         log.writeDebug("SQL Log does not exist, creating it with \n"+
                        sqllogsql);
         // create it.
         synchronized(connection) {
            Statement state=null;
            try {
               state=connection.createStatement();
               state.executeUpdate(sqllogsql);
            } catch (Exception ex) {
               log.writeError(1, "Error creating sql log.", ex);
            } finally {
               close(state);
            }
         }
      }
      log.writeDebug(2, "SQL Log initialized.");
   }

   /** */
   public ConnectionInfo getConnectionInfo() 
   {
      return conInfo;
   }

   /** */
   public Connection getConnection() {
      if (conInfo != null)
         return conInfo.getConnection();
      return null;
   }

   /** If there is an error in the file system, or the driver is not
    * available, or something - SQLLog may not be active.  But DataBrowser
    * would still be functional.  So - we use this method to control
    * UI items that should be ignored when sqllog is not available. */
   public static boolean available() {
      if (_instance == null)
         return false;
      return true;
   }


   public static void startup() 
      throws SQLException {
      _instance=new SQLLog();
   }

   /** */
   public void iShutdown() {
      synchronized(connection) {
         Statement state=null;
         try {
            state=connection.createStatement();
            int logrows=state.executeUpdate("SHUTDOWN");
         } catch (Exception ex) {
            log.writeError(1, "Error inserting into sql log.", ex);
         } finally {
            if (state != null)
               try {state.close();} 
               catch (Exception ex) {log.writeError(1, ex);}
         }
      }      
   }

   /** */
   public static void shutdown() {
      if (_instance != null)
         _instance.iShutdown();
   }

   /** */
   public static SQLLog getInstance() {
      return _instance;
   }

   /** */
   public void log(ConnectionInfo ci, String status, int rows, String sql) {
//       log.writeDebug(2, "SQLLog ci=\n"+ci);
//       log.writeDebug(2, "Username: "+ci.getUserName());

      log(ci.getDriver(), ci.getURL(), ci.getName(), ci.getUserName(), 
          null, status, rows, sql);
   }

   /** */
   public void log(ConnectionInfo ci, String batchId, 
                   String status, int rows, String sql) {
      log(ci.getDriver(), ci.getURL(), ci.getName(), ci.getUserName(), 
          batchId, status, rows, sql);
   }

   /** */
   public void log(String driver, String connectionurl, String connectionname,
                   String user, String batchId, String status, 
                   int rows, String sql) {
      // log.writeDebug(2, "SQLLog.log(), inbound username: '"+user+"'");

      DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      
      sql=StringUtil.replace("'", "''", sql);

      String logsql=
      "insert into sql_log (id, connection_name, driver, connection_url, username, "+
      "date_time, batch_id, status, rows_affected, sql) \n"+
      "values \n"+
      "('"+(new GUID()).toString()+"', '"+connectionname+"', '"+driver+"', "+
      "'"+connectionurl+"', "

      +(user == null ? "NULL, ": "'"+user+"',") +

      " '"+df.format(new Date())+"', \n"+

      (batchId == null ? "NULL, " : "'"+batchId+"', ")+

      "'"+status+"', "+rows+", '"+sql+"')";

      //if (debug) 
      //   System.out.println ("sqllog: "+logsql);

      synchronized(connection) {
         Statement state=null;
         try {
            state=connection.createStatement();
            int logrows=state.executeUpdate(logsql);
         } catch (Exception ex) {
            log.writeError(1, "SQL:\n"+logsql);
            log.writeError(1, "Error inserting into sql log.", ex);
         } finally {
            close(state);
         }
      }

      fireEvent(new SQLLogEvent(connectionname));
   }


   /** */
   public List getLogData(String conName, boolean showAll, int limit) {
      List tmpData=null;

      String sql=
      "select rows_affected, status, date_time, sql from sql_log \n"+
      "where id is not null \n";

      if (conName != null) {
         sql=sql+"and connection_name='"+conName+"' \n";
      }
      if (!showAll) {
         sql=sql+"and status = 'SUCCESS' \n";
      }

      sql=sql+"order by date_time desc limit "+limit;
      
      DateFormat df=new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
      DecimalFormat decFormat=new DecimalFormat("#,###");
      
      Statement state=null;
      ResultSet rs=null;
      tmpData=new ArrayList();
      try {
         state=connection.createStatement();
         rs=state.executeQuery(sql);
         
         while (rs.next()) {
            ArrayList row=new ArrayList();
            row.add(decFormat.format(rs.getInt("rows_affected")));
            row.add(rs.getString("status"));
            row.add(df.format(rs.getTimestamp("date_time")));
            row.add(rs.getString("sql"));
            tmpData.add(row);
         }
      }
      catch (Exception ex) {
         log.writeError(2, "Error refreshing sqllog view", ex);
      } finally {
         close(rs);
         close(state);
      }
      return tmpData;
   }

   /** */
   public List getConnectionNames() {
      List tmpData=null;

      String sql=
      "select distinct(connection_name) from sql_log \n"+
      "order by connection_name desc";
      
      Statement state=null;
      ResultSet rs=null;
      tmpData=new ArrayList();
      try {
         state=connection.createStatement();
         rs=state.executeQuery(sql);
         
         while (rs.next()) {
            tmpData.add(rs.getString("connection_name"));
         }
      }
      catch (Exception ex) {
         log.writeError(2, "Error refreshing sqllog view", ex);
      } finally {
         close(rs);
         close(state);
      }
      return tmpData;
   }
   
   
   /** */
   static void close(Statement state) {
      if (state != null)
         try {state.close();} 
         catch (Exception ex) {log.writeError(1, ex);}
   }
   
   /** */
   static void close(ResultSet rs) {
      if (rs != null)
         try {rs.close();} 
         catch (Exception ex) {log.writeError(1, ex);}
   }
}