/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Icon;
import javax.swing.JLabel;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -166965689874760959L;

	/**
	 * 
	 */
	public GppJLabel() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJLabel(Icon arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJLabel(Icon arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJLabel(String arg0, Icon arg1, int arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJLabel(String arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJLabel(String arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
