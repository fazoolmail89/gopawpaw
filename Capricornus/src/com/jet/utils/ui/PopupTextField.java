package com.jet.utils.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Adds popup edit menus to the JTextField.
 *
 *
 *
 * @author Paul Bemowski
 */
public class PopupTextField extends JTextField 
   implements ActionListener, MouseListener
{
   private JPopupMenu mPopup;
   private int rows=-1;

   /** */
   public PopupTextField(int i) 
   {
      super(i);
      initPopup();
   }
   
   /** */
   public PopupTextField()
   {
      super();
      initPopup();
   }

   /** */
   public PopupTextField(int cols, int r)
   {
      this(cols);
      rows=r;
   }

   private void initPopup()
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

      // System.out.println ("Scroller top left is: "+scrollTopLeft);
      
      Point topLeft=new Point(0, 0);//mSqlScroller.getViewport().getViewPosition();
      
      topLeft.x=topLeft.x+scrollTopLeft.x;
      topLeft.y=topLeft.y+scrollTopLeft.y;
      
      // System.out.println ("Top left is: "+topLeft);
      
      //currentX=p.x;
      //currentY=p.y;
      
      // System.out.println ("Showing popup at "+p);
      mPopup.show(this, p.x+topLeft.x, p.y-topLeft.y);
      // System.out.println ("Popup: "+mPopup+" is showing? "+mPopup.isVisible());
   }

   /**
    * Returns the preferred size Dimensions needed for this 
    * TextField.  If a non-zero number of columns has been
    * set, the width is set to the columns multiplied by
    * the column width. 
    *
    * @return the dimensions
    */
   public Dimension getPreferredSize() 
   {
      synchronized (getTreeLock()) 
      {
         Dimension size = super.getPreferredSize();
         if (rows != -1)
            size.height=rows*getRowHeight();

         return size;
      }
   }

   protected int getRowHeight() 
   {
      int rowHeight;
      FontMetrics metrics = getFontMetrics(getFont());
      rowHeight = metrics.getHeight();
      return rowHeight;
   }
}
