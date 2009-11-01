/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JTabbedPane;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJTabbedPane extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5474661687457550241L;

	/**
	 * 
	 */
	public GppJTabbedPane() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTabbedPane(int arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJTabbedPane(int arg0) {
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
