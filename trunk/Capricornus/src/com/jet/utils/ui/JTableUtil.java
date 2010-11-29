package com.jet.utils.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * Helper class for JTables.
 *
 * @author Paul Bemowski
 */
public class JTableUtil
{
   public static final void autosizeCols(JTable table, 
                                         int minColumnWidth, 
                                         int maxColumnWidth) {
      TableColumn column=null;
      FontMetrics fm=table.getFontMetrics(table.getFont());

      TableModel model=table.getModel();
      int colCount=model.getColumnCount();
      int rowCount=model.getRowCount();

      // calculate the optimum column widths
      int colWidth[]=new int[colCount];
      String maxWidthTemp[]=new String[colCount];

      for (int i=0; i<colCount; i++) {
         if (maxWidthTemp[i] == null)
            maxWidthTemp[i]="";
         for (int j=0; j<rowCount; j++) {
            if (maxWidthTemp[i] != null) {
               String s=model.getValueAt(j, i).toString();
               if (s.length() > maxWidthTemp[i].length())
                  maxWidthTemp[i]=s;
            }
         }
      }

      for (int i=0; i<colCount; i++) {
         if (maxWidthTemp[i].length() >= maxColumnWidth)
            colWidth[i]=maxColumnWidth*fm.stringWidth("m");
         else if (maxWidthTemp[i].length() <= minColumnWidth) 
            colWidth[i]=minColumnWidth*fm.stringWidth("m");
         else
            colWidth[i]=fm.stringWidth(maxWidthTemp[i]+"m");
      }
      // log.writeDebug("Col widths calc'd.");

      for (int i=0; i<model.getColumnCount(); i++) {
         column = table.getColumnModel().getColumn(i);
         int pixWidth=colWidth[i]; //*fm.charWidth('h');
         column.setPreferredWidth(pixWidth);
      }
      // model.updateTableStructure();
      table.invalidate();
      table.repaint();
   }
}






