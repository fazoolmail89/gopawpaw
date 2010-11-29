/**
 * 
 */
package com.gopawpaw.dev.test;

import java.io.IOException;
import java.util.jar.JarFile;

import com.gopawpaw.dev.common.GppLogAnalyzer;

/**
 * @version 2010-4-15
 * @author Àî½õ»ª
 *
 */
public class TestGppLogAnalyzer {

	/**
	 * 
	 */
	public TestGppLogAnalyzer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GppLogAnalyzer.setLogAbsoluteDir("E:\\log");
		GppLogAnalyzer.setLogFileName("log.log");
		JarFile jarFile = null;
		try {
			jarFile = new JarFile("\\\\10.8.2.250\\keerqad\\rdp2-2.jar");
		} catch (IOException e) {
			System.out.println("============");
			e.printStackTrace();
			GppLogAnalyzer.appendLog("wwwweee",e);
			System.out.println("============");
		}
		
	}

}
