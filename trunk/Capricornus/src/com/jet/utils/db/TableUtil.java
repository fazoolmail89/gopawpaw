package com.jet.utils.db;

// import com.sun.java.swing.*;

import java.util.*;
import java.io.*;
import com.jet.log.*;

import com.jet.utils.StringUtil;

/*
 * $Log: TableUtil.java,v $
 * Revision 1.3  2004/09/28 21:00:02  bemocvs
 * Working on 3.2.5
 *
 * Revision 1.2  2002/12/05 00:38:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:07:59  bemocvs
 * initial checkin
 *
 * Revision 1.5  2001/11/01 00:11:59  bemocvs
 * updates for array list.
 *
 */


/**
 * Used to convert 2-d vectors into csv files.
 *
 *
 * @author Paul Bemowski
 */
public class TableUtil implements Logger
{
   private static final Random random=new Random(System.currentTimeMillis());

   /**
    *
    */
   public static File sendToCSVFile(ArrayList rows, File file)
      throws IOException 
   {
      FileOutputStream fos=null; 
      
      log.writeDebug("Writing data to "+file.getAbsolutePath());

      synchronized(rows)
      {
         try
         {
            fos=new FileOutputStream(file);
            PrintWriter pw=new PrintWriter(new OutputStreamWriter(fos));
      
            int rowCount=rows.size();
            for (int i=0; i<rowCount; i++)
            {
               ArrayList row=(ArrayList)rows.get(i);
               int colCount=row.size();

               StringBuffer line=new StringBuffer();
               
               for (int j=0; j< colCount; j++)
               {
                  Object item=row.get(j);
                  line.append(itemToCSVString(item));
                  if (j != (colCount-1))
                     line.append(", ");
               }
               pw.println (line);
               pw.flush();
            }
         }
         finally
         {
            fos.flush();
            fos.close();
         }
      }
      return file;
   }  

   /**
    *
    */
   public static File sendToCSVFile(Vector rows, File file)
      throws IOException 
   {
      FileOutputStream fos=null; 
      
      log.writeDebug("Writing data to "+file.getAbsolutePath());

      synchronized(rows)
      {
         try
         {
            fos=new FileOutputStream(file);
            PrintWriter pw=new PrintWriter(new OutputStreamWriter(fos));
      
            int rowCount=rows.size();
            for (int i=0; i<rowCount; i++)
            {
               Vector row=(Vector)rows.elementAt(i);
               int colCount=row.size();

               StringBuffer line=new StringBuffer();
               
               for (int j=0; j< colCount; j++)
               {
                  Object item=row.elementAt(j);
                  line.append(itemToCSVString(item));
                  if (j != (colCount-1))
                     line.append(", ");
               }
               pw.println (line);
               pw.flush();
            }
         }
         finally
         {
            fos.flush();
            fos.close();
         }
      }
      return file;
   }
   
   /**
    * http://www.creativyst.com/Doc/Articles/CSV/CSV01.htm#FileFormat
    */
   public static final String itemToCSVString(Object obj) {
      String s=obj.toString();
      if (s.indexOf("\"") != -1)
         s=StringUtil.replace("\"", "\"\"", s);

      s="\""+s+"\"";
      return s;
   }

   /**
    *
    */
   public static File sendToHTMLFile(ArrayList headers, 
                                     ArrayList rows, File file)
      throws IOException 
   {
      FileOutputStream fos=null; 
      
      log.writeDebug("Writing data to "+file.getAbsolutePath());

      synchronized(rows) {
         try {
            fos=new FileOutputStream(file);
            tableToOutputStream(headers, rows, fos);
         }
         finally {
            fos.flush();
            fos.close();
         }
      }
      return file;
   }

   /**
    *
    */
   public static String tableToHtml(ArrayList headers, ArrayList rows)
      throws IOException
   {
      String html=null;

      ByteArrayOutputStream baos=new ByteArrayOutputStream();
      tableToOutputStream(headers, rows, baos);
      html=baos.toString();
      
      return html;
   }

   /**
    *
    */
   private static void tableToOutputStream(ArrayList headers, 
                                           ArrayList rows, OutputStream os)
      throws IOException 
   {
      PrintWriter pw=new PrintWriter(new OutputStreamWriter(os),
                                     true); // autoflush
      
      // Header
      pw.println ("<html>");
      pw.println ("<table border=\"1\"");

      printHeaderRow(pw, headers);
      int rowCount=rows.size();
      for (int i=0; i<rowCount; i++) {
         ArrayList row=(ArrayList)rows.get(i);
         printDataRow(pw, row);
      }

      // Footer
      pw.println("</table>");
      pw.println("</html>");
      pw.flush();
   }

   /** */
   private static void printHeaderRow(PrintWriter pw, ArrayList row)
      throws IOException 
   {
      pw.println ("<tr>");
      pw.print ("<td align=center>");
      
      int colCount=row.size();

      StringBuffer line=new StringBuffer();
      
      for (int j=0; j< colCount; j++)
      {
         Object item=row.get(j);
         line.append("<b>"+item.toString()+"</b>");
         if (j != (colCount-1))
            line.append("</td><td>");
         else
            line.append("</td>");
      }
      pw.println (line);
      pw.println ("</tr>");
      
      pw.flush();
   }

   /** */
   private static void printDataRow(PrintWriter pw, ArrayList row)
      throws IOException 
   {
      pw.println ("<tr>");
      pw.print ("<td>");
      
      int colCount=row.size();

      StringBuffer line=new StringBuffer();
      
      for (int j=0; j< colCount; j++) {
         Object item=row.get(j);
         line.append(item.toString());
         if (j != (colCount-1))
            line.append("</td><td>");
         else
            line.append("</td>");
      }
      pw.println (line);
      pw.println ("</tr>");
      
      pw.flush();
   }
}
