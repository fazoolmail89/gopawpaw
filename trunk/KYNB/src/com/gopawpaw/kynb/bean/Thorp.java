/**
 * 
 */
package com.gopawpaw.kynb.bean;

/**
 * @version 2011-11-13
 * @author Jason
 */
public class Thorp {
	
	private int t_id = -1;
	
	private String t_name;
	
	/**
	 * 
	 */
	public Thorp() {
		// TODO Auto-generated constructor stub
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		return t_name;
	}

	
}
