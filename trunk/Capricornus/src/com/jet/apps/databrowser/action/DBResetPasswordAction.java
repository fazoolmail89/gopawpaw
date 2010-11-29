package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.utils.PBE;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;
import com.jet.apps.databrowser.ui.PasswordDialog;

/*
 * $Log: DBResetPasswordAction.java,v $
 * Revision 1.2  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class DBResetPasswordAction extends DefaultAction
{
   /** */
   public DBResetPasswordAction(DBSession session, JFrame parent) {
      super("Reset Password...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DBResetPasswordAction");

      // confirm
      if (JOptionPane.
          showConfirmDialog(parent, "Resetting your password will "+
                            "delete all recent connections.  "+
                            "Do you want to continue?") ==
          JOptionPane.YES_OPTION)
      {
         EProperties recent=session.getProperties("recent");

         if (recent != null) {
            int num=recent.getInt("numRecentConnections");
            for (int i=0; i<num; i++) {
               recent.remove(""+i);
            }
         }
         else 
            log.writeError(1, "recent does not exist in properties file!!??");

         EProperties mail=session.getProperties("outboundMail");
         if (mail != null) {
            mail.remove("password.encrypted");
            mail.remove("password");
         }
         else
            log.writeError(1, "outboundmail does not exist in properties file??@!@!");

         EProperties globals=session.getGlobalProperties();
         globals.remove("epass");
         try {
            globals.save(); 
            // sProperties.save();
            MessageWindow.showWarning(parent, 
                                      "Password reset, you should now "+
                                      "re-start the databrowser.");
         } catch (Exception ex) {
            log.writeError(1, "Error resetting password.", ex);
            // MessageWindow.showWarning(parent, "Unable to reset password.", ex);
            ExceptionDebugger.debug(parent, "Unable to reset password.", 
                                    ex);
         }
      }
   }
}
