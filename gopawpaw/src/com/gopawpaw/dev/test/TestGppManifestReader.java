/**
 * 
 */
package com.gopawpaw.dev.test;

import java.util.Iterator;

import com.gopawpaw.dev.common.GppManifestReader;

/**
 * @version 2010-4-15
 * @author Àî½õ»ª
 *
 */
public class TestGppManifestReader {

	/**
	 * 
	 */
	public TestGppManifestReader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GppManifestReader gmr = new GppManifestReader("\\\\10.8.2.250\\keerqad\\rdp2-2.jar");
		Iterator it = gmr.getAttributeMap().keySet().iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
