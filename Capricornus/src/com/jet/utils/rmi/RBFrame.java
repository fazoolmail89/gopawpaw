package com.jet.utils.rmi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;


/**
 *
 *
 *
 */
public class RBFrame extends JFrame
{
   RBTree tree=null;

   /**
    *
    */
   public RBFrame()
   {
      setSize(400, 300);
      Container cp=getContentPane();
      
      tree=new RBTree();
      JLabel editorPane=new JLabel("editorPane");
      
      JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                   tree, editorPane);
      
      cp.setLayout(new BorderLayout());
      
      cp.add(sp, "Center");

      cp.add(new Toolbar(), "North");

      addWindowListener(new WinHandler());
   }

   /**
    *
    */
   public void addServer(String host, int port)
      throws Exception 
   {
      tree.addServer(host, port);
   }

   /**
    * This class handles window envents only.  Primarily the window
    * closing event that is needed in almost any application.
    */
   class WinHandler extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         System.exit(0);
      }
   }
   
   /**
    *
    */
   class Toolbar extends JToolBar implements ActionListener
   {
      JButton addServer=null;

      public Toolbar()
      {
         this.setLayout(new FlowLayout(FlowLayout.LEFT));

         addServer=new JButton("Add");
         addServer.addActionListener(this);

         this.add(addServer);
      }

      public void actionPerformed(ActionEvent ae)
      {
         if (ae.getSource().equals(addServer))
         {
            processAddServer();
         }
      }
   }

   /**
    */
   public void processAddServer() {
      Hashtable si=AddServerDialog.getServerInfo(this);

      String host=(String)si.get("server");
      Integer port=(Integer)si.get("port");
      int iport=port.intValue();

      if (iport > 0 && host != null) {
         try {
            addServer(host, iport);
         } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println ("Error adding server");
         }
      }
      else
      {
         System.out.println ("Invalid data.");
      }
   }
}



