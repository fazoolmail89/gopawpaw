package com.jet.utils.mail;

/**
 * Information "about" a message.  Not much here, but it is enough
 * warrant a new class.
 */
public class MessageMetaData
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
   MessageMetaData()
   {
   }

   /** */
   MessageMetaData(int s, String u)
   {
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

   /** */
   public int getSize() {return size;}
   
   /** */
   void setSize(int s) {size=s;}

   /** */
   public String getUIDL() {return uidl;}
   
   /** */
   void setUIDL(String u) {uidl=u;}

   /** */
   public String getLocalMessageID() {return localMessageID;}
   
   /** */
   void setLocalMessageID(String s) {localMessageID=s;}
   
   /** */
   public String getMailServer() {return mailServer;}
   
   /** */
   void setMailServer(String s) {mailServer=s;}

   /** */
   public int getMailPort() {return mailPort;}

   /** */
   void setMailPort(int i) {mailPort=i;}

   /** */
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
