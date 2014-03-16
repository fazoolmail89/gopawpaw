package com.gopawpaw.droidcore.utils;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author CUNGUANTONG
 * @date 2011-12-14
 * @version
 * @description Cookie工具类
 */
public class CookieUtils {

	static final String TAG = CookieUtils.class.getSimpleName();

	public static HashMap<String, String> cookieMap = new HashMap<String, String>();

	static Map<String, HashMap<String, String>> cookieStore = new HashMap<String, HashMap<String, String>>();

	/**
	 * 根据url得到Cookie
	 * 
	 * @param url
	 * @return
	 */
	public static Object getRequestCookies(String url) {
		String cookies = "";
		try {

			String hostName = getUrlHost(url);
			Object cookie = cookieStore.get(hostName);

			if (cookie != null) {
				@SuppressWarnings("unchecked")
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
			AppLog.e(TAG, e.toString());
		}
		return cookies;
	}

	/**
	 * [根据URL获取保存在cookieStore中的sessionMap]<BR>
	 * [功能详细描述]
	 * 
	 * @param url
	 *            request url
	 * @return cookiemaps stored in cookieStore or null if not found
	 *         author:CUNGUANTONG465 editor:CUNGUANTONG465 time:2012-2-14
	 */
	@SuppressWarnings("unchecked")
	private static HashMap<String, String> getCookieMaps(String url) {
		String hostName = getUrlHost(url);

		Object obj = cookieStore.get(hostName);
		if (obj != null)
			return (HashMap<String, String>) obj;
		else {
			return new HashMap<String, String>();
		}
	}

	/**
	 * 根据连接对象得到CookieMap，并保存到cookieStore
	 * 
	 * @param conn
	 * @return
	 */
	public static void getResponseCookies(HttpURLConnection conn) {
		String key = "";
		String cookieVal = "";

		String url = conn.getURL().toString();

		HashMap<String, String> cookieMap = getCookieMaps(url);
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
			AppLog.e(TAG, e.toString());
		}
	}

	/**
	 * 得到连接host
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
			AppLog.e(TAG, e.getMessage());
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
	 * 设置Cookie
	 * 
	 * @param cookie
	 * @param url
	 */
	public static void setCookies(HashMap<String, String> cookie, String url) {
		url = getUrlHost(url);
		cookieStore.put(url, cookie);
	}

}
