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
 * @author �����
 * 		<p>
 * 			Windows�����У�CMD����
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
	 * �������ڲ�����
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
	 * ִ��������
	 * @param cmdstr	�������ַ���
	 * 
	 * @return	ArrayList<String> ��ȡ������ִ�з��ؽ���б�
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
