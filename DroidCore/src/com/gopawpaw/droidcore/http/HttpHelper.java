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
package com.gopawpaw.droidcore.http;

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

import com.gopawpaw.droidcore.log.AppLog;

/**
 * 
 * [网络发辅助工具类]<BR>
 * [功能详细描述]
 * 
 * @author CUNGUANTONG465
 * @version [Android PABank C01, 2011-12-20]
 */
public class HttpHelper {
	
	/**
	 * TAG
	 */
	private static final String TAG = HttpHelper.class.getSimpleName();
	

	private static String HOST_URL = "";
	

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
	public static String getRequestURLParam(Object object, String urlId) {
		if(object == null){
			return "";
		}
		String requestData = "";
		if (object instanceof Map) {
			Map<String, String> paramMap = (Map<String, String>) object;
			requestData = getRequestURLParam(paramMap, urlId);
		} else {
			requestData = (String) object;
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
			String urlId) {

		StringBuffer queryBuffer = new StringBuffer();

		if (paramMap == null) {
			// 过滤NullPointerException
			return queryBuffer.toString();
		}

		Iterator<String> it = paramMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			Object obj = paramMap.get(key);
			String valuse = "";
			if(obj instanceof byte[]){
				valuse = new String((byte[])obj);
			}else{
				valuse = ""+obj;
			}

			if (!"".equals(queryBuffer.toString())) {
				// 第一个参数
				queryBuffer.append("&");
			}
			queryBuffer.append(key);
			queryBuffer.append("=");
			queryBuffer.append(converURLParamValuse(valuse));

		}

		return queryBuffer.toString();

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
		String ret = sendURL;
		if (!hasProtocol(sendURL)) {
			//不存在协议时，添加地址前缀
			String host = getHostUrl();
			if(sendURL.startsWith("/")){
				ret = (host + sendURL);
			}else{
				ret = host.endsWith("/") ? (host + sendURL) : (host +"/"+ sendURL);
			}
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
	public static String getHostUrl() {
		return HOST_URL;
	}
	
	/**
	 * 设置主机地址
	 * @author EX-LIJINHUA001
	 * @date 2013-4-19
	 * @param url
	 */
	public static void setHostUrl(String url){
		AppLog.d(TAG, "setHostUrl:"+url);
		HOST_URL = url;
	}
	
	/**
	 * 获取主机地址
	 * @return
	 */
	public static String getHostFromUrl(String urlString) {
		String host = null;
		try {
			URL url = new URL(urlString);
			host = url.getProtocol()+"://"+url.getHost();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			AppLog.e(TAG, e.getMessage());
		}
		
		return host;
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
			AppLog.e(TAG, e.getMessage());
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
	 * 转义url特殊字符
	 * 
	 * url转义字符原理

		如果表单的action为list.jsf?act=go&state=5
		
		则提交时通过request.getParameter可以分别取得act和state的值。
		
		如果你的本意是act='go&state=5'这个字符串，那么为了在服务端拿到act的准确值，你必须对&进行转 义
		
		[预备知识]
		  
		        对与通过get方式提交的url，浏览器在提交前首先根据http协议把一一个的参数及其值解析配对。而url的参数间是通过&分割的，这就是浏 览器进行参数配置的分割依据。如果你的参数值中含有&等url特殊字符，那么你在服务器端就会拿到意想不到的值。所以必须对url的特殊字符进行 转义。
		编码的格式为：%加字符的ASCII码，即一个百分号%，后面跟对应字符的ASCII（16进制）码值。例如 空格的编码值是"%20"。
		下表中列出了一些URL特殊符号及编码
		　
		
		　 　 　 十六进制值 
		1. +  URL 中+号表示空格 %2B 
		2. 空格 URL中的空格可以用+号或者编码 %20 
		3. /  分隔目录和子目录 %2F  
		4. ?  分隔实际的 URL 和参数 %3F  
		5. % 指定特殊字符 %25  
		6. # 表示书签 %23  
		7. & URL 中指定的参数间的分隔符 %26  
		8. = URL 中指定参数的值 %3D
		
		所以上述的action你应该写成list.jsf?act=go%26state=5
		
	 * @param valuse
	 * @return
	 */
	public static String converURLParamValuse(String valuse){
//		if(valuse == null){
//			return null;
//		}
//		try {
//			AppLog.i(TAG, "converURLParamValuse 之前  valuse="+valuse);
//			valuse = java.net.URLEncoder.encode(valuse,"UTF-8");
//			AppLog.i(TAG, "converURLParamValuse 之后  valuse="+valuse);
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return urlEncode(valuse);
	}
}
