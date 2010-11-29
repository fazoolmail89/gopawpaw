package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.ui.misc.IconManager;

/** */
public class ExecuteQueryEditorAction extends SyntaxEditorAction
{   
   public ExecuteQueryEditorAction() {
      super();
   }
   
   public void actionPerformed(ActionEvent ae) {
      SyntaxEditorPane ep=getEditorPane(ae);
      String sql=ep.getSelectedText();
      if  (sql == null ||
           sql.length() <= 3) 
         sql=ep.getText();

      System.out.println ("sql="+sql);

      DataBrowser databrowser=findDataBrowser(ae);

      System.out.println ("Calling execute query");
      databrowser.getSession().executeQuery(sql);
   }
}
