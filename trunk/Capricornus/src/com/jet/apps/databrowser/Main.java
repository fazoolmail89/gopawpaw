package com.jet.apps.databrowser;

import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.model.*;


import com.jet.utils.ui.*;

import java.io.*;
import java.util.*;
import java.awt.Color;

import com.jet.core.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ArgParser;
import com.jet.log.*;
import com.jet.utils.loader.URLDriverLoader;
import com.jet.apps.databrowser.database.ConnectionInfo;

import com.jet.apps.databrowser.sqllog.*;

/*
 * $Log: Main.java,v $
 * Revision 1.14  2007/04/22 19:10:23  bemocvs
 * java web start
 *
 * Revision 1.13  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.12  2007/02/18 18:02:27  bemocvs
 * Support for Java Web Start and SQL Log
 *
 * Revision 1.11  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.10  2006/12/12 01:40:49  bemocvs
 * Added some startup debugging options.
 *
 * Revision 1.9  2006/07/25 08:44:17  barney
 * removed redundant import statement
 *
 * Revision 1.8  2006/05/24 13:51:37  barney
 * added missing commandline option.
 *
 * Revision 1.7  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.6  2004/10/07 21:11:37  bemocvs
 * Editor actions
 *
 * Revision 1.5  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.4  2002/12/31 07:11:18  bemocvs
 * 3.1.0, data io, etc.
 *
 * Revision 1.3  2002/12/20 21:07:58  bemocvs
 * adding resource, config, assembly. first checkin on 3.1.0
 *
 * Revision 1.2  2002/12/05 00:40:07  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.5  2002/08/01 11:30:01  bemocvs
 * uncommented command line connect code.
 *
 * Revision 1.4  2002/05/02 11:06:43  bemocvs
 * 3.0.2
 *
 * Revision 1.3  2002/05/01 21:19:53  bemocvs
 * atl weekend work.
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * Main class for starting the DataBrowser.
 *
 * @author Paul Bemowski
 */
public class Main 
   implements Logger, SessionPropertyKeys
{
   private static EProperties props=null;

   public static PrintStream sysout=System.out;
   public static PrintStream syserr=System.err;

   // whoa buck#$!#@$.  This is one of the few places where there are
   // links between jet and jetools... Always make sure that the
   // com.jetools.web.download.Version can parse the string below... it
   // is critical that this class can parse the string below so that 
   // a key can be generated and emailed.  
   public static String version="unknown";

   /** */
   static void loadversion() {
      InputStream is=null;
      try {
         is=Main.class.getResourceAsStream("/version.properties");
         Properties p=new Properties();
         p.load(is);
         version=p.getProperty("version");
      } catch (Exception ex) {
         log.writeError(1, "Error loading version properties.", ex);
      }
   }

   /**
    * Main sub simply initializes data as necessary, and instansiates
    * this class.  All window preparation should be handled in the 
    * constructor.
    */
   public static void main (String args[])
   {
      loadversion();
      Splash splash=null;
     
      try {
         log.writeDebug ("Starting DataBrowser "+version);

         // Deal with command line args
         ArgParser ap=new ArgParser(args);

         if (ap.getBooleanArg("-h") || ap.getBooleanArg("-?")) {
            System.out.println ("Syntax: java MainWin [options]");
            System.out.println ("Options: ");
            System.out.println ("    -debug: Start in debug mode");
            System.out.println ("    -syslog: log all output to System.out");
            System.out.println ("    -nosplash: Suppress Splash page on startup");
            System.out.println ("    -driverLog: Log driver manager data "+
                                "to System.out");
            System.out.println ("");
            System.exit(0);
         }

         // disable security...
         // this is an attempt, for java web start, to use
         // something other than my 'OpenPolicy.java' class
         // bugger me, it works... 22 apr 2007... london
         log.writeDebug(1, "Disabling 'sandbox' security manager...");
         System.setSecurityManager(null);

         DBListener.startup();

         splash=new Splash();
         if (!ap.getBooleanArg("-nosplash", false)){
            splash.show();
         }


         if (ap.getBooleanArg("-nosecurity")) {
            try {
               log.writeDebug(1, "Attempting to disable security subsystem.");
               System.setSecurityManager(null); 
               log.writeDebug(1, "Security disabled, remote connections "+
                              "available.");
            } catch (Exception ex) {
               log.writeError(1, "Unable to disable security manager.", ex);
               // ex.printStackTrace();
            }
         }

         boolean saveLog=ap.getBooleanArg("-savelog", false);
         boolean syslog=ap.getBooleanArg("-syslog", false);

         //if (ap.getBooleanArg("-jbuilder"))
         //   MainWin.jbuilder=true;

         //if (System.getProperty("javawebstart.version") != null) 
         //   MainWin.javawebstart=true;

         boolean debug=false;
         splash.setStatus("Loading CORE");
         Core core=Core.getInstance();

         File logFile=null;
         // Try to setup the log file
         try {
            splash.setStatus("Configuring Log File");
            logFile=File.createTempFile("databrowser.", ".log");

            System.out.println ("Adding "+logFile+" to the log.");
            SimpleFileDevice sfd=new SimpleFileDevice(logFile);
            
            log.setDebugLevel(6);
            
            if (syslog) {
               log.setDevice(sfd);
            }
            else {
               log.addDevice(sfd);
            }
         }
         catch (Exception ex) {
            ex.printStackTrace();
         }

         splash.setStatus("Loading Properties");
         props=core.getProperties("jdbcbrowser");
         
         if (props == null)
            throw new Error("Unable to load properties.");

         int logLevel=props.getInt("debugLevel", 4);
         log.setDebugLevel(logLevel);
         
         Migration.removeHistoryFromRecent(props);         

         DBSession.setGlobalProperties(props);

         // don't ever do this.
         if (false) java.sql.DriverManager.setLogStream(System.out);

         if (ap.getBooleanArg("-debug")) {
            debug=true;
         }
         
         if (ap.getBooleanArg("-driverLog")) {
            System.out.println ("Setting the JDBC Driver Log to System.out");
            java.sql.DriverManager.setLogStream(System.out);
         }

         if (debug) {
            log.addDevice(new SystemDevice());
         }
         
//          splash.setStatus("System Log Window");
//          ErrorWindow ew=new ErrorWindow("DB Log");
//          UIModel.setLogWindow(ew);

//          if (props.getBoolean(SHOW_CONSOLE_ON_STARTUP, false))
//             ew.show();

//          StreamDevice sd=new StreamDevice(ew.getErrorStream());

//          log.addDevice(sd);

         splash.setStatus("System Console Window");
         SystemConsoleFrame scf=new SystemConsoleFrame();
         UIModel.setLogFrame(scf);
         WriterDevice wd=new WriterDevice(scf.getLogWriter());
         log.addDevice(wd);
         if (props.getBoolean(SHOW_CONSOLE_ON_STARTUP, false))
            scf.show();

         if (!syslog) {
            log.removeSystemDevice();
         }

         // license stuff was here
         // initLicense(splash);

         splash.setStatus("Driver Loader");
         // configure the driver loader
         Vector dlPath=(Vector)props.get("DLPATH");
         if (dlPath != null &&
             dlPath.size() > 0)
         {

            URLDriverLoader dl=URLDriverLoader.getInstance();
            log.writeDebug ("Initializing the DriverLoader");
            for (int i=dlPath.size()-1; i>=0; i--) {
               String ele=(String)dlPath.elementAt(i);
               File f=new File(ele);
               if (!f.exists())
                  log.writeDebug("Unable to add "+ele+" to DriverLoader.");
               else
               {
                  try {
                     dl.addResourceFile(f);
                  } catch (Exception ex) {
                     if (debug) {
                        ex.printStackTrace();
                     }
                     else {
                        log.writeDebug ("Unable ot add "+ele+" to DriverLoader due to "+ex.toString());
                        log.writeDebug ("Run with -debug for more detail");
                     }
                  }
               }
            }
         }
         
         String dlDir=props.getProperty("DLDIR");
         // System.out.println ("dlDir="+dlDir);
         if (dlDir != null &&
             dlDir.trim().length() > 0) {
            URLDriverLoader dl=URLDriverLoader.getInstance();
            File f=new File(dlDir);
            log.writeDebug("Adding driver dir "+f.getAbsolutePath()+
                           " to the driver loader.");
            dl.addResourceDir(new File(dlDir));
         }
         
//          splash.setStatus("JEdit Editor");
//          EProperties p=props.getProperties("jedit");
//          if (p == null) {
//             p=new EProperties();
//             props.put("jedit", p);
//          }


         try {
            splash.setStatus("SQL Log");
            SQLLog.startup();
         } catch (Throwable t) {
            log.writeError(1, "Unable to startup SQLLog: ", t);
            // carry on... 
         }

         try {
            splash.setStatus("SQL Bookmarks");
            SQLBookmarks.startup();
         } catch (Throwable t) {
            log.writeError(1, "Unable to startup SQLBookmarks: ", t);
            // carry on... 
         }

         ConnectionInfo conInfo=null;
         if (ap.getStringArg("-connect.url") != null) {
            splash.setStatus("Connection");
            conInfo=getConnectionInfo(ap);
         }

         splash.setStatus("Main Window");
         // Instantiate Main Window

         DBSession session=new DBSession();
         DataBrowser databrowser=new DataBrowser(session);
         splash.dispose();
         splash=null;
         databrowser.show();

         if (conInfo != null) // autoconnect
            session.connect(conInfo);

         if (ap.getBooleanArg("-robot", false)) {
            log.writeDebug("Starting ROBOT!");
            ScreenshotRobot robot=new ScreenshotRobot(databrowser);
            robot.start();
         }

         // if we get this far w/o crashing, set the system to 
         // delete the log file on exit.  Otherwise, if it crashes
         // on startup, we don't see much.
         if (!saveLog)
            logFile.deleteOnExit();
      }
      catch (Exception e) {
         System.setErr (syserr);
         System.setOut (sysout);
         System.out.println ("Caught Exception inside main catch:"+e);
      
         e.printStackTrace(syserr);
         log.writeError(1, e);
         System.exit(1);
      }
      catch (Error e) {
         System.setErr (syserr);
         System.setOut (sysout);
         System.out.println ("Caught Error inside main catch:"+e);
      
         e.printStackTrace(syserr);
         log.writeError(1, e);
         System.exit(1);
      }
   }

   /** */
   private static final void sleep(long t) {
      try {Thread.currentThread().sleep(t*1000);}
      catch (Exception ex) {}
   }

   /** */
   private static final ConnectionInfo getConnectionInfo(ArgParser ap) {
      String url=ap.getStringArg("-connect.url");
      String driver=ap.getStringArg("-connect.driver");
      String user=ap.getStringArg("-connect.user");
      String pass=ap.getStringArg("-connect.pass");
      String name=ap.getStringArg("-connect.name");

      ConnectionInfo ci=new ConnectionInfo(driver, url, user, pass);
      if (name != null)
         ci.setName(name);
      else 
         ci.setName(url);
      return ci;
   }
}
