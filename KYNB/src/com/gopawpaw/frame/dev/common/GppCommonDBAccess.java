package com.gopawpaw.frame.dev.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gopawpaw.frame.javax.swing.GppJFrame;

/**
 * @version 2009-10-03
 * @author 李锦华
 *         <p>
 *         数据库操作通用类 包括对[Access;SQL
 *         Server;Oracle;DB2;Informix;Sybase;PostgreSQL;Mysql]等数据库的操作
 *         </p>
 */
public class GppCommonDBAccess {
	private static GppJFrame gjf= null;
	private Connection sqlCon;
	private ResultSet rstSql;
	private Statement stmS;
	private String strCon;
	private String driveName;
	private boolean status;
	private long rowcount;

	public GppCommonDBAccess() {
		super();
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		if(GppCommonDBAccess.gjf == null){
			GppCommonDBAccess.gjf = new GppJFrame();
		}
		
		
	}
	/**
	 * 设置连接驱动名称:
	 * 
	 * @param drivename
	 *            驱动名称
	 *            <p>
	 *            [Access] sun.jdbc.odbc.JdbcOdbcDriver
	 *            </p>
	 *            <p>
	 *            [SQL Server] com.microsoft.jdbc.sqlserver.SQLServerDriver
	 *            </p>
	 *            <p>
	 *            [Oracle] oracle.jdbc.driver.OracleDriver
	 *            </p>
	 *            <p>
	 *            [DB2] com.ibm.db2.jdbc.app.DB2Driver
	 *            </p>
	 *            <p>
	 *            [Informix] com.informix.jdbc.IfxDriver
	 *            </p>
	 *            <p>
	 *            [Sybase] com.sybase.jdbc.SybDriver
	 *            </p>
	 *            <p>
	 *            [PostgreSQL] org.postgresql.Driver
	 *            </p>
	 *            <p>
	 *            [Mysql] com.mysql.Driver
	 *            </p>
	 */
	public void setDriveName(String drivename) {
		this.driveName = drivename;
	}

	/**
	 * 设置连接源名称:
	 * 
	 * @param conname
	 *            数据库连接字符串
	 *            <p>
	 *            [Access] jdbc:odbc:gppdb 或 jdbc:odbc:Driver={MicroSoft Access
	 *            Driver (*.mdb)};DBQ=c:/gppdb.mdb
	 *            </p>
	 *            <p>
	 *            [SQL Server]
	 *            jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=gppdb
	 *            </p>
	 *            <p>
	 *            [Oracle] jdbc:oracle:thin:@localhost:1521:gppdb
	 *            </p>
	 *            <p>
	 *            [DB2] jdbc:db2://localhost:5000/gppdb
	 *            </p>
	 *            <p>
	 *            [Informix]
	 *            jdbc:informix-sqli://127.0.0.1:1533/gppdb:INFORMIXSERVER
	 *            =myserver;user=test;password=test
	 *            </p>
	 *            <p>
	 *            [Sybase] jdbc:sybase:Tds:localhost:5007/gppdb
	 *            </p>
	 *            <p>
	 *            [PostgreSQL] jdbc:postgresql://localhost/gppdb
	 *            </p>
	 *            <p>
	 *            [Mysql] jdbc:mysql://127.0.0.1/gppdb
	 *            </p>
	 */
	public void setConnectName(String conname) {
		this.strCon = conname;
	}

	/**
	 * 连接数据库
	 * 
	 * @param username
	 *            帐号
	 * @param password
	 *            密码
	 * @return boolean status 连接状态
	 */
	public boolean connect(String username, String password) {
		try {
			Class.forName(this.driveName).newInstance();
			this.sqlCon = java.sql.DriverManager.getConnection(this.strCon,
					username, password);
			this.status = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			this.status = false;
			return false;
		}
	}

	/**
	 * 执行一条SQL语句,execute sql(insert,update,delete,...)
	 * 
	 * @param strsql
	 *            SQL语句
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean executesql(String strsql) {
		try {
			this.stmS = this.sqlCon
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			this.stmS.executeUpdate(strsql);
			this.status = true;
			return true;
		} catch (Exception e) {
			this.status = false;
			return false;
		}
	}

	/**
	 * 执行一条SQL查询语句
	 * 
	 * @param strsql
	 *            SQL查询语句
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean query(String strsql) {
		try {
			this.rowcount = 0;
			this.stmS = this.sqlCon.createStatement();
			this.rstSql = this.stmS.executeQuery(strsql);
			while (this.nextrecord()) {
				this.rowcount++;
			}
			this.rstSql = this.stmS.executeQuery(strsql);
			this.status = true;
			return true;
		} catch (Exception e) {
			this.status = false;
			return false;
		}
	}

	/**
	 * 返回查询到的记录数
	 * 
	 * @return 结果： 记录数，没有记录则为0
	 */
	public long getrowcount() {
		return this.rowcount;
	}

	/**
	 * 得到某个字段的值
	 * 
	 * @param strfilename
	 *            字段名称
	 * @return string values
	 */
	public String getString(String strfilename) {
		try {
			return this.rstSql.getString(strfilename);
		} catch (Exception ex) {
			return "字段不存在!";
		}
	}

	/**
	 * 得到某个字段的值
	 * 
	 * @param strfilename
	 *            字段名称
	 * @return int values
	 */
	public int getInt(String strfilename) {
		try {
			return Integer.parseInt(this.rstSql.getString(strfilename));
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * 记录指针向下移一条
	 * 
	 * @return 结果：存在（true） 不存在（false）
	 */
	public boolean nextrecord() {
		try {
			return this.rstSql.next();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 从数据库取出数据后进行汉字字符编码
	 * 
	 * @param stringvalues
	 *            要编码的串
	 * @return 成功回汉字编码，失败返回原字符
	 */
	public String readChinese(String stringvalues) {
		try {
			String temp = new String(stringvalues.getBytes("GB2312"),
					"ISO8859_1");
			return temp;
		} catch (Exception e) {
			return stringvalues;
		}
	}

	/**
	 * 得到数据库操作的状态
	 * 
	 * @return 可连接状态（true），非连接状态（false）
	 */
	public boolean getstatus() {
		return this.status;
	}

	/**
	 * 关闭所有数据库操作对象
	 * 
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean close() {
		try {
			if (this.sqlCon != null)
				this.sqlCon.close();
			if (this.rstSql != null)
				this.rstSql.close();
			if (this.stmS != null)
				this.stmS.close();
			this.status = true;
			return false;
		} catch (Exception e) {
			this.status = false;
			return true;
		}
	}

	/**
	 * 返回结果集
	 * 
	 * @return 执行query()后，得到的结果集。
	 */
	public ResultSet getResultLists() {
		return this.rstSql;
	}

	public static void main(String[] agrs) throws SQLException {
		GppCommonDBAccess commonsql = new GppCommonDBAccess();
		commonsql.setDriveName("sun.jdbc.odbc.JdbcOdbcDriver");
		commonsql
				.setConnectName("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=dzcdvote.mdb");
		if (commonsql.connect("admin", "myxxxxxxx")) {
			System.out.print("connect seccessed!");
			if (commonsql.query("select * from vote")) {
				System.out.println(commonsql.getrowcount());
				while (commonsql.nextrecord()) {
					System.out.println(commonsql.getString("IP"));
					System.out.println(commonsql.getInt("ID"));
				}
			}
			commonsql.close();
		} else {
			System.err.println("connect failed!");
		}
	}

	public Connection getSqlCon() {
		return sqlCon;
	}

}
