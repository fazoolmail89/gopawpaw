/*
 * 文  件   名： HttpResponse.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-3-28
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.http;

import java.io.InputStream;


/**
 * Http响应类，每个Http请求都会有一个HttpResponse返回
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public final class HttpResponse {
	
	/**
	 * 响应代码成功
	 */
	public static final int RESPONSE_CODE_SUCCESS = 200;
	
	/**
	 * 响应代码失败
	 */
	public static final int RESPONSE_CODE_FAILED = -1;
	
    /**
     * 请求响应码
     */
    private int responseCode = -1;

    /**
     * 请求响应信息
     */
    private String responseMsg = null;

    /**
     * 响应url
     */
    private String url;

    /**
     * 数据类型
     */
    private String contentType;
    
    /**
     * 数据长度
     */
    private int contentLength;
    
    
    /**
     * 数据流
     */
    private InputStream inputStream;
    
    /**
     * 响应的请求对象
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

