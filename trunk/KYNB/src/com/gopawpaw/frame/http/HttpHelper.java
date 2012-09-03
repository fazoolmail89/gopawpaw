/*
 * ��  ��   ���� HttpHelper.java
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

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.gopawpaw.frame.log.APPLog;


/**
 * 
 * [���緢����������]<BR>
 * [������ϸ����]
 * 
 * @author LiJinHua
 * @version [Android PABank C01, 2011-12-20]
 */
public class HttpHelper {
	
	/**
	 * TAG
	 */
	private static final String TAG = HttpHelper.class.getSimpleName();
	

	/**
	 * 
	 * [��������UrlId�������ӿ�]<BR>
	 * [������ϸ����]
	 * 
	 * @param urlId
	 *            urlId
	 * @return String
	 */
	public static String getUrlById(int urlId) {

		return initURL(URLResource.getInstance().getURLById(urlId));
	}

	/**
	 * 
	 * [��װ�������]<BR>
	 * [map���͵ģ���mapתΪString�������������chanelType�ֶ�<br/>
	 * String���͵ģ����������chanelType�ֶ�]
	 * 
	 * @param object
	 *            ������
	 * @param urlId
	 *            ����ID
	 * @return String ��װ���������
	 */
	@SuppressWarnings("unchecked")
	public static String getRequestURLParam(Object object, int urlId) {
		String requestData = "";
		if (object instanceof Map) {
			Map<String, String> paramMap = (Map<String, String>) object;
			requestData = getRequestURLParam(paramMap, urlId);
		} else {
			requestData = getRequestURLParam((String) object, urlId);
		}
		return requestData;
	}

	/**
	 * 
	 * [������Map<String,String>ת��ΪURL����String]<BR>
	 * [ �磺<br>
	 * hashMap.put("user", "username");<br>
	 * hashMap.put("pass", "password");<br>
	 * ת����Ϊ��user=username&pass= password]
	 * 
	 * @param paramMap
	 *            ��������ֵ�
	 * @param urlId
	 *            ����ID
	 * @return String ��װ�õ��������
	 */
	private static String getRequestURLParam(Map<String, String> paramMap,
			int urlId) {

		StringBuffer queryBuffer = new StringBuffer();

		if (paramMap == null) {
			// ����NullPointerException
			return queryBuffer.toString();
		}

		Iterator<String> it = paramMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String valuse = paramMap.get(key);

			if (!"".equals(queryBuffer.toString())) {
				// ��һ������
				queryBuffer.append("&");
			}
			queryBuffer.append(key);
			queryBuffer.append("=");
			queryBuffer.append(HttpHelper.urlEncode(valuse));

		}

		return queryBuffer.toString();

	}
	
	/**
	 * 
	 * [ΪString���͵�������]<BR>
	 * @param requestData
	 *            ������
	 * @param urlId
	 *            ����ID
	 * @return ��װ���������
	 */
	private static String getRequestURLParam(String requestData, int urlId) {
		try {
			StringBuffer requestBuffer = new StringBuffer();
			if (requestData != null) {
				requestBuffer.append(requestData);
			}
			
			return requestBuffer.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
	
	/**
	 * ssl not verify
	 */
	public static final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
		public boolean verify(String hostname, SSLSession session) {
			return true;
		}
	};

	/**
	 * [Trust every server - dont check for any certificate]<BR>
	 */
	public static void trustAllHosts() {
		// Create a trust manager that does not validate certificate chains
		TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[]{};
			}

			public void checkClientTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
			}
		}};

		// Install the all-trusting trust manager
		try {
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection
					.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ʼ��URL��ַ
	 * ƴ��URLǰ׺
	 * @param sendURL
	 * @return
	 */
	public static String initURL(String sendURL) {
		return initURL(sendURL,null);
	}
	
	/**
	 * ��ʼ��URL��ַ
	 * ƴ��URLǰ׺��GET����
	 * @param sendURL 
	 * @param param 
	 * @return
	 */
	public static String initURL(String sendURL,String param) {
		String ret = "";
		if (!hasProtocol(sendURL)) {
			//������Э��ʱ����ӵ�ַǰ׺
			ret = getHostUrl() + sendURL;
		}else{
			ret = sendURL;
		}
		
		if(param != null && !"".equals(param)){
			//���ڲ���ʱ��ƴ�Ӳ���
			if(!sendURL.endsWith("?")){
				ret = ret + "?";
			}
			ret = ret + param;
		}
		return ret;

	}
	
	/**
	 * ��ȡ������ַ
	 * @return
	 */
	private static String getHostUrl() {
		return URLResource.getHost();
	}
	
	
	/**
	 * 
	 * [��������ַ�Ƿ��������Э��]<BR>
	 * [������ϸ����]
	 * 
	 * @param sendURL
	 *            ����Urlȫ·��
	 * @return true:����Э�� false:������Э��
	 */
	private static boolean hasProtocol(String sendURL) {
		boolean hasProtocol = false;
		try {
			URL url = new URL(sendURL);
			url.getProtocol();
			hasProtocol = true;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			APPLog.e(TAG, e.getMessage());
		}
		return hasProtocol;
	}

	
	/**
	 * ������
	 * @param url Ҫ���url
	 * @return ����utf8����ʮ�������ַ���
	 */
	public static String urlEncode(String url) {
		final String hexChars = "0123456789ABCDEF";// 16���Ʒ���
		StringBuffer sb = new StringBuffer();
		int length = url.length();
		for (int i = 0; i < length; i++) {
			char c = url.charAt(i);
			if (c == ' ') {
				sb.append("%20");
			}
			// С��128��ascii���ű���
			else if (c < 128) {
				sb.append(c);
			} else
			// ��ascii����ת����������ʽ
			{
				// �Ƚ����ַ�ת��Ϊ�ֽ�����
				String temp = String.valueOf(c);
				byte[] b = new byte[0];
				try {
					b = temp.getBytes("UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				// ѭ�����ֽ�����,��ÿ���ֽڶ�תΪ%+2λ16���Ƶ���ʽ,���ƴ�Ӷ���
				for (int j = 0; j < b.length; j++) {
					// ����ƴ��һ��%���ڼ���ֽ�
					sb.append('%');
					// 1���ֽ���8λ2����,��2λ16����,��ȡ����λȻ��ӳ�䵽16�����е���ֵ
					sb.append(hexChars.charAt((b[j] & 0xf0) >> 4));
					// ��ȡ����λӳ�䵽16�����е���ֵ,����һ���ֽڵ�ת���������
					sb.append(hexChars.charAt(b[j] & 0x0f));
				}
			}
		}
		return sb.toString();
	}
	
	/**
	 * [�õ�����ȫ·���������������]<BR>
	 * [������ϸ����]
	 * @return
	 */
	public static String getDownLoadUrl(String url)
	{	
		if(url.indexOf("http") > -1){
			return url;
		}
		else{
			return URLResource.getDownloadUrl();
		}
	}
}
