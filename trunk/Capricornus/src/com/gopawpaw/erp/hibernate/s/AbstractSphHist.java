package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSphHist entity provides the base persistence definition of the
 * SphHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSphHist implements java.io.Serializable {

	// Fields

	private SphHistId id;
	private String sphSales;
	private String sphCost;
	private String sphQuota;
	private Double sphTotSale;
	private Double sphTotCost;
	private String sphUser1;
	private String sphUser2;
	private Integer sphSmonth;
	private String sphType;
	private String sphChr01;
	private String sphChr02;
	private String sphChr03;
	private String sphChr04;
	private String sphChr05;
	private Date sphDte01;
	private Date sphDte02;
	private Boolean sphLog01;
	private String sphDec01;
	private String sphDec02;
	private Double oidSphHist;

	// Constructors

	/** default constructor */
	public AbstractSphHist() {
	}

	/** minimal constructor */
	public AbstractSphHist(SphHistId id, Double oidSphHist) {
		this.id = id;
		this.oidSphHist = oidSphHist;
	}

	/** full constructor */
	public AbstractSphHist(SphHistId id, String sphSales, String sphCost,
			String sphQuota, Double sphTotSale, Double sphTotCost,
			String sphUser1, String sphUser2, Integer sphSmonth,
			String sphType, String sphChr01, String sphChr02, String sphChr03,
			String sphChr04, String sphChr05, Date sphDte01, Date sphDte02,
			Boolean sphLog01, String sphDec01, String sphDec02,
			Double oidSphHist) {
		this.id = id;
		this.sphSales = sphSales;
		this.sphCost = sphCost;
		this.sphQuota = sphQuota;
		this.sphTotSale = sphTotSale;
		this.sphTotCost = sphTotCost;
		this.sphUser1 = sphUser1;
		this.sphUser2 = sphUser2;
		this.sphSmonth = sphSmonth;
		this.sphType = sphType;
		this.sphChr01 = sphChr01;
		this.sphChr02 = sphChr02;
		this.sphChr03 = sphChr03;
		this.sphChr04 = sphChr04;
		this.sphChr05 = sphChr05;
		this.sphDte01 = sphDte01;
		this.sphDte02 = sphDte02;
		this.sphLog01 = sphLog01;
		this.sphDec01 = sphDec01;
		this.sphDec02 = sphDec02;
		this.oidSphHist = oidSphHist;
	}

	// Property accessors

	public SphHistId getId() {
		return this.id;
	}

	public void setId(SphHistId id) {
		this.id = id;
	}

	public String getSphSales() {
		return this.sphSales;
	}

	public void setSphSales(String sphSales) {
		this.sphSales = sphSales;
	}

	public String getSphCost() {
		return this.sphCost;
	}

	public void setSphCost(String sphCost) {
		this.sphCost = sphCost;
	}

	public String getSphQuota() {
		return this.sphQuota;
	}

	public void setSphQuota(String sphQuota) {
		this.sphQuota = sphQuota;
	}

	public Double getSphTotSale() {
		return this.sphTotSale;
	}

	public void setSphTotSale(Double sphTotSale) {
		this.sphTotSale = sphTotSale;
	}

	public Double getSphTotCost() {
		return this.sphTotCost;
	}

	public void setSphTotCost(Double sphTotCost) {
		this.sphTotCost = sphTotCost;
	}

	public String getSphUser1() {
		return this.sphUser1;
	}

	public void setSphUser1(String sphUser1) {
		this.sphUser1 = sphUser1;
	}

	public String getSphUser2() {
		return this.sphUser2;
	}

	public void setSphUser2(String sphUser2) {
		this.sphUser2 = sphUser2;
	}

	public Integer getSphSmonth() {
		return this.sphSmonth;
	}

	public void setSphSmonth(Integer sphSmonth) {
		this.sphSmonth = sphSmonth;
	}

	public String getSphType() {
		return this.sphType;
	}

	public void setSphType(String sphType) {
		this.sphType = sphType;
	}

	public String getSphChr01() {
		return this.sphChr01;
	}

	public void setSphChr01(String sphChr01) {
		this.sphChr01 = sphChr01;
	}

	public String getSphChr02() {
		return this.sphChr02;
	}

	public void setSphChr02(String sphChr02) {
		this.sphChr02 = sphChr02;
	}

	public String getSphChr03() {
		return this.sphChr03;
	}

	public void setSphChr03(String sphChr03) {
		this.sphChr03 = sphChr03;
	}

	public String getSphChr04() {
		return this.sphChr04;
	}

	public void setSphChr04(String sphChr04) {
		this.sphChr04 = sphChr04;
	}

	public String getSphChr05() {
		return this.sphChr05;
	}

	public void setSphChr05(String sphChr05) {
		this.sphChr05 = sphChr05;
	}

	public Date getSphDte01() {
		return this.sphDte01;
	}

	public void setSphDte01(Date sphDte01) {
		this.sphDte01 = sphDte01;
	}

	public Date getSphDte02() {
		return this.sphDte02;
	}

	public void setSphDte02(Date sphDte02) {
		this.sphDte02 = sphDte02;
	}

	public Boolean getSphLog01() {
		return this.sphLog01;
	}

	public void setSphLog01(Boolean sphLog01) {
		this.sphLog01 = sphLog01;
	}

	public String getSphDec01() {
		return this.sphDec01;
	}

	public void setSphDec01(String sphDec01) {
		this.sphDec01 = sphDec01;
	}

	public String getSphDec02() {
		return this.sphDec02;
	}

	public void setSphDec02(String sphDec02) {
		this.sphDec02 = sphDec02;
	}

	public Double getOidSphHist() {
		return this.oidSphHist;
	}

	public void setOidSphHist(Double oidSphHist) {
		this.oidSphHist = oidSphHist;
	}

}