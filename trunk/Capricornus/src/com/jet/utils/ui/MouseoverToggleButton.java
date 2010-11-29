package com.jet.utils.ui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


/**
 *
 */
public class MouseoverToggleButton extends JToggleButton
{
   /** */
   static final BevelBorder border=new BevelBorder(BevelBorder.RAISED);

   /** */
   public MouseoverToggleButton(String s) {
      super (s);
      init();
   }

   /** */
   public MouseoverToggleButton(AbstractAction a) {
      super(a);
      init();
   }

   /** */
   public MouseoverToggleButton(Icon icon) {
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
         if (isEnabled())
            ((AbstractButton)e.getSource()).setBorderPainted(false);
      }
   };
}
