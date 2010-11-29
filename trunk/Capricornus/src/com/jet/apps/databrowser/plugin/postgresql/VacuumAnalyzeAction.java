package com.jet.apps.databrowser.plugin.postgresql;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.action.DefaultAction;
import com.jet.apps.databrowser.database.*;

import com.jet.log.Logger;


/*
 *
 */

/** 
 *
 */
public class VacuumAnalyzeAction extends DefaultAction implements Logger
{
   /** */
   public VacuumAnalyzeAction(DBSession session, JFrame parent) {
      super("Vacuum Analyze", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("VacuumAnalyzeAction");

      try {
         ConnectionInfo ci=session.getConnectionInfo();
         Connection con=ci.getConnection();
         VacuumAnalyzeThread vt=new VacuumAnalyzeThread(con);
         vt.start();
      } catch (Exception ex) {
         session.exception(ex, "Error initializing vacuum thread.");
      }
   }

   /** */
   class VacuumAnalyzeThread extends Thread {
      Connection con=null;
      VacuumAnalyzeThread (Connection con) {
         setName("VacuumAnalyzeThread");
         this.con=con;
      }
      public void run() {
         Statement state=null; 
         try {
            state=con.createStatement();
            session.busy();
            session.setStatus("Executing 'vacuum analyze'");
            state.executeUpdate("vacuum analyze");
         } catch (SQLException ex) {
            session.sqlException(ex, "vacuum analyze");
         }
         finally {
            if (state != null) 
               try {state.close();}catch (Exception ex){}
            session.done();
         }
      }
   }
}
