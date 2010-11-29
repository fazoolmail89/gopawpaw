package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class FileCloseAction extends SyntaxEditorAction
{   
   // currently no icon for close
   // static Icon icon=IconManager.getInstance().getIcon("button_saveas");

   public FileCloseAction(String n) {
      super(n);
      putValue(SHORT_DESCRIPTION, "Close File");
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);

      log.writeDebug(2, "File close");
   }
}
