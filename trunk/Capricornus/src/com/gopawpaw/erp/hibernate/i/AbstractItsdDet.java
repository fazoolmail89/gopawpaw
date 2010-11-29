package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractItsdDet entity provides the base persistence definition of the
 * ItsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItsdDet implements java.io.Serializable {

	// Fields

	private ItsdDetId id;
	private Double itsdQty;
	private String itsdUser1;
	private String itsdUser2;
	private String itsdRef;
	private Boolean itsdLoaded;
	private String itsdQadc01;
	private Double oidItsdDet;

	// Constructors

	/** default constructor */
	public AbstractItsdDet() {
	}

	/** minimal constructor */
	public AbstractItsdDet(ItsdDetId id, Double oidItsdDet) {
		this.id = id;
		this.oidItsdDet = oidItsdDet;
	}

	/** full constructor */
	public AbstractItsdDet(ItsdDetId id, Double itsdQty, String itsdUser1,
			String itsdUser2, String itsdRef, Boolean itsdLoaded,
			String itsdQadc01, Double oidItsdDet) {
		this.id = id;
		this.itsdQty = itsdQty;
		this.itsdUser1 = itsdUser1;
		this.itsdUser2 = itsdUser2;
		this.itsdRef = itsdRef;
		this.itsdLoaded = itsdLoaded;
		this.itsdQadc01 = itsdQadc01;
		this.oidItsdDet = oidItsdDet;
	}

	// Property accessors

	public ItsdDetId getId() {
		return this.id;
	}

	public void setId(ItsdDetId id) {
		this.id = id;
	}

	public Double getItsdQty() {
		return this.itsdQty;
	}

	public void setItsdQty(Double itsdQty) {
		this.itsdQty = itsdQty;
	}

	public String getItsdUser1() {
		return this.itsdUser1;
	}

	public void setItsdUser1(String itsdUser1) {
		this.itsdUser1 = itsdUser1;
	}

	public String getItsdUser2() {
		return this.itsdUser2;
	}

	public void setItsdUser2(String itsdUser2) {
		this.itsdUser2 = itsdUser2;
	}

	public String getItsdRef() {
		return this.itsdRef;
	}

	public void setItsdRef(String itsdRef) {
		this.itsdRef = itsdRef;
	}

	public Boolean getItsdLoaded() {
		return this.itsdLoaded;
	}

	public void setItsdLoaded(Boolean itsdLoaded) {
		this.itsdLoaded = itsdLoaded;
	}

	public String getItsdQadc01() {
		return this.itsdQadc01;
	}

	public void setItsdQadc01(String itsdQadc01) {
		this.itsdQadc01 = itsdQadc01;
	}

	public Double getOidItsdDet() {
		return this.oidItsdDet;
	}

	public void setOidItsdDet(Double oidItsdDet) {
		this.oidItsdDet = oidItsdDet;
	}

}