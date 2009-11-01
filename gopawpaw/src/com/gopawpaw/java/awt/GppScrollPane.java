/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.ScrollPane;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppScrollPane extends ScrollPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7642846075167480215L;

	/**
	 * @throws HeadlessException
	 */
	public GppScrollPane() throws HeadlessException {
	}

	/**
	 * @param scrollbarDisplayPolicy
	 * @throws HeadlessException
	 */
	public GppScrollPane(int scrollbarDisplayPolicy) throws HeadlessException {
		super(scrollbarDisplayPolicy);
	}

}
