package com.gopawpaw.kynb.module.print;

import java.util.Map;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataQuery extends XXNCYLBXDBAccess {
	public static final String NAME = "name";
	public static final String IC_CODE = "icCode";
	
	@SuppressWarnings("rawtypes")
	public Object[][] findByParams(Map params) {
		String sql = "select * from villager a where 1 = 1";
		if(params != null && params.size() > 0) {
			if(params.get(DataQuery.NAME) != null) {
				sql = sql + " and a.v_name like " + StringUtil.getDLikeStr(params.get(DataQuery.NAME));
			}
			
			if(params.get(DataQuery.NAME) != null) {
				sql = sql + " and a.v_ic like " + StringUtil.getDLikeStr(params.get(DataQuery.IC_CODE));
			}
		}
		
		//�����ID���������֤�ţ����֤��
		sql = sql + "order by a.t_id, a.v_householder_ic, a.v_ic";
		
		return findBySql(sql);
	}
	
	private Object[][] findBySql(String sql) {
		Object[][] data = null;
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				data = new Object[(int) commonsql.getrowcount()][];
				int i = 0;
				while (commonsql.nextrecord()) {
					//{ "����", "���֤��", "������", "����������", "�Ա�",
					//	"��ᱣ�Ϻ�", "��ַ", "��������", "�˷�ʱ��", "�˷���λ"};
					Object[] row = new Object[LicenseTable.columnNames.length];
					row[0] = commonsql.getString("v_name");
					row[1] = commonsql.getString("v_ic");
					row[2] = commonsql.getString("v_name");
					row[3] = commonsql.getString("v_birthday");
					row[4] = commonsql.getString("v_sex");
					row[5] = commonsql.getString("v_social_security_num");
					row[6] = commonsql.getString("v_address_live");
					row[7] = "����";//commonsql.getString("");
					data[i] = row;
					i++;
				}				
			}
		}
		return data;
	}
}
