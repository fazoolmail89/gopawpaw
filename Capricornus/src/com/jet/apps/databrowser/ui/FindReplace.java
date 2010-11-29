package com.jet.apps.databrowser.ui;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

// import com.jet.jedit.*;
import com.jet.utils.ui.*;
import com.jet.utils.*;

import com.jet.apps.databrowser.editor.*;


/*
 * $Log: FindReplace.java,v $
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2002/03/13 22:29:05  bemocvs
 * added find replace.
 *
 */

/**
 * A Find and Replace GUI that works with the EditorPane.
 *
 * @author Paul Bemowski
 */
public class FindReplace extends JDialog 
   implements ActionListener, com.jet.log.Logger
{
   PopupTextField find=null;
   PopupTextField replace=null;

   boolean found=false;

   static String lastFind="";
   static String lastReplace="";

   DataBrowser databrowser=null;

   /** */
   public FindReplace(DataBrowser parent) {
      super(parent, true);
      this.databrowser=parent;

      setTitle("Find/Replace");
      setSize(250, 180);
      setLocation(WinUtil.alignCenter(this));
      getContentPane().setLayout(new BorderLayout());

      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));

      JButton findButton=new JButton("Find");
      JButton replaceButton=new JButton("Replace");
      findButton.addActionListener(this);
      findButton.setActionCommand("find");
      replaceButton.addActionListener(this);      
      replaceButton.setActionCommand("replace");
      buttonPanel.add(findButton);
      buttonPanel.add(replaceButton);

      JPanel leftPanel=new JPanel(new GridLayout(2, 1));
      JPanel fieldPanel=new JPanel(new GridLayout(2, 1));
      JPanel centerPanel=new JPanel(new BorderLayout());
      
      leftPanel.add(new JLabel("Find:"));
      leftPanel.add(new JLabel("Replace: "));
      find=new PopupTextField(16);
      find.setActionCommand("find");
      find.setText(lastFind);

      replace=new PopupTextField(16);
      replace.setActionCommand("replace");
      replace.setText(lastReplace);

      fieldPanel.add(find);
      fieldPanel.add(replace);
      
      centerPanel.add(leftPanel, "West");
      centerPanel.add(fieldPanel, "Center");

      getContentPane().add(centerPanel, "Center");
      getContentPane().add(buttonPanel, "South");
      pack();
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      String action=ae.getActionCommand();
      // log.writeDebug("Action='"+action+"'");
      
      if (action.equals("find"))
         find();
      else if (action.equals("replace"))
         replace();
   }
   
   /** */
   boolean find() {
      SyntaxEditorPane sep=databrowser.findActiveEditor();
      Caret caret=sep.getCaret();

      String text=sep.getText();
      String findText=find.getText();

      //log.writeDebug("looking for '"+findText+"' in '"+text+"'");

      if (StringUtil.empty(text) ||
          StringUtil.empty(findText))
         return false;

      lastFind=findText;
      lastReplace=replace.getText();

      text=text.toLowerCase();
      findText=findText.toLowerCase();
      
      int caretPosition=caret.getDot(); // jedit.getCaretPosition();
      
      int index=text.indexOf(findText, caretPosition);
      // log.writeDebug("index = "+index);
      
      int start=index;
      int end=index+findText.length();
      log.writeDebug("start="+start+" end="+end);
      if (start != -1) {
         // jedit.setSelectionEnd(end);
         // jedit.setSelectionStart(start);
         sep.setSelectionStart(start);
         sep.setSelectionEnd(end);
         return true;
      }
      else 
         return false;
   }

   /** */
   void replace() {
      SyntaxEditorPane sep=databrowser.findActiveEditor();
      if (!found) {
         found=find();
         return;
      }
      String replaceText=replace.getText();
      sep.setSelectedText(replaceText);
      found=find();
   }

   /** */
   public static void main(String args[]) {
      FindReplace fr=new FindReplace(null);
      fr.show();
   }
}
