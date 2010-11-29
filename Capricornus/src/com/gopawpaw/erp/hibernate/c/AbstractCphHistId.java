package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCphHistId entity provides the base persistence definition of the
 * CphHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCphHistId implements java.io.Serializable {

	// Fields

	private Integer cphYear;
	private String cphCust;
	private String cphShip;
	private String cphPl;
	private String cphPart;
	private String cphQty;
	private String cphSales;
	private String cphCost;
	private Double cphTotQty;
	private Double cphTotSale;
	private Double cphTotCost;
	private String cphType;
	private String cphUser1;
	private String cphUser2;
	private Integer cphSmonth;
	private String cphChr01;
	private String cphChr02;
	private String cphChr03;
	private String cphChr04;
	private String cphChr05;
	private Date cphDte01;
	private Date cphDte02;
	private Boolean cphLog01;
	private String cphDec01;
	private String cphDec02;
	private String cphSite;
	private String cphDomain;
	private Double oidCphHist;

	// Constructors

	/** default constructor */
	public AbstractCphHistId() {
	}

	/** minimal constructor */
	public AbstractCphHistId(String cphDomain, Double oidCphHist) {
		this.cphDomain = cphDomain;
		this.oidCphHist = oidCphHist;
	}

	/** full constructor */
	public AbstractCphHistId(Integer cphYear, String cphCust, String cphShip,
			String cphPl, String cphPart, String cphQty, String cphSales,
			String cphCost, Double cphTotQty, Double cphTotSale,
			Double cphTotCost, String cphType, String cphUser1,
			String cphUser2, Integer cphSmonth, String cphChr01,
			String cphChr02, String cphChr03, String cphChr04, String cphChr05,
			Date cphDte01, Date cphDte02, Boolean cphLog01, String cphDec01,
			String cphDec02, String cphSite, String cphDomain, Double oidCphHist) {
		this.cphYear = cphYear;
		this.cphCust = cphCust;
		this.cphShip = cphShip;
		this.cphPl = cphPl;
		this.cphPart = cphPart;
		this.cphQty = cphQty;
		this.cphSales = cphSales;
		this.cphCost = cphCost;
		this.cphTotQty = cphTotQty;
		this.cphTotSale = cphTotSale;
		this.cphTotCost = cphTotCost;
		this.cphType = cphType;
		this.cphUser1 = cphUser1;
		this.cphUser2 = cphUser2;
		this.cphSmonth = cphSmonth;
		this.cphChr01 = cphChr01;
		this.cphChr02 = cphChr02;
		this.cphChr03 = cphChr03;
		this.cphChr04 = cphChr04;
		this.cphChr05 = cphChr05;
		this.cphDte01 = cphDte01;
		this.cphDte02 = cphDte02;
		this.cphLog01 = cphLog01;
		this.cphDec01 = cphDec01;
		this.cphDec02 = cphDec02;
		this.cphSite = cphSite;
		this.cphDomain = cphDomain;
		this.oidCphHist = oidCphHist;
	}

	// Property accessors

	public Integer getCphYear() {
		return this.cphYear;
	}

	public void setCphYear(Integer cphYear) {
		this.cphYear = cphYear;
	}

	public String getCphCust() {
		return this.cphCust;
	}

	public void setCphCust(String cphCust) {
		this.cphCust = cphCust;
	}

	public String getCphShip() {
		return this.cphShip;
	}

	public void setCphShip(String cphShip) {
		this.cphShip = cphShip;
	}

	public String getCphPl() {
		return this.cphPl;
	}

	public void setCphPl(String cphPl) {
		this.cphPl = cphPl;
	}

	public String getCphPart() {
		return this.cphPart;
	}

	public void setCphPart(String cphPart) {
		this.cphPart = cphPart;
	}

	public String getCphQty() {
		return this.cphQty;
	}

	public void setCphQty(String cphQty) {
		this.cphQty = cphQty;
	}

	public String getCphSales() {
		return this.cphSales;
	}

	public void setCphSales(String cphSales) {
		this.cphSales = cphSales;
	}

	public String getCphCost() {
		return this.cphCost;
	}

	public void setCphCost(String cphCost) {
		this.cphCost = cphCost;
	}

	public Double getCphTotQty() {
		return this.cphTotQty;
	}

	public void setCphTotQty(Double cphTotQty) {
		this.cphTotQty = cphTotQty;
	}

	public Double getCphTotSale() {
		return this.cphTotSale;
	}

	public void setCphTotSale(Double cphTotSale) {
		this.cphTotSale = cphTotSale;
	}

	public Double getCphTotCost() {
		return this.cphTotCost;
	}

	public void setCphTotCost(Double cphTotCost) {
		this.cphTotCost = cphTotCost;
	}

	public String getCphType() {
		return this.cphType;
	}

	public void setCphType(String cphType) {
		this.cphType = cphType;
	}

	public String getCphUser1() {
		return this.cphUser1;
	}

	public void setCphUser1(String cphUser1) {
		this.cphUser1 = cphUser1;
	}

	public String getCphUser2() {
		return this.cphUser2;
	}

	public void setCphUser2(String cphUser2) {
		this.cphUser2 = cphUser2;
	}

	public Integer getCphSmonth() {
		return this.cphSmonth;
	}

	public void setCphSmonth(Integer cphSmonth) {
		this.cphSmonth = cphSmonth;
	}

	public String getCphChr01() {
		return this.cphChr01;
	}

	public void setCphChr01(String cphChr01) {
		this.cphChr01 = cphChr01;
	}

	public String getCphChr02() {
		return this.cphChr02;
	}

	public void setCphChr02(String cphChr02) {
		this.cphChr02 = cphChr02;
	}

	public String getCphChr03() {
		return this.cphChr03;
	}

	public void setCphChr03(String cphChr03) {
		this.cphChr03 = cphChr03;
	}

	public String getCphChr04() {
		return this.cphChr04;
	}

	public void setCphChr04(String cphChr04) {
		this.cphChr04 = cphChr04;
	}

	public String getCphChr05() {
		return this.cphChr05;
	}

	public void setCphChr05(String cphChr05) {
		this.cphChr05 = cphChr05;
	}

	public Date getCphDte01() {
		return this.cphDte01;
	}

	public void setCphDte01(Date cphDte01) {
		this.cphDte01 = cphDte01;
	}

	public Date getCphDte02() {
		return this.cphDte02;
	}

	public void setCphDte02(Date cphDte02) {
		this.cphDte02 = cphDte02;
	}

	public Boolean getCphLog01() {
		return this.cphLog01;
	}

	public void setCphLog01(Boolean cphLog01) {
		this.cphLog01 = cphLog01;
	}

	public String getCphDec01() {
		return this.cphDec01;
	}

	public void setCphDec01(String cphDec01) {
		this.cphDec01 = cphDec01;
	}

	public String getCphDec02() {
		return this.cphDec02;
	}

	public void setCphDec02(String cphDec02) {
		this.cphDec02 = cphDec02;
	}

	public String getCphSite() {
		return this.cphSite;
	}

	public void setCphSite(String cphSite) {
		this.cphSite = cphSite;
	}

	public String getCphDomain() {
		return this.cphDomain;
	}

	public void setCphDomain(String cphDomain) {
		this.cphDomain = cphDomain;
	}

	public Double getOidCphHist() {
		return this.oidCphHist;
	}

	public void setOidCphHist(Double oidCphHist) {
		this.oidCphHist = oidCphHist;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCphHistId))
			return false;
		AbstractCphHistId castOther = (AbstractCphHistId) other;

		return ((this.getCphYear() == castOther.getCphYear()) || (this
				.getCphYear() != null
				&& castOther.getCphYear() != null && this.getCphYear().equals(
				castOther.getCphYear())))
				&& ((this.getCphCust() == castOther.getCphCust()) || (this
						.getCphCust() != null
						&& castOther.getCphCust() != null && this.getCphCust()
						.equals(castOther.getCphCust())))
				&& ((this.getCphShip() == castOther.getCphShip()) || (this
						.getCphShip() != null
						&& castOther.getCphShip() != null && this.getCphShip()
						.equals(castOther.getCphShip())))
				&& ((this.getCphPl() == castOther.getCphPl()) || (this
						.getCphPl() != null
						&& castOther.getCphPl() != null && this.getCphPl()
						.equals(castOther.getCphPl())))
				&& ((this.getCphPart() == castOther.getCphPart()) || (this
						.getCphPart() != null
						&& castOther.getCphPart() != null && this.getCphPart()
						.equals(castOther.getCphPart())))
				&& ((this.getCphQty() == castOther.getCphQty()) || (this
						.getCphQty() != null
						&& castOther.getCphQty() != null && this.getCphQty()
						.equals(castOther.getCphQty())))
				&& ((this.getCphSales() == castOther.getCphSales()) || (this
						.getCphSales() != null
						&& castOther.getCphSales() != null && this
						.getCphSales().equals(castOther.getCphSales())))
				&& ((this.getCphCost() == castOther.getCphCost()) || (this
						.getCphCost() != null
						&& castOther.getCphCost() != null && this.getCphCost()
						.equals(castOther.getCphCost())))
				&& ((this.getCphTotQty() == castOther.getCphTotQty()) || (this
						.getCphTotQty() != null
						&& castOther.getCphTotQty() != null && this
						.getCphTotQty().equals(castOther.getCphTotQty())))
				&& ((this.getCphTotSale() == castOther.getCphTotSale()) || (this
						.getCphTotSale() != null
						&& castOther.getCphTotSale() != null && this
						.getCphTotSale().equals(castOther.getCphTotSale())))
				&& ((this.getCphTotCost() == castOther.getCphTotCost()) || (this
						.getCphTotCost() != null
						&& castOther.getCphTotCost() != null && this
						.getCphTotCost().equals(castOther.getCphTotCost())))
				&& ((this.getCphType() == castOther.getCphType()) || (this
						.getCphType() != null
						&& castOther.getCphType() != null && this.getCphType()
						.equals(castOther.getCphType())))
				&& ((this.getCphUser1() == castOther.getCphUser1()) || (this
						.getCphUser1() != null
						&& castOther.getCphUser1() != null && this
						.getCphUser1().equals(castOther.getCphUser1())))
				&& ((this.getCphUser2() == castOther.getCphUser2()) || (this
						.getCphUser2() != null
						&& castOther.getCphUser2() != null && this
						.getCphUser2().equals(castOther.getCphUser2())))
				&& ((this.getCphSmonth() == castOther.getCphSmonth()) || (this
						.getCphSmonth() != null
						&& castOther.getCphSmonth() != null && this
						.getCphSmonth().equals(castOther.getCphSmonth())))
				&& ((this.getCphChr01() == castOther.getCphChr01()) || (this
						.getCphChr01() != null
						&& castOther.getCphChr01() != null && this
						.getCphChr01().equals(castOther.getCphChr01())))
				&& ((this.getCphChr02() == castOther.getCphChr02()) || (this
						.getCphChr02() != null
						&& castOther.getCphChr02() != null && this
						.getCphChr02().equals(castOther.getCphChr02())))
				&& ((this.getCphChr03() == castOther.getCphChr03()) || (this
						.getCphChr03() != null
						&& castOther.getCphChr03() != null && this
						.getCphChr03().equals(castOther.getCphChr03())))
				&& ((this.getCphChr04() == castOther.getCphChr04()) || (this
						.getCphChr04() != null
						&& castOther.getCphChr04() != null && this
						.getCphChr04().equals(castOther.getCphChr04())))
				&& ((this.getCphChr05() == castOther.getCphChr05()) || (this
						.getCphChr05() != null
						&& castOther.getCphChr05() != null && this
						.getCphChr05().equals(castOther.getCphChr05())))
				&& ((this.getCphDte01() == castOther.getCphDte01()) || (this
						.getCphDte01() != null
						&& castOther.getCphDte01() != null && this
						.getCphDte01().equals(castOther.getCphDte01())))
				&& ((this.getCphDte02() == castOther.getCphDte02()) || (this
						.getCphDte02() != null
						&& castOther.getCphDte02() != null && this
						.getCphDte02().equals(castOther.getCphDte02())))
				&& ((this.getCphLog01() == castOther.getCphLog01()) || (this
						.getCphLog01() != null
						&& castOther.getCphLog01() != null && this
						.getCphLog01().equals(castOther.getCphLog01())))
				&& ((this.getCphDec01() == castOther.getCphDec01()) || (this
						.getCphDec01() != null
						&& castOther.getCphDec01() != null && this
						.getCphDec01().equals(castOther.getCphDec01())))
				&& ((this.getCphDec02() == castOther.getCphDec02()) || (this
						.getCphDec02() != null
						&& castOther.getCphDec02() != null && this
						.getCphDec02().equals(castOther.getCphDec02())))
				&& ((this.getCphSite() == castOther.getCphSite()) || (this
						.getCphSite() != null
						&& castOther.getCphSite() != null && this.getCphSite()
						.equals(castOther.getCphSite())))
				&& ((this.getCphDomain() == castOther.getCphDomain()) || (this
						.getCphDomain() != null
						&& castOther.getCphDomain() != null && this
						.getCphDomain().equals(castOther.getCphDomain())))
				&& ((this.getOidCphHist() == castOther.getOidCphHist()) || (this
						.getOidCphHist() != null
						&& castOther.getOidCphHist() != null && this
						.getOidCphHist().equals(castOther.getOidCphHist())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCphYear() == null ? 0 : this.getCphYear().hashCode());
		result = 37 * result
				+ (getCphCust() == null ? 0 : this.getCphCust().hashCode());
		result = 37 * result
				+ (getCphShip() == null ? 0 : this.getCphShip().hashCode());
		result = 37 * result
				+ (getCphPl() == null ? 0 : this.getCphPl().hashCode());
		result = 37 * result
				+ (getCphPart() == null ? 0 : this.getCphPart().hashCode());
		result = 37 * result
				+ (getCphQty() == null ? 0 : this.getCphQty().hashCode());
		result = 37 * result
				+ (getCphSales() == null ? 0 : this.getCphSales().hashCode());
		result = 37 * result
				+ (getCphCost() == null ? 0 : this.getCphCost().hashCode());
		result = 37 * result
				+ (getCphTotQty() == null ? 0 : this.getCphTotQty().hashCode());
		result = 37
				* result
				+ (getCphTotSale() == null ? 0 : this.getCphTotSale()
						.hashCode());
		result = 37
				* result
				+ (getCphTotCost() == null ? 0 : this.getCphTotCost()
						.hashCode());
		result = 37 * result
				+ (getCphType() == null ? 0 : this.getCphType().hashCode());
		result = 37 * result
				+ (getCphUser1() == null ? 0 : this.getCphUser1().hashCode());
		result = 37 * result
				+ (getCphUser2() == null ? 0 : this.getCphUser2().hashCode());
		result = 37 * result
				+ (getCphSmonth() == null ? 0 : this.getCphSmonth().hashCode());
		result = 37 * result
				+ (getCphChr01() == null ? 0 : this.getCphChr01().hashCode());
		result = 37 * result
				+ (getCphChr02() == null ? 0 : this.getCphChr02().hashCode());
		result = 37 * result
				+ (getCphChr03() == null ? 0 : this.getCphChr03().hashCode());
		result = 37 * result
				+ (getCphChr04() == null ? 0 : this.getCphChr04().hashCode());
		result = 37 * result
				+ (getCphChr05() == null ? 0 : this.getCphChr05().hashCode());
		result = 37 * result
				+ (getCphDte01() == null ? 0 : this.getCphDte01().hashCode());
		result = 37 * result
				+ (getCphDte02() == null ? 0 : this.getCphDte02().hashCode());
		result = 37 * result
				+ (getCphLog01() == null ? 0 : this.getCphLog01().hashCode());
		result = 37 * result
				+ (getCphDec01() == null ? 0 : this.getCphDec01().hashCode());
		result = 37 * result
				+ (getCphDec02() == null ? 0 : this.getCphDec02().hashCode());
		result = 37 * result
				+ (getCphSite() == null ? 0 : this.getCphSite().hashCode());
		result = 37 * result
				+ (getCphDomain() == null ? 0 : this.getCphDomain().hashCode());
		result = 37
				* result
				+ (getOidCphHist() == null ? 0 : this.getOidCphHist()
						.hashCode());
		return result;
	}

}