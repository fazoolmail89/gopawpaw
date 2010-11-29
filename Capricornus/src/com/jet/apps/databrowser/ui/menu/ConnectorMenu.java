package com.jet.apps.databrowser.ui.menu;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.reflect.*;
import java.net.URL;


import javax.swing.*;
import com.jet.log.*;

import com.jet.utils.ui.ExceptionDebugger;
import com.jet.utils.properties.*;
import com.jet.utils.icons.*;

import com.jet.apps.databrowser.action.*;

import com.jet.apps.databrowser.connector.*;
import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.apps.databrowser.database.ConnectionFactory;
import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.model.UIModel;

/*
 * $Log: ConnectorMenu.java,v $
 * Revision 1.6  2007/02/18 17:55:18  bemocvs
 * *** empty log message ***
 *
 * Revision 1.5  2006/12/05 00:31:06  bemocvs
 * Fixed jetools.com -> jmatrix.net
 *
 * Revision 1.4  2006/12/03 21:24:01  bemocvs
 * Updates for nested jar classloader
 *
 * Revision 1.3  2006/08/14 17:28:56  barney
 * Added support for HSQLDB
 *
 * Revision 1.2  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/17 09:26:36  bemocvs
 * fixed where is my connector
 *
 * Revision 1.1  2002/05/01 21:21:48  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.8  2002/03/30 21:39:04  bemocvs
 * fixed bug in postgres connectors.
 *
 */

/**
 * Menu that manages the connection dialogs for different databases.
 */
public class ConnectorMenu extends JMenu 
   implements Logger, ActionListener, PropertyObserver
{
   private static final long serialVersionUID = 1L; //stop eclipse moanin' - rbw
	
   Vector menuItems=new Vector();
   int itemcount=0;
   private JFrame parent=null;
   
   public static boolean debug=false;

   DBSession dbSession=null;

   void init() {
      try {
         ConnectorMenuItem cmi=null;

         ImageIcon icon=IconFactory.
         findIcon("resources/icons/database_icons/odbc.gif");
         // ODBC 
         cmi=new ConnectorMenuItem(icon, "ODBC Database", 
                                   ODBCConnectFrame.getDriver(),
                                   ODBCConnectFrame.class);
         menuItems.addElement(cmi);

         icon=IconFactory.
         findIcon("resources/icons/database_icons/oracle.gif");
         // Oracle Thin
         cmi=new ConnectorMenuItem(icon, "Oracle (thin connector)",
                                   OracleThinConnectFrame.getDriver(),
                                   OracleThinConnectFrame.class);
         menuItems.addElement(cmi);
         
         icon=IconFactory.
         findIcon("resources/icons/database_icons/sybase.gif");
         // Oracle Thin
         cmi=new ConnectorMenuItem(icon, "Sybase (JConnect 5.5)",
                                   Sybase55ConnectFrame.getDriver(),
                                   Sybase55ConnectFrame.class);
         menuItems.addElement(cmi);

         icon=IconFactory.
         findIcon("resources/icons/database_icons/db2.gif");
         cmi=new ConnectorMenuItem(icon, "DB2",
                                   DB2ConnectFrame.getDriver(),
                                   DB2ConnectFrame.class);
         menuItems.addElement(cmi);
         
         icon=IconFactory.
         findIcon("resources/icons/database_icons/mysql.gif");
         cmi=new ConnectorMenuItem(icon, 
                                   "MySQL (Mark Matthews driver)",
                                   GNUMysqlConnectFrame.getDriver(),
                                   GNUMysqlConnectFrame.class);
         menuItems.addElement(cmi);
         
         icon=IconFactory.
         findIcon("resources/icons/database_icons/hsqldb.gif");
         cmi=new ConnectorMenuItem(icon, 
                                   "HSQLDB database engine",
                                   HsqldbConnectFrame.getDriver(),
                                   HsqldbConnectFrame.class);
         menuItems.addElement(cmi);
         
         icon=IconFactory.
         findIcon("resources/icons/database_icons/postgres.gif");
         cmi=new ConnectorMenuItem(icon, "PostgreSQL 6.5 -",
                                   PostgreSQL65ConnectFrame.getDriver(),
                                   PostgreSQLConnectFrame.class);
         menuItems.addElement(cmi);
         cmi=new ConnectorMenuItem(icon, "PostgreSQL 7.0 +",
                                   PostgreSQLConnectFrame.getDriver(),
                                   PostgreSQLConnectFrame.class);
         menuItems.addElement(cmi);


         icon=IconFactory.
         findIcon("resources/icons/database_icons/sqlserver.gif");
         cmi=new ConnectorMenuItem(icon, "SQL Server 2k (Microsoft Driver)",
                                   MSSqlServerConnector.getDriver(),
                                   MSSqlServerConnector.class);
         menuItems.addElement(cmi);

         icon=IconFactory.
         findIcon("resources/icons/database_icons/sqlserver.gif");
         cmi=new ConnectorMenuItem(icon, "SQL Server (i-net TDS driver)",
                                   INetTdsConnectFrame.getDriver(),
                                   INetTdsConnectFrame.class);
         menuItems.addElement(cmi);

         icon=IconFactory.
         findIcon("resources/icons/database_icons/idb.gif");
         cmi=new ConnectorMenuItem(icon, "Instant DB",
                                   IDBConnectFrame.getDriver(),
                                   IDBConnectFrame.class);
         menuItems.addElement(cmi);

         icon=IconFactory.
         findIcon("resources/icons/database_icons/jetproxy.gif");
         cmi=new ConnectorMenuItem(icon, "JETProxy (from JMatrix.net)",
                                   JETProxyConnectFrame.getDriver(),
                                   JETProxyConnectFrame.class);
         menuItems.addElement(cmi);
         // return;

         //
         cmi=new ConnectorMenuItem("GenericConnector (your driver)",
                                   GenericConnectFrame.getDriver(),
                                   GenericConnectFrame.class);
         menuItems.addElement(cmi);


         itemcount=menuItems.size();
      }
      catch (Exception ex) {
         log.writeError(ex);
      }
   }
   

   /**
    */
   public ConnectorMenu(String title, DBSession session, JFrame parent)
   {
      super(title);
      dbSession=session;
      this.parent=parent;
      init();

      for (int i=0; i<itemcount; i++)
      {
         ConnectorMenuItem cmi=(ConnectorMenuItem)menuItems.elementAt(i);
         cmi.addActionListener(this);
         add(cmi);
      }

      //log.writeDebug ("I'm here ;)");

      add(new JSeparator());
//       JMenuItem drivers=new JMenuItem("Why is my connector disabled?");
//       drivers.setActionCommand("help");
//       drivers.addActionListener(this);
//       add(drivers);

      add(new JMenuItem(new WhyIsMyConnectorDisabled()));
      
      refresh();
   }

   /**
    *
    */
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (debug) log.writeDebug ("ConnectorMenu: pchange: "+evt);
      if (evt.getKeyString().equals("DLPATH") ||
          evt.getKeyString().equals("DLDIR")) {
         refresh();
      }
   }

   /**
    *
    */
   public void refresh()
   {
      // 
      if (debug) log.writeDebug ("Connector menu refreshing.");
      for (int i=0; i<itemcount; i++)
      {
         ConnectorMenuItem cmi=(ConnectorMenuItem)menuItems.elementAt(i);
         cmi.refresh();
      }
   }

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      log.writeDebug ("Connector menu event action="+action);
//       if (action.equals("help")) {
//          UIModel.setHelpURL(CONNECTOR_HELP);
//          return;
//       }

      ConnectorMenuItem cmi=(ConnectorMenuItem)ae.getSource();
      
      // construct and load
      try {
         connectWithConnector(cmi.getConnectorClass());
      } catch (Exception ex) {
         log.writeError(1, "Error connecting...", ex);
         ExceptionDebugger.debug(parent, ex);
      }
   }

   /**
    */
   private void connectWithConnector(Class connectorclass)
      throws Exception
   {
      // instantiate with a constructor that takes a Frame.
      Class constructorargs[]=new Class[1];
      constructorargs[0]=Frame.class;

      Constructor constructor=connectorclass.getConstructor(constructorargs);
      
      Object parms[]=new Object[1];
      parms[0]=parent;

      Connector connector=(Connector)constructor.newInstance(parms);
      
      ConnectionInfo ci=connector.getConnectionInfo();
      if (ci != null)
         dbSession.connect(ci); // blocking call;
   }

   /**
    *
    */
   static class ConnectorMenuItem extends JMenuItem
   {
      String driver =null;
      Class connectorClass=null;

      public ConnectorMenuItem(Icon icon, String text, String d, 
                               Class cc) {
         super(text, icon);
         driver=d;
         connectorClass=cc;
      }

      public ConnectorMenuItem(String text, String d,
                               Class cc)
      {
         this (null, text, d, cc);
      }

      public void refresh()
      {
         if (driver.equals("NA")) {
            setEnabled(true);
            return;
         }

         if (ConnectionFactory.getInstance().driverAvailable(driver)) {
            if (debug) log.writeDebug (driver+" is available");
            setEnabled(true);
         }
         else {
            if (debug) log.writeDebug (driver+" is NOT available");
            setEnabled(false);
         }
      }

      public Class getConnectorClass() {return connectorClass;}
   }
}



