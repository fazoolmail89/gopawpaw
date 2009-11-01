/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.BoundedRangeModel;
import javax.swing.JProgressBar;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJProgressBar extends JProgressBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 882418497714773126L;

	/**
	 * 
	 */
	public GppJProgressBar() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJProgressBar(BoundedRangeModel arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJProgressBar(int arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJProgressBar(int arg0, int arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJProgressBar(int arg0) {
		super(arg0);
	}

}
