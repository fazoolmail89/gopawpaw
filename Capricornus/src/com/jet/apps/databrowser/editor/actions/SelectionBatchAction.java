package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class SelectionBatchAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_batch");

   public SelectionBatchAction() {
      super("Execute Selection as Batch", icon);
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      if (ep != null) {
         log.writeDebug("Update: "+ep.getSelectedText());

         DBSession session=ep.getDBSession();
         if (session != null) {
            session.executeBatch(ep.getSelectedText());
         } else {
            log.writeError("DBSession is null");
         }
      }
   }
}
