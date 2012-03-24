/**
 * 
 */
package com.gopawpaw.frame.test;

/**
 * @version 2010-5-6
 * @author 李锦华
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
 * @author 李锦华
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
	 * 初始化连接
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

			JOptionPane.showMessageDialog(null, "数据库连接失败！请检查数据库连接", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 初始化数据库驱动连接信息
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
