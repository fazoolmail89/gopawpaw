/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JTextArea;
import javax.swing.text.Document;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJTextArea extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = -610900447426052207L;

	/**
	 * 
	 */
	public GppJTextArea() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJTextArea(Document arg0, String arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 */
	public GppJTextArea(Document arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTextArea(int arg0, int arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJTextArea(String arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 */
	public GppJTextArea(String arg0) {
		super(arg0);
	}

}
