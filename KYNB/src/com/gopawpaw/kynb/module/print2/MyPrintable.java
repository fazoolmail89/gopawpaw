/**     
* @{#} MyPrintable.java Create on 2012-8-17 上午1:29:18     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.gopawpaw.kynb.common.IniReader;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class MyPrintable implements Printable {
	public static final String PAGER = "pager";
	public static final String PAGER_W = "w";
	public static final String PAGER_H = "h";
	
	public static final String FONT = "font";
	public static final String FONT_SIZE = "size";
	/**
	 * 默认打印页面宽度
	 */
	public static int pagerSize_W = 300; 
	
	/**
	 * 默认打印界面长度
	 */
	public static int pagerSize_H = 400;
	
	/**
	 * 打印字体默认大小
	 */
	public static int fontSize = 8;
	
	private List<PrintAtom> printAtoms;
	
	public MyPrintable(List<PrintAtom> printAtoms) {
		this.printAtoms = printAtoms;
	}
	
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex < 1) {
			graphics.setColor(Color.BLACK);
			graphics.setFont(new Font("", Font.PLAIN, fontSize));
			
			for(PrintAtom pa : printAtoms) {
				graphics.drawString(pa.getValue(), pa.getX(), pa.getY());	
			}
			
			return Printable.PAGE_EXISTS;
		} else {
			return Printable.NO_SUCH_PAGE;
		}
	}
	
	/**
	 * 读取打印配置文件
	 */
	public static void readInitFile() {
		String path = System.getProperty("user.dir");
		path = path + "\\print.ini";
		File iniFile = new File(path);   
		if(iniFile.exists()) {
			try {
				IniReader ir = new IniReader(iniFile.getPath());
				pagerSize_W = Integer.parseInt(ir.getValue(MyPrintable.PAGER, MyPrintable.PAGER_W));
				pagerSize_H = Integer.parseInt(ir.getValue(MyPrintable.PAGER, MyPrintable.PAGER_H));
				System.out.println(ir.getValue(MyPrintable.FONT, MyPrintable.FONT_SIZE));
				fontSize = Integer.parseInt(ir.getValue(MyPrintable.FONT, MyPrintable.FONT_SIZE));
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
}
