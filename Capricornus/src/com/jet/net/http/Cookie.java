package com.jet.net.http;

/*
 * $Log: Cookie.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * This is a data class representing a Cookie.  It is a simple name-value
 * pair representation of a cookie.
 *
 * @author Paul Bemowski
 */
public class Cookie
{
   String name;
   String val;

   /** */
   public Cookie(String n, String v) {
      name=n;
      val=v;
   }

   /** */
   public String getName() {return name;}

   /** */
   public String getValue() {return val;}
}
