/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1015371227461656348L;

	/**
	 * @throws HeadlessException
	 */
	public GppJFrame() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param gc
	 */
	public GppJFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GppJFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GppJFrame(String title) throws HeadlessException {
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
