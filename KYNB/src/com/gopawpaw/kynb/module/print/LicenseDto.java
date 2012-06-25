package com.gopawpaw.kynb.module.print;

public class LicenseDto {
	private String id;
	private String icCode;
	private Integer printFlag;
	private String name;//姓名
	private String oldName;//曾用名
	private String birthday;//出生年月日
	private String sex;//性别
	private String code;//社会保障号
	private String address;//地址
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIcCode() {
		return icCode;
	}
	public void setIcCode(String icCode) {
		this.icCode = icCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getPrintFlag() {
		return printFlag;
	}
	public void setPrintFlag(Integer printFlag) {
		this.printFlag = printFlag;
	}
}
