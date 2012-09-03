package com.gopawpaw.frame.http.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.http.HttpConnector;
import com.gopawpaw.frame.http.HttpHelper;
import com.gopawpaw.frame.http.HttpListener;
import com.gopawpaw.frame.http.HttpRequest;
import com.gopawpaw.frame.http.HttpResponse;
import com.gopawpaw.frame.http.URLResource;
import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.paser.DataHashMapParser;
import com.gopawpaw.frame.struct.AppKeyConstants;
import com.gopawpaw.frame.struct.DataHashMap;
import com.gopawpaw.frame.utils.FileUtil;
import com.gopawpaw.frame.utils.GppAuthorization;

/**
 * 
 * @version 2012-9-2
 * @author Jason
 */
public class LogHttpAction {

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
	
	private static LogHttpAction sLogHttpAction;
	
	private String productId;
	
	private String version = "";
	
	private String divicesId = "";
	
	private boolean isRegister = false;
	
	private String overduetype = "0";
	
	private String overduevaluse = "0";
	
	private String overduemsg = "0";
	
	/**
	 * ����ģʽ
	 */
	private LogHttpAction() {
		productId = GlobalParameter.PRODUCT_ID;
		version = GlobalParameter.SOFT_VERSION;
		divicesId = ""+GppAuthorization.getInstance().getDivicesId();
	}

	public static LogHttpAction getInstance(){
		if(sLogHttpAction == null){
			sLogHttpAction = new LogHttpAction();
		}
		return sLogHttpAction;
	}
	
	/**
	 * �ύLOG
	 * @version 2012-9-2
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void Log(String mpackage,String mmenu,String mname){
		
		String isreg = isRegister ? "y":"n";
		
		HashMap<String,String> pMap = new HashMap<String,String>();
		
		pMap.put(URLResource.KEY_DID, divicesId);
		pMap.put(URLResource.KEY_PRODUCT, productId);
		pMap.put(URLResource.KEY_VERSION, version);
		pMap.put(URLResource.KEY_MPACKAGE, mpackage);
		pMap.put(URLResource.KEY_MMENU, mmenu);
		pMap.put(URLResource.KEY_MNAME, mname);
		pMap.put(URLResource.KEY_ISREG, isreg);
		pMap.put(URLResource.KEY_OVERDUETYPE, overduetype);
		pMap.put(URLResource.KEY_OVERDUEVALUSE, overduevaluse);
		
		pMap.put(URLResource.KEY_OVERDUEMSG, overduemsg);
		
		sendRequest(URLResource.URL_LOGPRODUCT,pMap,true);
	}
	
	
	/**
	 * ����URL����
	 * @param urlId ����UrlId
	 * @param connectionId ��������Id
	 * @param paramObj ��������ֵ�
	 * @param isLog true:connectionId������ɣ�false:connectionId=0
	 */
	private void sendRequest(int urlId,Object paramObj,boolean isLog) {
		int connectionId =  0;
		if(isLog){
			connectionId = sRandom.nextInt();
		}
		sendRequest(urlId, connectionId, mHttpListener, paramObj, false);
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

	private HttpListener mHttpListener = new HttpListener(){

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
					APPLog.e(TAG, "�ύ��־ʧ��");

					return;
				}

				//�������ݽ���
				data = actionParse(bs);

				if (data == null) {
					// ���ݽ���ʧ��
					APPLog.e(TAG, "�ύ��־ʧ��");
				} else {
					// ��ȡ������
					errCode = checkErrorCode(data, httpResponse.getHttpRequest()
							.getUrlId());
					
					if (errCode == HttpActionListener.STATE_SUCCESS) {
						//�������ǳɹ�
						APPLog.e(TAG, "�ύ��־�ɹ�");
					}
				}
				
			} else {
				APPLog.e(TAG, "�ύ��־ʧ��");
			}
		}
		
	};

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

	public boolean isRegister() {
		return isRegister;
	}

	public void setRegister(boolean isRegister) {
		this.isRegister = isRegister;
	}

	public String getOverduetype() {
		return overduetype;
	}

	public void setOverduetype(String overduetype) {
		this.overduetype = overduetype;
	}

	public String getOverduevaluse() {
		return overduevaluse;
	}

	public void setOverduevaluse(String overduevaluse) {
		this.overduevaluse = overduevaluse;
	}

	public String getOverduemsg() {
		return overduemsg;
	}

	public void setOverduemsg(String overduemsg) {
		this.overduemsg = overduemsg;
	}

}