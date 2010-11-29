package com.jet.apps.databrowser.ui.tableinfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import com.jet.database.*;
import com.jet.utils.ui.*;


/*
 * $Log: ColumnInfoPanel.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/10/01 21:16:02  bemocvs
 * size parm
 *
 * Revision 1.3  2002/10/01 15:42:01  bemocvs
 * 3.0.9
 *
 * Revision 1.2  2002/05/04 18:55:10  bemocvs
 * Working
 *
 * Revision 1.1  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 */

/**
 * 
 */
public class ColumnInfoPanel extends JPanel
{
   SQLTable table=null;
   JTable jtable=null;
   ColumnTableModel model=null;

   /** */
   ColumnInfoPanel() {
      super(new BorderLayout());

      model=new ColumnTableModel();
      jtable=new JTable(model);
      // jtable.setDefaultRenderer(Boolean.class, new BooleanRenderer());

      jtable.getColumnModel().getColumn(0).setPreferredWidth(90);
      jtable.getColumnModel().getColumn(1).setPreferredWidth(90);
      jtable.getColumnModel().getColumn(2).setPreferredWidth(20);
      jtable.getColumnModel().getColumn(3).setPreferredWidth(20);
      jtable.getColumnModel().getColumn(4).setPreferredWidth(20);
      jtable.getColumnModel().getColumn(5).setPreferredWidth(20);
      jtable.getColumnModel().getColumn(6).setPreferredWidth(20);


      JScrollPane sp=new JScrollPane(jtable);
      add(sp, "Center");
   }

   /** */
   public void setSQLTable(SQLTable t) {
      table=t;
      refresh();
   }

   /** */
   void refresh() {
      // JTableUtil.autosizeCols(jtable, 10, 50);
      model.refresh();
   }

   /** */
   class ColumnTableModel extends AbstractTableModel {
      public int getRowCount() {
         if (table == null) {
            return 0;
         }
         return table.size();
      }

      public int getColumnCount() {
         return 7;
      }

      public String getColumnName(int col) {
         switch (col) {
            case (0): return "name";
            case (1): return "type";
            case (2): return "size";
            case (3): return "key";
            case (4): return "nullable";
            case (5): return "unique";
            case (6): return "index";
            default: return "error";
         }
      }
      
      public Class getColumnClass(int col) {
         switch (col) {
            case (3):
            case (4): 
            case (5):
            case (6): 
               return Boolean.class;
            default: 
               return Object.class;
         }
      }
      
      public Object getValueAt(int row, int col) {
         SQLColumn column=table.columnAt(row);
         switch (col) {
            case (0): return column.getName();
            case (1): return column.getType().getName();
            case (2): return column.getType().getParameterString();
            case (3): return new Boolean(column.isPrimaryKey());
            case (4): return new Boolean(column.isNullable());
            case (5): return new Boolean(column.isUnique());
            case (6): return new Boolean(column.isIndexed());
            default: return "error";
         }
      }

      public void refresh() {
         fireTableDataChanged();
      }
   }
}





