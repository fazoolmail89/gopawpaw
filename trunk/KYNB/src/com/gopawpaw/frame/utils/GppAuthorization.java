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
	 * 返回 授权类
	 */
	public static GppAuthorization getInstance() {
		if(instance == null){
			instance = new GppAuthorization();
		}
		return instance;
	}

	/**
	 * 是否存在授权文件
	 */
//	private boolean isExistAuthorizationFile() {
//
//		File tempf = new File(authorFolderPath + authorFile);
//
//		return tempf.exists();
//	}

	/**
	 * 创建授权文件
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
	 * 获取设备ID
	 * 
	 * 情况	文件		数据库	条件		处理
		1:  F==0	D==0	新装		新注册did
		2:	F==1	D==1	正常使用	上送did
		3:	F==1	D==0	多次新解压	上送文件did，并更新到数据库的did
		4:	F==0	D==1	复制到新机	上送did=-1,检查硬件序列号是否有did，有则返回，没有则新注册机子，并已新机授权，使用	
		5:	F==1	D==2	复制到已注册机	以注册本机授权使用，并更新数据库
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
		//数据库设备ID
		int divicesIdDB = 0;
		//配置文件设备ID
		int divicesIdF = 0;
		
		//取出配置文件中的设备ID
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
		String didF = PreferencesUtils.getUserData().get("divicesId","");
		didF = StringUtils.unObfuscation(didF,authKey);
		
		//取出数据库的设备ID
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
			//相等，说明是正常使用
			return divicesIdDB;
		}else if(divicesIdF > 0){
			//配置文件存在，则以配置文件为准，同时更新数据库
			String temp =  StringUtils.getObfuscation(""+divicesIdF, authKey);
			try {
				bs.updateConfig("divicesId",temp);
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return divicesIdF;
		}else{
			//复制到新机	上送did=-1,检查硬件序列号是否有did，有则返回，没有则新注册机子，并已新机授权，使用	
			//或其他情况
			return -1;
		}
		
	}
	
//	/**
//	 * 更新设备Id
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
//			//更新到数据库中
//			bs.updateConfig("divicesId",divices);
//		} catch (DBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//保存配置文件中
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
//		gcf.setValue("divicesId", divices);
//		gcf.saveFile();
//	}
	
	/**
	 * 是否允许离线使用
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean isOffline(){
		//取出数据库标记是否离线使用值
		BaseSQL bs = new BaseSQL();
		String isOfflineDB = "n";
		try {
			isOfflineDB = bs.getConfig("isOffline");
			isOfflineDB = StringUtils.unObfuscation(isOfflineDB,authKey);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//取出配置文件中是否离线使用值
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String isOfflineF = PreferencesUtils.getUserData().get("isOffline","");
		isOfflineF = StringUtils.unObfuscation(isOfflineF,authKey);
		
		
		boolean isOfflineOperation = false;
		
		if("y".equals(isOfflineDB.trim()) && "y".equals(isOfflineF.trim())){
			//若数据库和文件的值都同时允许时，则可离线使用
			isOfflineOperation = true;
		}else{
			//重新设置不允许离线使用
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
//	 * 设置离线使用
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
//			//更新到数据库中
//			bs.updateConfig("isOffline",isOfflineV);
//		} catch (DBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//保存配置文件中
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
//		gcf.setValue("isOffline", isOfflineV);
//		gcf.saveFile();
//	}
	
	/**
	 * 超级密码是否打开
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean isSupassOpen(){
		
		//取出配置文件中值
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String supassStatus = PreferencesUtils.getUserData().get("supassStatus","");
		supassStatus = StringUtils.unObfuscation(supassStatus,authKey);
		
		boolean flag = false;
		
		if("y".equals(supassStatus.trim())){
			//超级密码是打开
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}
	
	/**
	 * 判断是否已经发送过超级密码
	 * @version 2012-9-10
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean hasSendSupass(){
		
		//取出配置文件中值
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		String hasSend = PreferencesUtils.getUserData().get("hasSend","");
		hasSend = StringUtils.unObfuscation(hasSend,authKey);
		
		boolean flag = false;
		
		if("y".equals(hasSend.trim())){
			//超级密码是否已经发送
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}

	public void setHasSendSupass(boolean flag){
		
		String hasSend = flag ? "y":"n";
		hasSend = StringUtils.getObfuscation(""+hasSend, authKey);
		//保存配置文件中
//		GppConfiguration gcf = new GppConfiguration(
//				authorFolderPath
//						+ authorFile);
		
//		gcf.setValue("hasSend", hasSend);
//		gcf.saveFile();
		
		PreferencesUtils.getUserData().put("hasSend", hasSend);
	}
	/**
	 * 获取密码加密开始
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return int
	 */
	public static int getSupassStart(){
		
		//取出配置文件中是否离线使用值
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
	 * 获取密码加密结束
	 * @version 2012-9-1
	 * @author Jason
	 * @param
	 * @return int
	 */
	public static  int getSupassEnd(){
		
		//取出配置文件中是否离线使用值
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
	 * 更新设备配置信息
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
			//更新到数据库中
			bs.updateConfig("divicesId",divices);
			bs.updateConfig("isOffline",isOffline);
			bs.updateConfig("supassStatus",supassStatus);
			bs.updateConfig("supassStart",supassStart);
			bs.updateConfig("supassEnd",supassEnd);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//保存配置文件中
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
			//更新到数据库中
			bs.updateConfig("isOffline",isOffline);
			bs.updateConfig("supassStatus",supassStatus);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//保存配置文件中
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
