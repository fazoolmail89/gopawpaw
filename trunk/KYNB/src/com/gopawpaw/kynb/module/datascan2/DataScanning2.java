package com.gopawpaw.kynb.module.datascan2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.IProgressListener;

public class DataScanning2 {
	/**
	 * 执行数据扫描
	 * @param scanMap 
	 * @param data
	 * @return
	 */
	public Object[][] scanning(Map<String, Integer> scanMap, Object[][] data, IProgressListener listener) {
		if (data == null)
			return null;
		if (data.length < 2)
			return data;	
		
		Object[][] resultData = new Object[data.length][data[0].length + 1];
		
		// 为返回结果赋值;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				resultData[i][j] = data[i][j];
			}
		}
		// 给返回结果数组表头的最后一个单元格赋值;
		resultData[0][data[0].length] = "扫描结果";
		
		//---------------------------------------------------------------------------------
		HsqlMemDbUtil2 hmduThread = new HsqlMemDbUtil2();
		//初始化内存数据库（创建数据库连接，创建临时表）
		hmduThread.start();
		
		DataDump2 dataDump = new DataDump2();
		//将Access数据库中的数据转存入内存数据库中
		dataDump.excute();
		//---------------------------------------------------------------------------------
		
		String frontSql =  "select count(*) as countN from motherdata where 1 = 1 ";
		String sql = "";	
		
		//获取数据库连接
		Connection conn = HsqlMemDbUtil2.getHsqlConn();
		Statement sta = null;
		ResultSet rs = null;
		
		listener.onBefore(resultData.length);
		
		try {
			sta = conn.createStatement();
			for (int i = 1; i < resultData.length; i++) { 
				
				sql = frontSql;
				if(scanMap.get(OtherData.ACOL) != null) {
					sql = sql + " and " + OtherData.ACOL + " = '"
							+ resultData[i][scanMap.get(OtherData.ACOL)] + "' ";				
				}
				if(scanMap.get(OtherData.BCOL) != null) {
					sql = sql + " and " + OtherData.BCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.BCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.CCOL) != null) {
					sql = sql + " and " + OtherData.CCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.CCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.DCOL) != null) {
					sql = sql + " and " + OtherData.DCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.DCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.ECOL) != null) {
					sql = sql + " and " + OtherData.ECOL + " = '"
							+ resultData[i][scanMap.get(OtherData.ECOL)] + "' ";				
				}
				if(scanMap.get(OtherData.FCOL) != null) {
					sql = sql + " and " + OtherData.FCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.FCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.GCOL) != null) {
					sql = sql + " and " + OtherData.GCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.GCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.HCOL) != null) {
					sql = sql + " and " + OtherData.HCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.HCOL)] + "' ";				
				}
				if(scanMap.get(OtherData.ICOL) != null) {
					sql = sql + " and " + OtherData.ICOL + " = '"
							+ resultData[i][scanMap.get(OtherData.ICOL)] + "' ";				
				}
				if(scanMap.get(OtherData.JCOL) != null) {
					sql = sql + " and " + OtherData.JCOL + " = '"
							+ resultData[i][scanMap.get(OtherData.JCOL)] + "' ";				
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
				
				//监听器
				listener.onExecute(i);
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
