package com.jet.apps.databrowser.ui;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.text.*;

import java.util.*;
import java.io.File;
import java.sql.SQLException;


import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.plugin.*;
import com.jet.apps.databrowser.database.*;

import com.jet.apps.databrowser.ui.misc.*;
import com.jet.apps.databrowser.ui.menu.*;

import com.jet.utils.StringUtil;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.utils.ui.ExceptionDebugger;
import com.jet.utils.icons.*;

import com.jet.log.Logger;
// import com.jet.jedit.*;
import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.editor.actions.*;

import com.jet.apps.databrowser.sqllog.view.*;
import com.jet.apps.databrowser.sqllog.*;

/*
 * $Log: DataBrowser.java,v $
 * Revision 1.20  2007/03/31 17:27:11  bemocvs
 * 3.5.2
 *
 * Revision 1.19  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.18  2007/02/18 18:02:27  bemocvs
 * Support for Java Web Start and SQL Log
 *
 * Revision 1.17  2007/02/15 11:36:09  bemocvs
 * Fixes for oracle number types.
 *
 * Revision 1.16  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.15  2006/11/10 17:23:01  bemocvs
 * Added menu items for open/save connection
 *
 * Revision 1.14  2006/05/24 15:39:42  barney
 * added the longed for one touch expandable splitpain
 *
 * Revision 1.13  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.12  2004/11/23 15:42:58  bemocvs
 * Working on syntax actions.
 *
 * Revision 1.11  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.10  2004/10/19 21:55:06  bemocvs
 * working
 *
 * Revision 1.9  2004/10/11 13:40:45  bemocvs
 * closable tab pane.
 *
 * Revision 1.8  2004/10/08 18:08:31  bemocvs
 * 3.3.0 work
 *
 * Revision 1.7  2004/10/07 22:50:29  bemocvs
 * Working on actions.
 *
 * Revision 1.6  2004/10/07 21:11:38  bemocvs
 * Editor actions
 *
 * Revision 1.5  2004/07/12 19:28:40  bemocvs
 * fixed sorted delete
 *
 * Revision 1.4  2003/11/15 16:35:46  bemocvs
 * pre 3.2.2 db release.
 *
 * Revision 1.3  2003/08/21 16:30:37  bemocvs
 * autocommit, sql editing
 *
 * Revision 1.2  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.9  2002/09/19 22:54:54  bemocvs
 * 3.0.8
 *
 * Revision 1.8  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.7  2002/05/17 09:26:58  bemocvs
 * added get session method.
 *
 * Revision 1.6  2002/05/04 18:53:29  bemocvs
 * plugin work
 *
 * Revision 1.5  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.4  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 * Revision 1.3  2002/04/24 18:31:09  bemocvs
 * table info panel
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * The DataBrowser is the main GUI entry point.
 *
 * @author <a href="mailto:support@jetools.com">J Enterprise Technologies</a>
 */
public class DataBrowser extends JFrame 
   implements Logger, Observer, DBEvents, SessionPropertyKeys {
   /** This is the 'per window' model object. */
   private DBSession session=null;

   /** */
   private ActionLabel busyLabel=null;

   /** */
   private SyntaxEditorPane scratchEditorPane=null;

   /** */
   private DBStatusBar statusBar=null;

   /** */
   private DBToolBar toolbar=null;

   /** Tabbed pane. */
   ResultsTabPane resultsTabPane=null;
   
   /** Primary split pane. */
   private JSplitPane splitPane=null;

   /** */
   JTabbedPane editorTabs=null;

   /** */
   JMenuBar menubar=null;

   /** */
   TreePanel treePanel=null;

   /** */
   SQLLogView sqlLogView=null;

   /** */
   HashMap panelModelMap=new HashMap();

   /** */
   private static ImageIcon dbIcon=null;

   /** */
   private PluginManager pluginManager=null;

   /** */
   private int editorCount=0;

   /** */
   JDialog currentDialog=null;

   static SQLBookmarks sqlBookmarks=SQLBookmarks.getInstance();

   /** Static Initializer.  */
   static {
      dbIcon=IconFactory.findIcon("resources/icons/db_16x16.gif");
   }

   /** */
   public DataBrowser() {
      this(new DBSession());
   }

   /** */
   public DataBrowser(DBSession session) {
      super();
      this.session=session;
      session.addObserver(this);
      session.setParent(this);

      UIModel.addDataBrowser(this);

      initBase();
      initGui();
      initMenu();
      initPluginManager();
      addWindowListener(new ExitAction(this));
   }

   /** Used for ScreenshotRobot. */
   public void setCurrentDialog(JDialog d) {currentDialog=d;}
   
   /** */
   JDialog getCurrentDialog() {return currentDialog;}

   /** Used for ScreenshotRobot. */
   private final void initBase() {
      EProperties windowHistory=DBSession.getProperties(WINDOW_HISTORY);
      if (windowHistory != null) {
         log.writeDebug(1, "Setting loction and size from window history");

         int sizeH=windowHistory.getInt("size.h", 640);
         int sizeW=windowHistory.getInt("size.w", 480);
         log.writeDebug("Window size: "+sizeW+","+sizeH);
         setSize(sizeW, sizeH);
         
         int locX=windowHistory.getInt("location.x", 0);
         int locY=windowHistory.getInt("location.y", 0);
         setLocation(locX, locY);
      }
      else {
         setSize(640, 480);
         setLocation(WinUtil.alignCenter(this));
      }

      setTitle("DataBrowser");
   }

   /** */
   private final void initMenu() {
      menubar=new JMenuBar();

      JMenu fileMenu=new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);
      fileMenu.add(new NewWindowAction(this));
      fileMenu.add(new JSeparator());


      DBLoginAction dla=new DBLoginAction(session, this);
      dla.actionPerformed(null);  // FIXME -- REFACTOR
      fileMenu.add(dla);

      fileMenu.add(new DBChangePassAction(session, this));
      fileMenu.add(new DBResetPasswordAction(session, this));
      fileMenu.add(new JSeparator());

//        fileMenu.add(new OpenSqlAction(session, this));
//        fileMenu.add(new SaveAsSqlAction(session, this));
//        fileMenu.add(new SaveSqlAction(session, this));

      fileMenu.add(new FileOpenAction("Open...", this));
      fileMenu.add(new FileSaveAction("Save"));
      fileMenu.add(new FileSaveAsAction("Save As..."));

      // user 'closes' file by closing editor pane.
      // fileMenu.add(new FileCloseAction("Close File"));

      fileMenu.add(new JSeparator());

      fileMenu.add(new RecentFilesMenu("Recent", session));
      fileMenu.add(new JSeparator());

      fileMenu.add(new JMenuItem(new ExitAction(this)));
      
      JMenu editMenu=new JMenu("Edit");
      editMenu.add(new UndoAction());
      editMenu.add(new RedoAction());
      editMenu.add(new JSeparator());
      editMenu.add(new CutAction());
      editMenu.add(new CopyAction());
      editMenu.add(new PasteAction());

//       editMenu.add(new DefaultAction("Cut"));
//       editMenu.add(new DefaultAction("Copy"));
//       editMenu.add(new DefaultAction("Paste"));

      editMenu.add(new JSeparator());
      // FIXME: Change find/replace ot work with JEditorPane
      editMenu.add(new FindReplaceAction(this));
      
      editMenu.add(new JSeparator());
      editMenu.add(new EditPreferencesAction(session, this));

      JMenu viewMenu=new JMenu("View");
      viewMenu.add(new LAFMenu());
      viewMenu.add(new JSeparator());
      
      DefaultAction action=new DriverInfoAction(session, this);
      session.addObserver(action);

      viewMenu.add(action);
      viewMenu.add(new ViewLogAction());

      //JMenu insertMenu=new JMenu("Insert");
      //insertMenu.add(new DefaultAction("Remove this menu??"));

      JMenu databaseMenu=new JMenu("Database");
      databaseMenu.setMnemonic(KeyEvent.VK_D);

      RecentMenu recentMenu=new RecentMenu("Recent Connections", session);
      databaseMenu.add(recentMenu);
      ConnectorMenu connectorMenu=new ConnectorMenu("New Connection", 
                                                    session, this);
      connectorMenu.setMnemonic(KeyEvent.VK_N);
      
      // this should be listening to the driver loader properties 
      // for refresh.
      // Further note: 
      // The DLPATH and DLDIR properties are top level! this means
      // that the menu has to listen at the top level -- and it will be
      // re-init'ing far more than it needs to.  
      // FIXME: Create a new sub-category of properties for drivermanager
      // and have the menu listen there.  There will also need to be a 
      // migration operation for all existing users.
      // for now, I'm just going to make the menu listen at that top level.
      // PAB 9/11/2002.  At home in ATL, hung over.

      EProperties globals=DBSession.getGlobalProperties();
      if (globals != null)
         globals.addObserver(connectorMenu);

      databaseMenu.add(connectorMenu);

      databaseMenu.add(new JSeparator());
      databaseMenu.add(new OpenConnectionAction(session, this));
      databaseMenu.add(new SaveConnectionAction(session, this));

      databaseMenu.add(new DisconnectAction(session));

      databaseMenu.add(new JSeparator());
      databaseMenu.add(new CreateTableAction(session, this));

      JMenu sqlMenu=new SQLMenu("SQL", session, this);

      JMenu advancedMenu=new AdvancedMenu(this);

      JMenu helpMenu=new HelpMenu(this);


      menubar.add(fileMenu);
      menubar.add(editMenu);
      menubar.add(viewMenu);
      //menubar.add(insertMenu);
      menubar.add(databaseMenu);
      menubar.add(sqlMenu);
      menubar.add(advancedMenu);
      menubar.add(helpMenu);
      // menubar.setHelpMenu(helpMenu); // throws Error

      setJMenuBar(menubar);
   }

   /** Initializes the main GUI components. */
   private final void initGui() {
      if (dbIcon != null){
         setIconImage(dbIcon.getImage());
      }

      ImageIcon busy=IconFactory.findIcon("resources/images/"+
                                          "small_globe_anm.gif");
      ImageIcon idle=IconFactory.findIcon("resources/images/"+
                                          "small_globe_static.gif");
      busyLabel=new ActionLabel(busy, idle);
      busyLabel.stop();

      Container cp=getContentPane();
      cp.setLayout(new BorderLayout());
      
      toolbar=new DBToolBar(session, this);

      // EditorPanel editorPanel=new EditorPanel(session);
      editorTabs=new JTabbedPane();
      editorTabs.setUI(new ClosableTabbedPaneUI());

      scratchEditorPane=addEditor("scratch");
      scratchEditorPane.setScratch(true);

      KeyStroke keystroke=KeyStroke.getKeyStroke("ctrl T");
      scratchEditorPane.getKeymap().addActionForKeyStroke(keystroke, new NewEditorAction(this));


      treePanel=new TreePanel(session.getTreePanelModel());

      
      resultsTabPane=new ResultsTabPane(session);

      resultsTabPane.add("TreeView", treePanel, false);

      sqlLogView=new SQLLogView(this);
      resultsTabPane.add("SQLLog", sqlLogView, false, 1);
      
      splitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT, 
                               true, editorTabs, resultsTabPane);
      
      if (DBSession.getGlobalProperties().getBoolean("oneTouchExpandable")) {
         splitPane.setOneTouchExpandable(true);//RBW
         splitPane.setDividerSize(8);
      } else {
         splitPane.setOneTouchExpandable(false);
	      splitPane.setDividerSize(4);
      }

      // layout objects
      JPanel northPanel=new JPanel(new BorderLayout()); 
      JPanel centerPanel=new JPanel(new BorderLayout()); 

      northPanel.add(toolbar, "Center");
      northPanel.add(busyLabel, "East");

      centerPanel.add (splitPane, "Center");

      cp.add(northPanel, "North");
      cp.add(centerPanel, "Center");

      statusBar=new DBStatusBar(session);
      session.addObserver(statusBar);
      cp.add(statusBar, "South");
   }

   public void updateUI() {
      editorTabs.setUI(new ClosableTabbedPaneUI());
   }

   public SyntaxEditorPane addEditor() {
      return addEditor("editor-"+editorCount++);
   }

   public void showSQLLog() {
      if (resultsTabPane.indexOfComponent(sqlLogView) == -1) {
         // it is not here, show it.
         sqlLogView=new SQLLogView(this);
         resultsTabPane.add("SQLLog", sqlLogView, false, 1);
         resultsTabPane.setSelectedIndex(1); // show it
      }
   }

   public void hideSQLLog() {
      int index=resultsTabPane.indexOfComponent(sqlLogView);
      if (index != -1) {
         resultsTabPane.remove(index);
         sqlLogView.close();
         sqlLogView=null;
      }
   }

   /** */
   public SyntaxEditorPane addEditor(String name) {
      SQLSyntaxProperties sqlSyntaxProperties=new SQLSyntaxProperties();
      SyntaxDocument syntaxDocument=new SyntaxDocument(sqlSyntaxProperties);

      // session.setEditorDocument(syntaxDocument);

      SyntaxEditorPane ep=new SyntaxEditorPane(syntaxDocument);
      ep.setDBSession(session);

      KeyStroke keystroke=KeyStroke.getKeyStroke("ctrl T");
      ep.getKeymap().addActionForKeyStroke(keystroke, new NewEditorAction(this));

      JScrollPane syntaxScroller=new JScrollPane(ep);

      editorTabs.add(name, syntaxScroller);
      editorTabs.setSelectedComponent(syntaxScroller);
      return ep;
   }

   /** */
   public SyntaxEditorPane openFileWithNewEditor(String filename) {
      return openFileWithNewEditor(new File(filename));
   }

   /** */
   public SyntaxEditorPane openFileWithNewEditor(File file) {
      SyntaxEditorPane ep=addEditor("new file");
      ep.openFile(file); // this will reset the tab name.
      return ep;
   }

   /** */
   public SyntaxEditorPane findActiveEditor() {
      Component c=editorTabs.getSelectedComponent();
      while (!(c instanceof JScrollPane) &&
             c != null) {
         if (c != null)
            System.out.println ("c="+c.getClass().getName());
         c=c.getParent();
      }

      log.writeDebug("Found editor: "+c);
      return (SyntaxEditorPane)((JScrollPane)c).getViewport().getView();
   }

   /** */
   public String getScratchEditorText() {
      return scratchEditorPane.getText();
   }

   /** */
   private final void initPluginManager() {
      pluginManager=new PluginManager(session, this, menubar, toolbar);
   }

   /** */
   public void show() {
      super.show();

      // set the splitpane split here.
      EProperties windowHistory=DBSession.getProperties(WINDOW_HISTORY);
      if (windowHistory != null) {
         splitPane.setDividerLocation(windowHistory.getInt("divider", 150));
      } else {
         splitPane.setDividerLocation(200);
      }
   }

   /** */
   public void dispose() {
      saveWindowHistory();
      super.dispose();

      // cleanup
      UIModel.removeDataBrowser(this);
      session.disconnect();
      session.deleteObservers(); // remove observers.
   }
   
   /** Saves the location on the screen, and the location of the split
    * pane for the next use. */
   private void saveWindowHistory() {
      Point winLoc=getLocation();
      Dimension winSize=getSize();
      //System.out.println ("Win location="+winLoc);
      //System.out.println ("Win size="+winSize);

      int divLoc=splitPane.getDividerLocation();
      int divSize=splitPane.getDividerSize();
      //System.out.println ("Divider loc: "+divLoc+" size="+divSize);
      
      EProperties globals=DBSession.getGlobalProperties();
      EProperties windowHistory=globals.getProperties(WINDOW_HISTORY);
      
      if (windowHistory == null) {
         windowHistory=new EProperties();
         globals.put(WINDOW_HISTORY, windowHistory);
      }
      
      windowHistory.put("location.x", ""+winLoc.x);
      windowHistory.put("location.y", ""+winLoc.y);
      windowHistory.put("size.h", ""+winSize.height);
      windowHistory.put("size.w", ""+winSize.width);
      windowHistory.put("divider", ""+divLoc);
   }


   ////////////////////////////////////////////////////////////////////////
   ///////////////////  Update methods, refressh  /////////////////////////
   ///////////////////  GUI from model            /////////////////////////
   ////////////////////////////////////////////////////////////////////////
   /** */
   public void update(Observable o, Object arg) {
      if (arg instanceof DBEvent) {
         DBEvent event=(DBEvent)arg;
         int code=event.getCode();
         ImageIcon icon=null;
         switch (code) {
            case (DATABASE_CONNECT): 
               ConnectionInfo ci=session.getConnectionInfo();
               HashMap iconsByDriver=DatabaseCustomization.getIconsByDriver();
               icon=(ImageIcon)iconsByDriver.get(ci.getDriver());
               if (icon != null) {
                  setIconImage(icon.getImage());
               }
               setTitle(ci.getName());
               if (sqlLogView != null)
                  sqlLogView.setConnectionInfo(ci);

               // put the last scratch into the editor, but only if it
               // is empty
               String currentScratch=scratchEditorPane.getText();
               if (currentScratch.length() == 0 && sqlBookmarks != null &&
                   ci != null) {
                  String oldScratch=sqlBookmarks.getScratchSQL(ci.getName());
                  scratchEditorPane.setText(oldScratch);
               }
               break;
            case (DATABASE_DISCONNECT): 
               icon=(ImageIcon)IconManager.getInstance().getIcon("database");

            resultsTabPane.setSelectedIndex(0);
               if (icon != null) {
                  setIconImage(icon.getImage());                  
               }
               break;
            case (BUSY_EVENT): 
               setCursor(Cursor.WAIT_CURSOR);
               break;
            case (DONE_EVENT): 
               setCursor(Cursor.DEFAULT_CURSOR);
               break;
               
            case (STATUS_STRING_CHANGE): 
               class setstate implements Runnable {
                  private String dat=null;
                  public setstate(String dat) {
                     this.dat=dat;;
                  }
                  public void run() {
                     statusBar.setCenter(dat);
                  }
               }
               String state=(String)event.getData();
               Swinger.invokeLaterIfNecessary(new setstate(state));
               break;

            case (SQL_STARTED): 
               busyLabel.start();
               break;
               
            case(SQL_FINISHED): 
               busyLabel.stop();
               break;

            case (NEW_RESULTS): 
               RSPanelModel panelModel=(RSPanelModel)event.getData();
               String query=panelModel.getQuery();      
               try {
                  // throws SQLExcpetion 
                  RSTablePanel tablePanel=new RSTablePanel(panelModel);
                  
                  panelModelMap.put(panelModel, tablePanel);

                  String tip=StringUtil.replace("\n", "<br>", query);
                  tip="<html><font face=\"arial,helvetica,sans-serif\">"+tip+
                  "</font></html>";
                  resultsTabPane.addTab("Query", null, tablePanel, tip);
                  resultsTabPane.setSelectedComponent(tablePanel);
               } catch (SQLException ex) {
                  SQLExceptionDebugger.debug(this, ex, query); 
               }
               
               break;

            case (REMOVE_RESULTS): 
               // the model has already been removed from the model!!
               panelModel=(RSPanelModel)event.getData();
               RSTablePanel panel=(RSTablePanel)panelModelMap.get(panelModel);
               resultsTabPane.remove(panel);
               break;
               
            case (SQL_EXCEPTION): 
               SQLExceptionEvent sqe=(SQLExceptionEvent)event;

               SQLException ex=sqe.getSQLException();
               String sql=sqe.getSql();

               SQLExceptionDebugger.debug(this, ex, sql);
               break;

            case (EXCEPTION) : 
               ExceptionEvent ee=(ExceptionEvent)event;
               ExceptionDebugger.debug(this, ee.getException());

               //MessageWindow.showWarning(this, ee.getMessage(), 
               //                          ee.getException());
               break;

            case (UPDATE_COMPLETE) : 
               // 7/12/04 -- this was commented out, not sure why?
               // we do want to report rows updated.
               String message="Updated "+event.getData()+ " rows.";
               MessageWindow.showMessage(this, message);
               break;

            default: 
               log.writeError(2, "Unknown event code: "+code);
         }
      } else {
         log.writeError(2, "Unknown event type: "+arg);
      }      
   }

   /** */
   public DBSession getSession() {return session;}
}

/*
 * This source code is the sole property of J Enterprise Technologies, Inc.
 */
