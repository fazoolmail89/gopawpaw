package com.gopawpaw.kynb.module.print2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataOperator extends XXNCYLBXDBAccess {

	public static final String THORPNAME = "thorpName";
	public static final String NAME = "name";
	public static final String ICCODE = "icCode";
	public static final String PRINTFLAG = "printFlag";

	/**
	 * 查询打印数据列表
	 * @param params
	 * @return
	 */
	public Object[][] findByParams(Map params) {
		 String sql = "select * from PrintData a left join printThorp b on a.ThorpID = b.t_id where 1 = 1 ";

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
//========================================
					Object[] row = new Object[BaseDataTable.columnNames.length];
					row[0] = commonsql.getString("Id");//
					row[1] = commonsql.getString("Area");//所属地区
					row[2] = commonsql.getString("t_name");//对应村名
					row[3] = commonsql.getString("ThorpName");//所属机构编号
					row[4] = commonsql.getString("SerialNum");//个人编号
					row[5] = commonsql.getString("Name");//姓名
					row[6] = commonsql.getString("ICCode");//身份证号
					row[7] = commonsql.getString("Phone");//联系电话
					row[8] = commonsql.getString("FamilyCode");//家庭编号
					row[9] = commonsql.getString("J_Account");//缴费银行账号
					row[10] = commonsql.getString("J_AccountName");//缴费银行户名
					row[11] = commonsql.getString("Z_Account");//支付银行账号
					row[12] = commonsql.getString("Z_AccountName");//支付银行户名
					row[13] = commonsql.getString("Age");//年龄
					row[14] = commonsql.getString("Sex");//性别
					row[15] = commonsql.getString("AchieveDate");//到龄时间
					row[16] = commonsql.getString("BirthDate");//出生日期
					row[17] = commonsql.getString("Relationship");//与户主关系
					row[18] = commonsql.getString("PayGrade");//本年缴费档次
					row[19] = commonsql.getString("PersType");//本年人员类别
					row[20] = commonsql.getString("Address");//家庭住址
					row[21] = commonsql.getString("Remark");//备注
					row[22] = commonsql.getString("TotalAcct");//累计个人账户金额
					row[23] = commonsql.getString("TotalPay");//累计个人缴费金额
					row[24] = commonsql.getString("TotalSubs");//累计财政补助
					
					if ("1".equals(commonsql.getString("PrintFlag")))
						row[25] = "已打印";
					else
						row[25] = "未打印";
					
					row[26] = commonsql.getString("PrintDate");//打印日期
					row[27] = commonsql.getString("ThorpId");//村ID
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
		String sql = "select * from printThorp";
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
	
/*	public boolean updatePrintFlag(LicenseDto licenseDto) {
		boolean result = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(licenseDto != null) {
			String sql = "update PrintData a set a.PrintFlag = 1, " 
					+ " a.PrintDate = " + StringUtil.getQuotStr(sdf.format(new Date())) 
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
	}*/
}
