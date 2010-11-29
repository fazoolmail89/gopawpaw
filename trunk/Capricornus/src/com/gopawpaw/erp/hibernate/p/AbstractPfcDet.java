package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPfcDet entity provides the base persistence definition of the PfcDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPfcDet implements java.io.Serializable {

	// Fields

	private PfcDetId id;
	private Double pfcQty;
	private Integer pfcIdNum;
	private String pfcUser1;
	private String pfcUser2;
	private String pfcQadc01;
	private Double oidPfcDet;

	// Constructors

	/** default constructor */
	public AbstractPfcDet() {
	}

	/** minimal constructor */
	public AbstractPfcDet(PfcDetId id, Double oidPfcDet) {
		this.id = id;
		this.oidPfcDet = oidPfcDet;
	}

	/** full constructor */
	public AbstractPfcDet(PfcDetId id, Double pfcQty, Integer pfcIdNum,
			String pfcUser1, String pfcUser2, String pfcQadc01, Double oidPfcDet) {
		this.id = id;
		this.pfcQty = pfcQty;
		this.pfcIdNum = pfcIdNum;
		this.pfcUser1 = pfcUser1;
		this.pfcUser2 = pfcUser2;
		this.pfcQadc01 = pfcQadc01;
		this.oidPfcDet = oidPfcDet;
	}

	// Property accessors

	public PfcDetId getId() {
		return this.id;
	}

	public void setId(PfcDetId id) {
		this.id = id;
	}

	public Double getPfcQty() {
		return this.pfcQty;
	}

	public void setPfcQty(Double pfcQty) {
		this.pfcQty = pfcQty;
	}

	public Integer getPfcIdNum() {
		return this.pfcIdNum;
	}

	public void setPfcIdNum(Integer pfcIdNum) {
		this.pfcIdNum = pfcIdNum;
	}

	public String getPfcUser1() {
		return this.pfcUser1;
	}

	public void setPfcUser1(String pfcUser1) {
		this.pfcUser1 = pfcUser1;
	}

	public String getPfcUser2() {
		return this.pfcUser2;
	}

	public void setPfcUser2(String pfcUser2) {
		this.pfcUser2 = pfcUser2;
	}

	public String getPfcQadc01() {
		return this.pfcQadc01;
	}

	public void setPfcQadc01(String pfcQadc01) {
		this.pfcQadc01 = pfcQadc01;
	}

	public Double getOidPfcDet() {
		return this.oidPfcDet;
	}

	public void setOidPfcDet(Double oidPfcDet) {
		this.oidPfcDet = oidPfcDet;
	}

}