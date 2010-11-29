/**
 * 
 */
package com.gopawpaw.erp.test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class TestJFrame extends JFrame {

	private static final long serialVersionUID = -4841716147565556778L;

	public TestJFrame() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "是否完全退出该系统？",
						"系统提示", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if (option == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		this.setVisible(true);
	}

	public static void main(String args[]) {
		new TestJFrame();
	}
}
