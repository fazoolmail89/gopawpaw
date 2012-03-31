/**
 * 
 */
package com.gopawpaw.frame.utils;

import com.gopawpaw.dev.common.GppObfuscation;
import com.gopawpaw.frame.log.GLog;

/**
 * @version 2012-3-31
 * @author Jason
 */
public class StringUtils {
	
	/**
	 * »ìÏý´úÂë
	 */
	private static final int obfcode = 3;
	
	/**
	 * »ñÈ¡»ìÏý×Ö·û
	 */
	public static String getObfuscation(String str){
		char[] ch = str.toCharArray();
		char[] chs = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {
			chs[i] = (char) (ch[i] ^ ((i+obfcode) * obfcode));
		}
		return String.valueOf(chs);
	}
	
	/**
	 * ½âÎö»ìÏý×Ö·û
	 */
	public static String unObfuscation(String str) {

		char[] ch = str.toCharArray();
		char[] chs = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {
			chs[i] = (char) (ch[i] ^ ((i+obfcode) * obfcode));
		}
		return String.valueOf(chs);
	}
	
	
	public static void main(String[] args) {
		GLog.d("", getObfuscation("xxxxxxx"));
		GLog.d("", unObfuscation("qtwjm`c"));
	}
}
