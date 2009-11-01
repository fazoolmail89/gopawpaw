/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JDesktopPane;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJDesktopPane extends JDesktopPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144846688202476052L;

	/**
	 * 
	 */
	public GppJDesktopPane() {
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
