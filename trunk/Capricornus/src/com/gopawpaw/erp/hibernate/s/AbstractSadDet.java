package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSadDet entity provides the base persistence definition of the SadDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSadDet implements java.io.Serializable {

	// Fields

	private SadDetId id;
	private Date sadEndDate;
	private Date sadPerDate;
	private Date sadStDate;
	private String sadSvCode;
	private Double sadQtyItem;
	private Double sadQtyBld;
	private String sadType;
	private Double sadPrice;
	private Double sadStdCost;
	private Double sadQtyChg;
	private String sadAcct;
	private Boolean sadTaxable;
	private String sadSerial;
	private String sadDesc;
	private String sadUm;
	private String sadCc;
	private String sadComment;
	private Double sadUmConv;
	private Double sadDiscPct;
	private String sadProject;
	private Integer sadCmtindx;
	private String sadCustpart;
	private String sadStatus;
	private String sadXslspsn;
	private String sadXcommPct;
	private String sadUser1;
	private String sadUser2;
	private Date sadExpire;
	private String sadTaxc;
	private String sadProdline;
	private Boolean sadTaxIn;
	private Boolean sadFstList;
	private Boolean sadPst;
	private String sadChr01;
	private String sadChr02;
	private String sadChr03;
	private String sadChr04;
	private String sadChr05;
	private String sadChr06;
	private String sadChr07;
	private String sadChr08;
	private String sadChr09;
	private String sadChr10;
	private Date sadDte01;
	private Date sadDte02;
	private Double sadDec01;
	private Double sadDec02;
	private Boolean sadLog01;
	private String sadFor;
	private Double sadListPr;
	private String sadDscAcct;
	private String sadDscCc;
	private String sadPrList;
	private Double sadQtyLst;
	private Date sadLstcover;
	private Date sadLastbill;
	private Integer sadRef;
	private Date sadStCover;
	private Double sadQtyPer;
	private Date sadNxtBill;
	private Double sadQtyLitm;
	private Date sadLstBill;
	private String sadCycle;
	private Date sadCancel;
	private String sadCaNbr;
	private String sadEuNbr;
	private String sadPvmBom;
	private String sadPvmRoute;
	private String sadSite;
	private Double sadVisits;
	private String sadAmtType;
	private String sadPctType;
	private Integer sadPriority;
	private String sadArea;
	private String sadQadc05;
	private String sadQadc06;
	private Boolean sadDiscount;
	private String sadEsNbr;
	private Integer sadSodLine;
	private String sadSoShip;
	private Boolean sadPvmBill;
	private Boolean sadPvmOnly;
	private Integer sadSoShipln;
	private String sadTaxEnv;
	private String sadTaxUsage;
	private Double sadCrtInt;
	private Boolean sadFixPr;
	private Date sadPricingDt;
	private Double sadTotalBld;
	private String sadSlspsn;
	private String sadQadc01;
	private String sadQadc02;
	private String sadQadc03;
	private String sadQadc04;
	private Date sadQadt01;
	private Date sadQadt02;
	private Date sadQadt03;
	private Double sadQadd01;
	private Double sadQadd02;
	private Double sadQadd03;
	private Boolean sadPrlistFnd;
	private Boolean sadQadl02;
	private Boolean sadQadl03;
	private Boolean sadMrp;
	private String sadModUserid;
	private Date sadModDate;
	private String sadCommPct;
	private Boolean sadQadl01;
	private String sadSub;
	private String sadDscSub;
	private String sadDscProject;
	private Boolean sadAccrued;
	private String sadLineType;
	private Integer sadUiLine;
	private Integer sadParentLine;
	private String sadCust;
	private String sadBillTo;
	private Boolean sadBlanketEu;
	private String sadSoNbr;
	private Boolean sadAutorenew;
	private String sadPo;
	private String sadCurr;
	private Integer sadExruSeq;
	private Double sadExRate;
	private Double sadExRate2;
	private String sadExRatetype;
	private Boolean sadFixRate;
	private Boolean sadReleased;
	private String sadRenewedTo;
	private Double oidSadDet;

	// Constructors

	/** default constructor */
	public AbstractSadDet() {
	}

	/** minimal constructor */
	public AbstractSadDet(SadDetId id, String sadEsNbr, Boolean sadAccrued,
			String sadLineType, Integer sadUiLine, Integer sadParentLine,
			String sadCust, String sadBillTo, Boolean sadBlanketEu,
			String sadSoNbr, Boolean sadAutorenew, String sadPo,
			String sadCurr, Integer sadExruSeq, Double sadExRate,
			Double sadExRate2, String sadExRatetype, Boolean sadFixRate,
			Boolean sadReleased, String sadRenewedTo, Double oidSadDet) {
		this.id = id;
		this.sadEsNbr = sadEsNbr;
		this.sadAccrued = sadAccrued;
		this.sadLineType = sadLineType;
		this.sadUiLine = sadUiLine;
		this.sadParentLine = sadParentLine;
		this.sadCust = sadCust;
		this.sadBillTo = sadBillTo;
		this.sadBlanketEu = sadBlanketEu;
		this.sadSoNbr = sadSoNbr;
		this.sadAutorenew = sadAutorenew;
		this.sadPo = sadPo;
		this.sadCurr = sadCurr;
		this.sadExruSeq = sadExruSeq;
		this.sadExRate = sadExRate;
		this.sadExRate2 = sadExRate2;
		this.sadExRatetype = sadExRatetype;
		this.sadFixRate = sadFixRate;
		this.sadReleased = sadReleased;
		this.sadRenewedTo = sadRenewedTo;
		this.oidSadDet = oidSadDet;
	}

	/** full constructor */
	public AbstractSadDet(SadDetId id, Date sadEndDate, Date sadPerDate,
			Date sadStDate, String sadSvCode, Double sadQtyItem,
			Double sadQtyBld, String sadType, Double sadPrice,
			Double sadStdCost, Double sadQtyChg, String sadAcct,
			Boolean sadTaxable, String sadSerial, String sadDesc, String sadUm,
			String sadCc, String sadComment, Double sadUmConv,
			Double sadDiscPct, String sadProject, Integer sadCmtindx,
			String sadCustpart, String sadStatus, String sadXslspsn,
			String sadXcommPct, String sadUser1, String sadUser2,
			Date sadExpire, String sadTaxc, String sadProdline,
			Boolean sadTaxIn, Boolean sadFstList, Boolean sadPst,
			String sadChr01, String sadChr02, String sadChr03, String sadChr04,
			String sadChr05, String sadChr06, String sadChr07, String sadChr08,
			String sadChr09, String sadChr10, Date sadDte01, Date sadDte02,
			Double sadDec01, Double sadDec02, Boolean sadLog01, String sadFor,
			Double sadListPr, String sadDscAcct, String sadDscCc,
			String sadPrList, Double sadQtyLst, Date sadLstcover,
			Date sadLastbill, Integer sadRef, Date sadStCover,
			Double sadQtyPer, Date sadNxtBill, Double sadQtyLitm,
			Date sadLstBill, String sadCycle, Date sadCancel, String sadCaNbr,
			String sadEuNbr, String sadPvmBom, String sadPvmRoute,
			String sadSite, Double sadVisits, String sadAmtType,
			String sadPctType, Integer sadPriority, String sadArea,
			String sadQadc05, String sadQadc06, Boolean sadDiscount,
			String sadEsNbr, Integer sadSodLine, String sadSoShip,
			Boolean sadPvmBill, Boolean sadPvmOnly, Integer sadSoShipln,
			String sadTaxEnv, String sadTaxUsage, Double sadCrtInt,
			Boolean sadFixPr, Date sadPricingDt, Double sadTotalBld,
			String sadSlspsn, String sadQadc01, String sadQadc02,
			String sadQadc03, String sadQadc04, Date sadQadt01, Date sadQadt02,
			Date sadQadt03, Double sadQadd01, Double sadQadd02,
			Double sadQadd03, Boolean sadPrlistFnd, Boolean sadQadl02,
			Boolean sadQadl03, Boolean sadMrp, String sadModUserid,
			Date sadModDate, String sadCommPct, Boolean sadQadl01,
			String sadSub, String sadDscSub, String sadDscProject,
			Boolean sadAccrued, String sadLineType, Integer sadUiLine,
			Integer sadParentLine, String sadCust, String sadBillTo,
			Boolean sadBlanketEu, String sadSoNbr, Boolean sadAutorenew,
			String sadPo, String sadCurr, Integer sadExruSeq, Double sadExRate,
			Double sadExRate2, String sadExRatetype, Boolean sadFixRate,
			Boolean sadReleased, String sadRenewedTo, Double oidSadDet) {
		this.id = id;
		this.sadEndDate = sadEndDate;
		this.sadPerDate = sadPerDate;
		this.sadStDate = sadStDate;
		this.sadSvCode = sadSvCode;
		this.sadQtyItem = sadQtyItem;
		this.sadQtyBld = sadQtyBld;
		this.sadType = sadType;
		this.sadPrice = sadPrice;
		this.sadStdCost = sadStdCost;
		this.sadQtyChg = sadQtyChg;
		this.sadAcct = sadAcct;
		this.sadTaxable = sadTaxable;
		this.sadSerial = sadSerial;
		this.sadDesc = sadDesc;
		this.sadUm = sadUm;
		this.sadCc = sadCc;
		this.sadComment = sadComment;
		this.sadUmConv = sadUmConv;
		this.sadDiscPct = sadDiscPct;
		this.sadProject = sadProject;
		this.sadCmtindx = sadCmtindx;
		this.sadCustpart = sadCustpart;
		this.sadStatus = sadStatus;
		this.sadXslspsn = sadXslspsn;
		this.sadXcommPct = sadXcommPct;
		this.sadUser1 = sadUser1;
		this.sadUser2 = sadUser2;
		this.sadExpire = sadExpire;
		this.sadTaxc = sadTaxc;
		this.sadProdline = sadProdline;
		this.sadTaxIn = sadTaxIn;
		this.sadFstList = sadFstList;
		this.sadPst = sadPst;
		this.sadChr01 = sadChr01;
		this.sadChr02 = sadChr02;
		this.sadChr03 = sadChr03;
		this.sadChr04 = sadChr04;
		this.sadChr05 = sadChr05;
		this.sadChr06 = sadChr06;
		this.sadChr07 = sadChr07;
		this.sadChr08 = sadChr08;
		this.sadChr09 = sadChr09;
		this.sadChr10 = sadChr10;
		this.sadDte01 = sadDte01;
		this.sadDte02 = sadDte02;
		this.sadDec01 = sadDec01;
		this.sadDec02 = sadDec02;
		this.sadLog01 = sadLog01;
		this.sadFor = sadFor;
		this.sadListPr = sadListPr;
		this.sadDscAcct = sadDscAcct;
		this.sadDscCc = sadDscCc;
		this.sadPrList = sadPrList;
		this.sadQtyLst = sadQtyLst;
		this.sadLstcover = sadLstcover;
		this.sadLastbill = sadLastbill;
		this.sadRef = sadRef;
		this.sadStCover = sadStCover;
		this.sadQtyPer = sadQtyPer;
		this.sadNxtBill = sadNxtBill;
		this.sadQtyLitm = sadQtyLitm;
		this.sadLstBill = sadLstBill;
		this.sadCycle = sadCycle;
		this.sadCancel = sadCancel;
		this.sadCaNbr = sadCaNbr;
		this.sadEuNbr = sadEuNbr;
		this.sadPvmBom = sadPvmBom;
		this.sadPvmRoute = sadPvmRoute;
		this.sadSite = sadSite;
		this.sadVisits = sadVisits;
		this.sadAmtType = sadAmtType;
		this.sadPctType = sadPctType;
		this.sadPriority = sadPriority;
		this.sadArea = sadArea;
		this.sadQadc05 = sadQadc05;
		this.sadQadc06 = sadQadc06;
		this.sadDiscount = sadDiscount;
		this.sadEsNbr = sadEsNbr;
		this.sadSodLine = sadSodLine;
		this.sadSoShip = sadSoShip;
		this.sadPvmBill = sadPvmBill;
		this.sadPvmOnly = sadPvmOnly;
		this.sadSoShipln = sadSoShipln;
		this.sadTaxEnv = sadTaxEnv;
		this.sadTaxUsage = sadTaxUsage;
		this.sadCrtInt = sadCrtInt;
		this.sadFixPr = sadFixPr;
		this.sadPricingDt = sadPricingDt;
		this.sadTotalBld = sadTotalBld;
		this.sadSlspsn = sadSlspsn;
		this.sadQadc01 = sadQadc01;
		this.sadQadc02 = sadQadc02;
		this.sadQadc03 = sadQadc03;
		this.sadQadc04 = sadQadc04;
		this.sadQadt01 = sadQadt01;
		this.sadQadt02 = sadQadt02;
		this.sadQadt03 = sadQadt03;
		this.sadQadd01 = sadQadd01;
		this.sadQadd02 = sadQadd02;
		this.sadQadd03 = sadQadd03;
		this.sadPrlistFnd = sadPrlistFnd;
		this.sadQadl02 = sadQadl02;
		this.sadQadl03 = sadQadl03;
		this.sadMrp = sadMrp;
		this.sadModUserid = sadModUserid;
		this.sadModDate = sadModDate;
		this.sadCommPct = sadCommPct;
		this.sadQadl01 = sadQadl01;
		this.sadSub = sadSub;
		this.sadDscSub = sadDscSub;
		this.sadDscProject = sadDscProject;
		this.sadAccrued = sadAccrued;
		this.sadLineType = sadLineType;
		this.sadUiLine = sadUiLine;
		this.sadParentLine = sadParentLine;
		this.sadCust = sadCust;
		this.sadBillTo = sadBillTo;
		this.sadBlanketEu = sadBlanketEu;
		this.sadSoNbr = sadSoNbr;
		this.sadAutorenew = sadAutorenew;
		this.sadPo = sadPo;
		this.sadCurr = sadCurr;
		this.sadExruSeq = sadExruSeq;
		this.sadExRate = sadExRate;
		this.sadExRate2 = sadExRate2;
		this.sadExRatetype = sadExRatetype;
		this.sadFixRate = sadFixRate;
		this.sadReleased = sadReleased;
		this.sadRenewedTo = sadRenewedTo;
		this.oidSadDet = oidSadDet;
	}

	// Property accessors

	public SadDetId getId() {
		return this.id;
	}

	public void setId(SadDetId id) {
		this.id = id;
	}

	public Date getSadEndDate() {
		return this.sadEndDate;
	}

	public void setSadEndDate(Date sadEndDate) {
		this.sadEndDate = sadEndDate;
	}

	public Date getSadPerDate() {
		return this.sadPerDate;
	}

	public void setSadPerDate(Date sadPerDate) {
		this.sadPerDate = sadPerDate;
	}

	public Date getSadStDate() {
		return this.sadStDate;
	}

	public void setSadStDate(Date sadStDate) {
		this.sadStDate = sadStDate;
	}

	public String getSadSvCode() {
		return this.sadSvCode;
	}

	public void setSadSvCode(String sadSvCode) {
		this.sadSvCode = sadSvCode;
	}

	public Double getSadQtyItem() {
		return this.sadQtyItem;
	}

	public void setSadQtyItem(Double sadQtyItem) {
		this.sadQtyItem = sadQtyItem;
	}

	public Double getSadQtyBld() {
		return this.sadQtyBld;
	}

	public void setSadQtyBld(Double sadQtyBld) {
		this.sadQtyBld = sadQtyBld;
	}

	public String getSadType() {
		return this.sadType;
	}

	public void setSadType(String sadType) {
		this.sadType = sadType;
	}

	public Double getSadPrice() {
		return this.sadPrice;
	}

	public void setSadPrice(Double sadPrice) {
		this.sadPrice = sadPrice;
	}

	public Double getSadStdCost() {
		return this.sadStdCost;
	}

	public void setSadStdCost(Double sadStdCost) {
		this.sadStdCost = sadStdCost;
	}

	public Double getSadQtyChg() {
		return this.sadQtyChg;
	}

	public void setSadQtyChg(Double sadQtyChg) {
		this.sadQtyChg = sadQtyChg;
	}

	public String getSadAcct() {
		return this.sadAcct;
	}

	public void setSadAcct(String sadAcct) {
		this.sadAcct = sadAcct;
	}

	public Boolean getSadTaxable() {
		return this.sadTaxable;
	}

	public void setSadTaxable(Boolean sadTaxable) {
		this.sadTaxable = sadTaxable;
	}

	public String getSadSerial() {
		return this.sadSerial;
	}

	public void setSadSerial(String sadSerial) {
		this.sadSerial = sadSerial;
	}

	public String getSadDesc() {
		return this.sadDesc;
	}

	public void setSadDesc(String sadDesc) {
		this.sadDesc = sadDesc;
	}

	public String getSadUm() {
		return this.sadUm;
	}

	public void setSadUm(String sadUm) {
		this.sadUm = sadUm;
	}

	public String getSadCc() {
		return this.sadCc;
	}

	public void setSadCc(String sadCc) {
		this.sadCc = sadCc;
	}

	public String getSadComment() {
		return this.sadComment;
	}

	public void setSadComment(String sadComment) {
		this.sadComment = sadComment;
	}

	public Double getSadUmConv() {
		return this.sadUmConv;
	}

	public void setSadUmConv(Double sadUmConv) {
		this.sadUmConv = sadUmConv;
	}

	public Double getSadDiscPct() {
		return this.sadDiscPct;
	}

	public void setSadDiscPct(Double sadDiscPct) {
		this.sadDiscPct = sadDiscPct;
	}

	public String getSadProject() {
		return this.sadProject;
	}

	public void setSadProject(String sadProject) {
		this.sadProject = sadProject;
	}

	public Integer getSadCmtindx() {
		return this.sadCmtindx;
	}

	public void setSadCmtindx(Integer sadCmtindx) {
		this.sadCmtindx = sadCmtindx;
	}

	public String getSadCustpart() {
		return this.sadCustpart;
	}

	public void setSadCustpart(String sadCustpart) {
		this.sadCustpart = sadCustpart;
	}

	public String getSadStatus() {
		return this.sadStatus;
	}

	public void setSadStatus(String sadStatus) {
		this.sadStatus = sadStatus;
	}

	public String getSadXslspsn() {
		return this.sadXslspsn;
	}

	public void setSadXslspsn(String sadXslspsn) {
		this.sadXslspsn = sadXslspsn;
	}

	public String getSadXcommPct() {
		return this.sadXcommPct;
	}

	public void setSadXcommPct(String sadXcommPct) {
		this.sadXcommPct = sadXcommPct;
	}

	public String getSadUser1() {
		return this.sadUser1;
	}

	public void setSadUser1(String sadUser1) {
		this.sadUser1 = sadUser1;
	}

	public String getSadUser2() {
		return this.sadUser2;
	}

	public void setSadUser2(String sadUser2) {
		this.sadUser2 = sadUser2;
	}

	public Date getSadExpire() {
		return this.sadExpire;
	}

	public void setSadExpire(Date sadExpire) {
		this.sadExpire = sadExpire;
	}

	public String getSadTaxc() {
		return this.sadTaxc;
	}

	public void setSadTaxc(String sadTaxc) {
		this.sadTaxc = sadTaxc;
	}

	public String getSadProdline() {
		return this.sadProdline;
	}

	public void setSadProdline(String sadProdline) {
		this.sadProdline = sadProdline;
	}

	public Boolean getSadTaxIn() {
		return this.sadTaxIn;
	}

	public void setSadTaxIn(Boolean sadTaxIn) {
		this.sadTaxIn = sadTaxIn;
	}

	public Boolean getSadFstList() {
		return this.sadFstList;
	}

	public void setSadFstList(Boolean sadFstList) {
		this.sadFstList = sadFstList;
	}

	public Boolean getSadPst() {
		return this.sadPst;
	}

	public void setSadPst(Boolean sadPst) {
		this.sadPst = sadPst;
	}

	public String getSadChr01() {
		return this.sadChr01;
	}

	public void setSadChr01(String sadChr01) {
		this.sadChr01 = sadChr01;
	}

	public String getSadChr02() {
		return this.sadChr02;
	}

	public void setSadChr02(String sadChr02) {
		this.sadChr02 = sadChr02;
	}

	public String getSadChr03() {
		return this.sadChr03;
	}

	public void setSadChr03(String sadChr03) {
		this.sadChr03 = sadChr03;
	}

	public String getSadChr04() {
		return this.sadChr04;
	}

	public void setSadChr04(String sadChr04) {
		this.sadChr04 = sadChr04;
	}

	public String getSadChr05() {
		return this.sadChr05;
	}

	public void setSadChr05(String sadChr05) {
		this.sadChr05 = sadChr05;
	}

	public String getSadChr06() {
		return this.sadChr06;
	}

	public void setSadChr06(String sadChr06) {
		this.sadChr06 = sadChr06;
	}

	public String getSadChr07() {
		return this.sadChr07;
	}

	public void setSadChr07(String sadChr07) {
		this.sadChr07 = sadChr07;
	}

	public String getSadChr08() {
		return this.sadChr08;
	}

	public void setSadChr08(String sadChr08) {
		this.sadChr08 = sadChr08;
	}

	public String getSadChr09() {
		return this.sadChr09;
	}

	public void setSadChr09(String sadChr09) {
		this.sadChr09 = sadChr09;
	}

	public String getSadChr10() {
		return this.sadChr10;
	}

	public void setSadChr10(String sadChr10) {
		this.sadChr10 = sadChr10;
	}

	public Date getSadDte01() {
		return this.sadDte01;
	}

	public void setSadDte01(Date sadDte01) {
		this.sadDte01 = sadDte01;
	}

	public Date getSadDte02() {
		return this.sadDte02;
	}

	public void setSadDte02(Date sadDte02) {
		this.sadDte02 = sadDte02;
	}

	public Double getSadDec01() {
		return this.sadDec01;
	}

	public void setSadDec01(Double sadDec01) {
		this.sadDec01 = sadDec01;
	}

	public Double getSadDec02() {
		return this.sadDec02;
	}

	public void setSadDec02(Double sadDec02) {
		this.sadDec02 = sadDec02;
	}

	public Boolean getSadLog01() {
		return this.sadLog01;
	}

	public void setSadLog01(Boolean sadLog01) {
		this.sadLog01 = sadLog01;
	}

	public String getSadFor() {
		return this.sadFor;
	}

	public void setSadFor(String sadFor) {
		this.sadFor = sadFor;
	}

	public Double getSadListPr() {
		return this.sadListPr;
	}

	public void setSadListPr(Double sadListPr) {
		this.sadListPr = sadListPr;
	}

	public String getSadDscAcct() {
		return this.sadDscAcct;
	}

	public void setSadDscAcct(String sadDscAcct) {
		this.sadDscAcct = sadDscAcct;
	}

	public String getSadDscCc() {
		return this.sadDscCc;
	}

	public void setSadDscCc(String sadDscCc) {
		this.sadDscCc = sadDscCc;
	}

	public String getSadPrList() {
		return this.sadPrList;
	}

	public void setSadPrList(String sadPrList) {
		this.sadPrList = sadPrList;
	}

	public Double getSadQtyLst() {
		return this.sadQtyLst;
	}

	public void setSadQtyLst(Double sadQtyLst) {
		this.sadQtyLst = sadQtyLst;
	}

	public Date getSadLstcover() {
		return this.sadLstcover;
	}

	public void setSadLstcover(Date sadLstcover) {
		this.sadLstcover = sadLstcover;
	}

	public Date getSadLastbill() {
		return this.sadLastbill;
	}

	public void setSadLastbill(Date sadLastbill) {
		this.sadLastbill = sadLastbill;
	}

	public Integer getSadRef() {
		return this.sadRef;
	}

	public void setSadRef(Integer sadRef) {
		this.sadRef = sadRef;
	}

	public Date getSadStCover() {
		return this.sadStCover;
	}

	public void setSadStCover(Date sadStCover) {
		this.sadStCover = sadStCover;
	}

	public Double getSadQtyPer() {
		return this.sadQtyPer;
	}

	public void setSadQtyPer(Double sadQtyPer) {
		this.sadQtyPer = sadQtyPer;
	}

	public Date getSadNxtBill() {
		return this.sadNxtBill;
	}

	public void setSadNxtBill(Date sadNxtBill) {
		this.sadNxtBill = sadNxtBill;
	}

	public Double getSadQtyLitm() {
		return this.sadQtyLitm;
	}

	public void setSadQtyLitm(Double sadQtyLitm) {
		this.sadQtyLitm = sadQtyLitm;
	}

	public Date getSadLstBill() {
		return this.sadLstBill;
	}

	public void setSadLstBill(Date sadLstBill) {
		this.sadLstBill = sadLstBill;
	}

	public String getSadCycle() {
		return this.sadCycle;
	}

	public void setSadCycle(String sadCycle) {
		this.sadCycle = sadCycle;
	}

	public Date getSadCancel() {
		return this.sadCancel;
	}

	public void setSadCancel(Date sadCancel) {
		this.sadCancel = sadCancel;
	}

	public String getSadCaNbr() {
		return this.sadCaNbr;
	}

	public void setSadCaNbr(String sadCaNbr) {
		this.sadCaNbr = sadCaNbr;
	}

	public String getSadEuNbr() {
		return this.sadEuNbr;
	}

	public void setSadEuNbr(String sadEuNbr) {
		this.sadEuNbr = sadEuNbr;
	}

	public String getSadPvmBom() {
		return this.sadPvmBom;
	}

	public void setSadPvmBom(String sadPvmBom) {
		this.sadPvmBom = sadPvmBom;
	}

	public String getSadPvmRoute() {
		return this.sadPvmRoute;
	}

	public void setSadPvmRoute(String sadPvmRoute) {
		this.sadPvmRoute = sadPvmRoute;
	}

	public String getSadSite() {
		return this.sadSite;
	}

	public void setSadSite(String sadSite) {
		this.sadSite = sadSite;
	}

	public Double getSadVisits() {
		return this.sadVisits;
	}

	public void setSadVisits(Double sadVisits) {
		this.sadVisits = sadVisits;
	}

	public String getSadAmtType() {
		return this.sadAmtType;
	}

	public void setSadAmtType(String sadAmtType) {
		this.sadAmtType = sadAmtType;
	}

	public String getSadPctType() {
		return this.sadPctType;
	}

	public void setSadPctType(String sadPctType) {
		this.sadPctType = sadPctType;
	}

	public Integer getSadPriority() {
		return this.sadPriority;
	}

	public void setSadPriority(Integer sadPriority) {
		this.sadPriority = sadPriority;
	}

	public String getSadArea() {
		return this.sadArea;
	}

	public void setSadArea(String sadArea) {
		this.sadArea = sadArea;
	}

	public String getSadQadc05() {
		return this.sadQadc05;
	}

	public void setSadQadc05(String sadQadc05) {
		this.sadQadc05 = sadQadc05;
	}

	public String getSadQadc06() {
		return this.sadQadc06;
	}

	public void setSadQadc06(String sadQadc06) {
		this.sadQadc06 = sadQadc06;
	}

	public Boolean getSadDiscount() {
		return this.sadDiscount;
	}

	public void setSadDiscount(Boolean sadDiscount) {
		this.sadDiscount = sadDiscount;
	}

	public String getSadEsNbr() {
		return this.sadEsNbr;
	}

	public void setSadEsNbr(String sadEsNbr) {
		this.sadEsNbr = sadEsNbr;
	}

	public Integer getSadSodLine() {
		return this.sadSodLine;
	}

	public void setSadSodLine(Integer sadSodLine) {
		this.sadSodLine = sadSodLine;
	}

	public String getSadSoShip() {
		return this.sadSoShip;
	}

	public void setSadSoShip(String sadSoShip) {
		this.sadSoShip = sadSoShip;
	}

	public Boolean getSadPvmBill() {
		return this.sadPvmBill;
	}

	public void setSadPvmBill(Boolean sadPvmBill) {
		this.sadPvmBill = sadPvmBill;
	}

	public Boolean getSadPvmOnly() {
		return this.sadPvmOnly;
	}

	public void setSadPvmOnly(Boolean sadPvmOnly) {
		this.sadPvmOnly = sadPvmOnly;
	}

	public Integer getSadSoShipln() {
		return this.sadSoShipln;
	}

	public void setSadSoShipln(Integer sadSoShipln) {
		this.sadSoShipln = sadSoShipln;
	}

	public String getSadTaxEnv() {
		return this.sadTaxEnv;
	}

	public void setSadTaxEnv(String sadTaxEnv) {
		this.sadTaxEnv = sadTaxEnv;
	}

	public String getSadTaxUsage() {
		return this.sadTaxUsage;
	}

	public void setSadTaxUsage(String sadTaxUsage) {
		this.sadTaxUsage = sadTaxUsage;
	}

	public Double getSadCrtInt() {
		return this.sadCrtInt;
	}

	public void setSadCrtInt(Double sadCrtInt) {
		this.sadCrtInt = sadCrtInt;
	}

	public Boolean getSadFixPr() {
		return this.sadFixPr;
	}

	public void setSadFixPr(Boolean sadFixPr) {
		this.sadFixPr = sadFixPr;
	}

	public Date getSadPricingDt() {
		return this.sadPricingDt;
	}

	public void setSadPricingDt(Date sadPricingDt) {
		this.sadPricingDt = sadPricingDt;
	}

	public Double getSadTotalBld() {
		return this.sadTotalBld;
	}

	public void setSadTotalBld(Double sadTotalBld) {
		this.sadTotalBld = sadTotalBld;
	}

	public String getSadSlspsn() {
		return this.sadSlspsn;
	}

	public void setSadSlspsn(String sadSlspsn) {
		this.sadSlspsn = sadSlspsn;
	}

	public String getSadQadc01() {
		return this.sadQadc01;
	}

	public void setSadQadc01(String sadQadc01) {
		this.sadQadc01 = sadQadc01;
	}

	public String getSadQadc02() {
		return this.sadQadc02;
	}

	public void setSadQadc02(String sadQadc02) {
		this.sadQadc02 = sadQadc02;
	}

	public String getSadQadc03() {
		return this.sadQadc03;
	}

	public void setSadQadc03(String sadQadc03) {
		this.sadQadc03 = sadQadc03;
	}

	public String getSadQadc04() {
		return this.sadQadc04;
	}

	public void setSadQadc04(String sadQadc04) {
		this.sadQadc04 = sadQadc04;
	}

	public Date getSadQadt01() {
		return this.sadQadt01;
	}

	public void setSadQadt01(Date sadQadt01) {
		this.sadQadt01 = sadQadt01;
	}

	public Date getSadQadt02() {
		return this.sadQadt02;
	}

	public void setSadQadt02(Date sadQadt02) {
		this.sadQadt02 = sadQadt02;
	}

	public Date getSadQadt03() {
		return this.sadQadt03;
	}

	public void setSadQadt03(Date sadQadt03) {
		this.sadQadt03 = sadQadt03;
	}

	public Double getSadQadd01() {
		return this.sadQadd01;
	}

	public void setSadQadd01(Double sadQadd01) {
		this.sadQadd01 = sadQadd01;
	}

	public Double getSadQadd02() {
		return this.sadQadd02;
	}

	public void setSadQadd02(Double sadQadd02) {
		this.sadQadd02 = sadQadd02;
	}

	public Double getSadQadd03() {
		return this.sadQadd03;
	}

	public void setSadQadd03(Double sadQadd03) {
		this.sadQadd03 = sadQadd03;
	}

	public Boolean getSadPrlistFnd() {
		return this.sadPrlistFnd;
	}

	public void setSadPrlistFnd(Boolean sadPrlistFnd) {
		this.sadPrlistFnd = sadPrlistFnd;
	}

	public Boolean getSadQadl02() {
		return this.sadQadl02;
	}

	public void setSadQadl02(Boolean sadQadl02) {
		this.sadQadl02 = sadQadl02;
	}

	public Boolean getSadQadl03() {
		return this.sadQadl03;
	}

	public void setSadQadl03(Boolean sadQadl03) {
		this.sadQadl03 = sadQadl03;
	}

	public Boolean getSadMrp() {
		return this.sadMrp;
	}

	public void setSadMrp(Boolean sadMrp) {
		this.sadMrp = sadMrp;
	}

	public String getSadModUserid() {
		return this.sadModUserid;
	}

	public void setSadModUserid(String sadModUserid) {
		this.sadModUserid = sadModUserid;
	}

	public Date getSadModDate() {
		return this.sadModDate;
	}

	public void setSadModDate(Date sadModDate) {
		this.sadModDate = sadModDate;
	}

	public String getSadCommPct() {
		return this.sadCommPct;
	}

	public void setSadCommPct(String sadCommPct) {
		this.sadCommPct = sadCommPct;
	}

	public Boolean getSadQadl01() {
		return this.sadQadl01;
	}

	public void setSadQadl01(Boolean sadQadl01) {
		this.sadQadl01 = sadQadl01;
	}

	public String getSadSub() {
		return this.sadSub;
	}

	public void setSadSub(String sadSub) {
		this.sadSub = sadSub;
	}

	public String getSadDscSub() {
		return this.sadDscSub;
	}

	public void setSadDscSub(String sadDscSub) {
		this.sadDscSub = sadDscSub;
	}

	public String getSadDscProject() {
		return this.sadDscProject;
	}

	public void setSadDscProject(String sadDscProject) {
		this.sadDscProject = sadDscProject;
	}

	public Boolean getSadAccrued() {
		return this.sadAccrued;
	}

	public void setSadAccrued(Boolean sadAccrued) {
		this.sadAccrued = sadAccrued;
	}

	public String getSadLineType() {
		return this.sadLineType;
	}

	public void setSadLineType(String sadLineType) {
		this.sadLineType = sadLineType;
	}

	public Integer getSadUiLine() {
		return this.sadUiLine;
	}

	public void setSadUiLine(Integer sadUiLine) {
		this.sadUiLine = sadUiLine;
	}

	public Integer getSadParentLine() {
		return this.sadParentLine;
	}

	public void setSadParentLine(Integer sadParentLine) {
		this.sadParentLine = sadParentLine;
	}

	public String getSadCust() {
		return this.sadCust;
	}

	public void setSadCust(String sadCust) {
		this.sadCust = sadCust;
	}

	public String getSadBillTo() {
		return this.sadBillTo;
	}

	public void setSadBillTo(String sadBillTo) {
		this.sadBillTo = sadBillTo;
	}

	public Boolean getSadBlanketEu() {
		return this.sadBlanketEu;
	}

	public void setSadBlanketEu(Boolean sadBlanketEu) {
		this.sadBlanketEu = sadBlanketEu;
	}

	public String getSadSoNbr() {
		return this.sadSoNbr;
	}

	public void setSadSoNbr(String sadSoNbr) {
		this.sadSoNbr = sadSoNbr;
	}

	public Boolean getSadAutorenew() {
		return this.sadAutorenew;
	}

	public void setSadAutorenew(Boolean sadAutorenew) {
		this.sadAutorenew = sadAutorenew;
	}

	public String getSadPo() {
		return this.sadPo;
	}

	public void setSadPo(String sadPo) {
		this.sadPo = sadPo;
	}

	public String getSadCurr() {
		return this.sadCurr;
	}

	public void setSadCurr(String sadCurr) {
		this.sadCurr = sadCurr;
	}

	public Integer getSadExruSeq() {
		return this.sadExruSeq;
	}

	public void setSadExruSeq(Integer sadExruSeq) {
		this.sadExruSeq = sadExruSeq;
	}

	public Double getSadExRate() {
		return this.sadExRate;
	}

	public void setSadExRate(Double sadExRate) {
		this.sadExRate = sadExRate;
	}

	public Double getSadExRate2() {
		return this.sadExRate2;
	}

	public void setSadExRate2(Double sadExRate2) {
		this.sadExRate2 = sadExRate2;
	}

	public String getSadExRatetype() {
		return this.sadExRatetype;
	}

	public void setSadExRatetype(String sadExRatetype) {
		this.sadExRatetype = sadExRatetype;
	}

	public Boolean getSadFixRate() {
		return this.sadFixRate;
	}

	public void setSadFixRate(Boolean sadFixRate) {
		this.sadFixRate = sadFixRate;
	}

	public Boolean getSadReleased() {
		return this.sadReleased;
	}

	public void setSadReleased(Boolean sadReleased) {
		this.sadReleased = sadReleased;
	}

	public String getSadRenewedTo() {
		return this.sadRenewedTo;
	}

	public void setSadRenewedTo(String sadRenewedTo) {
		this.sadRenewedTo = sadRenewedTo;
	}

	public Double getOidSadDet() {
		return this.oidSadDet;
	}

	public void setOidSadDet(Double oidSadDet) {
		this.oidSadDet = oidSadDet;
	}

}