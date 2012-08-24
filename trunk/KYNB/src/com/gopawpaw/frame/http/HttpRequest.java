/*
 * ��  ��   ���� HttpRequest.java
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
 * Http�������
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public final class HttpRequest {

	/**
	 * ��ն��к�������
	 */
	public static final int REQUEST_MODE_1 = 1;

	/**
	 * ��������������ǰλ��
	 */
	public static final int REQUEST_MODE_2 = 2;

	/**
	 * ���������������λ��
	 */
	public static final int REQUEST_MODE_3 = 3;

	/**
	 * ���ݱ�����������
	 */
	public static final int REQUEST_TYPE_1 = 1;
	
	/**
	 * �ļ�������������
	 */
	public static final int REQUEST_TYPE_2 = 2;
	
	/**
	 * GET����
	 */
	public static final String REQUEST_METHOD_GET = "GET";
	
	/**
	 * POST����
	 */
	public static final String REQUEST_METHOD_POST = "POST";
	
	/**
	 * Http���������<br>
	 * ������Ӧ��ص���ȡ����
	 */
	private HttpListener httpListener;
	
	/**
	 * �������ӳ�ʱ
	 */
	private int connectTimeout = 30000;
	
	/**
	 * �����ȡ��ʱ
	 */
	private int readTimeout = 60000;
	
	/**
	 * ����ģʽ: <br>
	 * 1����ն��к�������  {@link HttpRequest#REQUEST_MODE_1} <br>
	 * 2����������������ǰλ��  {@link HttpRequest#REQUEST_MODE_2} <br>
	 * 3�����������������λ�� {@link HttpRequest#REQUEST_MODE_3}
	 */
	private int requestMode;

	/**
	 * ��������<br>
	 * 1�������������� {@link HttpRequest#REQUEST_TYPE_1}<br>
	 * 2���ļ��������� {@link HttpRequest#REQUEST_TYPE_2}<br>
	 */
	private int requestType;
	
	/**
	 * ����ʽ:POST / GET <br>
	 * Ĭ����POST
	 */
	private String requestMethod = "POST";
	
	/**
	 * �����url
	 */
	private String url;

	/**
	 * ����Ĳ�������
	 */
	private String paramData;
	
	/**
	 * URL ID
	 */
	private int urlId;
	
	/**
	 * ����ID
	 */
	private int connectionId;

	/**
	 * Ĭ��POST��������ҪGET��������ô�requestMethod�Ĺ��췽��
	 * @param url URL��ַ
	 * @param paramData ����Ĳ���
	 * @param httpListener ������
	 * @param mode ����ģʽ��<br>
	 * 		{@link HttpRequest#REQUEST_MODE_1}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_2}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_3}<br>
	 * @param type �������ͣ�<br>
	 * 		{@link HttpRequest#REQUEST_TYPE_1} <br>
	 * 		{@link HttpRequest#REQUEST_TYPE_2}
	 */
	public HttpRequest(String url,String paramData,HttpListener httpListener,int mode,int type) {
		this.url = url;
		this.paramData = paramData;
		this.httpListener = httpListener;
		this.requestMode = mode;
		this.requestType = type;
	}

	/**
	 * 
	 * POST����Ĺ��췽��
	 * @param url URL��ַ
	 * @param paramData ����Ĳ���
	 * @param httpListener ������
	 * @param mode ����ģʽ��<br>
	 * 		{@link HttpRequest#REQUEST_MODE_1}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_2}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_3}<br>
	 * @param type �������ͣ�<br>
	 * 		{@link HttpRequest#REQUEST_TYPE_1} <br>
	 * 		{@link HttpRequest#REQUEST_TYPE_2} <br>
	 * @param requestMethod ����ʽGET/POST
	 */
	public HttpRequest(String url,String paramData,HttpListener httpListener, int mode,int type, String requestMethod) {

		this.url = url;
		this.paramData = paramData;
		this.httpListener = httpListener;
		this.requestMode = mode;
		this.requestType = type;
		this.requestMethod = requestMethod;
	}

	/**
	 * ��ȡ������
	 * @return
	 */
	public HttpListener getHttpListener() {
		return httpListener;
	}

	/**
	 * ��ȡ����ģʽ
	 * @return
	 */
	public int getRequestMode() {
		return requestMode;
	}

	/**
	 * ��ȡ��������
	 * @return
	 */
	public int getRequestType() {
		return requestType;
	}

	/**
	 * ��ȡURL �ִ�
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * ��ȡ����ʽ��POST / GET
	 * @return
	 */
	public String getRequestMethod() {
		return requestMethod;
	}

	/**
	 * ��ȡ��������
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * @return
	 */
	public String getParamData() {
		return paramData;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public int getUrlId() {
		return urlId;
	}

	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}

	public int getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof HttpRequest){
			HttpRequest hr = (HttpRequest)o;
			this.paramData = (null == paramData) ? "" :this.paramData;
			
			if(this.url.equals(hr.getUrl()) 
					&& paramData.equals((hr.getParamData()==null)?"":hr.getParamData())
					&& connectionId == hr.getConnectionId()
					&& httpListener == hr.httpListener
			){
				//url���������������ID��������һ��������Ϊ��ͬһ������
				return true;
			}
		}
		return super.equals(o);
	}

	
}

