/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
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
	}

	/**
	 * @param owner
	 */
	public GppWindow(Window owner) {
		super(owner);
	}

	/**
	 * @param owner
	 * @param gc
	 */
	public GppWindow(Window owner, GraphicsConfiguration gc) {
		super(owner, gc);
	}

}
