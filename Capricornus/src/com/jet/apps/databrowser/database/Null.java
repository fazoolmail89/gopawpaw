package com.jet.apps.databrowser.database;

/*
 * $Log: Null.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2001/10/03 11:33:04  bemocvs
 * xxx
 *
 */

/**
 * Used to represent a null value from a database.
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
