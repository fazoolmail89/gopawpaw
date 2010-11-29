package com.jet.apps.databrowser.connector;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;
import java.io.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;

import com.jet.utils.properties.*;

import com.jet.log.*;


/**
 * Generic connection frame.  This should work for ANY jdbc driver,
 * it graphically encapsulates all data necessary to connect to 
 * a database.
 *
 * @author Paul Bemowski
 */
public class FreeTdsConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector
{
   private static final String driver="com.internetcds.jdbc.tds.Driver";
   private static final String urlBase="jdbc:freetds:";

   private JComboBox databaseType;
   private JTextField server, port, database, user;
   private JPasswordField password;

   private EProperties mProperties=new EProperties();

   private boolean ok=false;

   private ConnectionInfo connInfo=null;
   /**
    *
    */
   public FreeTdsConnectFrame(Frame parent)
   {
      super (parent);
      setSize(320, 210);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("FreeTDS Connector");
      getContentPane().setLayout(new BorderLayout());


      mProperties.put("user", "");
      mProperties.put("password", "");
      
      databaseType=new JComboBox();
      databaseType.setEditable(false);
      databaseType.addItem("SQLServer");
      databaseType.addItem("Sybase");
      databaseType.setSelectedIndex(0);
      databaseType.setMaximumRowCount(2);
      databaseType.setActionCommand("database");
      

      // Initialize the fields
      server=new PopupTextField(40);
      port=new PopupTextField(40);
      database=new PopupTextField(40);
      user=new PopupTextField(40);
      password=new JPasswordField(40);

      port.setText("1433");
    
      /*if (connInfo != null)
      {
         if (connInfo.getProperty("server") != null)
            server.setText(connInfo.getProperty("server"));
         if (connInfo.getProperty("port") != null)
            port.setText(connInfo.getProperty("port"));
         if (connInfo.getProperty("sid") != null)
            sid.setText(connInfo.getProperty("sid"));
         if (connInfo.getProperty("user") != null)
            user.setText(connInfo.getProperty("user"));
         if (connInfo.getProperty("password") != null)
            password.setText(connInfo.getProperty("password"));
            }*/

      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=6;

      JPanel labels=new JPanel(new GridLayout(rows, 1));

      labels.add(new JLabel("Type :"));
      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      labels.add(new JLabel("database :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      fields.add(databaseType);
      fields.add(server);
      fields.add(port);
      fields.add(database);
      fields.add(user);
      fields.add(password);

      northPanel.add(fields, "Center");
      
      getContentPane().add(northPanel, "North");
    
      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton cancelButton=new JButton("Cancel");
      JButton okButton=new JButton("Ok");
      okButton.setActionCommand("okButton");
      cancelButton.setActionCommand("cancelButton");
      southPanel.add (okButton);
      southPanel.add (cancelButton);

      getContentPane().add (southPanel, "South");

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      databaseType.addActionListener(this);
   }


   /**
    *
    */
   public ConnectionInfo getConnectionInfo()
   {
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
      if (action.equals("cancelButton"))
         dispose();
      else if (action.equals("okButton"))
         okButtonHandler();
      else if (action.equals("database"))
         databaseHandler();
   }

   /**
    *
    */
   private void databaseHandler()
   {
      String type=databaseType.getSelectedItem().toString();

      if (type.toLowerCase().equals("sqlserver"))
         port.setText("1433");
      else if (type.toLowerCase().equals("sybase"))
         port.setText("7100");
   }

   /**
    *
    */
   private void okButtonHandler()
   {
      String databaseName=databaseType.getSelectedItem().toString().trim().toLowerCase();
      String portNum=port.getText().trim();

      String url=urlBase+databaseName+"://"+server.getText().trim()+
      ":"+portNum+"/"+database.getText().trim();

      log.writeDebug ("FreeTDS Url="+url);
      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      String name;
      if (user != null)
         name=user.getText()+" on "+url;
      else
         name=url;

      connInfo.setName(name);

      //connInfo=ConnectionManager.getConnection(connInfo);

      ok=true;
      dispose();
   }

   public static boolean empty(String s)
   {
      if (s == null)
         return true;
      if (s.length() == 0)
         return true;
      return false;
   }
}








