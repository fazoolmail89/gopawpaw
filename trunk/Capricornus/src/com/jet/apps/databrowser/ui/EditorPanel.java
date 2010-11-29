package com.jet.apps.databrowser.ui;

import java.awt.*;
import javax.swing.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.action.*;

/**
 * Encapsulated a SyntaxEditorPane with a toolbar including new, open
 * save, actions.
 */
public class EditorPanel extends JPanel
{
   /** */
   SyntaxEditorPane editor=null;

   /** */
   JToolBar toolbar=null;

   /** */
   DBSession session=null;

   public EditorPanel(DBSession ses) {
      super(new BorderLayout());

      session=ses;

      SQLSyntaxProperties sqlSyntaxProperties=new SQLSyntaxProperties();
      SyntaxDocument syntaxDocument=new SyntaxDocument(sqlSyntaxProperties);
      // session.setEditorDocument(syntaxDocument);

      editor=new SyntaxEditorPane(syntaxDocument);

      toolbar=buildToolbar();
      this.add(toolbar, BorderLayout.NORTH);
      this.add(new JScrollPane(editor), BorderLayout.CENTER);
   }

   public SyntaxEditorPane getEditorPane() {return editor;}


   JToolBar buildToolbar() {
      JToolBar t=new JToolBar();

      JButton button=null;

      button=new JButton(new ExecuteQueryAction(session));
      button.setRolloverEnabled(true);
      t.add (button);

      button=new JButton(new ExecuteUpdateAction(session));
      button.setRolloverEnabled(true);
      t.add (button);

      button=new JButton(new ExecuteBatchAction(session));
      button.setRolloverEnabled(true);
      t.add (button);
      return t;
   }
}
