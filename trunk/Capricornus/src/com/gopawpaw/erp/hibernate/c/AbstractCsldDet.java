package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsldDet entity provides the base persistence definition of the
 * CsldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsldDet implements java.io.Serializable {

	// Fields

	private CsldDetId id;
	private Double csldMaxAmt;
	private Integer csldMaxQty;
	private Double csldTotAmt;
	private Integer csldTotQty;
	private String csldCurr;
	private Integer csldCmtindx;
	private String csldUser1;
	private String csldUser2;
	private String csldQadc01;
	private Double oidCsldDet;

	// Constructors

	/** default constructor */
	public AbstractCsldDet() {
	}

	/** minimal constructor */
	public AbstractCsldDet(CsldDetId id, Double oidCsldDet) {
		this.id = id;
		this.oidCsldDet = oidCsldDet;
	}

	/** full constructor */
	public AbstractCsldDet(CsldDetId id, Double csldMaxAmt, Integer csldMaxQty,
			Double csldTotAmt, Integer csldTotQty, String csldCurr,
			Integer csldCmtindx, String csldUser1, String csldUser2,
			String csldQadc01, Double oidCsldDet) {
		this.id = id;
		this.csldMaxAmt = csldMaxAmt;
		this.csldMaxQty = csldMaxQty;
		this.csldTotAmt = csldTotAmt;
		this.csldTotQty = csldTotQty;
		this.csldCurr = csldCurr;
		this.csldCmtindx = csldCmtindx;
		this.csldUser1 = csldUser1;
		this.csldUser2 = csldUser2;
		this.csldQadc01 = csldQadc01;
		this.oidCsldDet = oidCsldDet;
	}

	// Property accessors

	public CsldDetId getId() {
		return this.id;
	}

	public void setId(CsldDetId id) {
		this.id = id;
	}

	public Double getCsldMaxAmt() {
		return this.csldMaxAmt;
	}

	public void setCsldMaxAmt(Double csldMaxAmt) {
		this.csldMaxAmt = csldMaxAmt;
	}

	public Integer getCsldMaxQty() {
		return this.csldMaxQty;
	}

	public void setCsldMaxQty(Integer csldMaxQty) {
		this.csldMaxQty = csldMaxQty;
	}

	public Double getCsldTotAmt() {
		return this.csldTotAmt;
	}

	public void setCsldTotAmt(Double csldTotAmt) {
		this.csldTotAmt = csldTotAmt;
	}

	public Integer getCsldTotQty() {
		return this.csldTotQty;
	}

	public void setCsldTotQty(Integer csldTotQty) {
		this.csldTotQty = csldTotQty;
	}

	public String getCsldCurr() {
		return this.csldCurr;
	}

	public void setCsldCurr(String csldCurr) {
		this.csldCurr = csldCurr;
	}

	public Integer getCsldCmtindx() {
		return this.csldCmtindx;
	}

	public void setCsldCmtindx(Integer csldCmtindx) {
		this.csldCmtindx = csldCmtindx;
	}

	public String getCsldUser1() {
		return this.csldUser1;
	}

	public void setCsldUser1(String csldUser1) {
		this.csldUser1 = csldUser1;
	}

	public String getCsldUser2() {
		return this.csldUser2;
	}

	public void setCsldUser2(String csldUser2) {
		this.csldUser2 = csldUser2;
	}

	public String getCsldQadc01() {
		return this.csldQadc01;
	}

	public void setCsldQadc01(String csldQadc01) {
		this.csldQadc01 = csldQadc01;
	}

	public Double getOidCsldDet() {
		return this.oidCsldDet;
	}

	public void setOidCsldDet(Double oidCsldDet) {
		this.oidCsldDet = oidCsldDet;
	}

}