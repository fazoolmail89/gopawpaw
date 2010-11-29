package com.jet.apps.databrowser.ui.editor.actions;

import java.awt.event.*;
  
import javax.swing.*;
import javax.swing.event.*;

import com.jet.apps.databrowser.ui.editor.DataEditor;
import com.jet.apps.databrowser.model.DBSession;

/**
 * 
 */
public class CloseAction extends DefaultAction
{
   public CloseAction(DataEditor ed) {
      super("Close", ed);
      putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));

      // this does not work.
      //putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_ESCAPE));
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("CloseAction");

      editor.dispose();
   }
}