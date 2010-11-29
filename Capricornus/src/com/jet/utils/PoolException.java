package com.jet.utils;

import com.jet.utils.exception.*;

/**
 *
 */
public class PoolException extends NestedException
{
   public PoolException(String msg) {super(msg);}
   public PoolException(String s, Throwable t) {super(s, t);}
}
