package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpfilDet entity provides the base persistence definition of the
 * EswpfilDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfilDet implements java.io.Serializable {

	// Fields

	private EswpfilDetId id;
	private Double oidEswpfilDet;
	private Date eswpfilModDate;
	private String eswpfilModUserid;
	private String eswpfilUser1;
	private String eswpfilUser2;
	private String eswpfilQadc01;
	private String eswpfilQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpfilDet() {
	}

	/** full constructor */
	public AbstractEswpfilDet(EswpfilDetId id, Double oidEswpfilDet,
			Date eswpfilModDate, String eswpfilModUserid, String eswpfilUser1,
			String eswpfilUser2, String eswpfilQadc01, String eswpfilQadc02) {
		this.id = id;
		this.oidEswpfilDet = oidEswpfilDet;
		this.eswpfilModDate = eswpfilModDate;
		this.eswpfilModUserid = eswpfilModUserid;
		this.eswpfilUser1 = eswpfilUser1;
		this.eswpfilUser2 = eswpfilUser2;
		this.eswpfilQadc01 = eswpfilQadc01;
		this.eswpfilQadc02 = eswpfilQadc02;
	}

	// Property accessors

	public EswpfilDetId getId() {
		return this.id;
	}

	public void setId(EswpfilDetId id) {
		this.id = id;
	}

	public Double getOidEswpfilDet() {
		return this.oidEswpfilDet;
	}

	public void setOidEswpfilDet(Double oidEswpfilDet) {
		this.oidEswpfilDet = oidEswpfilDet;
	}

	public Date getEswpfilModDate() {
		return this.eswpfilModDate;
	}

	public void setEswpfilModDate(Date eswpfilModDate) {
		this.eswpfilModDate = eswpfilModDate;
	}

	public String getEswpfilModUserid() {
		return this.eswpfilModUserid;
	}

	public void setEswpfilModUserid(String eswpfilModUserid) {
		this.eswpfilModUserid = eswpfilModUserid;
	}

	public String getEswpfilUser1() {
		return this.eswpfilUser1;
	}

	public void setEswpfilUser1(String eswpfilUser1) {
		this.eswpfilUser1 = eswpfilUser1;
	}

	public String getEswpfilUser2() {
		return this.eswpfilUser2;
	}

	public void setEswpfilUser2(String eswpfilUser2) {
		this.eswpfilUser2 = eswpfilUser2;
	}

	public String getEswpfilQadc01() {
		return this.eswpfilQadc01;
	}

	public void setEswpfilQadc01(String eswpfilQadc01) {
		this.eswpfilQadc01 = eswpfilQadc01;
	}

	public String getEswpfilQadc02() {
		return this.eswpfilQadc02;
	}

	public void setEswpfilQadc02(String eswpfilQadc02) {
		this.eswpfilQadc02 = eswpfilQadc02;
	}

}