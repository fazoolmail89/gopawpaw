package com.gopawpaw.kynb.module.datascan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import com.mysql.jdbc.PreparedStatement;

public class DataScanning {

	/**
	 * 执行数据扫描
	 * @param scanMap 
	 * @param data
	 * @return
	 */
	public Object[][] scanning(Map<String, Integer> scanMap, Object[][] data) {
		if (data == null)
			return null;
		if (data.length < 2)
			return data;	
		
		Object[][] resultData = new Object[data.length][data[0].length + 1];
		
		// 为返回结果赋值;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				resultData[i][j] = data[i][j];
			}
		}
		// 给返回结果数组表头的最后一个单元格赋值;
		resultData[0][data[0].length] = "扫描结果";
		
		//---------------------------------------------------------------------------------
		HsqlMemDbUtil hmduThread = new HsqlMemDbUtil();
		//初始化内存数据库（创建数据库连接，创建临时表）
		hmduThread.start();
		
		DataDump dataDump = new DataDump();
		//将Access数据库中的数据转存入内存数据库中
		dataDump.excute();
		//---------------------------------------------------------------------------------
		
		String frontSql =  "select count(*) as countN from mvillager where 1 = 1 ";
		String sql = "";	
		
		//获取数据库连接
		Connection conn = hmduThread.getHsqlConn();
		Statement sta = null;
		ResultSet rs = null;
		
		try {
			sta = conn.createStatement();
			for (int i = 1; i < resultData.length; i++) { 
				sql = frontSql;
				if(scanMap.get(ScanItem.V_IC) != null) {
					sql = sql + " and " + ScanItem.V_IC + " = '"
							+ resultData[i][scanMap.get(ScanItem.V_IC)] + "' ";				
				}
				if(scanMap.get(ScanItem.V_NAME) != null) {
					sql = sql + " and " + ScanItem.V_NAME + " = '"
							+ resultData[i][scanMap.get(ScanItem.V_NAME)] + "' ";				
				}
				if(scanMap.get(ScanItem.V_BANK_ACCOUNT) != null) {
					sql = sql + " and " + ScanItem.V_BANK_ACCOUNT + " = '"
							+ resultData[i][scanMap.get(ScanItem.V_BANK_ACCOUNT)] + "' ";					
				}

				String isSame = "不相同";
				if(!sql.equals(frontSql)) {
					rs = sta.executeQuery(sql);
						while (rs.next()) {
							if(rs.getInt("countN") > 0)
								isSame = "相同";
					}		
					//关闭查询结果集
					rs.close();	
				}
				// 给返回结果数组的最后一列的单元格赋值
				resultData[i][data[0].length] = isSame;
				//初始化sql
				sql = "";
			}
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//关闭数据库连接
		hmduThread.destoryConn();
		hmduThread = null;
		
		return resultData;
	}
}
