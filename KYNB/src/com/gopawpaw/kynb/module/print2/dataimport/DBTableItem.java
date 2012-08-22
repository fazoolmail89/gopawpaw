/**
 * 
 */
package com.gopawpaw.kynb.module.print2.dataimport;

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
	 * 字段对应的值
	 */
	private HashMap<String,Object> tableFieldValuse;
	
	/**
	 * 可导入的字段
	 */
	private ArrayList<String> tableFieldImport;
	
	/**
	 * 在导入时选择赋值的字段
	 */
	private ArrayList<String> tableFieldSelect;
	
	/**
	 * 默认值字段
	 */
	private ArrayList<String> tableFieldDef;

	
	public DBTableItem() {
		super();
		if(tableField == null){
			tableField = new ArrayList<String>();
		}
		
		if(tableFieldDisplay == null){
			tableFieldDisplay = new HashMap<String,String>();
		}
		
		if(tableFieldValuse == null){
			tableFieldValuse = new HashMap<String,Object>();
		}
		
		if(tableFieldImport == null){
			tableFieldImport = new ArrayList<String>();
		}
		
		if(tableFieldSelect == null){
			tableFieldSelect = new ArrayList<String>();
		}
		
		if(tableFieldDef == null){
			tableFieldDef = new ArrayList<String>();
		}
	}

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

	public void addField(String fieldName,String displayName){
		addField(fieldName,displayName,true,"");
	}
	
	public void addField(String fieldName,String displayName,boolean isImport){
		addField(fieldName,displayName,isImport,"");
	}
	
	public void addField(String fieldName,String displayName,boolean isImport,Object def){
		
		
		tableField.add(fieldName);
		tableFieldDisplay.put(fieldName, displayName);
		
		if(isImport){
			tableFieldImport.add(fieldName);
		}else{
			if(def == null){
				//通过选择导入
				tableFieldSelect.add(fieldName);
			}else{
				//默认值导入
				tableFieldDef.add(fieldName);
				tableFieldValuse.put(fieldName, def);
			}
		}
		
	}
	
	public void putTableFiledDef(String fieldName,Object def) {
		tableFieldValuse.put(fieldName, def);
	}
	
	public Object getFiledDefValuse(String fieldName){
		return (Object) tableFieldValuse.get(fieldName);
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

	public ArrayList<String> getTableFieldSelect() {
		return tableFieldSelect;
	}

	public ArrayList<String> getTableFieldDef() {
		return tableFieldDef;
	}
	
}
