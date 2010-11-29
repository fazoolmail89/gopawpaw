package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSwcDet entity provides the base persistence definition of the SwcDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSwcDet implements java.io.Serializable {

	// Fields

	private SwcDetId id;
	private Double swcSetRate;
	private Double swcRunRate;
	private String swcCat;
	private String swcUser1;
	private String swcUser2;
	private Double swcBdnPct;
	private Double swcMchWkctr;
	private Integer swcMchOp;
	private Double swcMenMch;
	private Double swcLbrRate;
	private Double swcBdnRate;
	private Double swcMchBdn;
	private Double swcPctUtil;
	private Double swcPctEff;
	private Double swcSetupMen;
	private Double swcSetupRte;
	private Double swcBdnSurate;
	private Double swcBdnSupct;
	private Double swcMchSubdn;
	private Date swcModDate;
	private String swcUserid;
	private String swcQadc01;
	private Double oidSwcDet;

	// Constructors

	/** default constructor */
	public AbstractSwcDet() {
	}

	/** minimal constructor */
	public AbstractSwcDet(SwcDetId id, Double oidSwcDet) {
		this.id = id;
		this.oidSwcDet = oidSwcDet;
	}

	/** full constructor */
	public AbstractSwcDet(SwcDetId id, Double swcSetRate, Double swcRunRate,
			String swcCat, String swcUser1, String swcUser2, Double swcBdnPct,
			Double swcMchWkctr, Integer swcMchOp, Double swcMenMch,
			Double swcLbrRate, Double swcBdnRate, Double swcMchBdn,
			Double swcPctUtil, Double swcPctEff, Double swcSetupMen,
			Double swcSetupRte, Double swcBdnSurate, Double swcBdnSupct,
			Double swcMchSubdn, Date swcModDate, String swcUserid,
			String swcQadc01, Double oidSwcDet) {
		this.id = id;
		this.swcSetRate = swcSetRate;
		this.swcRunRate = swcRunRate;
		this.swcCat = swcCat;
		this.swcUser1 = swcUser1;
		this.swcUser2 = swcUser2;
		this.swcBdnPct = swcBdnPct;
		this.swcMchWkctr = swcMchWkctr;
		this.swcMchOp = swcMchOp;
		this.swcMenMch = swcMenMch;
		this.swcLbrRate = swcLbrRate;
		this.swcBdnRate = swcBdnRate;
		this.swcMchBdn = swcMchBdn;
		this.swcPctUtil = swcPctUtil;
		this.swcPctEff = swcPctEff;
		this.swcSetupMen = swcSetupMen;
		this.swcSetupRte = swcSetupRte;
		this.swcBdnSurate = swcBdnSurate;
		this.swcBdnSupct = swcBdnSupct;
		this.swcMchSubdn = swcMchSubdn;
		this.swcModDate = swcModDate;
		this.swcUserid = swcUserid;
		this.swcQadc01 = swcQadc01;
		this.oidSwcDet = oidSwcDet;
	}

	// Property accessors

	public SwcDetId getId() {
		return this.id;
	}

	public void setId(SwcDetId id) {
		this.id = id;
	}

	public Double getSwcSetRate() {
		return this.swcSetRate;
	}

	public void setSwcSetRate(Double swcSetRate) {
		this.swcSetRate = swcSetRate;
	}

	public Double getSwcRunRate() {
		return this.swcRunRate;
	}

	public void setSwcRunRate(Double swcRunRate) {
		this.swcRunRate = swcRunRate;
	}

	public String getSwcCat() {
		return this.swcCat;
	}

	public void setSwcCat(String swcCat) {
		this.swcCat = swcCat;
	}

	public String getSwcUser1() {
		return this.swcUser1;
	}

	public void setSwcUser1(String swcUser1) {
		this.swcUser1 = swcUser1;
	}

	public String getSwcUser2() {
		return this.swcUser2;
	}

	public void setSwcUser2(String swcUser2) {
		this.swcUser2 = swcUser2;
	}

	public Double getSwcBdnPct() {
		return this.swcBdnPct;
	}

	public void setSwcBdnPct(Double swcBdnPct) {
		this.swcBdnPct = swcBdnPct;
	}

	public Double getSwcMchWkctr() {
		return this.swcMchWkctr;
	}

	public void setSwcMchWkctr(Double swcMchWkctr) {
		this.swcMchWkctr = swcMchWkctr;
	}

	public Integer getSwcMchOp() {
		return this.swcMchOp;
	}

	public void setSwcMchOp(Integer swcMchOp) {
		this.swcMchOp = swcMchOp;
	}

	public Double getSwcMenMch() {
		return this.swcMenMch;
	}

	public void setSwcMenMch(Double swcMenMch) {
		this.swcMenMch = swcMenMch;
	}

	public Double getSwcLbrRate() {
		return this.swcLbrRate;
	}

	public void setSwcLbrRate(Double swcLbrRate) {
		this.swcLbrRate = swcLbrRate;
	}

	public Double getSwcBdnRate() {
		return this.swcBdnRate;
	}

	public void setSwcBdnRate(Double swcBdnRate) {
		this.swcBdnRate = swcBdnRate;
	}

	public Double getSwcMchBdn() {
		return this.swcMchBdn;
	}

	public void setSwcMchBdn(Double swcMchBdn) {
		this.swcMchBdn = swcMchBdn;
	}

	public Double getSwcPctUtil() {
		return this.swcPctUtil;
	}

	public void setSwcPctUtil(Double swcPctUtil) {
		this.swcPctUtil = swcPctUtil;
	}

	public Double getSwcPctEff() {
		return this.swcPctEff;
	}

	public void setSwcPctEff(Double swcPctEff) {
		this.swcPctEff = swcPctEff;
	}

	public Double getSwcSetupMen() {
		return this.swcSetupMen;
	}

	public void setSwcSetupMen(Double swcSetupMen) {
		this.swcSetupMen = swcSetupMen;
	}

	public Double getSwcSetupRte() {
		return this.swcSetupRte;
	}

	public void setSwcSetupRte(Double swcSetupRte) {
		this.swcSetupRte = swcSetupRte;
	}

	public Double getSwcBdnSurate() {
		return this.swcBdnSurate;
	}

	public void setSwcBdnSurate(Double swcBdnSurate) {
		this.swcBdnSurate = swcBdnSurate;
	}

	public Double getSwcBdnSupct() {
		return this.swcBdnSupct;
	}

	public void setSwcBdnSupct(Double swcBdnSupct) {
		this.swcBdnSupct = swcBdnSupct;
	}

	public Double getSwcMchSubdn() {
		return this.swcMchSubdn;
	}

	public void setSwcMchSubdn(Double swcMchSubdn) {
		this.swcMchSubdn = swcMchSubdn;
	}

	public Date getSwcModDate() {
		return this.swcModDate;
	}

	public void setSwcModDate(Date swcModDate) {
		this.swcModDate = swcModDate;
	}

	public String getSwcUserid() {
		return this.swcUserid;
	}

	public void setSwcUserid(String swcUserid) {
		this.swcUserid = swcUserid;
	}

	public String getSwcQadc01() {
		return this.swcQadc01;
	}

	public void setSwcQadc01(String swcQadc01) {
		this.swcQadc01 = swcQadc01;
	}

	public Double getOidSwcDet() {
		return this.oidSwcDet;
	}

	public void setOidSwcDet(Double oidSwcDet) {
		this.oidSwcDet = oidSwcDet;
	}

}