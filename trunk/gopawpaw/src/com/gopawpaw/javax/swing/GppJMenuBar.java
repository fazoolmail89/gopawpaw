/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JMenuBar;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5118761913075886217L;

	/**
	 * 
	 */
	public GppJMenuBar() {
		super();
		initialize();
	}

	/**
	 * ��ʼ��
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
