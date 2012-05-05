/**
 * 
 */
package com.gopawpaw.kynb.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.frame.utils.GppCmdShell;
import com.gopawpaw.frame.utils.GppConfiguration;

/**
 * @version 2012-4-10
 * @author LiJinHua
 */
public class MySQLUtils {

	private static String courrenPath = System.getProperties().getProperty("user.dir");
	
	/**
	 * 初始化mysql配置
	 * @version 2012-4-10
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static void initMySQLConfig(){
		
		
		
		String mysqlPath = courrenPath+File.separator+"DBCenter/mysql";
		
		String filename = mysqlPath+"/my.ini";
		GppConfiguration gconfig = new GppConfiguration(filename);
		
		mysqlPath = mysqlPath.replace("\\", "/");
		
		gconfig.setValue("basedir", mysqlPath);
		gconfig.setValue("datadir", mysqlPath+"/data");
		
		gconfig.saveFile();
	
	}
	
	/**
	 * 启动mysql服务
	 * @version 2012-4-10
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static boolean startMySQLService(){
		
		String cmdstr = "D:\\Eclipse_Workspace\\KYNB\\DBCenter\\mysql\\bin\\startmysql.bat";
		
//		String oldPath = System.getProperty("user.dir");
//		System.setProperty("user.dir", oldPath+"\\DBCenter\\mysql\\bin");
//		GLog.d("cmdstr", oldPath);
//		String command = " start /min " + cmdstr;
//		ArrayList<String> al  = GppCmdShell.actionCommand(command);
//		System.setProperty("user.dir", oldPath);
		ArrayList<String> al = new ArrayList<String>();
		Runtime rt = Runtime.getRuntime();
		String temp  = "cmd.exe /k  D:\\Eclipse_Workspace\\KYNB\\DBCenter\\mysql\\bin\\mysqld --install MySQL \n" +
				"sc config MySQL start= auto \n" +
				"net start mysql";
		String[] cmdarray = new String[]{"cmd.exe /c  mysqld --install MySQL ","cmd.exe /c sc config MySQL start= auto ","cmd.exe /c net start mysql"};
		String[] cmdarray2 = new String[]{cmdstr};
		
		String[] envp = new String[]{"Path=D:\\Eclipse_Workspace\\KYNB\\DBCenter\\mysql\\bin"};
		try {
			Process pr = rt.exec(cmdstr,envp);
			BufferedReader br = new BufferedReader(new InputStreamReader(pr
					.getInputStream()));
			while (true) {
				String s = br.readLine();
				if (s == null)
					break;
				if(!s.isEmpty())
					al.add(s);
				GLog.d("list", s);
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	
		return false;
	}
	
	/**
	 * 停止mysql服务
	 * @version 2012-4-10
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static boolean stopMySQLService(){
		
		return false;
	}
	
	public static void main(String[] args) {
		startMySQLService();
	}
}
