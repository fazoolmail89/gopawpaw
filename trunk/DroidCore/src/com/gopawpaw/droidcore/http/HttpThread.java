/*
 * 文  件   名： HttpThread.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-5-8
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
/*
 * 文  件   名： HttpThread.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-5-8
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * Http请求线程类
 * 
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-5-7]
 */
public class HttpThread extends Thread {

	/**
	 * TAG标签
	 */
	private static final String TAG = HttpThread.class.getSimpleName();

	/**
	 * 当前Http请求对象
	 */
	private HttpRequest httpRequest;

	/**
	 * 当前Http响应对象
	 */
	private HttpResponse httpResponse;

	/**
	 * 线程监听器，用于在线程中获取Http请求
	 */
	private HttpThreadListener mHttpThreadListener;

	/**
	 * URL请求链接对象
	 */
	private HttpURLConnection urlConnection;

	public HttpThread(HttpThreadListener httpThreadListener) {
		this.mHttpThreadListener = httpThreadListener;
	}

	@Override
	public void run() {

		while (true) {

			AppLog.i(TAG, "Thread : " + this.getName() + " run start!! ");

			while ((httpRequest = mHttpThreadListener.getHttpRequest()) != null) {
				// 如果存在请求，则一直执行

				AppLog.d(TAG, "Thread : " + this.getName() + " handle ==> "
						+ httpRequest.getUrl());

				httpResponse = new HttpResponse(httpRequest);

				httpResponse.setUrl(httpRequest.getUrl());

				try {
					httpConnect();
				} catch (Exception e) {
					e.printStackTrace();
					AppLog.e(TAG,
							"httpConnect failed ：url ==> "
									+ httpRequest.getUrl() + " Exception:"
									+ e.toString());

					httpResponse.setResponseMsg("httpConnect failed ："
							+ e.toString());

				} finally {

					httpRequest.getHttpListener().httpResponse(httpResponse);
					mHttpThreadListener.finishHttpRequest(httpRequest);
					
					httpRequest = null;
					httpResponse = null;
					urlConnection = null;
				}


			}
			
			AppLog.i(TAG, "Thread : " + this.getName() + " run end!! ");
			
			mHttpThreadListener.requestWait(this);
		}
	}

	/**
	 * Http链接 [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @throws Exception
	 */
	private void httpConnect() throws Exception {
		// 打开连接
		openConnection();

		// 设置请求头部属性
		setHttpProperty();

		// 处理POST或GET参数
		handleParam();

		AppLog.i(TAG, "before connect");
		urlConnection.connect();
		AppLog.i(TAG, "after connect");

		// 响应头部信息
		handleResponseHead();

		// 获得响应头
		HttpCookie.getResponseCookies(urlConnection);

		// 响应数据信息
		handleResponseData();
	}

	/**
	 * 打开链接
	 * 
	 * @throws IOException
	 */
	private void openConnection() throws IOException {
		String urlString = "";
		if (HttpRequest.REQUEST_METHOD_POST.equals(httpRequest
				.getRequestMethod())) {
			// 处理POST请求操作
			// 拼接URL protocol
			urlString = HttpHelper.initURL(httpRequest.getUrl());
			AppLog.d(TAG,"POST 打开连接：");
		} else {
			// 处理GET请求操作
			// 拼接URL protocol 和 参数
			urlString = HttpHelper.initURL(httpRequest.getUrl(),
					httpRequest.getParamData());
			AppLog.d(TAG,"GET 打开连接：");
		}

		// 做URL转换，转译中文字符
		urlString = HttpHelper.urlEncode(urlString);
		AppLog.d(TAG,urlString);
		URL url = new URL(urlString);

		if (urlString.startsWith("https")) {

			// 使用自己的证书，信任所有服务器证书
			HttpHelper.trustAllHosts();

			urlConnection = (HttpsURLConnection) url.openConnection();
			((HttpsURLConnection)urlConnection).setHostnameVerifier(HttpHelper.DO_NOT_VERIFY);
		} else {

			urlConnection = (HttpURLConnection) url.openConnection();

		}

//		urlConnection.setDoOutput(true);
		urlConnection.setDoInput(true);
	}

	/**
	 * 设置请求头部属性
	 * 
	 * @throws IOException
	 */
	private void setHttpProperty() throws IOException {
		// 设置连接主机超时（单位：毫秒）
		urlConnection.setConnectTimeout(httpRequest.getConnectTimeout());
		// 设置从主机读取数据超时（单位：毫秒）
		urlConnection.setReadTimeout(httpRequest.getReadTimeout());

		String cookie = null;
		Object obj = HttpCookie.getRequestCookies(httpRequest.getUrl());
		if (obj != null)
			cookie = obj.toString();
		urlConnection.setRequestProperty("Cookie", cookie);
		urlConnection.setRequestProperty("connection", "keep-alive");
		urlConnection
				.setRequestProperty(
						"Accept",
						"image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
		urlConnection.setRequestProperty("Accept-Language", "zh-CN");
		urlConnection.setRequestProperty("Charset", "UTF-8");
	}

	/**
	 * 处理POST 或 GET 参数
	 * 
	 * @throws IOException
	 */
	private void handleParam() throws IOException {
		if (HttpRequest.REQUEST_METHOD_POST.equals(httpRequest
				.getRequestMethod())) {
			// 处理POST请求操作
			AppLog.i(TAG, "POST Request");

			urlConnection.setRequestMethod("POST");

			PrintStream send = new PrintStream(urlConnection.getOutputStream());

			send.print(httpRequest.getParamData());

			send.close();
			AppLog.i(TAG, "POST Data ：" + httpRequest.getParamData());
		} else {
			// 处理GET请求操作
			AppLog.i(TAG, "GET Request");
			urlConnection.setRequestMethod("GET");
		}
	}

	/**
	 * 处理响应头部
	 * 
	 * @throws IOException
	 */
	private void handleResponseHead() throws IOException {

		// 获得响应码
		int reponseCode = urlConnection.getResponseCode();
		AppLog.w(TAG, "handleResponseHead reponseCode = "+reponseCode);
		if (reponseCode != 200) {
			// 响应码不是200时关闭连接
			httpResponse.setResponseCode(reponseCode);
			urlConnection.disconnect();
		} else {
			// 成功响应
			httpResponse.setResponseCode(HttpResponse.RESPONSE_CODE_SUCCESS);
			httpResponse.setContentLength(urlConnection.getContentLength());
			httpResponse.setContentType(urlConnection.getContentType());
		}
	}

	/**
	 * 处理响应数据
	 * 
	 * @throws IOException
	 */
	private void handleResponseData() throws IOException {

		InputStream is = urlConnection.getInputStream();
		httpResponse.setInputStream(is);
	}

	public HttpThreadListener getHttpThreadListener() {
		return mHttpThreadListener;
	}
}

/**
 * HttpThread线程监听器，用于获取HttpRequest对象
 * 
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-5-8]
 */
interface HttpThreadListener {
	/**
	 * 获取HttpRequest对象
	 * 
	 * @return
	 */
	public HttpRequest getHttpRequest();

	/**
	 * 完成一个HttpRequest处理
	 * 
	 * @param httpRequest
	 */
	public void finishHttpRequest(HttpRequest httpRequest);
	
	/**
	 * 请求等待
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param httpThread
	 */
	public void requestWait(HttpThread httpThread);
}
