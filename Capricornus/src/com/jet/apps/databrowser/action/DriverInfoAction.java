package com.jet.apps.databrowser.action;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.ui.*;

/*
 * $Log: DriverInfoAction.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class DriverInfoAction extends DefaultAction 
   implements Observer, DBEvents
{
   /** */
   public DriverInfoAction(DBSession session, JFrame parent) {
      super("View Driver Info", session, parent);
      setEnabled(false);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DriverInfoAction");

      ConnectionInfo ci=session.getConnectionInfo();
      DriverInfoTable.showInfoTable(parent, ci.getConnection());
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();
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
