/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
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
	}

	/**
	 * @param owner
	 */
	public GppDialog(Dialog owner) {
		super(owner);
	}

	/**
	 * @param owner
	 */
	public GppDialog(Window owner) {
		super(owner);
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public GppDialog(Frame owner, boolean modal) {
		super(owner, modal);
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Frame owner, String title) {
		super(owner, title);
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Dialog owner, String title) {
		super(owner, title);
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Window owner, String title) {
		super(owner, title);
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public GppDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public GppDialog(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
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
	}

}
