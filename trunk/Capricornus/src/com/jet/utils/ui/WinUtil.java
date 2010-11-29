package com.jet.utils.ui;

import java.awt.*;

import javax.swing.*;

/**
 * Windowing system utilities useful for placing multiple windows.  AWT or
 * JFC classes should be able to use these functions.
 *
 * Usage as follows, usually in the constructor of a JDialog type object:
 *
 * <pre>
 * public class MyDialog extends JDialog
 * {
 *   ...
 *   public MyDialog()
 *   {
 *     ...
 *     setLocation(WinUtil.alignCenter(this));
 *   }
 * }
 * </pre>
 *
 * @author Paul Bemowski
 */
public class WinUtil extends Object
{
   private static boolean DEBUG=false;

   /**
    * Calculats the point for setLocation(Point) that will 
    * center one window in another.
    */
   public static Point alignCenter(Component me)
   {
      Component parent=me.getParent();
      int myX, myY, parentX, parentY;

      myX=me.getSize().width;
      myY=me.getSize().height;
      if (parent != null) // if the parent is null use the screen
      {
         parentX=parent.getSize().width;
         parentY=parent.getSize().height;
      }
      else
      {
         parentX=me.getToolkit().getScreenSize().width;
         parentY=me.getToolkit().getScreenSize().height;
      }

      if (parentX==0 && parentY==0)
      {
         parentX=me.getToolkit().getScreenSize().width;
         parentY=me.getToolkit().getScreenSize().height;
      }
      if (DEBUG) System.out.println ("Parent: "+parent);
    
      if (DEBUG) System.out.println ("Me: ("+myX+", "+myY+")  Parent: ("+
                                     parentX+", "+parentY+").");
      if (parent == null && DEBUG)System.out.println ("Parent is root display");

      int x=(int)((parentX/2)-(myX/2));
      int y=(int)((parentY/2)-(myY/2));
    
      // add offset if the parent isn't in the top left.
      Point offset;
      if (parent != null)
         offset=parent.getLocation();
      else
         offset=new Point(0,0);

      x=x+offset.x;
      y=y+offset.y;

      if (DEBUG)System.out.println ("Aligning "+me+" with "+parent+" At ("+
                                    x+", "+y+").");
      return (new Point(x, y));
   }


   /**
    * Calculats the point for setLocation(Point) that will 
    * center one window in another.
    */
   public static Point alignCenterFrame(Component me, Component par)
   {
      Component parent=findParentFrame(par);
      int myX, myY, parentX, parentY;

      myX=me.getSize().width;
      myY=me.getSize().height;
      if (parent != null) // if the parent is null use the screen
      {
         parentX=parent.getSize().width;
         parentY=parent.getSize().height;
      }
      else
      {
         parentX=me.getToolkit().getScreenSize().width;
         parentY=me.getToolkit().getScreenSize().height;
      }

      if (parentX==0 && parentY==0)
      {
         parentX=me.getToolkit().getScreenSize().width;
         parentY=me.getToolkit().getScreenSize().height;
      }
      if (DEBUG) System.out.println ("Parent: "+parent);
    
      if (DEBUG) System.out.println ("Me: ("+myX+", "+myY+")  Parent: ("+
                                     parentX+", "+parentY+").");
      if (parent == null && DEBUG)System.out.println ("Parent is root display");

      int x=(int)((parentX/2)-(myX/2));
      int y=(int)((parentY/2)-(myY/2));
    
      // add offset if the parent isn't in the top left.
      Point offset;
      if (parent != null)
         offset=parent.getLocation();
      else
         offset=new Point(0,0);

      x=x+offset.x;
      y=y+offset.y;

      if (DEBUG)System.out.println ("Aligning "+me+" with "+parent+" At ("+
                                    x+", "+y+").");
      return (new Point(x, y));
   }

   /**
    * Aligns 2 components at their top right corner.
    */
   public static Point alignTopRight(Component me)
   {
      Component parent=me.getParent();
      if (parent == null) // if the parent is null return 0,0
         return new Point (0, 0);
      else
      {
         int parentX=parent.getSize().width;
         if (DEBUG) System.out.println ("Aligning "+me+" with "+parent+
                                        " At ("+parentX+", "+0+").");
         return new Point (parentX, 0);
      }
   }
  
   /**
    * Aligns 2 components at their bottom left corner.
    */
   public static Point alignBottomLeft(Component me)
   {
      Component parent=me.getParent();
      if (parent == null) // if the parent is null return 0,0
         return new Point (0, 0);
      else
      {
         int parentY=parent.getSize().height;
         if (DEBUG) System.out.println ("Aligning "+me+" with "+parent+
                                        " At ("+0+", "+parentY+").");
         return new Point (0, parentY);
      }
   }

   /**
    *
    */
   public static void setDebug(boolean d)
   {
      DEBUG=d;
   }

   /**
    *
    */
   public static void setParentIcon(Frame me)
   {
      Frame parent=findParentFrame(me.getParent());
      if (parent == null) {
         System.out.println ("No parent for "+me.getTitle());
         return;
      }
      System.out.println ("Parent is "+parent.getTitle());
      
      Image parentIcon=parent.getIconImage();
      me.setIconImage(parentIcon);
   }


   /**
    *
    */
   public static Frame findParentFrame(Component comp)
   {
      if (comp == null) return null;
      
      Component parent=comp; // comp.getParent();
      while (parent != null)
      {
         if (parent instanceof Frame)
            return (Frame)parent;
         else
            parent=parent.getParent();
      }
      return null;
   }


   /**
    *
    */
   public static JFrame findParentJFrame(JComponent comp)
   {
      if (comp == null) return null;
      
      Component parent=comp; // comp.getParent();
      while (parent != null)
      {
         if (parent instanceof JFrame)
            return (JFrame)parent;
         else
            parent=parent.getParent();
      }
      return null;
   }
}



