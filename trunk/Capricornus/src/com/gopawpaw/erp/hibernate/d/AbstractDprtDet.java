package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDprtDet entity provides the base persistence definition of the
 * DprtDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDprtDet implements java.io.Serializable {

	// Fields

	private DprtDetId id;
	private Double dprtAmt;
	private Double dprtPercent;
	private Boolean dprtQad01;
	private String dprtQad02;
	private String dprtQad03;
	private String dprtUser1;
	private String dprtUser2;
	private Double oidDprtDet;

	// Constructors

	/** default constructor */
	public AbstractDprtDet() {
	}

	/** minimal constructor */
	public AbstractDprtDet(DprtDetId id, Double oidDprtDet) {
		this.id = id;
		this.oidDprtDet = oidDprtDet;
	}

	/** full constructor */
	public AbstractDprtDet(DprtDetId id, Double dprtAmt, Double dprtPercent,
			Boolean dprtQad01, String dprtQad02, String dprtQad03,
			String dprtUser1, String dprtUser2, Double oidDprtDet) {
		this.id = id;
		this.dprtAmt = dprtAmt;
		this.dprtPercent = dprtPercent;
		this.dprtQad01 = dprtQad01;
		this.dprtQad02 = dprtQad02;
		this.dprtQad03 = dprtQad03;
		this.dprtUser1 = dprtUser1;
		this.dprtUser2 = dprtUser2;
		this.oidDprtDet = oidDprtDet;
	}

	// Property accessors

	public DprtDetId getId() {
		return this.id;
	}

	public void setId(DprtDetId id) {
		this.id = id;
	}

	public Double getDprtAmt() {
		return this.dprtAmt;
	}

	public void setDprtAmt(Double dprtAmt) {
		this.dprtAmt = dprtAmt;
	}

	public Double getDprtPercent() {
		return this.dprtPercent;
	}

	public void setDprtPercent(Double dprtPercent) {
		this.dprtPercent = dprtPercent;
	}

	public Boolean getDprtQad01() {
		return this.dprtQad01;
	}

	public void setDprtQad01(Boolean dprtQad01) {
		this.dprtQad01 = dprtQad01;
	}

	public String getDprtQad02() {
		return this.dprtQad02;
	}

	public void setDprtQad02(String dprtQad02) {
		this.dprtQad02 = dprtQad02;
	}

	public String getDprtQad03() {
		return this.dprtQad03;
	}

	public void setDprtQad03(String dprtQad03) {
		this.dprtQad03 = dprtQad03;
	}

	public String getDprtUser1() {
		return this.dprtUser1;
	}

	public void setDprtUser1(String dprtUser1) {
		this.dprtUser1 = dprtUser1;
	}

	public String getDprtUser2() {
		return this.dprtUser2;
	}

	public void setDprtUser2(String dprtUser2) {
		this.dprtUser2 = dprtUser2;
	}

	public Double getOidDprtDet() {
		return this.oidDprtDet;
	}

	public void setOidDprtDet(Double oidDprtDet) {
		this.oidDprtDet = oidDprtDet;
	}

}