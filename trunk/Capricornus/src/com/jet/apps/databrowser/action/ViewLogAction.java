package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.utils.ui.ErrorWindow;
import com.jet.apps.databrowser.model.UIModel;

/*
 * $Log: ViewLogAction.java,v $
 * Revision 1.3  2007/03/31 17:27:11  bemocvs
 * 3.5.2
 *
 * Revision 1.2  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * Shows the log window.
 * @author Paul Bemowski
 */
public class ViewLogAction extends DefaultAction implements Logger
{
   /** */
   public ViewLogAction() {
      super("System console...");
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      JFrame frame=UIModel.getLogFrame();
      if (frame != null) {
         frame.setVisible(false);
         frame.setVisible(true);
      }
      else 
         log.writeDebug(1, "Log window is null??");
   }
}
