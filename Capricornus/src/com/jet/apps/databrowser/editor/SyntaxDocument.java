package com.jet.apps.databrowser.editor;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

import com.jet.utils.StringUtil;

/** 
 * Represents a Document for use in a SyntaxEditorPane, that 
 * gets its syntax information from a SyntaxProperties instance. <p>
 *
 * Unscroupulously stolen from a newsgroup post by Fahd Shariff:<br>
 * http://groups.google.com/groups?hl=en&lr=&selm=9bc0209f.0306180412.54a497a%40posting.google.com&rnum=2
 *
 * @author Paul Bemowski
 */
public class SyntaxDocument extends DefaultStyledDocument
{
   private DefaultStyledDocument doc;
   private Element rootElement;

   private boolean multiLineComment;

   private SyntaxProperties syntaxProps=null;

   /** Constructs a SyntaxDocument.  */
   public SyntaxDocument(SyntaxProperties props)
   {
      syntaxProps=props;

      doc = this;
      rootElement = doc.getDefaultRootElement();
      putProperty( DefaultEditorKit.EndOfLineStringProperty, "\n" );
   }

   /*
    *  Override to apply syntax highlighting after the document has been
    updated
   */
   public void insertString(int offset, String str, AttributeSet a)
      throws BadLocationException
   {
      //      if (str.equals("{"))
      //   str = addMatchingBrace(offset);

      //System.out.println ("inserting '"+str+"'");
      str=StringUtil.replace("\t", "   ", str);
         

      super.insertString(offset, str, a);
      processChangedLines(offset, str.length());
   }

   /*
    *  Override to apply syntax highlighting after the document has been
    updated
   */
   public void remove(int offset, int length) throws
      BadLocationException
   {
      super.remove(offset, length);
      processChangedLines(offset, 0);
   }

   /*
    *  Determine how many lines have been changed,
    *  then apply highlighting to each line
    */
   private void processChangedLines(int offset, int length)
      throws BadLocationException
   {
      String content = doc.getText(0, doc.getLength());

      //  The lines affected by the latest document update

      int startLine = rootElement.getElementIndex( offset );
      int endLine = rootElement.getElementIndex( offset + length );

      //  Make sure all comment lines prior to the start line are commented
      //  and determine if the start line is still in a multi line comment

      setMultiLineComment( commentLinesBefore( content, startLine ) );

      //  Do the actual highlighting

      for (int i = startLine; i <= endLine; i++)
      {
         applyHighlighting(content, i);
      }

      //  Resolve highlighting to the next end multi line delimiter

      if (isMultiLineComment())
         commentLinesAfter(content, endLine);
      else
         highlightLinesAfter(content, endLine);
   }

   /*
    *  Highlight lines when a multi line comment is still 'open'
    *  (ie. matching end delimiter has not yet been encountered)
    */
   private boolean commentLinesBefore(String content, int line)
   {
      int offset = rootElement.getElement( line ).getStartOffset();

      //  Start of comment not found, nothing to do
      int startDelimiter = lastIndexOf( content, getStartDelimiter(),
                                        offset - 2 );

      if (startDelimiter < 0)
         return false;

      //  Matching start/end of comment found, nothing to do
      int endDelimiter = indexOf( content, getEndDelimiter(),
                                  startDelimiter );

      if (endDelimiter < offset & endDelimiter != -1)
         return false;

      //  End of comment not found, highlight the lines
      doc.setCharacterAttributes(startDelimiter, offset - startDelimiter +
                                 1, syntaxProps.comment, false);
      return true;
   }

   /*
    *  Highlight comment lines to matching end delimiter
    */
   private void commentLinesAfter(String content, int line)
   {
      int offset = rootElement.getElement( line ).getEndOffset();

      //  End of comment not found, nothing to do

      int endDelimiter = indexOf( content, getEndDelimiter(), offset );

      if (endDelimiter < 0)
         return;

      //  Matching start/end of comment found, comment the lines

      int startDelimiter = lastIndexOf( content, getStartDelimiter(),
                                        endDelimiter );

      if (startDelimiter < 0 || startDelimiter <= offset)
      {
         doc.setCharacterAttributes(offset, endDelimiter - offset + 1,
                                    syntaxProps.comment, false);
      }
   }

   /*
    *  Highlight lines to start or end delimiter
    */
   private void highlightLinesAfter(String content, int line)
      throws BadLocationException
   {
      int offset = rootElement.getElement( line ).getEndOffset();

      //  Start/End delimiter not found, nothing to do

      int startDelimiter = indexOf( content, getStartDelimiter(), offset
                                    );
      int endDelimiter = indexOf( content, getEndDelimiter(), offset );

      if (startDelimiter < 0)
         startDelimiter = content.length();

      if (endDelimiter < 0)
         endDelimiter = content.length();

      int delimiter = Math.min(startDelimiter, endDelimiter);

      if (delimiter < offset)
         return;

      // Start/End delimiter found, reapply highlighting

      int endLine = rootElement.getElementIndex( delimiter );

      for (int i = line + 1; i < endLine; i++)
      {
         Element branch = rootElement.getElement( i );
         Element leaf = doc.getCharacterElement( branch.getStartOffset() );
         AttributeSet as = leaf.getAttributes();

         if ( as.isEqual(syntaxProps.comment) )
            applyHighlighting(content, i);
      }
   }

   /*
    *  Parse the line to determine the appropriate highlighting
    */
   private void applyHighlighting(String content, int line)
      throws BadLocationException
   {
      int startOffset = rootElement.getElement( line ).getStartOffset();
      int endOffset = rootElement.getElement( line ).getEndOffset() - 1;

      int lineLength = endOffset - startOffset;
      int contentLength = content.length();

      if (endOffset >= contentLength)
         endOffset = contentLength - 1;

      //  check for multi line comments
      //  (always set the comment attribute for the entire line)

      if (endingMultiLineComment(content, startOffset, endOffset)
          ||  isMultiLineComment()
          ||  startingMultiLineComment(content, startOffset, endOffset) )
      {
         doc.setCharacterAttributes(startOffset, endOffset - startOffset +
                                    1, syntaxProps.comment, false);
         return;
      }

      //  set normal attributes for the line
      doc.setCharacterAttributes(startOffset, lineLength, 
                                 syntaxProps.normal, true);

      //  check for single line comment
      int index = content.indexOf(getSingleLineDelimiter(), startOffset);

      if ( (index > -1) && (index < endOffset) )
      {
         doc.setCharacterAttributes(index, endOffset - index + 1,
                                    syntaxProps.comment, false);
         endOffset = index - 1;
      }

      //  check for tokens

      checkForTokens(content, startOffset, endOffset);
   }

   /*
    *  Does this line contain the start delimiter
    */
   private boolean startingMultiLineComment(String content, int
                                            startOffset, int endOffset)
      throws BadLocationException
   {
      int index = indexOf( content, getStartDelimiter(), startOffset );

      if ( (index < 0) || (index > endOffset) )
         return false;
      else
      {
         setMultiLineComment( true );
         return true;
      }
   }

   /*
    *  Does this line contain the end delimiter
    */
   private boolean endingMultiLineComment(String content, int
                                          startOffset, int endOffset)
      throws BadLocationException
   {
      int index = indexOf( content, getEndDelimiter(), startOffset );

      if ( (index < 0) || (index > endOffset) )
         return false;
      else
      {
         setMultiLineComment( false );
         return true;
      }
   }

   /*
    *  We have found a start delimiter
    *  and are still searching for the end delimiter
    */
   private boolean isMultiLineComment()
   {
      return multiLineComment;
   }

   private void setMultiLineComment(boolean value)
   {
      multiLineComment = value;
   }

   /*
    * Parse the line for tokens to highlight
    */
   private void checkForTokens(String content, int startOffset, int
                               endOffset)
   {
      while (startOffset <= endOffset)
      {
         //  skip the delimiters to find the start of a new token

         while ( isDelimiter( content.substring(startOffset, startOffset +
                                                1) ) )
         {
            if (startOffset < endOffset)
               startOffset++;
            else
               return;
         }

         //  Extract and process the entire token

         if ( isQuoteDelimiter( content.substring(startOffset, startOffset +
                                                  1) ) )
            startOffset = getQuoteToken(content, startOffset, endOffset);
         else
            startOffset = getOtherToken(content, startOffset, endOffset);
      }
   }

   /*
    *
    */
   private int getQuoteToken(String content, int startOffset, int
                             endOffset)
   {
      String quoteDelimiter = content.substring(startOffset, startOffset +
                                                1);
      String escapeString = getEscapeString(quoteDelimiter);

      int index;
      int endOfQuote = startOffset;

      //  skip over the escape quotes in this quote

      index = content.indexOf(escapeString, endOfQuote + 1);

      while ( (index > -1) && (index < endOffset) )
      {
         endOfQuote = index + 1;
         index = content.indexOf(escapeString, endOfQuote);
      }

      // now find the matching delimiter

      index = content.indexOf(quoteDelimiter, endOfQuote + 1);

      if ( (index < 0) || (index > endOffset) )
         endOfQuote = endOffset;
      else
         endOfQuote = index;

      doc.setCharacterAttributes(startOffset, endOfQuote - startOffset +
                                 1, syntaxProps.quote, false);

      return endOfQuote + 1;
   }

   /*
    *
    */
   private int getOtherToken(String content, int startOffset, int
                             endOffset)
   {
      int endOfToken = startOffset + 1;

      while ( endOfToken <= endOffset )
      {
         if ( isDelimiter( content.substring(endOfToken, endOfToken + 1) ) )
            break;

         endOfToken++;
      }

      String token = content.substring(startOffset, endOfToken);

      if ( isKeyword( token ) )
         doc.setCharacterAttributes(startOffset, endOfToken - startOffset,
                                    syntaxProps.keyword, false);
      if ( isDatatype( token ) )
         doc.setCharacterAttributes(startOffset, endOfToken - startOffset,
                                    syntaxProps.datatype, false);

      return endOfToken + 1;
   }

   /*
    *  Assume the needle will the found at the start/end of the line
    */
   private int indexOf(String content, String needle, int offset)
   {
      int index;

      while ( (index = content.indexOf(needle, offset)) != -1 )
      {
         String text = getLine( content, index ).trim();

         if (text.startsWith(needle) || text.endsWith(needle))
            break;
         else
            offset = index + 1;
      }

      return index;
   }

   /*
    *  Assume the needle will the found at the start/end of the line
    */
   private int lastIndexOf(String content, String needle, int offset)
   {
      int index;

      while ( (index = content.lastIndexOf(needle, offset)) != -1 )
      {
         String text = getLine( content, index ).trim();

         if (text.startsWith(needle) || text.endsWith(needle))
            break;
         else
            offset = index - 1;
      }

      return index;
   }

   private String getLine(String content, int offset)
   {
      int line = rootElement.getElementIndex( offset );
      Element lineElement = rootElement.getElement( line );
      int start = lineElement.getStartOffset();
      int end = lineElement.getEndOffset();
      return content.substring(start, end - 1);
   }

   /** */
   protected boolean isDelimiter(String character) {
      return syntaxProps.isDelimiter(character);
   }

   /** */
   protected boolean isQuoteDelimiter(String character) {
      return syntaxProps.isQuoteDelimiter(character);
   }
   
   /** */
   protected boolean isKeyword(String token) {
      return syntaxProps.isKeyword(token);
   }

   /** */
   protected boolean isDatatype(String token) {
      return syntaxProps.isDatatype(token);
   }

   /** */
   protected String getStartDelimiter() {
      return syntaxProps.getStartDelimiter();
   }

   /** */
   protected String getEndDelimiter() {
      return syntaxProps.getEndDelimiter();
   }

   /** */
   protected String getSingleLineDelimiter(){
      return syntaxProps.getSingleLineDelimiter();
   }

   /** */
   protected String getEscapeString(String quoteDelimiter) {
      return syntaxProps.getEscapeString(quoteDelimiter);
   }

   public static void main(String a[])
   {
      JFrame frame = new JFrame("Syntax Highlighting");
      JEditorPane edit = new JEditorPane();
      edit.setEditorKit(new StyledEditorKit());
      SQLSyntaxProperties ssp=new SQLSyntaxProperties();
      edit.setDocument(new SyntaxDocument(ssp));

      // SyntaxUndoManager mgr=new SyntaxUndoManager(edit);

      JScrollPane scroll=new JScrollPane(edit);
      frame.getContentPane().add(scroll);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,300);
      frame.setVisible(true);
   }
}
