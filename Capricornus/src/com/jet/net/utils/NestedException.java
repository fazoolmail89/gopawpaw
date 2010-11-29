package com.jet.net.utils;

import java.lang.Exception;

/**
 * Exception with nesting capability similar to java.sql.Exception.  
 * Sould be the default superclass for all application exceptions.  This allows
 * the programmer to nest a caught exception and re-throw a more 
 * specific exception.
 *
 * @author Paul Bemowski
 */
public abstract class NestedException extends Exception
{
  private String detail="";
  private Throwable next=null;

  /**
   * Construct a simple application exception.
   */
  public NestedException() {
    super();
  }

  /**
   * Construct an exception with some detail;
   */
  public NestedException (String det) {
    super (det);
    detail=det;
  }

  /**
   * Construct an exception with a nested exception and detail.
   */
  public NestedException (String det, Throwable t) {
    super(det);
    detail=det;
    next=t;
  }

  /**
   * Construct an exception with a nested exception.
   */
  public NestedException (Throwable t){
    super();
    next=t;
  }

  public Throwable getNextException () {return next;}
  public void setNextException (Throwable t) {next=t;}

  /**
   * Overrides Exception.toString().
   */
   public String toString()
   {
      String ret;
      ret=simpleClassName(getClass().getName())+": "+detail+"\n";
      if (next != null)
      {
         if (next instanceof NestedException) {
         }
         else {
            ret=ret+next.toString()+"\n";
         }
      }
      return ret;
   }// toStrig();
   
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

