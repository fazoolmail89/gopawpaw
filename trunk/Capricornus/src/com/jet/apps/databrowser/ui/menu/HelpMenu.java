package com.jet.apps.databrowser.ui.menu;

import javax.swing.*;

import com.jet.apps.databrowser.action.*;

/*
 * $Log: HelpMenu.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.2  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * This is the databrowser's help menu.
 */
public class HelpMenu extends JMenu
{
   JFrame parent=null;
   /** */
   public HelpMenu(JFrame parent) {
      super("Help");
      this.parent=parent;

      JMenuItem quickHelp=new JMenuItem(new QuickHelpAction("Quick Help..."));
      add(quickHelp);

      JMenuItem releaseNotes=new JMenuItem(new ViewReleaseNotesAction());
      add(releaseNotes);

      add(new JSeparator());
      JMenuItem about=new JMenuItem(new HelpAboutAction(parent));
      add(about);
   }
}



