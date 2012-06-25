package com.gopawpaw.kynb.module.print;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		// select a.Name, a.ICCode, a.Name, a.BirthDate, a.Sex ,a.SerialNum,
		// a.Address, a.PersType, b.t_name, a.PrintFlag from PrintData a left
		// join Thorp b on a.ThorpID = b.t_id
		sql = "select a.Id, a.Name, " + " a.ICCode, " + " a.Name as OName, "
				+ " a.BirthDate, " + " a.Sex, " + " a.SerialNum, "
				+ " a.Address, " + " b.t_name, " + " a.PrintFlag "
				+ " from PrintData a "
				+ " left join Thorp b on a.ThorpID = b.t_id " + " where 1 = 1 ";

		if (params != null && params.size() > 0) {
			if (params.get(DataOperator.THORPNAME) != null
					&& !"".equals(params.get(DataOperator.THORPNAME))) {
				sql = sql
						+ " and b.t_name = "
						+ StringUtil.getQuotStr(params
								.get(DataOperator.THORPNAME));
			}

			if (params.get(DataOperator.NAME) != null) {
				sql = sql + " and a.Name like "
						+ StringUtil.getDLikeStr(params.get(DataOperator.NAME));
			}

			if (params.get(DataOperator.ICCODE) != null) {
				sql = sql
						+ " and a.ICCode like "
						+ StringUtil.getDLikeStr(params
								.get(DataOperator.ICCODE));
			}

			if (params.get(DataOperator.PRINTFLAG) != null
					&& !"".equals(params.get(DataOperator.PRINTFLAG))) {
				sql = sql + " and a.PrintFlag = "
						+ params.get(DataOperator.PRINTFLAG);
			}
		}

		// 排序村ID，户主身份证号，身份证号
		sql = sql + " order by a.Id";
		return findBySql(sql);
	}

	private Object[][] findBySql(String sql) {
		Object[][] data = null;
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				data = new Object[(int) commonsql.getrowcount()][];
				int i = 0;
				while (commonsql.nextrecord()) {
/*					"序号","姓名", "身份证号",
					"曾用名", "出生年月日", "性别",
					"社会保障号", "地址", "所在村", "打印标记"};*/
					Object[] row = new Object[LicenseTable.columnNames.length];
					row[0] = commonsql.getString("Id");
					row[1] = commonsql.getString("Name");
					row[2] = commonsql.getString("ICCode");
					row[3] = commonsql.getString("OName");
					row[4] = commonsql.getString("BirthDate");
					row[5] = commonsql.getString("Sex");
					row[6] = commonsql.getString("SerialNum");
					row[7] = commonsql.getString("Address");
					row[8] = commonsql.getString("t_name");

					if ("1".equals(commonsql.getString("PrintFlag")))
						row[9] = "已打印";
					else
						row[9] = "未打印";

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
	
	/**
	 * 将数据库对应记录的打印标记改为1：已打印
	 * @param licenseDto
	 * @return
	 */
	public boolean updatePrintFlag(LicenseDto licenseDto) {
		boolean result = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(licenseDto != null) {
			String sql = "update PrintData a set a.PrintFlag = 1 " 
					+ " and a.PrintDate = " + StringUtil.getQuotStr(sdf.format(new Date())) 
					+ " where a.Id = " + licenseDto.getId()
					+ " and a.ICCode = " + StringUtil.getQuotStr(licenseDto.getIcCode());
			System.out.println("---------------");
			System.out.print(sql);
			if (commonsql.connect(user, password)) {
				result = commonsql.executesql(sql);
			}
			commonsql.close();
		}
		return result;
	}
}
