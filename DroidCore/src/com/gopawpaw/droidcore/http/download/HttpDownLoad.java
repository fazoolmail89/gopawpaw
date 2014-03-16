/**
 * @author EX-LIJINHUA001
 * @date 2013-4-18
 */
package com.gopawpaw.droidcore.http.download;

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
 * Http下载
 * @author EX-LIJINHUA001
 * @date 2013-4-18
 */
public class HttpDownLoad implements HttpListener{

	/** 
	 * TAG
	 */
	private static final String TAG = HttpDownLoad.class.getSimpleName();
	
	/**
	 * 回调接口
	 */
	private HttpDownLoadListener httpDownLoadListener;
	
	/**
	 * 发送请求的Activity
	 */
	private Context context;
	
	/**
	 * 同步对象确保响应一个一个处理，确保不同时处理多个
	 */
	private static Object object = new Object();
	
	/**
	 * 
	 */
	public HttpDownLoad(HttpDownLoadListener httpDownLoadListener,
			Context context) {
		
		this.httpDownLoadListener = httpDownLoadListener;
		this.context = context;
	}

	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 */
	public void sendRequest(String urlId) {
		sendRequest(urlId, 0, this, null, false,HttpRequest.REQUEST_METHOD_GET,null);
	}
	
	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 */
	public void sendRequest(String urlId,int connectionId,Object obj) {
		sendRequest(urlId, connectionId, this, null, false,HttpRequest.REQUEST_METHOD_GET,obj);
	}
	
	/**
	 * 发送URL请求
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
			HttpListener httpListener, Object paramObj, boolean remove,String requestMethod,Object obj) {

		if (!CommonUtils.isNetworkAvailable(context)) {
			
			String errMsg = "当前网络不可用，请检查您的网络链接！";
			
			AppLog.e(TAG, errMsg);
			
			httpDownLoadListener.onHttpDownLoadResponse(
					HttpDownLoadListener.STATE_NETWORK_ENABLE, null, urlId, connectionId,obj);
			
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
				HttpRequest.REQUEST_TYPE_2, requestMethod);
		request.setUrlId(urlId);
		request.setConnectionId(connectionId);
		request.setObj(obj);
		// 发送Http请求
		HttpConnector.sendHttpRequest(request);

	}
	
	@Override
	public void httpResponse(HttpResponse httpResponse) {
		// TODO Auto-generated method stub
		synchronized (object) {
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
				
				if(bs == null){
					//读取数据失败
					AppLog.d(TAG,
							"读取网络数据失败");
					
					httpDownLoadListener.onHttpDownLoadResponse(
							HttpDownLoadListener.STATE_READ_FALSE, null, httpResponse.getHttpRequest().getUrlId(), httpResponse.getHttpRequest().getConnectionId()
							,httpResponse.getHttpRequest().getObj());
					
					return;
				}
				
				String url = httpResponse.getUrl();
				AppLog.d(TAG, url);
				AppLog.d(TAG, "getConnectionId="+httpResponse.getHttpRequest().getConnectionId());
				
				httpDownLoadListener.onHttpDownLoadResponse(HttpDownLoadListener.STATE_SUCCESS, bs, httpResponse.getHttpRequest().getUrlId(), httpResponse.getHttpRequest().getConnectionId(),httpResponse.getHttpRequest().getObj());
				
			} else {
				// Http错误返回
				httpDownLoadListener.onHttpDownLoadResponse(
						HttpDownLoadListener.STATE_HTTP_FALSE, null, httpResponse.getHttpRequest().getUrlId(), httpResponse.getHttpRequest().getConnectionId(),httpResponse.getHttpRequest().getObj());
				
			}
		}
	}

}
