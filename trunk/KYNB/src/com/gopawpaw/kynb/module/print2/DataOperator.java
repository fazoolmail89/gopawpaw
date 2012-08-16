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
	 * ��ѯ��ӡ�����б�
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
	 * �����ݿ��Ӧ��¼�Ĵ�ӡ��Ǹ�Ϊ1���Ѵ�ӡ
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
