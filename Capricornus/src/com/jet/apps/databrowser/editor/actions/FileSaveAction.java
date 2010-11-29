package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import java.io.*;

import javax.swing.*;

import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;
import com.jet.utils.filesystem.FileUtil;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class FileSaveAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_save");

   public FileSaveAction() {
      super(icon);
      putValue(SHORT_DESCRIPTION, "Save");
   }
   
   public FileSaveAction(String n) {
      super(n, icon);
   }

   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      log.writeDebug(2, "File save");

      File file=ep.getFile();
      if (file == null) {
         FileSaveAsAction saveAs=new FileSaveAsAction();
         saveAs.actionPerformed(ae);
         return;
      }
      
      boolean success=false;
      try {
         StringBuffer sb=new StringBuffer();
         sb.append(ep.getText());
         
         success=FileUtil.saveToFile(file, sb);
         // FIXME: Set status bar to indicate success
      } catch (Exception ex) {
         log.printStackTrace(ex);
//          MessageWindow.showWarning(ep, "Unable to read from file "+
//                                    file, ex);
         ExceptionDebugger.debug(ep, "Unable to read from file "+
                                 file, ex);
         return;
      }
   }
   
   public void set24() {
      putValue(SMALL_ICON, IconManager.getInstance().getIcon("button_save24"));
   }
}
