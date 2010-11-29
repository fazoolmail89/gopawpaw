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
public class PostgreSQL65ConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector
{
   private static final String driver="postgresql.Driver";
   private static final String urlBase="jdbc:postgresql://";

   private JComboBox databaseType;
   private JTextField server, port, database, user;
   private JPasswordField password;

   private EProperties mProperties=new EProperties();

   private EProperties mAdvancedProperties=null;

   private boolean ok=false;

   private ConnectionInfo connInfo=null;

   private static ConnectionInfo lastConnInfo=null;

   /**
    *
    */
   public PostgreSQL65ConnectFrame(Frame parent)
   {
      super (parent);
      setSize(320, 165);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("PostgreSQL Connector");
      getContentPane().setLayout(new BorderLayout());


      mProperties.put("user", "");
      mProperties.put("password", "");

      // Initialize the fields
      server=new PopupTextField(20);
      port=new PopupTextField(20);
      database=new PopupTextField(20);
      user=new PopupTextField(20);
      password=new JPasswordField(20);

      port.setText("5432");
    
      if (lastConnInfo != null)
      {
         if (connInfo.getProperty("databrowser_server") != null)
            server.setText(connInfo.getProperty("databrowser_server"));
         if (connInfo.getProperty("databrowser_port") != null)
            port.setText(connInfo.getProperty("databrowser_port"));
         if (connInfo.getProperty("databrowser_database") != null)
            database.setText(connInfo.getProperty("databrowser_database"));
         if (connInfo.getProperty("user") != null)
            user.setText(connInfo.getProperty("user"));
      }

      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=5;

      JPanel labels=new JPanel(new GridLayout(rows, 1, 2, 2));

      // labels.add(new JLabel("Type :"));
      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      labels.add(new JLabel("Database :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      // fields.add(databaseType);
      fields.add(server);
      fields.add(port);
      fields.add(database);
      fields.add(user);
      fields.add(password);

      northPanel.add(fields, "Center");
      
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
      this.pack();
   }

   public static String getDriver() {return driver;}


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
      String portNum=port.getText().trim();
      String serverName=server.getText().trim();
      String dbName=database.getText().trim();

      String url=urlBase+serverName.trim()+
      ":"+portNum+"/"+dbName;  // +"/"+dbName;

      log.writeDebug ("PostgreSQL Url="+url);
      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      connInfo.setProperty("databrowser_port", portNum);
      connInfo.setProperty("databrowser_server", serverName);
      connInfo.setProperty("databrowser_database", dbName);

      String name;
      
      name=serverName+" ("+dbName+")";

      if (user != null &&
          user.getText().trim().length() > 0)
         name=user.getText()+" on "+name;

      connInfo.setName(name);

      //connInfo=ConnectionManager.getConnection(connInfo);

      if (mAdvancedProperties != null)
         connInfo.setAdvancedProperties(mAdvancedProperties);

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








