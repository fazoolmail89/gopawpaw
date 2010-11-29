package com.jet.net.mail;


import java.io.*;
import java.util.*;

/**
 * A wrapped message will wrap the users content with a "wrapper" page.
 * 
 * @author Paul Bemowski
 */
public class WrappedMessage extends EMailMessage
{
   private String wrapperKey=null;
   private File wrapperFile=null;

   private String wrapper=null;

   private boolean initialized=false;

   /**
    * @param s E-mail address of sender. 
    * @param to Vector of e-mail address strings that the e-mail should 
    * be sent to.
    * @param sub Subject line.
    * @param sb Message body.
    */
   public WrappedMessage (String s, Object to, String sub, StringBuffer sb)
   {
      this(s, null, to, null, null, sub, sb);
   }

   /**
    *
    *
    */
   public WrappedMessage (String s, String rep, Object to, Object cc,
                          Object bcc, String sub, StringBuffer msg)
   {
      super (s, rep, to, cc, bcc, sub, msg);
      // setContentType("text/html");
   }

   /**
    *
    */
   public WrappedMessage()
   {
      super();
      // setContentType("text/html");
   }

   /**
    *
    */
   public void setWrapper(String fileString, String key)
      throws IOException {
      setWrapper(new File(fileString), key);
   }

   /**
    *
    */
   public void setWrapper(File file, String key)
      throws IOException {
      wrapperFile=new File(file.getAbsolutePath());
      wrapperKey=key;


      readWrapper();
   }

   /**
    * 
    */
   private StringBuffer buildMessage()
   {
      StringBuffer wrappedMessage=new StringBuffer();

      int keyIndex=wrapper.indexOf(wrapperKey);

      wrappedMessage.append(wrapper.substring(0, keyIndex));

      wrappedMessage.append(message.toString());

      wrappedMessage.append(wrapper.substring(keyIndex+wrapperKey.length()));

      // System.out.println ("Message: \n"+wrappedMessage.toString());
      return wrappedMessage;
   }

   public boolean initialized()
   {
      return initialized;
   }

   /**
    * Overrides the getMessage method from EMailMessage.
    */
   public StringBuffer getMessage()
   {
      // return buildMessage();
      return new StringBuffer(wrapper);
   }

   /**
    *
    */
   private void readWrapper() throws IOException 
   {
      FileInputStream fis=null;
      StringBuffer wrapperBuffer=new StringBuffer();

      try
      {
         fis=new FileInputStream(wrapperFile);
         BufferedReader br=new BufferedReader(new InputStreamReader(fis));


         // Just read it line by line
         String line=br.readLine();
         while (line != null)
         {
            wrapperBuffer.append(line+"\n");
            line=br.readLine();
         }
      }
      finally
      {
         if (fis != null)
            fis.close();
      }

      wrapper=wrapperBuffer.toString();
   }

   /**
    *
    */
   public int replaceText(Hashtable key_val)
   {
      int count=0;
      for(Enumeration keys=key_val.keys(); keys.hasMoreElements();)
      {
         String key=(String)keys.nextElement();
         String val=(String)key_val.get(key);
         count += replaceText(key, val);
      }
      return count;
   }

   /**
    * @param key The key in the file to be replaced.
    * @param val The value to replace the key with.
    * @return The number of occurances replaced.
    */
   public int replaceText(String key, String val)
   {
      initialized=true;

      int count=0;
      int location=0;

      int keySize=key.length();
      if (keySize == 0)
         return 0;
      // First, find the begining location for all of the keys
      location=wrapper.indexOf(key);
      while (location != -1)
      {
         count++;
         //System.out.println ("Replacing "+key+" with "+val+" at "+location);

         wrapper= wrapper.substring(0, location)+val+
         wrapper.substring(location+key.length());
      
         location = wrapper.indexOf(key, location+key.length());
         }
      return count;
   }
}




