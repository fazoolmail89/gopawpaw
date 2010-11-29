package com.jet.net.nntp;

import com.jet.net.utils.ProtocolException;

/**
 * Indicates a problem within the com.jet.net.nntp.* package. 
 */
public class NntpException extends ProtocolException
{
   public NntpException (String msg) {super(msg);}

   public NntpException (String m, Throwable t){super(m, t);}
}
