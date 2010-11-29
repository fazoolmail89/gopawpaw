package com.jet.net.nntp;

import java.util.Vector;
import java.util.Date;
import java.io.*;
import java.util.*;

import java.text.*;

import com.jet.net.utils.*;
// import com.jet.log.Logger;

import sun.misc.UUDecoder;

/*
 * $Log: Article.java,v $
 * Revision 1.2  2004/04/26 18:43:42  bemocvs
 * Updated date format, new distribution of jetnet
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/02/06 22:19:39  bemocvs
 * Attachment work
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/**
 * This is a data class holding all information about a particular
 * Newsgroup article.
 *
 * @author Paul Bemowski
 */
public class Article
//    implements Logger
{
   final DateFormat df1=new SimpleDateFormat("EEE, dd MMM yyyy HH:mm");
   final DateFormat df2=new SimpleDateFormat("dd MMM yyyy HH:mm");

   Vector headers=null;
   String body=null;

   String textBody=null;  // the textbody is the body less encoded file data.

   String from=null;
   Date date=null;
   String subject=null;
   int lines=-1;

   String content_type=null;

   String group=null;
   int number=-1;

   NewsUUDecoder decoder=new NewsUUDecoder();

   /** Constructs an Article object.
    * @param group The name of the newsgroup.
    * @param num The number of the article within the group.
    * @param headers A Vector of com.jet.net.utils.Pair objects.
    * @param body The body of the message. */
   public Article(String group, int num,
                  Vector headers, String body) {
      this.headers=headers;
      this.body=body;
      this.group=group;
      this.number=num;
      init();
   }

   /** */
   void init() {
      // find important headers
      for (int i=0; i<headers.size(); i++) {
         Pair p=(Pair)headers.elementAt(i);
         if (p.key().equalsIgnoreCase("from:")) {
            from=p.value();
         }
         else if (p.key().equalsIgnoreCase("subject:")) {
            subject=p.value();
         }
         else if (p.key().equalsIgnoreCase("date:")) {
            String dtemp=p.value().trim();
            try {
               date=df1.parse(dtemp);
            }
            catch (Exception ex) {
               // ex.printStackTrace();
               try {
                  date=df2.parse(dtemp);
               }
               catch (Exception exx) {
                  exx.printStackTrace();
               }
            }
         }
         else if (p.key().equalsIgnoreCase("content-type:")) {
            content_type=p.value().trim();
         }
      } // end loop

      lines=0;
      char bchar[]=body.toCharArray();
      for (int i=0; i<bchar.length; i++) {
         if (bchar[i] == '\n')
            lines++;
      }
   }
   
   /** Returns group:article. */
   public String toString() {return group+":"+number;}

   /** Writes this article to a stream.
    * @param os The output stream on which to write this article. */
   public void toStream(OutputStream os) 
      throws IOException {

      for (int i=0; i<headers.size(); i++) {
         os.write((headers.elementAt(i).toString()+"\n").getBytes());
      }
      os.write("\n".getBytes());
      os.write(body.getBytes());
      os.write(".\n".getBytes());
   }

   /** Returns the date this article was posted. */
   public Date getDate() {return date;}

   /** Returns the group name. */
   public String getGroup() {return group;}

   /** Returns the article number. */
   public int getArticleNumber() {return number;}

   /** Returns the line count of this article. */
   public int getLines() {return lines;}

   /** Returns the body of the article. */
   public String getBody() {return body;}

   /** Returns the subject line of this article. */
   public String getSubject() {return subject;}
   
   /** Returns the content type of the message, null if it was
    * not specified in the headers. */
   public String getContentType() {return content_type;}

   /** Returns a Vector of Pair objects. */
   public Vector getHeaders() {return headers;}

   /** Finds the specific header by name.
    * @return Returns the value of the specific header, null if the
    * requested header is unavailable. */
   public String getHeader(String name) {
      int size=headers.size();
      for (int i=0; i<size; i++) {
         Pair p=(Pair)headers.elementAt(i);
         if (p.key().equalsIgnoreCase(name+":") ||
             p.key().equalsIgnoreCase(name)) {
            return p.value();
         }
      }
      return null;
   }

   

   /** 
    * This function should return the parts of the message body
    * that are not encoded data.  */
   public String getTextBody() {
      if (textBody == null)
         containsEncodedData();
      return textBody;
   }

   Vector filedata=null;

   /** */
   public boolean containsEncodedData() {
      StringBuffer tb=new StringBuffer(body.length());
         
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(new StringBufferInputStream(body)));


         String line=br.readLine(); int currentLine=1;
         while (line != null) {
            tb.append(line+"\n");
            if (line.startsWith("begin")){
               StringTokenizer st=new StringTokenizer(line, " ", false);
               if (st.countTokens() >= 3) {
                  st.nextToken(); // begin
                  String encodingCode=st.nextToken();
                  String filename=st.nextToken();
                  
                  // check to see that the second word is an integer
                  boolean success=false;
                  try {
                     Integer.parseInt(encodingCode);
                     success=true;
                  } catch (Exception ex) {}
                  
                  if (success) {
                     // ok, we found one.
                     Log.write("Begin line "+currentLine+" '"+line+"'");
                     if (filedata == null)
                        filedata=new Vector();
                     EmbededFileData efd=new EmbededFileData(currentLine, 
                                                             filename);
                     filedata.addElement(efd);
                     line=br.readLine(); currentLine++;
                     while (!line.startsWith("end")) {
                        line=br.readLine(); currentLine++;
                     }
                     efd.setEndLine(currentLine);
                     Log.write("Endline "+currentLine+" '"+line+"'");

                  }
               }
            }

            line=br.readLine(); currentLine++;
         }
      } catch (IOException ex) {
         // this shouldn't happen
         ex.printStackTrace();
      }

      textBody=tb.toString();
      Log.write("Text body lenth="+textBody.length());
     
      if (filedata == null)
         return false;
      else
         return true;
   }

   /** */
   public void decodeTo(File outputdir) 
      throws IOException {
      if (filedata == null &&
          !containsEncodedData()) 
         return;

      // skip to begining
      for (int i=0; i<filedata.size(); i++) {
         EmbededFileData efd=(EmbededFileData)filedata.elementAt(i);
         decodeSingleFile(outputdir, efd);
      }
   }

   /** */
   private void decodeSingleFile(File outdir, EmbededFileData efd) 
      throws IOException {
      Log.write("Decoding "+efd+" to "+outdir);

      StringBufferInputStream sbis=new StringBufferInputStream(body);
      // BufferedReader br=new BufferedReader(new InputStreamReader(sbis));
      int currentLine=0;

      int start=efd.getStartLine();
      
      int curline=1;
      while (curline < start -1){
         if ((char)sbis.read() == '\n')
            curline++;
      }
         

      File f=new File(outdir, efd.getFilename());
      FileOutputStream fos=new FileOutputStream(f);
      decoder.decodeBuffer(sbis, fos);
      fos.flush();
      fos.close();
   }

   /**
    *
    */
   class EmbededFileData 
   {
      int startLine=0;
      int endLine=0;
      String filename=null;

      public EmbededFileData(int i, String s) {
         startLine=i;
         filename=s;
      }

      public void setEndLine(int i) {endLine=i;}
      
      public int getStartLine() {return startLine;}
      public int getEndLine() {return endLine;}
      public String getFilename() {return filename;}
      
      public String toString() {return filename+" ["+startLine+","+
                                endLine+"]";}
   }

   /**
    * there seems to be some difference in how SUN thinks a UUEncoded 
    * buffer should end, and how the newsgroups at large think it should
    * end.  But the bottom line is, IT'S THE END!.  So we'll subclass and 
    * not let their decoder throw the exception it wants to.
    */
   public class NewsUUDecoder extends UUDecoder 
   {
      public NewsUUDecoder() {}

      protected void decodeBufferSuffix(InputStream is, OutputStream os)
       throws IOException {
         // do nothing for now, we're done
      }
   }
}
