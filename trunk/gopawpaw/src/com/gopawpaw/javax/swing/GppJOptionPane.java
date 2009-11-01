/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJOptionPane extends JOptionPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2193723391369198263L;

	/**
	 * 
	 */
	public GppJOptionPane() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 */
	public GppJOptionPane(Object arg0, int arg1, int arg2, Icon arg3,
			Object[] arg4, Object arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 */
	public GppJOptionPane(Object arg0, int arg1, int arg2, Icon arg3,
			Object[] arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJOptionPane(Object arg0, int arg1, int arg2, Icon arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJOptionPane(Object arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJOptionPane(Object arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJOptionPane(Object arg0) {
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
