/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JToolBar;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJToolBar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3268351632050764678L;

	/**
	 * 
	 */
	public GppJToolBar() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJToolBar(int arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJToolBar(String arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJToolBar(String arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * ��ʼ��
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
