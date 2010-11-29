package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.ui.DataBrowser;
import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class NewEditorAction extends AbstractAction 
   implements com.jet.log.Logger
{   
   static Icon icon=IconManager.getInstance().getIcon("button_new");
   
   DataBrowser databrowser=null;

   public NewEditorAction(DataBrowser db) {
      // super(icon);
      databrowser=db;
      putValue(SMALL_ICON, icon);
      putValue(SHORT_DESCRIPTION, "New Editor");
   }
   
   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(2, "New Editor");

      databrowser.addEditor();
   }
}
