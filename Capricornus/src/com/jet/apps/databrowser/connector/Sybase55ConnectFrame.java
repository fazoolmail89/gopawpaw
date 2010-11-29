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

import com.jet.apps.databrowser.model.DBSession;

/*
 * $Log: Sybase55ConnectFrame.java,v $
 * Revision 1.1  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.2  2001/01/17 16:47:55  bemocvs
 * defaulted port to 1521
 *
 */


/**
 * Used for connecting to Oracle databases with the oracle "thin" connnector.
 * this is the preferred connection method for oracle.  The OCI connector
 * is deprecated.
 *
 * @author Paul Bemowski
 */
public class Sybase55ConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector
{
   private static final String driver="com.sybase.jdbc2.jdbc.SybDriver";
   private static final String urlBase="jdbc:sybase:Tds:";

   private static final String initialSelection=
   "Enter parameters, or choose from the list";

   private JComboBox version;
   
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
   public Sybase55ConnectFrame(Frame parent)
   {
      super (parent);
      setSize(350, 170);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Sybase JConnect 5.5 Connector");
      getContentPane().setLayout(new BorderLayout());

      // Reload TNS names if necessary
      EProperties globals=DBSession.getGlobalProperties();
      String file=globals.getProperty(DBSession.TNS_FILE_KEY);

      mProperties.put("user", "");
      mProperties.put("password", "");

      // Initialize the fields
      server=new PopupTextField(40);
      port=new PopupTextField(40);
      database=new PopupTextField(40);
      version=new JComboBox();
      user=new PopupTextField(40);
      password=new JPasswordField(40);

      version.addItem("2");
      version.addItem("3");
      version.addItem("4");
      version.addItem("5");
      version.addItem("6");

      version.setSelectedIndex(3);

      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=6;

      JPanel labels=new JPanel(new GridLayout(rows, 1));

      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      labels.add(new JLabel("Database(optional) :"));
      labels.add(new JLabel("Version :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      fields.add(server);
      fields.add(port);
      fields.add(database);
      fields.add(version);
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

      port.setText("");
      if (lastConnInfo != null)
      {
         if (lastConnInfo.getProperty("server") != null)
            server.setText(lastConnInfo.getProperty("server"));
         if (lastConnInfo.getProperty("port") != null)
            port.setText(lastConnInfo.getProperty("port"));
         if (lastConnInfo.getProperty("database") != null)
            database.setText(lastConnInfo.getProperty("database"));
         if (lastConnInfo.getProperty("user") != null)
            user.setText(lastConnInfo.getProperty("user"));
      }

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      advancedButton.addActionListener(this);
   }

   /** */
   public static String getDriver() {return driver;}

   /**
    *
    */
   public ConnectionInfo getConnectionInfo()
   {
      show();
      if (ok)
      {
         lastConnInfo=connInfo;
         return connInfo;
      }
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
   private void advancedButtonHandler() {
      mAdvancedProperties=Advanced.getAdvancedProperties(this, 
                                                         mAdvancedProperties);
   }

   /**
    *
    */
   private void okButtonHandler()
   {
      String url=null;
      String sybDb=database.getText().trim();
      if (!empty(sybDb))
         url=urlBase+server.getText()+":"+port.getText()+":"+database.getText();
      else 
         url=urlBase+server.getText()+":"+port.getText();

      //String url=urlBase+buildTNSConnectString();
      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      connInfo.setProperty("server", server.getText());
      connInfo.setProperty("port", port.getText());
      connInfo.setProperty("JCONNECT_VERSION", version.getSelectedItem().toString());

      // This works for 8.1.6 driver for sure!!
      String oracleDatabase=server.getText().trim()+":"+port.getText().trim()+
      ":"+database.getText().trim();
      connInfo.setProperty("database", oracleDatabase);

      connInfo.setProperty("protocol", "tcp");

      String name="Sybase JConnect55("+server.getText()+":"+port.getText().trim()+"/"+
      database.getText().trim()+")";

      if (user != null)
         name=user.getText()+" on "+name;

      connInfo.setName(name);

      // connInfo=ConnectionManager.getConnection(connInfo);
      
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








