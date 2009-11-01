/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5696174754649150062L;

	/**
	 * @throws HeadlessException
	 */
	public GppFrame() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param gc
	 */
	public GppFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GppFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GppFrame(String title) throws HeadlessException {
		super(title);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
