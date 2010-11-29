package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.ui.misc.*;

import com.jet.utils.filesystem.*;
import com.jet.utils.ui.*;
import com.jet.utils.StringUtil;

/*
 * $Log: ExportXMLAction.java,v $
 * Revision 1.5  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.4  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.3  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.2  2003/06/17 21:44:24  bemocvs
 * 3.2.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/10/21 21:53:26  bemocvs
 * Fixed xml export
 *
 *
 */

/**

 * @author Paul Bemowski
 */
public class ExportXMLAction extends DefaultAction
{
   private RSTableModel tableModel=null;

   static File lastFileChosen=null;

   /** */
   public ExportXMLAction(JFrame parent, RSTableModel model) {
      super(parent);
      tableModel=model;
      putValue(SHORT_DESCRIPTION, "Export to XML"); // tool tip
      Icon icon=IconManager.getInstance().getIcon("rs_export_to_xml");
      putValue(SMALL_ICON, icon);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      // open a JFileChooser, and let the user choose where to save
      // the file to.
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".xml");
      chooser.setFileFilter(extFilter);
      if (lastFileChosen != null) {
         log.writeDebug(3, "Setting last dir to "+
                        lastFileChosen.getAbsolutePath());
         chooser.setCurrentDirectory(lastFileChosen);
      }
      int returnVal=chooser.showSaveDialog(parent);

      if (returnVal == chooser.APPROVE_OPTION) {
         String file=chooser.getSelectedFile().getAbsolutePath();

         log.writeDebug ("File chooser choose: "+file);
         try {
            File f=new File(file);
            lastFileChosen=f;
            

            // removed, referencing an old jdbcbrowser package.
            // Bemo, 9/10/2002
            //XMLResultExport.rowsToXML(tableModel.getHeaders(),
            //                          tableModel.getRows(), sb.toString(), f);
            rowsToXML(tableModel.getHeaders(), tableModel.getRows(), f);

            // The file has been saved, we're done.
            String message=
            "Data successfully saved to: \n"+
            f.getAbsolutePath();
            
            JOptionPane.showMessageDialog(parent, message, "Save successful.",
                                          JOptionPane.OK_OPTION);
         }
         catch (IOException ex) {
            log.writeError(1, "Error exporting to xml", ex);

            String message="An error occured saving this file.  Make sure \n"+
            "that the file chosen is writable.";
            
            // MessageWindow.showWarning(parent, message, ex);
            ExceptionDebugger.debug(parent, message, ex);
            return;
         }
      }
   }

   /** */
   static void rowsToXML(ArrayList headers,
                         ArrayList rows, File xmlFile) 
      throws IOException {
      
      BufferedWriter bw=null;
      try {
         bw=new BufferedWriter(new FileWriter(xmlFile));
         bw.write(("<result>\n").toCharArray());


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
                         escape(row.get(j).toString())+
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

   /** 
    * This is an escaping function, driven by the sitemaps 
    * escaping rules defined in the vodfone_sitemap_protocol??.pdf
    *
    * Ampersand & &amp; &#38;
    * Single Quote ' &apos; &#39;
    * Double Quote " &quot; &#34;
    * Greater Than > &gt; &#62;
    * Less Than < &lt; &#60;
    */
   public static final String escape(String value) {
      String ret=value; 

      ret=replace("&", "&amp;", ret);
      ret=replace("'", "&apos;", ret);
      ret=replace("\"", "&quot;", ret);
      ret=replace(">", "&gt;", ret);
      ret=replace("<", "&lt;", ret);

      return ret;
   }

   /** This function wraps the StringUtil replace function 
    * and uses indexOf to provide a performance enhancemnet
    * where the key is unlikely to be found.
    * 
    * I did not put this into StringUtil, because there is a perforamance
    * hit if the it is _likely_ the string contains the key we are 
    * looking for, and that seems to me to be the more common case
    * when that function is called. 
    * 
    * Besides, what's a few processor ticks amonst friends.
    */
   private static final String replace(String key, String val, 
                                       String target) {
      if (target.indexOf(key) != -1)
         return StringUtil.replace(key, val, target);
      else
         return target;
   }
}
