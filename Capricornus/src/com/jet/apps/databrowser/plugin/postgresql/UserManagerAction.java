package com.jet.apps.databrowser.plugin.postgresql;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.action.DefaultAction;
import com.jet.apps.databrowser.database.*;

import com.jet.log.Logger;


/*
 *
 */

/** 
 *
 */
public class UserManagerAction extends DefaultAction implements Logger
{

   /** */
   public UserManagerAction(DBSession session, JFrame parent) {
      super("UserManager...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("UserManagerAction");
   }
}
