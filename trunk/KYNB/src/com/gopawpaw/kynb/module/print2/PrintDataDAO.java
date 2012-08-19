package com.gopawpaw.kynb.module.print2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class PrintDataDAO extends XXNCYLBXDBAccess {

	public static final String THORPNAME = "thorpName";
	public static final String NAME = "name";
	public static final String ICCODE = "icCode";
	public static final String PRINTFLAG = "printFlag";

	/**
	 * 查询打印数据列表
	 * @param params
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Object[][] findByParams(Map params) {
		 String sql = "select * from PrintData a left join printThorp b on a.ThorpID = b.t_id where 1 = 1 ";

		if (params != null && params.size() > 0) {
			if (params.get(PrintDataDAO.THORPNAME) != null
					&& !"".equals(params.get(PrintDataDAO.THORPNAME))) {
				sql = sql
						+ " and b.t_name = "
						+ StringUtil.getQuotStr(params
								.get(PrintDataDAO.THORPNAME));
			}

			if (params.get(PrintDataDAO.NAME) != null) {
				sql = sql + " and a.Name like "
						+ StringUtil.getDLikeStr(params.get(PrintDataDAO.NAME));
			}

			if (params.get(PrintDataDAO.ICCODE) != null) {
				sql = sql
						+ " and a.ICCode like "
						+ StringUtil.getDLikeStr(params
								.get(PrintDataDAO.ICCODE));
			}

			if (params.get(PrintDataDAO.PRINTFLAG) != null
					&& !"".equals(params.get(PrintDataDAO.PRINTFLAG))) {
				sql = sql + " and a.PrintFlag = "
						+ params.get(PrintDataDAO.PRINTFLAG);
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

	/**
	 * 查询所有村名称
	 * @return 村名称字符串数组
	 */
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
	 * 将数据库对应记录的打印标记改为1：已打印，printData为空时返回true
	 * @param printData 需要更新的PrintData对象
	 * @return true：成功，false：失败
	 */
	public boolean updatePrintFlag(int id) {
		boolean result = true;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(id != 0) {
			String sql = "update PrintData a set a.PrintFlag = 1, " 
					+ " a.PrintDate = " + StringUtil.getQuotStr(sdf.format(new Date())) 
					+ " where a.Id = " + id;
			if (commonsql.connect(user, password)) {
				result = commonsql.executesql(sql);
			} else {
				result = false;
			}
			commonsql.close();
		}
		return result;
	}
	
	/**
	 * 新增或者修改数据
	 * @param printData
	 * @return
	 */
	public boolean saveOrUpdate(PrintData printData) {
		if(printData == null) return false;
		boolean result = false;
		String sql = "";
		if (commonsql.connect(user, password)) {
			sql = getSql(printData);
			if(sql != null && !"".equals(sql))
				result = commonsql.executesql(sql);
		}
		return result;
	}
	
	private String getSql(PrintData printData) {
		String sql = "";
		if(printData != null) {
			if(printData.getId() != null && !"".equals(printData.getId()))
				sql = "";
			else
				;
		}
		return sql;
	}
	
	/**
	 * 删除数据
	 * @param printData
	 * @return
	 */
	private boolean delete(int id) {
		boolean result = false;
		String sql = "delete from PrintData where Id = " + id;
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
}
