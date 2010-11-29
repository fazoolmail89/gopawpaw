/**
 * 
 */
package com.gopawpaw.dev.test;

/**
 * @version 2009-11-7
 * @author Àî½õ»ª
 */
public class LoaderTest {
	public static void main(String[] args) {
		LoadClass(args[0]);
	}

	public static void LoadClass(String clsName) {
		try {
		//	beLoaded bl = (beLoaded) Class.forName(clsName).newInstance();
		//	bl.PrintInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
