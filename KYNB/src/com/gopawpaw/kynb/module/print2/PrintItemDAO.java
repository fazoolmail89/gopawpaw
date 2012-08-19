/**     
* @{#} PrintItemDBOpt.java Create on 2012-8-15 ÏÂÎç11:20:12     
*     
* Copyright (c) 2012 by Â¬Ïòç÷.     
*/   

package com.gopawpaw.kynb.module.print2;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**     
 * @author Â¬Ïòç÷ luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintItemDAO extends XXNCYLBXDBAccess {
	public List<PrintItem> findAll() {
		String sql = "select * from printItem";
		return findBySql(sql);
	}
	
	public List<PrintItem> findAvailables() {
		String sql = "select * from printItem where EnAble = 1";
		return findBySql(sql);		
	}
	
	private List<PrintItem> findBySql(String sql) {
		List<PrintItem> pis = new ArrayList<PrintItem>();
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				PrintItem pi = null;
				while (commonsql.nextrecord()) {
					pi = new PrintItem();
					pi.setId(commonsql.getString("Id"));
					pi.setCode(commonsql.getString("Code"));
					pi.setName(commonsql.getString("Name"));
					pi.setMapIndex(commonsql.getInt("MapIndex"));
					pi.setDefValue(commonsql.getString("DefValue"));
					pi.setX(commonsql.getInt("X"));
					pi.setY(commonsql.getInt("Y"));
					if(commonsql.getInt("EnAble") == 1)
						pi.setEnAble(true);
					else
						pi.setEnAble(false);
					pis.add(pi);
				}
			}
		}
		commonsql.close();		
		return pis;
	}
	
	public boolean updateAll(List<PrintItem> pis) {
		boolean result = false;
		if(pis.size() > 0) {
			if (commonsql.connect(user, password)) {
				for(PrintItem pi: pis) {
					int disAble = 0;
					if(pi.isEnAble())
						disAble = 1;
						
					String sql = "update printItem set " 
							+ " Name = " + StringUtil.getQuotStr(pi.getName())
							+ " ,MapIndex = " + pi.getMapIndex() 
							+ " ,DefValue = " + StringUtil.getQuotStr(pi.getDefValue())
							+ " ,X = " + pi.getX()
							+ " ,Y = " + pi.getY()
							+ " ,EnAble = " + disAble
							+ " where Code = " + StringUtil.getQuotStr(pi.getCode());
					result = commonsql.executesql(sql);
				}
			}
			commonsql.close();
		}
		return result;
	}
}
