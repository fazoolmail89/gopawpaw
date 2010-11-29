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


// import com.jet.jdbc.pdriver.*;

/**
 * Generic connection frame.  This should work for ANY jdbc driver,
 * it graphically encapsulates all data necessary to connect to 
 * a database.
 *
 * @author Paul Bemowski
 */
public class JETProxyConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector
{
   private static final String driver="com.jet.jdbc.pdriver.PDriver";
   private static final String urlBase="jdbc:jet:proxy@";// localhost:52372";

   private static final String initialSelection=
   "Enter parameters, or choose from the list";

   private JComboBox shares;
   
   private JTextField server, port, share, user;
   private JPasswordField password;

   private EProperties mProperties=new EProperties();

   private EProperties mAdvancedProperties=null;

   private boolean ok=false;

   private ConnectionInfo connInfo=null;

   private static ConnectionInfo lastConnInfo = null;

   /**
    *
    */
   public JETProxyConnectFrame(Frame parent)
   {
      super (parent);
      setSize(350, 190);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("JET Proxy Connector");
      getContentPane().setLayout(new BorderLayout());

      
      shares=new JComboBox();
      shares.setEditable(true);

      mProperties.put("user", "");
      mProperties.put("password", "");

      // Initialize the fields
      server=new PopupTextField(20);
      port=new PopupTextField(20);
      share=new PopupTextField(20);
      user=new PopupTextField(20);
      password=new JPasswordField(20);

      port.setText("52372");

      if (lastConnInfo != null)
      {
         String temp=null;
         temp=lastConnInfo.getProperty("server");
         if (temp != null)
            server.setText(temp);

         temp=lastConnInfo.getProperty("port");
         if (port != null)
            port.setText(temp);

         temp=lastConnInfo.getProperty("share");
         if (temp != null)
            shares.setSelectedItem(temp);
      }

    
      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=5;

      JPanel labels=new JPanel(new GridLayout(rows, 1));

      JButton getShares=new JButton("Shares: ");
      getShares.setActionCommand("getShares");
      getShares.addActionListener(this);


      // labels.add(new JLabel("ServerInfo:"));
      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      // labels.add(getShares);
      labels.add(new JLabel("Share :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      // fields.add(databases);
      fields.add(server);
      fields.add(port);
      // fields.add(shares);
      fields.add(share);
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
      // databases.addActionListener(this);
      pack();
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
      else if (action.equals("database"))
         databaseSelectHandler();
      else if (action.equals("advancedButton"))
         advancedButtonHandler();
      else if (action.equals("getShares"))
         populateShareCombo();
   }

   /**
    *
    */
   private void populateShareCombo()
   {
      /*
      try {
         PDriver pdriver=null;
         
         pdriver=PDriver.getInstance();
         
         Vector sVector=null;
         
         String host=server.getText().trim();
         int p=Integer.parseInt(port.getText().trim());

         sVector=pdriver.getAvailableShares(host, p);
         // add to combo.
         addVectorToCombo(shares, sVector);
      }
      catch (Exception ex)
      {
         log.printStackTrace(ex);
         // throw up a nice dialog.
      }
      catch (NoClassDefFoundError ex) {
         log.printStackTrace(ex);
      }
      */
   }
   
   /**
    * JComboBox SUCKS
    */
   private void addVectorToCombo(JComboBox combo, Vector v)
   {
      if (combo.getItemCount() > 0)
         combo.removeAllItems();
      for (int i=0; i<v.size(); i++)
      {
         combo.addItem(v.elementAt(i));
      }
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
   private void databaseSelectHandler()
   {
      // int index=databases.getSelectedIndex();
      // ThinConnectInfo tci=(ThinConnectInfo)tnsInfo.elementAt(index);
      //server.setText(tci.host);
      //port.setText(tci.port);
      //share.setText(tci.sid);
   }

   
   /**
    *
    */
   private void okButtonHandler()
   {
      String shareText=null;
      shareText=share.getText();
      //Object obj=shares.getSelectedItem();
      //if (obj != null)
      //   shareText=obj.toString();
      //else
      //   shareText="default";

      String userText=user.getText().trim();
      String passText=password.getText().trim();

      String url=urlBase+server.getText()+":"+port.getText()+
      "?share="+shareText;

      if (!empty(userText))
         url=url+"&user="+userText;
      if (!empty(passText))
         url=url+"&password="+passText;

      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      connInfo.setProperty("server", server.getText());
      connInfo.setProperty("port", port.getText());
      connInfo.setProperty("share", shareText);

      String name="JET Proxy{"+server.getText().trim()+":"+
      port.getText().trim()+" ("+shareText+")}";

      if (!empty(userText))
         name=user.getText()+" on "+name;

      connInfo.setName(name);

      if (mAdvancedProperties != null)
         connInfo.setAdvancedProperties(mAdvancedProperties);

      lastConnInfo=connInfo;

      ok=true;
      dispose();
   }


   private static class ThinConnectInfo
   {
      ThinConnectInfo () {}
      ThinConnectInfo (String s) {name=s;}
      
      String name="";
      String host="";
      String port="";
      String sid="";
      
      public String toString()
      {
         return name;
      }
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








