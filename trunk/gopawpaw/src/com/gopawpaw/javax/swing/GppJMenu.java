/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.JMenu;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJMenu extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5156172143641481196L;

	/**
	 * 
	 */
	public GppJMenu() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJMenu(Action arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJMenu(String arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJMenu(String arg0) {
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
