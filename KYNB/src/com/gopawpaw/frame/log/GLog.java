/**
 * 
 */
package com.gopawpaw.frame.log;



/**
 * 日志输出类
 * 
 * @version 2012-3-10
 * @author Jason
 */
public class GLog {

	private static final boolean DEBUG = true;

	private static final String TAG = GLog.class.getSimpleName();


	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param strErrMsg
	 *            错误信息
	 */
	public static void e(String tag, String msg) {
		if (DEBUG) {
			System.out.println("E>>" + tag + "<<   " + msg);
			
		}
		storeLogInfo(tag, msg, "E");
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param strErrMsg
	 *            错误信息
	 */
	public static void d(String tag, String msg) {
		if (DEBUG) {
			System.out.println("D>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "D");
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param strErrMsg
	 *            错误信息
	 */
	public static void v(String tag, String msg) {
		if (DEBUG) {
			System.out.println("V>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "V");
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param strErrMsg
	 *            错误信息
	 */
	public static void i(String tag, String msg) {
		if (DEBUG) {
			System.out.println("I>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "I");
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * 
	 * @param strErrMsg
	 *            错误信息
	 */
	public static void w(String tag, String msg) {
		if (DEBUG) {
			System.out.println("W>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "W");
	}

	private static void storeLogInfo(String tag, String msg, String priority) {
		
	}
}
