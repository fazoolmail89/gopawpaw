package com.jet.apps.databrowser.editor.actions;

import java.io.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.filechooser.*;

import com.jet.utils.*;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.utils.filesystem.*;

import com.jet.apps.databrowser.ui.DataBrowser;
import com.jet.apps.databrowser.ui.menu.RecentFilesMenu;
import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class FileOpenAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_open");

   static File lastDirectory=null;

   public FileOpenAction() {
      super(icon);
      putValue(SHORT_DESCRIPTION, "Open...");
   }

   public FileOpenAction(String n, DataBrowser d) {
      super(n, icon);
      setDataBrowser(d);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);

      log.writeDebug(2, "File open");
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      // File lastDirectory=null; // session.getLastSqlDirectory();

      if (lastDirectory != null)
         chooser.setCurrentDirectory(lastDirectory);
      else
         chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      
      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".ddl");
      extFilter.addExtension(".sql");
      chooser.setFileFilter(extFilter);

      JFrame parent=WinUtil.findParentJFrame(ep);
      
      int returnVal=chooser.showOpenDialog(parent);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         File file=chooser.getSelectedFile();
         lastDirectory=file.getParentFile();

         // Always open a new file into a new editor.

         //if (ep.isScratch()) {
         ep=findDataBrowser(ae).openFileWithNewEditor(file);
         //}

         // ep.openFile(file);

         RecentFilesMenu.addRecentFile(file.getAbsolutePath());

//           // session.setLastSqlDirectory(lastDirectory);
//           String filename=file.getAbsolutePath();
         
//           // Read this file, and put sql into sql window
//           try {
//              StringBuffer sb=FileUtil.readFromFile(filename);
//              // session.setEditorText(sb.toString(), filename);
//              ep.setText(sb.toString());
            
//  //             EProperties rfp=session.getProperties(session.RECENT_FILES);
//  //             Vector recentFiles=(Vector)rfp.get(session.RECENT_FILES_VECTOR);
//  //             if (recentFiles == null) {
//  //                recentFiles=new Vector();
//  //             }
//  //             int maxFiles=4;
//  //             if (recentFiles.size() >= maxFiles)
//  //                recentFiles.removeElementAt(recentFiles.size() - 1);
//  //             filename=FileUtil.unixSlashify(filename);
//  //             recentFiles.insertElementAt(filename, 0);
//  //             rfp.put(session.RECENT_FILES_VECTOR, recentFiles);
//  //             rfp.save();

//           } catch (Exception ex) {
//              log.printStackTrace(ex);
//              MessageWindow.showWarning(parent, "Unable to read from file "+
//                                        filename, ex);
//           }
      }
   }
}

