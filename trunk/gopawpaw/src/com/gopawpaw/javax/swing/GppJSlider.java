/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.BoundedRangeModel;
import javax.swing.JSlider;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJSlider extends JSlider {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8187099753156356904L;

	/**
	 * 
	 */
	public GppJSlider() {
		super();
	}

	/**
	 * @param arg0
	 */
	public GppJSlider(BoundedRangeModel arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJSlider(int arg0, int arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJSlider(int arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJSlider(int arg0, int arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public GppJSlider(int arg0) {
		super(arg0);
	}

}
