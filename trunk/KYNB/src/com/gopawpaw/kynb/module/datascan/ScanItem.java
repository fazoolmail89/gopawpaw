package com.gopawpaw.kynb.module.datascan;

public class ScanItem {
	
	public static final String SI_V_IC = "v_ic";
	public static final String SI_V_NAME = "v_name";
	public static final String SI_V_BANK_ACCOUNT = "v_bank_account";
	
	private String dbtColumnName;
	private String exlColumnName;
	
	public String getDbtColumnName() {
		return dbtColumnName;
	}
	public void setDbtColumnName(String dbtColumnName) {
		this.dbtColumnName = dbtColumnName;
	}
	public String getExlColumnName() {
		return exlColumnName;
	}
	public void setExlColumnName(String exlColumnName) {
		this.exlColumnName = exlColumnName;
	}
}
