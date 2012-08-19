package com.gopawpaw.kynb.module.print2;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

public class Prenter {
	private PrintRequestAttributeSet attributes;
	private PrinterJob job;
	
	public Prenter() {
		job = PrinterJob.getPrinterJob();		
	}

	/**
	 * 打印数据，不显示打印对话框
	 * @param printable
	 * @return
	 */
	public boolean print(Printable printable) {
		boolean result = false;
		attributes = new HashPrintRequestAttributeSet();
		try {
			job.setPrintable(printable);
			job.print(attributes);
			result = true;
		} catch (PrinterException e) {
			//JOptionPane.showMessageDialog(PrintTestFrame.this, e);
		}
		return result;
	}
}
