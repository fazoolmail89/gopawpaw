package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.apps.databrowser.model.UIModel;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.ui.misc.*;

/*
 * $Log: QuickHelpAction.java,v $
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * Shows the log window.
 * @author Paul Bemowski
 */
public class QuickHelpAction extends DefaultAction implements Logger
{
   static Icon icon=IconManager.getInstance().getIcon("button_quickhelp");

   /** */
   public QuickHelpAction() {
      super(icon);
      putValue(SHORT_DESCRIPTION, "Show SQL QuickHelp");
   }
   
   /** */
   public QuickHelpAction(String s) {
      super(s, icon);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      QuickHTMLHelp qh=UIModel.getQuickHelpWindow();
      if (qh != null)
         qh.setVisible(true);
      else 
         log.writeDebug(1, "QuickHelp is null??");
   }
}








