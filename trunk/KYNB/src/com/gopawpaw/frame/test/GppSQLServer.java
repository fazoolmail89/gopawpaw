/**
 * 
 */
package com.gopawpaw.frame.test;

/**
 * @version 2010-5-6
 * @author �����
 *
 */

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
import com.gopawpaw.frame.GlobalParameter;

/**
 * @version 2009-10-7
 * @author �����
 */
public class GppSQLServer {
	private GppCommonDBAccess commonsql = null;
	private static String driveName = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
	private static String connectName = "jdbc:microsoft:sqlserver://localhost:1433;databaseName=keer_qaddb2";
	private static String user = "sa";
	private static String password = "xxxxxxx";

	/**
	 * 
	 */
	public GppSQLServer() {
		initialize();
	}

	/**
	 * ��ʼ������
	 */
	private void initialize() {
//		if (driveName == null || connectName == null) {
//			initDrive();
//		}

		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName(driveName);
		commonsql
				.setConnectName(connectName);
		if (commonsql.connect(user, password)) {
			// System.out.println("connect seccessed!");
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
		String filename = GlobalParameter.getHibernateCfgAbsolutePath();

		SAXBuilder builder = new SAXBuilder();

		Document doc = null;
		try {
			doc = builder.build(new File(filename));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element persons = doc.getRootElement();
		List<?> list = persons.getChildren("session-factory");
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("connection.url")){
					connectName = perso.getText().trim();
				}else if(perso.getAttributeValue("name").equals("connection.driver_class")){
					driveName = perso.getText().trim();
				}else if(perso.getAttributeValue("name").equals("connection.username")){
					user = perso.getText().trim();
				}else if(perso.getAttributeValue("name").equals("connection.password")){
					password = perso.getText().trim();
				}
			}
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
