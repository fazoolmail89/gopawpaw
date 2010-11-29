package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.datatransfer.*;
import java.awt.*;

import javax.swing.*;


import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class UnixPasteAction extends AbstractAction implements com.jet.log.Logger
{   
   static Icon icon=IconManager.getInstance().getIcon("button_paste");

   SyntaxEditorPane editor=null;
  
   public UnixPasteAction(SyntaxEditorPane ed) {
      super("Paste from System Selection", icon);
      editor=ed;
   }
   
   public void actionPerformed(ActionEvent ae) {
      try {
         Clipboard clipboard=editor.getToolkit().getSystemSelection();
         String selection=(String)(clipboard.getContents(this).getTransferData(DataFlavor.stringFlavor));
         // mJEditor.setSelectedText(selection);
         editor.setSelectedText(selection);
      } catch (Throwable ex) {
         log.writeError(1, "Error pasting from selection: ", ex);
      }
   }
}
