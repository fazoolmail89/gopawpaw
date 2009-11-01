/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.BoundedRangeModel;
import javax.swing.JSlider;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
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
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJSlider(BoundedRangeModel arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJSlider(int arg0, int arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJSlider(int arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJSlider(int arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJSlider(int arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
