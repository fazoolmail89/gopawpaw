/**
 * 
 */
package com.gopawpaw.erp;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import com.gopawpaw.dev.common.GppCommonDBAccess;

/**
 * @version 2009-10-7
 * @author �����
 */
public class GppSQL {
	private GppCommonDBAccess commonsql = null;
	private static String driveName = null;
	private static String connectName = null;
	private static String user = null;
	private static String password = null;

	/**
	 * 
	 */
	public GppSQL() {
		initialize();
	}

	/**
	 * ��ʼ������
	 */
	private void initialize() {
		if (driveName == null || connectName == null) {
			initDrive();
		}

		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName(driveName);
		commonsql.setConnectName(connectName);
		if (commonsql.connect(user, password)) {
//			 System.out.println("connect seccessed!");
		} else {
			System.err.println("connect failed!");

			JOptionPane.showMessageDialog(null, "���ݿ�����ʧ�ܣ��������ݿ�����", "����",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * ��ʼ�����ݿ�����������Ϣ
	 */
	private void initDrive() {

		connectName = GlobalParameter.getDatabaseInfo().getConnectName();
		driveName = GlobalParameter.getDatabaseInfo().getDriveName();
		user = GlobalParameter.getDatabaseInfo().getUser();
		password = GlobalParameter.getDatabaseInfo().getPassword();

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
