package com.jet.utils.ui;


import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

/**
 *
 * @author Paul Bemowski
 */
public class SystemInfoDialog extends JDialog
{
   
   /**
    *
    */
   private SystemInfoDialog(JFrame parent)
   {
      super(parent);
      setTitle("System Info");

      setSize(320, 180);
 
      setLocation(WinUtil.alignCenter(this));
      
      getContentPane().setLayout(new BorderLayout());

      JPanel centerPanel=new UtilTablePanel(System.getProperties());
      getContentPane().add(centerPanel, "Center");

      JPanel southPanel=new JPanel(new FlowLayout());

      JButton closeButton=new JButton("Close");
      closeButton.setActionCommand("closeButton");
      southPanel.add(closeButton);

      getContentPane().add(southPanel, "South");

      // pack();
      // Packed, this guy is a bit small.  Lets add 100% horizontal,
      // 60% vetrtical.


      
      // Add action handlers
      ActionListener al=new ActionHandler();
      closeButton.addActionListener(al);
   }
   
   /**
    *
    */
   public static void showInfoDialog(JFrame parent)
   {
      SystemInfoDialog sid=new SystemInfoDialog(parent);
      sid.show();
   }


   /**
    *
    */
   private class ActionHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals ("closeButton"))
            dispose();
      }
   }
}
