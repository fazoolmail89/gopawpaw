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
 * $Log: SaveAsSqlAction.java,v $
 * Revision 1.4  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.3  2003/09/09 10:25:39  bemocvs
 * Bug fixes.
 *
 * Revision 1.2  2003/09/01 11:01:27  bemocvs
 * fixed delete, save as
 *
 * Revision 1.1  2003/08/21 16:30:37  bemocvs
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
public class SaveAsSqlAction extends DefaultAction
{
   /** */
   public SaveAsSqlAction(DBSession session, JFrame parent) {
      super("Save SQL As...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "SaveAsSqlAction");

      // open a file chooser
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".ddl");
      extFilter.addExtension(".sql");
      chooser.setFileFilter(extFilter);

      int returnVal=chooser.showSaveDialog(parent);
      if (returnVal == chooser.APPROVE_OPTION) {
         String file=chooser.getSelectedFile().getAbsolutePath();

         if (file == null ||
             file.trim().length() == 0) {
            MessageWindow.showWarning(parent, "No file name was specified. "+
                                      "The SQL was not saved.");
         }
         
         if (!file.endsWith(".ddl") &&
             !file.endsWith(".sql"))
            file=file+".sql";

         file=FileUtil.unixSlashify(file);

         // Read this file, and put sql into sql window
         boolean success=false;
         try
         {
            StringBuffer sb=new StringBuffer();
            sb.append(session.getAllEditorText());

            success=FileUtil.saveToFile(file, sb);

            session.setCurrentFile(file);
         } catch (Exception ex) {
            log.printStackTrace(ex);
//             MessageWindow.showWarning(parent, "Unable to read from file "+
//                                       file, ex);
            ExceptionDebugger.debug(parent, "Unable to save file "+
                                    file, ex);
            return;
         }

         if (success) { //inform the user
            EProperties rfp=session.getProperties(session.RECENT_FILES);
            Vector recentFiles=(Vector)rfp.get(session.RECENT_FILES_VECTOR);
            if (recentFiles == null) {
               recentFiles=new Vector();
            }
            int maxFiles=4;
            if (recentFiles.size() >= maxFiles)
               recentFiles.removeElementAt(recentFiles.size() - 1);
            recentFiles.insertElementAt(file, 0);
            rfp.put(session.RECENT_FILES_VECTOR, recentFiles);
            try {
               rfp.save();
            } catch (Exception ex) {log.writeError(1, ex);}

            MessageWindow.showMessage(parent, "Editor window SQL saved to "+
                                      file);
         }
         else {
            MessageWindow.showWarning(parent, "An unknown error has occured "+
                                      "saving "+file);
         }
      }
   }
}
