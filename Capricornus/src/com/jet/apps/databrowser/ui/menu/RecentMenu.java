package com.jet.apps.databrowser.ui.menu;


import java.awt.event.*;
import java.util.*;

import com.jet.utils.properties.*;
import com.jet.utils.icons.*;
// import com.jet.apps.jdbcbrowser.connector.*;

import com.jet.apps.databrowser.action.*;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.database.*;

import javax.swing.*;

import com.jet.log.*;

/*
 * $Log: RecentMenu.java,v $
 * Revision 1.3  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.2  2007/02/18 17:53:56  bemocvs
 * Disabled unavailable connectors
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/09/19 22:54:54  bemocvs
 * 3.0.8
 *
 * Revision 1.2  2002/05/04 18:54:41  bemocvs
 * new icon stuff
 *
 * Revision 1.1  2002/05/01 21:21:48  bemocvs
 * atl weekend work.
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.5  2002/03/16 19:52:52  bemocvs
 * SQL Server driver connector
 *
 * Revision 1.4  2002/03/13 22:28:12  bemocvs
 * added some comments
 *
 */

/**
 * Stores recent database connections.
 *
 * @author Paul Bemowski
 */
public class RecentMenu extends JMenu 
   implements PropertyObserver, Logger, SessionPropertyKeys, ActionListener
{
   EProperties mProps=null;

   Vector recentMenuItems=new Vector();

   /** */
   DBSession dbSession=null;
   
   public static HashMap iconsByDriver=
   DatabaseCustomization.getIconsByDriver();

   ConnectionFactory connectionFactory=ConnectionFactory.getInstance();

   /**
    *
    */
   public RecentMenu(String title, DBSession session)
   {
      super(title);
      dbSession=session;
      
      mProps=dbSession.getProperties(RECENT_CONNECTIONS);
      mProps.addObserver(this);
      
      // for changes in dlpath
      dbSession.getGlobalProperties().addObserver(this);
      

      // mActionListener=new ActionHandler();
      this.rebuild();
   }

   /**
    *
    */
   public void propertyChange(PropertyChangeEvent evt) {
      rebuild();
   }


   /**
    *
    */
   private void rebuild()
   {
      // first, remove
      if (recentMenuItems != null)
      {
         for (int i=0; i<recentMenuItems.size(); i++)
         {
            Object item = recentMenuItems.get(i);
            if (item instanceof JMenuItem){
               // JMenuItem mItem=(JMenuItem)recentMenuItems.elementAt(i);
               JMenuItem mItem=(JMenuItem)item;

               if (mItem != null) {
                  mItem.removeActionListener(this);
               }
            } 

            this.remove((JComponent)item);
         }         
      }
      
      // recentMenu.removeAll();

      // menuFile.insert(new JSeparator());
      // int offset=3;
      // now add
      EProperties recent=mProps;
      

      if (recent != null)
      {
         int numRecent=recent.getInt("numRecentConnections");

         recentMenuItems=new Vector();
         JMenuItem recentMenuItem=null;
         for (int i=0; i < numRecent; i++)
         {
            String key=""+i;
            EProperties connProps=recent.getProperties(key);
            if (connProps != null)
            {
               // System.out.println ("building connInfo from "+connProps);
               ConnectionInfo ci=new ConnectionInfo(connProps);

               Icon icon=(Icon)iconsByDriver.get(ci.getDriver());
               recentMenuItem=new JMenuItem(ci.getName(), icon);
               
               recentMenuItems.addElement(recentMenuItem);

               this.add(recentMenuItem);
               recentMenuItem.setActionCommand("recent-"+i);
               recentMenuItem.addActionListener(this);

               if (!connectionFactory.driverAvailable(ci.getDriver())) {
                  recentMenuItem.setEnabled(false);
               }
            }
         }
      }
      
      JMenuItem why=new JMenuItem(new WhyIsMyConnectorDisabled());
      recentMenuItems.addElement(why);
      JSeparator sep=new JSeparator();
      recentMenuItems.addElement(sep);
      this.add(sep);
      
      this.add(why);

      this.revalidate();
   }

   /** */
   public void actionPerformed (ActionEvent ae) {
      String action=ae.getActionCommand();
      reconnect(action);
   }


   /**
    *
    */
   private void reconnect(String action)
   {
      String key=action.substring(action.lastIndexOf("-")+1);

      ConnectionInfo ci=new ConnectionInfo(mProps.getProperties(key));

      if (ci == null) {
         log.writeError ("Error: Null props for "+action);
         return;
      }
      log.writeDebug ("Conecting to \n"+ci);
      dbSession.connect(ci);
   }
}


