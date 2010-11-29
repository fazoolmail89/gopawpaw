package com.jet.apps.databrowser.connector;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.utils.loader.*;

// For JFileChooser
// import javax.swing.preview.*;

import java.util.*;
import java.io.*;

import com.jet.log.*;

import com.jet.apps.databrowser.model.DBSession;

/**
 * Connects to an Oracle OCI database.
 *
 * @author Paul Bemowski
 */
public class OracleConnectFrame extends ConnectDialog
   implements ActionListener, Connector, Logger
{
   JTextField uid, password;
   JComboBox database;

   private static final String driver="oracle.jdbc.driver.OracleDriver";
   private static final String urlBase="jdbc:oracle:oci8:@";
   
   private static String last_tns_file=null;

   private static Vector dbNames=new Vector();

   private ConnectionInfo connInfo=null;

   private EProperties mAdvancedProperties=null;

   static 
   {
   }
   
   /**
    *
    */
   public OracleConnectFrame(Frame p)
   {
      super (p);
      setSize(320, 140);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Connect to Oracle Database using OCI");
      getContentPane().setLayout(new BorderLayout());
    

      // Reload TNS names if necessary
      EProperties globals=DBSession.getGlobalProperties();
      String file=globals.getProperty(DBSession.TNS_FILE_KEY);

      if (file != null)
         dbNames=reloadTnsNames(file);

      JPanel centerPanel=new JPanel(new GridBagLayout());
      GridBagConstraints c=new GridBagConstraints();

      
      database=new JComboBox(dbNames);
      database.setEditable(true);

      if (dbNames.size() > 0)
         database.setSelectedIndex(0);

      database.setMaximumRowCount(4);
      
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
      centerPanel.add(new JLabel("Database:"), c);
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

      // connInfo=ConnectionManager.getConnection(connInfo);
      
      connInfo.setName(uid.getText() +" on "+dbname);

      if (mAdvancedProperties != null)
         connInfo.setAdvancedProperties(mAdvancedProperties);

      ok=true;
      dispose();
   }


   /**
    *
    */
   /*private void addToClasspath(String driver)
   {
      log.writeDebug (VERBOSE, "Inside classpath ");
      File file=null;

      JFileChooser chooser=new JFileChooser();
      if (chooser.showOpenDialog(parent) == chooser.APPROVE_OPTION)
      {
         file=chooser.getSelectedFile();
         log.writeDebug (VERBOSE, "file="+file.getAbsolutePath());
      }

      try
      {
         DriverLoader loader=DriverLoader.getInstance();
      
         loader.load(file);
      }
      catch (Exception ex)
      {
         MessageWindow.showWarning(parent, 
                                   "Error loading classes.", ex);
      }
      }*/

   /**
    * Parses the tns names file to read the names of the databases.
    */
   private static Vector reloadTnsNames(String filename)
   {
      if (filename.equals(last_tns_file))
         return dbNames;

      last_tns_file=filename;

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
               if (line.charAt(0) == '#' ||
                   line.charAt(0) == ' ' ||
                   line.charAt(0) == '\t')
               {
                  // ignore
               }
               else
               {
                  // this line is a db name.
                  String theName=line.substring(0, line.indexOf("="));
                  log.writeDebug (VERBOSE, "DB Name = "+theName);
                  names.addElement(theName);
               }
            }
            
            line=bis.readLine();
         }
      }
      catch (FileNotFoundException ex)
      {
         // We could add a file chooser here...
         log.writeError("Oracle OCI Connector can't find "+filename);

         String message=
         "The Browser was unable to find your tnsnames.ora \n"+
         "file.  If you specify it's location in the Edit -> Preferences \n"+
         "dialog, you will be presented with a list of OCI databases \n"+
         "to connect to.";
         MessageWindow.showMessage (null, message);
      }
      catch (Exception ex)
      {
         log.printStackTrace(ex); // .printStackTrace(System.out);
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
      return names;
   } // End read tnsnames.
}



