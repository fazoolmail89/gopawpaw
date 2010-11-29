package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcdDet entity provides the base persistence definition of the AcdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcdDet implements java.io.Serializable {

	// Fields

	private AcdDetId id;
	private Double acdAmt;
	private Double acdCurrAmt;
	private String acdUser1;
	private String acdUser2;
	private Double acdEcurAmt;
	private String acdQadc01;
	private Double acdDrAmt;
	private Double acdCrAmt;
	private Double acdCrCurrAmt;
	private Double acdDrCurrAmt;
	private Double oidAcdDet;

	// Constructors

	/** default constructor */
	public AbstractAcdDet() {
	}

	/** minimal constructor */
	public AbstractAcdDet(AcdDetId id, Double acdDrAmt, Double acdCrAmt,
			Double acdCrCurrAmt, Double acdDrCurrAmt, Double oidAcdDet) {
		this.id = id;
		this.acdDrAmt = acdDrAmt;
		this.acdCrAmt = acdCrAmt;
		this.acdCrCurrAmt = acdCrCurrAmt;
		this.acdDrCurrAmt = acdDrCurrAmt;
		this.oidAcdDet = oidAcdDet;
	}

	/** full constructor */
	public AbstractAcdDet(AcdDetId id, Double acdAmt, Double acdCurrAmt,
			String acdUser1, String acdUser2, Double acdEcurAmt,
			String acdQadc01, Double acdDrAmt, Double acdCrAmt,
			Double acdCrCurrAmt, Double acdDrCurrAmt, Double oidAcdDet) {
		this.id = id;
		this.acdAmt = acdAmt;
		this.acdCurrAmt = acdCurrAmt;
		this.acdUser1 = acdUser1;
		this.acdUser2 = acdUser2;
		this.acdEcurAmt = acdEcurAmt;
		this.acdQadc01 = acdQadc01;
		this.acdDrAmt = acdDrAmt;
		this.acdCrAmt = acdCrAmt;
		this.acdCrCurrAmt = acdCrCurrAmt;
		this.acdDrCurrAmt = acdDrCurrAmt;
		this.oidAcdDet = oidAcdDet;
	}

	// Property accessors

	public AcdDetId getId() {
		return this.id;
	}

	public void setId(AcdDetId id) {
		this.id = id;
	}

	public Double getAcdAmt() {
		return this.acdAmt;
	}

	public void setAcdAmt(Double acdAmt) {
		this.acdAmt = acdAmt;
	}

	public Double getAcdCurrAmt() {
		return this.acdCurrAmt;
	}

	public void setAcdCurrAmt(Double acdCurrAmt) {
		this.acdCurrAmt = acdCurrAmt;
	}

	public String getAcdUser1() {
		return this.acdUser1;
	}

	public void setAcdUser1(String acdUser1) {
		this.acdUser1 = acdUser1;
	}

	public String getAcdUser2() {
		return this.acdUser2;
	}

	public void setAcdUser2(String acdUser2) {
		this.acdUser2 = acdUser2;
	}

	public Double getAcdEcurAmt() {
		return this.acdEcurAmt;
	}

	public void setAcdEcurAmt(Double acdEcurAmt) {
		this.acdEcurAmt = acdEcurAmt;
	}

	public String getAcdQadc01() {
		return this.acdQadc01;
	}

	public void setAcdQadc01(String acdQadc01) {
		this.acdQadc01 = acdQadc01;
	}

	public Double getAcdDrAmt() {
		return this.acdDrAmt;
	}

	public void setAcdDrAmt(Double acdDrAmt) {
		this.acdDrAmt = acdDrAmt;
	}

	public Double getAcdCrAmt() {
		return this.acdCrAmt;
	}

	public void setAcdCrAmt(Double acdCrAmt) {
		this.acdCrAmt = acdCrAmt;
	}

	public Double getAcdCrCurrAmt() {
		return this.acdCrCurrAmt;
	}

	public void setAcdCrCurrAmt(Double acdCrCurrAmt) {
		this.acdCrCurrAmt = acdCrCurrAmt;
	}

	public Double getAcdDrCurrAmt() {
		return this.acdDrCurrAmt;
	}

	public void setAcdDrCurrAmt(Double acdDrCurrAmt) {
		this.acdDrCurrAmt = acdDrCurrAmt;
	}

	public Double getOidAcdDet() {
		return this.oidAcdDet;
	}

	public void setOidAcdDet(Double oidAcdDet) {
		this.oidAcdDet = oidAcdDet;
	}

}