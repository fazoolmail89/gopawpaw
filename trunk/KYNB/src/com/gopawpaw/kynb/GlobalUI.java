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

			// UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
			UIManager.setLookAndFeel(
			// UIManager.getCrossPlatformLookAndFeelClassName()
			// UIManager.getSystemLookAndFeelClassName()
			// new com.sun.java.swing.plaf.motif.MotifLookAndFeel()
			// "com.jgoodies.looks.windows.WindowsLookAndFeel"
			// "com.jgoodies.looks.plastic.PlasticLookAndFeel"
					"com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
					// "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"

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
