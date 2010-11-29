package com.jet.utils.loader;

import java.net.*;
import java.io.*;

import java.util.*;

/*
 * $Log: URLDriverLoader.java,v $
 * Revision 1.3  2006/12/03 21:21:49  bemocvs
 * work related to Googlemonitor and DataBrowser 3.4.0
 *
 * Revision 1.2  2003/04/18 00:21:36  bemocvs
 * Fixed line terminators
 *
 * Revision 1.1.1.1  2002/12/05 00:07:59  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/10/03 01:00:45  bemocvs
 * new driver loader
 *
 */

/**
 * The URLDriverLoader is meant to turn the URLClassLoader into 
 * a singleton, and manage it's loading of classes.
 */
public class URLDriverLoader extends URLClassLoader
   implements com.jet.log.Logger
{
   private static URLDriverLoader _instance=null;

   private Vector resourceFiles=new Vector();

   private File resourceDir=null;
   
   private HashMap loadedClasses=new HashMap();

   /** */
   private URLDriverLoader() {
      super(new URL[0]);
   }

   /** */
   public static URLDriverLoader getInstance() {
      if (_instance == null) {
         synchronized (URLDriverLoader.class) {
            if (_instance == null) {
               _instance = new URLDriverLoader();
            }
         }
      }
      return _instance;
   }

   /** */
   public void addResourceFile(File f) 
      throws MalformedURLException {
      addURL(f.toURL());
      resourceFiles.add(f);
   }

   /** */
   public void addResourceDir(File d) {
      // loop over all the files in the dir, and add all .zip and .jar 
      // files.
      if (d == null)
         return;

      if (d.exists()) {
         if (d.isDirectory()) {
            resourceDir=d;

            File files[]=d.listFiles();
            for (int i=0; i<files.length; i++) {
               String name=files[i].getName();
               name=name.toLowerCase();
               
               if (name.endsWith(".jar") ||
                   name.endsWith(".zip")) {
                  try {addResourceFile(files[i]);}
                  catch (MalformedURLException ex) {
                     log.writeError(1, "Malformed url adding '"+files[i]+"'");
                  }
               }
            }
         }
         else {
            log.writeDebug(1, d.getAbsolutePath()+" is not a directory. "+
                           "It is being ignored by URLDriverLoader.");
         }
      }
      else {
         // we're gonna allow this, and simply do nothing.
      }
   }

   /** */
   public Vector getResourceFiles() {
      return resourceFiles;
   }

   /** */
   public File getResourceDir() {
      return resourceDir;
   }

   public Class findClass(String classname) 
      throws ClassNotFoundException {
      synchronized(_instance) {
         Class c=(Class)loadedClasses.get(classname);
         if (c != null)
            return c;

         c=super.findClass(classname);
         
         if (c != null) {
            loadedClasses.put(classname, c);
            return c;
         }
         else
            throw new ClassNotFoundException("Class '"+classname+
                                             "' not found");
      }
   }
}
