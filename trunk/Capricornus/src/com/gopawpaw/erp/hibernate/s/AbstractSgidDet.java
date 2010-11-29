package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgidDet entity provides the base persistence definition of the
 * SgidDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgidDet implements java.io.Serializable {

	// Fields

	private SgidDetId id;
	private String sgidPreshipNrId;
	private String sgidShipNrId;
	private String sgidFormat;
	private String sgidQadc02;
	private String sgidUser1;
	private String sgidUser2;
	private String sgidQadc01;
	private Boolean sgidDefault;
	private Double oidSgidDet;

	// Constructors

	/** default constructor */
	public AbstractSgidDet() {
	}

	/** minimal constructor */
	public AbstractSgidDet(SgidDetId id, String sgidPreshipNrId,
			String sgidShipNrId, String sgidFormat, Double oidSgidDet) {
		this.id = id;
		this.sgidPreshipNrId = sgidPreshipNrId;
		this.sgidShipNrId = sgidShipNrId;
		this.sgidFormat = sgidFormat;
		this.oidSgidDet = oidSgidDet;
	}

	/** full constructor */
	public AbstractSgidDet(SgidDetId id, String sgidPreshipNrId,
			String sgidShipNrId, String sgidFormat, String sgidQadc02,
			String sgidUser1, String sgidUser2, String sgidQadc01,
			Boolean sgidDefault, Double oidSgidDet) {
		this.id = id;
		this.sgidPreshipNrId = sgidPreshipNrId;
		this.sgidShipNrId = sgidShipNrId;
		this.sgidFormat = sgidFormat;
		this.sgidQadc02 = sgidQadc02;
		this.sgidUser1 = sgidUser1;
		this.sgidUser2 = sgidUser2;
		this.sgidQadc01 = sgidQadc01;
		this.sgidDefault = sgidDefault;
		this.oidSgidDet = oidSgidDet;
	}

	// Property accessors

	public SgidDetId getId() {
		return this.id;
	}

	public void setId(SgidDetId id) {
		this.id = id;
	}

	public String getSgidPreshipNrId() {
		return this.sgidPreshipNrId;
	}

	public void setSgidPreshipNrId(String sgidPreshipNrId) {
		this.sgidPreshipNrId = sgidPreshipNrId;
	}

	public String getSgidShipNrId() {
		return this.sgidShipNrId;
	}

	public void setSgidShipNrId(String sgidShipNrId) {
		this.sgidShipNrId = sgidShipNrId;
	}

	public String getSgidFormat() {
		return this.sgidFormat;
	}

	public void setSgidFormat(String sgidFormat) {
		this.sgidFormat = sgidFormat;
	}

	public String getSgidQadc02() {
		return this.sgidQadc02;
	}

	public void setSgidQadc02(String sgidQadc02) {
		this.sgidQadc02 = sgidQadc02;
	}

	public String getSgidUser1() {
		return this.sgidUser1;
	}

	public void setSgidUser1(String sgidUser1) {
		this.sgidUser1 = sgidUser1;
	}

	public String getSgidUser2() {
		return this.sgidUser2;
	}

	public void setSgidUser2(String sgidUser2) {
		this.sgidUser2 = sgidUser2;
	}

	public String getSgidQadc01() {
		return this.sgidQadc01;
	}

	public void setSgidQadc01(String sgidQadc01) {
		this.sgidQadc01 = sgidQadc01;
	}

	public Boolean getSgidDefault() {
		return this.sgidDefault;
	}

	public void setSgidDefault(Boolean sgidDefault) {
		this.sgidDefault = sgidDefault;
	}

	public Double getOidSgidDet() {
		return this.oidSgidDet;
	}

	public void setOidSgidDet(Double oidSgidDet) {
		this.oidSgidDet = oidSgidDet;
	}

}