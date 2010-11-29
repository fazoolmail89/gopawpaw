package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrbgDet entity provides the base persistence definition of the
 * GrbgDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrbgDet implements java.io.Serializable {

	// Fields

	private GrbgDetId id;
	private Double grbgAmt;
	private String grbgUser1;
	private String grbgUser2;
	private Double grbgYtdBal;
	private Double grbgPerBal;
	private Double grbgBegBal;
	private String grbgQadc01;
	private Double oidGrbgDet;

	// Constructors

	/** default constructor */
	public AbstractGrbgDet() {
	}

	/** minimal constructor */
	public AbstractGrbgDet(GrbgDetId id, Double oidGrbgDet) {
		this.id = id;
		this.oidGrbgDet = oidGrbgDet;
	}

	/** full constructor */
	public AbstractGrbgDet(GrbgDetId id, Double grbgAmt, String grbgUser1,
			String grbgUser2, Double grbgYtdBal, Double grbgPerBal,
			Double grbgBegBal, String grbgQadc01, Double oidGrbgDet) {
		this.id = id;
		this.grbgAmt = grbgAmt;
		this.grbgUser1 = grbgUser1;
		this.grbgUser2 = grbgUser2;
		this.grbgYtdBal = grbgYtdBal;
		this.grbgPerBal = grbgPerBal;
		this.grbgBegBal = grbgBegBal;
		this.grbgQadc01 = grbgQadc01;
		this.oidGrbgDet = oidGrbgDet;
	}

	// Property accessors

	public GrbgDetId getId() {
		return this.id;
	}

	public void setId(GrbgDetId id) {
		this.id = id;
	}

	public Double getGrbgAmt() {
		return this.grbgAmt;
	}

	public void setGrbgAmt(Double grbgAmt) {
		this.grbgAmt = grbgAmt;
	}

	public String getGrbgUser1() {
		return this.grbgUser1;
	}

	public void setGrbgUser1(String grbgUser1) {
		this.grbgUser1 = grbgUser1;
	}

	public String getGrbgUser2() {
		return this.grbgUser2;
	}

	public void setGrbgUser2(String grbgUser2) {
		this.grbgUser2 = grbgUser2;
	}

	public Double getGrbgYtdBal() {
		return this.grbgYtdBal;
	}

	public void setGrbgYtdBal(Double grbgYtdBal) {
		this.grbgYtdBal = grbgYtdBal;
	}

	public Double getGrbgPerBal() {
		return this.grbgPerBal;
	}

	public void setGrbgPerBal(Double grbgPerBal) {
		this.grbgPerBal = grbgPerBal;
	}

	public Double getGrbgBegBal() {
		return this.grbgBegBal;
	}

	public void setGrbgBegBal(Double grbgBegBal) {
		this.grbgBegBal = grbgBegBal;
	}

	public String getGrbgQadc01() {
		return this.grbgQadc01;
	}

	public void setGrbgQadc01(String grbgQadc01) {
		this.grbgQadc01 = grbgQadc01;
	}

	public Double getOidGrbgDet() {
		return this.oidGrbgDet;
	}

	public void setOidGrbgDet(Double oidGrbgDet) {
		this.oidGrbgDet = oidGrbgDet;
	}

}