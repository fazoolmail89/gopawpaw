/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.Label;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppLabel extends Label {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5389881107656472307L;

	/**
	 * @throws HeadlessException
	 */
	public GppLabel() throws HeadlessException {
	}

	/**
	 * @param text
	 * @throws HeadlessException
	 */
	public GppLabel(String text) throws HeadlessException {
		super(text);
	}

	/**
	 * @param text
	 * @param alignment
	 * @throws HeadlessException
	 */
	public GppLabel(String text, int alignment) throws HeadlessException {
		super(text, alignment);
	}

}
