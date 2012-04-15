package com.gopawpaw.kynb.module.datascan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataScanning extends XXNCYLBXDBAccess {

	/**
	 * 扫描数据，根据扫描项，扫描数据库中是否存在相应记录
	 * 
	 * @param siList
	 *            需要扫描字段列表
	 * @param data
	 *            包含表头的JTabel数据
	 * @return 包含表头的JTabel数据
	 */
	public Object[][] scaning(List<ScanItem> siList, Object[][] data) {
		if (data == null)
			return null;
		if (data.length < 2)
			return data;
		
		//存放扫描项对应单元格的列标
		Map<Integer, ScanItem> map = new HashMap<Integer, ScanItem>();
		
		Object[][] resultData = new Object[data.length][data[0].length + 1];

		for (int i = 0; i < data[0].length; i++) {
			// 为返回结果的表头赋值;
			resultData[0][i] = data[0][i];
			for (int j = 0; j < siList.size(); j++) {
				String temp1 = data[0][i].toString();
				String temp2 = siList.get(j).getExlColumnName();
				System.out.println(temp1 + " : " + temp2);				
				if (temp1.equals(temp2)) {
					map.put(i, siList.get(j));
					//找到列名相同的数据后退出子循环
					break;
				}
			}
		}
		// 给返回结果数组表头的最后一个单元格赋值;
		resultData[0][data[0].length] = "扫描结果";

		String frontSql =  "select count(*) as countN from villager where 1 = 1 ";
		String sql = "";
		if (commonsql.connect(user, password)) {
			// data含有表头，所以从index从1开始循环
			// 由行到列开始遍历表格的单元格
			for (int i = 1; i < data.length; i++) {
				sql = frontSql;
				for (int j = 0; j < data[0].length; j++) {
					// 将原数组的单元格值赋给返回结果对应的单元格
					resultData[i][j] = data[i][j];

					ScanItem si = map.get(j);
					if (si != null) {
						sql = sql + " and " + si.getDbtColumnName() + " = '"
								+ data[i][j] + "' ";						
					}
				}
System.out.println(sql);
				String isSame = "不相同";
				if(!sql.equals(frontSql)) {
					if (commonsql.query(sql)) {
						// 如果有这条数据
						while (commonsql.nextrecord()) {
							if(commonsql.getInt("countN") > 0)
								isSame = "相同";
						}
					}					
				}
				// 给返回结果数组的最后一列的单元格赋值
				resultData[i][data[0].length] = isSame;
				//初始化sql
				sql = "";
			}
			commonsql.close();
		} else {
		}
		return resultData;
	}
}
