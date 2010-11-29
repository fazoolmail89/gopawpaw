package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import java.io.*;
import java.util.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;

/*
 * $Log: OpenSqlAction.java,v $
 * Revision 1.4  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.3  2003/09/01 11:01:27  bemocvs
 * fixed delete, save as
 *
 * Revision 1.2  2003/08/21 16:30:37  bemocvs
 * autocommit, sql editing
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class OpenSqlAction extends DefaultAction
{
   /** */
   public OpenSqlAction(DBSession session, JFrame parent) {
      super("Open SQL...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "OpenSqlAction");
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      File lastDirectory=session.getLastSqlDirectory();

      if (lastDirectory != null)
         chooser.setCurrentDirectory(lastDirectory);
      else
         chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".ddl");
      extFilter.addExtension(".sql");
      chooser.setFileFilter(extFilter);

      int returnVal=chooser.showOpenDialog(parent);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         File file=chooser.getSelectedFile();
         lastDirectory=file.getParentFile();

         session.setLastSqlDirectory(lastDirectory);
         String filename=file.getAbsolutePath();
         
         // Read this file, and put sql into sql window
         try {
            StringBuffer sb=FileUtil.readFromFile(filename);
            session.setEditorText(sb.toString(), filename);
            
            EProperties rfp=session.getProperties(session.RECENT_FILES);
            Vector recentFiles=(Vector)rfp.get(session.RECENT_FILES_VECTOR);
            if (recentFiles == null) {
               recentFiles=new Vector();
            }
            int maxFiles=4;
            if (recentFiles.size() >= maxFiles)
               recentFiles.removeElementAt(recentFiles.size() - 1);
            filename=FileUtil.unixSlashify(filename);
            recentFiles.insertElementAt(filename, 0);
            rfp.put(session.RECENT_FILES_VECTOR, recentFiles);
            rfp.save();

         } catch (Exception ex) {
            log.printStackTrace(ex);
//             MessageWindow.showWarning(parent, "Unable to read from file "+
//                                       filename, ex);
            ExceptionDebugger.debug(parent, "Unable to read from file "+
                                    filename, ex);
         }
      }
   }
}
