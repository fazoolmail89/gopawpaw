package com.jet.apps.sqlminus;

public class Test
{
   public static void main(String args) 
      throws Exception {
      byte b=(byte)System.in.read();

      while (b != 'x') {
         System.out.println (b);
         b=(byte)System.in.read();
      }
   }
}
