package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class UndoAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_undo");

   public UndoAction() {
      super("Undo", icon);
      putValue(SHORT_DESCRIPTION, "Ctrl-Z");
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      if (ep != null) {
         ep.undo();
      }
   }
}
