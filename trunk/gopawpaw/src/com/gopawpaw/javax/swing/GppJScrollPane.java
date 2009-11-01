/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.Component;

import javax.swing.JScrollPane;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJScrollPane extends JScrollPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2576028907726672084L;

	/**
	 * 
	 */
	public GppJScrollPane() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJScrollPane(Component arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 */
	public GppJScrollPane(Component arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJScrollPane(int arg0, int arg1) {
		super(arg0, arg1);
	}

}
