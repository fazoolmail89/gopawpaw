package com.gopawpaw.kynb.module.datascan;

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
				+ " v_ic varchar(255),"
				+ " v_name varchar(255),"
				+ " v_bank_account varchar(255) )";
		Statement sta = null;

		try {
			sta = conn.createStatement();
			sta.execute(sql);
			sta.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

/*	private void insertData() {
		String sql = "INSERT INTO mvillager VALUES(0,'xiangqi','lu','')";
		Statement sta = null;

		try {
			sta = conn.createStatement();
			sta.execute(sql);
			sta.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

	private void selectData() {
		String sql = "select * from mvillager";
		Statement sta = null;
		ResultSet rs = null;

		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			sta.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}*/

/*	public static void main(String[] args) {
		HsqlMemDbUtil hmdu = new HsqlMemDbUtil();
		createConn();
		createTable();
		hmdu.insertData();
		hmdu.selectData();
		destoryConn();

		createConn();
		hmdu.selectData();
		destoryConn();
	}*/
}
