/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Choice;
import java.awt.HeadlessException;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
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
	 * ��ʼ��
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
