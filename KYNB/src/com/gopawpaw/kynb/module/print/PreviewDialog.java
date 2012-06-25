package com.gopawpaw.kynb.module.print;

import java.awt.print.Printable;
import java.io.IOException;

import javax.swing.JDialog;

import com.hg.jpd.Jpd;
import com.hg.jpd.JpdViewer;

public class PreviewDialog extends JDialog {
	private static final long serialVersionUID = 999638911658415689L;
	
	private PrintReviseDialog prd;
	
	public PreviewDialog(PrintReviseDialog mf, Printable pa) {
		this.prd = mf;
		JpdViewer viewer = new JpdViewer();
		Jpd jpd = new Jpd(License.PagerSize_W, License.PagerSize_H);
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
		//DialogUtil.setDialogLocaltion(mainFrame, this);
		setModal(true);
		setVisible(true);
	}
}
