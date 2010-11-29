package com.jet.utils;

import java.util.*;

/** 
 * A set of utilities for Vectors, Arrays, and ArrayLists.
 *
 * @author Paul Bemowski
 */
public class VectorUtil
{
   /** Changes a CSV String to a Vector  */
   public static final Vector stringToVector(String list)
   {
      Vector vlist=new Vector();
      StringTokenizer st=new StringTokenizer(list, ",;", false);
      while (st.hasMoreTokens()) {
         String s=st.nextToken().trim();
         if (s.length() > 0)
            vlist.addElement(s);
      }
      return vlist;
   }

   /** Changes a CSV String to an Array List. */
   public static final ArrayList stringToList(String list)
   {
      ArrayList alist=new ArrayList();
      StringTokenizer st=new StringTokenizer(list, ",;", false);
      while (st.hasMoreTokens()) {
         String s=st.nextToken().trim();
         if (s.length() > 0)
            alist.add(s);
      }
      return alist;
   }


   /** Changes a CSV String to a String array. */
   public static final String[] stringToArray(String s) {
      if (s == null)
         return null;

      StringTokenizer st=new StringTokenizer(s, ",;", false);
      ArrayList tmp=new ArrayList();
      while (st.hasMoreTokens()){
         tmp.add(st.nextToken().trim());
      }
      return (String[])tmp.toArray(new String[0]);
   }

   /** Changes a string array to a CSV String. */
   public static final String arrayToString(String s[]) {
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<s.length; i++) {
         sb.append(s[i]);
         if (i != s.length-1)
            sb.append(",");
      }
      return sb.toString();
   }

   /** */
   public static final String vectorToString(Vector v)
   {
      int size=v.size();
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<size; i++)
      {
         sb.append(v.elementAt(i));
         if (i != size-1)
            sb.append(", ");
      }
      return sb.toString();
   }

   /** */
   public static final String listToString(List l)
   {
      int size=l.size();
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<size; i++)
      {
         sb.append(l.get(i));
         if (i != size-1)
            sb.append(", ");
      }
      return sb.toString();
   }

   /** */
   public static final Vector listToVector(List l)
   {
      int size=l.size();
      Vector v=new Vector();
      for (int i=0; i<size; i++) {
         v.add(l.get(i));
      }
      return v;
   }

   /** */
   public static final Vector arrayToVector(Object obj[])
   {
      Vector v=new Vector();
      if (obj == null)
         return v;

      for(int i=0; i<obj.length; i++) {
         v.addElement(obj[i]);
      }
      return v;
   }

   /** */
   public static final List arrayToList(Object obj[])
   {
      ArrayList list=new ArrayList();
      if (obj == null)
         return list;

      for(int i=0; i<obj.length; i++) {
         list.add(obj[i]);
      }
      return list;
   }

   /** */
   public static final Vector add(Vector v1, Vector v2)
   {
      Vector v=new Vector();
      int size=v1.size();
      for (int i=0; i<size; i++)
         v.addElement(v1.elementAt(i));
      size=v2.size();
      for (int i=0; i<size; i++)
         v.addElement(v2.elementAt(i));
      return v;
   }

   /** Adds the components of 2 lists to each other. */
   public static final List add(List l1, List l2)
   {
      ArrayList l=new ArrayList();
      int size=l1.size();
      for (int i=0; i<size; i++)
         l.add(l1.get(i));
      size=l2.size();
      for (int i=0; i<size; i++)
         l.add(l2.get(i));
      return l;
   }

   /** Changes a vector to a String[]. */
   public static final String[] vectorToStringArray(Vector v)
   {
      String s[]=new String[v.size()];
      int size=v.size();
      for (int i=0; i<size; i++){
         s[i]=v.elementAt(i).toString();
      }
      return s;
   }

   /** */
   public static final void addToExisting(Vector existing, Vector additions)
   {
      int size=additions.size();
      for (int i=0; i<size; i++)
         existing.addElement(additions.elementAt(i));
   }

   /** Combines 2 lists into a new list with unique objects. 
    * If either l1 or l2 contain duplicates, they will also
    * be made unique by this method. */
   public static final List combineUnique(List l1, List l2) {
      ArrayList newlist=new ArrayList();
      
      int size=l1.size();
      for (int i=0; i<size; i++) {
         Object obj=l1.get(i);
         if (!newlist.contains(obj))
            newlist.add(obj);
      }

      size=l2.size();
      for (int i=0; i<size; i++) {
         Object obj=l2.get(i);
         if (!newlist.contains(obj))
            newlist.add(obj);
      }

      return newlist;
   }

   /** */
   public static final int maxStringLength(List l) {
      int size=l.size();
      int maxLen=0;
      for (int i=0; i<size; i++) {
         Object obj=l.get(i);
         if (obj.toString().length() > maxLen)
            maxLen=obj.toString().length();
      }
      return maxLen;
   }
   
   /** */
   public static final int commonObjects(List l1, List l2) {
      if (l1 == null || l1.size() == 0 ||
          l2 == null || l2.size() == 0) 
         return 0;

      int common=0;
      int size=l1.size();
      for (int i=0; i<size; i++) {
         Object obj=l1.get(i);
         if (l2.contains(obj))
            common++;
      }
      return common;
   }

   /** */
   public static final boolean empty(Vector v)
   {
      if (v == null || v.size() == 0)
         return true;
      else 
         return false;
   }
}
