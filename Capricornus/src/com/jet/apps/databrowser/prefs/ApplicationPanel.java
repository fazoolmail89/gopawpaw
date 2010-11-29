package com.jet.apps.databrowser.prefs;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

import com.jet.utils.properties.*;
import com.jet.utils.filesystem.*;
import com.jet.net.mail.*;
import com.jet.utils.exception.ValidationException;
import com.jet.utils.*;
import com.jet.utils.ui.*;

import com.jet.core.*;

import com.jet.apps.databrowser.model.SessionPropertyKeys;

import com.jet.log.Logger;

/*
 * $Log: ApplicationPanel.java,v $
 * Revision 1.9  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.8  2006/05/24 15:39:42  barney
 * added the longed for one touch expandable splitpain
 *
 * Revision 1.7  2005/03/02 08:47:00  bemocvs
 * paste from unix, kbd shortcuts
 *
 * Revision 1.6  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.5  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.4  2004/01/24 23:46:03  bemocvs
 * 3.2.4
 *
 * Revision 1.3  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.2  2002/12/31 07:11:18  bemocvs
 * 3.1.0, data io, etc.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.3  2001/10/21 00:15:21  bemocvs
 * Configuration wizard upgrades.
 *
 * Revision 1.2  2001/10/15 21:18:33  bemocvs
 * Changed the order of operations for property observers.
 *
 * Revision 1.1  2001/09/14 00:24:24  bemocvs
 * initial checkin.
 *
 */

/**
 *
 */
class ApplicationPanel extends JPanel
   implements PreferencePanel, Logger, PropertyObserver, SessionPropertyKeys
{
   public MonitoredTextField maxResults=null;
   public MonitoredTextField debugLevel=null;
   public MonitoredTextField recentConnections=null;
   public MonitoredTextField maxRecentFiles=null;

   // public MonitoredCheckBox useSyntaxHighlight=null;
   public MonitoredCheckBox showConsoleOnStartup=null;
   public MonitoredCheckBox singleWindowOperation=null;
   public MonitoredCheckBox enableAdvanced=null;
   public MonitoredCheckBox oneTouchExpandable=null;
      
   EProperties recent=null;
   
   EProperties mProps=null;

   /** */
   public ApplicationPanel(EProperties p)
   {
      setLayout(new BorderLayout());
      mProps=p;

      recent=(EProperties)mProps.get("recent");
      if (recent == null) {
         recent=new EProperties();
         mProps.put("recent", recent);
      }
         
      debugLevel=new MonitoredTextField(30, 1); 
      debugLevel.setInitialText(""+mProps.getInt(DEBUG_LEVEL, 4));
      maxResults=new MonitoredTextField(30, 1);
      maxResults.setInitialText(""+mProps.getInt(MAX_RESULTS, 400));
      recentConnections=new MonitoredTextField(30, 1);
      recentConnections.
      setInitialText((String)recent.get("numRecentConnections"));
      
      maxRecentFiles=new MonitoredTextField(30, 1);
      maxRecentFiles.setInitialText(""+mProps.getInt(MAX_RECENT_FILES, 6));

      // useSyntaxHighlight=new MonitoredCheckBox("Syntax Highlighting (beta, slow)");
      //useSyntaxHighlight.
      //setInitialValue(mProps.getBoolean("useSyntaxHighlight", false));

      showConsoleOnStartup=new MonitoredCheckBox("Show Console on Startup");
      showConsoleOnStartup.
      setInitialValue(mProps.getBoolean("showConsoleOnStartup", false));

      singleWindowOperation=new MonitoredCheckBox("Single Window Operation");
      singleWindowOperation.
      setInitialValue(mProps.getBoolean("singleWindowOperation", false));

      enableAdvanced=new MonitoredCheckBox("Enable Advanced Menu");
      enableAdvanced.setInitialValue(mProps.getBoolean("enableAdvanced", false));

      oneTouchExpandable = new MonitoredCheckBox("Allow collapsible scratch tab/TreeView");
      oneTouchExpandable.setInitialValue(mProps.getBoolean("oneTouchExpandable", false));
      
      JPanel centerPanel=new JPanel(new GridBagLayout());

      GridBagConstraints c=new GridBagConstraints();

      c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
      c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
      c.gridy=c.RELATIVE;
      centerPanel.add(new JLabel("Maximum Results"), c);
      centerPanel.add(new JLabel("Max Recent Connections"), c);
      centerPanel.add(new JLabel("Max Recent Files"), c);
      centerPanel.add(new JLabel("Debug Level"), c);
      //centerPanel.add(new JLabel(""), c);

      c.fill=c.HORIZONTAL;
      c.gridx=1; c.gridy=0; c.weightx=1; c.anchor=c.NORTHEAST;
      c.gridy=c.RELATIVE;
      centerPanel.add(maxResults, c);
      centerPanel.add(recentConnections, c);
      centerPanel.add(maxRecentFiles, c);
      centerPanel.add(debugLevel, c);

      c.gridx=0; c.gridwidth=2;
      // centerPanel.add(useSyntaxHighlight, c);
      centerPanel.add(showConsoleOnStartup, c);
      // centerPanel.add(singleWindowOperation, c);
      centerPanel.add(enableAdvanced, c);
      centerPanel.add(oneTouchExpandable, c);
         
      this.add(centerPanel, "North");
      mProps.addObserver(this);
   }

   /** */
   public void propertyChange(PropertyChangeEvent evt) {
      Key key=evt.getKey();
//       if (key != null) {
//          if (key.equals("licenseKey"))
//             licenseKey.setInitialText(mProps.getProperty(key.toString()));
//       }
   }

   /**
    *
    */
   public boolean validateData()
      throws ValidationException
   {
      String temp=null;
      ValidationException valEx=null;
         
      if (maxResults.isUpdated())
      {
         temp=maxResults.getText().trim();
         try {Integer.parseInt(temp);}
         catch (NumberFormatException ex)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Maximum Results",
                                "Must be an integer.");
         }
      }

      if (recentConnections.isUpdated())
      {
         temp=recentConnections.getText().trim();
         int itemp=0;
         try {itemp=Integer.parseInt(temp);}
         catch (NumberFormatException ex)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Recent Connections",
                                "Must be an integer.");
         }
         if (itemp < 1 ||
             itemp > 20)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Recent Connections",
                                "Recent Connections must be between "+
                                "1 and 20");
         }
      }

      if (maxRecentFiles.isUpdated())
      {
         temp=maxRecentFiles.getText().trim();
         int itemp=0;
         try {itemp=Integer.parseInt(temp);}
         catch (NumberFormatException ex)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Max Recent Files",
                                "Must be an integer.");
         }
         if (itemp < 1 ||
             itemp > 20)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Recent Connections",
                                "Recent Connections must be between "+
                                "1 and 20");
         }
      }

      if (debugLevel.isUpdated()) {
         temp=debugLevel.getText().trim();
         int itemp=0;
         try {itemp=Integer.parseInt(temp);}
         catch (NumberFormatException ex)
         {
            if (valEx == null)
               valEx=new ValidationException();
            valEx.addValidation("Application->Debug Level",
                                "Must be an integer.");
         }         
      }

      if (valEx != null)
         throw valEx;

      return true;
   }

   public boolean save()
   {
      if (maxResults.isUpdated())
         mProps.put(MAX_RESULTS, maxResults.getText().trim());

      if (maxRecentFiles.isUpdated())
         mProps.put(MAX_RECENT_FILES, maxRecentFiles.getText().trim());

      if (debugLevel.isUpdated()) {
         String temp=debugLevel.getText().trim();
         int itemp=0;
         boolean error=false;
         try {itemp=Integer.parseInt(temp);}
         catch (NumberFormatException ex){
            error=true;
         }
         if (!error) {
            log.setDebugLevel(itemp);
            mProps.put("debugLevel", temp);
         }
      }
         
      boolean restart=false;

      if (recentConnections.isUpdated())
         recent.put("numRecentConnections", 
                    recentConnections.getText().trim());
         
//        if (useSyntaxHighlight.isUpdated()){
//           restart=true;
//           mProps.putBoolean("useSyntaxHighlight", 
//                             useSyntaxHighlight.isSelected());
//        }

      if (showConsoleOnStartup.isUpdated())
         mProps.putBoolean("showConsoleOnStartup", 
                           showConsoleOnStartup.isSelected());

      if (singleWindowOperation.isUpdated()) {
         restart=true;
         mProps.putBoolean("singleWindowOperation", 
                           singleWindowOperation.isSelected());
      }

      if (enableAdvanced.isUpdated()) {
         mProps.putBoolean("enableAdvanced", enableAdvanced.isSelected());
         enableAdvanced.setInitialValue(enableAdvanced.isSelected());
      }
      
      if (oneTouchExpandable.isUpdated()) {
    	  restart=true;
          mProps.putBoolean("oneTouchExpandable", oneTouchExpandable.isSelected());
       }

      if (restart)
         MessageWindow.showMessage(this, "Some setting will not take "+
                                   "effect until DataBrowser is "+
                                   "restarted.");
      return true;
   }
}

