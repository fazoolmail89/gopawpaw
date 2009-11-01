/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JTree;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJTree extends JTree {

	/**
	 * 
	 */
	private static final long serialVersionUID = -902269759877541350L;

	/**
	 * 
	 */
	public GppJTree() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJTree(Hashtable<?, ?> arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJTree(Object[] arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJTree(TreeModel arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTree(TreeNode arg0, boolean arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJTree(TreeNode arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJTree(Vector<?> arg0) {
		super(arg0);
	}

}
