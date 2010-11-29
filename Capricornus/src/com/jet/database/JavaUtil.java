package com.jet.database;

import java.util.*;

public class JavaUtil implements com.jet.log.Logger
{
   public static boolean trimTrailingS=true;

   /**
    *
    */
   public static final String c1ToLowerCase(String s)
   {
      return s.substring(0, 1).toLowerCase()+s.substring(1);
   }

   /**
    *
    */
   public static final String c1ToUpperCase(String s)
   {
      return s.substring(0, 1).toUpperCase()+s.substring(1);
   }

   /**
    *
    */
   public static final String fixName(String s)
   {
      while (s.startsWith("_"))
         s=s.substring(1);
      String char1=s.substring(0, 1);

      String rest=s.substring(1);
      rest=rest.toLowerCase();

      if (rest.length() == 0) {
         // name has only 1 character
         return char1.toUpperCase();
      }
         

      // System.out.println ("Working on "+rest);
      String fixed="";

      StringTokenizer st=new StringTokenizer(rest, "_ ", false);

      fixed=fixed+st.nextToken();

      while (st.hasMoreTokens())
      {
         String tok=st.nextToken();
         tok= tok.substring(0, 1).toUpperCase() + tok.substring(1);
         log.writeDebug (3, "Adding token '"+tok+"'");
         fixed=fixed+tok;
      }

      if (trimTrailingS)
      {
         if(fixed.endsWith("ies"))
         {
            fixed=fixed.substring(0, fixed.length() - 3);
            fixed=fixed+"y";
         }
         else if(fixed.endsWith("ss")) {
            // do nothing.  ex: ProductClass
         }
         else if(fixed.endsWith("us")) {
            // do nothning, ex: Status
         }
         else if(fixed.endsWith("s"))
         {
            fixed=fixed.substring(0, fixed.length() - 1);
         }
      }

      return char1.toUpperCase()+fixed;
   }
}
