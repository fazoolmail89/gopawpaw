package com.jet.apps.databrowser.sqllog.view;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import java.text.*;

import javax.swing.*;
import javax.swing.table.*;

import java.util.*;
import java.util.List;

import com.jet.log.*;
import com.jet.utils.StringUtil;

import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.sqllog.*;

import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.model.*;

/**
 * A display component, optionally in the lower tab window, 
 * showing recently executed SQL.
 *
 */
public class SQLLogView extends JPanel
   implements Logger, SQLLogListener, ActionListener
{
   /** The table model. */
   LogViewTableModel model=null;

   /** */
   JTable table=null;

   /** */
   JScrollPane tableScrollPane=null;
   
   /** */
   LogToolbar toolbar=null;

   /** The current connection info. */
   ConnectionInfo conInfo=null;

   /** The Global instance of SQLLog. */
   SQLLog sqllog=SQLLog.getInstance();

   /** The popup menu... */
   JPopupMenu popupMenu=null;

   /** */
   DataBrowser databrowser=null;

   /** */
   public SQLLogView(DataBrowser db) {
      databrowser=db;
      setLayout(new BorderLayout());

      model=new LogViewTableModel();
      table=new JTable(model);

      table.addMouseListener(new MouseHandler());

      tableScrollPane=new JScrollPane(table);

      add(tableScrollPane, BorderLayout.CENTER);

      toolbar=new LogToolbar();
      add(toolbar, BorderLayout.NORTH);

      TableColumnModel columnModel=table.getColumnModel();
      // rows
      TableColumn column=columnModel.getColumn(0);
      column.setMaxWidth(110);
      column.setMinWidth(20);
      column.setPreferredWidth(75);

      // Success
      column=columnModel.getColumn(1);
      column.setMaxWidth(80);
      column.setMinWidth(40);
      column.setPreferredWidth(60);

      // date time
      column=columnModel.getColumn(2);
      column.setMaxWidth(160);
      column.setMinWidth(30);
      column.setPreferredWidth(1500);

      // SQL
      column=columnModel.getColumn(3);
      column.setCellRenderer(new SQLRenderer());
      //column.setMaxWidth(25);
      //column.setMinWidth(15);
      //column.setPreferredWidth(20);

      DBSession session=databrowser.getSession();
      ConnectionInfo ci=session.getConnectionInfo();

      setConnectionInfo(ci);

      popupMenu=new JPopupMenu();
      
      JMenuItem item=new JMenuItem("Copy SQL to Editor");
      item.setActionCommand("copyToEditor");
      item.addActionListener(this);
      popupMenu.add(item);

      sqllog.addListener(this);
   }

   /** */
   private void createPopup(Point p)
   {
      Point scrollTopLeft=tableScrollPane.getLocation();

      scrollTopLeft=SwingUtilities.convertPoint(tableScrollPane.getParent(),
                                                scrollTopLeft, 
                                                this);
      
      Point topLeft=tableScrollPane.getViewport().getViewPosition();

      topLeft.x=topLeft.x-scrollTopLeft.x;
      topLeft.y=topLeft.y-scrollTopLeft.y;

      Point displayPoint=new Point(p.x-topLeft.x, p.y-topLeft.y);

      popupMenu.show(this, displayPoint.x, displayPoint.y);
   }   

   /** */
   public void actionPerformed(ActionEvent ae) {
      String action=ae.getActionCommand();
      if (action.equals("copyToEditor")) {
         int row=table.getSelectedRow();
         if (row <0)
            return;
         
         String sql=(String)model.getValueAt(row, 3);

         DBSession session=databrowser.getSession();
         session.setEditorText(sql);
      }
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
   }
   
   /** */
   public void logEvent(SQLLogEvent evt) {
      String dbname=evt.getName();
      model.refresh(dbname);
   }

   /** */
   public void close() {
      sqllog.removeListener(this);
   }

   /** */
   public void setConnectionInfo(ConnectionInfo ci) {
      conInfo=ci;
      model.refresh();
      // toolbar.refresh();

      toolbar.reInit(ci);
   }

   /** */
   public class LogViewTableModel extends AbstractTableModel {
      List sqlData=null;

      public int getRowCount() {
         if (sqlData == null)
            return 0;
         return sqlData.size();
      }
      public int getColumnCount() {return 4;}
      
      public String getColumnName(int i) {
         switch (i) {
            case (0): return "Rows";
            case (1): return "Success";
            case (2): return "Date";
            case (3): return "SQL";
            default: return "unknown";
         }
      }
      
      public Object getValueAt(int row, int col) {
         
         // return "row "+row+" col "+col;
         if (sqlData != null) {
            ArrayList arow=(ArrayList)sqlData.get(row);
            return arow.get(col);
         }
         return "nodata";
      }

      public void refresh() {
         String name=toolbar.getConnectionName();
         boolean all=toolbar.isAllSelected();
         int limit=toolbar.getLimit();

         if (sqllog == null)
            return; 

         sqlData=sqllog.getLogData(name, all, limit);

         fireTableDataChanged();
      }

      public void refresh(String dbname) {
         if (dbname == null) {
            log.writeError(1, "ERROR: SQLLogView refresh(name) db name is null");
            return;
         }
         String currentName=toolbar.getConnectionName();
         if (currentName == null || currentName.length() == 0) {
            refresh();
         } else if (currentName.equals(dbname)) {
            refresh();
         }
      }
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

   /** */
   public class LogToolbar extends JPanel implements ActionListener {
      JComboBox connectionNames=null;
      JRadioButton all=null;
      JRadioButton successes=null;
      JTextField limit=null;

      List connectionNamesList=null;

      JLabel rows=null;

      /** */
      public LogToolbar() {
         setLayout(new BorderLayout());

         JPanel left=new JPanel(new FlowLayout(FlowLayout.LEFT));
         JPanel right=new JPanel(new FlowLayout(FlowLayout.RIGHT));
         add(left, BorderLayout.WEST);
         add(right, BorderLayout.EAST);
         
         connectionNames=new JComboBox();

         if (sqllog != null) {
            connectionNamesList=sqllog.getConnectionNames();
         } else {
            connectionNamesList=new ArrayList();
         }

         connectionNamesList.add(0, "");

         addItems(connectionNames, connectionNamesList);

         connectionNames.addActionListener(this);

         ButtonGroup bg=new ButtonGroup();
         all=new JRadioButton("all");
         bg.add(all);
         all.setSelected(true);
         successes=new JRadioButton("successes");
         bg.add(successes);

         all.addActionListener(this);
         successes.addActionListener(this);

         limit=new JTextField(6);
         limit.setText("100");
         limit.addActionListener(this);

         rows=new JLabel();
         rows.setText(""+model.getRowCount());
      
         left.add(all);
         left.add(successes);
         left.add(new JSeparator());

         left.add(connectionNames);
         left.add(new JSeparator());
         left.add(new JLabel("Limit:"));
         left.add(limit);
         
         right.add(rows);
      }
      
      public String getConnectionName() {
         String name=(String)connectionNames.getSelectedItem();
         if ("".equals(name))
            name=null;
         return name;
      }
      
      public void setConnectionName(String name) {
         connectionNames.setSelectedItem(name);
      }
      
      public boolean isAllSelected() {
         return all.isSelected();
      }

      public int getLimit() {
         String text=limit.getText();
         int ilimit=0;
         try {
            ilimit=Integer.parseInt(text);
         } catch (NumberFormatException ex) {
            limit.setText("100");
            return 100;
         }
         return ilimit;
      }

      public void reInit(ConnectionInfo ci) {
         limit.setText("100");
         all.setSelected(true);
         successes.setSelected(false);

         rows.setText(""+model.getRowCount());

         if (ci != null) {
            if (connectionNamesList.contains(ci.getName()))
               setConnectionName(ci.getName());
            else {
               String name=ci.getName();
               connectionNamesList.add(name);
               
               connectionNames.removeAllItems();
               addItems(connectionNames, connectionNamesList);

               setConnectionName(name);
            }
         }
      }

      /** */
      public void actionPerformed(ActionEvent ae) {
         log.writeDebug(4, "SQLLogView.toolbar.actionPerformed()");
         model.refresh();

         rows.setText(""+model.getRowCount());
      }
      
      /** */
      void addItems(JComboBox combo, List items) {
         for (int i=0; i<items.size(); i++) {
            combo.addItem(items.get(i));
         }
      }
   }

   final class SQLRenderer extends DefaultTableCellRenderer
   {
      public SQLRenderer() {
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
         String sql=(String)value;
         sql=StringUtil.replace("<", "&lt;", sql);
         sql=StringUtil.replace(">", "&gt;", sql);
         sql=StringUtil.replace("\n", "<br>", sql);         
         sql="<html>"+sql+"</html>";
         
         JComponent jrenderer=(JComponent)renderer;
         jrenderer.setToolTipText(sql);
         
         return renderer;
      }
   }
}