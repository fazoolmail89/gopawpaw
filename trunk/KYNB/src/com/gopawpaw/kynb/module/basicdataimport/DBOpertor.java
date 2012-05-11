/**
 * 
 */
package com.gopawpaw.kynb.module.basicdataimport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * ���ݿ������
 * 
 * @version 2012-5-6
 * @author Jason
 */
public class DBOpertor extends XXNCYLBXDBAccess {

	private DBTableItem tableItem;
	private Object[][] data;
	private DataImportListener listener;

	public void importToBasicData(DBTableItem tableItem, Object[][] data,
			DataImportListener listener) {
		this.tableItem = tableItem;
		this.data = data;
		this.listener = listener;

		Thread th = new Thread() {
			@Override
			public void run() {
				actionImport();
			}
		};
		th.start();

	}

	/**
	 * ִ�е���
	 * @version 2012-5-11
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionImport() {

		StringBuffer sqlPre = new StringBuffer("insert into "
				+ tableItem.getTableName() + " (");

		HashMap<String, Integer> map = tableItem.getTableFieldToIndex();
		List<String> list = tableItem.getTableFieldImport();
		int size = list.size();
		// excel��Ӧ������
		int[] excelIndex = new int[size];
		for (int i = 0; i < size; i++) {
			// ����ƴ�ӵ�����ֶΣ�ͬʱ�õ���Ӧ�ֶ�����data�������е�����
			String field = list.get(i);

			sqlPre.append(field);

			if (i < (size - 1)) {
				// ���һ���ֶβ���Ҫ��ӣ������ֶζ���Ҫ
				sqlPre.append(" , ");
			}

			excelIndex[i] = map.get(field);
		}

		sqlPre.append(") values (");

		if (commonsql.connect(user, password)) {

			for (int row = 0; row < data.length; row++) {
				StringBuffer sql = new StringBuffer(sqlPre);
				for (int i = 0; i < excelIndex.length; i++) {
					// ƴ��sqlֵ
					int index = excelIndex[i];
					if (index >= 0) {
						// ֵ��Ϊ��
						if(index < data[row].length){
							sql.append("'" + data[row][index] + "'");
						}else{
							sql.append("''");
						}
					} else {
						// ֵΪ��
						sql.append("''");
					}

					if (i < (excelIndex.length - 1)) {
						// ���һ���ֶβ���Ҫ��ӣ������ֶζ���Ҫ
						sql.append(" , ");
					}
				}
				sql.append(")");
				// sqlƴ�ӽ���
				
				//ִ��SQL���
				boolean ret = commonsql.executesql(sql.toString());
				
				if(ret){
					//�ص��ɹ�
					listener.onImportProgress(row, data[row], DataImportListener.STATE_OK);
				}else{
					listener.onImportProgress(row, data[row], DataImportListener.STATE_FLASE);
				}
				
				if(row % 5000 == 0){
					//ÿִ��2000��ʱ����������
					commonsql.close();
					commonsql.connect(user, password);
				}
			}
			
			commonsql.close();

		} else {

			System.err.println("connect failed!");

		}
	}

	private static List<DBTableItem> importTableList;

	public static List<DBTableItem> getImportTableItem() {
		if (importTableList != null) {
			return importTableList;
		}

		importTableList = new ArrayList<DBTableItem>();

		// ====�������ݱ����ֶ�=====start
		DBTableItem table = new DBTableItem();
		table.setTableName("villager");
		table.setTableNameDisplay("�����������");
		table.addField(v_name, "����", true);
		table.addField(v_sex, "�Ա�", true);
		table.addField(v_ic, "���֤��", true);
		table.addField(v_nation, "����", true);
		table.addField(v_birthday, "��������", true);
		table.addField(v_address_live, "�־�ס��ַ", true);
		table.addField(v_householder_name, "��������", true);

		importTableList.add(table);
		// ====�������ݱ����ֶ�=====end

		// ====���������ݱ����ֶ�=====start
		table = new DBTableItem();
		table.setTableName("villager_error");
		table.setTableNameDisplay("���������ݱ�");
		table.addField("ve_name", "����", true);
		table.addField("ve_ic", "���֤��", true);
		table.addField("ve_type", "����������", true);
		table.addField("ve_remark1", "��ע��Ϣһ", true);
		table.addField("ve_remark2", "��ע��Ϣ��", true);
		table.addField("ve_remark3", "��ע��Ϣ��", true);
		importTableList.add(table);
		// ====���������ݱ����ֶ�=====end

		return importTableList;
	}
}

/**
 * ���ݵ��������
 * 
 * @version 2012-5-11
 * @author Jason
 */
interface DataImportListener {
	public static final int STATE_OK = 1;
	public static final int STATE_HAS_ONE = 2;
	public static final int STATE_FLASE = 3;
	/**
	 * 
	 * @version 2012-5-11
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void onImportProgress(int i, Object[] data, int state);
}