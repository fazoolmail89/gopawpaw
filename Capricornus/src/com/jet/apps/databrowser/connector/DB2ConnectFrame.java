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

//import COM.ibm.db2.jdbc.net.*;
import java.sql.*;

/**
 * Generic connection frame.  This should work for ANY jdbc driver,
 * it graphically encapsulates all data necessary to connect to 
 * a database.
 *
 * @author Paul Bemowski
 */
public class DB2ConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector
{
   private static final String driver="COM.ibm.db2.jdbc.net.DB2Driver";
   private static final String urlBase="jdbc:db2:";

   private JComboBox language;
   private JTextField server, port, database, user;
   private JPasswordField password;

   private EProperties mProperties=new EProperties();

   private EProperties mAdvancedProperties=null;

   private boolean ok=false;

   private ConnectionInfo connInfo=null;

   private static Vector mSupportedLanguages=new Vector();
   
   static
   {
      mSupportedLanguages.addElement(Locale.US);
      mSupportedLanguages.addElement(Locale.GERMANY);
      mSupportedLanguages.addElement(Locale.JAPAN);
   }


   /**
    *
    */
   public DB2ConnectFrame(Frame parent)
   {
      super (parent);
      setSize(320, 205);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("DB2 Net Connector");
      getContentPane().setLayout(new BorderLayout());


      mProperties.put("user", "");
      mProperties.put("password", "");
      
      // Initialize the fields
      server=new PopupTextField(40);
      port=new PopupTextField(40);
      database=new PopupTextField(40);
      user=new PopupTextField(40);
      password=new JPasswordField(40);

      port.setText("");

      language=new JComboBox();
      language.addItem("Use VM Default Locale");
      for (int i=0; i<mSupportedLanguages.size(); i++)
      {
         Locale l=(Locale)mSupportedLanguages.elementAt(i);
         language.addItem(l.getDisplayLanguage());
      }
      language.setSelectedIndex(0);

      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=6;

      JPanel labels=new JPanel(new GridLayout(rows, 1));

      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      labels.add(new JLabel("Database :"));
      labels.add(new JLabel("Language :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      fields.add(server);
      fields.add(port);
      fields.add(database);
      fields.add(language);
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
      String dbName=database.getText().trim();
      String machine=server.getText().trim();

      String url=urlBase+"//"+machine+":"+portNum+"/"+dbName;

      log.writeDebug ("DB2 Net Url="+url);
      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      String name;


      int lang_index=language.getSelectedIndex();
      if (lang_index != 0)
      {
         // set the language on the driver
         try
         {
            // get the language string, use the same algorithm as
            // the DB2 driver uses.
            Locale l=(Locale)mSupportedLanguages.elementAt(lang_index - 1);
            log.writeDebug ("Attempting to set language to "+l);
            String lang=l.getLanguage();
            String country=l.getCountry();
            String db2_driver_language=lang.substring(0, 2)+country;

            log.writeDebug ("Setting language code to "+l.toString());

            connInfo.setProperty("language", l.toString());
         }
         catch (Exception ex)
         {
            // unable to set language.
            log.writeDebug ("Unable to set the DB2 language parameter.");
            log.printStackTrace(ex);
         }
      }
         
      name=machine+":"+portNum+" ("+dbName+")";

      if (user != null &&
          user.getText().trim().length() > 0)
         name=user.getText()+" on "+name;

      connInfo.setName(name);

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








