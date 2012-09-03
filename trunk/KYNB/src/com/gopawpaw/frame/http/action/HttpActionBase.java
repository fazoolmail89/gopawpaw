/*
 * ��  ��   ���� HttpActionBase.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-4-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
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
 * Http�������
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
	 * ��ʾ��ʾ��Ϣ
	 */
	public static final int MSG_SHOW_ALERTDIALOG = 101;

	/**
	 * ���������������log��connectionId
	 */
	private static final Random sRandom = new Random();
	
	/**
	 * ���������JInternalFrame
	 */
	private Component mComponent;

	/**
	 * �ص��ӿ�
	 */
	private HttpActionListener httpActionListener;

	/**
	 * [�����Ҫ˵��]
	 * 
	 * @param httpActionListener
	 */
	public HttpActionBase(HttpActionListener httpActionListener,
			Component component) {

		this.httpActionListener = httpActionListener;
		this.mComponent = component;
	}

	/**
	 * ����RUL����
	 * 
	 * @param urlId
	 */
	public void sendRequest(int urlId) {
		sendRequest(urlId, 0, this, null, false);
	}

	/**
	 * ����URL����
	 * @param urlId ����UrlId
	 * @param connectionId ��������Id
	 */
	public void sendRequest(int urlId,int connectionId) {
		sendRequest(urlId, connectionId, this, null, false);
	}
	
	/**
	 * ����URL����
	 * @param urlId ����UrlId
	 * @param connectionId ��������Id
	 * @param paramObj ��������ֵ�
	 */
	public void sendRequest(int urlId,int connectionId,Object paramObj) {
		sendRequest(urlId, connectionId, this, paramObj, false);
	}
	
	/**
	 * ����URL����
	 * @param urlId ����UrlId
	 * @param connectionId ��������Id
	 * @param paramObj ��������ֵ�
	 * @param isLog true:connectionId������ɣ�false:connectionId=0
	 */
	public void sendRequest(int urlId,Object paramObj,boolean isLog) {
		int connectionId =  0;
		if(isLog){
			connectionId = sRandom.nextInt();
		}
		sendRequest(urlId, connectionId, this, paramObj, false);
	}
	
	/**
	 * ����URL����
	 * @param urlId ����UrlId
	 * @param connectionId ��������Id
	 * @param paramObj ��������ֵ�
	 * @param remove ������֮ǰ����������
	 */
	public void sendRequest(int urlId,int connectionId,Object paramObj,boolean remove) {
		sendRequest(urlId, connectionId, this, paramObj, remove);
	}
	
	/**
	 * ����URL����
	 * @param urlId
	 *            ����UrlId
	 * @param connectionId
	 *            ��������Id
	 * @param httpListener
	 *            ���������
	 * @param paramObj
	 *            ��������ֵ�
	 * @param remove
	 *            ������֮ǰ����������
	 */
	private void sendRequest(int urlId, int connectionId,
			HttpListener httpListener, Object paramObj, boolean remove) {
		Object object = null;
		object = HttpActionDataCache.getCache(urlId, connectionId);
		if (object != null) {
			// ���ݴӻ���ȡ��ֱ�ӷ��ظ�ҳ��
			onFinish(object, urlId, connectionId);
			return;
		} else {
			// ���治�������ݣ�����Http��������

		}

		if (!NetworkManagement.IsNetWordLinking()) {
			APPLog.e(TAG, "���粻����");

//			String errMsg = "��ǰ���粻���ã����������������ӣ�";
//			showErrorMsg(errMsg);

			httpActionListener.onHttpActionResponse(
					HttpActionListener.STATE_NETWORK_ENABLE, null, urlId, connectionId);

			return;
		}

		int mode = HttpRequest.REQUEST_MODE_3;

		if (remove) {
			// ����������
			mode = HttpRequest.REQUEST_MODE_1;
		}

		String url = HttpHelper.getUrlById(urlId);
		String data = HttpHelper.getRequestURLParam(paramObj, urlId);

		// �����µ�����
		HttpRequest request = new HttpRequest(url, data, httpListener, mode,
				HttpRequest.REQUEST_TYPE_1, HttpRequest.REQUEST_METHOD_POST);
		request.setUrlId(urlId);
		request.setConnectionId(connectionId);

		// ����Http����
		HttpConnector.sendHttpRequest(request);

	}

	/**
	 * ��ȡ�������ݺ�������ҳ��ص�����
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
			// Http���سɹ�
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
				//���ݶ�ȡʧ��
				APPLog.e(TAG, "���ݶ�ȡʧ��");

//				String errMsg = "���ݶ�ȡʧ�ܣ����Ժ����ԣ�";
//				showErrorMsg(errMsg);
				errCode = HttpActionListener.STATE_FAILED;
				
				actionResponse(errCode, data, httpResponse
						.getHttpRequest().getUrlId(), httpResponse.getHttpRequest()
						.getConnectionId());
				return;
			}
			
			if (APPLog.IS_DEBUG) {
				// ����ģʽ�£���ӡ�����������صı���
				APPLog.d(TAG, new String(bs));
			}

			//�������ݽ���
			data = actionParse(bs);

			if (data == null) {
				// ���ݽ���ʧ��
				APPLog.e(TAG, "���ݽ���ʧ��");

//				String errMsg = "��������ʧ�ܣ����Ժ����ԣ�";
//				showErrorMsg(errMsg);
				errCode = HttpActionListener.STATE_FAILED;
			} else {
				// ��ȡ������
//				String errMsg = "OK������";
//				showErrorMsg(errMsg);
				errCode = checkErrorCode(data, httpResponse.getHttpRequest()
						.getUrlId());
				
				if (errCode == HttpActionListener.STATE_SUCCESS) {
					//�������ǳɹ���������ݽ��л���
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
			// Http���󷵻�
//			String errMsg = "����������������⣬�����ԣ�";
//			showErrorMsg(errMsg);
			
			actionResponse(
						HttpActionListener.STATE_NETWORK_ENABLE, data, httpResponse
						.getHttpRequest().getUrlId(), httpResponse
						.getHttpRequest().getConnectionId());
			
		}
	}

	/**
	 * ִ����Ӧ
	 * @param state
	 * @param data
	 * @param urlId
	 * @param connectionId
	 */
	private void actionResponse(int state, Object data, int urlId, int connectionId){
		if(mComponent != null && mComponent.isVisible()){
			//��ǰ��ҳ�滹����ʾʱ����ص�
			httpActionListener.onHttpActionResponse(state, data, urlId, connectionId);
		}
	}
	
	/**
	 * ִ�н���
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
	 * ���errCode������errCode���ǳɹ�״̬������ʾ��Ϣ<br>
	 * ����ϵͳ���󽫻��ڴ˱�����
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
			// �ɹ����� 000
			state = 0;
		}
			break;
		case 1: { 
			// ҵ�񼶴��� 001
			state = 1;
			}
			break;
		case 9: {
			// ϵͳ������� 009
			state = 9;
			}
			break;
		case 100: { 
			// Session��û�пͻ���Ϣ 100
			state = 100;

			}
			break;
		case 101: { 
			// �������ͻ����ݲ���ʹ�� 101
			state = 101;
			}
			break;
		case 102: { 
			// �û������������ 102
			state = 102;
			}
			break;
		case 104: { 
			// ��½ʱ��֤����� 104
			state = 104;
			}
			break;
		case 105: { 
			// ��½ʱ��֤����� 105
			state = 105;
			}
			break;
		case 200: { 
			// OTPУ��ʧ�� 200
			state = 200;
			}
			break;
		case 201: { 
			// OTP����ʧ�� 201
			state = 201;
			}
			break;
		case 400: { 
			// Session��ʱ 400
			state = 400;

			break;
			}
		case 303: {
			// ���ݲ���ʹ�øù��ܣ������
			state = 303;
			}
			break;
		case 111: { 
			// ��ѯ�޼�¼������ʧ��
			state = 111;
			}
			break;
		default: {
			// Ĭ�ϴ���
			state = 11212;
			}
		}

		return state;
	}


	/**
	 * 
	 * [���ͳһ��ʾ��Ϣ��������]<BR>
	 * 
	 * @param errMsg
	 *            ������ʾ��Ϣ
	 */
//	private void showErrorMsg(String errMsg) {
//		JOptionPane.showConfirmDialog(mComponent, errMsg);
//	}

}
