package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtwkDet entity provides the base persistence definition of the
 * AtwkDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtwkDet implements java.io.Serializable {

	// Fields

	private AtwkDetId id;
	private Double oidAtwkDet;
	private String atwkKeyType;
	private Date atwkModDate;
	private String atwkModUserid;
	private String atwkUser1;
	private String atwkUser2;
	private String atwkQadc01;
	private String atwkQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtwkDet() {
	}

	/** full constructor */
	public AbstractAtwkDet(AtwkDetId id, Double oidAtwkDet, String atwkKeyType,
			Date atwkModDate, String atwkModUserid, String atwkUser1,
			String atwkUser2, String atwkQadc01, String atwkQadc02) {
		this.id = id;
		this.oidAtwkDet = oidAtwkDet;
		this.atwkKeyType = atwkKeyType;
		this.atwkModDate = atwkModDate;
		this.atwkModUserid = atwkModUserid;
		this.atwkUser1 = atwkUser1;
		this.atwkUser2 = atwkUser2;
		this.atwkQadc01 = atwkQadc01;
		this.atwkQadc02 = atwkQadc02;
	}

	// Property accessors

	public AtwkDetId getId() {
		return this.id;
	}

	public void setId(AtwkDetId id) {
		this.id = id;
	}

	public Double getOidAtwkDet() {
		return this.oidAtwkDet;
	}

	public void setOidAtwkDet(Double oidAtwkDet) {
		this.oidAtwkDet = oidAtwkDet;
	}

	public String getAtwkKeyType() {
		return this.atwkKeyType;
	}

	public void setAtwkKeyType(String atwkKeyType) {
		this.atwkKeyType = atwkKeyType;
	}

	public Date getAtwkModDate() {
		return this.atwkModDate;
	}

	public void setAtwkModDate(Date atwkModDate) {
		this.atwkModDate = atwkModDate;
	}

	public String getAtwkModUserid() {
		return this.atwkModUserid;
	}

	public void setAtwkModUserid(String atwkModUserid) {
		this.atwkModUserid = atwkModUserid;
	}

	public String getAtwkUser1() {
		return this.atwkUser1;
	}

	public void setAtwkUser1(String atwkUser1) {
		this.atwkUser1 = atwkUser1;
	}

	public String getAtwkUser2() {
		return this.atwkUser2;
	}

	public void setAtwkUser2(String atwkUser2) {
		this.atwkUser2 = atwkUser2;
	}

	public String getAtwkQadc01() {
		return this.atwkQadc01;
	}

	public void setAtwkQadc01(String atwkQadc01) {
		this.atwkQadc01 = atwkQadc01;
	}

	public String getAtwkQadc02() {
		return this.atwkQadc02;
	}

	public void setAtwkQadc02(String atwkQadc02) {
		this.atwkQadc02 = atwkQadc02;
	}

}