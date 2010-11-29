/**
 * 
 */
package com.gopawpaw.dev.test;

import com.gopawpaw.javax.swing.GppJDialog;
import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.gopawpaw.javax.swing.GppJButton;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppTest extends GppJFrame {
	
	GppJFrame thisGppJFrame = null;

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
        thisGppJFrame = this;
			
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private GppJButton getJButton() {
		if (jButton == null) {
			jButton = new GppJButton("sdfsd");
			jButton.addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent arg0) {
					GppJDialog gppj = new GppJDialog(thisGppJFrame,true);
					gppj.setVisible(true);
					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
				}
				
			});
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
