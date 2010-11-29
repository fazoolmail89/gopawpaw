package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.utils.ui.ErrorWindow;
import com.jet.apps.databrowser.model.UIModel;

/*
 * $Log: CloseAction.java,v $
 * Revision 1.2  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
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
public class CloseAction extends DefaultAction implements Logger {
   /** */
   JDialog dialog=null;
   
   /** */
   JFrame frame=null;

   /** */
   public CloseAction(JDialog d) {
      super("Close");
      putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));
      dialog=d;
   }

   public CloseAction(JFrame f) {
      super("Close");
      putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));
      frame=f;
   }
   
   public void actionPerformed(ActionEvent ae) {
      if (dialog != null)
         dialog.dispose();
      if (frame != null)
         frame.dispose();
   }
}
