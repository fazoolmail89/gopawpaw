/*
 * ��  ��   ���� HttpActionListener.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-4-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
/*
 * ��  ��   ���� HttpActionListener.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-4-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.http.action;
/**
 * @author LiJinHua
 * @date 2012-4-12
 * @version [Android 1.0.0, 2012-4-12]
 * @description
 */
public interface HttpActionListener {

	/**
	 * ״̬�ɹ�
	 */
	public static final int STATE_SUCCESS = 0;
	
	/**
	 * ״̬ʧ��
	 */
	public static final int STATE_FAILED = 1;
	
	/**
	 * ���粻����
	 */
	public static final int STATE_NETWORK_ENABLE= 101;
	
	/**
	 * HTTP����ʧ��
	 */
	public static final int STATE_HTTP_FALSE = 2;
	
	/**
	 * ���ݽ���ʧ��
	 */
	public static final int STATE_PARSE_FALSE = 3;
	
	/**
	 * ��ӦHttp����󷵻ص����ݱ���
	 * @param state ������Ӧ״̬
	 * @param data   ͨ�ý��������Ӧ����
	 * @param urlId	 ����URLID
	 * @param connectionId  �����connectionId������ͬһURL�Ĳ�ͬ��������
	 */
	void onHttpActionResponse(int state, Object data, int urlId, int connectionId);
}

