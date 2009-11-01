/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJComboBox extends JComboBox {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3525238234030186930L;

	/**
	 * 
	 */
	public GppJComboBox() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJComboBox(ComboBoxModel arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJComboBox(Object[] arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJComboBox(Vector<?> arg0) {
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
