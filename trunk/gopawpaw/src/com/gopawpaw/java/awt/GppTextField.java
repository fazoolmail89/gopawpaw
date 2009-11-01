/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.TextField;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
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
		initialize();
	}

	/**
	 * @param text
	 * @throws HeadlessException
	 */
	public GppTextField(String text) throws HeadlessException {
		super(text);
		initialize();
	}

	/**
	 * @param columns
	 * @throws HeadlessException
	 */
	public GppTextField(int columns) throws HeadlessException {
		super(columns);
		initialize();
	}

	/**
	 * @param text
	 * @param columns
	 * @throws HeadlessException
	 */
	public GppTextField(String text, int columns) throws HeadlessException {
		super(text, columns);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
