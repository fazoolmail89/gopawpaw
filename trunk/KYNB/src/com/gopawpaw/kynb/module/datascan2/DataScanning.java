package com.gopawpaw.kynb.module.datascan2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import javax.swing.JProgressBar;

public class DataScanning {
	/**
	 * ִ������ɨ��
	 * @param scanMap 
	 * @param data
	 * @return
	 */
	public Object[][] scanning(Map<String, Integer> scanMap, Object[][] data, ScanningListener sl) {
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
		HsqlMemDbUtil hmduThread = new HsqlMemDbUtil();
		//��ʼ���ڴ����ݿ⣨�������ݿ����ӣ�������ʱ��
		hmduThread.start();
		
		DataDump dataDump = new DataDump();
		//��Access���ݿ��е�����ת�����ڴ����ݿ���
		dataDump.excute();
		//---------------------------------------------------------------------------------
		
		String frontSql =  "select count(*) as countN from mvillager where 1 = 1 ";
		String sql = "";	
		
		//��ȡ���ݿ�����
		Connection conn = HsqlMemDbUtil.getHsqlConn();
		Statement sta = null;
		ResultSet rs = null;
		
		sl.onScanningPre(resultData.length);
		
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
				sl.onScanningProgress(i);
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

interface ScanningListener {
	void onScanningPre(int size);
	void onScanningProgress(int n);
}
