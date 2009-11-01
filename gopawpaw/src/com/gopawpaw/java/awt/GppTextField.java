/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.TextField;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppTextField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1409301975921907283L;

	/**
	 * @throws HeadlessException
	 */
	public GppTextField() throws HeadlessException {
	}

	/**
	 * @param text
	 * @throws HeadlessException
	 */
	public GppTextField(String text) throws HeadlessException {
		super(text);
	}

	/**
	 * @param columns
	 * @throws HeadlessException
	 */
	public GppTextField(int columns) throws HeadlessException {
		super(columns);
	}

	/**
	 * @param text
	 * @param columns
	 * @throws HeadlessException
	 */
	public GppTextField(String text, int columns) throws HeadlessException {
		super(text, columns);
	}

}
