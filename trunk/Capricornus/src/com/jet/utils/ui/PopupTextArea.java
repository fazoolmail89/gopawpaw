package com.jet.utils.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Adds popup edit menus to the JTextArea.
 *
 * @author Paul Bemowski
 */
public class PopupTextArea extends JTextArea
   implements ActionListener, MouseListener
{
   private JPopupMenu mPopup;
   
   /** */
   public PopupTextArea()
   {
      super();
      initPopup();
   }

   /** */
   public PopupTextArea(int r, int c) {
      super(r, c);
      initPopup();
   }

   /** */
   public PopupTextArea(String s) {
      super(s);
      initPopup();
   }

   private final void initPopup()
   {
      JMenuItem popEditCut = new JMenuItem ("Cut");
      popEditCut.setActionCommand("editCut");
      popEditCut.addActionListener(this);
      JMenuItem popEditCopy = new JMenuItem ("Copy");
      popEditCopy.setActionCommand("editCopy");
      popEditCopy.addActionListener(this);
      JMenuItem popEditPaste = new JMenuItem ("Paste");
      popEditPaste.setActionCommand("editPaste");
      popEditPaste.addActionListener(this);

      mPopup=new JPopupMenu();
      mPopup.add(popEditCut);
      mPopup.add(popEditCopy);
      mPopup.add(popEditPaste);

      this.addMouseListener(this);
   }
   
   /** windows */
   public void mouseReleased (MouseEvent me) {
      if (me.isPopupTrigger()) {
         showPopup(me.getPoint());
      }
   }

   /** unix */
   public void mousePressed(MouseEvent me) {
      if (me.isPopupTrigger()) {
         showPopup(me.getPoint());
      }
   }


   /** */
   public void mouseClicked(MouseEvent me) {}
   /** */
   public void mouseEntered(MouseEvent me) {}
   /** */
   public void mouseExited(MouseEvent me) {}

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      // We want to get the component that has focus.
      String action =ae.getActionCommand();
      // System.out.println ("Edit action: "+action);
      if (action.equals("editCopy"))
         this.copy();
      else if (action.equals("editCut"))
         this.cut();
      else if (action.equals("editPaste"))
         this.paste();
   }

   /**
    *
    */
   private void showPopup(Point p)
   {
      Point scrollTopLeft=new Point(0, 0);  // Tex

      Point topLeft=new Point(0, 0);
      
      topLeft.x=topLeft.x+scrollTopLeft.x;
      topLeft.y=topLeft.y+scrollTopLeft.y;
      mPopup.show(this, p.x+topLeft.x, p.y-topLeft.y);
   }
}
