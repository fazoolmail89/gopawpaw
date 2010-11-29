package com.jet.apps.databrowser.connector;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;

import com.jet.log.*;

import com.jet.utils.properties.*;

/**
 * Generic connection frame.  This should work for ANY jdbc driver,
 * it graphically encapsulates all data necessary to connect to 
 * a database.
 *
 * @author Paul Bemowski
 */
public class GenericConnectFrame extends ConnectDialog
   implements Connector, Logger, ActionListener
{
   private JTextField driver, connectURL;

   private EProperties mProperties=new EProperties();

   private EProperties mAdvancedProperties=null;

   private JTable propsTable=null;
   private PropsTableModel propsModel=null;

   private static ConnectionInfo connInfo=null;

   /**
    *
    */
   public GenericConnectFrame(Frame parent)
   {
      super (parent);
      setSize(340, 220);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Generic JDBC Connector");

      getContentPane().setLayout(new BorderLayout());

      mProperties.put("user", "");
      mProperties.put("password", "");

      // Initialize the fields
      driver=new PopupTextField(40);
      connectURL=new PopupTextField(40);
    
      if (connInfo != null)
      {
         if (connInfo.getDriver() != null)
            driver.setText(connInfo.getDriver());

         if (connInfo.getURL() != null)
            connectURL.setText(connInfo.getURL());
         
         if (connInfo.getProperties() != null)
            mProperties=new EProperties(connInfo.getProperties());
         
         if (connInfo.getAdvancedProperties() != null)
            mAdvancedProperties=connInfo.getAdvancedProperties();
      }

      JPanel northPanel=new JPanel(new BorderLayout());
      
      JPanel labels=new JPanel(new GridLayout(2, 1));
      labels.add(new JLabel("Driver Class:"));
      labels.add(new JLabel("Connection URL:"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(2, 1));
      fields.add(driver);
      fields.add(connectURL);

      northPanel.add(fields, "Center");

      JPanel centerPanel=new JPanel(new BorderLayout());

      centerPanel.add(new Toolbar(), "North");
      propsModel=new PropsTableModel(mProperties);
      propsTable=new JTable(propsModel);
      JScrollPane sp=new JScrollPane(propsTable);
      centerPanel.add(sp, "Center");

      
      getContentPane().add(centerPanel, "Center");
      getContentPane().add(northPanel, "North");
    
      JPanel southPanel=new JPanel(new BorderLayout());
      JPanel southEastPanel=new JPanel (new FlowLayout(FlowLayout.LEFT));
      JPanel southWestPanel=new JPanel (new FlowLayout(FlowLayout.LEFT));
      southPanel.add(southEastPanel, "East");
      southPanel.add(southWestPanel, "West");
      
      JButton cancelButton=new JButton("Cancel");
      JButton okButton=new JButton("Ok");
      JButton advancedButton=new JButton("Advanced");

      okButton.setActionCommand("okButton");
      cancelButton.setActionCommand("cancelButton");
      advancedButton.setActionCommand("advancedButton");
      southEastPanel.add (okButton);
      southEastPanel.add (cancelButton);
      southWestPanel.add (advancedButton);

      getContentPane().add (southPanel, "South");

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      advancedButton.addActionListener(this);
   }

   public static String getDriver() {return "NA";}

   /** */
   public static void setConnInfo(ConnectionInfo ci) {connInfo=ci;}

   /**
    *
    */
   public ConnectionInfo getConnectionInfo()
   {
      //GenericConnectFrame diag=new GenericConnectFrame(parent);
      show();
      
      if (ok)
         return connInfo;
      else
         return null;
   }

   /**
    *
    */
   public void actionPerformed(ActionEvent e)
   {
      String action=e.getActionCommand();
      if (action.equals("cancelButton")) {
         okButtonHandler();
         ok=false;
      }
      else if (action.equals("okButton"))
         okButtonHandler();
      else if (action.equals("advancedButton"))
         advancedButtonHandler();
   }

   /**
    *
    */
   private void advancedButtonHandler()
   {
      mAdvancedProperties=Advanced.getAdvancedProperties(this, 
                                                         mAdvancedProperties);
   }

   /**
    *
    */
   private void okButtonHandler()
   {
      String drv=driver.getText();
      String url=connectURL.getText();
      
      Properties props=propsModel.getData().toJavaUtilProperties();

      connInfo=new ConnectionInfo(drv, url, props);
      String user=propsModel.getData().getProperty("user");
      String name=null;
      if (user != null)
         name=user+" on "+url;
      else
         name=url;

      connInfo.setName(name);
      // connInfo=ConnectionManager.getConnection(connInfo);

      if (mAdvancedProperties != null)
         connInfo.setAdvancedProperties(mAdvancedProperties);

      ok=true;
      dispose();
   }

   /**
    *
    */
   class PropsTableModel extends AbstractTableModel
   {
      EProperties data=null;
      public PropsTableModel(EProperties p)
      {
         data=p;
      }
      public EProperties getData(){return data;}
      public int getColumnCount(){return 2;}
      public String getColumnName(int col)
      {
         if (col == 0)
            return "Keys";
         else if (col == 1)
            return "Values";
         return "Error";
      }
      public int getRowCount(){return data.size();}
      public Object getValueAt(int row, int col)
      {
         Key key = data.getKey(row);
         if (col == 0)
            return key.toString();
         else if (col == 1)
         {
            Object val=data.get(key);
            if (val instanceof String)
               return val;
            else 
               return "Not Editable";
         }
         return "Error";
      }
      
      public void setValueAt(Object obj, int row, int col)
      {
         if (col == 1)
         {
            Key key = data.getKey(row);
            data.put(key, obj);
         }
         else if (col == 0)
         {
            Object origKey=data.getKey(row);
            Object val=data.get(origKey);
            data.remove(origKey);
            data.put(obj, val);
            updateTable();
         }
      }

      public boolean isCellEditable(int row, int col)
      {
         return true;
         /*if (col == 0)
            return false;
         else if (col == 1)
         {
            String val=(String)getValueAt(row, col);
            if (val.equals("Not Editable"))
               return false;
            else
               return true;
         }
         return false;*/
      }

      public void addRow()
      {
         data.put("", "");
         updateTable();
      }
      public void deleteRow(int row)
      {
         Key key=data.getKey(row);
         data.remove(key);
         updateTable();
      }

      public void updateTable()
      {
         this.fireTableStructureChanged();
      }
   }

   /**
    *
    */
   private class Toolbar extends JToolBar implements ActionListener
   {
      public Toolbar()
      {
         setFloatable(false);
         JButton add=new JButton("Add Row");
         add.setActionCommand("add");
         add.addActionListener(this);

         JButton delete=new JButton("Delete Row");
         delete.setActionCommand("delete");
         delete.addActionListener(this);

         this.add (add);
         this.add (delete);
      }

      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals("add"))
         {
            propsModel.addRow();
         }
         else if (action.equals("delete"));
         {
            int row=propsTable.getSelectedRow();
            System.out.println ("Attempting to delete "+row);
            if (row > 0)
               propsModel.deleteRow(row);
         }
      }
   }
}








