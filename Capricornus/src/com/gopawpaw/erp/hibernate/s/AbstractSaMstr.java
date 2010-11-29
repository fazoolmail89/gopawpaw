package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSaMstr entity provides the base persistence definition of the SaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSaMstr implements java.io.Serializable {

	// Fields

	private SaMstrId id;
	private String saCust;
	private String saEnduser;
	private Date saOrdDate;
	private Date saStDate;
	private Date saEndDate;
	private String saRmks;
	private String saCrTerms;
	private String saFob;
	private String saPo;
	private String saShipvia;
	private Boolean saPrint;
	private String saPrList;
	private String saQadc05;
	private String saSource;
	private String saXcommPct;
	private String saCrCard;
	private Boolean saPrintPl;
	private String saCrInit;
	private String saStat;
	private Double saDiscPct;
	private String saTaxPct;
	private Double saPrepaid;
	private Boolean saInvoiced;
	private String saArAcct;
	private String saArCc;
	private Date saInvDate;
	private Date saShipDate;
	private Boolean saTaxable;
	private Integer saCmtindx;
	private String saUser1;
	private String saUser2;
	private String saCurr;
	private Double saExRate;
	private String saLang;
	private String saType;
	private Date saConfDate;
	private String saBol;
	private Boolean saPst;
	private String saFstId;
	private Double saTrl1Amt;
	private String saTrl1Cd;
	private Double saTrl2Amt;
	private String saTrl2Cd;
	private Double saTrl3Amt;
	private String saTrl3Cd;
	private String saPstId;
	private String saQuote;
	private String saTaxc;
	private String saChr01;
	private String saChr02;
	private String saChr03;
	private String saChr04;
	private String saChr05;
	private String saChr06;
	private String saChr07;
	private String saChr08;
	private String saChr09;
	private String saChr10;
	private Date saDte01;
	private Date saDte02;
	private Double saDec01;
	private Double saDec02;
	private Boolean saLog01;
	private String saSvCode;
	private Date saLastBill;
	private Date saNxtBill;
	private Date saRelDate;
	private Boolean saRelease;
	private String saUm;
	private String saCycle;
	private Date saExpDate;
	private Boolean saComplete;
	private Integer saBillCnt;
	private String saSoNbr;
	private String saProdline;
	private String saMref;
	private Date saLstCover;
	private Boolean saAutornew;
	private Date saExtDate;
	private Boolean saArrears;
	private Boolean saHold;
	private Date saStCover;
	private Double saQtyPer;
	private Double saQtyPlst;
	private Date saLstBill;
	private Double saCanTax;
	private Date saFreeFrm;
	private Date saFreeTo;
	private Date saCancel;
	private String saSite;
	private String saBillTo;
	private String saArea;
	private Boolean saBlanket;
	private String saChannel;
	private Date saDatePrinted;
	private Boolean saGen0itm;
	private Date saOrigDate;
	private Boolean saPrt0itm;
	private Boolean saQuoteMod;
	private String saRsnLost;
	private String saSaType;
	private String saBillType;
	private Boolean saSchedStart;
	private Boolean saSerialDet;
	private Boolean saSummarize;
	private Double saVisits;
	private Date saTaxDate;
	private Double saEntEx;
	private String saOffHoursPt;
	private String saTaxEnv;
	private String saTaxUsage;
	private String saPrList2;
	private Boolean saFixRate;
	private Boolean saFixPr;
	private String saCommPct;
	private String saSlspsn;
	private Double saBasePct;
	private String saLimitCopy;
	private Integer saCallsAllow;
	private Integer saCallsTotal;
	private Integer saRevalPeriod;
	private Double saDec03;
	private Double saNextDur;
	private Boolean saPeriodic;
	private Date saRenewalDate;
	private Integer saRenewCount;
	private Integer saRenewPeriods;
	private Date saRevalueDate;
	private Integer saRevalIndex;
	private Boolean saQadl04;
	private Boolean saSchedule;
	private Double saTotalBilled;
	private Double saTotalCost;
	private Date saDte03;
	private String saQadc01;
	private String saQadc02;
	private String saQadc03;
	private String saQadc04;
	private Date saQadt01;
	private Date saQadt02;
	private Date saQadt03;
	private Double saQadd01;
	private Double saQadd02;
	private Double saQadd03;
	private Boolean saQadl01;
	private Boolean saQadl02;
	private Boolean saQadl03;
	private String saProject;
	private Boolean saMrp;
	private String saModUserid;
	private Date saModDate;
	private String saRenewedFrom;
	private String saRenewedTo;
	private Boolean saLog02;
	private Boolean saLog03;
	private Double saExRate2;
	private String saExRatetype;
	private Integer saExruSeq;
	private String saArSub;
	private String saCallPrice;
	private String saRevenue;
	private String saFsaccrAcct;
	private String saFsaccrSub;
	private String saFsaccrCc;
	private String saFsdefAcct;
	private String saFsdefSub;
	private String saFsdefCc;
	private Boolean saBillEnduser;
	private Boolean saBillSummary;
	private Boolean saItemEnduser;
	private Boolean saPerBill;
	private Boolean saProrate;
	private Double oidSaMstr;

	// Constructors

	/** default constructor */
	public AbstractSaMstr() {
	}

	/** minimal constructor */
	public AbstractSaMstr(SaMstrId id, String saRsnLost, Double saExRate2,
			String saExRatetype, Integer saExruSeq, String saCallPrice,
			String saRevenue, String saFsaccrAcct, String saFsaccrSub,
			String saFsaccrCc, String saFsdefAcct, String saFsdefSub,
			String saFsdefCc, Boolean saBillEnduser, Boolean saBillSummary,
			Boolean saItemEnduser, Boolean saPerBill, Boolean saProrate,
			Double oidSaMstr) {
		this.id = id;
		this.saRsnLost = saRsnLost;
		this.saExRate2 = saExRate2;
		this.saExRatetype = saExRatetype;
		this.saExruSeq = saExruSeq;
		this.saCallPrice = saCallPrice;
		this.saRevenue = saRevenue;
		this.saFsaccrAcct = saFsaccrAcct;
		this.saFsaccrSub = saFsaccrSub;
		this.saFsaccrCc = saFsaccrCc;
		this.saFsdefAcct = saFsdefAcct;
		this.saFsdefSub = saFsdefSub;
		this.saFsdefCc = saFsdefCc;
		this.saBillEnduser = saBillEnduser;
		this.saBillSummary = saBillSummary;
		this.saItemEnduser = saItemEnduser;
		this.saPerBill = saPerBill;
		this.saProrate = saProrate;
		this.oidSaMstr = oidSaMstr;
	}

	/** full constructor */
	public AbstractSaMstr(SaMstrId id, String saCust, String saEnduser,
			Date saOrdDate, Date saStDate, Date saEndDate, String saRmks,
			String saCrTerms, String saFob, String saPo, String saShipvia,
			Boolean saPrint, String saPrList, String saQadc05, String saSource,
			String saXcommPct, String saCrCard, Boolean saPrintPl,
			String saCrInit, String saStat, Double saDiscPct, String saTaxPct,
			Double saPrepaid, Boolean saInvoiced, String saArAcct,
			String saArCc, Date saInvDate, Date saShipDate, Boolean saTaxable,
			Integer saCmtindx, String saUser1, String saUser2, String saCurr,
			Double saExRate, String saLang, String saType, Date saConfDate,
			String saBol, Boolean saPst, String saFstId, Double saTrl1Amt,
			String saTrl1Cd, Double saTrl2Amt, String saTrl2Cd,
			Double saTrl3Amt, String saTrl3Cd, String saPstId, String saQuote,
			String saTaxc, String saChr01, String saChr02, String saChr03,
			String saChr04, String saChr05, String saChr06, String saChr07,
			String saChr08, String saChr09, String saChr10, Date saDte01,
			Date saDte02, Double saDec01, Double saDec02, Boolean saLog01,
			String saSvCode, Date saLastBill, Date saNxtBill, Date saRelDate,
			Boolean saRelease, String saUm, String saCycle, Date saExpDate,
			Boolean saComplete, Integer saBillCnt, String saSoNbr,
			String saProdline, String saMref, Date saLstCover,
			Boolean saAutornew, Date saExtDate, Boolean saArrears,
			Boolean saHold, Date saStCover, Double saQtyPer, Double saQtyPlst,
			Date saLstBill, Double saCanTax, Date saFreeFrm, Date saFreeTo,
			Date saCancel, String saSite, String saBillTo, String saArea,
			Boolean saBlanket, String saChannel, Date saDatePrinted,
			Boolean saGen0itm, Date saOrigDate, Boolean saPrt0itm,
			Boolean saQuoteMod, String saRsnLost, String saSaType,
			String saBillType, Boolean saSchedStart, Boolean saSerialDet,
			Boolean saSummarize, Double saVisits, Date saTaxDate,
			Double saEntEx, String saOffHoursPt, String saTaxEnv,
			String saTaxUsage, String saPrList2, Boolean saFixRate,
			Boolean saFixPr, String saCommPct, String saSlspsn,
			Double saBasePct, String saLimitCopy, Integer saCallsAllow,
			Integer saCallsTotal, Integer saRevalPeriod, Double saDec03,
			Double saNextDur, Boolean saPeriodic, Date saRenewalDate,
			Integer saRenewCount, Integer saRenewPeriods, Date saRevalueDate,
			Integer saRevalIndex, Boolean saQadl04, Boolean saSchedule,
			Double saTotalBilled, Double saTotalCost, Date saDte03,
			String saQadc01, String saQadc02, String saQadc03, String saQadc04,
			Date saQadt01, Date saQadt02, Date saQadt03, Double saQadd01,
			Double saQadd02, Double saQadd03, Boolean saQadl01,
			Boolean saQadl02, Boolean saQadl03, String saProject,
			Boolean saMrp, String saModUserid, Date saModDate,
			String saRenewedFrom, String saRenewedTo, Boolean saLog02,
			Boolean saLog03, Double saExRate2, String saExRatetype,
			Integer saExruSeq, String saArSub, String saCallPrice,
			String saRevenue, String saFsaccrAcct, String saFsaccrSub,
			String saFsaccrCc, String saFsdefAcct, String saFsdefSub,
			String saFsdefCc, Boolean saBillEnduser, Boolean saBillSummary,
			Boolean saItemEnduser, Boolean saPerBill, Boolean saProrate,
			Double oidSaMstr) {
		this.id = id;
		this.saCust = saCust;
		this.saEnduser = saEnduser;
		this.saOrdDate = saOrdDate;
		this.saStDate = saStDate;
		this.saEndDate = saEndDate;
		this.saRmks = saRmks;
		this.saCrTerms = saCrTerms;
		this.saFob = saFob;
		this.saPo = saPo;
		this.saShipvia = saShipvia;
		this.saPrint = saPrint;
		this.saPrList = saPrList;
		this.saQadc05 = saQadc05;
		this.saSource = saSource;
		this.saXcommPct = saXcommPct;
		this.saCrCard = saCrCard;
		this.saPrintPl = saPrintPl;
		this.saCrInit = saCrInit;
		this.saStat = saStat;
		this.saDiscPct = saDiscPct;
		this.saTaxPct = saTaxPct;
		this.saPrepaid = saPrepaid;
		this.saInvoiced = saInvoiced;
		this.saArAcct = saArAcct;
		this.saArCc = saArCc;
		this.saInvDate = saInvDate;
		this.saShipDate = saShipDate;
		this.saTaxable = saTaxable;
		this.saCmtindx = saCmtindx;
		this.saUser1 = saUser1;
		this.saUser2 = saUser2;
		this.saCurr = saCurr;
		this.saExRate = saExRate;
		this.saLang = saLang;
		this.saType = saType;
		this.saConfDate = saConfDate;
		this.saBol = saBol;
		this.saPst = saPst;
		this.saFstId = saFstId;
		this.saTrl1Amt = saTrl1Amt;
		this.saTrl1Cd = saTrl1Cd;
		this.saTrl2Amt = saTrl2Amt;
		this.saTrl2Cd = saTrl2Cd;
		this.saTrl3Amt = saTrl3Amt;
		this.saTrl3Cd = saTrl3Cd;
		this.saPstId = saPstId;
		this.saQuote = saQuote;
		this.saTaxc = saTaxc;
		this.saChr01 = saChr01;
		this.saChr02 = saChr02;
		this.saChr03 = saChr03;
		this.saChr04 = saChr04;
		this.saChr05 = saChr05;
		this.saChr06 = saChr06;
		this.saChr07 = saChr07;
		this.saChr08 = saChr08;
		this.saChr09 = saChr09;
		this.saChr10 = saChr10;
		this.saDte01 = saDte01;
		this.saDte02 = saDte02;
		this.saDec01 = saDec01;
		this.saDec02 = saDec02;
		this.saLog01 = saLog01;
		this.saSvCode = saSvCode;
		this.saLastBill = saLastBill;
		this.saNxtBill = saNxtBill;
		this.saRelDate = saRelDate;
		this.saRelease = saRelease;
		this.saUm = saUm;
		this.saCycle = saCycle;
		this.saExpDate = saExpDate;
		this.saComplete = saComplete;
		this.saBillCnt = saBillCnt;
		this.saSoNbr = saSoNbr;
		this.saProdline = saProdline;
		this.saMref = saMref;
		this.saLstCover = saLstCover;
		this.saAutornew = saAutornew;
		this.saExtDate = saExtDate;
		this.saArrears = saArrears;
		this.saHold = saHold;
		this.saStCover = saStCover;
		this.saQtyPer = saQtyPer;
		this.saQtyPlst = saQtyPlst;
		this.saLstBill = saLstBill;
		this.saCanTax = saCanTax;
		this.saFreeFrm = saFreeFrm;
		this.saFreeTo = saFreeTo;
		this.saCancel = saCancel;
		this.saSite = saSite;
		this.saBillTo = saBillTo;
		this.saArea = saArea;
		this.saBlanket = saBlanket;
		this.saChannel = saChannel;
		this.saDatePrinted = saDatePrinted;
		this.saGen0itm = saGen0itm;
		this.saOrigDate = saOrigDate;
		this.saPrt0itm = saPrt0itm;
		this.saQuoteMod = saQuoteMod;
		this.saRsnLost = saRsnLost;
		this.saSaType = saSaType;
		this.saBillType = saBillType;
		this.saSchedStart = saSchedStart;
		this.saSerialDet = saSerialDet;
		this.saSummarize = saSummarize;
		this.saVisits = saVisits;
		this.saTaxDate = saTaxDate;
		this.saEntEx = saEntEx;
		this.saOffHoursPt = saOffHoursPt;
		this.saTaxEnv = saTaxEnv;
		this.saTaxUsage = saTaxUsage;
		this.saPrList2 = saPrList2;
		this.saFixRate = saFixRate;
		this.saFixPr = saFixPr;
		this.saCommPct = saCommPct;
		this.saSlspsn = saSlspsn;
		this.saBasePct = saBasePct;
		this.saLimitCopy = saLimitCopy;
		this.saCallsAllow = saCallsAllow;
		this.saCallsTotal = saCallsTotal;
		this.saRevalPeriod = saRevalPeriod;
		this.saDec03 = saDec03;
		this.saNextDur = saNextDur;
		this.saPeriodic = saPeriodic;
		this.saRenewalDate = saRenewalDate;
		this.saRenewCount = saRenewCount;
		this.saRenewPeriods = saRenewPeriods;
		this.saRevalueDate = saRevalueDate;
		this.saRevalIndex = saRevalIndex;
		this.saQadl04 = saQadl04;
		this.saSchedule = saSchedule;
		this.saTotalBilled = saTotalBilled;
		this.saTotalCost = saTotalCost;
		this.saDte03 = saDte03;
		this.saQadc01 = saQadc01;
		this.saQadc02 = saQadc02;
		this.saQadc03 = saQadc03;
		this.saQadc04 = saQadc04;
		this.saQadt01 = saQadt01;
		this.saQadt02 = saQadt02;
		this.saQadt03 = saQadt03;
		this.saQadd01 = saQadd01;
		this.saQadd02 = saQadd02;
		this.saQadd03 = saQadd03;
		this.saQadl01 = saQadl01;
		this.saQadl02 = saQadl02;
		this.saQadl03 = saQadl03;
		this.saProject = saProject;
		this.saMrp = saMrp;
		this.saModUserid = saModUserid;
		this.saModDate = saModDate;
		this.saRenewedFrom = saRenewedFrom;
		this.saRenewedTo = saRenewedTo;
		this.saLog02 = saLog02;
		this.saLog03 = saLog03;
		this.saExRate2 = saExRate2;
		this.saExRatetype = saExRatetype;
		this.saExruSeq = saExruSeq;
		this.saArSub = saArSub;
		this.saCallPrice = saCallPrice;
		this.saRevenue = saRevenue;
		this.saFsaccrAcct = saFsaccrAcct;
		this.saFsaccrSub = saFsaccrSub;
		this.saFsaccrCc = saFsaccrCc;
		this.saFsdefAcct = saFsdefAcct;
		this.saFsdefSub = saFsdefSub;
		this.saFsdefCc = saFsdefCc;
		this.saBillEnduser = saBillEnduser;
		this.saBillSummary = saBillSummary;
		this.saItemEnduser = saItemEnduser;
		this.saPerBill = saPerBill;
		this.saProrate = saProrate;
		this.oidSaMstr = oidSaMstr;
	}

	// Property accessors

	public SaMstrId getId() {
		return this.id;
	}

	public void setId(SaMstrId id) {
		this.id = id;
	}

	public String getSaCust() {
		return this.saCust;
	}

	public void setSaCust(String saCust) {
		this.saCust = saCust;
	}

	public String getSaEnduser() {
		return this.saEnduser;
	}

	public void setSaEnduser(String saEnduser) {
		this.saEnduser = saEnduser;
	}

	public Date getSaOrdDate() {
		return this.saOrdDate;
	}

	public void setSaOrdDate(Date saOrdDate) {
		this.saOrdDate = saOrdDate;
	}

	public Date getSaStDate() {
		return this.saStDate;
	}

	public void setSaStDate(Date saStDate) {
		this.saStDate = saStDate;
	}

	public Date getSaEndDate() {
		return this.saEndDate;
	}

	public void setSaEndDate(Date saEndDate) {
		this.saEndDate = saEndDate;
	}

	public String getSaRmks() {
		return this.saRmks;
	}

	public void setSaRmks(String saRmks) {
		this.saRmks = saRmks;
	}

	public String getSaCrTerms() {
		return this.saCrTerms;
	}

	public void setSaCrTerms(String saCrTerms) {
		this.saCrTerms = saCrTerms;
	}

	public String getSaFob() {
		return this.saFob;
	}

	public void setSaFob(String saFob) {
		this.saFob = saFob;
	}

	public String getSaPo() {
		return this.saPo;
	}

	public void setSaPo(String saPo) {
		this.saPo = saPo;
	}

	public String getSaShipvia() {
		return this.saShipvia;
	}

	public void setSaShipvia(String saShipvia) {
		this.saShipvia = saShipvia;
	}

	public Boolean getSaPrint() {
		return this.saPrint;
	}

	public void setSaPrint(Boolean saPrint) {
		this.saPrint = saPrint;
	}

	public String getSaPrList() {
		return this.saPrList;
	}

	public void setSaPrList(String saPrList) {
		this.saPrList = saPrList;
	}

	public String getSaQadc05() {
		return this.saQadc05;
	}

	public void setSaQadc05(String saQadc05) {
		this.saQadc05 = saQadc05;
	}

	public String getSaSource() {
		return this.saSource;
	}

	public void setSaSource(String saSource) {
		this.saSource = saSource;
	}

	public String getSaXcommPct() {
		return this.saXcommPct;
	}

	public void setSaXcommPct(String saXcommPct) {
		this.saXcommPct = saXcommPct;
	}

	public String getSaCrCard() {
		return this.saCrCard;
	}

	public void setSaCrCard(String saCrCard) {
		this.saCrCard = saCrCard;
	}

	public Boolean getSaPrintPl() {
		return this.saPrintPl;
	}

	public void setSaPrintPl(Boolean saPrintPl) {
		this.saPrintPl = saPrintPl;
	}

	public String getSaCrInit() {
		return this.saCrInit;
	}

	public void setSaCrInit(String saCrInit) {
		this.saCrInit = saCrInit;
	}

	public String getSaStat() {
		return this.saStat;
	}

	public void setSaStat(String saStat) {
		this.saStat = saStat;
	}

	public Double getSaDiscPct() {
		return this.saDiscPct;
	}

	public void setSaDiscPct(Double saDiscPct) {
		this.saDiscPct = saDiscPct;
	}

	public String getSaTaxPct() {
		return this.saTaxPct;
	}

	public void setSaTaxPct(String saTaxPct) {
		this.saTaxPct = saTaxPct;
	}

	public Double getSaPrepaid() {
		return this.saPrepaid;
	}

	public void setSaPrepaid(Double saPrepaid) {
		this.saPrepaid = saPrepaid;
	}

	public Boolean getSaInvoiced() {
		return this.saInvoiced;
	}

	public void setSaInvoiced(Boolean saInvoiced) {
		this.saInvoiced = saInvoiced;
	}

	public String getSaArAcct() {
		return this.saArAcct;
	}

	public void setSaArAcct(String saArAcct) {
		this.saArAcct = saArAcct;
	}

	public String getSaArCc() {
		return this.saArCc;
	}

	public void setSaArCc(String saArCc) {
		this.saArCc = saArCc;
	}

	public Date getSaInvDate() {
		return this.saInvDate;
	}

	public void setSaInvDate(Date saInvDate) {
		this.saInvDate = saInvDate;
	}

	public Date getSaShipDate() {
		return this.saShipDate;
	}

	public void setSaShipDate(Date saShipDate) {
		this.saShipDate = saShipDate;
	}

	public Boolean getSaTaxable() {
		return this.saTaxable;
	}

	public void setSaTaxable(Boolean saTaxable) {
		this.saTaxable = saTaxable;
	}

	public Integer getSaCmtindx() {
		return this.saCmtindx;
	}

	public void setSaCmtindx(Integer saCmtindx) {
		this.saCmtindx = saCmtindx;
	}

	public String getSaUser1() {
		return this.saUser1;
	}

	public void setSaUser1(String saUser1) {
		this.saUser1 = saUser1;
	}

	public String getSaUser2() {
		return this.saUser2;
	}

	public void setSaUser2(String saUser2) {
		this.saUser2 = saUser2;
	}

	public String getSaCurr() {
		return this.saCurr;
	}

	public void setSaCurr(String saCurr) {
		this.saCurr = saCurr;
	}

	public Double getSaExRate() {
		return this.saExRate;
	}

	public void setSaExRate(Double saExRate) {
		this.saExRate = saExRate;
	}

	public String getSaLang() {
		return this.saLang;
	}

	public void setSaLang(String saLang) {
		this.saLang = saLang;
	}

	public String getSaType() {
		return this.saType;
	}

	public void setSaType(String saType) {
		this.saType = saType;
	}

	public Date getSaConfDate() {
		return this.saConfDate;
	}

	public void setSaConfDate(Date saConfDate) {
		this.saConfDate = saConfDate;
	}

	public String getSaBol() {
		return this.saBol;
	}

	public void setSaBol(String saBol) {
		this.saBol = saBol;
	}

	public Boolean getSaPst() {
		return this.saPst;
	}

	public void setSaPst(Boolean saPst) {
		this.saPst = saPst;
	}

	public String getSaFstId() {
		return this.saFstId;
	}

	public void setSaFstId(String saFstId) {
		this.saFstId = saFstId;
	}

	public Double getSaTrl1Amt() {
		return this.saTrl1Amt;
	}

	public void setSaTrl1Amt(Double saTrl1Amt) {
		this.saTrl1Amt = saTrl1Amt;
	}

	public String getSaTrl1Cd() {
		return this.saTrl1Cd;
	}

	public void setSaTrl1Cd(String saTrl1Cd) {
		this.saTrl1Cd = saTrl1Cd;
	}

	public Double getSaTrl2Amt() {
		return this.saTrl2Amt;
	}

	public void setSaTrl2Amt(Double saTrl2Amt) {
		this.saTrl2Amt = saTrl2Amt;
	}

	public String getSaTrl2Cd() {
		return this.saTrl2Cd;
	}

	public void setSaTrl2Cd(String saTrl2Cd) {
		this.saTrl2Cd = saTrl2Cd;
	}

	public Double getSaTrl3Amt() {
		return this.saTrl3Amt;
	}

	public void setSaTrl3Amt(Double saTrl3Amt) {
		this.saTrl3Amt = saTrl3Amt;
	}

	public String getSaTrl3Cd() {
		return this.saTrl3Cd;
	}

	public void setSaTrl3Cd(String saTrl3Cd) {
		this.saTrl3Cd = saTrl3Cd;
	}

	public String getSaPstId() {
		return this.saPstId;
	}

	public void setSaPstId(String saPstId) {
		this.saPstId = saPstId;
	}

	public String getSaQuote() {
		return this.saQuote;
	}

	public void setSaQuote(String saQuote) {
		this.saQuote = saQuote;
	}

	public String getSaTaxc() {
		return this.saTaxc;
	}

	public void setSaTaxc(String saTaxc) {
		this.saTaxc = saTaxc;
	}

	public String getSaChr01() {
		return this.saChr01;
	}

	public void setSaChr01(String saChr01) {
		this.saChr01 = saChr01;
	}

	public String getSaChr02() {
		return this.saChr02;
	}

	public void setSaChr02(String saChr02) {
		this.saChr02 = saChr02;
	}

	public String getSaChr03() {
		return this.saChr03;
	}

	public void setSaChr03(String saChr03) {
		this.saChr03 = saChr03;
	}

	public String getSaChr04() {
		return this.saChr04;
	}

	public void setSaChr04(String saChr04) {
		this.saChr04 = saChr04;
	}

	public String getSaChr05() {
		return this.saChr05;
	}

	public void setSaChr05(String saChr05) {
		this.saChr05 = saChr05;
	}

	public String getSaChr06() {
		return this.saChr06;
	}

	public void setSaChr06(String saChr06) {
		this.saChr06 = saChr06;
	}

	public String getSaChr07() {
		return this.saChr07;
	}

	public void setSaChr07(String saChr07) {
		this.saChr07 = saChr07;
	}

	public String getSaChr08() {
		return this.saChr08;
	}

	public void setSaChr08(String saChr08) {
		this.saChr08 = saChr08;
	}

	public String getSaChr09() {
		return this.saChr09;
	}

	public void setSaChr09(String saChr09) {
		this.saChr09 = saChr09;
	}

	public String getSaChr10() {
		return this.saChr10;
	}

	public void setSaChr10(String saChr10) {
		this.saChr10 = saChr10;
	}

	public Date getSaDte01() {
		return this.saDte01;
	}

	public void setSaDte01(Date saDte01) {
		this.saDte01 = saDte01;
	}

	public Date getSaDte02() {
		return this.saDte02;
	}

	public void setSaDte02(Date saDte02) {
		this.saDte02 = saDte02;
	}

	public Double getSaDec01() {
		return this.saDec01;
	}

	public void setSaDec01(Double saDec01) {
		this.saDec01 = saDec01;
	}

	public Double getSaDec02() {
		return this.saDec02;
	}

	public void setSaDec02(Double saDec02) {
		this.saDec02 = saDec02;
	}

	public Boolean getSaLog01() {
		return this.saLog01;
	}

	public void setSaLog01(Boolean saLog01) {
		this.saLog01 = saLog01;
	}

	public String getSaSvCode() {
		return this.saSvCode;
	}

	public void setSaSvCode(String saSvCode) {
		this.saSvCode = saSvCode;
	}

	public Date getSaLastBill() {
		return this.saLastBill;
	}

	public void setSaLastBill(Date saLastBill) {
		this.saLastBill = saLastBill;
	}

	public Date getSaNxtBill() {
		return this.saNxtBill;
	}

	public void setSaNxtBill(Date saNxtBill) {
		this.saNxtBill = saNxtBill;
	}

	public Date getSaRelDate() {
		return this.saRelDate;
	}

	public void setSaRelDate(Date saRelDate) {
		this.saRelDate = saRelDate;
	}

	public Boolean getSaRelease() {
		return this.saRelease;
	}

	public void setSaRelease(Boolean saRelease) {
		this.saRelease = saRelease;
	}

	public String getSaUm() {
		return this.saUm;
	}

	public void setSaUm(String saUm) {
		this.saUm = saUm;
	}

	public String getSaCycle() {
		return this.saCycle;
	}

	public void setSaCycle(String saCycle) {
		this.saCycle = saCycle;
	}

	public Date getSaExpDate() {
		return this.saExpDate;
	}

	public void setSaExpDate(Date saExpDate) {
		this.saExpDate = saExpDate;
	}

	public Boolean getSaComplete() {
		return this.saComplete;
	}

	public void setSaComplete(Boolean saComplete) {
		this.saComplete = saComplete;
	}

	public Integer getSaBillCnt() {
		return this.saBillCnt;
	}

	public void setSaBillCnt(Integer saBillCnt) {
		this.saBillCnt = saBillCnt;
	}

	public String getSaSoNbr() {
		return this.saSoNbr;
	}

	public void setSaSoNbr(String saSoNbr) {
		this.saSoNbr = saSoNbr;
	}

	public String getSaProdline() {
		return this.saProdline;
	}

	public void setSaProdline(String saProdline) {
		this.saProdline = saProdline;
	}

	public String getSaMref() {
		return this.saMref;
	}

	public void setSaMref(String saMref) {
		this.saMref = saMref;
	}

	public Date getSaLstCover() {
		return this.saLstCover;
	}

	public void setSaLstCover(Date saLstCover) {
		this.saLstCover = saLstCover;
	}

	public Boolean getSaAutornew() {
		return this.saAutornew;
	}

	public void setSaAutornew(Boolean saAutornew) {
		this.saAutornew = saAutornew;
	}

	public Date getSaExtDate() {
		return this.saExtDate;
	}

	public void setSaExtDate(Date saExtDate) {
		this.saExtDate = saExtDate;
	}

	public Boolean getSaArrears() {
		return this.saArrears;
	}

	public void setSaArrears(Boolean saArrears) {
		this.saArrears = saArrears;
	}

	public Boolean getSaHold() {
		return this.saHold;
	}

	public void setSaHold(Boolean saHold) {
		this.saHold = saHold;
	}

	public Date getSaStCover() {
		return this.saStCover;
	}

	public void setSaStCover(Date saStCover) {
		this.saStCover = saStCover;
	}

	public Double getSaQtyPer() {
		return this.saQtyPer;
	}

	public void setSaQtyPer(Double saQtyPer) {
		this.saQtyPer = saQtyPer;
	}

	public Double getSaQtyPlst() {
		return this.saQtyPlst;
	}

	public void setSaQtyPlst(Double saQtyPlst) {
		this.saQtyPlst = saQtyPlst;
	}

	public Date getSaLstBill() {
		return this.saLstBill;
	}

	public void setSaLstBill(Date saLstBill) {
		this.saLstBill = saLstBill;
	}

	public Double getSaCanTax() {
		return this.saCanTax;
	}

	public void setSaCanTax(Double saCanTax) {
		this.saCanTax = saCanTax;
	}

	public Date getSaFreeFrm() {
		return this.saFreeFrm;
	}

	public void setSaFreeFrm(Date saFreeFrm) {
		this.saFreeFrm = saFreeFrm;
	}

	public Date getSaFreeTo() {
		return this.saFreeTo;
	}

	public void setSaFreeTo(Date saFreeTo) {
		this.saFreeTo = saFreeTo;
	}

	public Date getSaCancel() {
		return this.saCancel;
	}

	public void setSaCancel(Date saCancel) {
		this.saCancel = saCancel;
	}

	public String getSaSite() {
		return this.saSite;
	}

	public void setSaSite(String saSite) {
		this.saSite = saSite;
	}

	public String getSaBillTo() {
		return this.saBillTo;
	}

	public void setSaBillTo(String saBillTo) {
		this.saBillTo = saBillTo;
	}

	public String getSaArea() {
		return this.saArea;
	}

	public void setSaArea(String saArea) {
		this.saArea = saArea;
	}

	public Boolean getSaBlanket() {
		return this.saBlanket;
	}

	public void setSaBlanket(Boolean saBlanket) {
		this.saBlanket = saBlanket;
	}

	public String getSaChannel() {
		return this.saChannel;
	}

	public void setSaChannel(String saChannel) {
		this.saChannel = saChannel;
	}

	public Date getSaDatePrinted() {
		return this.saDatePrinted;
	}

	public void setSaDatePrinted(Date saDatePrinted) {
		this.saDatePrinted = saDatePrinted;
	}

	public Boolean getSaGen0itm() {
		return this.saGen0itm;
	}

	public void setSaGen0itm(Boolean saGen0itm) {
		this.saGen0itm = saGen0itm;
	}

	public Date getSaOrigDate() {
		return this.saOrigDate;
	}

	public void setSaOrigDate(Date saOrigDate) {
		this.saOrigDate = saOrigDate;
	}

	public Boolean getSaPrt0itm() {
		return this.saPrt0itm;
	}

	public void setSaPrt0itm(Boolean saPrt0itm) {
		this.saPrt0itm = saPrt0itm;
	}

	public Boolean getSaQuoteMod() {
		return this.saQuoteMod;
	}

	public void setSaQuoteMod(Boolean saQuoteMod) {
		this.saQuoteMod = saQuoteMod;
	}

	public String getSaRsnLost() {
		return this.saRsnLost;
	}

	public void setSaRsnLost(String saRsnLost) {
		this.saRsnLost = saRsnLost;
	}

	public String getSaSaType() {
		return this.saSaType;
	}

	public void setSaSaType(String saSaType) {
		this.saSaType = saSaType;
	}

	public String getSaBillType() {
		return this.saBillType;
	}

	public void setSaBillType(String saBillType) {
		this.saBillType = saBillType;
	}

	public Boolean getSaSchedStart() {
		return this.saSchedStart;
	}

	public void setSaSchedStart(Boolean saSchedStart) {
		this.saSchedStart = saSchedStart;
	}

	public Boolean getSaSerialDet() {
		return this.saSerialDet;
	}

	public void setSaSerialDet(Boolean saSerialDet) {
		this.saSerialDet = saSerialDet;
	}

	public Boolean getSaSummarize() {
		return this.saSummarize;
	}

	public void setSaSummarize(Boolean saSummarize) {
		this.saSummarize = saSummarize;
	}

	public Double getSaVisits() {
		return this.saVisits;
	}

	public void setSaVisits(Double saVisits) {
		this.saVisits = saVisits;
	}

	public Date getSaTaxDate() {
		return this.saTaxDate;
	}

	public void setSaTaxDate(Date saTaxDate) {
		this.saTaxDate = saTaxDate;
	}

	public Double getSaEntEx() {
		return this.saEntEx;
	}

	public void setSaEntEx(Double saEntEx) {
		this.saEntEx = saEntEx;
	}

	public String getSaOffHoursPt() {
		return this.saOffHoursPt;
	}

	public void setSaOffHoursPt(String saOffHoursPt) {
		this.saOffHoursPt = saOffHoursPt;
	}

	public String getSaTaxEnv() {
		return this.saTaxEnv;
	}

	public void setSaTaxEnv(String saTaxEnv) {
		this.saTaxEnv = saTaxEnv;
	}

	public String getSaTaxUsage() {
		return this.saTaxUsage;
	}

	public void setSaTaxUsage(String saTaxUsage) {
		this.saTaxUsage = saTaxUsage;
	}

	public String getSaPrList2() {
		return this.saPrList2;
	}

	public void setSaPrList2(String saPrList2) {
		this.saPrList2 = saPrList2;
	}

	public Boolean getSaFixRate() {
		return this.saFixRate;
	}

	public void setSaFixRate(Boolean saFixRate) {
		this.saFixRate = saFixRate;
	}

	public Boolean getSaFixPr() {
		return this.saFixPr;
	}

	public void setSaFixPr(Boolean saFixPr) {
		this.saFixPr = saFixPr;
	}

	public String getSaCommPct() {
		return this.saCommPct;
	}

	public void setSaCommPct(String saCommPct) {
		this.saCommPct = saCommPct;
	}

	public String getSaSlspsn() {
		return this.saSlspsn;
	}

	public void setSaSlspsn(String saSlspsn) {
		this.saSlspsn = saSlspsn;
	}

	public Double getSaBasePct() {
		return this.saBasePct;
	}

	public void setSaBasePct(Double saBasePct) {
		this.saBasePct = saBasePct;
	}

	public String getSaLimitCopy() {
		return this.saLimitCopy;
	}

	public void setSaLimitCopy(String saLimitCopy) {
		this.saLimitCopy = saLimitCopy;
	}

	public Integer getSaCallsAllow() {
		return this.saCallsAllow;
	}

	public void setSaCallsAllow(Integer saCallsAllow) {
		this.saCallsAllow = saCallsAllow;
	}

	public Integer getSaCallsTotal() {
		return this.saCallsTotal;
	}

	public void setSaCallsTotal(Integer saCallsTotal) {
		this.saCallsTotal = saCallsTotal;
	}

	public Integer getSaRevalPeriod() {
		return this.saRevalPeriod;
	}

	public void setSaRevalPeriod(Integer saRevalPeriod) {
		this.saRevalPeriod = saRevalPeriod;
	}

	public Double getSaDec03() {
		return this.saDec03;
	}

	public void setSaDec03(Double saDec03) {
		this.saDec03 = saDec03;
	}

	public Double getSaNextDur() {
		return this.saNextDur;
	}

	public void setSaNextDur(Double saNextDur) {
		this.saNextDur = saNextDur;
	}

	public Boolean getSaPeriodic() {
		return this.saPeriodic;
	}

	public void setSaPeriodic(Boolean saPeriodic) {
		this.saPeriodic = saPeriodic;
	}

	public Date getSaRenewalDate() {
		return this.saRenewalDate;
	}

	public void setSaRenewalDate(Date saRenewalDate) {
		this.saRenewalDate = saRenewalDate;
	}

	public Integer getSaRenewCount() {
		return this.saRenewCount;
	}

	public void setSaRenewCount(Integer saRenewCount) {
		this.saRenewCount = saRenewCount;
	}

	public Integer getSaRenewPeriods() {
		return this.saRenewPeriods;
	}

	public void setSaRenewPeriods(Integer saRenewPeriods) {
		this.saRenewPeriods = saRenewPeriods;
	}

	public Date getSaRevalueDate() {
		return this.saRevalueDate;
	}

	public void setSaRevalueDate(Date saRevalueDate) {
		this.saRevalueDate = saRevalueDate;
	}

	public Integer getSaRevalIndex() {
		return this.saRevalIndex;
	}

	public void setSaRevalIndex(Integer saRevalIndex) {
		this.saRevalIndex = saRevalIndex;
	}

	public Boolean getSaQadl04() {
		return this.saQadl04;
	}

	public void setSaQadl04(Boolean saQadl04) {
		this.saQadl04 = saQadl04;
	}

	public Boolean getSaSchedule() {
		return this.saSchedule;
	}

	public void setSaSchedule(Boolean saSchedule) {
		this.saSchedule = saSchedule;
	}

	public Double getSaTotalBilled() {
		return this.saTotalBilled;
	}

	public void setSaTotalBilled(Double saTotalBilled) {
		this.saTotalBilled = saTotalBilled;
	}

	public Double getSaTotalCost() {
		return this.saTotalCost;
	}

	public void setSaTotalCost(Double saTotalCost) {
		this.saTotalCost = saTotalCost;
	}

	public Date getSaDte03() {
		return this.saDte03;
	}

	public void setSaDte03(Date saDte03) {
		this.saDte03 = saDte03;
	}

	public String getSaQadc01() {
		return this.saQadc01;
	}

	public void setSaQadc01(String saQadc01) {
		this.saQadc01 = saQadc01;
	}

	public String getSaQadc02() {
		return this.saQadc02;
	}

	public void setSaQadc02(String saQadc02) {
		this.saQadc02 = saQadc02;
	}

	public String getSaQadc03() {
		return this.saQadc03;
	}

	public void setSaQadc03(String saQadc03) {
		this.saQadc03 = saQadc03;
	}

	public String getSaQadc04() {
		return this.saQadc04;
	}

	public void setSaQadc04(String saQadc04) {
		this.saQadc04 = saQadc04;
	}

	public Date getSaQadt01() {
		return this.saQadt01;
	}

	public void setSaQadt01(Date saQadt01) {
		this.saQadt01 = saQadt01;
	}

	public Date getSaQadt02() {
		return this.saQadt02;
	}

	public void setSaQadt02(Date saQadt02) {
		this.saQadt02 = saQadt02;
	}

	public Date getSaQadt03() {
		return this.saQadt03;
	}

	public void setSaQadt03(Date saQadt03) {
		this.saQadt03 = saQadt03;
	}

	public Double getSaQadd01() {
		return this.saQadd01;
	}

	public void setSaQadd01(Double saQadd01) {
		this.saQadd01 = saQadd01;
	}

	public Double getSaQadd02() {
		return this.saQadd02;
	}

	public void setSaQadd02(Double saQadd02) {
		this.saQadd02 = saQadd02;
	}

	public Double getSaQadd03() {
		return this.saQadd03;
	}

	public void setSaQadd03(Double saQadd03) {
		this.saQadd03 = saQadd03;
	}

	public Boolean getSaQadl01() {
		return this.saQadl01;
	}

	public void setSaQadl01(Boolean saQadl01) {
		this.saQadl01 = saQadl01;
	}

	public Boolean getSaQadl02() {
		return this.saQadl02;
	}

	public void setSaQadl02(Boolean saQadl02) {
		this.saQadl02 = saQadl02;
	}

	public Boolean getSaQadl03() {
		return this.saQadl03;
	}

	public void setSaQadl03(Boolean saQadl03) {
		this.saQadl03 = saQadl03;
	}

	public String getSaProject() {
		return this.saProject;
	}

	public void setSaProject(String saProject) {
		this.saProject = saProject;
	}

	public Boolean getSaMrp() {
		return this.saMrp;
	}

	public void setSaMrp(Boolean saMrp) {
		this.saMrp = saMrp;
	}

	public String getSaModUserid() {
		return this.saModUserid;
	}

	public void setSaModUserid(String saModUserid) {
		this.saModUserid = saModUserid;
	}

	public Date getSaModDate() {
		return this.saModDate;
	}

	public void setSaModDate(Date saModDate) {
		this.saModDate = saModDate;
	}

	public String getSaRenewedFrom() {
		return this.saRenewedFrom;
	}

	public void setSaRenewedFrom(String saRenewedFrom) {
		this.saRenewedFrom = saRenewedFrom;
	}

	public String getSaRenewedTo() {
		return this.saRenewedTo;
	}

	public void setSaRenewedTo(String saRenewedTo) {
		this.saRenewedTo = saRenewedTo;
	}

	public Boolean getSaLog02() {
		return this.saLog02;
	}

	public void setSaLog02(Boolean saLog02) {
		this.saLog02 = saLog02;
	}

	public Boolean getSaLog03() {
		return this.saLog03;
	}

	public void setSaLog03(Boolean saLog03) {
		this.saLog03 = saLog03;
	}

	public Double getSaExRate2() {
		return this.saExRate2;
	}

	public void setSaExRate2(Double saExRate2) {
		this.saExRate2 = saExRate2;
	}

	public String getSaExRatetype() {
		return this.saExRatetype;
	}

	public void setSaExRatetype(String saExRatetype) {
		this.saExRatetype = saExRatetype;
	}

	public Integer getSaExruSeq() {
		return this.saExruSeq;
	}

	public void setSaExruSeq(Integer saExruSeq) {
		this.saExruSeq = saExruSeq;
	}

	public String getSaArSub() {
		return this.saArSub;
	}

	public void setSaArSub(String saArSub) {
		this.saArSub = saArSub;
	}

	public String getSaCallPrice() {
		return this.saCallPrice;
	}

	public void setSaCallPrice(String saCallPrice) {
		this.saCallPrice = saCallPrice;
	}

	public String getSaRevenue() {
		return this.saRevenue;
	}

	public void setSaRevenue(String saRevenue) {
		this.saRevenue = saRevenue;
	}

	public String getSaFsaccrAcct() {
		return this.saFsaccrAcct;
	}

	public void setSaFsaccrAcct(String saFsaccrAcct) {
		this.saFsaccrAcct = saFsaccrAcct;
	}

	public String getSaFsaccrSub() {
		return this.saFsaccrSub;
	}

	public void setSaFsaccrSub(String saFsaccrSub) {
		this.saFsaccrSub = saFsaccrSub;
	}

	public String getSaFsaccrCc() {
		return this.saFsaccrCc;
	}

	public void setSaFsaccrCc(String saFsaccrCc) {
		this.saFsaccrCc = saFsaccrCc;
	}

	public String getSaFsdefAcct() {
		return this.saFsdefAcct;
	}

	public void setSaFsdefAcct(String saFsdefAcct) {
		this.saFsdefAcct = saFsdefAcct;
	}

	public String getSaFsdefSub() {
		return this.saFsdefSub;
	}

	public void setSaFsdefSub(String saFsdefSub) {
		this.saFsdefSub = saFsdefSub;
	}

	public String getSaFsdefCc() {
		return this.saFsdefCc;
	}

	public void setSaFsdefCc(String saFsdefCc) {
		this.saFsdefCc = saFsdefCc;
	}

	public Boolean getSaBillEnduser() {
		return this.saBillEnduser;
	}

	public void setSaBillEnduser(Boolean saBillEnduser) {
		this.saBillEnduser = saBillEnduser;
	}

	public Boolean getSaBillSummary() {
		return this.saBillSummary;
	}

	public void setSaBillSummary(Boolean saBillSummary) {
		this.saBillSummary = saBillSummary;
	}

	public Boolean getSaItemEnduser() {
		return this.saItemEnduser;
	}

	public void setSaItemEnduser(Boolean saItemEnduser) {
		this.saItemEnduser = saItemEnduser;
	}

	public Boolean getSaPerBill() {
		return this.saPerBill;
	}

	public void setSaPerBill(Boolean saPerBill) {
		this.saPerBill = saPerBill;
	}

	public Boolean getSaProrate() {
		return this.saProrate;
	}

	public void setSaProrate(Boolean saProrate) {
		this.saProrate = saProrate;
	}

	public Double getOidSaMstr() {
		return this.oidSaMstr;
	}

	public void setOidSaMstr(Double oidSaMstr) {
		this.oidSaMstr = oidSaMstr;
	}

}