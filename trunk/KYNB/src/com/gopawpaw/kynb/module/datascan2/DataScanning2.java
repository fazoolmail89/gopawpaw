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
	 * ִ������ɨ��
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
		
		// Ϊ���ؽ����ֵ;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				resultData[i][j] = data[i][j];
			}
		}
		// �����ؽ�������ͷ�����һ����Ԫ��ֵ;
		resultData[0][data[0].length] = "ɨ����";
		
		//---------------------------------------------------------------------------------
		HsqlMemDbUtil2 hmduThread = new HsqlMemDbUtil2();
		//��ʼ���ڴ����ݿ⣨�������ݿ����ӣ�������ʱ��
		hmduThread.start();
		
		DataDump2 dataDump = new DataDump2();
		//��Access���ݿ��е�����ת�����ڴ����ݿ���
		dataDump.excute();
		//---------------------------------------------------------------------------------
		
		String frontSql =  "select count(*) as countN from motherdata where 1 = 1 ";
		String sql = "";	
		
		//��ȡ���ݿ�����
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

				String isSame = "����ͬ";
				if(!sql.equals(frontSql)) {
					rs = sta.executeQuery(sql);
						while (rs.next()) {
							if(rs.getInt("countN") > 0)
								isSame = "��ͬ";
					}		
					//�رղ�ѯ�����
					rs.close();	
				} 
				
				// �����ؽ����������һ�еĵ�Ԫ��ֵ
				resultData[i][data[0].length] = isSame;
				//��ʼ��sql
				sql = "";
				
				//������
				listener.onExecute(i);
			}
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//�ر����ݿ�����
		hmduThread.destoryConn();
		hmduThread = null;
		
		return resultData;
	}
}
