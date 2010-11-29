package com.jet.utils;

/**
 *
 */
public class Null
{
   public Null(){}

   public String toString() {return "null";}

   public boolean equals(Object obj) {
      if (obj instanceof Null)
         return true;
      return false;
   }
}
