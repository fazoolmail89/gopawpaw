package com.jet.apps.databrowser.ui.tableinfo;

import java.awt.*;
import javax.swing.*;

import java.util.*;
import java.sql.SQLException;


import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.action.*;
import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.ui.*;

import com.jet.apps.databrowser.ui.misc.*;

import com.jet.utils.StringUtil;
import com.jet.utils.ui.*;
import com.jet.utils.properties.*;
import com.jet.utils.icons.*;
import com.jet.database.*;

import com.jet.log.Logger;
// import com.jet.jedit.*;
import com.jet.apps.databrowser.editor.*;

/*
 * $Log: TableInfoPanel.java,v $
 * Revision 1.4  2007/02/18 17:52:45  bemocvs
 * removed loading pane
 *
 * Revision 1.3  2004/10/21 20:56:04  bemocvs
 * 3.3.0 work
 *
 * Revision 1.2  2004/10/07 21:11:38  bemocvs
 * Editor actions
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/24 18:31:09  bemocvs
 * table info panel
 *
 */

/**
 *
 * @author <a href="mailto:support@jetools.com">J Enterprise Technologies</a>
 */
public class TableInfoPanel extends JPanel
   implements Logger, Observer, DBEvents, SessionPropertyKeys {
   
   /** */
   ColumnInfoPanel colInfoPanel=null;
   
   /** */
   IndexInfoPanel indexInfoPanel=null;

   /** */
   JEditorPane ddlEditor=null;

   /** */
   JPanel loading=null;

   /** */
   JTabbedPane tabPane=null;
   
   /** */
   public TableInfoPanel() {
      setLayout(new BorderLayout());
      tabPane=new JTabbedPane();
      
      colInfoPanel=new ColumnInfoPanel();
      tabPane.add(colInfoPanel, "Columns");

      indexInfoPanel=new IndexInfoPanel();
      tabPane.add(indexInfoPanel, "Indices");

      SyntaxDocument doc=new SyntaxDocument(new SQLSyntaxProperties());
      ddlEditor=new SyntaxEditorPane(doc);
      ddlEditor.setEditable(false);
      // ddlEditor=new EditorPane(jeditDefaults());
      // ddlEditor.setTokenMarker(new GenericSQLTokenMarker());
      
      tabPane.add(new JScrollPane(ddlEditor), "DDL");
    
      
      loading=new JPanel(new BorderLayout());
      loading.add(new JLabel("Loading..."), BorderLayout.CENTER);
      // add(loading, BorderLayout.CENTER);
      add(tabPane, BorderLayout.CENTER);
   }

   /** */
   public void setSQLTable(SQLTable t) {
      // remove old loading tab, add NEW
      // remove(loading);


      colInfoPanel.setSQLTable(t);
      indexInfoPanel.setSQLTable(t);
      
      if (t != null)
         ddlEditor.setText(t.getCreateSql());
      else
         ddlEditor.setText("");

      //add(tabPane, BorderLayout.CENTER);
      
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();
      switch (code) {
         case(DATABASE_DISCONNECT):
            setSQLTable(null);
            break;
         default:
      }
   }
}
