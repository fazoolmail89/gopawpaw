package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAldDet entity provides the base persistence definition of the AldDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAldDet implements java.io.Serializable {

	// Fields

	private AldDetId id;
	private Double aldPct;
	private String aldUser1;
	private String aldUser2;
	private String aldQad02;
	private Date aldQad01;
	private Double oidAldDet;

	// Constructors

	/** default constructor */
	public AbstractAldDet() {
	}

	/** minimal constructor */
	public AbstractAldDet(AldDetId id, Double oidAldDet) {
		this.id = id;
		this.oidAldDet = oidAldDet;
	}

	/** full constructor */
	public AbstractAldDet(AldDetId id, Double aldPct, String aldUser1,
			String aldUser2, String aldQad02, Date aldQad01, Double oidAldDet) {
		this.id = id;
		this.aldPct = aldPct;
		this.aldUser1 = aldUser1;
		this.aldUser2 = aldUser2;
		this.aldQad02 = aldQad02;
		this.aldQad01 = aldQad01;
		this.oidAldDet = oidAldDet;
	}

	// Property accessors

	public AldDetId getId() {
		return this.id;
	}

	public void setId(AldDetId id) {
		this.id = id;
	}

	public Double getAldPct() {
		return this.aldPct;
	}

	public void setAldPct(Double aldPct) {
		this.aldPct = aldPct;
	}

	public String getAldUser1() {
		return this.aldUser1;
	}

	public void setAldUser1(String aldUser1) {
		this.aldUser1 = aldUser1;
	}

	public String getAldUser2() {
		return this.aldUser2;
	}

	public void setAldUser2(String aldUser2) {
		this.aldUser2 = aldUser2;
	}

	public String getAldQad02() {
		return this.aldQad02;
	}

	public void setAldQad02(String aldQad02) {
		this.aldQad02 = aldQad02;
	}

	public Date getAldQad01() {
		return this.aldQad01;
	}

	public void setAldQad01(Date aldQad01) {
		this.aldQad01 = aldQad01;
	}

	public Double getOidAldDet() {
		return this.oidAldDet;
	}

	public void setOidAldDet(Double oidAldDet) {
		this.oidAldDet = oidAldDet;
	}

}