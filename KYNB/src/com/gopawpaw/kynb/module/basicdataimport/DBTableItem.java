/**
 * 
 */
package com.gopawpaw.kynb.module.basicdataimport;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 数据库表对象
 * @version 2012-5-10
 * @author Jason
 */
public class DBTableItem {
	
	/**
	 * 表名
	 */
	private String tableName;
	
	/**
	 * 表显示的名称
	 */
	private String tableNameDisplay;
	
	/**
	 * 字段名
	 */
	private ArrayList<String> tableField;
	
	/**
	 * 字段对应显示的名称
	 */
	private HashMap<String,String> tableFieldDisplay;
	
	/**
	 * 导入字段对应的数组列索引
	 */
	private HashMap<String,Integer> tableFieldToIndex;
	
	/**
	 * 可导入的字段
	 */
	private ArrayList<String> tableFieldImport;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNameDisplay() {
		return tableNameDisplay;
	}

	public ArrayList<String> getTableField() {
		return tableField;
	}


	public HashMap<String, String> getTableFieldDisplay() {
		return tableFieldDisplay;
	}

	public ArrayList<String>getTableFieldImport() {
		return tableFieldImport;
	}

	public void addField(String fieldName,String displayName,boolean isImport){
		if(tableField == null){
			tableField = new ArrayList<String>();
		}
		
		if(tableFieldDisplay == null){
			tableFieldDisplay = new HashMap<String,String>();
		}
		
		if(tableFieldImport == null){
			tableFieldImport = new ArrayList<String>();
		}
		
		tableField.add(fieldName);
		tableFieldDisplay.put(fieldName, displayName);
		
		if(isImport){
			tableFieldImport.add(fieldName);
		}
		
	}

	@Override
	public String toString() {
		return tableNameDisplay;
	}

	public void setTableNameDisplay(String tableNameDisplay) {
		this.tableNameDisplay = tableNameDisplay;
	}
	
	public String getFieldDisplay(String fieldName){
		return tableFieldDisplay.get(fieldName);
	}

	public HashMap<String, Integer> getTableFieldToIndex() {
		return tableFieldToIndex;
	}
	
	public void putFieldToIndex(String fieldName,int index){
		if(tableFieldToIndex == null){
			tableFieldToIndex = new HashMap<String,Integer>();
		}
		tableFieldToIndex.put(fieldName, index);
	}
	
}
