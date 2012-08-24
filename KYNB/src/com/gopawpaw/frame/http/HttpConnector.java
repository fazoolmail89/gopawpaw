/*
 * 文  件   名： HttpConnector.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-4-18
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.frame.http;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Vector;

import com.gopawpaw.frame.log.APPLog;

/**
 * Http连接器<br>
 * 处理多线程队列请求，连接器包含两个线程池：1、数据报文处理线程池；2、文件下载处理线程池<br>
 * 两个线程池中拥有独立的线程数，用于分开处理数据报文和文件下载请求。
 * 
 * @author LiJinHua
 * @date 2012-4-18
 * @version [Android 1.0.0, 2012-4-18]
 * @description
 */
public class HttpConnector {
	private static final String TAG = HttpConnector.class.getSimpleName();

	/**
	 * 最大的数据报文请求线程数
	 */
	private static final int MAX_THREAD_ACTION = 1;

	/**
	 * 最大的文件下载请求线程数
	 */
	private static final int MAX_THREAD_DOWN = 2;

	/**
	 * HttpConnector对象的实例
	 */
	private static HttpConnector instance;

	/**
	 * 同步对象Action
	 */
	private static Object object = new Object();

	/**
	 * 请求队列
	 */
	private Vector<HttpRequest> mRequestQueue;

	/**
	 * 当前正在处理的请求队列
	 */
	private Vector<HttpRequest> mRequestQueueCurr;

	/**
	 * Http请求线程池
	 */
	private ArrayList<HttpThread> mThreadList;

	/**
	 * 单例模式
	 */
	private HttpConnector() {
		super();

		mRequestQueue = new Vector<HttpRequest>();
		mRequestQueueCurr = new Vector<HttpRequest>();
		mThreadList = new ArrayList<HttpThread>();
	}

	/**
	 * 发送Http请求，单线程请求排队
	 * 
	 * @param request
	 */
	public static void sendHttpRequest(HttpRequest httpRequest) {

		if (httpRequest == null) {

			return;
		}

		if (instance == null) {
			// 单例模式初始化，同时初始化队列
			instance = new HttpConnector();
		}

		// 将请求插入队列中
		instance.handleHttpRequest(httpRequest);

		// 请求线程处理
		instance.requestThread(httpRequest.getRequestType());

	}

	/**
	 * 处理请求<br>
	 * 将请求插入到请求队列中，并发送申请网络请求线程进行处理，<br>
	 * 若线程忙，则按请求规则排队处理请求
	 * 
	 * @param httpRequest
	 *            新添加的请求
	 * @return
	 */
	private void handleHttpRequest(HttpRequest httpRequest) {

		// 数据报文请求
		switch (httpRequest.getRequestMode()) {
		case HttpRequest.REQUEST_MODE_1:
			// 清空和该请求类型一致队列后再插入请求
			synchronized (object) {
				int size = mRequestQueue.size();
				for (int i=0;i<size;i++) {
					HttpRequest hr = mRequestQueue.get(i);
					if(hr.getRequestType() == httpRequest.getRequestType()){
						//移除和该请求类型一致的请求队列
						mRequestQueue.remove(hr);
						i--;
						size--;
					}
				}
				mRequestQueue.add(httpRequest);
			}
			break;
		case HttpRequest.REQUEST_MODE_2:
			// 将请求插入队列最前位置
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {
					APPLog.i(TAG, "成功添加请求：" + httpRequest.getUrl());
					mRequestQueue.add(0, httpRequest);
				} else {
					APPLog.e(TAG, "忽略重复请求：" + httpRequest.getUrl());
				}
			}
			break;
		case HttpRequest.REQUEST_MODE_3:
			// 将请求插入队列最后位置
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {

					mRequestQueue.add(httpRequest);
				} else {
					APPLog.e(TAG, "忽略重复请求：" + httpRequest.getUrl());
				}
			}
			break;
		default:
			// 将请求插入队列最后位置
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {

					mRequestQueue.add(httpRequest);
				} else {
					APPLog.e(TAG, "忽略重复请求：" + httpRequest.getUrl());
				}
			}
			break;
		}
	}

	/**
	 * 
	 * 请求线程处理
	 * 
	 * @param requestType
	 */
	private void requestThread(int requestType) {
		if (requestType == HttpRequest.REQUEST_TYPE_1) {
			// 数据报文请求

			int tsize = mThreadList.size();
			int tAlivesize = 0;
			for (int i=0;i<tsize;i++) {
				HttpThread ht = mThreadList.get(i);
				
				if (ht.getHttpThreadListener() == mHttpThreadAction) {
					// 该线程属于用来处理文件下载请求
					
					if(ht.getState() == State.WAITING){
						//若存在线程处于等待状态
						synchronized (ht) {
							ht.notify();
						}
						APPLog.i(TAG, "Thread : " +ht.getName() + " is notify...");
						//一次只唤醒一个线程
						return;
					}
					
					tAlivesize++;
					
				}
			}
			
			if (tAlivesize < MAX_THREAD_ACTION) {
				// 可用线程数未达到最大值，则增加线程
				HttpThread ht = new HttpThread(mHttpThreadAction);
				ht.start();
				mThreadList.add(ht);
			}

		} else if (requestType == HttpRequest.REQUEST_TYPE_2) {
			// 文件下载请求

			int tsize = mThreadList.size();
			int tAlivesize = 0;
			for (int i=0;i<tsize;i++) {
				HttpThread ht = mThreadList.get(i);
				
				if (ht.getHttpThreadListener() == mHttpThreadDown) {
					// 该线程属于用来处理文件下载请求
					
					if(ht.getState() == State.WAITING){
						//若存在线程处于等待状态
						synchronized (ht) {
							ht.notify();
						}
						
						APPLog.i(TAG, "Thread : " +ht.getName() + " is notify...");
						
						//一次只唤醒一个线程
						return;
					}
					tAlivesize++;
				}
			}
			
			if (tAlivesize < MAX_THREAD_DOWN) {
				// 可用线程数未达到最大值，则增加线程
				HttpThread ht = new HttpThread(mHttpThreadDown);
				ht.start();
				
				mThreadList.add(ht);
			}

		}
	}
	
	/**
	 * 清楚所有请求
	 */
	public static void clearRequest() {
		clearRequest(0);
	}
	
	/**
	 * 根据请求类型、清楚请求
	 * @param requestType
	 */
	public static void clearRequest(int requestType) {
		if(instance == null){
			return;
		}
		
		if(requestType == 0){
			instance.mRequestQueue.removeAllElements();
			return;
		}
		
		int size = instance.mRequestQueue.size();
		for (int i=0;i<size;i++) {
			HttpRequest hr = instance.mRequestQueue.get(i);
			if(hr.getRequestType() == requestType){
				//移除和该请求类型一致的请求队列
				instance.mRequestQueue.remove(hr);
				i--;
				size--;
			}
		}
	}

	/**
	 * 数据报文请求线程，获取请求对象的接口
	 */
	private HttpThreadListener mHttpThreadAction = new HttpThreadListener() {

		@Override
		public HttpRequest getHttpRequest() {

			synchronized (object) {

				if (mRequestQueue.size() > 0) {
					for (HttpRequest hr : mRequestQueue) {
						if (hr.getRequestType() == HttpRequest.REQUEST_TYPE_1) {
							// 数据报文请求
							mRequestQueue.remove(hr);
							mRequestQueueCurr.add(hr);
							return hr;
						}
					}
				}
			}

			return null;
		}

		@Override
		public void finishHttpRequest(HttpRequest httpRequest) {
			// TODO Auto-generated method stub
			synchronized (object) {
				mRequestQueueCurr.remove(httpRequest);
			}
		}

		@Override
		public void requestWait(HttpThread httpThread) {
			synchronized (httpThread) {
				try {
					APPLog.i(TAG, "Thread : " +httpThread.getName() + " is waiting...");
					httpThread.wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	};

	/**
	 * 文件下载请求线程，获取请求对象的接口
	 */
	private HttpThreadListener mHttpThreadDown = new HttpThreadListener() {

		@Override
		public HttpRequest getHttpRequest() {

			synchronized (object) {

				if (mRequestQueue.size() > 0) {
					for (HttpRequest hr : mRequestQueue) {
						if (hr.getRequestType() == HttpRequest.REQUEST_TYPE_2) {
							// 文件下载请求
							mRequestQueue.remove(hr);
							mRequestQueueCurr.add(hr);
							return hr;
						}
					}
				}
			}

			return null;
		}

		@Override
		public void finishHttpRequest(HttpRequest httpRequest) {
			// TODO Auto-generated method stub
			synchronized (object) {
				mRequestQueueCurr.remove(httpRequest);
			}
		}

		@Override
		public void requestWait(HttpThread httpThread) {
			synchronized (httpThread) {
				try {
					APPLog.i(TAG, "Thread : " +httpThread.getName() + " is waiting...");
					httpThread.wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	};

}
