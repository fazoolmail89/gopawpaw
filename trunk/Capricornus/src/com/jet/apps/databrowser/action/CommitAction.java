package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.ui.misc.*;

/*
 * $Log: CommitAction.java,v $
 * Revision 1.2  2003/08/20 18:33:03  bemocvs
 * Fixed autocommit
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class CommitAction extends DefaultAction
{
   static Icon icon=IconManager.getInstance().getIcon("commit");

   /** */
   public CommitAction(DBSession session) {
      super(icon, session);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "CommitAction");

      session.commit();
   }
}
