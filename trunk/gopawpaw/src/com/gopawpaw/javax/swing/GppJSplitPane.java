/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.Component;

import javax.swing.JSplitPane;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJSplitPane extends JSplitPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7420107371094978689L;

	/**
	 * 
	 */
	public GppJSplitPane() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJSplitPane(int arg0, boolean arg1, Component arg2, Component arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJSplitPane(int arg0, boolean arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJSplitPane(int arg0, Component arg1, Component arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 */
	public GppJSplitPane(int arg0) {
		super(arg0);
	}

}
