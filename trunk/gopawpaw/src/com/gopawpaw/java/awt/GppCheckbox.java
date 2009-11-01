/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.HeadlessException;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
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
	}

	/**
	 * @param label
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label) throws HeadlessException {
		super(label);
	}

	/**
	 * @param label
	 * @param state
	 * @throws HeadlessException
	 */
	public GppCheckbox(String label, boolean state) throws HeadlessException {
		super(label, state);
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
	}

}
