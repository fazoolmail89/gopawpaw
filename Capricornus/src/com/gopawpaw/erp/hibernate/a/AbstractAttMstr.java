package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAttMstr entity provides the base persistence definition of the
 * AttMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttMstr implements java.io.Serializable {

	// Fields

	private String attTableName;
	private Double oidAttMstr;
	private Boolean attAuditEnabled;
	private Date attModDate;
	private String attModUserid;
	private String attUser1;
	private String attUser2;
	private String attQadc01;
	private String attQadc02;

	// Constructors

	/** default constructor */
	public AbstractAttMstr() {
	}

	/** full constructor */
	public AbstractAttMstr(Double oidAttMstr, Boolean attAuditEnabled,
			Date attModDate, String attModUserid, String attUser1,
			String attUser2, String attQadc01, String attQadc02) {
		this.oidAttMstr = oidAttMstr;
		this.attAuditEnabled = attAuditEnabled;
		this.attModDate = attModDate;
		this.attModUserid = attModUserid;
		this.attUser1 = attUser1;
		this.attUser2 = attUser2;
		this.attQadc01 = attQadc01;
		this.attQadc02 = attQadc02;
	}

	// Property accessors

	public String getAttTableName() {
		return this.attTableName;
	}

	public void setAttTableName(String attTableName) {
		this.attTableName = attTableName;
	}

	public Double getOidAttMstr() {
		return this.oidAttMstr;
	}

	public void setOidAttMstr(Double oidAttMstr) {
		this.oidAttMstr = oidAttMstr;
	}

	public Boolean getAttAuditEnabled() {
		return this.attAuditEnabled;
	}

	public void setAttAuditEnabled(Boolean attAuditEnabled) {
		this.attAuditEnabled = attAuditEnabled;
	}

	public Date getAttModDate() {
		return this.attModDate;
	}

	public void setAttModDate(Date attModDate) {
		this.attModDate = attModDate;
	}

	public String getAttModUserid() {
		return this.attModUserid;
	}

	public void setAttModUserid(String attModUserid) {
		this.attModUserid = attModUserid;
	}

	public String getAttUser1() {
		return this.attUser1;
	}

	public void setAttUser1(String attUser1) {
		this.attUser1 = attUser1;
	}

	public String getAttUser2() {
		return this.attUser2;
	}

	public void setAttUser2(String attUser2) {
		this.attUser2 = attUser2;
	}

	public String getAttQadc01() {
		return this.attQadc01;
	}

	public void setAttQadc01(String attQadc01) {
		this.attQadc01 = attQadc01;
	}

	public String getAttQadc02() {
		return this.attQadc02;
	}

	public void setAttQadc02(String attQadc02) {
		this.attQadc02 = attQadc02;
	}

}