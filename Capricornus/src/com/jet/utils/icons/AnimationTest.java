package com.jet.utils.icons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnimationTest extends JFrame implements ActionListener
{
   ActionLabel al=null;
   
   public AnimationTest()
   {
      getContentPane().setLayout(new BorderLayout());

      ImageIcon busy=IconFactory.findIcon("resources/images/"+
                                          "small_globe_anm.gif");
      
      ImageIcon java=IconFactory.findIcon("resources/images/"+
                                          "small_globe_static.gif");
      al=new ActionLabel(busy, java);

      getContentPane().add(al, "Center");
      
      JButton toggle=new JButton("toggle");
      toggle.addActionListener(this);
      getContentPane().add(toggle, "North");

      
   }
   
   public static void main (String args[])
   {
      AnimationTest at=new AnimationTest();
      at.show();
      

   }

   public void actionPerformed(ActionEvent ae)
   {
      if (al.isRunning())
         al.stop();
      else
         al.start();
   }

}
