package com.jet.net.nntp;

/**
 * Data that encapsulates a newsgroup.  This is simply the article name
 * and the current minimum and maximum article in this group. 
 *
 * @author Paul Bemowski
 */
public class Newsgroup
{
   String name;
   int firstarticle=-1;
   int lastarticle=-1;

   /** Constructs a newsgroup object.
    * @param name The name of the newsgroup. 
    * @param fm The first article number. 
    * @param lm The last article number. */
   public Newsgroup(String name, int fm, int lm) {
      this.name=name;
      firstarticle=fm;
      lastarticle=lm;
   }

   /** Returns group_name:[first,last]. */
   public String toString() {return name+":["+firstarticle+","+
                             lastarticle+"]";}

   /** Returns the name of the newsgroup. */
   public String getName() {return name;}

   /** */
   public int firstMessage() {return firstarticle;}

   /** Returns the first available article in the group. */
   public int firstArticle() {return firstarticle;}
   
   /** */
   public int lastMessage() {return lastarticle;}

   /** Returns the last available article in the group. */
   public int lastArticle() {return lastarticle;}
}
