package com.jet.apps.databrowser.ui;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;
import java.io.*;

import com.jet.utils.ui.*;
import com.jet.utils.*;
import com.jet.log.*;
import com.jet.apps.databrowser.model.DBSession;

/**
 *
 * @author Paul Bemowski
 */
public class PasswordDialog extends JDialog
   implements ActionListener, Logger
{
   // there are really 3 uses:
   // 1) day to day login
   // 2) The very first use -- type initial password twice
   // 3) Changing the password

   static final int NEWPASS=0;
   static final int LOGIN=1;
   static final int CHANGEPASS=2;

   private int type=-1;

   private JPasswordField oldPassword=null;
   private JPasswordField password=null;
   private JPasswordField passwordConfirm=null;
   
   private JCheckBox nopassword=null;

   private JLabel passwordLabel=null;
   private JLabel passwordConfirmLabel=null;

   private boolean ok=false;

   private PBE pbe=null;

   private boolean currentIsDefault=false;
   
   private DBSession dbSession=null;

   /**
    */
   public PasswordDialog(Frame parent, DBSession session) {
      super (parent, true);
      this.dbSession=session;
   }

   private void layoutChangePass(boolean iscurrentdefault) {
      setSize(320, 150);
      setLocation (WinUtil.alignCenter(this));
      if (iscurrentdefault)
         setTitle ("Change Password (current is default)");
      else
         setTitle ("Change Password");
      getContentPane().setLayout(new BorderLayout());

      type=CHANGEPASS;

      oldPassword=new JPasswordField(15);
      password=new JPasswordField(15);
      passwordConfirm=new JPasswordField(15);

      JPanel northPanel=new JPanel(new BorderLayout());
      int rows=0;
      if (iscurrentdefault)
         rows=2;
      else
         rows=3;

      passwordLabel=new JLabel("New Password:");
      passwordConfirmLabel=new JLabel("Confirm Password: ");

      JPanel labels=new JPanel(new GridLayout(rows, 1));
      if (!iscurrentdefault)
         labels.add(new JLabel("Old Password: "));
      labels.add(passwordLabel);
      labels.add(passwordConfirmLabel);

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      if (!iscurrentdefault)
         fields.add(oldPassword);
      fields.add(password);
      fields.add(passwordConfirm);

      northPanel.add(fields, "Center");
      
      getContentPane().add(northPanel, "North");

      nopassword=new JCheckBox("Use Default Encryption Key");
      nopassword.setActionCommand("nopass");
      if (iscurrentdefault) {
         nopassword.setSelected(true);
         nopassword.setEnabled(false);
      }
      nopassword.addActionListener(this);
      getContentPane().add(nopassword, "Center");

      JPanel southPanel=new JPanel(new BorderLayout());
      JPanel rightPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel leftPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

      JButton cancelButton=new JButton("Cancel");
      JButton okButton=new JButton("Ok");
      okButton.setActionCommand("okButton");
      cancelButton.setActionCommand("cancelButton");
      rightPanel.add (okButton);
      rightPanel.add (cancelButton);
      
      JButton helpButton=new JButton("Help");
      helpButton.setActionCommand("help");
      helpButton.addActionListener(this);
      leftPanel.add(helpButton);

      southPanel.add(rightPanel, "East");
      southPanel.add(leftPanel, "West");
      getContentPane().add (southPanel, "South");

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      pack();
   }

   /** */
   private void layoutNewPass() {
      setSize(320, 190);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Databrowser Initial Password");
      getContentPane().setLayout(new BorderLayout());
      setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

      type=NEWPASS;

      // Initialize the fields
      password=new JPasswordField(15);
      passwordConfirm=new JPasswordField(15);
      JPanel northPanel=new JPanel(new BorderLayout());
      int rows=2;

      passwordLabel=new JLabel("Password:");
      passwordConfirmLabel=new JLabel("Confirm Password: ");
      JPanel labels=new JPanel(new GridLayout(rows, 1));
      labels.add(passwordLabel);
      labels.add(passwordConfirmLabel);
      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      fields.add(password);
      fields.add(passwordConfirm);

      northPanel.add(fields, "Center");
      
      getContentPane().add(northPanel, "North");
      
      nopassword=new JCheckBox("Use Default Encryption Key");
      nopassword.setActionCommand("nopass");
      nopassword.addActionListener(this);
      getContentPane().add(nopassword, "Center");
      // getContentPane().add(explanation, "North");

      JPanel southPanel=new JPanel(new BorderLayout());
      JPanel rightPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel leftPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

      JButton cancelButton=new JButton("Cancel");
      JButton okButton=new JButton("Ok");
      okButton.setActionCommand("okButton");
      cancelButton.setActionCommand("cancelButton");
      rightPanel.add (okButton);
      // southPanel.add (cancelButton);

      JButton helpButton=new JButton("Help");
      helpButton.setActionCommand("help");
      helpButton.addActionListener(this);
      leftPanel.add(helpButton);

      southPanel.add(rightPanel, "East");
      southPanel.add(leftPanel, "West");
      getContentPane().add (southPanel, "South");

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      pack();
   }

   /** */
   private void layoutLogin() {
      setSize(220, 110);
      setLocation (WinUtil.alignCenter(this));
      setTitle ("Databrowser Login");
      getContentPane().setLayout(new BorderLayout());

      type=LOGIN;

      // Initialize the fields
      password=new JPasswordField(15);
      JPanel northPanel=new JPanel(new BorderLayout());
      int rows=1;

      JPanel labels=new JPanel(new GridLayout(rows, 1));
      labels.add(new JLabel("Password: "));
      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(rows, 1));
      fields.add(password);

      northPanel.add(fields, "Center");
      
      getContentPane().add(northPanel, "Center");

      JPanel southPanel=new JPanel(new BorderLayout());
      JPanel rightPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel leftPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));

      JButton cancelButton=new JButton("Cancel");
      JButton okButton=new JButton("Ok");
      okButton.setActionCommand("okButton");
      cancelButton.setActionCommand("cancelButton");
      rightPanel.add (okButton);
      rightPanel.add (cancelButton);
      
      JButton helpButton=new JButton("Help");
      helpButton.setActionCommand("help");
      helpButton.addActionListener(this);
      leftPanel.add(helpButton);

      southPanel.add(rightPanel, "East");
      southPanel.add(leftPanel, "West");
      getContentPane().add (southPanel, "South");

      okButton.addActionListener(this);
      cancelButton.addActionListener(this);
      pack();
   }

   /** */
   public static final String getNewPassword(Frame parent) {
      PasswordDialog dialog=new PasswordDialog(parent, null);
      dialog.layoutNewPass();
      dialog.show();
      if (dialog.ok) {
         return dialog.password.getText();
      }
      else {
         MessageWindow.showWarning(parent, "No password selected.");
         return null;
      }
   }

   /** */
   public static final String getLoginPassword(Frame parent) {
      PasswordDialog dialog=new PasswordDialog(parent, null);
      dialog.layoutLogin();
      dialog.show();
      if (dialog.ok) {
         return dialog.password.getText();
      }
      else {
         MessageWindow.showWarning(parent, "No password selected.");
         return null;
      }
   }

   /** */
   public static final String changePassword(JFrame parent, DBSession session, 
                                             boolean currentDefault) {
      PasswordDialog dialog=new PasswordDialog(parent, session);
      dialog.currentIsDefault=currentDefault;
      dialog.pbe=session.getPBE();
      dialog.layoutChangePass(currentDefault);
      dialog.show();
      if (dialog.ok) {
         return dialog.password.getText();
      }
      else {
         return null;
      }
   }

   /**
    */
   public void actionPerformed(ActionEvent e)
   {
      String action=e.getActionCommand();
      if (action.equals("cancelButton"))
         dispose();
      else if (action.equals("okButton"))
         okButtonHandler();
      else if (action.equals("nopass")){
         if (nopassword.isSelected()) {
            password.setText("");
            passwordConfirm.setText("");
            password.setEnabled(false);
            passwordConfirm.setEnabled(false);
            passwordLabel.setEnabled(false);
            passwordConfirmLabel.setEnabled(false);
         }
         else {
            if (password != null)
               password.setEnabled(true);
            if (passwordConfirm != null)
               passwordConfirm.setEnabled(true);
            passwordLabel.setEnabled(true);
            passwordConfirmLabel.setEnabled(true);
         }
      }
      else if (action.equals("help")) {
         dbSession.setHelpURL(ClassLoader.getSystemResource("resources/help/password.html"));
      }
   }

   /**
    */
   private void okButtonHandler() {
      switch (type) {
         case (CHANGEPASS): {
            if (!currentIsDefault &&
                !pbe.isPassword(oldPassword.getText())) {
               MessageWindow.showWarning(this, "Old password is incorrect.");
            }
            else if (!password.getText().equals(passwordConfirm.getText()))
               MessageWindow.showWarning(this, "New passwords don't match.");
            else {
               if (nopassword.isSelected() &&
                   !currentIsDefault)
                  password.setText("databrowserdefault");
               ok=true;
               dispose();
            }
         }
         break;

         case(NEWPASS): 
            if (nopassword.isSelected()) {
               password.setText("databrowserdefault");
               ok=true;
               dispose();
            }
            else {
               if (!password.getText().equals(passwordConfirm.getText()))
                  MessageWindow.showWarning(this, "Passwords don't match.");
               else if (password.getText().length() <= 5) {
                  MessageWindow.showWarning(this, "Password must be greater than 5 characters.");
               }
               else {
                  ok=true;
                  dispose();
               }
            }
            break;
         case (LOGIN): 
         default: 
            ok=true;
            dispose();
            break;
      }
   }

   public static boolean empty(String s)
   {
      if (s == null)
         return true;
      if (s.length() == 0)
         return true;
      return false;
   }
}








