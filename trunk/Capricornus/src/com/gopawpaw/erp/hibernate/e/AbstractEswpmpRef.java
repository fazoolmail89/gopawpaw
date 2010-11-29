package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpmpRef entity provides the base persistence definition of the
 * EswpmpRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpmpRef implements java.io.Serializable {

	// Fields

	private EswpmpRefId id;
	private Double oidEswpmpRef;
	private Boolean eswpmpEsigActive;
	private Date eswpmpModDate;
	private String eswpmpModUserid;
	private String eswpmpUser1;
	private String eswpmpUser2;
	private String eswpmpQadc01;
	private String eswpmpQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpmpRef() {
	}

	/** full constructor */
	public AbstractEswpmpRef(EswpmpRefId id, Double oidEswpmpRef,
			Boolean eswpmpEsigActive, Date eswpmpModDate,
			String eswpmpModUserid, String eswpmpUser1, String eswpmpUser2,
			String eswpmpQadc01, String eswpmpQadc02) {
		this.id = id;
		this.oidEswpmpRef = oidEswpmpRef;
		this.eswpmpEsigActive = eswpmpEsigActive;
		this.eswpmpModDate = eswpmpModDate;
		this.eswpmpModUserid = eswpmpModUserid;
		this.eswpmpUser1 = eswpmpUser1;
		this.eswpmpUser2 = eswpmpUser2;
		this.eswpmpQadc01 = eswpmpQadc01;
		this.eswpmpQadc02 = eswpmpQadc02;
	}

	// Property accessors

	public EswpmpRefId getId() {
		return this.id;
	}

	public void setId(EswpmpRefId id) {
		this.id = id;
	}

	public Double getOidEswpmpRef() {
		return this.oidEswpmpRef;
	}

	public void setOidEswpmpRef(Double oidEswpmpRef) {
		this.oidEswpmpRef = oidEswpmpRef;
	}

	public Boolean getEswpmpEsigActive() {
		return this.eswpmpEsigActive;
	}

	public void setEswpmpEsigActive(Boolean eswpmpEsigActive) {
		this.eswpmpEsigActive = eswpmpEsigActive;
	}

	public Date getEswpmpModDate() {
		return this.eswpmpModDate;
	}

	public void setEswpmpModDate(Date eswpmpModDate) {
		this.eswpmpModDate = eswpmpModDate;
	}

	public String getEswpmpModUserid() {
		return this.eswpmpModUserid;
	}

	public void setEswpmpModUserid(String eswpmpModUserid) {
		this.eswpmpModUserid = eswpmpModUserid;
	}

	public String getEswpmpUser1() {
		return this.eswpmpUser1;
	}

	public void setEswpmpUser1(String eswpmpUser1) {
		this.eswpmpUser1 = eswpmpUser1;
	}

	public String getEswpmpUser2() {
		return this.eswpmpUser2;
	}

	public void setEswpmpUser2(String eswpmpUser2) {
		this.eswpmpUser2 = eswpmpUser2;
	}

	public String getEswpmpQadc01() {
		return this.eswpmpQadc01;
	}

	public void setEswpmpQadc01(String eswpmpQadc01) {
		this.eswpmpQadc01 = eswpmpQadc01;
	}

	public String getEswpmpQadc02() {
		return this.eswpmpQadc02;
	}

	public void setEswpmpQadc02(String eswpmpQadc02) {
		this.eswpmpQadc02 = eswpmpQadc02;
	}

}