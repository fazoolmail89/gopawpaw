/**
 * 
 */
package com.gopawpaw.javax.swing;

import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJTextPane extends JTextPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7148477315243891504L;

	/**
	 * 
	 */
	public GppJTextPane() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJTextPane(StyledDocument arg0) {
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
