/*
 * 文  件   名： APPLog.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：日志输出类
 * 创  建   人： LiJinHua
 * 创建时间： 2012-2-23
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.frame.log;

import java.io.File;
import java.text.SimpleDateFormat;


/**
 * 输出日志类
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-3-11]
 */
public class APPLog {

	/**
	 * Log标签
	 */
	private static final String TAG = APPLog.class.getSimpleName();

	/**
	 * 日志保存的模式1：固定日志文件
	 */
	public static final int SAVE_MODE_1 = 1;

	/**
	 * 日志保存的模式2：按日期日志文件
	 */
	public static final int SAVE_MODE_2 = 2;

	/**
	 * 日志保存的模式
	 */
	public static int SAVE_MODE = SAVE_MODE_1;

	/**
	 * Log前缀
	 */
	public static String LOG_PRE = "";

	/**
	 * 安全级别日志，true:则不输出和保存任何日志，false:可选择输出或保存日志
	 */
	public static boolean IS_SECURITY_LOG = true;

	/**
	 * 是否为调试模式，true:在控制台输出；false:不在控制台输出
	 */
	public static boolean IS_DEBUG = true;

	/**
	 * 是否输出Log的位置，true:输出；false:不输出
	 */
	public static boolean IS_LOG_POSITION = false;

	/**
	 * 是否保存E级别的Log信息，true:保存；false:不保存
	 */
	public static boolean IS_SAVE_LOG_E = false;

	/**
	 * 是否保存W级别的Log信息，true:保存；false:不保存
	 */
	public static boolean IS_SAVE_LOG_W = false;

	/**
	 * 是否保存I级别的Log信息，true:保存；false:不保存
	 */
	public static boolean IS_SAVE_LOG_I = false;

	/**
	 * 是否保存D级别的Log信息，true:保存；false:不保存
	 */
	public static boolean IS_SAVE_LOG_D = false;

	/**
	 * 是否保存V级别的Log信息，true:保存；false:不保存
	 */
	public static boolean IS_SAVE_LOG_V = false;

	/**
	 * LOG目录
	 */
	public static String LOG_DIR = "LogDir";

	/**
	 * 日志文件后缀suffix
	 */
	public static String LOG_FILE_SUFFIX = ".log";

	/**
	 * 固定日志文件名
	 */
	public static String LOG_FILE_NAME = "android";

	/**
	 * log时间格式
	 */
	private static SimpleDateFormat LOG_TIME_FORMAT = new SimpleDateFormat(
			"yyyy-MM-dd_HH-mm-ss");

	/**
	 * 按日期打印模式下的Log 文件名 格式
	 */
	public static SimpleDateFormat LOG_FILE_FORMAT = new SimpleDateFormat(
			"yyyy-MM");

	/**
	 * 日志分隔字符
	 */
	private static final String LOG_SPLIT = "  <||>  ";

	/**
	 * 输出错误级别Log
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
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
	 * 输出警告级别Log
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
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
	 * 输出信息级别Log
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
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
	 * 输出调试级别Log
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
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
	 * 输出浏览级别Log
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
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
	 * 获取Log的位置
	 * 
	 * @return
	 */
	private static String getPositionInfo() {
		StackTraceElement ste = new Throwable().getStackTrace()[2];
		return ste.getFileName() + " : Line " + ste.getLineNumber();
	}

	/**
	 * 保存日志 [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param tag
	 * @param msg
	 * @param priority
	 */
	private synchronized static void saveLog(String tag, String msg,
			String priority) {
		
	}

	/**
	 * 获取打印LOG的文件
	 * 
	 * @param curTime
	 * @return
	 */
	private synchronized static File getLogFile(String curTime) {
		return null;
	}

	/**
	 * 获取LOG路径
	 * 
	 * @return
	 */
	private static String getLogPath() {
		
		return "";
	}

}
