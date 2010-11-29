package com.jet.apps.databrowser.ui.editor;

import java.awt.Color;
import java.awt.FlowLayout;

import java.sql.SQLException;

import javax.swing.*;
import java.util.*;

import com.jet.database.*;

import com.jet.utils.ui.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.database.DatabaseUtil;

import com.jet.apps.databrowser.ui.editor.actions.*;

/**
 * A DataEditor View component used to update data. 
 *
 * @author Paul Bemowski
 */
public class UpdateDataEditor extends DataEditor
{
   /** */
   public UpdateDataEditor(JFrame p, SQLTable t, 
                           HashMap data, DBSession sess) {
      super(p, t, data, sess);
   }

   /** */
   /** */
   public UpdateDataEditor(JComponent p, SQLTable t, 
                           HashMap data, DBSession sess) {
      super(p, t, data, sess);
   }

   /** */
   protected JToolBar getNorthToolbar() {
      return null;
   }

   /** */
   protected JToolBar getSouthToolbar() {
      return new SouthToolbar();
   }

   /** */
   public int getMode() {return UPDATE;}

   /** */
   class SouthToolbar extends JToolBar 
   {
      public SouthToolbar() {
         setFloatable(false);
         setLayout(new FlowLayout(FlowLayout.RIGHT));

         add(new JButton(new SaveCloseAction(UpdateDataEditor.this)));
         add(new JSeparator());
         add(new JButton(new CloseAction(UpdateDataEditor.this)));
      }
   }

   /** */
   protected void init() {
      setTitle("Updating table "+sqlTable.getName());
   }

   /** Returns the new data - the new values for data that have 
    * changed. */
   public HashMap getNewData() {
      HashMap newData=new HashMap();

      for (int i=0; i<columnEditors.size(); i++) {
         ColumnEditor editor=(ColumnEditor)columnEditors.get(i);
         if (editor.isModified()){
            newData.put(editor.getColumn().getName(), 
                        editor.getValue());
         }
      }

      return newData;
   }

   /** */
   public String getSQL() 
      throws SQLException {
      StringBuffer sql=new StringBuffer();
      SchemaUtil su=session.getSchemaUtil();
      DatabaseUtil dbUtil=session.getDatabaseUtil();

      sql.append("update "+su.tableSQL(sqlTable.getName())+" set \n");
      
      boolean updateNecessary=false;

      for (int i=0; i<columnEditors.size(); i++) {
         ColumnEditor editor=(ColumnEditor)columnEditors.get(i);
         SQLColumn column=editor.getColumn();

         if (editor.isModified()){
            if (!updateNecessary) // first col
               sql.append("   "+column.getName()+"="+
                          dbUtil.colToSQL(column, editor.getValue()));
            else 
               sql.append(",\n   "+column.getName()+"="+
                          dbUtil.colToSQL(column, editor.getValue()));
            updateNecessary=true;

         }
      }
      sql.append("\n");
      
      if (!updateNecessary) {
         MessageWindow.showMessage(this, "All data are up to date, UPDATE "+
                                   "SQL not executed.");
         return "";
      }

      sql.append("where \n");

      String whereClause=dbUtil.whereClause(sqlTable, currentData);
      if (whereClause == null || whereClause.length() == 0 ) {
         // ad hoc
         whereClause=dbUtil.adHocWhereClause(sqlTable, currentData);
      }
      sql.append(whereClause);

      return sql.toString();
   }
}