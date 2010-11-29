package com.jet.apps.databrowser.prefs;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import java.util.Vector;
import javax.swing.border.*;

import com.jet.core.*;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.utils.exception.ValidationException;
import com.jet.utils.filesystem.*;
import com.jet.utils.mail.*;
import com.jet.utils.loader.*;
import com.jet.log.Logger;

import com.jet.utils.PBE;

import com.jet.apps.databrowser.model.*;

// import com.jet.apps.jdbcbrowser.ui.*;

/*
 * $Log: Preferences.java,v $
 * Revision 1.5  2006/12/05 00:30:21  bemocvs
 * Added opt-out of tnsnames warn
 *
 * Revision 1.4  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.3  2004/10/07 21:11:38  bemocvs
 * Editor actions
 *
 * Revision 1.2  2004/01/24 23:46:03  bemocvs
 * 3.2.4
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2001/09/14 00:24:24  bemocvs
 * initial checkin.
 *
 * Revision 1.5  2001/07/31 14:50:15  bemocvs
 * changed application layout
 *
 * Revision 1.4  2001/07/31 00:41:09  bemocvs
 * changed to modal dialog, added single window operation.
 *
 */

/**
 *
 */
public class Preferences extends JDialog implements Logger, ActionListener
{
   private EProperties mProps=null;
   
   private Vector panels=new Vector();
   
   private static Preferences instance=null;

   private PBE pbe=null;

   /**
    */
   private Preferences(Frame parent, EProperties props, PBE p)
   {
      super(parent, true);
      mProps=props;
      pbe=p;
      setSize(520, 340);
      setTitle("Preferences");
      setLocation(WinUtil.alignCenter(this));
      Container cp=this.getContentPane();

      cp.setLayout(new BorderLayout());

      JTabbedPane tp=new JTabbedPane();
      cp.add(tp, "Center");

      JPanel applicationPrefs=new ApplicationPanel(mProps);
      panels.addElement(applicationPrefs);
      //JPanel editorPrefs=new JEditPanel(mProps);
      //panels.addElement(editorPrefs);

      JPanel emailPrefs=new EMailPanel(mProps, pbe);
      panels.addElement(emailPrefs);
      JPanel odbcPrefs=new ODBCConnector();
      JPanel oraclePrefs=new OracleConnector();

      panels.addElement(oraclePrefs);
      panels.addElement(odbcPrefs);

      //JPanel ldapPrefs=new LDAP();
      // panels.addElement(ldapPrefs);
      
      JPanel dlPrefs=new DriverManagerPanel(mProps);
      panels.addElement(dlPrefs);


      JTabbedPane connectorPane=new JTabbedPane();
      connectorPane.add("Oracle Drivers", oraclePrefs);
      connectorPane.add("ODBC Bridge", odbcPrefs);

      JPanel dataPanel=new DataPanel(mProps);
      panels.addElement(dataPanel);

      tp.add("Application", applicationPrefs);
      tp.add("Data Retrieval", dataPanel);
      // tp.add("Editor", editorPrefs);
      tp.add("Connectors", connectorPane);
      tp.add("E-Mail", emailPrefs);
      tp.add("Driver Manager", dlPrefs);
      //tp.add("LDAP", ldapPrefs);

      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton button=null;

      button=new JButton("OK");
      button.setActionCommand("ok");
      button.addActionListener(this);
      buttonPanel.add(button);

      button=new JButton("Cancel");
      button.setActionCommand("cancel");
      button.addActionListener(this);
      buttonPanel.add(button);

      button=new JButton("Apply");
      button.setActionCommand("apply");
      button.addActionListener(this);
      buttonPanel.add(button);

      cp.add(buttonPanel, "South");
   }

   /** */
   public static void editPreferences(DBSession session, Frame parent) {
      if (instance == null)
         instance=new Preferences(parent, session.getGlobalProperties(), 
                                  session.getPBE());
      instance.show();
   }

   /** */
   public static void main(String args[]) {
      Preferences prefs=new Preferences(null, new EProperties(), null);
      prefs.show();
      // System.exit(0);
   }

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("cancel"))
         this.dispose();
      else if (action.equals("ok"))
         okHandler();
      else if (action.equals("apply"))
         applyHandler();
   }
   
   /**
    */
   private void applyHandler()
   {
      applyChanges();
   }
   
   /** 
    */
   private void okHandler()
   {
      if (applyChanges())
         dispose();
   }

   /**
    */
   private boolean applyChanges()
   {
      int panelCount=panels.size();
      boolean valid=true;
      ValidationException valEx=null;
      for (int i=0; i<panelCount; i++)
      {
         // validate all panels first
         PreferencePanel pp=(PreferencePanel)panels.elementAt(i);
          
         try{pp.validateData();}
         catch (ValidationException ex)
         {
            if (valEx == null)
               valEx=ex;
            else
               valEx.add(ex);
         }
      }

      // all panels validated.
      if (valEx != null)
      {
         ValidationDialog.showValidation(this, valEx);
         return false;
      }
      else
      {
         // continue

         for (int i=0; i<panelCount; i++)
         {
            PreferencePanel pp=(PreferencePanel)panels.elementAt(i);
            pp.save();
         }
         try
         {
            mProps.save();
         }
         catch (Exception ex)
         {
            log.printStackTrace(ex);
         }
      }
      return true;
   }

   /**
    *
    */
   private class ODBCConnector extends JPanel 
      implements ActionListener, PreferencePanel
   {
      public MonitoredTextField iniFile=null;
      
      public ODBCConnector()
      {
         setLayout(new BorderLayout());
         
         JPanel centerPanel=new JPanel(new GridBagLayout());
         GridBagConstraints c=new GridBagConstraints();

         c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
         c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
         c.gridy=c.RELATIVE;
         
         centerPanel.setBorder(new TitledBorder("ODBC.ini File Location"));
         
         iniFile=new MonitoredTextField(30, 1);
         iniFile.setInitialText((String)mProps.get("odbcIniFile"));

         c.fill=c.HORIZONTAL;
         c.gridx=0; c.gridy=0; c.weightx=1; c.anchor=c.NORTHEAST;
         centerPanel.add(iniFile, c);
         
         JButton button=null;
         
         c.gridx=1; c.gridy=c.RELATIVE; c.weightx=.1;
         button=new JButton("Browse...");
         button.setActionCommand("odbcBrowse");
         button.addActionListener(this);
         centerPanel.add(button, c);
         
         this.add(centerPanel, "North");
      }

      public void actionPerformed(ActionEvent ae)
      {
         // we're currently only listening for 1 action
         showFileChooser();
      }
      
      void showFileChooser()
      {
         JFileChooser chooser=new JFileChooser();
         chooser.setFileSelectionMode(chooser.FILES_ONLY);
         chooser.setMultiSelectionEnabled(false);

         Environment env=Environment.getEnvironment();
         String sysRoot=env.get("SystemRoot");
         if (sysRoot != null)
            chooser.setCurrentDirectory(new File(sysRoot));
         

         ExtensionFilter extFilter=new ExtensionFilter();
         extFilter.addExtension(".ini");
         chooser.setFileFilter(extFilter);

         int returnVal=chooser.showOpenDialog(this);
         if (returnVal == chooser.APPROVE_OPTION)
         {
            String file=chooser.getSelectedFile().getAbsolutePath();
            iniFile.setText(file);
         }
      }

      /**
       *
       */
      public boolean validateData()
         throws ValidationException 
      {
         // See if the file exists
         ValidationException ex=null;

         if (iniFile.isUpdated())
         {
            String file=iniFile.getText().trim();
            if (empty(file))
            {
               // Hasen't been set yet.
            }
            else
            {
               File f=new File(file);
               if (!f.exists())
               {
                  ex=new ValidationException();
                  ex.addValidation("Connectors -> ODBC -> ODBC.ini File"+
                                   " Location",
                                   "File "+file+" does not exist.  If you "+
                                   "are not using this feature, leave the "+
                                   "field blank to eliminate this message.");
               }
            }
         }
         
         if (ex != null)
            throw ex;

         return true;
      }

      /**
       *
       */
      public boolean save()
      {
         if (iniFile.isUpdated())
            mProps.put("odbcIniFile", iniFile.getText().trim());
         return true;
      }
   }


   /**
    *
    */
   private class OracleConnector extends JPanel 
      implements ActionListener, PreferencePanel
   {
      public MonitoredTextField iniFile=null;
      public MonitoredCheckBox alphaSort=null;
      public MonitoredCheckBox showTnsWarning=null;
      
      String TNS_NAMES_WARN="tnsNamesDontWarn";
      String TNS_NAMES_SORT="tnsNamesSort";

      public OracleConnector()
      {
         setLayout(new BorderLayout());
         
         JPanel centerPanel=new JPanel(new GridBagLayout());
         GridBagConstraints c=new GridBagConstraints();

         c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
         c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
         c.gridy=c.RELATIVE;
         
         centerPanel.setBorder(new TitledBorder("tnsnames.ora File Location"));
         
         iniFile=new MonitoredTextField(30, 1);
         iniFile.setInitialText((String)mProps.get("tnsNamesFile"));

         c.fill=c.HORIZONTAL;
         c.gridx=0; c.gridy=0; c.weightx=1; c.anchor=c.NORTHEAST;
         centerPanel.add(iniFile, c);
         
         JButton button=null;
         
         c.gridx=1; c.gridy=c.RELATIVE; c.weightx=.1;
         button=new JButton("Browse...");
         button.setActionCommand("odbcBrowse");
         button.addActionListener(this);
         centerPanel.add(button, c);

         c.gridx=0; c.gridy=1; c.gridwidth=1;
         alphaSort=new MonitoredCheckBox("Alphabetically Sort DB Names");
         alphaSort.setInitialValue(mProps.getBoolean(TNS_NAMES_SORT, false));
         centerPanel.add(alphaSort, c);

         c.gridx=0; c.gridy=2; c.gridwidth=1;
         showTnsWarning=new MonitoredCheckBox("Don't Show TNS Names Warning Dialog");
         showTnsWarning.setInitialValue(mProps.getBoolean(TNS_NAMES_WARN, false));
         centerPanel.add(showTnsWarning, c);
         
         this.add(centerPanel, "North");
      }
      
      public void actionPerformed(ActionEvent ae) {
         // we're currently only listening for 1 action
         showFileChooser();
      }
      
      void showFileChooser() {
         JFileChooser chooser=new JFileChooser();
         chooser.setFileSelectionMode(chooser.FILES_ONLY);
         chooser.setMultiSelectionEnabled(false);

         chooser.setCurrentDirectory(new File("/"));

         ExtensionFilter extFilter=new ExtensionFilter();
         extFilter.addExtension(".ora");
         //chooser.setFileFilter(extFilter);

         int returnVal=chooser.showOpenDialog(this);
         if (returnVal == chooser.APPROVE_OPTION)
         {
            String file=chooser.getSelectedFile().getAbsolutePath();
            iniFile.setText(file);
         }
      }

      /**
       *
       */
      public boolean validateData()
         throws ValidationException 
      {
         // See if the file exists
         ValidationException ex=null;

         if (iniFile.isUpdated()) {
            String file=iniFile.getText().trim();
            if (empty(file)) {
               // Hasn't been set yet.
            }
            else {
               File f=new File(file);
               if (!f.exists()) {
                  ex=new ValidationException();
                  ex.addValidation("Connectors -> Oracle-> tnsnames.ora File"+
                                   " Location",
                                   "File "+file+" does not exist.  If you "+
                                   "are not using this feature, leave the "+
                                   "field blank to eliminate this message.");
               }
            }
         }
         

         if (ex != null)
            throw ex;

         return true;
      }

      public boolean save()
      {
         if (iniFile.isUpdated())
            mProps.put("tnsNamesFile", iniFile.getText().trim());
         if (alphaSort.isUpdated()) {
            mProps.put(TNS_NAMES_SORT, 
                       (new Boolean(alphaSort.isSelected())).toString());
         }
         if (showTnsWarning.isUpdated()) {
            mProps.put(TNS_NAMES_WARN, 
                       (new Boolean(alphaSort.isSelected())).toString());
         }
         return true;
      }
   }

   /**
    *
    */
   private class LDAP extends JPanel
      implements PreferencePanel
   {
      public MonitoredTextField ldapServerName=null;
      public MonitoredTextField ldapServerPort=null;
      public MonitoredTextField ldapInitialContext=null;
      
      EProperties mailProps=null;

      public LDAP()
      {
         setLayout(new GridBagLayout());

         mailProps=(EProperties)mProps.get("outboundMail");
         if (mailProps == null)
         {
            mailProps=new EProperties();
            mProps.put("outboundMail", mailProps);
         }
         
         ldapServerName=new MonitoredTextField(30, 1);
         ldapServerPort=new MonitoredTextField(30, 1);
         ldapInitialContext=new MonitoredTextField(30, 1);
         
         ldapServerName.
         setInitialText((String)mailProps.get("ldapServerName"));
         ldapServerPort.
         setInitialText((String)mailProps.get("ldapServerPort"));
         ldapInitialContext.
         setInitialText((String)mailProps.get("ldapInitialContext"));
         

         JPanel northPanel=new JPanel(new GridBagLayout());
         JPanel centerPanel=new JPanel(new GridBagLayout());

         centerPanel.setBorder(new TitledBorder("LDAP Server Properties"));

         GridBagConstraints c=new GridBagConstraints();
         c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
         c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
         centerPanel.add(new JLabel("LDAP Server Name"), c);
         c.gridy=1;
         centerPanel.add(new JLabel("LDAP Server Port"), c);
         c.gridy=2;
         centerPanel.add(new JLabel("LDAP Initial Context"), c);

         c.fill=c.HORIZONTAL;
         c.gridx=1; c.gridy=0; c.weightx=1; c.anchor=c.NORTHEAST;
         centerPanel.add(ldapServerName, c);
         c.gridy=1;
         centerPanel.add(ldapServerPort, c);
         c.gridy=2;
         centerPanel.add(ldapInitialContext, c);
         

         c=new GridBagConstraints();
         c.ipadx=c.ipady=2; c.insets=new Insets(2,2,2,2);
         c.gridx=c.gridy=0; c.anchor=c.NORTH; c.fill=c.HORIZONTAL;
         c.gridy=c.RELATIVE; c.weightx=1;
         this.add(centerPanel, c);
         c.fill=c.BOTH;
         c.weighty=1;
         this.add(new JPanel(), c); // Place Holder
      }

      /**
       *
       */
      public boolean validateData()
      {
         return true;
      }

      public boolean save()
      {
         return true;
      }
   }

   private static boolean empty(String s)
   {
      if (s == null ||
          s.length() == 0)
         return true;
      else
         return false;
   }
}











