package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTotdDet entity provides the base persistence definition of the
 * TotdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTotdDet implements java.io.Serializable {

	// Fields

	private TotdDetId id;
	private String totdResponsibility;
	private String totdModUserid;
	private Date totdModDate;
	private String totdUser1;
	private String totdUser2;
	private String totdQadc01;
	private String totdQadc02;
	private Double oidTotdDet;

	// Constructors

	/** default constructor */
	public AbstractTotdDet() {
	}

	/** full constructor */
	public AbstractTotdDet(TotdDetId id, String totdResponsibility,
			String totdModUserid, Date totdModDate, String totdUser1,
			String totdUser2, String totdQadc01, String totdQadc02,
			Double oidTotdDet) {
		this.id = id;
		this.totdResponsibility = totdResponsibility;
		this.totdModUserid = totdModUserid;
		this.totdModDate = totdModDate;
		this.totdUser1 = totdUser1;
		this.totdUser2 = totdUser2;
		this.totdQadc01 = totdQadc01;
		this.totdQadc02 = totdQadc02;
		this.oidTotdDet = oidTotdDet;
	}

	// Property accessors

	public TotdDetId getId() {
		return this.id;
	}

	public void setId(TotdDetId id) {
		this.id = id;
	}

	public String getTotdResponsibility() {
		return this.totdResponsibility;
	}

	public void setTotdResponsibility(String totdResponsibility) {
		this.totdResponsibility = totdResponsibility;
	}

	public String getTotdModUserid() {
		return this.totdModUserid;
	}

	public void setTotdModUserid(String totdModUserid) {
		this.totdModUserid = totdModUserid;
	}

	public Date getTotdModDate() {
		return this.totdModDate;
	}

	public void setTotdModDate(Date totdModDate) {
		this.totdModDate = totdModDate;
	}

	public String getTotdUser1() {
		return this.totdUser1;
	}

	public void setTotdUser1(String totdUser1) {
		this.totdUser1 = totdUser1;
	}

	public String getTotdUser2() {
		return this.totdUser2;
	}

	public void setTotdUser2(String totdUser2) {
		this.totdUser2 = totdUser2;
	}

	public String getTotdQadc01() {
		return this.totdQadc01;
	}

	public void setTotdQadc01(String totdQadc01) {
		this.totdQadc01 = totdQadc01;
	}

	public String getTotdQadc02() {
		return this.totdQadc02;
	}

	public void setTotdQadc02(String totdQadc02) {
		this.totdQadc02 = totdQadc02;
	}

	public Double getOidTotdDet() {
		return this.oidTotdDet;
	}

	public void setOidTotdDet(Double oidTotdDet) {
		this.oidTotdDet = oidTotdDet;
	}

}