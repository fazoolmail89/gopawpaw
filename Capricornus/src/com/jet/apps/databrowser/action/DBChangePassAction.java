package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.Migration;
import com.jet.apps.databrowser.model.DBSession;
import com.jet.utils.PBE;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.apps.databrowser.ui.PasswordDialog;

/*
 * $Log: DBChangePassAction.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class DBChangePassAction extends DefaultAction
{
   /** */
   public DBChangePassAction(DBSession session, JFrame parent) {
      super("Change Password...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DBChangePassAction");

      if (session.getPBE() == null){
         MessageWindow.showWarning(parent, 
                                   "You must be logged in before you "+
                                   "can change your password.");
         return;
      }
      String pass=PasswordDialog.changePassword(parent, session, 
                                                session.isCurrentDefault()); 
      if (pass == null) {
         // user pressed cancel
         return;
      }
      try {
         log.writeDebug("Updating passwords...");
         PBE oldpbe=session.getPBE();


         EProperties globals=session.getGlobalProperties();

         if (pass.equals("databrowserdefault")) {
            // pass=defaultEncryptionPassword;
            session.setPBE(session.getDefaultPBE());
            Migration.changePassword(globals, oldpbe, session.getPBE());
            globals.put("epass", session.getDefaultEncryptedPassword());
         } else {
            session.setPBE(new PBE(pass));
            Migration.changePassword(globals, oldpbe, session.getPBE());
            globals.put("epass", session.getPBE().encrypt(pass));
         }
         
         globals.save();
      }catch (Exception ex) {
         log.writeError(1, "Error changing passwords.", ex);
         MessageWindow.showWarning(parent, "Error changing passwords!!");
      }
   }
}
