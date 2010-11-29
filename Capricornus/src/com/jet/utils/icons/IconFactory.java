package com.jet.utils.icons;



import java.io.*;
import javax.swing.*;
import java.awt.Image;

import com.jet.log.Logger;

import java.util.Hashtable;

/**
 *
 * @author Paul Bemowski
 */
public class IconFactory implements Logger
{
   private static Hashtable iconCache=new Hashtable();

   private static String sDefault=
   "resources/icons/question.gif";
   
   /**
    * This function will attempt to find an icon for the given
    * icon file name.  This name should not include a path name.
    * It is the job of this function to find the icon.
    */
   public static ImageIcon findIcon(String name)
   {
      ImageIcon icon=null;

      if (name.startsWith("/"))
      {
         name=name.substring(1);
         log.writeDebug ("Icon name trimmed to "+name);
      }
      
      icon=(ImageIcon)iconCache.get(name);
      if (icon != null)
         return icon;

      InputStream is;
      //System.out.println ("System looking for: "+name);
      if (name.length() > 0) {
         // See notes in Core
         is=IconFactory.class.getClassLoader().getResourceAsStream(name);
         // is=ClassLoader.getSystemResourceAsStream(name);
      }
      else
         is=null;
      //InputStream is=IconFactory.class.getResourceAsStream("small/"+name);

      if (is == null)
      {
         log.writeError ("Icon stream is null for "+name);
         is=IconFactory.class.getClassLoader().getResourceAsStream(sDefault);
         // is=ClassLoader.getSystemResourceAsStream(sDefault);
         if (is != null)
            icon=buildIcon(is);
         else
            icon=null;
      }
      else
         icon=buildIcon(is);

      if (icon != null)
         iconCache.put(name, icon);
      return icon;
   }

   public static ImageIcon findIcon(String name, int h, int w)
   {
      ImageIcon icon=(ImageIcon)findIcon(name);

      if (icon == null)
         return icon;
      else
      { // Scale it.
         icon.setImage(icon.getImage().getScaledInstance(h, w,
                                                         Image.SCALE_DEFAULT));
         return icon;
      }
   }
   
   /**
    *
    */
   public static Icon getIcon(String name)
   {
      return null;
   }

   private static ImageIcon buildIcon(InputStream resource)
   {
      byte[] buffer = null;
      try
      {
         /* Copy resource into a byte array.  This is
          * necessary because several browsers consider
          * Class.getResource a security risk because it
          * can be used to load additional classes.
          * Class.getResourceAsStream just returns raw
          * bytes, which we can convert to an image.
          */
         //InputStream resource = getClass().getResourceAsStream(gifFile);
         if (resource == null)
         {
            log.writeError("Stream is null.");

            return null; 
         }
         BufferedInputStream in = new BufferedInputStream(resource);
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
            log.writeDebug("Warning: Icon file is zero-length");
            return null;
         }
      }
      catch (IOException ioe)
      {
         log.printStackTrace(ioe);
         return null;
      }                               
      return new ImageIcon(buffer);
   }
}
