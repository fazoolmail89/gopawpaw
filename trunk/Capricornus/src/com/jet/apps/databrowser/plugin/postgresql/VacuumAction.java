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
public class VacuumAction extends DefaultAction implements Logger
{
   /** */
   public VacuumAction(DBSession session, JFrame parent) {
      super("Vacuum", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("VacuumAction");

      try {
         ConnectionInfo ci=session.getConnectionInfo();
         Connection con=ci.getConnection();
         VacuumThread vt=new VacuumThread(con);
         vt.start();
      } catch (Exception ex) {
         session.exception(ex, "Error initializing vacuum thread.");
      }
   }

   /** */
   class VacuumThread extends Thread {
      Connection con=null;
      VacuumThread (Connection con) {
         setName("VacuumThread");
         this.con=con;
      }
      public void run() {
         Statement state=null; 
         try {
            state=con.createStatement();
            session.busy();
            session.setStatus("Executing 'vacuum'");
            state.executeUpdate("vacuum");
         } catch (SQLException ex) {
            session.sqlException(ex, "vacuum");
         }
         finally {
            if (state != null) 
               try {state.close();}catch (Exception ex){}
            session.done();
         }
      }
   }
}
