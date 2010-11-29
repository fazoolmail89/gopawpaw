package com.jet.apps.databrowser.ui;

import java.lang.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

import com.jet.utils.ui.*;
import com.jet.database.*;
import com.jet.utils.icons.*;

import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.database.*;

import com.jet.log.Logger;

/**
 * The table editor will allow a user to add tables to an existing
 * database via JDBC SQL calls.
 *
 * @author Paul Bemowski
 */
public class TableEditor extends JFrame 
   implements Observer, Logger, ActionListener
{
   SQLTable tab=null;
   JTable table;
   TableModel tableModel;
   JScrollPane tableScrollPane;
   JTextField tableName;
   DBSession dbSession=null;

   boolean editable = false;

   JComboBox typeCombo=null;
   
   private static Vector defaultTypes=new Vector();
   
   static {
      defaultTypes.addElement(new SQLType("INT", false));
      defaultTypes.addElement(new SQLType("CHAR", "20"));
      defaultTypes.addElement(new SQLType("VARCHAR", "100"));
      defaultTypes.addElement(new SQLType("DATE", true));
   }

   /**
    *
    */
   private TableEditor (DBSession ses, SQLTable t, boolean ed)
   {
      super();
      dbSession=ses;
      this.setSize(630, 350);
      getContentPane().setLayout(new BorderLayout());
      tab=t;
      editable=ed;
      tab.addObserver(this);  // setup observer/observble model

      ImageIcon icon=IconFactory.
      findIcon("resources/icons/table_edit_16x16x16.gif");
      
      if (icon != null){
         setIconImage(icon.getImage());
      }


      setTitle(t.getName());
      JPanel northPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel centerPanel=new JPanel(new GridLayout(1,1));
      JPanel southPanel=new JPanel(new GridLayout(1,2));
    
      tableName=new JTextField();
      tableName.setColumns(20);
      northPanel.add(new JLabel("Table Name: "));
      northPanel.add(tableName);
      tableName.setText(t.getName());


      JPanel southWest=new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel southEast=new JPanel(new FlowLayout(FlowLayout.RIGHT));

      JButton createButton=new JButton ("Create SQL");
      createButton.setActionCommand("createButton");
      //if (editable)
      southEast.add (createButton);

      JButton closeButton=new JButton (new CloseAction(this));
      // closeButton.setActionCommand("closeButton");
      southEast.add (closeButton);

    
      JButton addButton=new JButton ("Add");
      addButton.setActionCommand("addButton");
      if (editable)
         southWest.add (addButton);

      JButton insertButton=new JButton ("Insert");
      insertButton.setActionCommand("insertButton");
      if (editable)
         southWest.add (insertButton);

      JButton removeButton=new JButton ("Remove");
      removeButton.setActionCommand("removeButton");
      if (editable)
         southWest.add (removeButton);

      southPanel.add(southWest);
      southPanel.add(southEast);

      tableModel = new TableModel();
      table=new JTable(tableModel);
      table.setAutoCreateColumnsFromModel(true);


      if (editable){
         typeCombo=new JComboBox();
         DefaultCellEditor typeEditor=new DefaultCellEditor(typeCombo);
         table.getColumnModel().getColumn(2).setCellEditor(typeEditor);
      }

      tableScrollPane=new JScrollPane(table);

      centerPanel.add (tableScrollPane);

      table.getColumn("Index").setPreferredWidth(15);
      table.getColumn("Name").setPreferredWidth(150);
      table.getColumn("Type").setPreferredWidth(100);
      table.getColumn("Parameters").setPreferredWidth(50);
      table.getColumn("Nullable").setPreferredWidth(5);
      table.getColumn("Unique").setPreferredWidth(5);
      table.getColumn("Indexed").setPreferredWidth(5);
      table.getColumn("PKey").setPreferredWidth(5);
      // table.revalidate();

    
      getContentPane().add(northPanel, BorderLayout.NORTH);
      getContentPane().add(centerPanel, BorderLayout.CENTER);
      getContentPane().add(southPanel, BorderLayout.SOUTH);
      // pack();

      // Place the window
      setLocation (WinUtil.alignCenter(this));
    

      // Setup event handlers
      // closeButton.addActionListener(this);
      createButton.addActionListener(this);
      addButton.addActionListener(this);
      insertButton.addActionListener(this);
      removeButton.addActionListener(this);
      
      if (editable) {
         try {
            ConnectionInfo ci=ses.getConnectionInfo();
            if (ci != null) {
               SchemaUtil su=ci.getSchemaUtil();
               if (su != null) {
                  Vector types=su.getAllTypes();
                  if (types != null) {
                     setTypes(types);
                  }
               }
            }
         } catch (Exception ex) {
            ses.exception(ex, "Error getting types.");
         }
      }
   }

   /** */
   public static TableEditor editNewTable(DBSession ses) {
      SQLTable table=new SQLTable("new_table");
      TableEditor te=new TableEditor(ses, table, true);

      // te.show();
      return te;
   }   

   /** */
   public static TableEditor showTable(DBSession ses, SQLTable t) {
      TableEditor te=new TableEditor(ses, t, true);

      // te.show();
      return te;
   }

   /** */
   public void setTypes(Vector types) {
      Vector typeNames=new Vector();
      for (int i=0; i<types.size(); i++) 
         typeNames.addElement(((SQLType)types.elementAt(i)).getName());

      // sort the type names
      Collections.sort(typeNames);

      typeCombo=new JComboBox(typeNames);
      typeCombo.setEditable(true);
      DefaultCellEditor typeEditor=new DefaultCellEditor(typeCombo);
      table.getColumnModel().getColumn(2).setCellEditor(typeEditor);
   }

   /** */
   public void update(Observable o, Object arg) {
      tableModel.updateTable();  // updateTable has to be written in the model
      // apparently this is all that's needed to update the table view
   }
  

   public void actionPerformed(ActionEvent e)
   {
      String action=e.getActionCommand();
      try {
         if (action.equals("addButton"))
            addButtonHandler();
         else if (action.equals("insertButton"))
            insertButtonHandler();
         else if (action.equals("removeButton"))
            removeButtonHandler();
         else if (action.equals("createButton"))
            createButtonHandler();
      }
      catch (Exception ex) {
//          MessageWindow.showWarning(TableEditor.this, 
//                                    "Exception in event processing.", ex);
         ExceptionDebugger.debug(TableEditor.this, 
                                 "Exception in event processing.", ex);
      }
   }

   private void addButtonHandler() {
      SQLColumn c=new SQLColumn("Col"+(tab.size()+1));
      SQLType t=new SQLType("VARCHAR", true);
      t.setParameterString("20");
      c.setType(t);
      
      tab.addColumn(c);
   }
  
   private void insertButtonHandler() {
      int row=table.getSelectedRow(); 
      SQLColumn c=new SQLColumn("Col"+row);
      SQLType t=new SQLType("VARCHAR", true);
      t.setParameterString("20");
      c.setType(t);
      
      if (row < 0) 
         tab.addColumn(c);
      else {
         tab.insertColumn(c, row);
         table.setRowSelectionInterval(row, row);
      }
   }

   private void removeButtonHandler() {
      // remove the selectd row from the vector 
      tab.removeColumn(table.getSelectedRow());
   }

   private void createButtonHandler()
   {
      StringBuffer statement=new StringBuffer();

      tab.setName(tableName.getText());

      log.writeDebug ("Attempting to create table "+tab.getName()+
                   " With "+tab.size()+" Columns");

      statement.append(tab.getCreateSql()+"\n\n");
      
      Hashtable indices=tab.getIndices();
      for (Enumeration elements=indices.elements(); 
           elements.hasMoreElements(); )
      {
         SQLIndex index=(SQLIndex)elements.nextElement();
         statement.append(index.getCreateSql()+"\n\n");
      }

      dbSession.setEditorText(statement.toString());
   }

   //**********************************************************************
   //****************  TABLE MODEL ****************************************
   //**********************************************************************
   /** 
    * TableModel is used to implement AbstractTableModel for the JTable
    * in this window.  I assume that this window is the only one that
    * will use this table model.
    */
   class TableModel extends AbstractTableModel
   {
      public int getColumnCount() {return 8;}
      public String getColumnName (int col)
      {
         switch (col)
         {
            case 0: return "Index";
            case 1: return "Name";
            case 2: return "Type";
            case 3: return "Parameters";
            case 4: return "Nullable";
            case 5: return "Unique";
            case 6: return "Indexed";
            case 7: return "PKey";
            case 8: return "Modifiers";
         }
         return "";
      }
      public int getRowCount()
      {
         if (tab != null && tab.size() > 0)
            return tab.size();
         else
            return 0;
      }
      public Object getValueAt(int row, int col)
      {
         SQLColumn c = tab.columnAt(row);
         switch (col)
         {
            case 0: return (""+row);
            case 1: return c.name;
            case 2: return c.getType();
            case 3: 
            {
               if (c.getType().allowsParameters())
                  return c.getType().getParameterString();
               else 
                  return "";
            }
            case 4: return new Boolean(c.isNullable());
            case 5: return new Boolean(c.isUnique());
            case 6: return new Boolean(c.isIndexed());
            case 7: return new Boolean(c.isPrimaryKey());
            case 8: return c.modifiers;
         }
         return null;
      }

      public Class getColumnClass(int col)
      {
         switch(col)
         {
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return Boolean.class;
            case 5: return Boolean.class;
            case 6: return Boolean.class;
            case 7: return Boolean.class;
            case 8: return String.class;
         }
         return String.class;
      }
      public boolean isCellEditable(int row, int col)
      {
         if (col>0)
         {
            if (editable){
               return true;
               // this was an old idea.  At this point I think
               // ALL datatypes must allow parameters even if the 
               // parameter string is null from dbmd.
               // pab 4/4/00
               /*if (col == 3){ // parameter string
                  SQLColumn c=tab.columnAt(row);
                  return c.getType().allowsParameters();
               }
               else 
                  return true;
               */
            }
            else {
               return false;
            }
         }
         else {
            return false;
         }
      }
      public void setValueAt (Object o, int row, int col)
      {
         // could put in some validaiton here, skipping for now
         SQLColumn c=tab.columnAt(row);
         switch (col)
         {
            case 1: c.setName((String)o); break;
            case 2: 
            {
               if (o instanceof SQLType)
               {
                  c.setType(new SQLType((SQLType)o));
               }
               else if (o instanceof String)
               {
                  c.setType(new SQLType((String)o, true));
               }
               else
               {
                  // big error.
                  // this should never happen.
                  throw new RuntimeException("Unknow return type from combo "+
                                             "in TableEditor.");
               }

               updateTable();
               break;
            }
            case 3: 
            {
               c.getType().setParameterString((String)o);
               break;
            }
            case 4: c.setNullable(((Boolean)o).booleanValue()); break;
            case 5: c.setUnique(((Boolean)o).booleanValue()); break; 
            case 6: 
            {
               boolean val=((Boolean)o).booleanValue(); 
               c.setIndexed(val);
               if (val)
                  tab.addIndex(c.getName());
               else
                  tab.removeIndex(c.getName());
               break; 
            }
            case 7: c.setPrimaryKey(((Boolean)o).booleanValue()); break;
            case 8: c.modifiers=(String)o; break;
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


