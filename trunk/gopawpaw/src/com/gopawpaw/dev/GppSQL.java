/**
 * 
 */
package com.gopawpaw.dev;

import java.sql.ResultSet;

import com.gopawpaw.dev.common.GppCommonDBAccess;

/**
 * @version 2009-10-7
 * @author �����
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
	 * ִ�в����ؽ����SQL
	 * 
	 * @param strsql
	 * @return ������ɹ���true�� ʧ�ܣ�false��
	 */
	public boolean executesql(String strsql) {
		return commonsql.executesql(strsql);
	}

	/**
	 * ִ�в�ѯ���ؽ����SQL
	 * 
	 * @param strsql
	 * @return �����
	 */
	public ResultSet query(String strsql) {
		commonsql.query(strsql);
		return commonsql.getResultLists();
	}

	/**
	 * �ر����ݿ��������
	 * 
	 * @return ������ɹ���true�� ʧ�ܣ�false��
	 */
	public boolean close() {
		return commonsql.close();
	}

}
