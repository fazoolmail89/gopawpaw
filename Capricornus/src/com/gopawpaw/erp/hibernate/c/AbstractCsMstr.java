package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsMstr entity provides the base persistence definition of the CsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsMstr implements java.io.Serializable {

	// Fields

	private CsMstrId id;
	private String csMethod;
	private String csType;
	private String csDesc;
	private String csUser1;
	private String csUser2;
	private String csQadc01;
	private Double oidCsMstr;

	// Constructors

	/** default constructor */
	public AbstractCsMstr() {
	}

	/** minimal constructor */
	public AbstractCsMstr(CsMstrId id, String csType, Double oidCsMstr) {
		this.id = id;
		this.csType = csType;
		this.oidCsMstr = oidCsMstr;
	}

	/** full constructor */
	public AbstractCsMstr(CsMstrId id, String csMethod, String csType,
			String csDesc, String csUser1, String csUser2, String csQadc01,
			Double oidCsMstr) {
		this.id = id;
		this.csMethod = csMethod;
		this.csType = csType;
		this.csDesc = csDesc;
		this.csUser1 = csUser1;
		this.csUser2 = csUser2;
		this.csQadc01 = csQadc01;
		this.oidCsMstr = oidCsMstr;
	}

	// Property accessors

	public CsMstrId getId() {
		return this.id;
	}

	public void setId(CsMstrId id) {
		this.id = id;
	}

	public String getCsMethod() {
		return this.csMethod;
	}

	public void setCsMethod(String csMethod) {
		this.csMethod = csMethod;
	}

	public String getCsType() {
		return this.csType;
	}

	public void setCsType(String csType) {
		this.csType = csType;
	}

	public String getCsDesc() {
		return this.csDesc;
	}

	public void setCsDesc(String csDesc) {
		this.csDesc = csDesc;
	}

	public String getCsUser1() {
		return this.csUser1;
	}

	public void setCsUser1(String csUser1) {
		this.csUser1 = csUser1;
	}

	public String getCsUser2() {
		return this.csUser2;
	}

	public void setCsUser2(String csUser2) {
		this.csUser2 = csUser2;
	}

	public String getCsQadc01() {
		return this.csQadc01;
	}

	public void setCsQadc01(String csQadc01) {
		this.csQadc01 = csQadc01;
	}

	public Double getOidCsMstr() {
		return this.oidCsMstr;
	}

	public void setOidCsMstr(Double oidCsMstr) {
		this.oidCsMstr = oidCsMstr;
	}

}