package com.gopawpaw.frame.dev.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gopawpaw.frame.javax.swing.GppJFrame;

/**
 * @version 2009-10-03
 * @author �����
 *         <p>
 *         ���ݿ����ͨ���� ������[Access;SQL
 *         Server;Oracle;DB2;Informix;Sybase;PostgreSQL;Mysql]�����ݿ�Ĳ���
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
	 * ��ʼ��
	 */
	private void initialize() {
		if(GppCommonDBAccess.gjf == null){
			GppCommonDBAccess.gjf = new GppJFrame();
		}
		
		
	}
	/**
	 * ����������������:
	 * 
	 * @param drivename
	 *            ��������
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
	 * ��������Դ����:
	 * 
	 * @param conname
	 *            ���ݿ������ַ���
	 *            <p>
	 *            [Access] jdbc:odbc:gppdb �� jdbc:odbc:Driver={MicroSoft Access
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
	 * �������ݿ�
	 * 
	 * @param username
	 *            �ʺ�
	 * @param password
	 *            ����
	 * @return boolean status ����״̬
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
	 * ִ��һ��SQL���,execute sql(insert,update,delete,...)
	 * 
	 * @param strsql
	 *            SQL���
	 * @return ������ɹ���true�� ʧ�ܣ�false��
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
	 * ִ��һ��SQL��ѯ���
	 * 
	 * @param strsql
	 *            SQL��ѯ���
	 * @return ������ɹ���true�� ʧ�ܣ�false��
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
	 * ���ز�ѯ���ļ�¼��
	 * 
	 * @return ����� ��¼����û�м�¼��Ϊ0
	 */
	public long getrowcount() {
		return this.rowcount;
	}

	/**
	 * �õ�ĳ���ֶε�ֵ
	 * 
	 * @param strfilename
	 *            �ֶ�����
	 * @return string values
	 */
	public String getString(String strfilename) {
		try {
			return this.rstSql.getString(strfilename);
		} catch (Exception ex) {
			return "�ֶβ�����!";
		}
	}

	/**
	 * �õ�ĳ���ֶε�ֵ
	 * 
	 * @param strfilename
	 *            �ֶ�����
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
	 * ��¼ָ��������һ��
	 * 
	 * @return ��������ڣ�true�� �����ڣ�false��
	 */
	public boolean nextrecord() {
		try {
			return this.rstSql.next();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * �����ݿ�ȡ�����ݺ���к����ַ�����
	 * 
	 * @param stringvalues
	 *            Ҫ����Ĵ�
	 * @return �ɹ��غ��ֱ��룬ʧ�ܷ���ԭ�ַ�
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
	 * �õ����ݿ������״̬
	 * 
	 * @return ������״̬��true����������״̬��false��
	 */
	public boolean getstatus() {
		return this.status;
	}

	/**
	 * �ر��������ݿ��������
	 * 
	 * @return ������ɹ���true�� ʧ�ܣ�false��
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
	 * ���ؽ����
	 * 
	 * @return ִ��query()�󣬵õ��Ľ������
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
