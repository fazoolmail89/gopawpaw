package com.gopawpaw.frame.http;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.gopawpaw.frame.log.APPLog;


/**
 * @author CUNGUANTONG
 * @date 2011-12-14
 * @version
 * @description Cookie������
 */
public class HttpCookie {

	static final String TAG = HttpCookie.class.getSimpleName();

	public static HashMap<String, String> cookieMap = new HashMap<String, String>();

	static Map<String, HashMap<String, String>> cookieStore = new HashMap<String, HashMap<String, String>>();

	/**
	 * ����url�õ�Cookie
	 * 
	 * @param url
	 * @return
	 */
	public static Object getRequestCookies(String url) {
		String cookies = "";
		try {

			String hostName = getUrlHost(url);
			HashMap<String, String> cookie = cookieStore.get(hostName);

			if (cookie != null) {
				HashMap<String, String> maps = (HashMap<String, String>) cookie;
				if (maps.size() > 0) {
					Iterator<?> iterator = maps.entrySet().iterator();
					while (iterator.hasNext()) {
						Object obj = iterator.next();
						String str = obj.toString();
						cookies = cookies + str + ";";
					}
				}
			}
		} catch (Exception e) {
			APPLog.e(TAG, e.toString());
		}
		return cookies;
	}

	/**
	 * [����URL��ȡ������cookieStore�е�sessionMap]<BR>
	 * [������ϸ����]
	 * 
	 * @param url
	 *            request url
	 * @return cookiemaps stored in cookieStore or null if not found
	 *         author:CUNGUANTONG465 editor:CUNGUANTONG465 time:2012-2-14
	 */
	private static HashMap<String, String> getCookieMaps(String url) {
		String hostName = getUrlHost(url);

		HashMap<String, String> obj = (HashMap<String, String>)cookieStore.get(hostName);
		if (obj != null)
			return  obj;
		else {
			return null;
		}
	}

	/**
	 * �������Ӷ���õ�CookieMap�������浽cookieStore
	 * 
	 * @param conn
	 * @return
	 */
	public static void getResponseCookies(HttpURLConnection conn) {
		String key = "";
		String cookieVal = "";

		String url = conn.getURL().toString();

//		if (LoginActivity.login) {
			cookieMap = getCookieMaps(url);
			if (cookieMap == null) {
				//cookie�����ڣ��򴴽������Ѵ�������Ҫ�´���
				cookieMap = new HashMap<String, String>();
			}
//		}
		try {

			for (int i = 1; (key = conn.getHeaderFieldKey(i)) != null; i++) {
				if (key.equalsIgnoreCase("set-cookie")) {
					cookieVal = conn.getHeaderField(i);
					cookieVal = cookieVal.substring(0, cookieVal.indexOf(";"));
					if (cookieVal != null && !"null".equals(cookieVal)) {
						String[] str = new String[2];
						str = cookieVal.split("=");
						cookieMap.put(str[0], str[1]);
					}
				}
			}
			
			setCookies(cookieMap, url);
			
		} catch (Exception e) {
			APPLog.e(TAG, e.toString());
		}
	}

	/**
	 * �õ�����host
	 * 
	 * @param urlStr
	 * @return
	 */
	private static String getUrlHost(String urlStr) {
		try {
			URL url = new URL(urlStr);
			String hostName = url.getHost();
			return hostName;
		} catch (MalformedURLException e) {
			APPLog.e(TAG, e.getMessage());
			return "";
		}
	}

	/**
	 * 
	 */
	public static void clearAll() {
		cookieMap.clear();
		cookieStore.clear();
		cookieMap = null;
		cookieStore = null;
	}

	/**
	 * ����Cookie
	 * 
	 * @param cookie
	 * @param url
	 */
	public static void setCookies(HashMap<String, String> cookie, String url) {
		url = getUrlHost(url);
		cookieStore.put(url, cookie);
	}

}
