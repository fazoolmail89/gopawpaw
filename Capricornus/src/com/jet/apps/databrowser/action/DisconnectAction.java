package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;

/*
 * $Log: DisconnectAction.java,v $
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
public class DisconnectAction extends DefaultAction
{
   /** */
   public DisconnectAction(DBSession session) {
      super("Disconnect", session);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DisconnectAction");
      // all disconnect logic goes here.
      session.disconnect();
   }
}
