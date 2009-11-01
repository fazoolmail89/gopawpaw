/**
 * 
 */
package com.gopawpaw.dev.common;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @version 2009-10-3
 * @author Àî½õ»ª
 */
public class GppBaseFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;

	/**
	 * @throws HeadlessException
	 */
	public GppBaseFrame() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param gc
	 */
	public GppBaseFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GppBaseFrame(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GppBaseFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(811, 303);
		this.setContentPane(getJContentPane());
		this.setTitle("GppBaseFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
