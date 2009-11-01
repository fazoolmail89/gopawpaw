/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJCheckBoxMenuItem extends JCheckBoxMenuItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5008900213757781786L;

	/**
	 * 
	 */
	public GppJCheckBoxMenuItem() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJCheckBoxMenuItem(Action arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJCheckBoxMenuItem(Icon arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJCheckBoxMenuItem(String arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJCheckBoxMenuItem(String arg0, Icon arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJCheckBoxMenuItem(String arg0, Icon arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJCheckBoxMenuItem(String arg0) {
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
