package com.jet.utils;

import java.util.*;


/**
 * The java.util.StringTokenizer has several drawbacks when reading
 * data exported from excel, or other software using similar formats.
 * 
 *
 */
public class DataTokenizer
{
   String line="";
   
   boolean moreTokens=true;
   char data[]=null;

   /**
    *
    */
   public DataTokenizer(String str)
   {
      line=str;
      data=str.toCharArray();
   }


   private char lastChar=' ';
   private int location=0;

   public String nextToken()
   {
      StringBuffer ret=new StringBuffer();

      boolean done=false;
      boolean instring=false;
      boolean isnull=false;

      if (location == data.length &&
          moreTokens)
      {
         moreTokens=false;
         return null;
      }
      else
      {

      }

      char c=' ';
      while (!done)
      {
         c=data[location]; location++;
         
         if (location == 1) // this is the first char
         {
            // this is a bitch.  
            switch (c)
            {
               case (','):
                  isnull=true;
                  done=true;
                  break;
               case ('"'):
                  if (data[location+1] == '"')
                  {
                     ret.append("\"");
                     location++;
                  }
                  else
                     instring=true;
                  break;
               default:
                  ret.append(c);
            }
         }
         else if (location == data.length) // this is the last char
         {
            switch (c)
            {
               case (','):
               {
                  done=true;
               }
               break;
               case('"'):
                  if (instring)
                  {
                     done=true;
                     moreTokens=false;
                  }
                  else
                  {
                     // error
                     throw new 
                        IllegalArgumentException("Mismatched Quotes in line");
                  }
                  break;
               default:
                  ret=ret.append(c);
                  done=true;
                  moreTokens=false;
            }
         }
         else // these are the middle chars.
         {
            switch (c)
            {
               case (','):
                  if (instring)
                  {
                     ret.append(c);
                  }
                  else
                  {
                     done=true;
                  }
                  break;
               case ('"'):
                  if (instring) instring=false;
                  else instring=true;
                  break;
               default:
                  ret.append(c);
            }
         }
      }
      lastChar=c;
      
      if (isnull)
         return null;
      else
         return ret.toString();
   }


   /**
    *
    */
   public boolean hasMoreTokens()
   {
      return moreTokens;
   }


   public static void main(String args[])
   {
      String s1="\"Hello world\", token 1, token 2, \"token 3\",";
      String s2="1,2,3,4,5";
      String s3="my name is fred   , lkj, \"goodbye, cruel world\", xyz,";
      String s4="\"\"A flute with no holes\"\",is not a flute";

      Vector v=new Vector();
      v.addElement(s1);
      v.addElement(s2);
      v.addElement(s3);
      v.addElement(s4);

      for (int i=0; i<v.size(); i++)
      {
         String s=(String)v.elementAt(i);
         
         DataTokenizer dt=new DataTokenizer(s);
         
         System.out.println("Line = '"+s+"'");
         while (dt.hasMoreTokens())
         {
            String token=dt.nextToken();
            System.out.println ("   token='"+token+"'");
         }
         System.out.println ("\n\n");
      }
   }
}



