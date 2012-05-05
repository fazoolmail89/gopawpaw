/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @version 2010-1-9
 * @author 李锦华
 * 		<p>
 * 			Windows命令行（CMD）类
 * 		</p>
 */
public class GppCmdShell {

	static GppCmdShell cmdShell = new GppCmdShell();
	
	/**
	 * 
	 */
	public GppCmdShell() {
		super();
	}

	/**
	 * 命令行内部调用
	 * @param cmd
	 * @return
	 */
	private static final ArrayList<String> cmdAction(String cmd) {
		ArrayList<String> al = new ArrayList<String>();
		Runtime rt = Runtime.getRuntime();
		String c5 = "cmd.exe /C " + cmd;
		try {
			Process pr = rt.exec(c5);
			BufferedReader br = new BufferedReader(new InputStreamReader(pr
					.getInputStream()));
			while (true) {
				String s = br.readLine();
				if (s == null)
					break;
				if(!s.isEmpty())
					al.add(s);
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return al;
	}
	
	/**
	 * 执行命令行
	 * @param cmdstr	命令行字符串
	 * 
	 * @return	ArrayList<String> 获取命令行执行返回结果列表
	 */
	public static ArrayList<String> actionCommand(String cmdstr){
		return cmdAction(cmdstr);
	}
	
	/**
	 * action:	netstat -an
	 * @return
	 */
	public ArrayList<String> getActiveConnections(){
		return cmdAction("netstat -an");
	}
}
