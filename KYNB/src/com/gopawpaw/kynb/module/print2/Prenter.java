package com.gopawpaw.kynb.module.print2;

import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
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
		
		Paper paper = new Paper();
		//paper.setSize(354, 510);
		//paper.setImageableArea(0, 0, 354.0, 510.0);
		paper.setSize(PrintInit.pagerSize_W, PrintInit.pagerSize_H);
		paper.setImageableArea(0, 0, PrintInit.pagerSize_W, PrintInit.pagerSize_H);
		PageFormat pageFormat = new PageFormat();
		pageFormat.setOrientation(PageFormat.PORTRAIT);
		pageFormat.setPaper(paper);		
		
	    Book book = new Book();
	    book.append(printable, pageFormat);
		   
		try {
			job.setPageable(book);
			job.print(attributes);
			result = true;
		} catch (PrinterException e) {
			//JOptionPane.showMessageDialog(PrintTestFrame.this, e);
		}
		return result;
	}
}
