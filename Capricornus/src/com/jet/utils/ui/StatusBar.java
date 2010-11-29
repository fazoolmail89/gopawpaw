package com.jet.utils.ui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Generic 3 window status bar with syncrhonized methods.
 *
 */
public class StatusBar extends JPanel
{
   JPanel left, right, center;
   JLabel leftLabel, rightLabel, centerLabel;

   Color defaultForeground=null;
   
   /** */
   public StatusBar()
   {
      this.setLayout(new BorderLayout());
         
      left=new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
      center=new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
      right=new JPanel(new FlowLayout(FlowLayout.RIGHT, 1, 1));
         
      left.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      center.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      right.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      
      leftLabel=new JLabel();
      left.add(leftLabel);
      
      centerLabel=new JLabel();
      center.add(centerLabel);
      
      rightLabel=new JLabel();
      right.add(rightLabel);

         
      defaultForeground=leftLabel.getForeground();

      this.add(left, "West");
      this.add(center, "Center");
      this.add(right, "East");
   }

   /** */
   public synchronized void setCenter(String txt) {
      setCenter(txt, null);
   }

   /** */
   public synchronized void setCenter(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;

      centerLabel.setForeground(color);
      centerLabel.setText(txt);
   }

   public synchronized void setLeft(String txt) {
      setLeft(txt, null);
   }

   public synchronized void setLeft(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;
      
      leftLabel.setForeground(color);
      leftLabel.setText(txt);
   }

   public synchronized void setRight(String txt) {
      setRight(txt, null);
   }

   public synchronized void setRight(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;
      
      rightLabel.setForeground(color);
      rightLabel.setText(txt);
      rightLabel.invalidate();
      rightLabel.repaint();
   }
}
