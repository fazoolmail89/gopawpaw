package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import java.io.*;
import java.util.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.database.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.ui.ExceptionDebugger;

/*
 * $Log: SaveConnectionAction.java,v $
 * Revision 1.2  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.1  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 */

/**
 * 
 * @author Paul Bemowski
 */
public class SaveConnectionAction extends DefaultAction
   implements DBEvents
{
   /** */
   public SaveConnectionAction(DBSession session, JFrame parent) {
      super("Save Connection to File...", session, parent);
      setEnabled(false);
      session.addObserver(this);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "SaveConnectionAction");

      // open a file chooser
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

      int returnVal=chooser.showSaveDialog(parent);
      if (returnVal == chooser.APPROVE_OPTION) {
         String filename=chooser.getSelectedFile().getAbsolutePath();

         if (filename == null ||
             filename.trim().length() == 0) {
            MessageWindow.showWarning(parent, "No file name was specified. "+
                                      "The ConnectionInfo was not saved.");
         }
         
         if (!filename.endsWith(".properties"))
            filename=filename+".properties";

         filename=FileUtil.unixSlashify(filename);

         // Read this file, and put sql into sql window
         boolean success=false;
         try {
            ConnectionInfo conInfo=session.getConnectionInfo();

            EProperties conProps=conInfo.toEProperties();
            
            conProps.save(new File(filename));
            success=true;
         } catch (Exception ex) {
            log.printStackTrace(ex);
//             MessageWindow.showWarning(parent, 
//                                       "Unable to save connection props to "+
//                                       filename, ex);

            ExceptionDebugger.debug(parent, 
                                    "Unable to save connection props to "+
                                    filename, ex);
            return;
         }

         if (success) { //inform the user
            MessageWindow.showMessage(parent, "Connection info saved to "+
                                      filename);
         }
         else {
            MessageWindow.showWarning(parent, "An unknown error has occured "+
                                      "saving "+filename);
         }
      }
   }

   /** */
   public void update(Observable o, Object arg) {
      if (arg instanceof DBEvent) {
         DBEvent event=(DBEvent)arg;
         int code=event.getCode();
         ImageIcon icon=null;
         switch (code) {
            case (DATABASE_CONNECT): 

            setEnabled(true);
            break;

            case (DATABASE_DISCONNECT): 
            setEnabled(false);
            break;
            
            default:
         }
      }
   }
}
