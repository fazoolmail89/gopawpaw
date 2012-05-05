/**
 * 
 */
package com.gopawpaw.frame.utils;

/**
 * @version 2010-1-30
 * @author �����
 */
public interface GppKeyActionListener {

	/**
	 * ��Ӧ Enter ����
	 * @return
	 */
	boolean actionEnter();
	
	/**
	 * ��Ӧ Escape ����
	 * @return
	 */
	boolean actionEscape();
	
	/**
	 * ��Ӧ F1 ����
	 * @return
	 */
	boolean actionF1();
	
	/**
	 * ��Ӧ F2 ����
	 * @return
	 */
	boolean actionF2();
	
	/**
	 * ��Ӧ F3 ����
	 * @return
	 */
	boolean actionF3();
	
	/**
	 * ��Ӧ F4 ����
	 * @return
	 */
	boolean actionF4();
	
	/**
	 * ��Ӧ F5 ����
	 * @return
	 */
	boolean actionF5();
	
	/**
	 * ��Ӧ F6 ����
	 * @return
	 */
	boolean actionF6();
	
	/**
	 * ��Ӧ F7 ����
	 * @return
	 */
	boolean actionF7();
	
	/**
	 * ��Ӧ F8 ����
	 * @return
	 */
	boolean actionF8();
	
	/**
	 * ��Ӧ F9 ����
	 * @return
	 */
	boolean actionF9();

	/**
	 * ��Ӧ F10 ����
	 * @return
	 */
	boolean actionF10();

	/**
	 * ��Ӧ F11 ����
	 * @return
	 */
	boolean actionF11();

	/**
	 * ��Ӧ F12 ����
	 * @return
	 */
	boolean actionF12();

	/**
	 * ��Ӧ  Left ����
	 * @return
	 */
	boolean actionLeft();

	/**
	 * ��Ӧ  Up ����
	 * @return
	 */
	boolean actionUp();

	/**
	 * ��Ӧ Right ����
	 * @return
	 */
	boolean actionRight();

	/**
	 * ��Ӧ Down ����
	 * @return
	 */
	boolean actionDown();
	
	/**
	 * ��Ӧ Down ����
	 * @return
	 */
	boolean actionKey(int keyCode);
}
