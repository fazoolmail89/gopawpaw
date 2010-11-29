package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTypMstr entity provides the base persistence definition of the
 * TypMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTypMstr implements java.io.Serializable {

	// Fields

	private String typType;
	private String typDesc;
	private String typMethod;
	private Boolean typQad01;
	private String typQad02;
	private String typQad03;
	private String typUser1;
	private String typUser2;
	private Double oidTypMstr;

	// Constructors

	/** default constructor */
	public AbstractTypMstr() {
	}

	/** minimal constructor */
	public AbstractTypMstr(Double oidTypMstr) {
		this.oidTypMstr = oidTypMstr;
	}

	/** full constructor */
	public AbstractTypMstr(String typDesc, String typMethod, Boolean typQad01,
			String typQad02, String typQad03, String typUser1, String typUser2,
			Double oidTypMstr) {
		this.typDesc = typDesc;
		this.typMethod = typMethod;
		this.typQad01 = typQad01;
		this.typQad02 = typQad02;
		this.typQad03 = typQad03;
		this.typUser1 = typUser1;
		this.typUser2 = typUser2;
		this.oidTypMstr = oidTypMstr;
	}

	// Property accessors

	public String getTypType() {
		return this.typType;
	}

	public void setTypType(String typType) {
		this.typType = typType;
	}

	public String getTypDesc() {
		return this.typDesc;
	}

	public void setTypDesc(String typDesc) {
		this.typDesc = typDesc;
	}

	public String getTypMethod() {
		return this.typMethod;
	}

	public void setTypMethod(String typMethod) {
		this.typMethod = typMethod;
	}

	public Boolean getTypQad01() {
		return this.typQad01;
	}

	public void setTypQad01(Boolean typQad01) {
		this.typQad01 = typQad01;
	}

	public String getTypQad02() {
		return this.typQad02;
	}

	public void setTypQad02(String typQad02) {
		this.typQad02 = typQad02;
	}

	public String getTypQad03() {
		return this.typQad03;
	}

	public void setTypQad03(String typQad03) {
		this.typQad03 = typQad03;
	}

	public String getTypUser1() {
		return this.typUser1;
	}

	public void setTypUser1(String typUser1) {
		this.typUser1 = typUser1;
	}

	public String getTypUser2() {
		return this.typUser2;
	}

	public void setTypUser2(String typUser2) {
		this.typUser2 = typUser2;
	}

	public Double getOidTypMstr() {
		return this.oidTypMstr;
	}

	public void setOidTypMstr(Double oidTypMstr) {
		this.oidTypMstr = oidTypMstr;
	}

}