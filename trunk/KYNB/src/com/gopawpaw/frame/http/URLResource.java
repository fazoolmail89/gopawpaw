/**
 * 
 */
package com.gopawpaw.frame.http;

import java.util.HashMap;

/**
 * @version 2012-8-21
 * @author Jason
 */
public class URLResource {

	private static final String HOST = "http://kynb.gopawpaw.com";
	
	private static final String DOWNLOAD_URL = "http://kynb.gopawpaw.com/";
	
	public static final int URL_PROCONFIG = 10000001;
	public static final int URL_CHECKPRODUCT = 10000002;
	
	public static final String KEY_VERSION = "version";
	public static final String KEY_HARDWARECODE = "hardwareCode";
	public static final String KEY_HARDWARECODEDISPLAY = "hardwareCodeDisplay";
	
	
	private static URLResource mURLResource;
	
	private HashMap<Integer,String> mURLMap = new HashMap<Integer,String>();
	
	private URLResource() {
		super();
		initURL();
	}
	
	public static URLResource getInstance(){
		if(mURLResource == null){
			mURLResource = new URLResource();
		}
		return mURLResource;
	}
	
	public static String getHost(){
		return HOST;
	}
	
	public static String getDownloadUrl(){
		return DOWNLOAD_URL;
	}
	
	public String getURLById(int urlId){
		
		return mURLMap.get(urlId);
	}

	private void initURL(){
		mURLMap.put(URL_PROCONFIG, "http://kynb.gopawpaw.com/product_config.xml");
	}
	
	public void updateURL(int key,String urlString){
		mURLMap.put(key, urlString);
	}
}
