package com.jet.apps.databrowser.model;

import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Vector;

import java.sql.*;

import javax.swing.JFrame;

import javax.swing.text.BadLocationException;
// import com.jet.jedit.SyntaxDocument;
import com.jet.apps.databrowser.editor.SyntaxDocument;
import com.jet.apps.databrowser.ui.DataBrowser;

import com.jet.database.SchemaUtil;

import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.event.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.PBE;
import com.jet.utils.StringUtil;
import com.jet.utils.VectorUtil;
import com.jet.utils.ui.History;
import com.jet.utils.ui.MessageWindow;

import com.jet.apps.databrowser.sqllog.*;

import com.jet.log.Logger;


/*
 * $Log: DBSession.java,v $
 * Revision 1.18  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.17  2007/02/18 17:52:08  bemocvs
 * fixed npe on shutdown, added SQLLog shutdown
 *
 * Revision 1.16  2007/02/15 11:36:09  bemocvs
 * Fixes for oracle number types.
 *
 * Revision 1.15  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.14  2006/12/07 14:53:56  bemocvs
 * DataEditor refactor
 *
 * Revision 1.13  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 * Revision 1.12  2005/07/30 12:55:47  bemocvs
 * Fixed threaing problem with DataEditor, max+1
 *
 * Revision 1.11  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.10  2004/10/21 20:56:04  bemocvs
 * 3.3.0 work
 *
 * Revision 1.9  2004/10/19 21:55:06  bemocvs
 * working
 *
 * Revision 1.8  2004/10/07 21:11:38  bemocvs
 * Editor actions
 *
 * Revision 1.7  2003/09/09 10:25:39  bemocvs
 * Bug fixes.
 *
 * Revision 1.6  2003/09/01 11:01:27  bemocvs
 * fixed delete, save as
 *
 * Revision 1.5  2003/08/24 15:03:01  bemocvs
 * Fixed null pointer
 *
 * Revision 1.4  2003/08/21 20:25:45  bemocvs
 * Fixes for comments in SQL, save
 *
 * Revision 1.3  2003/08/21 16:30:37  bemocvs
 * autocommit, sql editing
 *
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.12  2002/08/19 15:38:11  bemocvs
 * xxx
 *
 * Revision 1.11  2002/08/01 10:31:40  bemocvs
 * fixed problem causing all result sets not to be closed on a disconnect().
 *
 * Revision 1.10  2002/08/01 10:26:59  bemocvs
 * fixed problem causing all result sets not to be closed on a disconnect().
 *
 * Revision 1.9  2002/06/20 17:30:49  bemocvs
 * fixed typo
 *
 * Revision 1.8  2002/06/20 16:57:08  bemocvs
 * ignoring trailing semicolon on sql.
 *
 * Revision 1.7  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.6  2002/05/17 09:26:16  bemocvs
 * added help url method.
 *
 * Revision 1.5  2002/05/04 18:50:43  bemocvs
 * Working
 *
 * Revision 1.4  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.3  2002/04/21 20:06:40  bemocvs
 * db3 work
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * Represents a broad model of a single DataBrowser session.  This
 * object stores the state of the session, and is displayed by the
 * DataBrowser ui object.  There is a 1-1 relationship between
 * DataBrowser ui objects and DBSessions.  <p>
 *
 * The DataBrowser listens to the DBSession for property changes, 
 * and reflects the changes accordingly.
 *
 * @author J Enterprise Technologiesxs
 */
public class DBSession extends Observable
   implements SessionPropertyKeys, Logger, DBEvents {
   /** This is the global eproperties object. */
   static EProperties globalProps=null;

   /** This is the Password Based Encryption object. */
   static PBE pbe=null;

   /** 
    * This is the default password for encryption.  It must not change
    * version to version, or encrypted properies may become unusable. <p>
    * 
    * I get that this is totally insecure, ok.  I get it.  But if you 
    * have a better idea for a default password, let me know 
    * (bemowski@yahoo.com). */
   private static final String defaultEncryptionPassword="1zsax5lj@(~~";

   /** A Password Based Encryption object. */
   private static PBE defaultPBE=null;

   /** This attempts to count the number of uncommitted statements that
    * have been executed on this connection. */
   private int uncommittedStatements=0;

   /** This is the last directory visited by 'file->open' */
   protected static File lastSqlDirectory=null;

   /** This is the last conection directory visited by 'database-open'*/
   protected static File lastConDir=null;

   /** ConnectionInfo for the current session. */
   protected ConnectionInfo connectionInfo=null;

   /** */
   protected TreePanelModel treePanelModel=null;

   /** This is an array list holding pointers to all of the active
    * RSPanelResult objects.  Each of these is the model for a 
    * RSTablePanel view object.
    */
   protected ArrayList resultModels=new ArrayList();

   /** */
   protected History history=new History(20);

   /** I hate to do this, but we need it for modal dialogs inside
    * of exception handling. */
   protected DataBrowser databrowser=null;

   /** */
   static {
      try {defaultPBE=new PBE(defaultEncryptionPassword);}
      catch (Exception ex) {
         throw new RuntimeException ("Error creating default PBE");
      }
   }

   /** */
   public DBSession() {
      treePanelModel=new TreePanelModel(this);

      Vector v=(Vector)globalProps.get("history");
      if (!VectorUtil.empty(v))
         history.initFromVector(v);
   }

   //////////////////////////////////////////////////////////////////

   /** */
   public void setParent(DataBrowser parent) {
      this.databrowser=parent;
   }

   /** Returns the history vector. */
   public History getHistory() {return history;}

   /** */
   public JFrame getParent() {return databrowser;}

   /** */
   //public DataBrowser getDatabrowser() {return databrowser;}

   /** */
   public void setEditorText(String text, String filename) {
      databrowser.findActiveEditor().setText(text);

//       try {
//          editorDocument.remove(0, editorDocument.getLength());
//          editorDocument.insertString(0, text, null);

//          // Attempting to set the cursor to the top of the document.
//          // editorDocument.insertString(0, " ", null); 
//          // doesn't work

//          if (filename != null) {
//             setChanged();
//             notifyObservers(new DBEvent(FILE_OPEN, filename));
//          } else {
//             setChanged();
//             notifyObservers(new DBEvent(FILE_CLOSED));
//          }
//       } catch (BadLocationException ex) {
//          // this should be impossible
//          log.writeError(1, "Error setting text", ex);
//       }
   }

   /** */
   public void setEditorText(String text) {
      setEditorText(text, null);
   }

   /** */
   public void setCurrentFile(String filename) {
      setChanged();
      notifyObservers(new DBEvent(FILE_OPEN, filename));
   }

   /** */
   public String getEditorText() {
      return getAllEditorText();
//       String s=null;
//       try {
//          if (editorPane != null) {
//             s=editorPane.getSelectedText();
//             if (s == null || 
//                 s.trim().length() < 2) {
//                s=null; 
//             }
//          }
         
//          if (s == null) {
//             try {
//                editorDocument.readLock();
//                s=editorDocument.getText(0, editorDocument.getLength());
//             } finally {
//                editorDocument.readUnlock();            
//             }
//          }
//       } catch (BadLocationException ex) {
//          log.writeError(1, "Error getting editor text.", ex);
//       }
//       return s;
   }

   /** Returns ALL text -- this is for saving, not executing. */
   public String getAllEditorText() {
//       String s=null;
//       try {
//          editorDocument.readLock();
//          s=editorDocument.getText(0, editorDocument.getLength());
//       } catch (BadLocationException ex) {
//          log.writeError(1, ex);
//       } finally {
//          editorDocument.readUnlock();            
//       } 
//       return s;
      return databrowser.findActiveEditor().getText();
   }

   
   /** */
   public void openNewFile(String filename) {
      databrowser.openFileWithNewEditor(filename);
   }


   /** This method is called by the init script, and should never be
    * called again.  */
   public static final void setGlobalProperties(EProperties p) {
      if (globalProps == null)
         globalProps=p;
      else
         throw new RuntimeException("Global Properties should only be "+
                                    "set once!!");
   }

   /** */
   public static final EProperties getGlobalProperties() {
      return globalProps;
   }

   /** */
   public static final EProperties getProperties(String key) {
      return globalProps.getProperties(key);
   }
   
   /** */
   public static final void save() 
      throws IOException {
      globalProps.save();
   }

   /** */
   public static final void setPBE(PBE p) {pbe=p;}

   /** */
   public static PBE getPBE() {return pbe;}

   /** */
   public static PBE getDefaultPBE() {return defaultPBE;}
   
   /** */
   public static final String getDefaultEncryptedPassword() {
      return defaultPBE.encrypt(defaultEncryptionPassword);
   }
   
   /** */
   public static final boolean isDefaultEncryptedPassword(String s) {
      return defaultPBE.isPassword(s);
   }

   /** */
   public static final boolean isCurrentDefault() {
      return pbe.isPassword(defaultEncryptionPassword);
   }

   /** */
   public static void setHelpURL(URL url) {
      UIModel.setHelpURL(url);
   }

   /** */
   public static File getLastSqlDirectory() {return lastSqlDirectory;}
   
   /** */
   public static void setLastSqlDirectory(File s) {lastSqlDirectory=s;}

   /** */
   public static File getLastConnectionDirectory() {return lastConDir;}
   
   /** */
   public static void setLastConnectionDirectory(File d) {lastConDir=d;}

   /** */
   public boolean isConnected() {
      if (connectionInfo != null)
         if (connectionInfo.getConnection() != null)
            return true;
      return false;
   }

   /** */
   public boolean isReadOnly() {
      return connectionInfo.isReadOnly();
   }

   /** This method is called from the controllers, requesting that
    * the session attempt to connect to a particular database. */
   public ConnectThread connect(ConnectionInfo info) {
      connectionInfo=info;
      log.writeDebug(1, "Connect!!!: "+info);

      ConnectThread ct=new ConnectThread(this, info);
      ct.start();
      return ct;
   }

   /** */
   public synchronized void disconnect() {
      try {
         // note, loop backwards because the call to 
         // removeQueryForModel will modify the resultModels vector, 
         // removing objects from it.
         // PAB, 08/01/2002, 11:50 am.  London.
         log.writeDebug("Removing "+resultModels.size()+" table models");
         for (int i=resultModels.size()-1; i>=0; i--) {
            RSPanelModel model=(RSPanelModel)resultModels.get(i);
            removeQueryForModel(model);
         }
         
         if (connectionInfo != null) {
            connectionInfo.close();

            //Connection con=connectionInfo.getConnection();
            //if (con!= null)
            //   con.close();
            connectionInfo.deleteObservers();
            try {
               String scratch=databrowser.getScratchEditorText();
               SQLBookmarks bookmarks=SQLBookmarks.getInstance();
               if (bookmarks != null && 
                   scratch != null) {
                  bookmarks.saveScratchSQL(connectionInfo.getName(), scratch);
               }
            } catch (Exception exx) {
               log.writeError(1, "Error saving scratch sql", exx);
            }
      
            connectionInfo=null;
         }
      } catch (Exception ex) {
         log.writeError(1, "Error disconnecting. ", ex);
      }
      
      setChanged();
      notifyObservers(new DBEvent(DATABASE_DISCONNECT, "Disconnected."));
   }

   /** This method is called from the ConnectThread telling the session
    * that it has successfully connected to a database. */
   public void setConnection(ConnectionInfo ci) {
      connectionInfo=ci;

      // tell the 'sub models' that the connection was successfult
      setStatus("Loading TreeView...");
      treePanelModel.setConnectionInfo(connectionInfo);
      
      setChanged();
      notifyObservers(new DBEvent(DATABASE_CONNECT, "Connected."));
   }

   /** */
   public ConnectionInfo getConnectionInfo() {
      return connectionInfo;
   }

   /** */
   public DatabaseUtil getDatabaseUtil() {
      return connectionInfo.getDatabaseUtil();
   }

   /** */
   public SchemaUtil getSchemaUtil() {
      return connectionInfo.getSchemaUtil();
   }


   /** */
   public TreePanelModel getTreePanelModel() {return treePanelModel;}

   /** */
   public static final void shutdown() {
      log.writeDebug("Shutdown triggered, saving properties");
      try {
         getGlobalProperties().save();
      } catch (Exception ex) {ex.printStackTrace(System.err);}

      // save shit, etc.
      ConnectionFactory.getInstance().shutdown();
   }

   /** */
   public void updateTreeModel() {
      treePanelModel.reload();
   }
   ///////////////////////////////////////////////////////////////////////
   /** Used by internal worker threads to inform watchers of this
    * model that it is busy updating itself. */
   public void busy() {
      setChanged();
      notifyObservers(new DBEvent(BUSY_EVENT));
   }

   /** Used to drop out of the busy state. */
   public void done(int statements) {
      if (connectionInfo != null &&
          connectionInfo.getConnection() != null) {
         setStatus(""+connectionInfo.getName());
      } else {
         setStatus("Not connected.");
      }
      try {
         if (connectionInfo != null &&
             !connectionInfo.getAutocommit()) 
            uncommittedStatements=uncommittedStatements+statements;
      } catch (SQLException ex) {
         sqlException(ex, "Error getting autocommit state.");
      }

      setChanged();
      notifyObservers(new DBEvent(DONE_EVENT));
   }

   /** */
   public void done() {
      done(0);
   }

   /** Updates state string. */
   public void setStatus(String s) {
      setChanged();
      notifyObservers(new DBEvent(STATUS_STRING_CHANGE, s));
   }

   /** Executes a query. */
   public void executeQuery() {
      executeQuery(getEditorText()); 
   }

   /** */
   public void executeQuery(String query) {
      RSPanelModel model=new RSPanelModel(this);
      executeQuery(query, model);
   }

   /** */
   public void executeQuery(String query, RSPanelModel model) {
      // log.writeDebug("executing '"+query+"'");
      if (StringUtil.empty(query))
         return;

      String lower=query.toLowerCase();
      // This logic is failing for queries that start with
      // something like: 
      // (select * from...
      // the initial '(' throws it off.  So we're going to strip
      // down to alphanumeric here.  Bemo, 21-oct-04.  Atl.
      lower=StringUtil.alphaNumeric(lower);      

      lower=lower.trim();

      if (!lower.startsWith("select")) {
         boolean cont=
         MessageWindow.showWarningOption(databrowser, 
                                         "Query does not begin with 'select' "+
                                         "sql.  Continue?");
         if (!cont)
            return;
      }

      model.setQuery(query.trim());

      if (!resultModels.contains(model)) {
         resultModels.add(model);

         setChanged();
         DBEvent event=new DBEvent(NEW_RESULTS, model);
         notifyObservers(event);
      }
      // resultModels.add(model);
      history.addElement(query);

      QueryThread qt=new QueryThread(model);      
      startSQL(qt);
      qt.start();
   }

   /** */
   public UpdateThread executeUpdate(String sql, boolean updateGui) {
      if (sql == null) 
         return null;

      sql=sql.trim();
      if (sql.endsWith(";"))
         sql=sql.substring(0, sql.length()-1);
      
      UpdateThread ut=null;
      if (!StringUtil.empty(sql)) {
         history.addElement(sql);
         ut=new UpdateThread(this, sql, updateGui);
         ut.start();
      }

      return ut;
   }

   /** */
   public UpdateThread executeUpdate(String sql) {
      return executeUpdate(sql, true);
   }

   /** */
   public void executeUpdate() {
      String sql=getEditorText();
      executeUpdate(sql);
   }

   /** */
   public void executeBatch(String sql) {
      if (!StringUtil.empty(sql)) {
         BatchSQLThread ut=new BatchSQLThread(this, sql);
         ut.start();
      }
   }

   public void executeBatch() {
      executeBatch(getEditorText());
   }

   /** */
   public void removePanelModel(RSPanelModel rspm) {
      // remove from the list
      rspm.getTableModel().close();
      resultModels.remove(rspm);
   }

   /** */
   public void removeQueryForModel(RSPanelModel model) {
      // this will inform DataBrowser, which will call
      // ResultsTabPane.remove() which will call
      // removePanelModel above.
      setChanged();
      notifyObservers(new DBEvent(REMOVE_RESULTS, model));      
   }

   public void startSQL(SQLProcess process) {
      setChanged();
      notifyObservers(new DBEvent(SQL_STARTED, process));
   }

   public void finishedSQL(int statements) {
      done(statements);
      setChanged();
      notifyObservers(new DBEvent(SQL_FINISHED));
   }

   public void finishedSQL() {
      finishedSQL(0);
   }

   /** */
   public void updateComplete(int rows) {
      setChanged();
      notifyObservers(new DBEvent(UPDATE_COMPLETE, new Integer(rows)));
   }

   /** */
   public void sqlException(SQLException ex, String sql) {
      sqlException(ex, sql, null);
   }

   /** */
   public void sqlException(SQLException ex, String sql, RSPanelModel model) {
      if (model != null)
         removeQueryForModel(model);
      setChanged();
      notifyObservers(new SQLExceptionEvent(SQL_EXCEPTION, ex, sql));
   }

   /** */
   public void exception(Throwable t, String message) {
      setChanged();
      notifyObservers(new ExceptionEvent(EXCEPTION, t, message));
   }

   /** Sets the autocommit state */
   public void setAutocommit(boolean b) {
      try {
         connectionInfo.setAutocommit(b);
      } catch (Exception ex) {
         exception(ex, "Unable to set Autocommit to "+b);
      }
   }

   /** */
   public void commit() {
      log.writeDebug(5, "Session committing.");
      boolean commit=
      MessageWindow.showWarningOption(databrowser, 
                                      "Commit "+uncommittedStatements+
                                      "statements?");
      if (commit) {
         Connection con=connectionInfo.getConnection();
         busy();
         try {
            con.commit();
            uncommittedStatements=0;
         } catch (Exception ex) {
            exception(ex, "Unable to commit().");
         } finally {
            done(0);
         }
      }
   }

   /** */
   public void rollback() {
      log.writeDebug(5, "Session rolling back.");
      boolean rollback=
      MessageWindow.showWarningOption(databrowser, 
                                      "Rollback "+uncommittedStatements+
                                      "statements?");
      if (rollback) {
         Connection con=connectionInfo.getConnection();
         busy();
         try {
            con.rollback();
            uncommittedStatements=0;
         } catch (Exception ex) {
            exception(ex, "Unable to rollback()");
         } finally {
            done(0);
         }
      }
   }

   /** */
   public int getUncommittedStatements() {return uncommittedStatements;}
}

/*
 * This source code is the sole property of 
 * J Enterprise Technologies, Inc.
 */
