/*
 * 文  件   名： HttpActionListener.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-4-12
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
/*
 * 文  件   名： HttpActionListener.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-4-12
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.http.action;
/**
 * @author LiJinHua
 * @date 2012-4-12
 * @version [Android 1.0.0, 2012-4-12]
 * @description
 */
public interface HttpActionListener {

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
	 * @param data   通用解析后的响应报文
	 * @param urlId	 请求URLID
	 * @param connectionId  请求的connectionId，区别同一URL的不同数据请求
	 */
	void onHttpActionResponse(int state, Object data, String urlId, int connectionId,Object obj);
}

