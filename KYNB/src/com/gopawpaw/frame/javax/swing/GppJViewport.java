/**
 * 
 */
package com.gopawpaw.frame.javax.swing;

import javax.swing.JViewport;

import com.gopawpaw.frame.dev.common.GppComponentAuthorizationControlInterface;

/**
 * @version 2010-10-3
 * @author 李锦华
 *
 */
public class GppJViewport extends JViewport implements GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3346620035902522142L;
	
	/**
	 * 授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	private String authorizationSerial = null;

	/**
	 * 
	 */
	public GppJViewport() {
		// TODO Auto-generated constructor stub
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
