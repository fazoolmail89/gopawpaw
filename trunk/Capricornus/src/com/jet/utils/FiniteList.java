package com.jet.utils;

import java.util.*;

/** 
 * A FiniteList is a list with a maximum size.  Adding to the begining
 * using add(0, ele) will remove the last item if it is greater than
 * the max size.
 *
 * @author Paul Bemowski
 */
public class FiniteList extends ArrayList {
   protected int maxSize=-1;

   public FiniteList(int size) {
      maxSize=size;
   }

   public void add(int index, Object ele) {
      int size=size();

      if (size() == maxSize) {
         remove(size-1);
      }
      super.add(index, ele);
   }

   public void removeAll() {
      super.removeRange(0, size());
   }
}


