/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6203924259463659713L;

	/**
	 * 
	 */
	public GppJButton() {
		super();
	}

	/**
	 * @param a
	 */
	public GppJButton(Action a) {
		super(a);
	}

	/**
	 * @param icon
	 */
	public GppJButton(Icon icon) {
		super(icon);
	}

	/**
	 * @param text
	 * @param icon
	 */
	public GppJButton(String text, Icon icon) {
		super(text, icon);
	}

	/**
	 * @param text
	 */
	public GppJButton(String text) {
		super(text);
	}

}
