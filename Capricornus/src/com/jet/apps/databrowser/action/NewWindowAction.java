package com.jet.apps.databrowser.action;

import java.awt.Point;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.ui.DataBrowser;

/*
 * $Log: NewWindowAction.java,v $
 * Revision 1.2  2007/02/18 17:51:27  bemocvs
 * Move new window over
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
public class NewWindowAction extends DefaultAction
{
   /** */
   public NewWindowAction(DataBrowser db) {
      super("New DataBrowser", db);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "NewWindowAction");
      DataBrowser db=new DataBrowser();

      Point p=parent.getLocation();
      db.setLocation(p.x+20, p.y+20);

      db.show();
   }
}
