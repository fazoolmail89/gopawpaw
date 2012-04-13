package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingConsole {
	private static Dimension d;
	static {
		d = Toolkit.getDefaultToolkit().getScreenSize();
	}

	public static void run(final JFrame f, final int width, final int height) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				f.setTitle(f.getClass().getSimpleName());
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setBounds((d.width - width) / 2, (d.height - height) / 2,
						width, height);
				// f.setSize(width, height);
				f.setVisible(true);
			}
		});
	}

	public static int getTop(int height) {
		return (d.height - height) / 2;
	}

	public static int getLeft(int width) {
		return (d.width - width) / 2;
	}
}
