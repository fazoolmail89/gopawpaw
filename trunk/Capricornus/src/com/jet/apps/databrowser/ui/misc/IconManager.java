package com.jet.apps.databrowser.ui.misc;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

import com.jet.utils.icons.*;
import com.jet.log.Logger;

/*
 * $Log: IconManager.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 *
 */
public class IconManager implements Logger
{
   private static IconManager _instance=null;

   /** */
   private Properties iconResourceMap=null;

   /** */
   private HashMap iconCache=null;

   /** */
   private IconManager() {
      // initialize cache and properties.
      InputStream is=null;
      try {
         is=IconManager.class.getResourceAsStream("icon.properties");
         iconResourceMap=new Properties();
         iconResourceMap.load(is);
      } catch (Exception ex) {
         log.writeError(1, "Error loading version properties.", ex);
      }
      
      iconCache=new HashMap();      
   }
   
   /** */
   public static final IconManager getInstance() {
      if (_instance == null) {
         synchronized (IconManager.class) {
            if (_instance == null) {
               _instance=new IconManager();
            }
         }
      }
      return _instance;
   }

   /** */
   public Icon getIcon(String key) {
      Icon icon=null;

      icon=(Icon)iconCache.get(key);
      if (icon != null)
         return icon;

      String resource=iconResourceMap.getProperty(key);
      if (resource != null) {
         icon=IconFactory.findIcon(resource);
         if (icon != null)
            iconCache.put(key, icon);

      } else {
         icon=IconFactory.findIcon("unk"); // this should return the question
      }
      return icon;
   }
}
