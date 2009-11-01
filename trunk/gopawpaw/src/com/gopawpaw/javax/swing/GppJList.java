/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.util.Vector;

import javax.swing.JList;
import javax.swing.ListModel;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJList extends JList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4489430214299729220L;

	/**
	 * 
	 */
	public GppJList() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJList(ListModel arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJList(Object[] arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJList(Vector<?> arg0) {
		super(arg0);
	}

}
