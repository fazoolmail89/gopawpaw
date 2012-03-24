/**
 * 
 */
package com.gopawpaw.kynb.bean;

/**
 * @version 2011-11-14
 * @author Jason
 */
public class DefultData {

	private String key;
	
	private String valuse;
	
	private Object obj;
	
	/**
	 * 
	 */
	public DefultData(String key,String valuse) {
		this.key = key;
		this.valuse = valuse;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValuse() {
		return valuse;
	}

	public void setValuse(String valuse) {
		this.valuse = valuse;
	}

	@Override
	public String toString() {
		return key + " - " + valuse;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	
}
