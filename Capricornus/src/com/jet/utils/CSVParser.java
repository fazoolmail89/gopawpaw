package com.jet.utils;

import java.util.*;
import java.io.*;

/**
 * This class should parse most CSV files, including those with 
 * quoted fields, non-quoted fields, and double quotes (escaped quotes)
 * within a field.  <p>
 *
 * It is a simple hueristic implementation based on peeking and a 
 * PushbackReader. <p>
 *
 * @author Paul Bemowski
 */
public class CSVParser 
{
   //PushbackReader pbr=null;
   BufferedReader reader=null;

   private int bytecount=0; 
   private int lineposition=0;
   private int linecount=0;

   public static final boolean debug=true;

   /** 
    * Constructs a CSV parser with a Reader.
    */
   public CSVParser(Reader r) 
      throws IOException {
      // pbr=new PushbackReader(r, 10); // pushback 2 chars
      reader=new BufferedReader(r);
   }





   private char SEPARATOR=',';


   public List nextRecord() 
      throws IOException {
      String line=reader.readLine();
      if (line == null)
         return null;

      return parseCsvRecord(line);
   }

    // CSV record parser ------------------------------------------------
    private List parseCsvRecord(String record) {
        boolean quoted = false;
        String field = "";
        List fields = new ArrayList();

        // Process fields.
        for (int i = 0; i < record.length(); i++) {
            field += record.charAt(i);

            if (record.charAt(i) == '"') {
                quoted = !quoted; // detect nested quotes
            }

            if ((!quoted && record.charAt(i) == SEPARATOR) // the separator
                || i + 1 == record.length()) // end of record
            {
                field = field.replaceAll(SEPARATOR+"$", ""); // trim ending semicolon
                field = field.replaceAll("^\"|\"$", ""); // trim surrounding quotes
                field = field.replaceAll("\"\"", "\\\""); // re-escape quotes
                fields.add(field.trim());
                field = "";
            }
        }

        return fields;
    }


//    /** 
//     * Reads the next record, returning the CSV line parsed into an array
//     * list of Strings. 
//     * @return List of strings representing the next line.
//     */
//    public List nextRecord() 
//       throws IOException {
//       if (debug)
//          System.out.println ("Reading record");

//       ArrayList record=new ArrayList();

//       boolean EOR=false;

//       while (!EOR) {
//          String field=readField();
//          if (field == null) {
//             if (debug) {
//                System.out.println ("null field.");
//                printState();
//             }
//             EOR=true;
//             if (record.size() > 0)
//                return record;
//             else
//                return null;
//             // return null;
//          }

//          record.add(field);

//          int ipeek=read();
//          char peek=(char)ipeek;

//          int ipeek2=read();
//          char peek2=(char)ipeek2;

//          unread(peek2);
//          // unread(peek);

//          if (peek == ',') {
//             if (peek2 == '\n'){
//                System.out.println ("peek to is eol, adding empty string and "+
//                                    "ending record.");
//                record.add("");
//                EOR=true;
//                read();
//             }
//          } else if (peek == '\n') {
//             EOR=true;
//          } else if (peek == -1) {
//             if (ipeek == -1) {
//                if (record.size() > 0) 
//                   return record;
//                else
//                   return null;
//             }
//          } else if (peek == '\"') {
//             unread(peek);
//          } else
//             unread(peek);
//       }

//       return record;
//    }

//    /** */
//    int readToQuoteOrComma() 
//       throws IOException {
//       int i=read();
//       char c=(char)i;

//       while (true) { 
//          if (i == -1)
//             return -1;
//          // System.out.print (c);
//          if (c == '\"') {
//             return i;
//          } 
//          if (c == ',') {
//             System.out.println ("ERROR: field starts with ,");
//             printState();
//             return i;
//          }
//          if (c == '\n') {
//             System.out.println ("ERROR: field starts with \\n");
//             printState();
//             return i;
//          }
//          i=read();
//       }
//    }

//    /** */
//    String readField() 
//       throws IOException {
//       // readToQuote();
//       // the first character must be a quote    
//       // int thisInt=readToQuoteOrComma();
//       int thisInt=read();
//       char thisChar=(char)thisInt;

//       boolean isQuotedField=false;

//       if (debug)
//          System.out.println ("Reading field, first char is '"+thisChar+
//                              "' int="+thisInt);
      
//       if (thisInt == -1) {
//          System.out.println ("ERROR: Field returning null due to thisInt == -1");
//          printState();
//          return null;
//       }

//       if (thisChar == ',') {
//          System.out.println ("field returning empty string for ',,'");
//          return "";
//       }
//       if (thisChar == '\n') {
//          System.out.println ("field returning empty string for ',\n'");
//          return "";
//       }

// //       if (thisChar != '\"') {
// //          isQuotedField=false;
// //          //throw new IOException("CSVParser: First char in field is not '\"' "+
// //          //                      "but '"+thisChar+"' at line "+linecount+" pos "+
// //          //                      lineposition+" byte "+bytecount);
// //       } else
//       if (thisChar == '\"')
//          isQuotedField=true;
//       else
//          isQuotedField=false;


//       StringBuffer result=new StringBuffer();
//       boolean done=false;

//       if (isQuotedField) {
//          thisInt=read();
//          thisChar=(char)thisInt;
//       }

//       while (!done) {
//          System.out.println ("is quoted?"+isQuotedField+" char='"+thisChar+"' thisInt="+thisInt);
//          if (thisInt == -1) {
//             done=true;
//             return null;
//          }

//          if (isQuotedField) {
//             if (thisChar == '\"') {
//                int ipeek=read();
//                char peek=(char)ipeek;
               
//                if (peek == '\"') {
//                   // this is "", or escaped quotes, so just append 1
//                   result.append(thisChar); // and carry on.
//                }
//                else {
//                   // that's the end
//                   unread(peek);
//                   // return result.toString();
//                   done=true;
//                }
//             } else if (thisInt == -1) {
//                done=true;
//             } else {
//                result.append(thisChar);
//             }
//          }
//          else { // !isQuotedField
//             if (thisChar == ',')
//                done=true;
//             else if (thisChar == '\n')
//                done=true;
//             else 
//                result.append(thisChar);
//          }
//          if (!done) {
//             thisInt=read();
//             thisChar=(char)thisInt;
//          }
//       }

//       return result.toString();
//    }


//    int read() 
//       throws IOException {
      
//       int c=pbr.read();  bytecount++; lineposition++;
//       if ((char)c == '\n') {
//          linecount++;
//          lineposition=0;
//       }
//       return c;
//    }

//    void unread(char c) 
//       throws IOException {
//       pbr.unread((int)c); bytecount --; lineposition--;
//    }

   void printState() {                         
      System.out.println ("PARSER: byte= "+bytecount+" line="+linecount+
                          " linepos="+lineposition);
   }

   /** */
   public static void main(String args[]) 
      throws Exception {
      String csv=
      "col1,col2,\"col3\"\n"+
      "\"paul \"\"bemo\"\" bemowski\",34,gemini\n";
      
      StringReader reader=new StringReader(csv);
      CSVParser parser=new CSVParser(reader);
      
      List line=parser.nextRecord();
      while (line != null) {
         System.out.println (line);
         line=parser.nextRecord();
      }
   }
}
