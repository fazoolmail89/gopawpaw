/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JPopupMenu;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJPopupMenu extends JPopupMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6237818280118914821L;

	/**
	 * 
	 */
	public GppJPopupMenu() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJPopupMenu(String arg0) {
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
