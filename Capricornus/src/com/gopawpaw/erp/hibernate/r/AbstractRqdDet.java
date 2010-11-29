package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqdDet entity provides the base persistence definition of the RqdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqdDet implements java.io.Serializable {

	// Fields

	private RqdDetId id;
	private String rqdPart;
	private Double rqdReqQty;
	private Double rqdUmConv;
	private String rqdVend;
	private String rqdShip;
	private String rqdVpart;
	private Boolean rqdTaxable;
	private Double rqdDiscPct;
	private Date rqdDueDate;
	private String rqdDesc;
	private String rqdType;
	private Double rqdMaxCost;
	private String rqdCategory;
	private String rqdStatus;
	private String rqdRev;
	private String rqdLoc;
	private Boolean rqdInspRqd;
	private String rqdAcct;
	private String rqdCc;
	private String rqdProject;
	private Date rqdNeedDate;
	private Double rqdPurCost;
	private String rqdAprvStat;
	private Date rqdRelDate;
	private String rqdSite;
	private String rqdUm;
	private Integer rqdCmtindx;
	private Double rqdOotPonetcst;
	private String rqdOotPoum;
	private Double rqdOotRqnetcst;
	private String rqdOotRqum;
	private String rqdPrList;
	private String rqdPrList2;
	private String rqdGrade;
	private Date rqdExpire;
	private String rqdRctstat;
	private Double rqdAssay;
	private Boolean rqdLotRcpt;
	private String rqdChr01;
	private String rqdChr02;
	private String rqdChr03;
	private String rqdChr04;
	private String rqdQadc01;
	private String rqdQadc02;
	private String rqdQadc03;
	private String rqdQadc04;
	private Boolean rqdOpen;
	private String rqdOotExtra;
	private Double oidRqdDet;

	// Constructors

	/** default constructor */
	public AbstractRqdDet() {
	}

	/** minimal constructor */
	public AbstractRqdDet(RqdDetId id, Double oidRqdDet) {
		this.id = id;
		this.oidRqdDet = oidRqdDet;
	}

	/** full constructor */
	public AbstractRqdDet(RqdDetId id, String rqdPart, Double rqdReqQty,
			Double rqdUmConv, String rqdVend, String rqdShip, String rqdVpart,
			Boolean rqdTaxable, Double rqdDiscPct, Date rqdDueDate,
			String rqdDesc, String rqdType, Double rqdMaxCost,
			String rqdCategory, String rqdStatus, String rqdRev, String rqdLoc,
			Boolean rqdInspRqd, String rqdAcct, String rqdCc,
			String rqdProject, Date rqdNeedDate, Double rqdPurCost,
			String rqdAprvStat, Date rqdRelDate, String rqdSite, String rqdUm,
			Integer rqdCmtindx, Double rqdOotPonetcst, String rqdOotPoum,
			Double rqdOotRqnetcst, String rqdOotRqum, String rqdPrList,
			String rqdPrList2, String rqdGrade, Date rqdExpire,
			String rqdRctstat, Double rqdAssay, Boolean rqdLotRcpt,
			String rqdChr01, String rqdChr02, String rqdChr03, String rqdChr04,
			String rqdQadc01, String rqdQadc02, String rqdQadc03,
			String rqdQadc04, Boolean rqdOpen, String rqdOotExtra,
			Double oidRqdDet) {
		this.id = id;
		this.rqdPart = rqdPart;
		this.rqdReqQty = rqdReqQty;
		this.rqdUmConv = rqdUmConv;
		this.rqdVend = rqdVend;
		this.rqdShip = rqdShip;
		this.rqdVpart = rqdVpart;
		this.rqdTaxable = rqdTaxable;
		this.rqdDiscPct = rqdDiscPct;
		this.rqdDueDate = rqdDueDate;
		this.rqdDesc = rqdDesc;
		this.rqdType = rqdType;
		this.rqdMaxCost = rqdMaxCost;
		this.rqdCategory = rqdCategory;
		this.rqdStatus = rqdStatus;
		this.rqdRev = rqdRev;
		this.rqdLoc = rqdLoc;
		this.rqdInspRqd = rqdInspRqd;
		this.rqdAcct = rqdAcct;
		this.rqdCc = rqdCc;
		this.rqdProject = rqdProject;
		this.rqdNeedDate = rqdNeedDate;
		this.rqdPurCost = rqdPurCost;
		this.rqdAprvStat = rqdAprvStat;
		this.rqdRelDate = rqdRelDate;
		this.rqdSite = rqdSite;
		this.rqdUm = rqdUm;
		this.rqdCmtindx = rqdCmtindx;
		this.rqdOotPonetcst = rqdOotPonetcst;
		this.rqdOotPoum = rqdOotPoum;
		this.rqdOotRqnetcst = rqdOotRqnetcst;
		this.rqdOotRqum = rqdOotRqum;
		this.rqdPrList = rqdPrList;
		this.rqdPrList2 = rqdPrList2;
		this.rqdGrade = rqdGrade;
		this.rqdExpire = rqdExpire;
		this.rqdRctstat = rqdRctstat;
		this.rqdAssay = rqdAssay;
		this.rqdLotRcpt = rqdLotRcpt;
		this.rqdChr01 = rqdChr01;
		this.rqdChr02 = rqdChr02;
		this.rqdChr03 = rqdChr03;
		this.rqdChr04 = rqdChr04;
		this.rqdQadc01 = rqdQadc01;
		this.rqdQadc02 = rqdQadc02;
		this.rqdQadc03 = rqdQadc03;
		this.rqdQadc04 = rqdQadc04;
		this.rqdOpen = rqdOpen;
		this.rqdOotExtra = rqdOotExtra;
		this.oidRqdDet = oidRqdDet;
	}

	// Property accessors

	public RqdDetId getId() {
		return this.id;
	}

	public void setId(RqdDetId id) {
		this.id = id;
	}

	public String getRqdPart() {
		return this.rqdPart;
	}

	public void setRqdPart(String rqdPart) {
		this.rqdPart = rqdPart;
	}

	public Double getRqdReqQty() {
		return this.rqdReqQty;
	}

	public void setRqdReqQty(Double rqdReqQty) {
		this.rqdReqQty = rqdReqQty;
	}

	public Double getRqdUmConv() {
		return this.rqdUmConv;
	}

	public void setRqdUmConv(Double rqdUmConv) {
		this.rqdUmConv = rqdUmConv;
	}

	public String getRqdVend() {
		return this.rqdVend;
	}

	public void setRqdVend(String rqdVend) {
		this.rqdVend = rqdVend;
	}

	public String getRqdShip() {
		return this.rqdShip;
	}

	public void setRqdShip(String rqdShip) {
		this.rqdShip = rqdShip;
	}

	public String getRqdVpart() {
		return this.rqdVpart;
	}

	public void setRqdVpart(String rqdVpart) {
		this.rqdVpart = rqdVpart;
	}

	public Boolean getRqdTaxable() {
		return this.rqdTaxable;
	}

	public void setRqdTaxable(Boolean rqdTaxable) {
		this.rqdTaxable = rqdTaxable;
	}

	public Double getRqdDiscPct() {
		return this.rqdDiscPct;
	}

	public void setRqdDiscPct(Double rqdDiscPct) {
		this.rqdDiscPct = rqdDiscPct;
	}

	public Date getRqdDueDate() {
		return this.rqdDueDate;
	}

	public void setRqdDueDate(Date rqdDueDate) {
		this.rqdDueDate = rqdDueDate;
	}

	public String getRqdDesc() {
		return this.rqdDesc;
	}

	public void setRqdDesc(String rqdDesc) {
		this.rqdDesc = rqdDesc;
	}

	public String getRqdType() {
		return this.rqdType;
	}

	public void setRqdType(String rqdType) {
		this.rqdType = rqdType;
	}

	public Double getRqdMaxCost() {
		return this.rqdMaxCost;
	}

	public void setRqdMaxCost(Double rqdMaxCost) {
		this.rqdMaxCost = rqdMaxCost;
	}

	public String getRqdCategory() {
		return this.rqdCategory;
	}

	public void setRqdCategory(String rqdCategory) {
		this.rqdCategory = rqdCategory;
	}

	public String getRqdStatus() {
		return this.rqdStatus;
	}

	public void setRqdStatus(String rqdStatus) {
		this.rqdStatus = rqdStatus;
	}

	public String getRqdRev() {
		return this.rqdRev;
	}

	public void setRqdRev(String rqdRev) {
		this.rqdRev = rqdRev;
	}

	public String getRqdLoc() {
		return this.rqdLoc;
	}

	public void setRqdLoc(String rqdLoc) {
		this.rqdLoc = rqdLoc;
	}

	public Boolean getRqdInspRqd() {
		return this.rqdInspRqd;
	}

	public void setRqdInspRqd(Boolean rqdInspRqd) {
		this.rqdInspRqd = rqdInspRqd;
	}

	public String getRqdAcct() {
		return this.rqdAcct;
	}

	public void setRqdAcct(String rqdAcct) {
		this.rqdAcct = rqdAcct;
	}

	public String getRqdCc() {
		return this.rqdCc;
	}

	public void setRqdCc(String rqdCc) {
		this.rqdCc = rqdCc;
	}

	public String getRqdProject() {
		return this.rqdProject;
	}

	public void setRqdProject(String rqdProject) {
		this.rqdProject = rqdProject;
	}

	public Date getRqdNeedDate() {
		return this.rqdNeedDate;
	}

	public void setRqdNeedDate(Date rqdNeedDate) {
		this.rqdNeedDate = rqdNeedDate;
	}

	public Double getRqdPurCost() {
		return this.rqdPurCost;
	}

	public void setRqdPurCost(Double rqdPurCost) {
		this.rqdPurCost = rqdPurCost;
	}

	public String getRqdAprvStat() {
		return this.rqdAprvStat;
	}

	public void setRqdAprvStat(String rqdAprvStat) {
		this.rqdAprvStat = rqdAprvStat;
	}

	public Date getRqdRelDate() {
		return this.rqdRelDate;
	}

	public void setRqdRelDate(Date rqdRelDate) {
		this.rqdRelDate = rqdRelDate;
	}

	public String getRqdSite() {
		return this.rqdSite;
	}

	public void setRqdSite(String rqdSite) {
		this.rqdSite = rqdSite;
	}

	public String getRqdUm() {
		return this.rqdUm;
	}

	public void setRqdUm(String rqdUm) {
		this.rqdUm = rqdUm;
	}

	public Integer getRqdCmtindx() {
		return this.rqdCmtindx;
	}

	public void setRqdCmtindx(Integer rqdCmtindx) {
		this.rqdCmtindx = rqdCmtindx;
	}

	public Double getRqdOotPonetcst() {
		return this.rqdOotPonetcst;
	}

	public void setRqdOotPonetcst(Double rqdOotPonetcst) {
		this.rqdOotPonetcst = rqdOotPonetcst;
	}

	public String getRqdOotPoum() {
		return this.rqdOotPoum;
	}

	public void setRqdOotPoum(String rqdOotPoum) {
		this.rqdOotPoum = rqdOotPoum;
	}

	public Double getRqdOotRqnetcst() {
		return this.rqdOotRqnetcst;
	}

	public void setRqdOotRqnetcst(Double rqdOotRqnetcst) {
		this.rqdOotRqnetcst = rqdOotRqnetcst;
	}

	public String getRqdOotRqum() {
		return this.rqdOotRqum;
	}

	public void setRqdOotRqum(String rqdOotRqum) {
		this.rqdOotRqum = rqdOotRqum;
	}

	public String getRqdPrList() {
		return this.rqdPrList;
	}

	public void setRqdPrList(String rqdPrList) {
		this.rqdPrList = rqdPrList;
	}

	public String getRqdPrList2() {
		return this.rqdPrList2;
	}

	public void setRqdPrList2(String rqdPrList2) {
		this.rqdPrList2 = rqdPrList2;
	}

	public String getRqdGrade() {
		return this.rqdGrade;
	}

	public void setRqdGrade(String rqdGrade) {
		this.rqdGrade = rqdGrade;
	}

	public Date getRqdExpire() {
		return this.rqdExpire;
	}

	public void setRqdExpire(Date rqdExpire) {
		this.rqdExpire = rqdExpire;
	}

	public String getRqdRctstat() {
		return this.rqdRctstat;
	}

	public void setRqdRctstat(String rqdRctstat) {
		this.rqdRctstat = rqdRctstat;
	}

	public Double getRqdAssay() {
		return this.rqdAssay;
	}

	public void setRqdAssay(Double rqdAssay) {
		this.rqdAssay = rqdAssay;
	}

	public Boolean getRqdLotRcpt() {
		return this.rqdLotRcpt;
	}

	public void setRqdLotRcpt(Boolean rqdLotRcpt) {
		this.rqdLotRcpt = rqdLotRcpt;
	}

	public String getRqdChr01() {
		return this.rqdChr01;
	}

	public void setRqdChr01(String rqdChr01) {
		this.rqdChr01 = rqdChr01;
	}

	public String getRqdChr02() {
		return this.rqdChr02;
	}

	public void setRqdChr02(String rqdChr02) {
		this.rqdChr02 = rqdChr02;
	}

	public String getRqdChr03() {
		return this.rqdChr03;
	}

	public void setRqdChr03(String rqdChr03) {
		this.rqdChr03 = rqdChr03;
	}

	public String getRqdChr04() {
		return this.rqdChr04;
	}

	public void setRqdChr04(String rqdChr04) {
		this.rqdChr04 = rqdChr04;
	}

	public String getRqdQadc01() {
		return this.rqdQadc01;
	}

	public void setRqdQadc01(String rqdQadc01) {
		this.rqdQadc01 = rqdQadc01;
	}

	public String getRqdQadc02() {
		return this.rqdQadc02;
	}

	public void setRqdQadc02(String rqdQadc02) {
		this.rqdQadc02 = rqdQadc02;
	}

	public String getRqdQadc03() {
		return this.rqdQadc03;
	}

	public void setRqdQadc03(String rqdQadc03) {
		this.rqdQadc03 = rqdQadc03;
	}

	public String getRqdQadc04() {
		return this.rqdQadc04;
	}

	public void setRqdQadc04(String rqdQadc04) {
		this.rqdQadc04 = rqdQadc04;
	}

	public Boolean getRqdOpen() {
		return this.rqdOpen;
	}

	public void setRqdOpen(Boolean rqdOpen) {
		this.rqdOpen = rqdOpen;
	}

	public String getRqdOotExtra() {
		return this.rqdOotExtra;
	}

	public void setRqdOotExtra(String rqdOotExtra) {
		this.rqdOotExtra = rqdOotExtra;
	}

	public Double getOidRqdDet() {
		return this.oidRqdDet;
	}

	public void setOidRqdDet(Double oidRqdDet) {
		this.oidRqdDet = oidRqdDet;
	}

}