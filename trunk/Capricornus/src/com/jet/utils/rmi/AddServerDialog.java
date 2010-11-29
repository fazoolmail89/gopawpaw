package com.jet.utils.rmi;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;
import java.io.*;

/**
 *
 * @author Paul Bemowski
 */
public class AddServerDialog extends JDialog
   implements ActionListener
{
   JTextField serverField, portField;
   JButton okButton, cancelButton;

   boolean ok=false;

   /**
    *
    */
   public AddServerDialog(Frame parent)
   {
      super (parent, true);
      setSize(300, 100);
      setTitle ("Add Server");
      getContentPane().setLayout(new BorderLayout());
    
      serverField=new JTextField(25);
      portField=new JTextField(25);
      
      okButton=new JButton("OK");
      cancelButton=new JButton("Cancel");
      
      JPanel center=new JPanel(new GridLayout(2, 1));
      JPanel serverPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
      serverPanel.add(new JLabel("Server"));
      serverPanel.add(serverField);
      center.add(serverPanel);

      JPanel portPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
      portPanel.add(new JLabel("Port"));
      portPanel.add(portField);
      center.add(portPanel);

      JPanel south=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      south.add(okButton);
      south.add(cancelButton);

      this.getContentPane().add(center, "Center");
      this.getContentPane().add(south, "South");


      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      pack();
   }


   public static Hashtable getServerInfo(Frame parent)
   {
      AddServerDialog asd=new AddServerDialog(parent);
      asd.show();

      if (asd.ok) {
         Hashtable data=new Hashtable();
         
         String server=asd.serverField.getText();
         String portText=asd.portField.getText();
         int portint=-1;

         try {portint=Integer.parseInt(portText.trim());}
         catch (Exception ex) {portint=-1;}

         data.put("server", server);
         data.put("port", new Integer(portint));

         return data;
      }
      else {return null;}
   }


   /** 
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      if (ae.getSource().equals(okButton))
         ok=true;
      else
         ok=false;
      dispose();
   }
}



