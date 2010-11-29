package com.jet.apps.databrowser.connector;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.log.*;

import java.util.*;
import java.io.*;

import com.jet.apps.databrowser.model.DBSession;

/*
 * $Log: ODBCConnectFrame.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * Attempt to connect to an ODBC data source using the JDBC-ODBC 
 * bridge.
 *
 * @author Paul Bemowski
 */
public class ODBCConnectFrame extends ConnectDialog 
   implements ActionListener, Connector, Logger
{
   JTextField uid, password;
   JComboBox database;

   private ConnectionInfo connInfo=null;

   private EProperties mAdvancedProperties=null;

   private static final String driver="sun.jdbc.odbc.JdbcOdbcDriver";
   private static final String urlBase="jdbc:odbc:";
   
   private static String last_odbc_file=null;

   private static Vector dbNames=new Vector();

   /**
    * 
    */
   private static final String commonNames[]=
   {"ODBC 32 bit Data Sources",
    "MS Access 97 Database",
    "dBASE Files",
    "Excel Files",
    "FoxPro Files",
    "Text Files"};

   /**
    *
    */
   public ODBCConnectFrame(Frame parent)
   {
      super (parent);
      setSize(330, 140);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Connect to ODBC Database");
      getContentPane().setLayout(new BorderLayout());
    

      // Reload odbc.ini
      EProperties globals=DBSession.getGlobalProperties();
      String file=globals.getProperty("odbcIniFile");

      // This will only happen when the filename is different
      if (file != null)
         dbNames=reloadOdbcIni(file);  


      JPanel centerPanel=new JPanel(new GridBagLayout());
      GridBagConstraints c=new GridBagConstraints();

      database=new JComboBox(dbNames);
      database.setEditable(true);

      if (dbNames.size() > 0)
         database.setSelectedIndex(0);
      database.setMaximumRowCount(4);
      
      String tip=
      "If the DSN you need is not displayed, simply type it in.";
      database.setToolTipText(tip);

      uid=new JTextField("");
      password=new JPasswordField("");

      if (connInfo != null)
      {
         if(connInfo.getProperty("user") != null)
            uid.setText(connInfo.getProperty("user"));
         
         if (connInfo.getProperty("password") != null)
            password.setText(connInfo.getProperty("password"));
      }

      c.gridx=c.gridy=c.RELATIVE;
      c.anchor=c.WEST;
      c.fill=c.HORIZONTAL;

      c.weightx=.1;
      centerPanel.add(new JLabel("Database DSN:"), c);
      c.weightx=.9;
      centerPanel.add(database, c);
      c.gridy=1; c.weightx=.1;
      centerPanel.add(new JLabel("User Name:"), c);
      c.weightx=.9;
      centerPanel.add(uid, c);
      c.gridy=2;  c.weightx=.1;
      centerPanel.add(new JLabel("Password:"), c);
      c.weightx=.9;
      centerPanel.add(password, c);

      getContentPane().add(centerPanel, "Center");

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

   public static String getDriver()
   {
      return driver;
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
   void okButtonHandler()
   {
      String dbname=database.getSelectedItem().toString();
      String url=urlBase+dbname;

      connInfo=new ConnectionInfo(driver, url, uid.getText(), 
                                  password.getText());


      String user=uid.getText();
      if (user != null && user.length() > 0)
         connInfo.setName(user+" on "+dbname);
      else
         connInfo.setName(dbname);
      ok=true;
      
      dispose();

      /*connInfo=ConnectionManager.getConnection(connInfo); */
      
      if (mAdvancedProperties != null)
         connInfo.setAdvancedProperties(mAdvancedProperties);
   }

   /**
    * Parses the tns names file to read the names of the databases.
    */
   private static Vector reloadOdbcIni(String filename)
   {
      if (filename.equals(last_odbc_file))
         return dbNames; 

      last_odbc_file=filename;

      Vector names=new Vector();
      FileInputStream fis=null;
      
      try
      {
         File file = new File(filename);
         fis=new FileInputStream(file);
         BufferedReader bis=new BufferedReader(new InputStreamReader(fis));

         String line=bis.readLine();
         while (line != null)
         {
            if (line.length() > 0)
            {
               if (line.charAt(0) == '[')
               {
                  // this line is a db name.
                  String theName=line.substring(1, line.length()-1);
                  log.writeDebug ("DB Name = "+theName);
                  names.addElement(theName);
               }
               else 
               {
                  // ignore
               }
            }
            
            line=bis.readLine();
         }
      }
      catch (FileNotFoundException ex)
      {
         log.printStackTrace(ex);

         String message=
         "The Browser was unable to fine your odbc.ini \n"+
         "file.  If you specify it's location in the Edit -> Preferences \n"+
         "dialog, you will be presented with a list of ODBC databases \n"+
         "to connect to.  On Windows platforms, the most common \n"+
         "location is %SYSTEMROOT%\\odbc.ini (eg: c:\\WINNT\\odbc.ini)";
         MessageWindow.showMessage (null, message);
      }
      catch (Throwable ex)
      {
         log.printStackTrace(ex);
      }
      finally 
      {
         if (fis != null)
         {
            try 
            {
               fis.close();
            }
            catch (Exception ex)
            {
               log.printStackTrace(ex);
            }
         }
      }
      return removeCommonNames(names);
   } // End read tnsnames.


   /**
    *
    */
   private static Vector removeCommonNames(Vector names)
   {
      if (names == null)
         return null;
      for (int i=0; i<commonNames.length; i++)
      {
         boolean removed=names.removeElement(commonNames[i]);
         log.writeDebug ("Attempting to remove "+
                      commonNames[i]+" removed ?"+removed);
      }
      return names;
   }
}



