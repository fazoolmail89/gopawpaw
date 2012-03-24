/**
 * 
 */
package com.gopawpaw.frame;

/**
 * @version 2010-5-7
 * @author Àî½õ»ª
 *
 */
public class DatabaseInfo {

	private String connectName = null;
	
	private String driveName = null;
	
	private String user = null;
	
	private String password = null;
	
	private int DatabaseType = 3;
	/**
	 * 
	 */
	public DatabaseInfo() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the connectName
	 */
	public String getConnectName() {
		return connectName;
	}
	/**
	 * @param connectName the connectName to set
	 */
	public void setConnectName(String connectName) {
		this.connectName = connectName;
	}
	/**
	 * @return the driveName
	 */
	public String getDriveName() {
		return driveName;
	}
	/**
	 * @param driveName the driveName to set
	 */
	public void setDriveName(String driveName) {
		this.driveName = driveName;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the databaseType
	 */
	public int getDatabaseType() {
		return DatabaseType;
	}
	/**
	 * @param databaseType the databaseType to set
	 */
	public void setDatabaseType(int databaseType) {
		DatabaseType = databaseType;
	}

}
