package com.jet.apps.databrowser.prefs;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

import com.jet.utils.properties.*;
import com.jet.utils.filesystem.*;
import com.jet.net.mail.*;
import com.jet.utils.exception.ValidationException;
import com.jet.utils.*;
import com.jet.utils.ui.*;

import com.jet.log.Logger;

/*
 * $Log: EMailPanel.java,v $
 * Revision 1.2  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2001/09/14 00:24:24  bemocvs
 * initial checkin.
 *
 */

/**
 *
 */
class EMailPanel extends JPanel
   implements PreferencePanel, ActionListener, Logger
{
   public MonitoredTextField mailServerName=null;
   public MonitoredTextField mailServerPort=null;
   public MonitoredTextField replyToAddress=null;
   public MonitoredTextField mailUserName=null;
   public MonitoredPasswordField mailPassword=null;

   public JButton mailTest=null;

   private EProperties mailProps=null;

   private EProperties mProps=null;
   private PBE pbe=null;

   /** */
   public EMailPanel(EProperties p, PBE pb)
   {
      setLayout(new GridBagLayout());
      mProps=p;
      pbe=pb;
         
      mailProps=(EProperties)mProps.get("outboundMail");
      if (mailProps == null)
      {
         mailProps=new EProperties();
         mProps.put("outboundMail", mailProps);
      }
         
      mailServerName=new MonitoredTextField(30, 1);
      mailServerPort=new MonitoredTextField(30, 1);
      replyToAddress=new MonitoredTextField(30, 1);
      mailUserName=new MonitoredTextField(15, 1);
      mailPassword=new MonitoredPasswordField(15);
         
      mailServerName.
      setInitialText((String)mailProps.get("mailServerName"));
      mailServerPort.
      setInitialText((String)mailProps.get("mailServerPort"));
      replyToAddress.
      setInitialText((String)mailProps.get("replyToAddress"));
      mailUserName.
      setInitialText((String)mailProps.get("mailUserName"));
      String mailpasse=mailProps.getProperty("mailPassword.encrypted");
      if (mailpasse != null && pbe != null)
         mailPassword.
         setInitialText(pbe.decrypt(mailpasse));

      JPanel northPanel=new JPanel(new GridBagLayout());
      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));

      northPanel.setBorder(new TitledBorder("Outgoing SMTP Mail Properties")); 

      GridBagConstraints c=new GridBagConstraints();
      c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
      c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
      c.gridy=c.RELATIVE;
      northPanel.add(new JLabel("Mail Server Name"), c);
      northPanel.add(new JLabel("Mail Server Port"), c);
      northPanel.add(new JLabel("Reply To Address"), c);

      JPanel authPanel=new JPanel(new GridLayout(1, 4));
      authPanel.add(new JLabel("Mail User ID:"));
      authPanel.add(mailUserName);
      authPanel.add(new JLabel(" Mail Password: "));
      authPanel.add(mailPassword);

      c.gridwidth=2; c.gridx=0; c.gridy=3; c.fill=c.HORIZONTAL;
      northPanel.add(authPanel, c);
         
      c.fill=c.HORIZONTAL; c.gridwidth=1;
      c.gridx=1; c.gridy=0; c.weightx=1; c.anchor=c.NORTHEAST;
      c.gridy=0;
      northPanel.add(mailServerName, c); c.gridy=1;
      northPanel.add(mailServerPort, c); c.gridy=2;
      northPanel.add(replyToAddress, c);

      mailTest=new JButton("Test Mail Server Login");
      mailTest.addActionListener(this);
      southPanel.add(mailTest);

      c=new GridBagConstraints();
      c.ipadx=c.ipady=2; c.insets=new Insets(2,2,2,2);
      c.gridx=c.gridy=0; c.anchor=c.NORTH; c.fill=c.HORIZONTAL;
      c.gridy=c.RELATIVE; c.weightx=1;
      this.add(northPanel, c);
      this.add(southPanel, c);
      c.fill=c.BOTH;
      c.weighty=1;
      this.add(new JPanel(), c); // Place Holder
   }

   /**
    *
    */
   public boolean validateData()
      throws ValidationException
   {
      ValidationException valEx=null;

      if (mailServerPort.isUpdated())
      {
         String mailPortString=mailServerPort.getText().trim();
         try
         {
            Integer.parseInt(mailPortString);
         }
         catch (NumberFormatException ex)
         {
            if (valEx==null)
               valEx=new ValidationException();
               
            valEx.addValidation("EMail -> Mail Server Port",
                                "Must be an integer");
         }
      }
            
      if (valEx != null)
         throw valEx;

      return true;
   }

   public boolean save()
   {
      String temp=null;
      temp=mailServerName.getText().trim();
      mailProps.put("mailServerName", temp);

      temp=mailServerPort.getText().trim();
      mailProps.put("mailServerPort", temp);

      temp=replyToAddress.getText().trim();
      mailProps.put("replyToAddress", temp);

      temp=mailUserName.getText().trim();
      mailProps.put("mailUserName", temp);

      temp=mailPassword.getText().trim();
      if (pbe != null)
         mailProps.put("mailPassword.encrypted", pbe.encrypt(temp));
      else
         MessageWindow.showWarning(this, "Unable to save email password because you are not logged in.");

      return true;
   }

   /**
    * Text Mail login
    */
   public void actionPerformed(ActionEvent ae)
   {
      String message="Error";
      String exceptionPrefix="Mail server validation failed:\n";
      Exception ex=null;

      try
      {
         validateData();
      }
      catch (ValidationException exx)
      {
         ValidationDialog.showValidation(this, exx);
         return;
      }

         
      try
      {
         // Throw up a wait cursor
         this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));


         // Test the current mail props.
         String server=mailServerName.getText().trim();
         String portString=mailServerPort.getText().trim();
         String userName=mailUserName.getText().trim();
         String password=mailPassword.getText().trim();
            
         if (StringUtil.empty(server) &&
             StringUtil.empty(portString))
         {
            throw new Exception("No server or port supplied.");
         }
         int port=Integer.parseInt(portString);

         SMTPMailServer ms=new SMTPMailServer(server, port, userName, 
                                              password);

         boolean valid=ms.validateLogin();
         if (valid)
         {
            message="Mail server login successfully validated.";
         }
         else
         {
            message="ERROR: Mail server login failed for an "+
            "unknown reason.";
         }
      }
      catch (NumberFormatException exx)
      {
         message=exceptionPrefix+"NumberFormatException: "+exx.getMessage();
      }
      catch (MailException exx)
      {
         message=exceptionPrefix+"MailException: "+exx.getMessage();
      }
      catch (Exception exx)
      {
         message=exceptionPrefix+exx.toString();
      }
      finally
      {
         this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
      }
         
      if (ex == null)
         MessageWindow.showMessage(this, message);
      else {
         //MessageWindow.showWarning(this, message, ex);
         ExceptionDebugger.debug(this, message, ex);
      }
   }
}
