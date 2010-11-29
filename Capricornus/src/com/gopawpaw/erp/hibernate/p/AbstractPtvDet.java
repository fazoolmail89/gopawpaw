package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtvDet entity provides the base persistence definition of the PtvDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtvDet implements java.io.Serializable {

	// Fields

	private PtvDetId id;
	private Double ptvStatValue;
	private String ptvQad01;
	private String ptvQad02;
	private String ptvUser1;
	private String ptvUser2;
	private Double ptvQad03;
	private Boolean ptvQad04;
	private Double ptvDec01;
	private Boolean ptvLog01;
	private String ptvChr01;
	private Double oidPtvDet;

	// Constructors

	/** default constructor */
	public AbstractPtvDet() {
	}

	/** minimal constructor */
	public AbstractPtvDet(PtvDetId id, Double ptvStatValue, Double oidPtvDet) {
		this.id = id;
		this.ptvStatValue = ptvStatValue;
		this.oidPtvDet = oidPtvDet;
	}

	/** full constructor */
	public AbstractPtvDet(PtvDetId id, Double ptvStatValue, String ptvQad01,
			String ptvQad02, String ptvUser1, String ptvUser2, Double ptvQad03,
			Boolean ptvQad04, Double ptvDec01, Boolean ptvLog01,
			String ptvChr01, Double oidPtvDet) {
		this.id = id;
		this.ptvStatValue = ptvStatValue;
		this.ptvQad01 = ptvQad01;
		this.ptvQad02 = ptvQad02;
		this.ptvUser1 = ptvUser1;
		this.ptvUser2 = ptvUser2;
		this.ptvQad03 = ptvQad03;
		this.ptvQad04 = ptvQad04;
		this.ptvDec01 = ptvDec01;
		this.ptvLog01 = ptvLog01;
		this.ptvChr01 = ptvChr01;
		this.oidPtvDet = oidPtvDet;
	}

	// Property accessors

	public PtvDetId getId() {
		return this.id;
	}

	public void setId(PtvDetId id) {
		this.id = id;
	}

	public Double getPtvStatValue() {
		return this.ptvStatValue;
	}

	public void setPtvStatValue(Double ptvStatValue) {
		this.ptvStatValue = ptvStatValue;
	}

	public String getPtvQad01() {
		return this.ptvQad01;
	}

	public void setPtvQad01(String ptvQad01) {
		this.ptvQad01 = ptvQad01;
	}

	public String getPtvQad02() {
		return this.ptvQad02;
	}

	public void setPtvQad02(String ptvQad02) {
		this.ptvQad02 = ptvQad02;
	}

	public String getPtvUser1() {
		return this.ptvUser1;
	}

	public void setPtvUser1(String ptvUser1) {
		this.ptvUser1 = ptvUser1;
	}

	public String getPtvUser2() {
		return this.ptvUser2;
	}

	public void setPtvUser2(String ptvUser2) {
		this.ptvUser2 = ptvUser2;
	}

	public Double getPtvQad03() {
		return this.ptvQad03;
	}

	public void setPtvQad03(Double ptvQad03) {
		this.ptvQad03 = ptvQad03;
	}

	public Boolean getPtvQad04() {
		return this.ptvQad04;
	}

	public void setPtvQad04(Boolean ptvQad04) {
		this.ptvQad04 = ptvQad04;
	}

	public Double getPtvDec01() {
		return this.ptvDec01;
	}

	public void setPtvDec01(Double ptvDec01) {
		this.ptvDec01 = ptvDec01;
	}

	public Boolean getPtvLog01() {
		return this.ptvLog01;
	}

	public void setPtvLog01(Boolean ptvLog01) {
		this.ptvLog01 = ptvLog01;
	}

	public String getPtvChr01() {
		return this.ptvChr01;
	}

	public void setPtvChr01(String ptvChr01) {
		this.ptvChr01 = ptvChr01;
	}

	public Double getOidPtvDet() {
		return this.oidPtvDet;
	}

	public void setOidPtvDet(Double oidPtvDet) {
		this.oidPtvDet = oidPtvDet;
	}

}