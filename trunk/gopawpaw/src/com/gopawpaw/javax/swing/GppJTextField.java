/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJTextField extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4946014021656996915L;

	/**
	 * 
	 */
	public GppJTextField() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJTextField(Document arg0, String arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 */
	public GppJTextField(int arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTextField(String arg0, int arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJTextField(String arg0) {
		super(arg0);
	}

}
