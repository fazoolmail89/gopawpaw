package com.jet.net.html.sax;

import com.jet.net.utils.*;

/**
 * Indicates a parser exception.  This may contain a 'nested' exception
 * giving more informaion about the problem.
 * 
 * @author Paul Bemowski
 */
public class ParseException extends NestedException
{
   public ParseException(String s) {super(s);}
   public ParseException(String s, Throwable t) {super(s, t);}
   public ParseException(Throwable t) {super(t);}   
}
