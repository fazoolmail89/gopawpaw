package com.gopawpaw.kynb.module.datascan2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hsqldb内存数据库管理工具类
 * @author lxq
 *
 */
public class HsqlMemDbUtil extends Thread{
	private static Connection conn = null;
	
	public static Connection getHsqlConn() {
		return conn;
	}
	
	private static void createConn() {
		if (conn == null) {
			try {
				Class.forName("org.hsqldb.jdbc.JDBCDriver");
				conn = DriverManager.getConnection("jdbc:hsqldb:mem:temp", "SA","");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void start() {
		super.start();
		createConn();
		createTable();
	}
	
	
	/**
	 * 销毁数据库连接
	 */
	public void destoryConn() {
		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}

	public static void createTable() {
		String sql = "create table mvillager ("
				+ " id integer not null primary key," 
				+ " A varchar(255),"
				+ " B varchar(255),"
				+ " C varchar(255)," 
				+ " D varchar(255),"
				+ " E varchar(255)," 
				+ " F varchar(255),"
				+ " G varchar(255)," 
				+ " H varchar(255)," 
				+ " I varchar(255)," 
				+ " J varchar(255) )";
		Statement sta = null;

		try {
			sta = conn.createStatement();
			sta.execute(sql);
			sta.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}
