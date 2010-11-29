package com.jet.core;

import com.jet.utils.properties.*;
import com.jet.utils.filesystem.*;

import com.jet.log.*;

import java.io.*;
import java.net.InetAddress;

import java.util.*;

/**
 * This class encapsulates a "core" system that will manage all other
 * bemo classes. <p>
 *
 * The core's responsibilities include:<br>
 *  - Starting the properties system<br>
 *  - Initializing RMI registry if it's enabled<br>
 *  - Maintaining and running Cron jobs<br>
 *  - Show the toolbar.<p>
 *  - Maintain all common services.
 *
 * @author Paul Bemowski
 */
public class Core
   implements Logger
{
   private static Core core=null;

   /** In general, this should be the properies loaded from core.properties.*/
   private static EProperties sSystemProperties=null;

   // this was always a bad idea.
   // private static Environment sEnvironment=null;

   private static final String sPropsDirName=".properties";
   private static final String sCoreProperties="core.properties";
   private static File sPropertiesDir=null;

   public static String localHost="";

   public static String coreVersion="2.2";

   public static String vmVersion=null;

   private static final String sDefaultPropertiesRoot=
   "resources/properties/defaults/";

   static
   {

   }

   private Core()
   {
      // System.getProperties().list(System.out);
      log.writeDebug(SYSTEM, "Starting Core: Version "+coreVersion);

      log.writeDebug(SYSTEM, "OS Name is "+System.getProperty("os.name"));
      log.writeDebug(SYSTEM, "OS Version is "+System.getProperty("os.version"));

      vmVersion=System.getProperty("java.version");

      log.writeDebug (SYSTEM, "Java VM Version is "+vmVersion);
      log.writeDebug (SYSTEM, "Java VM Vendor is "+System.getProperty("java.vm.vendor"));
      log.writeDebug (SYSTEM, "Java class version is "+System.getProperty("java.class.version"));

      try {
         initializeProperties();
      }
      catch (Throwable t) {
         log.writeError("Unable to initialize properties.");
         log.printStackTrace(t);
      }

      try {
         // sEnvironment=Environment.getEnvironment();
      }
      catch (Throwable t)
      {
         log.writeError("Unable to load environment.");
         log.printStackTrace(t);
      }
      
      try
      {
         InetAddress local=InetAddress.getLocalHost();
         localHost=local.getHostName();
      }
      catch (Throwable t)
      {
         localHost="local.host.error";
         log.writeError("Unable to retrieve local host name.");
         log.printStackTrace(t);
      }


      log.writeDebug(SYSTEM, "Core started on "+localHost);
   }

   /**
    *
    */
   public static final Core getInstance()
   {
      if (core == null)
         core=new Core();
      return core;
   }


   /**
    *
    */
   private void initializeProperties()
      throws IOException 
   {
      sSystemProperties=new EProperties();

      File rootProperties=new File(findRoot(), sCoreProperties);

      if (!rootProperties.exists())
      {
         log.writeDebug (VERBOSE, "Attempting to load defaults");
         // Grab the defaults from resources and save to rootProperties
         String resource=sDefaultPropertiesRoot+sCoreProperties;


         InputStream is=null;
         is=this.getClass().getClassLoader().getResourceAsStream(resource);
         
         // InputStream is=ClassLoader.getSystemResourceAsStream(resource);

         //ClassLoader cl=this.getClass().getClassLoader();
         // System.out.println ("Class loader = "+cl);
         //Class cla=this.getClass();
         //InputStream is=cla.getResourceAsStream(resource);
         if (is == null) {
            throw new RuntimeException("Unable to find resource "+resource);
         }

         sSystemProperties.load(is);
         sSystemProperties.setSourceFile(rootProperties);
         sSystemProperties.save();
      }
      else { // Just load'm 
         log.writeDebug(1, "Core: Loading root properties from "+
                        rootProperties.getAbsolutePath());
         sSystemProperties.load(rootProperties);

         // Check for updates.
         EProperties defs=getDefaults(sCoreProperties);
         updateProps(sSystemProperties, defs);
      }
   }

   /**
    *
    */
   private EProperties getDefaults(String name)
      throws IOException 
   {
      EProperties eprops=null;

      String resource=sDefaultPropertiesRoot+name;
      
      // the code below assumes that the 'system' or 'primordial' classloader
      // has loaded the class.  This is a potentially invalid assumption
      // first discovered when using the Java Web Start utility.  The
      // code has been replaced with the more general case, below.
      // InputStream is=ClassLoader.getSystemResourceAsStream(resource);
      InputStream is=null;
      is=this.getClass().getClassLoader().getResourceAsStream(resource);
      
      if (is == null) {
         throw new RuntimeException("Unable to find resource "+resource);
      }
      eprops=new EProperties();
      eprops.load(is);
      return eprops;
   }


   /**
    *
    */
   public File findRoot()
   {
      File userHome=new File(System.getProperty("user.home"));
      
      if (!userHome.exists())  {
         // we got a propblem, but we'll let the system try to create it.
         log.writeDebug ("Error: User home does not exist.  Continuing.");
      }
      sPropertiesDir=new File(userHome, sPropsDirName);
      
      if (!sPropertiesDir.exists())
      {
         log.writeDebug (VERBOSE, "Building properties dir: "+
                      sPropertiesDir.getAbsolutePath());
         boolean success=sPropertiesDir.mkdirs();
         if (!success) {
            throw new RuntimeException ("Unable to create properties dir "+
                                        sPropsDirName+" in user home "+
                                        userHome.getAbsolutePath());
         }
      }

      return sPropertiesDir;
   }

   /**
    *
    */
   public EProperties getProperties(String key)
   {
      EProperties eprops=sSystemProperties.getProperties(key);
      
      if (eprops == null)
      {// try to load and save defaults.
         String file=sSystemProperties.getProperty(key);

         log.writeDebug (INTERNAL, "Properties not available in root "+ 
                      "loading defaults for "+key+" from "+file);
         if (file == null) {
            throw new RuntimeException ("Can't find a value in core for "+
                                        key);
         }
         else
         {
            if (file.startsWith("[") &&
                file.endsWith("]"))
            {
               file=file.substring(1, file.length()-1);
            }

            file=file.substring(file.lastIndexOf("/")+1, file.length());

            try
            {
               eprops=getDefaults(file);
            }
            catch (Exception ex)
            {
               log.writeError("Unable to load resource "+
                              file+" from user dir.");
               log.printStackTrace(ex);
               return null;
            }

            log.writeDebug ("System properties source file: "+
                         sSystemProperties.getSourceFile().getAbsolutePath());
            // Now save the defaults to the user's dir.
            File source=FileUtil.getPath(sSystemProperties.getSourceFile());
            source=new File(source, file);
            log.writeDebug (VERBOSE, "setting source to "+
                         source.getAbsolutePath());
            eprops.setSourceFile(source);
            try
            {
               eprops.save();
            }
            catch (Exception ex)
            {
               log.writeError("Unable to save defaults to "+
                              "user dir.");
               log.printStackTrace(ex);
            }
         }
      }
      else
      {
         // check for update properties.
         log.writeDebug ("Checking for updated properties.");

         EProperties defs=new EProperties();
         // log.writeDebug (sSystemProperties.toString());
         String file=eprops.getSourceFile().getAbsolutePath();

         log.writeDebug (INTERNAL,"Loading defaults for "+key+" from "+file+
                      " to check for updates.");
         if (file == null)
         {
            throw new RuntimeException ("Can't find a value in core for "+
                                        key);
         }
         else
         {
            if (file.startsWith("[") &&
                file.endsWith("]"))
            {
               file=file.substring(1, file.length()-1);
            }

            file=FileUtil.getName(file);

            try
            {
               defs=getDefaults(file);
            }
            catch (Exception ex)
            {
               log.writeError("Unable to load default resource "+
                              file+" from user dir.");
               log.printStackTrace(ex);
               return null;
            }
            
            // now we have the real properties from the user's dir in
            // the eprops object, and the defaults in the defs object.
            // compare and update
            updateProps(eprops, defs);
         }
      }




      return eprops;
   }
   
   /**
    * 
    */
   private static void updateProps(EProperties user, EProperties defs)
   {
      boolean isUpdated =false;
      for (int i=0; i<defs.size(); i++)
      {
         Key key=defs.getKey(i);
         Object def=defs.get(key);
         Object prop=user.get(key);
         if (prop == null) // new property
         {
            log.writeDebug ("Adding new property: "+key);
            user.put(key.toString(), def);
            isUpdated=true;
         }
         else if (def instanceof EProperties)
         {
            // Just make sure they're the same
            if (prop instanceof EProperties)
            {
               // recurse
               updateProps((EProperties)prop, (EProperties)def);
            }
         }
         else
         {
            // Just tha value changed.  No update.
         }
      }

      if (isUpdated)
      {
         try
         {
            user.save();
         }
         catch (IOException ex)
         {
            log.printStackTrace(ex);
         }
      }
   }
   

   /**
    * System properties are not saved locally for the user to edit.
    */
   public EProperties getSystemProperties(String key)
   {
      String file=key;
      EProperties props=new EProperties();
      try
      {
         //file=file.substring(file.lastIndexOf("/")+1, file.length());
         String resource=sDefaultPropertiesRoot+file;
            
         // InputStream is=ClassLoader.getSystemResourceAsStream(resource);
         InputStream is=
         this.getClass().getClassLoader().getResourceAsStream(resource);
         props.load(is);
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
      return props;
   }

   /**
    *
    */
   public EProperties getRootProperties()
   {
      return sSystemProperties;
   }

   /**
    *
    */
   public static void main(String args[])
   {
      Core core=Core.getInstance();

      //SystemToolbar.showToolbar();
   }
}





