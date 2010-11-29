package com.jet.utils;

/* 
 * $Log: StringUtil.java,v $
 * Revision 1.13  2007/04/18 23:03:11  bemocvs
 * added remove crlf
 *
 * Revision 1.12  2007/01/04 15:54:37  bemocvs
 * new pad method
 *
 * Revision 1.11  2006/12/20 21:17:56  bemocvs
 * jet_databrowser/rootfiles/release.txt
 *
 * Revision 1.10  2006/05/18 05:34:50  bemocvs
 * *** empty log message ***
 *
 * Revision 1.9  2005/07/16 15:26:24  bemocvs
 * added consolidatePeriods
 *
 * Revision 1.8  2004/05/11 12:06:44  bemocvs
 * *** empty log message ***
 *
 * Revision 1.7  2004/05/09 16:57:52  bemocvs
 * *** empty log message ***
 *
 * Revision 1.6  2004/03/17 18:13:34  bemocvs
 * comment update
 *
 * Revision 1.5  2003/09/02 20:28:45  bemocvs
 * Forums
 *
 * Revision 1.4  2003/08/31 22:38:20  bemocvs
 * Working on Ticket system
 *
 * Revision 1.3  2003/01/15 01:30:35  bemocvs
 * incremental checking from redsite.
 *
 * Revision 1.2  2002/12/31 17:56:01  bemocvs
 * StringUtil replace fix and unit tests, DataEditor clean
 *
 */

/**
 * Utilities for manipulating String variables.
 * @author Paul Bemowski
 */
public class StringUtil
{
   /** */
   public static final String EMPTY_STRING="".intern();

   /** Returns true if a string is null or empty. */
   public static final boolean empty(String s) {
      if (s == null || s.length() == 0)
         return true;
      else
         return false;
   }

   /** */
   public static final String notNull(String s) {
      if (s == null)
         return "";
      else
         return s;
   }

   /** */
   public static final String notEmpty(String s) {
      if (s == null)
         return s;
      else if (s.equals(""))
         return null;
      else
         return s;
   }

   /** 
    * Replaces one string with another within a string.
    *
    * @param key The text of the string to be replaced.
    * @param value The value to be inserted in place of the key.
    * @param target The target text to be operated upon.
    */
   public static final String replace(String key, String value,
                                      String target) {
      if (target == null)
         return null;

      int maxinstances=10000;
      int instances=0;

      StringBuffer sb=new StringBuffer(target);
      int loc=0;
      int keysize=key.length();
      int valsize=value.length();
      
      loc=target.indexOf(key);
      while (loc != -1) {
         sb.replace(loc, loc+keysize, value);
         target=sb.toString();
         loc=target.indexOf(key, loc+valsize);
         instances++;
         if (instances > maxinstances)
            throw new 
               RuntimeException("Error replacing.  Too many instances: "+
                                instances);
      }
      return sb.toString();
   }

   /** 
    * Replaces one string with another in a string, 
    * regardless of case. 
    *
    * @param key The text of the string to be replaced.
    * @param value The value to be inserted in place of the key.
    * @param target The target text to be operated upon.
    */
   public static final String replaceInsensitive(String key, String value,
                                                 String target) {
      if (target == null)
         return null;

      int maxinstances=10000;
      int instances=0;

      StringBuffer sb=new StringBuffer(target);
      int loc=0;
      int keysize=key.length();
      int valsize=value.length();

      String lctarget=target.toLowerCase();
      String lckey=key.toLowerCase();
      
      loc=lctarget.indexOf(lckey);
      while (loc != -1) {
         sb.replace(loc, loc+keysize, value);

         lctarget=sb.toString().toLowerCase();

         loc=lctarget.indexOf(lckey, loc+valsize);
         instances++;
         if (instances > maxinstances)
            throw new 
               RuntimeException("Error replacing.  Too many instances: "+
                                instances);
      }
      return sb.toString();
   }   

   /** Strips all characters from string except [a,z] and [A,Z]. */
   public static final String alpha(String s) {
      char array[]=s.toCharArray();
      for (int i=0; i<array.length; i++) {
         if (!Character.isLetter(array[i]))
            array[i]=' ';
      }
      return new String(array);
   }

   /** Strips all characters from string except [a,z] and [A,Z] [0,9]. */
   public static final String alphaNumeric(String s) {
      char array[]=s.toCharArray();
      for (int i=0; i<array.length; i++) {
         if (!Character.isLetterOrDigit(array[i]))
            array[i]=' ';
      }
      return new String(array);
   }
   
   /** Strips all characters from string except [a,z] and [A,Z]. */
   public static final String numeric(String s) {
      char array[]=s.toCharArray();
      for (int i=0; i<array.length; i++) {
         if (!Character.isDigit(array[i]))
            array[i]=' ';
      }
      return new String(array);
   }

   /** Consolidates whitespace.  so 'x    y' will turn into 'x y'. */
   public static final String consolidateWhitespace(String s) {
      char array[]=s.toCharArray();
      StringBuffer sb=new StringBuffer(s.length());
      boolean lastCharIsSpace=false;
      for (int i=0; i<array.length; i++) {
         if (Character.isWhitespace(array[i])) {
            if (!lastCharIsSpace) {
               sb.append(' ');
               lastCharIsSpace=true;
            }
         }
         else {
            lastCharIsSpace=false;
            sb.append(array[i]);
         }
      }
      return sb.toString();
   }

   /** 
    * Consolidates '.'.  so 'x...y' will turn into 'x.y'. <p>
    * 
    * This method was specifically created for use with the PdfHandler
    * of the indexing module.  It may not have general utility, but it 
    * made sense here.
    **/
   public static final String consolidatePeriods(String s) {
      char array[]=s.toCharArray();
      StringBuffer sb=new StringBuffer(s.length());
      boolean lastCharIsPeriod=false;
      for (int i=0; i<array.length; i++) {
         if (array[i] == '.') {
            if (!lastCharIsPeriod) {
               sb.append('.');
               lastCharIsPeriod=true;
            }
         }
         else {
            lastCharIsPeriod=false;
            sb.append(array[i]);
         }
      }
      return sb.toString();
   }

   /** Truncates a string, adding an elipsis at the end. */
   public static final String truncate(String s, int length) {
      if (s.length() < length)
         return s;
      else 
         return s.substring(0, length-1)+"...";
   }

   /** */
   public static final String pad(String padchar, int size) {
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<size; i++)
         sb.append(padchar);
      return sb.toString();
   }
   
   /** */
   public static final String leftPad(String padchar, int size, 
                                      String text) {
      int pads=size-text.length();
      if (pads <= 0)
         return text;
      
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<pads; i++)
         sb.append(padchar);
      sb.append(text);

      return sb.toString();
   }

   /** */
   public static final String rightPad(String padchar, int size, 
                                       String text) {
      int pads=size-text.length();
      if (pads <= 0)
         return text;
      
      StringBuffer sb=new StringBuffer();
      sb.append(text);
      for (int i=0; i<pads; i++)
         sb.append(padchar);

      return sb.toString();
   }

   /** 
    * Returns the simple class name (everything after the last period.
    */
   public static final String className(Class c) {
      String name=c.getName();
      if (name.indexOf(".") != -1)
         return name.substring(name.lastIndexOf(".")); 
      else
         return name;
   }

   /** */
   public static final String removeCRLF(String s) {
      char c[]=s.toCharArray();
      StringBuffer sb=new StringBuffer(c.length);
      for (int i=0; i<c.length; i++) {
         if (c[i] != '\n' &&
             c[i] != '\r')
            sb.append(c[i]);
      }
      return sb.toString();
   }
}
