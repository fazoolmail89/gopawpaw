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
 * @author ����� <br>
 *         ��־������
 */
public class GppLogAnalyzer {

	/**
	 * ��һ��־�ļ���������־������ʱ�趨
	 */
	public final static int SINGLE_LOG_FILE = 1;

	/**
	 * ����־�ļ���������־������ʱ�趨
	 */
	public final static int MULTI_LOG_FILE = 2;

	/**
	 * ��־�ļ����ͣ�Ĭ��Ϊ��һ��־�ļ�
	 */
	private static int LOG_TYPE = SINGLE_LOG_FILE;

	/**
	 * ��־�ļ�����Ŀ¼
	 */
	private static String logAbsoluteDir = null;

	/**
	 * ��־�ļ���
	 */
	private static String logFileName = null;

	/**
	 * ����־�ļ����ڸ�ʽ
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
	 * ��ʼ��
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
			System.out.println("���ʼ����־�ļ�·�����ļ���");
			return false;
		} else {
			appendSave(describe, null);
			return true;
		}
	}

	public static boolean appendLog(Exception e) {
		if (GppLogAnalyzer.logAbsoluteDir == null
				|| GppLogAnalyzer.logFileName == null) {
			System.out.println("���ʼ����־�ļ�·�����ļ���");
			return false;
		} else {
			appendSave(null, e);
			return true;
		}
	}

	public static boolean appendLog(String describe, Exception e) {
		if (GppLogAnalyzer.logAbsoluteDir == null
				|| GppLogAnalyzer.logFileName == null) {
			System.out.println("���ʼ����־�ļ�·�����ļ���");
			return false;
		} else {
			appendSave(describe, e);
			return true;
		}
	}

	private static void appendSave(String describe, Exception e) {
		if (GppLogAnalyzer.LOG_TYPE == GppLogAnalyzer.SINGLE_LOG_FILE) {
			// ����־�ļ�

			String temp = GppLogAnalyzer.logAbsoluteDir + File.separator
					+ GppLogAnalyzer.logFileName;
			saveLog(new File(temp), getHeadInfo(describe));
			saveLog(new File(temp), e.toString());
			StackTraceElement[] ste = e.getStackTrace();
			for(int i=0;i<ste.length;i++){
				saveLog(new File(temp), ste[i].toString());
			}
			
		} else {
			// ����־�ļ�
		}
	}

	private static void saveLog(File log, String newLog) {
		Scanner sc = null;
		PrintWriter pw = null;
		try {
			if (!log.exists())// ����ļ�������,���½�.
			{
				File parentDir = new File(log.getParent());
				if (!parentDir.exists())// �������Ŀ¼������,���½�.
					parentDir.mkdirs();
				log.createNewFile();
			}
			sc = new Scanner(log);
			StringBuilder sb = new StringBuilder();
			while (sc.hasNextLine())// �ȶ������ļ�����,���ݴ�sb��;
			{
				sb.append(sc.nextLine());
				sb.append("\r\n");// ���з���Ϊ���,ɨ������������,���Ҫ�Լ����.
			}
			sc.close();

			pw = new PrintWriter(new FileWriter(log), true);
			/* A. */pw.print(sb.toString());// ,д����ļ�����.
			/* B. */pw.print(newLog);// д������־.
			/*
			 * �����д��A,�����־���ļ����. ������д��B,�����־���ļ���ǰ.
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
		rets = rets +"\r\n== ����ʱ�䣺"+ formatter.format(Calendar.getInstance().getTime());
		rets = rets +"\r\n== ��    ����"+ describe;
		rets = rets +"\r\n=========================================================";
		rets = rets +"\r\n== ����";
		
		return rets;
	}
}
