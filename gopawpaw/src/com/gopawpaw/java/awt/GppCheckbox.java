/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.HeadlessException;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppCheckbox extends Checkbox {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4671751611451245545L;

	/**
	 * @throws HeadlessException
	 */
	public GppCheckbox() throws HeadlessException {
		initialize();
	}

	/**
	 * @param label
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label) throws HeadlessException {
		super(label);
		initialize();
	}

	/**
	 * @param label
	 * @param state
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label, boolean state) throws HeadlessException {
		super(label, state);
		initialize();
	}

	/**
	 * @param label
	 * @param state
	 * @param group
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label, boolean state, CheckboxGroup group)
			throws HeadlessException {
		super(label, state, group);
		initialize();
	}

	/**
	 * @param label
	 * @param group
	 * @param state
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label, CheckboxGroup group, boolean state)
			throws HeadlessException {
		super(label, group, state);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
