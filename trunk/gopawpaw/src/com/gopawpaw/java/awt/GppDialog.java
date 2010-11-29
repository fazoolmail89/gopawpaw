/**
 * 
 */
package com.gopawpaw.java.awt;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import com.gopawpaw.dev.common.GppComponentAuthorizationControlInterface;
import com.gopawpaw.dev.common.GppKeyActionListener;
import com.gopawpaw.dev.common.GppKeyListener;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppDialog extends Dialog implements GppKeyActionListener,GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7381380016103655408L;
	/**
	 * ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	private String authorizationSerial = null;
	/**
	 * @param owner
	 */
	public GppDialog(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 */
	public GppDialog(Dialog owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 */
	public GppDialog(Window owner) {
		super(owner);
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public GppDialog(Frame owner, boolean modal) {
		super(owner, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Frame owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Dialog owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppDialog(Window owner, String title) {
		super(owner, title);
		initialize();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public GppDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public GppDialog(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public GppDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public GppDialog(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 * @param gc
	 */
	public GppDialog(Window owner, String title, ModalityType modalityType,
			GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		initialize();
	}

	/**
	 * ��ʼ��
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
	 * ��ȡ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public String getAuthorizationSerial() {
		return authorizationSerial;
	}

	/**
	 * ������Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public void setAuthorizationSerial(String authorizationSerial) {
		this.authorizationSerial = authorizationSerial;
	}
}
