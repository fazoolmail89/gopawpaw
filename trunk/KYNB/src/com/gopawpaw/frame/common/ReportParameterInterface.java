/**
 * 
 */
package com.gopawpaw.frame.common;

import java.util.HashMap;

/**
 * @version 2010-4-23
 * @author �����
 * @ ��������ӿ�
 */
public interface ReportParameterInterface {
	
	/**
	 * ��ȡ�û�����Ŀ¼����δָ����Ŀ¼����Ĭ���ڱ�������Ŀ¼
	 */
	public String getUserReportDir();
	
	/**
	 * ��ȡ��������
	 */
	public String getReportName();
	
	/**
	 * ��ȡ�������ӳ���
	 */
	public HashMap<String, String> getReportParameterMap();

}
