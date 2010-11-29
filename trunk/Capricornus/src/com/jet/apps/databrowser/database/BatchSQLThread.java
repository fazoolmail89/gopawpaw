package com.jet.apps.databrowser.database;

import java.sql.*;
import java.awt.*;
import java.util.*;

// used for parsing comments.
import java.io.*;

import com.jet.utils.ui.*;
import com.jet.utils.exception.*;
import com.jet.utils.StringUtil;

import com.jet.log.Logger;

import javax.swing.JOptionPane;

import com.jet.utils.GUID;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.sqllog.*;

/*
 * $Log: BatchSQLThread.java,v $
 * Revision 1.7  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.6  2007/02/18 18:01:29  bemocvs
 * Added SQLLog calls
 *
 * Revision 1.5  2004/10/07 16:00:39  bemocvs
 * SQLMigrate, new text editor.
 *
 * Revision 1.4  2003/11/15 16:35:46  bemocvs
 * pre 3.2.2 db release.
 *
 * Revision 1.3  2003/08/21 20:25:45  bemocvs
 * Fixes for comments in SQL, save
 *
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.2  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.5  2002/03/08 12:09:03  bemocvs
 * Fixed buttons on batch update by removing progress watcher window
 * before throwing up any kind of dialog boxes.
 *
 * Revision 1.4  2001/11/01 00:11:16  bemocvs
 * removal of bad import.
 *
 * Revision 1.3  2001/08/14 00:21:47  bemocvs
 * Put some things on the event thread.
 *
 */

/**
 * Executes a number of sql statements in a batch.
 *
 * @author Paul Bemowski
 */
public class BatchSQLThread extends Thread implements Logger, SQLProcess
{
   private boolean isRunning=false;
   private String sql=null;
   private Connection conn=null;
   private ConnectionInfo conInfo=null;

   private Statement state=null;

   private ProgressFrame pf=null;

   private int affectedRows=0;

   private DBSession dbSession=null;

   private boolean shutdown=false;

   private static int threadCount=0;

   /**
    *
    */
   public BatchSQLThread(DBSession session, String s) {
      this.sql=s;
      this.dbSession=session;
      setName("BatchSQLThread-"+threadCount++);

      conInfo=dbSession.getConnectionInfo();

      conn=conInfo.getConnection();

      pf=new ProgressFrame(session.getParent());
      pf.setType(pf.SINGLE);
   }

   /**
    *
    */
   public void stopSql()
      throws SQLException 
   {
      shutdown=true;
      if (state != null) {
         // Attempt to kill
         state.cancel();
      }
   }

   public void killSql() {}

   public void showProgressFrame() {
      pf.show();
   }

   /** */
   public boolean isRunning() {return isRunning;}

   /**
    *
    */
   public void run()
   {
      isRunning=true;
      boolean success=false;

      boolean updateTree=false;

      String batchId=(new GUID()).toString();

      String currentStatement=null;
      try {
         dbSession.startSQL(this);
         class shower implements Runnable {
            public void run() {pf.show();}
         }
         Swinger.invokeLaterIfNecessary(new shower());
         // parse out the sql into multiple statements.
         
         log.writeDebug(8, "BatchSQL executing: \n"+sql);
         // Strip basic comments, lines begining with #
         String noComment=stripComments(sql);
         
         Vector statements=new Vector();
         // FIXME: This does not account for SQL strings that 
         // contain ';'!!
         // pab, 10/5/2004. Atlanta.
         StringTokenizer st=new StringTokenizer(noComment, ";", false);
         while (st.hasMoreTokens()) {
            String sqlStatement=st.nextToken();
            sqlStatement=sqlStatement.trim();
            if (!StringUtil.empty(sqlStatement))
               statements.addElement(sqlStatement);
         }

         int stateCount=statements.size();

         pf.setPrimaryRange(0, stateCount);

         for (int i=0; i<stateCount; i++)
            log.writeDebug(""+statements.elementAt(i));

         // Execute each statement
         for (int i=0; i<stateCount; i++) {
            if (shutdown) 
               break;

            currentStatement=(String)statements.elementAt(i);
            class updater implements Runnable{
               String s;
               int i;
               public updater(String s, int i) {this.s=s; this.i=i;}
               public void run() {
                  pf.setPrimaryProgress(i, s);
               }
            }
            Swinger.
            invokeLaterIfNecessary(new updater("Executing statement "+i+
                                               " of "+stateCount, i));

            String cstlc=currentStatement.toLowerCase();
            if (cstlc.startsWith("alter") ||
                cstlc.startsWith("drop") ||
                cstlc.startsWith("create")) 
               updateTree=true;

            state=null;
            int rows = -1;
            try {
               log.writeDebug ("About to execute "+currentStatement);
               state=conn.createStatement();
               rows=state.executeUpdate(currentStatement);
               affectedRows=affectedRows+rows;
               success=true;
               log.writeDebug ("SQL completed");
            }
            finally {
               try {
                  if (state != null) {
                     //log.writeDebug (VERBOSE, "Attmpting to close statement.");
                     state.close();
                     // log.writeDebug (VERBOSE, "Statement closed.");
                  }
               }
               catch (Exception ex) {
                  log.printStackTrace(ex);
               }

               SQLLog sqllog=SQLLog.getInstance();
               if (sqllog != null) {
                  sqllog.log(conInfo, batchId, (success ? "SUCCESS":"FAIL"), 
                             rows, currentStatement);
               }
            } // end outer try
         } // end for loop

         //JOptionPane.showMessageDialog(owner, "Successfully executed "+
         //                              stateCount+" SQL commands.");
         pf.setVisible(false);
         pf.dispose();
         MessageWindow.showMessage(dbSession.getParent(), 
                                   "Successfully executed "+
                                   stateCount+" SQL statements.");
      }
      catch (SQLException ex) {
         log.printStackTrace(ex);
         if (pf != null) {
            pf.setVisible(false);
            pf.dispose();
         }
         SQLExceptionDebugger.debug(dbSession.getParent(), ex, 
                                    currentStatement);
      }
      catch (Exception ex) {
         if (pf != null) {
            pf.setVisible(false);
            pf.dispose();
         }
         log.printStackTrace(ex);
         ExceptionDebugger.debug(dbSession.getParent(), ex);
      }
      finally {
         isRunning=false;
         pf.setVisible(false);
         pf.dispose();
         pf=null;
         log.writeDebug ("Shutting down the BatchSQLThread");
         
         if (updateTree) {
            dbSession.updateTreeModel();
         }

         dbSession.finishedSQL(affectedRows);
      }
   }


   //////////////////////////////////////////////////////////////////////
   /**
    * Very poor comment stripper, ignores lines that begin with '#'
    */
   String stripComments(String s) 
      throws IOException {
      StringBuffer stripped=new StringBuffer();

      boolean inBackQuote=false;
      boolean inForwardQuote=false;
      boolean inDoubleQuote=false;

      boolean inFormalComment=false; // /* */
      boolean inLineComment=false; // -- or #

      char chars[]=s.toCharArray();
      for (int i=0; i<chars.length; i++) {
         boolean skipChar=false;

         if (chars[i] == '\'')
            inBackQuote = !inBackQuote;

         if (chars[i] == '`')
            inForwardQuote = !inForwardQuote;
         
         if (chars[i] == '\"') 
            inDoubleQuote = !inDoubleQuote;

         if (chars[i] == '/' && chars.length > i &&
             chars[i+1] == '*' && 
             !inBackQuote && !inForwardQuote &&! inDoubleQuote)
            inFormalComment=true;

         if (chars[i] == '/' && i > 0 &&
             chars[i-1] == '*' && inFormalComment){
            inFormalComment=false;skipChar=true;
         }

         if (chars[i] == '-' && chars.length > i &&
             chars[i+1] == '-' && 
             !inBackQuote && !inForwardQuote &&! inDoubleQuote)
            inLineComment = true;

         if (chars[i] == '#' && i > 0 &&
             (chars[i-1] == '\r' || chars [i-1] == '\n') && 
             !inBackQuote && !inForwardQuote &&! inDoubleQuote)
            inLineComment = true;


         if (chars[i] == '\n' && inLineComment) {
            inLineComment=false;
         }

         if (!inLineComment && !inFormalComment && !skipChar) {
            stripped.append(chars[i]);
         }
      }

      return stripped.toString();
   }  
}

