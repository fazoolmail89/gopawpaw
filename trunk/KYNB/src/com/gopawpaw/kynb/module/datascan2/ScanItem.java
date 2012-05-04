package com.gopawpaw.kynb.module.datascan2;

public class ScanItem {
	public static final String V_IC = "v_ic";
	public static final String V_NAME = "v_name";
	public static final String V_BANK_ACCOUNT = "v_bank_account";
	
	private boolean check;
	private String dbtColumnName;
	private String dbtExample;
	private String excelColumnName;
	private int excelCNIndex;
	
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getDbtColumnName() {
		return dbtColumnName;
	}
	public void setDbtColumnName(String dbtColumnName) {
		this.dbtColumnName = dbtColumnName;
	}
	public String getDbtExample() {
		return dbtExample;
	}
	public void setDbtExample(String dbtExample) {
		this.dbtExample = dbtExample;
	}
	public String getExcelColumnName() {
		return excelColumnName;
	}
	public void setExcelColumnName(String excelColumnName) {
		this.excelColumnName = excelColumnName;
	}
	public int getExcelCNIndex() {
		return excelCNIndex;
	}
	public void setExcelCNIndex(int excelCNIndex) {
		this.excelCNIndex = excelCNIndex;
	}
}
