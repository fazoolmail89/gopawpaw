package com.jet.utils;

import com.jet.log.Logger;

/**
 * This class will contain a number of static methods used to 
 * validate standard pieces of informaiton, such as machine names, ip
 * addresses, email addresses, etc.
 *
 * @author Paul Bemowski
 */
public class DataValidator implements Logger
{
   public static final boolean debug=false;

   /**
    *
    */
   public static boolean validateMachineName(String name)
   {
      if (debug)
         log.writeDebug ("Validate Machine Name '"+name+"'");
      if (name == null ||
          name.length() == 0)
         return false;
         
      char chars[]=name.toCharArray();
      for (int i=0; i<chars.length; i++)
      {
         if (!isMachineChar(chars[i]))
            return false;
      }
      return true;
   }

   /**
    *
    */
   public static boolean validateEmailAddress(String email)
   {
      if (email == null ||
          email.length() <= 3)
         return false;
         
      char chars[]=email.toCharArray();
      for (int i=0; i<chars.length; i++)
      {
         if (!isMachineChar(chars[i]))
            return false;
      }
      
      if (email.indexOf("@") == -1)
         return false;

      return true;
   }

   /**
    *
    */
   public static boolean validatePortNumber(String port)
   {
      if (debug)
         log.writeDebug ("Validate Port '"+port+"'");
      if (port == null ||
          port.trim().length() == 0)
         return false;

      try{Integer.parseInt(port.trim());}
      catch (NumberFormatException ex){return false;}
      return true;
   }


   /**
    *
    */
   private static final boolean isMachineChar(char c)
   {
      if (!Character.isLetterOrDigit(c))
      {
         if (c == '-' ||
             c == '.')
            return true;
         else
         {
            if (debug)
               log.writeDebug ("Invalid char:"+c);
            return false;
         }
      }
      return true;
   }
   
   /**
    *
    */
   private static final boolean isEmailChar(char c)
   {
      if (!Character.isLetterOrDigit(c))
      {
         if (c == '-' ||
             c == '.' ||
             c == '@')
            return true;
         else
            return false;
      }
      return true;
   }

   /**
    *
    */
   public static boolean empty(String s)
   {
      if (s == null ||
          s.length() == 0)
         return true;
      else
         return false;
   }
}
