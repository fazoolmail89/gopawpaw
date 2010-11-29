package com.jet.net.mail;

import java.net.*;
import java.io.*;
import java.util.*;

import java.text.*;

import com.jet.net.utils.*;

// This will ONLY work with sun VM's.
import sun.misc.*;

/*
 * $Log: POP3MailServer.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2001/05/27 18:45:39  bemocvs
 * javadoc updates
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * A Class wrapping a POP3 mail server.  Each instance of this class will 
 * represent a stateful session with the server, and as such is NOT thread
 * safe. <p>
 *
 * This class currently supports basic login, and the retrieval of 
 * complete and lightweight messages.  Multi-part messages are currently
 * NOT supported. <p>
 *
 * For further information on the use of this API, see the example available
 * at http://www.jetools.com.
 *
 * @author Paul Bemowski
 */
public class POP3MailServer
{
   /** */
   private String host=null;

   /** */
   private int port=110;

   /** */
   private BufferedReader mailReader=null;
   
   /** */
   private PrintWriter mailWriter=null;

   /** */
   private Vector messageIDs=null;
   
   /** */
   private Socket mailSocket=null;

   /** */
   private String user=null;

   /** */
   private String pass=null;

   /** This is a public static debugging variable.  If you would like to
    * see the conversation with the server, set this variable to true.
    * All logging is accomplished via the com.jet.net.utils.Log class. */
   public static boolean debug=false;

   /**
    * Constructs an interface to an POP3 mail service.
    * 
    * @param h Mail server host name (or IP).
    * @param p Mail sever port.  POP3 is usually served off of port 110.
    */
   public POP3MailServer(String h, int p) {
      host = h;
      port = p;
   }

   /**
    * Simple constructor.  Defaults to port 110.
    * @param h Mail server host name (or IP).
    */
   public POP3MailServer(String h) {
      this (h, 110);
   }

   /** Constructs a POP3 server with username and password for 
    * authentication. 
    * @param ho Mail server host.
    * @param po Mail server port.
    * @param us Mail server username. 
    * @param pa Mail server password. */
   public POP3MailServer(String ho, int po, String us, String pa) {
      this(ho, po);
      user=us;
      pass=pa;
   }

   /**
    * Authenticates the user that was passed into the constructor. 
    */
   public void authenticate()
      throws MailException {
      authenticate (user, pass);
   }

    
   /**
    * Authenticates the user with the supplied password.
    */
   public void authenticate(String us, String pa)
      throws MailException
   {
      user=us;
      pass=pa;

      if (!isOpen())
         open();

      try {
         String command=null;
         String response=null;

         command="USER "+user;
         if (debug)
            Log.write("Command: "+command);
         mailWriter.println (command);
         
         
         response=mailReader.readLine();
         if (debug)
            Log.write("Response: "+response);
         
         if (!isOk(response))
            throw new MailException("User "+user+" not recognized: "+response);
         
         command="PASS "+pass;
         if (debug)
            Log.write ("Command: "+command);
         mailWriter.println (command);

         response=mailReader.readLine();
         if (debug)
            Log.write("Response: "+response);
         
         if (!isOk(response))
            throw new MailException("User "+user+" entered invalid password: "+
                                    response);
      } catch (Exception ex) {
         if (debug)
            Log.write(ex);
         throw new MailException("Error authenticating user "+user);
      }
   }
   
   /** Generally indicates whether the user has been authenticaed yet. */
   public boolean isOpen()
   {
      if (mailReader != null &&
          mailWriter != null)
         return true;
      else
         return false;
   }

   /** */
   private boolean isOk(String response)
   {
      if (response.startsWith("+OK"))
         return true;
      else
         return false;
   }


   /** 
    * Open the necessary streams.  
    * This does NOT mean that you are authenticated yet.
    */
   public void open()
      throws MailException
   {
      try {
         mailSocket=new Socket(host, port);

         mailReader=new BufferedReader(new InputStreamReader(mailSocket.getInputStream()));
         
         String response=mailReader.readLine();
         if (debug)
            Log.write("Initial response: "+response);
         if (!isOk(response))
            throw new MailException("Response from server was not +OK");
         

         mailWriter=new PrintWriter(new OutputStreamWriter(mailSocket.getOutputStream()), true); // autoflushing writer
      } catch (Exception ex) {
         throw new MailException("Unable to open mail connection to "+host+
                                 " and port "+port);
      }
   }
   
   /** Closes down the POP Connection. */
   public void close()
      throws MailException
   {
      if (!isOpen())
         throw new MailException("Attempt to close session that is not open.");

      try {
         // quit the session.
         mailWriter.println ("QUIT");
         
         mailWriter.close();
         mailWriter = null;

         mailReader.close();
         mailReader = null;

         mailSocket.close();
         mailSocket = null;
      } catch (Exception ex) {
         if (debug)
            Log.write(ex);
         throw new MailException("Unable to close connection to "+
                                 host+" on port "+port);
      }
   }
   
   /**
    * We need to maintain a connection, but it is likely that the mail
    * server will shut us down after a brief period.  For "fault tolerance"
    * all method calls that catch IOExcepitons will attempt to 
    * reconnect() and call the method again.
    */
   private void reconnect()
      throws MailException
   {
      if (mailReader != null) {
         try {
            mailReader.close();
         } catch (IOException ex) {
            // ignore for now
         }
      }

      if (mailWriter != null) {
         //try {
            mailWriter.close();
            //} catch (IOException ex) {
            // ignore for now
            //}
      }

      if (mailSocket != null) {
         try {
            mailSocket.close();
         } catch (IOException ex) {
            // ignore for now
         }
      }

      // ok, re-open and re-authenticate
      // allow the exceptions to throw thru

      open();

      authenticate();
   }

   /** 
    * Retrieves the message count on the current connection (after a
    * user has been authenticated). 
    */
   public int getMessageCount()
      throws MailException
   {
      if (messageIDs == null)
      {
         if (!isOpen())
            throw new MailException("Mail connection is not currently open. "+
                                    "Please authenticate().");

         try {
            String command="LIST";
            String response=null;

            if (debug)
               Log.write ("Command: "+command);
            mailWriter.println (command);

            messageIDs=new Vector();
         
            response=mailReader.readLine();
            if (!isOk(response))
               throw new MailException("Error listing messages: "+response);

            response=mailReader.readLine();
            while (!response.startsWith("."))
            {
               StringTokenizer st=new StringTokenizer(response, " ", false);
               int id=Integer.parseInt(st.nextToken().trim());
               int size=Integer.parseInt(st.nextToken().trim());

               MessageID mid=new MessageID(id, size);
               messageIDs.addElement(mid);

               response=mailReader.readLine();
            }
         } 
         catch (IOException ex) {
            // could be that the server timed out.  let's try to reconnect
            try {
               reconnect();
               return getMessageCount();
            }
            catch (Exception exx) {
               // ok, we tried. Throw an exception
               throw new MailException ("Error listing messages on "+
                                        "re-submission",exx);
            }
         }
         catch (Exception ex) {
            if (debug)
               Log.write(ex);
            throw new MailException("Error listing messages.", ex);
         }
      }
      
      return messageIDs.size();
   }

   /**
    * Returns the size of a message.
    * @param index The message index on this pop server.
    * @return The size of the message in bytes. 
    */
   public int getSize(int index)
      throws MailException
   {
      int size=-1;

      try {
         String command=null;
         String response=null;
         
         command="LIST "+index;
         if (debug)
            Log.write("Command "+command);
         mailWriter.println (command);

         response=mailReader.readLine();
         if (!isOk(response))
            throw new MailException("POP3MailServer.getSize(): "+
                                    "Unable to get size for "+
                                    "message "+index+": "+
                                    response);
         // parse out the size
         
         StringTokenizer st=new StringTokenizer(response, " ", false);
         if (st.countTokens() != 3)
            throw new MailException("POP3MailServer.getSize(): "+
                                    "Cannot understand the server response "+
                                    response);
         st.nextToken();
         st.nextToken();
         String s=st.nextToken();
         try {
            size=Integer.parseInt(s.trim());
         }
         catch (NumberFormatException ex) {
            throw new MailException("POP3MailServer.getSize(): "+
                                    "Cannot understand the server response "+
                                    response);
         }
      }
      catch (IOException ex) {
         // could be that the server timed out.  let's try to reconnect
         try {
            reconnect();
            return getSize(index);
         }
         catch (Exception exx) {
            // ok, we tried. Throw an exception
            throw new MailException ("Error getting message size on "+
                                     "re-submission",exx);
         }
      }
      catch (Exception ex) {
         throw new MailException("Unable to get message size", ex);
      }
      return size;
   }

   /**
    * Returns a message UIDL. 
    */
   public String getUIDL(int index)
      throws MailException
   {
      String uidl=null;

      try {
         String command=null;
         String response=null;
         
         command="UIDL "+index;
         if (debug)
            Log.write("Command "+command);
         mailWriter.println (command);

         response=mailReader.readLine();
         if (!isOk(response))
            throw new MailException("POP3MailServer.getUIDL(): "+
                                    "Unable to get size for "+
                                    "message "+index+": "+
                                    response);
         // parse out the size
         
         StringTokenizer st=new StringTokenizer(response, " ", false);
         if (st.countTokens() != 3)
            throw new MailException("POP3MailServer.getUIDL(): "+
                                    "Cannot understand the server response "+
                                    response);
         st.nextToken();
         st.nextToken();
         uidl=st.nextToken().trim();
      }
      catch (IOException ex) {
         // could be that the server timed out.  let's try to reconnect
         try {
            reconnect();
            return getUIDL(index);
         }
         catch (Exception exx) {
            // ok, we tried. Throw an exception
            throw new MailException ("Error getting message size on "+
                                     "re-submission",exx);
         }
      }
      catch (Exception ex) {
         throw new MailException("Unable to get message size", ex);
      }

      return uidl;
   }

   /**
    * Returns a Vector of available lightweight messages.  A lightweight
    * message does have meta data attached to it, however it does not have
    * a message body.
    */
   public Vector getLightweightMessages()
      throws MailException {
      int messageCount=getMessageCount();

      Vector messages=new Vector();
      for (int i=1; i<=messageCount; i++)
      {
         EMailMessage message=getLightweightMessage(i);
         messages.addElement(message);
      }

      return messages;
   }

   /**
    * This will parse a "lightweight" message. For our purposes here, we'll
    * define a lightweight message all of the headers (from, to, subject, etc)
    * and the first X lines of the message.  The first X lines will form
    * a "preview" of the message.  We should know if the message contains
    * attachements, but we may not know how many, or the sizes of each.
    *
    * @param index The POP3 index of the message in question.
    * @return A partially formed EMailMessage object.
    */
   public EMailMessage getLightweightMessage(int index)
      throws MailException
   {
      EMailMessage message=null;
     
      // try to get size and uidl
      MessageMetaData metaData=null;
      int size=-1;
      String uidl=null;
      try {
         size=getSize(index);
      }
      catch (Exception ex) {
         if (debug)
            Log.write(ex);
         // don't throw here, let's log the error and continue
      }

      try {
         uidl=getUIDL(index);
      }
      catch (Exception ex) {
         // don't throw here, let's log the error and continue
         if (debug)
            Log.write(ex);
      }

      metaData=new MessageMetaData(size, uidl, host, port);

      try {
         String command=null;
         String response=null;
         
         command="TOP "+index+" "+1;
         if (debug)
            Log.write("Command "+command);
         mailWriter.println (command);

         response=mailReader.readLine();
         if (!isOk(response))
            throw new MailException("LightweightMessage: Unable to retrieve "+
                                    "message "+index+": "+
                                    response+".  Your POP3 mail server may not "+
                                    "have implemented the 'TOP' command.");
         message=new EMailMessage();

         message.setMetaData(metaData);

         populateHeaders(message, mailReader);
         
         readFully(mailReader);

      }
      catch (IOException ex) {
         // could be that the server timed out.  let's try to reconnect
         try {
            reconnect();
            return getMessage(index);
         }
         catch (Exception exx) {
            // ok, we tried. Throw an exception
            throw new MailException ("Error getting message "+index+" on "+
                                     "re-submission", exx);
         }
      }
      catch (Exception ex) {
         if (debug)
            Log.write(ex);
         throw new MailException("Error getting message "+index, ex);
      }

      return message;
   }

   /**
    * Populates the mail headers from an inbound message stream. 
    */
   private void populateHeaders(EMailMessage message, 
                                BufferedReader mailServerStream)
      throws Exception
   {
      MessageHeaderTokenizer mht=new MessageHeaderTokenizer(mailServerStream);
      Pair header=mht.nextHeader();
      while(header != null)
      {
         //System.out.println ("Header '"+header.key()+"' = '"+
         //                    header.value()+"'"); 
            
         // weed out the important headers, just append the rest
         if (header.key().equalsIgnoreCase("Return-Path:"))
         {
            message.setSender(header.value());
         }
         else if (header.key().trim().equalsIgnoreCase("From:"))
         {
            message.setSender(header.value());
         }
         else if (header.key().equalsIgnoreCase("To:"))
         {
            message.setTo(header.value());
         }
         else if (header.key().equalsIgnoreCase("cc:"))
         {
            message.setCC(header.value());
         }
         else if (header.key().equalsIgnoreCase("Subject:"))
         {
            message.setSubject(header.value());
         }
         else if (header.key().equalsIgnoreCase("Content-type:"))
         {
            message.setContentType(header.value());
         }
         else if (header.key().equalsIgnoreCase("Date:"))
         {
            // parse that thing, this will be difficult
         }
         else
         {
            // add to misc headers
            // save for future.  We may want to start separating
            // out message behavior into an object hierarchy.
            // message.addHeader(header);
         }

         header=mht.nextHeader();
      }
   }

   /**
    * Retrieves a full message -- including attachments, etc.
    *
    * This method does not currently support multipart mime attachments.
    *
    * @param index The index of the message.
    * @return The EMailMessage object corresponding to this message.
    */
   public EMailMessage getMessage(int index)
      throws MailException
   {
      EMailMessage message=null;
     
      // try to get size and uidl
      MessageMetaData metaData=null;
      int size=-1;
      String uidl=null;
      try {
         size=getSize(index);
      }
      catch (Exception ex) {
         // don't throw here, let's log the error and continue
         if (debug)
            Log.write(ex);
      }

      try {
         uidl=getUIDL(index);
      }
      catch (Exception ex) {
         // don't throw here, let's log the error and continue
         if (debug)
            Log.write(ex);
      }

      metaData=new MessageMetaData(size, uidl, host, port);

      try {
         String command=null;
         String response=null;
         
         command="RETR "+index;
         if (debug)
            Log.write("Command "+command);
         mailWriter.println (command);

         response=mailReader.readLine();
         if (!isOk(response))
            throw new MailException("LightweightMessage: Unable to retrieve "+
                                    "message "+index+": "+
                                    response+".  Your POP3 mail server may not "+
                                    "have implemented the 'TOP' command.");
         message=new EMailMessage();

         message.setMetaData(metaData);

         populateHeaders(message, mailReader);

         // OK, the pointer on this stream is pointing to the very top of 
         // message, we've skipped the headers.  The format will be 
         // very different depending on the message type.

         if (debug)
            Log.write("Message content type='"+
                      message.getContentType()+"'");

         // messages with attachments: 
         if (message.getContentType().startsWith("multipart"))
         {
            // here is the real problem.
            // get the boundary, and at least read the header, and
            // the first message.  
            
            // for attachments, we should probably decode and stream
            // to disk directly?? We'll need an attachments directory
            // in the local message store.

            // PUNT!!
            StringBuffer sb=new StringBuffer();
            sb.append("This message is in multipart/mime format.\n"+
                      "At this time this reader cannot deal with such "+
                      "messages.  It generally indicates that the message "+
                      "has attachments.");

            message.setMessage(sb);
         }
         else if (message.getContentType().startsWith("text/plain"))
         {
            StringBuffer mb=readFully(mailReader);
            message.setMessage(mb);
         }
         else if (message.getContentType().startsWith("text/html"))
         {
            StringBuffer mb=readFully(mailReader);
            message.setMessage(mb);
            // for now.
         }
         else 
         {
            // error?? just read it??
         }
      }
      catch (Exception ex) {
         if (debug)
            Log.write(ex);
         throw new MailException("Error reading messages... ", ex);
      }

      return message;
   }
   
   /**
    * Retrieves all messages on this server.
    *
    * This could be a VERY expensive method.
    *
    * Not currently implemented. 
    */
   private Vector getMessages()
      throws MailException
   {      
      return null;
   }

   private static StringBuffer readFully(BufferedReader br)
      throws IOException
   {
      StringBuffer sb=new StringBuffer();
      String line=br.readLine();
      sb.append(line+"\n");

      while (line != null &&
             !line.trim().equals("."))
      {
         line=br.readLine();
         sb.append(line+"\n");
         // System.out.println ("Line: '"+line+"'");
      }
      return sb;
   }

   ///////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////
   /**
    *
    */
   private static class MessageID
   {
      int index=-1;
      int size=0;

      public MessageID(int i, int s)
      {
         index=i;
         size=s;
      }
      
      public int getSize() {return size;}
      public int getIndex() {return index;}
   }
}

