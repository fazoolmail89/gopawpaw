/*
 * ��  ��   ���� HttpListener.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-3-28
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.http;



/**
 * Http���������
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public interface HttpListener {

	
	
	/**
	 * HTTP��Ӧ
	 * @param httpResponse
	 */
    public void httpResponse(HttpResponse httpResponse);

}

