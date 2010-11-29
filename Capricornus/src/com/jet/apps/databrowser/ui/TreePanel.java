package com.jet.apps.databrowser.ui;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.border.*;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Observer;
import java.util.Observable;
import java.sql.*;


import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.apps.databrowser.database.ConnectionInfo;


import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.model.tree.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.ui.tableinfo.*;
import com.jet.apps.databrowser.ui.editor.*;
import com.jet.apps.databrowser.ui.io.*;
import com.jet.apps.databrowser.connector.AdvancedConnectionProperties;

import com.jet.database.*;
import com.jet.utils.icons.*;
import com.jet.utils.StringUtil;

import java.awt.*;
import java.awt.event.*;

import com.jet.log.*;

/**
 * Builds a tree panel displaying the info retrieved from a database
 * Conection.
 *
 * @author Paul Bemowski
 */
public class TreePanel extends JPanel
   implements Logger, ActionListener, Observer, DBEvents
{
   private JTree tree;
   private JScrollPane mScrollPane;
   private static ActionHandler mActionHandler;

   // Used for table browser
   private JComboBox mSchemaCombo=null;
   private JComboBox mCatalogCombo=null;
   private JComboBox mTypeCombo=null;

   // 
   private JToolBar mToolbar=null;

   private JMenuItem importMenuItem, dropMenuItem, deleteMenuItem;
   
   JButton refreshButton=null;

   /** Prevents refreshes that aren't wanted. */
   private boolean ignoreRefresh=false;

   /** 
    * Access allows spaces in the names of columns and tables.  SQL Server
    * may as well.  There is no good way to handle this in a platform 
    * independent way.
    */
   private String identifierQuoteString="";
   private boolean useIdentifierQuoteString=false;
   private String dbProductName="";

   JMenuItem deleteDataButton, importDataButton, dropTableButton;

   /** This is the model for the treepanel. */
   TreePanelModel model=null;

   /** */
   TableInfoPanel tableInfoPanel=null;

   /** */
   JTextField namepattern=null;

   /**
    * Constructs a tree panel using the model.
    */
   public TreePanel(TreePanelModel model) {
      this.model=model;
      model.addObserver(this);

      this.setLayout(new BorderLayout());

      // Build the combo boxes for this database.
      mSchemaCombo=new JComboBox();
      mSchemaCombo.addActionListener(this);
      mSchemaCombo.setToolTipText("Limit by Schema");


      mCatalogCombo=new JComboBox();
      mCatalogCombo.addActionListener(this);
      mCatalogCombo.setToolTipText("Limit by Catalog");

      mTypeCombo=new JComboBox();
      mTypeCombo.addActionListener(this);
      mTypeCombo.setToolTipText("Limit By Type");

      refreshButton=new JButton(new TreeRefreshAction(model));
      // System.out.println ("refresh button margin: "+refreshButton.getMargin());
      refreshButton.setMargin(new Insets(0,0,0,0));
      refreshButton.setToolTipText("Refresh Tree View");

      tree=new JTree(model.getTreeModel());
      tree.putClientProperty("JTree.lineStyle", "Angled");
      
      tree.setCellRenderer(new DBTreeCellRenderer());
      mScrollPane = new JScrollPane(tree);

      tableInfoPanel=new TableInfoPanel();
      model.getDBSession().addObserver(tableInfoPanel);      


      JPanel treePanel=new JPanel(new BorderLayout());
      JPanel namePatternPanel=new JPanel(new BorderLayout());
      namepattern=new JTextField();
      namepattern.addActionListener(this);
      namepattern.
      setToolTipText("<html><font face=\"Arial,Helvetica\">Name Pattern<br>"+
                     "eg. '%TYPE' or 'DATATABLE_%' or '%System%'</font></html>");
      JLabel patLab=new JLabel("Name Pattern:");
      patLab.setForeground(Color.black);
      namePatternPanel.add(patLab, "West");
      namePatternPanel.add(namepattern, "Center");
      treePanel.add(namePatternPanel, "North");
      treePanel.add(mScrollPane, "Center");
            
      
      JSplitPane lowerSplit=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                           true, treePanel, tableInfoPanel);
      lowerSplit.setDividerSize(4);
      lowerSplit.setDividerLocation(320);
      
      this.add(lowerSplit, BorderLayout.CENTER);      

      //this.add(tableBrowser, BorderLayout.NORTH);
      mToolbar=new Toolbar();
      this.add(mToolbar, BorderLayout.NORTH);
      
      // Install listener
      MouseListener ml = new TreeMouseListener();
      tree.addMouseListener(ml);

      mActionHandler=new ActionHandler();

      // Drop all tables in view
      databasePopup=new JPopupMenu();
      JMenuItem dropall=
      new JMenuItem(new DropAllTablesAction(model.getDBSession(), this));
      databasePopup.add(dropall);
      
      // Add the popup
      mPopup=new JPopupMenu();

      JMenuItem view=new JMenuItem("View");
      view.setActionCommand("view");
      view.addActionListener(mActionHandler);

      JMenuItem adddata=new JMenuItem("Add Data");
      adddata.setActionCommand("adddata");
      adddata.addActionListener(mActionHandler);

      JMenuItem count=new JMenuItem("Count Rows");
      count.setActionCommand("count");
      count.addActionListener(mActionHandler);

      JMenuItem copy=new JMenuItem("Copy");
      copy.setActionCommand("copy");
      copy.addActionListener(mActionHandler);

      JMenuItem openInEditor=new JMenuItem("Open in editor...");
      openInEditor.setActionCommand("openInEditor");
      openInEditor.addActionListener(mActionHandler);
      
      JMenuItem exportData=new JMenuItem("Export Data...");
      exportData.setActionCommand("exportData");
      exportData.addActionListener(mActionHandler);

      importDataButton=new JMenuItem("Import Data [BETA]...");
      importDataButton.setActionCommand("importData");
      importDataButton.addActionListener(mActionHandler);

      deleteDataButton=new JMenuItem("Delete All Rows...");
      deleteDataButton.setActionCommand("deleteData");
      deleteDataButton.setIcon(skullIcon);
      deleteDataButton.setEnabled(true);
      deleteDataButton.addActionListener(mActionHandler);

      dropTableButton=new JMenuItem("Drop Table...");
      dropTableButton.setActionCommand("dropTable");
      dropTableButton.setIcon(skullIcon);
      dropTableButton.setEnabled(true);
      dropTableButton.addActionListener(mActionHandler);

      mPopup.add (view);
      mPopup.add (adddata);
      mPopup.add (count);
      mPopup.add (copy);
      mPopup.add (new JSeparator());
      mPopup.add (openInEditor);
      mPopup.add (new JSeparator());
      mPopup.add (exportData);
      mPopup.add (importDataButton);
      mPopup.add (new JSeparator());
      mPopup.add (deleteDataButton);
      mPopup.add (dropTableButton);
   }

   /** Added for screenshot robot. */
   public JTree getTree() {return tree;}

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();

      switch (code) {
         case (TREE_RELOAD): 

            ConnectionInfo conInfo=model.getConnectionInfo();
            if (conInfo.isReadOnly()) {
               importDataButton.setEnabled(false);
               deleteDataButton.setEnabled(false);
               dropTableButton.setEnabled(false);
            } else {
               importDataButton.setEnabled(true);
               deleteDataButton.setEnabled(true);
               dropTableButton.setEnabled(true);
            }
         break;
         case (TREE_COMBO_RELOAD): 
            refreshCombos();
            break;
         default: 
            log.writeError(2, "Unknown event type: "+event);
      }
   }

   /** */
   void refreshCombos() {
      try {
         ignoreRefresh=true;
         addVectorToCombo(mSchemaCombo, model.getSchemas());
         addVectorToCombo(mTypeCombo, model.getTypes());
         addVectorToCombo(mCatalogCombo, model.getCatalogs());

         String temp=model.getNamePattern();
         namepattern.setText((temp == null ? "":temp));
         
         if (model.getSchemas() != null &&
             model.getSchemas().size() > 0) {
            mSchemaCombo.
            setSelectedIndex(findSelectedIndex(model.getSchemas(), 
                                               model.getCurrentSchema()));
         }

         if (model.getCatalogs() != null &&
             model.getCatalogs().size() > 0) {
            mCatalogCombo.
            setSelectedIndex(findSelectedIndex(model.getCatalogs(), 
                                               model.getCurrentCatalog()));
         }

         String ct[]=model.getCurrentTypes();
         
         if (ct != null && ct.length > 0 && 
             model.getTypes() != null && model.getTypes().size() > 0) {
            mTypeCombo.
            setSelectedIndex(findSelectedIndex(model.getTypes(), ct[0]));
         }

         String schema=model.getCurrentSchema(); 
         String catalog=model.getCurrentCatalog();
      }
      finally {
         ignoreRefresh=false;
      }

      log.writeDebug (VERBOSE, "About to revalidate.");
      // need to redisplay
      mToolbar.revalidate();
      log.writeDebug (VERBOSE, "Done revalidating.");
   }
   
   /**
    * JComboBox SUCKS
    */
   private void addVectorToCombo(JComboBox combo, Vector v) {
      if (combo.getItemCount() > 0)
         combo.removeAllItems();
      for (int i=0; i<v.size(); i++) {
         combo.addItem(v.elementAt(i));
      }
   }

   /**
    *
    */
   private int findSelectedIndex(Vector v, String s)
   {
      if(s == null || s.length() == 0 ||
         v == null || v.size() == 0)
         return 0;
      // First, search case sensitive, then search case insensitive
      int size=v.size();
      String temp=null;
      for (int i=0; i<size; i++) {
         temp=(String)v.elementAt(i);
         if (s.equals(temp))
            return i;
      }
      for (int i=0; i<size; i++) {
         temp=(String)v.elementAt(i);
         if (s.equalsIgnoreCase(temp))
            return i;
      }
      return 0;
   }
   

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      // String action=ae.getActionCommand();
      if (ignoreRefresh) {
         // log.writeDebug ("Ignoring tree refresh.");
         // this is working now.
      }
      else {
         log.writeDebug (VERBOSE, "Refreshing tree.");

         // Get the values from the combos.
         String schema=(String)mSchemaCombo.getSelectedItem();
         String catalog=(String)mCatalogCombo.getSelectedItem();
         
         Object typeObj[]=mTypeCombo.getSelectedObjects();
         String types[]=new String[typeObj.length];
         for (int i=0; i<typeObj.length; i++) {
            types[i]=(String)typeObj[i];
         }
         
         
         if (schema != null) {
            if (!schema.equals("All")) 
               model.setCurrentSchema(schema);
            else 
               model.setCurrentSchema(null);
         }
         if (catalog != null) {
            if (!catalog.equals("All"))
               model.setCurrentCatalog(catalog);
            else 
               model.setCurrentCatalog(null);
         }

         model.setCurrentTypes(types);

         if (!StringUtil.empty(namepattern.getText()))
            model.setNamePattern(namepattern.getText());
         else
            model.setNamePattern(null);
      }
   }

   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////  TABLE MODELS BELOW  //////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////

   /**
    *
    */
   class DBTreeCellRenderer extends DefaultTreeCellRenderer
   {
      public Component getTreeCellRendererComponent(JTree tree,
                                                    Object value,
                                                    boolean sel,
                                                    boolean expanded,
                                                    boolean leaf,
                                                    int row,
                                                    boolean hasFocus)
      {
         Component def=super.getTreeCellRendererComponent(tree, value, sel,
                                                          expanded, leaf, row,
                                                          hasFocus);

         if (value instanceof DatabaseNode &&
             dbIcon != null)
            setIcon(dbIcon);
         else if (value instanceof TableNode)
         {
            TableNode tn=(TableNode)value;
            if (tn.isSystemTable() &&
                sysTableIcon != null)
               setIcon(sysTableIcon);
            else if (tn.isView() &&
                     viewIcon != null)
               setIcon(viewIcon);
            else if (tableIcon != null)
               setIcon(tableIcon);
         }
         else if (value instanceof ColumnNode &&
                  colIcon != null)
         {
            ColumnNode cn=(ColumnNode)value;
            if (cn.isKey() &&
                keyColIcon != null)
               setIcon(keyColIcon);
            else if (cn.isIndex() &&
                     indexColIcon != null)
               setIcon(indexColIcon);
            else if (colIcon != null)
               setIcon(colIcon);
         }
         return def;
      }
   }

   /** updates sql table. */
   void updateTable(TableNode tn) {
      try {
         model.busy();
         SQLTable st=tn.getSQLTable(); // =su.getTable(tn.getName());
         tableInfoPanel.setSQLTable(st);
      } finally {
         model.done();
      }
   }

   /**
    *
    */
   public class TreeMouseListener extends MouseAdapter
   {
      /** */
      public void mouseClicked(MouseEvent me) {
         int count=me.getClickCount();
         Point p=me.getPoint();
         if (p == null || tree == null)
            return;

         if (count == 1) {
            // ok, we've clicked on a table.
            TreePath path=tree.getPathForLocation(p.x, p.y);
            log.writeDebug("Tree path is "+path);
            if (path == null)
               return;
            TreeNode node=(TreeNode)path.getLastPathComponent();
            if (node instanceof TableNode) {
               TableNode tn=(TableNode)node;
               updateTable(tn);
            }
         }
         else if (count == 2) {
            log.writeDebug ("Got doubleclick.");
            TreePath path=tree.getPathForLocation(p.x, p.y);
            if (path == null)
               return;
            TreeNode node=(TreeNode)path.getLastPathComponent();

            if (node instanceof ColumnNode)
            {
               ColumnNode cn=(ColumnNode)node;
               TableNode tn=(TableNode)cn.getParent();

               // mainWin.insertSqlText(tn.getName()+"."+cn.getName()+", ");
            }
         }
      }

      /** for winblows */
      public void mouseReleased (MouseEvent me) {
         if (me.isPopupTrigger()) {
            createPopup(me.getPoint());
         }
      }

      /** for *NIX and X */
      public void mousePressed (MouseEvent me) {
         if (me.isPopupTrigger()) {
            createPopup(me.getPoint());
         }
      }
   }

   private JPopupMenu databasePopup;
   private JPopupMenu mPopup;
   private void createPopup(Point p)
   {
      Point topLeft=mScrollPane.getViewport().getViewPosition();
      //System.out.println ("Top left is: "+topLeft);
      
      currentX=p.x;
      currentY=p.y;

      TreePath path=tree.getPathForLocation(currentX,currentY);
      if (path == null)
         return;

      TreeNode tn=(TreeNode)path.getLastPathComponent();

      Point cp=SwingUtilities.convertPoint(mScrollPane, p, this);

      if (tn instanceof TableNode)
         mPopup.show(this, p.x, p.y-topLeft.y);

      if (tn instanceof DatabaseNode) 
         databasePopup.show(this, cp.x, cp.y);
   }

   private int currentX, currentY;
   private class ActionHandler implements ActionListener
   {
      /** */
      public void actionPerformed (ActionEvent ae)
      {
         String action=ae.getActionCommand();

         TableNode tableNode=
         (TableNode)tree.getPathForLocation(currentX, currentY).
         getLastPathComponent();
         String tableName=tableNode.toString();

         if (action.equals("view")) {
            // tableName=addIDQuote(tableName);
            SchemaUtil su=model.getSchemaUtil();
            tableName=su.tableSQL(tableName);
            String sql="SELECT * FROM "+tableName;

            DBSession dbSession=model.getDBSession();
            dbSession.executeQuery(sql);
         }
         else if (action.equals("adddata")) {
            SQLTable table=tableNode.getSQLTable();
            //DataEditor.addData(TreePanel.this, model.getDBSession(), 
            //                   table);
            InsertDataEditor ide=
            new InsertDataEditor(TreePanel.this, table, model.getDBSession());
            ide.show();

         }
         else if (action.equals("copy")) {
            JTextField tf=new JTextField(tableName);
            tf.selectAll();
            tf.copy();
         }
         else if (action.equals("count")) {
            Statement state=null;
            ResultSet rs=null;
            String message=null;
            try {
               model.busy();
               SchemaUtil su=model.getSchemaUtil();
               ConnectionInfo conInfo=model.getConnectionInfo();

               tableName=su.tableSQL(tableName);

               String sql="SELECT count(*) FROM "+tableName;
               
               state=conInfo.getConnection().createStatement();
               rs=state.executeQuery(sql);
               
               int rowCount=0;
               if (rs.next()) {
                  rowCount=rs.getInt(1);
                  message=tableName+" contains "+rowCount+" rows.";
               }
               else
                  message=tableName+
                  " contains an undetermined number of rows.";
               
            }
            catch (Exception ex) {
               //log.printStackTrace(ex);
               //message="An error occured.\n"+
               //"See the log for more information.";
               ExceptionDebugger.debug(TreePanel.this, "Error", ex);
            }
            finally {
               try {
                  if (rs != null)
                     rs.close();
                  if (state != null)
                     state.close();
               }
               catch (SQLException ex) {
                  log.printStackTrace(ex);
               }

               model.done();
            }

            // Show the message
            if (message != null)
               MessageWindow.showMessage(TreePanel.this, message);
         }
         else if (action.equals("openInEditor")) {
            try {
               model.busy();

               SQLTable sqltable=tableNode.getSQLTable();
               
               if (sqltable != null) {
                  TableEditor te=
                  TableEditor.showTable(model.getDBSession(), sqltable);

                  te.setLocation(WinUtil.alignCenterFrame(te, TreePanel.this));
                  te.show();
               }
               else {
                  MessageWindow.showWarning(TreePanel.this, 
                                            "Unable to get table details.");
               }
            }
            finally {
               model.done();
            }
         }
         else if (action.equals("exportData")) {
            ExportDataWizard.
            exportData(WinUtil.findParentFrame(TreePanel.this), 
                       model.getConnectionInfo(), tableName);
         }
         else if (action.equals("importData")) {
            ImportDataWizard.
            importData(WinUtil.findParentFrame(TreePanel.this), 
                       model.getConnectionInfo(), tableName);
         }
         else if (action.equals("deleteData"))
         {
            if (MessageWindow.
                showDeadlyOption(TreePanel.this, 
                                 "Warning: Continuing this "+
                                 "operation will \n"+
                                 "DESTROY ALL DATA in "+
                                 tableName+".  \n\n"+
                                 "Do you wish to continue?"))
            {
               // do something
               Statement state=null;
               int rows;
               String message=null;
               try {
                  model.busy();
                  SchemaUtil su=model.getSchemaUtil();
                  ConnectionInfo conInfo=model.getConnectionInfo();
                  
                  tableName=su.tableSQL(tableName);

                  String sql="DELETE FROM "+tableName;
                  
                  state=conInfo.getConnection().createStatement();
                  rows=state.executeUpdate(sql);
                  
                  message="Deleted "+rows+" rows from "+tableName;
               }
               catch (SQLException ex) {
                  log.printStackTrace(ex);
                  SQLExceptionDebugger.debug(TreePanel.this, ex);
               }
               catch (Exception ex) {
                  log.printStackTrace(ex);
                  message="An error deleting all rows from "+tableName+".\n"+
                  "It is unclear whether the operation was successful.\n"+
                  "See the log for more information.";
               }
               finally {
                  try {
                     if (state != null)
                        state.close();
                  }
                  catch (SQLException ex) {
                     log.printStackTrace(ex);
                  }
                  
                  model.done();
               }
               MessageWindow.showWarning(TreePanel.this, message);
            }
            else
            {
               // do nothing.
            }
         }
         else if (action.equals("dropTable"))
         {
            if (MessageWindow.
                showDeadlyOption(TreePanel.this, 
                                 "Warning: Continuing this "+
                                 "operation will \n"+
                                 "DESTROY ALL DATA in "+
                                 tableName+".  \n\n"+
                                 "Do you wish to continue?"))
            {
               // do something
               Statement state=null;
               int rows;
               String message=null;
               try
               {
                  model.busy(); // setWaitCursor();
                  SchemaUtil su=model.getSchemaUtil();
                  ConnectionInfo conInfo=model.getConnectionInfo();

                  tableName=su.tableSQL(tableName);

                  String sql="DROP TABLE "+tableName;
                  
                  state=conInfo.getConnection().createStatement();
                  rows=state.executeUpdate(sql);
                  conInfo.getSchemaUtil().resetTableCaches();

                  message=tableName+" has been dropped from the database.";
               }
               catch (SQLException ex) {
                  log.printStackTrace(ex);
                  SQLExceptionDebugger.debug(TreePanel.this, ex);
               }
               catch (Exception ex) {
                  log.printStackTrace(ex);
                  message="An error occured retrieving row count.\n"+
                  "See the log for more information.";
               }
               finally {
                  try {
                     if (state != null)
                        state.close();
                  }
                  catch (SQLException ex) {
                     log.printStackTrace(ex);
                  }
                  
                  model.done();
               }
               MessageWindow.showMessage(TreePanel.this, message);

               TreePanel.this.actionPerformed(null);
            }
            else
            {
               // do nothing.
            }
         }
      } // end actionPerformed
   }// End ActionHandler


   /**
    *
    */
   private class Toolbar extends JToolBar implements ActionListener
   {
      public Toolbar()
      {
         this.setLayout(new BorderLayout());
         
         JPanel comboPanel=new JPanel(new GridLayout(1, 3));

         JPanel schPanel=new JPanel(new BorderLayout());
         JPanel catPanel=new JPanel(new BorderLayout());
         JPanel typePanel=new JPanel(new BorderLayout());
         JLabel sch=new JLabel("Schema:");
         JLabel cat=new JLabel("Catalog:");
         JLabel type=new JLabel("Type:");

         sch.setForeground(Color.black);
         // mSchemaCombo.setBorderPaintedFlat(true);
         schPanel.add(sch, "West");
         schPanel.add(mSchemaCombo, "Center");

         cat.setForeground(Color.black);
         catPanel.add(cat, "West");
         catPanel.add(mCatalogCombo, "Center");

         type.setForeground(Color.black);
         typePanel.add(type, "West");
         typePanel.add(mTypeCombo, "Center");
         
         comboPanel.add(schPanel);
         comboPanel.add(catPanel);
         comboPanel.add(typePanel);

         this.add(comboPanel, "Center");
         this.add(refreshButton, "East");
         
         this.setFloatable(false);
      }

      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
      }
   }


   /** */
   static class MyComboBoxUI extends com.sun.java.swing.plaf.windows.WindowsComboBoxUI
   {
      public JButton createArrowButton() {
         log.writeDebug(1, "Creating button for my ui.");
         JButton b=super.createArrowButton();
         b.setMargin(new Insets(0, 0, 0, 0));
         return b;
      }
   }

   ////////////////////////////////////////////////////////////////////////////
   //////////////////////////   Icon Crap   ///////////////////////////////////
   ////////////////////////////////////////////////////////////////////////////
   private static Icon dbIcon=null;
   private static Icon tableIcon=null;
   private static Icon viewIcon=null;
   private static Icon sysTableIcon=null;
   private static Icon colIcon=null;
   private static Icon keyColIcon=null;
   private static Icon indexColIcon=null;
   private static Icon skullIcon=null;

   static 
   {
      int h=20;
      int w=20;
      try 
      {dbIcon=IconFactory.findIcon("resources/icons/tree/database.gif",
                                   h, w);}
      catch (Exception ex) {dbIcon=null;}

      try 
      {tableIcon=IconFactory.findIcon("resources/icons/tree/table.gif",
                                      h, w);}
      catch (Exception ex) {tableIcon=null;}

      try 
      {colIcon=IconFactory.findIcon("resources/icons/tree/column.gif", 
                                    h, w);}
      catch (Exception ex) {colIcon=null;}

      try 
      {keyColIcon=IconFactory.findIcon("resources/icons/tree/keycol.gif",
                                       h, w);}
      catch (Exception ex) {keyColIcon=null;}

      try 
      {indexColIcon=IconFactory.
       findIcon("resources/icons/tree/indexcol.gif",h, w);}
      catch (Exception ex) {indexColIcon=null;}

      try 
      {viewIcon=IconFactory.findIcon("resources/icons/tree/view.gif",h, w);}
      catch (Exception ex) {viewIcon=null;}

      try 
      {sysTableIcon=IconFactory.
       findIcon("resources/icons/tree/systable.gif",h, w);}
      catch (Exception ex) {sysTableIcon=null;}

      try 
      {skullIcon=IconFactory.
       findIcon("resources/icons/jolly_roger1.gif",h, w);}
      catch (Exception ex) {sysTableIcon=null;}
   }
}

