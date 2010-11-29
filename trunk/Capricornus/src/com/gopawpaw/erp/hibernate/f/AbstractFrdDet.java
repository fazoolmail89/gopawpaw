package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFrdDet entity provides the base persistence definition of the FrdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrdDet implements java.io.Serializable {

	// Fields

	private FrdDetId id;
	private Double frdRate;
	private String frdUser1;
	private String frdUser2;
	private String frdQadc01;
	private Double oidFrdDet;

	// Constructors

	/** default constructor */
	public AbstractFrdDet() {
	}

	/** minimal constructor */
	public AbstractFrdDet(FrdDetId id, Double oidFrdDet) {
		this.id = id;
		this.oidFrdDet = oidFrdDet;
	}

	/** full constructor */
	public AbstractFrdDet(FrdDetId id, Double frdRate, String frdUser1,
			String frdUser2, String frdQadc01, Double oidFrdDet) {
		this.id = id;
		this.frdRate = frdRate;
		this.frdUser1 = frdUser1;
		this.frdUser2 = frdUser2;
		this.frdQadc01 = frdQadc01;
		this.oidFrdDet = oidFrdDet;
	}

	// Property accessors

	public FrdDetId getId() {
		return this.id;
	}

	public void setId(FrdDetId id) {
		this.id = id;
	}

	public Double getFrdRate() {
		return this.frdRate;
	}

	public void setFrdRate(Double frdRate) {
		this.frdRate = frdRate;
	}

	public String getFrdUser1() {
		return this.frdUser1;
	}

	public void setFrdUser1(String frdUser1) {
		this.frdUser1 = frdUser1;
	}

	public String getFrdUser2() {
		return this.frdUser2;
	}

	public void setFrdUser2(String frdUser2) {
		this.frdUser2 = frdUser2;
	}

	public String getFrdQadc01() {
		return this.frdQadc01;
	}

	public void setFrdQadc01(String frdQadc01) {
		this.frdQadc01 = frdQadc01;
	}

	public Double getOidFrdDet() {
		return this.oidFrdDet;
	}

	public void setOidFrdDet(Double oidFrdDet) {
		this.oidFrdDet = oidFrdDet;
	}

}