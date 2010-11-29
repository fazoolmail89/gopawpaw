package com.jet.net.html.sax;

/**
 * A PageHandler is fired events from an HtmlParser.  The user of the 
 * API must write a handler class that implements this interface, and 
 * pass it to the HtmlParser before parsing an HTML stream.
 *
 * @author Paul Bemowski
 */
public interface PageHandler
{
   /** Process a tag found by the parser.  Tag has a 'START', 'END', and 
    * 'ATOMIC' state. See the javadoc for Tag for definitions of start,
    *  end, and atomic. 
    * @param t The tag that was just processed. 
    */
   public void processTag(Tag t) throws ParseException;

   /** 
    * Process any an all text that is not a tag, or a comment.  Fired in 
    * order with the tag events.
    */
   public void processText(String s) throws ParseException;
   
   /**
    * Process the raw text between comment tags.
    */
   public void processComment(String s) throws ParseException;
   
   /**
    * Signals the start of a document.
    */
   public void startDocument() throws ParseException;

   /**
    * Signals the end of a document.
    */
   public void endDocument() throws ParseException;
}

