/**
 * 
 */
package com.gopawpaw.dev.common;

/**
 * @version 2010-4-2
 * @author Àî½õ»ª
 * 
 */
public class GppObfuscation {

	private static int obfcode = 20;

	/**
	 * @param obfcode
	 *            the obfcode to set
	 */
	public static void setObfcode(int obfcode) {
		GppObfuscation.obfcode = obfcode;
	}

	/**
	 * »ñÈ¡»ìÏý×Ö·û
	 */
	public static String getObfuscation(String str) {

		char[] ch = str.toCharArray();
		char[] chs = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {
			chs[i] = (char) (ch[i] ^ GppObfuscation.obfcode);
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
			chs[i] = (char) (ch[i] ^ GppObfuscation.obfcode);
		}
		return String.valueOf(chs);
	}

	/**
	 * 
	 */
	public GppObfuscation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "gopawpaw.ini";
		
		String tem = GppObfuscation.getObfuscation(str);
		System.out.println(tem);
		
		System.out.println(GppObfuscation.unObfuscation(tem));
	}
}
