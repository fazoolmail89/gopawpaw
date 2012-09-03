/*
 * 文  件   名： HttpActionBase.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-4-12
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.frame.http.action;

import java.awt.Component;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Random;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.gopawpaw.frame.http.HttpConnector;
import com.gopawpaw.frame.http.HttpHelper;
import com.gopawpaw.frame.http.HttpListener;
import com.gopawpaw.frame.http.HttpRequest;
import com.gopawpaw.frame.http.HttpResponse;
import com.gopawpaw.frame.http.NetworkManagement;
import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.paser.DataHashMapParser;
import com.gopawpaw.frame.struct.AppKeyConstants;
import com.gopawpaw.frame.struct.DataHashMap;
import com.gopawpaw.frame.utils.FileUtil;


/**
 * Http请求基类
 * 
 * @author LiJinHua
 * @date 2012-4-12
 * @version [Android 1.0.0, 2012-4-12]
 * @description
 */
public class HttpActionBase implements HttpListener {

	/**
	 * TAG
	 */
	private static final String TAG = HttpActionBase.class.getSimpleName();

	/**
	 * 显示提示信息
	 */
	public static final int MSG_SHOW_ALERTDIALOG = 101;

	/**
	 * 随机数，用于生成log的connectionId
	 */
	private static final Random sRandom = new Random();
	
	/**
	 * 发送请求的JInternalFrame
	 */
	private Component mComponent;

	/**
	 * 回调接口
	 */
	private HttpActionListener httpActionListener;

	/**
	 * [构造简要说明]
	 * 
	 * @param httpActionListener
	 */
	public HttpActionBase(HttpActionListener httpActionListener,
			Component component) {

		this.httpActionListener = httpActionListener;
		this.mComponent = component;
	}

	/**
	 * 发送RUL请求
	 * 
	 * @param urlId
	 */
	public void sendRequest(int urlId) {
		sendRequest(urlId, 0, this, null, false);
	}

	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 * @param connectionId 请求链接Id
	 */
	public void sendRequest(int urlId,int connectionId) {
		sendRequest(urlId, connectionId, this, null, false);
	}
	
	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 * @param connectionId 请求链接Id
	 * @param paramObj 请求参数字典
	 */
	public void sendRequest(int urlId,int connectionId,Object paramObj) {
		sendRequest(urlId, connectionId, this, paramObj, false);
	}
	
	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 * @param connectionId 请求链接Id
	 * @param paramObj 请求参数字典
	 * @param isLog true:connectionId随机生成；false:connectionId=0
	 */
	public void sendRequest(int urlId,Object paramObj,boolean isLog) {
		int connectionId =  0;
		if(isLog){
			connectionId = sRandom.nextInt();
		}
		sendRequest(urlId, connectionId, this, paramObj, false);
	}
	
	/**
	 * 发送URL请求
	 * @param urlId 请求UrlId
	 * @param connectionId 请求链接Id
	 * @param paramObj 请求参数字典
	 * @param remove 在请求之前清空请求队列
	 */
	public void sendRequest(int urlId,int connectionId,Object paramObj,boolean remove) {
		sendRequest(urlId, connectionId, this, paramObj, remove);
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
	private void sendRequest(int urlId, int connectionId,
			HttpListener httpListener, Object paramObj, boolean remove) {
		Object object = null;
		object = HttpActionDataCache.getCache(urlId, connectionId);
		if (object != null) {
			// 数据从缓存取，直接返回给页面
			onFinish(object, urlId, connectionId);
			return;
		} else {
			// 缓存不存在数据，则发送Http请求数据

		}

		if (!NetworkManagement.IsNetWordLinking()) {
			APPLog.e(TAG, "网络不可用");

//			String errMsg = "当前网络不可用，请检查您的网络链接！";
//			showErrorMsg(errMsg);

			httpActionListener.onHttpActionResponse(
					HttpActionListener.STATE_NETWORK_ENABLE, null, urlId, connectionId);

			return;
		}

		int mode = HttpRequest.REQUEST_MODE_3;

		if (remove) {
			// 清空请求队列
			mode = HttpRequest.REQUEST_MODE_1;
		}

		String url = HttpHelper.getUrlById(urlId);
		String data = HttpHelper.getRequestURLParam(paramObj, urlId);

		// 创建新的请求
		HttpRequest request = new HttpRequest(url, data, httpListener, mode,
				HttpRequest.REQUEST_TYPE_1, HttpRequest.REQUEST_METHOD_POST);
		request.setUrlId(urlId);
		request.setConnectionId(connectionId);

		// 发送Http请求
		HttpConnector.sendHttpRequest(request);

	}

	/**
	 * 读取缓存数据后，向请求页面回调数据
	 * 
	 * @param data
	 * @param urlId
	 * @param connectionId
	 */
	protected void onFinish(Object data, int urlId, int connectionId) {

		int state = HttpActionDataCache.getCacheState(urlId, connectionId);

		httpActionListener.onHttpActionResponse(state, data, urlId,
				connectionId);

	}

	@Override
	public void httpResponse(HttpResponse httpResponse) {
		// TODO Auto-generated method stub

		APPLog.d(TAG,
				"Code:" + httpResponse.getResponseCode() + "Type:"
						+ httpResponse.getContentType() + "Length:"
						+ httpResponse.getContentLength());

		DataHashMap<String, Object> data = null;
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
			
			int errCode = HttpActionListener.STATE_SUCCESS;
			if(bs == null){
				//数据读取失败
				APPLog.e(TAG, "数据读取失败");

//				String errMsg = "数据读取失败，请稍候再试！";
//				showErrorMsg(errMsg);
				errCode = HttpActionListener.STATE_FAILED;
				
				actionResponse(errCode, data, httpResponse
						.getHttpRequest().getUrlId(), httpResponse.getHttpRequest()
						.getConnectionId());
				return;
			}
			
			if (APPLog.IS_DEBUG) {
				// 调试模式下，打印出服务器返回的报文
				APPLog.d(TAG, new String(bs));
			}

			//进行数据解析
			data = actionParse(bs);

			if (data == null) {
				// 数据解析失败
				APPLog.e(TAG, "数据解析失败");

//				String errMsg = "数据请求失败，请稍候再试！";
//				showErrorMsg(errMsg);
				errCode = HttpActionListener.STATE_FAILED;
			} else {
				// 获取错误码
//				String errMsg = "OK。。。";
//				showErrorMsg(errMsg);
				errCode = checkErrorCode(data, httpResponse.getHttpRequest()
						.getUrlId());
				
				if (errCode == HttpActionListener.STATE_SUCCESS) {
					//错误码是成功，则对数据进行缓存
					HttpActionDataCache.saveToCache(httpResponse
							.getHttpRequest().getUrlId(), httpResponse.getHttpRequest()
							.getConnectionId(), data,
							httpResponse.getHttpRequest().getParamData(), errCode);
				}
			}

			actionResponse(errCode, data, httpResponse
						.getHttpRequest().getUrlId(), httpResponse.getHttpRequest()
						.getConnectionId());
			
		} else {
			// Http错误返回
//			String errMsg = "您的网络好像有问题，请重试！";
//			showErrorMsg(errMsg);
			
			actionResponse(
						HttpActionListener.STATE_NETWORK_ENABLE, data, httpResponse
						.getHttpRequest().getUrlId(), httpResponse
						.getHttpRequest().getConnectionId());
			
		}
	}

	/**
	 * 执行响应
	 * @param state
	 * @param data
	 * @param urlId
	 * @param connectionId
	 */
	private void actionResponse(int state, Object data, int urlId, int connectionId){
		if(mComponent != null && mComponent.isVisible()){
			//当前的页面还在显示时，则回调
			httpActionListener.onHttpActionResponse(state, data, urlId, connectionId);
		}
	}
	
	/**
	 * 执行解析
	 * 
	 * @param bs
	 */
	private DataHashMap<String, Object> actionParse(byte[] bs) {
		DataHashMap<String, Object> maps = null;
		DataHashMapParser dhmParser = new DataHashMapParser();
		try {
			dhmParser.parseData(bs);
			maps = dhmParser.getObjectMap();
		} catch (OutOfMemoryError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return maps;
	}

	/**
	 * 检查errCode，若果errCode不是成功状态，则提示消息<br>
	 * 部分系统错误将会在此被处理
	 * @param maps
	 * @param urlId
	 * @return
	 */
	private int checkErrorCode(Map<String, Object> maps, int urlId) {
		int state = 0;
		Object obj = maps.get(AppKeyConstants.ERRCODE);
		int errorCode = -1;
		if (obj != null) {
			errorCode = Integer.parseInt(obj.toString());
		}
		
		switch (errorCode) {
		case 0:{
			// 成功返回 000
			state = 0;
		}
			break;
		case 1: { 
			// 业务级错误 001
			state = 1;
			}
			break;
		case 9: {
			// 系统处理出错 009
			state = 9;
			}
			break;
		case 100: { 
			// Session中没有客户信息 100
			state = 100;

			}
			break;
		case 101: { 
			// 非受邀客户，暂不能使用 101
			state = 101;
			}
			break;
		case 102: { 
			// 用户名或密码错误 102
			state = 102;
			}
			break;
		case 104: { 
			// 登陆时验证码过期 104
			state = 104;
			}
			break;
		case 105: { 
			// 登陆时验证码错误 105
			state = 105;
			}
			break;
		case 200: { 
			// OTP校验失败 200
			state = 200;
			}
			break;
		case 201: { 
			// OTP发送失败 201
			state = 201;
			}
			break;
		case 400: { 
			// Session超时 400
			state = 400;

			break;
			}
		case 303: {
			// 您暂不能使用该功能，请解锁
			state = 303;
			}
			break;
		case 111: { 
			// 查询无记录，或这失败
			state = 111;
			}
			break;
		default: {
			// 默认错误
			state = 11212;
			}
		}

		return state;
	}


	/**
	 * 
	 * [框架统一提示信息弹出方法]<BR>
	 * 
	 * @param errMsg
	 *            错误提示信息
	 */
//	private void showErrorMsg(String errMsg) {
//		JOptionPane.showConfirmDialog(mComponent, errMsg);
//	}

}
