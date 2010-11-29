package com.jet.utils;


/**
 * A set of utilities for dealing with .class objects and files.
 */
public class ClassUtil
{
   /** Returns the short name of a class - it's name without 
    * the package prefix. Often useful for logging. */
   public static final String shortClassName(String s) {
      return s.substring(s.lastIndexOf(".")+1);
   }

   /** Returns the short name of a class - it's name without 
    * the package prefix. Often useful for logging. */
   public static final String shortClassName(Class c) {
      return shortClassName(c.getName());
   }

   /** Returns the short name of a class - it's name without 
    * the package prefix. Often useful for logging. */
   public static final String shortClassName(Object o) {
      return shortClassName(o.getClass());
   }
}
