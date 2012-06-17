package com.gopawpaw.kynb.module.print;

import java.util.Map;

import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataOperator extends XXNCYLBXDBAccess {
	
	public static final String THORPNAME = "thorpName";
	public static final String NAME = "name";
	public static final String ICCODE = "icCode";
	public static final String PRINTFLAG = "printFlag";
	
	@SuppressWarnings("rawtypes")
	public Object[][] findByParams(Map params) {
		String sql = "select * from villager a where 1 = 1";
		//select a.Name, a.ICCode, a.Name, a.BirthDate, a.Sex ,a.SerialNum, a.Address, a.PersType, b.t_name, a.PrintFlag from PrintData a left join Thorp b on a.ThorpID = b.t_id  
		sql = "select a.Name, " +
				" a.ICCode, " +
				" a.Name as OName, " +
				" a.BirthDate, " +
				" a.Sex, " +
				" a.SerialNum, " +
				" a.Address, " +
				" a.PersType, " +
				" b.t_name, " +
				" a.PrintFlag " +
				" from PrintData a " +
				" left join Thorp b on a.ThorpID = b.t_id " +
				" where 1 = 1 ";
		
		if(params != null && params.size() > 0) {
			if(params.get(DataOperator.NAME) != null) {
				sql = sql + " and a.Name like " + StringUtil.getDLikeStr(params.get(DataOperator.NAME));
			}
			
			if(params.get(DataOperator.ICCODE) != null) {
				sql = sql + " and a.ICCode like " + StringUtil.getDLikeStr(params.get(DataOperator.ICCODE));
			}
		}
		
		//排序村ID，户主身份证号，身份证号
		//sql = sql + "order by a.t_id, a.v_householder_ic, a.v_ic";
		
		return findBySql(sql);
	}
	
	private Object[][] findBySql(String sql) {
		Object[][] data = null;
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				data = new Object[(int) commonsql.getrowcount()][];
				int i = 0;
				while (commonsql.nextrecord()) {
					//{ "姓名", "身份证号", "曾用名", "出生年月日", "性别",
					//	"社会保障号", "地址", "户口性质", "核发时间", "核发单位"};
					Object[] row = new Object[LicenseTable.columnNames.length];
					row[0] = commonsql.getString("Name");
					row[1] = commonsql.getString("ICCode");
					row[2] = commonsql.getString("OName");
					row[3] = commonsql.getString("BirthDate");
					row[4] = commonsql.getString("Sex");
					row[5] = commonsql.getString("SerialNum");
					row[6] = commonsql.getString("Address");
					row[7] = commonsql.getString("PersType");
					row[8] = commonsql.getString("t_name");
					row[9] = commonsql.getString("PrintFlag");
					data[i] = row;
					i++;
				}	
				
				commonsql.close();
			}
		}
		return data;
	}
	
	public String[] findThorpArray() {
		String[] thorpArray = {};
		String sql = "select * from Thorp";
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				thorpArray = new String[(int) commonsql.getrowcount() + 1];
				thorpArray[0] = "";
				int i = 1;
				while (commonsql.nextrecord()) {
					thorpArray[i] = commonsql.getString("t_name");
					i++;
				}
				commonsql.close();
			}
		}
		return thorpArray;
	}
}
