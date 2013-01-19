/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.io.File;
import java.io.IOException;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.BaseSQL;
import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.ui.MainFrame;
import com.gopawpaw.kynb.db.DBException;


/**
 * 
 * @version 2012-6-16
 * @author Jason
 */
public class GppAuthorization {
	/**
	 * TAG
	 */
	private static final String TAG = GppAuthorization.class.getSimpleName();
//	private static String authorFolderPath = System.getenv("SystemRoot")
//			+ File.separator;
//	private static String authorFolderPath = System.getenv("APPDATA")
//	+ File.separator;
//	
//	private static String authorFile = "sysCsin.dll";
	
	private static GppAuthorization instance;

	
	public static String authKey = "adfsfwefs";
	
	
	/**
	 * 
	 */
	private GppAuthorization() {

//		if(!isExistAuthorizationFile()){
//			creatAuthorizationFile();
//		}
	}

	/**
	 * ���� ��Ȩ��
	 */
	public static GppAuthorization getInstance() {
		if(instance == null){
			instance = new GppAuthorization();
		}
		return instance;
	}

	/**
	 * �Ƿ������Ȩ�ļ�
	 */
//	private boolean isExistAuthorizationFile() {
//
//		File tempf = new File(authorFolderPath + authorFile);
//
//		return tempf.exists();
//	}

	/**
	 * ������Ȩ�ļ�
	 */
//	private boolean creatAuthorizationFile() {
//
//		File tempfile = new File(authorFolderPath + authorFile);
//		try {
//			tempfile.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}


	
	/**
	 * ��ȡ�豸ID
	 * 
	 * ���	�ļ�		���ݿ�	����		����
		1:  F==0	D==0	��װ		��ע��did
		2:	F==1	D==1	����ʹ��	����did
		3:	F==1	D==0	����½�ѹ	�����ļ�did�������µ����ݿ��did
		4:	F==0	D==1	���Ƶ��»�	����did=-1,���Ӳ�����к��Ƿ���did�����򷵻أ�û������ע����ӣ������»���Ȩ��ʹ��	
		5:	F==1	D==2	���Ƶ���ע���	��ע�᱾����Ȩʹ�ã����������ݿ�
	 * 
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return int
	 */
	public int getDivicesId(){
//		if(true){
//			return 0;
//		}
		//���ݿ��豸ID
		int divicesIdDB = 0;
		//�����ļ��豸ID
		int divicesIdF = 0;
		
		//ȡ�������ļ��е��豸ID
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
		String didF = PreferencesUtils.getUserData().get("divicesId","");
		didF = StringUtils.unObfuscation(didF,authKey);
		
		//ȡ�����ݿ���豸ID
		BaseSQL bs = new BaseSQL();
		try {
			String tmpDid = bs.getConfig("divicesId");
			tmpDid = StringUtils.unObfuscation(tmpDid,authKey);
			if(tmpDid == null || "".equals(tmpDid)){
				tmpDid = "0";
			}
			divicesIdDB = Integer.parseInt(tmpDid);
			
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			if(didF == null || "".equals(didF)){
				didF = "0";
			}
			divicesIdF = Integer.parseInt(didF);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		APPLog.d(TAG, "getDivicesId divicesIdDB:"+divicesIdDB);
		APPLog.d(TAG, "getDivicesId divicesIdF:"+divicesIdF);
		if(divicesIdDB == divicesIdF){
			//��ȣ�˵��������ʹ��
			return divicesIdDB;
		}else if(divicesIdF > 0){
			//�����ļ����ڣ����������ļ�Ϊ׼��ͬʱ�������ݿ�
			String temp =  StringUtils.getObfuscation(""+divicesIdF, authKey);
			try {
				bs.updateConfig("divicesId",temp);
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return divicesIdF;
		}else{
			//���Ƶ��»�	����did=-1,���Ӳ�����к��Ƿ���did�����򷵻أ�û������ע����ӣ������»���Ȩ��ʹ��	
			//���������
			return -1;
		}
		
	}
	
//	/**
//	 * �����豸Id
//	 * @version 2012-9-1
//	 * @author Jason
//	 * @param
//	 * @return void
//	 */
//	public void updateDivicesId(int divicesId){
//		APPLog.d(TAG, "updateDivicesId:"+divicesId);
//		String divices = StringUtils.getObfuscation(""+divicesId, authKey);
//		
//		BaseSQL bs = new BaseSQL();
//		try {
//			//���µ����ݿ���
//			bs.updateConfig("divicesId",divices);
//		} catch (DBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//���������ļ���
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
//		gcf.setValue("divicesId", divices);
//		gcf.saveFile();
//	}
	
	/**
	 * �Ƿ���������ʹ��
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean isOffline(){
		//ȡ�����ݿ����Ƿ�����ʹ��ֵ
		BaseSQL bs = new BaseSQL();
		String isOfflineDB = "n";
		try {
			isOfflineDB = bs.getConfig("isOffline");
			isOfflineDB = StringUtils.unObfuscation(isOfflineDB,authKey);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ȡ�������ļ����Ƿ�����ʹ��ֵ
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String isOfflineF = PreferencesUtils.getUserData().get("isOffline","");
		isOfflineF = StringUtils.unObfuscation(isOfflineF,authKey);
		
		
		boolean isOfflineOperation = false;
		
		if("y".equals(isOfflineDB.trim()) && "y".equals(isOfflineF.trim())){
			//�����ݿ���ļ���ֵ��ͬʱ����ʱ���������ʹ��
			isOfflineOperation = true;
		}else{
			//�������ò���������ʹ��
			String temp =  StringUtils.getObfuscation("n", authKey);
			try {
				bs.updateConfig("isOffline",temp);
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PreferencesUtils.getUserData().put("isOffline", temp);
//			gcf.setValue("isOffline", temp);
//			gcf.saveFile();
			
			isOfflineOperation = false;
		}
		
		bs.close();
		
		return isOfflineOperation;
	}
	
//	/**
//	 * ��������ʹ��
//	 * @version 2012-9-1
//	 * @author Jason
//	 * @param
//	 * @return void
//	 */
//	public void setOffline(boolean isOffline){
//		BaseSQL bs = new BaseSQL();
//		String isOfflineV = "";
//		if(isOffline){
//			isOfflineV = StringUtils.getObfuscation("y", authKey);
//		}else{
//			isOfflineV = StringUtils.getObfuscation("n", authKey);
//		}
//		
//		try {
//			//���µ����ݿ���
//			bs.updateConfig("isOffline",isOfflineV);
//		} catch (DBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//���������ļ���
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
//		gcf.setValue("isOffline", isOfflineV);
//		gcf.saveFile();
//	}
	
	/**
	 * ���������Ƿ��
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean isSupassOpen(){
		
		//ȡ�������ļ���ֵ
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String supassStatus = PreferencesUtils.getUserData().get("supassStatus","");
		supassStatus = StringUtils.unObfuscation(supassStatus,authKey);
		
		boolean flag = false;
		
		if("y".equals(supassStatus.trim())){
			//���������Ǵ�
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}
	
	/**
	 * �ж��Ƿ��Ѿ����͹���������
	 * @version 2012-9-10
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean hasSendSupass(){
		
		//ȡ�������ļ���ֵ
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String hasSend = PreferencesUtils.getUserData().get("hasSend","");
		hasSend = StringUtils.unObfuscation(hasSend,authKey);
		
		boolean flag = false;
		
		if("y".equals(hasSend.trim())){
			//���������Ƿ��Ѿ�����
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}

	public void setHasSendSupass(boolean flag){
		
		String hasSend = flag ? "y":"n";
		hasSend = StringUtils.getObfuscation(""+hasSend, authKey);
		//���������ļ���
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
//		gcf.setValue("hasSend", hasSend);
//		gcf.saveFile();
		
		PreferencesUtils.getUserData().put("hasSend", hasSend);
	}
	/**
	 * ��ȡ������ܿ�ʼ
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return int
	 */
	public static int getSupassStart(){
		
		//ȡ�������ļ����Ƿ�����ʹ��ֵ
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String supassStart = PreferencesUtils.getUserData().get("supassStart","");
		supassStart = StringUtils.unObfuscation(supassStart,authKey);
		
		int start = 3;
		
		try{
			start = Integer.parseInt(supassStart);
		}catch(Exception e){
			
		}
		
		APPLog.d(TAG, "getSupassStart"+start);
		return start;
	}
	
	/**
	 * ��ȡ������ܽ���
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return int
	 */
	public static  int getSupassEnd(){
		
		//ȡ�������ļ����Ƿ�����ʹ��ֵ
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String supassEnd = PreferencesUtils.getUserData().get("supassEnd","");
		supassEnd = StringUtils.unObfuscation(supassEnd,authKey);
		
		int end = 26;
		
		try{
			end = Integer.parseInt(supassEnd);
		}catch(Exception e){
			
		}
		APPLog.d(TAG, "getSupassEnd"+end);
		return end;
	}
	
	/**
	 * �����豸������Ϣ
	 * @version 2012-9-8
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void updateDivicesConfig(int divicesId,String isOffline,String supassStatus,String supassStart,String supassEnd){
		
		String divices = StringUtils.getObfuscation(""+divicesId, authKey);
		isOffline = StringUtils.getObfuscation(""+isOffline, authKey);
		supassStatus = StringUtils.getObfuscation(""+supassStatus, authKey);
		supassStart = StringUtils.getObfuscation(""+supassStart, authKey);
		supassEnd = StringUtils.getObfuscation(""+supassEnd, authKey);
		
		BaseSQL bs = new BaseSQL();
		try {
			//���µ����ݿ���
			bs.updateConfig("divicesId",divices);
			bs.updateConfig("isOffline",isOffline);
			bs.updateConfig("supassStatus",supassStatus);
			bs.updateConfig("supassStart",supassStart);
			bs.updateConfig("supassEnd",supassEnd);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���������ļ���
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
		PreferencesUtils.getUserData().put("divicesId", divices);
		PreferencesUtils.getUserData().put("isOffline", isOffline);
		PreferencesUtils.getUserData().put("supassStatus", supassStatus);
		PreferencesUtils.getUserData().put("supassStart", supassStart);
		PreferencesUtils.getUserData().put("supassEnd", supassEnd);
	}
	
	public void updateDivicesSupass(String isOffline,String supassStatus){
		
		isOffline = StringUtils.getObfuscation(""+isOffline, authKey);
		supassStatus = StringUtils.getObfuscation(""+supassStatus, authKey);
		
		BaseSQL bs = new BaseSQL();
		try {
			//���µ����ݿ���
			bs.updateConfig("isOffline",isOffline);
			bs.updateConfig("supassStatus",supassStatus);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���������ļ���
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
		PreferencesUtils.getUserData().put("isOffline", isOffline);
		PreferencesUtils.getUserData().put("supassStatus", supassStatus);
	}

	public static String genDisplayCode(String diskID) {
		MD5 md5 = new MD5();

		return md5.getMD5ofStr(diskID);
	}

	public static String genKeyCode(String displayCode) {
		
		String k3 = displayCode.substring(getSupassStart(), getSupassEnd());
		
		MD5 md5 = new MD5();
		
		return md5.getMD5ofStr(k3);
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1000;i<1008;i++){
			String kk = ""+i;
//			System.out.println(" = " +StringUtils.getObfuscation("0",authKey));
			System.out.println(genDisplayCode(kk));
		}
		System.out.println(genDisplayCode("0"));
		
//		System.out.println(	StringUtils.unObfuscation(StringUtils.getObfuscation(AuthTimes,authKey),authKey));
//		GlobalParameter.initialize();
//		System.out.println(GppAuthorization.getInstance().checkAuthTimes());
//	


	}

}
