package com.jet.apps.databrowser.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.util.List;

import com.jet.log.*;
import com.jet.utils.properties.*;
import com.jet.utils.ui.*;

import com.jet.utils.VectorUtil;

import com.jet.apps.databrowser.sqllog.*;

/*
 * $Log: EditBookmarks.java,v $
 * Revision 1.2  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public class EditBookmarks extends JDialog implements Logger, ActionListener
{
   EProperties props=null;

   JList list=null;

   SQLBookmarks sqlBookmarks=null;

   /** */
   private EditBookmarks(JComponent comp)
   {
      super (WinUtil.findParentFrame(comp), true);
      this.setSize(250, 170);
      this.setTitle("Delete Bookmarks");
      this.setLocation(WinUtil.alignCenter(this));
      this.getContentPane().setLayout(new BorderLayout());

      sqlBookmarks=SQLBookmarks.getInstance();

      List names=sqlBookmarks.getBookmarkNames();
      Vector namesVector=VectorUtil.listToVector(names);

      list=new JList(namesVector);
      
      JScrollPane sp=new JScrollPane(list);
      
      this.getContentPane().add(sp, "Center");
      
      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton delete=new JButton("Delete");
      JButton close=new JButton("Close");
      // close.setActionCommand("close");
      close.addActionListener(this);
      delete.addActionListener(this);
      southPanel.add(delete);
      southPanel.add(close);
      

      this.getContentPane().add(southPanel, "South");
   }

   /** */
   public static void edit(JComponent parent) {
      EditBookmarks eb=new EditBookmarks(parent);
      eb.show();
   }

   /** */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      //log.writeDebug ("Action="+action);
      if (action.equals("Close"))
      {
         this.dispose();
      }
      else if (action.equals("Delete"))
      {
         if (sqlBookmarks == null) {
            this.dispose();
            return;
         }
         Object sel[]=list.getSelectedValues();
         
         for (int i=0; i<sel.length; i++) {
            // props.remove(sel[i]);
            String name=(String)sel[i];
            
            sqlBookmarks.deleteBookmark(name);
         }
         this.dispose();
      }
   }
}



