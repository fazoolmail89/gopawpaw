package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.model.UPA;
import com.jet.apps.databrowser.ui.misc.IconManager;

/*
 * $Log: ExecuteUpdateAction.java,v $
 * Revision 1.3  2005/03/02 08:47:00  bemocvs
 * paste from unix, kbd shortcuts
 *
 * Revision 1.2  2004/10/08 18:08:31  bemocvs
 * 3.3.0 work
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/04/21 20:06:40  bemocvs
 * db3 work
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class ExecuteUpdateAction extends DefaultAction
{
   static Icon icon=IconManager.getInstance().getIcon("button_update");
   

   /** */
   public ExecuteUpdateAction(DBSession session) {
      super(icon, session);
      putValue(SHORT_DESCRIPTION, "Execute SQL as Update (alt-U)");
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "ExecuteUpdateAction");
      UPA.getInstance().addEvent("update");
      
      session.executeUpdate();
   }
}
