package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGlctDet entity provides the base persistence definition of the
 * GlctDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlctDet implements java.io.Serializable {

	// Fields

	private GlctDetId id;
	private Double glctBaseAmt;
	private Double glctCurrAmt;
	private Date glctModDate;
	private String glctModUserid;
	private String glctUser1;
	private String glctUser2;
	private String glctQadc01;
	private String glctQadc02;
	private Double oidGlctDet;

	// Constructors

	/** default constructor */
	public AbstractGlctDet() {
	}

	/** minimal constructor */
	public AbstractGlctDet(GlctDetId id, Date glctModDate,
			String glctModUserid, String glctUser1, String glctUser2,
			String glctQadc01, String glctQadc02, Double oidGlctDet) {
		this.id = id;
		this.glctModDate = glctModDate;
		this.glctModUserid = glctModUserid;
		this.glctUser1 = glctUser1;
		this.glctUser2 = glctUser2;
		this.glctQadc01 = glctQadc01;
		this.glctQadc02 = glctQadc02;
		this.oidGlctDet = oidGlctDet;
	}

	/** full constructor */
	public AbstractGlctDet(GlctDetId id, Double glctBaseAmt,
			Double glctCurrAmt, Date glctModDate, String glctModUserid,
			String glctUser1, String glctUser2, String glctQadc01,
			String glctQadc02, Double oidGlctDet) {
		this.id = id;
		this.glctBaseAmt = glctBaseAmt;
		this.glctCurrAmt = glctCurrAmt;
		this.glctModDate = glctModDate;
		this.glctModUserid = glctModUserid;
		this.glctUser1 = glctUser1;
		this.glctUser2 = glctUser2;
		this.glctQadc01 = glctQadc01;
		this.glctQadc02 = glctQadc02;
		this.oidGlctDet = oidGlctDet;
	}

	// Property accessors

	public GlctDetId getId() {
		return this.id;
	}

	public void setId(GlctDetId id) {
		this.id = id;
	}

	public Double getGlctBaseAmt() {
		return this.glctBaseAmt;
	}

	public void setGlctBaseAmt(Double glctBaseAmt) {
		this.glctBaseAmt = glctBaseAmt;
	}

	public Double getGlctCurrAmt() {
		return this.glctCurrAmt;
	}

	public void setGlctCurrAmt(Double glctCurrAmt) {
		this.glctCurrAmt = glctCurrAmt;
	}

	public Date getGlctModDate() {
		return this.glctModDate;
	}

	public void setGlctModDate(Date glctModDate) {
		this.glctModDate = glctModDate;
	}

	public String getGlctModUserid() {
		return this.glctModUserid;
	}

	public void setGlctModUserid(String glctModUserid) {
		this.glctModUserid = glctModUserid;
	}

	public String getGlctUser1() {
		return this.glctUser1;
	}

	public void setGlctUser1(String glctUser1) {
		this.glctUser1 = glctUser1;
	}

	public String getGlctUser2() {
		return this.glctUser2;
	}

	public void setGlctUser2(String glctUser2) {
		this.glctUser2 = glctUser2;
	}

	public String getGlctQadc01() {
		return this.glctQadc01;
	}

	public void setGlctQadc01(String glctQadc01) {
		this.glctQadc01 = glctQadc01;
	}

	public String getGlctQadc02() {
		return this.glctQadc02;
	}

	public void setGlctQadc02(String glctQadc02) {
		this.glctQadc02 = glctQadc02;
	}

	public Double getOidGlctDet() {
		return this.oidGlctDet;
	}

	public void setOidGlctDet(Double oidGlctDet) {
		this.oidGlctDet = oidGlctDet;
	}

}