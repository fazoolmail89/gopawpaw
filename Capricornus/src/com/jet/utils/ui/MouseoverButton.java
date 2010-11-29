package com.jet.utils.ui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


/**
 *
 */
public class MouseoverButton extends JButton
{
   /** */
   static final BevelBorder border=new BevelBorder(BevelBorder.RAISED);

   /** */
   public MouseoverButton(String s) {
      super (s);
      init();
   }

   /** */
   public MouseoverButton(Action a) {
      super(a);
      init();
   }

   /** */
   public MouseoverButton(Icon icon) {
      super(icon);
      init();
   }

   /** */
   private void init() {
      setBorder(border);
      setBorderPainted(false);
      addMouseListener(roller);
   }

   final MouseListener roller = 
   new MouseAdapter() {
      public void mouseEntered(MouseEvent e) {
         if (isEnabled())
            ((AbstractButton)e.getSource()).setBorderPainted(true);
      }
      public void mouseExited(MouseEvent e) {
         if (isEnabled());
         ((AbstractButton)e.getSource()).setBorderPainted(false);
      }
   };
}
