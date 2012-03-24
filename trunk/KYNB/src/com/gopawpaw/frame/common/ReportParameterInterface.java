/**
 * 
 */
package com.gopawpaw.frame.common;

import java.util.HashMap;

/**
 * @version 2010-4-23
 * @author 李锦华
 * @ 报表参数接口
 */
public interface ReportParameterInterface {
	
	/**
	 * 获取用户报表目录。若未指定该目录，则默认在报表程序根目录
	 */
	public String getUserReportDir();
	
	/**
	 * 获取报表名称
	 */
	public String getReportName();
	
	/**
	 * 获取报表参数映射表
	 */
	public HashMap<String, String> getReportParameterMap();

}
