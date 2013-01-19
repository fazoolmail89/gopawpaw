/**
 * 
 */
package com.gopawpaw.dev.common;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * @version 2009-10-28
 * @author �����
 */
public class GppKeyListener implements KeyListener {
	private GppKeyActionListener gppKeyActionListener = null;
	private Object object = null;
	/**
	 * 
	 */
	public GppKeyListener() {
		
	}

	/**
	 * 
	 */
	public GppKeyListener(Object object) {
		this.object = object;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			actionEnter();
		} else if (e.getKeyCode() == 27) {
			actionEscape();
		} else if (e.getKeyCode() == 112) {
			actionF1();
		} else if (e.getKeyCode() == 113) {
			actionF2();
		} else if (e.getKeyCode() == 114) {
			actionF3();
		} else if (e.getKeyCode() == 115) {
			actionF4();
		} else if (e.getKeyCode() == 116) {
			actionF5();
		} else if (e.getKeyCode() == 117) {
			actionF6();
		} else if (e.getKeyCode() == 118) {
			actionF7();
		} else if (e.getKeyCode() == 119) {
			actionF8();
		} else if (e.getKeyCode() == 120) {
			actionF9();
		} else if (e.getKeyCode() == 121) {
			actionF10();
		} else if (e.getKeyCode() == 122) {
			actionF11();
		} else if (e.getKeyCode() == 123) {
			actionF12();
		} else if (e.getKeyCode() == 37) {
			actionLeft();
		} else if (e.getKeyCode() == 38) {
			actionUp();
		} else if (e.getKeyCode() == 39) {
			actionRight();
		} else if (e.getKeyCode() == 40) {
			actionDown();
		} else {
			actionKey(e.getKeyCode());
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

	// public void addGppModuleActionListener(GppModuleActionListener g){
	// this.gppModuleActionListener = g;
	// }

	public void addGppKeyActionListener(GppKeyActionListener g) {
		this.gppKeyActionListener = g;
	}

	/**
	 * ��Ӧ Enter ����
	 * 
	 * @return
	 */
	private boolean actionEnter() {	
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionEnter();
		}

		return true;
	}

	/**
	 * ��Ӧ Escape ����
	 * 
	 * @return
	 */
	private boolean actionEscape() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionEscape();
		}
		return true;
	}

	/**
	 * ��Ӧ F1 ����
	 * 
	 * @return
	 */
	private boolean actionF1() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF1();
		}
		return true;
	}

	/**
	 * ��Ӧ F2 ����
	 * 
	 * @return
	 */
	private boolean actionF2() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF2();
		}
		return true;
	}

	/**
	 * ��Ӧ F3 ����
	 * 
	 * @return
	 */
	private boolean actionF3() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF3();
		}
		return true;
	}

	/**
	 * ��Ӧ F4 ����
	 * 
	 * @return
	 */
	private boolean actionF4() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF4();
		}
		return true;
	}

	/**
	 * ��Ӧ F5 ����
	 * 
	 * @return
	 */
	private boolean actionF5() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF5();
		}
		return true;
	}

	/**
	 * ��Ӧ F6 ����
	 * 
	 * @return
	 */
	private boolean actionF6() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF6();
		}
		return true;
	}

	/**
	 * ��Ӧ F7 ����
	 * 
	 * @return
	 */
	private boolean actionF7() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF7();
		}
		return true;
	}

	/**
	 * ��Ӧ F8 ����
	 * 
	 * @return
	 */
	private boolean actionF8() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF8();
		}
		return true;
	}

	/**
	 * ��Ӧ F9 ����
	 * 
	 * @return
	 */
	private boolean actionF9() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF9();
		}
		return true;
	}

	/**
	 * ��Ӧ F10 ����
	 * 
	 * @return
	 */
	private boolean actionF10() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF10();
		}
		return true;
	}

	/**
	 * ��Ӧ F11 ����
	 * 
	 * @return
	 */
	private boolean actionF11() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF11();
		}
		return true;
	}

	/**
	 * ��Ӧ F12 ����
	 * 
	 * @return
	 */
	private boolean actionF12() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionF12();
		}
		return true;
	}

	/**
	 * ��Ӧ Left ����
	 * 
	 * @return
	 */
	private boolean actionLeft() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionLeft();
		}
		return true;
	}

	/**
	 * ��Ӧ Up ����
	 * 
	 * @return
	 */
	private boolean actionUp() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionUp();
		}
		return true;
	}

	/**
	 * ��Ӧ Right ����
	 * 
	 * @return
	 */
	private boolean actionRight() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionRight();
		}
		return true;
	}

	/**
	 * ��Ӧ Down ����
	 * 
	 * @return
	 */
	private boolean actionDown() {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionDown();
		}
		return true;
	}

	/**
	 * ��Ӧ Down ����
	 * 
	 * @return
	 */
	private boolean actionKey(int keyCode) {
		if (gppKeyActionListener != null) {
			gppKeyActionListener.actionKey(keyCode);
		}
		return true;
	}
	
	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

}
