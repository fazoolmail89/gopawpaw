package com.jet.utils.loader;


import java.io.*;
import java.util.zip.*;

import java.util.*;

import com.jet.utils.exception.*;

import java.sql.*;
// import com.jet.utils.db.*;

import com.jet.log.*;

/**
 * Helps the class loader load classes from a zip, or jar not in the 
 * class path.
 *
 * @author Paul Bemowski
 */
public class DriverLoader extends ClassLoader
{
   private static final int EOF=-1;

   private static DriverLoader _instance=null;

   private static Hashtable classes=new Hashtable();

   private static Vector zipFiles=new Vector();

   static PrintStream logwriter=null;

   static Log log=Log.getInstance();

   public static boolean debug=false;

   /**
    *
    */
   private DriverLoader()
   {
      super();
   }

   /**
    *
    */
   public static DriverLoader getInstance()
   {
      if (_instance == null)
         _instance=new DriverLoader();
      return _instance;
   }

   /**
    *
    */
   public int addResourceFile(File file)
      throws IOException 
   {
      if (!file.exists())
      {
         throw new FileNotFoundException ("File "+file.getAbsolutePath()+
                                          " does not exist.");
      }

      ZipFile zipFile=new ZipFile(file);

      int count=countClasses(zipFile);

      
      log(file.getAbsolutePath()+" contains "+count+" classes.");

      zipFiles.addElement(zipFile);

      return count;
   }
   
   /**
    *
    */
   public Vector getResourceFiles()
   {
      //don't want people messing with this pointer.
      return (Vector)zipFiles.clone();
   }


   /**
    *
    */
   private int countClasses(ZipFile file)
   {
      int count=0;
      for (Enumeration entries=file.entries(); entries.hasMoreElements(); )
      {
         ZipEntry entry=(ZipEntry)entries.nextElement();
         
         String name=entry.getName();
         // System.out.println ("name = "+name);
         if (name.endsWith(".class"))
            count++;
      }
      return count;
   }


   /**
    *
    */
   public Class findClass(String name)
      throws ClassNotFoundException
   {
      for (int i=0; i<zipFiles.size(); i++){
         ZipFile file=(ZipFile)zipFiles.elementAt(i);
         
         Class c=null;
         
         c=(Class)classes.get(name);
         if (c != null)
            return c;

         try {
            c=findInFile(name, file);

            if (c != null)
               classes.put(name, c);
         }
         catch (Exception ex) {
            ex.printStackTrace();
         }

         if (c != null)
            return c;
      }
      throw new ClassNotFoundException("DCL: "+name+" not found after "+
                                       "searching "+zipFiles.size()+" jars.");
   }


   /**
    *
    */
   private Class findInFile(String searchName, ZipFile zfile)
      throws IOException
   {
      boolean methodDebug=debug;

      //log ("Looking for "+searchName+" in "+zfile);
      for (Enumeration entries=zfile.entries(); entries.hasMoreElements();)
      {
         ZipEntry entry=(ZipEntry)entries.nextElement();
         if (methodDebug) {
            //log ("Checking entry:"+entry);
            //log ("Entry size is "+entry.getSize());
         }
         String name=entry.getName();
         if (name.endsWith(".class"))
         { // Load the class
            String className=name.substring(0, name.indexOf(".class"));
            className=className.replace('/', '.');
            //log ("Comparing "+className+" to the search "+
            //                    searchName);
            if (className.equals(searchName)) {
               // ok, load the class
               if (methodDebug)
                  log ("Loading "+className);
               byte classdata[]=null;
               ByteArrayOutputStream bos=null;
               InputStream is=zfile.getInputStream(entry);

               if (methodDebug) log ("ZipEntry: "+name);

               int classSize=(int)entry.getSize();
               classdata=new byte[classSize];

               bos=new ByteArrayOutputStream();
               byte buf[]=new byte[8192];
               int count=-1;
               count=is.read(buf);
               while (count != -1) {
                  bos.write(buf, 0, count);
                  count=is.read(buf);
               }

               classdata=bos.toByteArray();
               if (methodDebug)
                  log ("Classdata contains "+classdata.length+
                       " bytes, i'm defining it.");

               // this should come from the super class
               Class cl=defineClass(className, classdata, 0, classdata.length);
               if (methodDebug)
                  log ("Class: "+cl);
               //classes.put(name, cl);
               if (methodDebug)
                  log("class loaded.");
               return cl;
            }
         }
      }

      return null;
   }

   /** */
   public InputStream getResourceAsStream(String res) {
      InputStream is=null;
      for (int i=0; i<zipFiles.size(); i++){
         ZipFile file=(ZipFile)zipFiles.elementAt(i);
         
         try {
            ZipEntry entry=file.getEntry(res);
            if (entry != null)
               is=file.getInputStream(entry);
         }
         catch (Exception ex) {
            ex.printStackTrace();
         }

         if (is != null)
            return is;
      }
      return is;
   }

   /**
    *
    */
   /*public Class loadClass(String className, boolean resolve)
      throws ClassNotFoundException
   {
      Class cl=null;

      // First, See if the system can find the class.

      log ("Looking for loaded class: "+className);
      // load the class
      cl=super.findLoadedClass(className);
      if (cl == null) {
         // this is the guy that will find related classes
         log ("Attempting to load with sysloader: "+className);
         try {
            cl=super.findSystemClass(className);
         } catch (ClassNotFoundException ex) {
            log ("DCL: System could not find it, I'll try");
         }
      }

      // ok, the system could not load it, let's see if we can.
      if (cl == null) {
         cl=(Class)classes.get(className);
         if (cl != null)
            log ("Cache hit on "+className);
      }

      if (cl == null) {
         log ("DCL: looking for "+className);

         // Throws class not found exception, no need to worry about
         // null pointer on resolve
         cl=findClass(className);
         log ("DCL: found: "+className);
      }
      if (resolve && cl != null)
         resolveClass(cl);

      return cl;
      }*/


   static void log(String s)
   {
      //if (logwriter != null) {
      //   logwriter.println (s);
      //}
      log.writeDebug (s);
   }

   /**
    * The goal here is to load a class and get a connection right?  Ok, let's
    * test that functionality here.  This is XP at work.
    */
   public static void main(String args[])
   {
      try {
         logwriter=System.out;

         // start by giving it a jar, and letting it check load it.
         //String testJar="d:/javaroot/drivers/mysql/mysql_uncomp.jar";      
         String testJar="/mnt/bemo_desktop/d/javaroot/drivers/mysql/mysql_uncomp.jar";

         DriverLoader dl=DriverLoader.getInstance();

         dl.addResourceFile(new File(testJar));
         
         log ("\n\nLoading the driver.");

         Class c=dl.loadClass("org.gjt.mm.mysql.Driver", true);
         
         log ("Class "+c.toString()+" loaded with DCL");

         c.newInstance();
         int count=0;
         Enumeration drivers=DriverManager.getDrivers();
         while (drivers.hasMoreElements())
         {
            Driver d=(Driver)drivers.nextElement();
            count++;
            log ("Driver "+d.getClass().getName()+
                                " is available.");
         }
         log("DriverManager indicated "+count+" drivers loaded.");
         //ConnectionInfo ci=new ConnectionInfo("com.inet.tds.TdsDriver", "xx");
         //ci=ConnectionManager.getConnection(ci);
      }
      catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}




