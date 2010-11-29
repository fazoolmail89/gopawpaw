package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpfDet entity provides the base persistence definition of the
 * EswpfDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfDet implements java.io.Serializable {

	// Fields

	private EswpfDetId id;
	private Double oidEswpfDet;
	private String eswpfFieldName;
	private Boolean eswpfInclude;
	private Boolean eswpfLabelInline;
	private String eswpfCode;
	private Date eswpfModDate;
	private String eswpfModUserid;
	private String eswpfUser1;
	private String eswpfUser2;
	private String eswpfQadc01;
	private String eswpfQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpfDet() {
	}

	/** full constructor */
	public AbstractEswpfDet(EswpfDetId id, Double oidEswpfDet,
			String eswpfFieldName, Boolean eswpfInclude,
			Boolean eswpfLabelInline, String eswpfCode, Date eswpfModDate,
			String eswpfModUserid, String eswpfUser1, String eswpfUser2,
			String eswpfQadc01, String eswpfQadc02) {
		this.id = id;
		this.oidEswpfDet = oidEswpfDet;
		this.eswpfFieldName = eswpfFieldName;
		this.eswpfInclude = eswpfInclude;
		this.eswpfLabelInline = eswpfLabelInline;
		this.eswpfCode = eswpfCode;
		this.eswpfModDate = eswpfModDate;
		this.eswpfModUserid = eswpfModUserid;
		this.eswpfUser1 = eswpfUser1;
		this.eswpfUser2 = eswpfUser2;
		this.eswpfQadc01 = eswpfQadc01;
		this.eswpfQadc02 = eswpfQadc02;
	}

	// Property accessors

	public EswpfDetId getId() {
		return this.id;
	}

	public void setId(EswpfDetId id) {
		this.id = id;
	}

	public Double getOidEswpfDet() {
		return this.oidEswpfDet;
	}

	public void setOidEswpfDet(Double oidEswpfDet) {
		this.oidEswpfDet = oidEswpfDet;
	}

	public String getEswpfFieldName() {
		return this.eswpfFieldName;
	}

	public void setEswpfFieldName(String eswpfFieldName) {
		this.eswpfFieldName = eswpfFieldName;
	}

	public Boolean getEswpfInclude() {
		return this.eswpfInclude;
	}

	public void setEswpfInclude(Boolean eswpfInclude) {
		this.eswpfInclude = eswpfInclude;
	}

	public Boolean getEswpfLabelInline() {
		return this.eswpfLabelInline;
	}

	public void setEswpfLabelInline(Boolean eswpfLabelInline) {
		this.eswpfLabelInline = eswpfLabelInline;
	}

	public String getEswpfCode() {
		return this.eswpfCode;
	}

	public void setEswpfCode(String eswpfCode) {
		this.eswpfCode = eswpfCode;
	}

	public Date getEswpfModDate() {
		return this.eswpfModDate;
	}

	public void setEswpfModDate(Date eswpfModDate) {
		this.eswpfModDate = eswpfModDate;
	}

	public String getEswpfModUserid() {
		return this.eswpfModUserid;
	}

	public void setEswpfModUserid(String eswpfModUserid) {
		this.eswpfModUserid = eswpfModUserid;
	}

	public String getEswpfUser1() {
		return this.eswpfUser1;
	}

	public void setEswpfUser1(String eswpfUser1) {
		this.eswpfUser1 = eswpfUser1;
	}

	public String getEswpfUser2() {
		return this.eswpfUser2;
	}

	public void setEswpfUser2(String eswpfUser2) {
		this.eswpfUser2 = eswpfUser2;
	}

	public String getEswpfQadc01() {
		return this.eswpfQadc01;
	}

	public void setEswpfQadc01(String eswpfQadc01) {
		this.eswpfQadc01 = eswpfQadc01;
	}

	public String getEswpfQadc02() {
		return this.eswpfQadc02;
	}

	public void setEswpfQadc02(String eswpfQadc02) {
		this.eswpfQadc02 = eswpfQadc02;
	}

}