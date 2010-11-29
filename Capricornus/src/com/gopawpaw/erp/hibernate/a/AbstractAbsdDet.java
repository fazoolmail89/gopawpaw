package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbsdDet entity provides the base persistence definition of the
 * AbsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsdDet implements java.io.Serializable {

	// Fields

	private AbsdDetId id;
	private String absdAbsFldName;
	private String absdFldName;
	private String absdFldValue;
	private Boolean absdFldPrompt;
	private String absdValidate;
	private String absdModUserid;
	private Date absdModDate;
	private String absdUserc01;
	private String absdQadc01;
	private String absdQadc02;
	private Double oidAbsdDet;

	// Constructors

	/** default constructor */
	public AbstractAbsdDet() {
	}

	/** minimal constructor */
	public AbstractAbsdDet(AbsdDetId id, String absdAbsFldName,
			String absdFldName, String absdFldValue, Boolean absdFldPrompt,
			String absdValidate, String absdModUserid, String absdUserc01,
			String absdQadc01, String absdQadc02, Double oidAbsdDet) {
		this.id = id;
		this.absdAbsFldName = absdAbsFldName;
		this.absdFldName = absdFldName;
		this.absdFldValue = absdFldValue;
		this.absdFldPrompt = absdFldPrompt;
		this.absdValidate = absdValidate;
		this.absdModUserid = absdModUserid;
		this.absdUserc01 = absdUserc01;
		this.absdQadc01 = absdQadc01;
		this.absdQadc02 = absdQadc02;
		this.oidAbsdDet = oidAbsdDet;
	}

	/** full constructor */
	public AbstractAbsdDet(AbsdDetId id, String absdAbsFldName,
			String absdFldName, String absdFldValue, Boolean absdFldPrompt,
			String absdValidate, String absdModUserid, Date absdModDate,
			String absdUserc01, String absdQadc01, String absdQadc02,
			Double oidAbsdDet) {
		this.id = id;
		this.absdAbsFldName = absdAbsFldName;
		this.absdFldName = absdFldName;
		this.absdFldValue = absdFldValue;
		this.absdFldPrompt = absdFldPrompt;
		this.absdValidate = absdValidate;
		this.absdModUserid = absdModUserid;
		this.absdModDate = absdModDate;
		this.absdUserc01 = absdUserc01;
		this.absdQadc01 = absdQadc01;
		this.absdQadc02 = absdQadc02;
		this.oidAbsdDet = oidAbsdDet;
	}

	// Property accessors

	public AbsdDetId getId() {
		return this.id;
	}

	public void setId(AbsdDetId id) {
		this.id = id;
	}

	public String getAbsdAbsFldName() {
		return this.absdAbsFldName;
	}

	public void setAbsdAbsFldName(String absdAbsFldName) {
		this.absdAbsFldName = absdAbsFldName;
	}

	public String getAbsdFldName() {
		return this.absdFldName;
	}

	public void setAbsdFldName(String absdFldName) {
		this.absdFldName = absdFldName;
	}

	public String getAbsdFldValue() {
		return this.absdFldValue;
	}

	public void setAbsdFldValue(String absdFldValue) {
		this.absdFldValue = absdFldValue;
	}

	public Boolean getAbsdFldPrompt() {
		return this.absdFldPrompt;
	}

	public void setAbsdFldPrompt(Boolean absdFldPrompt) {
		this.absdFldPrompt = absdFldPrompt;
	}

	public String getAbsdValidate() {
		return this.absdValidate;
	}

	public void setAbsdValidate(String absdValidate) {
		this.absdValidate = absdValidate;
	}

	public String getAbsdModUserid() {
		return this.absdModUserid;
	}

	public void setAbsdModUserid(String absdModUserid) {
		this.absdModUserid = absdModUserid;
	}

	public Date getAbsdModDate() {
		return this.absdModDate;
	}

	public void setAbsdModDate(Date absdModDate) {
		this.absdModDate = absdModDate;
	}

	public String getAbsdUserc01() {
		return this.absdUserc01;
	}

	public void setAbsdUserc01(String absdUserc01) {
		this.absdUserc01 = absdUserc01;
	}

	public String getAbsdQadc01() {
		return this.absdQadc01;
	}

	public void setAbsdQadc01(String absdQadc01) {
		this.absdQadc01 = absdQadc01;
	}

	public String getAbsdQadc02() {
		return this.absdQadc02;
	}

	public void setAbsdQadc02(String absdQadc02) {
		this.absdQadc02 = absdQadc02;
	}

	public Double getOidAbsdDet() {
		return this.oidAbsdDet;
	}

	public void setOidAbsdDet(Double oidAbsdDet) {
		this.oidAbsdDet = oidAbsdDet;
	}

}