/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.Scrollbar;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppScrollbar extends Scrollbar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1114763464983785291L;

	/**
	 * @throws HeadlessException
	 */
	public GppScrollbar() throws HeadlessException {
		initialize();
	}

	/**
	 * @param orientation
	 * @throws HeadlessException
	 */
	public GppScrollbar(int orientation) throws HeadlessException {
		super(orientation);
		initialize();
	}

	/**
	 * @param orientation
	 * @param value
	 * @param visible
	 * @param minimum
	 * @param maximum
	 * @throws HeadlessException
	 */
	public GppScrollbar(int orientation, int value, int visible, int minimum,
			int maximum) throws HeadlessException {
		super(orientation, value, visible, minimum, maximum);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
