/**
 * 
 */
package com.gopawpaw.kynb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 2011-11-26
 * @author Jason
 */
public class IDNumberChecker {
	/*********************************** ����֤��֤��ʼ ****************************************/	
	/**
	 * ����֤������֤ 
	 * 1������Ľṹ
	 * �������ݺ�������������룬��ʮ��λ���ֱ������һλУ������ɡ�����˳�������������Ϊ����λ���ֵ�ַ�룬
	 * ��λ���ֳ��������룬��λ����˳�����һλ����У���롣
	 * 2����ַ��(ǰ��λ���� 
	 * ��ʾ�������ס����������(�С��졢��)�������������룬��GB/T2260�Ĺ涨ִ�С� 
	 * 3�����������루����λ��ʮ��λ��
	 * ��ʾ�������������ꡢ�¡��գ���GB/T7408�Ĺ涨ִ�У��ꡢ�¡��մ���֮�䲻�÷ָ����� 
	 * 4��˳���루��ʮ��λ��ʮ��λ��
	 * ��ʾ��ͬһ��ַ������ʶ������Χ�ڣ���ͬ�ꡢͬ�¡�ͬ�ճ������˱ඨ��˳��ţ�
	 * ˳�����������������ԣ�ż�������Ů�ԡ� 
	 * 5��У���루��ʮ��λ����
	 * ��1��ʮ��λ���ֱ������Ȩ��͹�ʽ S = Sum(Ai * Wi), i = 0, ... , 16 ���ȶ�ǰ17λ���ֵ�Ȩ���
	 * Ai:��ʾ��iλ���ϵ�����֤��������ֵ Wi:��ʾ��iλ���ϵļ�Ȩ���� Wi: 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4
	 * 2 ��2������ģ Y = mod(S, 11) ��3��ͨ��ģ�õ���Ӧ��У���� Y: 0 1 2 3 4 5 6 7 8 9 10 У����: 1 0
	 * X 9 8 7 6 5 4 3 2
	 */

	/**
	 * ���ܣ�����֤����Ч��֤
	 * @param IDStr ����֤��
	 * @return ��Ч������"" ��Ч������String��Ϣ
	 * @throws ParseException
	 */
	public static String IDCardValidate(String IDStr) throws ParseException {
		String errorInfo = "";// ��¼������Ϣ
		String[] ValCodeArr = { "1", "0", "X", "9", "8", "7", "6", "5", "4",
			"3", "2" };
		String[] Wi = { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7",
			"9", "10", "5", "8", "4", "2" };
		String Ai = "";
		// ================ ����ĳ���18λ ��15λ================
		//2012-03-30 ¬���� �޸�
		if (IDStr.length() == 18 || IDStr.length() == 15) {
		} else {
			errorInfo = "����֤���볤��Ӧ��Ϊ18λ��15λ��";
			return errorInfo;			
		}
		// =======================(end)========================

		// ================ ���� �������Ϊ��Ϊ���� ================
		if (IDStr.length() == 18) {
			Ai = IDStr.substring(0, 17);
		} else if (IDStr.length() == 15) {
			Ai = IDStr.substring(0, 6) + "19" + IDStr.substring(6, 15);
		}
		if (isNumeric(Ai) == false) {
			errorInfo = "����֤15λ���붼ӦΪ���� ; 18λ��������һλ�⣬��ӦΪ���֡�";
			return errorInfo;
		}
		// =======================(end)========================

		// ================ ���������Ƿ���Ч ================
		String strYear = Ai.substring(6, 10);// ���
		String strMonth = Ai.substring(10, 12);// �·�
		String strDay = Ai.substring(12, 14);// �·�
		if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {
			errorInfo = "����֤������Ч��";
			return errorInfo;
		}
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150
				|| (gc.getTime().getTime() - s.parse(
						strYear + "-" + strMonth + "-" + strDay).getTime()) < 0) {
			errorInfo = "����֤���ղ�����Ч��Χ��";
			return errorInfo;
		}
		if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) == 0) {
			errorInfo = "����֤�·���Ч";
			return errorInfo;
		}
		if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) == 0) {
			errorInfo = "����֤������Ч";
			return errorInfo;
		}
		// =====================(end)=====================

		// ================ ������ʱ����Ч ================
		Hashtable<String, String> h = GetAreaCode();
		if (h.get(Ai.substring(0, 2)) == null) {
			errorInfo = "����֤�����������";
			return errorInfo;
		}
		// ==============================================

		// ================ �ж����һλ��ֵ ================
		int TotalmulAiWi = 0;
		for (int i = 0; i < 17; i++) {
			TotalmulAiWi = TotalmulAiWi
					+ Integer.parseInt(String.valueOf(Ai.charAt(i)))
					* Integer.parseInt(Wi[i]);
		}
		int modValue = TotalmulAiWi % 11;
		String strVerifyCode = ValCodeArr[modValue];
		Ai = Ai + strVerifyCode;

		if (IDStr.length() == 18) {
			if (Ai.equals(IDStr) == false) {
				errorInfo = "����֤��Ч�����ǺϷ�������֤����";
				return errorInfo;
			}
		} else {
			return "";
		}
		// =====================(end)=====================
		return "";
	}

	/**
	 * ���ܣ����õ�������
	 * @return Hashtable ����
	 */
	private static Hashtable<String, String> GetAreaCode() {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("11", "����");
		hashtable.put("12", "���");
		hashtable.put("13", "�ӱ�");
		hashtable.put("14", "ɽ��");
		hashtable.put("15", "���ɹ�");
		hashtable.put("21", "����");
		hashtable.put("22", "����");
		hashtable.put("23", "������");
		hashtable.put("31", "�Ϻ�");
		hashtable.put("32", "����");
		hashtable.put("33", "�㽭");
		hashtable.put("34", "����");
		hashtable.put("35", "����");
		hashtable.put("36", "����");
		hashtable.put("37", "ɽ��");
		hashtable.put("41", "����");
		hashtable.put("42", "����");
		hashtable.put("43", "����");
		hashtable.put("44", "�㶫");
		hashtable.put("45", "����");
		hashtable.put("46", "����");
		hashtable.put("50", "����");
		hashtable.put("51", "�Ĵ�");
		hashtable.put("52", "����");
		hashtable.put("53", "����");
		hashtable.put("54", "����");
		hashtable.put("61", "����");
		hashtable.put("62", "����");
		hashtable.put("63", "�ຣ");
		hashtable.put("64", "����");
		hashtable.put("65", "�½�");
		hashtable.put("71", "̨��");
		hashtable.put("81", "���");
		hashtable.put("82", "����");
		hashtable.put("91", "����");
		return hashtable;
	}

	/**
	 * ���ܣ��ж��ַ����Ƿ�Ϊ����
	 * @param str
	 * @return
	 */
	private static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (isNum.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ���ܣ��ж��ַ����Ƿ�Ϊ���ڸ�ʽ
	 * @param str
	 * @return
	 */
	public static boolean isDate(String strDate) {
		Pattern pattern = Pattern
				.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		Matcher m = pattern.matcher(strDate);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 * @throws ParseException
	 */
//	public static void main(String[] args) throws ParseException {
//		// String IDCardNum="210102820826411";
//		// String IDCardNum="210102198208264114";
//		String IDCardNum = "500113198606245216";
//		CommonUtil cc = new CommonUtil();
//		System.out.println(cc.IDCardValidate(IDCardNum));
//		// System.out.println(cc.isDate("1996-02-29"));
//	}
/*********************************** ����֤��֤���� ****************************************/
	
	public static boolean isLegal(String IDNumber) {
		boolean result = IDNumber.matches("[0-9]{15}|[0-9]{17}[0-9X]");
		if (result) {
			int year, month, date;
			if (IDNumber.length() == 15) {
				year = Integer.parseInt(IDNumber.substring(6, 8));
				month = Integer.parseInt(IDNumber.substring(8, 10));
				date = Integer.parseInt(IDNumber.substring(10, 12));
			} else {
				year = Integer.parseInt(IDNumber.substring(6, 10));
				month = Integer.parseInt(IDNumber.substring(10, 12));
				date = Integer.parseInt(IDNumber.substring(12, 14));
			}
			switch (month) {
			case 2:
				result = (date >= 1)
						&& (year % 4 == 0 ? date <= 29 : date <= 28);
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = (date >= 1) && (date <= 31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = (date >= 1) && (date <= 31);
				break;
			default:
				result = false;
				break;
			}
		}
		return result;
	}
	
	
}