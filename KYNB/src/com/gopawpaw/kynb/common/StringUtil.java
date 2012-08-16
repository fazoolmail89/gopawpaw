package com.gopawpaw.kynb.common;

public class StringUtil {
	public static String getQuotStr(Object param) {
		return "'" + param.toString() + "'";
	}
	public static String getDLikeStr(Object param) {
		return "'%" + param.toString() + "%'";
	}
}
