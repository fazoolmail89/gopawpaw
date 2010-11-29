package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTaxMstr entity provides the base persistence definition of the
 * TaxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaxMstr implements java.io.Serializable {

	// Fields

	private TaxMstrId id;
	private String taxTaxPct;
	private String taxAcct;
	private String taxCc;
	private Boolean taxTrl;
	private String taxUser1;
	private String taxUser2;
	private Double taxMax;
	private String taxUserid;
	private Date taxModDate;
	private String taxQad01;
	private String taxQad02;
	private Boolean taxQad03;
	private Double oidTaxMstr;

	// Constructors

	/** default constructor */
	public AbstractTaxMstr() {
	}

	/** minimal constructor */
	public AbstractTaxMstr(TaxMstrId id, Double oidTaxMstr) {
		this.id = id;
		this.oidTaxMstr = oidTaxMstr;
	}

	/** full constructor */
	public AbstractTaxMstr(TaxMstrId id, String taxTaxPct, String taxAcct,
			String taxCc, Boolean taxTrl, String taxUser1, String taxUser2,
			Double taxMax, String taxUserid, Date taxModDate, String taxQad01,
			String taxQad02, Boolean taxQad03, Double oidTaxMstr) {
		this.id = id;
		this.taxTaxPct = taxTaxPct;
		this.taxAcct = taxAcct;
		this.taxCc = taxCc;
		this.taxTrl = taxTrl;
		this.taxUser1 = taxUser1;
		this.taxUser2 = taxUser2;
		this.taxMax = taxMax;
		this.taxUserid = taxUserid;
		this.taxModDate = taxModDate;
		this.taxQad01 = taxQad01;
		this.taxQad02 = taxQad02;
		this.taxQad03 = taxQad03;
		this.oidTaxMstr = oidTaxMstr;
	}

	// Property accessors

	public TaxMstrId getId() {
		return this.id;
	}

	public void setId(TaxMstrId id) {
		this.id = id;
	}

	public String getTaxTaxPct() {
		return this.taxTaxPct;
	}

	public void setTaxTaxPct(String taxTaxPct) {
		this.taxTaxPct = taxTaxPct;
	}

	public String getTaxAcct() {
		return this.taxAcct;
	}

	public void setTaxAcct(String taxAcct) {
		this.taxAcct = taxAcct;
	}

	public String getTaxCc() {
		return this.taxCc;
	}

	public void setTaxCc(String taxCc) {
		this.taxCc = taxCc;
	}

	public Boolean getTaxTrl() {
		return this.taxTrl;
	}

	public void setTaxTrl(Boolean taxTrl) {
		this.taxTrl = taxTrl;
	}

	public String getTaxUser1() {
		return this.taxUser1;
	}

	public void setTaxUser1(String taxUser1) {
		this.taxUser1 = taxUser1;
	}

	public String getTaxUser2() {
		return this.taxUser2;
	}

	public void setTaxUser2(String taxUser2) {
		this.taxUser2 = taxUser2;
	}

	public Double getTaxMax() {
		return this.taxMax;
	}

	public void setTaxMax(Double taxMax) {
		this.taxMax = taxMax;
	}

	public String getTaxUserid() {
		return this.taxUserid;
	}

	public void setTaxUserid(String taxUserid) {
		this.taxUserid = taxUserid;
	}

	public Date getTaxModDate() {
		return this.taxModDate;
	}

	public void setTaxModDate(Date taxModDate) {
		this.taxModDate = taxModDate;
	}

	public String getTaxQad01() {
		return this.taxQad01;
	}

	public void setTaxQad01(String taxQad01) {
		this.taxQad01 = taxQad01;
	}

	public String getTaxQad02() {
		return this.taxQad02;
	}

	public void setTaxQad02(String taxQad02) {
		this.taxQad02 = taxQad02;
	}

	public Boolean getTaxQad03() {
		return this.taxQad03;
	}

	public void setTaxQad03(Boolean taxQad03) {
		this.taxQad03 = taxQad03;
	}

	public Double getOidTaxMstr() {
		return this.oidTaxMstr;
	}

	public void setOidTaxMstr(Double oidTaxMstr) {
		this.oidTaxMstr = oidTaxMstr;
	}

}