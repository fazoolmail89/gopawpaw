package com.jet.net.nntp;

import com.jet.net.utils.ProtocolException;

/**
 * Indicates a problem within the com.jet.net.nntp.* package. 
 */
public class NoSuchArticleException extends NntpException
{
   public NoSuchArticleException (String msg) {super(msg);}

   public NoSuchArticleException (String m, Throwable t){super(m, t);}
}
