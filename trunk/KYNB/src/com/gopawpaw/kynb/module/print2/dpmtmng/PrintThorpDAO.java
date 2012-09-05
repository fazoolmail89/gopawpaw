/**     
* @{#} PrintThorpDAO.java Create on 2012-8-20 上午1:57:30     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.dpmtmng;

import com.gopawpaw.kynb.common.StringUtil;
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
	
	/**
	 * 为JTable表格数据体统查询，name为空是返回所有值
	 * @param name 机构名称
	 * @return 返回Object[][]
	 */
	public Object[][] findArrayToTable(String name) {
		Object[][] data = null;
		String sql = "";
		
		if(name == null)
			sql = "select * from printThorp";
		else
			sql = "select * from printThorp where t_name like " + StringUtil.getDLikeStr(name);
		
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				data = new Object[(int) commonsql.getrowcount()][];
				int i = 0;
				while (commonsql.nextrecord()) {
					Object[] row = new Object[TableScrollPane.columnNames.length];
					row[0] = commonsql.getString("t_id");
					row[1] = commonsql.getString("t_name");
					
					data[i] = row;
					i++;
				}
				commonsql.close();
			}	
		}
		return data;
	}
	
	/**
	 * 为校验机构名称是否重复提供查询 
	 * @param name
	 * @return
	 */
	public PrintThorp findByNameToValidate(String name) {
		PrintThorp pt = null;
		String sql = "select * from printThorp where t_name = " + StringUtil.getQuotStr(name);
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				while(commonsql.nextrecord()) {
					pt = new PrintThorp();
					pt.setId(commonsql.getInt("t_id"));
					pt.setName(commonsql.getString("t_name"));
					break;
				}
			}
		}
		return pt;
	}
	
	public boolean beUse(int id) {
		boolean result = false;
		String sql = "select * from printData where ThorpId = " + id;
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				while(commonsql.nextrecord()) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	/**
	 * 新增机构信息
	 * @param pt printThorp对象
	 * @return
	 */
	public boolean save(PrintThorp pt) {
		boolean result = false;
		String sql = "insert into printThorp(t_name) values(" 
			+ StringUtil.getQuotStr(pt.getName()) + ")";
		if (commonsql.connect(user, password)) {
			if(sql != null && !"".equals(sql))
				result = commonsql.executesql(sql);
		}		
		return result;
	}
	
	/**
	 * 修改机构信息
	 * @param pt
	 * @return
	 */
	public boolean update(PrintThorp pt) {
		boolean result = false;
		String sql = "update printThorp set t_name = " 
					+ StringUtil.getQuotStr(pt.getName()) + " where t_id = " + pt.getId();
		if (commonsql.connect(user, password)) {
			if(sql != null && !"".equals(sql))
				result = commonsql.executesql(sql);
		}		
		return result;		
	}
	
	/**
	 * 删除机构信息
	 * @param id
	 * @return
	 */
	public boolean delete(int id) {
		boolean result = false;
		String sql = "delete from printThorp where t_id = " + id;
		if (commonsql.connect(user, password)) {
			if(sql != null && !"".equals(sql))
				result = commonsql.executesql(sql);
		}		
		return result;			
	}
}
