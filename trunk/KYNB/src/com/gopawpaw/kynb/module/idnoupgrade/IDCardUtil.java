package com.gopawpaw.kynb.module.idnoupgrade;

import java.text.ParseException;

import com.gopawpaw.kynb.utils.IDNumberChecker;

/**
 * @描述 身份证号码升级工具类
 * @作者 卢向琪
 * @版本 2012-03-28
 */
public class IDCardUtil {
	/**
	 * 18位身份证中最后一位校验码
	 */
	private final static char[] VERIFY_CODE = { '1', '0', 'X', '9', '8', '7',
			'6', '5', '4', '3', '2' };
	/**
	 * 18位身份证中，各个数字的生成校验码时的权值
	 */
	private final static int[] VERIFY_CODE_WEIGHT = { 7, 9, 10, 5, 8, 4, 2, 1,
			6, 3, 7, 9, 10, 5, 8, 4, 2 };
	
	/**
	 * 15位身份证号码升级方法
	 * @param idCard15 15位身份证号码
	 * @return 18位身份证号码
	 */
	public static String upgradeIdCardNO(String idCard15) {
		//如果不是正常的身份证号码，返回空字符串
		if((idCard15.length() != 15) || (!validate(idCard15))) return "";
		String idCard17 = idCard15.substring(0, 6) + "19" + idCard15.substring(6, 15); 
		int[] idcd = new int[17];
		int sum = 0;
		for(int i = 0; i < 17; i++) {
			idcd[i] = Integer.parseInt(idCard17.substring(i, i+1));
			sum = sum + idcd[i] * VERIFY_CODE_WEIGHT[i];
		}
		return idCard17 + VERIFY_CODE[sum % 11];
	}
	
	/**
	 * 验证身份证号码是否合法（重新封装IDNumberChecker.IDCardValidate方法）
	 * @param IdCard 身份证号码
	 * @return true：正常身份证号码；false：错误身份证号码
	 */
	public static boolean validate(String IdCard) {
		boolean result = false;
		try {
			String temp = IDNumberChecker.IDCardValidate(IdCard);
			if("".equals(temp)) result = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
/*	public static void main(String[] args) {
		IDCardUtil ic = new IDCardUtil();
		String idCad18 = ic.upgradeIdCardNO("450111860521331");
		System.out.println(idCad18);
	}*/
}
