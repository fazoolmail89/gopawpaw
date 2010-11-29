package com.jet.apps.databrowser.database;

import java.sql.*;
import java.util.*;

import com.jet.utils.PBE;

import com.jet.database.SchemaUtil;
import com.jet.utils.properties.EProperties;

import com.jet.log.Logger;

import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.model.*;

/*
 * $Log: ConnectionInfo.java,v $
 * Revision 1.9  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.8  2007/02/18 18:02:27  bemocvs
 * Support for Java Web Start and SQL Log
 *
 * Revision 1.7  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.6  2006/12/12 01:37:45  bemocvs
 * Added better debugging
 *
 * Revision 1.5  2006/12/07 14:53:56  bemocvs
 * DataEditor refactor
 *
 * Revision 1.4  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 * Revision 1.3  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.2  2002/12/31 07:11:18  bemocvs
 * 3.1.0, data io, etc.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/04 18:49:49  bemocvs
 * made observable
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * Encapsulates the data necessarty to open a connection to a 
 * database.  This data can be persistent.
 *
 * @author Paul Bemowski
 */
public class ConnectionInfo extends Observable implements Logger, DBEvents
{
   /** Fully qualified classpath of the driver. */
   protected String driver=null;

   /** URL used to connect to the database. */
   protected String URL=null;

   /** The common name for this connection. */
   protected String name=null;

   /** Cached read only info. */
   protected boolean readOnly=true;

   /** Cached copy of the metadata if it's available. */
   protected DatabaseMetaData metaData=null;

   /** The properties used to connect to the database, including
    * username and password.  This should never be null. */
   protected Properties mProperties=new Properties();

   /** */
   protected EProperties mAdvancedProperties=new EProperties();

   /** The connection. */
   protected Connection connection=null;

   /** */
   protected String versionString="";

   protected Throwable exception=null;

   /** */
   protected SchemaUtil schemaUtil=null;

   /** */
   protected DatabaseUtil databaseUtil=null;

   /** Disables the close() function - used for the SQLLog connection. */
   protected boolean noclose=false;

   /** */
   private static final String ORACLE_DRIVER="oracle.jdbc.driver.OracleDrvier";

   /**
    *
    * @param drv The fully qualified classpath of the JDBC Driver.
    * @param url The connection url.
    */
   public ConnectionInfo(String drv, String url) {
      this(drv, url, null, null);
   }

   /**
    *
    */
   public ConnectionInfo(String drv, String url, Properties props) {
      this(drv, url);
      if (props != null)
         mProperties=props;
   }

   /**
    *
    * @param drv The fully qualified classpath of the JDBC Driver.
    * @param url The connection url.
    * @param uid The user id.
    * @param pass The password.
    */
   public ConnectionInfo(String drv, String url, String uid, 
                         String pass)
   {
      driver=drv;
      URL=url;

      if (uid != null)
         mProperties.put("user", uid);
      if (pass != null)
         mProperties.put("password", pass);
   }

   /**
    *
    */
   public ConnectionInfo (Properties props)
   {
      if (props != null)
      {
         URL=(String)props.get("URL");
         driver=(String)props.get("Driver");
         name=(String)props.get("name");

         Properties conProps=(Properties)props.get("connectionProperties");
         if (conProps instanceof EProperties)
         {
            conProps=((EProperties)conProps).toJavaUtilProperties();
         }
         if (conProps != null)
            mProperties=conProps;
         
         EProperties advProps=(EProperties)props.get("advancedProperties");
         if (advProps != null)
            mAdvancedProperties=advProps;
      }
   }

   /**
    *
    */
   public void setName(String s) { name=s; }

   /**
    *
    */
   public String toString() {
      Iterator iter=mProperties.keySet().iterator();
      StringBuffer psb=new StringBuffer();
      while (iter.hasNext()) {
         String key=(String)iter.next();
         //         "props: "
         psb.append("       "+key+"="+mProperties.get(key));
         if (iter.hasNext())
            psb.append("\n");
      }



      String ret="ConnectionInfo ("+name+"): \n"+
      "driver = "+driver+"\n"+
      "url = "+URL+"\n"+
      "props: \n"+psb.toString();
      
      // "uid = "+mProperties.get("user")+"\n"+
      // "pass = "+mProperties.get("password");
      return ret;
   }

   /**
    *
    */
   public boolean equals(Object obj) {
      if (obj instanceof ConnectionInfo) {
         ConnectionInfo ci=(ConnectionInfo)obj;
         
         // compare drivers
         if (ci.driver != null &&
             ci.driver.equals(driver) &&
             ci.URL != null &&
             ci.URL.equals(URL))
         {
            for (Enumeration keys=mProperties.keys(); 
                 keys.hasMoreElements();)
            {
               Object key=keys.nextElement();
               if (key.equals("password") ||
                   key.equals("password.encrypted")) {
                  // ignore these
               }
               else {
                  Object thisVal=mProperties.get(key);
                  Object thatVal=ci.getProperties().get(key);
                  if (thatVal == null ||
                      !thisVal.equals(thatVal))
                     return false;
               }
            }
            return true;
         }
      }
      return false;
   }

   /** */
   public void setProperty(String key, String val) {
      mProperties.put(key, val);
   }

   /** */
   public String getProperty(String key) {
      if (mProperties != null) {
         return (String)mProperties.get(key);
      }
      return null;
   }

   /** */
   public void removeProperty(String key) {
      if (mProperties != null)
         mProperties.remove(key);
   }

   /** */
   public void setAdvancedProperty(String key, String val) {
      if (mAdvancedProperties == null)
         mAdvancedProperties=new EProperties();
      mAdvancedProperties.put(key, val);
   }

   /** */
   public String getDriver() {return driver;}

   /** */
   public String getURL() {return URL;}

   /** */
   public String getName() {return name;}

   /** */ 
   public Connection getConnection() {return connection;}

   /** */
   public String getUserName() {
      return (String)mProperties.get("user");
   }

   /** */
   public void setConnection(Connection con)  {
      connection=con;

      try {
         DatabaseMetaData dbmd=con.getMetaData();
         setMetaData(dbmd);
      }
      catch (SQLException ex) {
         log.writeError("Unable to get the connection's metadata.");
         log.printStackTrace(ex);
      }


      // Let's try/catch this JUST INCASE some idiot driver dosen't implment
      // it.  default to true;
      try {
         setReadOnly(con.isReadOnly());
      }
      catch (SQLException ex) {
         log.writeError("Unable to set read only in connection manager due "+
                        " to sql exception.");
         log.printStackTrace(ex);
         setReadOnly(true);
      }

      // build up the version string, piece by piece
      if (metaData != null) {
         try {
            String temp=metaData.getDriverName();
            versionString=versionString+temp+" ";
         }
         catch (Exception ex) {
            versionString=versionString+"Error";
         }
         
         try {
            String temp=metaData.getDriverVersion();
            versionString=versionString+temp;
         }
         catch (Exception ex) {
            versionString=versionString+"0";
         }
      }
      else {
         versionString="Unknown";
      }
   }

   /** */
   public Properties getProperties() {return mProperties;}

   /** */
   public EProperties getAdvancedProperties() {return mAdvancedProperties;}
   
   /** */
   public void setAdvancedProperties(EProperties e) {mAdvancedProperties=e;}

   /** */
   public Throwable getConnectException() {return exception;}

   /** */
   public void setConnectException(Throwable t) {exception = t;}

   /** */
   public DatabaseMetaData getMetaData() {return metaData;}

   /** */
   public void setMetaData(DatabaseMetaData dbmd) {metaData=dbmd;}

   /** */
   public void setReadOnly(boolean b) {readOnly=b;}
   
   /** */
   public boolean isReadOnly() {return readOnly;}

   /** */
   public void doNotClose() {
      noclose=true;
   }

   /** */
   public void close() throws SQLException {
      if (!noclose) {
         if (connection != null)
            connection.close();
      } else {
         log.writeDebug(1, "not closing connection "+name);
      }
   }

   /** */
   public void setAutocommit(boolean b)
      throws SQLException {
      connection.setAutoCommit(b);
      setChanged();
      notifyObservers(new DBEvent(CONNECTION_STATE));
   }

   /** */
   public boolean getAutocommit()
      throws SQLException {
      if (connection != null)
         return connection.getAutoCommit();

      return false;
   }

   /** 
    * Returns a version string suitable for display to the user.  <p>
    * Like: Oracle 8.0.5
    */
   public String getVersionString() {
      return versionString;
   }

   /**
    *
    */
   public synchronized SchemaUtil getSchemaUtil() {
      if (schemaUtil == null)
         schemaUtil=new SchemaUtil(this.connection, this.driver,
                                   mProperties.getProperty("user"));

      return schemaUtil;
   }

   /** */
   public synchronized DatabaseUtil getDatabaseUtil() {
      if (databaseUtil == null) {
         databaseUtil=new DatabaseUtil(this);
      }
      return databaseUtil;
   }


   /** Used by DBUtils - for an oracle introspection hack. */
   public boolean isOracle() {
      if (driver != null &&
          driver.equals(ORACLE_DRIVER)) {
         return true;
      }
      return false;
   }

   /** 
    * Returns an EProperties object that can be saved and re-used to 
    * re-connect to this database.
    */
   public EProperties toEProperties() {
      EProperties temp=new EProperties();
      temp.put("URL", this.getURL());
      temp.put("Driver", this.getDriver());
      
      if (name != null)
         temp.put("name", name);

      EProperties conprops=new EProperties(this.getProperties());
      String pass=conprops.getProperty("password");
      if (pass != null){
         PBE pbe=DBSession.getPBE();

         if (pbe != null) {
            conprops.put("password.encrypted", pbe.encrypt(pass));
            conprops.remove("password");
         }
      }
      temp.put("connectionProperties", conprops);
      
      EProperties advanced=this.getAdvancedProperties();
      if (advanced != null)
         temp.put("advancedProperties", this.getAdvancedProperties());
      return temp;      
   }
}






