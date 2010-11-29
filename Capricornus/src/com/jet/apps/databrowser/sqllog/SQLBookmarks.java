package com.jet.apps.databrowser.sqllog;

import java.util.Date;
import java.util.*;
import java.sql.*;
import com.jet.log.Logger;
import java.text.*;


import com.jet.utils.StringUtil;
import com.jet.utils.GUID;
import com.jet.utils.exception.NestedRuntimeException;
import com.jet.utils.properties.*;

import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.sqllog.*;

import com.jet.apps.databrowser.model.*;

/**
 * A singleton used for interacting with the bookmarks functions
 * of the internal database.
 *
 */
public class SQLBookmarks implements Logger
{
   /** The connection to the HSQL instance. */
   Connection connection=null;
   
   private static SQLBookmarks _instance=null;

   public static boolean debug=true;
   
   /** */
   String driver="org.hsqldb.jdbcDriver";

   /** */
   String url=null;

   /** */
   List listeners=new ArrayList();
   
   /** */
   static final String sqlBookmarksDDL=
   "CREATE TABLE SQL_BOOKMARKS \n"+
   "(ID VARCHAR(50) NOT NULL, \n"+ 
   "NAME VARCHAR(200) NOT NULL, \n"+
   "TYPE VARCHAR(20) NOT NULL, \n"+ 
   "PATH VARCHAR(400), \n"+ 
   "LAST_UPDATE TIMESTAMP NOT NULL, \n"+ 
   "SQL VARCHAR(10000) NOT NULL, \n"+ 
   "UNIQUE(NAME, TYPE), \n"+
   "PRIMARY KEY(ID));";

   ConnectionInfo conInfo=null;

   /** */
   public SQLBookmarks() 
      throws SQLException {
      log.writeDebug("Initializing SQLBookmarks...");

      ConnectionFactory connectionFactory=ConnectionFactory.getInstance();
      conInfo=connectionFactory.newInternalConnection();

      connection=conInfo.getConnection();

      initialize();
      migrate();
   }   

   /** */
   public void addListener(SQLBookmarkListener listener) {
      listeners.add(listener);
   }

   /** */
   public void removeListener(SQLBookmarkListener listener) {
      listeners.remove(listener);
   }

   public void fireEvent(SQLBookmarkEvent evt) {
      int size=listeners.size();
      for (int i=0; i<size; i++) {
         SQLBookmarkListener listener=(SQLBookmarkListener)listeners.get(i);
         listener.bookmarkEvent(evt);
      }
   }

   /** */
   private void initialize() {
      log.writeDebug(2, "Initializing SQLBookmarks...");
      // if this is a brand new db, then we have to 
      // create the table
      String sql="select count(*) from sql_bookmarks";

      boolean sqlBookmarksExists=false;
      int sqlBookmarksRows=-1;

      synchronized(connection) {
         Statement state=null;
         ResultSet rs=null;
         try {
            state=connection.createStatement();
            rs=state.executeQuery(sql);
            
            if (rs.next()) {
               sqlBookmarksExists=true;
               sqlBookmarksRows=rs.getInt(1);
            }
         } catch (Exception ex) {
            log.writeError(1, "Error getting sql log count...", ex);
         } finally {
            close(rs);
            close(state);
         }
      }

      if (sqlBookmarksExists)
         log.writeDebug("SQL Bookmarks has "+sqlBookmarksRows+" rows");
      
      if (!sqlBookmarksExists) {
         log.writeDebug("SQL Bookmarks does not exist, creating it with \n"+
                        sqlBookmarksDDL);
         // create it.
         synchronized(connection) {
            Statement state=null;
            try {
               state=connection.createStatement();
               state.executeUpdate(sqlBookmarksDDL);
            } catch (Exception ex) {
               log.writeError(1, "Error creating sql log.", ex);
            } finally {
               close(state);
            }
         }
      }
      log.writeDebug(2, "SQL Bookmarks initialized.");
   }

   /** Migrates bookmarks that currently exist from the properties file
    * into the database. */
   private void migrate() {
      EProperties props=DBSession.getGlobalProperties();
      EProperties savedSQL=props.getProperties("savedSQL");
      if (savedSQL == null || savedSQL.size() == 0)
         return;
      log.writeDebug(2, "Migrating old bookmarks to SQLBookmarks db.");

      Vector v=savedSQL.getKeys(); 
      for (int i=0; i<v.size(); i++) {
         String name=v.get(i).toString();
         String sql=savedSQL.getString(name);
         addBookmark(name, sql);
      }

      // delete old bookmarks
      props.remove("savedSQL");
      props.put("oldSavedSQL", savedSQL);
      try {
         props.save();
      } catch (Exception ex) {}
   }

   /** */
   public Connection getConnection() {
      if (conInfo != null)
         return conInfo.getConnection();
      return null;
   }

   /** If there is an error in the file system, or the driver is not
    * available, or something - SQLBookmarks may not be active.  But DataBrowser
    * would still be functional.  So - we use this method to control
    * UI items that should be ignored when sqllog is not available. */
   public static boolean available() {
      if (_instance == null)
         return false;
      return true;
   }

   /** */
   public static void startup()
      throws SQLException {
      if (_instance == null) {
         synchronized (SQLBookmarks.class) {
            if (_instance == null) {
               _instance=new SQLBookmarks();
            }
         }
      }
   }

   /** */
   public static SQLBookmarks getInstance() {
      return _instance;
   }
   
   /** */
   public void addBookmark(String name, String sql) {
      addBookmark(name, "BOOKMARK", sql);
   }

   /** */
   public void addBookmark(String name, String type, String sql) {
      log.writeDebug(4, "SQLBookmarks.addBookmark()");

      DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date now=new Date();
      
      sql=StringUtil.replace("'", "''", sql);
      name=StringUtil.replace("'", "''", name);

      String insertSql=
      "insert into sql_bookmarks (id, name, type, last_update, sql) "+
      "values \n"+
      "('"+(new GUID()).toString()+"', '"+name+"', '"+type+"', "+

      " '"+df.format(now)+"', '"+sql+"')";

      String updateSql=
      "update sql_bookmarks set sql='"+sql+"', \n"+
      "last_update='"+df.format(now)+"' \n"+
      "where name='"+name+"'";

      synchronized(connection) {
         Statement state=null;
         try {
            state=connection.createStatement();

            int rows=state.executeUpdate(updateSql);

            if (rows < 1) {
               log.writeDebug(4, "Bookmark update modified "+rows+" rows.  inserting.");
               state.executeUpdate(insertSql);
            }
         } catch (Exception ex) {
            log.writeError(1, "update SQL:\n"+updateSql);
            log.writeError(1, "insert SQL:\n"+insertSql);
            log.writeError(1, "Error inserting into bookmarks.", ex);
         } finally {
            close(state);
         }
      }

      fireEvent(new SQLBookmarkEvent(type));
   }

   /** */
   public void deleteBookmark(String name) {
      deleteBookmark(name, "BOOKMARK");
   }

   /** */
   public void deleteBookmark(String name, String type) {
      log.writeDebug(4, "SQLBookmarks.deleteBookmark("+name+", "+type+")");

      name=StringUtil.replace("'", "''", name);

      String deleteSql=
      "delete from sql_bookmarks where name='"+name+"' and type='"+type+"'";

      synchronized(connection) {
         Statement state=null;
         try {
            state=connection.createStatement();

            int rows=state.executeUpdate(deleteSql);
         } catch (Exception ex) {
            log.writeError(1, "Delete SQL:\n"+deleteSql);
            log.writeError(1, "Error deleting sql bookmark.", ex);
         } finally {
            close(state);
         }
      }

      fireEvent(new SQLBookmarkEvent(type));
   }

   /** */
   public String getBookmark(String name, String type) {
      String selectSql=
      "select sql from sql_bookmarks \n"+
      "where type='"+type+"' and name='"+name+"'";

      String sql=null;

      Statement state=null;
      ResultSet rs=null;
      try {
         state=connection.createStatement();
         rs=state.executeQuery(selectSql);
                
         if (rs.next()) {
            sql=rs.getString("sql");
         }
      }
      catch (Exception ex) {
         log.writeError(2, "Error refreshing sqllog view", ex);
      } finally {
         close(rs);
         close(state);
      }
      return sql;      
   }

   /** */
   public String getBookmark(String name) {
      return getBookmark(name, "BOOKMARK");
   }

   /** */
   public String getScratchSQL(String dbname) {
      return getBookmark(dbname, "SCRATCH");
   }
   
   /** */
   public void saveScratchSQL(String dbname, String sql) {
      addBookmark(dbname, "SCRATCH", sql);
   }

   /** */
   public List getBookmarkNames() {
      List tmpData=null;

      String sql=
      "select * from sql_bookmarks \n"+
      "where type='BOOKMARK' \n"+
      "order by last_update desc";
      
      Statement state=null;
      ResultSet rs=null;
      tmpData=new ArrayList();
      try {
         state=connection.createStatement();
         rs=state.executeQuery(sql);
                
         while (rs.next()) {
            tmpData.add(rs.getString("name"));
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