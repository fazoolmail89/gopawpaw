package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtwpMstr entity provides the base persistence definition of the
 * AtwpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtwpMstr implements java.io.Serializable {

	// Fields

	private AtwpMstrId id;
	private Double oidAtwpMstr;
	private Boolean atwpAuditActive;
	private String atwpFilterCriteria;
	private Boolean atwpAllFields;
	private Date atwpModDate;
	private String atwpModUserid;
	private String atwpUser1;
	private String atwpUser2;
	private String atwpQadc01;
	private String atwpQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtwpMstr() {
	}

	/** full constructor */
	public AbstractAtwpMstr(AtwpMstrId id, Double oidAtwpMstr,
			Boolean atwpAuditActive, String atwpFilterCriteria,
			Boolean atwpAllFields, Date atwpModDate, String atwpModUserid,
			String atwpUser1, String atwpUser2, String atwpQadc01,
			String atwpQadc02) {
		this.id = id;
		this.oidAtwpMstr = oidAtwpMstr;
		this.atwpAuditActive = atwpAuditActive;
		this.atwpFilterCriteria = atwpFilterCriteria;
		this.atwpAllFields = atwpAllFields;
		this.atwpModDate = atwpModDate;
		this.atwpModUserid = atwpModUserid;
		this.atwpUser1 = atwpUser1;
		this.atwpUser2 = atwpUser2;
		this.atwpQadc01 = atwpQadc01;
		this.atwpQadc02 = atwpQadc02;
	}

	// Property accessors

	public AtwpMstrId getId() {
		return this.id;
	}

	public void setId(AtwpMstrId id) {
		this.id = id;
	}

	public Double getOidAtwpMstr() {
		return this.oidAtwpMstr;
	}

	public void setOidAtwpMstr(Double oidAtwpMstr) {
		this.oidAtwpMstr = oidAtwpMstr;
	}

	public Boolean getAtwpAuditActive() {
		return this.atwpAuditActive;
	}

	public void setAtwpAuditActive(Boolean atwpAuditActive) {
		this.atwpAuditActive = atwpAuditActive;
	}

	public String getAtwpFilterCriteria() {
		return this.atwpFilterCriteria;
	}

	public void setAtwpFilterCriteria(String atwpFilterCriteria) {
		this.atwpFilterCriteria = atwpFilterCriteria;
	}

	public Boolean getAtwpAllFields() {
		return this.atwpAllFields;
	}

	public void setAtwpAllFields(Boolean atwpAllFields) {
		this.atwpAllFields = atwpAllFields;
	}

	public Date getAtwpModDate() {
		return this.atwpModDate;
	}

	public void setAtwpModDate(Date atwpModDate) {
		this.atwpModDate = atwpModDate;
	}

	public String getAtwpModUserid() {
		return this.atwpModUserid;
	}

	public void setAtwpModUserid(String atwpModUserid) {
		this.atwpModUserid = atwpModUserid;
	}

	public String getAtwpUser1() {
		return this.atwpUser1;
	}

	public void setAtwpUser1(String atwpUser1) {
		this.atwpUser1 = atwpUser1;
	}

	public String getAtwpUser2() {
		return this.atwpUser2;
	}

	public void setAtwpUser2(String atwpUser2) {
		this.atwpUser2 = atwpUser2;
	}

	public String getAtwpQadc01() {
		return this.atwpQadc01;
	}

	public void setAtwpQadc01(String atwpQadc01) {
		this.atwpQadc01 = atwpQadc01;
	}

	public String getAtwpQadc02() {
		return this.atwpQadc02;
	}

	public void setAtwpQadc02(String atwpQadc02) {
		this.atwpQadc02 = atwpQadc02;
	}

}