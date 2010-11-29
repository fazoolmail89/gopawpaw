package com.jet.apps.databrowser.ui.editor.actions;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import com.jet.utils.ui.ExceptionDebugger;

import com.jet.apps.databrowser.ui.editor.DataEditor;
import com.jet.apps.databrowser.ui.editor.InsertDataEditor;

import com.jet.apps.databrowser.database.UpdateThread;

import com.jet.apps.databrowser.model.DBSession;

/**
 * 
 */
public class SaveContinueAction extends DefaultAction
{
   public SaveContinueAction(InsertDataEditor ed) {
      super("Save & Continue", ed);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("SaveContinueAction");

      InsertDataEditor ide=(InsertDataEditor)editor;

      try {
         String sql=editor.getSQL();
         UpdateThread ut=session.executeUpdate(sql.toString(), false);
         
         // wait for update thread to finish.
         ut.join();

         if (!ut.isSuccess()) {
            ExceptionDebugger.debug(editor, "Error processing SQL.", 
                                    ut.getException());
         }
      
      } catch (Exception ex) {
         ExceptionDebugger.debug(editor, "Error executing save.", ex);
      }

      ide.clearAndContinue();
   }
}