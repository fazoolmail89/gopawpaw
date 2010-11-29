package com.jet.apps.databrowser.ui.editor.actions;

import java.awt.event.*;
  
import javax.swing.*;
import javax.swing.event.*;

import com.jet.apps.databrowser.ui.editor.DataEditor;
import com.jet.apps.databrowser.model.DBSession;

import com.jet.apps.databrowser.database.UpdateThread;

import com.jet.utils.ui.ExceptionDebugger;

/**
 * 
 */
public class SaveCloseAction extends DefaultAction
{
   public SaveCloseAction(DataEditor ed) {
      super("Save & Close", ed);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("SaveCloseAction");

      try {
         String sql=editor.getSQL();
         
         if (sql == null || sql.length() == 0) {
            // nothing to execute
            return;
         }

         log.writeDebug("action.sql: "+sql);
         
         UpdateThread ut=session.executeUpdate(sql.toString(), false);
         
         // wait for update thread to finish.
         ut.join();

         if (!ut.isSuccess()) {
            ExceptionDebugger.debug(editor, "Error processing SQL.", 
                                    ut.getException());
         } else {
            // don't dispose of editor on exception.
            editor.dispose();
         }
         
         editor.setSuccess(ut.isSuccess());
      } catch (Exception ex) {
         ExceptionDebugger.debug(editor, "Error executing save.", ex);
      }
   }
}