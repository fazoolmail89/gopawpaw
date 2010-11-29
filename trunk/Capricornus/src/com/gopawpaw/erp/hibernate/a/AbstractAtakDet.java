package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtakDet entity provides the base persistence definition of the
 * AtakDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtakDet implements java.io.Serializable {

	// Fields

	private AtakDetId id;
	private Double oidAtakDet;
	private String atakKeyType;
	private Date atakModDate;
	private String atakModUserid;
	private String atakUser1;
	private String atakUser2;
	private String atakQadc01;
	private String atakQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtakDet() {
	}

	/** full constructor */
	public AbstractAtakDet(AtakDetId id, Double oidAtakDet, String atakKeyType,
			Date atakModDate, String atakModUserid, String atakUser1,
			String atakUser2, String atakQadc01, String atakQadc02) {
		this.id = id;
		this.oidAtakDet = oidAtakDet;
		this.atakKeyType = atakKeyType;
		this.atakModDate = atakModDate;
		this.atakModUserid = atakModUserid;
		this.atakUser1 = atakUser1;
		this.atakUser2 = atakUser2;
		this.atakQadc01 = atakQadc01;
		this.atakQadc02 = atakQadc02;
	}

	// Property accessors

	public AtakDetId getId() {
		return this.id;
	}

	public void setId(AtakDetId id) {
		this.id = id;
	}

	public Double getOidAtakDet() {
		return this.oidAtakDet;
	}

	public void setOidAtakDet(Double oidAtakDet) {
		this.oidAtakDet = oidAtakDet;
	}

	public String getAtakKeyType() {
		return this.atakKeyType;
	}

	public void setAtakKeyType(String atakKeyType) {
		this.atakKeyType = atakKeyType;
	}

	public Date getAtakModDate() {
		return this.atakModDate;
	}

	public void setAtakModDate(Date atakModDate) {
		this.atakModDate = atakModDate;
	}

	public String getAtakModUserid() {
		return this.atakModUserid;
	}

	public void setAtakModUserid(String atakModUserid) {
		this.atakModUserid = atakModUserid;
	}

	public String getAtakUser1() {
		return this.atakUser1;
	}

	public void setAtakUser1(String atakUser1) {
		this.atakUser1 = atakUser1;
	}

	public String getAtakUser2() {
		return this.atakUser2;
	}

	public void setAtakUser2(String atakUser2) {
		this.atakUser2 = atakUser2;
	}

	public String getAtakQadc01() {
		return this.atakQadc01;
	}

	public void setAtakQadc01(String atakQadc01) {
		this.atakQadc01 = atakQadc01;
	}

	public String getAtakQadc02() {
		return this.atakQadc02;
	}

	public void setAtakQadc02(String atakQadc02) {
		this.atakQadc02 = atakQadc02;
	}

}