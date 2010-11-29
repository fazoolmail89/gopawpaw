package com.jet.apps.sqlminus;

import java.util.*;
import java.io.*;

import com.jet.log.*;


/**
 * 
 */
public class OutputFormatter implements Logger
{

   int displayRows=18;
   int displayCols=80;
   
   int rows=0;
   int cols=0;

   /** */
   int colWidths[]=null;

   /** */
   ArrayList headers=null;

   /** */
   ArrayList data=null;

   /** */
   int rowPointer=1;

   /** */
   public OutputFormatter(ArrayList data) {
      headers=(ArrayList)data.get(0);
      rows=data.size();
      cols=headers.size();      
      setDefaultColumnWidth(10);
      this.data=data;
   }

   /** */
   public void setDefaultColumnWidth(int def) {
      colWidths=new int[headers.size()];
      for (int i=0; i<headers.size(); i++) {
         colWidths[i]=def;
      }
   }

   /** */
   public void setColumnWidth(int col, int width) {
      colWidths[col]=width;
   }

   /** */
   public boolean displayNextPage() 
      throws Exception {
      return displayNextPage(false);
   }


   /** */
   public boolean displayNextPage(boolean pause) 
      throws Exception {
      int begin=rowPointer;
      int end=rowPointer+displayRows;
      rowPointer=end+1;
      boolean more=true;

      if (end > data.size() - 1) {
         end=data.size()-1;
         more=false;
      } else if (end == data.size()) {
         more=false;
      }

      StringBuffer line=new StringBuffer();
      
      for (int col=0; col<cols; col++) {
         Object cell=headers.get(col);
         String output=format(cell, col);
         line.append(output);
         if (col<cols-1)
            line.append(" ");            
      }
      System.out.println (line);
      line=new StringBuffer();
 
      for (int i=begin; i<=end; i++) {
         ArrayList rowData=(ArrayList)data.get(i);
         
         for (int col=0; col<cols; col++) {
            Object cell=rowData.get(col);

            String output=format(cell, col);

            line.append(output);
            if (col<cols-1)
               line.append(" ");            
         }
         
         System.out.println (line);
         line=new StringBuffer();
      }

      if (pause && more) {
         System.out.println ("More [y,q] (quit=q)?");
         BufferedReader promptReader=new BufferedReader(new InputStreamReader(System.in));
         String in=promptReader.readLine();
         if (in.equals("q")) 
            return false;
      }
      return more;
   }
   
   /** */
   String format(Object obj, int col) {
      
      String s=(obj==null?"null":obj.toString());
      return padOrTrim(s, col);
   }

   /** */
   String padOrTrim(String x, int col) {
      int len=x.length();
      if (len == colWidths[col])
         return x;
      else if (len > colWidths[col]) {
         return x.substring(0, colWidths[col]);
      } else { // len < colWidths[i]
         int padChars=colWidths[col]-len;
         StringBuffer sb=new StringBuffer(x);
         for (int i=0; i<padChars; i++) 
            sb.append(" ");
         return sb.toString();
      }
   }
}
