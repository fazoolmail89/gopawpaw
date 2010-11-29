package com.jet.apps.databrowser.ui;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.border.*;
import javax.swing.filechooser.*;

import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


import com.jet.utils.ui.*;
import com.jet.utils.icons.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.*;
import com.jet.core.*;
import com.jet.database.*;

// import com.jet.apps.jdbcbrowser.dio.*;
import com.jet.apps.databrowser.action.*;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.event.*;

import java.io.File;
import java.io.IOException;

import java.text.*;

import com.jet.log.*;

import com.jet.apps.databrowser.database.Null;
import com.jet.utils.db.TableUtil;
import com.jet.utils.ui.*;

// NEW DATA EDITOR
import com.jet.apps.databrowser.ui.editor.*;


/*
 * $Log: RSTablePanel.java,v $
 * Revision 1.13  2007/02/18 18:02:27  bemocvs
 * Support for Java Web Start and SQL Log
 *
 * Revision 1.12  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.11  2006/12/07 14:53:56  bemocvs
 * DataEditor refactor
 *
 * Revision 1.10  2006/12/03 21:23:36  bemocvs
 * Fixed delete bug
 *
 * Revision 1.9  2006/07/27 12:22:18  barney
 * FIX: Ticket #1157: ArrayIndexOutOfBoundsException.
 *
 * Revision 1.8  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.7  2004/10/21 20:56:04  bemocvs
 * 3.3.0 work
 *
 * Revision 1.6  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.5  2004/10/19 21:55:06  bemocvs
 * working
 *
 * Revision 1.4  2004/09/08 20:19:21  bemocvs
 * Ticket 1069, no headers on csv export
 *
 * Revision 1.3  2004/07/12 19:28:40  bemocvs
 * fixed sorted delete
 *
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.9  2002/11/19 01:28:19  bemocvs
 * 3.0.10
 *
 * Revision 1.8  2002/10/21 21:53:26  bemocvs
 * Fixed xml export
 *
 * Revision 1.7  2002/09/19 22:54:54  bemocvs
 * 3.0.8
 *
 * Revision 1.6  2002/06/20 17:32:47  bemocvs
 * added import for con info
 *
 * Revision 1.5  2002/06/13 19:00:57  bemocvs
 * Fixed intermittent NPE. Fixed 'unknown database'
 *
 * Revision 1.4  2002/05/04 18:52:22  bemocvs
 * Changed to use mouseover buttons.
 *
 * Revision 1.3  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * Displays a result set in a JPanel as a JTable.  This class has
 * 2 constructors to create a ResultSet or a 2-d Vector to a JTable
 * view.
 * 
 * @author Paul Bemowski
 */
public class RSTablePanel extends JPanel
   implements Logger, ActionListener, TableModelListener, SessionPropertyKeys, Observer, DBEvents
{
   private RSTableModel tableModel=null;
   private TableSorter sortedModel=null;
   
   private RSPanelModel panelModel=null;
   private DBSession dbSession=null;

   private JTable table;
   private JScrollPane mScrollPane=null;
   private StatusBar statusBar=null;

   private boolean isFromRS=false;
   private int colWidth[];

   private Toolbar toolbar=null;

   // private boolean autosizeCols=false;
   private boolean autosizeCols=true;

   private int maxColumnWidth=80;

   private long queryTime=-1;
   
   public static final int UNKNOWN=-1;
   public static final int MORE_DATA=0;
   public static final int QUERY_COMPLETE=1;

   private static String INITIAL_QUERY_STRING="Unknown Query";
   private String queryString=INITIAL_QUERY_STRING;
   private String databaseName="Unknown Database";

   private static File lastFileChosen=null;

   /** This is a list of the modified rows and columns.  Keys and values
    * are Integers.  Modified rows and columns will be displayed in a 
    * different color by the tablecellrenderer. */
   protected HashMap modRC=new HashMap();
   
   /** Data in a result set panel is eitable by the data editor if
    * and only if the result set is the FULL display for an ENTIRE
    * table. 
    * ie. select * from <table> is the only valid query. */
   private boolean canEdit=false;

   /** This is the table name for editing. */
   private String editTableName=null;

   /** */
   private SQLTable sqlTable=null;
   
   /** */
   Vector tableNames=null; // for display

   JMenuItem insertButton=null;
   JMenuItem updateButton=null;
   JMenuItem deleteButton=null;

   /** This is the real constructor. */   
   RSTablePanel(RSPanelModel panelModel)
      throws SQLException
   {
      this.panelModel=panelModel;
      this.tableModel=panelModel.getTableModel();

      panelModel.addObserver(this);
      tableModel.addObserver(this);

      dbSession=panelModel.getDBSession();
      ConnectionInfo ci=dbSession.getConnectionInfo();
      if (ci != null)
         databaseName=ci.getName();

      queryString=panelModel.getQuery();
      
      EProperties props=dbSession.getGlobalProperties();
      int max=props.getInt(MAX_RESULTS, 425);


      tableModel.addTableModelListener(this);

      if (panelModel.getResultSet() != null) {
         setTableResults(panelModel.getStatement(), 
                         panelModel.getResultSet());
      }
      layoutPanel();      
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      if (event == null) {
         // Todd delaune was seeing rare, intermittent problems
         // here w/ NPEs.  Must be the object, but no-one should
         // be firing an event w/out this??  6/13/02.
         return; 
      }

      int code=event.getCode();
      switch (code) {
         case (UPDATE_HEADERS): 
            ResultSetMetaData rsmd=(ResultSetMetaData)event.getData();
            setEditable(rsmd);
            updateTabTitle();
         break;
         case (QUERY_TIME_UPDATE): 
            Long ll=(Long)event.getData();
            setQueryTime(ll.longValue());
            break;
         case (QUERY_STATUS_UPDATE): 
            statusBar.setCenter((String)event.getData());
            break;
         case (QUERY_STARTED): 
            toolbar.queryStarted();
            break;
         case (QUERY_FINISHED): 
            toolbar.queryFinished();
            break;
         default: 
      }
   }

   /** */
   void updateTabTitle() {
      Component parent=this;
      while (!(parent instanceof JTabbedPane) &&
             parent != null) {
         parent=parent.getParent();
      }
      
      if (parent != null) {
         // must be an instance of JTabbedPane
         JTabbedPane tabPane=(JTabbedPane)parent;
         int index=tabPane.indexOfComponent(this);
         tabPane.setTitleAt(index, getTableNamesString());
      }
   }


   /** */
   RSPanelModel getPanelModel() {return panelModel;}

   /** */
   public void close() {
      if (panelModel != null)
         panelModel.deleteObserver(this);

      if (tableModel != null) {
         tableModel.close();
         tableModel.deleteObserver(this);
      }
      
      dbSession.removePanelModel(panelModel);
      // dbSession.removeQueryForModel(panelModel);
   }

   /** */
   public void setTableResults(ResultSet rs) 
      throws SQLException {
      setTableResults(null, rs);
   }

   /** */
   public void setTableResults(Statement s, ResultSet rs) 
      throws SQLException {
      if (rs != null) {
         tableModel.setModelResults(s, rs);
         setEditable(rs.getMetaData());
      }
      if (statusBar != null &&
          tableModel != null) {
         String rc="R:"+tableModel.getRowCount()+" x C:"+tableModel.getColumnCount();
         statusBar.setLeft(rc);
      }

      tableModel.updateTable();
      if (toolbar != null)
         toolbar.update();
   }

   /** */
   public void tableChanged(TableModelEvent evt) {
      if (statusBar != null &&
          tableModel != null) {
         String rc="R:"+tableModel.getRowCount()+" x C:"+tableModel.getColumnCount();
         statusBar.setLeft(rc);
      }

      if (tableModel != null && autosizeCols) {
         autosizeCols();
      }
   }
   
   /** */
   void setEditable(ResultSetMetaData rsmd) {
      try {
         // ResultSetMetaData rsmd=rs.getMetaData();
         int colcount=rsmd.getColumnCount();
         String tablename=null;

         if (colcount >= 1) {
            canEdit=true;

            // Ok, the Sybase JConnect driver throws a fucking exception
            // at this method call!  What a shitty driver for a large
            // RDBMS company, you'd think they could implement this method.
            // I give Postgres a break because they're freeware, but come
            // on.   
            // The quick solution is in below, to support Sybase's shitty
            // driver.
            try {
               tablename=rsmd.getTableName(1);
            } catch (Exception ex) {
               tablename=null;
               log.writeError(3, "Sybase's driver does not support this "+
                              "method.  Are there others?.", ex);
            }

            if (tablename == null || tablename.trim().length() == 0)
            {
               // postgres ResultSetMetaData dosen't tell us where
               // the data is coming from.  getTableName() returns "".  Here, 
               // we'll try go guess from the sql if it's possible to edit
               // the table.
               // pab 7/30/01 6:22 pm.
               canEdit=false;
               if (queryString != null &&
                   !queryString.equals(INITIAL_QUERY_STRING)) {
                  Vector tables=guessTableNamesFromSQL(queryString);
                  if (tables != null &&
                      tables.size() == 1) {
                     canEdit=true;
                     tablename=(String)tables.elementAt(0);
                  }

                  tableNames=tables;
                  if (tableNames==null) {
                     tableNames=new Vector();
                     tableNames.addElement("UNKNOWN");
                  }
               }
            }
            else {
               Hashtable tableHash=new Hashtable();
               tableHash.put(tablename, tablename);
               
               for (int i=2; i<=colcount; i++) {
                  tablename=rsmd.getTableName(i);
                  tableHash.put(tablename, tablename);
               }
               
               if (tableHash.size() == 1)
                  canEdit=true;
               else
                  canEdit=false;

               tableNames=new Vector();
               Enumeration keys=tableHash.keys();
               while (keys.hasMoreElements())
                  tableNames.add(keys.nextElement());
            }
         }// end if 1
         else {
            // columnCount < 1, ie 0
            canEdit=false;
            tableNames=new Vector();
            tableNames.addElement("NO DATA");
         }

         editTableName=tablename; 

         //if (canEdit) {
         //   sqlTable=SchemaUtil.simpleTableFromMetaData(tablename, rsmd);
         //}
      }// end try
      catch (Exception ex) {
         canEdit=false;
         log.writeError(2, "Error in RSTP.setEditable().  You will be "+
                        " unable to edit this table.", ex);
      }
      refreshPopupMenu();
   }

   /** */
   public Vector getTableNames() {return tableNames;}

   /** */
   public String getTableNamesString() {
      if (tableNames == null)
         return "Query";
      else {
         StringBuffer sb=new StringBuffer();
         // PAB, 19.Oct.04.
         // It is possible for complex queries for this to be _very_ long, 
         // too long to be the name of a tab (which is the function of 
         // this method).  So we're limiting to 4,and adding elipsis if
         // necessary.
         for (int i=0; i<tableNames.size() && i<4; i++) {
            sb.append(tableNames.elementAt(i));
            if (i < tableNames.size()-1)
               sb.append(", ");
         }
         if (tableNames.size() > 4) {
            sb=new StringBuffer(sb.toString().substring(0, sb.toString().length() - 2));
            sb.append("...");
         }
         return sb.toString();
      }
   }

   /** */
   public String getQueryString() {return queryString;}

   /** */
   public JTable getTable(){
      return table;
   }

   /**
    * Private function to layout the RSPanel.
    */
   private void layoutPanel()
   {
      this.setLayout(new BorderLayout());
      //model=new TableModel();
      sortedModel = new TableSorter(tableModel);

      table=new JTable(sortedModel);
      table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      table.setDefaultRenderer(Object.class, new RSTableCellRenderer());

      sortedModel.addMouseListenerToHeaderInTable(table);

      // table.setAutoCreateColumnsFromModel(false);

      table.setAutoResizeMode (JTable.AUTO_RESIZE_OFF); // this allows the
      // display of a horizonatal scroll bar for this panel.  Without
      // this columns will be shrunk down as small as 15 pixles

      mScrollPane=new JScrollPane(table); // swing 102, 103
    
      this.add (mScrollPane, "Center");

      table.addMouseListener(new MouseHandler());

      toolbar=new Toolbar();
      toolbar.update();

      
      JPanel northPanel=new JPanel(new GridBagLayout());
      
      Icon icon=IconFactory.findIcon("resources/icons/close.gif");
//        JButton closeButton=new JButton(icon);
//        closeButton.setActionCommand("closePanel");
//        closeButton.setMargin(new Insets(1, 1, 1, 1));
//        closeButton.addActionListener(this);
      
      GridBagConstraints c=new GridBagConstraints();
      c.gridx=0; c.gridy=0;
      c.anchor=GridBagConstraints.WEST;
      c.fill=GridBagConstraints.NONE;
      
      
      northPanel.add(toolbar, c);
      
      JPanel dummyPanel=new JPanel();
      c.gridx=1; c.fill=GridBagConstraints.BOTH;
      c.weightx=1; c.weighty=1;
      northPanel.add(dummyPanel, c);
      
//        c=new GridBagConstraints();
//        c.gridx=2; c.gridy=0;
//        c.anchor=GridBagConstraints.NORTHWEST;
//        northPanel.add(closeButton, c);
      
      
      this.add(northPanel, "North");

      statusBar=new StatusBar();
      statusBar.setLeft("", Color.black);
      statusBar.setCenter("", Color.black);
      statusBar.setRight("", Color.black);

      String rc="R:"+tableModel.getRowCount()+" x C:"+tableModel.getColumnCount();
      statusBar.setLeft(rc);

      setQueryTime(0);

      this.add(statusBar, "South");

      // Add the popup
      mPopup=new JPopupMenu();
      JMenuItem copy=new JMenuItem("Copy");
      copy.setActionCommand("copy");
      copy.addActionListener(this);
      mPopup.add (copy);
      mPopup.add (new JSeparator());

      insertButton=new JMenuItem("Insert");
      insertButton.setActionCommand("insert");
      insertButton.addActionListener(this);
      if (!canEdit)
         insertButton.setEnabled(false);
      mPopup.add(insertButton);

      updateButton=new JMenuItem("Update");
      updateButton.setActionCommand("edit");
      updateButton.addActionListener(this);
      if (!canEdit)
         updateButton.setEnabled(false);
      mPopup.add(updateButton);

      deleteButton=new JMenuItem("Delete");
      deleteButton.setActionCommand("delete");
      deleteButton.addActionListener(this);
      if (!canEdit)
         deleteButton.setEnabled(false);
      mPopup.add(deleteButton);
     
      //mPopup.setInvoker(this);

      if (autosizeCols)
         autosizeCols();
   }


   /** */
   private void refreshPopupMenu() {
      if (canEdit)
         insertButton.setEnabled(true);
      else 
         insertButton.setEnabled(false);

      if (canEdit)
         updateButton.setEnabled(true);
      else
         updateButton.setEnabled(false);

      if (canEdit)
         deleteButton.setEnabled(true);
      else
         deleteButton.setEnabled(false);
   }


   private static final DecimalFormat qtFormat=new DecimalFormat("#0.00");
   /** */
   public void setQueryTime(long qt)
   {
      queryTime=qt;
      if (queryTime > 0) {
         double queryTimeSeconds=(double)queryTime/1000.0;
         statusBar.setRight("Query Time: "+qtFormat.format(queryTimeSeconds));
      }
      else {
         statusBar.setRight("QueryTime (s): ?.???");
      }
   }

   /** */
   public void updateStatusBar() {
      statusBar.setCenter("Page "+(tableModel.getPageIndex()+1)+" of "+
                          tableModel.getPageCount()+",  "+tableModel.getRowsPerPage()+
                          " rows per page.");
   }

   /** */
   public void setQueryString(String s) {queryString=s;}

   /** */
   public void setDatabaseName(String s) {databaseName=s;}
    

   /**
    * Used to set the column resize mode of the table insidt this panel.
    * See JTable.setAutoResizeMode for more info.
    */
   public void setAutoResize (boolean res)
   {
      if (res)
         table.setAutoResizeMode (JTable.AUTO_RESIZE_ALL_COLUMNS);
      else
         table.setAutoResizeMode (JTable.AUTO_RESIZE_OFF);
   }

   /**
    * This handler allows double clicking on the ResultSet that is
    * the list of tables to display that list in a new window.
    */
   class MouseHandler extends MouseAdapter
   {
      /** for winblows. */
      public void mouseReleased (MouseEvent me) {
         if (me.isPopupTrigger()) {
            createPopup(me.getPoint());
         }
      }

      /** for *NIX and X*/
      public void mousePressed (MouseEvent me)
      {
         if (me.isPopupTrigger()) {
            createPopup(me.getPoint());
         }
      }

      public void mouseClicked(MouseEvent e) {
         if (e.getClickCount()==2 &&
             canEdit) {
            processEdit();
         }
      }
   }

   private JPopupMenu mPopup;
   private void createPopup(Point p)
   {
      Point scrollTopLeft=mScrollPane.getLocation();
      // log.writeDebug (VERBOSE, "scroll top left is "+scrollTopLeft);
      // Adjust for nested components
      scrollTopLeft=SwingUtilities.convertPoint(mScrollPane.getParent(),
                                                scrollTopLeft, 
                                                this);
      
      // log.writeDebug (VERBOSE, "after conversion "+scrollTopLeft);

      // Adjust for scroll pane.
      Point topLeft=mScrollPane.getViewport().getViewPosition();

      // log.writeDebug (VERBOSE, "viewport top left "+topLeft);
      
      topLeft.x=topLeft.x-scrollTopLeft.x;
      topLeft.y=topLeft.y-scrollTopLeft.y;

      //log.writeDebug (VERBOSE, "adjusted for scroler "+topLeft);
      //log.writeDebug (VERBOSE, "mouse at "+p);
      
      Point displayPoint=new Point(p.x-topLeft.x, p.y-topLeft.y);
      //log.writeDebug (VERBOSE, "displaying at "+displayPoint);

      mPopup.show(this, displayPoint.x, displayPoint.y);
   }

   private int currentX, currentY;
   public void actionPerformed (ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("copy"))
      {
         int row=table.getSelectedRow();
         int col=table.getSelectedColumn();
         col=table.convertColumnIndexToModel(col);

         // this is quite the interesting hack. 
         // creating a text field just to shove something into the
         // clipboard.
         String val=sortedModel.getValueAt(row, col).toString();
         JTextField tempField=new JTextField(val);
         tempField.selectAll();
         tempField.copy();
      }
      else if (action.equals("insert")) {
         processInsert();
      }
      else if (action.equals("edit")) {
         processEdit();
      }
      else if (action.equals("delete")) {
         processDelete();
      }
   } // end ActionPerformed

   /** Action processor */
   void processInsert() {
      try {
         buildSQLTable();
         if (sqlTable != null) {
//             DataEditor.addData(this, 
//                                dbSession, 
//                                sqlTable.getName());
            InsertDataEditor ide=new InsertDataEditor(this, sqlTable, 
                                                      dbSession);
            ide.show();
         }
         else
            MessageWindow.showWarning(this, "Error: No SQLTable available "+
                                      "for DataEditor.");
      }
      catch (Exception ex) {
         log.writeError(1, "Unknown error editing data.", ex);
         //MessageWindow.showWarning(this, "Unknown error editing data.",ex);
         ExceptionDebugger.debug(this, "Unknown error editing data.",ex);
      }
   }

   Vector getRowValues(int row) {
      int rowCount=sortedModel.getColumnCount();
      Vector rowVals=new Vector();
      for (int i=0; i<rowCount; i++) {
         rowVals.addElement(sortedModel.getValueAt(row, i));
      }
      return rowVals;
   }

   /** Action processor */
   void processEdit() {
      try {
         buildSQLTable();
         int row=table.getSelectedRow();

         if (row < 0) {
            /* Fix for #1157: Show warning dialog if no row was selected.
             *///rbw20060727
            JOptionPane.showMessageDialog(this, 
                                          "Please clearly select the row you want to edit.\n(such as left-clicking on it)",
                                          "No Row Selected", JOptionPane.WARNING_MESSAGE);
            return;
         }

         HashMap data=new HashMap();
         Vector colnames=new Vector(tableModel.getHeaders());
         // Vector values=new Vector((ArrayList)tableModel.getRows().get(row));
         Vector values=getRowValues(row);

         for (int i=0; i<colnames.size(); i++) {
            String key=colnames.elementAt(i).toString();
            Object val=values.elementAt(i);
            data.put(key, val);
         }
         // Hashtable newVals= null; // FIXME!! NPE
         //DataEditor.editData(RSTablePanel.this, dbSession, 
         //                    sqlTable.getName(), data);
         UpdateDataEditor ude=new UpdateDataEditor(RSTablePanel.this, sqlTable,
                                                   data, dbSession);
         ude.show();
         
         HashMap newVals=ude.getNewData();

         if (newVals != null && newVals.size() > 0 && ude.isSuccess()) {
            log.writeDebug("updating model with: "+newVals);
            // update the model
            Iterator keys=newVals.keySet().iterator();

            while(keys.hasNext()) {
               String key=(String)keys.next();

               Object val=newVals.get(key);
               int col=tableModel.findColumn(key);
               
               log.writeDebug("Setting sorted model, row: "+row+
                              "col: "+col+" val: "+val);
               tableModel.setValueAt(sortedModel.mapRow(row), col, val);
               //sortedModel.setValueAt(val, row, col);
                  
               // update modRC for display of modified rows and columns
               ArrayList cv=(ArrayList)modRC.get(new Integer(row));
               if (cv == null) 
                  cv=new ArrayList();
               cv.add(new Integer(col));
               log.writeDebug("Writing real row "+row+" to mod rc.  "+
                              "currently mapped to "+sortedModel.mapRow(row));
               modRC.put(new Integer(sortedModel.mapRow(row)), cv); 
            }
            //tableModel.updateTable();
            sortedModel.updateTableData();         
         }
         
      } catch (Exception ex) {
         log.writeError(1, "Error editing data -- ", ex);
//          MessageWindow.showWarning(RSTablePanel.this, 
//                                    "Error building EditorWindow, "+
//                                    "see log window for detail.", ex);
         ExceptionDebugger.debug(RSTablePanel.this, 
                                 "Error building EditorWindow.", ex);
      }

//        try {
//           if (sqlTable != null) {
//              int row=table.getSelectedRow();
//              Hashtable data=new Hashtable();
//              Vector colnames=new Vector(tableModel.getHeaders());
//              Vector values=new Vector((ArrayList)tableModel.getRows().get(row));
//              for (int i=0; i<colnames.size(); i++) {
//                 String key=colnames.elementAt(i).toString();
//                 Object val=values.elementAt(i);
//                 data.put(key, val);
//              }
//              DataEditor.editData(this, dbSession.getConnectionInfo(), 
//                                  sqlTable.getName(), data);
//           }
//           else
//              MessageWindow.showWarning(this, "Error: No SQLTable available "+
//                                        "for DataEditor.");
//        }
//        catch (Exception ex) {
//           log.writeError(1, "Unknown error editing data.", ex);
//           MessageWindow.showWarning(this, "Unknown error editing data.", 
//                                     ex);
//        }
   }

   /** */
   void processDelete() {
      try {
         buildSQLTable();
         if (sqlTable != null) {
            int row=table.getSelectedRow();
            if (row < 0) {
            	/* Fix for #1157: Show warning dialog if no row was selected.
            	 *///rbw20060727
            	JOptionPane.showMessageDialog(this, 
                                             "Please clearly select the row you want to delete.\n(such as left-clicking on it)",
                                             "No Row Selected", JOptionPane.WARNING_MESSAGE);
            	return;
            }
            HashMap data=new HashMap();

            Vector colnames=new Vector(tableModel.getHeaders());
            Vector values=new Vector((ArrayList)tableModel.getRows().get(sortedModel.mapRow(row)));
            for (int i=0; i<colnames.size(); i++) {
               String key=colnames.elementAt(i).toString();
               Object val=values.elementAt(i);
               data.put(key, val);
            }


            //boolean success=
            //DataEditor.deleteData(this, dbSession, 
            //                      sqlTable.getName(), data);
            DatabaseUtil dbUtil=dbSession.getDatabaseUtil();

            String deleteSQL=dbUtil.getDeleteSQL(sqlTable, data);
            
            if (MessageWindow.showWarningOption(this, "Confirm Delete",
                                                "Are you sure you want "+
                                                "to delete with this SQL:\n"+
                                                deleteSQL))
            {
               UpdateThread ut=dbSession.executeUpdate(deleteSQL, false);
               ut.join();
               
               boolean success=ut.isSuccess();
               
               if (success) {
                  //rows.removeElementAt(row+1);
                  log.writeDebug("Successfully removed row, removing "+row+
                                 " from display.");
                  tableModel.removeRow(sortedModel.mapRow(row));
                  tableModel.updateTable();
               } else {
                  log.writeDebug("Error removing rown.");
                  statusBar.setCenter("Error removing row.  See log");
//                   MessageWindow.showWarning(this, "Error deleting row, see the "+
//                                             "log at View->System Console for "+
//                                             "more detail", ut.getException());

                  ExceptionDebugger.debug(this, "Error deleting row.", 
                                          ut.getException());
               }
            }
         }
         else
            MessageWindow.showWarning(this, "Error: No SQLTable available "+
                                      "for DataEditor.");
      }
      catch (Exception ex) {
         log.writeError(1, "Unknown error editing data.", ex);
//          MessageWindow.showWarning(this, "Unknown error editing data.", 
//                                    ex);
         ExceptionDebugger.debug(this, "Unknown error editing data.",ex);
      }
   }

   /** */
   void buildSQLTable() 
      throws SQLException {
      if (sqlTable == null) {
         SchemaUtil su=dbSession.getSchemaUtil();
         sqlTable=su.getTable(editTableName);
      }
   }


   /** 
    */
   private class Toolbar extends JToolBar implements ActionListener
   {
      JButton pageUp, pageDown;
      JButton excel, xml, html, email, refresh, autosize, normalsize;
      
      /** */
      public Toolbar()
      {
         setFloatable(false);
         int h=25;
         int w=25;
         ImageIcon icon=null;

         icon=IconFactory.findIcon("resources/icons/tree/csv_button.gif", h, w);
         excel=new JButton(icon);
         excel.setActionCommand("csv");
         excel.setToolTipText("Export to CSV");
         excel.addActionListener(this);
         excel.setMargin(new Insets(0, 0, 0, 0));
         this.add (excel);


         icon=IconFactory.findIcon("resources/icons/tree/html_button.gif", h, w);
         html=new JButton(icon);
         html.setActionCommand("html");
         html.setToolTipText("Export to HTML");
         html.addActionListener(this);
         html.setMargin(new Insets(0, 0, 0, 0));
         this.add (html);

//           icon=IconFactory.findIcon("resources/icons/tree/xml_button.gif", h, w);
//           xml=new JButton(icon);
//           xml.setActionCommand("xml");
//           xml.setToolTipText("Export to XML");
//           xml.addActionListener(this);
//           xml.setMargin(new Insets(0, 0, 0, 0));
//           this.add (xml);

         xml=new JButton(new ExportXMLAction(WinUtil.
                                             findParentJFrame(this), 
                                             tableModel));
         xml.setMargin(new Insets(0, 0, 0, 0));
         this.add(xml);

         // icon=IconFactory.findIcon("resources/icons/email1.gif", h, w);
         icon=IconFactory.findIcon("resources/icons/tree/email_button.gif", h, w);
         email=new JButton(icon);
         email.setActionCommand("email");
         email.setToolTipText("Send as E-Mail");
         email.addActionListener(this);
         email.setMargin(new Insets(0, 0, 0, 0));
         this.add (email);

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "database_refresh.gif", h, w);
         refresh=new JButton(icon);
         refresh.setActionCommand("refresh");
         refresh.setToolTipText("Refresh Query Data From Database");
         refresh.addActionListener(this);
         this.addSeparator();
         this.addSeparator();
         refresh.setMargin(new Insets(0, 0, 0, 0));
         this.add(refresh);

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "resize_cols.gif", h, w);
         autosize=new JButton(icon);
         autosize.setActionCommand("autosize");
         autosize.setToolTipText("Optomize Column Width");
         autosize.addActionListener(this);
         this.addSeparator();
         autosize.setMargin(new Insets(0, 0, 0, 0));
         this.add (autosize);

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "normal_cols.gif", h, w);
         normalsize=new JButton(icon);
         normalsize.setActionCommand("normalsize");
         normalsize.setToolTipText("Standard Column Width");
         normalsize.addActionListener(this);
         normalsize.setMargin(new Insets(0, 0, 0, 0));
         this.add (normalsize);

         this.addSeparator();

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "query_up.gif", h, w);
         JButton queryup=new JButton(icon);
         queryup.setActionCommand("queryup");
         queryup.setToolTipText("Copy Query to Editor");
         queryup.addActionListener(this);
         queryup.setMargin(new Insets(0, 0, 0, 0));
         this.add (queryup);

         this.addSeparator();

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "page_up.gif", h, w);
         pageUp=new JButton(icon);
         pageUp.setActionCommand("page_up");
         pageUp.setToolTipText("Page Up");
         pageUp.setEnabled(false);
         pageUp.addActionListener(this);
         pageUp.setMargin(new Insets(0, 0, 0, 0));
         this.add (pageUp);

         icon=IconFactory.findIcon("resources/icons/db_buttons/"+
                                   "page_down.gif", h, w);
         pageDown=new JButton(icon);
         pageDown.setActionCommand("page_down");
         pageDown.setToolTipText("Page Down");
         pageDown.addActionListener(this);
         pageDown.setMargin(new Insets(0, 0, 0, 0));
         this.add (pageDown);

         JButton print=new JButton("Print");
         print.setActionCommand("print");
         print.addActionListener(this);
         //this.addSeparator();
         //this.addSeparator();
         //this.add(print);

      }

      /** */
      public void update() {
         if (tableModel.hasPagesDown())
            pageDown.setEnabled(true);
         else 
            pageDown.setEnabled(false);

         if (tableModel.hasPagesUp())
            pageUp.setEnabled(true);
         else
            pageUp.setEnabled(false);
      }


      /** */
      public void queryStarted() {
         RSTablePanel.this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
         pageUp.setEnabled(false);
         pageDown.setEnabled(false);
         excel.setEnabled(false);
         xml.setEnabled(false);
         html.setEnabled(false);
         email.setEnabled(false);
         refresh.setEnabled(false);
         autosize.setEnabled(false);
         normalsize.setEnabled(false);
      }

      /** */
      public void queryFinished() {
         RSTablePanel.this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         pageUp.setEnabled(true);
         pageDown.setEnabled(true);
         excel.setEnabled(true);
         xml.setEnabled(true);
         html.setEnabled(true);
         email.setEnabled(true);
         refresh.setEnabled(true);
         autosize.setEnabled(true);
         normalsize.setEnabled(true);
         update();
      }


      /** */
      public void actionPerformed(ActionEvent ae)
      {
         try {
            String action=ae.getActionCommand();
            if (action.equals("csv")) {
               log.writeDebug ("Exporting to csv.");
               UPA.getInstance().addEvent("rstp_csv");
               dumpToExcel();
            }
            else if (action.equals("html")) {
               log.writeDebug ("Exporting to HTML.");
               UPA.getInstance().addEvent("rstp_html");
               dumpToHTML();
            }
            else if (action.equals("email")) {
               log.writeDebug ("Forward results.");
               UPA.getInstance().addEvent("rstp_email");
               forwardResults();
            }
//             else if (action.equals("xml")) {
//                UPA.getInstance().addEvent("rstp_xml");
//                dumpToXML();
//             }
            else if (action.equals("autosize")) {
               autosizeCols();
            }
            else if (action.equals("normalsize")) {
               normalSizeCols();
            }
            else if (action.equals("refresh")) {
               log.writeDebug("Refreshing query");
               refreshQuery();
            }
            else if (action.equals("print")) {
               log.writeDebug("Starting print job...");
               printResults();
            }
            else if (action.equals("queryup")) {
               dbSession.setEditorText(queryString);
            }
            else if (action.equals("page_up")) {
               tableModel.pageUp();
               update();
               updateStatusBar();
            }
            else if (action.equals("page_down")) {
               try {
                  RSTablePanel.this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                  tableModel.pageDown();
                  update();
                  updateStatusBar();
               } catch (Exception ex) {
                  log.writeError(1, "Error retrieving additional rows.", ex);
//                   MessageWindow.showWarning(RSTablePanel.this, 
//                                             "Error retriving additional rows.",
//                                             ex);
                  ExceptionDebugger.debug(RSTablePanel.this, 
                                          "Error retriving additional rows.",
                                          ex);
               }
               finally {
                  RSTablePanel.this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
               }
            }
         } catch (Exception ex) {
            log.writeError(1, "Exception in evnet dispatching: ", ex);
         }
      }
   }

   /** */
   private void printResults() {
      PrintUtilities.printComponent(table);
   }

   /** */
   private void refreshQuery() {
      log.writeDebug("RSTP Refresh - Query String: "+queryString);
      tableModel.close();
      modRC=new HashMap();

      // we can't wait for swingutils.invokelater to disable the
      // refresh button.  User's could double click.
      // this is a potential source of a bad state if something very
      // bad happens between here and the first few lines of the query thread.
      // pab, 05/02/02, 00:32.
      toolbar.queryStarted();
      dbSession.executeQuery(queryString, panelModel);
   }

   /**
    *
    */
   private void dumpToExcel()
   {
      // open a JFileChooser, and let the user choose where to save
      // the file to.
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".csv");
      chooser.setFileFilter(extFilter);
      if (lastFileChosen != null) {
         log.writeDebug(3, "Setting last dir to "+
                        lastFileChosen.getAbsolutePath());
         chooser.setCurrentDirectory(lastFileChosen);
      }
      int returnVal=chooser.showSaveDialog(this);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         String file=chooser.getSelectedFile().getAbsolutePath();
         if (!file.endsWith(".csv"))
            file=file+".csv";

         log.writeDebug ("File chooser choose: "+file);

         File newFile=null;
         try
         {
            File f=new File(file);
            lastFileChosen=f;
            newFile=TableUtil.sendToCSVFile(tableModel.getRowsWithHeaders(), f);
         }
         catch (IOException ex)
         {
            log.printStackTrace(ex);

            String message="An error occured saving this file.  Make sure \n"+
            "that the file chosen is writable.";

            //MessageWindow.showWarning(this, message, ex);
            ExceptionDebugger.debug(this, message, ex);
            
            return;
         }

         Environment env=Environment.getEnvironment();
         if (env.isWintel())
         {
            String sendToSystemMessage=
            "On windows systems that are properly configured, it will \n"+
            "be possible to send the file just saved to the system, and \n"+
            "it will be opened by any spreadsheet registered with "+
            "the system.\n\n"+
            "Would you like to send this file to the system now?";
            int sendToSystem=
            JOptionPane.showConfirmDialog(this, sendToSystemMessage, 
                                          "Send to System?", 
                                          JOptionPane.YES_NO_OPTION);
            
            if (sendToSystem == JOptionPane.YES_OPTION)
            {
               // Send the url to the system with start.
               env.sendToSystem(newFile.getAbsolutePath());
            }
         }
         else
         {
            // The file has been saved, we're done.
            String message=
            "Data successfully saved to: \n"+
            newFile.getAbsolutePath();

            JOptionPane.showConfirmDialog(this, message, "Save successful.",
                                          JOptionPane.OK_OPTION);
         }
      }
   }

   /**
    *
    */
   private void dumpToHTML()
   {
      // open a JFileChooser, and let the user choose where to save
      // the file to.
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".html");
      chooser.setFileFilter(extFilter);
      if (lastFileChosen != null) {
         log.writeDebug(3, "Setting last dir to "+
                        lastFileChosen.getAbsolutePath());
         chooser.setCurrentDirectory(lastFileChosen);
      }

      int returnVal=chooser.showSaveDialog(this);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         String file=chooser.getSelectedFile().getAbsolutePath();
         if (!file.endsWith(".html"))
            file=file+".html";

         log.writeDebug ("File chooser choose: "+file);

         File newFile=null;
         try {
            File f=new File(file);
            lastFileChosen=f;
            newFile=TableUtil.sendToHTMLFile(tableModel.getHeaders(),
                                             tableModel.getRows(), f);
         }
         catch (IOException ex) {
            log.printStackTrace(ex);

            String message="An error occured saving this file.  Make sure \n"+
            "that the file chosen is writable.";

            //MessageWindow.showWarning(this, message, ex);
            ExceptionDebugger.debug(this, message, ex);

            return;
         }

         Environment env=Environment.getEnvironment();
         if (env.isWintel())
         {
            String sendToSystemMessage=
            "On windows systems that are properly configured, it will \n"+
            "be possible to send the file just saved to the system, and \n"+
            "it will be opened by any browser registered with "+
            "the system.\n\n"+
            "Would you like to send this file to the system now?";
            int sendToSystem=
            JOptionPane.showConfirmDialog(this, sendToSystemMessage, 
                                          "Send to System?", 
                                          JOptionPane.YES_NO_OPTION);
            
            if (sendToSystem == JOptionPane.YES_OPTION)
            {
               // Send the url to the system with start.
               env.sendToSystem(newFile.getAbsolutePath());
            }
         }
         else
         {
            // The file has been saved, we're done.
            String message=
            "Data successfully saved to: \n"+
            newFile.getAbsolutePath();

            JOptionPane.showConfirmDialog(this, message, "Save successful.",
                                          JOptionPane.OK_OPTION);
         }
      }
   }

   /** */
   private void forwardResults() {
      ForwardResultsDialog.showDialog(this, tableModel.getHeaders(),
                                      tableModel.getRows(), 
                                      queryString, databaseName);
   }

   /** */
   private void autosizeCols() {
      autosizeCols=true;
      JTableUtil.autosizeCols(table, 6, maxColumnWidth);
   }

   /** */
   private void normalSizeCols() {
      autosizeCols=false;
      TableColumn column=null;
      for (int i=0; i<tableModel.getColumnCount(); i++) {
         column = table.getColumnModel().getColumn(i);
         column.setPreferredWidth(75);
      }
      tableModel.updateTableStructure();
      table.invalidate();
      table.repaint();
   }

   /** 
    * Should properly parse the follwoing: 
    * select * from <table>
    * select * from <table> where ...
    * select * from <table1> t, <table2> tt
    * select * from <table1> t, <table2> tt where ...
    * select * from <table> t
    * select * from <table> t where ...
    **/
   static Vector guessTableNamesFromSQL(String sql) {
      String lcsql=sql.toLowerCase();
      lcsql=removeCRLF(lcsql);
      int fromindex=lcsql.indexOf(" from ");
      int whereindex=lcsql.indexOf(" where ");
      int orderbyindex=lcsql.indexOf("order by");
      int groupbyindex=lcsql.indexOf("group by");

      Vector tables=null;

      if (fromindex != -1) {
         if (whereindex == -1) {
            if (orderbyindex != -1 && groupbyindex == -1)
               whereindex=orderbyindex;
            else if (orderbyindex == -1 && groupbyindex != -1)
               whereindex=groupbyindex;
            else if (orderbyindex != -1 && groupbyindex != -1)
               whereindex=Math.min(orderbyindex, groupbyindex);
            else
               whereindex=sql.length();
         }
         
         String tableString=sql.substring(fromindex + 6, whereindex);
         log.writeDebug("Table string: "+tableString);

         StringTokenizer st=new StringTokenizer(tableString, ",", false);
         while(st.hasMoreElements()) {
            String atable=st.nextToken();
            atable=atable.trim();
            if (atable.indexOf(" ") != -1)
               atable=atable.substring(0, atable.indexOf(" "));

            if (tables == null)
               tables=new Vector();
            tables.addElement(atable);
         }
      } else {
         log.writeDebug("from index -1: "+lcsql);
      }

      log.writeDebug(3, "Guess tables: "+tables);
      return tables;
   }

   /** */
   static String removeCRLF(String s) {
      StringBuffer sb=new StringBuffer(s.length());
      char chars[]=s.toCharArray();
      for(int i=0; i<chars.length; i++) {
         if (chars[i] == '\r' ||
             chars[i] == '\n' ||
             chars[i] == '\t')
            sb.append(" ");
         else
            sb.append(chars[i]);
      }
      return sb.toString();
   }


   final class RSTableCellRenderer extends DefaultTableCellRenderer
   {
      Color defaultForeground=null;

      public RSTableCellRenderer() {
         defaultForeground=getForeground();
      }

      public Component 
      getTableCellRendererComponent(JTable table,
                                    Object value,     // value to display
                                    boolean isSelected,// is the cell selected
                                    boolean hasFocus, 
                                    int row, int col)// row, col
      {
         Component renderer=super.getTableCellRendererComponent(table, value,
                                                                isSelected, 
                                                                hasFocus,
                                                                row, col);
         
         if (value instanceof Null) {
            renderer.setEnabled(false);
            // System.out.println("Rendering "+row+", "+col+" as null.");
         }
         else
            renderer.setEnabled(true);
         try {
            ArrayList cv=
            (ArrayList)modRC.get(new Integer(sortedModel.mapRow(row)));

            if (cv != null) {
               int index=cv.indexOf(new Integer(col));
               if (index != -1) {
                  renderer.setForeground(Color.blue);
                  // System.out.println ("updated: "+row+", "+col+"   "+cv);
               }
               else
                  renderer.setForeground(defaultForeground);
            }
            else
               setForeground(defaultForeground);
         } catch (Exception ex) {
            log.writeError(1, "error rendering row "+row+" col "+col, ex);
         }
         return renderer;
      }
   }
}


