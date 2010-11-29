package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbsrDet entity provides the base persistence definition of the
 * AbsrDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsrDet implements java.io.Serializable {

	// Fields

	private AbsrDetId id;
	private Double absrQty;
	private String absrShipId;
	private Boolean absrCnfrmd;
	private String absrUser1;
	private String absrUser2;
	private String absrQadc01;
	private Double oidAbsrDet;

	// Constructors

	/** default constructor */
	public AbstractAbsrDet() {
	}

	/** minimal constructor */
	public AbstractAbsrDet(AbsrDetId id, Double oidAbsrDet) {
		this.id = id;
		this.oidAbsrDet = oidAbsrDet;
	}

	/** full constructor */
	public AbstractAbsrDet(AbsrDetId id, Double absrQty, String absrShipId,
			Boolean absrCnfrmd, String absrUser1, String absrUser2,
			String absrQadc01, Double oidAbsrDet) {
		this.id = id;
		this.absrQty = absrQty;
		this.absrShipId = absrShipId;
		this.absrCnfrmd = absrCnfrmd;
		this.absrUser1 = absrUser1;
		this.absrUser2 = absrUser2;
		this.absrQadc01 = absrQadc01;
		this.oidAbsrDet = oidAbsrDet;
	}

	// Property accessors

	public AbsrDetId getId() {
		return this.id;
	}

	public void setId(AbsrDetId id) {
		this.id = id;
	}

	public Double getAbsrQty() {
		return this.absrQty;
	}

	public void setAbsrQty(Double absrQty) {
		this.absrQty = absrQty;
	}

	public String getAbsrShipId() {
		return this.absrShipId;
	}

	public void setAbsrShipId(String absrShipId) {
		this.absrShipId = absrShipId;
	}

	public Boolean getAbsrCnfrmd() {
		return this.absrCnfrmd;
	}

	public void setAbsrCnfrmd(Boolean absrCnfrmd) {
		this.absrCnfrmd = absrCnfrmd;
	}

	public String getAbsrUser1() {
		return this.absrUser1;
	}

	public void setAbsrUser1(String absrUser1) {
		this.absrUser1 = absrUser1;
	}

	public String getAbsrUser2() {
		return this.absrUser2;
	}

	public void setAbsrUser2(String absrUser2) {
		this.absrUser2 = absrUser2;
	}

	public String getAbsrQadc01() {
		return this.absrQadc01;
	}

	public void setAbsrQadc01(String absrQadc01) {
		this.absrQadc01 = absrQadc01;
	}

	public Double getOidAbsrDet() {
		return this.oidAbsrDet;
	}

	public void setOidAbsrDet(Double oidAbsrDet) {
		this.oidAbsrDet = oidAbsrDet;
	}

}