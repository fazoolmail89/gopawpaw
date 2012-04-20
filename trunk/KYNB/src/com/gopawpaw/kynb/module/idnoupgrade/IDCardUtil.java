package com.gopawpaw.kynb.module.idnoupgrade;

import java.text.ParseException;

import com.gopawpaw.kynb.utils.IDNumberChecker;

/**
 * @���� ���֤��������������
 * @���� ¬����
 * @�汾 2012-03-28
 */
public class IDCardUtil {
	/**
	 * 18λ���֤�����һλУ����
	 */
	private final static char[] VERIFY_CODE = { '1', '0', 'X', '9', '8', '7',
			'6', '5', '4', '3', '2' };
	/**
	 * 18λ���֤�У��������ֵ�����У����ʱ��Ȩֵ
	 */
	private final static int[] VERIFY_CODE_WEIGHT = { 7, 9, 10, 5, 8, 4, 2, 1,
			6, 3, 7, 9, 10, 5, 8, 4, 2 };
	
	/**
	 * 15λ���֤������������
	 * @param idCard15 15λ���֤����
	 * @return 18λ���֤����
	 */
	public static String upgradeIdCardNO(String idCard15) {
		//����������������֤���룬���ؿ��ַ���
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
	 * ��֤���֤�����Ƿ�Ϸ������·�װIDNumberChecker.IDCardValidate������
	 * @param IdCard ���֤����
	 * @return true���������֤���룻false���������֤����
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
