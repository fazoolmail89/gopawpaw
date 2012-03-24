/**
 * 
 */
package com.gopawpaw.kynb.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.bean.Villager;

/**
 * @author 李锦华
 * @since: 2011-11-14
 */
public class ExcelDBAccess {
	private static String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
	private static String outputPath = "OutPut\\";
	private final static String user = "";

	private final static String password = "";

	private String excelPath = "";
	private GppCommonDBAccess commonsql;

	/**
	 * 
	 */
	public ExcelDBAccess(String excelPath) {
		this.excelPath = excelPath;

		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName(driverName);
		commonsql
				.setConnectName("jdbc:odbc:driver={Microsoft Excel Driver (*.xls)};DBQ="
						+ this.excelPath + ";ReadOnly=False;");

//		if (commonsql.connect("", "")) {
//			System.out.print("connect seccessed! " + commonsql.getrowcount());
//			if (commonsql.query("select * from [ncjm$]")) {
//				System.out.println(commonsql.getrowcount());
//				while (commonsql.nextrecord()) {
//					System.out.println(commonsql.getString(1));
//					System.out.println(commonsql.getString(2));
//				}
//			}
//			commonsql.close();
//		} else {
//			System.err.println("connect failed!");
//		}
	}

	public List<Villager> getVillagerAll() throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from [Sheet1$] ";

			if (!commonsql.query(sql)) {

				return null;
			}

			List<Villager> list = new ArrayList<Villager>();
			Villager villager = null;
			
			//去掉首行
//			commonsql.nextrecord();
			
			while (commonsql.nextrecord()) {
				villager = new Villager();

				villager.setV_name(commonsql.getString(1));
				villager.setV_sex(commonsql.getString(2));
				villager.setV_nation(commonsql.getString(3));
				villager.setV_birthday(commonsql.getString(4));
				villager.setV_ic(commonsql.getString(5));
				villager.setV_address_live(commonsql.getString(6));
				villager.setV_householder_name(commonsql.getString(7));
//System.out.println(villager);
				list.add(villager);
			}

			commonsql.close();
			return list;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}
	
	public GppCommonDBAccess getVillagerAllSQL() throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from [Sheet1$] ";

			if (!commonsql.query(sql)) {

				return null;
			}

			return commonsql;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}
	
	public GppCommonDBAccess getCommonSQL() throws DBException {
		if (commonsql.connect(user, password)) {


			return commonsql;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}
	
	public String cheakVillagerTitle() {
//		if (commonsql.connect(user, password)) {
//
//			String sql = "select * from [Sheet1$]";
//
//			if (!commonsql.query(sql)) {
//
//				return "找不到 Sheet1 表，请检查您的Excel文件！";
//			}
//
//			if(commonsql.getrowcount()<=0){
//				return "在Sheet1 表，没有找到任何数据！";
//			}
//			Villager villager = null;
//			
//			//去掉首行
////			commonsql.nextrecord();
//			
//			ResultSet rs = commonsql.getResultLists();
//			try {
//				rs.beforeFirst();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			try {
//			while (rs.next()) {
//				villager = new Villager();
//
//				
//					villager.setV_name(rs.getString(1));
//					villager.setV_sex(rs.getString(2));
//					villager.setV_nation(rs.getString(3));
//					villager.setV_birthday(rs.getString(4));
//					villager.setV_ic(rs.getString(5));
//					villager.setV_address_live(rs.getString(6));
//					villager.setV_householder_name(rs.getString(7));
//				
//				
////System.out.println(villager);
////				list.add(villager);
//				break;
//			}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//				
//
//			commonsql.close();
//			
//			return cheakVillager(villager);
//		} else {
//
//			System.err.println("connect failed!");
//
//			throw new DBException(DBException.DB_OPEN_FALSE);
//
//		}

		return "";
	}
	
	private String cheakVillager(Villager villager){
		System.out.println(villager);
		return null;
	}

	public List<String> getVillagerBlackNameAll() throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from [Sheet1$] ";

			if (!commonsql.query(sql)) {

				return null;
			}

			List<String> list = new ArrayList<String>();
			
			//去掉首行
			
			while (commonsql.nextrecord()) {
				
				list.add(commonsql.getString(1));
			}

			commonsql.close();
			return list;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}

	public static void main(String[] args) {
		ExcelDBAccess ea = new ExcelDBAccess("农村新增导盘格式1.xls");
		// System.out.println("=="+ea.insertVillager());
	}
}
