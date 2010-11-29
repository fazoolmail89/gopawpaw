package com.jet.utils.mail;


import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;


// This will ONLY work with sun VM's.
import sun.misc.*;

import com.jet.log.Logger;

/**
 * An implementation of the MailServer interface wrapped around
 * SMTP. <p>
 *
 * Attachments to e-mails are included as multi-part MIME attachments.
 * They are encoded in base64 (most standard encoding on the 'net) and
 * the mime-type is set to application/octet-stream.
 *
 * <b>WARNING:</b> This class uses a base64 encoder that is encoded in the
 * sun.misc.* package which is included ONLY in the SUN VM's.
 *
 * @author Paul Bemowski
 */
public class SMTPMailServer implements MailServer, Logger
{
   /** Mail server host. */
   private String host=null;
   /** Mail Server port, generally 25. */
   private int port=25;

   /** ESMTP mail server login id. */
   private String userID=null;
 
   /** ESMTP mail server password. */
   private String password=null;
  
   
   /** Date format used in the mail header. */
   private static final SimpleDateFormat mailDateFormat=
   new SimpleDateFormat("dd MMM yyyy hhmm");
//   DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

   /** Toggles debugging. */
   public static boolean debug=true;

   /** Random number generator, seeded with the current time in millis. */
   private static Random randomGenerator=new Random(System.currentTimeMillis());

   /** This is a SUN specific BASE64 encoder.  It wants the endode methods
    * to be called on an instance, so I'll create a static final instance
    * for the e-mail server to use.  */
   private static final BASE64Encoder Encoder=new BASE64Encoder();

   private static final BASE64Decoder Decoder=new BASE64Decoder();

   /**
    * Constructs an interface to an SMTP mail service.
    * 
    * @param h Mail server host name (or IP).
    * @param p Mail sever port.  SMTP is usually served off of port 25.
    */
   public SMTPMailServer(String h, int p)
   {
      host = h;
      port = p;

   }

   /**
    * Simple constructor.  Defaults to port 25.
    */
   public SMTPMailServer(String h)
   {
      this (h, 25);
   }

   /**
    *
    */
   public SMTPMailServer(String h, int p, String u, String w)
   {
      this(h, p);
      userID=u;
      password=w;
   }



   /**
    * Sends an email message via the SMTP protocol.  This method is not
    * syncronized, and it does not maintain state in any global variables.
    * So, a single mail server can service mulitiple asynchronous mail
    * requests. <p>
    *
    * This method simply opens a Socket connection directly to the mail
    * server, and starts a conversation.
    * 
    * @param email The mail message to be sent.
    * @see EMailMessage
    */
   public void sendMessage(EMailMessage email) throws MailException
   {
      Socket mailSocket=null;
      PrintWriter mailWriter=null;
      BufferedReader mailServerReply=null;
      OutputStream mailOutputStream=null;

      // this is used to separate multi-part messages
      String uniqueBoundary="--_JETools_Boundary_"+getRandomString();

      log.writeDebug ("Attempting to send message.");

      Vector response=null;
      String command=null;
      try
      {
         // Setup the IO streams to the mail server.
         mailSocket=new Socket(host, port);
         // true parm here makes writer autoflush.
         mailSocket.setSoTimeout(12000); // 2 minute timeout on socket.read()

         // This is used for attachments only.
         mailOutputStream=mailSocket.getOutputStream();
         // this is used for everything else;
         mailWriter=new PrintWriter(mailOutputStream, true);
         mailServerReply=new BufferedReader(new InputStreamReader(mailSocket.getInputStream()));

         response=readResponse(mailServerReply);

         command="HELO "+host;

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);

         /////////////  Attempt AUTH LOGIN if data is available //////////
         if (userID != null &&
             password != null)
         {
            String decoded=null;
            MailServerResponse msr=null;

            command="AUTH LOGIN";

            sendCommand(mailWriter, command);
            response=readResponse(mailServerReply);

            msr=(MailServerResponse)response.elementAt(0);
            if (msr.isError())
            {
               log.writeDebug ("AUTH LOGIN unsuccessful, "+
                            "attempting to continue.");
            }
            else
            {
               // Continue with AUTH LOGIN
               decoded=new String(Decoder.decodeBuffer(msr.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(userID.getBytes());
               command=encodeString(userID);

               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply);
               
               msr=(MailServerResponse)response.elementAt(0);
               decoded=new String(Decoder.decodeBuffer(msr.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(password.getBytes());
               command=encodeString(password);
               
               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply); 
            }
         }

         ////////////////////////////////

         command="MAIL FROM:<"+email.getSender()+">";

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply); 


         Vector recipients=email.getAllRecipients();
         int numRecipients = recipients.size();
         EMailAddress recipient=null;
         for (int i=0; i<numRecipients; i++)
         {
            recipient=(EMailAddress)recipients.elementAt(i);
            command="RCPT TO:<"+recipient.getAddress()+">";

            sendCommand(mailWriter, command);
            response=readResponse(mailServerReply); 
         }

         command="DATA";

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply); 

         // Now we have to build the body of the message.
         StringBuffer temp=buildMessageHeader(email, uniqueBoundary);
         
         command=temp.toString();
         sendCommand(mailWriter, command);

         if (email.hasAttachments())
         {
            command="This e-mail is encoded in Mulit-part MIME format.\n"+
            "If you can read this text, your e-mail software does not \n"+
            "support Multi-part MIME messages.\n";
            sendCommand(mailWriter, command);

            command="--"+uniqueBoundary;
            sendCommand(mailWriter, command);
         }
         
         temp=buildMessageBody(email);

         command=temp.toString();
         sendCommand(mailWriter, command);

         if (email.hasAttachments())
         {
            Vector attachments=email.getAttachments();
            log.writeDebug ("EMail has "+attachments.size()+" attachments.");

            for (int i=0; i<attachments.size(); i++)
            {
               Object attach=attachments.elementAt(i);

               if (debug)
                  log.writeDebug ("Attaching "+i+" attach="+attach);

               command="--"+uniqueBoundary;
               sendCommand(mailWriter, command);

               mailWriter.flush(); // make sure the writer is flushed!!
               sendEncodedAttachment(attach, mailOutputStream);
            }

            // final boundary to terminate the message.
            command="--"+uniqueBoundary+"--";
            sendCommand(mailWriter, command);
         }
         
         // Terminate the message.
         command="\r\n.\r\n"; // This is the SMTP termination string.
         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply); 

         // Now, hang up.
         command="QUIT";
         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);
      }
      catch (UnknownHostException ex)
      {
         log.printStackTrace(ex);
         throw new MailException("Unable to connect to mail server at "+
                                 host+" port "+port, ex);
      }
      catch (InterruptedIOException ex) {
         log.writeError(1, "Socket read timeout of 12000ms reached. "+
                        "Some low level socket error", ex);
         throw new MailException("Socket read timeout (12000ms) reached "+
                                 "talking to "+host+":"+port, ex);
      }
      catch (IOException ex)
      {
         log.printStackTrace(ex);
         throw new MailException("An error occured writing to the mail "+
                                 "server at "+host+" port "+port, ex);
      }
      finally
      {
         try
         {
            // First close the relevant streams.
            if (mailWriter != null)
            {
               mailOutputStream.flush();
               mailWriter.flush();
               mailWriter.close();
            }
            if (mailServerReply != null)
            {
               mailServerReply.close();
            }
            // Then close the socket itself.
            if (mailSocket != null)
            {
               mailSocket.close();
            }
         }
         catch (Exception ex)
         {
            // Exception occured shutting down the sendMessage connection.
            throw new MailException ("An error has occured shutting down "+
                                     "the sendMessage connection.", ex);
         }
      }
      log.writeDebug ("Message Sent.");
   } // end sendMessage;


   /**
    * Attempts to Validate the userName and password supplied in the 
    * constructor.
    */
   public boolean validateLogin() throws MailException
   {
      Socket mailSocket=null;
      PrintWriter mailWriter=null;
      BufferedReader mailServerReply=null;
      OutputStream mailOutputStream=null;

      boolean valid=false;

      log.writeDebug ("Attempting to validate login.");

      if (empty(userID) ||
          empty(password))
      {
         throw new MailException ("No login information available.");
      }
      

      Vector response=null;
      String command=null;
      try
      {
         // Setup the IO streams to the mail server.
         mailSocket=new Socket(host, port);
         // true parm here makes writer autoflush.

         // This is used for attachments only.
         mailOutputStream=mailSocket.getOutputStream();
         // this is used for everything else;
         mailWriter=new PrintWriter(mailOutputStream, true);
         mailServerReply=new BufferedReader(new InputStreamReader(mailSocket.getInputStream()));

         response=readResponse(mailServerReply);

         command="HELO "+host;

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);

         /////////////  Attempt AUTH LOGIN if data is available //////////
         if (userID != null &&
             password != null)
         {
            String decoded=null;
            MailServerResponse msr=null;

            command="AUTH LOGIN";

            sendCommand(mailWriter, command);
            response=readResponse(mailServerReply);

            msr=(MailServerResponse)response.elementAt(0);
            if (msr.isError())
            {
               log.writeDebug ("AUTH LOGIN unsuccessful. ");
               valid=false;
               throw new 
                  MailException("Mail server does not support AUTH LOGIN.");
            }
            else
            {
               // Continue with AUTH LOGIN
               decoded=new String(Decoder.decodeBuffer(msr.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(userID.getBytes());
               command=encodeString(userID);

               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply);
               
               msr=(MailServerResponse)response.elementAt(0);
               decoded=new String(Decoder.decodeBuffer(msr.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(password.getBytes());
               command=encodeString(password);
               
               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply); 
               msr=(MailServerResponse)response.elementAt(0);
               if (msr.isError())
               {
                  valid=false;
                  throw new 
                     MailException("Invalid User ID or password.");
               }
               else
               {
                  valid=true;
               }
            }
         }

         // Now, hang up.
         command="QUIT";
         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);
      }
      catch (UnknownHostException ex)
      {
         throw new MailException("Unable to connect to mail server at "+
                                 host+" port "+port, ex);
      }
      catch (IOException ex)
      {
         throw new MailException("An error occured writing to the mail "+
                                 "server at "+host+" port "+port, ex);
      }
      finally
      {
         try
         {
            // First close the relevant streams.
            if (mailWriter != null)
            {
               mailOutputStream.flush();
               mailWriter.flush();
               mailWriter.close();
            }
            if (mailServerReply != null)
            {
               mailServerReply.close();
            }
            // Then close the socket itself.
            if (mailSocket != null)
            {
               mailSocket.close();
            }
         }
         catch (Exception ex)
         {
            // Exception occured shutting down the sendMessage connection.
            throw new MailException ("An error has occured shutting down "+
                                     "the sendMessage connection.", ex);
         }
      }
      log.writeDebug ("Validation Complete.");

      return valid;
   } // end sendMessage;


   /** Used for debugging. */
   private void printCommand(String s)
   {
      if (debug)
         log.writeDebug (3, "Sending: "+s);
   }

   /** used for debugging. */
   private void printResponse(String s)
   {
      if (debug)
         log.writeDebug (3, "Response: "+s);
   }

   private void printResponse(Vector v)
   {
      for (int i=0; i<v.size(); i++)
      {
         printResponse(v.elementAt(i).toString());
      }
   }
   
   /** 
    * Reads a response - possibly with multiple lines.  The format of a 
    * multi-line response is defined in RFC 821, Appendix E.  The 4the
    * char in a multi-line response will alwayse be '-' except for the 
    * last line!  <p>
    * 
    * ex:<p>
    * 123-Message 1<br>
    * 123-Message 2<br>
    * 123 The last message.<br>
    * <p>
    * Ref. RFC 812 Appendix E.
    */
   private Vector readResponse (BufferedReader br)
      throws IOException
   {
      String line=null;
      Vector response=new Vector();
      MailServerResponse msr=null;

      line=br.readLine();
      msr=new MailServerResponse(line);
      while (msr.hasMore())
      {
         response.addElement(msr);
         line=br.readLine();
         msr=new MailServerResponse(line);
      }
      response.addElement(msr);
      
      // Log, if debug is on.
      printResponse(response);
      
      return response;
   }

   /**
    *
    *
    */
   private void sendCommand(PrintWriter pw, String command)
      throws IOException 
   {
      // debug if necessary
      printCommand(command);
      
      // send to mail server
      pw.println(command);
   }


   /**
    *
    */
   private String encodeString(String s)
      throws IOException 
   {
      ByteArrayOutputStream baos=new ByteArrayOutputStream();
      Encoder.encodeBuffer(s.getBytes(), baos);
      String encoded=baos.toString();
      return encoded.substring(0, encoded.length()-2);
   }


   /**
    * Builds the message header including from, to, cc, subject, etc. 
    */
   private StringBuffer buildMessageHeader(EMailMessage email,
                                           String uniqueBoundary) 
      throws MailException
   {
      StringBuffer response=new StringBuffer();

      response.append("From: <"+email.getSender()+">\n");
      response.append("Reply-To: <"+email.getReplyTo()+">\n");
      response.append("Date: "+mailDateFormat.format(Calendar.getInstance().getTime())+"\n");


      // to list
      addHeaderList(response, "To: ", email.getRecipients());
      // cc list
      addHeaderList(response, "cc: ", email.getCC());

      // Subject
      response.append("Subject: "+email.getSubject()+"\n");

      response.append("MIME-version: 1.0\n");


      if (email.hasAttachments())
      {
         response.append("Content-Type: multipart/mixed;\n"+
                         "  boundary=\""+uniqueBoundary+"\"\n\n");
      }
      else 
      {
         response.append ("Content-Type: "+email.getContentType()+"\n\n");
         // Don't add the content type, the message body will do that.
      }

      return response;
   }

   /**
    * Builds the primary message body.
    */
   private StringBuffer buildMessageBody(EMailMessage email)
   {
      StringBuffer response=new StringBuffer();

      // tell it the content type
      if (email.hasAttachments())
         response.append("Content-Type: "+email.getContentType()+"\n\n");

      // Message body goes here.
      response.append(email.getMessage()+"\n");
      
      return response;
   }

   /**
    * This function will read information from the attachment and 
    * encode it in base64 for attachemnt to the e-mail.  Attachments
    * can be either a URL, or a File.  Could be anything you could
    * get a stream to. <p>
    *
    * <b>WARNING:</b> This class uses a class from the sun.misc.* package
    * that is only available on SUN VM's.
    *
    * @param attach The object representing the attachment.  Currently, File
    * and URL are supported attachment types.
    */
   private void sendEncodedAttachment(Object attach, OutputStream mos) 
      throws MailException
   {
      StringBuffer header=new StringBuffer();
      InputStream is=null;
      String filename=null;

      int bufferSize=4096;

      try
      {
         // Get the input stream based on type of attachment.
         if (attach instanceof File)
         {
            File file=(File)attach;
            FileInputStream fis=new FileInputStream(file);
            
            filename=file.getName();

            is=fis;
         }
         else if (attach instanceof URL)
         {
            // Get the url, then open the stream
            URL url=(URL)attach;
            InputStream urlis=url.openStream();

            filename=url.getFile();

            filename=filename.substring(filename.lastIndexOf("/")+1);
            if (debug)
               log.writeDebug (3, "URL is="+urlis);

            is=urlis;
            // Let's use a real big buffer for URL attachments to improve
            // performance as much as possible
            bufferSize=16384; // 16 k blocks.
         }
         else 
         {
            // Unsupported attachement.
            throw new MailException("Unsupported attachment type: "+
                                    attach.toString());
         }

         header.append("Content-Type: application/octet-stream;\n"+
                         "  name=\""+filename+"\"\n");

         header.append("Content-Transfer-Encoding: base64\n");
         header.append("Content-Disposition: attachment;\n"+
                         "  filename=\""+filename+"\"\n\n");

         mos.write(header.toString().getBytes());
         mos.flush();
         
         // Buffer the input for some speed, bigger buffer for network
         BufferedInputStream bis=new BufferedInputStream(is, bufferSize);

         // This baby is workin' for us.  It will read from the input
         // stream, and pipe the output (encoded) directly to the output stream
         Encoder.encodeBuffer(is, mos);

         mos.flush(); // Flush everything out.
      }
      catch (IOException ex)
      {
         throw new MailException("Error encoding file.", ex);
      }
      finally 
      {
         if (is != null)
         {
            try
            {
               is.close();
            }
            catch (Exception ex) {ex.printStackTrace();}
         }
      }
   }

   /**
    * Used to create the uniqueBoundary.
    */
   synchronized static private String getRandomString() 
   {
      long randomLong=randomGenerator.nextLong();
      // Make it posative
      if (randomLong < 0)
         randomLong=-randomLong;
      return ""+randomLong;
   }

   /**
    * Adds a list of recipients to the header of the e-mail.
    */
   private void addHeaderList(StringBuffer response, String listName, 
                              Vector list)
   {
      int size=list.size();

      if (size == 0)
         return; 

      response.append(listName);
      for (int i=0; i<size; i++)
      {
         EMailAddress address=(EMailAddress)list.elementAt(i);
         response.append(address.toString());
         
         if (i == size-1) // last line
            response.append("\n");
         else 
            response.append(", ");
      }
   }

   /**
    * Encapsulates an SMTP Mail Server response. <p>
    *
    * REF: RFC 821 Appendix E
    */
   private static class MailServerResponse
   {
      private String fullResponse="";
      private String code="xxx";
      private String text="Error";
      private boolean more=false;

      public MailServerResponse(String s)
      {
         fullResponse=s;
         if (s == null ||
             s.length() == 0)
         {
            // Error 
         }
         else
         {
            if (s.length() >= 3)
            {
               code=s.substring(0, 3);
            }
            if (s.length() >= 4)
            {
               if (s.charAt(3) == '-')
                  more = true;
               else
                  more = false;
            }
            if (s.length() >= 5)
               text=s.substring(4);
         }
      }

      public boolean hasMore() {return more;}

      public String getCode() {return code;}
      
      public String getText() {return text;}

      public boolean isError()
      {
         if (code.startsWith("5") ||
             code.startsWith("4"))
            return true;
         else
            return false;
      }


      public String toString()
      {
         return fullResponse;
      }
   }

   private static final boolean empty(String s)
   {
      if (s == null ||
          s.length() == 0)
         return true;
      else
         return false;
   }


   /**
    * Main is used for testing only.
    */ 
   public static void main(String args[])
   {
      debug=true;
      try
      {
         runTestCases();
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
      if (true) return;

      SMTPMailServer ms=new SMTPMailServer("mail.surfree.com", 25, 
                                           "bemowski", "ginger");

      StringBuffer message=new StringBuffer();
      message.append("Test Message.");

      String subject="this is the subject";

      Vector toVector=new Vector();
      toVector.addElement("bemowski@surfree.com");

      EMailMessage email=new EMailMessage("bemowski@surfree.com", toVector,
                                          subject, message);

      //email.addCC("pbemowski@z-tel.com");

      // Attach a file
      File file=new File("d:\\temp\\boot.ini");

      //email.attach(file);

      /*try
      {
         URL url=new URL("http://atldev00/audio/1771858201285598378.wav");

         System.out.println ("attaching "+url);
         email.attach(url);
      }
      catch (MalformedURLException ex)
      {
         ex.printStackTrace();
         }*/

      //file=new File("d:\\zline\\audio\\2051433948576863482.wav");
      //email.attach(file);

      try
      {
         ms.sendMessage(email);
      }
      catch (MailException ex)
      {
         ex.printStackTrace();
      }
   }


   private static void runTestCases()
      throws Exception 
   {
      StringBuffer message=new StringBuffer();
      message.append("Test Message from SMTPMailServer Test Cases.");

      String subject="SMTPMailServer Test Case";

      EMailMessage email=null;
      SMTPMailServer ms=null;

      log.writeDebug ("=====================================================");
      log.writeDebug ("=======  Testing Outbound  with Valid Login   =======");
      log.writeDebug ("=====================================================");
      
      email=new EMailMessage("bemowski@yahoo.com", "bemowski@yahoo.com",
                             subject, message);
      
      ms=new SMTPMailServer("macallan", 25); 
      // "support");
      ms.sendMessage(email);
      log.writeDebug ("=====================================================");
      log.writeDebug ("================  TEST COMPLETE     =================");
      log.writeDebug ("=====================================================");
      log.writeDebug ("\n\n");
   }
}
