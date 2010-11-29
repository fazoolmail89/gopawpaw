package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMaxtDet entity provides the base persistence definition of the
 * MaxtDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaxtDet implements java.io.Serializable {

	// Fields

	private MaxtDetId id;
	private Double maxtAmt;
	private Boolean maxtQad01;
	private String maxtQad02;
	private String maxtQad03;
	private String maxtUser1;
	private String maxtUser2;
	private Double oidMaxtDet;

	// Constructors

	/** default constructor */
	public AbstractMaxtDet() {
	}

	/** minimal constructor */
	public AbstractMaxtDet(MaxtDetId id, Double oidMaxtDet) {
		this.id = id;
		this.oidMaxtDet = oidMaxtDet;
	}

	/** full constructor */
	public AbstractMaxtDet(MaxtDetId id, Double maxtAmt, Boolean maxtQad01,
			String maxtQad02, String maxtQad03, String maxtUser1,
			String maxtUser2, Double oidMaxtDet) {
		this.id = id;
		this.maxtAmt = maxtAmt;
		this.maxtQad01 = maxtQad01;
		this.maxtQad02 = maxtQad02;
		this.maxtQad03 = maxtQad03;
		this.maxtUser1 = maxtUser1;
		this.maxtUser2 = maxtUser2;
		this.oidMaxtDet = oidMaxtDet;
	}

	// Property accessors

	public MaxtDetId getId() {
		return this.id;
	}

	public void setId(MaxtDetId id) {
		this.id = id;
	}

	public Double getMaxtAmt() {
		return this.maxtAmt;
	}

	public void setMaxtAmt(Double maxtAmt) {
		this.maxtAmt = maxtAmt;
	}

	public Boolean getMaxtQad01() {
		return this.maxtQad01;
	}

	public void setMaxtQad01(Boolean maxtQad01) {
		this.maxtQad01 = maxtQad01;
	}

	public String getMaxtQad02() {
		return this.maxtQad02;
	}

	public void setMaxtQad02(String maxtQad02) {
		this.maxtQad02 = maxtQad02;
	}

	public String getMaxtQad03() {
		return this.maxtQad03;
	}

	public void setMaxtQad03(String maxtQad03) {
		this.maxtQad03 = maxtQad03;
	}

	public String getMaxtUser1() {
		return this.maxtUser1;
	}

	public void setMaxtUser1(String maxtUser1) {
		this.maxtUser1 = maxtUser1;
	}

	public String getMaxtUser2() {
		return this.maxtUser2;
	}

	public void setMaxtUser2(String maxtUser2) {
		this.maxtUser2 = maxtUser2;
	}

	public Double getOidMaxtDet() {
		return this.oidMaxtDet;
	}

	public void setOidMaxtDet(Double oidMaxtDet) {
		this.oidMaxtDet = oidMaxtDet;
	}

}