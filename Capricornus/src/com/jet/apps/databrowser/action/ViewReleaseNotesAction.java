package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.apps.databrowser.model.UIModel;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.ui.misc.*;

/*
 * $Log: ViewReleaseNotesAction.java,v $
 * Revision 1.2  2004/01/24 23:46:03  bemocvs
 * 3.2.4
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/02 00:22:57  bemocvs
 * 3.0.1
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
public class ViewReleaseNotesAction extends DefaultAction implements Logger
{

   /** */
   public ViewReleaseNotesAction() {
      super("Release Notes");
   }
   
   /** */
   public void actionPerformed(ActionEvent ae) {
      QuickHTMLHelp qh=UIModel.getQuickHelpWindow();
      if (qh != null) {
         //qh.GO(this.getClass().getClassLoader().
         //      getSystemResource("com/jet/apps/databrowser/release.txt"));
         qh.GO(this.getClass().getClassLoader().
               getSystemResource("release.txt"));
         qh.setVisible(true);
      }
      else 
         log.writeDebug(1, "QuickHelp is null??");
      
   }
}








