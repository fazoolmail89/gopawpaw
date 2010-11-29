package com.jet.utils.mail;

/** 
 *
 */
class Pair
{
   String k=null;
   String v=null;
   
   public Pair(String x, String y)
   {
      k=x;
      v=y;
   }
   
   public String key() {return k;}
   public String value() {return v;}
   
   public String toString() {return k+v;}
}
