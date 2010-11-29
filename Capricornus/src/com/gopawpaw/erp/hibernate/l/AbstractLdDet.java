package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLdDet entity provides the base persistence definition of the LdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLdDet implements java.io.Serializable {

	// Fields

	private LdDetId id;
	private Date ldDate;
	private Double ldQtyOh;
	private Date ldCntDate;
	private Double ldAssay;
	private Date ldExpire;
	private String ldUser1;
	private String ldUser2;
	private String ldStatus;
	private Double ldQtyAll;
	private String ldGrade;
	private Double ldQtyFrz;
	private Date ldDateFrz;
	private String ldVdLot;
	private Integer ldCmtindx;
	private Double ldWork;
	private String ldChr01;
	private String ldChr02;
	private String ldChr03;
	private String ldChr04;
	private String ldChr05;
	private Date ldDte01;
	private Date ldDte02;
	private Double ldDec01;
	private Double ldDec02;
	private Boolean ldLog01;
	private Double ldCost;
	private String ldRev;
	private Double ldCustConsignQty;
	private Double ldSuppConsignQty;
	private Double oidLdDet;

	// Constructors

	/** default constructor */
	public AbstractLdDet() {
	}

	/** minimal constructor */
	public AbstractLdDet(LdDetId id, Double ldQtyOh, Double ldCustConsignQty,
			Double ldSuppConsignQty, Double oidLdDet) {
		this.id = id;
		this.ldQtyOh = ldQtyOh;
		this.ldCustConsignQty = ldCustConsignQty;
		this.ldSuppConsignQty = ldSuppConsignQty;
		this.oidLdDet = oidLdDet;
	}

	/** full constructor */
	public AbstractLdDet(LdDetId id, Date ldDate, Double ldQtyOh,
			Date ldCntDate, Double ldAssay, Date ldExpire, String ldUser1,
			String ldUser2, String ldStatus, Double ldQtyAll, String ldGrade,
			Double ldQtyFrz, Date ldDateFrz, String ldVdLot, Integer ldCmtindx,
			Double ldWork, String ldChr01, String ldChr02, String ldChr03,
			String ldChr04, String ldChr05, Date ldDte01, Date ldDte02,
			Double ldDec01, Double ldDec02, Boolean ldLog01, Double ldCost,
			String ldRev, Double ldCustConsignQty, Double ldSuppConsignQty,
			Double oidLdDet) {
		this.id = id;
		this.ldDate = ldDate;
		this.ldQtyOh = ldQtyOh;
		this.ldCntDate = ldCntDate;
		this.ldAssay = ldAssay;
		this.ldExpire = ldExpire;
		this.ldUser1 = ldUser1;
		this.ldUser2 = ldUser2;
		this.ldStatus = ldStatus;
		this.ldQtyAll = ldQtyAll;
		this.ldGrade = ldGrade;
		this.ldQtyFrz = ldQtyFrz;
		this.ldDateFrz = ldDateFrz;
		this.ldVdLot = ldVdLot;
		this.ldCmtindx = ldCmtindx;
		this.ldWork = ldWork;
		this.ldChr01 = ldChr01;
		this.ldChr02 = ldChr02;
		this.ldChr03 = ldChr03;
		this.ldChr04 = ldChr04;
		this.ldChr05 = ldChr05;
		this.ldDte01 = ldDte01;
		this.ldDte02 = ldDte02;
		this.ldDec01 = ldDec01;
		this.ldDec02 = ldDec02;
		this.ldLog01 = ldLog01;
		this.ldCost = ldCost;
		this.ldRev = ldRev;
		this.ldCustConsignQty = ldCustConsignQty;
		this.ldSuppConsignQty = ldSuppConsignQty;
		this.oidLdDet = oidLdDet;
	}

	// Property accessors

	public LdDetId getId() {
		return this.id;
	}

	public void setId(LdDetId id) {
		this.id = id;
	}

	public Date getLdDate() {
		return this.ldDate;
	}

	public void setLdDate(Date ldDate) {
		this.ldDate = ldDate;
	}

	public Double getLdQtyOh() {
		return this.ldQtyOh;
	}

	public void setLdQtyOh(Double ldQtyOh) {
		this.ldQtyOh = ldQtyOh;
	}

	public Date getLdCntDate() {
		return this.ldCntDate;
	}

	public void setLdCntDate(Date ldCntDate) {
		this.ldCntDate = ldCntDate;
	}

	public Double getLdAssay() {
		return this.ldAssay;
	}

	public void setLdAssay(Double ldAssay) {
		this.ldAssay = ldAssay;
	}

	public Date getLdExpire() {
		return this.ldExpire;
	}

	public void setLdExpire(Date ldExpire) {
		this.ldExpire = ldExpire;
	}

	public String getLdUser1() {
		return this.ldUser1;
	}

	public void setLdUser1(String ldUser1) {
		this.ldUser1 = ldUser1;
	}

	public String getLdUser2() {
		return this.ldUser2;
	}

	public void setLdUser2(String ldUser2) {
		this.ldUser2 = ldUser2;
	}

	public String getLdStatus() {
		return this.ldStatus;
	}

	public void setLdStatus(String ldStatus) {
		this.ldStatus = ldStatus;
	}

	public Double getLdQtyAll() {
		return this.ldQtyAll;
	}

	public void setLdQtyAll(Double ldQtyAll) {
		this.ldQtyAll = ldQtyAll;
	}

	public String getLdGrade() {
		return this.ldGrade;
	}

	public void setLdGrade(String ldGrade) {
		this.ldGrade = ldGrade;
	}

	public Double getLdQtyFrz() {
		return this.ldQtyFrz;
	}

	public void setLdQtyFrz(Double ldQtyFrz) {
		this.ldQtyFrz = ldQtyFrz;
	}

	public Date getLdDateFrz() {
		return this.ldDateFrz;
	}

	public void setLdDateFrz(Date ldDateFrz) {
		this.ldDateFrz = ldDateFrz;
	}

	public String getLdVdLot() {
		return this.ldVdLot;
	}

	public void setLdVdLot(String ldVdLot) {
		this.ldVdLot = ldVdLot;
	}

	public Integer getLdCmtindx() {
		return this.ldCmtindx;
	}

	public void setLdCmtindx(Integer ldCmtindx) {
		this.ldCmtindx = ldCmtindx;
	}

	public Double getLdWork() {
		return this.ldWork;
	}

	public void setLdWork(Double ldWork) {
		this.ldWork = ldWork;
	}

	public String getLdChr01() {
		return this.ldChr01;
	}

	public void setLdChr01(String ldChr01) {
		this.ldChr01 = ldChr01;
	}

	public String getLdChr02() {
		return this.ldChr02;
	}

	public void setLdChr02(String ldChr02) {
		this.ldChr02 = ldChr02;
	}

	public String getLdChr03() {
		return this.ldChr03;
	}

	public void setLdChr03(String ldChr03) {
		this.ldChr03 = ldChr03;
	}

	public String getLdChr04() {
		return this.ldChr04;
	}

	public void setLdChr04(String ldChr04) {
		this.ldChr04 = ldChr04;
	}

	public String getLdChr05() {
		return this.ldChr05;
	}

	public void setLdChr05(String ldChr05) {
		this.ldChr05 = ldChr05;
	}

	public Date getLdDte01() {
		return this.ldDte01;
	}

	public void setLdDte01(Date ldDte01) {
		this.ldDte01 = ldDte01;
	}

	public Date getLdDte02() {
		return this.ldDte02;
	}

	public void setLdDte02(Date ldDte02) {
		this.ldDte02 = ldDte02;
	}

	public Double getLdDec01() {
		return this.ldDec01;
	}

	public void setLdDec01(Double ldDec01) {
		this.ldDec01 = ldDec01;
	}

	public Double getLdDec02() {
		return this.ldDec02;
	}

	public void setLdDec02(Double ldDec02) {
		this.ldDec02 = ldDec02;
	}

	public Boolean getLdLog01() {
		return this.ldLog01;
	}

	public void setLdLog01(Boolean ldLog01) {
		this.ldLog01 = ldLog01;
	}

	public Double getLdCost() {
		return this.ldCost;
	}

	public void setLdCost(Double ldCost) {
		this.ldCost = ldCost;
	}

	public String getLdRev() {
		return this.ldRev;
	}

	public void setLdRev(String ldRev) {
		this.ldRev = ldRev;
	}

	public Double getLdCustConsignQty() {
		return this.ldCustConsignQty;
	}

	public void setLdCustConsignQty(Double ldCustConsignQty) {
		this.ldCustConsignQty = ldCustConsignQty;
	}

	public Double getLdSuppConsignQty() {
		return this.ldSuppConsignQty;
	}

	public void setLdSuppConsignQty(Double ldSuppConsignQty) {
		this.ldSuppConsignQty = ldSuppConsignQty;
	}

	public Double getOidLdDet() {
		return this.oidLdDet;
	}

	public void setOidLdDet(Double oidLdDet) {
		this.oidLdDet = oidLdDet;
	}

}