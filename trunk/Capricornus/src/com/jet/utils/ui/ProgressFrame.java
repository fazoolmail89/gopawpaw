package com.jet.utils.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 *
 */
public class ProgressFrame extends JDialog  // We might want this to be a dialog
   implements ProgressWatcher, ActionListener
{
   JProgressBar primaryProgressBar=null;
   JLabel primaryProgressText=null;
   JProgressBar secondaryProgressBar=null;
   JLabel secondaryProgressText=null;

   JPanel progressPanel=null;

   boolean stop=false;

   GridLayout layout=null;

   /**
    *
    */
   public ProgressFrame(Component c)
   {
      this (c, true);
   }

   /**
    *
    */
   public ProgressFrame(Component c, boolean modal)
   {
      super(WinUtil.findParentFrame(c), modal);
      setSize(300, 125);
      setLocation(WinUtil.alignCenter(this));
      
      Container cp=getContentPane();

      cp.setLayout(new BorderLayout(4, 1));
      
      layout=new GridLayout(4, 1);
      progressPanel=new JPanel(layout);
      primaryProgressBar=new JProgressBar(JProgressBar.HORIZONTAL);
      primaryProgressBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
      primaryProgressText=new JLabel("...");
      secondaryProgressBar=new JProgressBar(JProgressBar.HORIZONTAL);
      secondaryProgressText=new JLabel("...");
      
      progressPanel.add(primaryProgressText);
      progressPanel.add(primaryProgressBar);

      progressPanel.add(secondaryProgressText);
      progressPanel.add(secondaryProgressBar);


      JPanel buttonPanel=new JPanel(new FlowLayout());
      JButton stop=new JButton("Stop");
      stop.setActionCommand("stop");
      stop.addActionListener(this);
      buttonPanel.add(stop);

      cp.add(progressPanel, "Center");
      cp.add(buttonPanel, "South");
   }

   /**
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("stop")) {
         // try to stop
         stop=true; // user has to poll to see this.
      }
   }

   /**
    */
   public void setType(int type)
   {
      progressPanel.remove(secondaryProgressText);
      progressPanel.remove(secondaryProgressBar);

      if (type == DUAL) {
         layout.setRows(4);
         progressPanel.add(secondaryProgressText);
         progressPanel.add(secondaryProgressBar);
      } else {
         layout.setRows(2);
         setSize(300, 100);
      }
      progressPanel.invalidate();
      progressPanel.repaint();
   }
   
   /** */
   public void done() {
      Swinger.invokeLaterIfNecessary(new Runnable() {
            public void run(){
               ProgressFrame.this.dispose();
            }
         });
   }

   /** */
   public void done(final String s) {
      try {
         Swinger.invokeAndWaitIfNecessary(new Runnable() {
               public void run(){
                  MessageWindow.showMessage(ProgressFrame.this, s);
                  ProgressFrame.this.dispose();
               }});
      }catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   /** */
   public void interrupted(final String s)
   {
      try {
         Swinger.invokeAndWaitIfNecessary(new Runnable() {
               public void run(){
                  MessageWindow.showWarning(ProgressFrame.this, s);
                  ProgressFrame.this.dispose();
               }});
      }catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   


   public boolean isStopped() {return stop;}

   public int setPrimaryRange(int min, int max)
   {
      primaryProgressBar.setMinimum(min);
      primaryProgressBar.setMaximum(max);
      int range=max-min;
      int u=(int)(range * 0.01);
      if (u <= 0) u=1;
      this.invalidate();
      return u;
   }

   public void setPrimaryValue(int i) {
      setPrimaryProgress(i, null);
   }
   public void setPrimaryText(String s) {
      setPrimaryProgress(-1, s);
   }

   public void setPrimaryProgress(int i, String s) {
      Swinger.invokeLaterIfNecessary(new pupdater(i, s));
   }

   class pupdater implements Runnable
   {
      int i=0;
      String s=null;
      public pupdater(int i, String s) {
         this.i=i;
         this.s=s;
      }
      
      public void run() {
         if (i != -1)
            primaryProgressBar.setValue(i);
         if (s != null)
            primaryProgressText.setText(s);
         ProgressFrame.this.invalidate();
      }
   }


   public int setSecondaryRange(int min, int max)
   {
      secondaryProgressBar.setMinimum(min);
      secondaryProgressBar.setMaximum(max);
      int range=max-min;
      int u=(int)(range * 0.01);
      if (u <= 0) u=1;
      this.invalidate();
      return u;
   }

   public void setSecondaryValue(int i) {secondaryProgressBar.setValue(i);}
   public void setSecondaryText(String s) {secondaryProgressText.setText(s);}
   public void setSecondaryProgress(int i, String s)
   {
      setSecondaryValue(i);
      setSecondaryText(s);
      this.invalidate();
   }
}

