package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBdldDet entity provides the base persistence definition of the
 * BdldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdldDet implements java.io.Serializable {

	// Fields

	private BdldDetId id;
	private String bdldData;
	private String bdldUser1;
	private String bdldUser2;
	private String bdldQadc01;
	private Double oidBdldDet;

	// Constructors

	/** default constructor */
	public AbstractBdldDet() {
	}

	/** minimal constructor */
	public AbstractBdldDet(BdldDetId id, Double oidBdldDet) {
		this.id = id;
		this.oidBdldDet = oidBdldDet;
	}

	/** full constructor */
	public AbstractBdldDet(BdldDetId id, String bdldData, String bdldUser1,
			String bdldUser2, String bdldQadc01, Double oidBdldDet) {
		this.id = id;
		this.bdldData = bdldData;
		this.bdldUser1 = bdldUser1;
		this.bdldUser2 = bdldUser2;
		this.bdldQadc01 = bdldQadc01;
		this.oidBdldDet = oidBdldDet;
	}

	// Property accessors

	public BdldDetId getId() {
		return this.id;
	}

	public void setId(BdldDetId id) {
		this.id = id;
	}

	public String getBdldData() {
		return this.bdldData;
	}

	public void setBdldData(String bdldData) {
		this.bdldData = bdldData;
	}

	public String getBdldUser1() {
		return this.bdldUser1;
	}

	public void setBdldUser1(String bdldUser1) {
		this.bdldUser1 = bdldUser1;
	}

	public String getBdldUser2() {
		return this.bdldUser2;
	}

	public void setBdldUser2(String bdldUser2) {
		this.bdldUser2 = bdldUser2;
	}

	public String getBdldQadc01() {
		return this.bdldQadc01;
	}

	public void setBdldQadc01(String bdldQadc01) {
		this.bdldQadc01 = bdldQadc01;
	}

	public Double getOidBdldDet() {
		return this.oidBdldDet;
	}

	public void setOidBdldDet(Double oidBdldDet) {
		this.oidBdldDet = oidBdldDet;
	}

}