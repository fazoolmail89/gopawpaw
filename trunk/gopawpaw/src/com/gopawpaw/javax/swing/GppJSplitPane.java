/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.Component;

import javax.swing.JSplitPane;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJSplitPane extends JSplitPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7420107371094978689L;

	/**
	 * 
	 */
	public GppJSplitPane() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJSplitPane(int arg0, boolean arg1, Component arg2, Component arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJSplitPane(int arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJSplitPane(int arg0, Component arg1, Component arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJSplitPane(int arg0) {
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
