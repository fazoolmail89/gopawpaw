package com.gopawpaw.kynb.module.print;

import java.awt.print.Printable;
import java.io.IOException;

import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;
import com.hg.jpd.Jpd;
import com.hg.jpd.JpdViewer;

public class PreviewDialog extends JDialog {
	private static final long serialVersionUID = 999638911658415689L;
	
	private PrintFrame mainFrame;
	
	public PreviewDialog(PrintFrame mf, Printable pa) {
		this.mainFrame = mf;
		JpdViewer viewer = new JpdViewer();
		Jpd jpd = new Jpd(License.PAGER_SIZE_W, License.PAGER_SIZE_H);
		jpd.setTitle("¥Ú”°");
		try {
			jpd.addPage(pa);
			jpd.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		jpd.setViewer(viewer);

		setTitle("¥Ú”°‘§¿¿");
		getContentPane().add(viewer);
		setSize(800, 600);
		DialogUtil.setDialogLocaltion(mainFrame, this);
		setModal(true);
		setVisible(true);
	}
}
