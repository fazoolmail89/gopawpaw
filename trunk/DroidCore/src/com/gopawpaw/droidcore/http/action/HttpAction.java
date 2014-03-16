/*
 * 文  件   名： HttpAction.java
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

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;

import com.gopawpaw.droidcore.http.HttpConnector;
import com.gopawpaw.droidcore.http.HttpHelper;
import com.gopawpaw.droidcore.http.HttpListener;
import com.gopawpaw.droidcore.http.HttpRequest;
import com.gopawpaw.droidcore.http.HttpResponse;
import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.CommonUtils;
import com.gopawpaw.droidcore.utils.FileUtil;

/**
 * Http数据页面请求类
 * 
 * @author LiJinHua
 * @date 2012-4-12
 * @version [Android 1.0.0, 2012-4-12]
 * @description
 */
public class HttpAction implements HttpListener {

	/**
	 * TAG
	 */
	private static final String TAG = HttpAction.class.getSimpleName();
	
	/**
	 * 发送请求的Context
	 */
	private Context context;

	/**
	 * 回调接口
	 */
	private HttpActionListener httpActionListener;

	/**
	 * [构造简要说明]
	 * 
	 * @param httpActionListener
	 */
	public HttpAction(HttpActionListener httpActionListener, Context context) {

		this.httpActionListener = httpActionListener;
		this.context = context;
	}

	/**
	 * 发送RUL请求
	 * 
	 * @param urlId
	 */
	public void sendRequest(String urlId,Object obj) {
		sendRequest(urlId, 0, this, null, false,HttpRequest.REQUEST_METHOD_GET,obj);
	}


	/**
	 * 发送URL请求
	 * 
	 * @param urlId
	 *            请求UrlId
	 * @param connectionId
	 *            请求链接Id
	 * @param httpListener
	 *            请求监听器
	 * @param paramObj
	 *            请求参数字典
	 * @param remove
	 *            在请求之前清空请求队列
	 */
	private void sendRequest(String urlId, int connectionId,
			HttpListener httpListener, Object paramObj, boolean remove,
			String requestMethod,Object obj) {

		if (!CommonUtils.isNetworkAvailable(context)) {
			AppLog.e(TAG, "网络不可用");

			httpActionListener.onHttpActionResponse(
					HttpActionListener.STATE_FAILED, null, urlId, connectionId,obj);

			return;
		}

		int mode = HttpRequest.REQUEST_MODE_3;

		if (remove) {
			// 清空请求队列
			mode = HttpRequest.REQUEST_MODE_1;
		}

		String data = HttpHelper.getRequestURLParam(paramObj, urlId);

		// 创建新的请求
		HttpRequest request = new HttpRequest(urlId, data, httpListener, mode,
				HttpRequest.REQUEST_TYPE_1, requestMethod);
		request.setUrlId(urlId);
		request.setConnectionId(connectionId);
		request.setObj(obj);
		// 发送Http请求
		HttpConnector.sendHttpRequest(request);

	}

	@Override
	public void httpResponse(HttpResponse httpResponse) {
		// TODO Auto-generated method stub
		AppLog.d(TAG,
				"Code:" + httpResponse.getResponseCode() + "Type:"
						+ httpResponse.getContentType() + "Length:"
						+ httpResponse.getContentLength());

		if (httpResponse.getResponseCode() == HttpResponse.RESPONSE_CODE_SUCCESS) {
			// Http返回成功
			InputStream is = httpResponse.getInputStream();
			byte[] bs = null;
			try {
				bs = FileUtil.readStream(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (bs == null) {
				// 读取数据失败
				AppLog.d(TAG, "读取网络数据失败");

				httpActionListener.onHttpActionResponse(
						HttpActionListener.STATE_READ_FALSE, null,
						httpResponse.getHttpRequest().getUrlId(), httpResponse
								.getHttpRequest().getConnectionId(),httpResponse.getHttpRequest().getObj());
				return;
			}

			String url = httpResponse.getUrl();
			AppLog.d(TAG, url);
			AppLog.d(TAG, "getConnectionId="
					+ httpResponse.getHttpRequest().getConnectionId());
			httpActionListener.onHttpActionResponse(HttpActionListener.STATE_SUCCESS, bs, httpResponse
					.getHttpRequest().getUrlId(), httpResponse.getHttpRequest()
					.getConnectionId(),httpResponse.getHttpRequest().getObj());

		} else {
			// Http错误返回
			httpActionListener.onHttpActionResponse(
					HttpActionListener.STATE_HTTP_FALSE, null, httpResponse
							.getHttpRequest().getUrlId(), httpResponse
							.getHttpRequest().getConnectionId(),httpResponse.getHttpRequest().getObj());

		}
	}
}
