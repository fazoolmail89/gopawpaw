package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.utils.PBE;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.apps.databrowser.ui.PasswordDialog;

/*
 * $Log: DBLoginAction.java,v $
 * Revision 1.2  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
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
public class DBLoginAction extends DefaultAction
{
   /** */
   public DBLoginAction(DBSession session, JFrame parent) {
      super("Login...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DBLoginAction");

      EProperties props=session.getGlobalProperties();
      String epass=props.getProperty("epass");
      if (epass == null) {
         try {
            epass = session.getDefaultEncryptedPassword();
         } catch (Exception ex) {
            log.writeError(1, "Error building default epass.  This is "+
                           "unexpected.", ex);
         }
      }

      // else {
      // first check for the default password.
      try {
         PBE temppbe=session.getDefaultPBE();
         String deftestpass=temppbe.decrypt(epass);
         if (session.isDefaultEncryptedPassword(deftestpass)) {
            // they're using the default password
            // pbe=temppbe;
            session.setPBE(temppbe);
            return;
         }
      } catch (Exception ex) {
         log.writeError(1, "Error checking for defaultpassword.", ex);
      }

      String pass=PasswordDialog.getLoginPassword(parent);
      if (pass != null) {
         try {
            PBE temppbe=new PBE(pass);
            // now confirm the password.
            String dpass=temppbe.decrypt(epass);
            if (!pass.equals(dpass)) {
               // System.out.println ("Pass: "+pass);
               // System.out.println ("DPass: "+dpass);
               MessageWindow.showWarning(parent, 
                                         "You entered an incorrect "+
                                         "password.  Choose File->Login "+
                                         "to use the databrowser.");
               // pbe=null;
               session.setPBE(null);
            } else {
               // ok, that's the right password
               session.setPBE(temppbe);
            }
         } catch (Exception ex) {
            // this shouldn't happen
            MessageWindow.showWarning(parent, 
                                      "The password seems to be invalid? "+
                                      "Please send an email to "+
                                      "support@jmatrix.net");
            log.writeError(1, ex);
         }
      }
   }
}
