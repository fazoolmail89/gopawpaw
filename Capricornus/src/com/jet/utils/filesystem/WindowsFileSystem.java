package com.jet.utils.filesystem;


import java.util.*;
import java.io.*;

/**
 *
 *
 * @author Paul Bemowski
 */
public class WindowsFileSystem extends FileSystem
{

   /**
    *
    */
   public WindowsFileSystem()
   {


   }

   /**
    *
    */
   public Vector getRoots()
   {
      Vector roots=new Vector();

      roots.addElement(new File("a:/"));
      for (char drive='c'; drive <= 'z'; drive++)
      {
         File file=new File(""+drive+":/");
         if (file.exists())
            roots.addElement(file);
      }

      return roots;
   }
}
