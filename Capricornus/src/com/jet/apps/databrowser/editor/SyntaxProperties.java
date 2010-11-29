package com.jet.apps.databrowser.editor;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.Color;

/**
 *
 *
 */
public abstract class SyntaxProperties
{
   public MutableAttributeSet normal;
   public MutableAttributeSet keyword;
   public MutableAttributeSet datatype;
   public MutableAttributeSet comment;
   public MutableAttributeSet quote;

   /** 
    *
    */
   public SyntaxProperties() {
      normal = new SimpleAttributeSet();
      StyleConstants.setForeground(normal, Color.black);

      comment = new SimpleAttributeSet();
      StyleConstants.setForeground(comment, Color.gray);
      StyleConstants.setItalic(comment, true);

      keyword = new SimpleAttributeSet();
      StyleConstants.setForeground(keyword, Color.red);

      datatype = new SimpleAttributeSet();
      StyleConstants.setForeground(datatype, Color.green);

      quote = new SimpleAttributeSet();
      StyleConstants.setForeground(quote, Color.blue);
   }

   /**
    * Delimits between tokens - this includes whitespace, and all
    * language operators.
    */
   abstract boolean isDelimiter(String character);

   /**
    * Determines if character is a quote delimeter.
    */
   abstract boolean isQuoteDelimiter(String character);

   /**
    * Determines if the word (token) is a keyword, it will
    * be highlighted accordingly.
    */
   abstract boolean isKeyword(String token);

   /**
    * Determines if the word (token) is a datatype, it will
    * be highlighted accordingly.
    */
   abstract boolean isDatatype(String token);

   /** 
    * Determines if this is a multi-line comment start delimeter.
    */
   abstract String getStartDelimiter();

   /**
    * Determines if this is a multi-line comment end delimeter. 
    */
   abstract String getEndDelimiter();

   /**
    * Determines if this is a single line quote delimeter.
    */
   abstract String getSingleLineDelimiter();

   /**
    * Returns the 'escape' string for a given quote delimieter.
    */
   abstract String getEscapeString(String quoteDelimiter);
}
