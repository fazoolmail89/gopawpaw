/**
 * 
 */
package com.gopawpaw.dev.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @version 2010-4-15
 * @author 李锦华 <br>
 *         日志分析器
 */
public class GppLogAnalyzer {

	/**
	 * 单一日志文件，启用日志分析器时设定
	 */
	public final static int SINGLE_LOG_FILE = 1;

	/**
	 * 多日志文件，启用日志分析器时设定
	 */
	public final static int MULTI_LOG_FILE = 2;

	/**
	 * 日志文件类型，默认为单一日志文件
	 */
	private static int LOG_TYPE = SINGLE_LOG_FILE;

	/**
	 * 日志文件绝对目录
	 */
	private static String logAbsoluteDir = null;

	/**
	 * 日志文件名
	 */
	private static String logFileName = null;

	/**
	 * 多日志文件日期格式
	 */
	private static SimpleDateFormat dateformatter = new SimpleDateFormat(
			"yyyy-MM-dd-HH-mm-ss"); // @jve:decl-index=0:

	/**
	 * 
	 */
	public GppLogAnalyzer() {

		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {

	}

	/**
	 * @return the lOG_TYPE
	 */
	public static int getLOG_TYPE() {
		return LOG_TYPE;
	}

	/**
	 * @param lOGTYPE
	 *            the lOG_TYPE to set
	 */
	public static void setLOG_TYPE(int lOGTYPE) {
		LOG_TYPE = lOGTYPE;
	}

	/**
	 * @return the logAbsoluteDir
	 */
	public static String getLogAbsoluteDir() {
		return logAbsoluteDir;
	}

	/**
	 * @param logAbsoluteDir
	 *            the logAbsoluteDir to set
	 */
	public static void setLogAbsoluteDir(String logAbsoluteDir) {
		GppLogAnalyzer.logAbsoluteDir = logAbsoluteDir;
	}

	/**
	 * @return the logFileName
	 */
	public static String getLogFileName() {
		return logFileName;
	}

	/**
	 * @param logFileName
	 *            the logFileName to set
	 */
	public static void setLogFileName(String logFileName) {
		GppLogAnalyzer.logFileName = logFileName;
	}

	/**
	 * @return the dateformatter
	 */
	public static SimpleDateFormat getDateformatter() {
		return GppLogAnalyzer.dateformatter;
	}

	/**
	 * @param dateformatter
	 *            the dateformatter to set
	 */
	public static void setDateformatter(SimpleDateFormat dateformatter) {
		GppLogAnalyzer.dateformatter = dateformatter;
	}

	public static boolean appendLog(String describe) {
		if (GppLogAnalyzer.logAbsoluteDir == null
				|| GppLogAnalyzer.logFileName == null) {
			System.out.println("请初始化日志文件路径和文件名");
			return false;
		} else {
			appendSave(describe, null);
			return true;
		}
	}

	public static boolean appendLog(Exception e) {
		if (GppLogAnalyzer.logAbsoluteDir == null
				|| GppLogAnalyzer.logFileName == null) {
			System.out.println("请初始化日志文件路径和文件名");
			return false;
		} else {
			appendSave(null, e);
			return true;
		}
	}

	public static boolean appendLog(String describe, Exception e) {
		if (GppLogAnalyzer.logAbsoluteDir == null
				|| GppLogAnalyzer.logFileName == null) {
			System.out.println("请初始化日志文件路径和文件名");
			return false;
		} else {
			appendSave(describe, e);
			return true;
		}
	}

	private static void appendSave(String describe, Exception e) {
		if (GppLogAnalyzer.LOG_TYPE == GppLogAnalyzer.SINGLE_LOG_FILE) {
			// 单日志文件

			String temp = GppLogAnalyzer.logAbsoluteDir + File.separator
					+ GppLogAnalyzer.logFileName;
			saveLog(new File(temp), getHeadInfo(describe));
			saveLog(new File(temp), e.toString());
			StackTraceElement[] ste = e.getStackTrace();
			for(int i=0;i<ste.length;i++){
				saveLog(new File(temp), ste[i].toString());
			}
			
		} else {
			// 多日志文件
		}
	}

	private static void saveLog(File log, String newLog) {
		Scanner sc = null;
		PrintWriter pw = null;
		try {
			if (!log.exists())// 如果文件不存在,则新建.
			{
				File parentDir = new File(log.getParent());
				if (!parentDir.exists())// 如果所在目录不存在,则新建.
					parentDir.mkdirs();
				log.createNewFile();
			}
			sc = new Scanner(log);
			StringBuilder sb = new StringBuilder();
			while (sc.hasNextLine())// 先读出旧文件内容,并暂存sb中;
			{
				sb.append(sc.nextLine());
				sb.append("\r\n");// 换行符作为间隔,扫描器读不出来,因此要自己添加.
			}
			sc.close();

			pw = new PrintWriter(new FileWriter(log), true);
			/* A. */pw.print(sb.toString());// ,写入旧文件内容.
			/* B. */pw.print(newLog);// 写入新日志.
			/*
			 * 如果先写入A,最近日志在文件最后. 如是先写入B,最近日志在文件最前.
			 */
			pw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private static String getHeadInfo(String describe){
		String rets = "";
		SimpleDateFormat formatter = new SimpleDateFormat(
		"yyyy-MM-dd-HH-mm-ss");
		rets = "\r\n=========================================================";
		rets = rets +"\r\n== 日期时间："+ formatter.format(Calendar.getInstance().getTime());
		rets = rets +"\r\n== 描    述："+ describe;
		rets = rets +"\r\n=========================================================";
		rets = rets +"\r\n== 错误：";
		
		return rets;
	}
}
