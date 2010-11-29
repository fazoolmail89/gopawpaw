package com.jet.apps.databrowser.plugin;

import java.util.*;
import java.sql.*;
import java.lang.reflect.*;
import javax.swing.*;

import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.ui.*;

import com.jet.utils.properties.*;
import com.jet.utils.VectorUtil;
import com.jet.log.*;

/*
 * $Log: PluginManager.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/04 18:51:25  bemocvs
 * Plugin work
 *
 */

/** 
 *
 *
 *
 * @author Paul Bemowski
 */
public final class PluginManager implements Logger, Observer, DBEvents {
   DBSession dbSession=null;

   DataBrowser databrowser=null;
   JMenuBar menubar=null;
   DBToolBar toolbar=null;


   JMenu pluginMenu=null;

   /** */
   public PluginManager(DBSession session, DataBrowser databrowser,
                        JMenuBar menubar, DBToolBar toolbar) {
      dbSession=session;
      this.menubar=menubar;
      this.toolbar=toolbar;
      this.databrowser=databrowser;
      
      dbSession.addObserver(this);
   }

   /** */
   final void loadPlugins() {
      try {
         ConnectionInfo conInfo=dbSession.getConnectionInfo();
         DatabaseMetaData dbmd=conInfo.getMetaData();

         String databaseName=dbmd.getDatabaseProductName();
         if (databaseName == null) {
            log.writeDebug(1, "Database product name is null, unable to "+
                           "load plugins.");
            return;
         }
         databaseName=databaseName.toLowerCase();
         
         log.writeDebug(1, "Looking for plugins for '"+databaseName+"'");
         EProperties databases=DatabaseCustomization.getDatabaseProperties();
         EProperties dbProps=databases.getProperties(databaseName);
         if (dbProps == null) {
            // FIXME: log, perhaps UPA
            return;
         }
         
         EProperties plugins=dbProps.getProperties("plugins");
         if (plugins == null) {
            log.writeDebug(3, "No plugins available for key "+databaseName);
            return;
         }
         EProperties menu=plugins.getProperties("menu");
         if (menu != null) {
            initMenu(menu);
         }
         EProperties tool=plugins.getProperties("toolbar");
         if (tool != null) {
            initToolbar(tool);
         }
      } catch (Throwable t) {
         log.writeError(1, "Error loading plugins...", t);
      }      
   }
   
   /** */
   private final void unloadPlugins() {
      try {
         if (pluginMenu != null) {
            menubar.remove(pluginMenu);
            pluginMenu=null;
         }
         toolbar.removePluginActions();
      } catch (Exception ex) {
         log.writeError(1, "Error unloading plugins.");
      }
   }

   /** */
   private final void initMenu(EProperties menuProps) {
      try {
         String menuName=menuProps.getProperty("name", "Plugin");
         
         pluginMenu=new JMenu(menuName);

         Vector actions=(Vector)menuProps.get("actions");
         if (VectorUtil.empty(actions))
            return;

         int size=actions.size();
         for (int i=0; i<size; i++) {
            String actionclass=(String)actions.elementAt(i);
            try {
               Class c=Class.forName(actionclass);
               Class parms[]=new Class[2];
               parms[0]=DBSession.class;
               parms[1]=JFrame.class;

               Constructor constructor=c.getConstructor(parms);
               Object args[]=new Object[2];
               args[0]=dbSession;
               args[1]=databrowser;

               Action action=(Action)constructor.newInstance(args);
               pluginMenu.add(new JMenuItem(action));
            } catch (ClassNotFoundException ex) {
               log.writeError(2, "Unable to load plugin class. "+
                              "continuing", ex);
            } catch (ClassCastException ex) {
               log.writeError(2, "Plugin class '"+actionclass+"' not "+
                              "instanceof Action");
            }
         }
         // add to the menubar
         menubar.add(pluginMenu, (menubar.getMenuCount() - 1));         
      } catch (Exception ex) {
         log.writeError(1, "Error initializing plugin menu: ", ex);
      }
   }
   
   /** */
   private final void initToolbar(EProperties toolProps) { 
      try {
         Vector actions=(Vector)toolProps.get("actions");
         if (VectorUtil.empty(actions))
            return;

         int size=actions.size();
         for (int i=0; i<size; i++) {
            String actionclass=(String)actions.elementAt(i);
            try {
               Class c=Class.forName(actionclass);
               Class parms[]=new Class[2];
               parms[0]=DBSession.class;
               parms[1]=JFrame.class;

               Constructor constructor=c.getConstructor(parms);
               Object args[]=new Object[2];
               args[0]=dbSession;
               args[1]=databrowser;

               Action action=(Action)constructor.newInstance(args);

               toolbar.addPluginAction(action);
            } catch (ClassNotFoundException ex) {
               log.writeError(2, "Unable to load plugin class. "+
                              "continuing", ex);
            } catch (ClassCastException ex) {
               log.writeError(2, "Plugin class '"+actionclass+"' not "+
                              "instanceof Action");
            }
         }
      } catch (Exception ex) {
         log.writeError(1, "Error initializing plugin menu: ", ex);
      }
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();

      switch (code) {
         case (DATABASE_CONNECT): 
            loadPlugins();
            break;
         case (DATABASE_DISCONNECT): 
            unloadPlugins();
            break;
         default:
      }
   }
}
