package com.jet.apps.databrowser.editor;

import java.awt.event.*;
import java.awt.datatransfer.*;
import java.awt.*;

import java.io.*;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

import com.jet.utils.filesystem.FileUtil;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;

import com.jet.apps.databrowser.editor.actions.*;

import com.jet.apps.databrowser.model.DBSession;


/**
 * A SQL Syntax highlighting editor pane. 
 *
 * @author Paul Bemowski
 */
public class SyntaxEditorPane extends JEditorPane
   implements DocumentListener, com.jet.log.Logger
{
   JPopupMenu popup=null;
   
   SyntaxUndoManager undoManager=null;

   SyntaxDocument document=null;

   boolean editable=true;

   private DBSession dbSession=null;

   /** If this editor is fronting for a file, this is the file. */
   protected File file=null;

   /** */
   private boolean isScratch=false;

   /** */
   public SyntaxEditorPane(SyntaxDocument d) {
      this(d, true);
   }

   /** */
   public SyntaxEditorPane(SyntaxDocument syntaxDocument, boolean edit) {
      super();
      editable=edit;
      setEditable(edit);

      this.setEditorKit(new StyledEditorKit());
      document=syntaxDocument;
      this.setDocument(syntaxDocument);

      if (editable)
         undoManager=new SyntaxUndoManager(this);

      syntaxDocument.addDocumentListener(this);
      
      buildPopup();
      this.addMouseListener(new PopupListener());

      Keymap keymap=getKeymap();

      KeyStroke keystroke=KeyStroke.getKeyStroke("alt Q");
      keymap.addActionForKeyStroke(keystroke, new ExecuteQueryEditorAction());

      keystroke=KeyStroke.getKeyStroke("alt U");
      keymap.addActionForKeyStroke(keystroke, new ExecuteUpdateEditorAction());

   }

   /** */
   public void setScratch(boolean b) {
      isScratch=b;
   }

   /** */
   public boolean isScratch() {return isScratch;}

   /** */
   public void setDBSession(DBSession session) {
      this.dbSession=session;
   }

   /** */
   public DBSession getDBSession() {
      return dbSession;
   }

   /** */
   private void buildPopup() {
      popup=new JPopupMenu();
      if (editable) {
         popup.add(new JMenuItem(new UndoAction()));
         popup.add(new JSeparator());
         popup.add(new JMenuItem(new CutAction()));
      }

      popup.add(new JMenuItem(new CopyAction()));

      if (editable)
         popup.add(new JMenuItem(new PasteAction()));

      Clipboard sysSelection=null;
      try {  // supports backward compatability with Java 1.2
         sysSelection=getToolkit().getSystemSelection();  // throws on 1.2
         // if we're here, the JVM supports it.
         JMenu unix=new JMenu("UNIX");
         if (sysSelection != null) {
            popup.add(unix);
            unix.add(new JMenuItem(new UnixCopyAction(this)));
            unix.add(new JMenuItem(new UnixPasteAction(this)));
         }
      } catch (Throwable t) {
         log.writeError(1, "Error building selection popup", t);
      }
      

      JMenu sql=new JMenu("SQL");
      popup.add(sql);
      sql.add(new JMenuItem(new SelectionQueryAction()));
      sql.add(new JMenuItem(new SelectionUpdateAction()));
      sql.add(new JMenuItem(new SelectionBatchAction()));
   }

   /** */
   public void setEditable(boolean b) {
      super.setEditable(b);
      editable=b;
      
      if (!editable)
         undoManager=null;

      buildPopup();
   }

   /**
    * Retrieves this pane's current file pointer.
    */
   public File getFile() {
      return file;
   }

   /** */
   public void setFile(File f) {
      this.file=f;
      String filename=file.getName();
      setTabTitle(filename);
   }

   /** 
    * Sets the editor's content to the content to the content
    * of the file, sets the tab name (if available).
    */
   public void openFile(File f) {
      log.writeDebug("Opening file: "+f);
      setFile(f);
      String filename=file.getName();
      try {
         StringBuffer content=FileUtil.readFromFile(file);
         setText(content.toString());
      } catch (IOException ex) {
         log.writeError(1, "Error setting file. ", ex);
         ExceptionDebugger.debug(this, "Unable to read from file "+
                                 filename, ex);         
      }
   }

   /** 
    * If this Editor should be so lucky as to live inside a 
    * JTabbedPane, this function will set that tab's name.  If this
    * editor does not live in a JTabbedPane, this function does
    * nothing at all. 
    */
   protected void setTabTitle(String title) {
      Component parent=this;
      Component last=null;
      while (!(parent instanceof JTabbedPane) &&
             parent != null) {
         last=parent;
         parent=parent.getParent();
      }
      log.writeDebug(1, "Set tab title, parent: "+parent);
      if (parent != null) {
         // must be an instance of JTabbedPane
         JTabbedPane tabPane=(JTabbedPane)parent;
         int index=tabPane.indexOfComponent(last);
         tabPane.setTitleAt(index, title);
      }      
   }

   /** 
    * Sets this pane's content. 
    */
   public void setText(String text) {
      super.setText(text);
      scrollToTop();
   }

   /** */
   public void setSelectedText(String s) {
      int start=getSelectionStart();
      int end=getSelectionEnd();

      int length=end-start;
      try {
         // document.beginCompoundEdit();
         document.remove(start, length);
         document.insertString(start, s, null);
      } catch (BadLocationException ex) {
         throw new RuntimeException("Error: bad location on setSelectedText()", 
                                    ex);
      }
   }

   /** */
   public void undo() {
      if (editable)
         undoManager.undo();
   }

   /** */
   public void redo() {
      if (editable)
         undoManager.redo();
   }

   /** */
   public void insertUpdate(DocumentEvent evt) {
      Document d=evt.getDocument();
      int offset=evt.getOffset();
      int length=evt.getLength();
      // tem.out.println ("Insert event: o"+offset+" l:"+length);
      if (offset == 0 &&
          length == d.getLength() && 
          d.getLength() > 5) {
         // implicit setText() operation
         // System.out.printlen ("Set text!");
         
         // see comment below
         scrollToTop();
      }
   }

   /** 
    * There is another document listener, that is invoked after us
    * that causes the caret to move down to the bottom.  So here, 
    * we wait .1 seconds, then scroll the user back to the top.
    * an elegant hack.
    * 7 Oct 2004. Atlanta. */
   void scrollToTop() {
      class scroller extends Thread {
         public void run() {
            try {sleep(100);} // .1 sec
            catch (Exception ex) {}
            
            SwingUtilities.invokeLater(new Runnable() {
                  public void run() {
                     SyntaxEditorPane.this.setCaretPosition(0);
                  }});
         }
      }

      scroller s=new scroller();
      s.start();
   }

   public void changedUpdate(DocumentEvent evt) {}
   public void removeUpdate(DocumentEvent evt) {}

   public void setCaretPosition(int p) {
      super.setCaretPosition(p);
      // System.out.println ("Setting caret position to "+p);
   }

   void showPopup(MouseEvent me) {
      Point scrollTopLeft=this.getLocation();
      scrollTopLeft=SwingUtilities.convertPoint(me.getComponent(), 
                                                me.getPoint(), this);
      popup.show(this, scrollTopLeft.x, scrollTopLeft.y); 
   }

   class PopupListener extends MouseAdapter {
      /** */
      public void mouseReleased (MouseEvent me) {
         if (me.isPopupTrigger()) {
            showPopup(me);
         }
      }
      /** */
      public void mousePressed (MouseEvent me) {
         if (me.isPopupTrigger()) {
            showPopup(me);
         }
      }
   }
}
