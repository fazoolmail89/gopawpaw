package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgcdDet entity provides the base persistence definition of the
 * SgcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgcdDet implements java.io.Serializable {

	// Fields

	private SgcdDetId id;
	private String sgcdCarrier;
	private String sgcdUser1;
	private String sgcdUser2;
	private String sgcdQadc01;
	private Double oidSgcdDet;

	// Constructors

	/** default constructor */
	public AbstractSgcdDet() {
	}

	/** minimal constructor */
	public AbstractSgcdDet(SgcdDetId id, String sgcdCarrier, Double oidSgcdDet) {
		this.id = id;
		this.sgcdCarrier = sgcdCarrier;
		this.oidSgcdDet = oidSgcdDet;
	}

	/** full constructor */
	public AbstractSgcdDet(SgcdDetId id, String sgcdCarrier, String sgcdUser1,
			String sgcdUser2, String sgcdQadc01, Double oidSgcdDet) {
		this.id = id;
		this.sgcdCarrier = sgcdCarrier;
		this.sgcdUser1 = sgcdUser1;
		this.sgcdUser2 = sgcdUser2;
		this.sgcdQadc01 = sgcdQadc01;
		this.oidSgcdDet = oidSgcdDet;
	}

	// Property accessors

	public SgcdDetId getId() {
		return this.id;
	}

	public void setId(SgcdDetId id) {
		this.id = id;
	}

	public String getSgcdCarrier() {
		return this.sgcdCarrier;
	}

	public void setSgcdCarrier(String sgcdCarrier) {
		this.sgcdCarrier = sgcdCarrier;
	}

	public String getSgcdUser1() {
		return this.sgcdUser1;
	}

	public void setSgcdUser1(String sgcdUser1) {
		this.sgcdUser1 = sgcdUser1;
	}

	public String getSgcdUser2() {
		return this.sgcdUser2;
	}

	public void setSgcdUser2(String sgcdUser2) {
		this.sgcdUser2 = sgcdUser2;
	}

	public String getSgcdQadc01() {
		return this.sgcdQadc01;
	}

	public void setSgcdQadc01(String sgcdQadc01) {
		this.sgcdQadc01 = sgcdQadc01;
	}

	public Double getOidSgcdDet() {
		return this.oidSgcdDet;
	}

	public void setOidSgcdDet(Double oidSgcdDet) {
		this.oidSgcdDet = oidSgcdDet;
	}

}