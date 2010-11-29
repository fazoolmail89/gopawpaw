package com.jet.utils.properties;


import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * The property loader is a utility class used to find and load
 * property files into the system properties table. <p>
 *
 * In the future, this file may also be used to save comment type information
 * and save property files, with changed values. <p>
 *
 * @author Paul Bemowski
 */
public class PropertyLoader
{
   private String mFileName=null;
   
   /**
    *
    * @param fileName The name of the properties relative to some dir in the
    * CLASSPATH.
    */
   public PropertyLoader(String fileName)
   {
      mFileName=fileName;
   }

   /**
    * The findProperties method is one of the true keys to the 
    * property loader.  This function will execute a heuristic 
    * algorithm to attempt to find the initial set of system properties.
    *
    * 
    *
    */


   
   /**
    * Loads the properties and adds them to the system properties.
    */
   public boolean load() throws IOException
   {
      InputStream is=ClassLoader.getSystemResourceAsStream(mFileName);
      if (is == null)
         return false;
      
      // Create a new properties object with the current system
      // properties included.
      Properties props=new Properties(System.getProperties());
      

      props.load(is); // Throws IOException
      is.close(); // Throws IOException

      System.setProperties(props);
      return true;
   }

   /**
    *
    */
   public void save() throws IOException
   {
      throw new RuntimeException ("Unimplemented Method.");
   }
   
}
