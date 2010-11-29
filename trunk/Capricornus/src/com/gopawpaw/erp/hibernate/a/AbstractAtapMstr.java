package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtapMstr entity provides the base persistence definition of the
 * AtapMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtapMstr implements java.io.Serializable {

	// Fields

	private AtapMstrId id;
	private Double oidAtapMstr;
	private Boolean atapAuditActive;
	private String atapTableName;
	private String atapFilterCriteria;
	private Boolean atapAllFields;
	private Date atapModDate;
	private String atapModUserid;
	private String atapUser1;
	private String atapUser2;
	private String atapQadc01;
	private String atapQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtapMstr() {
	}

	/** full constructor */
	public AbstractAtapMstr(AtapMstrId id, Double oidAtapMstr,
			Boolean atapAuditActive, String atapTableName,
			String atapFilterCriteria, Boolean atapAllFields, Date atapModDate,
			String atapModUserid, String atapUser1, String atapUser2,
			String atapQadc01, String atapQadc02) {
		this.id = id;
		this.oidAtapMstr = oidAtapMstr;
		this.atapAuditActive = atapAuditActive;
		this.atapTableName = atapTableName;
		this.atapFilterCriteria = atapFilterCriteria;
		this.atapAllFields = atapAllFields;
		this.atapModDate = atapModDate;
		this.atapModUserid = atapModUserid;
		this.atapUser1 = atapUser1;
		this.atapUser2 = atapUser2;
		this.atapQadc01 = atapQadc01;
		this.atapQadc02 = atapQadc02;
	}

	// Property accessors

	public AtapMstrId getId() {
		return this.id;
	}

	public void setId(AtapMstrId id) {
		this.id = id;
	}

	public Double getOidAtapMstr() {
		return this.oidAtapMstr;
	}

	public void setOidAtapMstr(Double oidAtapMstr) {
		this.oidAtapMstr = oidAtapMstr;
	}

	public Boolean getAtapAuditActive() {
		return this.atapAuditActive;
	}

	public void setAtapAuditActive(Boolean atapAuditActive) {
		this.atapAuditActive = atapAuditActive;
	}

	public String getAtapTableName() {
		return this.atapTableName;
	}

	public void setAtapTableName(String atapTableName) {
		this.atapTableName = atapTableName;
	}

	public String getAtapFilterCriteria() {
		return this.atapFilterCriteria;
	}

	public void setAtapFilterCriteria(String atapFilterCriteria) {
		this.atapFilterCriteria = atapFilterCriteria;
	}

	public Boolean getAtapAllFields() {
		return this.atapAllFields;
	}

	public void setAtapAllFields(Boolean atapAllFields) {
		this.atapAllFields = atapAllFields;
	}

	public Date getAtapModDate() {
		return this.atapModDate;
	}

	public void setAtapModDate(Date atapModDate) {
		this.atapModDate = atapModDate;
	}

	public String getAtapModUserid() {
		return this.atapModUserid;
	}

	public void setAtapModUserid(String atapModUserid) {
		this.atapModUserid = atapModUserid;
	}

	public String getAtapUser1() {
		return this.atapUser1;
	}

	public void setAtapUser1(String atapUser1) {
		this.atapUser1 = atapUser1;
	}

	public String getAtapUser2() {
		return this.atapUser2;
	}

	public void setAtapUser2(String atapUser2) {
		this.atapUser2 = atapUser2;
	}

	public String getAtapQadc01() {
		return this.atapQadc01;
	}

	public void setAtapQadc01(String atapQadc01) {
		this.atapQadc01 = atapQadc01;
	}

	public String getAtapQadc02() {
		return this.atapQadc02;
	}

	public void setAtapQadc02(String atapQadc02) {
		this.atapQadc02 = atapQadc02;
	}

}