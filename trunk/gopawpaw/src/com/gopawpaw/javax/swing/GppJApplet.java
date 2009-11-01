/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.HeadlessException;

import javax.swing.JApplet;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4025223273376682858L;

	/**
	 * @throws HeadlessException
	 */
	public GppJApplet() throws HeadlessException {
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
