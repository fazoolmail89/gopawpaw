package com.jet.database;

import java.util.Vector;

/**
 *
 */
public class SQLUtil
{

   public static String vectorToCS(Vector v)
   {
      int s=v.size();
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<s; i++)
      {
         sb.append(v.elementAt(i).toString()+(i==s-1?"":","));
      }
      return sb.toString();
   }


}
