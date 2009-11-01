/**
 * 
 */
package com.gopawpaw.dev.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Keybord {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		final JTextField tf = new JTextField();
		tf.setEnabled(false);
		tf.setBackground(Color.white);
		tf.setForeground(Color.green);

		JPanel p = new JPanel(new GridLayout(0, 10, 1, 1));

		for (int i = 0; i <= 25; i++) {
			final JButton btn = new JButton(String.valueOf(String
					.valueOf((char) (i + 65))));

			btn.setFont(new Font("Dialog", 1, 20));
			btn.setOpaque(true);
			p.add(btn);

			btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
					KeyStroke.getKeyStroke((char) (i + 65)), "PressKeyAction");
			btn.getActionMap().put("PressKeyAction", new AbstractAction() {
				public void actionPerformed(ActionEvent e) {
					btn.doClick();
				}
			});
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText(tf.getText() + btn.getText());
					btn.requestFocus();
				}
			});

			btn.addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
					btn.setForeground(Color.red);// 改成换图标
					System.out.println(e.getKeyCode());
				}

				public void keyReleased(KeyEvent e) {
					btn.setForeground(Color.blue);// 改成换图标
				}

				public void keyTyped(KeyEvent e) {
				}
			});
		}

		JFrame f = new JFrame();
		JComponent contentPane = (JComponent) f.getContentPane();
		contentPane.setLayout(new BorderLayout(0, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		f.getContentPane().add(p, BorderLayout.CENTER);
		f.getContentPane().add(tf, BorderLayout.NORTH);
		f.pack();
		f.setTitle("键盘事件");
		f.setBounds(0, 100, 560, 200);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
