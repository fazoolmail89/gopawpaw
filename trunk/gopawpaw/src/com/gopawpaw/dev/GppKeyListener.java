/**
 * 
 */
package com.gopawpaw.dev;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JList;
/**
 * @version 2009-10-28
 * @author Àî½õ»ª
 */
public class GppKeyListener implements KeyListener {
	private Object	object = null;
	private GppModuleActionListener gppModuleActionListener = null;
	
	/**
	 * 
	 */
	public GppKeyListener(Object o) {
		this.object = o;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			String tem = (String) ((javax.swing.JList)(this.object)).getSelectedValue();
			if(tem == null) return;
			gppModuleActionListener.actionGppModule(tem);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void addGppModuleActionListener(GppModuleActionListener g){
		this.gppModuleActionListener = g;
	}
}
