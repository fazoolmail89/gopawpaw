/*
 * ��  ��   ���� HttpThread.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-5-8
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
/*
 * ��  ��   ���� HttpThread.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-5-8
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.gopawpaw.frame.log.APPLog;


/**
 * Http�����߳���
 * 
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-5-7]
 */
public class HttpThread extends Thread {

	/**
	 * TAG��ǩ
	 */
	private static final String TAG = HttpThread.class.getSimpleName();

	/**
	 * ��ǰHttp�������
	 */
	private HttpRequest httpRequest;

	/**
	 * ��ǰHttp��Ӧ����
	 */
	private HttpResponse httpResponse;

	/**
	 * �̼߳��������������߳��л�ȡHttp����
	 */
	private HttpThreadListener mHttpThreadListener;

	/**
	 * URL�������Ӷ���
	 */
	private HttpURLConnection urlConnection;

	public HttpThread(HttpThreadListener httpThreadListener) {
		this.mHttpThreadListener = httpThreadListener;
	}

	@Override
	public void run() {

		while (true) {

			APPLog.i(TAG, "Thread : " + this.getName() + " run start!! ");

			while ((httpRequest = mHttpThreadListener.getHttpRequest()) != null) {
				// �������������һֱִ��

				APPLog.d(TAG, "Thread : " + this.getName() + " handle ==> "
						+ httpRequest.getUrl());

				httpResponse = new HttpResponse(httpRequest);

				httpResponse.setUrl(httpRequest.getUrl());

				try {
					httpConnect();
				} catch (Exception e) {
					e.printStackTrace();
					APPLog.e(TAG,
							"httpConnect failed ��url ==> "
									+ httpRequest.getUrl() + " Exception:"
									+ e.toString());

					httpResponse.setResponseMsg("httpConnect failed ��"
							+ e.toString());

				} finally {

					httpRequest.getHttpListener().httpResponse(httpResponse);
				}

				mHttpThreadListener.finishHttpRequest(httpRequest);

				httpRequest = null;
				httpResponse = null;
				urlConnection = null;

			}
			
			APPLog.i(TAG, "Thread : " + this.getName() + " run end!! ");
			
			mHttpThreadListener.requestWait(this);
		}
	}

	/**
	 * Http���� [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @throws Exception
	 */
	private void httpConnect() throws Exception {
		// ������
		openConnection();

		// ��������ͷ������
		setHttpProperty();

		// ����POST��GET����
		handleParam();

		APPLog.i(TAG, "before connect");
		urlConnection.connect();
		APPLog.i(TAG, "after connect");

		// ��Ӧͷ����Ϣ
		handleResponseHead();

		// �����Ӧͷ
		HttpCookie.getResponseCookies(urlConnection);

		// ��Ӧ������Ϣ
		handleResponseData();
	}

	/**
	 * ������
	 * 
	 * @throws IOException
	 */
	private void openConnection() throws IOException {
		String urlString = "";
		if (HttpRequest.REQUEST_METHOD_POST.equals(httpRequest
				.getRequestMethod())) {
			// ����POST�������
			// ƴ��URL protocol
			urlString = HttpHelper.initURL(httpRequest.getUrl());
		} else {
			// ����GET�������
			// ƴ��URL protocol �� ����
			urlString = HttpHelper.initURL(httpRequest.getUrl(),
					httpRequest.getParamData());
		}

		// ��URLת����ת�������ַ�
		urlString = HttpHelper.urlEncode(httpRequest.getUrl());

		URL url = new URL(urlString);

		if (urlString.startsWith("https")) {

			// ʹ���Լ���֤�飬�������з�����֤��
			HttpHelper.trustAllHosts();

			HttpsURLConnection https = null;

			https = (HttpsURLConnection) url.openConnection();

			https.setHostnameVerifier(HttpHelper.DO_NOT_VERIFY);

			urlConnection = (HttpsURLConnection) url.openConnection();

		} else {

			urlConnection = (HttpURLConnection) url.openConnection();

		}

		urlConnection.setDoOutput(true);
		urlConnection.setDoInput(true);
	}

	/**
	 * ��������ͷ������
	 * 
	 * @throws IOException
	 */
	private void setHttpProperty() throws IOException {
		// ��������������ʱ����λ�����룩
		urlConnection.setConnectTimeout(httpRequest.getConnectTimeout());
		// ���ô�������ȡ���ݳ�ʱ����λ�����룩
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
	 * ����POST �� GET ����
	 * 
	 * @throws IOException
	 */
	private void handleParam() throws IOException {
		if (HttpRequest.REQUEST_METHOD_POST.equals(httpRequest
				.getRequestMethod())) {
			// ����POST�������
			APPLog.i(TAG, "POST Request");

			urlConnection.setRequestMethod("POST");

			PrintStream send = new PrintStream(urlConnection.getOutputStream());

			send.print(httpRequest.getParamData());

			send.close();
			APPLog.i(TAG, "POST Data ��" + httpRequest.getParamData());
		} else {
			// ����GET�������
			APPLog.i(TAG, "GET Request");
			urlConnection.setRequestMethod("GET");
		}
	}

	/**
	 * ������Ӧͷ��
	 * 
	 * @throws IOException
	 */
	private void handleResponseHead() throws IOException {

		// �����Ӧ��
		int reponseCode = urlConnection.getResponseCode();
		if (reponseCode != 200) {
			// ��Ӧ�벻��200ʱ�ر�����
			httpResponse.setResponseCode(reponseCode);
			urlConnection.disconnect();
		} else {
			// �ɹ���Ӧ
			httpResponse.setResponseCode(HttpResponse.RESPONSE_CODE_SUCCESS);
			httpResponse.setContentLength(urlConnection.getContentLength());
			httpResponse.setContentType(urlConnection.getContentType());
		}
	}

	/**
	 * ������Ӧ����
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
 * HttpThread�̼߳����������ڻ�ȡHttpRequest����
 * 
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-5-8]
 */
interface HttpThreadListener {
	/**
	 * ��ȡHttpRequest����
	 * 
	 * @return
	 */
	public HttpRequest getHttpRequest();

	/**
	 * ���һ��HttpRequest����
	 * 
	 * @param httpRequest
	 */
	public void finishHttpRequest(HttpRequest httpRequest);
	
	/**
	 * ����ȴ�
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * @param httpThread
	 */
	public void requestWait(HttpThread httpThread);
}
