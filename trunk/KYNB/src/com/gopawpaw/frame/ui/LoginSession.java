/**
 * 
 */
package com.gopawpaw.frame.ui;


/**
 * @version 2010-4-16
 * @author 李锦华
 *
 */
public class LoginSession {

	private String domain = null;
	
	private String username = null;
	
	private String groupname = null;
	
	private static boolean activity = false;
	
	/**
	 * 
	 */
	public LoginSession() {
	}
	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}
	
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	/**
	 * 是否处于活动状态
	 */
	public static boolean isActivity() {
		return activity;
	}
	public static void setActivity(boolean activity) {
		LoginSession.activity = activity;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	
	
	

}
