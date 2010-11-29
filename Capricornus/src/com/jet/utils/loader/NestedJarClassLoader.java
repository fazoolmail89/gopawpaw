package com.jet.utils.loader;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URLStreamHandler;

import java.util.*;
import java.io.*;
import java.util.zip.*;
import java.util.jar.*;

import java.security.Policy;

import com.jet.log.Logger;
import com.jet.log.BenchData;
import com.jet.utils.io.*;

import com.jet.utils.loader.nestedjar.*;

/**
 * The NestedJarClassLoader is used to load classes from a Jar file
 * contained within another jar file.
 *
 */
public class NestedJarClassLoader extends ClassLoader 
   implements Logger
{
   /** A map, containing a key-value list of all byte[] data for 
    * each file in the jar. */
   Map jarData=new HashMap();

   /** */
   JarFile jarFile=null;

   /** tracks the amount of data loaded */
   long dataSize=0;

   /** */
   NestedJarURLStreamHandler streamHandler=null;

   /** */
   public NestedJarClassLoader(String file) 
      throws IOException {
      this(new JarFile(file));
   }

   /** */
   public NestedJarClassLoader() {
      initialize();
   }

   /** */
   public NestedJarClassLoader(JarFile jf) {
      jarFile=jf;
      //System.out.println ("Parent: "+parent);

      initialize();
   }

   /** */
   void initialize() {
      streamHandler=new NestedJarURLStreamHandler(this);

      //log.writeDebug(1, "Setting security policy to OpenPolicy!!!");
      //Policy.setPolicy(new OpenPolicy());

      BenchData bd=log.startBench(2, "NJCL: init()");

      if (jarFile != null) {
         Enumeration entries=jarFile.entries();
         while (entries.hasMoreElements()) {
            ZipEntry entry=(ZipEntry)entries.nextElement();
            
            String name=entry.getName();
            // System.out.println ("entry?"+name);
            if (name.startsWith("lib") && name.endsWith(".jar")) {
               initialize(entry);
            }
         }
      } else {
         InputStream is=null;
         try {
            String driversPath="/lib/drivers.txt";
            log.writeDebug(2, "Reading drivers from "+driversPath);

            is=this.getClass().getResourceAsStream(driversPath);
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String jarfile=br.readLine();
            while (jarfile != null) {
               jarfile=jarfile.trim();
               log.writeDebug(3, "Init: "+jarfile);
               if (jarfile.length() > 0) {
                  String path="/lib/"+jarfile;
                  InputStream jarstream=this.getClass().getResourceAsStream(path);
                  if (jarstream != null)
                     initialize(path, jarstream);
                  else 
                     log.writeDebug(2, "jar stream is null for "+path);
               }
               jarfile=br.readLine();
            }
         } catch (Exception ex) {
            log.writeError(1, "Error initializing NJCL: ", ex);
         } finally {
            close(is);
         }
      }

      log.stopBench(bd);
   }
   
   /* */
   void initialize(ZipEntry entry) {
      //log.writeDebug(2, );
      log.writeDebug(2, "Initializing NestedJar: RootJar: "+
                     jarFile.getName()+" Entry: "+entry);
      try {
         initialize(jarFile.getName(), jarFile.getInputStream(entry));
      } catch (Exception ex) {
         log.writeError(1, "error initializing "+jarFile.getName(), ex);
      }
   }

   /** */
   private void initialize(String path, InputStream is) {
      BenchData bd=log.startBench(2, "Initializing NestedJar: name "+
                                  path);
      // InputStream is=null;
      try {
         JarInputStream jis=new JarInputStream(is);
         
         JarEntry fentry=jis.getNextJarEntry();
         while (fentry != null) {
            String name=fentry.getName();
            if (!fentry.isDirectory()) {
               byte data[]=read(jis);
               
               dataSize+=data.length;
               //System.out.println ("data for '"+name+"' is "+data.length+
               //                    " bytes");

               jarData.put(name, data);
            }
            fentry=jis.getNextJarEntry();
         }
      } catch (Exception ex) {
         log.writeError(1, "Error initializing jar "+path, ex);
         // ex.printStackTrace();
      } finally {
         close(is);
         log.stopBench(bd);
      }
   }
   
   public Class findClass(String name) 
      throws ClassNotFoundException {
      
      // classloader delegation will happen in the superclass's loadClass
      // method... I think???
      // System.out.println ("Finding class: "+name);

      byte[] b = findClassData(name);
      if (b != null)
         return defineClass(name, b, 0, b.length);
      else
         throw new ClassNotFoundException ("NestedJarClassLoader can't find "+name);
   }
   
   private byte[] findClassData(String name) {
      // load the class data from the connection
      
      // System.out.println ("Finding data for "+name);
      String classname=name.replace('.', '/')+".class";

      return (byte[])jarData.get(classname);
   }

   public byte[] findResourceData(String resource) {
      return (byte[])jarData.get(resource);
   }

   /** */
   protected URL findResource(String res) {
      // System.out.println ("Trying to find '"+res+"'");
      
      byte data[]=findResourceData(res);
      
      if (data != null) {
         try {
            return new URL(null, "nestedjar://fakehost/"+res, 
                           streamHandler);
         } catch (MalformedURLException ex) {
            ex.printStackTrace();
            return null;
         }
      }

      return super.findResource(res);
   }

   /** */
   byte[] read(JarInputStream is) 
      throws IOException {
      ByteArrayOutputStream baos=new ByteArrayOutputStream();
      //StreamUtil.pump(is, baos);
      int i=is.read();
      while (i != -1) {
         baos.write((char)i);
         i=is.read();
      }
      return baos.toByteArray();
   }

   /** */
   private static final void close(InputStream is) {
      if (is != null) {
         try {
            is.close();
         } catch (Exception ex) {
            log.writeError(2, "Error closing.", ex);
         }
      }
   }

   /** */
   public static void main(String args[]) 
      throws Exception {
//       String filename=args[0];

//       NestedJarClassLoader njcl=
//       new NestedJarClassLoader(new JarFile(filename));

//       Class c=njcl.loadClass("com.jet.apps.sqlminus.CommandProcessor");
//       System.out.println ("Loaded class "+c.getName());

//       URL resource=njcl.getResource("com/jet/apps/sqlminus/DBSession.class");
//       System.out.println ("resource: "+resource);
//       InputStream is=resource.openStream();


      InputStream is=NestedJarClassLoader.class.getResourceAsStream("/lib/hsqldb.jar");
      System.out.println ("is for '/lib/hsqldb.jar': "+is);

      is=NestedJarClassLoader.class.getResourceAsStream("/lib/drivers.txt");
      System.out.println ("is for '/lib/drivers.txt': "+is);
      System.out.println ("lib contains \n"+StreamUtil.readToString(is));
   }
}