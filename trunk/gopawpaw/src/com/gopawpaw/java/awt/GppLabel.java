/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.Label;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
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
		initialize();
	}

	/**
	 * @param text
	 * @throws HeadlessException
	 */
	public GppLabel(String text) throws HeadlessException {
		super(text);
		initialize();
	}

	/**
	 * @param text
	 * @param alignment
	 * @throws HeadlessException
	 */
	public GppLabel(String text, int alignment) throws HeadlessException {
		super(text, alignment);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
