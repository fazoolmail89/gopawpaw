/**
 * 
 */
package com.gopawpaw.frame.javax.swing;

import javax.swing.JViewport;

import com.gopawpaw.frame.dev.common.GppComponentAuthorizationControlInterface;

/**
 * @version 2010-10-3
 * @author �����
 *
 */
public class GppJViewport extends JViewport implements GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3346620035902522142L;
	
	/**
	 * ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	private String authorizationSerial = null;

	/**
	 * 
	 */
	public GppJViewport() {
		// TODO Auto-generated constructor stub
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
