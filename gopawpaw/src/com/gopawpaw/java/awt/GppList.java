/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.HeadlessException;
import java.awt.List;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppList extends List {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4214448369893018609L;

	/**
	 * @throws HeadlessException
	 */
	public GppList() throws HeadlessException {
		initialize();
	}

	/**
	 * @param rows
	 * @throws HeadlessException
	 */
	public GppList(int rows) throws HeadlessException {
		super(rows);
		initialize();
	}

	/**
	 * @param rows
	 * @param multipleMode
	 * @throws HeadlessException
	 */
	public GppList(int rows, boolean multipleMode) throws HeadlessException {
		super(rows, multipleMode);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}

}
