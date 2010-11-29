package com.jet.apps.databrowser.model.tree;

import java.awt.Cursor;

import javax.swing.*;
import javax.swing.tree.*;

import com.jet.apps.databrowser.database.ConnectionInfo;

/*
 * $Log: DBNode.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2001/10/09 11:34:01  bemocvs
 * initial checkin
 *
 */

/**
 * Superclass for databrowser tree nodes.
 *
 * @author Paul Bemowski
 */
public abstract class DBNode implements TreeNode
{

   /** */
   public DBNode () {
   }

   /** */
   protected ConnectionInfo getConnectionInfo() {
      DatabaseNode n=findDatabaseNode();
      if (n != null)
         return n.getConnectionInfo();
      return null;
   }

   /** */
   DatabaseNode findDatabaseNode() {
      TreeNode parent=this;
      while (parent != null) {
         if (parent instanceof DatabaseNode) {
            DatabaseNode node=(DatabaseNode)parent;
            return node;
         }
         parent=parent.getParent();
      }
      return null;
   }

   /** */
   protected void setWaitCursor() {
      DatabaseNode n=findDatabaseNode();
      if (n != null)
         n.model.busy();
   }
   
   /** */
   protected void setNormalCursor() {
      DatabaseNode n=findDatabaseNode();
      if (n != null)
         n.model.done();
   }
}



