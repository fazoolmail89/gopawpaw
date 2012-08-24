/*
 * 文  件   名： HttpRequest.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-3-28
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.frame.http;



/**
 * Http请求对象
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public final class HttpRequest {

	/**
	 * 清空队列后再请求
	 */
	public static final int REQUEST_MODE_1 = 1;

	/**
	 * 将请求插入队列最前位置
	 */
	public static final int REQUEST_MODE_2 = 2;

	/**
	 * 将请求插入队列最后位置
	 */
	public static final int REQUEST_MODE_3 = 3;

	/**
	 * 数据报文请求类型
	 */
	public static final int REQUEST_TYPE_1 = 1;
	
	/**
	 * 文件下载请求类型
	 */
	public static final int REQUEST_TYPE_2 = 2;
	
	/**
	 * GET请求
	 */
	public static final String REQUEST_METHOD_GET = "GET";
	
	/**
	 * POST请求
	 */
	public static final String REQUEST_METHOD_POST = "POST";
	
	/**
	 * Http请求监听器<br>
	 * 用于响应后回调获取数据
	 */
	private HttpListener httpListener;
	
	/**
	 * 请求链接超时
	 */
	private int connectTimeout = 30000;
	
	/**
	 * 请求读取超时
	 */
	private int readTimeout = 60000;
	
	/**
	 * 请求模式: <br>
	 * 1：清空队列后再请求  {@link HttpRequest#REQUEST_MODE_1} <br>
	 * 2：将请求插入队列最前位置  {@link HttpRequest#REQUEST_MODE_2} <br>
	 * 3：将请求插入队列最后位置 {@link HttpRequest#REQUEST_MODE_3}
	 */
	private int requestMode;

	/**
	 * 请求类型<br>
	 * 1：数据请求类型 {@link HttpRequest#REQUEST_TYPE_1}<br>
	 * 2：文件请求类型 {@link HttpRequest#REQUEST_TYPE_2}<br>
	 */
	private int requestType;
	
	/**
	 * 请求方式:POST / GET <br>
	 * 默认是POST
	 */
	private String requestMethod = "POST";
	
	/**
	 * 请求的url
	 */
	private String url;

	/**
	 * 请求的参数数据
	 */
	private String paramData;
	
	/**
	 * URL ID
	 */
	private int urlId;
	
	/**
	 * 链接ID
	 */
	private int connectionId;

	/**
	 * 默认POST请求，若需要GET请求，则调用带requestMethod的构造方法
	 * @param url URL地址
	 * @param paramData 请求的参数
	 * @param httpListener 监听器
	 * @param mode 请求模式：<br>
	 * 		{@link HttpRequest#REQUEST_MODE_1}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_2}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_3}<br>
	 * @param type 请求类型：<br>
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
	 * POST请求的构造方法
	 * @param url URL地址
	 * @param paramData 请求的参数
	 * @param httpListener 监听器
	 * @param mode 请求模式：<br>
	 * 		{@link HttpRequest#REQUEST_MODE_1}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_2}<br>
	 * 		{@link HttpRequest#REQUEST_MODE_3}<br>
	 * @param type 请求类型：<br>
	 * 		{@link HttpRequest#REQUEST_TYPE_1} <br>
	 * 		{@link HttpRequest#REQUEST_TYPE_2} <br>
	 * @param requestMethod 请求方式GET/POST
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
	 * 获取监听器
	 * @return
	 */
	public HttpListener getHttpListener() {
		return httpListener;
	}

	/**
	 * 获取请求模式
	 * @return
	 */
	public int getRequestMode() {
		return requestMode;
	}

	/**
	 * 获取请求类型
	 * @return
	 */
	public int getRequestType() {
		return requestType;
	}

	/**
	 * 获取URL 字串
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 获取请求方式：POST / GET
	 * @return
	 */
	public String getRequestMethod() {
		return requestMethod;
	}

	/**
	 * 获取参数数据
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
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
				//url、请求参数、连接ID，监听器一样，则认为是同一个请求
				return true;
			}
		}
		return super.equals(o);
	}

	
}

