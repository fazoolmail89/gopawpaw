/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppWindow extends Window {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4455631484365001072L;

	/**
	 * @param owner
	 */
	public GppWindow(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 */
	public GppWindow(Window owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 * @param gc
	 */
	public GppWindow(Window owner, GraphicsConfiguration gc) {
		super(owner, gc);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
