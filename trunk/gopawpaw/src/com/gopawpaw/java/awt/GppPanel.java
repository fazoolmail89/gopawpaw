/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.LayoutManager;
import java.awt.Panel;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -624324163875239871L;

	/**
	 * 
	 */
	public GppPanel() {
		initialize();
	}

	/**
	 * @param layout
	 */
	public GppPanel(LayoutManager layout) {
		super(layout);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
