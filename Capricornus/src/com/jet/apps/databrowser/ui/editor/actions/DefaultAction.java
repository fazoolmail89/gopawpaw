package com.jet.apps.databrowser.ui.editor.actions;

import javax.swing.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.ui.editor.DataEditor;
import com.jet.apps.databrowser.ui.editor.DataEditorConstants;
import com.jet.apps.databrowser.model.DBSession;

/**
 * 
 */
public abstract class DefaultAction extends AbstractAction 
   implements Logger, DataEditorConstants
{
   DataEditor editor=null;
   DBSession session=null;

   public DefaultAction(String name, DataEditor ed) {
      super(name);
      editor=ed;
      session=editor.getDBSession();
   }
}