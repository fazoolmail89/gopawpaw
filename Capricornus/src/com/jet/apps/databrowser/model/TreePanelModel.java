package com.jet.apps.databrowser.model;

import javax.swing.tree.*;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import java.sql.*;

import com.jet.apps.databrowser.connector.AdvancedConnectionProperties;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.model.tree.*;

import com.jet.utils.properties.EProperties;
import com.jet.utils.VectorUtil;
import com.jet.utils.StringUtil;

import com.jet.log.Logger;
import com.jet.database.*;

/*
 * $Log: TreePanelModel.java,v $
 * Revision 1.3  2007/02/15 11:36:09  bemocvs
 * Fixes for oracle number types.
 *
 * Revision 1.2  2004/09/30 19:11:28  bemocvs
 * Fixed oracle schema prefixing
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/04 18:50:27  bemocvs
 * fixed NPE
 *
 * Revision 1.2  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 * @author J Enterprise Technologies
 */
public class TreePanelModel extends Observable
   implements SessionPropertyKeys, Logger, AdvancedConnectionProperties, DBEvents, Observer {
   /** */
   private static final String initialMsg=
   "tables";

   /** This is the 'owning' dbsession. */
   DBSession dbSession=null; 

   /** */
   ConnectionInfo connectionInfo=null;

   /** */
   SchemaUtil schemaUtil=null;
   
   /** */
   DefaultTreeModel treeModel=null;

   /** */
   TreeNode rootNode=null;

   /** The currently selected schema. */
   String currentSchema=null;
   
   /** A list of available schemas. */
   Vector schemas=null;

   /** The currently selected catalog. */
   String currentCatalog=null;

   /** A list of available catalogs. */
   Vector catalogs=null;

   /** */
   String currentTypes[]=null;

   /** A list of available types. */
   Vector types=null;

   /** */
   String namepattern=null;

   /** */
   public TreePanelModel(DBSession session) {
      dbSession=session;
      dbSession.addObserver(this);
      rootNode=new DefaultMutableTreeNode(initialMsg);
      treeModel=new DefaultTreeModel(rootNode);
   }

   /** */
   public DBSession getDBSession() {return dbSession;}
   
   /** */
   public TreeModel getTreeModel() {return treeModel;}

   public String getCurrentSchema() {return currentSchema;}
   public void setCurrentSchema(String s) {
      log.writeDebug("TreePanelModel: Setting current schema to '"+
                     s+"' current is '"+currentSchema+"'");
      if ((s == null && currentSchema != null) ||
          (s != null && currentSchema == null) ||
          (s != null && currentSchema != null && !s.equals(currentSchema))) {
         // data has changed
         currentSchema=s;
         reload();
      }
   }

   public String getCurrentCatalog() {return currentCatalog;}
   public void setCurrentCatalog(String s) {
      log.writeDebug("TreePanelModel: Setting current catalog to '"+
                     s+"'");
      if ((s == null && currentCatalog != null) ||
          (s != null && currentCatalog == null) ||
          (s != null && currentCatalog != null && !s.equals(currentCatalog))) {
         // data has changed
         currentCatalog=s;
         reload();
      }
   }

   public String[] getCurrentTypes() {return currentTypes;}
   public void setCurrentTypes(String t[]) {
      log.writeDebug("TreePanelModel: Setting current types to '"+
                     VectorUtil.arrayToList(t)+"'");
      currentTypes=t;
      reload();
   }

   public Vector getTypes() {return types;}
   public Vector getSchemas() {return schemas;}
   public Vector getCatalogs() {return catalogs;}

   public void setNamePattern(String s) {
      if ((s == null && namepattern != null) ||
          (s != null && namepattern == null) ||
          (s != null && namepattern != null && !s.equals(namepattern))) {
         namepattern=s; 
         reload();
      }
   }
   
   /** */
   public String getNamePattern() {return namepattern;}

   /** */
   public SchemaUtil getSchemaUtil() {
      return schemaUtil;
   }

   /** */
   public DatabaseMetaData getMetaData() {
      return connectionInfo.getMetaData();
   }

   /** */
   public ConnectionInfo getConnectionInfo() {
      return connectionInfo;
   }

   /** */
   public void setConnectionInfo(ConnectionInfo ci) {
      // go to work.
      connectionInfo=ci;

      EProperties advanced=connectionInfo.getAdvancedProperties();
      if (advanced == null)
         advanced=new EProperties(); // This makes things easier

      currentSchema=advanced.getProperty(SCHEMA_KEY);
      currentCatalog=advanced.getProperty(CATALOG_KEY);
      String t=advanced.getProperty(TYPE_KEY);
      if (t != null){
         currentTypes=new String[1];
         currentTypes[0]=t;
      }
      namepattern=advanced.getProperty(NAME_PATTERN_KEY);

      boolean loadTree=advanced.getBoolean(LOAD_TREE_KEY, true);

      schemaUtil=connectionInfo.getSchemaUtil();

      reloadLists();
      if (loadTree)
         reload();
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();
      switch (code) {
         case (DATABASE_DISCONNECT):
            log.writeDebug("TreePanelModel.disconnect()");
            rootNode=new DefaultMutableTreeNode(initialMsg);
            treeModel.setRoot(rootNode);            
            types=new Vector();
            schemas=new Vector();
            catalogs=new Vector();
            namepattern=null;

            setChanged();
            notifyObservers(new DBEvent(TREE_COMBO_RELOAD));
            break;
         default: 
      }
   }
   

   /** */
   public void reload() {
      if (schemaUtil == null)
         return;
      log.writeDebug ("Reloading tree model cat='"+
                      currentCatalog+"' schema='"+
                      currentSchema+"' namePattern='"+
                      VectorUtil.arrayToVector(currentTypes)+"'");

      schemaUtil.resetTableCaches();

      setSchemaUtilState();

      //schemaUtil.setSchema(currentSchema);
      // schemaUtil.setCatalog(currentCatalog);

      log.writeDebug(schemaUtil.toString());

      DatabaseMetaData dbmd=null;
      ResultSet rs=null;
      try {
         dbSession.busy();
         // dbmd=mConnection.getMetaData();
         dbmd=connectionInfo.getMetaData();

         String schema=null; String catalog=null; String types[]=null;

         if (!"All".equals(currentSchema))
            schema=currentSchema;

         if (!"All".equals(currentCatalog)) 
            catalog=currentCatalog;
         
         if (currentTypes != null && currentTypes.length > 0 &&
             currentTypes[0] != null && !currentTypes[0].equals("All"))
            types=currentTypes;

         rs=dbmd.getTables(catalog, schema, namepattern, types);

         updateAdvanced();
      }
      catch (SQLException ex) {
         log.writeError(1, "Unable to retrieve table data", ex);
      }
      finally  {
         dbSession.done();
         // try{rs.close();}
         // catch (Exception ex) {}
      }
      log.writeDebug(1, "Setting root node");
      
      rootNode=new DatabaseNode(rs, connectionInfo, this);
      treeModel.setRoot(rootNode);
   }

   /** */
   public void updateAdvanced() {
      EProperties props=connectionInfo.getAdvancedProperties();
      
      if (currentCatalog != null)
         props.put(CATALOG_KEY, currentCatalog);
      else
         props.remove(CATALOG_KEY);
      
      if (currentSchema != null) 
         props.put(SCHEMA_KEY, currentSchema);
      else
         props.remove(SCHEMA_KEY);
      
      if (currentTypes != null &&
          currentTypes.length > 0 &&
          currentTypes[0] != null &&
          currentTypes[0].length() > 0)
         props.put(TYPE_KEY, currentTypes[0]);
      else
         props.remove(TYPE_KEY);

      if (StringUtil.empty(namepattern)) {
         props.remove(NAME_PATTERN_KEY);
      } else {
         props.put(NAME_PATTERN_KEY, namepattern);
      }
      
     connectionInfo.setAdvancedProperties(props);

     // FIXME -- REFACTOR
     // this code does not belong in connect thread, it should be in a
     // utility class somewhere.
     ConnectThread.addToList(connectionInfo);
   }
         
   /** */
   private void reloadLists() {
      log.writeDebug (3, "Attempting to load schemas, catalogs, and types");

      types=new Vector();
      schemas=new Vector();
      catalogs=new Vector();
      
      types.addElement("All");
      schemas.addElement("All");
      catalogs.addElement("All");
      
      ResultSet rs=null;
      ResultSetMetaData rsmd=null;
      DatabaseMetaData dbmd=null;

      boolean more=false;
      log.writeDebug ("Attempting to find schemas.");
      try {
         dbmd=connectionInfo.getMetaData();
         // Schemas
         rs=dbmd.getSchemas();

         more=rs.next();
         while (more) {
            //String val=(String)rs.getObject("table_schem");
            String val=(String)rs.getString("TABLE_SCHEM");
            //String val=(String)rs.getString(1);
            //System.out.println ("Adding "+val+" to schemas");
            schemas.addElement(val);
            more = rs.next();
         }
      } 
      catch (Exception ex) {
         log.writeError (1, "Unable to find build schemas", ex);
      }
      finally {
         try {
            if (rs != null)
               rs.close(); // The ODBC-SQLServer driver requires this.
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
         }
      }


      log.writeDebug ("Attempting to find catalogs.");
      try {
         // Catalogs
         rs=dbmd.getCatalogs();
         more=rs.next();
         while (more) {
            String val=(String)rs.getString(1);
            catalogs.addElement(val);
            more=rs.next();
         }
      }
      catch (Exception ex) {
         log.writeError(1, "Unable to find build catalogs", ex);
      }
      finally {
         try {
            if (rs != null)
               rs.close(); // The ODBC-SQLServer driver requires this.
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
         }
      }


      log.writeDebug ("Attempting to find types.");
      try {
         // Types
         rs=dbmd.getTableTypes();
         more=rs.next();
         
         while (more) {
            String val=(String)rs.getString(1);
            types.addElement(val);
            more=rs.next();
         }
      } 
      catch (Exception ex) {
         log.writeError(1, "Unable to find build types", ex);
      }
      finally  {
         if (rs != null) {
            try {rs.close(); // The ODBC-SQLServer driver requires this.
            }
            catch (Exception ex)  {log.printStackTrace(ex); }
         }
      }

      setSchemaUtilState();


      setChanged();
      notifyObservers(new DBEvent(TREE_COMBO_RELOAD));
   }

   /** */
   void setSchemaUtilState() {
      log.writeDebug(1, "Setting SchemaUtil State: "+
                     "schema="+currentSchema+" cat="+
                     currentCatalog+" type="+
                     VectorUtil.arrayToList(currentTypes));
      
      if ("All".equals(currentSchema))
         schemaUtil.setSchema(null);
      else
         schemaUtil.setSchema(currentSchema);

      if ("All".equals(currentCatalog))
         schemaUtil.setCatalog(null);
      else
         schemaUtil.setCatalog(currentCatalog);
      
      schemaUtil.setTypeList(currentTypes);
   }

   /** */
   public void busy() {
      dbSession.busy();
   }

   /** */
   public void done() {
      dbSession.done();
   }
}
