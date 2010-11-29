package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.ui.misc.*;

/*
 * $Log: RollbackAction.java,v $
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/04 15:11:43  bemocvs
 * fixed icon
 *
 * Revision 1.1  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class RollbackAction extends DefaultAction
{
   static Icon icon=IconManager.getInstance().getIcon("rollback");

   /** */
   public RollbackAction(DBSession session) {
      super(icon, session);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "RollbackAction");

      session.rollback();
   }
}
