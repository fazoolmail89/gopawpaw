package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTrldDet entity provides the base persistence definition of the
 * TrldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrldDet implements java.io.Serializable {

	// Fields

	private TrldDetId id;
	private Boolean trldTaxable;
	private String trldTaxc;
	private String trldUser1;
	private String trldUser2;
	private String trldChr01;
	private Boolean trldLog01;
	private String trldQad01;
	private String trldQad02;
	private Double trldQad03;
	private Date trldQad04;
	private Boolean trldQad05;
	private Double oidTrldDet;

	// Constructors

	/** default constructor */
	public AbstractTrldDet() {
	}

	/** minimal constructor */
	public AbstractTrldDet(TrldDetId id, Double oidTrldDet) {
		this.id = id;
		this.oidTrldDet = oidTrldDet;
	}

	/** full constructor */
	public AbstractTrldDet(TrldDetId id, Boolean trldTaxable, String trldTaxc,
			String trldUser1, String trldUser2, String trldChr01,
			Boolean trldLog01, String trldQad01, String trldQad02,
			Double trldQad03, Date trldQad04, Boolean trldQad05,
			Double oidTrldDet) {
		this.id = id;
		this.trldTaxable = trldTaxable;
		this.trldTaxc = trldTaxc;
		this.trldUser1 = trldUser1;
		this.trldUser2 = trldUser2;
		this.trldChr01 = trldChr01;
		this.trldLog01 = trldLog01;
		this.trldQad01 = trldQad01;
		this.trldQad02 = trldQad02;
		this.trldQad03 = trldQad03;
		this.trldQad04 = trldQad04;
		this.trldQad05 = trldQad05;
		this.oidTrldDet = oidTrldDet;
	}

	// Property accessors

	public TrldDetId getId() {
		return this.id;
	}

	public void setId(TrldDetId id) {
		this.id = id;
	}

	public Boolean getTrldTaxable() {
		return this.trldTaxable;
	}

	public void setTrldTaxable(Boolean trldTaxable) {
		this.trldTaxable = trldTaxable;
	}

	public String getTrldTaxc() {
		return this.trldTaxc;
	}

	public void setTrldTaxc(String trldTaxc) {
		this.trldTaxc = trldTaxc;
	}

	public String getTrldUser1() {
		return this.trldUser1;
	}

	public void setTrldUser1(String trldUser1) {
		this.trldUser1 = trldUser1;
	}

	public String getTrldUser2() {
		return this.trldUser2;
	}

	public void setTrldUser2(String trldUser2) {
		this.trldUser2 = trldUser2;
	}

	public String getTrldChr01() {
		return this.trldChr01;
	}

	public void setTrldChr01(String trldChr01) {
		this.trldChr01 = trldChr01;
	}

	public Boolean getTrldLog01() {
		return this.trldLog01;
	}

	public void setTrldLog01(Boolean trldLog01) {
		this.trldLog01 = trldLog01;
	}

	public String getTrldQad01() {
		return this.trldQad01;
	}

	public void setTrldQad01(String trldQad01) {
		this.trldQad01 = trldQad01;
	}

	public String getTrldQad02() {
		return this.trldQad02;
	}

	public void setTrldQad02(String trldQad02) {
		this.trldQad02 = trldQad02;
	}

	public Double getTrldQad03() {
		return this.trldQad03;
	}

	public void setTrldQad03(Double trldQad03) {
		this.trldQad03 = trldQad03;
	}

	public Date getTrldQad04() {
		return this.trldQad04;
	}

	public void setTrldQad04(Date trldQad04) {
		this.trldQad04 = trldQad04;
	}

	public Boolean getTrldQad05() {
		return this.trldQad05;
	}

	public void setTrldQad05(Boolean trldQad05) {
		this.trldQad05 = trldQad05;
	}

	public Double getOidTrldDet() {
		return this.oidTrldDet;
	}

	public void setOidTrldDet(Double oidTrldDet) {
		this.oidTrldDet = oidTrldDet;
	}

}