package com.gopawpaw.kynb.common;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class DialogUtil {
	public static void setDialogLocaltion(JFrame owner, JDialog dialog) {
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		left = (left > 0) ? left : 0;
		top = (top > 0) ? top : 0;
		dialog.setLocation(left, top);
	}
	
	public static void setDialogLocaltion(JInternalFrame owner, JDialog dialog) {
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		left = (left > 0) ? left : 0;
		top = (top > 0) ? top : 0;
		dialog.setLocation(left, top);
	}
	
	public static void setDialogLocaltion(JDialog dialog) {
		java.awt.Dimension scrSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		int left = (int) ((scrSize.getWidth() - dialog.getWidth()) / 2) ;
		int top = (int) ((scrSize.getHeight() - dialog.getHeight()) / 2);
		left = (left > 0) ? left : 0;
		top = (top > 0) ? top : 0;
		dialog.setLocation(left, top);
	}
	
	public static void setDialogXMid(JDialog dialog) {
		java.awt.Dimension scrSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		int left = (int) ((scrSize.getWidth() - dialog.getWidth()) / 2) ;
		left = (left > 0) ? left : 0;
		dialog.setLocation(left, 0);
	}	
}
