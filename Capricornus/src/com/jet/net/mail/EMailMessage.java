package com.jet.net.mail;

import java.io.*;
import java.util.*;
import java.net.*;

// import com.jet.utils.GUID;

import com.jet.net.utils.Log;

/**
 * This class encapsulates a complete e-mail message.  The message could be
 * inbound from a POP or IMAP server, or outbound on it's way to an 
 * SMTP server.  All messages can include the following parts, but may not
 * necessarily contain all of the parts: <p>
 * <ul>
 *  <li>Sender </li>
 *  <li>List of recipients </li>
 *  <li>List of carbon copies </li>
 *  <li>List of blind carbon copies </li>
 *  <li>Message text - with the ability to set content mime type </li>
 *  <li>A list of attached files (any format: txt, wav, mp3, doc, etc)</li>
 *  <li>If the message is inbound, this may also include a 
 *  MessageMetaData object with some additional inforamation about the
 *  message. </li>
 * </ul>
 * <p>
 *
 * This is primarily a data holding and formatting class.  Currently, I don't
 * envision this class having knowledge of mail servers, ports, the 
 * type of mail server (SMTP, POP, IMAP, or whatever).  This class will
 * work in conjunction with some type of mailing engine.  Depending on the
 * mailing engine, the attachment encoding may differ. <p>
 * 
 * @author Paul Bemowski
 */
public class EMailMessage implements Serializable
{
   // protected String messageId="<"+((new GUID()).toString()+"@"++">";
   protected EMailAddress sender=null;
   protected EMailAddress replyTo=null;

   /** Vector of EMailAddress objects. */
   protected Vector toVector=new Vector();
   /** Vector of EMailAddress objects. */
   protected Vector ccVector=new Vector();
   /** Vector of EMailAddress objects. */
   protected Vector bccVector=new Vector();

   protected String subject=null;
   protected StringBuffer message=null;

   String contentType="text/plain"; // Default, should work for most messages

   /** This will be a vector of java.io.File objects, accessable to the 
    * file system of the sending machine.  We may also make these url's
    * so that a user would be able to forward a web page to someone. */
   Vector attachments=new Vector();

   /** MessageMetaData is information about a message.  This 
    * data will only be available for inbound messages -- messages
    * retrieved from a pop3 or imap server. 
    */
   protected MessageMetaData metaData=null;

   /** Used by the delivery server to tell how many times the server
    * attempted to send this message. */
   private int deliveryAttempts=0;

   /**
    * Full constructor. 
    *
    * @param s E-mail address of sender. 
    * @param reply E-mail address that the recipient should reply to if 
    * different than the sender.
    * @param to Vector or csv String of e-mail address strings that the 
    * e-mail should be sent to.
    * @param cc Vector or csv String of cc e-mail addresses.
    * @param bcc Vector or csv String of bcc e-mail addresses.
    * @param sub Subject line.
    * @param sb Message body.
    */
   public EMailMessage(String s, String reply, Object to, Object cc, 
                       Object bcc, String sub, StringBuffer sb)
   {
      if (s != null)
         sender=new EMailAddress(s);
      if (reply != null)
         replyTo=new EMailAddress(reply);
      if (sub != null)
         subject=sub;
      if (sb != null)
         message=sb;
 
      this.setRecipients(to);
      this.setCC(cc);
      this.setBCC(bcc);
   }

   /**
    * Simple constructor for most commonly used mail format. 
    * 
    * @param s E-mail address of sender. 
    * @param to Vector of e-mail address strings that the e-mail should 
    * be sent to.
    * @param sub Subject line.
    * @param sb Message body.
    */
   public EMailMessage (String s, Vector to, String sub, StringBuffer sb)
   {
      this(s, null, to, null, null, sub, sb);
   }

   /**
    * Simple constructor. 
    * @param from Email address of sender.
    * @param to Single email address, or comma separated list.
    * @param sub The email's subject.
    * @param body The email's body -- this should be text/plain, unless
    * you later reset the content type with a method call.
    */
   public EMailMessage (String from, String to, String sub, StringBuffer body)
   {
      this (from, null, to, null, null, sub, body);
   }

   /**
    * This simple constructor is very useful.  Takes arguments from, to,
    * subject, and message body; all in the form of Strings.
    * @param from Email address of sender.
    * @param to Single email address, or comma separated list.
    * @param sub The email's subject.
    * @param body The email's body -- this should be text/plain, unless
    * you later reset the content type with a method call.
    */
   public EMailMessage(String from, String to, String sub, String body) {
      this(from, to, sub, new StringBuffer(body));
   }

   /**
    * Empty constructor.  Must call setters to build minimum set of 
    * parameters.
    */
   public EMailMessage()
   {
      this (null, null, null, null, null, null, null);
   }

   /** Increments the delivery attempts variable.  This is an internal
    * tracking state for mail servers. */
   public void addDeliveryAttempt() {deliveryAttempts ++;}
   
   /** Returns the total delivery attempts, works with addDeliveryAttempt(). */
   public int getDeliveryAttempts() {return deliveryAttempts;}

   /** This returns the first recipient and the subject line.  A simple
    * representation of the object for the purposes of debugging. */
   public String toString() {
      // we want something concise, and representative here.  I'm 
      // going to go with the first recipient, and the subject line.
      StringBuffer mess=new StringBuffer();
      mess.append("email: ");
      if (toVector != null &&
          toVector.size() > 0){
         mess.append("to: "+toVector.elementAt(0).toString());
      }
      else {
         mess.append("null recipient?");
      }
      if (subject != null) {
         if (subject.length() > 15)
            mess.append(" sub: "+subject.substring(0, 14)+"...");
         else
            mess.append(" sub: "+subject);
      }
      else 
         mess.append("empty subject.");
      return mess.toString();
   }

   /** */
   private Vector csToVector(String list)
   {
      Vector vList=new Vector();

      if (list.indexOf(",") != -1 ||
          list.indexOf(";") != -1)
      {
         // StringTokenizer st=new StringTokenizer(list, ",", false);
         AddressTokenizer st=new AddressTokenizer(list);
         while (st.hasMoreTokens())
            vList.addElement(st.nextToken().trim());
      }
      else
         vList.addElement(list);
      
      return vList;
   }
   
   /**
    *
    */
   private Vector csToAddresses(String list)
   {
      Vector vList=new Vector();
      if (list.indexOf(",") != -1)
      {
         // StringTokenizer st=new StringTokenizer(list, ",", false);
         AddressTokenizer st=new AddressTokenizer(list);
         while (st.hasMoreTokens())
            vList.addElement(new EMailAddress(st.nextToken().trim()));
      }
      else
         vList.addElement(new EMailAddress(list));
      
      return vList;
   }

   /**
    *
    */
   private Vector stringsToAddresses(Vector v)
   {
      Vector add=new Vector();
      for (int i=0; i<v.size(); i++)
      {
         Object o=v.elementAt(i);
         if (o instanceof String)
            add.addElement(new EMailAddress((String)o));
         else if (o instanceof EMailAddress)
            add.addElement(o);
         else
         {
            // unsupported type.  ignore
         }
      }
      return add;
   }
   
   /**
    * Resets all of the message's internal state variables so that the
    * object can be reused. 
    */
   public void reset()
   {
      sender=null;
      replyTo=null;
      toVector=new Vector();
      ccVector=new Vector();
      bccVector=new Vector();

      subject=null;
      message=null;

      // Clear attachments.
      attachments=new Vector();
      deliveryAttempts=0;
   }


   /**
    * The only two relevant types are 'text/plain' and 'text/html'.  If 
    * the message has attachments, this will be overridden with 
    * a content type of multipart.  <p>
    *
    * The default type is text/plain.  
    * @param s The content type of the message.
    */
   public void setContentType(String s) {
      contentType=s.trim();
   }

   /** Returns the current content type. */
   public String getContentType() {return contentType;}

   /** Attaches a file to the message.  The file is not read into the 
    * object, rather a file pointer is held until the time the message
    * is sent, when it is attached as a uuencoded file.
    *
    * @param file The file to be attached to this email.
    * @return A boolean indicating wheather the attachement was successful.
    * The file must exist on the filesystem to be attached.
    */
   public boolean attach(File file)
   {
      // Check to see if the file exists
      if (file.exists()) {
         attachments.addElement(new File(file.getAbsolutePath()));
         return true;
      }
      else {
         return false;
      }
   }
   
   /** Attaches a URL to this message.  The URL will be pulled and included. 
    * @param url A url to a resource to be attached to this email.
    * @return true if the url is well formed, false if not. 
    */
   public boolean attach(URL url)
   {
      try
      {
         attachments.addElement(new URL(url.toString()));
         return true;
      }
      catch (MalformedURLException ex)
      {
         return false;
      }
   }

   /** Sets the message content.
    * @param sb A string buffer containing the message body. */
   public void setContent(StringBuffer sb)
   {
      message=sb;
   }

   /** Returns a vector of File and URL objects that represents 
    * resources attached to this object. 
    * @return Vector of Files and URLs attached to this message. */
   public Vector getAttachments() {return attachments;}

   /** The method used to sent the mail message via SMTP is slightly different
    * for messages with attachments. */
   public boolean hasAttachments() 
   {
      if (attachments == null ||
          attachments.size() == 0)
         return false;
      else
         return true;
   }

   /** Appends a to the current message body.  
    * @param s A string to be attached to the message. */
   public void append(String s)
   {
      if (message == null)
         message=new StringBuffer();

      message.append(s);
   }

   /** Returns the MessageMetaData.  This data is ONLY available on inbound
    * POP3 Messages.  */
   public MessageMetaData getMetaData() {return metaData;}

   /** */
   void setMetaData(MessageMetaData mmd) {metaData=mmd;}

   /** Indicates who the message is From. Same as setSender().
    * @param s String representing who the message is from, most likely
    * an email address. */
   public void setFrom(String s) {setSender(s);}

   /** Indicates who the message is From.  Same as setFrom(). 
    * @param s String representing who the message is from, most likely
    * an email address. */
   public void setSender(String s) { sender =new EMailAddress(s); }

   /** Set the sender. */
   public void setSender(EMailAddress s) { sender = s; }

   /** Returns the email address of the sender. */
   public String getSender() { return sender.getAddress(); }

   /** Sets the ReplyTo header.  If this is not set, it is synonymous
    * with the sender or From header.  If it is set, the two are different. */
   public void setReplyTo(String s) { replyTo=new EMailAddress(s); }

   /** Sets the reply-to as an EMailAddress object. */
   public void setReplyTo(EMailAddress ema) {replyTo=ema;}

   /** Returns either what ReplyTo was set to, or what Sender/From was
    * set to if ReplyTo was not set. */
   public String getReplyTo() 
   {
      if (replyTo == null) 
         return sender.getAddress();
      else
         return replyTo.getAddress(); 
   }
   
   /**
    * This method is used internally by the outbound message servers.  It 
    * returns a vector of all recipients of this 
    * message including To, CC, and BCC recipients.
    */
   public Vector getAllRecipients()
   {
      // Returns the sum of the to, cc, and bcc vectors.
      Vector all=new Vector();
      int size=0;
      size=toVector.size();
      for (int i=0; i<size; i++)
      { 
         all.addElement(toVector.elementAt(i));
      }
      size=ccVector.size();
      for (int i=0; i<size; i++)
      { 
         all.addElement(ccVector.elementAt(i));
      }
      size=bccVector.size();
      for (int i=0; i<size; i++)
      { 
         all.addElement(bccVector.elementAt(i));
      }
      return all;
   }

   /** Sets the recipients of this message.  This can be:
    * <ol>
    * <li> A Vector of Strings formatted as email addresses.
    * <li> A String of email addresses that are comma separated.
    * </ol>
    **/
   public void setRecipients(Object to)
   {
      if (to != null)
      {
         if (to instanceof Vector)
            toVector=stringsToAddresses((Vector)to);
         else if (to instanceof String)
            toVector=csToAddresses((String)to);
         else
            throw new 
            IllegalArgumentException ("The to parameter must be either a "+
                                      "String or Vector");
      }
   }

   /** Adds a single recepient to the 'To' list. */
   public void addRecipient(String s) { 
      toVector.addElement(new EMailAddress(s)); 
   }

   /** Gets the 'To' vector. */
   public Vector getRecipients() { return toVector; }

   /** Sets the 'To' vector.  This method is synonymous with setRecipients(). 
    */
   public void setTo(Object to) {setRecipients(to);}
   
   /** Adds a single recipient to the 'To' Vector. */
   public void addTo(String s) {addRecipient(s);}

   /** Returns the Vector of 'To' recipients. */
   public Vector getTo() {return getRecipients();}

   /** Sets the Carbon Copy (CC) recipients of this message.  This can be:
    * <ol>
    * <li> A Vector of Strings formatted as email addresses.
    * <li> A String of email addresses that are comma separated.
    * </ol>
    **/
   public void setCC(Object cc)
   {
      if (cc != null)
      {
         if (cc instanceof Vector)
            ccVector=stringsToAddresses((Vector)cc);
         else if (cc instanceof String)
            ccVector=csToAddresses((String)cc);
         else
            throw new 
            IllegalArgumentException ("The to parameter must be either a "+
                                      "String or Vector");
      }
   }

   /** Adds a single address to the cc list. */
   public void addCC(String s) { ccVector.addElement(s); }

   /** Returns the vector of 'CC' recipients. */
   public Vector getCC() { return ccVector; }

   /** Sets the Blind Carbon Copy (BCC) recipients of this message.  
    * This can be:
    * <ol>
    * <li> A Vector of Strings formatted as email addresses.
    * <li> A String of email addresses that are comma separated.
    * </ol>
    **/
   public void setBCC(Object bcc)
   {
      if (bcc != null)
      {
         if (bcc instanceof Vector)
            bccVector=stringsToAddresses((Vector)bcc);
         else if (bcc instanceof String)
            bccVector=csToAddresses((String)bcc);
         else
            throw new 
            IllegalArgumentException ("The to parameter must be either a "+
                                      "String or Vector");
      }
   }

   /** Adds a single recipient to the bcc list. */
   public void addBCC(String s) { bccVector.addElement(new EMailAddress(s)); }
   
   /** Returns a the vector of BCC recipients.  This will only be available
    * after being added to an outbound message, not after being read from
    * an inbound POP3 server.  (Hence <u>blind</u> carbon copy.  It is known
    * to the sender -- outbound, but not to the recipients -- inbound. */
   public Vector getBCC() { return bccVector; }

   /** Sets the message body string buffer. */
   public void setMessage(StringBuffer sb) { message=sb; }

   /** Sets the message body as a string rather than a StringBuffer. */
   public void setMessage(String s) {
      message=new StringBuffer();
      message.append(s);
   }

   /** Retrieves the actual message body.  */
   public StringBuffer getMessage() { return message; }

   /** Sets the message subject line. */
   public void setSubject(String s) { subject = s; }
   
   /** Returns the message subject line. */
   public String getSubject() { return subject; }

   private boolean empty(Vector v) {
      if (v == null || v.size() == 0)
         return true;
      else 
         return false;
   }

   /////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////
   /**
    * Writes a message to a stream.  This method is really only valuable 
    * for inbound, non-multipart messages at this time.  My suggestion
    * is to try it to see what it does if you're curious.
    */
   public void toStream(OutputStream os)
      throws IOException
   {
      // create auto-flushing print writer
      PrintWriter pw=new PrintWriter(new OutputStreamWriter(os), true);

      // write the headers
      pw.println ("From: "+sender+"");
      pw.println ("Reply-to: "+getReplyTo()+"");
      pw.println ("To: "+outList(toVector));
      if (!empty(ccVector))
         pw.println ("Cc: "+outList(ccVector));
      if (!empty(bccVector))
         pw.println ("Bcc: "+outList(bccVector));
      pw.println ("Content-type: "+contentType);
      pw.println ("Subject: "+subject);
      
      // loop over all additional headers and write them out.
      // this is not available at this time.
      
      // one blank line!!
      pw.println("");
      // write the data
      // just dump as text/plain for now.
      StringBuffer mess=getMessage();
      if (mess == null) {
         
         mess = new StringBuffer();
         mess.append(
         "This is likely a \"Lightweight\" message, which \n"+
         "does not have a message body or attachments.  If you \n"+
         "were not expecting a Lightweight message there may be a \n"+
         "software or network error.");
      }
         
      pw.println (mess);

      // write the attachments

      // end message
      pw.println ("");
      pw.println (".");
      pw.println ("");
   }

   private String outList(Vector v)
   {
      StringBuffer sb=new StringBuffer();
      int size=v.size();
      for (int i=0; i<size; i++)
      {
         Object o=v.elementAt(i);
         if (i == size-1)
            sb.append(o.toString());
         else
            sb.append(o.toString()+", \n     ");
      }
      return sb.toString();
   }
   

   /**
    * Reads a message from a stream.
    */
   // public void fromStream(InputStream is)
   private void fromStream(InputStream is)
      throws IOException
   {

   }

   //////////////////////////////////////////////////////////////////////////
   //////////////////////////////////////////////////////////////////////////
   /**
    */
   private static class AddressTokenizer
   {
      String nextTok=null;
      String line=null;
      int curLoc=0;
      int size=0;

      static boolean DEBUG=false;

      public AddressTokenizer(String s)
      {
         line=s.trim();

         line=replaceText(line, "\n", "");
         line=replaceText(line, "\r", "");

         size=line.length();
         if (DEBUG) Log.write ("Tokenizing "+line);
      }


      public String nextToken() {
         String tok=null;
         
         int firstQuote=line.indexOf("\"", curLoc);
         int commaLoc=line.indexOf(",", curLoc);

         if (commaLoc == -1) {
            curLoc=size;
            return line.substring(curLoc, size);
         }

         if (firstQuote == -1) { // nothing to worry about, tokenize
            tok=line.substring(curLoc, commaLoc);
            curLoc=commaLoc+1;
         }
         else {
            int secondQuote=line.indexOf("\"", firstQuote+1);
            if (DEBUG)
               Log.write("First quotel, second quote, commaLoc "+
                                  firstQuote+", "+secondQuote+", "+commaLoc);
            if (secondQuote == -1)
               throw new RuntimeException("Mis-matched quotes parsing "+
                                          "address list");
            // if the comma is inside quotes, ignore and find the next
            // one.
            while (commaLoc < secondQuote && commaLoc != -1)
               commaLoc=line.indexOf(",", commaLoc+1);

            if (DEBUG)
               Log.write("First quotel, second quote, commaLoc "+
                                  firstQuote+", "+secondQuote+", "+commaLoc);

            if (commaLoc == -1) 
               commaLoc=size;

            tok=line.substring(curLoc, commaLoc);
            curLoc=commaLoc+1;
         }
         if (DEBUG)
            Log.write ("Address tokenizer returning '"+tok+"'");
         return tok;
      }

      public boolean hasMoreTokens() {
         if (curLoc < size)
            return true;
         else
            return false;
      }

      public String replaceText(String target, String key, String val)
      {
         int count=0;
         int location=0;
         
         int keySize=key.length();
         if (keySize == 0)
            return target;
         // First, find the begining location for all of the keys
         location=target.indexOf(key);
         while (location != -1)
         {
            count++;
            target= target.substring(0, location)+val+
            target.substring(location+key.length());
            
            location = target.indexOf(key, location+key.length());
         }
         return target;
      }
   } // end AddressTokenizer
}







