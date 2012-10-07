/**     
* @{#} UserDAO.java Create on 2012-10-1 上午10:03:49     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import com.gopawpaw.kynb.common.StringUtil;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserDAO extends XXNCYLBXDBAccess {
	public User Login(String username, String passwd) {
		User loginUser = null;
		String sql = "select * from users a where " +
				" a.username = " + StringUtil.getQuotStr(username) + 
				" and a.password = " + StringUtil.getQuotStr(passwd);
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				while (commonsql.nextrecord()) {
					loginUser = new User();
					loginUser.setId(commonsql.getInt("id"));
					loginUser.setUsername(commonsql.getString("username"));
					loginUser.setPassword(commonsql.getString("password"));
					loginUser.setStatus(commonsql.getInt("status"));
				}
			}
		}
		return loginUser;
	}
	
	public Object[][] findAll() {
		Object[][] users = {};
		String sql = "select * from users";
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				users = new Object[(int) commonsql.getrowcount()][];
				int i = 0;
				while (commonsql.nextrecord()) {
					Object[] row = new Object[UserListScrollPane.columnNames.length];
					row[0] = commonsql.getString("id");
					row[1] = commonsql.getString("username");
					row[2] = commonsql.getString("password");
					if(commonsql.getInt("status") == 1)
						row[3] = User.STR_STATUS_1;
					else
						row[3] = User.STR_STATUS_0;
					
					users[i] = row;
					i++;
				}
			}
		}
		return users;
	}
	
	public boolean save(User newUser) {
		boolean result = false;
		String sql = "insert into users(username, password, status) values(" +
				StringUtil.getQuotStr(newUser.getUsername()) +
				" , " + StringUtil.getQuotStr(newUser.getPassword()) +
				" , " + newUser.getStatus() + ")";
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
	
	public boolean update(User updUser) {
		boolean result = false;
		String sql = "update users set username = " + 
				StringUtil.getQuotStr(updUser.getUsername()) +
				" , password = " + StringUtil.getQuotStr(updUser.getPassword()) +
				" , status = " + updUser.getStatus() +
				" where id = " + updUser.getId();
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
	
	public boolean delete(User delUser) {
		boolean result = false;
		String sql = "delete from users where id = " + delUser.getId();
		if (commonsql.connect(user, password)) {
			result = commonsql.executesql(sql);
		}
		return result;
	}
	
	/**
	 * 根据用户名查询user对象，如果查不到，返回null
	 * @param username
	 * @return
	 */
	public User findByUsername(String username) {
		User ur = null;
		String sql = "select * from users where username = " + 
				StringUtil.getQuotStr(username);
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				while (commonsql.nextrecord()) {
					ur = new User();
					ur.setId(commonsql.getInt("id"));
					ur.setUsername(commonsql.getString("username"));
					ur.setPassword(commonsql.getString("password"));
					ur.setStatus(commonsql.getInt("status"));
				}
			}
		}
		return ur;
	}
	
}
