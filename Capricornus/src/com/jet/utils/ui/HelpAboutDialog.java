package com.jet.utils.ui;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


/**
 * This dialog will by a standard for help about, which will include 
 * as much information about the system that is running it as 
 * possible.
 * 
 * @author Paul Bemowski
 */
public class HelpAboutDialog extends JDialog
{
   private JFrame parent=null;

   /**
    *
    */
   private HelpAboutDialog (JFrame par, boolean modal, 
                            String message)
   {
      super(par, modal);
      parent=par;
      setTitle("About");

      getContentPane().setLayout(new BorderLayout());

      // Layout the panel
      JPanel centerPanel=new JPanel(new BorderLayout());
      JTextArea textArea=new JTextArea(message);
      textArea.setEditable(false);
      centerPanel.add(textArea);
      
      getContentPane().add(centerPanel, "Center");

      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));

      JButton okButton=new JButton("OK");
      okButton.setActionCommand("okButton");
      southPanel.add(okButton);

      JButton systemInfo=new JButton("System Info...");
      systemInfo.setActionCommand("systemInfo");
      southPanel.add(systemInfo);

      JButton threadInfo=new JButton("Thread Info...");
      threadInfo.setActionCommand("threadInfo");
      // southPanel.add(threadInfo); // Re-add this if I ever implement

      getContentPane().add(southPanel, "South");

      this.pack();
      setLocation(WinUtil.alignCenter(this));

      // Add the control handlers
      ActionListener al=new ActionHandler();
      okButton.addActionListener(al);
      systemInfo.addActionListener(al);
   }

   /**
    *
    */
   public static void showHelpDialog(JFrame parent, boolean modal,
                                     String message)
   {
      HelpAboutDialog had=new HelpAboutDialog(parent, modal, message);
      had.show();
   }

   /**
    *
    */
   private class ActionHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals("okButton"))
            dispose();
         else if (action.equals("systemInfo"))
            systemInfoHandler();
      }
   }

   /**
    *
    */
   private void systemInfoHandler()
   {
      System.out.println ("System info triggered.");
      SystemInfoDialog.showInfoDialog(parent);
   }
}





