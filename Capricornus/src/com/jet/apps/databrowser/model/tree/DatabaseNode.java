package com.jet.apps.databrowser.model.tree;

import java.sql.*;
import java.util.*;

import javax.swing.*;
import javax.swing.tree.*;

import com.jet.log.Logger;
import com.jet.database.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.apps.databrowser.model.TreePanelModel;


/*
 * $Log: DatabaseNode.java,v $
 * Revision 1.2  2006/05/24 13:53:34  barney
 * FIX: Ticket #1063
 *
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
 *
 * @author Paul Bemowski
 */
public class DatabaseNode extends DBNode implements TreeNode, Logger
{
   TreeNode parent=null;
   Vector children=new Vector();
   
   String mCurrentSchema=null;
   
   String dbName=null;
   ConnectionInfo mConnInfo=null;

   TreePanelModel model=null;
  
   /** Names for array indexes, to make code easier to read. *///rbw20060524
   private static final int TNAME = 0, TTYPE = 1;  

   /** */
   public DatabaseNode(ResultSet rs, ConnectionInfo ci, TreePanelModel m)
   {
      this.dbName=ci.getName();
      this.mConnInfo=ci;
      this.model=m;

      if (rs != null) {
         try {
        	 
        	 /* FIX: Ticket #1063
        	  * first, we add all the names to the vector
			 	so we can sort it before creating the
			 	nodes. 
			 	*///rbw2060524
        	 Vector nodeNameV = new Vector();   
        	 
            // setWaitCursor();
            while (rs.next()) {
               String name=rs.getString("table_name");
               String type=rs.getString("table_type");
               //rs.getString("table_cat")+", "+
               //rs.getString("table_type")+")";
               if (mCurrentSchema != null)
                  name=mCurrentSchema+"."+name;
               nodeNameV.add(new String[]{name, type}); //add a basic array of [name, type]
            }
            rs.close();                      
            
            //second, sort all the string arrays alphabetically :
            Collections.sort(nodeNameV, new Comparator() {
            	public int compare(Object obj1, Object obj2) {
            		return ((String [])obj1)[TNAME].compareTo(((String [])obj2)[TNAME]);
            	}
            });
            //third, create new nodes with the sorted vector:
            for (Iterator iter = nodeNameV.iterator(); iter.hasNext();) {
				String [] element = (String []) iter.next();
				children.addElement(new TableNode(this,element[TNAME],element[TTYPE]));				
			}                        
         }
         catch (SQLException ex) {
            log.writeError("Unable to form node due to: "+ex);
            log.printStackTrace(ex);
         }
         finally {
            // setNormalCursor();
         }
         log.writeDebug ("Database node has "+children.size()+" nodes");
      }
      else {
         log.writeDebug(1, "Null Result set in DatabaseNode.");
      }
   }
      
   public ConnectionInfo getConnectionInfo() {
      return mConnInfo;
   }

   public Enumeration children() {
      return children.elements();
   }
   public boolean getAllowsChildren() {return true;}

   public TreeNode getChildAt(int i) {
      return (TreeNode)children.elementAt(i);
   }
   public int getChildCount() {return children.size();}
   public int getIndex(TreeNode child) {return 0;}
   public TreeNode getParent() {return parent;}
   public boolean isLeaf() {return false;}

   public String toString() {
      return dbName;
   }
}


