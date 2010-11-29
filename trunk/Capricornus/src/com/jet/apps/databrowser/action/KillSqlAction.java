package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.ui.misc.*;
import com.jet.apps.databrowser.ui.DataBrowser;

import com.jet.utils.ui.MessageWindow;

import java.util.*;

/*
 * $Log: KillSqlAction.java,v $
 * Revision 1.1  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class KillSqlAction extends DefaultAction implements DBEvents
{
   static Icon icon=IconManager.getInstance().getIcon("button_stop");
   SQLProcess processThread=null;

   DataBrowser databrowser=null;

   /** */
   public KillSqlAction(DataBrowser db) {
      super(icon, db.getSession());
      databrowser=db;
      session.addObserver(this);
      setEnabled(false);
      putValue(SHORT_DESCRIPTION, "Kill Currently Executing SQL Thread");
      putValue(NAME, "Kill SQL Thread");
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      // warn:
      if (MessageWindow.
          showDeadlyOption(databrowser, 
                           "Warning: This will interrupt the Thread \n"+
                           "currently executing SQL on your conneciton. \n"+
                           "This will likely make the connection unstable \n"+
                           "requiring a re-connect to the database, and \n"+
                           "possibly damaging your data.  \n\n"+
                           "Do you wish to continue?"))
      {
         try {
            if (processThread != null) {
               log.writeDebug(2, "Sending kill message to thread: "+processThread);
               processThread.killSql();
            } else {
               log.writeError(1, "Nothing to stop, process thread is null");
            }
         }
         catch (Exception ex) {
            log.writeError (1, "Unable to stop sql due to exception.", ex);
         }
      }
   }
   
   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent) obj;
      
      int code=event.getCode();
      switch (code) {
         case (SQL_STARTED):
            processThread=(SQLProcess)event.getData();
            setEnabled(true);
            break;
         case (SQL_FINISHED): 
            processThread=null;
            setEnabled(false);
            break;
         case (DATABASE_DISCONNECT): 
            setEnabled(false);
            break;
            
         default: 
      }
   }
}
 

