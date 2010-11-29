package com.jet.log;

import java.util.Date;

/**
 * BenchData is returned from the log.startBench() method.  
 *
 */
public class BenchData
{
   int level=1;
   long start=-1;
   String name=null;

   /** */
   BenchData(String s) {
      start=System.currentTimeMillis();
      name=s;
   }

   /** */
   BenchData(int i, String s) {
      this(s);
      level=i;
   }

   /** */
   public long getStart() {return start;}

   /** */
   public int getLevel() {return level;}

   /** */
   public String toString() {return "BD["+name+"]";} // started "+
   // Log.df.format(new Date(start));}
}
