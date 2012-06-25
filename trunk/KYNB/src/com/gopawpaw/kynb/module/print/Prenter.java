package com.gopawpaw.kynb.module.print;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;

public class Prenter {
	private PrintRequestAttributeSet pras;
	private PrinterJob job;
	
	public Prenter() {
		job = PrinterJob.getPrinterJob();		
	}

	public boolean print(Printable pt) {
		boolean rs = false;
		pras = new HashPrintRequestAttributeSet();
		
		pras.add(OrientationRequested.PORTRAIT);// 设置成竖打
		// 设定打印区域大小
		MediaPrintableArea mp = new MediaPrintableArea(0.0f, 0.0f, License.PagerSize_W, License.PagerSize_H,
		 Size2DSyntax.MM);// 5f, 5f, 100f, 40f
		 pras.add(mp);
		 // 设定纸张大小
		// MediaSizeExp 为重写MediaSize代码
		//MediaSize ms = new MediaSize(License.PagerSize_W, License.PagerSize_H, Size2DSyntax.MM,
		//MediaSizeName.INVOICE);// 100, 110f//MediaSizeName.INVOICE 发票
		//pras.add(ms.getMediaSizeName());
		//pras.add(OrientationRequested.PORTRAIT);
		try {
			job.setPrintable(pt);
			//if (job.printDialog(pras))
				job.print(pras);
				rs = job.isCancelled();
				System.out.println("------------------");
				System.out.println(rs);
				System.out.println("------------------");
		} catch (PrinterException e) {
			//JOptionPane.showMessageDialog(PrintTestFrame.this, e);
		}
		return rs;
	}
	
	public void printSetup() {
		job.pageDialog(pras);
	}
}
