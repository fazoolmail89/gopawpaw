/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.io.File;
import java.io.IOException;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.BaseSQL;
import com.gopawpaw.kynb.db.DBException;


/**
 * 
 * @version 2012-6-16
 * @author Jason
 */
public class GppAuthorization {

	private static String authorFolderPath = System.getenv("SystemRoot")
			+ File.separator;

	private static String authorFile = "goAuthorization.dll";
	
	private static GppAuthorization instance;

	/**
	 * ��ʼ��Ȩ����
	 */
	public static String AuthTimes = "60";
	
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
		String aTime="0";
		if(authFD == -1){
			aTime = AuthTimes;
		}else{
			aTime = ""+authFD;
		}
		
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
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(	StringUtils.getObfuscation(AuthTimes,authKey));
		
		System.out.println(	StringUtils.unObfuscation(StringUtils.getObfuscation(AuthTimes,authKey),authKey));
		GlobalParameter.initialize();
		System.out.println(GppAuthorization.getInstance().checkAuthTimes());
	


	}

}
