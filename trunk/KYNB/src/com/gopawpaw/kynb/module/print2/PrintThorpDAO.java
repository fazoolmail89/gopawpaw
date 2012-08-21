/**     
* @{#} PrintThorpDAO.java Create on 2012-8-20 上午1:57:30     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;

import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintThorpDAO extends XXNCYLBXDBAccess {
	/**
	 * 查询所有村名称
	 * @return 村名称字符串数组
	 */
	public String[] findNameArray() {
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
	
	public PrintThorp[] findObjArray() {
		PrintThorp[] ptArray = {};
		String sql = "select * from printThorp";
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				ptArray = new PrintThorp[(int) commonsql.getrowcount()];
				PrintThorp pt = null;
				int i = 0;
				while (commonsql.nextrecord()) {
					pt = new PrintThorp();
					pt.setId(commonsql.getInt("t_id"));
					pt.setName(commonsql.getString("t_name"));
					ptArray[i] = pt;
					i++;
				}
				commonsql.close();
			}
		}
		return ptArray;
	}
}
