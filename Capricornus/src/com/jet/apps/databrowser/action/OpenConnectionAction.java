package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import java.io.*;
import java.util.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.database.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;

/*
 * $Log: OpenConnectionAction.java,v $
 * Revision 1.2  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.1  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 */

/**
 * Opens a database connection from an EProperties file.
 * 
 * @author Paul Bemowski
 */
public class OpenConnectionAction extends DefaultAction
{
   /** */
   public OpenConnectionAction(DBSession session, JFrame parent) {
      super("Open Connection From File...", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "OpenConnectionAction");
      JFileChooser chooser=new JFileChooser();
      chooser.setFileSelectionMode(chooser.FILES_ONLY);
      chooser.setMultiSelectionEnabled(false);

      File lastDirectory=session.getLastConnectionDirectory();

      if (lastDirectory != null)
         chooser.setCurrentDirectory(lastDirectory);
      else
         chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      
      ExtensionFilter extFilter=new ExtensionFilter();
      extFilter.addExtension(".properties");

      chooser.setFileFilter(extFilter);

      int returnVal=chooser.showOpenDialog(parent);
      if (returnVal == chooser.APPROVE_OPTION)
      {
         File file=chooser.getSelectedFile();
         lastDirectory=file.getParentFile();

         session.setLastConnectionDirectory(lastDirectory);
         String filename=file.getAbsolutePath();
         
         // Read this file, and put sql into sql window
         try {
            EProperties conProps=new EProperties();
            conProps.load(file);
            ConnectionInfo conInfo=new ConnectionInfo(conProps);

            if (session.isConnected()) {
               session.disconnect();
            }
            session.connect(conInfo);
         } catch (Exception ex) {
            log.printStackTrace(ex);
//             MessageWindow.showWarning(parent, "Error reading file or "+
//                                       " connecting with the DB "+
//                                       filename, ex);
            ExceptionDebugger.debug(parent, "Error reading file or "+
                                    " connecting with the DB "+
                                    filename, ex);
         }
      }
   }
}
