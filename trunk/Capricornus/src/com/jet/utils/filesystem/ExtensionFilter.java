package com.jet.utils.filesystem;

import java.io.File;
import java.util.Vector;

import javax.swing.filechooser.*;

/**
 *
 *
 * @author Paul Bemowski
 */
public class ExtensionFilter extends FileFilter
{
   private Vector extensions=new Vector();

   private static String vmVersion=null;
   static
   {
      vmVersion=System.getProperty("java.version");
   }

   /** */
   public ExtensionFilter()
   {
      // 1.2 vm does not include allfiles by default, 1.1 does.
   }

   /** */
   public boolean accept(File f)
   {
      if (f.isDirectory())
         return true;
      String fileString=f.getAbsolutePath();

      for (int i=0; i<extensions.size(); i++)
      {
         String ext=(String)extensions.elementAt(i);
         if (fileString.toLowerCase().endsWith(ext))
            return true;
      }
      return false;
   }

   public String getDescription ()
   {
      String desc="";
      for (int i=0; i<extensions.size(); i++)
      {
         desc=desc+extensions.elementAt(i);
         
         if (i != extensions.size()-1)
            desc=desc+", ";
      }
      desc=desc+" Files";
      return desc;
   }

   public void addExtension(String extension)
   {
      extensions.addElement(extension.toLowerCase());
   }
}

