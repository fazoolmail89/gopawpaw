/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JTextField;
import javax.swing.text.Document;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
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
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJTextField(Document arg0, String arg1, int arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJTextField(int arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTextField(String arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJTextField(String arg0) {
		super(arg0);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
