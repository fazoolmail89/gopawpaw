/**     
* @{#} DataValidate.java Create on 2012-10-2 下午3:48:21     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;
/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class DataValidate {
	
	/**
	 * 验证用户名，返回错误信息，返回null表示验证通过
	 * @param newName
	 * @param oldName
	 * @return 
	 */
	public String CheckUsername(String newName, String oldName) {
		String error = null;
		if(newName == null || "".equals(newName)) {
			error = "用户名不能为空！";
		} else {
			if(!newName.equals(oldName)) {
				UserDAO ud = new UserDAO();
				User user = ud.findByUsername(newName);
				if(user != null) {
					error = "用户名不能重复！";
				}			
			}
		}
		return error;
	}
	
	public String CheckPassword(String password) {
		String error = null;
		if(password == null || "".equals(password))
			error = "密码不能为空！";
		return error;
	}
}
