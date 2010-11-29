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

import java.io.*;

import com.jet.utils.*;

import com.jet.utils.ui.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.*;
import com.jet.utils.exception.ValidationException;
import com.jet.database.*;
import com.jet.apps.databrowser.database.dio.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.database.*;
/**
 *
 *
 */
public class ImportDataWizard extends JETWizard 
   implements Logger // , ActionListener
{
   ConnectionInfo conInfo=null;
   JTextArea selectSql=null;   
   EProperties wizProps=new EProperties();
   String tableName=null;

   /**
    *
    */
   ImportDataWizard (Frame parent, ConnectionInfo ci, String table)
   {
      super(parent);
      setSize(450, 200);
      setLocation(WinUtil.alignCenter(this));
      setTitle("Import Data");
      // setIconImage(parent.getIconImage());
      tableName=table;
      conInfo=ci;

      Vector tableNames=ci.getSchemaUtil().getTableNames();

      addWizardPanel(new ID1(tableNames, table));
      addWizardPanel(new ImportColumnMapper());
      addWizardPanel(new ID2());
      
   }
   
   /** */
   public static void importData(Frame p, ConnectionInfo ci) {
      ImportDataWizard edw=new ImportDataWizard(p, ci, null);
      
      edw.show();
   }

   /** */
   public static void importData(Frame p, ConnectionInfo ci, String table){
      ImportDataWizard edw=new ImportDataWizard(p, ci, table);
      
      edw.show();
   }

   public void finish()
   {
      log.writeDebug ("Finish called.");

      ProgressFrame pf=new ProgressFrame(owner);

      DataImportEngine die=new DataImportEngine(wizProps, conInfo, pf);

      die.start();

      pf.show();
   }


   /*public void actionPerformed(ActionEvent ae)
   {
      super(ae
      String action =ae.getActionCommand();
      
      }*/

   
   /**
    *
    */
   class ID1 extends JETWizardPanel implements ActionListener
   {
      JTextField importFileName=null;
      JButton browse=null;
      JComboBox tables=null;

      String message="";
      //"Choose a file from which to import data.  The data must be in \n"+
      //"comma separated variable format.";
      
      public ID1(Vector tv, String table) 
      {
         super(new BorderLayout());

         JPanel northPanel=new JPanel(new BorderLayout());
         northPanel.add(new JLabel("Choose Destination Table: "), "West");
         
         tv.insertElementAt("", 0);
  
         tables=new JComboBox(tv);
         if (table != null)
            tables.setSelectedItem(table);
         northPanel.add(tables, "Center");

         add(northPanel, "North");

         // JTextArea msg=new JTextArea();
         JLabel msg=new JLabel();
         msg.setText(message);
         //msg.setEnabled(false);
         //msg.setLineWrap(true);
         //msg.setWrapStyleWord(true);
         add(msg, "Center");

         String filename=System.getProperty("user.home");
         if (tableName == null)
            filename=filename+"/table.csv";
         else
            filename=filename+"/"+tableName+".csv";

         importFileName=new JTextField();
         importFileName.setText(filename);
         
         JPanel southPanel=new JPanel(new BorderLayout());
         southPanel.add(importFileName, "Center");
         
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

         String table=(String)tables.getSelectedItem();
         table=table.trim();
         if (DataValidator.empty(table))
            valEx.addValidation("Import Table", "You have not chosen a valid "+
                                "table to export.");

         Vector columns=new Vector();
         SQLTable sqlTable=null;

         // get the file, verify that the parent dir exists
         String file=importFileName.getText().trim();
         if (DataValidator.empty(file))
         {
            valEx.addValidation("Export File", "You have not chosen a valid "+
                                "file name to export the data to.");
         }

         // hold here, make sure they have the basic data.
         if (valEx.getErrorCount() > 0)
            throw valEx;


         int rows=-1;
         FileInputStream fis=null;
         try {
            fis=new FileInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            
            // read the col names from the first line.
            String line=br.readLine();
            if (DataValidator.empty(line)) {
               // this file is more than a little short on data.
               valEx.addValidation("Input File", 
                                   "It appears the input file contains "+
                                   "no data.");
            }
            else {
               StringTokenizer st=new StringTokenizer(line, ",", false);
               
               while(st.hasMoreElements())
               {
                  columns.addElement(st.nextToken().trim());
               }
               
               br.readLine(); // type line.

               rows=0;
               // now count rows
               while (br.readLine() != null)
                  rows++;
            }

            sqlTable=conInfo.getSchemaUtil().getTable(table);
            

            // make sure cols match up for now.  In the future, 
            // we'll suport a column mapper, and partial uploads
            if (false)
            {
               valEx.addValidation("Table/File",
                                   "At this time the import file MUST have "+
                                   "the same number of columns as the file."+
                                   "The input file specified has "+
                                   columns.size()+" columns, and the table "+
                                   "has "+sqlTable.size());
            }
         } catch (IOException ex) {
            log.printStackTrace(ex);
            valEx.addValidation("Input File", 
                                "Caught and excpetion attempting to count "+
                                "the rows in the export table. \n\n"+
                                ex.toString());
         } catch (SQLException ex) {
            log.printStackTrace(ex);
            valEx.addValidation("Input Table", 
                                "Caught and excpetion attempting to read "+
                                "the table definition from the Database. \n\n"+
                                ex.toString());
         }
         finally
         {
            try{if (fis != null) fis.close();}
            catch (Exception ex){log.printStackTrace(ex);}
         }

         if (rows == 0)
            valEx.addValidation("Input File", 
                                "There are no rows to be imported.");

         if (valEx.getErrorCount() > 0)
            throw valEx;


         wizProps.put("import.table", table);
         wizProps.put("import.file", file);
         wizProps.put("import.columns", columns);
         wizProps.put("import.rowCount", (""+rows));
         wizProps.put("import.sqlTable", sqlTable);
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
         int returnVal=chooser.showOpenDialog(this);
         if (returnVal == chooser.APPROVE_OPTION)
         {
            String file=chooser.getSelectedFile().getAbsolutePath();
            importFileName.setText(file);
         }
      }
   }
   
   /**
    *
    */
   class ID2 extends JETWizardPanel implements ActionListener
   {
      JRadioButton insert, update, insert_update;
      JCheckBox autoCommit=null;

      JLabel importInfo=null;
      JCheckBox logErrors=null;

      public ID2() // , EProperties eps)
      {
         super(new BorderLayout());

         importInfo=new JLabel("Importing ?? rows to <table>");

         JPanel centerPanel=new JPanel(new GridBagLayout());
         insert=new JRadioButton("Insert Only");
         insert.setSelected(true);
         update=new JRadioButton("Update Only");
         //update.setEnabled(false);
         insert_update=new JRadioButton("Insert/Update");
         //insert_update.setEnabled(false);
         
         logErrors=new JCheckBox("Log errors to console log.");
         logErrors.setSelected(true);
         
         ButtonGroup bg=new ButtonGroup();
         bg.add(insert);
         bg.add(update);
         bg.add(insert_update);

         GridBagConstraints c=new GridBagConstraints();
         
         c.gridx=0; c.gridy=0; c.weightx=1; c.weighty=1; c.fill=c.BOTH;

         
         centerPanel.add(insert, c);
         c.gridx=1;
         centerPanel.add(update, c);
         c.gridx=2;
         centerPanel.add(insert_update, c);

         c.gridx=0; c.gridy=1; c.gridwidth=3;
         centerPanel.add(logErrors, c);

         this.add(importInfo, "North");
         this.add(centerPanel, "Center");
      }

      /** */
      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
      }
      
      /** */
      public void onEnter()
      {
         String table=wizProps.getProperty("import.table");
         String file=wizProps.getProperty("import.file");
         int rows=wizProps.getInt("import.rowCount");
         importInfo.setText("Importing "+rows+" rows from "+file+
                            " to "+table);
      }
      
      /** */
      public void next()
         throws ValidationException
      {
         ValidationException valEx=new ValidationException();

         if (valEx.getErrorCount() > 0)
            throw valEx;
         
         wizProps.putBoolean("import.insertOnly", insert.isSelected());
         wizProps.putBoolean("import.updateOnly", update.isSelected());
         wizProps.putBoolean("import.insertAndUpdate", 
                             insert_update.isSelected());

         log.writeDebug ("Moving next, wizProps:\n"+wizProps);
      } // next()
   } // class ID2

   /**
    *
    */
   class ImportColumnMapper extends JETWizardPanel implements ActionListener
   {
      SQLTable sqlTable=null;
      Vector colNames=null;
      TableModel model=null;
      JTable table=null;
      
      DataImportMap dataImportMap=null;

      
      public ImportColumnMapper() // , EProperties eps)
      {
         super(new BorderLayout());

         model=new TableModel();
         table=new JTable(model);
         JScrollPane sp=new JScrollPane(table);

         //table.getColumn("Export").setPreferredWidth(15);
         table.getColumn("Import").setPreferredWidth(15);
         // table.getColumn("Import Type").setPreferredWidth(100);
         table.getColumn("Column").setPreferredWidth(100);
         table.getColumn("From File").setPreferredWidth(100);
         table.getColumn("Default Val").setPreferredWidth(100);
         

         this.add(new JLabel("Map Import Columns"), "North");
         this.add(sp, "Center");
      }

      /** */
      public void actionPerformed(ActionEvent ae)
      {
      }
      
      /** */
      public void onEnter()
      {
         sqlTable=(SQLTable)wizProps.get("import.sqlTable");
         colNames=(Vector)wizProps.get("import.columns");

         dataImportMap=new DataImportMap(colNames, sqlTable);

         JComboBox combo=new JComboBox(colNames);
         DefaultCellEditor typeEditor=new DefaultCellEditor(combo);
         table.getColumn("From File").setCellEditor(typeEditor);

         model.updateTable();
      }
      
      /** */
      public void next()
         throws ValidationException
      {
         ValidationException valEx=new ValidationException();
         
         wizProps.put("import.colMap", dataImportMap);

         if (valEx.getErrorCount() > 0)
            throw valEx;

         log.writeDebug ("Moving next, wizProps:\n"+wizProps);
      } // next()
      
      static final int IMPORT=0;
      static final int TABLE_COLUMN=1;
      static final int FILE_COLUMN=2;
      static final int DEFAULT_VALUE=3;
      class TableModel extends AbstractTableModel
      {
         public int getColumnCount() {return 4;}
         public String getColumnName (int col)
         {
            switch (col)
            {
               case IMPORT: return "Import";
               case TABLE_COLUMN: return "Column";
               case FILE_COLUMN: return "From File";
               case DEFAULT_VALUE: return "Default Val";
            }
            return "";
         }
         public int getRowCount()
         {
            if (dataImportMap != null)
               return dataImportMap.size();
            else
               return 0;
         }

         public Object getValueAt(int row, int col)
         {
            // SQLColumn c = sqlTable.columnAt(row);
            switch (col)
            {
               case IMPORT: return new Boolean(dataImportMap.getIsMappable(row));
               case TABLE_COLUMN: 
                  SQLColumn c=dataImportMap.getTableColumn(row);
                  if (c != null)
                     return c.getName();
                  else
                     return "";
               case FILE_COLUMN: return dataImportMap.getFileColumn(row);
               case DEFAULT_VALUE: return dataImportMap.getDefaultValue(row);
            }
            return "";
         }

         public Class getColumnClass(int col)
         {
            switch(col)
            {
               case IMPORT: return Boolean.class;
               case TABLE_COLUMN: return String.class;
               case FILE_COLUMN: return String.class;
               case DEFAULT_VALUE: return String.class;
            }
            return String.class;
         }
         public boolean isCellEditable(int row, int col)
         {
            if (col == IMPORT)
               return true;
            if (col == FILE_COLUMN)
               return ((Boolean)getValueAt(row, IMPORT)).booleanValue();
            if (col == DEFAULT_VALUE)
               return !((Boolean)getValueAt(row, IMPORT)).booleanValue();
            else return false;
         }
         public void setValueAt (Object o, int row, int col)
         {
            // could put in some validaiton here, skipping for now
            switch (col)
            {
               case IMPORT: 
                  dataImportMap.setIsMappable(row, ((Boolean)o).booleanValue());
                  break;
               case FILE_COLUMN:
                  log.writeDebug ("Attempting to set colmap for col "+
                                  row+" to '"+o+"'");
                  dataImportMap.setFileColumn(row, (String)o);
                  break;
               case DEFAULT_VALUE: dataImportMap.setDefaultValue(row, (String)o);
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
      } // End table model
   } // end ImportColumnMapper
}
