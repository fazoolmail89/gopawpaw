package com.jet.apps.databrowser.ui.menu;

import javax.swing.*;

import com.jet.utils.properties.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.action.*;

/**
 *
 */
public class AdvancedMenu extends JMenu
   implements PropertyObserver, Logger
{
   DataBrowser databrowser=null;
   DBSession session=null;

   /** */
   public AdvancedMenu(DataBrowser db) {
      super("Advanced");
      databrowser=db;
      session=databrowser.getSession();
      
      JMenuItem sqllog=new JMenuItem(new ConnectToInternalDB(session, databrowser));
      this.add(sqllog);

      JMenuItem killsql=new JMenuItem(new KillSqlAction(databrowser));
      this.add(killsql);
      // this.add(new JSeparator());

      EProperties globalProps=session.getGlobalProperties();
      globalProps.addObserver(this);

      refresh();
   }

   /** */
   public void refresh() {
      EProperties globalProps=session.getGlobalProperties();

      if (globalProps.getBoolean("enableAdvanced", false)) {
         setEnabled(true);
         setToolTipText(null);
      }
      else {
         setEnabled(false);
         setToolTipText("Enable Advanced Options in Edit->Preferences");
      }
   }

   /**
    *
    */
   public void propertyChange(PropertyChangeEvent evt) {
      log.writeDebug ("Property changed: "+evt);
      if (evt.getKey().equals("enableAdvanced"))
         refresh();
   }   
}