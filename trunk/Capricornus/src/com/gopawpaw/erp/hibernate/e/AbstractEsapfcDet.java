package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapfcDet entity provides the base persistence definition of the
 * EsapfcDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfcDet implements java.io.Serializable {

	// Fields

	private EsapfcDetId id;
	private Double oidEsapfcDet;
	private Date esapfcModDate;
	private String esapfcModUserid;
	private String esapfcUser1;
	private String esapfcUser2;
	private String esapfcQadc01;
	private String esapfcQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapfcDet() {
	}

	/** full constructor */
	public AbstractEsapfcDet(EsapfcDetId id, Double oidEsapfcDet,
			Date esapfcModDate, String esapfcModUserid, String esapfcUser1,
			String esapfcUser2, String esapfcQadc01, String esapfcQadc02) {
		this.id = id;
		this.oidEsapfcDet = oidEsapfcDet;
		this.esapfcModDate = esapfcModDate;
		this.esapfcModUserid = esapfcModUserid;
		this.esapfcUser1 = esapfcUser1;
		this.esapfcUser2 = esapfcUser2;
		this.esapfcQadc01 = esapfcQadc01;
		this.esapfcQadc02 = esapfcQadc02;
	}

	// Property accessors

	public EsapfcDetId getId() {
		return this.id;
	}

	public void setId(EsapfcDetId id) {
		this.id = id;
	}

	public Double getOidEsapfcDet() {
		return this.oidEsapfcDet;
	}

	public void setOidEsapfcDet(Double oidEsapfcDet) {
		this.oidEsapfcDet = oidEsapfcDet;
	}

	public Date getEsapfcModDate() {
		return this.esapfcModDate;
	}

	public void setEsapfcModDate(Date esapfcModDate) {
		this.esapfcModDate = esapfcModDate;
	}

	public String getEsapfcModUserid() {
		return this.esapfcModUserid;
	}

	public void setEsapfcModUserid(String esapfcModUserid) {
		this.esapfcModUserid = esapfcModUserid;
	}

	public String getEsapfcUser1() {
		return this.esapfcUser1;
	}

	public void setEsapfcUser1(String esapfcUser1) {
		this.esapfcUser1 = esapfcUser1;
	}

	public String getEsapfcUser2() {
		return this.esapfcUser2;
	}

	public void setEsapfcUser2(String esapfcUser2) {
		this.esapfcUser2 = esapfcUser2;
	}

	public String getEsapfcQadc01() {
		return this.esapfcQadc01;
	}

	public void setEsapfcQadc01(String esapfcQadc01) {
		this.esapfcQadc01 = esapfcQadc01;
	}

	public String getEsapfcQadc02() {
		return this.esapfcQadc02;
	}

	public void setEsapfcQadc02(String esapfcQadc02) {
		this.esapfcQadc02 = esapfcQadc02;
	}

}