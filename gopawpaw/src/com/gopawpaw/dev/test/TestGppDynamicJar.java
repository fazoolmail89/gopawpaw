/**
 * 
 */
package com.gopawpaw.dev.test;

import com.gopawpaw.dev.common.GppDynamicJar;

/**
 * @version 2010-4-15
 * @author Àî½õ»ª
 *
 */
public class TestGppDynamicJar {

	/**
	 * 
	 */
	public TestGppDynamicJar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GppDynamicJar gdj = new GppDynamicJar(GppDynamicJar.LOCAL,"D:\\Eclipse_Workspace\\Capricornus\\program\\rdp2.jar");
		System.out.println(gdj.isExistJarPack());
		System.out.println(gdj.runJar(args));
	}

}
