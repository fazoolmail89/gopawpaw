/**
 * 
 */
package com.gopawpaw.dev.test;

import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;
import com.gopawpaw.javax.swing.GppJButton;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppTest extends GppJFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534789022218106876L;
	private GppJButton jButton = null;

	/**
	 * 
	 */
	public GppTest() {
		initialize();
	}
		

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        this.setSize(new Dimension(206, 69));
        this.setContentPane(getJButton());
			
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private GppJButton getJButton() {
		if (jButton == null) {
			jButton = new GppJButton("sdfsd");
		}
		return jButton;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GppTest gppt= new GppTest();
		gppt.setVisible(true);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
