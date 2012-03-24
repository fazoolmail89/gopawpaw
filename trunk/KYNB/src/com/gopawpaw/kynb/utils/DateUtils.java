/**
 * 
 */
package com.gopawpaw.kynb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期工具类
 * @author 李锦华
 * @since: 2011-9-15
 */
public class DateUtils {
	
	/**
	 * 比较两个日期时，第一个日期在第二个日期之后
	 */
	public final static int DATE_AFTER = 1;
	
	/**
	 * 比较两个日期时，第一个日期在第二个日期之前
	 */
	public final static int DATE_BEFORE = 2;
	
	/**
	 * 比较两个日期时，第一个日期和第二个日期相等
	 */
	public final static int DATE_EQUALS = 3;
	
	/**
	 * 比较两个日期时，不确定大小
	 */
	public final static int DATE_UNKOWN = 4;
	
	/**
	 * 比较日期精确到年份
	 */
	public final static int DATE_COMPARE_YEAR = 1;
	
	/**
	 * 比较日期精确到月份
	 */
	public final static int DATE_COMPARE_MONTH = 2;
	
	/**
	 * 比较日期精确到日
	 */
	public final static int DATE_COMPARE_DAY = 3;
	
	/**
	 * 比较日期精确到时
	 */
	public final static int DATE_COMPARE_HOURS = 4;
	
	/**
	 * 比较日期精确到分
	 */
	public final static int DATE_COMPARE_MINUTES = 5;
	
	/**
	 * 日期格式
	 */
	public final static  SimpleDateFormat DATA_FORMAT=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	
	/**
	 * 时间数据格式
	 */
	public final static  SimpleDateFormat TIME_FORMAT_DATA=new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 时间显示格式
	 */
	public final static  SimpleDateFormat TIME_FORMAT_SHOW=new SimpleDateFormat("HH时mm分");
	
	/**
	 * 起始年份
	 */
	private final static int BEGIN_YEAR = 1900;
	
	/**
	 * 
	 */
	private DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 获取年份
	 * @author 李锦华
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
	 * 获取年份减去1900
	 * @author 李锦华
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
	 * 获取月份
	 * @author 李锦华
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
	 * 获取日
	 * @author 李锦华
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
	 * 获取日期字符串
	 * @author 李锦华
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
	 * 比较两个日期大小
	 * @author 李锦华
	 * @since:2011-9-21
	 * @param date1
	 * @param date2
	 * @param compareWhat	精确度：</br>
	 * 			精确到年:{@link DateUtils#DATE_COMPARE_YEAR} </br>
	 * 			精确到月:{@link DateUtils#DATE_COMPARE_MONTH} </br>
	 * 			精确到日:{@link DateUtils#DATE_COMPARE_DAY} </br>
	 * 			精确到时:{@link DateUtils#DATE_COMPARE_HOURS} </br>
	 * 			精确到分:{@link DateUtils#DATE_COMPARE_MINUTES} </br>
	 * @return date1在date2之前:{@link DateUtils#DATE_BEFORE} </br>
	 * 			date1在date2之后:{@link DateUtils#DATE_AFTER} </br>
	 * 			date1与date2相等:{@link DateUtils#DATE_EQUALS} </br>
	 * 			date1与date2未知大小:{@link DateUtils#DATE_UNKOWN} </br>
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
    		//年相等
    		if(compareWhat == DATE_COMPARE_YEAR){
				return DATE_EQUALS;
			}
    		
    		if(date1.getMonth()<date2.getMonth()){
    				return DATE_BEFORE;
        	}else if(date1.getMonth()>date2.getMonth()){
    				return DATE_AFTER;
        	}else{
        		//月相等
        		if(compareWhat == DATE_COMPARE_MONTH){
    				return DATE_EQUALS;
    			}
        		if(date1.getDate()<date2.getDate()){
        				return DATE_BEFORE;
            	}else if(date1.getDate()>date2.getDate()){
        				return DATE_AFTER;
            	}else{
            		//日相等
            		if(compareWhat == DATE_COMPARE_DAY){
        				return DATE_EQUALS;
        			}
            		if(date1.getHours()<date2.getHours()){
            				return DATE_BEFORE;
                	}else if(date1.getHours()>date2.getHours()){
            				return DATE_AFTER;
                	}else{
                		//小时相等
                		if(compareWhat == DATE_COMPARE_HOURS){
            				return DATE_EQUALS;
            			}
                		if(date1.getMinutes()<date2.getMinutes()){
                				return DATE_BEFORE;
                    	}else if(date1.getMinutes()>date2.getMinutes()){
                				return DATE_AFTER;
                    	}else{
                    		//分钟相等
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
	 * 获取目标日期名称
	 * @author 李锦华
	 * @since:2011-10-27
	 * @param currentDate
	 * @param targetDate
	 * @return
	 */
	public static String getDayName(Date currentDate,Date targetDate){
		if(currentDate == null || targetDate == null){
			return "不确定";
		}
		
		String result = "";
		long l0 = targetDate.getTime();
		
		Date date = new Date(currentDate.getYear(),currentDate.getMonth(),currentDate.getDate(),0,0,0);
		
		//今天凌晨
		long todayL = date.getTime();
		//明天凌晨
		long tomorrowL = todayL + 86400000;
		//后天凌晨
		long tomorrow2L = tomorrowL + 86400000;
		//大后天凌晨
		long tomorrow3L = tomorrow2L + 86400000;
		
		if(l0 >= todayL && l0 <tomorrowL){
			result = "今天";
		}else if(l0 >= tomorrowL && l0 <tomorrow2L){
			result = "明天";
		}else if(l0 >= tomorrow2L && l0 <tomorrow3L){
			result = "后天";
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
//				result = "今天";
//			}else if(d0 == 1){
//				result = "明天";
//			}else if(d0 == 2){
//				result = "后天";
//			}else if(d0 == -1){
//				result = "昨天";
//			}else if(d0 == -2){
//				result = "前台";
//			}
//		}else if(ret == DATE_BEFORE){
//			int m1 = currentDate.getMonth();
//			int m2 = targetDate.getMonth();
//			int m0 = m2 - m1;
//			if(m0 == 1){
//				//日期跨月
//				int d1 = currentDate.getDate();
//				int d2 = targetDate.getDate();
//				int d0 = d2 - d1;
//				if(d0 == 0){
//					result = "今天";
//				}else if(d0 == 1){
//					result = "明天";
//				}else if(d0 == 2){
//					result = "后天";
//				}else if(d0 == -1){
//					result = "昨天";
//				}else if(d0 == -2){
//					result = "前台";
//				}
//			}
//		}
		
		return result;
	}
}
