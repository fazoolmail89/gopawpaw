/*
 * ��  ��   ���� APPLog.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ������־�����
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-2-23
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.log;

import java.io.File;
import java.text.SimpleDateFormat;


/**
 * �����־��
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-3-11]
 */
public class APPLog {

	/**
	 * Log��ǩ
	 */
	private static final String TAG = APPLog.class.getSimpleName();

	/**
	 * ��־�����ģʽ1���̶���־�ļ�
	 */
	public static final int SAVE_MODE_1 = 1;

	/**
	 * ��־�����ģʽ2����������־�ļ�
	 */
	public static final int SAVE_MODE_2 = 2;

	/**
	 * ��־�����ģʽ
	 */
	public static int SAVE_MODE = SAVE_MODE_1;

	/**
	 * Logǰ׺
	 */
	public static String LOG_PRE = "";

	/**
	 * ��ȫ������־��true:������ͱ����κ���־��false:��ѡ������򱣴���־
	 */
	public static boolean IS_SECURITY_LOG = true;

	/**
	 * �Ƿ�Ϊ����ģʽ��true:�ڿ���̨�����false:���ڿ���̨���
	 */
	public static boolean IS_DEBUG = true;

	/**
	 * �Ƿ����Log��λ�ã�true:�����false:�����
	 */
	public static boolean IS_LOG_POSITION = false;

	/**
	 * �Ƿ񱣴�E�����Log��Ϣ��true:���棻false:������
	 */
	public static boolean IS_SAVE_LOG_E = false;

	/**
	 * �Ƿ񱣴�W�����Log��Ϣ��true:���棻false:������
	 */
	public static boolean IS_SAVE_LOG_W = false;

	/**
	 * �Ƿ񱣴�I�����Log��Ϣ��true:���棻false:������
	 */
	public static boolean IS_SAVE_LOG_I = false;

	/**
	 * �Ƿ񱣴�D�����Log��Ϣ��true:���棻false:������
	 */
	public static boolean IS_SAVE_LOG_D = false;

	/**
	 * �Ƿ񱣴�V�����Log��Ϣ��true:���棻false:������
	 */
	public static boolean IS_SAVE_LOG_V = false;

	/**
	 * LOGĿ¼
	 */
	public static String LOG_DIR = "LogDir";

	/**
	 * ��־�ļ���׺suffix
	 */
	public static String LOG_FILE_SUFFIX = ".log";

	/**
	 * �̶���־�ļ���
	 */
	public static String LOG_FILE_NAME = "android";

	/**
	 * logʱ���ʽ
	 */
	private static SimpleDateFormat LOG_TIME_FORMAT = new SimpleDateFormat(
			"yyyy-MM-dd_HH-mm-ss");

	/**
	 * �����ڴ�ӡģʽ�µ�Log �ļ��� ��ʽ
	 */
	public static SimpleDateFormat LOG_FILE_FORMAT = new SimpleDateFormat(
			"yyyy-MM");

	/**
	 * ��־�ָ��ַ�
	 */
	private static final String LOG_SPLIT = "  <||>  ";

	/**
	 * ������󼶱�Log
	 * 
	 * @param tag
	 *            ��ǩ
	 * @param msg
	 *            ��Ϣ
	 */
	public static void e(String tag, String msg) {

		if (IS_SECURITY_LOG) {
			return;
		} else {
			String msg2 = (msg == null ? "" : msg);

			if (IS_LOG_POSITION) {
				msg2 = getPositionInfo() + LOG_SPLIT + msg2;
			}

			if (IS_DEBUG) {
//				Log.e(LOG_PRE + tag, msg2);
				System.err.println(LOG_PRE + tag + LOG_SPLIT+ msg2);
			}

			if (IS_SAVE_LOG_E) {
				saveLog(tag, msg2, "E");
			}
		}
	}

	/**
	 * ������漶��Log
	 * 
	 * @param tag
	 *            ��ǩ
	 * @param msg
	 *            ��Ϣ
	 */
	public static void w(String tag, String msg) {

		if (IS_SECURITY_LOG) {
			return;
		} else {
			String msg2 = (msg == null ? "" : msg);

			if (IS_LOG_POSITION) {
				msg2 = getPositionInfo() + LOG_SPLIT + msg2;
			}

			if (IS_DEBUG) {
//				Log.w(LOG_PRE + tag, msg2);
				
				System.out.println(LOG_PRE + tag + LOG_SPLIT+ msg2);
			}

			if (IS_SAVE_LOG_W) {
				saveLog(tag, msg2, "W");
			}
		}

	}

	/**
	 * �����Ϣ����Log
	 * 
	 * @param tag
	 *            ��ǩ
	 * @param msg
	 *            ��Ϣ
	 */
	public static void i(String tag, String msg) {

		if (IS_SECURITY_LOG) {
			return;
		} else {

			String msg2 = (msg == null ? "" : msg);

			if (IS_LOG_POSITION) {
				msg2 = getPositionInfo() + LOG_SPLIT + msg2;
			}

			if (IS_DEBUG) {
//				Log.i(LOG_PRE + tag, msg2);
				System.out.println(LOG_PRE + tag + LOG_SPLIT+ msg2);
			}

			if (IS_SAVE_LOG_I) {
				saveLog(tag, msg2, "I");
			}
		}

	}

	/**
	 * ������Լ���Log
	 * 
	 * @param tag
	 *            ��ǩ
	 * @param msg
	 *            ��Ϣ
	 */
	public static void d(String tag, String msg) {

		if (IS_SECURITY_LOG) {
			return;
		} else {
			String msg2 = (msg == null ? "" : msg);

			if (IS_LOG_POSITION) {
				msg2 = getPositionInfo() + LOG_SPLIT + msg2;
			}

			if (IS_DEBUG) {

//				Log.d(LOG_PRE + tag, msg2);
				System.out.println(LOG_PRE + tag + LOG_SPLIT+ msg2);
			}

			if (IS_SAVE_LOG_D) {
				saveLog(tag, msg2, "D");
			}
		}

	}

	/**
	 * ����������Log
	 * 
	 * @param tag
	 *            ��ǩ
	 * @param msg
	 *            ��Ϣ
	 */
	public static void v(String tag, String msg) {

		if (IS_SECURITY_LOG) {
			return;
		} else {

			String msg2 = (msg == null ? "" : msg);
			if (IS_LOG_POSITION) {
				msg2 = getPositionInfo() + LOG_SPLIT + msg2;
			}

			if (IS_DEBUG) {

//				Log.v(LOG_PRE + tag, msg2);
				System.out.println(LOG_PRE + tag + LOG_SPLIT+ msg2);
			}

			if (IS_SAVE_LOG_V) {

				saveLog(tag, msg2, "V");
			}
		}

	}

	/**
	 * ��ȡLog��λ��
	 * 
	 * @return
	 */
	private static String getPositionInfo() {
		StackTraceElement ste = new Throwable().getStackTrace()[2];
		return ste.getFileName() + " : Line " + ste.getLineNumber();
	}

	/**
	 * ������־ [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param tag
	 * @param msg
	 * @param priority
	 */
	private synchronized static void saveLog(String tag, String msg,
			String priority) {
		
	}

	/**
	 * ��ȡ��ӡLOG���ļ�
	 * 
	 * @param curTime
	 * @return
	 */
	private synchronized static File getLogFile(String curTime) {
		return null;
	}

	/**
	 * ��ȡLOG·��
	 * 
	 * @return
	 */
	private static String getLogPath() {
		
		return "";
	}

}
