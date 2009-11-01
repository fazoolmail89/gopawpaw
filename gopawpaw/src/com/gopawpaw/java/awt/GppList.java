/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.List;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppList extends List {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4214448369893018609L;

	/**
	 * @throws HeadlessException
	 */
	public GppList() throws HeadlessException {
	}

	/**
	 * @param rows
	 * @throws HeadlessException
	 */
	public GppList(int rows) throws HeadlessException {
		super(rows);
	}

	/**
	 * @param rows
	 * @param multipleMode
	 * @throws HeadlessException
	 */
	public GppList(int rows, boolean multipleMode) throws HeadlessException {
		super(rows, multipleMode);
	}

}
