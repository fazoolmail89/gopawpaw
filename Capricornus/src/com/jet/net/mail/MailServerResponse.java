package com.jet.net.mail;

import java.util.*;

/*
 * $Log: MailServerResponse.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/10/03 01:03:22  bemocvs
 * xxx
 *
 */

/**
 * Encapsulates an SMTP Mail Server response. <p>
 *
 * REF: RFC 821 Appendix E
 */
public class MailServerResponse implements java.io.Serializable
{
   private String firstLine="";
   private String code="xxx";
   private String text="Error";
   private boolean more=false;

   private Vector lines=new Vector();

   /** */
   public MailServerResponse(String s) {
      firstLine=s;
      lines.addElement(s);
      if (s == null ||
          s.length() == 0){
         // Error 
      }
      else {
         setMore(s);
         if (s.length() >= 3) {
            code=s.substring(0, 3);
         }
         if (s.length() >= 5)
            text=s.substring(4);
      }
   }

   protected void setMore(String line) {
      if (line.length() >= 4) {
         if (line.charAt(3) == '-')
            more=true;
         else
            more=false;
      }
      more=false;
   }

   public boolean hasMore() {return more;}

   public String getCode() {return code;}
      
   /** This is the text of the first line of the response. */
   public String getText() {return text;}

   public boolean isError() {
      if (code.startsWith("5") ||
          code.startsWith("4"))
         return true;
      else
         return false;
   }

   public void addLine(String line) {
      lines.addElement(line);
      setMore(line);
   }

   /** */
   public Vector getAllLines() {return lines;}

   public String toString() {
      return firstLine;
   }
}
