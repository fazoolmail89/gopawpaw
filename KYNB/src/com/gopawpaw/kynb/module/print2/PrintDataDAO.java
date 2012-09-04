package com.gopawpaw.kynb.module.print2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class PrintDataDAO extends XXNCYLBXDBAccess {
	//查询关键字定义
	public static final String THORP_ID = "t_id";
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
		 String sql = "select * from PrintData a " +
		 		" left join printThorp b on a.ThorpID = b.t_id where 1 = 1 ";

		if (params != null && params.size() > 0) {
			if (params.get(PrintDataDAO.THORP_ID) != null
					&& !"".equals(params.get(PrintDataDAO.THORP_ID))) {
				sql = sql + " and b.t_id = " + params.get(PrintDataDAO.THORP_ID);
			}
			
			if (params.get(PrintDataDAO.THORPNAME) != null) {
				sql = sql + " and a.ThorpName like "
						+ StringUtil.getDLikeStr(params.get(PrintDataDAO.THORPNAME));
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
	 * 将数据库对应记录的打印标记改为1：已打印，除执行数据操作出现异常，其他情况返回true
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
			if(printData.getId() != null && !"".equals(printData.getId())) {
				sql = "update PrintData set " +
					" Area = " + StringUtil.getQuotStr(printData.getArea()) +
					" ,ThorpId = " + printData.getThorpId() +
					" ,ThorpName = " + StringUtil.getQuotStr(printData.getThorpName()) +
					" ,SerialNum = " + StringUtil.getQuotStr(printData.getSerialNum()) +
					" ,Name = " + StringUtil.getQuotStr(printData.getName()) +
					" ,ICCode = " + StringUtil.getQuotStr(printData.getIcCode()) +
					" ,Phone = " + StringUtil.getQuotStr(printData.getPhone()) +
					" ,FamilyCode = " + StringUtil.getQuotStr(printData.getFamilyCode()) +
					" ,J_Account = " + StringUtil.getQuotStr(printData.getJaccount()) +
					" ,J_AccountName = " + StringUtil.getQuotStr(printData.getJaccountName()) +
					" ,Z_Account = " + StringUtil.getQuotStr(printData.getZaccount()) +
					" ,Z_AccountName = " + StringUtil.getQuotStr(printData.getZaccountName()) +
					" ,Age = " + StringUtil.getQuotStr(printData.getAge()) +
					" ,Sex = " + StringUtil.getQuotStr(printData.getSex()) +
					" ,AchieveDate = " + StringUtil.getQuotStr(printData.getAchieveDate()) +
					" ,BirthDate = " + StringUtil.getQuotStr(printData.getBirthDate()) +
					" ,Relationship = " + StringUtil.getQuotStr(printData.getRelationship()) +
					" ,PayGrade = " + StringUtil.getQuotStr(printData.getPayGrade()) +
					" ,PersType = " + StringUtil.getQuotStr(printData.getPersType()) +
					" ,Address = " + StringUtil.getQuotStr(printData.getAddress()) +
					" ,Remark = " + StringUtil.getQuotStr(printData.getRemark()) +
					" ,TotalAcct = " + StringUtil.getQuotStr(printData.getTotalAcct()) +
					" ,TotalPay = " + StringUtil.getQuotStr(printData.getTotalPay()) +
					" ,TotalSubs = " + StringUtil.getQuotStr(printData.getTotalSubs()) +
					" ,PrintFlag = 0 "+
					" ,PrintDate = " + StringUtil.getQuotStr(printData.getPrintDate()) +
					" where Id = " + printData.getId();
			} else {
				sql = " insert into PrintData(Area, ThorpId, ThorpName, SerialNum, Name, " +
						" ICCode, Phone, FamilyCode, J_Account, J_AccountName, " +
						" Z_Account, Z_AccountName, Age, Sex, AchieveDate, " +
						" BirthDate, Relationship, PayGrade, PersType, Address, " +
						" Remark, TotalAcct, TotalPay, TotalSubs, PrintFlag, PrintDate) " +
						" values( " + StringUtil.getQuotStr(printData.getArea()) +
						" , " + printData.getThorpId() +
						" , " + StringUtil.getQuotStr(printData.getThorpName()) +
						" , " + StringUtil.getQuotStr(printData.getSerialNum()) +
						" , " + StringUtil.getQuotStr(printData.getName()) +
						" , " + StringUtil.getQuotStr(printData.getIcCode()) +
						" , " + StringUtil.getQuotStr(printData.getPhone()) +
						" , " + StringUtil.getQuotStr(printData.getFamilyCode()) +
						" , " + StringUtil.getQuotStr(printData.getJaccount()) +
						" , " + StringUtil.getQuotStr(printData.getJaccountName()) +
						" , " + StringUtil.getQuotStr(printData.getZaccount()) +
						" , " + StringUtil.getQuotStr(printData.getZaccountName()) +
						" , " + StringUtil.getQuotStr(printData.getAge()) +
						" , " + StringUtil.getQuotStr(printData.getSex()) +
						" , " + StringUtil.getQuotStr(printData.getAchieveDate()) +
						" , " + StringUtil.getQuotStr(printData.getBirthDate()) +
						" , " + StringUtil.getQuotStr(printData.getRelationship()) +
						" , " + StringUtil.getQuotStr(printData.getPayGrade()) +
						" , " + StringUtil.getQuotStr(printData.getPersType()) +
						" , " + StringUtil.getQuotStr(printData.getAddress()) +
						" , " + StringUtil.getQuotStr(printData.getRemark()) +
						" , " + StringUtil.getQuotStr(printData.getTotalAcct()) +
						" , " + StringUtil.getQuotStr(printData.getTotalPay()) +
						" , " + StringUtil.getQuotStr(printData.getTotalSubs()) +
						" , " + 0 +
						" , '' " 
						+ " ) ";
			
			}
		}
		System.out.println(printData.getId());
		System.out.println(sql);
		return sql;
	}
	
	/**
	 * 删除数据
	 * @param printData
	 * @return
	 */
	public boolean delete(String id) {
		boolean result = false;
		String sql = "delete from PrintData where Id = " + id;
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
	
	/**
	 * 清空数据
	 * @return
	 */
	public boolean cleare() {
		boolean result = false;
		String sql = "delete from PrintData";
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
}
