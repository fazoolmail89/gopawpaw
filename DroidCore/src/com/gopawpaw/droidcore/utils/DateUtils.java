/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
package com.gopawpaw.droidcore.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * 日期处理工具类,有关日期/时间处理方法
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
public class DateUtils {
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYYMMDD = "yyyyMMdd";
    public static final String YYYYMM = "yyyyMM";
    public static final String YYYY_MM = "yyyy-MM";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	
	private static Calendar now = Calendar.getInstance();
	
	private static Calendar lastWeek;
	
	private static Calendar lastMonth;
	
	private static Calendar lastSixMonth ;
	
    /**
	 * 获取一个指定格式的String date 
	 * @param figure	相对时间上加减 相应月数
	 * @param format	格式化
	 * @param date		相对时间
	 * @return String date
	 */
	public static String getStrDataDistanceByMonth(int figure,String format,Date date){
		SimpleDateFormat asf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, figure);
		Date time  = calendar.getTime();
		return asf.format(time);
	}
	/**
	 * 获取加减月份前的日期
	 * @param figure	相对时间上加减 相应月数
	 * @param format	格式化
	 * @param date		相对时间
	 * @return String date
	 * @throws ParseException 非法异常
	 */
	public static String getStrDataDistanceByMonth(int figure,String format,String date) throws ParseException{
		SimpleDateFormat asf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		Date tempDate = asf.parse(date);
		calendar.setTime(tempDate);
		calendar.add(Calendar.MONTH, figure);
		Date time  = calendar.getTime();
		return asf.format(time);
	}
	
	public static String getNatureStrDataDistance(int figure,String date,String format){
		try{
			SimpleDateFormat asf = new SimpleDateFormat(format);
			Calendar calendar = Calendar.getInstance();
			Date tempDate = asf.parse(date);
			calendar.setTime(tempDate);
			calendar.add(Calendar.MONTH, figure);
			calendar.set(Calendar.DATE, 1);
			Date time  = calendar.getTime();
			return asf.format(time);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return date;
		
	}
	
	public static long getLongDataDistanceByMonth(int figure,Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, figure);
		return calendar.getTimeInMillis();
	}
	
	public static Calendar getCalendarDistanceByYear(int figure,Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, figure);
		return calendar;
	}
	
	/**
	 * 将日期类型转换为Date类型
	 * @param dateString
	 * @return
	 */
	public static String dateStringToDate(String dateString){
	    if (Tools.isEmpty(dateString)) {
	        return "";
	    }
	    if (dateString.length() < 8 ) {
	        return "";
	    } else if(dateString.length() > 8) {
	    	return dateString;
	    }
	    
		StringBuffer sb = new StringBuffer();
		sb.append(dateString);
		sb.insert(4, "-");
		sb.insert(7, "-");
		return sb.toString();
	}
	
	/**
	 * @param dateString
	 * @return
	 */
	public static String yMStringToDate(String dateString){
		StringBuffer sb = new StringBuffer();
		sb.append(dateString);
		sb.insert(4, "-");
		return sb.toString();
	}
	
	/**
	 * 对形如2010-10-10格式的日期转换成20101010
	 * @param date
	 * @return
	 */
	public static String dateToDateString(String date) {
	    if (Tools.isEmpty(date)) {
	        return null;
	    }
        String date2 = date.replaceAll("-", "");
	    return date2;
	}
	
	/**
	 * 把日期从旧到新排序。
	 * @param monthList<br>月份列表或日期列表
	 * 列表元素格式如：20110102（日期）、201108（年月）
	 * @return int[]<br> 
	 */
	public static int[] sortMonth(String[] monthList){
		if(monthList!=null){
			int len = monthList.length;
			int[] temp = new int[len];
			int t = 0;
			for(int i=0;i<len;i++){
				temp[i] = Integer.parseInt(monthList[i]);
			}
			for(int i=0;i<len;i++){
				for(int j=i+1;j<len;j++){
					if(temp[i]>temp[j]){
						t = temp[i];
						temp[i] = temp[j];
						temp[j] = t;
					}
				}
			}
			return temp;
		}else
			return null;
	}
	
	/**
	 * 获取当前年月，格式如：201101
	 * @return String<br>
	 */
	public static String getCurrentYM(){
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		if(0==m){
			m = 12;
		}
		if(0<m && m<10){
			String m2 = "0"+String.valueOf(m);
			return String.valueOf(y) + m2;
		}else{
			return String.valueOf(y)+String.valueOf(m);
		}
	}
	
	public static String LongToFormatDate(Long time,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String date = sdf.format(new Date(time));
		return date;
	}
	
	public static String DateToFormatDate(Date time,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String date = sdf.format(time);
		return date;
	}
	
	public static Calendar dateToCalendar(Date time){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String dateStr = dateFormat.format(time);
		String year = dateStr.substring(0, 4);
		String month = dateStr.substring(4, 6);
		String day = dateStr.substring(6);
		    
		Calendar currentTime = Calendar.getInstance();
		    
		currentTime.clear();
		currentTime.set(Calendar.YEAR, Integer.parseInt(year));
		currentTime.set(Calendar.MONTH, Integer.parseInt(month) - 1);
		currentTime.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
		return currentTime;
	}
	
	public static Date StringToDate(String date,String formart) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(formart);
		return sdf.parse(date);
	}
	
	public static String StringToDate(String date,String fromFormart,String toFormart) {
		if(date!=null&&fromFormart!=null&&toFormart!=null){
			try {
				SimpleDateFormat fromSDF = new SimpleDateFormat(fromFormart);
				SimpleDateFormat sdf = new SimpleDateFormat(toFormart);
				Date tempDate = fromSDF.parse(date);
				return sdf.format(tempDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return date;
	}
	
	public static long convert2long(String date , String format)
	{
		try {
			if(!Tools.isEmpty(date)){
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				return sdf.parse(date).getTime();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0L;
	}
	
	public static String format(Date date, String format) {
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    return sdf.format(date);
	}
	
	public static Date format(String dateStr, String format) {
		try {
			Date date = new SimpleDateFormat(format).parse(dateStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String format(Calendar calendar, String format) {
	    return format(calendar.getTime(), format);
	}
	
	   
    public static Calendar strToCalendar(String dateStr, String format) {
        SimpleDateFormat fromSDF = new SimpleDateFormat(format);
        Date dateBeginDate = null;
        try
        {
            dateBeginDate = fromSDF.parse(dateStr);
        }
        catch (ParseException e)
        {
            return null;
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateBeginDate);
        return calendar;
    }
    
    /**
     * 格式把Calendar对象格式化化成 yyyy年MM月dd日,星期X"的样式
     * @param calendar
     * @return
     */
    public static String formatDateWithWeek(Calendar calendar) {
        
        return formatDateWithWeek(calendar, "yyyy年MM月dd日, 星期");
    }
    
    public static String formatDateWithWeek(Calendar calendar, String format) {
        String formatStr = format(calendar, format);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        AppLog.i("Tools", "dayOfWeek:" + dayOfWeek);
        String week = null;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                week = "日";
                break;
            case Calendar.MONDAY:
                week = "一";
                break;
            case Calendar.TUESDAY:
                week = "二";
                break;
            case Calendar.WEDNESDAY:
                week = "三";
                break;
            case Calendar.THURSDAY:
                week = "四";
                break; 
            case Calendar.FRIDAY:
                week = "五 ";
                break;
            case Calendar.SATURDAY:
                week = "六";
                break;
        }
        formatStr = formatStr + week;
        return formatStr;
    }
    
    /**
     * 在日期前加一个0
     * 如　1 返回 "01"
     *  10 返回　"10"
     * [一句话功能简述]<BR>
     * [功能详细描述]
     * @param day
     * @return
     */
    public static String formatDay(int day) {
        if (day < 10) {
            return "0" + day;
        }
       return String.valueOf(day); 
    }
    
    /**
     * 从字符串日期中滤出年月日
     * 如2011-11-11
     * Calander.YEAR 得 2011
     * Calander.MONTH 得11
     * Calander.DAY_OF_MONTH 得11
     * [一句话功能简述]<BR>
     * [功能详细描述]
     * @param field
     * @param dateString
     * @return
     */
    public static int getDateFieldFormStringDate(int field, String dateString) {
        if (Tools.isEmpty(dateString)) {
            throw new RuntimeException("Empty dateString");
        }
        if (dateString.length() < 10 ) {
            throw new RuntimeException("dateString length error");
        }
        
        String[] dates = dateString.split("-");
        
        switch (field) {
            case Calendar.YEAR:
                return Integer.parseInt(dates[0]);
            case Calendar.MONTH:
                return Integer.parseInt(dates[1]);
            case Calendar.DAY_OF_MONTH:
                return Integer.parseInt(dates[2]);
        }
        return -1;
    }

    /**
     * 从字符串日期中滤出年月
     * 如2011-11
     * Calander.YEAR 得 2011
     * Calander.MONTH 得11
     * @param field
     * @param dateString
     * @return
     */
    public static int getDateFieldFormStringYearAndMonth(int field, String dateString) {
        if (Tools.isEmpty(dateString)) {
            throw new RuntimeException("Empty dateString");
        }
        if (dateString.length() < 7 ) {
            throw new RuntimeException("dateString length error");
        }
        
        String[] dates = dateString.split("-");
        
        switch (field) {
            case Calendar.YEAR:
                return Integer.parseInt(dates[0]);
            case Calendar.MONTH:
                return Integer.parseInt(dates[1]);
        }
        return -1;
    }
    
    /**
     * 
     * @param data  被 转换的时间
     * @param format  
     * 			{@link #YYYY_MM_DD}
     * 			{@link #YYYYMMDD}
     * 			{@link #YYYYMM}
     * 			{@link #YYYY_MM}
     * 			{@link #YYYY_MM_DD_HH_MM_SS}
     * 			{@link #YYYY_MM_DD_HH_MM}
     * @return
     */
    public static String getStringByDate(Date data,String format){
    	SimpleDateFormat dateFormat = new SimpleDateFormat(format);
    	return dateFormat.format(data);
    }
	
    public static Date getDataByString(String date,String formart){
		SimpleDateFormat sdf = new SimpleDateFormat(formart);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    
    /**
	 * 返回今天的日期，格式20111109
	 * @return
	 */
	public static String getToday(){
		return dateFormat.format(now.getTime());
	}
	
	public static String getToday(String format){
		if (format != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			return dateFormat.format(now.getTime());
		} else {
			return now.getTime().getTime() + "";
		}
	}
	
	/**
	 * 返回30天前的日期
	 * @return
	 */
	public static String getPreMonth(){
		Calendar preMonth = Calendar.getInstance();
		return getPreMonth(preMonth);
	}
	
	public static String getPreMonth(Calendar calendar) {
		calendar.add(Calendar.MONTH, -1);
		return dateFormat.format(calendar.getTime());
	}
	
	/**
	 * 返回6个月前的日期
	 * @return
	 */
	public static String getLastSixMonth(){
		lastSixMonth = Calendar.getInstance();
		lastSixMonth.add(Calendar.DAY_OF_YEAR, -180);
		return dateFormat.format(lastSixMonth.getTime());
	}
	
	/**
	 * 得到下一周
	 * @return
	 */
	public static String getLastWeek(){
		lastWeek = Calendar.getInstance();
		lastWeek.add(Calendar.DAY_OF_YEAR, -7);
		return dateFormat.format(lastWeek.getTime());
	}
	
	/**
	 * 得到下一个月
	 * @return
	 */
	public static String getLastMonth(){
		lastMonth = Calendar.getInstance();
		lastMonth.add(Calendar.DAY_OF_YEAR, -7);
		return dateFormat.format(lastMonth.getTime());
	}

	/**
	 * 得到下一年的当天日期
	 * 优先获取服务器时间
	 * @return
	 */
	public static String getNextYear(){
		String nextYear = "";
		Calendar tempdate = getCurrentTimeByCalendar();
		tempdate.add(Calendar.YEAR, 1);
		nextYear = format(tempdate, "yyyyMMdd");
		tempdate.add(Calendar.YEAR, -1);
		return nextYear;
	}
	
	/**
	 * 得到上一年的当天日期
	 * 优先获取服务器时间
	 * @return
	 */
	public static String getBeforYear(){
		String lastYear = "";
		Calendar tempdate = getCurrentTimeByCalendar();
		tempdate.add(Calendar.YEAR, -1);
		lastYear = format(tempdate, "yyyyMMdd");
		tempdate.add(Calendar.YEAR, 1);
		return lastYear;
	}
	
	/**
	 * [两个日期的对比]<BR>
	 * [功能详细描述]
	 * @param dateStr1
	 * @param dateStr2
	 * @return 大于为1,小于为-1,等于为0,非法为-2
	 */
	public static int compareDate(String dateStr1, String dateStr2) {
		
		if(dateStr1 == null || dateStr1.equals("")) {
			return -2;
		}
		if(dateStr2 == null || dateStr2.equals("")) {
			return -2;
		}
		
		try {
			Date date1 = dateFormat.parse(dateStr1);
			Date date2 = dateFormat.parse(dateStr2);
			return date1.compareTo(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return -2;
	}
	
	/**
	 * [两个日期的对比]<BR>
	 * [功能详细描述]
	 * @param dateStr1
	 * @param dateStr2
	 * @param format
	 * @return 大于为1,小于为-1,等于为0,非法为-2
	 */
	public static int compareDate(String dateStr1, String dateStr2, String format) {
		SimpleDateFormat asf = new SimpleDateFormat(format);
		if(dateStr1 == null || dateStr1.equals("")) {
			return -2;
		}
		if(dateStr2 == null || dateStr2.equals("")) {
			return -2;
		}
		
		try {
			Date date1 = asf.parse(dateStr1);
			Date date2 = asf.parse(dateStr2);
			return date1.compareTo(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return -2;
	}
	
	/**
	 * [获取当前日期]<BR>
	 * 格式：20111225
	 * 优先取服务器时间，如果服务器时间为空则取当前时间
	 * @return
	 */
	public static String getCurrentTime() {
		
		return getCurrentTime("yyyyMMdd");
	}
	
	/**
	 * [format若为空，则直接返回long值]<BR>
	 * @param format
	 * @return
	 */
	public static String getCurrentTime(String format) {
		String currentTime = getToday(format);
		return currentTime;
	}
	
	 /**
     * [获取当前日期]<BR>
     * 优先取服务器时间，如果服务器时间为空则取当前时间
     * @return 代表当前日期的Calendar对象
     */
	public static Calendar getCurrentTimeByCalendar() {
	    String currentDateStr = getCurrentTime();
	    
	    String year = currentDateStr.substring(0, 4);
	    String month = currentDateStr.substring(4, 6);
	    String day = currentDateStr.substring(6);
	    
	    Calendar currentTime = Calendar.getInstance();
	    
	    currentTime.clear();
	    currentTime.set(Calendar.YEAR, Integer.parseInt(year));
	    currentTime.set(Calendar.MONTH, Integer.parseInt(month) - 1);
	    currentTime.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
	    
	    return currentTime;
	}
	
	/**
     * [获取当前日期]<BR>
     * 优先取服务器时间，如果服务器时间为空则取当前时间
     * @return 代表当前日期的Calendar对象
     */
	public static Calendar getCurrentTimeByCalendarAmpm() {
	    String currentDateStr = getCurrentTime("yyyyMMddHH");
	    
	    String year = currentDateStr.substring(0, 4);
	    String month = currentDateStr.substring(4, 6);
	    String day = currentDateStr.substring(6,8);
	    String ampm = currentDateStr.substring(8,10);
	    
	    Calendar currentTime = Calendar.getInstance();
	    
	    currentTime.clear();
	    currentTime.set(Calendar.YEAR, Integer.parseInt(year));
	    currentTime.set(Calendar.MONTH, Integer.parseInt(month) - 1);
	    currentTime.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
	    currentTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(ampm));
	    
	    
	    return currentTime;
	}
}
