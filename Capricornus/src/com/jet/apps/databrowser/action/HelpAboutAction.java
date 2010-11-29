package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.utils.ui.*;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.ui.misc.SysPropsDialog;

/*
 * $Log: HelpAboutAction.java,v $
 * Revision 1.3  2006/05/25 17:41:24  barney
 * made SysPropsDialog into a singleton
 *
 * Revision 1.2  2006/05/24 17:43:43  barney
 * added SysPropsDialog
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
public class HelpAboutAction extends DefaultAction implements Logger
{
   /** */
   public HelpAboutAction(JFrame parent) {
      super("About...", parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      JDialog dialog= new JDialog(parent, "About", false);

      dialog.getContentPane().setLayout(new BorderLayout());
      Splash s=new Splash();
      dialog.getContentPane().add(s.getSplashPanel(), "Center");

      JButton sysProps=new JButton("System Properties");
      sysProps.addActionListener( new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  (SysPropsDialog.getInst()).show(); }
      });
      
      JButton close=new JButton(new CloseAction(dialog));
      
      JPanel button=new JPanel(new FlowLayout(FlowLayout.RIGHT));      
      button.add(sysProps);
      button.add(close);
      
      dialog.getContentPane().add(button, BorderLayout.SOUTH);
      dialog.pack();
      dialog.setLocation(WinUtil.alignCenter(parent));
      dialog.show();
   }
}

