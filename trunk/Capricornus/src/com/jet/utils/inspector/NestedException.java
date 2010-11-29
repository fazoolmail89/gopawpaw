package com.jet.utils.inspector;


import java.lang.Exception;
import java.sql.SQLException;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

/**
 * Exception with nesting capability similar to java.sql.Exception.  
 * Sould be the default superclass for all application exceptions.  This allows
 * the programmer to nest a caught exception and re-throw a more 
 * specific exception.
 *
 */
public abstract class NestedException extends Exception
{
   private Throwable next=null;
   private String stackTrace;

   /**
    * Construct a simple application exception.
    */
   public NestedException()
   {
      this("", null);
   }

   /**
    * Construct an exception with some detail
    * @param det Detail describing the exception.
    */
   public NestedException (String det)
   {
      this (det, null);
   }

   /**
    * Construct an exception with a nested exception and detail.
    *
    * @param det Detail describing the exception.
    * @param t Another throwable type to be nested with this exception.
    */
   public NestedException (String det, Throwable t)
   {
      super(det);
      next=t;

      // When an exception is thrown over the wire, the stack trace is
      // lost.  So here, we save the stack trace as a string in the constructor
      // on the server, and throw that across the wire.
      ByteArrayOutputStream bos=new ByteArrayOutputStream();
      PrintStream ps=new PrintStream(bos);
      super.printStackTrace(ps);
      stackTrace=bos.toString();
      ps.close(); ps=null;
      bos=null;
   }

   /**
    * Construct an exception with a nested exception.
    */
   public NestedException (Throwable t)
   {
      this("", t);
   }

   public Throwable getNextException () {return next;}
   public void setNextException (Throwable t) {next=t;}

   /**
    * Overrides Exception.toString().
    */
   public String toString()
   {
      String ret;
      ret=simpleClassName(getClass().getName())+": "+getMessage()+"\n";
      if (next != null)
      {
         if (next instanceof SQLException)
         {
            SQLException se=(SQLException)next;
            while (se != null)
            {
               ret=ret+se.toString()+"\n";
               
               ret=ret+"Code: "+se.getErrorCode()+" State: "+
               se.getSQLState()+"\n";
               
               se=se.getNextException();
            }
         }
         else
         {
            // If the next exception is a subclass of NestedException, this
            // call to toString() is a recursion.
            ret=ret+next.toString()+"\n";
         }
      }
      return ret;
   }// toString();

   /**
    *
    * @param ps The stream on which to print the stack trace.
    */
   public void printStackTrace(PrintStream ps)
   {
      ps.println (stackTrace);
   }

   /**
    *
    * @param pw The print writer on which to print the stack trace.
    */
   public void printStackTrace(PrintWriter pw)
   {
      pw.println (stackTrace);
   }
  
   /**
    *
    */
   private String simpleClassName(String name)
   {
      for (int i=name.length()-1; i>=0; i--)
      {
         if (name.charAt(i) == '.')
            return name.substring(i+1);
      }
      return name;
   }
}


