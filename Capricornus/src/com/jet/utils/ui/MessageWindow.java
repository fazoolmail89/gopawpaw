package com.jet.utils.ui;

import javax.swing.*;
import java.awt.*;

import com.jet.utils.exception.*;
import com.jet.utils.icons.*;
import com.jet.log.*;

/*
 * $Log: MessageWindow.java,v $
 * Revision 1.4  2007/04/18 23:04:02  bemocvs
 * no message
 *
 * Revision 1.3  2006/12/18 03:22:05  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2006/12/07 14:42:26  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2001/08/14 00:27:36  bemocvs
 * working some debugging stuff.
 *
 * Revision 1.2  2001/07/31 00:52:06  bemocvs
 * nothing.
 *
 */

/**
 * A convience class for showing messages and warnings.
 *
 * @author Paul Bemowski
 */
public class MessageWindow extends JOptionPane implements Logger
{
   static Icon skull=null;

   static 
   {
      try 
      {skull=IconFactory.findIcon("resources/icons/jolly_roger1.gif");}
      catch (Exception ex) {skull=null;}
   }

   public static void main(String args[]) {
      JFrame f=new JFrame();
      f.show();
      showMessage(f, "can you close me??");
   }

   /** */
   public static void showMessage(Component parent, String message) {
      showMessage(parent, null, message);
   }

   /** */
   public static void showMessage(Component parent, String title, String message)
   {
      String options[]={"OK"};
      
      if (title == null)
         title="Message";

      // beep();
      int val=showOptionDialog(parent, message, title, 
                               YES_NO_OPTION, INFORMATION_MESSAGE, null,
                               options, "OK");
   }

   // Removing this, should use ExceptionDebugger instead

//    public static void showWarning(Component parent, String message, 
//                                   Throwable t)
//    {
//       String options[]={"OK"}; // , "More Info"};
//       beep();
//       int val=showOptionDialog(parent, message, "Message", 
//                                YES_NO_OPTION, WARNING_MESSAGE, null,
//                                options, "OK");
//       // log.writeDebug(3, "Val="+val);

//       if (val == 1 &&
//           t != null)
//       {
//          if (parent instanceof JFrame)
//             ExceptionDebugger.debug((JFrame)parent, t);
//          else {
//             while (parent != null && !(parent instanceof JFrame))
//                parent=parent.getParent();
//          }
//          if (parent != null &&
//              parent instanceof JFrame)
//          {
//             ExceptionDebugger.debug((JFrame)parent, t);
//          }
//       }
//    }

   /** */
   public static void showWarning(Component parent, String message) {
      showWarning(parent, null, message);
   }


   /** */
   public static void showWarning(Component parent, String message, Throwable t) {
      showWarning(parent, null, message);
      // fixme - not doing anything with the throwable here!!!!!
   }

   /** */
   public static void showWarning(Component parent, String title, 
                                  String message) {
      if (title == null)
         title="Warning";

      String options[]={"OK"}; // , "More Info"};
      beep();
      int val=showOptionDialog(parent, message, title, 
                               YES_NO_OPTION, WARNING_MESSAGE, null,
                               options, "OK");
   }

   /**
    *
    */
   public static boolean showDeadlyOption(Component parent, String message)
   {
      int val=showConfirmDialog(parent, message, 
                                "WARNING: Do you wish to continue?",
                                YES_NO_OPTION, WARNING_MESSAGE, skull);
      if (val == YES_OPTION)
         return true;
      else 
         return false;
   }

   /** */
   public static boolean showWarningOption(Component parent, 
                                           String message) {
      return showWarningOption(parent, null, message);
   }

   /** */
   public static boolean showWarningOption(Component parent, String title, 
                                           String message) {
      if (title == null)
         title="Warning";

      int val=showConfirmDialog(parent, message, title,
                                YES_NO_OPTION, WARNING_MESSAGE);
      if (val == YES_OPTION)
         return true;
      else 
         return false;
   }

   /**
    * Perform a platform independent beep.
    */
   static void beep()
   {
      Toolkit.getDefaultToolkit().beep();
   }
}
