package com.jet.net.html.sax;

/**
 * A simple tokenizer for tokenizing quoted tag values.
 *
 * @author Paul Bemowski
 */
class QuoteTokenizer
{
   char[] data=null;
   boolean inString=false;
   int currentLocation=0;
   int length=-1;

   char[] delimiters=null;

   /** */
   public QuoteTokenizer(String target, String del) {
      data=target.toCharArray();
      length=data.length;
      delimiters=del.toCharArray();
      // System.out.println ("length = "+length);
   }

   /** */
   public String nextToken() {
      int end=currentLocation;
      String token=null;

      while (end < length) {
         // System.out.println("Processing '"+data[end]+"'");

         if (isDelimiter(data[end]) &&
             !inString){
            token=(new String(data, currentLocation, end-currentLocation)).trim();
            currentLocation=end+1;
            return token;
         }
         else if (data[end]=='\"') {
            inString=!inString;
            // System.out.println ("Instring "+inString+" at "+end);
         }
         end++;
      }
      
      //System.out.println ("Returning last token "+token+" end="+end+
      //                    "currentlocation="+currentLocation);

      token=(new String(data, currentLocation, end-currentLocation)).trim();
      currentLocation=end;
      return token;
   }

   boolean isDelimiter(char c) {
      for (int i=0; i<delimiters.length; i++) {
         if (delimiters[i] == c)
            return true;
      }
      return false;
   }

   /** */
   public boolean hasMoreTokens() {
      if (currentLocation < length)
         return true;
      else 
         return false;
   }


   public static void main(String args[]) {
      String test="name=\"keywords\" content=\"java sql oracle\" nospam this=\"that\"";

      QuoteTokenizer qt=new QuoteTokenizer(test, " ");

      while (qt.hasMoreTokens()) {
         System.out.println ("token='"+qt.nextToken()+"'");
      }
   }
}
