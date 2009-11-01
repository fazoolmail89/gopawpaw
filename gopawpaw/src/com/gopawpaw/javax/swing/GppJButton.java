/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
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
		initialize();
	}

	/**
	 * @param a
	 */
	public GppJButton(Action a) {
		super(a);
		initialize();
	}

	/**
	 * @param icon
	 */
	public GppJButton(Icon icon) {
		super(icon);
		initialize();
	}

	/**
	 * @param text
	 * @param icon
	 */
	public GppJButton(String text, Icon icon) {
		super(text, icon);
		initialize();
	}

	/**
	 * @param text
	 */
	public GppJButton(String text) {
		super(text);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
