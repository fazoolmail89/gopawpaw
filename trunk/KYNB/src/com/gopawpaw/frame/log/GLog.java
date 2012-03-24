/**
 * 
 */
package com.gopawpaw.frame.log;



/**
 * ��־�����
 * 
 * @version 2012-3-10
 * @author Jason
 */
public class GLog {

	private static final boolean DEBUG = true;

	private static final String TAG = GLog.class.getSimpleName();


	/**
	 * 
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param strErrMsg
	 *            ������Ϣ
	 */
	public static void e(String tag, String msg) {
		if (DEBUG) {
			System.out.println("E>>" + tag + "<<   " + msg);
			
		}
		storeLogInfo(tag, msg, "E");
	}

	/**
	 * 
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param strErrMsg
	 *            ������Ϣ
	 */
	public static void d(String tag, String msg) {
		if (DEBUG) {
			System.out.println("D>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "D");
	}

	/**
	 * 
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param strErrMsg
	 *            ������Ϣ
	 */
	public static void v(String tag, String msg) {
		if (DEBUG) {
			System.out.println("V>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "V");
	}

	/**
	 * 
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param strErrMsg
	 *            ������Ϣ
	 */
	public static void i(String tag, String msg) {
		if (DEBUG) {
			System.out.println("I>>" + tag + "<<   " + msg);
		}
		storeLogInfo(tag, msg, "I");
	}

	/**
	 * 
	 * [һ�仰���ܼ���]<BR>
	 * [������ϸ����]
	 * 
	 * @param strErrMsg
	 *            ������Ϣ
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
