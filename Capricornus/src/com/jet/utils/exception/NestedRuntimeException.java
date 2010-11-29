package com.jet.utils.exception;


import java.lang.Exception;
import java.sql.SQLException;

import java.io.*;

import com.jet.utils.StringUtil;

/**
 * Exception with nesting capability similar to java.sql.Exception.  
 * Sould be the default superclass for all application exceptions.  This allows
 * the programmer to nest a caught exception and re-throw a more 
 * specific exception.
 *
 * @author Paul Bemowski
 */
public class NestedRuntimeException extends RuntimeException
{
   private String detail="";
   private Throwable next=null;

   /**
    * Construct a simple application exception.
    */
   public NestedRuntimeException() {
      super();
   }

   /**
    * Construct an exception with some detail;
    */
   public NestedRuntimeException (String det) {
      super (det);
      detail=det;
   }

   /**
    * Construct an exception with a nested exception and detail.
    */
   public NestedRuntimeException (String det, Throwable t) {
      super(det);
      detail=det;
      next=t;
   }

   /**
    * Construct an exception with a nested exception.
    */
   public NestedRuntimeException (Throwable t) {
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
      StringBuffer ret=new StringBuffer();
      ret.append(simpleClassName(getClass().getName())+": "+detail+"\n");
      if (next != null)
      {
         if (next instanceof SQLException)
         {
            SQLException se=(SQLException)next;
            while (se != null)
            {
               ret.append(se.toString()+"\n");
               se=se.getNextException();
            }
         }
         else if (next instanceof NestedRuntimeException) {
            ret.append(next.toString());
         }
         else if (next instanceof NestedException) {
            ret.append(next.toString());
         }
         else {
            ret.append(next.toString()+"\n");
         }
      }
      return ret.toString();
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

   /** */
   public void printStackTrace() {
      printStackTrace(System.out);
   }

   /** */
   public void printStackTrace(PrintStream ps) {
      printStackTrace(new PrintWriter(ps));
   }


   /** */
   public void printStackTrace(PrintWriter pw) {
      super.printStackTrace(pw);
      pw.flush();
      if (next != null) {
         ByteArrayOutputStream baos=new ByteArrayOutputStream();
         PrintWriter pw2=new PrintWriter(baos);

         next.printStackTrace(pw2);
         pw2.flush();
         pw2.close();
         String nextStack=baos.toString();

         nextStack=" >"+nextStack;
         nextStack=StringUtil.replace("\n", "\n >", nextStack);

         pw.println(nextStack);
      }
      pw.flush();
   }
}

