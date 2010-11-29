package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.*;

import com.jet.utils.filesystem.FileUtil;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class FileSaveAsAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_saveas");

   public FileSaveAsAction() {
      super(icon);
      putValue(SHORT_DESCRIPTION, "Save As...");
   }

   public FileSaveAsAction(String n) {
      super(n, icon);
   }
   
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(2, "File save as");
      SyntaxEditorPane ep=getEditorPane(ae);

      // open a file chooser
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      // chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
//        ExtensionFilter extFilter=new ExtensionFilter();
//        extFilter.addExtension(".ddl");
//        extFilter.addExtension(".sql");
//        chooser.setFileFilter(extFilter);

      int returnVal=chooser.showSaveDialog(findDataBrowser(ae));
      if (returnVal == chooser.APPROVE_OPTION) {
         String filename=chooser.getSelectedFile().getAbsolutePath();

         if (filename == null ||
             filename.trim().length() == 0) {
            MessageWindow.showWarning(ep, "No file name was specified. "+
                                      "The SQL was not saved.");
         }
         
         filename=FileUtil.unixSlashify(filename);
         
         File file=new File(filename);

         if (file.exists()) {
            String message=filename+" already exists, overwrite?";
            int confirm=
            JOptionPane.showConfirmDialog(findDataBrowser(ae), 
                                          message, "Overwrite?", 
                                          JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION)
               return;
         }

         boolean success=false;
         try {
            StringBuffer sb=new StringBuffer();
            sb.append(ep.getText());

            success=FileUtil.saveToFile(filename, sb);

            if (success) {
               ep.setFile(file);
            }

            // session.setCurrentFile(file);
         } catch (Exception ex) {
            log.printStackTrace(ex);
//             MessageWindow.showWarning(ep, "Unable to save to file "+
//                                       filename, ex);
            ExceptionDebugger.debug(ep, "Unable to save to file "+
                                    filename, ex);
            return;
         }

         // FIXME: Set status bar
         
         // FIXME: Add file to recent files.

//           if (success) { //inform the user
//              EProperties rfp=session.getProperties(session.RECENT_FILES);
//              Vector recentFiles=(Vector)rfp.get(session.RECENT_FILES_VECTOR);
//              if (recentFiles == null) {
//                 recentFiles=new Vector();
//              }
//              int maxFiles=4;
//              if (recentFiles.size() >= maxFiles)
//                 recentFiles.removeElementAt(recentFiles.size() - 1);
//              recentFiles.insertElementAt(file, 0);
//              rfp.put(session.RECENT_FILES_VECTOR, recentFiles);
//              try {
//                 rfp.save();
//              } catch (Exception ex) {log.writeError(1, ex);}

//              MessageWindow.showMessage(parent, "Editor window SQL saved to "+
//                                        file);
//           }
//           else {
//              MessageWindow.showWarning(parent, "An unknown error has occured "+
//                                        "saving "+file);
//           }
      }
   }

   public void set24() {
      putValue(SMALL_ICON, IconManager.getInstance().getIcon("button_save24"));
   }
}
