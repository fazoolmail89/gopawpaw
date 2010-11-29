package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCssiDet entity provides the base persistence definition of the
 * CssiDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCssiDet implements java.io.Serializable {

	// Fields

	private CssiDetId id;
	private String cssiCur;
	private String cssiUser1;
	private String cssiUser2;
	private String cssiUserid;
	private Date cssiModDate;
	private String cssiQadc01;
	private Double oidCssiDet;

	// Constructors

	/** default constructor */
	public AbstractCssiDet() {
	}

	/** minimal constructor */
	public AbstractCssiDet(CssiDetId id, Double oidCssiDet) {
		this.id = id;
		this.oidCssiDet = oidCssiDet;
	}

	/** full constructor */
	public AbstractCssiDet(CssiDetId id, String cssiCur, String cssiUser1,
			String cssiUser2, String cssiUserid, Date cssiModDate,
			String cssiQadc01, Double oidCssiDet) {
		this.id = id;
		this.cssiCur = cssiCur;
		this.cssiUser1 = cssiUser1;
		this.cssiUser2 = cssiUser2;
		this.cssiUserid = cssiUserid;
		this.cssiModDate = cssiModDate;
		this.cssiQadc01 = cssiQadc01;
		this.oidCssiDet = oidCssiDet;
	}

	// Property accessors

	public CssiDetId getId() {
		return this.id;
	}

	public void setId(CssiDetId id) {
		this.id = id;
	}

	public String getCssiCur() {
		return this.cssiCur;
	}

	public void setCssiCur(String cssiCur) {
		this.cssiCur = cssiCur;
	}

	public String getCssiUser1() {
		return this.cssiUser1;
	}

	public void setCssiUser1(String cssiUser1) {
		this.cssiUser1 = cssiUser1;
	}

	public String getCssiUser2() {
		return this.cssiUser2;
	}

	public void setCssiUser2(String cssiUser2) {
		this.cssiUser2 = cssiUser2;
	}

	public String getCssiUserid() {
		return this.cssiUserid;
	}

	public void setCssiUserid(String cssiUserid) {
		this.cssiUserid = cssiUserid;
	}

	public Date getCssiModDate() {
		return this.cssiModDate;
	}

	public void setCssiModDate(Date cssiModDate) {
		this.cssiModDate = cssiModDate;
	}

	public String getCssiQadc01() {
		return this.cssiQadc01;
	}

	public void setCssiQadc01(String cssiQadc01) {
		this.cssiQadc01 = cssiQadc01;
	}

	public Double getOidCssiDet() {
		return this.oidCssiDet;
	}

	public void setOidCssiDet(Double oidCssiDet) {
		this.oidCssiDet = oidCssiDet;
	}

}