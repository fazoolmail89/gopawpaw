package com.gopawpaw.kynb.module.datascan2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * 将Access数据库中Villager表的数据，转存入内存数据库MVillager表中
 * 
 * @author lxq
 * 
 */
public class DataDump2 extends XXNCYLBXDBAccess {

	/**
	 * 执行数据转存操作
	 * 
	 * @return
	 */
	public boolean excute() {
		return updataMData(getAccessData());
	}

	/**
	 * 将数据存入内存数据库中
	 * 
	 * @param list
	 * @return
	 */
	private static boolean updataMData(List<OtherData> list) {
		boolean result = false;
		Connection conn = HsqlMemDbUtil2.getHsqlConn();
		Statement sta = null;
		String sql = "";
		try {
			sta = conn.createStatement();
			sta.executeUpdate("delete from motherdata");
			for (OtherData odata : list) {
				sql = "insert into motherdata values( " 
						+ odata.getId() + ", '"
						+ odata.getAcol() + "', '" 
						+ odata.getBcol() + "', '"
						+ odata.getCcol() + "', '" 
						+ odata.getDcol() + "', '"
						+ odata.getEcol() + "', '"
						+ odata.getFcol() + "', '"
						+ odata.getGcol() + "', '"
						+ odata.getHcol() + "', '"
						+ odata.getIcol() + "', '"
						+ odata.getJcol() + "')";
				sta.executeUpdate(sql);
			}
			sta.close();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 从Access数据库中取出数据
	 * 
	 * @return
	 */
	private List<OtherData> getAccessData() {
		List<OtherData> list = new ArrayList<OtherData>();
		String sql = "select * from otherdata";

		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				// 如果有这条数据
				OtherData odata = null;
				while (commonsql.nextrecord()) {
					odata = new OtherData();
					odata.setId(commonsql.getString(OtherData.ID));
					odata.setAcol(commonsql.getString(OtherData.ACOL));
					odata.setBcol(commonsql.getString(OtherData.BCOL));
					odata.setCcol(commonsql.getString(OtherData.CCOL));
					odata.setDcol(commonsql.getString(OtherData.DCOL));
					odata.setEcol(commonsql.getString(OtherData.ECOL));
					odata.setFcol(commonsql.getString(OtherData.FCOL));
					odata.setGcol(commonsql.getString(OtherData.GCOL));
					odata.setHcol(commonsql.getString(OtherData.HCOL));
					odata.setIcol(commonsql.getString(OtherData.ICOL));
					odata.setJcol(commonsql.getString(OtherData.JCOL));
					list.add(odata);
				}
			}
		}
		
		return list;
	}
}
