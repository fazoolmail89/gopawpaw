package com.jet.apps.databrowser.ui.menu;


import java.awt.event.*;
import java.util.*;
import java.io.*;

import com.jet.utils.properties.*;
import com.jet.utils.ui.*;
import com.jet.utils.filesystem.*;

import javax.swing.*;
import com.jet.log.*;

import com.jet.apps.databrowser.model.*;

/*
 * $Log: RecentFilesMenu.java,v $
 * Revision 1.5  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.4  2005/03/02 08:47:00  bemocvs
 * paste from unix, kbd shortcuts
 *
 * Revision 1.3  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.2  2003/08/21 16:30:37  bemocvs
 * autocommit, sql editing
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/02 00:22:58  bemocvs
 * 3.0.1
 *
 * Revision 1.1  2002/05/01 21:21:48  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.2  2002/03/13 23:33:45  bemocvs
 * removed sys.out.
 *
 * Revision 1.1  2002/03/13 22:28:23  bemocvs
 * Initial checkin
 *
 */

/**
 *
 *
 *
 */
public class RecentFilesMenu extends JMenu 
   implements PropertyObserver, Logger, SessionPropertyKeys
{
   Vector recentMenuItems=new Vector();
   ActionListener mActionListener=null;
   
   DBSession dbSession=null;

   EProperties mProps=null;

   /** */
   public RecentFilesMenu(String title, DBSession session)
   {
      super(title);
      dbSession=session;
      mProps=session.getProperties(RECENT_FILES);
      if (mProps == null) {
         mProps=new EProperties();
         session.getGlobalProperties().put(RECENT_FILES, mProps);
      }

      mProps.addObserver(this);
      mActionListener=new ActionHandler();
      this.rebuild();
   }

   /** */
   public void propertyChange(PropertyChangeEvent evt)  {
      rebuild();
   }

   /** */
   private void rebuild()
   {
      // first, remove
      if (recentMenuItems != null)
      {
         for (int i=0; i<recentMenuItems.size(); i++)
         {
            JMenuItem mItem=(JMenuItem)recentMenuItems.elementAt(i);

            if (mItem != null)
            {
               mItem.removeActionListener(mActionListener);
               this.remove(mItem);
            }
         }
      }
      

      // recentMenu.removeAll();

      // menuFile.insert(new JSeparator());
      // int offset=3;
      // now add
      EProperties recent=mProps;
      // System.out.println("Recent: "+recent);
      
      if (recent != null) {
         Vector files=(Vector)recent.get(RECENT_FILES_VECTOR);
         if (files != null) {
            JMenuItem item=null;
            for (int i=0; i<files.size(); i++) {
               String file=(String)files.elementAt(i);
               String name=FileUtil.getName(file);
               item=new JMenuItem(name);
               item.setToolTipText(file);

               item.setActionCommand(file);
               recentMenuItems.addElement(item);
               this.add(item);
               item.addActionListener(mActionListener);
            }
         }
      }
      this.revalidate();
   }

   /** */
   private class ActionHandler implements ActionListener
   {
      public void actionPerformed (ActionEvent ae) {
         String action=ae.getActionCommand();
         log.writeDebug("action: "+action);
         openFile(action);
      }
   }

   /**
    *
    */
   private void openFile(String actionAsFilename)
   {
      log.writeDebug ("Opening File: "+actionAsFilename);

      dbSession.openNewFile(actionAsFilename);

//       try {
//          StringBuffer sb=FileUtil.readFromFile(actionAsFilename);
//          dbSession.setEditorText(sb.toString(), actionAsFilename);
//       } catch (Exception ex) {
//          log.writeError(2, "Error reading file: ", ex);
//          String message="Error loading file '"+actionAsFilename+"'.";
//          MessageWindow.showWarning(this, message, ex);
//       }
   }


   /** 
    * A global convience method for setting a recent file.
    */
   public static final void addRecentFile(String filename) {
      if (filename == null) {
         log.writeError (1, "addRecentFile() - filename is null?");
         return;
      }

      EProperties rfp=DBSession.getProperties(DBSession.RECENT_FILES);
      Vector recentFiles=(Vector)rfp.get(DBSession.RECENT_FILES_VECTOR);
      if (recentFiles == null) {
         recentFiles=new Vector();
      }

      if (recentFiles.contains(filename)) {
         // This is already a recent file.  Just move it to the top of
         // recent files.
         recentFiles.remove(filename);
         recentFiles.insertElementAt(filename, 0); 
      } else {
         int maxFiles=DBSession.getGlobalProperties().getInt(DBSession.MAX_RECENT_FILES, 6);
         
         while (recentFiles.size() >= maxFiles) {
            recentFiles.removeElementAt(recentFiles.size() - 1);
         }
         
         filename=FileUtil.unixSlashify(filename);
         
         recentFiles.insertElementAt(filename, 0);
      }
      rfp.put(DBSession.RECENT_FILES_VECTOR, recentFiles);
      try {
         rfp.save();
      } catch (Exception ex) {
         log.writeError(1, "Unable to save global properties to update "+
                        "recent files.", ex);
      }
   }
}










