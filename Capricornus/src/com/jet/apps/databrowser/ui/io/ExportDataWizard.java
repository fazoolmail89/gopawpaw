package com.jet.apps.databrowser.ui.io;

import java.lang.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;

import com.jet.utils.*;
//import com.jet.utils.db.*;
import com.jet.utils.ui.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.*;
import com.jet.utils.exception.ValidationException;
import com.jet.database.*;
// import com.jet.apps.jdbcbrowser.dio.*;

import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.database.dio.*;

import com.jet.log.Logger;

/**
 *
 *
 */
public class ExportDataWizard extends JETWizard 
   implements Logger // , ActionListener
{
   ConnectionInfo conInfo=null;
   JTextArea selectSql=null;   
   EProperties wizProps=new EProperties();

   String tableName=null;

   /**
    *
    */
   ExportDataWizard (Frame parent, ConnectionInfo ci, String table) {
      super(parent);
      setSize(450, 200);
      setLocation(WinUtil.alignCenter(this));
      setTitle("Export Data");
      // setIconImage(parent.getIconImage());
      tableName=table;
      conInfo=ci;

      Vector tableNames=ci.getSchemaUtil().getTableNames();

      addWizardPanel(new ED1(tableNames, table));
      addWizardPanel(new ExportColumnChooser());
      addWizardPanel(new ED2());
   }

   /** */
   public static void exportData(Frame p, ConnectionInfo ci) {
      ExportDataWizard edw=new ExportDataWizard(p, ci, null);      
      edw.show();
   }

   /** */
   public static void exportData(Frame p, ConnectionInfo ci, String table) {
      ExportDataWizard edw=new ExportDataWizard(p, ci, table);      
      edw.show();
   }
   
   /** */
   public void finish() {
      log.writeDebug ("Finish called.");

      ProgressFrame pf=new ProgressFrame(owner);      
      DataExportEngine dee=new DataExportEngine(wizProps, conInfo, pf);

      dee.start();
      pf.show();
   }

   class ED1 extends JETWizardPanel implements ActionListener
   {
      JTextArea whereClause=null;
      JTextField exportFileName=null;
      JButton browse=null;
      JComboBox tables=null;
      
      public ED1(Vector tv, String table) 
      {
         super(new BorderLayout());

         JPanel northPanel=new JPanel(new BorderLayout());
         northPanel.add(new JLabel("Choose Table to Export: "), "West");
         
         tv.insertElementAt("", 0);
  
         tables=new JComboBox(tv);
         tables.setSelectedItem(table);
         northPanel.add(tables, "Center");

         add(northPanel, "North");

         whereClause=new PopupTextArea();
         whereClause.setBorder(new TitledBorder("Where Clause"));
         
         add(whereClause, "Center");

         String filename=System.getProperty("user.home");
         if (tableName == null)
            filename=filename+"/table.csv";
         else
            filename=filename+"/"+tableName+".csv";

         exportFileName=new JTextField();
         exportFileName.setText(filename);
         
         JPanel southPanel=new JPanel(new BorderLayout());
         southPanel.add(exportFileName, "Center");
         
         browse=new JButton("Browse");
         browse.setActionCommand("browse");
         browse.addActionListener(this);
         southPanel.add(browse, "East");

         southPanel.add(new JLabel("File: "), "West");

         add(southPanel, "South");
      }
      
      /** */
      public void next()
         throws ValidationException
      {
         log.writeDebug ("Starting next...");
         ValidationException valEx=new ValidationException();
         SQLTable sqlTable=null;
         String table=(String)tables.getSelectedItem();
         table=table.trim();
         if (DataValidator.empty(table))
            valEx.addValidation("Export Table", "You have not chosen a valid "+
                                "table to export.");
         
         String where=whereClause.getText().trim();
         if (DataValidator.empty(where))
         {
            // where=null;
         }
         else
         {
            if (!where.toLowerCase().startsWith("where"))
               where="WHERE "+where;
         }

         // get the file, verify that the parent dir exists
         String file=exportFileName.getText().trim();
         if (DataValidator.empty(file))
         {
            valEx.addValidation("Export File", "You have not chosen a valid "+
                                "file name to export the data to.");
         }

         // hold here, make sure they have the basic data.
         if (valEx.getErrorCount() > 0)
            throw valEx;


         int rows=-1;
         ResultSet rs=null;
         Statement state=null;
         Connection con=conInfo.getConnection();
         String sql=null;
         try {
            state=con.createStatement();
            sql="select count(*) from "+table+" "+where;

            rs=state.executeQuery(sql);
            if (rs.next())
               rows=rs.getInt(1);
         } catch (SQLException ex) {
            log.printStackTrace(ex);
            valEx.addValidation("Table and Where Clause", 
                                "Caught and excpetion attempting to count "+
                                "the rows in the export table. \n\nSQL:"+
                                sql+"\n\nException:"+ ex.toString());
         } finally {
            try{if (state != null) state.close();}
            catch (Exception ex){log.printStackTrace(ex);}
         }

         try {
            SchemaUtil su=conInfo.getSchemaUtil();
            sqlTable=su.getTable(table);
         } catch (SQLException ex) {
            log.printStackTrace(ex);
            valEx.addValidation("Table", 
                                "Caught an exception attempting to build "+
                                "the table definition.\n\n"+
                                ex.toString());
         }

         if (rows == 0)
            valEx.addValidation("Table and Where Clause", 
                                "There are no rows to be exported.");

         if (valEx.getErrorCount() > 0)
            throw valEx;


         wizProps.put("export.table", table);
         wizProps.put("export.where", where);
         wizProps.put("export.file", file);
         wizProps.put("export.rowCount", (""+rows));
         wizProps.put("export.sqlTable", sqlTable);
         log.writeDebug ("Moving next, wizProps:\n"+wizProps);
      }

      public void onEnter() {}


      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals("browse"))
            browse();
      }

      private void browse()
      {
         // open a file chooser
         JFileChooser chooser=new JFileChooser();
         chooser.setFileSelectionMode(chooser.FILES_ONLY);
         chooser.setMultiSelectionEnabled(false);

         chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
         ExtensionFilter extFilter=new ExtensionFilter();
         extFilter.addExtension(".csv");
         chooser.setFileFilter(extFilter);
         int returnVal=chooser.showSaveDialog(this);
         if (returnVal == chooser.APPROVE_OPTION)
         {
            String file=chooser.getSelectedFile().getAbsolutePath();
            exportFileName.setText(file);
         }
      }
   }

   /**
    *
    */
   class ExportColumnChooser extends JETWizardPanel implements ActionListener
   {
      SQLTable sqlTable=null;
      TableModel model=null;

      Vector exportTable=null;

      public ExportColumnChooser() // , EProperties eps)
      {
         super(new BorderLayout());

         model=new TableModel();
         JTable table=new JTable(model);
         JScrollPane sp=new JScrollPane(table);

         table.getColumn("Export").setPreferredWidth(15);
         table.getColumn("Name").setPreferredWidth(100);
         table.getColumn("Type").setPreferredWidth(100);

         this.add(new JLabel("Choose Columns to Export"), "North");
         this.add(sp, "Center");
      }

      /** */
      public void actionPerformed(ActionEvent ae)
      {
      }
      
      /** */
      public void onEnter()
      {
         sqlTable=(SQLTable)wizProps.get("export.sqlTable");

         exportTable=new Vector();
         for (int i=0; i<sqlTable.size(); i++)
         {
            exportTable.addElement(new Boolean(true));
         }

         model.updateTable();
      }
      
      /** */
      public void next()
         throws ValidationException
      {
         ValidationException valEx=new ValidationException();
         
         if (valEx.getErrorCount() > 0)
            throw valEx;

         wizProps.put("export.exportColumns", exportTable);

         log.writeDebug ("Moving next, wizProps:\n"+wizProps);
      } // next()
      
      class TableModel extends AbstractTableModel
      {
         public int getColumnCount() {return 4;}
         public String getColumnName (int col)
         {
            switch (col)
            {
               case 0: return "Export";
               case 1: return "Name";
               case 2: return "Type";
               case 3: return "Format";
            }
            return "";
         }
         public int getRowCount()
         {
            if (sqlTable != null)
               return sqlTable.size();
            else
               return 0;
         }
         public Object getValueAt(int row, int col)
         {
            SQLColumn c = sqlTable.columnAt(row);
            switch (col)
            {
               case 0: return exportTable.elementAt(row);
               case 1: return c.getName();
               case 2: return c.getType();
               case 4: return "";
            }
            return null;
         }

         public Class getColumnClass(int col)
         {
            switch(col)
            {
               case 0: return Boolean.class;
               case 1: return String.class;
               case 2: return String.class;
               case 3: return String.class;
            }
            return String.class;
         }
         public boolean isCellEditable(int row, int col)
         {
            if (col == 0)
               return true;
            else 
            {
               if (col == 3 && ((Boolean)getValueAt(row, 0)).booleanValue())
                  return true;
               else
                  return false;
            }
         }
         public void setValueAt (Object o, int row, int col)
         {
            // could put in some validaiton here, skipping for now
            SQLColumn c=sqlTable.columnAt(row);
            switch (col)
            {
               case 0: 
                  exportTable.setElementAt(o, row);
            }
         }
         /**
          * The fireTableXxxxXxxx type functions are protected in
          * AbstracTableModel.  We have to write this function as 
          * public and call it from the update function of the 
          * oberver to update the table properly.  I think this 
          * changed in swing 1.0.2.  
          */
         public void updateTable()
         {
            this.fireTableDataChanged();
         }
      }
   }
   
   /**
    *
    */
   class ED2 extends JETWizardPanel implements ActionListener
   {
      JCheckBox allRows=null;
      JTextField rowLimit=null;
      JLabel rowLimitLabel=null;
      JCheckBox colNamesAsHeaders, colTypesAsHeaders;

      public ED2() // , EProperties eps)
      {
         super(new GridBagLayout());
         
         allRows=new JCheckBox("Export all rows.");
         allRows.setActionCommand("allrows");
         allRows.addActionListener(this);
         rowLimit=new JTextField(20);
         rowLimitLabel=new JLabel("Row limit: ");

         colNamesAsHeaders=new JCheckBox("Export column names as header row");
         colNamesAsHeaders.setSelected(true);
         colTypesAsHeaders=new JCheckBox("Export column types as header row");

         GridBagConstraints c=new GridBagConstraints();
         c.gridx=0; c.gridy=0; c.anchor=c.NORTHWEST; c.fill=c.HORIZONTAL;
         c.weightx=c.weighty=1;

         c.gridx=0;
         add(allRows, c);
         c.gridx=1; c.weightx=.1;
         add(rowLimitLabel, c);
         c.gridx=2; c.weightx=1;
         add(rowLimit, c);

         c.gridx=0; c.gridwidth=3;
         c.gridy=1;
         add(colNamesAsHeaders, c);
         c.gridy=2;
         //add(colTypesAsHeaders, c);

         //JPanel p=new JPanel(new BorderLayout());
         //p.add(rowLimitLabel, "West");
         //p.add(rowLimit, "Center");
         
         //JPanel northPanel=new JPanel(new BorderLayout());
         //northPanel.add(allRows, "West");
         //northPanel.add(p, "Center");
         
         //this.add(northPanel, "North");
      }

      /** */
      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals("allrows"))
         {
            if (allRows.isSelected())
            {
               rowLimit.setEnabled(false);
               rowLimitLabel.setEnabled(false);
            }
            else
            {
               rowLimit.setEnabled(true);
               rowLimitLabel.setEnabled(true);
            }
         }
      }
      
      /** */
      public void onEnter()
      {
        // log.writeDebug ("row count prop is "+wizProps.get("export.rowCount"));
         int rows=wizProps.getInt("export.rowCount");
         allRows.setText("Export all "+rows+" rows.");
      }
      
      /** */
      public void next()
         throws ValidationException
      {
         ValidationException valEx=new ValidationException();
         boolean exportAllRows=allRows.isSelected();
         int rows=-1;
         if (!exportAllRows)
         {
            // try to parse an int out of the text field
            String rowString=rowLimit.getText().trim();
            
            if (DataValidator.empty(rowString))
            {
               valEx.addValidation("Row Limit", "If you choose not to "+
                                   "export all rows, you must enter a row "+
                                   "limit in the field provided.");
            }
            else
            {
               // parse
               try {rows=Integer.parseInt(rowString);}
               catch (NumberFormatException ex)
               {
                  valEx.addValidation("Row Limit", rowString+" is not a "+
                                      "valid integer.  Enter a valid "+
                                      "integer in this field.");
               }
            }
         }
         
         if (valEx.getErrorCount() > 0)
            throw valEx;

         wizProps.putBoolean("export.allRows", exportAllRows);
         wizProps.put("export.rowLimit", ""+rows);

         log.writeDebug ("Moving next, wizProps:\n"+wizProps);
      } // next()
   } // class ED2
}
