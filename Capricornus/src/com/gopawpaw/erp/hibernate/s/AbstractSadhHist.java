package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSadhHist entity provides the base persistence definition of the
 * SadhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSadhHist implements java.io.Serializable {

	// Fields

	private SadhHistId id;
	private String sadhQadc05;
	private String sadhAmtType;
	private String sadhArea;
	private Date sadhCancel;
	private String sadhCaNbr;
	private String sadhQadc06;
	private Integer sadhCmtindx;
	private String sadhComment;
	private String sadhCommPct;
	private Double sadhCrtInt;
	private String sadhCustpart;
	private String sadhCycle;
	private String sadhQadc07;
	private String sadhQadc08;
	private String sadhDesc;
	private Boolean sadhDiscount;
	private Double sadhDiscPct;
	private String sadhQadc09;
	private String sadhQadc10;
	private Date sadhEndDate;
	private String sadhEsNbr;
	private String sadhEuNbr;
	private Date sadhExpire;
	private Boolean sadhFixPr;
	private String sadhFor;
	private Boolean sadhFstList;
	private Date sadhLastbill;
	private Integer sadhLine;
	private Double sadhListPr;
	private Date sadhLstcover;
	private Date sadhLstBill;
	private String sadhNbr;
	private Date sadhNxtBill;
	private String sadhPart;
	private String sadhPctType;
	private Date sadhPerDate;
	private String sadhPrefix;
	private Double sadhPrice;
	private Integer sadhPriority;
	private String sadhProdline;
	private String sadhProject;
	private String sadhPrList;
	private Boolean sadhPst;
	private Boolean sadhPvmBill;
	private String sadhPvmBom;
	private Boolean sadhPvmOnly;
	private String sadhPvmRoute;
	private Double sadhQtyBld;
	private Double sadhQtyChg;
	private Double sadhQtyItem;
	private Double sadhQtyLitm;
	private Double sadhQtyLst;
	private Double sadhQtyPer;
	private Integer sadhRef;
	private String sadhSerial;
	private String sadhSite;
	private String sadhSlspsn;
	private Integer sadhSoLine;
	private String sadhSoShip;
	private Integer sadhSoShipln;
	private String sadhStatus;
	private Double sadhStdCost;
	private Date sadhStCover;
	private Date sadhStDate;
	private Boolean sadhTaxable;
	private String sadhTaxc;
	private String sadhTaxEnv;
	private Boolean sadhTaxIn;
	private String sadhTaxUsage;
	private Double sadhTotalBld;
	private Double sadhTotalPrice;
	private String sadhType;
	private String sadhUm;
	private Double sadhUmConv;
	private String sadhUser1;
	private String sadhUser2;
	private Double sadhVisits;
	private String sadhChr01;
	private String sadhChr02;
	private String sadhChr03;
	private String sadhChr04;
	private String sadhChr05;
	private String sadhChr06;
	private String sadhChr07;
	private String sadhChr08;
	private String sadhChr09;
	private String sadhChr10;
	private Double sadhDec01;
	private Double sadhDec02;
	private Double sadhDec03;
	private Date sadhDte01;
	private Date sadhDte02;
	private Date sadhDte03;
	private Boolean sadhLog01;
	private Boolean sadhLog02;
	private Boolean sadhLog03;
	private String sadhQadc01;
	private String sadhQadc02;
	private String sadhQadc03;
	private String sadhQadc04;
	private Date sadhQadt01;
	private Date sadhQadt02;
	private Date sadhQadt03;
	private Double sadhQadd01;
	private Double sadhQadd02;
	private Double sadhQadd03;
	private Boolean sadhPrlistFnd;
	private Boolean sadhQadl02;
	private Boolean sadhQadl03;
	private Boolean sadhMrp;
	private String sadhModUserid;
	private Date sadhModDate;
	private Date sadhPricingDt;
	private Boolean sadhQadl01;
	private Double oidSadhHist;

	// Constructors

	/** default constructor */
	public AbstractSadhHist() {
	}

	/** minimal constructor */
	public AbstractSadhHist(SadhHistId id, Double oidSadhHist) {
		this.id = id;
		this.oidSadhHist = oidSadhHist;
	}

	/** full constructor */
	public AbstractSadhHist(SadhHistId id, String sadhQadc05,
			String sadhAmtType, String sadhArea, Date sadhCancel,
			String sadhCaNbr, String sadhQadc06, Integer sadhCmtindx,
			String sadhComment, String sadhCommPct, Double sadhCrtInt,
			String sadhCustpart, String sadhCycle, String sadhQadc07,
			String sadhQadc08, String sadhDesc, Boolean sadhDiscount,
			Double sadhDiscPct, String sadhQadc09, String sadhQadc10,
			Date sadhEndDate, String sadhEsNbr, String sadhEuNbr,
			Date sadhExpire, Boolean sadhFixPr, String sadhFor,
			Boolean sadhFstList, Date sadhLastbill, Integer sadhLine,
			Double sadhListPr, Date sadhLstcover, Date sadhLstBill,
			String sadhNbr, Date sadhNxtBill, String sadhPart,
			String sadhPctType, Date sadhPerDate, String sadhPrefix,
			Double sadhPrice, Integer sadhPriority, String sadhProdline,
			String sadhProject, String sadhPrList, Boolean sadhPst,
			Boolean sadhPvmBill, String sadhPvmBom, Boolean sadhPvmOnly,
			String sadhPvmRoute, Double sadhQtyBld, Double sadhQtyChg,
			Double sadhQtyItem, Double sadhQtyLitm, Double sadhQtyLst,
			Double sadhQtyPer, Integer sadhRef, String sadhSerial,
			String sadhSite, String sadhSlspsn, Integer sadhSoLine,
			String sadhSoShip, Integer sadhSoShipln, String sadhStatus,
			Double sadhStdCost, Date sadhStCover, Date sadhStDate,
			Boolean sadhTaxable, String sadhTaxc, String sadhTaxEnv,
			Boolean sadhTaxIn, String sadhTaxUsage, Double sadhTotalBld,
			Double sadhTotalPrice, String sadhType, String sadhUm,
			Double sadhUmConv, String sadhUser1, String sadhUser2,
			Double sadhVisits, String sadhChr01, String sadhChr02,
			String sadhChr03, String sadhChr04, String sadhChr05,
			String sadhChr06, String sadhChr07, String sadhChr08,
			String sadhChr09, String sadhChr10, Double sadhDec01,
			Double sadhDec02, Double sadhDec03, Date sadhDte01, Date sadhDte02,
			Date sadhDte03, Boolean sadhLog01, Boolean sadhLog02,
			Boolean sadhLog03, String sadhQadc01, String sadhQadc02,
			String sadhQadc03, String sadhQadc04, Date sadhQadt01,
			Date sadhQadt02, Date sadhQadt03, Double sadhQadd01,
			Double sadhQadd02, Double sadhQadd03, Boolean sadhPrlistFnd,
			Boolean sadhQadl02, Boolean sadhQadl03, Boolean sadhMrp,
			String sadhModUserid, Date sadhModDate, Date sadhPricingDt,
			Boolean sadhQadl01, Double oidSadhHist) {
		this.id = id;
		this.sadhQadc05 = sadhQadc05;
		this.sadhAmtType = sadhAmtType;
		this.sadhArea = sadhArea;
		this.sadhCancel = sadhCancel;
		this.sadhCaNbr = sadhCaNbr;
		this.sadhQadc06 = sadhQadc06;
		this.sadhCmtindx = sadhCmtindx;
		this.sadhComment = sadhComment;
		this.sadhCommPct = sadhCommPct;
		this.sadhCrtInt = sadhCrtInt;
		this.sadhCustpart = sadhCustpart;
		this.sadhCycle = sadhCycle;
		this.sadhQadc07 = sadhQadc07;
		this.sadhQadc08 = sadhQadc08;
		this.sadhDesc = sadhDesc;
		this.sadhDiscount = sadhDiscount;
		this.sadhDiscPct = sadhDiscPct;
		this.sadhQadc09 = sadhQadc09;
		this.sadhQadc10 = sadhQadc10;
		this.sadhEndDate = sadhEndDate;
		this.sadhEsNbr = sadhEsNbr;
		this.sadhEuNbr = sadhEuNbr;
		this.sadhExpire = sadhExpire;
		this.sadhFixPr = sadhFixPr;
		this.sadhFor = sadhFor;
		this.sadhFstList = sadhFstList;
		this.sadhLastbill = sadhLastbill;
		this.sadhLine = sadhLine;
		this.sadhListPr = sadhListPr;
		this.sadhLstcover = sadhLstcover;
		this.sadhLstBill = sadhLstBill;
		this.sadhNbr = sadhNbr;
		this.sadhNxtBill = sadhNxtBill;
		this.sadhPart = sadhPart;
		this.sadhPctType = sadhPctType;
		this.sadhPerDate = sadhPerDate;
		this.sadhPrefix = sadhPrefix;
		this.sadhPrice = sadhPrice;
		this.sadhPriority = sadhPriority;
		this.sadhProdline = sadhProdline;
		this.sadhProject = sadhProject;
		this.sadhPrList = sadhPrList;
		this.sadhPst = sadhPst;
		this.sadhPvmBill = sadhPvmBill;
		this.sadhPvmBom = sadhPvmBom;
		this.sadhPvmOnly = sadhPvmOnly;
		this.sadhPvmRoute = sadhPvmRoute;
		this.sadhQtyBld = sadhQtyBld;
		this.sadhQtyChg = sadhQtyChg;
		this.sadhQtyItem = sadhQtyItem;
		this.sadhQtyLitm = sadhQtyLitm;
		this.sadhQtyLst = sadhQtyLst;
		this.sadhQtyPer = sadhQtyPer;
		this.sadhRef = sadhRef;
		this.sadhSerial = sadhSerial;
		this.sadhSite = sadhSite;
		this.sadhSlspsn = sadhSlspsn;
		this.sadhSoLine = sadhSoLine;
		this.sadhSoShip = sadhSoShip;
		this.sadhSoShipln = sadhSoShipln;
		this.sadhStatus = sadhStatus;
		this.sadhStdCost = sadhStdCost;
		this.sadhStCover = sadhStCover;
		this.sadhStDate = sadhStDate;
		this.sadhTaxable = sadhTaxable;
		this.sadhTaxc = sadhTaxc;
		this.sadhTaxEnv = sadhTaxEnv;
		this.sadhTaxIn = sadhTaxIn;
		this.sadhTaxUsage = sadhTaxUsage;
		this.sadhTotalBld = sadhTotalBld;
		this.sadhTotalPrice = sadhTotalPrice;
		this.sadhType = sadhType;
		this.sadhUm = sadhUm;
		this.sadhUmConv = sadhUmConv;
		this.sadhUser1 = sadhUser1;
		this.sadhUser2 = sadhUser2;
		this.sadhVisits = sadhVisits;
		this.sadhChr01 = sadhChr01;
		this.sadhChr02 = sadhChr02;
		this.sadhChr03 = sadhChr03;
		this.sadhChr04 = sadhChr04;
		this.sadhChr05 = sadhChr05;
		this.sadhChr06 = sadhChr06;
		this.sadhChr07 = sadhChr07;
		this.sadhChr08 = sadhChr08;
		this.sadhChr09 = sadhChr09;
		this.sadhChr10 = sadhChr10;
		this.sadhDec01 = sadhDec01;
		this.sadhDec02 = sadhDec02;
		this.sadhDec03 = sadhDec03;
		this.sadhDte01 = sadhDte01;
		this.sadhDte02 = sadhDte02;
		this.sadhDte03 = sadhDte03;
		this.sadhLog01 = sadhLog01;
		this.sadhLog02 = sadhLog02;
		this.sadhLog03 = sadhLog03;
		this.sadhQadc01 = sadhQadc01;
		this.sadhQadc02 = sadhQadc02;
		this.sadhQadc03 = sadhQadc03;
		this.sadhQadc04 = sadhQadc04;
		this.sadhQadt01 = sadhQadt01;
		this.sadhQadt02 = sadhQadt02;
		this.sadhQadt03 = sadhQadt03;
		this.sadhQadd01 = sadhQadd01;
		this.sadhQadd02 = sadhQadd02;
		this.sadhQadd03 = sadhQadd03;
		this.sadhPrlistFnd = sadhPrlistFnd;
		this.sadhQadl02 = sadhQadl02;
		this.sadhQadl03 = sadhQadl03;
		this.sadhMrp = sadhMrp;
		this.sadhModUserid = sadhModUserid;
		this.sadhModDate = sadhModDate;
		this.sadhPricingDt = sadhPricingDt;
		this.sadhQadl01 = sadhQadl01;
		this.oidSadhHist = oidSadhHist;
	}

	// Property accessors

	public SadhHistId getId() {
		return this.id;
	}

	public void setId(SadhHistId id) {
		this.id = id;
	}

	public String getSadhQadc05() {
		return this.sadhQadc05;
	}

	public void setSadhQadc05(String sadhQadc05) {
		this.sadhQadc05 = sadhQadc05;
	}

	public String getSadhAmtType() {
		return this.sadhAmtType;
	}

	public void setSadhAmtType(String sadhAmtType) {
		this.sadhAmtType = sadhAmtType;
	}

	public String getSadhArea() {
		return this.sadhArea;
	}

	public void setSadhArea(String sadhArea) {
		this.sadhArea = sadhArea;
	}

	public Date getSadhCancel() {
		return this.sadhCancel;
	}

	public void setSadhCancel(Date sadhCancel) {
		this.sadhCancel = sadhCancel;
	}

	public String getSadhCaNbr() {
		return this.sadhCaNbr;
	}

	public void setSadhCaNbr(String sadhCaNbr) {
		this.sadhCaNbr = sadhCaNbr;
	}

	public String getSadhQadc06() {
		return this.sadhQadc06;
	}

	public void setSadhQadc06(String sadhQadc06) {
		this.sadhQadc06 = sadhQadc06;
	}

	public Integer getSadhCmtindx() {
		return this.sadhCmtindx;
	}

	public void setSadhCmtindx(Integer sadhCmtindx) {
		this.sadhCmtindx = sadhCmtindx;
	}

	public String getSadhComment() {
		return this.sadhComment;
	}

	public void setSadhComment(String sadhComment) {
		this.sadhComment = sadhComment;
	}

	public String getSadhCommPct() {
		return this.sadhCommPct;
	}

	public void setSadhCommPct(String sadhCommPct) {
		this.sadhCommPct = sadhCommPct;
	}

	public Double getSadhCrtInt() {
		return this.sadhCrtInt;
	}

	public void setSadhCrtInt(Double sadhCrtInt) {
		this.sadhCrtInt = sadhCrtInt;
	}

	public String getSadhCustpart() {
		return this.sadhCustpart;
	}

	public void setSadhCustpart(String sadhCustpart) {
		this.sadhCustpart = sadhCustpart;
	}

	public String getSadhCycle() {
		return this.sadhCycle;
	}

	public void setSadhCycle(String sadhCycle) {
		this.sadhCycle = sadhCycle;
	}

	public String getSadhQadc07() {
		return this.sadhQadc07;
	}

	public void setSadhQadc07(String sadhQadc07) {
		this.sadhQadc07 = sadhQadc07;
	}

	public String getSadhQadc08() {
		return this.sadhQadc08;
	}

	public void setSadhQadc08(String sadhQadc08) {
		this.sadhQadc08 = sadhQadc08;
	}

	public String getSadhDesc() {
		return this.sadhDesc;
	}

	public void setSadhDesc(String sadhDesc) {
		this.sadhDesc = sadhDesc;
	}

	public Boolean getSadhDiscount() {
		return this.sadhDiscount;
	}

	public void setSadhDiscount(Boolean sadhDiscount) {
		this.sadhDiscount = sadhDiscount;
	}

	public Double getSadhDiscPct() {
		return this.sadhDiscPct;
	}

	public void setSadhDiscPct(Double sadhDiscPct) {
		this.sadhDiscPct = sadhDiscPct;
	}

	public String getSadhQadc09() {
		return this.sadhQadc09;
	}

	public void setSadhQadc09(String sadhQadc09) {
		this.sadhQadc09 = sadhQadc09;
	}

	public String getSadhQadc10() {
		return this.sadhQadc10;
	}

	public void setSadhQadc10(String sadhQadc10) {
		this.sadhQadc10 = sadhQadc10;
	}

	public Date getSadhEndDate() {
		return this.sadhEndDate;
	}

	public void setSadhEndDate(Date sadhEndDate) {
		this.sadhEndDate = sadhEndDate;
	}

	public String getSadhEsNbr() {
		return this.sadhEsNbr;
	}

	public void setSadhEsNbr(String sadhEsNbr) {
		this.sadhEsNbr = sadhEsNbr;
	}

	public String getSadhEuNbr() {
		return this.sadhEuNbr;
	}

	public void setSadhEuNbr(String sadhEuNbr) {
		this.sadhEuNbr = sadhEuNbr;
	}

	public Date getSadhExpire() {
		return this.sadhExpire;
	}

	public void setSadhExpire(Date sadhExpire) {
		this.sadhExpire = sadhExpire;
	}

	public Boolean getSadhFixPr() {
		return this.sadhFixPr;
	}

	public void setSadhFixPr(Boolean sadhFixPr) {
		this.sadhFixPr = sadhFixPr;
	}

	public String getSadhFor() {
		return this.sadhFor;
	}

	public void setSadhFor(String sadhFor) {
		this.sadhFor = sadhFor;
	}

	public Boolean getSadhFstList() {
		return this.sadhFstList;
	}

	public void setSadhFstList(Boolean sadhFstList) {
		this.sadhFstList = sadhFstList;
	}

	public Date getSadhLastbill() {
		return this.sadhLastbill;
	}

	public void setSadhLastbill(Date sadhLastbill) {
		this.sadhLastbill = sadhLastbill;
	}

	public Integer getSadhLine() {
		return this.sadhLine;
	}

	public void setSadhLine(Integer sadhLine) {
		this.sadhLine = sadhLine;
	}

	public Double getSadhListPr() {
		return this.sadhListPr;
	}

	public void setSadhListPr(Double sadhListPr) {
		this.sadhListPr = sadhListPr;
	}

	public Date getSadhLstcover() {
		return this.sadhLstcover;
	}

	public void setSadhLstcover(Date sadhLstcover) {
		this.sadhLstcover = sadhLstcover;
	}

	public Date getSadhLstBill() {
		return this.sadhLstBill;
	}

	public void setSadhLstBill(Date sadhLstBill) {
		this.sadhLstBill = sadhLstBill;
	}

	public String getSadhNbr() {
		return this.sadhNbr;
	}

	public void setSadhNbr(String sadhNbr) {
		this.sadhNbr = sadhNbr;
	}

	public Date getSadhNxtBill() {
		return this.sadhNxtBill;
	}

	public void setSadhNxtBill(Date sadhNxtBill) {
		this.sadhNxtBill = sadhNxtBill;
	}

	public String getSadhPart() {
		return this.sadhPart;
	}

	public void setSadhPart(String sadhPart) {
		this.sadhPart = sadhPart;
	}

	public String getSadhPctType() {
		return this.sadhPctType;
	}

	public void setSadhPctType(String sadhPctType) {
		this.sadhPctType = sadhPctType;
	}

	public Date getSadhPerDate() {
		return this.sadhPerDate;
	}

	public void setSadhPerDate(Date sadhPerDate) {
		this.sadhPerDate = sadhPerDate;
	}

	public String getSadhPrefix() {
		return this.sadhPrefix;
	}

	public void setSadhPrefix(String sadhPrefix) {
		this.sadhPrefix = sadhPrefix;
	}

	public Double getSadhPrice() {
		return this.sadhPrice;
	}

	public void setSadhPrice(Double sadhPrice) {
		this.sadhPrice = sadhPrice;
	}

	public Integer getSadhPriority() {
		return this.sadhPriority;
	}

	public void setSadhPriority(Integer sadhPriority) {
		this.sadhPriority = sadhPriority;
	}

	public String getSadhProdline() {
		return this.sadhProdline;
	}

	public void setSadhProdline(String sadhProdline) {
		this.sadhProdline = sadhProdline;
	}

	public String getSadhProject() {
		return this.sadhProject;
	}

	public void setSadhProject(String sadhProject) {
		this.sadhProject = sadhProject;
	}

	public String getSadhPrList() {
		return this.sadhPrList;
	}

	public void setSadhPrList(String sadhPrList) {
		this.sadhPrList = sadhPrList;
	}

	public Boolean getSadhPst() {
		return this.sadhPst;
	}

	public void setSadhPst(Boolean sadhPst) {
		this.sadhPst = sadhPst;
	}

	public Boolean getSadhPvmBill() {
		return this.sadhPvmBill;
	}

	public void setSadhPvmBill(Boolean sadhPvmBill) {
		this.sadhPvmBill = sadhPvmBill;
	}

	public String getSadhPvmBom() {
		return this.sadhPvmBom;
	}

	public void setSadhPvmBom(String sadhPvmBom) {
		this.sadhPvmBom = sadhPvmBom;
	}

	public Boolean getSadhPvmOnly() {
		return this.sadhPvmOnly;
	}

	public void setSadhPvmOnly(Boolean sadhPvmOnly) {
		this.sadhPvmOnly = sadhPvmOnly;
	}

	public String getSadhPvmRoute() {
		return this.sadhPvmRoute;
	}

	public void setSadhPvmRoute(String sadhPvmRoute) {
		this.sadhPvmRoute = sadhPvmRoute;
	}

	public Double getSadhQtyBld() {
		return this.sadhQtyBld;
	}

	public void setSadhQtyBld(Double sadhQtyBld) {
		this.sadhQtyBld = sadhQtyBld;
	}

	public Double getSadhQtyChg() {
		return this.sadhQtyChg;
	}

	public void setSadhQtyChg(Double sadhQtyChg) {
		this.sadhQtyChg = sadhQtyChg;
	}

	public Double getSadhQtyItem() {
		return this.sadhQtyItem;
	}

	public void setSadhQtyItem(Double sadhQtyItem) {
		this.sadhQtyItem = sadhQtyItem;
	}

	public Double getSadhQtyLitm() {
		return this.sadhQtyLitm;
	}

	public void setSadhQtyLitm(Double sadhQtyLitm) {
		this.sadhQtyLitm = sadhQtyLitm;
	}

	public Double getSadhQtyLst() {
		return this.sadhQtyLst;
	}

	public void setSadhQtyLst(Double sadhQtyLst) {
		this.sadhQtyLst = sadhQtyLst;
	}

	public Double getSadhQtyPer() {
		return this.sadhQtyPer;
	}

	public void setSadhQtyPer(Double sadhQtyPer) {
		this.sadhQtyPer = sadhQtyPer;
	}

	public Integer getSadhRef() {
		return this.sadhRef;
	}

	public void setSadhRef(Integer sadhRef) {
		this.sadhRef = sadhRef;
	}

	public String getSadhSerial() {
		return this.sadhSerial;
	}

	public void setSadhSerial(String sadhSerial) {
		this.sadhSerial = sadhSerial;
	}

	public String getSadhSite() {
		return this.sadhSite;
	}

	public void setSadhSite(String sadhSite) {
		this.sadhSite = sadhSite;
	}

	public String getSadhSlspsn() {
		return this.sadhSlspsn;
	}

	public void setSadhSlspsn(String sadhSlspsn) {
		this.sadhSlspsn = sadhSlspsn;
	}

	public Integer getSadhSoLine() {
		return this.sadhSoLine;
	}

	public void setSadhSoLine(Integer sadhSoLine) {
		this.sadhSoLine = sadhSoLine;
	}

	public String getSadhSoShip() {
		return this.sadhSoShip;
	}

	public void setSadhSoShip(String sadhSoShip) {
		this.sadhSoShip = sadhSoShip;
	}

	public Integer getSadhSoShipln() {
		return this.sadhSoShipln;
	}

	public void setSadhSoShipln(Integer sadhSoShipln) {
		this.sadhSoShipln = sadhSoShipln;
	}

	public String getSadhStatus() {
		return this.sadhStatus;
	}

	public void setSadhStatus(String sadhStatus) {
		this.sadhStatus = sadhStatus;
	}

	public Double getSadhStdCost() {
		return this.sadhStdCost;
	}

	public void setSadhStdCost(Double sadhStdCost) {
		this.sadhStdCost = sadhStdCost;
	}

	public Date getSadhStCover() {
		return this.sadhStCover;
	}

	public void setSadhStCover(Date sadhStCover) {
		this.sadhStCover = sadhStCover;
	}

	public Date getSadhStDate() {
		return this.sadhStDate;
	}

	public void setSadhStDate(Date sadhStDate) {
		this.sadhStDate = sadhStDate;
	}

	public Boolean getSadhTaxable() {
		return this.sadhTaxable;
	}

	public void setSadhTaxable(Boolean sadhTaxable) {
		this.sadhTaxable = sadhTaxable;
	}

	public String getSadhTaxc() {
		return this.sadhTaxc;
	}

	public void setSadhTaxc(String sadhTaxc) {
		this.sadhTaxc = sadhTaxc;
	}

	public String getSadhTaxEnv() {
		return this.sadhTaxEnv;
	}

	public void setSadhTaxEnv(String sadhTaxEnv) {
		this.sadhTaxEnv = sadhTaxEnv;
	}

	public Boolean getSadhTaxIn() {
		return this.sadhTaxIn;
	}

	public void setSadhTaxIn(Boolean sadhTaxIn) {
		this.sadhTaxIn = sadhTaxIn;
	}

	public String getSadhTaxUsage() {
		return this.sadhTaxUsage;
	}

	public void setSadhTaxUsage(String sadhTaxUsage) {
		this.sadhTaxUsage = sadhTaxUsage;
	}

	public Double getSadhTotalBld() {
		return this.sadhTotalBld;
	}

	public void setSadhTotalBld(Double sadhTotalBld) {
		this.sadhTotalBld = sadhTotalBld;
	}

	public Double getSadhTotalPrice() {
		return this.sadhTotalPrice;
	}

	public void setSadhTotalPrice(Double sadhTotalPrice) {
		this.sadhTotalPrice = sadhTotalPrice;
	}

	public String getSadhType() {
		return this.sadhType;
	}

	public void setSadhType(String sadhType) {
		this.sadhType = sadhType;
	}

	public String getSadhUm() {
		return this.sadhUm;
	}

	public void setSadhUm(String sadhUm) {
		this.sadhUm = sadhUm;
	}

	public Double getSadhUmConv() {
		return this.sadhUmConv;
	}

	public void setSadhUmConv(Double sadhUmConv) {
		this.sadhUmConv = sadhUmConv;
	}

	public String getSadhUser1() {
		return this.sadhUser1;
	}

	public void setSadhUser1(String sadhUser1) {
		this.sadhUser1 = sadhUser1;
	}

	public String getSadhUser2() {
		return this.sadhUser2;
	}

	public void setSadhUser2(String sadhUser2) {
		this.sadhUser2 = sadhUser2;
	}

	public Double getSadhVisits() {
		return this.sadhVisits;
	}

	public void setSadhVisits(Double sadhVisits) {
		this.sadhVisits = sadhVisits;
	}

	public String getSadhChr01() {
		return this.sadhChr01;
	}

	public void setSadhChr01(String sadhChr01) {
		this.sadhChr01 = sadhChr01;
	}

	public String getSadhChr02() {
		return this.sadhChr02;
	}

	public void setSadhChr02(String sadhChr02) {
		this.sadhChr02 = sadhChr02;
	}

	public String getSadhChr03() {
		return this.sadhChr03;
	}

	public void setSadhChr03(String sadhChr03) {
		this.sadhChr03 = sadhChr03;
	}

	public String getSadhChr04() {
		return this.sadhChr04;
	}

	public void setSadhChr04(String sadhChr04) {
		this.sadhChr04 = sadhChr04;
	}

	public String getSadhChr05() {
		return this.sadhChr05;
	}

	public void setSadhChr05(String sadhChr05) {
		this.sadhChr05 = sadhChr05;
	}

	public String getSadhChr06() {
		return this.sadhChr06;
	}

	public void setSadhChr06(String sadhChr06) {
		this.sadhChr06 = sadhChr06;
	}

	public String getSadhChr07() {
		return this.sadhChr07;
	}

	public void setSadhChr07(String sadhChr07) {
		this.sadhChr07 = sadhChr07;
	}

	public String getSadhChr08() {
		return this.sadhChr08;
	}

	public void setSadhChr08(String sadhChr08) {
		this.sadhChr08 = sadhChr08;
	}

	public String getSadhChr09() {
		return this.sadhChr09;
	}

	public void setSadhChr09(String sadhChr09) {
		this.sadhChr09 = sadhChr09;
	}

	public String getSadhChr10() {
		return this.sadhChr10;
	}

	public void setSadhChr10(String sadhChr10) {
		this.sadhChr10 = sadhChr10;
	}

	public Double getSadhDec01() {
		return this.sadhDec01;
	}

	public void setSadhDec01(Double sadhDec01) {
		this.sadhDec01 = sadhDec01;
	}

	public Double getSadhDec02() {
		return this.sadhDec02;
	}

	public void setSadhDec02(Double sadhDec02) {
		this.sadhDec02 = sadhDec02;
	}

	public Double getSadhDec03() {
		return this.sadhDec03;
	}

	public void setSadhDec03(Double sadhDec03) {
		this.sadhDec03 = sadhDec03;
	}

	public Date getSadhDte01() {
		return this.sadhDte01;
	}

	public void setSadhDte01(Date sadhDte01) {
		this.sadhDte01 = sadhDte01;
	}

	public Date getSadhDte02() {
		return this.sadhDte02;
	}

	public void setSadhDte02(Date sadhDte02) {
		this.sadhDte02 = sadhDte02;
	}

	public Date getSadhDte03() {
		return this.sadhDte03;
	}

	public void setSadhDte03(Date sadhDte03) {
		this.sadhDte03 = sadhDte03;
	}

	public Boolean getSadhLog01() {
		return this.sadhLog01;
	}

	public void setSadhLog01(Boolean sadhLog01) {
		this.sadhLog01 = sadhLog01;
	}

	public Boolean getSadhLog02() {
		return this.sadhLog02;
	}

	public void setSadhLog02(Boolean sadhLog02) {
		this.sadhLog02 = sadhLog02;
	}

	public Boolean getSadhLog03() {
		return this.sadhLog03;
	}

	public void setSadhLog03(Boolean sadhLog03) {
		this.sadhLog03 = sadhLog03;
	}

	public String getSadhQadc01() {
		return this.sadhQadc01;
	}

	public void setSadhQadc01(String sadhQadc01) {
		this.sadhQadc01 = sadhQadc01;
	}

	public String getSadhQadc02() {
		return this.sadhQadc02;
	}

	public void setSadhQadc02(String sadhQadc02) {
		this.sadhQadc02 = sadhQadc02;
	}

	public String getSadhQadc03() {
		return this.sadhQadc03;
	}

	public void setSadhQadc03(String sadhQadc03) {
		this.sadhQadc03 = sadhQadc03;
	}

	public String getSadhQadc04() {
		return this.sadhQadc04;
	}

	public void setSadhQadc04(String sadhQadc04) {
		this.sadhQadc04 = sadhQadc04;
	}

	public Date getSadhQadt01() {
		return this.sadhQadt01;
	}

	public void setSadhQadt01(Date sadhQadt01) {
		this.sadhQadt01 = sadhQadt01;
	}

	public Date getSadhQadt02() {
		return this.sadhQadt02;
	}

	public void setSadhQadt02(Date sadhQadt02) {
		this.sadhQadt02 = sadhQadt02;
	}

	public Date getSadhQadt03() {
		return this.sadhQadt03;
	}

	public void setSadhQadt03(Date sadhQadt03) {
		this.sadhQadt03 = sadhQadt03;
	}

	public Double getSadhQadd01() {
		return this.sadhQadd01;
	}

	public void setSadhQadd01(Double sadhQadd01) {
		this.sadhQadd01 = sadhQadd01;
	}

	public Double getSadhQadd02() {
		return this.sadhQadd02;
	}

	public void setSadhQadd02(Double sadhQadd02) {
		this.sadhQadd02 = sadhQadd02;
	}

	public Double getSadhQadd03() {
		return this.sadhQadd03;
	}

	public void setSadhQadd03(Double sadhQadd03) {
		this.sadhQadd03 = sadhQadd03;
	}

	public Boolean getSadhPrlistFnd() {
		return this.sadhPrlistFnd;
	}

	public void setSadhPrlistFnd(Boolean sadhPrlistFnd) {
		this.sadhPrlistFnd = sadhPrlistFnd;
	}

	public Boolean getSadhQadl02() {
		return this.sadhQadl02;
	}

	public void setSadhQadl02(Boolean sadhQadl02) {
		this.sadhQadl02 = sadhQadl02;
	}

	public Boolean getSadhQadl03() {
		return this.sadhQadl03;
	}

	public void setSadhQadl03(Boolean sadhQadl03) {
		this.sadhQadl03 = sadhQadl03;
	}

	public Boolean getSadhMrp() {
		return this.sadhMrp;
	}

	public void setSadhMrp(Boolean sadhMrp) {
		this.sadhMrp = sadhMrp;
	}

	public String getSadhModUserid() {
		return this.sadhModUserid;
	}

	public void setSadhModUserid(String sadhModUserid) {
		this.sadhModUserid = sadhModUserid;
	}

	public Date getSadhModDate() {
		return this.sadhModDate;
	}

	public void setSadhModDate(Date sadhModDate) {
		this.sadhModDate = sadhModDate;
	}

	public Date getSadhPricingDt() {
		return this.sadhPricingDt;
	}

	public void setSadhPricingDt(Date sadhPricingDt) {
		this.sadhPricingDt = sadhPricingDt;
	}

	public Boolean getSadhQadl01() {
		return this.sadhQadl01;
	}

	public void setSadhQadl01(Boolean sadhQadl01) {
		this.sadhQadl01 = sadhQadl01;
	}

	public Double getOidSadhHist() {
		return this.oidSadhHist;
	}

	public void setOidSadhHist(Double oidSadhHist) {
		this.oidSadhHist = oidSadhHist;
	}

}