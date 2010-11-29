package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPkDet entity provides the base persistence definition of the PkDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPkDet implements java.io.Serializable {

	// Fields

	private PkDetId id;
	private Double pkQty;
	private String pkLoc;
	private String pkLot;
	private String pkUser1;
	private String pkUser2;
	private String pkQadc01;
	private Double oidPkDet;

	// Constructors

	/** default constructor */
	public AbstractPkDet() {
	}

	/** minimal constructor */
	public AbstractPkDet(PkDetId id, Double oidPkDet) {
		this.id = id;
		this.oidPkDet = oidPkDet;
	}

	/** full constructor */
	public AbstractPkDet(PkDetId id, Double pkQty, String pkLoc, String pkLot,
			String pkUser1, String pkUser2, String pkQadc01, Double oidPkDet) {
		this.id = id;
		this.pkQty = pkQty;
		this.pkLoc = pkLoc;
		this.pkLot = pkLot;
		this.pkUser1 = pkUser1;
		this.pkUser2 = pkUser2;
		this.pkQadc01 = pkQadc01;
		this.oidPkDet = oidPkDet;
	}

	// Property accessors

	public PkDetId getId() {
		return this.id;
	}

	public void setId(PkDetId id) {
		this.id = id;
	}

	public Double getPkQty() {
		return this.pkQty;
	}

	public void setPkQty(Double pkQty) {
		this.pkQty = pkQty;
	}

	public String getPkLoc() {
		return this.pkLoc;
	}

	public void setPkLoc(String pkLoc) {
		this.pkLoc = pkLoc;
	}

	public String getPkLot() {
		return this.pkLot;
	}

	public void setPkLot(String pkLot) {
		this.pkLot = pkLot;
	}

	public String getPkUser1() {
		return this.pkUser1;
	}

	public void setPkUser1(String pkUser1) {
		this.pkUser1 = pkUser1;
	}

	public String getPkUser2() {
		return this.pkUser2;
	}

	public void setPkUser2(String pkUser2) {
		this.pkUser2 = pkUser2;
	}

	public String getPkQadc01() {
		return this.pkQadc01;
	}

	public void setPkQadc01(String pkQadc01) {
		this.pkQadc01 = pkQadc01;
	}

	public Double getOidPkDet() {
		return this.oidPkDet;
	}

	public void setOidPkDet(Double oidPkDet) {
		this.oidPkDet = oidPkDet;
	}

}