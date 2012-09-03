package com.gopawpaw.kynb.module.print2;

import java.io.File;
import java.io.IOException;

import com.gopawpaw.kynb.common.IniReader;

/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-9-3
 */
public class PrintInit {
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
				pagerSize_W = Integer.parseInt(ir.getValue(PrintInit.PAGER, PrintInit.PAGER_W));
				pagerSize_H = Integer.parseInt(ir.getValue(PrintInit.PAGER, PrintInit.PAGER_H));
				System.out.println(ir.getValue(PrintInit.FONT, PrintInit.FONT_SIZE));
				fontSize = Integer.parseInt(ir.getValue(PrintInit.FONT, PrintInit.FONT_SIZE));
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
}
