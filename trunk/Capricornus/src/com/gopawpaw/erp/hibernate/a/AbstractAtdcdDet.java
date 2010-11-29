package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtdcdDet entity provides the base persistence definition of the
 * AtdcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtdcdDet implements java.io.Serializable {

	// Fields

	private AtdcdDetId id;
	private Double oidAtdcdDet;
	private Double oidAtdcMstr;
	private Date atdcdEndDate;
	private Boolean atdcdUsed;
	private Date atdcdModDate;
	private String atdcdModUserid;
	private String atdcdUser1;
	private String atdcdUser2;
	private String atdcdQadc01;
	private String atdcdQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtdcdDet() {
	}

	/** minimal constructor */
	public AbstractAtdcdDet(AtdcdDetId id, Double oidAtdcdDet,
			Double oidAtdcMstr, Boolean atdcdUsed, Date atdcdModDate,
			String atdcdModUserid, String atdcdUser1, String atdcdUser2,
			String atdcdQadc01, String atdcdQadc02) {
		this.id = id;
		this.oidAtdcdDet = oidAtdcdDet;
		this.oidAtdcMstr = oidAtdcMstr;
		this.atdcdUsed = atdcdUsed;
		this.atdcdModDate = atdcdModDate;
		this.atdcdModUserid = atdcdModUserid;
		this.atdcdUser1 = atdcdUser1;
		this.atdcdUser2 = atdcdUser2;
		this.atdcdQadc01 = atdcdQadc01;
		this.atdcdQadc02 = atdcdQadc02;
	}

	/** full constructor */
	public AbstractAtdcdDet(AtdcdDetId id, Double oidAtdcdDet,
			Double oidAtdcMstr, Date atdcdEndDate, Boolean atdcdUsed,
			Date atdcdModDate, String atdcdModUserid, String atdcdUser1,
			String atdcdUser2, String atdcdQadc01, String atdcdQadc02) {
		this.id = id;
		this.oidAtdcdDet = oidAtdcdDet;
		this.oidAtdcMstr = oidAtdcMstr;
		this.atdcdEndDate = atdcdEndDate;
		this.atdcdUsed = atdcdUsed;
		this.atdcdModDate = atdcdModDate;
		this.atdcdModUserid = atdcdModUserid;
		this.atdcdUser1 = atdcdUser1;
		this.atdcdUser2 = atdcdUser2;
		this.atdcdQadc01 = atdcdQadc01;
		this.atdcdQadc02 = atdcdQadc02;
	}

	// Property accessors

	public AtdcdDetId getId() {
		return this.id;
	}

	public void setId(AtdcdDetId id) {
		this.id = id;
	}

	public Double getOidAtdcdDet() {
		return this.oidAtdcdDet;
	}

	public void setOidAtdcdDet(Double oidAtdcdDet) {
		this.oidAtdcdDet = oidAtdcdDet;
	}

	public Double getOidAtdcMstr() {
		return this.oidAtdcMstr;
	}

	public void setOidAtdcMstr(Double oidAtdcMstr) {
		this.oidAtdcMstr = oidAtdcMstr;
	}

	public Date getAtdcdEndDate() {
		return this.atdcdEndDate;
	}

	public void setAtdcdEndDate(Date atdcdEndDate) {
		this.atdcdEndDate = atdcdEndDate;
	}

	public Boolean getAtdcdUsed() {
		return this.atdcdUsed;
	}

	public void setAtdcdUsed(Boolean atdcdUsed) {
		this.atdcdUsed = atdcdUsed;
	}

	public Date getAtdcdModDate() {
		return this.atdcdModDate;
	}

	public void setAtdcdModDate(Date atdcdModDate) {
		this.atdcdModDate = atdcdModDate;
	}

	public String getAtdcdModUserid() {
		return this.atdcdModUserid;
	}

	public void setAtdcdModUserid(String atdcdModUserid) {
		this.atdcdModUserid = atdcdModUserid;
	}

	public String getAtdcdUser1() {
		return this.atdcdUser1;
	}

	public void setAtdcdUser1(String atdcdUser1) {
		this.atdcdUser1 = atdcdUser1;
	}

	public String getAtdcdUser2() {
		return this.atdcdUser2;
	}

	public void setAtdcdUser2(String atdcdUser2) {
		this.atdcdUser2 = atdcdUser2;
	}

	public String getAtdcdQadc01() {
		return this.atdcdQadc01;
	}

	public void setAtdcdQadc01(String atdcdQadc01) {
		this.atdcdQadc01 = atdcdQadc01;
	}

	public String getAtdcdQadc02() {
		return this.atdcdQadc02;
	}

	public void setAtdcdQadc02(String atdcdQadc02) {
		this.atdcdQadc02 = atdcdQadc02;
	}

}