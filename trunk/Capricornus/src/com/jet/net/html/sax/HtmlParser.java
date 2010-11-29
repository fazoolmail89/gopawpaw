package com.jet.net.html.sax;

import java.io.*;
import java.util.*;

/**
 * The HtmlParser is a SAX style parser for HyperText Markup Language.  
 * All XML SAX parsers will not handle general HTML because HTML is not 
 * nearly as rigid in its specification.  <P>
 *
 * The HtmlParser works in conjunction with the PageHandler interface that
 * the user is expected to implement.  General use of the parser will 
 * involve the following general steps:
 * <ol>
 * <li> Write a Handler class that implements the PageHandler interface.
 * 
 * <li> Construct a HtmlParser with your PageHandler implementation.
 * <li> Obtain a stream (by hook or by crook) to an Html based resource.
 * <li> Instruct the HtmlParser to parse the stream with the 
 * parse(InputStream is) method.  The parser will read the HTML 
 * stream, firing events to the Handler through the PageHandler interface.
 * </ol>
 * <br>
 * The Parser is a single threaded beast.  It can be reused, however it is
 * likely that your PageHandler will be stateful, so you must either reset
 * it's state, or create a new PageHandler and call setPageHandler before
 * parsing another document. <p>
 *
 * The format of HTML is much looser than XML, so this parser does not
 * look to validate against any sort of DTD, or to check that the data
 * is well formed.  Generally speaking, HTML is never well formed ;). 
 *
 * @author Paul Bemowski
 */
public class HtmlParser
{
   /** The current PageHandler object to which events will be fired in the
    * parse operation. */
   protected PageHandler pageHandler=null;

   /** End of Stream. */
   static final int EOS=-1;

   /** Constructs a Parser with the specified PageHandler.  */
   public HtmlParser(PageHandler ph)
   {
      pageHandler=ph;
   }

   /** Constructs an empty HtmlParser.  You must set a PageHandler with the
    * setPageHandler method if you are to use this constructor. */
   public HtmlParser() {}

   /** Sets a PageHandler on this Parser.  
    * @param ph The PageHandler to be used for the subsequent parse 
    * operation. */
   public void setPageHandler(PageHandler ph) {
      pageHandler=ph;
   }

   /**
    * Instructs the parser to parse the given input stream.  It will
    * read until a critical error, or the end of the stream.  The parser
    * itself will not close the InputStream, that is left to the application
    * programmer.
    *
    * @param is A stream to an HTML formatted text document. 
    */
   public void parse(InputStream is) 
      throws ParseException, IOException 
   {
      if (pageHandler == null)
         throw new ParseException ("No page handler defined.");

      try {
         BufferedInputStream bis=new BufferedInputStream(is, 8192);
         PushbackInputStream pbis=new PushbackInputStream(bis, 128);
         
         processStartDocument();

         Tag t=null;
         String text=readTillStartTag(pbis);
         processText(text);

         t=readTag(pbis);

         while (t != null) {
            processTag(t);
            
            text=readTillStartTag(pbis);
            processText(text);

            t=readTag(pbis);
         }
         processEndDocument();
      }
      catch (Throwable ex) {
         // ex.printStackTrace();
         throw new ParseException("Error Parsing.", ex);
      }
   }

   /** 
    * Convience method to parse an html string.
    */
   public void parse(String s) 
      throws ParseException, IOException {
      InputStream is=new StringBufferInputStream(s);
      parse(is);
      is.close();
   }
   
   /** Fired when the parser completes reading a Tag object.  The Tag itself
    * will contain some 'meta data' about they type of tag it is -- eg 
    * a start tag (&lt;b&gt;), an end tag (&lt;/b&gt;), or an atomic tag --
    * (&lt;br&gt;). */
   protected void processTag(Tag t) throws ParseException {
      pageHandler.processTag(t);
   }

   /** Fired when the parser encounters any text that is not inside 
    * of a tag.  
    * @param s A String containing the non-tag/non-comment data. */
   protected void processText(String s) throws ParseException {
      pageHandler.processText(s);
   }

   /** Fired when the parser completes reading an html comment block. 
    * @param s A String containing the data betweeen the comment tags. */
   protected void processComment(String s) throws ParseException {
      pageHandler.processComment(s);
   }

   /** Fired when the parser starts processing the document. */
   protected void processStartDocument() throws ParseException {
      pageHandler.startDocument();
   }

   /** Fired when the parser finishes parsing the document. */
   protected void processEndDocument() throws ParseException {
      pageHandler.endDocument();
   }

   /** */
   private String readTillStartTag(PushbackInputStream pbis) 
      throws IOException, ParseException
   {
      StringBuffer sb=new StringBuffer();
      int i;
      byte b;
      while (true) {
         i=pbis.read();
         if (i == EOS)
            return sb.toString();
         b=(byte)i;
         if (b == '<') {
            byte buf[]=new byte[3];
            int chars=pbis.read(buf);
            if (chars == 3) {
               String s=new String(buf);
               if (s.equals("!--")) {
                  String comment=readComment(pbis);
                  processComment(comment);
                  // don't return, continue reading
               }
               else {
                  pbis.unread(buf);
                  return sb.toString();
               }
            }
            else {
               pbis.unread(buf, 0, chars);
               return sb.toString();
            }
         }
         else
            sb.append((char)b);
      }
   }

   /** */
   private String readComment(PushbackInputStream pbis) 
      throws IOException, ParseException 
   {
      StringBuffer sb=new StringBuffer();
      int i;
      byte b;
      i=pbis.read();

      if (i == EOS)
         return null;

      while (true) {
         if (i == EOS)
            throw new ParseException("Comment start without end");

         b=(byte)i;
         if (b == '-') {
            byte buf[]=new byte[2];
            int chars=pbis.read(buf);
            if (chars == -1) {
               throw new ParseException("Comment start without end.");
            }

            if (chars == 2) {
               String s=new String(buf);
               if (s.equals("->")) {
                  return sb.toString();
               }
               else {
                  pbis.unread(buf);
               }
            }
            else {
               pbis.unread(buf, 0, chars);
            }
         }

         sb.append((char)b);
         i=pbis.read();
      }
   }

   /**
    *
    */
   private Tag readTag(PushbackInputStream bis) 
      throws IOException, ParseException
   {
      int i=bis.read();
      if (i == EOS)
         return null;
      byte b=(byte)i;
      
      String name=null;
      StringBuffer sb=new StringBuffer();

      while (b != '>') {
         sb.append((char)b);

         b=(byte)bis.read();

         if (b == EOS)
            return null;
      }
      
      String tagString=sb.toString();
      // System.out.println("TagString: "+tagString);

      Tag tag=new Tag(tagString);

      return tag;
   }
}
