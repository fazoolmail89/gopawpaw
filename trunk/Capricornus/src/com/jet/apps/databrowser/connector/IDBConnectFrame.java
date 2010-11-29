package com.jet.apps.databrowser.connector;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;
import com.jet.utils.filesystem.*;

import com.jet.log.*;

/**
 *
 */
public class IDBConnectFrame extends ConnectDialog
   implements Logger, Connector, ActionListener
{
   JTextField database;

   private static final String driver="org.enhydra.instantdb.jdbc.idbDriver";
   private static final String urlBase="jdbc:idb:";

   ConnectionInfo connInfo=null;

   /**
    *
    */
   public IDBConnectFrame(Frame parent)
   {
      super (parent);
      setSize(400, 100);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Connect to ODBC Database");
      getContentPane().setLayout(new BorderLayout());
    
      JPanel centerPanel=new JPanel(new GridBagLayout());
      GridBagConstraints c=new GridBagConstraints();

      database=new JTextField();
      JButton browseButton=new JButton("Browse");

      c.gridx=c.gridy=c.RELATIVE;
      c.anchor=c.WEST;
      c.fill=c.HORIZONTAL;

      c.weightx=.1;
      centerPanel.add(new JLabel("Database:"), c);
      c.weightx=.9;
      centerPanel.add(database, c);
      c.weightx=.1;
      centerPanel.add(browseButton, c);

      getContentPane().add(centerPanel, "Center");
    
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
      browseButton.addActionListener(this);
   }

   /** */
   public static String getDriver() {return driver;}

   /** */
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
      else if (action.equals("Browse"))
         browseButtonHandler();
   }

   void okButtonHandler()
   {
      String dbname=database.getText();
      String url=urlBase+dbname;

      connInfo=new ConnectionInfo(driver, url, "", "");

      connInfo.setName("IDB->"+dbname);
      ok=true;
      dispose();
   }
   
   void browseButtonHandler() {
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".prp");
      extFilter.addExtension(".properties");
      chooser.setFileFilter(extFilter);

      int returnVal=chooser.showOpenDialog(this);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         String file=chooser.getSelectedFile().getAbsolutePath();
         database.setText(file);
      }      
   }
}

