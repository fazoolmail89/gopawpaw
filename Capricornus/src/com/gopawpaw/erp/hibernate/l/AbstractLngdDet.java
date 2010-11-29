package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLngdDet entity provides the base persistence definition of the
 * LngdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLngdDet implements java.io.Serializable {

	// Fields

	private LngdDetId id;
	private String lngdTranslation;
	private String lngdUser1;
	private String lngdUser2;
	private String lngdDesc;
	private String lngdMnemonic;
	private String lngdTranslate2;
	private String lngdQadc01;
	private Double oidLngdDet;

	// Constructors

	/** default constructor */
	public AbstractLngdDet() {
	}

	/** minimal constructor */
	public AbstractLngdDet(LngdDetId id, Double oidLngdDet) {
		this.id = id;
		this.oidLngdDet = oidLngdDet;
	}

	/** full constructor */
	public AbstractLngdDet(LngdDetId id, String lngdTranslation,
			String lngdUser1, String lngdUser2, String lngdDesc,
			String lngdMnemonic, String lngdTranslate2, String lngdQadc01,
			Double oidLngdDet) {
		this.id = id;
		this.lngdTranslation = lngdTranslation;
		this.lngdUser1 = lngdUser1;
		this.lngdUser2 = lngdUser2;
		this.lngdDesc = lngdDesc;
		this.lngdMnemonic = lngdMnemonic;
		this.lngdTranslate2 = lngdTranslate2;
		this.lngdQadc01 = lngdQadc01;
		this.oidLngdDet = oidLngdDet;
	}

	// Property accessors

	public LngdDetId getId() {
		return this.id;
	}

	public void setId(LngdDetId id) {
		this.id = id;
	}

	public String getLngdTranslation() {
		return this.lngdTranslation;
	}

	public void setLngdTranslation(String lngdTranslation) {
		this.lngdTranslation = lngdTranslation;
	}

	public String getLngdUser1() {
		return this.lngdUser1;
	}

	public void setLngdUser1(String lngdUser1) {
		this.lngdUser1 = lngdUser1;
	}

	public String getLngdUser2() {
		return this.lngdUser2;
	}

	public void setLngdUser2(String lngdUser2) {
		this.lngdUser2 = lngdUser2;
	}

	public String getLngdDesc() {
		return this.lngdDesc;
	}

	public void setLngdDesc(String lngdDesc) {
		this.lngdDesc = lngdDesc;
	}

	public String getLngdMnemonic() {
		return this.lngdMnemonic;
	}

	public void setLngdMnemonic(String lngdMnemonic) {
		this.lngdMnemonic = lngdMnemonic;
	}

	public String getLngdTranslate2() {
		return this.lngdTranslate2;
	}

	public void setLngdTranslate2(String lngdTranslate2) {
		this.lngdTranslate2 = lngdTranslate2;
	}

	public String getLngdQadc01() {
		return this.lngdQadc01;
	}

	public void setLngdQadc01(String lngdQadc01) {
		this.lngdQadc01 = lngdQadc01;
	}

	public Double getOidLngdDet() {
		return this.oidLngdDet;
	}

	public void setOidLngdDet(Double oidLngdDet) {
		this.oidLngdDet = oidLngdDet;
	}

}