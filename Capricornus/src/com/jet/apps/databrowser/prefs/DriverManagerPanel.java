package com.jet.apps.databrowser.prefs;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

import com.jet.utils.properties.*;
import com.jet.utils.loader.*; // this is redundant. use java.net.URLClassLoa
import com.jet.utils.filesystem.*;
import com.jet.utils.exception.*;
import com.jet.utils.*;

import com.jet.log.Logger;

/*
 * $Log: DriverManagerPanel.java,v $
 * Revision 1.4  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.3  2005/03/08 17:03:27  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.2  2001/10/21 00:15:21  bemocvs
 * Configuration wizard upgrades.
 *
 * Revision 1.1  2001/09/14 00:24:24  bemocvs
 * initial checkin.
 *
 */

/**
 *
 */
class DriverManagerPanel extends JPanel
   implements PreferencePanel, ActionListener, Logger, PropertyObserver
{
   MonitoredTextField driverDir=null;
   JList locations=null;

   Vector dlPath=null;

   Vector addedList=new Vector();

   EProperties mProps=null;

   String dlDir=null;

   /** */
   public DriverManagerPanel(EProperties p)
   {
      super();
      mProps=p;
      setLayout(new BorderLayout());

      dlPath=(Vector)mProps.get("DLPATH");
      if (dlPath == null)
         dlPath=new Vector();

      dlDir=mProps.getProperty("DLDIR");
      if (dlDir == null)
         dlDir="";

      
      JPanel dirPanel=new JPanel(new BorderLayout());
      dirPanel.setToolTipText ("ha!");

      dirPanel.setBorder(new TitledBorder("Global Drivers Directory"));

      driverDir=new MonitoredTextField(20);

      driverDir.setToolTipText("haha");

      driverDir.setInitialText(dlDir);
      JButton choose=new JButton("Choose");
      choose.setActionCommand("dirchoose");
      choose.addActionListener(this);
      dirPanel.add(new JLabel("Driver Dir: "), "West");
      dirPanel.add(driverDir, "Center");
      dirPanel.add(choose, "East");
      
      add(dirPanel, "North");

      //locations=new FileList(dlPath);
      locations=new JList(dlPath);
      //locations.setCellRenderer(new RedCellRenderer());
      JScrollPane sp=new JScrollPane(locations);
      TitledBorder border=new TitledBorder("Specific Drivers");
      sp.setBorder(border);

      add(sp, "Center");

      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton add=new JButton("Add");
      add.setActionCommand("add");
      add.addActionListener(this);

      JButton remove=new JButton("Remove");
      remove.setActionCommand("remove");
      remove.addActionListener(this);

      southPanel.add(add);
      southPanel.add(remove);
      this.add(southPanel, "South");

      mProps.addObserver(this);
   }

   /** */
   public void propertyChange(PropertyChangeEvent evt) {
      Key key=evt.getKey();
      if (key != null) {
         if (key.equals("DLDIR"))
            driverDir.setInitialText(mProps.getProperty(key.toString()));
      }
   }

   /**
    *
    */
   public boolean validateData()
      throws ValidationException
   {
      ValidationException valEx=new ValidationException();

      String temp=driverDir.getText().trim();
      if (!StringUtil.empty(temp)) {
         File ftemp=new File(temp);
         if (!ftemp.exists())
            valEx.addValidation("Driver Manager -> Driver Dir",
                                "If a value is specified for DriverDir, "+
                                "it must be an existing directory.  It is "+
                                "valid to leave this field blank.");
         
         else if (!ftemp.isDirectory()) 
            valEx.addValidation("Driver Manager -> Driver Dir",
                                "The value for Driver Dir must be a valid "+
                                "directory.");
      }
      if (valEx.getErrorCount() > 0)
         throw valEx;

      return true;
   }

   public boolean save()
   {
      // reset the DriverLoader classpath
      URLDriverLoader dl=URLDriverLoader.getInstance();
      if (addedList.size() > 0) {
         for (int i=0; i< addedList.size(); i++) {
            String file=(String)addedList.elementAt(i);
            try {
               log.writeDebug ("adding "+file);
               dl.addResourceFile(new File(file));
            } catch (Exception ex) {
               // this could be a lot better.  add a dialog
               log.printStackTrace(ex);
            }
         }
      }

      // refresh props
      mProps.put("DLPATH", dlPath);

      if (driverDir.isUpdated()) {
         dlDir=driverDir.getText();
         dl.addResourceDir(new File(dlDir));
         mProps.put("DLDIR", dlDir);
      }
      return true;
   }
      
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("add"))
      {
         showFileChooser();
      }
      else if (action.equals("remove"))
      {
         removeSelected();
      }
      else if (action.equals("dirchoose")) {
         showDirChooser();
      }
   }

   void removeSelected()
   {
      Object sel[]=locations.getSelectedValues();
         
      for (int i=0; i<sel.length; i++) {
         dlPath.removeElement(sel[i]);
      }
      locations.setListData(dlPath);
   }


   void showFileChooser()
   {
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      chooser.setCurrentDirectory(new File("/"));

      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".ini");
      //chooser.setFileFilter(extFilter);

      int returnVal=chooser.showOpenDialog(this);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         File f=chooser.getSelectedFile();
         //if (!f.exists()) {
         // error
         //}
         String file=f.getAbsolutePath();
         file=FileUtil.unixSlashify(file);
         dlPath.addElement(file);
         addedList.addElement(file);
         locations.setListData(dlPath);
      }
   }

   void showDirChooser() {
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.DIRECTORIES_ONLY);
      chooser.setMultiSelectionEnabled(false);
      
      chooser.setCurrentDirectory(new File("/"));
      int returnVal=chooser.showOpenDialog(this);
      if (returnVal == chooser.APPROVE_OPTION) {
         File f=chooser.getSelectedFile();
         String file=f.getAbsolutePath();
         file=FileUtil.unixSlashify(file);
         driverDir.setText(file);
      }
   }
}

