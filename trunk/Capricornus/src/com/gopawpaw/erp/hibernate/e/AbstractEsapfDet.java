package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapfDet entity provides the base persistence definition of the
 * EsapfDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfDet implements java.io.Serializable {

	// Fields

	private EsapfDetId id;
	private Double oidEsapfDet;
	private String esapfFieldName;
	private Boolean esapfInclude;
	private Boolean esapfLabelInline;
	private String esapfCode;
	private Date esapfModDate;
	private String esapfModUserid;
	private String esapfUser1;
	private String esapfUser2;
	private String esapfQadc01;
	private String esapfQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapfDet() {
	}

	/** full constructor */
	public AbstractEsapfDet(EsapfDetId id, Double oidEsapfDet,
			String esapfFieldName, Boolean esapfInclude,
			Boolean esapfLabelInline, String esapfCode, Date esapfModDate,
			String esapfModUserid, String esapfUser1, String esapfUser2,
			String esapfQadc01, String esapfQadc02) {
		this.id = id;
		this.oidEsapfDet = oidEsapfDet;
		this.esapfFieldName = esapfFieldName;
		this.esapfInclude = esapfInclude;
		this.esapfLabelInline = esapfLabelInline;
		this.esapfCode = esapfCode;
		this.esapfModDate = esapfModDate;
		this.esapfModUserid = esapfModUserid;
		this.esapfUser1 = esapfUser1;
		this.esapfUser2 = esapfUser2;
		this.esapfQadc01 = esapfQadc01;
		this.esapfQadc02 = esapfQadc02;
	}

	// Property accessors

	public EsapfDetId getId() {
		return this.id;
	}

	public void setId(EsapfDetId id) {
		this.id = id;
	}

	public Double getOidEsapfDet() {
		return this.oidEsapfDet;
	}

	public void setOidEsapfDet(Double oidEsapfDet) {
		this.oidEsapfDet = oidEsapfDet;
	}

	public String getEsapfFieldName() {
		return this.esapfFieldName;
	}

	public void setEsapfFieldName(String esapfFieldName) {
		this.esapfFieldName = esapfFieldName;
	}

	public Boolean getEsapfInclude() {
		return this.esapfInclude;
	}

	public void setEsapfInclude(Boolean esapfInclude) {
		this.esapfInclude = esapfInclude;
	}

	public Boolean getEsapfLabelInline() {
		return this.esapfLabelInline;
	}

	public void setEsapfLabelInline(Boolean esapfLabelInline) {
		this.esapfLabelInline = esapfLabelInline;
	}

	public String getEsapfCode() {
		return this.esapfCode;
	}

	public void setEsapfCode(String esapfCode) {
		this.esapfCode = esapfCode;
	}

	public Date getEsapfModDate() {
		return this.esapfModDate;
	}

	public void setEsapfModDate(Date esapfModDate) {
		this.esapfModDate = esapfModDate;
	}

	public String getEsapfModUserid() {
		return this.esapfModUserid;
	}

	public void setEsapfModUserid(String esapfModUserid) {
		this.esapfModUserid = esapfModUserid;
	}

	public String getEsapfUser1() {
		return this.esapfUser1;
	}

	public void setEsapfUser1(String esapfUser1) {
		this.esapfUser1 = esapfUser1;
	}

	public String getEsapfUser2() {
		return this.esapfUser2;
	}

	public void setEsapfUser2(String esapfUser2) {
		this.esapfUser2 = esapfUser2;
	}

	public String getEsapfQadc01() {
		return this.esapfQadc01;
	}

	public void setEsapfQadc01(String esapfQadc01) {
		this.esapfQadc01 = esapfQadc01;
	}

	public String getEsapfQadc02() {
		return this.esapfQadc02;
	}

	public void setEsapfQadc02(String esapfQadc02) {
		this.esapfQadc02 = esapfQadc02;
	}

}