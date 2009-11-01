/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.LayoutManager;

import javax.swing.JPanel;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 511448918350127357L;

	/**
	 * 
	 */
	public GppJPanel() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJPanel(boolean arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJPanel(LayoutManager arg0) {
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
