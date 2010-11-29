package com.jet.core;


import java.io.*;
import java.util.Properties;

import com.jet.log.Logger;

/**
 * This is a system dependent class that will attempt to read the 
 * system environment variables. <p>
 *
 * Efforts will be made to allow this class to work platform independently
 * on any flavor of windows or UNIX.
 *
 * @author Paul Bemowski
 */
public class Environment implements Logger
{
   public static boolean debug = false;

   private static final Runtime runtime=Runtime.getRuntime();

   private static final String ntCommand="cmd /c set";

   private static final String win9xCommand="set";

   // try /usr/bin/env or /bin/env
   private static final String unixCommand="/bin/sh -c set";

   private static Environment instance=null;

   private static Properties sEnvironmentVars=null;

   private static boolean sWintel=false;
   private static boolean sWinNT=false;
   private static boolean sWin9x=false;
   private static boolean sOS2=false;
   private static boolean sUnix=false;
   private static boolean sMac=false;
   
   private Environment()
   {
      // nothing.  Instance required to make use of inner class.
      sEnvironmentVars=this.getEnv();
   }

   public static Environment getEnvironment()
   {
      if (instance == null)
         instance=new Environment();

      return instance;
   }

   /**
    *
    */
   public Properties getEnvironmentVars()
   {
      return sEnvironmentVars;
   }

   public boolean isWintel()
   {
      return sWintel;
   }

   /**
    *
    */
   final Properties getEnv()
   {
      String os=System.getProperty("os.name");

      os=os.toLowerCase();
      if (debug)
         System.out.println ("os='"+os+"'");
      // Guess the OS
      if (os.indexOf("windows nt") != -1 ||
          os.indexOf("windows 2000") != -1)
      {
         sWintel=true;
         sWinNT=true;
         return readWindowsNTEnvironment();
      }
      else if (os.indexOf("windows 95") != -1)
      {
         sWintel=true;
         sWin9x=true;
         return readWindows9xEnvironment();
      }
      else if (os.indexOf("solaris") != -1 || // sun
               os.indexOf("linux") != -1 || // linux
               os.indexOf("aix") != -1 || // aix
               os.indexOf("hp") != -1) // hpux
      {
         sUnix=true;
         return readUnixEnvironment();
      }
      else if (os.indexOf("mac") != -1)
      {
         sMac=true;
         return readMacEnvironment();
      }
      else if (os.indexOf("OS/2") != -1)
      {
         sOS2=true;
         return readOS2Environment();
      }
      else 
      {
         //throw new RuntimeException ("Unable to determine vm's os.");
         return null;
      }
   }


   /**
    *
    */
   public String get(String key)
   {
      if (sEnvironmentVars == null)
         return null;
      else
      {
         return (String)sEnvironmentVars.get(key);
      }
   }

   /**
    * We need a stream this will return backslashes.
    */
   private final Properties readWindowsNTEnvironment()
   {
      Properties envVars = new Properties();
      EnvironmentStream es=null;
      try 
      {
         InputStream sysIn=runtime.exec(ntCommand).getInputStream();
         es=new EnvironmentStream(sysIn);
         envVars.load(es);
      } 
      catch (Throwable t) 
      {
         t.printStackTrace();
      }
      
      if (debug)
      {
         System.out.println ("Environment to follow.");
         envVars.list(System.out);
      }
      return envVars;
   }

   /**
    *
    */
   private final Properties readWindows9xEnvironment()
   {
      Properties envVars = new Properties();
      EnvironmentStream es=null;
      try 
      {
         InputStream sysIn=runtime.exec(win9xCommand).getInputStream();
         es=new EnvironmentStream(sysIn);
         envVars.load(es);
      } 
      catch (Throwable t) 
      {
         t.printStackTrace();
      }
      
      if (debug)
      {
         System.out.println ("Environment to follow.");
         envVars.list(System.out);
      }
      return envVars;
   }


   /**
    *
    */
   private final Properties readUnixEnvironment()
   {
      Properties envVars = new Properties();
      EnvironmentStream es=null;
      try 
      {
         if (debug)
            System.out.println("Loading environment with: '"+unixCommand+"'");
         InputStream sysIn=runtime.exec(unixCommand).getInputStream();
         es=new EnvironmentStream(sysIn);
         envVars.load(es);
      } 
      catch (Throwable t) 
      {
         t.printStackTrace();
      }
      
      if (debug)
      {
         System.out.println ("Environment to follow.");
         envVars.list(System.out);
      }
      return envVars;
   }

   /**
    *
    */
   private final Properties readMacEnvironment()
   {
      throw new Error("This system does not support Mac VM's.");
   }

   /**
    *
    */
   private final Properties readOS2Environment()
   {
      return null;
   }

   /**
    *
    */
   private class EnvironmentStream extends InputStream
   {
      InputStream is=null;

      int nextChar=-1;

      public EnvironmentStream(InputStream i)
      {
         is=i;
      }

      /**
       * Returns '\\' whenever it reads '\'.
       */
      public int read() throws IOException
      {
         if (nextChar == -1)
         {
            int ch=is.read();
            if (ch == '\\')
               nextChar='\\';
            return ch;
         }
         else
         {
            int temp=nextChar;
            nextChar=-1;
            return temp;
         }
      }
   }


   /**
    *
    */
   public File getTempDir()
   {
      String temp=null;

      File tempFile=null;

      if (sWintel)
      {
         temp=(String)sEnvironmentVars.get("TEMP");
         if (temp == null)
            temp=(String)sEnvironmentVars.get("TMP");
         
         if (temp != null)
         {
            tempFile=new File(temp);
            if (tempFile.exists() &&
                tempFile.canWrite())
               return tempFile;
         }

         temp="c:/temp";
         tempFile=new File(temp);
         if (tempFile.exists() &&
             tempFile.canWrite())
            return tempFile;

         temp="c:/";
         tempFile=new File(temp);
         if (tempFile.exists() &&
             tempFile.canWrite())
            return tempFile;
         
         throw new RuntimeException ("Unable to find writeable temp dir.");
      }
      else if (sUnix)
      {
         temp=(String)sEnvironmentVars.get("TEMP");
         if (temp == null)
            temp=(String)sEnvironmentVars.get("TMP");
         
         if (temp != null)
         {
            tempFile=new File(temp);
            if (tempFile.exists() &&
                tempFile.canWrite())
               return tempFile;
         }

         temp="/tmp";
         tempFile=new File(temp);
         if (tempFile.exists() &&
             tempFile.canWrite())
            return tempFile;
         throw new RuntimeException ("Unable to find writeable temp dir.");
      }
      else
      {
         throw new RuntimeException ("This platform is not supported.");
      }
   }

   /**
    *
    */
   public void sendToSystem(String resource)
   {
      String command=null;
      if (sWinNT)
      {
         command="cmd /c start "+resource;
      }
      else if (sWin9x)
      {
         command="start "+resource;
      }
      else
      {
         log.writeDebug ("Send to System only works on Windows systems.");
         return;
      }

      try
      {
         Runtime rt=Runtime.getRuntime();
         log.writeDebug ("command = "+command);
         rt.exec(command);
      }
      catch (Exception ex)
      {
         log.printStackTrace(ex);
      }
   }
}
