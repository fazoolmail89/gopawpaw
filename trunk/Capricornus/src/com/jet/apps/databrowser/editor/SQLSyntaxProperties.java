package com.jet.apps.databrowser.editor;

import java.util.*;

/**
 *
 *
 */
public class SQLSyntaxProperties extends SyntaxProperties
{
   /** Used to delimit tokens. */
   String operands=";{}()[]+/%<>=&!,";

   /** */
   String quoteDelimiters="\"`'";

   /** */
   String startDelimiter="/*";
   
   /** */
   String endDelimiter="*/";
      
   /** */
   String singleLineDelimiter="--";

   /** */
   HashMap keywords=new HashMap();

   /** */
   HashMap datatypes=new HashMap();

   /** */
   boolean keywordsCaseInsensitive=false;

   /** */
   boolean datatypesCaseInsensitive=false;

   /** */
   public SQLSyntaxProperties() {
      keywordsCaseInsensitive=true;
      datatypesCaseInsensitive=true;
      setKeywords();
      setDatatypes();

      // FIXME: make case insensitive by adding twice, or
      // by changing the method call as necessary to 
      // lower or upper case things before determining keyword
   }

  
   void setKeywords() {
		addKeyword("ADD");
		addKeyword("ALTER");
		addKeyword("BY");
		addKeyword("DATABASE");
		addKeyword("DELETE");
		addKeyword("DISTINCT");
		addKeyword("DROP");
		addKeyword("FROM");
		addKeyword("GROUP");
		addKeyword("HAVING");
		addKeyword("INDEX");
		addKeyword("INSERT");
		addKeyword("INTO");
		addKeyword("IS");
		addKeyword("ORDER");
		addKeyword("SELECT");
		addKeyword("SET");
		addKeyword("UNION");
		addKeyword("UPDATE");
		addKeyword("VIEW");
		addKeyword("WHERE");
		addKeyword("WHILE");

		addKeyword("CREATE");
		addKeyword("TABLE");
      addKeyword("VALUES");

		addKeyword("ALL");
		addKeyword("AND");
		addKeyword("ANY");
		addKeyword("BETWEEN");
		addKeyword("CROSS");
		addKeyword("EXISTS");
		addKeyword("IN");
		addKeyword("INTERSECT");
		addKeyword("JOIN");
		addKeyword("LIKE");
		addKeyword("NOT");
		addKeyword("NULL");
		addKeyword("OR");
		addKeyword("OUTER");
		addKeyword("SOME");

		addKeyword("ON");
		addKeyword("unique");
		addKeyword("minus");
   }

   void setDatatypes() {
      // datatypes
		addDatatype("binary");
		addDatatype("bit");
		addDatatype("char");
		addDatatype("character");
		addDatatype("datetime");
		addDatatype("decimal");
		addDatatype("float");
		addDatatype("image");
		addDatatype("int");
		addDatatype("integer");
		addDatatype("money");
		addDatatype("name");
		addDatatype("numeric");
		addDatatype("nchar");
		addDatatype("nvarchar");
		addDatatype("ntext");
		addDatatype("real");
		addDatatype("smalldatetime");
		addDatatype("smallint");
		addDatatype("smallmoney");
		addDatatype("text");
		addDatatype("timestamp");
		addDatatype("tinyint");
		addDatatype("uniqueidentifier");
		addDatatype("varbinary");
		addDatatype("varchar");

		addDatatype("varchar2"); // oracle
		addDatatype("number"); // oracle
      addDatatype("bigint"); // MYSQL
      addDatatype("long"); // MYSQL, postgres, ??
      addDatatype("blob"); // MYSQL, postgres, ??      	
      addDatatype("clob"); // MYSQL, postgres, ??
   }

   public void addKeyword(String keyword) {
      if (keywords == null)
         keywords=new HashMap();

      if (keywordsCaseInsensitive)
         keywords.put(keyword.toLowerCase(), this);
      else
         keywords.put(keyword, this);
   }
   
   public void addDatatype(String datatype) {
      if (datatypes == null)
         datatypes=new HashMap();

      if (datatypesCaseInsensitive)
         datatypes.put(datatype.toLowerCase(), this);
      else
         datatypes.put(datatype, this);
   }


   /**
    * Delimits between tokens - this includes whitespace, and all
    * language operators.
    */
   boolean isDelimiter(String character) {
      if (Character.isWhitespace(character.charAt(0)) ||
          operands.indexOf(character) != -1)
         return true;
      return false;
   }

   /**
    * Determines if character is a quote delimeter.
    */
   boolean isQuoteDelimiter(String character) {
      if (quoteDelimiters.indexOf(character) > -1)
         return true;
      return false;      
   }

   /**
    * Determines if the word (token) is a keyword, it will
    * be highlighted accordingly.
    */
   boolean isKeyword(String token) {
      if (keywordsCaseInsensitive)
         token=token.toLowerCase();

      if (keywords.get(token) != null)
         return true;
      return false;
   }

   /**
    * Determines if the word (token) is a datatype, it will
    * be highlighted accordingly.
    */
   boolean isDatatype(String token) {
      if (datatypesCaseInsensitive)
         token=token.toLowerCase();

      if (datatypes.get(token) != null)
         return true;
      return false;
   }
   /** 
    * Determines if this is a multi-line comment start delimeter.
    */
   String getStartDelimiter() {
      return startDelimiter;
   }

   /**
    * Determines if this is a multi-line comment end delimeter. 
    */
   String getEndDelimiter() {
      return endDelimiter;
   }

   /**
    * Determines if this is a single line quote delimeter.
    */
   String getSingleLineDelimiter() {
      return singleLineDelimiter;
   }

   /**
    * Returns the 'escape' string for a given quote delimieter.
    */
   String getEscapeString(String quoteDelimiter) {
      if (quoteDelimiter.equals("'"))
         return "''";
      return quoteDelimiter;
   }
}
