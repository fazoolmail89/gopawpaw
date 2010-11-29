package com.jet.net.mail;

/*
 * $Log: MessageMetaData.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/09/18 22:33:03  bemocvs
 * Made object serializable
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * Information "about" a message.  This is generally useful if we're talking
 * to a POP3 server, and we're dealing with a lightweight message (a message
 * without it's body).
 *
 * @author Paul Bemowski
 */
public class MessageMetaData implements java.io.Serializable
{
   private int size = -1;

   private String uidl = "";

   private String localMessageID="";

   /** This is the index of the message when it was retrieved.  If 
    * messages above it are deleted, we might have problems. */
   private int messageIndex=-1;

   private String mailServer="";
   private int mailPort=110;

   /** */
   MessageMetaData() { }

   /** */
   MessageMetaData(int s, String u) {
      size=s;
      uidl=u;
   }

   /** */
   MessageMetaData(int s, String u, String ms, int mp)
   {
      this(s, u);
      mailServer=ms;
      mailPort=mp;
   }

   /** Returns the size of the message as indicated by the POP3 server,
    * or -1 if this data is not available. */
   public int getSize() {return size;}
   
   /** */
   void setSize(int s) {size=s;}

   /** Returns the server-unique UIDL code for this message. */
   public String getUIDL() {return uidl;}
   
   /** */
   void setUIDL(String u) {uidl=u;}

   /** */
   public String getLocalMessageID() {return localMessageID;}
   
   /** */
   void setLocalMessageID(String s) {localMessageID=s;}
   
   /** Returns the mail server from which this message was recieved. */
   public String getMailServer() {return mailServer;}
   
   /** */
   void setMailServer(String s) {mailServer=s;}

   /** Returns the port of the mail server from which this message was 
    * recieved. */
   public int getMailPort() {return mailPort;}

   /** */
   void setMailPort(int i) {mailPort=i;}

   /** Returns a debugging level string indicating internal data. */
   public String toString()
   {
      String ret="MessageMetaData: \n"+
      "     Size: "+size+"\n"+
      "     UIDL: "+uidl+"\n"+
      "     LMID: "+localMessageID+"\n"+
      "   Server: "+mailServer+"\n"+
      "     Port: "+mailPort;
      
      return ret;
   }
}
