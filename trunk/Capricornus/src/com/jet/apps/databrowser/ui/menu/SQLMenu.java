package com.jet.apps.databrowser.ui.menu;


import java.util.*;
import java.util.List;
import com.jet.utils.properties.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.action.*;

import com.jet.apps.databrowser.sqllog.*;


/*
 * $Log: SQLMenu.java,v $
 * Revision 1.4  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.3  2007/02/18 17:58:11  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2006/08/11 16:44:25  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:21:48  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is similar to a bookmark window for SQL.
 *
 * @author Paul Bemowski
 */
public class SQLMenu extends JMenu 
   implements Logger, ActionListener, SQLBookmarkListener
{
   /** Just sql bookmarks, not the global prop object. */
   private EProperties mProps=null;
   private DBSession dbSession=null;

   private Vector menuItems=null;

   SQLBookmarks sqlBookmarks=null;

   JMenuItem deleteMenuItem=null;

   /**
    *
    */
   public SQLMenu(String name, DBSession session, DataBrowser db)
   {
      super(name);
      dbSession=session;
      mProps=dbSession.getProperties(session.SQL_BOOKMARKS);
      // mProps.addObserver(this);


      JMenuItem addSql=new JMenuItem ("Add SQL Bookmark");
      addSql.setActionCommand("SQLMenu.add");
      addSql.addActionListener(this);
      this.add(addSql);

      deleteMenuItem=new JMenuItem ("Delete SQL Bookmark");
      deleteMenuItem.setActionCommand("SQLMenu.delete");
      deleteMenuItem.addActionListener(this);
      this.add(deleteMenuItem);

      this.add(new JSeparator());
      

      sqlBookmarks=SQLBookmarks.getInstance();
      if (sqlBookmarks != null)
         sqlBookmarks.addListener(this);

      menuItems=new Vector();
      rebuild();
   }

   /**
    *
    */
   public void rebuild()
   {
      // remove all
      for (int i=0; i<menuItems.size(); i++)
      {
         JMenuItem mItem=(JMenuItem)menuItems.elementAt(i);
         mItem.removeActionListener(this);
         this.remove(mItem);
      }

      
      if (sqlBookmarks == null)
         return;
      
      List names=sqlBookmarks.getBookmarkNames();

      if (names == null || names.size() == 0) {
         deleteMenuItem.setEnabled(false);
      } else {
         deleteMenuItem.setEnabled(true);
      }

      for (int i=0; i<names.size(); i++) {
         String name=(String)names.get(i);
         JMenuItem item=new JMenuItem(name);
         item.setActionCommand(name);
         item.addActionListener(this);
         menuItems.add(item);
         this.add(item);
      }
      

//       if (mProps == null) return;  // Prevent npe
//       for (int i=0; i<mProps.size(); i++)
//       {
//          Key key=mProps.getKey(i);
         
//          JMenuItem mItem=new JMenuItem(key.toString());
         
//          menuItems.addElement(mItem); // makes things easy to remove

//          mItem.setActionCommand(key.toString());
//          mItem.addActionListener(this);
//          this.add(mItem);
//       }
//      this.validate();      
//      this.revalidate();
   }

   /**
    *
    */
   public void propertyChange(PropertyChangeEvent evt) {
      log.writeDebug ("Property changed: "+evt);
      rebuild();
   }

   public void bookmarkEvent(SQLBookmarkEvent evt) {
      rebuild();
   }

   /** */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      
      if (action.equals("SQLMenu.add")) {
         String message="Enter name for SQL Bookmark";
         String key=JOptionPane.showInputDialog(message);
         String sql=dbSession.getEditorText();
         if (key != null && key.length() > 0 && !key.equals("add") &&
             sql != null && sql.length() > 0)
         {
            //mProps.put(key, sql);
            // rebuild(); // The observer will call re-build.

            if (sqlBookmarks != null) 
               sqlBookmarks.addBookmark(key, sql);
         }
      }
      else if (action.equals("SQLMenu.delete")) {
         EditBookmarks.edit(this);
      }
      else {
         //String sql=(String)mProps.get(action);
         //log.writeDebug ("key (action)="+action+" sql = "+sql);
         
         String sql=null;
         if (sqlBookmarks != null)
            sql=sqlBookmarks.getBookmark(action);
         
         if (sql != null)
            dbSession.setEditorText(sql);
      }
   }
}
