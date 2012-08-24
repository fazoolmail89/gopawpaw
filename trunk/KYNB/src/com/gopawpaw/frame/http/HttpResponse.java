/*
 * ��  ��   ���� HttpResponse.java
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

import java.io.InputStream;


/**
 * Http��Ӧ�࣬ÿ��Http���󶼻���һ��HttpResponse����
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public final class HttpResponse {
	
	/**
	 * ��Ӧ����ɹ�
	 */
	public static final int RESPONSE_CODE_SUCCESS = 200;
	
	/**
	 * ��Ӧ����ʧ��
	 */
	public static final int RESPONSE_CODE_FAILED = -1;
	
    /**
     * ������Ӧ��
     */
    private int responseCode = -1;

    /**
     * ������Ӧ��Ϣ
     */
    private String responseMsg = null;

    /**
     * ��Ӧurl
     */
    private String url;

    /**
     * ��������
     */
    private String contentType;
    
    /**
     * ���ݳ���
     */
    private int contentLength;
    
    
    /**
     * ������
     */
    private InputStream inputStream;
    
    /**
     * ��Ӧ���������
     */
    private HttpRequest httpRequest;
    
    
	public HttpResponse(HttpRequest httpRequest) {
		super();
		this.httpRequest = httpRequest;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getContentLength() {
		return contentLength;
	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public HttpRequest getHttpRequest() {
		return httpRequest;
	}

	
}

