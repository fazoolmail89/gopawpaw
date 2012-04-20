/**
 * 
 */
package com.gopawpaw.frame.javax.swing;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButton;

import com.gopawpaw.frame.dev.common.GppComponentAuthorizationControlInterface;
import com.gopawpaw.frame.dev.common.GppKeyActionListener;
import com.gopawpaw.frame.dev.common.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJRadioButton extends JRadioButton implements GppKeyActionListener,GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4311709869903970956L;
	/**
	 * 授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	private String authorizationSerial = null;
	/**
	 * 
	 */
	public GppJRadioButton() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJRadioButton(Action arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJRadioButton(Icon arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJRadioButton(Icon arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJRadioButton(String arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJRadioButton(String arg0, Icon arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJRadioButton(String arg0, Icon arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJRadioButton(String arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		GppKeyListener g = new GppKeyListener(this);
		g.addGppKeyActionListener(this);
		
		this.addKeyListener(g);
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionDown()
	 */
	@Override
	public boolean actionDown() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionEnter()
	 */
	@Override
	public boolean actionEnter() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionEscape()
	 */
	@Override
	public boolean actionEscape() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF1()
	 */
	@Override
	public boolean actionF1() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF10()
	 */
	@Override
	public boolean actionF10() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF11()
	 */
	@Override
	public boolean actionF11() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF12()
	 */
	@Override
	public boolean actionF12() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF2()
	 */
	@Override
	public boolean actionF2() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF3()
	 */
	@Override
	public boolean actionF3() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF4()
	 */
	@Override
	public boolean actionF4() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF5()
	 */
	@Override
	public boolean actionF5() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF6()
	 */
	@Override
	public boolean actionF6() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF7()
	 */
	@Override
	public boolean actionF7() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF8()
	 */
	@Override
	public boolean actionF8() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF9()
	 */
	@Override
	public boolean actionF9() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionLeft()
	 */
	@Override
	public boolean actionLeft() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionRight()
	 */
	@Override
	public boolean actionRight() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionUp()
	 */
	@Override
	public boolean actionUp() {
		return false;
	}
	public long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 获取授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public String getAuthorizationSerial() {
		return authorizationSerial;
	}

	/**
	 * 设置授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public void setAuthorizationSerial(String authorizationSerial) {
		this.authorizationSerial = authorizationSerial;
	}

	@Override
	public boolean actionKey(int keyCode) {
		// TODO Auto-generated method stub
		return false;
	}
}
