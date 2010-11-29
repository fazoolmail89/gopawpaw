package com.jet.utils.properties;

import java.util.*;

/**
 * Represents a key in the EProperties class.  Key's behave like strings
 * in hashtables and vectors, but they have extended attributes 
 * useful for maintaining properties files, and notifying property 
 * observers.
 *
 * @author Paul Bemowski
 */
public class Key
{
   StringBuffer comments=null;
   String key=null;

   Vector observers=null;

   /** If a property is transient, it is not stored back to the data file. */
   boolean trans=false;
   
   /**
    *
    */
   public Key(String k, StringBuffer c)
   {
      if (k == null)
         throw new Error ("null key");
      key=k;
      comments=c;
   }

   /**
    *
    */
   public Key(String k)
   {
      this(k, null);
   }

   /** */
   public String keyString()
   {
      if (comments != null)
      {
         String commentString=comments.toString();
         if (!commentString.endsWith("\n"))
            commentString=commentString+"\n";

         return commentString+key;
      }
      else 
         return key;
   }

   /** */
   public void setComments(String com)
   {
      comments=new StringBuffer();
      comments.append(com);
   }
   
   /** */
   public String toString()
   {
      return key;
   }

   /**
    *
    */
   public int hashCode()
   {
      return key.hashCode();
   }

   /**
    *
    */
   public boolean equals(Object obj)
   {
      String type="unk";
      boolean ret=false;
      if (obj instanceof String)
      {
         type="String";
         String s=(String)obj;
         if (s.equals(key))
            ret=true;
         else 
            ret=false;
      }
      else if (obj instanceof Key)
      {
         type="key";
         Key k=(Key)obj;
         if (k.key.equals(key))
            ret=true;
         else
            ret=false;
      }
      else
         ret=false;
      
      //System.out.println ("Key("+key+") == "+obj.toString()+" type="+type+" ? "+ret);
      return ret;
   }

   /**  */
   public boolean isTransient() {return trans;}

   /** */
   public void setTransient(boolean b) {trans=b;}

   /**
    *
    */
   void addObserver(PropertyObserver obs)
   {
      if (observers == null)
         observers=new Vector();
      observers.removeElement(obs); // prevent duplicates
      observers.addElement(obs);
   }

   /**
    *
    */
   void removeObserver(PropertyObserver obs)
   {
      if (observers == null) return;
      else
         observers.removeElement(obs);
   }

   /**
    *
    */
   void notifyObservers(Object value)
   {
      if (observers == null) return;  
      
      // generate the event
      PropertyChangeEvent evt=new PropertyChangeEvent(this, value);

      for (int i=0; i<observers.size(); i++)
      {
         PropertyObserver obs=(PropertyObserver)observers.elementAt(i);
         obs.propertyChange(evt);
      }
   }
}
