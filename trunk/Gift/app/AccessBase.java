package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccessBase {

	Connection conn;

	Statement stmt;

	ResultSet rs;

	private String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	
	private String constr = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=";

	private String fileurl;

	private String user;

	private String pwd;

	AccessBase() {
		initialize();
	}

	AccessBase(String filepath) {
		
		this.fileurl = filepath;
		initialize();
	}
	
	AccessBase(String filepath, String user, String pwd) {
		
		this.fileurl = filepath;
		this.user = user;
		this.pwd = pwd;
		initialize();
	}

	private void initialize() {
		try {
			Class.forName(driver);

		} catch (Exception e) {
			
			System.out.println(e);

		}
	}

	/**
	 * @return fileurl
	 */
	protected String getFileurl() {
		return fileurl;
	}

	/**
	 * @param fileurl 要设置的 fileurl
	 */
	protected void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	/**
	 * @return pwd
	 */
	protected String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd 要设置的 pwd
	 */
	protected void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return user
	 */
	protected String getUser() {
		return user;
	}

	/**
	 * @param user 要设置的 user
	 */
	protected void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * @param 创建不可滚动的连接
	 */
	public void connect() {
		try {
			conn = DriverManager.getConnection(constr+fileurl, user, pwd);
			stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * @param 创建可以滚动的连接
	 */
	public void connect2() {
		try {
			conn = DriverManager.getConnection(constr+fileurl, user, pwd);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * @param 关闭连接
	 */
	public void close() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * @param 查询语句
	 */
	public ResultSet executeQuery(String sql) {
		try {
			if (stmt == null) {
				connect();
			}
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			System.out.println(e);
		}
		return rs;
	}
}
