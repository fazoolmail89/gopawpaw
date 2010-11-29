package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.model.UPA;
import com.jet.apps.databrowser.ui.TableEditor;
import com.jet.utils.icons.*;
import com.jet.utils.ui.WinUtil;

/*
 * $Log: CreateTableAction.java,v $
 * Revision 1.2  2007/02/15 11:28:34  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/06/20 17:31:54  bemocvs
 * added UPA
 *
 * Revision 1.1  2002/05/22 19:28:18  bemocvs
 * added for 3.0.5
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class CreateTableAction extends DefaultAction
{
   /** */
   public CreateTableAction(DBSession session, JFrame p) {
      super("Create Table...", session, p);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "CreateTableAction");
      // all disconnect logic goes here.
      TableEditor te=TableEditor.editNewTable(session);

      te.setLocation(WinUtil.alignCenterFrame(te, parent));

      te.show();
      // UPA.getInstance().addEvent("table_editor");
   }
}
