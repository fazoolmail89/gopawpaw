/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JScrollBar;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJScrollBar extends JScrollBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8142287881502447793L;

	/**
	 * 
	 */
	public GppJScrollBar() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 */
	public GppJScrollBar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJScrollBar(int arg0) {
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
