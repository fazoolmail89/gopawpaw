package com.gopawpaw.kynb.module.datascan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataScanning extends XXNCYLBXDBAccess {

	/**
	 * ɨ�����ݣ�����ɨ���ɨ�����ݿ����Ƿ������Ӧ��¼
	 * 
	 * @param siList
	 *            ��Ҫɨ���ֶ��б�
	 * @param data
	 *            ������ͷ��JTabel����
	 * @return ������ͷ��JTabel����
	 */
	public Object[][] scaning(List<ScanItem> siList, Object[][] data) {
		if (data == null)
			return null;
		if (data.length < 2)
			return data;
		
		//���ɨ�����Ӧ��Ԫ����б�
		Map<Integer, ScanItem> map = new HashMap<Integer, ScanItem>();
		
		Object[][] resultData = new Object[data.length][data[0].length + 1];

		for (int i = 0; i < data[0].length; i++) {
			// Ϊ���ؽ���ı�ͷ��ֵ;
			resultData[0][i] = data[0][i];
			for (int j = 0; j < siList.size(); j++) {
				String temp1 = data[0][i].toString();
				String temp2 = siList.get(j).getExlColumnName();
				System.out.println(temp1 + " : " + temp2);				
				if (temp1.equals(temp2)) {
					map.put(i, siList.get(j));
					//�ҵ�������ͬ�����ݺ��˳���ѭ��
					break;
				}
			}
		}
		// �����ؽ�������ͷ�����һ����Ԫ��ֵ;
		resultData[0][data[0].length] = "ɨ����";

		String frontSql =  "select count(*) as countN from villager where 1 = 1 ";
		String sql = "";
		if (commonsql.connect(user, password)) {
			// data���б�ͷ�����Դ�index��1��ʼѭ��
			// ���е��п�ʼ�������ĵ�Ԫ��
			for (int i = 1; i < data.length; i++) {
				sql = frontSql;
				for (int j = 0; j < data[0].length; j++) {
					// ��ԭ����ĵ�Ԫ��ֵ�������ؽ����Ӧ�ĵ�Ԫ��
					resultData[i][j] = data[i][j];

					ScanItem si = map.get(j);
					if (si != null) {
						sql = sql + " and " + si.getDbtColumnName() + " = '"
								+ data[i][j] + "' ";						
					}
				}
System.out.println(sql);
				String isSame = "����ͬ";
				if(!sql.equals(frontSql)) {
					if (commonsql.query(sql)) {
						// �������������
						while (commonsql.nextrecord()) {
							if(commonsql.getInt("countN") > 0)
								isSame = "��ͬ";
						}
					}					
				}
				// �����ؽ����������һ�еĵ�Ԫ��ֵ
				resultData[i][data[0].length] = isSame;
				//��ʼ��sql
				sql = "";
			}
			commonsql.close();
		} else {
		}
		return resultData;
	}
}
