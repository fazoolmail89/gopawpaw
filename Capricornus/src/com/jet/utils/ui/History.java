package com.jet.utils.ui;

import java.util.*;

/* 
 * $Log: History.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2001/10/03 00:53:31  bemocvs
 * misc updates.
 *
 */

/**
 * Represents sql "history" for the browser functionality.
 *
 * @author Paul Bemowski
 */
public class History extends Vector
{
   // a currentPointer of -1 indicates that the history pointer
   // is at the top of the stack.
   int currentPointer=-1;

   // The maximum size of the vector
   int maxSize=20;

   /** Constructs a History object with a maximum size. */
   public History(int size){
      super (size);
      maxSize=size;
   }

   /** */
   public void initFromVector(Vector v) {
      for (int i=0; i<v.size(); i++) {
         this.addElement(v.elementAt(i).toString());
      }
      currentPointer=-1;
   }

   /**
    *
    */
   public void addElement(String s)
   {
      if (currentPointer == -1) {
         if (size() > maxSize)
            super.removeElementAt(0);

         super.addElement(s);
         return;
      }
      else {
         // current pointer is != -1.  This means we are NOT at the top
         // of the stack.  

         // prevent duplicates on the stack
         if (!s.equals(elementAt(currentPointer))){
            // this removes everything forward if we add something new.
            // this is the default behavior of a history object in the
            // spirit of the netscape/ie history buttons.

            // this kind of sux, because it is lossy.  We loose information 
            // about where we've been.
            for (int i=currentPointer; i<size(); i++) {
               super.removeElementAt(i);
            }
            
            // add the new element, and make it the 'top' of the stack.
            super.addElement(s);
            currentPointer=-1;
         }
      }
   }

   public void clear()
   {
      removeAllElements();
      currentPointer=-1;
   }

   /**
    */ 
   public boolean hasPrev()
   {
      if (size() == 0)
         return false;
      else
      {
         if (currentPointer == 0)
            return false;
         else
            return true;
      }
   }

   /**
    *
    */
   public String getPrev()
   {
      if (size() > 0)
      {
         if (currentPointer == -1) // Just starting to go back
         {
            currentPointer=size()-1;
            return (String)elementAt(currentPointer);
         }
         else if (currentPointer >= 1) // moving back
         {
            currentPointer--;
            return (String)elementAt(currentPointer);
         }
         else
            return null;
      }
      return null;
   }
   
   /**
    */
   public boolean hasNext()
   {

      if (size() <= 0)
         return false;
      else
      {
         if (currentPointer == -1 ||
             currentPointer == size()-1)
            return false;
         else
            return true;
      }
   }


   /**
    *
    */
   public String getNext()
   {
      if (size() > 0)
      {
         if (currentPointer >= 0 &&
             currentPointer < size()-1)
         {
            currentPointer++;
            return (String)elementAt(currentPointer);
         }
      }
      return null;
   }
}
