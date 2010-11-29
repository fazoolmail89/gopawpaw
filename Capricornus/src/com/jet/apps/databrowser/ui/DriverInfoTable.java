package com.jet.apps.databrowser.ui;


import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import java.util.*;

import com.jet.log.*;
import com.jet.utils.ui.*;

/**
 *
 *
 */
public class DriverInfoTable extends JDialog
   implements Logger, ActionListener
{
   Vector data=new Vector();

   public DriverInfoTable(Frame parent, Connection conn)
   {
      super(parent, true);
      setTitle("Driver/DB Info");
      setSize(450, 200);
      this.getContentPane().setLayout(new BorderLayout());
      // Gather data
      gatherData(conn);

      TableModel tm=new TableModel();

      JTable table=new JTable(tm);
      JScrollPane sp=new JScrollPane(table);
      this.getContentPane().add(sp, "Center");

      JPanel buttonPanel=new JPanel();
      buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      JButton close=new JButton("Close");
      close.addActionListener(this);
      buttonPanel.add(close);
      
      this.getContentPane().add(buttonPanel, "South");
      // pack();
   }

   /**
    *
    */
   public static void showInfoTable(Frame parent, Connection conn)
   {
      DriverInfoTable dit=new DriverInfoTable(parent, conn);

      dit.setLocation(WinUtil.alignCenter(dit));
      dit.show();
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      this.dispose();
   }

   /**
    *
    */
   private void gatherData(Connection conn)
   {
      String temp=null;
      Vector row=null;
      DatabaseMetaData dbmd=null;

      try
      {
         dbmd=conn.getMetaData();
      } catch (Exception ex) {
         log.printStackTrace(ex);
         return; // no data avail.
      }

      try {
         row=new Vector();
         row.addElement("Database Product Name");

         temp=dbmd.getDatabaseProductName();
         row.addElement(temp);
      } catch (Exception ex) {
         row.addElement("Error: "+ex.getMessage());
      }
      data.addElement(row);

      try {
         row=new Vector();
         row.addElement("Database Product Version");

         temp=dbmd.getDatabaseProductVersion();
         row.addElement(temp);
      } catch (Exception ex) {
         row.addElement("Error: "+ex.getMessage());
      }
      data.addElement(row);


      try {
         row=new Vector();
         row.addElement("Driver Name");

         temp=dbmd.getDriverName();
         row.addElement(temp);
      } catch (Exception ex) {
         row.addElement("Error: "+ex.getMessage());
      }
      data.addElement(row);

      try {
         row=new Vector();
         row.addElement("Driver Version");

         temp=dbmd.getDriverVersion();
         row.addElement(temp);
      } catch (Exception ex) {
         row.addElement("Error: "+ex.getMessage());
      }
      data.addElement(row);

   }



   private String breakCSVString(String s, int breakpoint)
   {
      StringTokenizer st=new StringTokenizer(s, ",", false);

      String newString="";
      int count=0;
      boolean initHit=true;

      while (st.hasMoreTokens())
      {
         String val=st.nextToken();
         count++;
         if (count == breakpoint)
         {
            newString=newString+", "+val+"\n";
            count=0;
         }
         else
         {
            newString=newString+", "+val;
         }
      }
      return newString;
   }


   /**
    * TableModel class for the table in this window.
    */
   class TableModel extends AbstractTableModel
   {
      public int getColumnCount() {return 2;}

      public String getColumnName(int col)
      {
         if (col ==0)
            return "Property";
         else if (col == 1)
            return "Value";
         else
            return "Error";
      }
      public int getRowCount() {return data.size();}

      public Object getValueAt(int row, int col)
      {
         Vector aRow=(Vector)data.elementAt(row);
         return aRow.elementAt(col);
      }
      public void updateTable()
      {
         this.fireTableStructureChanged();
      }
   }
}
