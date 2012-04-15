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
	 * ����ַ����Ƿ�Ϸ������� - + �ţ�
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
	 * ��������ַ����Ƿ�Ϸ�
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
	

	// GENERAL_PUNCTUATION �ж����ĵġ���
	// CJK_SYMBOLS_AND_PUNCTUATION �ж����ĵġ���
	// HALFWIDTH_AND_FULLWIDTH_FORMS �ж����ĵģ���
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
