package com.jet.apps.databrowser.action;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

import java.io.*;
import java.util.*;

import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.model.tree.*;

import com.jet.apps.databrowser.event.*;
import com.jet.utils.filesystem.*;
import com.jet.utils.properties.EProperties;
import com.jet.utils.ui.MessageWindow;
import com.jet.utils.filesystem.FileUtil;

/*
 * $Log: DropAllTablesAction.java,v $
 * Revision 1.1  2003/08/21 20:25:45  bemocvs
 * Fixes for comments in SQL, save
 *
 *
 */

/**
 * @author Paul Bemowski
 */
public class DropAllTablesAction extends DefaultAction 
{
   /** */
   public DropAllTablesAction(DBSession session, JComponent parent) {
      super("Drop All Tables", session, parent);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "DropAllTablesAction");

      TreePanelModel tpm=session.getTreePanelModel();
      TreeModel tm=tpm.getTreeModel();
      TreeNode root=(TreeNode)tm.getRoot();
      
      Enumeration children=root.children();

      ArrayList tables=new ArrayList();
      while (children.hasMoreElements()){
         tables.add(children.nextElement());
      }

      boolean confirm1=
      MessageWindow.showWarningOption(parent, 
                                      "WARNING: YOU ARE ABOUT TO DROP "+
                                      "ALL TABLES");

      if (!confirm1) 
         return;
      
      boolean confirm2=
      MessageWindow.showDeadlyOption(parent, 
                                     "FINAL WARNING: YOU ARE ABOUT TO DROP "+
                                     "THE FOLLOWING TABLES AND VIEWS: \n"+
                                     tables);

      if (!confirm2)
         return;

      StringBuffer alldrops=new StringBuffer();
      // ok, here's the deadly part
      for (int i=0; i<tables.size(); i++) {
         TableNode tn=(TableNode)tables.get(i);
         
         
         String sql=null;
         if (tn.isView()) {
            sql="drop view "+tn.toString();
         } else {
            sql="drop table "+tn.toString();
         }
         alldrops.append(sql+";\n");
         
      }
         
      session.executeBatch(alldrops.toString());
      
      tpm.reload();
   }
}
