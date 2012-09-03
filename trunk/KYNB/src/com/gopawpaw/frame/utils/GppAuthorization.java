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
	private static String authorFolderPath = System.getenv("SystemRoot")
			+ File.separator;

	private static String authorFile = "sysCsin.dll";
	
	private static GppAuthorization instance;

	
	public static String authKey = "adfsfwefs";
	
	/**
	 * 
	 */
	private GppAuthorization() {

		if(!isExistAuthorizationFile()){
			creatAuthorizationFile();
			
			initAuthTimes();
		}
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

	private void initAuthTimes(){
		
		int authFD = getAuthTimesFromDB();
		String aTime=""+authFD;
		
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		
		gcf.setValue("Times", StringUtils.getObfuscation(aTime,authKey));
		gcf.saveFile();
		
		
		//�������ݿ���Ȩ
		BaseSQL bs = new BaseSQL();
		try {
			bs.updateConfig("UT", StringUtils.getObfuscation(aTime,authKey));
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bs.close();
	}
	/**
	 * �����Ȩ����
	 * @version 2012-6-16
	 * @author Jason
	 * @param
	 * @return int
	 */
	public int checkAuthTimes(){
		int authFF = getAuthTimesFromFile();
		int authFD = getAuthTimesFromDB();
		
		if(authFF == -1 && authFD == -1){
			//�Ƿ���Ȩ
			return -1;
		}
		
		if(authFF == 0 && authFD == 0){
			//������Ȩ����
			return 0;
		}
		
		if(authFF == -2 || authFD == -2){
			//������Ȩ
			return -2;
		}
		
		if(authFF != authFD){
			//�����������ʱ��˵���и��Ĺ����е�һ������ȡ��Сֵ
			if(authFF < authFD){
				//ȷ��������ȣ�ȡ��С
				authFD= authFF;
			}else{
				authFF = authFD;
			}
		}
		
		authFD--;
		authFF--;
		
		//�����ļ���Ȩ
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		gcf.setValue("Times", StringUtils.getObfuscation(""+authFF,authKey));
		gcf.saveFile();
		
		//�������ݿ���Ȩ
		BaseSQL bs = new BaseSQL();
		try {
			bs.updateConfig("UT", StringUtils.getObfuscation(""+authFD,authKey));
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bs.close();
		
		
		return authFD;
	}

	/**
	 * �Ƿ������Ȩ�ļ�
	 */
	private boolean isExistAuthorizationFile() {

		File tempf = new File(authorFolderPath + authorFile);

		return tempf.exists();
	}

	/**
	 * ������Ȩ�ļ�
	 */
	private boolean creatAuthorizationFile() {

		File tempfile = new File(authorFolderPath + authorFile);
		try {
			tempfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * �����ݿ��л�ȡ��Ȩ
	 * @version 2012-6-16
	 * @author Jason
	 * @param
	 * @return int
	 */
	private int getAuthTimesFromDB(){
		BaseSQL bs = new BaseSQL();
		int ret = -1;
		String ut = "-1";
		try {
			ut = bs.getConfig("UT");
			ut = StringUtils.unObfuscation(ut,authKey);
			ret = Integer.parseInt(ut);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bs.close();
		return ret;
	}

	/**
	 * ���ļ��л�ȡ��Ȩ
	 * @version 2012-6-16
	 * @author Jason
	 * @param
	 * @return int
	 */
	private int getAuthTimesFromFile(){
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		String times = gcf.getValue("Times");
		times = StringUtils.unObfuscation(times,authKey);
		int t = -1;
		
		try {
			t = Integer.parseInt(times);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return t;
	}
	
	/**
	 * ��ע����л�ȡ��Ȩ
	 * @version 2012-6-16
	 * @author Jason
	 * @param
	 * @return int
	 */
	private int getAuthTimesFromReg(){
		
		return 1;
	}
	
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
		//���ݿ��豸ID
		int divicesIdDB = 0;
		//�����ļ��豸ID
		int divicesIdF = 0;
		
		//ȡ�������ļ��е��豸ID
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		String didF = gcf.getValue("divicesId");
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
	
	/**
	 * �����豸Id
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void updateDivicesId(int divicesId){
		APPLog.d(TAG, "updateDivicesId:"+divicesId);
		String divices = StringUtils.getObfuscation(""+divicesId, authKey);
		
		BaseSQL bs = new BaseSQL();
		try {
			//���µ����ݿ���
			bs.updateConfig("divicesId",divices);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���������ļ���
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		gcf.setValue("divicesId", divices);
		gcf.saveFile();
	}
	
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
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		String isOfflineF = gcf.getValue("isOffline");
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
			
			gcf.setValue("isOffline", temp);
			gcf.saveFile();
			
			isOfflineOperation = false;
		}
		
		bs.close();
		
		return isOfflineOperation;
	}
	
	/**
	 * ��������ʹ��
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void setOffline(boolean isOffline){
		BaseSQL bs = new BaseSQL();
		String isOfflineV = "";
		if(isOffline){
			isOfflineV = StringUtils.getObfuscation("y", authKey);
		}else{
			isOfflineV = StringUtils.getObfuscation("n", authKey);
		}
		
		try {
			//���µ����ݿ���
			bs.updateConfig("isOffline",isOfflineV);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���������ļ���
		GppConfiguration gcf = new GppConfiguration(
				authorFolderPath
						+ authorFile);
		gcf.setValue("isOffline", isOfflineV);
		gcf.saveFile();
	}
	
	public static String genDisplayCode(String diskID) {
		MD5 md5 = new MD5();

		return md5.getMD5ofStr(diskID);
	}

	public static String genKeyCode(String displayCode) {
		String k3 = displayCode.substring(3, 16);

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
