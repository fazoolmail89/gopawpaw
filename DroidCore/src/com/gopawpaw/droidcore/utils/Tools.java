package com.gopawpaw.droidcore.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/**
 * @author CUNGUANTONG
 * @date 2011-12-14
 * @version
 * @description 工具处理类
 */
public class Tools {

	/**
	 * [判断邮箱格式是否正确]<BR>
	 * [功能详细描述]
	 * @param strEmail 带验证邮箱地址
	 * @return true 正确
	 * 		   false 错误
	 * author:CUNGUANTONG465
	 * editor:CUNGUANTONG465
	 * time:2012-2-8
	 */
	public static boolean isEmail(String strEmail) {
//		String strPattern = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";
		String strPattern = "[a-zA-Z0-9]{1,}[a-zA-Z0-9_-]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
		Pattern p = Pattern.compile(strPattern);
		Matcher m = p.matcher(strEmail.trim());
		if (m.matches()) {
			return true;
		}
		return false;
	}
	
	/**
	 * [将参数和值封装成xml节点数据]<BR>
	 * [功能详细描述]
	 * @param element
	 * @param value
	 * @return
	 */
	public static String format2Xml(String element,String value)
	{
		StringBuilder builder = new StringBuilder();
		if(!isEmpty(element)){
			value = value==null ? "" : value;
			builder.append("<"+element+">").append("<![CDATA[").append(value).append("]]>").append("</"+element+">");
		}
		return builder.toString();
	}
	
	/**
	 * [将参数和值封装成xml节点数据]<BR>
	 * [功能详细描述]
	 * @param element
	 * @param value
	 * @return
	 */
	public static String format2Xml(String element,int value)
	{
		StringBuilder builder = new StringBuilder();
		if(!isEmpty(element)){
			builder.append("<"+element+">").append("<![CDATA[").append(value).append("]]>").append("</"+element+">");
		}
		return builder.toString();
	}
	
	/**
	 * [将参数和值封装成xml节点数据]<BR>
	 * [功能详细描述]
	 * @param element
	 * @param value
	 * @return
	 */
	public static String format2Xml(String element,boolean value)
	{
		StringBuilder builder = new StringBuilder();
		if(!isEmpty(element)){
			builder.append("<"+element+">").append("<![CDATA[").append(value).append("]]>").append("</"+element+">");
		}
		return builder.toString();
	}
	
	
	/**
	 * [得到key]<BR>
	 * [功能详细描述]
	 * @param keys
	 * @return
	 */
	public static String getKey(String... keys)
	{
		if(keys == null) return "";
		StringBuffer sbKey = new StringBuffer();
		
		for(int i=0;i<keys.length;i++)
		{
			sbKey.append(keys[i]);
			if(i == keys.length -1)
			{
				break;
			}
			sbKey.append(File.separator);
		}
		return sbKey.toString();
	}
	
	/**
	 * [判断字符长度]<BR>
	 * [功能详细描述]
	 * @param str
	 * @param maxLen
	 * @return
	 */
	public static boolean isLength(String str, int maxLen) {
        char[] cs = str.toCharArray();
        int count = 0;
        int last = cs.length;
        for(int i=0; i<last; i++) {
            if(cs[i]>255) count+=2;
            else count++;
        }
        if(count >= maxLen)
        	return true;
        else
        	return false;
    }
	
	/**
	 * [获取字符串的长度，如果有中文，则每个中文字符计为2位]<BR>
	 * [功能详细描述]
	 * @param value
	 * @return
	 */
	public static int getLength(String value) {
        int valueLength = 0;
        String chinese = "[\u0391-\uFFE5]";
        for (int i = 0; i < value.length(); i++) {
            String temp = value.substring(i, i + 1);
            if (temp.matches(chinese)) {
                valueLength += 2;
            } else {
                valueLength += 1;
            }
        }
        return valueLength;
    }
	
	/**
	 * 格式化显示金额字符串
	 * "0.00"格式
	 * @param amount 要转换的金额double数字
	 * @return 格式化后的金额字符串
	 */
	public static String getAmountFormat(double amount){
		try{
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(amount);}
		catch(Exception e)
		{
			return "";
		}
	}
	
	
	/** 格式化显示金额字符串
	 * "0.00"格式
	 * @param amount 要转换的金额字符串
	 * @return 格式化后的金额字符串
	 */
	public static String getStringAmountFormat(String amount){		
		try{
			if(amount==null||amount.trim().equals("")){
				amount="0.00";
			}
			double amount2 = Double.parseDouble(amount);
			DecimalFormat df = new DecimalFormat("0.00");
			return df.format(amount2);
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	
	/**
	 * 格式化显示净值字符串(如果输入参数转换后为空字符则返回默认0.0000)
	 * "0.0000"格式
	 * @param amount 要转换的净值字符串
	 * @return 格式化后的净值字符串
	 */
	public static String getNetvalueFormatWithEmpty(String amount)
	{
		try{
			Double db = Double.parseDouble(amount);
			DecimalFormat df = new DecimalFormat("0.0000");
			return df.format(db);}
		catch(Exception e){
			return "0.0000";
		}
	}
	
	/**
	 * 截取一段字符的长度(汉、日、韩文字符长度为2),不区分中英文,如果数字不正好，则少取一个字符位
	 * 
	 * @param str 原始字符串
	 * @param specialCharsLength
	 *            截取长度(汉、日、韩文字符长度为2)
	 * @return
	 */
	public static String trim(String str, int specialCharsLength) {
		if (str == null || "".equals(str) || specialCharsLength < 1) {
			return "";
		}
		char[] chars = str.toCharArray();
		
		int charsLength = getCharsLength(chars, specialCharsLength);
		if (charsLength < chars.length)
			return new String(chars,0,charsLength)+"...";
		return new String(chars, 0, charsLength);
	}
	
	/**
	 * 处理String 如果str为：null,null串,false,则返回空字符串""否则返回原样
	 * @author EX-LIJINHUA001
	 * @date 2013-2-25
	 * @param str
	 * @return
	 */
	public static String trim(String str){
		if(str == null){
			return "";
		}
		String[] strs = new String[]{"null","false"};
		for(String s : strs){
			if(s.equals(str.trim())){
				str = "";
			}
		}
		return str;
	}
	
	/**
	 * 获取一段字符的长度，输入长度中汉、日、韩文字符长度为2，输出长度中所有字符均长度为1
	 * 
	 * @param chars 一段字符
	 * @param specialCharsLength 输入长度，汉、日、韩文字符长度为2
	 * @return 输出长度，所有字符均长度为1
	 */
	public static int getCharsLength(char[] chars, int specialCharsLength) {
		int count = 0;
		int normalCharsLength = 0;
		for (int i = 0; i < chars.length; i++) {
			int specialCharLength = getSpecialCharLength(chars[i]);
			if (count <= specialCharsLength - specialCharLength) {
				count += specialCharLength;
				normalCharsLength++;
			} else {
				break;
			}
		}
		return normalCharsLength;
	}
	
    /**
     * [计算一段字符的长度，汉、日、韩文字符长度为2，其他为1]<BR>
     * [如：中国平安PingAn，其长度是14]
     * 
     * @param chars 要计算长度的char数组
     * @return
     */
    public static int getTotalCharsLength(char[] chars)
    {
        int count = 0;
        for (int i = 0; i < chars.length; i++)
        {
            int specialCharLength = getSpecialCharLength(chars[i]);
            count += specialCharLength;
        }
        return count;
    }
    

	/**
	 * 获取字符长度：汉、日、韩文字符长度为2，ASCII码等字符长度为1
	 * 
	 * @param c 字符
	 * @return 字符长度
	 */
	private static int getSpecialCharLength(char c) {
		if (isLetter(c)) {
			return 1;
		} else {
			return 2;
		}
	}

	/**
	 * 判断一个字符是Ascill字符还是其它字符（如汉，日，韩文字符）
	 * 
	 * @param char c, 需要判断的字符
	 * @return boolean, 返回true,Ascill字符
	 */
	private static boolean isLetter(char c) {
		int k = 0x80;
		return c / k == 0 ? true : false;
	}
	
	/**
	 * 是否为空
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		if (value == null || value.length() == 0) {
			return true;
		}
		else
			return false;
	}

	/**
	 * 是否为数字
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNumeric(Object obj) {
		if (obj == null) {
			return false;
		}
		String str = obj.toString();
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
     /**
      * 格式化利率
      * [一句话功能简述]<BR>
      * [功能详细描述]
      * @param retestRate
      * @return
      */
     public static String formatReterestRate(String strRetestRate) {
         double retestRate ;
         try {
             retestRate = Double.parseDouble(strRetestRate);
         } catch (Exception e) {
             return "0.00%";
         }
//         retestRate *= 10;
         DecimalFormat df = new DecimalFormat("0.00");
         return df.format(retestRate) + "%";
     }
	
	/**
	 * 判断是否为0，价格显示时，为零则要显示
	 * @param str
	 * @return
	 */
	public static boolean isStringZero(String str) {
		if (str == null)
			return false;
		String s = str.replace(".", "");
		try {
			int num = Integer.valueOf(s);
			if (num == 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * 改变背景的透明度
	 * @param v
	 */
	public static void changeBackgroundAlpha(View v) {
		Drawable mDrawable1 = v.getBackground();
		mDrawable1.setAlpha(200);
		v.invalidate();
		mDrawable1.setAlpha(255);
		v.invalidate();
		
	}
	
	
	/***************************有关字符串处理方法**************************/
	
	/**
	 * 去除String字符串中指定字符
	 * @param str<br>需去除指定字符的字符串
	 * @param s<br>指定去除的字符
	 * @return<br> 处理后的字符串
	 * 注：已测试通过
	 */
	public static String split(String str,String s){
		StringBuffer sb = new StringBuffer();
		String[] str2 = str.split(s);
		for(int i=0;i<str2.length;i++)
			sb.append(str2[i]);
		return sb.toString();
	}
	
	public static boolean isNumberDecimal(String decimal){
		try {
			Float.parseFloat(decimal);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
		
	}
	
	/***************************************************************************/
	
	/**
	 * 列表倒序
	 * @param list
	 * @return
	 */
	public static List<Map<String,Object>> reverse(List<Map<String,Object>> list){
		List<Map<String,Object>> l = new ArrayList<Map<String,Object>>();
		int size = list.size();
		for(int i=size;i>0;i--){
			l.add(list.get(i));
		}
		return l;
	}
	
    
    
    /**
     * 获取根据屏幕获取实际大小
     * 在自定义控件中，根据屏幕的大小来获取实际的大小
     * 
     * @param ctx
     * @param orgSize
     * @return
     */
    public static int getActualSize(Context ctx, int orgSize) {
        WindowManager windowManager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        float density = (float) displayMetrics.density;
        
        return (int)(orgSize * density);
    }
	/**
	 * 获取地球上，两个经纬度点的距离
	 */
    private final static double EARTH_RADIUS = 6378.137;  
    public static double gps2m(double lat_a, double lng_a, double lat_b, double lng_b) {
       double radLat1 = (lat_a * Math.PI / 180.000);
       double radLat2 = (lat_b * Math.PI / 180.000);
       double a = radLat1 - radLat2;
       double b = (lng_a - lng_b) * Math.PI / 180.000;
       double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
              + Math.cos(radLat1) * Math.cos(radLat2)
              * Math.pow(Math.sin(b / 2), 2)));
       s = s * EARTH_RADIUS;
       s = Math.floor(s * 1000+0.5) / 1000;
       return s;
    }
	
	
	public static int indexOfListMap(List<Map<String, String>> list, Object obj, String key) {
		
		int listSize = list.size();
		for (int i = 0;i < listSize;i++) {
			Map<String, String> map = list.get(i);
			Object value = map.get(key);
			if (obj.equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 获取屏幕的深度值
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param ctx
	 * @return
	 */
	public static float getScreenDensity(Context ctx) {
	    WindowManager mWindowManager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
	    DisplayMetrics displayMetrics = new DisplayMetrics();
	    mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
	    float density = displayMetrics.density;
	    return density;
	}
	
	/**
	 * 
	 * [获取小数的整数部分]<BR>
	 * [功能详细描述]
	 * @param doubleStr 小数字符串
	 * @return
	 * 	   整数部分
	 */
	public static String getIntegerFromDouble(String doubleStr){
		if(doubleStr != null && doubleStr != ""){
			return doubleStr.substring(0, doubleStr.indexOf("."));
		}
		return "";
	}
	
	
	   /**
     * [判断邮箱格式是否正确]<BR>
     * [功能详细描述]
     * @param strEmail 带验证邮箱地址
     * @return true 正确
     *         false 错误
     * author:CUNGUANTONG465
     * editor:CUNGUANTONG465
     * time:2012-2-8
     */
    public static boolean isMobilePhoneNumber(String phoneNumber) {
        
        // 移动手机号码
        String mPattern = "(^134[0-8]\\d{7}$)|(^13[5-9]\\d{8}$)|(^15[01789]\\d{8}$)|(^18[78]\\d{8}$)|(^1349\\d{7}$)";
        
        // 联通号码
        String uniPattern= "(^1349\\d{7}$)|(^13[12]\\d{8}$)|(^156\\d{8}$)|(^18[6]\\d{8}$)";
        
        //电信号码验证正则表达式
        String ePattern= "(^1[35]3\\d{8}$)|(^189\\d{8}$)";
        
        Pattern pm = Pattern.compile(mPattern);
        Matcher mm = pm.matcher(phoneNumber.trim());
        
        Pattern um = Pattern.compile(uniPattern);
        Matcher mu = um.matcher(phoneNumber.trim());
        
        Pattern em = Pattern.compile(ePattern);
        Matcher me = em.matcher(phoneNumber.trim());
        
        if (mm.matches() || mu.matches() || me.matches()) {
            return true;
        }
        
        return false;
    }
    
    /**
     * 从JSONObject中获取keys的值
     * @author EX-LIJINHUA001
     * @date 2013-1-15
     * @param json
     * @param keys
     * @return
     */
    public static Object getValuseFromJSONObject(JSONObject json,String...keys){
    	Object valuse = null;
    	if(json == null || keys == null){
    		return valuse;
    	}
    	try {
    		int size = keys.length;
    		JSONObject jsonObject = json;
    		for(int i=0;i<size;i++){
    			String key = keys[i];
    			if(i <(size-1)){
    				jsonObject = jsonObject.getJSONObject(key);
    			}else{
    				//最后一个
    				valuse = jsonObject.get(key);
    			}
    		}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valuse;
    }
    
    /**
     * JSONObject 转换成 HashMap
     * @author EX-LIJINHUA001
     * @date 2013-2-20
     * @param json
     * @return
     */
    public static HashMap<String,Object> getMapFromJSONObject(JSONObject json){
    	HashMap<String,Object> valuse = null;
    	if(json == null){
    		return valuse;
    	}
    	Iterator<?> it = json.keys();
    	if(it == null){
    		return valuse;
    	}
    	valuse = new HashMap<String,Object>();
    	while(it.hasNext()){
    		//依次将json中的值移到HashMap中
    		String key = (String) it.next();
    		valuse.put(key,json.optString(key));
    	}
		return valuse;
    }
    
    /**
     * 将JSONArray转为ArrayList<HashMap<String,Object>>
     * @author EX-LIJINHUA001
     * @date 2013-1-15
     * @param jsonArray
     * @param keys 
     * @return
     */
    public static ArrayList<Map<String,Object>> getListMapFromJSONArray(JSONArray jsonArray){
    	ArrayList<Map<String,Object>> valuse = null;
    	if(jsonArray == null){
    		return valuse;
    	}
    	
    	valuse = new ArrayList<Map<String,Object>>();
    	try {
			int length = jsonArray.length();
            for(int i = 0; i < length; i++){//遍历JSONArray
                JSONObject oj = jsonArray.getJSONObject(i);
                //依次将json中的值移到HashMap中
                HashMap<String,Object> map = getMapFromJSONObject(oj);
                if(map != null){
                	valuse.add(map);
                }
            }

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valuse;
    }
}
