/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.util.Vector;

import javax.swing.JList;
import javax.swing.ListModel;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJList extends JList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4489430214299729220L;

	/**
	 * 
	 */
	public GppJList() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJList(ListModel arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJList(Object[] arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJList(Vector<?> arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * ��ʼ��
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
