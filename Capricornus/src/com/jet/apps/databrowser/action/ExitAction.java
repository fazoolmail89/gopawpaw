package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.model.UIModel;
import com.jet.apps.databrowser.model.UPA;
import com.jet.utils.properties.EProperties;

/*
 * $Log: ExitAction.java,v $
 * Revision 1.2  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/02 11:06:43  bemocvs
 * 3.0.2
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * @author Paul Bemowski
 */
public class ExitAction extends DefaultAction implements WindowListener
{
   protected JFrame parent=null;

   /** */
   public ExitAction(JFrame parent) {
      super("Exit", parent);
   }

   /** */
   private void shutdown() {
      log.writeDebug(1, "Exit Action triggered shutdown");
      // close any open windows.
      UIModel.prepareShutdown();

      DBSession.shutdown();

      // FIXME: We could put this in a parallel thread with the above 
      // operations to make shutdown a bit more seamless.
      // in addition, we should construct the thread up front so we don't 
      // have the overhead later when we are exiting.
      
      EProperties properties=DBSession.getGlobalProperties();
      
      if (properties.getBoolean("enableUPA"))
         UPA.getInstance().sendUP();

      System.exit(0);
   }

   /** */
   public void windowClosing(WindowEvent e) {
      log.writeDebug("ExitAction closing window");
      Window w=e.getWindow();
      w.dispose();

      if (UIModel.getActiveWindowCount() == 0) {
         // this is the last window
         shutdown();
      }
   }


   public void actionPerformed(ActionEvent ae) {shutdown();}
   public void windowActivated(WindowEvent e) {}
   public void windowClosed(WindowEvent e) {}
   public void windowDeactivated(WindowEvent e) {}
   public void windowDeiconified(WindowEvent e) {}
   public void windowIconified(WindowEvent e) {}
   public void windowOpened(WindowEvent e) {}
}
