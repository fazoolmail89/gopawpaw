/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Choice;
import java.awt.HeadlessException;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppChoice extends Choice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4836021594971421625L;

	/**
	 * @throws HeadlessException
	 */
	public GppChoice() throws HeadlessException {
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
