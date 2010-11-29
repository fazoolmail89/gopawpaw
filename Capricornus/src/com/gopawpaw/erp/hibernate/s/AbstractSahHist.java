package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSahHist entity provides the base persistence definition of the
 * SahHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSahHist implements java.io.Serializable {

	// Fields

	private SahHistId id;
	private String sahArea;
	private Boolean sahArrears;
	private String sahQadc05;
	private String sahQadc06;
	private Boolean sahAutornew;
	private Double sahBasePct;
	private Integer sahBillCnt;
	private String sahBillTo;
	private String sahBillType;
	private Boolean sahBlanket;
	private String sahBol;
	private Integer sahCallsAllow;
	private Integer sahCallsTotal;
	private Date sahCancel;
	private Double sahCanTax;
	private String sahChannel;
	private Integer sahCmtindx;
	private String sahXcommPct;
	private Boolean sahComplete;
	private Date sahConfDate;
	private String sahCrCard;
	private String sahCrInit;
	private String sahCrTerms;
	private String sahCurr;
	private String sahCust;
	private String sahCycle;
	private Date sahDatePrinted;
	private Double sahDiscPct;
	private String sahEnduser;
	private Date sahEndDate;
	private Double sahEntEx;
	private Date sahExpDate;
	private Date sahExtDate;
	private Double sahExRate;
	private Boolean sahFixPr;
	private Boolean sahFixRate;
	private String sahFob;
	private Date sahFreeFrm;
	private Date sahFreeTo;
	private String sahFstId;
	private Boolean sahGen0itm;
	private Boolean sahHold;
	private String sahLimitCopy;
	private Boolean sahInvoiced;
	private Date sahInvDate;
	private String sahLang;
	private Date sahLastBill;
	private Date sahLstBill;
	private Date sahLstCover;
	private String sahRenewedFrom;
	private String sahMref;
	private String sahNbr;
	private Double sahNextDur;
	private Date sahNxtBill;
	private String sahOffHoursPt;
	private Date sahOrdDate;
	private Date sahOrigDate;
	private String sahPart;
	private Boolean sahPeriodic;
	private String sahPo;
	private String sahPrefix;
	private Double sahPrepaid;
	private Boolean sahPrint;
	private Boolean sahPrintPl;
	private String sahProdline;
	private Boolean sahPrt0itm;
	private String sahPrList;
	private String sahPrList2;
	private Boolean sahPst;
	private String sahPstId;
	private Double sahQtyPer;
	private Double sahQtyPlst;
	private String sahQuote;
	private Boolean sahQuoteMod;
	private Boolean sahRelease;
	private Date sahRelDate;
	private Date sahRenewalDate;
	private Integer sahRenewCount;
	private Integer sahRenewPeriod;
	private Date sahRevalueDate;
	private Integer sahRevalIndex;
	private Integer sahRevalPeriod;
	private String sahRmks;
	private String sahRsnLost;
	private String sahSahType;
	private Boolean sahSchedule;
	private Boolean sahSchedStart;
	private Boolean sahSerialDet;
	private String sahShipvia;
	private Date sahShipDate;
	private String sahSite;
	private String sahXslspsn;
	private String sahSource;
	private String sahSoNbr;
	private String sahStat;
	private Date sahStCover;
	private Date sahStDate;
	private Boolean sahSummarize;
	private Boolean sahTaxable;
	private String sahTaxc;
	private Date sahTaxDate;
	private String sahTaxEnv;
	private String sahTaxPct;
	private String sahTaxUsage;
	private Double sahTotalBilled;
	private Double sahTotalCost;
	private String sahRenewedTo;
	private Double sahTrl1Amt;
	private String sahTrl1Cd;
	private Double sahTrl2Amt;
	private String sahTrl2Cd;
	private Double sahTrl3Amt;
	private String sahTrl3Cd;
	private String sahType;
	private String sahUm;
	private String sahUser1;
	private String sahUser2;
	private Double sahVisits;
	private String sahChr01;
	private String sahChr02;
	private String sahChr03;
	private String sahChr04;
	private String sahChr05;
	private String sahChr06;
	private String sahChr07;
	private String sahChr08;
	private String sahChr09;
	private String sahChr10;
	private Double sahDec01;
	private Double sahDec02;
	private Double sahDec03;
	private Date sahDte01;
	private Date sahDte02;
	private Date sahDte03;
	private Boolean sahLog01;
	private Boolean sahLog02;
	private Boolean sahLog03;
	private String sahQadc01;
	private String sahQadc02;
	private String sahQadc03;
	private String sahQadc04;
	private Date sahQadt01;
	private Date sahQadt02;
	private Date sahQadt03;
	private Double sahQadd01;
	private Double sahQadd02;
	private Double sahQadd03;
	private Boolean sahQadl01;
	private Boolean sahQadl02;
	private Boolean sahQadl03;
	private String sahCommPct;
	private String sahProject;
	private Boolean sahMrp;
	private String sahModUserid;
	private Date sahModDate;
	private String sahSlspsn;
	private Boolean sahQadl04;
	private Double sahExRate2;
	private String sahExRatetype;
	private Integer sahExruSeq;
	private Double oidSahHist;

	// Constructors

	/** default constructor */
	public AbstractSahHist() {
	}

	/** minimal constructor */
	public AbstractSahHist(SahHistId id, Double sahExRate2,
			String sahExRatetype, Integer sahExruSeq, Double oidSahHist) {
		this.id = id;
		this.sahExRate2 = sahExRate2;
		this.sahExRatetype = sahExRatetype;
		this.sahExruSeq = sahExruSeq;
		this.oidSahHist = oidSahHist;
	}

	/** full constructor */
	public AbstractSahHist(SahHistId id, String sahArea, Boolean sahArrears,
			String sahQadc05, String sahQadc06, Boolean sahAutornew,
			Double sahBasePct, Integer sahBillCnt, String sahBillTo,
			String sahBillType, Boolean sahBlanket, String sahBol,
			Integer sahCallsAllow, Integer sahCallsTotal, Date sahCancel,
			Double sahCanTax, String sahChannel, Integer sahCmtindx,
			String sahXcommPct, Boolean sahComplete, Date sahConfDate,
			String sahCrCard, String sahCrInit, String sahCrTerms,
			String sahCurr, String sahCust, String sahCycle,
			Date sahDatePrinted, Double sahDiscPct, String sahEnduser,
			Date sahEndDate, Double sahEntEx, Date sahExpDate, Date sahExtDate,
			Double sahExRate, Boolean sahFixPr, Boolean sahFixRate,
			String sahFob, Date sahFreeFrm, Date sahFreeTo, String sahFstId,
			Boolean sahGen0itm, Boolean sahHold, String sahLimitCopy,
			Boolean sahInvoiced, Date sahInvDate, String sahLang,
			Date sahLastBill, Date sahLstBill, Date sahLstCover,
			String sahRenewedFrom, String sahMref, String sahNbr,
			Double sahNextDur, Date sahNxtBill, String sahOffHoursPt,
			Date sahOrdDate, Date sahOrigDate, String sahPart,
			Boolean sahPeriodic, String sahPo, String sahPrefix,
			Double sahPrepaid, Boolean sahPrint, Boolean sahPrintPl,
			String sahProdline, Boolean sahPrt0itm, String sahPrList,
			String sahPrList2, Boolean sahPst, String sahPstId,
			Double sahQtyPer, Double sahQtyPlst, String sahQuote,
			Boolean sahQuoteMod, Boolean sahRelease, Date sahRelDate,
			Date sahRenewalDate, Integer sahRenewCount, Integer sahRenewPeriod,
			Date sahRevalueDate, Integer sahRevalIndex, Integer sahRevalPeriod,
			String sahRmks, String sahRsnLost, String sahSahType,
			Boolean sahSchedule, Boolean sahSchedStart, Boolean sahSerialDet,
			String sahShipvia, Date sahShipDate, String sahSite,
			String sahXslspsn, String sahSource, String sahSoNbr,
			String sahStat, Date sahStCover, Date sahStDate,
			Boolean sahSummarize, Boolean sahTaxable, String sahTaxc,
			Date sahTaxDate, String sahTaxEnv, String sahTaxPct,
			String sahTaxUsage, Double sahTotalBilled, Double sahTotalCost,
			String sahRenewedTo, Double sahTrl1Amt, String sahTrl1Cd,
			Double sahTrl2Amt, String sahTrl2Cd, Double sahTrl3Amt,
			String sahTrl3Cd, String sahType, String sahUm, String sahUser1,
			String sahUser2, Double sahVisits, String sahChr01,
			String sahChr02, String sahChr03, String sahChr04, String sahChr05,
			String sahChr06, String sahChr07, String sahChr08, String sahChr09,
			String sahChr10, Double sahDec01, Double sahDec02, Double sahDec03,
			Date sahDte01, Date sahDte02, Date sahDte03, Boolean sahLog01,
			Boolean sahLog02, Boolean sahLog03, String sahQadc01,
			String sahQadc02, String sahQadc03, String sahQadc04,
			Date sahQadt01, Date sahQadt02, Date sahQadt03, Double sahQadd01,
			Double sahQadd02, Double sahQadd03, Boolean sahQadl01,
			Boolean sahQadl02, Boolean sahQadl03, String sahCommPct,
			String sahProject, Boolean sahMrp, String sahModUserid,
			Date sahModDate, String sahSlspsn, Boolean sahQadl04,
			Double sahExRate2, String sahExRatetype, Integer sahExruSeq,
			Double oidSahHist) {
		this.id = id;
		this.sahArea = sahArea;
		this.sahArrears = sahArrears;
		this.sahQadc05 = sahQadc05;
		this.sahQadc06 = sahQadc06;
		this.sahAutornew = sahAutornew;
		this.sahBasePct = sahBasePct;
		this.sahBillCnt = sahBillCnt;
		this.sahBillTo = sahBillTo;
		this.sahBillType = sahBillType;
		this.sahBlanket = sahBlanket;
		this.sahBol = sahBol;
		this.sahCallsAllow = sahCallsAllow;
		this.sahCallsTotal = sahCallsTotal;
		this.sahCancel = sahCancel;
		this.sahCanTax = sahCanTax;
		this.sahChannel = sahChannel;
		this.sahCmtindx = sahCmtindx;
		this.sahXcommPct = sahXcommPct;
		this.sahComplete = sahComplete;
		this.sahConfDate = sahConfDate;
		this.sahCrCard = sahCrCard;
		this.sahCrInit = sahCrInit;
		this.sahCrTerms = sahCrTerms;
		this.sahCurr = sahCurr;
		this.sahCust = sahCust;
		this.sahCycle = sahCycle;
		this.sahDatePrinted = sahDatePrinted;
		this.sahDiscPct = sahDiscPct;
		this.sahEnduser = sahEnduser;
		this.sahEndDate = sahEndDate;
		this.sahEntEx = sahEntEx;
		this.sahExpDate = sahExpDate;
		this.sahExtDate = sahExtDate;
		this.sahExRate = sahExRate;
		this.sahFixPr = sahFixPr;
		this.sahFixRate = sahFixRate;
		this.sahFob = sahFob;
		this.sahFreeFrm = sahFreeFrm;
		this.sahFreeTo = sahFreeTo;
		this.sahFstId = sahFstId;
		this.sahGen0itm = sahGen0itm;
		this.sahHold = sahHold;
		this.sahLimitCopy = sahLimitCopy;
		this.sahInvoiced = sahInvoiced;
		this.sahInvDate = sahInvDate;
		this.sahLang = sahLang;
		this.sahLastBill = sahLastBill;
		this.sahLstBill = sahLstBill;
		this.sahLstCover = sahLstCover;
		this.sahRenewedFrom = sahRenewedFrom;
		this.sahMref = sahMref;
		this.sahNbr = sahNbr;
		this.sahNextDur = sahNextDur;
		this.sahNxtBill = sahNxtBill;
		this.sahOffHoursPt = sahOffHoursPt;
		this.sahOrdDate = sahOrdDate;
		this.sahOrigDate = sahOrigDate;
		this.sahPart = sahPart;
		this.sahPeriodic = sahPeriodic;
		this.sahPo = sahPo;
		this.sahPrefix = sahPrefix;
		this.sahPrepaid = sahPrepaid;
		this.sahPrint = sahPrint;
		this.sahPrintPl = sahPrintPl;
		this.sahProdline = sahProdline;
		this.sahPrt0itm = sahPrt0itm;
		this.sahPrList = sahPrList;
		this.sahPrList2 = sahPrList2;
		this.sahPst = sahPst;
		this.sahPstId = sahPstId;
		this.sahQtyPer = sahQtyPer;
		this.sahQtyPlst = sahQtyPlst;
		this.sahQuote = sahQuote;
		this.sahQuoteMod = sahQuoteMod;
		this.sahRelease = sahRelease;
		this.sahRelDate = sahRelDate;
		this.sahRenewalDate = sahRenewalDate;
		this.sahRenewCount = sahRenewCount;
		this.sahRenewPeriod = sahRenewPeriod;
		this.sahRevalueDate = sahRevalueDate;
		this.sahRevalIndex = sahRevalIndex;
		this.sahRevalPeriod = sahRevalPeriod;
		this.sahRmks = sahRmks;
		this.sahRsnLost = sahRsnLost;
		this.sahSahType = sahSahType;
		this.sahSchedule = sahSchedule;
		this.sahSchedStart = sahSchedStart;
		this.sahSerialDet = sahSerialDet;
		this.sahShipvia = sahShipvia;
		this.sahShipDate = sahShipDate;
		this.sahSite = sahSite;
		this.sahXslspsn = sahXslspsn;
		this.sahSource = sahSource;
		this.sahSoNbr = sahSoNbr;
		this.sahStat = sahStat;
		this.sahStCover = sahStCover;
		this.sahStDate = sahStDate;
		this.sahSummarize = sahSummarize;
		this.sahTaxable = sahTaxable;
		this.sahTaxc = sahTaxc;
		this.sahTaxDate = sahTaxDate;
		this.sahTaxEnv = sahTaxEnv;
		this.sahTaxPct = sahTaxPct;
		this.sahTaxUsage = sahTaxUsage;
		this.sahTotalBilled = sahTotalBilled;
		this.sahTotalCost = sahTotalCost;
		this.sahRenewedTo = sahRenewedTo;
		this.sahTrl1Amt = sahTrl1Amt;
		this.sahTrl1Cd = sahTrl1Cd;
		this.sahTrl2Amt = sahTrl2Amt;
		this.sahTrl2Cd = sahTrl2Cd;
		this.sahTrl3Amt = sahTrl3Amt;
		this.sahTrl3Cd = sahTrl3Cd;
		this.sahType = sahType;
		this.sahUm = sahUm;
		this.sahUser1 = sahUser1;
		this.sahUser2 = sahUser2;
		this.sahVisits = sahVisits;
		this.sahChr01 = sahChr01;
		this.sahChr02 = sahChr02;
		this.sahChr03 = sahChr03;
		this.sahChr04 = sahChr04;
		this.sahChr05 = sahChr05;
		this.sahChr06 = sahChr06;
		this.sahChr07 = sahChr07;
		this.sahChr08 = sahChr08;
		this.sahChr09 = sahChr09;
		this.sahChr10 = sahChr10;
		this.sahDec01 = sahDec01;
		this.sahDec02 = sahDec02;
		this.sahDec03 = sahDec03;
		this.sahDte01 = sahDte01;
		this.sahDte02 = sahDte02;
		this.sahDte03 = sahDte03;
		this.sahLog01 = sahLog01;
		this.sahLog02 = sahLog02;
		this.sahLog03 = sahLog03;
		this.sahQadc01 = sahQadc01;
		this.sahQadc02 = sahQadc02;
		this.sahQadc03 = sahQadc03;
		this.sahQadc04 = sahQadc04;
		this.sahQadt01 = sahQadt01;
		this.sahQadt02 = sahQadt02;
		this.sahQadt03 = sahQadt03;
		this.sahQadd01 = sahQadd01;
		this.sahQadd02 = sahQadd02;
		this.sahQadd03 = sahQadd03;
		this.sahQadl01 = sahQadl01;
		this.sahQadl02 = sahQadl02;
		this.sahQadl03 = sahQadl03;
		this.sahCommPct = sahCommPct;
		this.sahProject = sahProject;
		this.sahMrp = sahMrp;
		this.sahModUserid = sahModUserid;
		this.sahModDate = sahModDate;
		this.sahSlspsn = sahSlspsn;
		this.sahQadl04 = sahQadl04;
		this.sahExRate2 = sahExRate2;
		this.sahExRatetype = sahExRatetype;
		this.sahExruSeq = sahExruSeq;
		this.oidSahHist = oidSahHist;
	}

	// Property accessors

	public SahHistId getId() {
		return this.id;
	}

	public void setId(SahHistId id) {
		this.id = id;
	}

	public String getSahArea() {
		return this.sahArea;
	}

	public void setSahArea(String sahArea) {
		this.sahArea = sahArea;
	}

	public Boolean getSahArrears() {
		return this.sahArrears;
	}

	public void setSahArrears(Boolean sahArrears) {
		this.sahArrears = sahArrears;
	}

	public String getSahQadc05() {
		return this.sahQadc05;
	}

	public void setSahQadc05(String sahQadc05) {
		this.sahQadc05 = sahQadc05;
	}

	public String getSahQadc06() {
		return this.sahQadc06;
	}

	public void setSahQadc06(String sahQadc06) {
		this.sahQadc06 = sahQadc06;
	}

	public Boolean getSahAutornew() {
		return this.sahAutornew;
	}

	public void setSahAutornew(Boolean sahAutornew) {
		this.sahAutornew = sahAutornew;
	}

	public Double getSahBasePct() {
		return this.sahBasePct;
	}

	public void setSahBasePct(Double sahBasePct) {
		this.sahBasePct = sahBasePct;
	}

	public Integer getSahBillCnt() {
		return this.sahBillCnt;
	}

	public void setSahBillCnt(Integer sahBillCnt) {
		this.sahBillCnt = sahBillCnt;
	}

	public String getSahBillTo() {
		return this.sahBillTo;
	}

	public void setSahBillTo(String sahBillTo) {
		this.sahBillTo = sahBillTo;
	}

	public String getSahBillType() {
		return this.sahBillType;
	}

	public void setSahBillType(String sahBillType) {
		this.sahBillType = sahBillType;
	}

	public Boolean getSahBlanket() {
		return this.sahBlanket;
	}

	public void setSahBlanket(Boolean sahBlanket) {
		this.sahBlanket = sahBlanket;
	}

	public String getSahBol() {
		return this.sahBol;
	}

	public void setSahBol(String sahBol) {
		this.sahBol = sahBol;
	}

	public Integer getSahCallsAllow() {
		return this.sahCallsAllow;
	}

	public void setSahCallsAllow(Integer sahCallsAllow) {
		this.sahCallsAllow = sahCallsAllow;
	}

	public Integer getSahCallsTotal() {
		return this.sahCallsTotal;
	}

	public void setSahCallsTotal(Integer sahCallsTotal) {
		this.sahCallsTotal = sahCallsTotal;
	}

	public Date getSahCancel() {
		return this.sahCancel;
	}

	public void setSahCancel(Date sahCancel) {
		this.sahCancel = sahCancel;
	}

	public Double getSahCanTax() {
		return this.sahCanTax;
	}

	public void setSahCanTax(Double sahCanTax) {
		this.sahCanTax = sahCanTax;
	}

	public String getSahChannel() {
		return this.sahChannel;
	}

	public void setSahChannel(String sahChannel) {
		this.sahChannel = sahChannel;
	}

	public Integer getSahCmtindx() {
		return this.sahCmtindx;
	}

	public void setSahCmtindx(Integer sahCmtindx) {
		this.sahCmtindx = sahCmtindx;
	}

	public String getSahXcommPct() {
		return this.sahXcommPct;
	}

	public void setSahXcommPct(String sahXcommPct) {
		this.sahXcommPct = sahXcommPct;
	}

	public Boolean getSahComplete() {
		return this.sahComplete;
	}

	public void setSahComplete(Boolean sahComplete) {
		this.sahComplete = sahComplete;
	}

	public Date getSahConfDate() {
		return this.sahConfDate;
	}

	public void setSahConfDate(Date sahConfDate) {
		this.sahConfDate = sahConfDate;
	}

	public String getSahCrCard() {
		return this.sahCrCard;
	}

	public void setSahCrCard(String sahCrCard) {
		this.sahCrCard = sahCrCard;
	}

	public String getSahCrInit() {
		return this.sahCrInit;
	}

	public void setSahCrInit(String sahCrInit) {
		this.sahCrInit = sahCrInit;
	}

	public String getSahCrTerms() {
		return this.sahCrTerms;
	}

	public void setSahCrTerms(String sahCrTerms) {
		this.sahCrTerms = sahCrTerms;
	}

	public String getSahCurr() {
		return this.sahCurr;
	}

	public void setSahCurr(String sahCurr) {
		this.sahCurr = sahCurr;
	}

	public String getSahCust() {
		return this.sahCust;
	}

	public void setSahCust(String sahCust) {
		this.sahCust = sahCust;
	}

	public String getSahCycle() {
		return this.sahCycle;
	}

	public void setSahCycle(String sahCycle) {
		this.sahCycle = sahCycle;
	}

	public Date getSahDatePrinted() {
		return this.sahDatePrinted;
	}

	public void setSahDatePrinted(Date sahDatePrinted) {
		this.sahDatePrinted = sahDatePrinted;
	}

	public Double getSahDiscPct() {
		return this.sahDiscPct;
	}

	public void setSahDiscPct(Double sahDiscPct) {
		this.sahDiscPct = sahDiscPct;
	}

	public String getSahEnduser() {
		return this.sahEnduser;
	}

	public void setSahEnduser(String sahEnduser) {
		this.sahEnduser = sahEnduser;
	}

	public Date getSahEndDate() {
		return this.sahEndDate;
	}

	public void setSahEndDate(Date sahEndDate) {
		this.sahEndDate = sahEndDate;
	}

	public Double getSahEntEx() {
		return this.sahEntEx;
	}

	public void setSahEntEx(Double sahEntEx) {
		this.sahEntEx = sahEntEx;
	}

	public Date getSahExpDate() {
		return this.sahExpDate;
	}

	public void setSahExpDate(Date sahExpDate) {
		this.sahExpDate = sahExpDate;
	}

	public Date getSahExtDate() {
		return this.sahExtDate;
	}

	public void setSahExtDate(Date sahExtDate) {
		this.sahExtDate = sahExtDate;
	}

	public Double getSahExRate() {
		return this.sahExRate;
	}

	public void setSahExRate(Double sahExRate) {
		this.sahExRate = sahExRate;
	}

	public Boolean getSahFixPr() {
		return this.sahFixPr;
	}

	public void setSahFixPr(Boolean sahFixPr) {
		this.sahFixPr = sahFixPr;
	}

	public Boolean getSahFixRate() {
		return this.sahFixRate;
	}

	public void setSahFixRate(Boolean sahFixRate) {
		this.sahFixRate = sahFixRate;
	}

	public String getSahFob() {
		return this.sahFob;
	}

	public void setSahFob(String sahFob) {
		this.sahFob = sahFob;
	}

	public Date getSahFreeFrm() {
		return this.sahFreeFrm;
	}

	public void setSahFreeFrm(Date sahFreeFrm) {
		this.sahFreeFrm = sahFreeFrm;
	}

	public Date getSahFreeTo() {
		return this.sahFreeTo;
	}

	public void setSahFreeTo(Date sahFreeTo) {
		this.sahFreeTo = sahFreeTo;
	}

	public String getSahFstId() {
		return this.sahFstId;
	}

	public void setSahFstId(String sahFstId) {
		this.sahFstId = sahFstId;
	}

	public Boolean getSahGen0itm() {
		return this.sahGen0itm;
	}

	public void setSahGen0itm(Boolean sahGen0itm) {
		this.sahGen0itm = sahGen0itm;
	}

	public Boolean getSahHold() {
		return this.sahHold;
	}

	public void setSahHold(Boolean sahHold) {
		this.sahHold = sahHold;
	}

	public String getSahLimitCopy() {
		return this.sahLimitCopy;
	}

	public void setSahLimitCopy(String sahLimitCopy) {
		this.sahLimitCopy = sahLimitCopy;
	}

	public Boolean getSahInvoiced() {
		return this.sahInvoiced;
	}

	public void setSahInvoiced(Boolean sahInvoiced) {
		this.sahInvoiced = sahInvoiced;
	}

	public Date getSahInvDate() {
		return this.sahInvDate;
	}

	public void setSahInvDate(Date sahInvDate) {
		this.sahInvDate = sahInvDate;
	}

	public String getSahLang() {
		return this.sahLang;
	}

	public void setSahLang(String sahLang) {
		this.sahLang = sahLang;
	}

	public Date getSahLastBill() {
		return this.sahLastBill;
	}

	public void setSahLastBill(Date sahLastBill) {
		this.sahLastBill = sahLastBill;
	}

	public Date getSahLstBill() {
		return this.sahLstBill;
	}

	public void setSahLstBill(Date sahLstBill) {
		this.sahLstBill = sahLstBill;
	}

	public Date getSahLstCover() {
		return this.sahLstCover;
	}

	public void setSahLstCover(Date sahLstCover) {
		this.sahLstCover = sahLstCover;
	}

	public String getSahRenewedFrom() {
		return this.sahRenewedFrom;
	}

	public void setSahRenewedFrom(String sahRenewedFrom) {
		this.sahRenewedFrom = sahRenewedFrom;
	}

	public String getSahMref() {
		return this.sahMref;
	}

	public void setSahMref(String sahMref) {
		this.sahMref = sahMref;
	}

	public String getSahNbr() {
		return this.sahNbr;
	}

	public void setSahNbr(String sahNbr) {
		this.sahNbr = sahNbr;
	}

	public Double getSahNextDur() {
		return this.sahNextDur;
	}

	public void setSahNextDur(Double sahNextDur) {
		this.sahNextDur = sahNextDur;
	}

	public Date getSahNxtBill() {
		return this.sahNxtBill;
	}

	public void setSahNxtBill(Date sahNxtBill) {
		this.sahNxtBill = sahNxtBill;
	}

	public String getSahOffHoursPt() {
		return this.sahOffHoursPt;
	}

	public void setSahOffHoursPt(String sahOffHoursPt) {
		this.sahOffHoursPt = sahOffHoursPt;
	}

	public Date getSahOrdDate() {
		return this.sahOrdDate;
	}

	public void setSahOrdDate(Date sahOrdDate) {
		this.sahOrdDate = sahOrdDate;
	}

	public Date getSahOrigDate() {
		return this.sahOrigDate;
	}

	public void setSahOrigDate(Date sahOrigDate) {
		this.sahOrigDate = sahOrigDate;
	}

	public String getSahPart() {
		return this.sahPart;
	}

	public void setSahPart(String sahPart) {
		this.sahPart = sahPart;
	}

	public Boolean getSahPeriodic() {
		return this.sahPeriodic;
	}

	public void setSahPeriodic(Boolean sahPeriodic) {
		this.sahPeriodic = sahPeriodic;
	}

	public String getSahPo() {
		return this.sahPo;
	}

	public void setSahPo(String sahPo) {
		this.sahPo = sahPo;
	}

	public String getSahPrefix() {
		return this.sahPrefix;
	}

	public void setSahPrefix(String sahPrefix) {
		this.sahPrefix = sahPrefix;
	}

	public Double getSahPrepaid() {
		return this.sahPrepaid;
	}

	public void setSahPrepaid(Double sahPrepaid) {
		this.sahPrepaid = sahPrepaid;
	}

	public Boolean getSahPrint() {
		return this.sahPrint;
	}

	public void setSahPrint(Boolean sahPrint) {
		this.sahPrint = sahPrint;
	}

	public Boolean getSahPrintPl() {
		return this.sahPrintPl;
	}

	public void setSahPrintPl(Boolean sahPrintPl) {
		this.sahPrintPl = sahPrintPl;
	}

	public String getSahProdline() {
		return this.sahProdline;
	}

	public void setSahProdline(String sahProdline) {
		this.sahProdline = sahProdline;
	}

	public Boolean getSahPrt0itm() {
		return this.sahPrt0itm;
	}

	public void setSahPrt0itm(Boolean sahPrt0itm) {
		this.sahPrt0itm = sahPrt0itm;
	}

	public String getSahPrList() {
		return this.sahPrList;
	}

	public void setSahPrList(String sahPrList) {
		this.sahPrList = sahPrList;
	}

	public String getSahPrList2() {
		return this.sahPrList2;
	}

	public void setSahPrList2(String sahPrList2) {
		this.sahPrList2 = sahPrList2;
	}

	public Boolean getSahPst() {
		return this.sahPst;
	}

	public void setSahPst(Boolean sahPst) {
		this.sahPst = sahPst;
	}

	public String getSahPstId() {
		return this.sahPstId;
	}

	public void setSahPstId(String sahPstId) {
		this.sahPstId = sahPstId;
	}

	public Double getSahQtyPer() {
		return this.sahQtyPer;
	}

	public void setSahQtyPer(Double sahQtyPer) {
		this.sahQtyPer = sahQtyPer;
	}

	public Double getSahQtyPlst() {
		return this.sahQtyPlst;
	}

	public void setSahQtyPlst(Double sahQtyPlst) {
		this.sahQtyPlst = sahQtyPlst;
	}

	public String getSahQuote() {
		return this.sahQuote;
	}

	public void setSahQuote(String sahQuote) {
		this.sahQuote = sahQuote;
	}

	public Boolean getSahQuoteMod() {
		return this.sahQuoteMod;
	}

	public void setSahQuoteMod(Boolean sahQuoteMod) {
		this.sahQuoteMod = sahQuoteMod;
	}

	public Boolean getSahRelease() {
		return this.sahRelease;
	}

	public void setSahRelease(Boolean sahRelease) {
		this.sahRelease = sahRelease;
	}

	public Date getSahRelDate() {
		return this.sahRelDate;
	}

	public void setSahRelDate(Date sahRelDate) {
		this.sahRelDate = sahRelDate;
	}

	public Date getSahRenewalDate() {
		return this.sahRenewalDate;
	}

	public void setSahRenewalDate(Date sahRenewalDate) {
		this.sahRenewalDate = sahRenewalDate;
	}

	public Integer getSahRenewCount() {
		return this.sahRenewCount;
	}

	public void setSahRenewCount(Integer sahRenewCount) {
		this.sahRenewCount = sahRenewCount;
	}

	public Integer getSahRenewPeriod() {
		return this.sahRenewPeriod;
	}

	public void setSahRenewPeriod(Integer sahRenewPeriod) {
		this.sahRenewPeriod = sahRenewPeriod;
	}

	public Date getSahRevalueDate() {
		return this.sahRevalueDate;
	}

	public void setSahRevalueDate(Date sahRevalueDate) {
		this.sahRevalueDate = sahRevalueDate;
	}

	public Integer getSahRevalIndex() {
		return this.sahRevalIndex;
	}

	public void setSahRevalIndex(Integer sahRevalIndex) {
		this.sahRevalIndex = sahRevalIndex;
	}

	public Integer getSahRevalPeriod() {
		return this.sahRevalPeriod;
	}

	public void setSahRevalPeriod(Integer sahRevalPeriod) {
		this.sahRevalPeriod = sahRevalPeriod;
	}

	public String getSahRmks() {
		return this.sahRmks;
	}

	public void setSahRmks(String sahRmks) {
		this.sahRmks = sahRmks;
	}

	public String getSahRsnLost() {
		return this.sahRsnLost;
	}

	public void setSahRsnLost(String sahRsnLost) {
		this.sahRsnLost = sahRsnLost;
	}

	public String getSahSahType() {
		return this.sahSahType;
	}

	public void setSahSahType(String sahSahType) {
		this.sahSahType = sahSahType;
	}

	public Boolean getSahSchedule() {
		return this.sahSchedule;
	}

	public void setSahSchedule(Boolean sahSchedule) {
		this.sahSchedule = sahSchedule;
	}

	public Boolean getSahSchedStart() {
		return this.sahSchedStart;
	}

	public void setSahSchedStart(Boolean sahSchedStart) {
		this.sahSchedStart = sahSchedStart;
	}

	public Boolean getSahSerialDet() {
		return this.sahSerialDet;
	}

	public void setSahSerialDet(Boolean sahSerialDet) {
		this.sahSerialDet = sahSerialDet;
	}

	public String getSahShipvia() {
		return this.sahShipvia;
	}

	public void setSahShipvia(String sahShipvia) {
		this.sahShipvia = sahShipvia;
	}

	public Date getSahShipDate() {
		return this.sahShipDate;
	}

	public void setSahShipDate(Date sahShipDate) {
		this.sahShipDate = sahShipDate;
	}

	public String getSahSite() {
		return this.sahSite;
	}

	public void setSahSite(String sahSite) {
		this.sahSite = sahSite;
	}

	public String getSahXslspsn() {
		return this.sahXslspsn;
	}

	public void setSahXslspsn(String sahXslspsn) {
		this.sahXslspsn = sahXslspsn;
	}

	public String getSahSource() {
		return this.sahSource;
	}

	public void setSahSource(String sahSource) {
		this.sahSource = sahSource;
	}

	public String getSahSoNbr() {
		return this.sahSoNbr;
	}

	public void setSahSoNbr(String sahSoNbr) {
		this.sahSoNbr = sahSoNbr;
	}

	public String getSahStat() {
		return this.sahStat;
	}

	public void setSahStat(String sahStat) {
		this.sahStat = sahStat;
	}

	public Date getSahStCover() {
		return this.sahStCover;
	}

	public void setSahStCover(Date sahStCover) {
		this.sahStCover = sahStCover;
	}

	public Date getSahStDate() {
		return this.sahStDate;
	}

	public void setSahStDate(Date sahStDate) {
		this.sahStDate = sahStDate;
	}

	public Boolean getSahSummarize() {
		return this.sahSummarize;
	}

	public void setSahSummarize(Boolean sahSummarize) {
		this.sahSummarize = sahSummarize;
	}

	public Boolean getSahTaxable() {
		return this.sahTaxable;
	}

	public void setSahTaxable(Boolean sahTaxable) {
		this.sahTaxable = sahTaxable;
	}

	public String getSahTaxc() {
		return this.sahTaxc;
	}

	public void setSahTaxc(String sahTaxc) {
		this.sahTaxc = sahTaxc;
	}

	public Date getSahTaxDate() {
		return this.sahTaxDate;
	}

	public void setSahTaxDate(Date sahTaxDate) {
		this.sahTaxDate = sahTaxDate;
	}

	public String getSahTaxEnv() {
		return this.sahTaxEnv;
	}

	public void setSahTaxEnv(String sahTaxEnv) {
		this.sahTaxEnv = sahTaxEnv;
	}

	public String getSahTaxPct() {
		return this.sahTaxPct;
	}

	public void setSahTaxPct(String sahTaxPct) {
		this.sahTaxPct = sahTaxPct;
	}

	public String getSahTaxUsage() {
		return this.sahTaxUsage;
	}

	public void setSahTaxUsage(String sahTaxUsage) {
		this.sahTaxUsage = sahTaxUsage;
	}

	public Double getSahTotalBilled() {
		return this.sahTotalBilled;
	}

	public void setSahTotalBilled(Double sahTotalBilled) {
		this.sahTotalBilled = sahTotalBilled;
	}

	public Double getSahTotalCost() {
		return this.sahTotalCost;
	}

	public void setSahTotalCost(Double sahTotalCost) {
		this.sahTotalCost = sahTotalCost;
	}

	public String getSahRenewedTo() {
		return this.sahRenewedTo;
	}

	public void setSahRenewedTo(String sahRenewedTo) {
		this.sahRenewedTo = sahRenewedTo;
	}

	public Double getSahTrl1Amt() {
		return this.sahTrl1Amt;
	}

	public void setSahTrl1Amt(Double sahTrl1Amt) {
		this.sahTrl1Amt = sahTrl1Amt;
	}

	public String getSahTrl1Cd() {
		return this.sahTrl1Cd;
	}

	public void setSahTrl1Cd(String sahTrl1Cd) {
		this.sahTrl1Cd = sahTrl1Cd;
	}

	public Double getSahTrl2Amt() {
		return this.sahTrl2Amt;
	}

	public void setSahTrl2Amt(Double sahTrl2Amt) {
		this.sahTrl2Amt = sahTrl2Amt;
	}

	public String getSahTrl2Cd() {
		return this.sahTrl2Cd;
	}

	public void setSahTrl2Cd(String sahTrl2Cd) {
		this.sahTrl2Cd = sahTrl2Cd;
	}

	public Double getSahTrl3Amt() {
		return this.sahTrl3Amt;
	}

	public void setSahTrl3Amt(Double sahTrl3Amt) {
		this.sahTrl3Amt = sahTrl3Amt;
	}

	public String getSahTrl3Cd() {
		return this.sahTrl3Cd;
	}

	public void setSahTrl3Cd(String sahTrl3Cd) {
		this.sahTrl3Cd = sahTrl3Cd;
	}

	public String getSahType() {
		return this.sahType;
	}

	public void setSahType(String sahType) {
		this.sahType = sahType;
	}

	public String getSahUm() {
		return this.sahUm;
	}

	public void setSahUm(String sahUm) {
		this.sahUm = sahUm;
	}

	public String getSahUser1() {
		return this.sahUser1;
	}

	public void setSahUser1(String sahUser1) {
		this.sahUser1 = sahUser1;
	}

	public String getSahUser2() {
		return this.sahUser2;
	}

	public void setSahUser2(String sahUser2) {
		this.sahUser2 = sahUser2;
	}

	public Double getSahVisits() {
		return this.sahVisits;
	}

	public void setSahVisits(Double sahVisits) {
		this.sahVisits = sahVisits;
	}

	public String getSahChr01() {
		return this.sahChr01;
	}

	public void setSahChr01(String sahChr01) {
		this.sahChr01 = sahChr01;
	}

	public String getSahChr02() {
		return this.sahChr02;
	}

	public void setSahChr02(String sahChr02) {
		this.sahChr02 = sahChr02;
	}

	public String getSahChr03() {
		return this.sahChr03;
	}

	public void setSahChr03(String sahChr03) {
		this.sahChr03 = sahChr03;
	}

	public String getSahChr04() {
		return this.sahChr04;
	}

	public void setSahChr04(String sahChr04) {
		this.sahChr04 = sahChr04;
	}

	public String getSahChr05() {
		return this.sahChr05;
	}

	public void setSahChr05(String sahChr05) {
		this.sahChr05 = sahChr05;
	}

	public String getSahChr06() {
		return this.sahChr06;
	}

	public void setSahChr06(String sahChr06) {
		this.sahChr06 = sahChr06;
	}

	public String getSahChr07() {
		return this.sahChr07;
	}

	public void setSahChr07(String sahChr07) {
		this.sahChr07 = sahChr07;
	}

	public String getSahChr08() {
		return this.sahChr08;
	}

	public void setSahChr08(String sahChr08) {
		this.sahChr08 = sahChr08;
	}

	public String getSahChr09() {
		return this.sahChr09;
	}

	public void setSahChr09(String sahChr09) {
		this.sahChr09 = sahChr09;
	}

	public String getSahChr10() {
		return this.sahChr10;
	}

	public void setSahChr10(String sahChr10) {
		this.sahChr10 = sahChr10;
	}

	public Double getSahDec01() {
		return this.sahDec01;
	}

	public void setSahDec01(Double sahDec01) {
		this.sahDec01 = sahDec01;
	}

	public Double getSahDec02() {
		return this.sahDec02;
	}

	public void setSahDec02(Double sahDec02) {
		this.sahDec02 = sahDec02;
	}

	public Double getSahDec03() {
		return this.sahDec03;
	}

	public void setSahDec03(Double sahDec03) {
		this.sahDec03 = sahDec03;
	}

	public Date getSahDte01() {
		return this.sahDte01;
	}

	public void setSahDte01(Date sahDte01) {
		this.sahDte01 = sahDte01;
	}

	public Date getSahDte02() {
		return this.sahDte02;
	}

	public void setSahDte02(Date sahDte02) {
		this.sahDte02 = sahDte02;
	}

	public Date getSahDte03() {
		return this.sahDte03;
	}

	public void setSahDte03(Date sahDte03) {
		this.sahDte03 = sahDte03;
	}

	public Boolean getSahLog01() {
		return this.sahLog01;
	}

	public void setSahLog01(Boolean sahLog01) {
		this.sahLog01 = sahLog01;
	}

	public Boolean getSahLog02() {
		return this.sahLog02;
	}

	public void setSahLog02(Boolean sahLog02) {
		this.sahLog02 = sahLog02;
	}

	public Boolean getSahLog03() {
		return this.sahLog03;
	}

	public void setSahLog03(Boolean sahLog03) {
		this.sahLog03 = sahLog03;
	}

	public String getSahQadc01() {
		return this.sahQadc01;
	}

	public void setSahQadc01(String sahQadc01) {
		this.sahQadc01 = sahQadc01;
	}

	public String getSahQadc02() {
		return this.sahQadc02;
	}

	public void setSahQadc02(String sahQadc02) {
		this.sahQadc02 = sahQadc02;
	}

	public String getSahQadc03() {
		return this.sahQadc03;
	}

	public void setSahQadc03(String sahQadc03) {
		this.sahQadc03 = sahQadc03;
	}

	public String getSahQadc04() {
		return this.sahQadc04;
	}

	public void setSahQadc04(String sahQadc04) {
		this.sahQadc04 = sahQadc04;
	}

	public Date getSahQadt01() {
		return this.sahQadt01;
	}

	public void setSahQadt01(Date sahQadt01) {
		this.sahQadt01 = sahQadt01;
	}

	public Date getSahQadt02() {
		return this.sahQadt02;
	}

	public void setSahQadt02(Date sahQadt02) {
		this.sahQadt02 = sahQadt02;
	}

	public Date getSahQadt03() {
		return this.sahQadt03;
	}

	public void setSahQadt03(Date sahQadt03) {
		this.sahQadt03 = sahQadt03;
	}

	public Double getSahQadd01() {
		return this.sahQadd01;
	}

	public void setSahQadd01(Double sahQadd01) {
		this.sahQadd01 = sahQadd01;
	}

	public Double getSahQadd02() {
		return this.sahQadd02;
	}

	public void setSahQadd02(Double sahQadd02) {
		this.sahQadd02 = sahQadd02;
	}

	public Double getSahQadd03() {
		return this.sahQadd03;
	}

	public void setSahQadd03(Double sahQadd03) {
		this.sahQadd03 = sahQadd03;
	}

	public Boolean getSahQadl01() {
		return this.sahQadl01;
	}

	public void setSahQadl01(Boolean sahQadl01) {
		this.sahQadl01 = sahQadl01;
	}

	public Boolean getSahQadl02() {
		return this.sahQadl02;
	}

	public void setSahQadl02(Boolean sahQadl02) {
		this.sahQadl02 = sahQadl02;
	}

	public Boolean getSahQadl03() {
		return this.sahQadl03;
	}

	public void setSahQadl03(Boolean sahQadl03) {
		this.sahQadl03 = sahQadl03;
	}

	public String getSahCommPct() {
		return this.sahCommPct;
	}

	public void setSahCommPct(String sahCommPct) {
		this.sahCommPct = sahCommPct;
	}

	public String getSahProject() {
		return this.sahProject;
	}

	public void setSahProject(String sahProject) {
		this.sahProject = sahProject;
	}

	public Boolean getSahMrp() {
		return this.sahMrp;
	}

	public void setSahMrp(Boolean sahMrp) {
		this.sahMrp = sahMrp;
	}

	public String getSahModUserid() {
		return this.sahModUserid;
	}

	public void setSahModUserid(String sahModUserid) {
		this.sahModUserid = sahModUserid;
	}

	public Date getSahModDate() {
		return this.sahModDate;
	}

	public void setSahModDate(Date sahModDate) {
		this.sahModDate = sahModDate;
	}

	public String getSahSlspsn() {
		return this.sahSlspsn;
	}

	public void setSahSlspsn(String sahSlspsn) {
		this.sahSlspsn = sahSlspsn;
	}

	public Boolean getSahQadl04() {
		return this.sahQadl04;
	}

	public void setSahQadl04(Boolean sahQadl04) {
		this.sahQadl04 = sahQadl04;
	}

	public Double getSahExRate2() {
		return this.sahExRate2;
	}

	public void setSahExRate2(Double sahExRate2) {
		this.sahExRate2 = sahExRate2;
	}

	public String getSahExRatetype() {
		return this.sahExRatetype;
	}

	public void setSahExRatetype(String sahExRatetype) {
		this.sahExRatetype = sahExRatetype;
	}

	public Integer getSahExruSeq() {
		return this.sahExruSeq;
	}

	public void setSahExruSeq(Integer sahExruSeq) {
		this.sahExruSeq = sahExruSeq;
	}

	public Double getOidSahHist() {
		return this.oidSahHist;
	}

	public void setOidSahHist(Double oidSahHist) {
		this.oidSahHist = oidSahHist;
	}

}