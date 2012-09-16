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
	
	private static final String CONFIG_PRO = "http://kynb.gopawpaw.com/product_config.xml";
	
	private static final String CONFIG_STG = "http://192.168.0.107/~jinhua/dedecms/product_config.xml";
	
	
	private static boolean IS_PRO = true;
	
	public static final int URL_PROCONFIG = 10000001;
	public static final int URL_CHECKPRODUCT = 10000002;
	public static final int URL_LOGPRODUCT = 10000003;
	
	public static final String KEY_DID = "did";
	public static final String KEY_VERSION = "version";
	public static final String KEY_DSERIAL = "dserial";
	public static final String KEY_DREGDISPLAY = "dregdisplay";
	public static final String KEY_DREGKEY = "dregkey";
	public static final String KEY_PRODUCT = "product";
	public static final String KEY_ISSUPASS = "issupass";
	
	public static final String KEY_MPACKAGE = "mpackage";
	public static final String KEY_MMENU = "mmenu";
	public static final String KEY_MNAME = "mname";
	public static final String KEY_ISREG = "isreg";
	public static final String KEY_OVERDUETYPE = "overduetype";
	public static final String KEY_OVERDUEVALUSE = "overduevaluse";
	public static final String KEY_OVERDUEMSG= "overduemsg";
	
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
		
		if(IS_PRO){
			mURLMap.put(URL_PROCONFIG, CONFIG_PRO);
		}else{
			mURLMap.put(URL_PROCONFIG, CONFIG_STG);
		}
	}
	
	public void updateURL(int key,String urlString){
		mURLMap.put(key, urlString);
	}
}
