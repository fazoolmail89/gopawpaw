package com.jet.apps.databrowser.ui.tableinfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

import com.jet.database.*;
import com.jet.utils.ui.*;


/*
 * $Log: IndexInfoPanel.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 */

/**
 * 
 */
public class IndexInfoPanel extends JPanel
{
   SQLTable table=null;
   JTable jtable=null;
   IndexTableModel model=null;

   ArrayList indices=new ArrayList();

   /** */
   IndexInfoPanel() {
      super(new BorderLayout());

      model=new IndexTableModel();
      jtable=new JTable(model);

      JScrollPane sp=new JScrollPane(jtable);
      add(sp, "Center");
   }

   /** */
   public void setSQLTable(SQLTable t) {
      table=t;
      indices=new ArrayList();
      if (t == null) {
         refresh();
         return;
      }
      Hashtable indexHash=table.getIndices();
      Enumeration keys=indexHash.keys();
      while (keys.hasMoreElements()) {
         Object key=keys.nextElement();
         SQLIndex index=(SQLIndex)indexHash.get(key);
         indices.add(index);
      }
      refresh();
   }

   /** */
   void refresh() {
      JTableUtil.autosizeCols(jtable, 10, 50);
      model.refresh();
   }

   /** */
   class IndexTableModel extends AbstractTableModel {
      public int getRowCount() {
         return indices.size();
      }

      public int getColumnCount() {
         return 3;
      }

      public String getColumnName(int col) {
         switch (col) {
            case (0): return "name";
            case (1): return "column";
            case (2): return "type";
            default: return "error";
         }
      }
      
      public Object getValueAt(int row, int col) {
         SQLIndex index=(SQLIndex)indices.get(row);
         switch (col) {
            case (0): return index.getName();
            case (1): return index.getColumn().getName();
            case (2): return index.getTypeName(); 
            default: return "error";
         }
      }

      public void refresh() {
         fireTableDataChanged();
      }
   }
}





