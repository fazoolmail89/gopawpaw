/**     
* @{#} User.java Create on 2012-9-30 下午10:44:07     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;
/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class User {
	/** 超级管理员账户 */
	public static final String SUPER_ADMIN = "admin";
	
	public static final String STR_STATUS_0 = "无效"; 
	public static final String STR_STATUS_1 = "有效"; 
	private int id;
	private String username;
	private String password;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
