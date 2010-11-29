package com.jet.apps.databrowser.ui.editor.actions;

import java.util.*;

import java.awt.event.*;
  
import javax.swing.*;
import javax.swing.event.*;

import com.jet.utils.GUID;

import com.jet.apps.databrowser.ui.editor.DataEditor;
import com.jet.apps.databrowser.ui.editor.InsertDataEditor;
import com.jet.apps.databrowser.ui.editor.UpdateDataEditor;
import com.jet.apps.databrowser.ui.editor.ColumnEditor;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.database.DatabaseUtil;

/**
 * 
 */
public class PKAction extends DefaultAction
{
   /** */
   int pkeyMode=UNKNOWN;

   /** */
   public PKAction(String name, InsertDataEditor ed, int mode) {
      super(name, ed);
      pkeyMode=mode;
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("PKey ("+getValue(NAME)+") Action");

      InsertDataEditor ide=(InsertDataEditor)editor;
      ide.setPKMode(pkeyMode);


      List columnEditors=editor.getColumnEditors();
      switch (pkeyMode) {
         case PK_MANUAL:
            // enable primary key fields
            for (int i=0; i<columnEditors.size(); i++) {
               ColumnEditor ce=(ColumnEditor)columnEditors.get(i);
               if (ce.isPrimaryKey()){
                  ce.enable();
                  ce.getField().setText("");
               }
            }
            break;
         case PK_NONE: 
            // disable primary key fields
            for (int i=0; i<columnEditors.size(); i++) {
               ColumnEditor ce=(ColumnEditor)columnEditors.get(i);
               if (ce.isPrimaryKey()) {
                  ce.disable();
                  ce.getField().setText("");
               }
            }
            break;
         case PK_MAXPLUS1:
            // max+1
            DatabaseUtil dbUtil=session.getDatabaseUtil();

            for (int i=0; i<columnEditors.size(); i++) {
               ColumnEditor ce=(ColumnEditor)columnEditors.get(i);
               if (ce.isPrimaryKey()){
                  ce.disable();
                  try {
                     long id=dbUtil.getMaxPlusOne(editor.getTable().getName(), 
                                                  ce.getColumn().getName());

                     ce.getField().setText(""+id);
                  }
                  catch (Exception ex) {
                     log.writeError(1, "Error getting max+1 on "+
                                    ce.getColumn().getName(), ex);
                  }
               }
            }
            break;
         case PK_GUID:
            for (int i=0; i<columnEditors.size(); i++) {
               ColumnEditor ce=(ColumnEditor)columnEditors.get(i);
               if (ce.isPrimaryKey()) {
                  ce.disable();
                  ce.getField().setText((new GUID()).toString());
               }
            }
            break;
         default:
            log.writeDebug(1, "Unknown pkey action type! :"+pkeyMode);

      }
   }
}