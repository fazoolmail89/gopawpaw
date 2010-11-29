package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpfcDet entity provides the base persistence definition of the
 * EswpfcDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfcDet implements java.io.Serializable {

	// Fields

	private EswpfcDetId id;
	private Double oidEswpfcDet;
	private Date eswpfcModDate;
	private String eswpfcModUserid;
	private String eswpfcUser1;
	private String eswpfcUser2;
	private String eswpfcQadc01;
	private String eswpfcQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpfcDet() {
	}

	/** full constructor */
	public AbstractEswpfcDet(EswpfcDetId id, Double oidEswpfcDet,
			Date eswpfcModDate, String eswpfcModUserid, String eswpfcUser1,
			String eswpfcUser2, String eswpfcQadc01, String eswpfcQadc02) {
		this.id = id;
		this.oidEswpfcDet = oidEswpfcDet;
		this.eswpfcModDate = eswpfcModDate;
		this.eswpfcModUserid = eswpfcModUserid;
		this.eswpfcUser1 = eswpfcUser1;
		this.eswpfcUser2 = eswpfcUser2;
		this.eswpfcQadc01 = eswpfcQadc01;
		this.eswpfcQadc02 = eswpfcQadc02;
	}

	// Property accessors

	public EswpfcDetId getId() {
		return this.id;
	}

	public void setId(EswpfcDetId id) {
		this.id = id;
	}

	public Double getOidEswpfcDet() {
		return this.oidEswpfcDet;
	}

	public void setOidEswpfcDet(Double oidEswpfcDet) {
		this.oidEswpfcDet = oidEswpfcDet;
	}

	public Date getEswpfcModDate() {
		return this.eswpfcModDate;
	}

	public void setEswpfcModDate(Date eswpfcModDate) {
		this.eswpfcModDate = eswpfcModDate;
	}

	public String getEswpfcModUserid() {
		return this.eswpfcModUserid;
	}

	public void setEswpfcModUserid(String eswpfcModUserid) {
		this.eswpfcModUserid = eswpfcModUserid;
	}

	public String getEswpfcUser1() {
		return this.eswpfcUser1;
	}

	public void setEswpfcUser1(String eswpfcUser1) {
		this.eswpfcUser1 = eswpfcUser1;
	}

	public String getEswpfcUser2() {
		return this.eswpfcUser2;
	}

	public void setEswpfcUser2(String eswpfcUser2) {
		this.eswpfcUser2 = eswpfcUser2;
	}

	public String getEswpfcQadc01() {
		return this.eswpfcQadc01;
	}

	public void setEswpfcQadc01(String eswpfcQadc01) {
		this.eswpfcQadc01 = eswpfcQadc01;
	}

	public String getEswpfcQadc02() {
		return this.eswpfcQadc02;
	}

	public void setEswpfcQadc02(String eswpfcQadc02) {
		this.eswpfcQadc02 = eswpfcQadc02;
	}

}