/**
 * @author EX-LIJINHUA001
 * @date 2013-4-18
 */
package com.gopawpaw.droidcore.http.download;

/**
 * Http下载监听器
 * @author EX-LIJINHUA001
 * @date 2013-4-18
 */
public interface HttpDownLoadListener {
	
	/**
	 * 状态成功
	 */
	public static final int STATE_SUCCESS = 0;
	
	/**
	 * 状态失败
	 */
	public static final int STATE_FAILED = 1;
	
	/**
	 * 网络不可用
	 */
	public static final int STATE_NETWORK_ENABLE= 101;
	
	/**
	 * HTTP请求失败
	 */
	public static final int STATE_HTTP_FALSE = 2;
	
	/**
	 * HTTP读取数据失败
	 */
	public static final int STATE_READ_FALSE = 3;
	
	/**
	 * 保存数据失败
	 */
	public static final int STATE_SAVE_FALSE = 4;
	
	/**
	 * 响应Http请求后返回的数据报文
	 * @param state 请求响应状态
	 * @param data   下载到的数据
	 * @param urlId	 请求URLID
	 * @param connectionId  请求的connectionId，区别同一URL的不同数据请求
	 */
	void onHttpDownLoadResponse(int state, Object data, String urlId, int connectionId,Object obj);
}
