package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.ui.misc.*;
import com.jet.apps.databrowser.model.DBSession;
import com.jet.utils.icons.*;

/*
 * $Log: ClearQueryAction.java,v $
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
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
public class ClearQueryAction extends DefaultAction
{
   static Icon icon=IconManager.getInstance().getIcon("button_clear");

   /** */
   public ClearQueryAction(DBSession session) {
      super(icon, session);
      putValue(SHORT_DESCRIPTION, "Clear Editor Window");
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "ClearQueryAction");
      // all disconnect logic goes here.
      session.setEditorText("");
   }
}
