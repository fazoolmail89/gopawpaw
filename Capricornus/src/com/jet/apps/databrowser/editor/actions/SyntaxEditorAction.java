package com.jet.apps.databrowser.editor.actions;

import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

import com.jet.apps.databrowser.editor.*;
import com.jet.apps.databrowser.ui.misc.IconManager;
import com.jet.apps.databrowser.ui.DataBrowser;

/** */
public abstract class SyntaxEditorAction 
   extends TextAction 
   implements com.jet.log.Logger
{   
   /** */
   private DataBrowser databrowser=null;

   /** */
   public SyntaxEditorAction() {
      super(null);
   }

   public SyntaxEditorAction(String name) {
      super(name);
   }

   public SyntaxEditorAction(Icon icon) {
      super(null);
      putValue(SMALL_ICON, icon);
   }

   public SyntaxEditorAction(String name, Icon icon) {
      super(name);
      putValue(SMALL_ICON, icon);
   }

   public SyntaxEditorPane getEditorPane(ActionEvent ae) {
      JTextComponent tc=super.getTextComponent(ae);
      if (tc != null &&
          tc instanceof SyntaxEditorPane) {
         return (SyntaxEditorPane)tc;
      }

      // This is a very hacky trick, but it is buried deep, and
      // well encapsulated, and if it works, ok.
      //
      // The problem is if we press a button (like OpenFile) and 
      // we havn't focusted the text component yet, this method 
      // will return null, and cause problems.
      //
      // So, if this is the case, we'll search out to find the active
      // editor tab pane in the DataBrowser, via the Component tree.
      log.writeDebug(1, "getEditorPane(): HACK: "+
                     "Fishing for a SyntaxEditorPane!");
      
      DataBrowser databrowser=findDataBrowser(ae);
      if (databrowser != null)
         return databrowser.findActiveEditor();

      log.writeDebug(1, "SystaxEditorAction.getEditorPane(): "+
                     "I can't find an editor !!");

      return null;
   }

   protected DataBrowser findDataBrowser(ActionEvent ae) {
      if (databrowser != null)
         return databrowser;

      Component c=(Component)ae.getSource();      
      Component parent=c;
      Component lastComponent=c;

      while (parent != null && 
             !(parent instanceof DataBrowser) &&
             !(parent instanceof JFrame)) {

         //log.writeDebug(5, "findDataBrowser(): Component: "+
         //               parent.getClass().getName());
         lastComponent=parent;

         // A bit of a trick for JPopupMenu - parent is not parent
         // it is the 'invoker'
         if (parent instanceof JPopupMenu)
            parent=((JPopupMenu)parent).getInvoker();
         else 
            parent=parent.getParent();
      }

      if (parent != null) {
         log.writeDebug(3, "findDataBrowser(): found parent "+
                        parent.getClass().getName());

         if (parent instanceof DataBrowser) {
            // now I've found the DataBrowser, now get the active
            DataBrowser databrowser=(DataBrowser)parent;
            return databrowser;
         } 
      } else {
         log.writeDebug(5, "findDataBrowser(): parent component is null!");
         log.writeDebug(5, "Last component was "+
                        lastComponent);
      }
      
      return null;
   }

   public void setDataBrowser(DataBrowser d) {
      databrowser=d;
   }
}
