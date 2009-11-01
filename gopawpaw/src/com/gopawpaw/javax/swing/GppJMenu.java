/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.JMenu;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJMenu extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5156172143641481196L;

	/**
	 * 
	 */
	public GppJMenu() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJMenu(Action arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJMenu(String arg0, boolean arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJMenu(String arg0) {
		super(arg0);
	}

}
