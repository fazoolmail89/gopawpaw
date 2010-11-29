package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIsdDet entity provides the base persistence definition of the IsdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsdDet implements java.io.Serializable {

	// Fields

	private IsdDetId id;
	private String isdUser1;
	private String isdUser2;
	private Boolean isdBdlAllowed;
	private String isdQadc01;
	private Double oidIsdDet;

	// Constructors

	/** default constructor */
	public AbstractIsdDet() {
	}

	/** minimal constructor */
	public AbstractIsdDet(IsdDetId id, Boolean isdBdlAllowed, Double oidIsdDet) {
		this.id = id;
		this.isdBdlAllowed = isdBdlAllowed;
		this.oidIsdDet = oidIsdDet;
	}

	/** full constructor */
	public AbstractIsdDet(IsdDetId id, String isdUser1, String isdUser2,
			Boolean isdBdlAllowed, String isdQadc01, Double oidIsdDet) {
		this.id = id;
		this.isdUser1 = isdUser1;
		this.isdUser2 = isdUser2;
		this.isdBdlAllowed = isdBdlAllowed;
		this.isdQadc01 = isdQadc01;
		this.oidIsdDet = oidIsdDet;
	}

	// Property accessors

	public IsdDetId getId() {
		return this.id;
	}

	public void setId(IsdDetId id) {
		this.id = id;
	}

	public String getIsdUser1() {
		return this.isdUser1;
	}

	public void setIsdUser1(String isdUser1) {
		this.isdUser1 = isdUser1;
	}

	public String getIsdUser2() {
		return this.isdUser2;
	}

	public void setIsdUser2(String isdUser2) {
		this.isdUser2 = isdUser2;
	}

	public Boolean getIsdBdlAllowed() {
		return this.isdBdlAllowed;
	}

	public void setIsdBdlAllowed(Boolean isdBdlAllowed) {
		this.isdBdlAllowed = isdBdlAllowed;
	}

	public String getIsdQadc01() {
		return this.isdQadc01;
	}

	public void setIsdQadc01(String isdQadc01) {
		this.isdQadc01 = isdQadc01;
	}

	public Double getOidIsdDet() {
		return this.oidIsdDet;
	}

	public void setOidIsdDet(Double oidIsdDet) {
		this.oidIsdDet = oidIsdDet;
	}

}