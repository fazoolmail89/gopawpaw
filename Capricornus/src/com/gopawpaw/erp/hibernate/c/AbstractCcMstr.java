package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcMstr entity provides the base persistence definition of the CcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcMstr implements java.io.Serializable {

	// Fields

	private CcMstrId id;
	private String ccDesc;
	private String ccUser1;
	private String ccUser2;
	private String ccQadc01;
	private Double oidCcMstr;

	// Constructors

	/** default constructor */
	public AbstractCcMstr() {
	}

	/** minimal constructor */
	public AbstractCcMstr(CcMstrId id, Double oidCcMstr) {
		this.id = id;
		this.oidCcMstr = oidCcMstr;
	}

	/** full constructor */
	public AbstractCcMstr(CcMstrId id, String ccDesc, String ccUser1,
			String ccUser2, String ccQadc01, Double oidCcMstr) {
		this.id = id;
		this.ccDesc = ccDesc;
		this.ccUser1 = ccUser1;
		this.ccUser2 = ccUser2;
		this.ccQadc01 = ccQadc01;
		this.oidCcMstr = oidCcMstr;
	}

	// Property accessors

	public CcMstrId getId() {
		return this.id;
	}

	public void setId(CcMstrId id) {
		this.id = id;
	}

	public String getCcDesc() {
		return this.ccDesc;
	}

	public void setCcDesc(String ccDesc) {
		this.ccDesc = ccDesc;
	}

	public String getCcUser1() {
		return this.ccUser1;
	}

	public void setCcUser1(String ccUser1) {
		this.ccUser1 = ccUser1;
	}

	public String getCcUser2() {
		return this.ccUser2;
	}

	public void setCcUser2(String ccUser2) {
		this.ccUser2 = ccUser2;
	}

	public String getCcQadc01() {
		return this.ccQadc01;
	}

	public void setCcQadc01(String ccQadc01) {
		this.ccQadc01 = ccQadc01;
	}

	public Double getOidCcMstr() {
		return this.oidCcMstr;
	}

	public void setOidCcMstr(Double oidCcMstr) {
		this.oidCcMstr = oidCcMstr;
	}

}