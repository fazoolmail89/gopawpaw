package com.jet.apps.databrowser.ui;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import com.jet.utils.ui.*;
import com.jet.utils.DataValidator;
import com.jet.utils.filesystem.*;
import com.jet.log.*;
import com.jet.utils.mail.*;
import com.jet.utils.properties.*;
import com.jet.core.Core;

import com.jet.utils.db.TableUtil;

/*
 * $Log: ForwardResultsDialog.java,v $
 * Revision 1.3  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.2  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 *
 */
public class ForwardResultsDialog extends JDialog 
   implements ActionListener, Logger
{
   PopupTextField toAddress=null;
   PopupTextField ccAddress=null;
   PopupTextField fromAddress=null;
   PopupTextField subjectField=null;

   JToggleButton inlineHtml=null;
   JToggleButton attachedCsv=null;
   
   JTextArea userMessage=null;

   // Vector data=null;
   ArrayList data=null;
   ArrayList headers=null;

   String query=null;
   String connName=null;

   private static EProperties mailProps=null;

   static {
      // Get the necessary properties
      EProperties root=Core.getInstance().getProperties("jdbcbrowser");
      mailProps=root.getProperties("outboundMail");
   }

   /**
    *
    */
   private ForwardResultsDialog(Component owner, ArrayList h, ArrayList  d)
   {
      super(WinUtil.findParentFrame(owner), 
            "Forward Results Via E-Mail");

      headers=h;
      data=d;

      setSize(400, 350);
      setLocation(WinUtil.alignCenter(this));
      Container cp=getContentPane();

      cp.setLayout(new BorderLayout());

      JPanel northPanel=new JPanel(new BorderLayout());

      int rows=4;
      JPanel labelPanel=new JPanel(new GridLayout(rows, 1));
      JPanel inputPanel=new JPanel(new GridLayout(rows, 1));

      labelPanel.add(new JLabel("To: "));
      labelPanel.add(new JLabel("CC: "));
      labelPanel.add(new JLabel("From: "));
      labelPanel.add(new JLabel("Subject: "));

      toAddress=new PopupTextField();
      ccAddress=new PopupTextField();
      fromAddress=new PopupTextField();
      subjectField=new PopupTextField();

      if (mailProps != null)
      {
         String temp=(String)mailProps.get("replyToAddress");
         if (temp != null)
            fromAddress.setText(temp);
      }

      inputPanel.add(toAddress);
      inputPanel.add(ccAddress);
      inputPanel.add(fromAddress);
      inputPanel.add(subjectField);

      JPanel addressPanel=new JPanel(new BorderLayout());
      addressPanel.add(labelPanel, "West");
      addressPanel.add(inputPanel, "Center");
      northPanel.add(addressPanel, "North");
      
      // add radio buttons for attachment type
      JPanel centerPanel=new JPanel(new GridLayout(1, 2));

      ButtonGroup attachSelector=new ButtonGroup();
      inlineHtml=new JCheckBox("Send as in-line HTML");
      attachedCsv=new JCheckBox("Send as attached .csv");
      // attachSelector.add(inlineHtml);
      // attachSelector.add(attachedCsv);
      
      inlineHtml.setSelected(true);
      
      centerPanel.add(inlineHtml);
      centerPanel.add(attachedCsv);

      northPanel.add(centerPanel, "Center");

      cp.add(northPanel, "North");
      // cp.add(centerPanel, "Center");

      JPanel messagePanel=new JPanel(new BorderLayout());
      userMessage=new JTextArea();
      JScrollPane sp=new JScrollPane(userMessage);
      sp.setBorder(new TitledBorder("Message"));
      messagePanel.add(sp, "Center");

      cp.add(messagePanel, "Center");
      
      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton b=new JButton("Send");
      b.setActionCommand("send");
      b.addActionListener(this);
      buttonPanel.add(b);

      b=new JButton("Cancel");
      b.setActionCommand("cancel");
      b.addActionListener(this);
      buttonPanel.add(b);

      cp.add(buttonPanel, "South");
   }


   /**
    *
    */
   public static void showDialog(Component owner, ArrayList headers, 
                                 ArrayList data, String q,
                                 String cn)
   {
      ForwardResultsDialog frd=new ForwardResultsDialog(owner, headers, data);
      frd.query=q;
      frd.connName=cn;
      frd.show(); // blocks
   }

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("send"))
      {
         log.writeDebug("Send.");
         
         // Get the necessary mail properties.
         String mailServer=(String)mailProps.get("mailServerName");
         String mailPortString=(String)mailProps.get("mailServerPort");
         String mailUser=(String)mailProps.get("mailUserName");
         String mailPassword=(String)mailProps.get("mailPassword");

         boolean verbose=mailProps.getBoolean("verboseDebug", false);

         if (verbose)
            log.writeDebug ("Mail to "+mailServer+":"+mailPortString+" ("+
                         mailUser+", password not shown)");
         
         // confirm the properties
         if (!DataValidator.validateMachineName(mailServer) ||
             !DataValidator.validatePortNumber(mailPortString))
         {
            String message=
            "It appears that your e-mail configuration is not valid.\n"+
            "Please go to Edit->Preferences and choose the E-Mail tab\n"+
            "to enter your mail server information, and try again.";
            MessageWindow.showWarning(this, message);
            return;
         }

         int mailPort=Integer.parseInt(mailPortString.trim());

         try {
            EMailMessage email=buildMessage();
            SMTPMailServer ms=null;

            //ms=DeliveryServer.getInstance();
            // Get properties here;
            ms=new SMTPMailServer(mailServer, mailPort, 
                                  mailUser, mailPassword);

            if (verbose)
               ms.debug=true;
            else
               ms.debug=false;

            OutboundMessageWorker omw=new OutboundMessageWorker(ms);
            omw.sendMessage(email);
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
            // We should inform the user here
//             MessageWindow.showWarning(this,
//                                       "Unable to send mail.", ex);
            ExceptionDebugger.debug(this, "Unable to send mail.", ex);
         }
      }
      
      dispose();
   } // end actionPerformed


   private EMailMessage buildMessage()
      throws IOException 
   {
      boolean attach=attachedCsv.isSelected();
      boolean inline=inlineHtml.isSelected();

      String to=toAddress.getText().trim(); 
      String cc=ccAddress.getText().trim();
      String from=fromAddress.getText().trim();
      String subject=subjectField.getText().trim();

      subject="DataBrowser Query - "+subject;
      StringBuffer body=new StringBuffer();
      body.append("<html><head><title></title></head>\n");
      body.append("<center><b><font size=+2>DataBrowser Search Results"+
                  "</font></b></center>\n");
      body.append("<p>");
      
      String message=userMessage.getText().trim();
      if (message.length() > 0)
      {
         // append the user's message
         message=addHtmlLineBreaks(message);
         body.append("<hr>");
         body.append("<center>Message</center>\n");
         body.append(message);
         body.append("<hr>");
      }

      body.append("<table width=\"100%\"><tr>");
      body.append("<td valign=top>Query:</td>");
      body.append("<td BGCOLOR=\"#EEEEFF\" "+
                  "width=\"100%\">\n");
      body.append(addHtmlLineBreaks(query));
      body.append("</td></tr>");
      body.append("<td valign=top>Database:</td>");
      body.append("<td BGCOLOR=\"#EEEEFF\" "+
                  "width=\"100%\">\n");
      body.append(connName);
      body.append("</td></tr>");
      body.append("</table><p>");
      
      if (inline) {
         // insert table here.
         body.append(TableUtil.tableToHtml(headers, data));
      }

      if (attach) {
         body.append("<br>This message has an attached result set in .csv "+
                     "format.  You can open this file with most spread sheet "+
                     "applications (such as Microsoft Excel).<br>");
      }
      
      body.append(buildFooter());
      body.append("</html>");

      EMailMessage email=new EMailMessage(from, to, subject, body);
      email.setContentType("text/html");
      email.setCC(cc);

      if (attach)
      {
         // attach
         File attachment=null;
         try
         {
            File temp=FileUtil.getTempFile("csv");
            attachment=TableUtil.sendToCSVFile(data, temp);
            email.attach(attachment);
         }
         catch (Exception ex)
         {
            log.printStackTrace(ex);
         }
      }

      return email;
   }

   /**
    *
    */
   private String buildFooter()
   {
      String s=
      "<p><table boreder=0 cellpadding=1 cellspacing=1 width=\"100%\">\n"+
      "<tr><td BGCOLOR=\"#EEEEFF\">\n"+
      "This email was generated by the DataBrowser<br>"+
      "Copyright, <a href=\"http://jmatrix.net\">"+
      "Java Enterprise Technologies, Inc.</a>\n"+
      "</td></tr></table><br>";
      return s;
   }

   /**
    * This methods add line break html (<br>) tags to a file based on
    * where the real line breaks are.
    *
    */
   public static String addHtmlLineBreaks(String msg)
   {
      StringBuffer sb=new StringBuffer();

      for (int i=0; i<msg.length(); i++)
      {
         if (msg.charAt(i) == '\n')
         {
            sb.append("<br>\n");
         }
         else 
         {
            sb.append(msg.charAt(i));
         }
      }
      return sb.toString();
   }
}


