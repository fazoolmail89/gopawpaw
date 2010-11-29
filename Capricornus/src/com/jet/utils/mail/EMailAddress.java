package com.jet.utils.mail;


/**
 *
 * @author Paul Bemowski
 */
public class EMailAddress
{
   /** The real name. ex: Paul Bemowski */
   private String realName=null;
   /** The address. ex: pbemowski@z-tel.com */
   private String address=null;

   /**
    */
   public EMailAddress(String name, String add)
   {
      realName=name;
      address=add;
   }

   /**
    * This parses the address from a email message line. The format follows:<p>
    *
    * "real name" <address@somewhere.com><p>
    * 
    * or, just to make my life difficult
    *
    * "last, first" <last@somewhere.com>
    *
    * or if no real name is available<p>
    *
    * <address@somewhere.com>
    */
   public EMailAddress(String line)
   {
      int quoteStart=line.indexOf("\"");
      int quoteEnd=-1;
      if (quoteStart != -1)
      {
         // assume we have a real name
         // make sure we have matched quotes
         quoteEnd=line.indexOf("\"", quoteStart+1);
         if (quoteEnd == -1)
         {
            // let's think of a more robust way to recover here, this 
            // is pretty drastic.
            throw new RuntimeException("Mis-matched quotes in address line:"+
                                       "'"+line+"'");
         }
         realName=line.substring(quoteStart+1, quoteEnd);
      }
      
      // get the address
      int addStart=0;
      if (quoteEnd != -1)
         addStart=line.indexOf("<", quoteEnd);
      else
         addStart=line.indexOf("<");

      if (addStart == -1) {
         // let's allow this for backward compatablility:
         // So if pbemowski@z-tel.com is passed into this 
         // constructor, we're still ok.
         address=line;
      }
      else
      {
         int addEnd=line.indexOf(">", addStart);
         if (addEnd == -1) {
            throw new RuntimeException("No '>' address delimiter in address "+
                                       "line with opening delimiter '<'.");
         }
         address=line.substring(addStart+1, addEnd);
      }
   }

   /** */
   public String getAddress() {
      return address;
   }

   /**
    *
    */
   public String toString()
   {
      String s="";
      if (realName != null)
         s=s+"\""+realName+"\" ";
      if (address != null)
         s=s+"<"+address+">";
      return s;
   }

}

