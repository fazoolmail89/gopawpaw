package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class SelectionQueryAction extends SyntaxEditorAction
{   
   static Icon icon=IconManager.getInstance().getIcon("button_query");

   public SelectionQueryAction() {
      super("Execute Selection as Query", icon);
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      if (ep != null) {
         log.writeDebug("Query: "+ep.getSelectedText());

         DBSession session=ep.getDBSession();
         if (session != null) {
            session.executeQuery(ep.getSelectedText());
         } else {
            log.writeError("DBSession is null");
         }
      }
   }
}
