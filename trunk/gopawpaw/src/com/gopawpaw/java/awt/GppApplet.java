/**
 * 
 */
package com.gopawpaw.java.awt;

import java.applet.Applet;
import java.awt.HeadlessException;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3596538472321988620L;

	/**
	 * @throws HeadlessException
	 */
	public GppApplet() throws HeadlessException {
		super();
		initialize();
		
	}

	/**
	 * ��ʼ��
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
