/**
 * 
 */
package com.gopawpaw.frame.utils;

/**
 * @version 2010-10-3
 * @author �����
 * @���� �����Ȩ�ӿ��࣬��Ҫ���ڶ� awt��Swing �������Ȩ�޿��ƣ���Ҫ����ĳһ���󣬱���ʵ�ָ��࣬��������Ȩ���к�
 */
public interface GppComponentAuthorizationControlInterface {
	
	/**
	 * ��ȡ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public String getAuthorizationSerial();
	
	/**
	 * ������Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public void setAuthorizationSerial(String authorizationSerial);
}
