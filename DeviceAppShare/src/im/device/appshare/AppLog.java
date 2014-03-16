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
package im.device.appshare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Environment;
import android.os.StatFs;
import android.util.Log;

/**
 * 输出日志类
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-3-11]
 */
public class AppLog {

	/**
	 * Log标签
	 */
	private static final String TAG = AppLog.class.getSimpleName();

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
	public static boolean IS_SECURITY_LOG = false;

	/**
	 * 是否为调试模式，true:在控制台输出；false:不在控制台输出
	 */
	public static boolean IS_DEBUG = true;
	
	public static final int LEVEL_V = 1;
	public static final int LEVEL_D = 2;
	public static final int LEVEL_I = 3;
	public static final int LEVEL_W = 4;
	public static final int LEVEL_E = 5;
	
	/**
	 * debug级别
	 */
	public static int DEBUG_LEVEL = LEVEL_V;
	
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

			if (IS_DEBUG && DEBUG_LEVEL <= LEVEL_E) {
				Log.e(LOG_PRE + tag, msg2);
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

			if (IS_DEBUG && DEBUG_LEVEL <= LEVEL_W) {
				Log.w(LOG_PRE + tag, msg2);
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

			if (IS_DEBUG  && DEBUG_LEVEL <= LEVEL_I) {
				Log.i(LOG_PRE + tag, msg2);
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

			if (IS_DEBUG  && DEBUG_LEVEL <= LEVEL_D) {

				Log.d(LOG_PRE + tag, msg2);
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

			if (IS_DEBUG  && DEBUG_LEVEL <= LEVEL_V) {

				Log.v(LOG_PRE + tag, msg2);
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

		// 获取当前时间
		Date date = new Date(System.currentTimeMillis());
		String curTime = LOG_TIME_FORMAT.format(date);
		String curTime2 = LOG_FILE_FORMAT.format(date);

		// 打印到哪个文件
		File logFile = getLogFile(curTime2);

		FileWriter printWriter = null;
		try {
			if (logFile != null && logFile.isFile()) {
				String logMessage = "" + curTime + " : " + priority + " / "
						+ tag + LOG_SPLIT + msg + "\r\n";
				printWriter = new FileWriter(logFile, true);
				printWriter.append(logMessage);
				printWriter.flush();
			}
		} catch (FileNotFoundException e) {
			// Log当前的异常信息
			Log.e(LOG_PRE + TAG, e.toString());
		} catch (IOException e) {
			// Log当前的异常信息
			Log.e(LOG_PRE + TAG, e.toString());
		} finally {
			try {
				if (printWriter != null) {
					printWriter.close();
				}
			} catch (IOException e) {
				// Log当前的异常信息
				Log.e(LOG_PRE + TAG, e.toString());
			}
		}
	}

	/**
	 * 获取打印LOG的文件
	 * 
	 * @param curTime
	 * @return
	 */
	private synchronized static File getLogFile(String curTime) {
		File logFile = null;
		try {
			// 如果内存卡可用
			if (isSDCardEnable() && isEnoughFreeSize()) {
				// 获取LOG文件存储目录
				String logDirectory = getLogPath();
				// 如果文件目录可用
				if (logDirectory != null && !logDirectory.trim().equals("")) {
					// 是否需要换文件 打印Log信息条
					String tempLogFilePath = null;
					
					if (SAVE_MODE == SAVE_MODE_2) {
						// 按日期日志文件 LOG文件路径
						tempLogFilePath = logDirectory + File.separator
								+ curTime + LOG_FILE_SUFFIX;
					} else {
						// 默认指定 固定日志文件打印
						if (LOG_FILE_NAME != null
								&& !LOG_FILE_NAME.trim().equals("")) {
							tempLogFilePath = logDirectory + File.separator
									+ LOG_FILE_NAME + LOG_FILE_SUFFIX;
						}
					}

					if (tempLogFilePath == null) {
						return null;
					}

					logFile = new File(tempLogFilePath);
					if (logFile == null || !logFile.exists()) {
						// 文件不存在则创建
						if (!logFile.createNewFile()) {
							logFile = null;
						}
					}

					// 如果不是一个文件
					if (logFile != null && !logFile.isFile()) {
						logFile = null;
					}
				}
			} else {
				Log.e(LOG_PRE + TAG, "SDCard 不可用 或者 SDCard 空间不足2MB");
			}
		} catch (IOException e) {
			// Log当前的异常信息
			Log.e(LOG_PRE + TAG, e.toString());
			logFile = null;
		}
		return logFile;
	}

	/**
	 * 获取LOG路径
	 * 
	 * @return
	 */
	private static String getLogPath() {
		// SDCARD 路径
		String SDCARD_DIR = Environment.getExternalStorageDirectory().getPath();

		// LOG 存储路径
		String LOG_PATH = SDCARD_DIR + File.separator + LOG_DIR;

		File logDir = new File(LOG_PATH);
		// 如果文件存在 并且不是文件夹
		if (logDir.exists() && !logDir.isDirectory()) {
			// 删除掉重新创建
			logDir.delete();
			// 重新创建成文件夹
			logDir = new File(LOG_PATH);
			// 如果创建失败
			if (!logDir.mkdirs()) {
				return null;
			}

		} else {
			// 如果不存在 则创建
			if (logDir != null && !logDir.exists()) {
				// 如果创建失败
				if (logDir.mkdirs()) {
					return null;
				}
			}
		}
		return LOG_PATH;
	}

	/**
	 * SD卡是否可用
	 * 
	 * @return
	 */
	private static boolean isSDCardEnable() {

		return Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED);
	}

	/**
	 * 是否有足够的空间打印LOG 至少要有2M
	 * 
	 * @return
	 */
	private static boolean isEnoughFreeSize() {
		StatFs statfs = new StatFs(android.os.Environment
				.getExternalStorageDirectory().getAbsolutePath());
		// 获取SDCard上每个block的SIZE
		long nBlocSize = statfs.getBlockSize();

		// 获取可供程序使用的Block的数量
		long nAvailaBlock = statfs.getAvailableBlocks();

		// 计算 SDCard 剩余大小B
		long nSDFreeSize = nAvailaBlock * nBlocSize;

		long oneM = 2 * 1024 * 1024;
		if (nSDFreeSize > oneM) {
			return true;
		}
		return false;
	}
}
