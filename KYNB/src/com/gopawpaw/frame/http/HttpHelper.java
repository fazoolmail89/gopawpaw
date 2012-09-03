/*
 * 文  件   名： HttpHelper.java
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
 * [网络发辅助工具类]<BR>
 * [功能详细描述]
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
	 * [根据请求UrlId获得请求接口]<BR>
	 * [功能详细描述]
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
	 * [包装请求参数]<BR>
	 * [map类型的，将map转为String，并按需求添加chanelType字段<br/>
	 * String类型的，按需求添加chanelType字段]
	 * 
	 * @param object
	 *            请求体
	 * @param urlId
	 *            请求ID
	 * @return String 包装后的请求体
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
	 * [将参数Map<String,String>转化为URL参数String]<BR>
	 * [ 如：<br>
	 * hashMap.put("user", "username");<br>
	 * hashMap.put("pass", "password");<br>
	 * 转换后为：user=username&pass= password]
	 * 
	 * @param paramMap
	 *            请求参数字典
	 * @param urlId
	 *            请求ID
	 * @return String 包装好的请求参数
	 */
	private static String getRequestURLParam(Map<String, String> paramMap,
			int urlId) {

		StringBuffer queryBuffer = new StringBuffer();

		if (paramMap == null) {
			// 过滤NullPointerException
			return queryBuffer.toString();
		}

		Iterator<String> it = paramMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String valuse = paramMap.get(key);

			if (!"".equals(queryBuffer.toString())) {
				// 第一个参数
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
	 * [为String类型的请求体]<BR>
	 * @param requestData
	 *            请求体
	 * @param urlId
	 *            请求ID
	 * @return 包装后的请求体
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
	 * 初始化URL地址
	 * 拼接URL前缀
	 * @param sendURL
	 * @return
	 */
	public static String initURL(String sendURL) {
		return initURL(sendURL,null);
	}
	
	/**
	 * 初始化URL地址
	 * 拼接URL前缀和GET参数
	 * @param sendURL 
	 * @param param 
	 * @return
	 */
	public static String initURL(String sendURL,String param) {
		String ret = "";
		if (!hasProtocol(sendURL)) {
			//不存在协议时，添加地址前缀
			ret = getHostUrl() + sendURL;
		}else{
			ret = sendURL;
		}
		
		if(param != null && !"".equals(param)){
			//存在参数时，拼接参数
			if(!sendURL.endsWith("?")){
				ret = ret + "?";
			}
			ret = ret + param;
		}
		return ret;

	}
	
	/**
	 * 获取主机地址
	 * @return
	 */
	private static String getHostUrl() {
		return URLResource.getHost();
	}
	
	
	/**
	 * 
	 * [检查请求地址是否包含网络协议]<BR>
	 * [功能详细描述]
	 * 
	 * @param sendURL
	 *            请求Url全路径
	 * @return true:包含协议 false:不包含协议
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
	 * 译码器
	 * @param url 要译的url
	 * @return 返回utf8编码十六进制字符串
	 */
	public static String urlEncode(String url) {
		final String hexChars = "0123456789ABCDEF";// 16进制符号
		StringBuffer sb = new StringBuffer();
		int length = url.length();
		for (int i = 0; i < length; i++) {
			char c = url.charAt(i);
			if (c == ' ') {
				sb.append("%20");
			}
			// 小于128的ascii符号保留
			else if (c < 128) {
				sb.append(c);
			} else
			// 非ascii符号转化成如下形式
			{
				// 先将该字符转化为字节数组
				String temp = String.valueOf(c);
				byte[] b = new byte[0];
				try {
					b = temp.getBytes("UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				// 循环该字节数组,将每个字节都转为%+2位16进制的形式,最后拼接而成
				for (int j = 0; j < b.length; j++) {
					// 首先拼接一个%用于间隔字节
					sb.append('%');
					// 1个字节是8位2进制,即2位16进制,先取高四位然后映射到16进制中的数值
					sb.append(hexChars.charAt((b[j] & 0xf0) >> 4));
					// 再取低四位映射到16进制中的数值,至此一个字节的转化工作完成
					sb.append(hexChars.charAt(b[j] & 0x0f));
				}
			}
		}
		return sb.toString();
	}
	
	/**
	 * [得到下载全路径，适配各个环境]<BR>
	 * [功能详细描述]
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
