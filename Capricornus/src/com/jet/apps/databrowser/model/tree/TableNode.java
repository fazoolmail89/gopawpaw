package com.jet.apps.databrowser.model.tree;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;

import com.jet.log.Logger;
import com.jet.database.*;

import com.jet.utils.ui.SQLExceptionDebugger;

/*
 * $Log: TableNode.java,v $
 * Revision 1.2  2004/09/30 19:11:28  bemocvs
 * Fixed oracle schema prefixing
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.2  2002/03/16 20:01:04  bemocvs
 * fixed unlikely null pointer exception
 *
 * Revision 1.1  2001/10/09 11:34:01  bemocvs
 * initial checkin
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public class TableNode extends DBNode implements TreeNode, Logger
{
   String tableName="";
   TreeNode parent=null;
   Vector children = null;
   SQLTable sqltable = null;
   String type=null;

   boolean isSystemTable=false;
   boolean isView=false;

   /** */
   public TableNode(TreeNode par, String tn, String t) {
      parent=par;
      tableName=tn;
      type=t;

      if (type != null) {
         if (type.toLowerCase().equals("system table"))
            isSystemTable=true;
         else if (type.toLowerCase().equals("view"))
            isView=true;
      }
   }

   public boolean isSystemTable() {return isSystemTable;}
   public boolean isView() {return isView;}

   /** */
   public Enumeration children()
   {
      if (children == null) {
         try {
            //setWaitCursor();
            buildChildren();
         }
         catch (SQLException ex) {
            log.writeError (1, "Sql Error in TableNode, stack follows", 
                            ex);
            // SQLExceptionDebugger.debug(getComponent(), ex);
         }
         finally {
            //setNormalCursor();
         }
      }
      if (children != null)
         return children.elements();
      else
         return null;
   }
   public boolean getAllowsChildren() {return true;}
   public TreeNode getChildAt(int i)
   {
      return (TreeNode)children.elementAt(i);
   }
   public int getChildCount()
   {
      if (children == null) {
         try {
            // setWaitCursor();
            buildChildren();
         }
         catch (SQLException ex){
            log.writeError (1, "Sql Error in TableNode, stack follows", 
                            ex);
            // SQLExceptionDebugger.debug(getComponent(), ex);
         }
         finally {
            // setNormalCursor();
         }
      }
      if (children != null)
         return children.size();
      else
         return 0;
   }
   public int getIndex(TreeNode child) {return 0;}
   public TreeNode getParent() {return parent;}
   public boolean isLeaf() {return false;}
   public String toString() {return tableName;}

   public SQLTable getSQLTable()
   {
      if (sqltable == null) {
         try {
            //setWaitCursor();
            buildChildren();
         }
         catch (Exception ex){
            log.writeError(1, "Error building children", ex);
         }
         finally {
            //setNormalCursor();
         }
      }

      return sqltable;
   }
      
   private void buildChildren() throws SQLException {
      children = new Vector();
      String name=null;

      if(tableName.indexOf(":") != -1) {
         name=tableName.substring(0, tableName.indexOf(":"));
      }
      else {
         name=tableName;
      }

      // strip off the schema name.  I found that with oracle,
      // if you have the schema name pre-pended, that the 
      // database won't allow you to get index and key info.  
      // so, for now, we're going to strip it off.  I don't 
      // remember why i did this in the first place, when it comes
      // to me I should deal with the logic here.
      // bemo, 03/17/00
      //String shortName=name;
      //if (name.indexOf(".") != -1)
      //   shortName=name.substring(name.indexOf(".")+1);


      // changed schema util to deal with this 9/5/00

      log.writeDebug ("Building table ("+name+") with schema util");
      SchemaUtil schemaUtil=getConnectionInfo().getSchemaUtil();
      log.writeDebug(schemaUtil.toString()); 

      sqltable=schemaUtil.getTable(name);
      log.writeDebug ("Done building table with schema util.");

      if (sqltable == null)
         return;

      int cols=sqltable.size();
      for (int i=0; i<cols; i++) {
         SQLColumn col=sqltable.columnAt(i);
         children.addElement(new ColumnNode(this, col));
      }
   }
      
   /** */
   public String getName() {
      return tableName;
   }
}

