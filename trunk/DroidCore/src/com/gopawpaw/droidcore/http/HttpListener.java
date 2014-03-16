/*
 * 文  件   名： HttpListener.java
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



/**
 * Http请求监听器
 * @author LiJinHua
 * @date 2012-3-28
 * @version [Android 1.0.0, 2012-3-28]
 * @description
 */
public interface HttpListener {

	
	
	/**
	 * HTTP响应
	 * @param httpResponse
	 */
    public void httpResponse(HttpResponse httpResponse);

}

