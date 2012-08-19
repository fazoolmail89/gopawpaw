package com.gopawpaw.kynb.module.print2;

import java.awt.print.Printable;
import java.io.IOException;

import javax.swing.JDialog;

import com.hg.jpd.Jpd;
import com.hg.jpd.JpdViewer;

public class PreviewDialog extends JDialog {
	private static final long serialVersionUID = 999638911658415689L;
	
	public PreviewDialog(Printable pa) {
		JpdViewer viewer = new JpdViewer();
		Jpd jpd = new Jpd(MyPrintable.pagerSize_W, MyPrintable.pagerSize_H);
		jpd.setTitle("��ӡ");
		try {
			jpd.addPage(pa);
			jpd.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		jpd.setViewer(viewer);

		setTitle("��ӡԤ��");
		getContentPane().add(viewer);
		setSize(800, 600);
		//DialogUtil.setDialogLocaltion(mainFrame, this);
		setModal(true);
		setVisible(true);
	}
}