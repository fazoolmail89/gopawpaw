/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.ScrollPane;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppScrollPane extends ScrollPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7642846075167480215L;

	/**
	 * @throws HeadlessException
	 */
	public GppScrollPane() throws HeadlessException {
		initialize();
	}

	/**
	 * @param scrollbarDisplayPolicy
	 * @throws HeadlessException
	 */
	public GppScrollPane(int scrollbarDisplayPolicy) throws HeadlessException {
		super(scrollbarDisplayPolicy);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
