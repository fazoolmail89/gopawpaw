/**
 * 
 */
package com.gopawpaw.kynb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ���ڹ�����
 * @author �����
 * @since: 2011-9-15
 */
public class DateUtils {
	
	/**
	 * �Ƚ���������ʱ����һ�������ڵڶ�������֮��
	 */
	public final static int DATE_AFTER = 1;
	
	/**
	 * �Ƚ���������ʱ����һ�������ڵڶ�������֮ǰ
	 */
	public final static int DATE_BEFORE = 2;
	
	/**
	 * �Ƚ���������ʱ����һ�����ں͵ڶ����������
	 */
	public final static int DATE_EQUALS = 3;
	
	/**
	 * �Ƚ���������ʱ����ȷ����С
	 */
	public final static int DATE_UNKOWN = 4;
	
	/**
	 * �Ƚ����ھ�ȷ�����
	 */
	public final static int DATE_COMPARE_YEAR = 1;
	
	/**
	 * �Ƚ����ھ�ȷ���·�
	 */
	public final static int DATE_COMPARE_MONTH = 2;
	
	/**
	 * �Ƚ����ھ�ȷ����
	 */
	public final static int DATE_COMPARE_DAY = 3;
	
	/**
	 * �Ƚ����ھ�ȷ��ʱ
	 */
	public final static int DATE_COMPARE_HOURS = 4;
	
	/**
	 * �Ƚ����ھ�ȷ����
	 */
	public final static int DATE_COMPARE_MINUTES = 5;
	
	/**
	 * ���ڸ�ʽ
	 */
	public final static  SimpleDateFormat DATA_FORMAT=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	
	/**
	 * ʱ�����ݸ�ʽ
	 */
	public final static  SimpleDateFormat TIME_FORMAT_DATA=new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * ʱ����ʾ��ʽ
	 */
	public final static  SimpleDateFormat TIME_FORMAT_SHOW=new SimpleDateFormat("HHʱmm��");
	
	/**
	 * ��ʼ���
	 */
	private final static int BEGIN_YEAR = 1900;
	
	/**
	 * 
	 */
	private DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ��ȡ���
	 * @author �����
	 * @since:2011-9-15
	 * @param date
	 * @return
	 */
	public static int getYearOfDate(Date date){
		if(date == null){
			return BEGIN_YEAR;
		}
		if(date.getYear()<BEGIN_YEAR){
			return BEGIN_YEAR + date.getYear();
		}else{
			return  date.getYear();
		}
	}
	
	/**
	 * ��ȡ��ݼ�ȥ1900
	 * @author �����
	 * @since:2011-9-15
	 * @param date
	 * @return
	 */
	public static int getYearDate(int date){

		if(date<BEGIN_YEAR){
			return date;
		}else{
			return  date - BEGIN_YEAR;
		}
	}
	
	
	/**
	 * ��ȡ�·�
	 * @author �����
	 * @since:2011-9-15
	 * @param date
	 * @return
	 */
	public static int getMothOfDate(Date date){
		if(date == null){
			return 1;
		}
		return date.getMonth();
	}
	
	/**
	 * ��ȡ��
	 * @author �����
	 * @since:2011-9-15
	 * @param date
	 * @return
	 */
	public static int getDayOfDate(Date date){
		if(date == null){
			return 1;
		}
		return date.getDate();
	}
	
	/**
	 * ��ȡ�����ַ���
	 * @author �����
	 * @since:2011-9-15
	 * @param date
	 * @return
	 */
	public static String getDateOfString(Date date){
		if(date == null){
			date = new Date();
		}
		return DATA_FORMAT.format(date);
	}
	
	/**
	 * �Ƚ��������ڴ�С
	 * @author �����
	 * @since:2011-9-21
	 * @param date1
	 * @param date2
	 * @param compareWhat	��ȷ�ȣ�</br>
	 * 			��ȷ����:{@link DateUtils#DATE_COMPARE_YEAR} </br>
	 * 			��ȷ����:{@link DateUtils#DATE_COMPARE_MONTH} </br>
	 * 			��ȷ����:{@link DateUtils#DATE_COMPARE_DAY} </br>
	 * 			��ȷ��ʱ:{@link DateUtils#DATE_COMPARE_HOURS} </br>
	 * 			��ȷ����:{@link DateUtils#DATE_COMPARE_MINUTES} </br>
	 * @return date1��date2֮ǰ:{@link DateUtils#DATE_BEFORE} </br>
	 * 			date1��date2֮��:{@link DateUtils#DATE_AFTER} </br>
	 * 			date1��date2���:{@link DateUtils#DATE_EQUALS} </br>
	 * 			date1��date2δ֪��С:{@link DateUtils#DATE_UNKOWN} </br>
	 */
	public static int compareDate(Date date1,Date date2,int compareWhat){
		if(date1 == null || date2 == null){
			return DATE_UNKOWN;
		}
		
		if(date1.getYear()<date2.getYear()){
				return DATE_BEFORE;
    	}else if(date1.getYear()>date2.getYear()){
				return DATE_AFTER;
    	}else{
    		//�����
    		if(compareWhat == DATE_COMPARE_YEAR){
				return DATE_EQUALS;
			}
    		
    		if(date1.getMonth()<date2.getMonth()){
    				return DATE_BEFORE;
        	}else if(date1.getMonth()>date2.getMonth()){
    				return DATE_AFTER;
        	}else{
        		//�����
        		if(compareWhat == DATE_COMPARE_MONTH){
    				return DATE_EQUALS;
    			}
        		if(date1.getDate()<date2.getDate()){
        				return DATE_BEFORE;
            	}else if(date1.getDate()>date2.getDate()){
        				return DATE_AFTER;
            	}else{
            		//�����
            		if(compareWhat == DATE_COMPARE_DAY){
        				return DATE_EQUALS;
        			}
            		if(date1.getHours()<date2.getHours()){
            				return DATE_BEFORE;
                	}else if(date1.getHours()>date2.getHours()){
            				return DATE_AFTER;
                	}else{
                		//Сʱ���
                		if(compareWhat == DATE_COMPARE_HOURS){
            				return DATE_EQUALS;
            			}
                		if(date1.getMinutes()<date2.getMinutes()){
                				return DATE_BEFORE;
                    	}else if(date1.getMinutes()>date2.getMinutes()){
                				return DATE_AFTER;
                    	}else{
                    		//�������
                    		if(compareWhat == DATE_COMPARE_MINUTES){
                				return DATE_EQUALS;
                			}
                    	}
                		
                	}
            		
            	}
        	}
    	}
		return DATE_UNKOWN;
	}

	/**
	 * ��ȡĿ����������
	 * @author �����
	 * @since:2011-10-27
	 * @param currentDate
	 * @param targetDate
	 * @return
	 */
	public static String getDayName(Date currentDate,Date targetDate){
		if(currentDate == null || targetDate == null){
			return "��ȷ��";
		}
		
		String result = "";
		long l0 = targetDate.getTime();
		
		Date date = new Date(currentDate.getYear(),currentDate.getMonth(),currentDate.getDate(),0,0,0);
		
		//�����賿
		long todayL = date.getTime();
		//�����賿
		long tomorrowL = todayL + 86400000;
		//�����賿
		long tomorrow2L = tomorrowL + 86400000;
		//������賿
		long tomorrow3L = tomorrow2L + 86400000;
		
		if(l0 >= todayL && l0 <tomorrowL){
			result = "����";
		}else if(l0 >= tomorrowL && l0 <tomorrow2L){
			result = "����";
		}else if(l0 >= tomorrow2L && l0 <tomorrow3L){
			result = "����";
		}else{
			result = "";
		}
		
		
//		int ret = compareDate(currentDate,targetDate,DATE_COMPARE_MONTH);
//		if(ret == DATE_EQUALS){
//			
//			int d1 = currentDate.getDate();
//			int d2 = targetDate.getDate();
//			int d0 = d2 - d1;
//			if(d0 == 0){
//				result = "����";
//			}else if(d0 == 1){
//				result = "����";
//			}else if(d0 == 2){
//				result = "����";
//			}else if(d0 == -1){
//				result = "����";
//			}else if(d0 == -2){
//				result = "ǰ̨";
//			}
//		}else if(ret == DATE_BEFORE){
//			int m1 = currentDate.getMonth();
//			int m2 = targetDate.getMonth();
//			int m0 = m2 - m1;
//			if(m0 == 1){
//				//���ڿ���
//				int d1 = currentDate.getDate();
//				int d2 = targetDate.getDate();
//				int d0 = d2 - d1;
//				if(d0 == 0){
//					result = "����";
//				}else if(d0 == 1){
//					result = "����";
//				}else if(d0 == 2){
//					result = "����";
//				}else if(d0 == -1){
//					result = "����";
//				}else if(d0 == -2){
//					result = "ǰ̨";
//				}
//			}
//		}
		
		return result;
	}
}
