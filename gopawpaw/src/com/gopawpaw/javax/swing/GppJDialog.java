/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import javax.swing.JDialog;

import com.gopawpaw.dev.common.GppComponentAuthorizationControlInterface;
import com.gopawpaw.dev.common.GppKeyActionListener;
import com.gopawpaw.dev.common.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJDialog extends JDialog implements GppKeyActionListener,GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1013684663197914838L;
	/**
	 * 授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	private String authorizationSerial = null;
	
	private Frame owner = null;
	/**
	 * 存放自身的引用
	 */
	protected JDialog Gpp_ThisJDialog = null;
	
	/**
	 * 
	 */
	public GppJDialog() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Dialog arg0, boolean arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJDialog(Dialog arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJDialog(Dialog arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Dialog arg0, String arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJDialog(Dialog arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Frame arg0, boolean arg1) {
		super(arg0, arg1);
		this.owner = arg0;
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJDialog(Frame arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		this.owner = arg0;
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJDialog(Frame arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		this.owner = arg0;
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Frame arg0, String arg1) {
		super(arg0, arg1);
		this.owner = arg0;
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJDialog(Frame arg0) {
		super(arg0);
		this.owner = arg0;
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Window arg0, ModalityType arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppJDialog(Window arg0, String arg1, ModalityType arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJDialog(Window arg0, String arg1, ModalityType arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJDialog(Window arg0, String arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJDialog(Window arg0) {
		super(arg0);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		GppKeyListener g = new GppKeyListener(this);
		g.addGppKeyActionListener(this);
		Gpp_ThisJDialog = this;
		
		this.setLocation(this.owner.getX(), this.owner.getY());
		this.addKeyListener(g);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
        	public void windowClosing(java.awt.event.WindowEvent e) {
        		Gpp_ThisJDialog.setVisible(false);
        		Gpp_ThisJDialog.dispose();
        	}
        });
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
}
