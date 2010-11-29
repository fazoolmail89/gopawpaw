package com.jet.apps.databrowser.ui.menu;

import java.awt.event.*;
import javax.swing.*;

import javax.swing.plaf.metal.*;

import java.util.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.model.UIModel;

/**
 * A menu (submenu of View) that lets the user set the default
 * look and feel.  Changes should be persistent across re-start, 
 * and fault tolerant (if the LAF is no longer available).
 *
 */
public class LAFMenu extends JMenu
   implements Logger
{
   //
   // + - Cross Platform ( )
   // + - Platform Dependent ( )
   // + - System
   //   + - Metal
   //     + - Ocean Theme
   //     + - Default Theme
   //   + - Windows ..
   // + - Lipstick

   List lafItems=new ArrayList();
   List themeItems=new ArrayList();

   JMenu themeMenu=null;

   /** */
   public LAFMenu(){
      super("Look and Feel");

      //System.out.println ("Constructing LAF menu");

      String crossPlatformClass=UIManager.getCrossPlatformLookAndFeelClassName();
      String systemClass=UIManager.getSystemLookAndFeelClassName();

      JRadioButtonMenuItem item=null;

      item=new JRadioButtonMenuItem(new LookAndFeelAction("Cross Platform", 
                                                          crossPlatformClass));
      lafItems.add(item);
      add(item);

      item=new JRadioButtonMenuItem(new LookAndFeelAction("System LAF",
                                                          systemClass));
      lafItems.add(item);
      add(item);

      JMenu available=new JMenu("Available LAFs");
      add(available);

      UIManager.LookAndFeelInfo info[]=UIManager.getInstalledLookAndFeels();
      for (int i=0; i<info.length; i++) {
         item=new JRadioButtonMenuItem(new LookAndFeelAction(info[i]));
         lafItems.add(item);
         available.add(item);
      }
      
      //System.out.println ("Done constructing laf menu, lafItems: "+lafItems);
      if (isJava15()) {
         themeMenu=new JMenu("Metal Themes");
         add(new JSeparator());
         add(themeMenu);

         ThemeAction ta=new ThemeAction("Ocean", "javax.swing.plaf.metal.OceanTheme");
         item=new JRadioButtonMenuItem(ta);
         themeItems.add(item);
         themeMenu.add(item);
         
         ta=new ThemeAction("Steel", "javax.swing.plaf.metal.DefaultMetalTheme");
         item=new JRadioButtonMenuItem(ta);
         themeItems.add(item);
         themeMenu.add(item);
      }
      

      updateSelected();
   }

   /** */
   private static boolean isJava15() {
      try {
         Class.forName("javax.swing.plaf.metal.OceanTheme");
         return true;
      } catch (Exception ex) {}
      return false;
   }

   /** */
   public void updateUI() {
      super.updateUI();
      updateSelected();
   }

   /** */
   public void setLAF(String name, String className, ClassLoader cl) {
      try {
         Class clazz=Class.forName(className);
         LookAndFeel laf=(LookAndFeel)clazz.newInstance();
         UIModel.setLookAndFeel(laf);
      } catch (Exception ex) {
         log.writeError(1, "Error setting look and feel.", ex);
      }
   }
   
   /** */
   public void setTheme(String name, String className) {
      try {
         LookAndFeel laf=UIManager.getLookAndFeel();
         if (laf instanceof MetalLookAndFeel) {
            Class clazz=Class.forName(className);
            MetalTheme theme=(MetalTheme)clazz.newInstance();
            
            MetalLookAndFeel metal=(MetalLookAndFeel)laf;
            metal.setCurrentTheme(theme);
         }

         UIModel.updateLookAndFeel();
      } catch (Exception ex) {
         log.writeError(1, "Error setting Metal theme", ex);
      }
   }

   /** */
   private void updateSelected() {
      LookAndFeel currentLAF=UIManager.getLookAndFeel();
      String currentClassName=currentLAF.getClass().getName();
      // System.out.println ("MenuItems: \n\n"+lafItems);

      if (lafItems != null) {
         for (int i=0; i<lafItems.size(); i++) {
            JRadioButtonMenuItem item=(JRadioButtonMenuItem)lafItems.get(i);
            
            LookAndFeelAction lafAction=(LookAndFeelAction)item.getAction();
            
            String className=lafAction.getClassName();
            
            if (className.equals(currentClassName)) {
               item.setSelected(true);
            } else {
               item.setSelected(false);
            }
         }
      }

      if (currentClassName != null && 
          currentClassName.equals(MetalLookAndFeel.class.getName()))
      {
         if (themeMenu != null) 
            themeMenu.setEnabled(true);

         if (themeItems != null) {
            for (int i=0; i<themeItems.size(); i++) {
               JRadioButtonMenuItem item=(JRadioButtonMenuItem)themeItems.get(i);
               ThemeAction action=(ThemeAction)item.getAction();
               
               String className=action.getClassName();
               MetalLookAndFeel metal=(MetalLookAndFeel)currentLAF;
               String currentThemeName=metal.getCurrentTheme().getClass().getName();
               if (className.equals(currentThemeName)) {
                  item.setSelected(true);
               } else {
                  item.setSelected(false);
               }
            }
         }
      } else {
         if (themeMenu != null) 
            themeMenu.setEnabled(false);
      }
   }

   /** */
   public class LookAndFeelAction extends AbstractAction {
      String name=null;
      String className=null;
      ClassLoader classLoader=null;
      
      /** */
      public LookAndFeelAction(String n, String cn) {
         super(n);
         name=n;
         className=cn;
      }

      /** */
      public LookAndFeelAction(UIManager.LookAndFeelInfo info) {
         super(info.getName());
         name=info.getName();
         className=info.getClassName();
      }

      public String toString() {return "LAF ("+name+"): "+className;}

      public String getClassName() {return className;}

      /** */
      public void actionPerformed(ActionEvent ae) {
         log.writeDebug(4, "Setting LAF: "+this);
         setLAF(name, className, classLoader);
      }
   }

   /** */
   public class ThemeAction extends AbstractAction {
      String name=null;
      String className=null;
      
      /** */
      public ThemeAction(String n, String cn) {
         super(n);
         name=n;
         className=cn;
      }

      public String toString() {return "Theme ("+name+"): "+className;}

      public String getClassName() {return className;}

      /** */
      public void actionPerformed(ActionEvent ae) {
         log.writeDebug(4, "Setting Theme: "+this);
         setTheme(name, className);
      }
   }
}