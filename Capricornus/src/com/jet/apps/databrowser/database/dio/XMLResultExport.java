package com.jet.apps.databrowser.database.dio;

import java.util.*;
import java.io.*;

/**
 * Exports a result set to an xml stream or file.
 *
 * @author Paul Bemowski
 */
public class XMLResultExport
{
   
   /** */
   public static void rowsToXML(ArrayList headers,
                                ArrayList rows, String rsName, File xmlFile) 
      throws IOException {
      
      BufferedWriter bw=null;
      try {
         bw=new BufferedWriter(new FileWriter(xmlFile));
         bw.write(("<result name=\""+rsName+"\">\n").toCharArray());


         int size=rows.size();
         int rsize=headers.size();

         bw.write("  <header>\n".toCharArray());
         for (int j=0; j<rsize; j++) {
            bw.write(("    <"+headers.get(j).toString()+"/>\n").toCharArray());
         }
         bw.write("  </header>\n".toCharArray());
         

         for (int i=0; i<size; i++) {
            ArrayList row=(ArrayList)rows.get(i);
            bw.write("  <row>\n".toCharArray());
            for (int j=0; j<rsize; j++) {
               bw.write(("    <"+headers.get(j).toString()+">"+
                         row.get(j).toString()+
                         "</"+headers.get(j).toString()+">\n").toCharArray());
            }
            bw.write("  </row>\n".toCharArray());
         }
         bw.write("</result>");
      }
      finally {
         if (bw != null){
            bw.flush();
            bw.close();
         }
      }
   }
}

