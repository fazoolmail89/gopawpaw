package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class CutAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_cut");

   public CutAction() {
      super("Cut", icon);
      putValue(SHORT_DESCRIPTION, "Ctrl-X");
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      if (ep != null) {
         ep.cut();
      }
   }
}
