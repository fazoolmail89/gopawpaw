/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JToggleButton;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJToggleButton extends JToggleButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7772466489290314818L;

	/**
	 * 
	 */
	public GppJToggleButton() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJToggleButton(Action arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJToggleButton(Icon arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJToggleButton(Icon arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJToggleButton(String arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJToggleButton(String arg0, Icon arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJToggleButton(String arg0, Icon arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJToggleButton(String arg0) {
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
