package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgadDet entity provides the base persistence definition of the
 * SgadDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgadDet implements java.io.Serializable {

	// Fields

	private SgadDetId id;
	private String sgadConsShip;
	private String sgadUser1;
	private String sgadUser2;
	private String sgadQadc01;
	private Double oidSgadDet;

	// Constructors

	/** default constructor */
	public AbstractSgadDet() {
	}

	/** minimal constructor */
	public AbstractSgadDet(SgadDetId id, String sgadConsShip, Double oidSgadDet) {
		this.id = id;
		this.sgadConsShip = sgadConsShip;
		this.oidSgadDet = oidSgadDet;
	}

	/** full constructor */
	public AbstractSgadDet(SgadDetId id, String sgadConsShip, String sgadUser1,
			String sgadUser2, String sgadQadc01, Double oidSgadDet) {
		this.id = id;
		this.sgadConsShip = sgadConsShip;
		this.sgadUser1 = sgadUser1;
		this.sgadUser2 = sgadUser2;
		this.sgadQadc01 = sgadQadc01;
		this.oidSgadDet = oidSgadDet;
	}

	// Property accessors

	public SgadDetId getId() {
		return this.id;
	}

	public void setId(SgadDetId id) {
		this.id = id;
	}

	public String getSgadConsShip() {
		return this.sgadConsShip;
	}

	public void setSgadConsShip(String sgadConsShip) {
		this.sgadConsShip = sgadConsShip;
	}

	public String getSgadUser1() {
		return this.sgadUser1;
	}

	public void setSgadUser1(String sgadUser1) {
		this.sgadUser1 = sgadUser1;
	}

	public String getSgadUser2() {
		return this.sgadUser2;
	}

	public void setSgadUser2(String sgadUser2) {
		this.sgadUser2 = sgadUser2;
	}

	public String getSgadQadc01() {
		return this.sgadQadc01;
	}

	public void setSgadQadc01(String sgadQadc01) {
		this.sgadQadc01 = sgadQadc01;
	}

	public Double getOidSgadDet() {
		return this.oidSgadDet;
	}

	public void setOidSgadDet(Double oidSgadDet) {
		this.oidSgadDet = oidSgadDet;
	}

}