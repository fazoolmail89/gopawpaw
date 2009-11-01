/**
 * 
 */
package com.gopawpaw.dev;

import java.sql.ResultSet;

import com.gopawpaw.dev.common.GppCommonDBAccess;

/**
 * @version 2009-10-7
 * @author 李锦华
 */
public class GppSQL {
	private GppCommonDBAccess commonsql = null;

	/**
	 * 
	 */
	public GppSQL() {
		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName("sun.jdbc.odbc.JdbcOdbcDriver");
		commonsql
				.setConnectName("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=GPPDATABASE.mdb");
		if (commonsql.connect("", "")) {
		//	System.out.print("connect seccessed!");
		} else {
			System.err.println("connect failed!");
		}
	}

	/**
	 * 执行不返回结果的SQL
	 * 
	 * @param strsql
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean executesql(String strsql) {
		return commonsql.executesql(strsql);
	}

	/**
	 * 执行查询返回结果的SQL
	 * 
	 * @param strsql
	 * @return 结果集
	 */
	public ResultSet query(String strsql) {
		commonsql.query(strsql);
		return commonsql.getResultLists();
	}

	/**
	 * 关闭数据库操作对象
	 * 
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean close() {
		return commonsql.close();
	}

}
