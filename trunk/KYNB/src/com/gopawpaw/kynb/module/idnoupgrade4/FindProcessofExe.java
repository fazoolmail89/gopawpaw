package com.gopawpaw.kynb.module.idnoupgrade4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProcessofExe {
	public static void main(String[] args) {
		System.out.print(findProcess("身份证号码批量升级.exe"));
	}
	public static String findProcess(String processname) {
		String returnInfo = "";
		BufferedReader bufferedreader = null;
		try {
			Process proc = Runtime.getRuntime().exec(
					" tasklist /fi \" imagename eq " + processname + " \" ");
			bufferedreader = new BufferedReader(new InputStreamReader(
					proc.getInputStream()));
			String line = null;
			while ((line = bufferedreader.readLine()) != null) {
				if (line.contains(processname)) {
					returnInfo = "该程序正在运行！";
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (bufferedreader != null) {
				try {
					bufferedreader.close();
				} catch (Exception ex) {
				}
			}
		}
		return returnInfo;
	}
}
