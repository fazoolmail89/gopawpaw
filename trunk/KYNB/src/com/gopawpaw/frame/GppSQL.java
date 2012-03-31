/**
 * 
 */
package com.gopawpaw.frame;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.gopawpaw.frame.utils.StringUtils;

/**
 * @version 2009-10-7
 * @author 李锦华
 */
public class GppSQL {
	protected GppCommonDBAccessEx commonsql = null;
	protected static String driveName = null;
	protected static String connectName = null;
	protected static String user = null;
	protected static String password = null;

	/**
	 * 
	 */
	public GppSQL() {
		initialize();
	}

	/**
	 * 初始化连接
	 */
	private void initialize() {
		if (driveName == null || connectName == null) {
			initDrive();
		}
		
		
		
		commonsql = new GppCommonDBAccessEx();
		commonsql.setDriveName(driveName);
		commonsql.setConnectName(connectName);
		if (commonsql.connect(user, password)) {
//			 System.out.println("connect seccessed!");
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

		connectName = GlobalParameter.getDatabaseInfo().getConnectName();
		driveName = GlobalParameter.getDatabaseInfo().getDriveName();
		user = GlobalParameter.getDatabaseInfo().getUser();
		password = GlobalParameter.getDatabaseInfo().getPassword();
		password = StringUtils.unObfuscation(password);
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
