/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.Scrollbar;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
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
	}

	/**
	 * @param orientation
	 * @throws HeadlessException
	 */
	public GppScrollbar(int orientation) throws HeadlessException {
		super(orientation);
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
	}

}
