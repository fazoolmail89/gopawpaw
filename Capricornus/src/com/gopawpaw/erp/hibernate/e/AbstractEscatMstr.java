package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEscatMstr entity provides the base persistence definition of the
 * EscatMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscatMstr implements java.io.Serializable {

	// Fields

	private String escatCategoryCode;
	private Double oidEscatMstr;
	private String escatPplib;
	private String escatTopTableName;
	private Boolean escatPreviewPrompt;
	private Date escatModDate;
	private String escatModUserid;
	private String escatUser1;
	private String escatUser2;
	private String escatQadc01;
	private String escatQadc02;

	// Constructors

	/** default constructor */
	public AbstractEscatMstr() {
	}

	/** full constructor */
	public AbstractEscatMstr(Double oidEscatMstr, String escatPplib,
			String escatTopTableName, Boolean escatPreviewPrompt,
			Date escatModDate, String escatModUserid, String escatUser1,
			String escatUser2, String escatQadc01, String escatQadc02) {
		this.oidEscatMstr = oidEscatMstr;
		this.escatPplib = escatPplib;
		this.escatTopTableName = escatTopTableName;
		this.escatPreviewPrompt = escatPreviewPrompt;
		this.escatModDate = escatModDate;
		this.escatModUserid = escatModUserid;
		this.escatUser1 = escatUser1;
		this.escatUser2 = escatUser2;
		this.escatQadc01 = escatQadc01;
		this.escatQadc02 = escatQadc02;
	}

	// Property accessors

	public String getEscatCategoryCode() {
		return this.escatCategoryCode;
	}

	public void setEscatCategoryCode(String escatCategoryCode) {
		this.escatCategoryCode = escatCategoryCode;
	}

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public String getEscatPplib() {
		return this.escatPplib;
	}

	public void setEscatPplib(String escatPplib) {
		this.escatPplib = escatPplib;
	}

	public String getEscatTopTableName() {
		return this.escatTopTableName;
	}

	public void setEscatTopTableName(String escatTopTableName) {
		this.escatTopTableName = escatTopTableName;
	}

	public Boolean getEscatPreviewPrompt() {
		return this.escatPreviewPrompt;
	}

	public void setEscatPreviewPrompt(Boolean escatPreviewPrompt) {
		this.escatPreviewPrompt = escatPreviewPrompt;
	}

	public Date getEscatModDate() {
		return this.escatModDate;
	}

	public void setEscatModDate(Date escatModDate) {
		this.escatModDate = escatModDate;
	}

	public String getEscatModUserid() {
		return this.escatModUserid;
	}

	public void setEscatModUserid(String escatModUserid) {
		this.escatModUserid = escatModUserid;
	}

	public String getEscatUser1() {
		return this.escatUser1;
	}

	public void setEscatUser1(String escatUser1) {
		this.escatUser1 = escatUser1;
	}

	public String getEscatUser2() {
		return this.escatUser2;
	}

	public void setEscatUser2(String escatUser2) {
		this.escatUser2 = escatUser2;
	}

	public String getEscatQadc01() {
		return this.escatQadc01;
	}

	public void setEscatQadc01(String escatQadc01) {
		this.escatQadc01 = escatQadc01;
	}

	public String getEscatQadc02() {
		return this.escatQadc02;
	}

	public void setEscatQadc02(String escatQadc02) {
		this.escatQadc02 = escatQadc02;
	}

}