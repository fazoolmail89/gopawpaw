/**     
* @{#} MyPrintable.java Create on 2012-8-17 ÉÏÎç1:29:18     
*     
* Copyright (c) 2012 by Â¬Ïòç÷.     
*/   

package com.gopawpaw.kynb.module.print2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.List;

/**     
 * @author Â¬Ïòç÷ luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class MyPrintable implements Printable {
	private List<PrintAtom> printAtoms;
	
	public MyPrintable(List<PrintAtom> printAtoms) {
		this.printAtoms = printAtoms;
	}
	
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex < 1) {
			
			graphics.setColor(Color.BLACK);
			graphics.setFont(new Font("", Font.PLAIN, PrintInit.fontSize));
			
			for(PrintAtom pa : printAtoms) {
				graphics.drawString(pa.getValue(), pa.getX(), pa.getY());	
			}
			
			return Printable.PAGE_EXISTS;
		} else {
			return Printable.NO_SUCH_PAGE;
		}
	}
}
