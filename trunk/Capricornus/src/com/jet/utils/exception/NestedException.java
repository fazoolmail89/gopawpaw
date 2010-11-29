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
public class NestedException extends Exception
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
   public NestedException (Throwable t) {
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
         else if (next instanceof NestedException) {
            ret.append(next.toString());
         }
         else if (next instanceof NestedRuntimeException) {
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
         if (next instanceof SQLException) {
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            PrintWriter pw2=new PrintWriter(baos);
            
            next.printStackTrace(pw2);
            pw2.flush();
            pw2.close();
            String nextStack=baos.toString();
            
            nextStack=" >"+nextStack;
            nextStack=StringUtil.replace("\n", "\n >", nextStack);
            
            pw.println(nextStack);

            // implicit sql stack
            SQLException nnext=((SQLException)next).getNextException();
            if (nnext != null) {
               baos=new ByteArrayOutputStream();
               pw2=new PrintWriter(baos);
               nnext.printStackTrace(pw2);
               pw2.flush();
               pw2.close();
               nextStack=baos.toString();
               
               nextStack=" SQL>"+nextStack;
               nextStack=StringUtil.replace("\n", "\n SQL>", nextStack);
               
               pw.println(nextStack);
            }
         } else {
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
      }
      pw.flush();
   }
}

