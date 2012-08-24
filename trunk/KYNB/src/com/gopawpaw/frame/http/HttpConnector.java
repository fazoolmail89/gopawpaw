/*
 * ��  ��   ���� HttpConnector.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-4-18
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.http;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Vector;

import com.gopawpaw.frame.log.APPLog;

/**
 * Http������<br>
 * ������̶߳����������������������̳߳أ�1�����ݱ��Ĵ����̳߳أ�2���ļ����ش����̳߳�<br>
 * �����̳߳���ӵ�ж������߳��������ڷֿ��������ݱ��ĺ��ļ���������
 * 
 * @author LiJinHua
 * @date 2012-4-18
 * @version [Android 1.0.0, 2012-4-18]
 * @description
 */
public class HttpConnector {
	private static final String TAG = HttpConnector.class.getSimpleName();

	/**
	 * �������ݱ��������߳���
	 */
	private static final int MAX_THREAD_ACTION = 1;

	/**
	 * �����ļ����������߳���
	 */
	private static final int MAX_THREAD_DOWN = 2;

	/**
	 * HttpConnector�����ʵ��
	 */
	private static HttpConnector instance;

	/**
	 * ͬ������Action
	 */
	private static Object object = new Object();

	/**
	 * �������
	 */
	private Vector<HttpRequest> mRequestQueue;

	/**
	 * ��ǰ���ڴ�����������
	 */
	private Vector<HttpRequest> mRequestQueueCurr;

	/**
	 * Http�����̳߳�
	 */
	private ArrayList<HttpThread> mThreadList;

	/**
	 * ����ģʽ
	 */
	private HttpConnector() {
		super();

		mRequestQueue = new Vector<HttpRequest>();
		mRequestQueueCurr = new Vector<HttpRequest>();
		mThreadList = new ArrayList<HttpThread>();
	}

	/**
	 * ����Http���󣬵��߳������Ŷ�
	 * 
	 * @param request
	 */
	public static void sendHttpRequest(HttpRequest httpRequest) {

		if (httpRequest == null) {

			return;
		}

		if (instance == null) {
			// ����ģʽ��ʼ����ͬʱ��ʼ������
			instance = new HttpConnector();
		}

		// ��������������
		instance.handleHttpRequest(httpRequest);

		// �����̴߳���
		instance.requestThread(httpRequest.getRequestType());

	}

	/**
	 * ��������<br>
	 * ��������뵽��������У��������������������߳̽��д���<br>
	 * ���߳�æ������������ŶӴ�������
	 * 
	 * @param httpRequest
	 *            ����ӵ�����
	 * @return
	 */
	private void handleHttpRequest(HttpRequest httpRequest) {

		// ���ݱ�������
		switch (httpRequest.getRequestMode()) {
		case HttpRequest.REQUEST_MODE_1:
			// ��պ͸���������һ�¶��к��ٲ�������
			synchronized (object) {
				int size = mRequestQueue.size();
				for (int i=0;i<size;i++) {
					HttpRequest hr = mRequestQueue.get(i);
					if(hr.getRequestType() == httpRequest.getRequestType()){
						//�Ƴ��͸���������һ�µ��������
						mRequestQueue.remove(hr);
						i--;
						size--;
					}
				}
				mRequestQueue.add(httpRequest);
			}
			break;
		case HttpRequest.REQUEST_MODE_2:
			// ��������������ǰλ��
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {
					APPLog.i(TAG, "�ɹ��������" + httpRequest.getUrl());
					mRequestQueue.add(0, httpRequest);
				} else {
					APPLog.e(TAG, "�����ظ�����" + httpRequest.getUrl());
				}
			}
			break;
		case HttpRequest.REQUEST_MODE_3:
			// ���������������λ��
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {

					mRequestQueue.add(httpRequest);
				} else {
					APPLog.e(TAG, "�����ظ�����" + httpRequest.getUrl());
				}
			}
			break;
		default:
			// ���������������λ��
			synchronized (object) {
				if (!mRequestQueue.contains(httpRequest)
						&& !mRequestQueueCurr.contains(httpRequest)) {

					mRequestQueue.add(httpRequest);
				} else {
					APPLog.e(TAG, "�����ظ�����" + httpRequest.getUrl());
				}
			}
			break;
		}
	}

	/**
	 * 
	 * �����̴߳���
	 * 
	 * @param requestType
	 */
	private void requestThread(int requestType) {
		if (requestType == HttpRequest.REQUEST_TYPE_1) {
			// ���ݱ�������

			int tsize = mThreadList.size();
			int tAlivesize = 0;
			for (int i=0;i<tsize;i++) {
				HttpThread ht = mThreadList.get(i);
				
				if (ht.getHttpThreadListener() == mHttpThreadAction) {
					// ���߳��������������ļ���������
					
					if(ht.getState() == State.WAITING){
						//�������̴߳��ڵȴ�״̬
						synchronized (ht) {
							ht.notify();
						}
						APPLog.i(TAG, "Thread : " +ht.getName() + " is notify...");
						//һ��ֻ����һ���߳�
						return;
					}
					
					tAlivesize++;
					
				}
			}
			
			if (tAlivesize < MAX_THREAD_ACTION) {
				// �����߳���δ�ﵽ���ֵ���������߳�
				HttpThread ht = new HttpThread(mHttpThreadAction);
				ht.start();
				mThreadList.add(ht);
			}

		} else if (requestType == HttpRequest.REQUEST_TYPE_2) {
			// �ļ���������

			int tsize = mThreadList.size();
			int tAlivesize = 0;
			for (int i=0;i<tsize;i++) {
				HttpThread ht = mThreadList.get(i);
				
				if (ht.getHttpThreadListener() == mHttpThreadDown) {
					// ���߳��������������ļ���������
					
					if(ht.getState() == State.WAITING){
						//�������̴߳��ڵȴ�״̬
						synchronized (ht) {
							ht.notify();
						}
						
						APPLog.i(TAG, "Thread : " +ht.getName() + " is notify...");
						
						//һ��ֻ����һ���߳�
						return;
					}
					tAlivesize++;
				}
			}
			
			if (tAlivesize < MAX_THREAD_DOWN) {
				// �����߳���δ�ﵽ���ֵ���������߳�
				HttpThread ht = new HttpThread(mHttpThreadDown);
				ht.start();
				
				mThreadList.add(ht);
			}

		}
	}
	
	/**
	 * �����������
	 */
	public static void clearRequest() {
		clearRequest(0);
	}
	
	/**
	 * �����������͡��������
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
				//�Ƴ��͸���������һ�µ��������
				instance.mRequestQueue.remove(hr);
				i--;
				size--;
			}
		}
	}

	/**
	 * ���ݱ��������̣߳���ȡ�������Ľӿ�
	 */
	private HttpThreadListener mHttpThreadAction = new HttpThreadListener() {

		@Override
		public HttpRequest getHttpRequest() {

			synchronized (object) {

				if (mRequestQueue.size() > 0) {
					for (HttpRequest hr : mRequestQueue) {
						if (hr.getRequestType() == HttpRequest.REQUEST_TYPE_1) {
							// ���ݱ�������
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
	 * �ļ����������̣߳���ȡ�������Ľӿ�
	 */
	private HttpThreadListener mHttpThreadDown = new HttpThreadListener() {

		@Override
		public HttpRequest getHttpRequest() {

			synchronized (object) {

				if (mRequestQueue.size() > 0) {
					for (HttpRequest hr : mRequestQueue) {
						if (hr.getRequestType() == HttpRequest.REQUEST_TYPE_2) {
							// �ļ���������
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
