package com.jet.net.html.sax;

import java.util.*;

/**
 * The Tag is a data object encapsulating everything about an HTML 
 * tag.<p>
 *
 * Note: Tag attributes are ALWAYS in lower case.
 *
 * @author Paul Bemowski 
 */
public class Tag
{
   /** This is the initial value of the type variable */
   public static final int UNKNOWN=-1;
   /** This indicates a start tag. <p> 
    * A start tag is defined as a tag that does not start or end with '/'. */
   public static final int START=0;
   /** This indicates an end tag. <p>
    * An end tag is defined as a tag that begins with '/'. */
   public static final int END=1;
   /** This indicates an atomic tag. <p>
    * An atomic tag is defined as a tag that ends with '/'.  As such, 
    * a tag like &lt;br&gt; is NOT atomic, &lt;br/&gt; IS atomic. */
   public static final int ATOMIC=2;

   /** The name of the tag. */
   protected String name;
   /** A hashtable of tag attributes. */
   protected Hashtable attributes;
   
   /** The type of tag, belonging to [START, END, ATOMIC]. */
   protected int type=UNKNOWN;

   /** */
   protected String htmlString=null;

   /**
    * This is the only Tag constructor, taking data from between the
    * &lt; and &gt; tags.  Ie, you should pass in 'a href=...', NOT
    * '&lt;a href=...&gt;'.  
    */
   public Tag(String s)
      throws ParseException
   {
      htmlString="<"+s+">";      
      formTagFromString(s);
   }

   /** 
    * This method takes data from between the tag delimiters &lt;&gt;.  So for
    * &lt;a href="http://www.jetools.com&gt; this method will parse the text
    * 'a href="http://www.jetools.com'.
    **/
   private void formTagFromString(String s)
      throws ParseException
   {
      String workingText=s;

      // some tags will span lines.
      workingText=workingText.replace('\n', ' ');
      workingText=workingText.replace('\r', ' ');

      if (workingText.startsWith("/")) {
         type=END;
         workingText=workingText.substring(1);
      }
      if (workingText.endsWith("/")) {
         if (type == UNKNOWN) {
            type=ATOMIC;
            workingText=workingText.substring(0, workingText.length()-1);
         }
      }
      if (type == UNKNOWN)
         type=START;
      
      workingText=workingText.trim();

      // OK, We've determined tag type, and stripped relevant text.
      // now, let's strip the name off.
      int spaceindex=workingText.indexOf(" ");
      if (spaceindex != -1) {
         name=workingText.substring(0, spaceindex).toLowerCase();
         workingText=workingText.substring(spaceindex).trim();
      }
      else { // no parameters
         name=workingText.toLowerCase();
         return;
      }
      
      // System.out.println ("Parm string: "+workingText);

      populateAttributes(workingText);
   }

   /**
    * This function parses parameters.  All of the follwoing are valid 
    * parms:<p>
    * nowrap <br>
    * nowrap=true <br>
    * nowrap="true" <br>
    */
   private void populateAttributes(String attributeString) 
      throws ParseException {
      attributes=new Hashtable();
      
      // StringTokenizer st=new StringTokenizer(attributeString, " ", false);
      QuoteTokenizer st=new QuoteTokenizer(attributeString, " ");
      while (st.hasMoreTokens()) {
         String token=st.nextToken();

         int eqindex=token.indexOf("=");
         if(eqindex == -1) {
            // flag token
            attributes.put(token.toLowerCase(), "true");
         }
         else {
            String key=token.substring(0, eqindex);
            String val=token.substring(eqindex+1);
            if (val.startsWith("\""))
               val=val.substring(1);
            if (val.endsWith("\""))
               val=val.substring(0, val.length()-1);
            attributes.put(key.toLowerCase(), val);
         }
      }
   }

   /** */
   public Enumeration getAttributeNames() {
      if (attributes == null)
         return null;
      return attributes.keys();
   }

   /** Returns the original tag string. */
   public String htmlString() {return htmlString;}

   /** Returns this tag's name.  */
   public String getName() {return name;}

   /** Searches for the given attribute value by key. */
   public String getAttribute(String key) {
      if (attributes == null)
         return null;
      else
         return (String)attributes.get(key);
   }

   /** Returns the tag type.  Tag types are defined as public constants
    * on this class. */
   public int getType() {return type;}

   /** */
   public String toString() {
      return typeToString(type)+": "+name+" "+
      ((attributes==null)?"{}":attributes.toString());
   }

   /** Converts the type integer to it's corresponding type string. */
   public static final String typeToString(int i) {
      switch (i) {
         case (UNKNOWN): return "UNKNOWN";
         case (START): return "START";
         case (END): return "END";
         case (ATOMIC): return "ATOMIC";
         default: return "ERROR";
      }
   }

   /** Compares equality based on tag NAME ONLY.  Tag type and the
    * tag's attributes are not considered in the equality calculation. */
   public boolean equals(Object o) {
      if (o instanceof String) {
         if (this.name != null &&
             this.name.equalsIgnoreCase((String)o))
            return true;
         else 
            return false;
      }

      if (!(o instanceof Tag)) {
         return false;
      }
      Tag tag=(Tag)o;

      if (tag.name != null &&
          this.name != null &&
          this.name.equals(tag.name))
         return true;
      else
         return false;
   }
}
