package com.jet.apps.databrowser.database;

import java.io.File;

import java.sql.*;
import java.util.*;

import com.jet.log.Logger;
import com.jet.utils.loader.*;

import com.jet.utils.exception.NestedRuntimeException;

/**
 * Builds connections for DataBrowser.
 *
 * @author Paul Bemowski
 */
public class ConnectionFactory implements Logger
{
   public static boolean debug=true;

   private static ConnectionFactory _instance=null;
   
   NestedJarClassLoader njcl=null;

   /** */
   private ConnectionFactory() {      
      // FIXME: this only works if the user starts the vm with the
      //        java -jar databrowser...jar
      // String cp=System.getProperty("java.class.path");

      String separator=System.getProperty("path.separator");

      try {
         // njcl=new NestedJarClassLoader(cp);
         njcl=new NestedJarClassLoader();
      } catch (Exception ex) {
         log.writeError(2, "Unable to create NestedJarClassLoader", ex);
      }      
   }

   public static ConnectionFactory getInstance() {
      if (_instance == null) {
         synchronized(ConnectionFactory.class) {
            if (_instance == null) {
               _instance=new ConnectionFactory();
            }
         }
      }
      return _instance;
   }


   /**
    *
    */
   public ConnectionInfo getConnection(ConnectionInfo ci)
      throws ClassNotFoundException, SQLException
   {
      if (ci.getDriver() == null ||
          ci.getURL() == null)
      {
         // Create a new exception for this package.
         throw new 
            RuntimeException ("Insufficient ConnectionInfo to "+
                              "build conn.  driver='"+ci.getDriver()+"' and "+
                              "url='"+ci.getURL()+"'");
      }

      Connection con=null;
      String driver=ci.getDriver();
      String url=ci.getURL();
      Properties p=ci.getProperties();


      // Throws no class def found exception 
      try {
         con=loadWithSCL(driver, url, p);
      }
      catch (ClassNotFoundException ex) {// re-throw everything else
         log.writeDebug (3, "Class not found with standard CLASSLOADER, "+
                      "checking the DriverLoader.");
         try {
            con=loadWithDCL(driver, url, p);
         } catch (ClassNotFoundException exx) {
            log.writeDebug(2, "Class not found with DCL, checking NJCL");
            con=loadWithNJCL(driver, url, p);
         }
      }

      ci.setConnection(con);

      return ci;
   }

   /**
    * Loads a class, but only attempts to use the internal, nested
    * jar class loader.  This is necessary for initial connections
    * using java web start.  
    */
   private ConnectionInfo getInternalConnection(ConnectionInfo ci)
      throws ClassNotFoundException, SQLException
   {
      if (ci.getDriver() == null ||
          ci.getURL() == null)
      {
         // Create a new exception for this package.
         throw new 
            RuntimeException ("Insufficient ConnectionInfo to "+
                              "build conn.  driver='"+ci.getDriver()+"' and "+
                              "url='"+ci.getURL()+"'");
      }

      Connection con=null;
      String driver=ci.getDriver();
      String url=ci.getURL();
      Properties p=ci.getProperties();

      // Load only with the internal, nested jar class loader.  This
      // prevents permission problems if the user happens to have the
      // hsql DB jar in their classpath.
      con=loadWithNJCL(driver, url, p);

      ci.setConnection(con);

      return ci;
   }

   /**
    */
   private Connection loadWithSCL(String driver, 
                                         String url, Properties p)
      throws ClassNotFoundException, SQLException
   {
      Connection con=null;
      Class.forName(driver);
      try {
         con=DriverManager.getConnection(url, p);
      } catch (SQLException ex) {
         log.writeDebug ("Unable to get connection with DriverManager");
         log.writeDebug ("URL: "+url);
         log.writeDebug ("Propeerties: "+p);
         
         Enumeration drivers=DriverManager.getDrivers();
         for (;drivers.hasMoreElements();) {
            Driver thedriver=(Driver)drivers.nextElement();
            log.writeDebug ("Driver "+thedriver.getClass().getName()+
                         " available");
         }
         throw ex;
      }
      return con;
   }


   /** 
    * Attempts to load the driver with the URLDriverLoader class.
    */
   private Connection loadWithDCL(String driver, 
                                         String url, Properties p)
      throws ClassNotFoundException, SQLException
   {
      Connection con=null;
      // attempt to load with the DriverLoader
      URLDriverLoader dl=URLDriverLoader.getInstance();
      log.writeDebug("DCL: Attempting to load "+driver+" with DCL");
      // This will register the class with the connection manager if 
      // it is available.  Otherwise, it wll throw ClassNotFound thru
      Class c=dl.findClass(driver); 
      log.writeDebug("DCL: found class: "+c.getName());
      // ok, the driver class loader isn't calling static initializers,
      // so we need to call newInstance() to register.
      Driver drv=null;
      try {drv=(Driver)c.newInstance();}
      catch (Throwable t) {
         log.writeDebug ("Cannot instantiate driver with empty constructor ");
         log.writeDebug ("Driver class loader not a viable option for this "+
                      "driver: "+driver);
         log.printStackTrace(t);
      }

      if (drv != null &&
          drv.acceptsURL(url))
      {
         log.writeDebug("Using "+drv+" to connect to "+url);
         con=drv.connect(url, p);
         log.writeDebug("Connection = "+con);
      }
      else {
         log.writeDebug("Driver "+drv+" is null or will not accept URL "+
                        url);
      }
      return con;
   }


   /** 
    * Attempts to load the driver with the URLDriverLoader class.
    */
   private Connection loadWithNJCL(String driver, 
                                   String url, Properties p)
      throws ClassNotFoundException, SQLException
   {
      if (njcl == null) {
         throw new ClassNotFoundException("NJCL Unavailable, other loaders cannot find '"+driver+"'");
      }

      Connection con=null;
      
      log.writeDebug("NJCL: Attempting to load "+driver+" with NJCL");
      // This will register the class with the connection manager if 
      // it is available.  Otherwise, it wll throw ClassNotFound thru
      Class c=njcl.loadClass(driver); 
      log.writeDebug("NJCL: found class: "+c.getName());
      // ok, the driver class loader isn't calling static initializers,
      // so we need to call newInstance() to register.
      Driver drv=null;
      try {drv=(Driver)c.newInstance();}
      catch (Throwable t) {
         log.writeDebug ("Cannot instantiate driver with empty constructor ");
         log.writeDebug ("Driver class loader not a viable option for this "+
                         "driver: "+driver);
         log.printStackTrace(t);
      }

      if (drv != null &&
          drv.acceptsURL(url))
      {
         log.writeDebug("Using "+drv+" to connect to "+url);
         con=drv.connect(url, p);
         log.writeDebug("Connection = "+con);
      }
      else {
         log.writeDebug("Driver "+drv+" is null or will not accept URL "+
                        url);
      }
      return con;
   }

   /**
    */
   public boolean driverAvailable(String driver)
   {
      boolean available=false;
      try {
         Class.forName(driver);
         available=true;
      }
      catch (Throwable ex) {
         // log.printStackTrace(ex);

         URLDriverLoader dl=URLDriverLoader.getInstance();
         try {
            dl.findClass(driver);
            available=true;
         }
         catch (ClassNotFoundException exx) {
            try {
               if (njcl == null)
                  return false;

               njcl.loadClass(driver);
               available=true;
            } catch (ClassNotFoundException exxx) {
            } catch (Exception exxx) {
               exxx.printStackTrace();
            }
         }
         catch (Throwable exx) {exx.printStackTrace();}
      }
      return available;
   }

   /** */
   public void shutdown() {
      log.writeDebug(1, "Shutting down internal database.");

      Statement state=null;
      try {
         ConnectionInfo ci=newInternalConnection();
         Connection connection=ci.getConnection();

         state=connection.createStatement();
         int logrows=state.executeUpdate("SHUTDOWN");
      } catch (Exception ex) {
         log.writeError(1, "Error shutting down ConnectionFactory.", ex);
      } finally {
         if (state != null)
               try {state.close();} 
               catch (Exception ex) {log.writeError(1, ex);}
      }
   }

   ///////////////////////////////////////////////////////
   // Internal DB stuff - HSQL based.
   ///////////////////////////////////////////////////////
   /** */
   static String internalDriver="org.hsqldb.jdbcDriver";
   

   /**
    * WARNING: Changing the logic of this method means that
    *          deployed versions will lose existing data!!
    */
   private String getInternalDBPath() {
      String homedir=System.getProperty("user.home");
      String dbpath=homedir+"/.databrowser";
      String sqllog=dbpath+"/hsqldb/";
      File sqllogDirFile=new File(sqllog);
      sqllogDirFile.mkdirs();

      return sqllog+"databrowser";
   }
   /** 
    * Returns a new ConnectionInfo object, already connected to the
    * DataBrowser's internal database.  This is currently an HSQLDB
    * instance on the file system - but it could in the future be
    * some other type of database.
    */
   public synchronized ConnectionInfo newInternalConnection() 
      throws SQLException {
      String url="jdbc:hsqldb:file:"+getInternalDBPath();

      log.writeDebug("Initializing sqllog with "+url);

      ConnectionInfo conInfo=new ConnectionInfo(internalDriver, url, "sa", "");

      conInfo.setAdvancedProperty("com.jet.conninfo.advanced.INITIAL_TYPE", 
                                  "TABLE");

      conInfo.setName("DataBrowser-Internal");
      conInfo.doNotClose();
      
      try {
         conInfo=getInternalConnection(conInfo);
      } catch (ClassNotFoundException ex) {
         throw new NestedRuntimeException("Error driver '"+internalDriver+
                                          "' is not available, but it is "+
                                          "required for Internal functions.", 
                                          ex);
      }
      
      return conInfo;
   }
}
