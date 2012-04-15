package com.gopawpaw.kynb.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @version 2012-4-11
 * @author LiJinHua
 */
public class Tools {

	/**
	 * 检查字符串是否合法（不含 - + 号）
	 * @version 2012-4-11
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static boolean checkStringLegal(String str){
		if(str == null){
			return false;
		}
		
		String[] illegality = new String[]{"-","+"};
		
		int size = illegality.length;
		for(int i=0;i<size;i++){
			if(str.contains(illegality[i])){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 检查日期字符串是否合法
	 * @version 2012-4-11
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static boolean checkDateLegal(String date,String fromFormart) {
		if(date!=null&&fromFormart!=null){
			try {
				SimpleDateFormat fromSDF = new SimpleDateFormat(fromFormart);
				
				Date tempDate = fromSDF.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return false;
			}
			return true;
		}
		
		return false;
	}
	

	// GENERAL_PUNCTUATION 判断中文的“号
	// CJK_SYMBOLS_AND_PUNCTUATION 判断中文的。号
	// HALFWIDTH_AND_FULLWIDTH_FORMS 判断中文的，号
	private static final boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
			return true;
		}
		return false;
	}

	public static final boolean isContainsChinese(String strName) {
		char[] ch = strName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (isChinese(c)) {
				return true;
			}
		}
		return false;
	}

}
