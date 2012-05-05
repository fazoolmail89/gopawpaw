package com.gopawpaw.kynb.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @version 2012-4-27
 * @author LiJinHua
 */
public class MacUtils {
	

	/**
	 * ªÒ»°MACµÿ÷∑
	 * @version 2012-4-27
	 * @author Jason
	 * @param
	 * @return String
	 */
	public static String  getMACAddress(){
		try {

			 String line;
	            Process process = Runtime.getRuntime().exec("cmd /c ipconfig /all");
	            BufferedReader bufferedReader = new BufferedReader(
	                            new InputStreamReader(process.getInputStream()));
	            Pattern macPattern =                      Pattern.compile("([0-9A-Fa-f]{2})(-[0-9A-Fa-f]{2}){5}");
	            Matcher macMatcher;
	            boolean result;
	            while ((line = bufferedReader.readLine()) != null)
	            {
	                if ("".equals(line))
	                    continue;
	                macMatcher = macPattern.matcher(line);
	                result = macMatcher.find();
	                if (result)
	                {
	                   return macMatcher.group(0);
	                }
	            }
			} catch (java.io.IOException e) {

				System.err.println("IOException " + e.getMessage());

			}
			
			return null;
		}
	
	public static void main(String[] args) {
		System.out.println(getMACAddress());
	}
}