package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFcDet entity provides the base persistence definition of the FcDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcDet implements java.io.Serializable {

	// Fields

	private FcDetId id;
	private String fcRef;
	private Double fcQty;
	private Date fcEnd;
	private String fcUser1;
	private String fcUser2;
	private String fcQadc01;
	private Double oidFcDet;

	// Constructors

	/** default constructor */
	public AbstractFcDet() {
	}

	/** minimal constructor */
	public AbstractFcDet(FcDetId id, Double oidFcDet) {
		this.id = id;
		this.oidFcDet = oidFcDet;
	}

	/** full constructor */
	public AbstractFcDet(FcDetId id, String fcRef, Double fcQty, Date fcEnd,
			String fcUser1, String fcUser2, String fcQadc01, Double oidFcDet) {
		this.id = id;
		this.fcRef = fcRef;
		this.fcQty = fcQty;
		this.fcEnd = fcEnd;
		this.fcUser1 = fcUser1;
		this.fcUser2 = fcUser2;
		this.fcQadc01 = fcQadc01;
		this.oidFcDet = oidFcDet;
	}

	// Property accessors

	public FcDetId getId() {
		return this.id;
	}

	public void setId(FcDetId id) {
		this.id = id;
	}

	public String getFcRef() {
		return this.fcRef;
	}

	public void setFcRef(String fcRef) {
		this.fcRef = fcRef;
	}

	public Double getFcQty() {
		return this.fcQty;
	}

	public void setFcQty(Double fcQty) {
		this.fcQty = fcQty;
	}

	public Date getFcEnd() {
		return this.fcEnd;
	}

	public void setFcEnd(Date fcEnd) {
		this.fcEnd = fcEnd;
	}

	public String getFcUser1() {
		return this.fcUser1;
	}

	public void setFcUser1(String fcUser1) {
		this.fcUser1 = fcUser1;
	}

	public String getFcUser2() {
		return this.fcUser2;
	}

	public void setFcUser2(String fcUser2) {
		this.fcUser2 = fcUser2;
	}

	public String getFcQadc01() {
		return this.fcQadc01;
	}

	public void setFcQadc01(String fcQadc01) {
		this.fcQadc01 = fcQadc01;
	}

	public Double getOidFcDet() {
		return this.oidFcDet;
	}

	public void setOidFcDet(Double oidFcDet) {
		this.oidFcDet = oidFcDet;
	}

}