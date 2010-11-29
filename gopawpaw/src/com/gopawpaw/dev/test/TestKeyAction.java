/**
 * 
 */
package com.gopawpaw.dev.test;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.gopawpaw.javax.swing.GppJFrame;
import com.gopawpaw.javax.swing.GppJTextField;
import java.awt.Button;

/**
 * @version 2010-1-30
 * @author 李锦华
 */
public class TestKeyAction extends GppJFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextField jTextField = null;
	private Button button = null;

	/**
	 * @throws HeadlessException
	 */
	public TestKeyAction() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public TestKeyAction(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public TestKeyAction(String arg0) throws HeadlessException {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public TestKeyAction(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new GppJTextField(){
				public boolean actionEscape() {
					
					Gpp_ThisJFrame.dispose();
					return false;
				}
				
				public boolean actionEnter() {
					System.out
							.println("TestKeyAction.getJTextField().新建 GppJTextField() {...}.actionEnter()");
					return false;
				}
			};
		}
		return jTextField;
	}

	/**
	 * This method initializes button	
	 * 	
	 * @return java.awt.Button	
	 */
	private Button getButton() {
		if (button == null) {
			button = new Button();
		}
		return button;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TestKeyAction thisClass = new TestKeyAction();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		
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
			jContentPane.add(getJTextField(), BorderLayout.NORTH);
			jContentPane.add(getButton(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

}
