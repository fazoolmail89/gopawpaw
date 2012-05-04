package com.gopawpaw.kynb.module.datascan2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * 将Access数据库中Villager表的数据，转存入内存数据库MVillager表中
 * @author lxq
 *
 */
public class DataDump  extends XXNCYLBXDBAccess{
	
	/**
	 * 执行数据转存操作
	 * @return
	 */
	public boolean excute() {
		return updataMData(getAccessData());
	}
	
	/**
	 * 将数据存入内存数据库中
	 * @param list
	 * @return
	 */
	private static boolean updataMData(List<String[]> list) {
		boolean result = false;
		Connection conn = HsqlMemDbUtil.getHsqlConn();
		Statement sta = null;
		String sql = "";
		int i = 0;
		try {
			sta = conn.createStatement();
			sta.executeUpdate("delete from mvillager");
			for (String[] temp : list) {
				sql = "insert into mvillager values( " + temp[0] + ", '" + temp[1] + "', '" + temp[2] + "', '" + temp[3] + "')";
				System.out.println(i++);
				sta.executeUpdate(sql);
			}
			sta.close();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println("====================================================");
		return result;
	}

	/**
	 * 从Access数据库中取出数据
	 * @return
	 */
	private List<String[]> getAccessData() {
		List<String[]> list = new ArrayList<String[]>();
		String sql = "select vid,v_ic,v_name,v_bank_account from villager";
		
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				// 如果有这条数据
				while (commonsql.nextrecord()) {
					String[] temp = new String[4];
					temp[0] = commonsql.getString("vid");
					temp[1] = commonsql.getString("v_ic");
					temp[2] = commonsql.getString("v_name");
					temp[3] = commonsql.getString("v_bank_account");
					list.add(temp);					
				}
			}	
		}
		//System.out.println("====================================================");
		//System.out.println(list.size());
		return list;
	}
	
	public void selectTest() {
		Connection conn = HsqlMemDbUtil.getHsqlConn();
		Statement sta = null;
		String sql = "select * from mvillager";
		ResultSet rs = null;
		
		try {
			sta = conn.createStatement();
			for(int i =5000; i < 60000; i ++) {
				//System.out.print("i = " + i + "\t");
				sql = "select * from mvillager where id = " + i;
				//System.out.println(sql);
				sta.executeQuery(sql);
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString("id") + "\t");
					System.out.print(rs.getString("v_ic") + "\t");
					System.out.print(rs.getString("v_name") + "\t");
					System.out.print(rs.getString("v_bank_account") + "\t");
					System.out.println();
				}
			}
			rs.close();
			sta.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
/*	public static void main(String[] args) {
		HsqlMemDbUtil hmduThread = new HsqlMemDbUtil();
		hmduThread.start();
		DataDump dataDump = new DataDump();
		List<String[]> list = dataDump.getAccessData();
		System.out.println(dataDump.updataMData(list));
		dataDump.selectTest();
		hmduThread.stop();
	}*/
}
