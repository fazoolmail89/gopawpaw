/**
 * 
 */
package com.gopawpaw.kynb.module.print2.dataimport;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ���ݿ�����
 * @version 2012-5-10
 * @author Jason
 */
public class DBTableItem {
	
	/**
	 * ����
	 */
	private String tableName;
	
	/**
	 * ����ʾ������
	 */
	private String tableNameDisplay;
	
	/**
	 * �ֶ���
	 */
	private ArrayList<String> tableField;
	
	/**
	 * �ֶζ�Ӧ��ʾ������
	 */
	private HashMap<String,String> tableFieldDisplay;
	
	/**
	 * �����ֶζ�Ӧ������������
	 */
	private HashMap<String,Integer> tableFieldToIndex;
	
	/**
	 * �ֶζ�Ӧ��ֵ
	 */
	private HashMap<String,Object> tableFieldValuse;
	
	/**
	 * �ɵ�����ֶ�
	 */
	private ArrayList<String> tableFieldImport;
	
	/**
	 * �ڵ���ʱѡ��ֵ���ֶ�
	 */
	private ArrayList<String> tableFieldSelect;
	
	/**
	 * Ĭ��ֵ�ֶ�
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
				//ͨ��ѡ����
				tableFieldSelect.add(fieldName);
			}else{
				//Ĭ��ֵ����
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
