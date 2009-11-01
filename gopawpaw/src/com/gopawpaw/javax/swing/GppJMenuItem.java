/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenuItem;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJMenuItem extends JMenuItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3309290487053946559L;

	/**
	 * 
	 */
	public GppJMenuItem() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJMenuItem(Action arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public GppJMenuItem(Icon arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJMenuItem(String arg0, Icon arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJMenuItem(String arg0, int arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJMenuItem(String arg0) {
		super(arg0);
	}

}
