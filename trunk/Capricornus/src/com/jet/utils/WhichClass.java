package com.jet.utils;


import java.net.*;
import java.util.*;
import java.util.zip.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.*;

/**
 * This class uses the default ClassLoader to find a class that is 
 * somewhere in the CLASSPATH.  Be careful!  Some stuff in here may be
 * VM dependent. <p>
 *
 * This class ONLY finds classes loaded by the System default ClassLoader.
 *
 * @author Paul Bemowski
 */
public class WhichClass
{
   /**
    *
    */
   public static void main(String args[])
   {
      ArgParser ap=new ArgParser(args);
      if (args.length == 0)
      {
         System.out.println ("Usage: java com.ztel.zutils.WhichClass classname");
         System.out.println ("The class name must be fully qualified");
         return;
      }
      String classname=args[args.length - 1];

      String classLoc=findClass(classname);
      System.out.println ("Class: "+classname+" loaded from "+classLoc);

      if (ap.getBooleanArg("-v") ||
          ap.getBooleanArg("-verify"))
      {
         // Verify the class.  
         String verify=verifyClass(classname, classLoc);
         System.out.println ("Verify: "+verify);
      }
   }

   /**
    *
    */
   public static String verifyClass(String className, String fileLocation)
   {
      System.out.println ("\nVerifying "+className);
      String origClassName=className;

      int classSize=0;
      String validClass="Error";
      String classVerification="Error";

      className="/"+className;
      className=className.replace('.', '/');
      className=className+".class";

      // Step 1. Print the size (in bytes) of the class
      // Step 2. Form an actual class object
      try
      {
         URL location=Class.class.getResource(className);
         System.out.println ("URL: "+location);


         // InputStream is=Class.class.getClassLoader().getResourceAsStream(className);
         InputStream is=null;
         if (fileLocation.toLowerCase().trim().endsWith(".zip")||
             fileLocation.toLowerCase().trim().endsWith(".jar"))
         {
            is=getZipClassFileAsStream(fileLocation, className);
         }
         else 
         {
            is=getClassFileAsStream(fileLocation, className);
         }

         byte data[]=readResourceAsBytes(is);
         
         classSize=data.length;

         try
         {
            //Class aClass=
            //Class.class.getClassLoader().defineClass(origClassName, data,
            //                                         0, data.length);

            WhichClassLoader loader=new WhichClassLoader(origClassName,
                                                         data);
            loader.loadClass(origClassName, false);
            // If we got here, it's a valid class
            validClass="is a valid class file.";
         }
         catch (Throwable t)
         {
            // t.printStackTrace();
            // System.out.println ("Unable to load class: "+t.toString()); // getMessage());
            validClass="is not a valid class file ("+t.toString()+")";
         }
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
         classVerification="Unable to verify class: "+ex.getMessage();
         return classVerification;
      }
      classVerification=" Class Size is "+classSize+" and it "+validClass;
      
      return classVerification;
   }

   /**
    *
    */
   public static String findClass(String className)
   {
      System.out.println ("Looking in classpath for: "+className);

      className="/"+className;
      className=className.replace('.', '/');
      className=className+".class";

      //System.out.println ("system name="+classname);

      // Only works for files that are not is zipped or jared.
      //URL location=ClassLoader.getSystemResource(classname);

      // We're going to get a reference to the real classloader
      // by asking ths Class class to find the class in question.  
      URL location=Class.class.getResource(className);

      //System.out.println ("loc="+location);
      
      if (location == null)
      {
         // if it's null, the classloader can't find this file
         // in the classpath.
         return "File not in CLASSPATH";
      }
      
      //System.out.println ("location is: "+location);
      String locString=location.toString();
      
      String fileNo=null;
      if (locString.indexOf("FILE") >= 0)
      { // Loaded from a class file
         fileNo=locString.substring((locString.indexOf("FILE")+4), 
                                    locString.indexOf("/+/"));
      }
      else if (locString.indexOf("ZIP") >=0)
      { // Loaded from a .jar or .zip
         fileNo=locString.substring((locString.indexOf("ZIP")+3), 
                                    locString.indexOf("/+/"));
      }
      else 
      {
         return "Don't understand the syntax of your classpath. "+
         "Contact Paul Bemo\n"+
         "URL: "+location;
      }
      
      //System.out.println ("fileno="+fileNo);

      int fno=-1;
      try
      {
         fno=Integer.parseInt(fileNo);
      }
      catch (NumberFormatException ex)
      {
         return "Error parsing file number.";
      }

      // Get the classpath in use
      String classpath=System.getProperty("java.class.path");

      StringTokenizer st=new StringTokenizer(classpath, 
                                             File.pathSeparator, false);

      String filepath=null;
      int filecount=0;
      while (st.hasMoreTokens() &&
             filecount <= fno)
      {
         filepath=st.nextToken();  filecount++;
      }

      return filepath;
   }



   private static WhichClassWin wcw=null;
   
   private JTextField classField=null;

   public static void startWindowListener()
   {
      if (wcw == null)
      {
         WhichClass wc=new WhichClass();

         wcw=wc. new WhichClassWin();
         
         SystemInListener sil=wc. new SystemInListener();
      }
   }

   /**
    *
    */
   public class WhichClassWin extends JFrame implements ActionListener
   {
      public WhichClassWin()
      {
         super();
         this.getContentPane().setLayout(new FlowLayout());
         
         classField=new JTextField(30);
         
         this.getContentPane().add(new JLabel("Class:"));
         this.getContentPane().add(classField);
         
         this.pack();
         
         classField.addActionListener(this);
      }
      
      
      public void actionPerformed(ActionEvent ae)
      {
         String className=classField.getText().trim();
         
         String classLoc=WhichClass.findClass(className);
         System.out.println ("Class "+className+" loaded from "+classLoc);

         wcw.setVisible(false);
      }
   }

   /**
    *
    */
   class SystemInListener extends Thread
   {
      BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));

      public SystemInListener()
      {
         this.setName("System.in_Listener_Thread");
         start();
      }

      public void run()
      {
         while (true)
         {
            String line=null;
            try
            {
               line=bis.readLine();
            }
            catch (IOException ex)
            {}
            //System.out.println ("line is "+line);
            if (line.equals("which"))
            {
               wcw.show();
            }
            else if (line.equals("gc"))
            {
               System.out.print("Calling garbage collector....");
               System.gc();
               System.out.println ("done.");
            }
         }
      }
   } // SystemInListner


   /**
    *
    */
   private static byte[] readResourceAsBytes(InputStream is)
      throws IOException 
   {
      byte[] buffer = null;
      /* Copy resource into a byte array.  This is
       * necessary because several browsers consider
       * Class.getResource a security risk because it
       * can be used to load additional classes.
       * Class.getResourceAsStream just returns raw
       * bytes, which we can convert to an image.
       */
      //InputStream resource = getClass().getResourceAsStream(gifFile);
      if (is == null)
      {
         System.out.println("Stream is null.");
         
         return null; 
      }
      BufferedInputStream in = new BufferedInputStream(is);
      ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
      buffer = new byte[1024];
      int n;
      while ((n = in.read(buffer)) > 0)
      {
         out.write(buffer, 0, n);
      }
      in.close();
      out.flush();
      
      buffer = out.toByteArray();
      if (buffer.length == 0)
      {
         System.out.println("Warning: Icon file is zero-length");
         return null;
      }
      return buffer;
   }
   
   /**
    *
    */
   private static InputStream getClassFileAsStream(String root, String file)
      throws IOException 
   {
      File f=new File(root, file);
      FileInputStream fis=new FileInputStream(f);
      return fis;
   }

   /**
    *
    */
   private static InputStream getZipClassFileAsStream(String zipFile, 
                                                      String file)
      throws IOException 
   {
      String relativeFile=null;

      if (file.startsWith("/"))
         relativeFile=file.substring(1);

      ZipFile zf=new ZipFile(zipFile);
      ZipEntry ze=zf.getEntry(relativeFile);
      // System.out.println ("ZipEntry for "+relativeFile+" is "+ze);
      InputStream is=zf.getInputStream(ze);
      return is;
   }

   /**
    *
    */
   static class WhichClassLoader extends ClassLoader
   {
      String targetClassName=null;
      byte bytes[]=null;
      /** */
      public WhichClassLoader(String className, byte b[])
      {
         super();

         targetClassName=className;
         bytes=b;
      }

      /** */
      public synchronized Class loadClass(String name,
                                          boolean resolve) 
      {
         Class c=null;

         if (!name.equals(targetClassName))
         {
            System.out.println ("WhichClassLoader: Loading Related:"+name);
            c=findLoadedClass(name);

            if (c == null)
            {
               try
               {
                  c=findSystemClass(name);
               }
               catch (Throwable t)
               {
                  System.out.println ("WhichClassLoader: Error loading "+
                                      "system class.");
                  throw new Error(t.toString());
               }
            }
         }
         else
         {
            System.out.println ("WhichClassLoader: Loading Target: "+name);
            try
            {
               c=defineClass(name, bytes, 0, bytes.length);
            }
            catch (ClassFormatError cfe)
            {
               System.out.println ("WhichClassLoader: Error: "+cfe.toString());
               throw cfe;
            }
            catch (Throwable t)
            {
               System.out.println ("WhichClassLoader: Error: "+t.toString());
               // t.printStackTrace();
               throw new Error(t.toString());
            }
         }
         
         if (resolve) resolveClass(c);

         return c;
      }
   }
} // end WhichClass












