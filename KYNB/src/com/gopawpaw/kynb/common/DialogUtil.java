package com.gopawpaw.kynb.common;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class DialogUtil {
	public static void setDialogLocaltion(JFrame owner, JDialog dialog) {
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}
	
	public static void setDialogLocaltion(JInternalFrame owner, JDialog dialog) {
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}
}
