package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapmpRef entity provides the base persistence definition of the
 * EsapmpRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapmpRef implements java.io.Serializable {

	// Fields

	private EsapmpRefId id;
	private Double oidEsapmpRef;
	private Boolean esapmpEsigActive;
	private Date esapmpModDate;
	private String esapmpModUserid;
	private String esapmpUser1;
	private String esapmpUser2;
	private String esapmpQadc01;
	private String esapmpQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapmpRef() {
	}

	/** full constructor */
	public AbstractEsapmpRef(EsapmpRefId id, Double oidEsapmpRef,
			Boolean esapmpEsigActive, Date esapmpModDate,
			String esapmpModUserid, String esapmpUser1, String esapmpUser2,
			String esapmpQadc01, String esapmpQadc02) {
		this.id = id;
		this.oidEsapmpRef = oidEsapmpRef;
		this.esapmpEsigActive = esapmpEsigActive;
		this.esapmpModDate = esapmpModDate;
		this.esapmpModUserid = esapmpModUserid;
		this.esapmpUser1 = esapmpUser1;
		this.esapmpUser2 = esapmpUser2;
		this.esapmpQadc01 = esapmpQadc01;
		this.esapmpQadc02 = esapmpQadc02;
	}

	// Property accessors

	public EsapmpRefId getId() {
		return this.id;
	}

	public void setId(EsapmpRefId id) {
		this.id = id;
	}

	public Double getOidEsapmpRef() {
		return this.oidEsapmpRef;
	}

	public void setOidEsapmpRef(Double oidEsapmpRef) {
		this.oidEsapmpRef = oidEsapmpRef;
	}

	public Boolean getEsapmpEsigActive() {
		return this.esapmpEsigActive;
	}

	public void setEsapmpEsigActive(Boolean esapmpEsigActive) {
		this.esapmpEsigActive = esapmpEsigActive;
	}

	public Date getEsapmpModDate() {
		return this.esapmpModDate;
	}

	public void setEsapmpModDate(Date esapmpModDate) {
		this.esapmpModDate = esapmpModDate;
	}

	public String getEsapmpModUserid() {
		return this.esapmpModUserid;
	}

	public void setEsapmpModUserid(String esapmpModUserid) {
		this.esapmpModUserid = esapmpModUserid;
	}

	public String getEsapmpUser1() {
		return this.esapmpUser1;
	}

	public void setEsapmpUser1(String esapmpUser1) {
		this.esapmpUser1 = esapmpUser1;
	}

	public String getEsapmpUser2() {
		return this.esapmpUser2;
	}

	public void setEsapmpUser2(String esapmpUser2) {
		this.esapmpUser2 = esapmpUser2;
	}

	public String getEsapmpQadc01() {
		return this.esapmpQadc01;
	}

	public void setEsapmpQadc01(String esapmpQadc01) {
		this.esapmpQadc01 = esapmpQadc01;
	}

	public String getEsapmpQadc02() {
		return this.esapmpQadc02;
	}

	public void setEsapmpQadc02(String esapmpQadc02) {
		this.esapmpQadc02 = esapmpQadc02;
	}

}