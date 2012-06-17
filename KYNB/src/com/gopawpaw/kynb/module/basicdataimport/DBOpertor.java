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
 * 数据库操作类
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
	 * 执行导入
	 * @version 2012-5-11
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionImport() {

		StringBuffer sqlPre = new StringBuffer("insert into "
				+ tableItem.getTableName() + " (");

		//==========================拼接选择或默认的字段========start
		StringBuffer defValuse = new StringBuffer();
		List<String> list0 = tableItem.getTableFieldSelect();
		for(String field:list0){
			sqlPre.append(field);
			sqlPre.append(" , ");
			
			Object obj = tableItem.getFiledDefValuse(field);
			if(obj instanceof Integer){
				defValuse.append(obj);
			}else{
				defValuse.append("'" + obj + "'" );				
			}
			defValuse.append(" ,");
		}
		
		List<String> list1 = tableItem.getTableFieldDef();
		for(String field:list1){
			sqlPre.append(field);
			sqlPre.append(" , ");
			Object obj = tableItem.getFiledDefValuse(field);
			if(obj instanceof Integer){
				defValuse.append(obj);
			}else{
				defValuse.append("'" + obj + "'" );				
			}
			defValuse.append(" , ");
		}
		
		//==========================拼接选择或默认的字段========end
		
		//==========================拼接导入的字段========start
		HashMap<String, Integer> map = tableItem.getTableFieldToIndex();
		List<String> list = tableItem.getTableFieldImport();
		int size = list.size();
		// excel对应的索引
		int[] excelIndex = new int[size];
		for (int i = 0; i < size; i++) {
			// 遍历拼接导入的字段，同时得到对应字段所在data数组中列的索引
			String field = list.get(i);

			sqlPre.append(field);

			if (i < (size - 1)) {
				// 最后一个字段不需要添加，其他字段都需要
				sqlPre.append(" , ");
			}

			excelIndex[i] = map.get(field);
		}
		//==========================拼接导入的字段========end

		sqlPre.append(") values (");
		//==========================拼接选择或默认的字段值========start
		sqlPre.append(defValuse.toString());		
		//==========================拼接选择或默认的字段值========end

		if (commonsql.connect(user, password)) {

			for (int row = 0; row < data.length; row++) {
				StringBuffer sql = new StringBuffer(sqlPre);
				for (int i = 0; i < excelIndex.length; i++) {
					// 拼接sql值
					int index = excelIndex[i];
					if (index >= 0) {
						// 值不为空
						if(index < data[row].length){
							sql.append("'" + data[row][index] + "'");
						}else{
							sql.append("''");
						}
					} else {
						// 值为空
						sql.append("''");
					}

					if (i < (excelIndex.length - 1)) {
						// 最后一个字段不需要添加，其他字段都需要
						sql.append(" , ");
					}
				}
				sql.append(")");
				// sql拼接结束
				
				//执行SQL语句
				boolean ret = commonsql.executesql(sql.toString());
				
				if(ret){
					//回调成功
					listener.onImportProgress(row, data[row], DataImportListener.STATE_OK);
				}else{
					listener.onImportProgress(row, data[row], DataImportListener.STATE_FLASE);
				}
				
				if(row % 5000 == 0){
					//每执行2000次时，重新连接
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

		// ====居民数据表导入字段=====start
		DBTableItem table = new DBTableItem();
		table.setTableName("villager");
		table.setTableNameDisplay("居民基础数据");
		table.addField(v_name, "姓名");
		table.addField(v_sex, "性别");
		table.addField(v_ic, "身份证号");
		table.addField(v_nation, "民族");
		table.addField(v_birthday, "出生日期");
		table.addField(v_address_live, "现居住地址");
		table.addField(v_householder_name, "户主姓名");

		importTableList.add(table);
		// ====居民数据表导入字段=====end

		// ====黑名单数据表导入字段=====start
		table = new DBTableItem();
		table.setTableName("villager_error");
		table.setTableNameDisplay("黑名单数据表");
		table.addField("ve_name", "姓名");
		table.addField("ve_ic", "身份证号");
		table.addField("ve_type", "黑名单类型");
		table.addField("ve_remark1", "备注信息一");
		table.addField("ve_remark2", "备注信息二");
		table.addField("ve_remark3", "备注信息三");
		importTableList.add(table);
		// ====黑名单数据表导入字段=====end
		
		// ====打印数据表导入字段=====start
		table = new DBTableItem();
		table.setTableName("printData");
		table.setTableNameDisplay("打印数据表");
		table.addField("Area", "所属地区");
		table.addField("ThorpId", "所属村", false,null);
		table.addField("ThorpName", "所属机构编号");
		table.addField("SerialNum", "个人编号");
		table.addField("Name", "姓名");
		table.addField("ICCode", "身份证号");
		table.addField("Phone", "联系电话");
		table.addField("FamilyCode", "家庭编号");
		table.addField("J_Account", "缴费银行账号");
		table.addField("J_AccountName", "缴费银行户名");
		table.addField("Z_Account", "支付银行账号");
		table.addField("Z_AccountName", "支付银行户名");
		table.addField("Age", "年龄");
		table.addField("Sex", "性别");
		table.addField("AchieveDate", "到龄时间");
		table.addField("BirthDate", "出生日期");
		table.addField("Relationship", "与户主关系");
		table.addField("PayGrade", "本年缴费档次");
		table.addField("PersType", "本年人员类别");
		table.addField("Address", "家庭住址");
		table.addField("Remark", "备注");
		table.addField("TotalAcct", "累计个人账户金额");
		table.addField("TotalPay", "累计个人缴费金额");
		table.addField("TotalSubs", "累计财政补助");
		table.addField("PrintFlag", "打印标记",false,0);
		table.addField("PrintDate", "打印日期",false);
		
		importTableList.add(table);
		// ====打印数据表导入字段=====end

		return importTableList;
	}
}

/**
 * 数据导入监听器
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