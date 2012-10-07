package com.gopawpaw.kynb.module.print2;

import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

public class Printer {
	private PrintRequestAttributeSet attributes;
	private PrinterJob job;
	
	public Printer() {
		job = PrinterJob.getPrinterJob();
		attributes = new HashPrintRequestAttributeSet();
	}

	/**
	 * ��ӡ���ݣ�����ʾ��ӡ�Ի���
	 * @param printable
	 * @return
	 */
	public boolean print(Printable printable) {
		boolean result = false;
		
		Paper paper = new Paper();
		//����ҳ���С
		paper.setSize(PrintInit.pagerSize_W, PrintInit.pagerSize_H);
		//���ñ߾�
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
