package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShdDet entity provides the base persistence definition of the ShdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShdDet implements java.io.Serializable {

	// Fields

	private ShdDetId id;
	private String shdUser1;
	private String shdUser2;
	private String shdQadc01;
	private Double oidShdDet;

	// Constructors

	/** default constructor */
	public AbstractShdDet() {
	}

	/** minimal constructor */
	public AbstractShdDet(ShdDetId id, Double oidShdDet) {
		this.id = id;
		this.oidShdDet = oidShdDet;
	}

	/** full constructor */
	public AbstractShdDet(ShdDetId id, String shdUser1, String shdUser2,
			String shdQadc01, Double oidShdDet) {
		this.id = id;
		this.shdUser1 = shdUser1;
		this.shdUser2 = shdUser2;
		this.shdQadc01 = shdQadc01;
		this.oidShdDet = oidShdDet;
	}

	// Property accessors

	public ShdDetId getId() {
		return this.id;
	}

	public void setId(ShdDetId id) {
		this.id = id;
	}

	public String getShdUser1() {
		return this.shdUser1;
	}

	public void setShdUser1(String shdUser1) {
		this.shdUser1 = shdUser1;
	}

	public String getShdUser2() {
		return this.shdUser2;
	}

	public void setShdUser2(String shdUser2) {
		this.shdUser2 = shdUser2;
	}

	public String getShdQadc01() {
		return this.shdQadc01;
	}

	public void setShdQadc01(String shdQadc01) {
		this.shdQadc01 = shdQadc01;
	}

	public Double getOidShdDet() {
		return this.oidShdDet;
	}

	public void setOidShdDet(Double oidShdDet) {
		this.oidShdDet = oidShdDet;
	}

}