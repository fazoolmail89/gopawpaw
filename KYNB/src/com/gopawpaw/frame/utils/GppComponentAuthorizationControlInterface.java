/**
 * 
 */
package com.gopawpaw.frame.utils;

/**
 * @version 2010-10-3
 * @author 李锦华
 * @描述 组件授权接口类，主要用于对 awt、Swing 对象进行权限控制，需要控制某一对象，必须实现该类，并设置授权序列号
 */
public interface GppComponentAuthorizationControlInterface {
	
	/**
	 * 获取授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public String getAuthorizationSerial();
	
	/**
	 * 设置授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public void setAuthorizationSerial(String authorizationSerial);
}
