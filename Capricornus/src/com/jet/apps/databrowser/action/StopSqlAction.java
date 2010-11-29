package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.ui.misc.*;

import java.util.*;

/*
 * $Log: StopSqlAction.java,v $
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/22 19:28:18  bemocvs
 * added for 3.0.5
 *
 * Revision 1.2  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class StopSqlAction extends DefaultAction implements DBEvents
{
   static Icon icon=IconManager.getInstance().getIcon("button_stop");
   SQLProcess processThread=null;

   /** */
   public StopSqlAction(DBSession session) {
      super(icon, session);
      session.addObserver(this);
      setEnabled(false);
      putValue(SHORT_DESCRIPTION, "Stop Currently Executing SQL");
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      try {
         if (processThread != null) {
            processThread.stopSql();
         } else {
            log.writeError(1, "Nothing to stop, process thread is null");
         }
      }
      catch (Exception ex) {
         log.writeError (1, "Unable to stop sql due to exception.", ex);
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
 

