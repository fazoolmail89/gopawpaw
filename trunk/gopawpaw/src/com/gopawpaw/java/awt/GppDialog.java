/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppDialog extends Dialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7381380016103655408L;

	/**
	 * @param owner
	 */
	public GppDialog(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 */
	public GppDialog(Dialog owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 */
	public GppDialog(Window owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public GppDialog(Frame owner, boolean modal) {
		super(owner, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Frame owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Dialog owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Window owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public GppDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public GppDialog(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public GppDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public GppDialog(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 * @param gc
	 */
	public GppDialog(Window owner, String title, ModalityType modalityType,
			GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
