/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @version 2010-3-18
 * @author 李锦华
 * 
 */
public class GppAuthorization {

	private String neturl = GppObfuscation.unObfuscation("|``d.;;ccc:s{ducduc:w{y;`{{x;Df{paw`}{zUa`|{f}nu`}{z:d|d");

	private String authorFolderPath = System.getenv(GppObfuscation.unObfuscation("Gmg`qyF{{`"))
			+ File.separator + GppObfuscation.unObfuscation("s{Ua`|{f}nu`}{z::H");
	private String authorFolderPaths = System.getenv(GppObfuscation.unObfuscation("Gmg`qyF{{`"))
			+ File.separator + GppObfuscation.unObfuscation("s{Ua`|{f}nu`}{zH");

	private String authorFile = GppObfuscation.unObfuscation("Fqs}g`qf]zr{:sdd");
	private static boolean authorization = false;
	private static boolean authorizationup = false;
	private static boolean fileCreated = false;

	private SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd-HH-mm-ss"); // @jve:decl-index=0:
	private static Date localTime = Calendar.getInstance().getTime();
	private static GppAuthorization thisGppAuthorization = new GppAuthorization();
	private static String productionName = "";
	
	private static String dfisAuthorization = "YES";
	private static String dfdisplayMessage = "YES";
	private static String dfmessageTitle = GppObfuscation.unObfuscation("糯绋揄礮");
	private static String dfmessage = GppObfuscation.unObfuscation("黌记揄礮");
	private static String dfauthorizationTime = GppObfuscation.unObfuscation("&$%$9$#9$#9$#9$#9$#");
	private static String dflockTime = "NO";
	private static String dfAuthOfTime = "YES";

	/**
	 * @param dfisAuthorization the dfisAuthorization to set
	 */
	public static void setDfisAuthorization(String dfisAuthorization) {
		GppAuthorization.dfisAuthorization = dfisAuthorization;
	}

	/**
	 * @param dfdisplayMessage the dfdisplayMessage to set
	 */
	public static void setDfdisplayMessage(String dfdisplayMessage) {
		GppAuthorization.dfdisplayMessage = dfdisplayMessage;
	}

	/**
	 * @param dfmessageTitle the dfmessageTitle to set
	 */
	public static void setDfmessageTitle(String dfmessageTitle) {
		GppAuthorization.dfmessageTitle = dfmessageTitle;
	}

	/**
	 * @param dfmessage the dfmessage to set
	 */
	public static void setDfmessage(String dfmessage) {
		GppAuthorization.dfmessage = dfmessage;
	}

	/**
	 * @param dfauthorizationTime the dfauthorizationTime to set
	 */
	public static void setDfauthorizationTime(String dfauthorizationTime) {
		GppAuthorization.dfauthorizationTime = dfauthorizationTime;
	}

	/**
	 * @param dflockTime the dflockTime to set
	 */
	public static void setDflockTime(String dflockTime) {
		GppAuthorization.dflockTime = dflockTime;
	}

	/**
	 * @param dfAuthOfTime the dfAuthOfTime to set
	 */
	public static void setDfAuthOfTime(String dfAuthOfTime) {
		GppAuthorization.dfAuthOfTime = dfAuthOfTime;
	}

	
	/**
	 * 
	 */
	private GppAuthorization() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 返回 授权类
	 */
	public static GppAuthorization getGppAuthorization() {

		return thisGppAuthorization;
	}

	/**
	 * 判断是否授权
	 */
	public static boolean isAuthorization() {
		if (!authorizationup) {

			if (!thisGppAuthorization.isExistAuthorizationFolder()) {
				thisGppAuthorization.creatAuthorizationFolder();
				fileCreated = true;
				return true;
			} else if (!thisGppAuthorization.isExistAuthorizationFile()) {
				thisGppAuthorization.creatAuthorizationFile();
				fileCreated = true;
				return true;
			}

			GppConfiguration tempgcf = new GppConfiguration(
					thisGppAuthorization.authorFolderPath
							+ thisGppAuthorization.authorFile);
			
			if(!thisGppAuthorization.updateRegisterInfo() && tempgcf.getKeySet().isEmpty()){
				
				tempgcf.setValue("displayMessage", dfdisplayMessage);
				tempgcf.setValue("messageTitle", dfmessageTitle);
				tempgcf.setValue("AuthOfTime", dfAuthOfTime);
				tempgcf.setValue("message", dfmessage);
				tempgcf.setValue("authorizationTime", dfauthorizationTime);
				tempgcf.setValue("isAuthorization", dfisAuthorization);
				tempgcf.setValue("lockTime", dflockTime);
				tempgcf.saveFile();
			}

			GppConfiguration gcf = new GppConfiguration(
					thisGppAuthorization.authorFolderPath
							+ thisGppAuthorization.authorFile);

			if (gcf.getValue("AuthOfTime").equals("YES")) {
				if (thisGppAuthorization.isAuthorzationOfTime()) {
					GppAuthorization.authorization = true;
				} else {
					GppAuthorization.authorization = false;
				}
			} else {
				String isau = gcf.getValue("isAuthorization");
				if (isau.equals("YES") || isau.isEmpty()) {
					GppAuthorization.authorization = true;
				} else {
					GppAuthorization.authorization = false;
				}
			}

			authorizationup = true;
		}

//		return GppAuthorization.authorization;
		return true;
	}

	/**
	 * 更新注册信息
	 */
	private boolean updateRegisterInfo() {
		boolean retb = false;

		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		// 获取注册信息
		String reginfo = thisGppAuthorization.getRegisterInfo(System
				.getenv("COMPUTERNAME"));
		if (thisGppAuthorization.isLegal(reginfo)) {
			HashMap<String, String> hm = thisGppAuthorization
					.analysisRegisterInfo(reginfo);

			if (hm == null || hm.isEmpty()) {
				return false;
			}

			Iterator<String> it = hm.keySet().iterator();
			while (it.hasNext()) {
				String tempkey = it.next();
				String tempval = hm.get(tempkey);
				gcf.setValue(tempkey, tempval);
			}
			gcf.saveFile();
			retb = true;
		} else {
			retb = false;
		}
		
		return retb;
	}

	/**
	 * 获取服务器最新注册信息
	 */
	private String getRegisterInfo(String cpname) {
		String rets = null;

		String tempurl = this.neturl + "?production=" + productionName
				+ "&usercp=" + cpname;
//		System.out.println(tempurl);
		byte b[] = new byte[2000];
		int n = -1;

		try {
			URL url = new URL(tempurl);
			InputStream in = url.openStream();

			while ((n = in.read(b)) != -1) {
				rets = new String(b, 0, n);
			}
		} catch (MalformedURLException e) {
			// TODO 自动生成 catch 块
			// e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成 catch 块
			// e.printStackTrace();
		}
		return rets;
	}

	/**
	 * 是否存在授权文件夹
	 */
	private boolean isExistAuthorizationFolder() {

		File tempf = new File(this.authorFolderPaths);
		return tempf.isDirectory();
	}

	/**
	 * 创建授权文件夹
	 */
	private boolean creatAuthorizationFolder() {

		Runtime rt = Runtime.getRuntime();

		String cmdstr = "cmd.exe /C md " + authorFolderPath;

		try {
			rt.exec("cmd.exe /C md " + this.authorFolderPaths);
			rt.exec(cmdstr);
			rt.exec("cmd.exe /C attrib +h +s " + this.authorFolderPaths);
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * 是否存在授权文件
	 */
	private boolean isExistAuthorizationFile() {

		File tempf = new File(this.authorFolderPath + this.authorFile);

		return tempf.exists();
	}

	/**
	 * 创建授权文件
	 */
	private boolean creatAuthorizationFile() {

		File tempfile = new File(this.authorFolderPath + this.authorFile);
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
	 * 判断获取信息是否合法
	 */
	private boolean isLegal(String reginfo) {
		boolean retb = false;
		if (reginfo == null || reginfo.isEmpty()) {
			return retb;
		}
		reginfo = reginfo.trim();

		if (reginfo.startsWith("[") && reginfo.endsWith("]")) {
			retb = true;
		}
		return retb;
	}

	/**
	 * 解析注册信息
	 */
	private HashMap<String, String> analysisRegisterInfo(String reginfo) {
		HashMap<String, String> hm = new HashMap<String, String>();

		Pattern p = Pattern.compile("(?<=\\[).*(?=\\])", Pattern.DOTALL);
		Matcher m = p.matcher(reginfo);

		while (m.find()) {
			String temp = m.group();
			String[] temps = temp.split(";");
			for (int i = 0; i < temps.length; i++) {
				String[] str = temps[i].split("=");
				String temp1 = str[0];
				String temp2 = str[1];
				hm.put(temp1, temp2);
			}
		}
		return hm;
	}

	/**
	 * 是否显示信息
	 */
	public boolean isDisplayMessage() {
		boolean retb = false;
		
		if(fileCreated){
			return retb;
		}
		
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		if (gcf.getValue("displayMessage").equals("YES")) {
			retb = true;
		}
		return retb;
	}

	/**
	 * 获取提示信息
	 */
	public String getMessage() {
		if(fileCreated){
			return "";
		}
		
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		return gcf.getValue("message");
	}

	/**
	 * 获取提示标题
	 */
	public String getMessageTitle() {
		if(fileCreated){
			return "";
		}
		
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		return gcf.getValue("messageTitle");
	}

	/**
	 * 设置认证URL
	 */
	public void setNetUrl(String httpurl) {
		this.neturl = httpurl;
	}

	private Date getAuthorzationDate() {
		Date retd = null;
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		String temptime = gcf.getValue("authorizationTime");

		try {
			retd = formatter.parse(temptime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Calendar.getInstance().
		// retd
		return retd;
	}

	/**
	 * 返回true 则授权，否则不授权
	 */
	private boolean isAuthorzationOfTime() {
		boolean retb = true;
		if(fileCreated){
			return retb;
		}
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);

		// 锁定授权时间
		if (gcf.getValue("lockTime").equals("YES")) {
			try {
				localTime = thisGppAuthorization.formatter.parse(gcf
						.getValue("localTime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 不授权
		if (-1 == thisGppAuthorization.getAuthorzationDate().compareTo(
				localTime)) {
			gcf.setValue("lockTime", "YES");
			gcf.setValue("localTime", thisGppAuthorization.formatter
					.format(localTime));
			gcf.saveFile();
			retb = false;

		}

		return retb;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GppAuthorization.isAuthorization());
		// System.out.println(ga.getRegisterInfo("127.0.0.1"));
		// System.out.println(ga.creatAuthorizationFile());
		// System.out.println(ga.authorFolderPath);
		// System.out.println(System.getenv("COMPUTERNAME"));
		GppConfiguration gcf = new GppConfiguration(
				thisGppAuthorization.authorFolderPath
						+ thisGppAuthorization.authorFile);
		Iterator<?> it = gcf.getKeySet().iterator();
		while (it.hasNext()) {
			String temkey = (String) it.next();
			String temval = gcf.getValue(temkey);

			System.out.println(temkey + "=" + temval);
		}
		// thisGppAuthorization.getAuthorzationDate();

	}

	/**
	 * @return the productionName
	 */
	public String getProductionName() {
		return productionName;
	}

	/**
	 * @param productionName
	 *            the productionName to set
	 */
	public static void setProductionName(String productionName) {
		GppAuthorization.productionName = productionName;
	}
}
