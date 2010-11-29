package com.jet.apps.databrowser.editor;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.undo.*;


/**
 * This class handles Undo/Redo functions.
 */
public class SyntaxUndoManager 
   implements UndoableEditListener, com.jet.log.Logger

{
   int undoLimit=1000;

   UndoManager undoManager=null;

   SyntaxEditorPane editor=null;

   int uniqueId=0;
   static int uniqueCounter=0;

   /** */
   public SyntaxUndoManager(SyntaxEditorPane editor) {
      uniqueId=uniqueCounter++;
      // System.out.println ("Constructing undo manager "+uniqueId);
      // (new Exception()).printStackTrace();

      this.editor=editor;
      undoManager=new UndoManager();
      undoManager.setLimit(undoLimit);

      editor.getDocument().addUndoableEditListener(this);

      Keymap keymap=editor.getKeymap();

      // WARNING: keybindings are global.  you must extend TextAction
      // and use the getTextComponent() method to get the appropriate 
      // target!!!  Otherwise subsequent calls to addActionForKeyStroke
      // will continually overwrite the previous one, with the most 
      // recent call 'winning' 

      // ctrl-z
      KeyStroke undoKey=KeyStroke.getKeyStroke(KeyEvent.VK_Z, 
                                               InputEvent.CTRL_MASK);
      keymap.addActionForKeyStroke(undoKey, new UndoAction());

      // ctrl-y = redo
      KeyStroke redoKey=KeyStroke.getKeyStroke(KeyEvent.VK_Y, 
                                               InputEvent.CTRL_MASK);
      keymap.addActionForKeyStroke(redoKey, new RedoAction());
   }
   
   private static final String STYLE_CHANGE=
   UIManager.getString("AbstractDocument.styleChangeText");

   /** */
   public void undoableEditHappened(UndoableEditEvent evt) {
      UndoableEdit edit=evt.getEdit();

      // System.out.println ("UndoableEdit: "+edit);
//       System.out.println ("  Edit is significant: "+edit.isSignificant());
//       System.out.println ("  Edit presentation name: "+edit.getPresentationName());
      if (edit instanceof DefaultStyledDocument.AttributeUndoableEdit) {
         // ignore
         //System.out.println ("   Ignoring attribute undoable edit.");
      } else if (edit instanceof AbstractDocument.ElementEdit) {
         // System.out.println ("   Ignoring element edit");
      } else if (edit instanceof CompoundEdit) {
         // this is a bit of a hack.  A CompoundEdit has a vector of edits
         // inside of it.  We want to ignore attribute changes. Therefore
         // we'd like to loop thru the edits inside of the CompoundEdit
         // and ignore the AttributeEdits.  But Sun, in their
         // infinite wisdom, make the edits field inside CompoundEdit
         // protected with no public accessor.  ASSHOLES!
         // So we need to HACK HARD - and look at the presentation name
         // and compare it to the style change event name.  We are 
         // largely insulated from JDK changes because the STYLE_CHANGE
         // string is from the UIManager, the same place that the
         // event gets the string from internally.  But the point is, we 
         // shouldn't have to hack like this.
         // PAB, 7 Oct 2004, Atlanta.

         String presentationName=edit.getPresentationName();
         if (presentationName != null &&
             presentationName.equals(STYLE_CHANGE)) {
            // ignore
            //System.out.println ("   Ignoring style change event.");
         } else {
            //System.out.println ("   Adding undoable compound edit "+edit);
            undoManager.addEdit(edit);
         }
      } else {
         //System.out.println ("   Adding undoable edit: "+edit);
         undoManager.addEdit(edit);
      }
   }

   /** */
   public void undo() {
      try {
         //log.writeDebug(3, "SyntaxUndoManager.undo(): can?: "+
         //               undoManager.canUndo());
         // System.out.println ("UndoManager["+uniqueId+"]: "+undoManager);
         undoManager.undo();
      } catch (CannotUndoException ex) {
         log.writeError(1, "Cannot undo: ", ex);
         Toolkit.getDefaultToolkit().beep();
      }
   }

   /** */
   public void redo() {
      try {
         undoManager.redo();
      } catch (CannotRedoException ex) {
         log.writeError(1, "Cannot redo!", ex);
         Toolkit.getDefaultToolkit().beep();
      }      
   }

   /** */
   class UndoAction extends TextAction
   {
      public UndoAction() {
         super("Undo");
      }
      public void actionPerformed(ActionEvent ae) {
         SyntaxEditorPane p=(SyntaxEditorPane)getTextComponent(ae);
         p.undo();

         // System.out.println ("undo!");
         // SyntaxUndoManager.this.undo();
      }
   }

   class RedoAction extends AbstractAction
   {
      public void actionPerformed(ActionEvent ae) {
         System.out.println ("redo!");
         redo();
      }
   }
}
