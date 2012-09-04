package com.gopawpaw.kynb.module.print2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class PrintDataDAO extends XXNCYLBXDBAccess {
	//��ѯ�ؼ��ֶ���
	public static final String THORP_ID = "t_id";
	public static final String THORPNAME = "thorpName";
	public static final String NAME = "name";
	public static final String ICCODE = "icCode";
	public static final String PRINTFLAG = "printFlag";

	/**
	 * ��ѯ��ӡ�����б�
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

		// �����ID���������֤�ţ����֤��
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
					row[1] = commonsql.getString("Area");//��������
					row[2] = commonsql.getString("t_name");//��Ӧ����
					row[3] = commonsql.getString("ThorpName");//�����������
					row[4] = commonsql.getString("SerialNum");//���˱��
					row[5] = commonsql.getString("Name");//����
					row[6] = commonsql.getString("ICCode");//���֤��
					row[7] = commonsql.getString("Phone");//��ϵ�绰
					row[8] = commonsql.getString("FamilyCode");//��ͥ���
					row[9] = commonsql.getString("J_Account");//�ɷ������˺�
					row[10] = commonsql.getString("J_AccountName");//�ɷ����л���
					row[11] = commonsql.getString("Z_Account");//֧�������˺�
					row[12] = commonsql.getString("Z_AccountName");//֧�����л���
					row[13] = commonsql.getString("Age");//����
					row[14] = commonsql.getString("Sex");//�Ա�
					row[15] = commonsql.getString("AchieveDate");//����ʱ��
					row[16] = commonsql.getString("BirthDate");//��������
					row[17] = commonsql.getString("Relationship");//�뻧����ϵ
					row[18] = commonsql.getString("PayGrade");//����ɷѵ���
					row[19] = commonsql.getString("PersType");//������Ա���
					row[20] = commonsql.getString("Address");//��ͥסַ
					row[21] = commonsql.getString("Remark");//��ע
					row[22] = commonsql.getString("TotalAcct");//�ۼƸ����˻����
					row[23] = commonsql.getString("TotalPay");//�ۼƸ��˽ɷѽ��
					row[24] = commonsql.getString("TotalSubs");//�ۼƲ�������
					
					if ("1".equals(commonsql.getString("PrintFlag")))
						row[25] = "�Ѵ�ӡ";
					else
						row[25] = "δ��ӡ";
					
					row[26] = commonsql.getString("PrintDate");//��ӡ����
					row[27] = commonsql.getString("ThorpId");//��ID
					data[i] = row;
					i++;
				}

				commonsql.close();
			}
		}
		return data;
	}

	
	/**
	 * �����ݿ��Ӧ��¼�Ĵ�ӡ��Ǹ�Ϊ1���Ѵ�ӡ����ִ�����ݲ��������쳣�������������true
	 * @param printData ��Ҫ���µ�PrintData����
	 * @return true���ɹ���false��ʧ��
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
	 * ���������޸�����
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
	 * ɾ������
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
	 * �������
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
