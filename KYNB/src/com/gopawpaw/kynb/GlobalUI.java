/**
 * 
 */
package com.gopawpaw.kynb;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @version 2012-3-26
 * @author Jason
 */
public class GlobalUI {

	
	public static void initUI(){
		try {

			UIManager.setLookAndFeel(
			"com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
			);

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
