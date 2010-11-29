package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.datatransfer.*;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class UnixCopyAction extends AbstractAction implements com.jet.log.Logger
{   
   static Icon icon=IconManager.getInstance().getIcon("button_copy");

   SyntaxEditorPane editor=null;
  
   public UnixCopyAction(SyntaxEditorPane ed) {
      super("Copy to System Selection", icon);
      editor=ed;
   }
   
   public void actionPerformed(ActionEvent ae) {
      try {
         Clipboard clipboard=editor.getToolkit().getSystemSelection();
         StringSelection ss=new StringSelection(editor.getSelectedText());
         clipboard.setContents(ss, ss);
      } catch (Throwable ex) {
         log.writeError(1, "Error pasting from selection: ", ex);
      }
   }
}
