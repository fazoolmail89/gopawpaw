package com.jet.utils.web;

import java.util.*;

/** 
 * WordTokenizer will take a sentance, with punctuation and
 * return a list of words.  Only characters and digits are
 * included. 
 * 
 * @author Paul Bemowski
 */
public class WordTokenizer 
{
   String string=null;
   StringTokenizer st=null;

   public WordTokenizer(String s) {
      string=clean(s);
      st=new StringTokenizer(string, " ", false);
   }

   private String clean(String s) {
      StringBuffer sb=new StringBuffer();
      char chars[]=s.toCharArray();
      for (int i=0; i<chars.length; i++) {
         if (Character.isLetterOrDigit(chars[i]))
            sb.append(chars[i]);
         else
            sb.append(" ");
      }
      return sb.toString();
   }

   public String nextWord() {
      String s=st.nextToken();
      // weed out 1 character words
      while (s.length() <= 1 &&
             s != null) {
         s=st.nextToken();
      }
      return s;
   }
   public boolean hasMoreWords() {
      return st.hasMoreTokens();
   }
}

