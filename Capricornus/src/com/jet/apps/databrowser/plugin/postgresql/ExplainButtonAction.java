package com.jet.apps.databrowser.plugin.postgresql;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.database.*;
import com.jet.apps.databrowser.ui.misc.*;

import com.jet.log.Logger;

import com.jet.utils.ui.*;

/*
 * $Log: ExplainButtonAction.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/04 18:51:25  bemocvs
 * Plugin work
 *
 */

/** 
 * This is a Plugin Action that is tightly coupled to the PostgreSQL
 * database.  It makes use of the 
 */
public class ExplainButtonAction extends DefaultAction implements Logger
{
   private static final Icon icon=
   IconManager.getInstance().getIcon("pg.explain");

   /** */
   public ExplainButtonAction(DBSession session, JFrame parent) {
      super("explain", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug("ExplainButtonAction");
      String sql=null;
      Connection con=null;
      try {
         sql=session.getEditorText();
         if (sql == null || sql.length() <= 0)
            return;

         sql="explain "+sql;

         ConnectionInfo conInfo=session.getConnectionInfo();
         con=conInfo.getConnection();
         
         Statement state=null;
         try {
            con.clearWarnings();
            state=con.createStatement();
            log.writeDebug(1, "Explain about to execute:\n"+sql);

            state.executeUpdate(sql);

            SQLWarning warning=con.getWarnings();
            con.clearWarnings();
            showExplanation(warning, sql);
         } finally {
            if (state != null) {
               try {state.close();}catch (Exception ex) {}
            }
         }
      } catch (SQLException sqle) {
         log.writeError(3, "SQLExcpetion", sqle);
         session.sqlException(sqle, sql);
         // SQLExceptionDebugger.debug(parent, sqle, sql);
      } catch (Exception ex) {
         log.writeError(1, "Error explaining", ex);
         session.exception(ex, "Error explaining");
      }
   }

   /** */
   private void showExplanation(SQLWarning warning, String sql) {
      JDialog dialog=new JDialog(parent, "Query Plan", false);
      dialog.setSize(450, 300);
      dialog.setLocation(WinUtil.alignCenter(dialog));
      
      PopupTextArea sqlarea=new PopupTextArea(sql);
      sqlarea.setEditable(false);
      JScrollPane sp1=new JScrollPane(sqlarea);

      PopupTextArea planarea=new PopupTextArea(warning.getMessage());
      planarea.setEditable(false);
      JScrollPane sp2=new JScrollPane(planarea);
      
      JSplitPane split=new JSplitPane(JSplitPane.VERTICAL_SPLIT, 
                                      true, sp1, sp2);
      
      dialog.getContentPane().add(split, "Center");

      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton close=new JButton(new CloseAction(dialog));
      buttonPanel.add(close);
      dialog.getContentPane().add(buttonPanel, "South");
      
      split.setDividerLocation(125);
      dialog.show();
      // SQLExceptionDebugger.debug(parent, warning, sql);
   }
}
