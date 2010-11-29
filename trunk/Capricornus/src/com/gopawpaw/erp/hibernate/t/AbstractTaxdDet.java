package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTaxdDet entity provides the base persistence definition of the
 * TaxdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaxdDet implements java.io.Serializable {

	// Fields

	private TaxdDetId id;
	private String taxdTaxamt;
	private String taxdNtaxamt;
	private Double taxdTotamt;
	private Double taxdTottax;
	private String taxdUser1;
	private String taxdUser2;
	private String taxdQad01;
	private String taxdQad02;
	private Boolean taxdQad03;
	private Double oidTaxdDet;

	// Constructors

	/** default constructor */
	public AbstractTaxdDet() {
	}

	/** minimal constructor */
	public AbstractTaxdDet(TaxdDetId id, Double oidTaxdDet) {
		this.id = id;
		this.oidTaxdDet = oidTaxdDet;
	}

	/** full constructor */
	public AbstractTaxdDet(TaxdDetId id, String taxdTaxamt, String taxdNtaxamt,
			Double taxdTotamt, Double taxdTottax, String taxdUser1,
			String taxdUser2, String taxdQad01, String taxdQad02,
			Boolean taxdQad03, Double oidTaxdDet) {
		this.id = id;
		this.taxdTaxamt = taxdTaxamt;
		this.taxdNtaxamt = taxdNtaxamt;
		this.taxdTotamt = taxdTotamt;
		this.taxdTottax = taxdTottax;
		this.taxdUser1 = taxdUser1;
		this.taxdUser2 = taxdUser2;
		this.taxdQad01 = taxdQad01;
		this.taxdQad02 = taxdQad02;
		this.taxdQad03 = taxdQad03;
		this.oidTaxdDet = oidTaxdDet;
	}

	// Property accessors

	public TaxdDetId getId() {
		return this.id;
	}

	public void setId(TaxdDetId id) {
		this.id = id;
	}

	public String getTaxdTaxamt() {
		return this.taxdTaxamt;
	}

	public void setTaxdTaxamt(String taxdTaxamt) {
		this.taxdTaxamt = taxdTaxamt;
	}

	public String getTaxdNtaxamt() {
		return this.taxdNtaxamt;
	}

	public void setTaxdNtaxamt(String taxdNtaxamt) {
		this.taxdNtaxamt = taxdNtaxamt;
	}

	public Double getTaxdTotamt() {
		return this.taxdTotamt;
	}

	public void setTaxdTotamt(Double taxdTotamt) {
		this.taxdTotamt = taxdTotamt;
	}

	public Double getTaxdTottax() {
		return this.taxdTottax;
	}

	public void setTaxdTottax(Double taxdTottax) {
		this.taxdTottax = taxdTottax;
	}

	public String getTaxdUser1() {
		return this.taxdUser1;
	}

	public void setTaxdUser1(String taxdUser1) {
		this.taxdUser1 = taxdUser1;
	}

	public String getTaxdUser2() {
		return this.taxdUser2;
	}

	public void setTaxdUser2(String taxdUser2) {
		this.taxdUser2 = taxdUser2;
	}

	public String getTaxdQad01() {
		return this.taxdQad01;
	}

	public void setTaxdQad01(String taxdQad01) {
		this.taxdQad01 = taxdQad01;
	}

	public String getTaxdQad02() {
		return this.taxdQad02;
	}

	public void setTaxdQad02(String taxdQad02) {
		this.taxdQad02 = taxdQad02;
	}

	public Boolean getTaxdQad03() {
		return this.taxdQad03;
	}

	public void setTaxdQad03(Boolean taxdQad03) {
		this.taxdQad03 = taxdQad03;
	}

	public Double getOidTaxdDet() {
		return this.oidTaxdDet;
	}

	public void setOidTaxdDet(Double oidTaxdDet) {
		this.oidTaxdDet = oidTaxdDet;
	}

}