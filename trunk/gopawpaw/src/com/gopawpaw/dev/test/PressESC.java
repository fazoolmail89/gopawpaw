/**
 * 
 */
package com.gopawpaw.dev.test;

//���¥������Щ.��ʾ����.��ESCʱ�����˳� 

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @version 2009-10-4
 * @author �����
 */

public class PressESC extends JFrame implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String line1 = "", line2 = "";
	private JTextArea text;

	public PressESC() {
		super("Press ESC");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		text = new JTextArea(10, 15);
		new JButton("button");
		text.setText("Press ESC to exit");
		text.setEnabled(false);
		text.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 14));
		getContentPane().add(text);
		addKeyListener(this);
		// getContentPane().add(button);

		setSize(150, 100);
		this.setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		line1 = "���̰���:" + KeyEvent.getKeyText(e.getKeyCode());
		setString(e);
		if (e.getKeyCode() == 27)// 27 means ESC key
			System.exit(0);
		System.out.println("PressESC.keyPressed()");

	}

	public void keyReleased(KeyEvent e) {
		line1 = "�����ͷ�:" + KeyEvent.getKeyText(e.getKeyCode());
		setString(e);
		System.out.println("PressESC.keyReleased()");
	}

	public void keyTyped(KeyEvent e) {
		line2 = "��������:" + e.getKeyChar();
		setString(e);
		System.out.println("PressESC.keyTyped()");
	}

	public void setString(KeyEvent e) {
		text.setText(line1 + "\n" + line2);
	}

	public static void main(String args[]) {
		PressESC app = new PressESC();
		app.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("unused")
			public void Closing(final WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
