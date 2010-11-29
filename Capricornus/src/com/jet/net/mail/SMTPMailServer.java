package com.jet.net.mail;


import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;


// This will ONLY work with sun VM's.
import sun.misc.*;

import com.jet.net.utils.Log;
import com.jet.utils.GUID;

/**
 * An implementation of the MailServer interface wrapped around
 * SMTP. <p>
 *
 * Attachments to e-mails are included as multi-part MIME attachments.
 * They are encoded in base64 (most standard encoding on the 'net) and
 * the mime-type is set to application/octet-stream. <p>
 *
 * <b>WARNING:</b> This class uses a base64 encoder that is encoded in the
 * sun.misc.* package.  This is available in most SUN and IBM virtual 
 * machines. <p>
 *
 * An example usage of this class would be:
 *
 * <pre>
 * EMailMessage message=new EMailMessage("me@myserver.com", "you@yourserver.com", "hello there", "this is a message from me to you.");
 * SMTPMailServer smtp=new SMTPMailServer("smtp.myserver.com", 25);
 * smtp.sendMessage(message);
 *
 * </pre>
 *
 * @author Paul Bemowski
 */
public class SMTPMailServer implements MailServer
{
   /** Mail server host. */
   private String host=null;
   /** Mail Server port, generally 25. */
   private int port=25;

   /** ESMTP mail server login id. */
   private String userID=null;
 
   /** ESMTP mail server password. */
   private String password=null;
  
   /** SO Timeout for socket read() operations */
   protected int soTimeout=30*1000; // 30 second default
   
   /** Date format used in the mail header. */
   private final MailDateFormat mailDateFormat=new MailDateFormat();
//    private final SimpleDateFormat mailDateFormat=
//    new SimpleDateFormat("dd MMM yyyy hhmm");
//   DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

   /** Toggles verbose mail debugging.  Set to true for verbose 
    * output regarding conversation with SMTP server. */
   public static boolean debug=false;

   /** Random number generator, seeded with the current time in millis. */
   private static Random randomGenerator=new Random(System.currentTimeMillis());

   /** This is a SUN specific BASE64 encoder.  It wants the endode methods
    * to be called on an instance, so I'll create a static final instance
    * for the e-mail server to use.  */
   private static final BASE64Encoder Encoder=new BASE64Encoder();

   private static final BASE64Decoder Decoder=new BASE64Decoder();

   private static final String CRLF="\r\n";

   /**
    * Constructs an interface to an SMTP mail service.
    * 
    * @param h Mail server host name (or IP).
    * @param p Mail sever port.  SMTP is usually served off of port 25.
    */
   public SMTPMailServer(String h, int p) {
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
    * Full constructor.  
    *
    * @param h Server host/ip.
    * @param p Server port.
    * @param u Username for AUTH LOGIN authentication.
    * @param w Password for AUTH LOGIN authentication.
    */
   public SMTPMailServer(String h, int p, String u, String w)
   {
      this(h, p);
      userID=u;
      password=w;
   }

   /** Sets the socket soTimeout -- the amount of time the socket will
    * block for on a read() operation.  For more information see
    * java.net.Socket.setSOTimeout().
    */
   public void setSoTimeout(int i) {soTimeout=i;}

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
      BufferedWriter mailWriter=null;
      BufferedReader mailServerReply=null;
      OutputStream mailOutputStream=null;

      // this is used to separate multi-part messages
      String uniqueBoundary="MIME_Boundary_"+getRandomString();

      Log.write("Attempting to send message.");

      MailServerResponse response=null;
      String command=null;
      try {
         // Setup the IO streams to the mail server.
         mailSocket=new Socket(host, port);
         // true parm here makes writer autoflush.
         mailSocket.setSoTimeout(soTimeout);

         // This is used for attachments only.
         mailOutputStream=mailSocket.getOutputStream();
         // this is used for everything else;
         mailWriter=new BufferedWriter(new OutputStreamWriter(mailOutputStream));
         mailServerReply=new BufferedReader(new InputStreamReader(mailSocket.getInputStream()));

         response=readResponse(mailServerReply);

         command="HELO "+host;

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);

         if (response.isError())
            throw new MailException("ServerError: "+response.toString(), 
                                    response);

         /////////////  Attempt AUTH LOGIN if data is available //////////
         if (userID != null &&
             password != null)
         {
            String decoded=null;
            command="AUTH LOGIN";

            sendCommand(mailWriter, command);
            response=readResponse(mailServerReply);

            if (response.isError()) {
               Log.write("AUTH LOGIN unsuccessful, "+
                         "attempting to continue.");
            }
            else {
               // Continue with AUTH LOGIN
               decoded=new String(Decoder.decodeBuffer(response.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(userID.getBytes());
               command=encodeString(userID);

               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply);
               
               decoded=new String(Decoder.decodeBuffer(response.getText()));
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

         if (response.isError())
            throw new MailException("ServerError: "+response.toString(), 
                                    response);

         Vector recipients=email.getAllRecipients();
         int numRecipients = recipients.size();
         EMailAddress recipient=null;
         for (int i=0; i<numRecipients; i++)
         {
            recipient=(EMailAddress)recipients.elementAt(i);
            command="RCPT TO:<"+recipient.getAddress()+">";

            sendCommand(mailWriter, command);
            response=readResponse(mailServerReply);
            
            if (response.isError())
               throw new MailException("ServerError: "+response.toString(),
                                       response);
         }

         command="DATA";

         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply); 

         if (response.isError())
            throw new MailException("ServerError: "+response.toString(), 
                                    response);

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
            Log.write("EMail has "+attachments.size()+" attachments.");

            for (int i=0; i<attachments.size(); i++)
            {
               Object attach=attachments.elementAt(i);

               if (debug)
                  Log.write("Attaching "+i+" attach="+attach);

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
         command=CRLF+"."; // This is the SMTP termination string.
         // the sendcommand method will write the trailing \r\n
         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply); 

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
      catch (InterruptedIOException ex) {
         throw new MailException("Socket read timeout (12000ms) reached "+
                                 "talking to "+host+":"+port, ex);
      }
      catch (IOException ex) {
         throw new MailException("An error occured writing to the mail "+
                                 "server at "+host+" port "+port, ex);
      }
      finally {
         try {
            // First close the relevant streams.
            if (mailWriter != null) {
               mailOutputStream.flush();
               mailWriter.flush();
               mailWriter.close();
            }
            if (mailServerReply != null) {
               mailServerReply.close();
            }
            // Then close the socket itself.
            if (mailSocket != null) {
               mailSocket.close();
            }
         }
         catch (Exception ex) {
            // Exception occured shutting down the sendMessage connection.
            throw new MailException ("An error has occured shutting down "+
                                     "the sendMessage connection.", ex);
         }
      }
      if (debug)
         Log.write ("Message Sent.");
   } // end sendMessage;


   /**
    * Attempts to Validate the userName and password supplied in the 
    * constructor.
    */
   public boolean validateLogin() throws MailException
   {
      Socket mailSocket=null;
      BufferedWriter mailWriter=null;
      BufferedReader mailServerReply=null;
      OutputStream mailOutputStream=null;

      boolean valid=false;

      if (debug)
         Log.write("Attempting to validate login.");

      if (empty(userID) ||
          empty(password))
      {
         throw new MailException ("No login information available.");
      }
      
      MailServerResponse response=null;
      String command=null;
      try
      {
         // Setup the IO streams to the mail server.
         mailSocket=new Socket(host, port);
         // true parm here makes writer autoflush.

         // This is used for attachments only.
         mailOutputStream=mailSocket.getOutputStream();
         // this is used for everything else;
         mailWriter=new BufferedWriter(new OutputStreamWriter(mailOutputStream));
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

            if (response.isError()) {
               Log.write ("AUTH LOGIN unsuccessful. ");
               valid=false;
               throw new 
                  MailException("Mail server does not support AUTH LOGIN.");
            }
            else {
               // Continue with AUTH LOGIN
               decoded=new String(Decoder.decodeBuffer(response.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(userID.getBytes());
               command=encodeString(userID);

               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply);
               
               decoded=new String(Decoder.decodeBuffer(response.getText()));
               printResponse("Decoded: '"+decoded+"'");
               
               // command=Encoder.encodeBuffer(password.getBytes());
               command=encodeString(password);
               
               sendCommand(mailWriter, command);
               response=readResponse(mailServerReply); 

               if (response.isError()) {
                  valid=false;
                  throw new 
                     MailException("Invalid User ID or password.");
               }
               else {
                  valid=true;
               }
            }
         }

         // Now, hang up.
         command="QUIT";
         sendCommand(mailWriter, command);
         response=readResponse(mailServerReply);
      }
      catch (UnknownHostException ex) {
         throw new MailException("Unable to connect to mail server at "+
                                 host+" port "+port, ex);
      }
      catch (IOException ex) {
         throw new MailException("An error occured writing to the mail "+
                                 "server at "+host+" port "+port, ex);
      }
      finally {
         try {
            // First close the relevant streams.
            if (mailWriter != null) {
               mailOutputStream.flush();
               mailWriter.flush();
               mailWriter.close();
            }
            if (mailServerReply != null) {
               mailServerReply.close();
            }
            // Then close the socket itself.
            if (mailSocket != null) {
               mailSocket.close();
            }
         }
         catch (Exception ex) {
            // Exception occured shutting down the sendMessage connection.
            throw new MailException ("An error has occured shutting down "+
                                     "the sendMessage connection.", ex);
         }
      }
      if (debug)
         Log.write("Validation Complete.");

      return valid;
   } // end sendMessage;


   /** Used for debugging. */
   private void printCommand(String s)
   {
      if (debug)
         Log.write("Sending: "+s);
   }

   /** used for debugging. */
   private void printResponse(String s)
   {
      if (debug)
         Log.write("Response: "+s);
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
   private MailServerResponse readResponse (BufferedReader br)
      throws IOException
   {
      String line=null;
      MailServerResponse msr=null;

      line=br.readLine();
      msr=new MailServerResponse(line);
      while (msr.hasMore()) {
         line=br.readLine();
         msr.addLine(line);
      }
      
      // Log, if debug is on.
      // printResponse(msr);
      
      return msr;
   }

   /**
    *
    *
    */
   private void sendCommand(BufferedWriter bw, String command)
      throws IOException 
   {
      // debug if necessary
      printCommand(command);
      
      // send to mail server
      bw.write((command+CRLF).toCharArray());
      bw.flush();
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

      response.append("From: <"+email.getSender()+">"+CRLF);
      response.append("Reply-To: <"+email.getReplyTo()+">"+CRLF);
      String dateline="Date: "+mailDateFormat.format(new Date())+CRLF;
      Log.write("Mail date line: \n"+dateline);
      response.append(dateline);


      // to list
      addHeaderList(response, "To: ", email.getRecipients());
      // cc list
      addHeaderList(response, "cc: ", email.getCC());

      // Subject
      response.append("Subject: "+email.getSubject()+CRLF);

      response.append("MIME-version: 1.0"+CRLF);

      if (email.hasAttachments()) {
         response.append("Content-Type: multipart/mixed;"+CRLF+
                         "  boundary=\""+uniqueBoundary+"\""+
                         CRLF+CRLF);
      }
      else {
         response.append ("Content-Type: "+email.getContentType()+
                          CRLF+CRLF);
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
         response.append("Content-Type: "+email.getContentType()+
                         CRLF+CRLF);

      // Message body goes here.
      response.append(email.getMessage()+CRLF);
      
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
   private void sendEncodedAttachment(Object attach, 
                                      OutputStream mos) 
      throws MailException
   {
      StringBuffer header=new StringBuffer();
      InputStream is=null;
      String filename=null;

      int bufferSize=4096;

      try {
         // Get the input stream based on type of attachment.
         if (attach instanceof File) {
            File file=(File)attach;
            FileInputStream fis=new FileInputStream(file);
            
            filename=file.getName();

            is=fis;
         }
         else if (attach instanceof URL) {
            // Get the url, then open the stream
            URL url=(URL)attach;
            InputStream urlis=url.openStream();

            filename=url.getFile();

            filename=filename.substring(filename.lastIndexOf("/")+1);
            if (debug)
               Log.write("URL is="+urlis);

            is=urlis;
            // Let's use a real big buffer for URL attachments to improve
            // performance as much as possible
            bufferSize=16384; // 16 k blocks.
         }
         else {
            // Unsupported attachement.
            throw new MailException("Unsupported attachment type: "+
                                    attach.toString());
         }

         header.append("Content-Type: application/octet-stream;"+CRLF+
                         "  name=\""+filename+"\""+CRLF);

         header.append("Content-Transfer-Encoding: base64"+CRLF);
         header.append("Content-Disposition: attachment;"+CRLF+
                         "  filename=\""+filename+"\""+CRLF+CRLF);

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
      return (new GUID()).toString();
//       long randomLong=randomGenerator.nextLong();
//       // Make it posative
//       if (randomLong < 0)
//          randomLong=-randomLong;
//       return ""+randomLong;
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
            response.append(CRLF);
         else 
            response.append(", ");
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

      Log.write ("=====================================================");
      Log.write ("=======  Testing Outbound  with Valid Login   =======");
      Log.write ("=====================================================");
      
      email=new EMailMessage("bemowski@yahoo.com", "bemowski@yahoo.com",
                             subject, message);
      
      ms=new SMTPMailServer("macallan", 25); 
      // "support");
      ms.sendMessage(email);
      Log.write ("=====================================================");
      Log.write ("================  TEST COMPLETE     =================");
      Log.write ("=====================================================");
      Log.write ("\n\n");
   }
}
