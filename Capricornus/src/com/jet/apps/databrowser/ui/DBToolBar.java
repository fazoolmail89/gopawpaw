package com.jet.apps.databrowser.ui;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.ui.misc.*;

import com.jet.apps.databrowser.sqllog.*;

import com.jet.apps.databrowser.editor.actions.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

import com.jet.utils.icons.*;
import com.jet.utils.ui.*;
import com.jet.log.Logger;

/**
 *
 */
public class DBToolBar extends JToolBar 
   implements ActionListener, Observer, Logger, DBEvents
{
   JButton backButton=null;
   JButton forwardButton=null;
   JButton queryButton=null;
   JButton updateButton=null;
   JButton batchButton=null;
   JButton clearButton=null;
   JButton stopButton=null;
   JButton killButton=null;
      
   JButton commitButton=null;
   JButton rollbackButton=null;
   JToggleButton autocommitButton=null;

   JToggleButton sqllog=null;

   JLabel uncommittedStatements=null;

   DBSession session=null;
   DataBrowser databrowser=null;

   /** */
   public DBToolBar(DBSession session, DataBrowser databrowser) {
      this.session=session;
      this.databrowser=databrowser;
      session.addObserver(this);

      setFloatable(false);

//       backButton=new MouseoverButton(IconManager.getInstance().
//                                      getIcon("button_back"));

//       backButton.setActionCommand("back");
//       backButton.setToolTipText("Back (Alt-b)");
//       backButton.addActionListener(this);
//       backButton.setMargin(new Insets(0, 0, 0, 0));         
//       this.add (backButton);

//       forwardButton=new MouseoverButton(IconManager.getInstance().
//                                         getIcon("button_forward"));
//       forwardButton.setActionCommand("forward");
//       forwardButton.setToolTipText("Forward (Alt-f)");
//       forwardButton.addActionListener(this);
//       forwardButton.setMargin(new Insets(0, 0, 0, 0));
//       this.add (forwardButton);

      Insets insets=new Insets(1, 1, 1, 1);

      JButton button=null;

      button=new JButton(new NewEditorAction(databrowser));
      button.setMargin(insets);
      this.add(button);

      FileOpenAction fileOpenAction=new FileOpenAction();
      button=new JButton(fileOpenAction);
      button.setMargin(insets);
      this.add (button);

      button=new JButton(new FileSaveAction());
      button.setMargin(insets);
      this.add (button);

      button=new JButton(new FileSaveAsAction());
      button.setMargin(insets);
      this.add (button);

      this.addSeparator();
      // this.addSeparator();

      queryButton=new JButton(new ExecuteQueryAction(session));
      queryButton.setMargin(insets);
      this.add (queryButton);

      updateButton=new JButton(new ExecuteUpdateAction(session));
      updateButton.setMargin(insets);
      this.add (updateButton);

      batchButton=new JButton(new ExecuteBatchAction(session));
      batchButton.setMargin(insets);
      this.add (batchButton);

      this.addSeparator();


      clearButton=new JButton(new ClearQueryAction(session));
      clearButton.setMargin(insets);
      this.add (clearButton);

      StopSqlAction stopSqlAction=new StopSqlAction(session);
      // session.addObserver(stopSqlAction);
      stopButton=new JButton(stopSqlAction);
//       stopButton.setActionCommand("stop");
//       stopButton.addActionListener(this);
      stopButton.setMargin(insets);
      // stopButton.setEnabled(false);
      // stopButton.setMargin(insets);
      this.add (stopButton);

      this.addSeparator();

      autocommitButton=
      new JToggleButton(new ToggleAutocommitAction(session, databrowser));
      autocommitButton.setActionCommand("autocommit");
      autocommitButton.setToolTipText("Toggle Auto Commit Mode");
      autocommitButton.addActionListener(this);
      autocommitButton.setMargin(insets);
      this.add (autocommitButton);

      commitButton=new JButton(new CommitAction(session));
      commitButton.setActionCommand("commit");
      commitButton.setToolTipText("Commit Changes");
      commitButton.addActionListener(this);
      commitButton.setMargin(insets);
      this.add (commitButton);
         
      rollbackButton=new JButton(new RollbackAction(session));
      rollbackButton.setActionCommand("rollback");
      rollbackButton.setToolTipText("Rollback Changes");
      rollbackButton.addActionListener(this);
      rollbackButton.setMargin(insets);
      this.add (rollbackButton);

      uncommittedStatements=new JLabel("[0]");
      uncommittedStatements.setToolTipText("Number of Uncommitted Statements");
      uncommittedStatements.setForeground(Color.blue);
      this.add(uncommittedStatements);

      this.addSeparator();
      this.addSeparator();

      sqllog=new JToggleButton("SQL Log");
      sqllog.setToolTipText("Show/Hide the SQL Log Tab");
      sqllog.addActionListener(this);
      sqllog.setActionCommand("sqllog");
     
      sqllog.setSelected(true);
      if (!SQLLog.available()) 
         sqllog.setEnabled(false);

      this.add(sqllog);

      this.addSeparator();
      this.addSeparator();
      
      JButton qhelp=new JButton(new QuickHelpAction());
      qhelp.setMargin(insets);
      // qhelp.setActionCommand("toggleHelp");
      //qhelp.setToolTipText("Toggle QuickHelp (F1)");
      //qhelp.addActionListener(this);
      // qhelp.setMargin(insets);
      this.add (qhelp);

      this.addSeparator();
      this.addSeparator();

      updateToolbar();
   }
         
   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("back")) {         
         if (session.getHistory().hasPrev()) {
            session.setEditorText(session.getHistory().getPrev());
         }
      }
      else if (action.equals("forward")) {
         if (session.getHistory().hasNext()) {
            session.setEditorText(session.getHistory().getNext());
         }
      }
      else if (action.equals("stop")) {
        // stopSqlProcessHandler();
      } else if (action.equals("sqllog")) {
         if (sqllog.isSelected()) 
            databrowser.showSQLLog();
         else
            databrowser.hideSQLLog();
      }
      // updateNavButtons();
   } // end actionPerformed

   /** */
   public void updateToolbar()
   {
      if (!session.isConnected()) {
         //backButton.setEnabled(false);
         //forwardButton.setEnabled(false);
         
         queryButton.setEnabled(false);
         updateButton.setEnabled(false);
         autocommitButton.setEnabled(false);
         batchButton.setEnabled(false);
         commitButton.setEnabled(false);
         rollbackButton.setEnabled(false);
         uncommittedStatements.setEnabled(false);
      }
      else
      { // We seem to be connected to something.
//          if (session.getHistory().hasPrev())
//             backButton.setEnabled(true);
//          else 
//             backButton.setEnabled(false);

//          if (session.getHistory().hasNext())
//             forwardButton.setEnabled(true);
//          else
//             forwardButton.setEnabled(false);
         
         // we can always query
         queryButton.setEnabled(true);

         if (session.isReadOnly()) {
            updateButton.setEnabled(false);
            batchButton.setEnabled(false);
            autocommitButton.setEnabled(false);
            commitButton.setEnabled(false);
            rollbackButton.setEnabled(false);
         }
         else {
            updateButton.setEnabled(true);
            batchButton.setEnabled(true);

            autocommitButton.setEnabled(true);

            boolean autocommit=true;
            try {
               ConnectionInfo connInfo=session.getConnectionInfo();
               autocommit=connInfo.getAutocommit();
            }
            catch (Exception ex) {
               log.printStackTrace(ex);
               log.writeError("Exception getting autocommit, assuming true.");
               autocommit=true;
            }

            if (autocommit) {
               autocommitButton.setSelected(true);
               commitButton.setEnabled(false);
               rollbackButton.setEnabled(false);
               uncommittedStatements.setEnabled(false);
            }
            else
            {
               autocommitButton.setSelected (false);
               commitButton.setEnabled(true);
               rollbackButton.setEnabled(true);
               uncommittedStatements.setEnabled(true);

               // update uncommitted statements
               uncommittedStatements.
               setText("["+session.getUncommittedStatements()+"]");
            }
         }
      }
   }

   void busy() {
      queryButton.setEnabled(false);
      updateButton.setEnabled(false);
      batchButton.setEnabled(false);
      for (int i=0; i<pluginActions.size(); i++) {
         JButton button=(JButton)pluginActions.elementAt(i);
         button.setEnabled(false);
      }
   }

   void done() {
      updateToolbar();
      //queryButton.setEnabled(true);
      //updateButton.setEnabled(true);
      //batchButton.setEnabled(true);
      for (int i=0; i<pluginActions.size(); i++) {
         JButton button=(JButton)pluginActions.elementAt(i);
         button.setEnabled(true);
      }
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent) obj;
      
      int code=event.getCode();
      switch (code) {
         case (DATABASE_CONNECT):
            ConnectionInfo ci=session.getConnectionInfo();
            ci.addObserver(this);
         case (DATABASE_DISCONNECT):
            updateToolbar();
            break;
         case (SQL_STARTED): 
            //sqlStarted();
            break;
         case (SQL_FINISHED): 
            // sqlFinished();
            break;
         case (BUSY_EVENT): 
            busy();
            break;
         case (DONE_EVENT): 
            done();
            break;
         case (CONNECTION_STATE): 
            updateToolbar();
            break;
         case (UPDATE_COMPLETE): 
         updateToolbar();  // need to update uncommitted statements!
         break;

         default: 
      }
   }

   ///////////////////////////  Plugin Support  ////////////////////////////
   private Vector pluginActions=new Vector();
   /** */
   public void addPluginAction(Action a) {
      JButton button=new JButton(a);
      pluginActions.add(button);
      add(button);
   }

   /** */
   public void removePluginActions() {
      int size=pluginActions.size();
      for (int i=0; i<size; i++) {
         JButton button=(JButton)pluginActions.elementAt(i);
         remove(button);
      }
      pluginActions=new Vector();
   }   
} // End toolbar
