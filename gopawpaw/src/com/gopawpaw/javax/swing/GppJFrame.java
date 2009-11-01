/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
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
	}

	/**
	 * @param gc
	 */
	public GppJFrame(GraphicsConfiguration gc) {
		super(gc);
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GppJFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GppJFrame(String title) throws HeadlessException {
		super(title);
	}

}
