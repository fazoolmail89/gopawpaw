package com.jet.apps.databrowser.model.tree;

import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;

import com.jet.log.Logger;
import com.jet.database.*;

/*
 * $Log: ColumnNode.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 */
public class ColumnNode extends DBNode implements TreeNode, Logger
{
   TreeNode parent=null;
   String name="";
   boolean isKey;
   boolean isIndex;
   String type;
   String parms=null;
   int size=0;

   public ColumnNode(TreeNode p, String n) {
      parent=p;
      name=n;
   }

   public ColumnNode (TreeNode p, String n, String t, int s, 
                      boolean k, boolean ind)
   {
      this(p, n);

      isKey=k;
      isIndex=ind;
      type=t;
      size=s;
      parms=""+s;
   }

   public ColumnNode(TreeNode p, SQLColumn col) {
      parent=p;
      name=col.getName();
      type=col.getType().getName();
      isKey=col.isPrimaryKey();
      isIndex=col.isIndexed();
      parms=col.getType().getParameterString();
   }

   public boolean isKey() {return isKey;}
   public boolean isIndex() {return isIndex;}

      
   public Enumeration children() {return null;}
   public boolean getAllowsChildren () {return false;}
   public TreeNode getChildAt(int i) {return null;}
   public int getChildCount() {return 0;}
   public int getIndex(TreeNode child) {return 0;}
   public TreeNode getParent() {return parent;}
   public boolean isLeaf() {return true;}
   public String toString() 
   {
         
      String string=name+": "+type+" ("+parms+")";
      /*if (isKey)
        string=string+" **Key";
        if (isIndex)
        string=string+" **Index";*/
                  
      return string;
   }
      
   public String getName() {
      return name;
   }
}

