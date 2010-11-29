package com.jet.apps.databrowser.connector;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;
import java.io.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;

import com.jet.utils.properties.EProperties;
import com.jet.utils.filesystem.ExtensionFilter;

import com.jet.log.*;

import com.jet.apps.databrowser.model.DBSession;

/*
 * $Log: OracleThinConnectFrame.java,v $
 * Revision 1.4  2006/12/12 01:41:06  bemocvs
 * fix for oracle date/timestamp
 *
 * Revision 1.3  2006/12/05 00:30:48  bemocvs
 * Added default schema, and filechooser/optout tnsnames
 *
 * Revision 1.2  2004/01/24 23:46:03  bemocvs
 * 3.2.4
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
public class OracleThinConnectFrame extends ConnectDialog
   implements ActionListener, Logger, Connector, AdvancedConnectionProperties
{
   
   //private static final String driver="oracle.jdbc.OracleDriver";
   // the class below is available for backwards compatability, but Oracle
   // claims it will be removed with the next version of the driver (11).
   // When they do, we will need 2 connector windows for Oracle Thin.  
   // The new driver does not use the .driver. in the package name (as above)
   // bemo, 11 dec 2006
   private static final String driver="oracle.jdbc.driver.OracleDriver";



   private static final String urlBase="jdbc:oracle:thin:@";

   private static final String initialSelection=
   "Enter parameters, or choose from the list";
   
   static String TNS_WARN_KEY="tnsNamesDontWarn";
   static String TNS_NAMES_FILE="tnsNamesFile";
      
   private JComboBox databases;
   
   private JTextField server, port, sid, user;
   private JPasswordField password;

   private EProperties mAdvancedProperties=null;

   private boolean ok=false;

   private ConnectionInfo connInfo=null;

   private static ConnectionInfo lastConnInfo=null;

   private static Vector tnsInfo=null;

   private static String last_tns_file=null;

   Frame parent=null;

   /** Global properties (jdbcbrowser.properties) */
   EProperties globals=DBSession.getGlobalProperties();
      

   /** 
    * Fixes the Oracle DATE/TIMESTAMP issue that arrived in Oracle 9.2; <p>
    * 
    * For reference:
    * http://www.oracle.com/technology/tech/java/sqlj_jdbc/htdocs/jdbc_faq.htm#08_01
    * 
    * THIS DOES NOT WORK WITH 10g!!!!  I'm leaving it here for posterity, but 
    * disabling it below.
    */
   private static final String V8_COMPAT="oracle.jdbc.V8Compatibility";

   /**
    *
    */
   public OracleThinConnectFrame(Frame par)
   {
      super (par);
      parent=par;
      setSize(350, 170);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Oracle Thin Connector");
      getContentPane().setLayout(new BorderLayout());

      // Reload TNS names if necessary 
      EProperties globals=DBSession.getGlobalProperties();
      String file=globals.getProperty(DBSession.TNS_FILE_KEY);

      boolean gotTnsInfo=false;
      if (file != null) {
         tnsInfo=reloadTnsNames(file);
         if (tnsInfo != null && tnsInfo.size() > 0)
            gotTnsInfo=true;
      }

      if (gotTnsInfo) {
         setSize(370, 220);
         
         ThinConnectInfo tci=(ThinConnectInfo)tnsInfo.elementAt(0);
         if (!tci.name.equals(initialSelection))
            tnsInfo.insertElementAt(new ThinConnectInfo(initialSelection), 0);
         databases=new JComboBox(tnsInfo);
         databases.setEditable(false);
         databases.setSelectedIndex(0);

         databases.setMaximumRowCount(4);
         databases.setActionCommand("database");
      }

      // Initialize the fields
      server=new PopupTextField(40);
      port=new PopupTextField(40);
      sid=new PopupTextField(40);
      user=new PopupTextField(40);
      password=new JPasswordField(40);


      JPanel northPanel=new JPanel(new BorderLayout());
      
      int rows=0;
      if (gotTnsInfo)
         rows=6;
      else
         rows=5;

      JPanel labels=new JPanel(new GridLayout(rows, 1));

      if (gotTnsInfo)
         labels.add(new JLabel("ServerInfo:"));
      labels.add(new JLabel("Server (ip/dns): "));
      labels.add(new JLabel("Port :"));
      labels.add(new JLabel("SID :"));
      labels.add(new JLabel("Username :"));
      labels.add(new JLabel("Password :"));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      if (gotTnsInfo)
         fields.add(databases);
      fields.add(server);
      fields.add(port);
      fields.add(sid);
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


      port.setText("1521");
      if (lastConnInfo != null)
      {
         if (lastConnInfo.getProperty("server") != null)
            server.setText(lastConnInfo.getProperty("server"));
         if (lastConnInfo.getProperty("port") != null)
            port.setText(lastConnInfo.getProperty("port"));
         if (lastConnInfo.getProperty("sid") != null)
            sid.setText(lastConnInfo.getProperty("sid"));
         if (lastConnInfo.getProperty("user") != null)
            user.setText(lastConnInfo.getProperty("user"));
      }

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      advancedButton.addActionListener(this);

      if (gotTnsInfo) databases.addActionListener(this);
   }

   /** */
   public static String getDriver() {return driver;}

   /**
    *
    */
   public ConnectionInfo getConnectionInfo()
   {
      show();
      if (ok) {
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
      else if (action.equals("database"))
         databaseSelectHandler();
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
   private void databaseSelectHandler() {
      int index=databases.getSelectedIndex();
      ThinConnectInfo tci=(ThinConnectInfo)tnsInfo.elementAt(index);
      server.setText(tci.host);
      port.setText(tci.port);
      sid.setText(tci.sid);
   }

   
   /**
    *
    */
   private void okButtonHandler()
   {
      String url=urlBase+server.getText()+":"+port.getText()+":"+sid.getText();

      //String url=urlBase+buildTNSConnectString();
      connInfo=new ConnectionInfo(driver, url, user.getText(), 
                                  password.getText());

      connInfo.setProperty("server", server.getText());
      connInfo.setProperty("port", port.getText());
      connInfo.setProperty("sid", sid.getText());

      // This works for 8.1.6 driver for sure!!
      String oracleDatabase=server.getText().trim()+":"+port.getText().trim()+
      ":"+sid.getText().trim();
      connInfo.setProperty("database", oracleDatabase);

      connInfo.setProperty("protocol", "tcp");

      // This does not work, see above.
      //connInfo.setProperty(V8_COMPAT, "true");
      

      String rootName=null;
      if (databases != null)
      {
         if (databases.getSelectedIndex() != 0)
         {
            rootName=databases.getSelectedItem().toString().trim();
         }
      }
      if (rootName == null)
         rootName=server.getText().trim();

      String name="thin:"+rootName+":"+port.getText().trim()+" ("+
      sid.getText().trim()+")";

      if (user != null)
         name=user.getText()+" on "+name;

      connInfo.setName(name);

      // connInfo=ConnectionManager.getConnection(connInfo);
      
      if (mAdvancedProperties != null) {
         if (mAdvancedProperties.getString(SCHEMA_KEY) == null &&
             user != null && user.getText() != null &&
             user.getText().trim().length() > 0) {
            
            String schemaname=user.getText().trim().toUpperCase();
            log.writeDebug(3, "Setting defaultSchemaName to "+schemaname);
            mAdvancedProperties.put(SCHEMA_KEY, schemaname);
         }
         
         connInfo.setAdvancedProperties(mAdvancedProperties);
      } else {
         if (user != null && user.getText() != null &&
             user.getText().trim().length() > 0) {
            mAdvancedProperties=new EProperties();
            String schemaname=user.getText().trim().toUpperCase();
            mAdvancedProperties.put(SCHEMA_KEY, schemaname);
            connInfo.setAdvancedProperties(mAdvancedProperties);
         }
      }
      
      ok=true;
      dispose();
   }
   
   /** */
   private String buildTNSConnectString() {
      StringBuffer sb=new StringBuffer();
      sb.append("(description=(address=(protocol=tcp) (Host="+server.getText()+
                ")(port="+port.getText()+"))  (connect_data=(sid="+
                sid.getText()+")))");
      return sb.toString();
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

   private static class TCIComparator implements Comparator {
      public int compare(Object o1, Object o2) {
         return ((ThinConnectInfo)o1).toString().compareTo(((ThinConnectInfo)o2).toString());
      }
      public boolean equals(Object obj) {
         return false;
      }
   }

   /** 
    * A special warning dialog that allows the user to choose the 
    * tnsnames.ora file if they want to.
    */
   class TNSNamesWarning extends JDialog implements ActionListener {
      JCheckBox dontShow=null;
      JButton choose=null;
      JButton close=null;
      
      File tnsNamesFile=null;

      String message=
      "<html>The Browser was unable to find your tnsnames.ora <br>"+
      "file.  If you specify it's location in the Edit -&gt; Preferences <br>"+
      "dialog, you will be presented with a list of Oracle databases <br>"+
      "to connect to.  Otherwise, simply enter the information into <br>"+
      "the connector's dialog. </html>";
      
      /** */
      public TNSNamesWarning() {
         super(parent, "Find tnsnames.ora", true);

         JLabel label=new JLabel(message);
         label.setBorder(new LineBorder(Color.black));
         
         dontShow=new JCheckBox("Don't Show This Warning");

         dontShow.setSelected(globals.getBoolean(TNS_WARN_KEY, false));
         choose=new JButton("Find TNS Names");
         choose.addActionListener(this);
         close=new JButton("Close");
         close.addActionListener(this);
         
         // Layout the panel
         Container cp=this.getContentPane();
         cp.setLayout(new BorderLayout());
         cp.add(label, BorderLayout.CENTER);

         JPanel south=new JPanel(new BorderLayout());
         JPanel buttons=new JPanel(new FlowLayout());
         
         buttons.add(choose);
         buttons.add(close);
         south.add(buttons, BorderLayout.EAST);
         south.add(dontShow, BorderLayout.CENTER);
         cp.add(south, BorderLayout.SOUTH);
      }

      public void actionPerformed(ActionEvent ae) {
         log.writeDebug("Action: "+ae);

         if (ae.getSource() == close) {
            globals.putBoolean(TNS_WARN_KEY, dontShow.isSelected());

            this.dispose();
         } else if (ae.getSource() == choose) {
            // file chooser. 
            JFileChooser chooser=new JFileChooser();
            chooser.setFileSelectionMode(chooser.FILES_ONLY);
            chooser.setMultiSelectionEnabled(false);

            chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
            ExtensionFilter extFilter=new ExtensionFilter();
            extFilter.addExtension(".ora");
            chooser.setFileFilter(extFilter);

            int returnVal=chooser.showOpenDialog(parent);
            if (returnVal == chooser.APPROVE_OPTION) {
               tnsNamesFile=chooser.getSelectedFile();

               if (tnsNamesFile.exists()) {
                  globals.put(TNS_NAMES_FILE, tnsNamesFile.getAbsolutePath());
               }
            }
         }
      }
   }

   File showWarning() {
      if (globals.getBoolean(TNS_WARN_KEY)) {
         return null;
      }
      TNSNamesWarning warning=new TNSNamesWarning();
      warning.pack();
      warning.setLocation(WinUtil.alignCenter(warning));
      warning.show();
      
      return warning.tnsNamesFile;
   }

   /**
    * Parses the tns names file to read the names of the databases.
    */
   private Vector reloadTnsNames(String filename)
   {
      if (filename.equals(last_tns_file))
         return tnsInfo;

      last_tns_file=filename;

      File file = new File(filename);
      if (!file.exists()) {
         File afile=showWarning();
         if (afile != null)
            file=afile;
      }

      log.writeDebug (VERBOSE, "Looking for tnsNames at "+filename);


      if (!file.exists()) 
         return null;

      Vector info=new Vector();
      FileInputStream fis=null;
      String line=null;

      try {
         fis=new FileInputStream(file);
         BufferedReader bis=new BufferedReader(new InputStreamReader(fis));

         line=bis.readLine();
         while (line != null) {

            if (line.length() > 0) {
               if (line.charAt(0) == '#') {
                  // ignore
               }
               else if (line.trim().length() > 1) {
                  String theName=line.substring(0, line.indexOf("="));
                  log.writeDebug (VERBOSE, "Name found: "+theName);
                  String sid="";
                  String port="";
                  String host="";

                  String connLine = null;
                  boolean atNextConnection=false;
                  bis.mark(2048);
                  connLine=bis.readLine();
                  while (connLine != null &&
                         !atNextConnection) {
                     if (connLine.length() > 0 &&
                         connLine.charAt(0) != ' ' &&
                         connLine.charAt(0) != '\t') {
                        // build the connection
                        atNextConnection=true;
                     }
                     else {
                        String temp=null;
                        temp=getParm(connLine, "sid");
                        if (temp != null)
                           sid=temp;

                        temp=getParm(connLine, "host");
                        if (temp != null) 
                           host=temp;

                        temp=getParm(connLine, "port");
                        if (temp != null) 
                           port=temp;
                     }

                     if (!atNextConnection) {
                        bis.mark(2048);
                        connLine=bis.readLine();
                     }
                  }

                  if (!empty(sid) || !empty(host) || !empty(port)) {
                     // add it to the list
                     ThinConnectInfo tci=new ThinConnectInfo();
                     tci.name=theName;
                     tci.host=host;
                     tci.port=port;
                     tci.sid=sid;
                     log.writeDebug (VERBOSE, "Adding "+tci+" to info.");
                     info.addElement(tci);
                  }

                  if (connLine != null)
                     bis.reset();
               }
            }
            
            line=bis.readLine();
         }
      }
//       catch (FileNotFoundException ex)
//       {
//          // We could add a file chooser here...
//          log.writeError("Oracle Thin Connector can't find "+filename);

//          String message=
//          "The Browser was unable to find your tnsnames.ora \n"+
//          "file.  If you specify it's location in the Edit -> Preferences \n"+
//          "dialog, you will be presented with a list of Oracle databases \n"+
//          "to connect to.  Otherwise, simply enter the information into \n"+
//          "the connector's dialog.";
//          // MessageWindow.showMessage (null, message);
         
//       }
//       catch (StringIndexOutOfBoundsException ex) {
//          log.writeDebug ("String index error. Line='"+line+"'");
//          log.printStackTrace(ex); // .printStackTrace(System.out);
//       }
      catch (Exception ex) {
         log.writeError (1, "Can't parse tnsnames.ora at line "+line, ex);
         ExceptionDebugger.debug(this, "Error reading or parsing tnsnames.ora", 
                                 ex, false);
      }
      finally {
         if (fis != null) {
            try {
               fis.close();
            }
            catch (Exception ex){
               log.printStackTrace(ex);
            }
         }
      }

      EProperties globals=DBSession.getGlobalProperties();
      if (globals.getBoolean("tnsNamesSort", false)) {
         Collections.sort(info, new TCIComparator());
      }

      return info;
   } // End read tnsnames.


   /**
    *
    */
   private static String getParm(String line, String parmName)
   {
      //log.writeDebug (VERBOSE, "Lookin for "+parmName+" in "+ line);
      String lowerLine=line.toLowerCase();

      int parmStart=lowerLine.indexOf(parmName);
      if (parmStart != -1)
      {
         //log.writeDebug (VERBOSE, "parmstart = "+parmStart+" for "+parmName);
         int equalsAt=lowerLine.indexOf("=",parmStart);
         if (equalsAt != -1)
         {
            int endParen=lowerLine.indexOf(")", equalsAt);
            if (endParen != -1)
            {
               String parm=line.substring(equalsAt+1, endParen);
               //log.writeDebug (5, "parm = "+parm);
               return parm.trim();
            }
         }
      }
      return null;
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
