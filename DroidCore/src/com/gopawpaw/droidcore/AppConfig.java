/*
 * 文件名: AppConfig.java
 * 版    权：  Copyright  LiJinHua  All Rights Reserved.
 * 描    述: [常量类]
 * 创建人: LiJinHua
 * 创建时间:  2013-1-11
 * 
 * 修改人：
 * 修改时间:
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * 应用程序配置信息
 * @author LiJinHua
 * @version [Android 1.0.0, 2013-1-11]
 */
public class AppConfig {

	private static final String TAG = AppConfig.class.getSimpleName();
	
	/**
	 * 是否为生产环境
	 */
	public static boolean IS_PRODUCT = false;
	
	/**
	 * SharedPreferences默认缓存文件名
	 */
	public static String CACHE_FILE = "cache_file";
	
	/**
	 * 系统缓存包名
	 */
	public static String SDCARD_ROOT = "app_cache_root";
	
	/**
	 * 下载目录，相对于SDCARD_ROOT
	 */
	public static String DOWNLOAD_PATH = "download";
	
	/**生产环境地址*/
	public static String URL_ID_HOST_PRD = "";
	/**STG环境地址 */
	public static String URL_ID_HOST_STG = "";
	
	/**
	 * 初始化配置信息
	 * @author EX-LIJINHUA001
	 * @date 2013-3-27
	 * @param action
	 */
	public static void init(Context action) {
		if (action == null) {
			Log.i(TAG, "There is no Context. Is this on the lock screen?");
			return;
		}

		int id = action.getResources().getIdentifier("appconfig", "xml",
				action.getPackageName());
		if (id == 0) {
			Log.w(TAG, "appconfig.xml missing. Ignoring...");
			Log.w(TAG, "IS_PRODUCT = "+IS_PRODUCT);
			Log.w(TAG, "IS_DEBUG = "+AppLog.IS_DEBUG+" level="+AppLog.DEBUG_LEVEL);
			Log.w(TAG, "SDCARD_ROOT = "+SDCARD_ROOT);
			Log.w(TAG, "DOWNLOAD_PATH = "+DOWNLOAD_PATH);
			Log.w(TAG, "CACHE_FILE = "+CACHE_FILE);
			Log.w(TAG, "URL_ID_HOST_PRD = "+URL_ID_HOST_PRD);
			Log.w(TAG, "URL_ID_HOST_STG = "+URL_ID_HOST_STG);
			return;
		}
		
		Log.i(TAG, "init appconfig begin =======================");
		XmlResourceParser xml = action.getResources().getXml(id);
		int eventType = -1;
		while (eventType != XmlResourceParser.END_DOCUMENT) {
			if (eventType == XmlResourceParser.START_TAG) {
				String strNode = xml.getName();
				
				if (strNode.equalsIgnoreCase("is_product")) {
					String is_product = xml.getAttributeValue(null, "valuse");
					if("true".equals(is_product)){
						IS_PRODUCT = true;
					}else{
						IS_PRODUCT = false;
					}
					Log.i(TAG, "IS_PRODUCT = "+IS_PRODUCT);
				}else if (strNode.equalsIgnoreCase("log")) {
					String debug = xml.getAttributeValue(null, "debug");
					String level = xml.getAttributeValue(null, "level");
					if("true".equals(debug)){
						AppLog.IS_DEBUG = true;
					}else{
						AppLog.IS_DEBUG = false;
					}
					//v\d\i\w\e
					if("v".equals(level)){
						AppLog.DEBUG_LEVEL = AppLog.LEVEL_V;
					}else if("d".equals(level)){
						AppLog.DEBUG_LEVEL = AppLog.LEVEL_D;
					}else if("i".equals(level)){
						AppLog.DEBUG_LEVEL = AppLog.LEVEL_I;
					}else if("w".equals(level)){
						AppLog.DEBUG_LEVEL = AppLog.LEVEL_W;
					}else if("e".equals(level)){
						AppLog.DEBUG_LEVEL = AppLog.LEVEL_E;
					}
					Log.i(TAG, "IS_DEBUG = "+AppLog.IS_DEBUG+" level="+level);
				}else if (strNode.equalsIgnoreCase("sdcard_root")) {
					String sdcard_root = xml.getAttributeValue(null, "valuse");
					if(sdcard_root != null && !"".equals(sdcard_root)){
						SDCARD_ROOT = sdcard_root;
					}
					Log.i(TAG, "SDCARD_ROOT = "+SDCARD_ROOT);
				}else if (strNode.equalsIgnoreCase("download")) {
					String download = xml.getAttributeValue(null, "valuse");
					if(download != null && !"".equals(download)){
						DOWNLOAD_PATH = download;
					}
					Log.i(TAG, "DOWNLOAD_PATH = "+DOWNLOAD_PATH);
				}else if (strNode.equalsIgnoreCase("cache_file")) {
					String cache_file = xml.getAttributeValue(null, "valuse");
					if(cache_file != null && !"".equals(cache_file)){
						CACHE_FILE = cache_file;
					}
					Log.i(TAG, "CACHE_FILE = "+CACHE_FILE);
				}else if (strNode.equalsIgnoreCase("host_prd")) {
					String host_prd = xml.getAttributeValue(null, "valuse");
					if(host_prd != null && !"".equals(host_prd)){
						URL_ID_HOST_PRD = host_prd;
					}
					Log.i(TAG, "URL_ID_HOST_PRD = "+URL_ID_HOST_PRD);
				}else if (strNode.equalsIgnoreCase("host_stg")) {
					String host_stg = xml.getAttributeValue(null, "valuse");
					if(host_stg != null && !"".equals(host_stg)){
						URL_ID_HOST_STG = host_stg;
					}
					Log.i(TAG, "URL_ID_HOST_STG = "+URL_ID_HOST_STG);
				}
			}

			try {
				eventType = xml.next();
			} catch (XmlPullParserException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Log.i(TAG, "init appconfig end =======================");
	}
}
