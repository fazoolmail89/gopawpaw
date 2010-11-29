package com.jet.utils.filesystem;

import java.io.FilenameFilter;
import java.io.File;

/**
 * Implements a starndard wildcard filter (typical of unix shells) via
 * java regex.  Adapted from java.sun.com forum:
 * http://forum.java.sun.com/thread.jspa?threadID=480592&start=0&tstart=0
 *
 */
public class WildcardFilter implements FilenameFilter
{
   String regex=null;

   String original=null;

   /** */
   public WildcardFilter(String wcfilename) {
      original=wcfilename;
      
      regex=replaceWildcards(original);
   }

	/**
	 * Checks for * and ? in the wildcard variable and replaces them correct
	 * pattern characters.
	 * 
	 * @param wild - Wildcard name containing * and ?
	 * @return - String containing modified wildcard name
	 */
	private static String replaceWildcards(String wild)
	{
		StringBuffer buffer = new StringBuffer();
		
		char [] chars = wild.toCharArray();
		
		for (int i = 0; i < chars.length; ++i)
		{
			if (chars[i] == '*')
				buffer.append(".*");
			else if (chars[i] == '?')
				buffer.append(".{1}");
         else if ("+()^$.{}[]|\\".indexOf(chars[i]) != -1)
            buffer.append('\\').append(chars[i]);
			else
				buffer.append(chars[i]);
		}
		
		return buffer.toString();
	}	// end replaceWildcards method


   /** */
   public boolean accept(File dir, String name) {
      return name.matches(regex);
   }

   /** */
   public String toString() {
      return original+"->"+regex;
   }
}