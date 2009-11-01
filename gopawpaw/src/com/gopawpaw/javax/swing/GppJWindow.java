/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JWindow;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJWindow extends JWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1607732673102507079L;

	/**
	 * 
	 */
	public GppJWindow() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJWindow(Frame arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJWindow(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJWindow(Window arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJWindow(Window arg0) {
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
