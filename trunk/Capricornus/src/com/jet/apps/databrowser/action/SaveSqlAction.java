package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import java.io.*;
import java.util.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.event.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.filesystem.FileUtil;
import com.jet.utils.ui.ExceptionDebugger;

/*
 * $Log: SaveSqlAction.java,v $
 * Revision 1.4  2006/12/18 03:20:49  bemocvs
 * 3.4.2
 *
 * Revision 1.3  2003/09/09 10:25:39  bemocvs
 * Bug fixes.
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
public class SaveSqlAction extends DefaultAction implements Observer, DBEvents
{
   String currentFile=null;
   String shortName=null;

   /** */
   public SaveSqlAction(DBSession session, JFrame parent) {
      super("Save SQL to ", session, parent);

      session.addObserver(this);
      this.setEnabled(false);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "SaveSqlAction");

      String file=currentFile;

      boolean success=false;
      try {
         StringBuffer sb=new StringBuffer();
         sb.append(session.getAllEditorText());
         
         success=FileUtil.saveToFile(file, sb);         
      } catch (Exception ex) {
         log.printStackTrace(ex);
//          MessageWindow.showWarning(parent, "Unable to read from file "+
//                                    file, ex);

         ExceptionDebugger.debug(parent, "Unable to read from file "+
                                 file, ex);
         return;
      }
      
      if (success) { //inform the user
         MessageWindow.showMessage(parent, "Editor window SQL saved to "+
                                   file);
      }
      else {
         MessageWindow.showWarning(parent, "An unknown error has occured "+
                                   "saving "+file);
      }
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent) obj;
      
      int code=event.getCode();
      switch (code) {
         case (FILE_OPEN):
            currentFile=(String)event.getData();
            setShortName(currentFile);

            putValue(Action.NAME, "Save SQL to "+shortName);
            setEnabled(true);

            break;
         case (FILE_CLOSED): 
            currentFile=null;
            shortName=null;
            putValue(Action.NAME, "Save SQL to ...");
            setEnabled(false);
            break;
         default:
      }
   }

   /** */
   void setShortName(String filename) {
      filename=FileUtil.unixSlashify(filename);
      shortName="..."+filename.substring(filename.lastIndexOf("/"));
   }
}
