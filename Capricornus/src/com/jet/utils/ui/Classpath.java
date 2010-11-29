package com.jet.utils.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

/**
 *
 *
 */
public class Classpath extends JFrame implements ActionListener
{

   /**
    *
    */
   private Classpath()
   {
      super();
      this.getContentPane().setLayout(new BorderLayout());
      setSize(300, 175);
      setLocation(WinUtil.alignCenter(this));
      setTitle("Classpath");
      
      Vector classpath=getCP();
      JList list=new JList(classpath);
      JScrollPane sp=new JScrollPane(list);

      this.getContentPane().add(sp, "Center");
   

      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton ok=new JButton("OK");
      ok.addActionListener(this);
      southPanel.add(ok);
      
      this.getContentPane().add(southPanel, "South");
   }

   /** */
   public static void displayClasspath()
   {
      Classpath cp=new Classpath();
      cp.show();
   }
       
   /** */
   private Vector getCP()
   {
      String classpath=System.getProperty("java.class.path");
      StringTokenizer st=new StringTokenizer(classpath, 
                                             java.io.File.pathSeparator,
                                             false);
      Vector ret=new Vector();
      while (st.hasMoreTokens())
         ret.addElement(st.nextToken());
      return ret;
   }


   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("OK"))
         dispose();
   }

}
