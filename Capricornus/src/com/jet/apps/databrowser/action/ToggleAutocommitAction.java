package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.ui.misc.*;
import com.jet.apps.databrowser.database.*;
import com.jet.utils.ui.*;


/*
 * $Log: ToggleAutocommitAction.java,v $
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class ToggleAutocommitAction extends DefaultAction
{
   static Icon icon=IconManager.getInstance().getIcon("autocommit");

   /** */
   public ToggleAutocommitAction(DBSession session, JFrame parent) {
      super(icon, session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "ToggleAutocommitAction");

      try {
         ConnectionInfo ci=session.getConnectionInfo();
         ci.setAutocommit(!ci.getAutocommit());
      } catch (SQLException ex) {
         log.writeError(1, "Error setting autocommit", ex);
         SQLExceptionDebugger.debug(parent, ex);
      }
   }
}
