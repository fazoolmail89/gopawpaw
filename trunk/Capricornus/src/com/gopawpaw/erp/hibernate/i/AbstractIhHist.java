package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIhHist entity provides the base persistence definition of the IhHist
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhHist implements java.io.Serializable {

	// Fields

	private IhHistId id;
	private String ihCust;
	private String ihShip;
	private Date ihOrdDate;
	private Date ihReqDate;
	private Date ihDueDate;
	private String ihRmks;
	private String ihCrTerms;
	private String ihFob;
	private String ihPo;
	private String ihShipvia;
	private Boolean ihPartial;
	private Boolean ihPrintSo;
	private String ihPrList;
	private String ihXslspsn;
	private String ihSource;
	private String ihXcommPct;
	private String ihCrCard;
	private Boolean ihPrintPl;
	private String ihCrInit;
	private String ihStat;
	private Double ihQad01;
	private Double ihQad02;
	private Double ihQad03;
	private Double ihDiscPct;
	private String ihTaxPct;
	private Double ihPrepaid;
	private Boolean ihToInv;
	private Boolean ihInvoiced;
	private String ihArAcct;
	private String ihArCc;
	private Date ihInvDate;
	private Date ihShipDate;
	private Boolean ihTaxable;
	private Integer ihCmtindx;
	private Integer ihQad04;
	private String ihUser1;
	private String ihUser2;
	private String ihCurr;
	private Double ihExRate;
	private String ihLang;
	private String ihType;
	private Date ihConfDate;
	private Integer ihRev;
	private String ihBol;
	private String ihQad05;
	private Boolean ihPst;
	private String ihFstId;
	private Double ihTrl1Amt;
	private String ihTrl1Cd;
	private Double ihTrl2Amt;
	private String ihTrl2Cd;
	private Double ihTrl3Amt;
	private String ihTrl3Cd;
	private Double ihWeight;
	private String ihWeightUm;
	private Double ihSize;
	private String ihSizeUm;
	private Integer ihCartons;
	private String ihSite;
	private String ihQuote;
	private String ihTaxc;
	private String ihChr01;
	private String ihChr02;
	private String ihChr03;
	private String ihChr04;
	private String ihChr05;
	private String ihChr06;
	private String ihChr07;
	private String ihChr08;
	private String ihChr09;
	private String ihChr10;
	private Date ihDte01;
	private Date ihDte02;
	private Double ihDec01;
	private Double ihDec02;
	private Boolean ihLog01;
	private Boolean ihCredit;
	private String ihInvCr;
	private String ihProject;
	private Double ihPstPct;
	private String ihFrList;
	private String ihFrTerms;
	private String ihCommPct;
	private String ihSlspsn;
	private Boolean ihFixRate;
	private Double ihEntEx;
	private String ihBill;
	private Boolean ihPrintBl;
	private String ihUserid;
	private Date ihTaxDate;
	private String ihChannel;
	private String ihInvMthd;
	private String ihPstId;
	private String ihFsmType;
	private String ihBank;
	private Double ihFrMinWt;
	private String ihPrList2;
	private String ihTaxEnv;
	private String ihTaxUsage;
	private String ihSaNbr;
	private String ihCrprlist;
	private Boolean ihShipEng;
	private Date ihCnclDate;
	private String ihConrep;
	private Boolean ihSched;
	private Boolean ihFixPr;
	private String ihSchMthd;
	private String ihCaNbr;
	private String ihFcgCode;
	private Date ihModDate;
	private Date ihPricedDt;
	private Date ihPricingDt;
	private Double ihRstkPct;
	private String ihQadc01;
	private String ihQadc02;
	private String ihQadc03;
	private String ihQadc04;
	private String ihQadc05;
	private Date ihQadt01;
	private Date ihQadt02;
	private Date ihQadt03;
	private Double ihQadd01;
	private Double ihQadd02;
	private Double ihQadd03;
	private Integer ihQadi01;
	private Integer ihQadi02;
	private Integer ihQadi03;
	private Boolean ihQadl01;
	private Boolean ihQadl02;
	private Boolean ihQadl03;
	private Boolean ihPrimary;
	private String ihCustPo;
	private Boolean ihSecondary;
	private String ihShipPo;
	private Double ihExRate2;
	private String ihExRatetype;
	private String ihDiv;
	private Integer ihExruSeq;
	private Integer ihExportBatch;
	private Date ihExportDate;
	private Integer ihExportTime;
	private String ihArSub;
	private Double ihPrepTax;
	private Boolean ihCustrefVal;
	private Double oidIhHist;

	// Constructors

	/** default constructor */
	public AbstractIhHist() {
	}

	/** minimal constructor */
	public AbstractIhHist(IhHistId id, Boolean ihPrimary, Double ihExRate2,
			String ihExRatetype, Integer ihExruSeq, Double ihPrepTax,
			Boolean ihCustrefVal, Double oidIhHist) {
		this.id = id;
		this.ihPrimary = ihPrimary;
		this.ihExRate2 = ihExRate2;
		this.ihExRatetype = ihExRatetype;
		this.ihExruSeq = ihExruSeq;
		this.ihPrepTax = ihPrepTax;
		this.ihCustrefVal = ihCustrefVal;
		this.oidIhHist = oidIhHist;
	}

	/** full constructor */
	public AbstractIhHist(IhHistId id, String ihCust, String ihShip,
			Date ihOrdDate, Date ihReqDate, Date ihDueDate, String ihRmks,
			String ihCrTerms, String ihFob, String ihPo, String ihShipvia,
			Boolean ihPartial, Boolean ihPrintSo, String ihPrList,
			String ihXslspsn, String ihSource, String ihXcommPct,
			String ihCrCard, Boolean ihPrintPl, String ihCrInit, String ihStat,
			Double ihQad01, Double ihQad02, Double ihQad03, Double ihDiscPct,
			String ihTaxPct, Double ihPrepaid, Boolean ihToInv,
			Boolean ihInvoiced, String ihArAcct, String ihArCc, Date ihInvDate,
			Date ihShipDate, Boolean ihTaxable, Integer ihCmtindx,
			Integer ihQad04, String ihUser1, String ihUser2, String ihCurr,
			Double ihExRate, String ihLang, String ihType, Date ihConfDate,
			Integer ihRev, String ihBol, String ihQad05, Boolean ihPst,
			String ihFstId, Double ihTrl1Amt, String ihTrl1Cd,
			Double ihTrl2Amt, String ihTrl2Cd, Double ihTrl3Amt,
			String ihTrl3Cd, Double ihWeight, String ihWeightUm, Double ihSize,
			String ihSizeUm, Integer ihCartons, String ihSite, String ihQuote,
			String ihTaxc, String ihChr01, String ihChr02, String ihChr03,
			String ihChr04, String ihChr05, String ihChr06, String ihChr07,
			String ihChr08, String ihChr09, String ihChr10, Date ihDte01,
			Date ihDte02, Double ihDec01, Double ihDec02, Boolean ihLog01,
			Boolean ihCredit, String ihInvCr, String ihProject,
			Double ihPstPct, String ihFrList, String ihFrTerms,
			String ihCommPct, String ihSlspsn, Boolean ihFixRate,
			Double ihEntEx, String ihBill, Boolean ihPrintBl, String ihUserid,
			Date ihTaxDate, String ihChannel, String ihInvMthd, String ihPstId,
			String ihFsmType, String ihBank, Double ihFrMinWt,
			String ihPrList2, String ihTaxEnv, String ihTaxUsage,
			String ihSaNbr, String ihCrprlist, Boolean ihShipEng,
			Date ihCnclDate, String ihConrep, Boolean ihSched, Boolean ihFixPr,
			String ihSchMthd, String ihCaNbr, String ihFcgCode, Date ihModDate,
			Date ihPricedDt, Date ihPricingDt, Double ihRstkPct,
			String ihQadc01, String ihQadc02, String ihQadc03, String ihQadc04,
			String ihQadc05, Date ihQadt01, Date ihQadt02, Date ihQadt03,
			Double ihQadd01, Double ihQadd02, Double ihQadd03,
			Integer ihQadi01, Integer ihQadi02, Integer ihQadi03,
			Boolean ihQadl01, Boolean ihQadl02, Boolean ihQadl03,
			Boolean ihPrimary, String ihCustPo, Boolean ihSecondary,
			String ihShipPo, Double ihExRate2, String ihExRatetype,
			String ihDiv, Integer ihExruSeq, Integer ihExportBatch,
			Date ihExportDate, Integer ihExportTime, String ihArSub,
			Double ihPrepTax, Boolean ihCustrefVal, Double oidIhHist) {
		this.id = id;
		this.ihCust = ihCust;
		this.ihShip = ihShip;
		this.ihOrdDate = ihOrdDate;
		this.ihReqDate = ihReqDate;
		this.ihDueDate = ihDueDate;
		this.ihRmks = ihRmks;
		this.ihCrTerms = ihCrTerms;
		this.ihFob = ihFob;
		this.ihPo = ihPo;
		this.ihShipvia = ihShipvia;
		this.ihPartial = ihPartial;
		this.ihPrintSo = ihPrintSo;
		this.ihPrList = ihPrList;
		this.ihXslspsn = ihXslspsn;
		this.ihSource = ihSource;
		this.ihXcommPct = ihXcommPct;
		this.ihCrCard = ihCrCard;
		this.ihPrintPl = ihPrintPl;
		this.ihCrInit = ihCrInit;
		this.ihStat = ihStat;
		this.ihQad01 = ihQad01;
		this.ihQad02 = ihQad02;
		this.ihQad03 = ihQad03;
		this.ihDiscPct = ihDiscPct;
		this.ihTaxPct = ihTaxPct;
		this.ihPrepaid = ihPrepaid;
		this.ihToInv = ihToInv;
		this.ihInvoiced = ihInvoiced;
		this.ihArAcct = ihArAcct;
		this.ihArCc = ihArCc;
		this.ihInvDate = ihInvDate;
		this.ihShipDate = ihShipDate;
		this.ihTaxable = ihTaxable;
		this.ihCmtindx = ihCmtindx;
		this.ihQad04 = ihQad04;
		this.ihUser1 = ihUser1;
		this.ihUser2 = ihUser2;
		this.ihCurr = ihCurr;
		this.ihExRate = ihExRate;
		this.ihLang = ihLang;
		this.ihType = ihType;
		this.ihConfDate = ihConfDate;
		this.ihRev = ihRev;
		this.ihBol = ihBol;
		this.ihQad05 = ihQad05;
		this.ihPst = ihPst;
		this.ihFstId = ihFstId;
		this.ihTrl1Amt = ihTrl1Amt;
		this.ihTrl1Cd = ihTrl1Cd;
		this.ihTrl2Amt = ihTrl2Amt;
		this.ihTrl2Cd = ihTrl2Cd;
		this.ihTrl3Amt = ihTrl3Amt;
		this.ihTrl3Cd = ihTrl3Cd;
		this.ihWeight = ihWeight;
		this.ihWeightUm = ihWeightUm;
		this.ihSize = ihSize;
		this.ihSizeUm = ihSizeUm;
		this.ihCartons = ihCartons;
		this.ihSite = ihSite;
		this.ihQuote = ihQuote;
		this.ihTaxc = ihTaxc;
		this.ihChr01 = ihChr01;
		this.ihChr02 = ihChr02;
		this.ihChr03 = ihChr03;
		this.ihChr04 = ihChr04;
		this.ihChr05 = ihChr05;
		this.ihChr06 = ihChr06;
		this.ihChr07 = ihChr07;
		this.ihChr08 = ihChr08;
		this.ihChr09 = ihChr09;
		this.ihChr10 = ihChr10;
		this.ihDte01 = ihDte01;
		this.ihDte02 = ihDte02;
		this.ihDec01 = ihDec01;
		this.ihDec02 = ihDec02;
		this.ihLog01 = ihLog01;
		this.ihCredit = ihCredit;
		this.ihInvCr = ihInvCr;
		this.ihProject = ihProject;
		this.ihPstPct = ihPstPct;
		this.ihFrList = ihFrList;
		this.ihFrTerms = ihFrTerms;
		this.ihCommPct = ihCommPct;
		this.ihSlspsn = ihSlspsn;
		this.ihFixRate = ihFixRate;
		this.ihEntEx = ihEntEx;
		this.ihBill = ihBill;
		this.ihPrintBl = ihPrintBl;
		this.ihUserid = ihUserid;
		this.ihTaxDate = ihTaxDate;
		this.ihChannel = ihChannel;
		this.ihInvMthd = ihInvMthd;
		this.ihPstId = ihPstId;
		this.ihFsmType = ihFsmType;
		this.ihBank = ihBank;
		this.ihFrMinWt = ihFrMinWt;
		this.ihPrList2 = ihPrList2;
		this.ihTaxEnv = ihTaxEnv;
		this.ihTaxUsage = ihTaxUsage;
		this.ihSaNbr = ihSaNbr;
		this.ihCrprlist = ihCrprlist;
		this.ihShipEng = ihShipEng;
		this.ihCnclDate = ihCnclDate;
		this.ihConrep = ihConrep;
		this.ihSched = ihSched;
		this.ihFixPr = ihFixPr;
		this.ihSchMthd = ihSchMthd;
		this.ihCaNbr = ihCaNbr;
		this.ihFcgCode = ihFcgCode;
		this.ihModDate = ihModDate;
		this.ihPricedDt = ihPricedDt;
		this.ihPricingDt = ihPricingDt;
		this.ihRstkPct = ihRstkPct;
		this.ihQadc01 = ihQadc01;
		this.ihQadc02 = ihQadc02;
		this.ihQadc03 = ihQadc03;
		this.ihQadc04 = ihQadc04;
		this.ihQadc05 = ihQadc05;
		this.ihQadt01 = ihQadt01;
		this.ihQadt02 = ihQadt02;
		this.ihQadt03 = ihQadt03;
		this.ihQadd01 = ihQadd01;
		this.ihQadd02 = ihQadd02;
		this.ihQadd03 = ihQadd03;
		this.ihQadi01 = ihQadi01;
		this.ihQadi02 = ihQadi02;
		this.ihQadi03 = ihQadi03;
		this.ihQadl01 = ihQadl01;
		this.ihQadl02 = ihQadl02;
		this.ihQadl03 = ihQadl03;
		this.ihPrimary = ihPrimary;
		this.ihCustPo = ihCustPo;
		this.ihSecondary = ihSecondary;
		this.ihShipPo = ihShipPo;
		this.ihExRate2 = ihExRate2;
		this.ihExRatetype = ihExRatetype;
		this.ihDiv = ihDiv;
		this.ihExruSeq = ihExruSeq;
		this.ihExportBatch = ihExportBatch;
		this.ihExportDate = ihExportDate;
		this.ihExportTime = ihExportTime;
		this.ihArSub = ihArSub;
		this.ihPrepTax = ihPrepTax;
		this.ihCustrefVal = ihCustrefVal;
		this.oidIhHist = oidIhHist;
	}

	// Property accessors

	public IhHistId getId() {
		return this.id;
	}

	public void setId(IhHistId id) {
		this.id = id;
	}

	public String getIhCust() {
		return this.ihCust;
	}

	public void setIhCust(String ihCust) {
		this.ihCust = ihCust;
	}

	public String getIhShip() {
		return this.ihShip;
	}

	public void setIhShip(String ihShip) {
		this.ihShip = ihShip;
	}

	public Date getIhOrdDate() {
		return this.ihOrdDate;
	}

	public void setIhOrdDate(Date ihOrdDate) {
		this.ihOrdDate = ihOrdDate;
	}

	public Date getIhReqDate() {
		return this.ihReqDate;
	}

	public void setIhReqDate(Date ihReqDate) {
		this.ihReqDate = ihReqDate;
	}

	public Date getIhDueDate() {
		return this.ihDueDate;
	}

	public void setIhDueDate(Date ihDueDate) {
		this.ihDueDate = ihDueDate;
	}

	public String getIhRmks() {
		return this.ihRmks;
	}

	public void setIhRmks(String ihRmks) {
		this.ihRmks = ihRmks;
	}

	public String getIhCrTerms() {
		return this.ihCrTerms;
	}

	public void setIhCrTerms(String ihCrTerms) {
		this.ihCrTerms = ihCrTerms;
	}

	public String getIhFob() {
		return this.ihFob;
	}

	public void setIhFob(String ihFob) {
		this.ihFob = ihFob;
	}

	public String getIhPo() {
		return this.ihPo;
	}

	public void setIhPo(String ihPo) {
		this.ihPo = ihPo;
	}

	public String getIhShipvia() {
		return this.ihShipvia;
	}

	public void setIhShipvia(String ihShipvia) {
		this.ihShipvia = ihShipvia;
	}

	public Boolean getIhPartial() {
		return this.ihPartial;
	}

	public void setIhPartial(Boolean ihPartial) {
		this.ihPartial = ihPartial;
	}

	public Boolean getIhPrintSo() {
		return this.ihPrintSo;
	}

	public void setIhPrintSo(Boolean ihPrintSo) {
		this.ihPrintSo = ihPrintSo;
	}

	public String getIhPrList() {
		return this.ihPrList;
	}

	public void setIhPrList(String ihPrList) {
		this.ihPrList = ihPrList;
	}

	public String getIhXslspsn() {
		return this.ihXslspsn;
	}

	public void setIhXslspsn(String ihXslspsn) {
		this.ihXslspsn = ihXslspsn;
	}

	public String getIhSource() {
		return this.ihSource;
	}

	public void setIhSource(String ihSource) {
		this.ihSource = ihSource;
	}

	public String getIhXcommPct() {
		return this.ihXcommPct;
	}

	public void setIhXcommPct(String ihXcommPct) {
		this.ihXcommPct = ihXcommPct;
	}

	public String getIhCrCard() {
		return this.ihCrCard;
	}

	public void setIhCrCard(String ihCrCard) {
		this.ihCrCard = ihCrCard;
	}

	public Boolean getIhPrintPl() {
		return this.ihPrintPl;
	}

	public void setIhPrintPl(Boolean ihPrintPl) {
		this.ihPrintPl = ihPrintPl;
	}

	public String getIhCrInit() {
		return this.ihCrInit;
	}

	public void setIhCrInit(String ihCrInit) {
		this.ihCrInit = ihCrInit;
	}

	public String getIhStat() {
		return this.ihStat;
	}

	public void setIhStat(String ihStat) {
		this.ihStat = ihStat;
	}

	public Double getIhQad01() {
		return this.ihQad01;
	}

	public void setIhQad01(Double ihQad01) {
		this.ihQad01 = ihQad01;
	}

	public Double getIhQad02() {
		return this.ihQad02;
	}

	public void setIhQad02(Double ihQad02) {
		this.ihQad02 = ihQad02;
	}

	public Double getIhQad03() {
		return this.ihQad03;
	}

	public void setIhQad03(Double ihQad03) {
		this.ihQad03 = ihQad03;
	}

	public Double getIhDiscPct() {
		return this.ihDiscPct;
	}

	public void setIhDiscPct(Double ihDiscPct) {
		this.ihDiscPct = ihDiscPct;
	}

	public String getIhTaxPct() {
		return this.ihTaxPct;
	}

	public void setIhTaxPct(String ihTaxPct) {
		this.ihTaxPct = ihTaxPct;
	}

	public Double getIhPrepaid() {
		return this.ihPrepaid;
	}

	public void setIhPrepaid(Double ihPrepaid) {
		this.ihPrepaid = ihPrepaid;
	}

	public Boolean getIhToInv() {
		return this.ihToInv;
	}

	public void setIhToInv(Boolean ihToInv) {
		this.ihToInv = ihToInv;
	}

	public Boolean getIhInvoiced() {
		return this.ihInvoiced;
	}

	public void setIhInvoiced(Boolean ihInvoiced) {
		this.ihInvoiced = ihInvoiced;
	}

	public String getIhArAcct() {
		return this.ihArAcct;
	}

	public void setIhArAcct(String ihArAcct) {
		this.ihArAcct = ihArAcct;
	}

	public String getIhArCc() {
		return this.ihArCc;
	}

	public void setIhArCc(String ihArCc) {
		this.ihArCc = ihArCc;
	}

	public Date getIhInvDate() {
		return this.ihInvDate;
	}

	public void setIhInvDate(Date ihInvDate) {
		this.ihInvDate = ihInvDate;
	}

	public Date getIhShipDate() {
		return this.ihShipDate;
	}

	public void setIhShipDate(Date ihShipDate) {
		this.ihShipDate = ihShipDate;
	}

	public Boolean getIhTaxable() {
		return this.ihTaxable;
	}

	public void setIhTaxable(Boolean ihTaxable) {
		this.ihTaxable = ihTaxable;
	}

	public Integer getIhCmtindx() {
		return this.ihCmtindx;
	}

	public void setIhCmtindx(Integer ihCmtindx) {
		this.ihCmtindx = ihCmtindx;
	}

	public Integer getIhQad04() {
		return this.ihQad04;
	}

	public void setIhQad04(Integer ihQad04) {
		this.ihQad04 = ihQad04;
	}

	public String getIhUser1() {
		return this.ihUser1;
	}

	public void setIhUser1(String ihUser1) {
		this.ihUser1 = ihUser1;
	}

	public String getIhUser2() {
		return this.ihUser2;
	}

	public void setIhUser2(String ihUser2) {
		this.ihUser2 = ihUser2;
	}

	public String getIhCurr() {
		return this.ihCurr;
	}

	public void setIhCurr(String ihCurr) {
		this.ihCurr = ihCurr;
	}

	public Double getIhExRate() {
		return this.ihExRate;
	}

	public void setIhExRate(Double ihExRate) {
		this.ihExRate = ihExRate;
	}

	public String getIhLang() {
		return this.ihLang;
	}

	public void setIhLang(String ihLang) {
		this.ihLang = ihLang;
	}

	public String getIhType() {
		return this.ihType;
	}

	public void setIhType(String ihType) {
		this.ihType = ihType;
	}

	public Date getIhConfDate() {
		return this.ihConfDate;
	}

	public void setIhConfDate(Date ihConfDate) {
		this.ihConfDate = ihConfDate;
	}

	public Integer getIhRev() {
		return this.ihRev;
	}

	public void setIhRev(Integer ihRev) {
		this.ihRev = ihRev;
	}

	public String getIhBol() {
		return this.ihBol;
	}

	public void setIhBol(String ihBol) {
		this.ihBol = ihBol;
	}

	public String getIhQad05() {
		return this.ihQad05;
	}

	public void setIhQad05(String ihQad05) {
		this.ihQad05 = ihQad05;
	}

	public Boolean getIhPst() {
		return this.ihPst;
	}

	public void setIhPst(Boolean ihPst) {
		this.ihPst = ihPst;
	}

	public String getIhFstId() {
		return this.ihFstId;
	}

	public void setIhFstId(String ihFstId) {
		this.ihFstId = ihFstId;
	}

	public Double getIhTrl1Amt() {
		return this.ihTrl1Amt;
	}

	public void setIhTrl1Amt(Double ihTrl1Amt) {
		this.ihTrl1Amt = ihTrl1Amt;
	}

	public String getIhTrl1Cd() {
		return this.ihTrl1Cd;
	}

	public void setIhTrl1Cd(String ihTrl1Cd) {
		this.ihTrl1Cd = ihTrl1Cd;
	}

	public Double getIhTrl2Amt() {
		return this.ihTrl2Amt;
	}

	public void setIhTrl2Amt(Double ihTrl2Amt) {
		this.ihTrl2Amt = ihTrl2Amt;
	}

	public String getIhTrl2Cd() {
		return this.ihTrl2Cd;
	}

	public void setIhTrl2Cd(String ihTrl2Cd) {
		this.ihTrl2Cd = ihTrl2Cd;
	}

	public Double getIhTrl3Amt() {
		return this.ihTrl3Amt;
	}

	public void setIhTrl3Amt(Double ihTrl3Amt) {
		this.ihTrl3Amt = ihTrl3Amt;
	}

	public String getIhTrl3Cd() {
		return this.ihTrl3Cd;
	}

	public void setIhTrl3Cd(String ihTrl3Cd) {
		this.ihTrl3Cd = ihTrl3Cd;
	}

	public Double getIhWeight() {
		return this.ihWeight;
	}

	public void setIhWeight(Double ihWeight) {
		this.ihWeight = ihWeight;
	}

	public String getIhWeightUm() {
		return this.ihWeightUm;
	}

	public void setIhWeightUm(String ihWeightUm) {
		this.ihWeightUm = ihWeightUm;
	}

	public Double getIhSize() {
		return this.ihSize;
	}

	public void setIhSize(Double ihSize) {
		this.ihSize = ihSize;
	}

	public String getIhSizeUm() {
		return this.ihSizeUm;
	}

	public void setIhSizeUm(String ihSizeUm) {
		this.ihSizeUm = ihSizeUm;
	}

	public Integer getIhCartons() {
		return this.ihCartons;
	}

	public void setIhCartons(Integer ihCartons) {
		this.ihCartons = ihCartons;
	}

	public String getIhSite() {
		return this.ihSite;
	}

	public void setIhSite(String ihSite) {
		this.ihSite = ihSite;
	}

	public String getIhQuote() {
		return this.ihQuote;
	}

	public void setIhQuote(String ihQuote) {
		this.ihQuote = ihQuote;
	}

	public String getIhTaxc() {
		return this.ihTaxc;
	}

	public void setIhTaxc(String ihTaxc) {
		this.ihTaxc = ihTaxc;
	}

	public String getIhChr01() {
		return this.ihChr01;
	}

	public void setIhChr01(String ihChr01) {
		this.ihChr01 = ihChr01;
	}

	public String getIhChr02() {
		return this.ihChr02;
	}

	public void setIhChr02(String ihChr02) {
		this.ihChr02 = ihChr02;
	}

	public String getIhChr03() {
		return this.ihChr03;
	}

	public void setIhChr03(String ihChr03) {
		this.ihChr03 = ihChr03;
	}

	public String getIhChr04() {
		return this.ihChr04;
	}

	public void setIhChr04(String ihChr04) {
		this.ihChr04 = ihChr04;
	}

	public String getIhChr05() {
		return this.ihChr05;
	}

	public void setIhChr05(String ihChr05) {
		this.ihChr05 = ihChr05;
	}

	public String getIhChr06() {
		return this.ihChr06;
	}

	public void setIhChr06(String ihChr06) {
		this.ihChr06 = ihChr06;
	}

	public String getIhChr07() {
		return this.ihChr07;
	}

	public void setIhChr07(String ihChr07) {
		this.ihChr07 = ihChr07;
	}

	public String getIhChr08() {
		return this.ihChr08;
	}

	public void setIhChr08(String ihChr08) {
		this.ihChr08 = ihChr08;
	}

	public String getIhChr09() {
		return this.ihChr09;
	}

	public void setIhChr09(String ihChr09) {
		this.ihChr09 = ihChr09;
	}

	public String getIhChr10() {
		return this.ihChr10;
	}

	public void setIhChr10(String ihChr10) {
		this.ihChr10 = ihChr10;
	}

	public Date getIhDte01() {
		return this.ihDte01;
	}

	public void setIhDte01(Date ihDte01) {
		this.ihDte01 = ihDte01;
	}

	public Date getIhDte02() {
		return this.ihDte02;
	}

	public void setIhDte02(Date ihDte02) {
		this.ihDte02 = ihDte02;
	}

	public Double getIhDec01() {
		return this.ihDec01;
	}

	public void setIhDec01(Double ihDec01) {
		this.ihDec01 = ihDec01;
	}

	public Double getIhDec02() {
		return this.ihDec02;
	}

	public void setIhDec02(Double ihDec02) {
		this.ihDec02 = ihDec02;
	}

	public Boolean getIhLog01() {
		return this.ihLog01;
	}

	public void setIhLog01(Boolean ihLog01) {
		this.ihLog01 = ihLog01;
	}

	public Boolean getIhCredit() {
		return this.ihCredit;
	}

	public void setIhCredit(Boolean ihCredit) {
		this.ihCredit = ihCredit;
	}

	public String getIhInvCr() {
		return this.ihInvCr;
	}

	public void setIhInvCr(String ihInvCr) {
		this.ihInvCr = ihInvCr;
	}

	public String getIhProject() {
		return this.ihProject;
	}

	public void setIhProject(String ihProject) {
		this.ihProject = ihProject;
	}

	public Double getIhPstPct() {
		return this.ihPstPct;
	}

	public void setIhPstPct(Double ihPstPct) {
		this.ihPstPct = ihPstPct;
	}

	public String getIhFrList() {
		return this.ihFrList;
	}

	public void setIhFrList(String ihFrList) {
		this.ihFrList = ihFrList;
	}

	public String getIhFrTerms() {
		return this.ihFrTerms;
	}

	public void setIhFrTerms(String ihFrTerms) {
		this.ihFrTerms = ihFrTerms;
	}

	public String getIhCommPct() {
		return this.ihCommPct;
	}

	public void setIhCommPct(String ihCommPct) {
		this.ihCommPct = ihCommPct;
	}

	public String getIhSlspsn() {
		return this.ihSlspsn;
	}

	public void setIhSlspsn(String ihSlspsn) {
		this.ihSlspsn = ihSlspsn;
	}

	public Boolean getIhFixRate() {
		return this.ihFixRate;
	}

	public void setIhFixRate(Boolean ihFixRate) {
		this.ihFixRate = ihFixRate;
	}

	public Double getIhEntEx() {
		return this.ihEntEx;
	}

	public void setIhEntEx(Double ihEntEx) {
		this.ihEntEx = ihEntEx;
	}

	public String getIhBill() {
		return this.ihBill;
	}

	public void setIhBill(String ihBill) {
		this.ihBill = ihBill;
	}

	public Boolean getIhPrintBl() {
		return this.ihPrintBl;
	}

	public void setIhPrintBl(Boolean ihPrintBl) {
		this.ihPrintBl = ihPrintBl;
	}

	public String getIhUserid() {
		return this.ihUserid;
	}

	public void setIhUserid(String ihUserid) {
		this.ihUserid = ihUserid;
	}

	public Date getIhTaxDate() {
		return this.ihTaxDate;
	}

	public void setIhTaxDate(Date ihTaxDate) {
		this.ihTaxDate = ihTaxDate;
	}

	public String getIhChannel() {
		return this.ihChannel;
	}

	public void setIhChannel(String ihChannel) {
		this.ihChannel = ihChannel;
	}

	public String getIhInvMthd() {
		return this.ihInvMthd;
	}

	public void setIhInvMthd(String ihInvMthd) {
		this.ihInvMthd = ihInvMthd;
	}

	public String getIhPstId() {
		return this.ihPstId;
	}

	public void setIhPstId(String ihPstId) {
		this.ihPstId = ihPstId;
	}

	public String getIhFsmType() {
		return this.ihFsmType;
	}

	public void setIhFsmType(String ihFsmType) {
		this.ihFsmType = ihFsmType;
	}

	public String getIhBank() {
		return this.ihBank;
	}

	public void setIhBank(String ihBank) {
		this.ihBank = ihBank;
	}

	public Double getIhFrMinWt() {
		return this.ihFrMinWt;
	}

	public void setIhFrMinWt(Double ihFrMinWt) {
		this.ihFrMinWt = ihFrMinWt;
	}

	public String getIhPrList2() {
		return this.ihPrList2;
	}

	public void setIhPrList2(String ihPrList2) {
		this.ihPrList2 = ihPrList2;
	}

	public String getIhTaxEnv() {
		return this.ihTaxEnv;
	}

	public void setIhTaxEnv(String ihTaxEnv) {
		this.ihTaxEnv = ihTaxEnv;
	}

	public String getIhTaxUsage() {
		return this.ihTaxUsage;
	}

	public void setIhTaxUsage(String ihTaxUsage) {
		this.ihTaxUsage = ihTaxUsage;
	}

	public String getIhSaNbr() {
		return this.ihSaNbr;
	}

	public void setIhSaNbr(String ihSaNbr) {
		this.ihSaNbr = ihSaNbr;
	}

	public String getIhCrprlist() {
		return this.ihCrprlist;
	}

	public void setIhCrprlist(String ihCrprlist) {
		this.ihCrprlist = ihCrprlist;
	}

	public Boolean getIhShipEng() {
		return this.ihShipEng;
	}

	public void setIhShipEng(Boolean ihShipEng) {
		this.ihShipEng = ihShipEng;
	}

	public Date getIhCnclDate() {
		return this.ihCnclDate;
	}

	public void setIhCnclDate(Date ihCnclDate) {
		this.ihCnclDate = ihCnclDate;
	}

	public String getIhConrep() {
		return this.ihConrep;
	}

	public void setIhConrep(String ihConrep) {
		this.ihConrep = ihConrep;
	}

	public Boolean getIhSched() {
		return this.ihSched;
	}

	public void setIhSched(Boolean ihSched) {
		this.ihSched = ihSched;
	}

	public Boolean getIhFixPr() {
		return this.ihFixPr;
	}

	public void setIhFixPr(Boolean ihFixPr) {
		this.ihFixPr = ihFixPr;
	}

	public String getIhSchMthd() {
		return this.ihSchMthd;
	}

	public void setIhSchMthd(String ihSchMthd) {
		this.ihSchMthd = ihSchMthd;
	}

	public String getIhCaNbr() {
		return this.ihCaNbr;
	}

	public void setIhCaNbr(String ihCaNbr) {
		this.ihCaNbr = ihCaNbr;
	}

	public String getIhFcgCode() {
		return this.ihFcgCode;
	}

	public void setIhFcgCode(String ihFcgCode) {
		this.ihFcgCode = ihFcgCode;
	}

	public Date getIhModDate() {
		return this.ihModDate;
	}

	public void setIhModDate(Date ihModDate) {
		this.ihModDate = ihModDate;
	}

	public Date getIhPricedDt() {
		return this.ihPricedDt;
	}

	public void setIhPricedDt(Date ihPricedDt) {
		this.ihPricedDt = ihPricedDt;
	}

	public Date getIhPricingDt() {
		return this.ihPricingDt;
	}

	public void setIhPricingDt(Date ihPricingDt) {
		this.ihPricingDt = ihPricingDt;
	}

	public Double getIhRstkPct() {
		return this.ihRstkPct;
	}

	public void setIhRstkPct(Double ihRstkPct) {
		this.ihRstkPct = ihRstkPct;
	}

	public String getIhQadc01() {
		return this.ihQadc01;
	}

	public void setIhQadc01(String ihQadc01) {
		this.ihQadc01 = ihQadc01;
	}

	public String getIhQadc02() {
		return this.ihQadc02;
	}

	public void setIhQadc02(String ihQadc02) {
		this.ihQadc02 = ihQadc02;
	}

	public String getIhQadc03() {
		return this.ihQadc03;
	}

	public void setIhQadc03(String ihQadc03) {
		this.ihQadc03 = ihQadc03;
	}

	public String getIhQadc04() {
		return this.ihQadc04;
	}

	public void setIhQadc04(String ihQadc04) {
		this.ihQadc04 = ihQadc04;
	}

	public String getIhQadc05() {
		return this.ihQadc05;
	}

	public void setIhQadc05(String ihQadc05) {
		this.ihQadc05 = ihQadc05;
	}

	public Date getIhQadt01() {
		return this.ihQadt01;
	}

	public void setIhQadt01(Date ihQadt01) {
		this.ihQadt01 = ihQadt01;
	}

	public Date getIhQadt02() {
		return this.ihQadt02;
	}

	public void setIhQadt02(Date ihQadt02) {
		this.ihQadt02 = ihQadt02;
	}

	public Date getIhQadt03() {
		return this.ihQadt03;
	}

	public void setIhQadt03(Date ihQadt03) {
		this.ihQadt03 = ihQadt03;
	}

	public Double getIhQadd01() {
		return this.ihQadd01;
	}

	public void setIhQadd01(Double ihQadd01) {
		this.ihQadd01 = ihQadd01;
	}

	public Double getIhQadd02() {
		return this.ihQadd02;
	}

	public void setIhQadd02(Double ihQadd02) {
		this.ihQadd02 = ihQadd02;
	}

	public Double getIhQadd03() {
		return this.ihQadd03;
	}

	public void setIhQadd03(Double ihQadd03) {
		this.ihQadd03 = ihQadd03;
	}

	public Integer getIhQadi01() {
		return this.ihQadi01;
	}

	public void setIhQadi01(Integer ihQadi01) {
		this.ihQadi01 = ihQadi01;
	}

	public Integer getIhQadi02() {
		return this.ihQadi02;
	}

	public void setIhQadi02(Integer ihQadi02) {
		this.ihQadi02 = ihQadi02;
	}

	public Integer getIhQadi03() {
		return this.ihQadi03;
	}

	public void setIhQadi03(Integer ihQadi03) {
		this.ihQadi03 = ihQadi03;
	}

	public Boolean getIhQadl01() {
		return this.ihQadl01;
	}

	public void setIhQadl01(Boolean ihQadl01) {
		this.ihQadl01 = ihQadl01;
	}

	public Boolean getIhQadl02() {
		return this.ihQadl02;
	}

	public void setIhQadl02(Boolean ihQadl02) {
		this.ihQadl02 = ihQadl02;
	}

	public Boolean getIhQadl03() {
		return this.ihQadl03;
	}

	public void setIhQadl03(Boolean ihQadl03) {
		this.ihQadl03 = ihQadl03;
	}

	public Boolean getIhPrimary() {
		return this.ihPrimary;
	}

	public void setIhPrimary(Boolean ihPrimary) {
		this.ihPrimary = ihPrimary;
	}

	public String getIhCustPo() {
		return this.ihCustPo;
	}

	public void setIhCustPo(String ihCustPo) {
		this.ihCustPo = ihCustPo;
	}

	public Boolean getIhSecondary() {
		return this.ihSecondary;
	}

	public void setIhSecondary(Boolean ihSecondary) {
		this.ihSecondary = ihSecondary;
	}

	public String getIhShipPo() {
		return this.ihShipPo;
	}

	public void setIhShipPo(String ihShipPo) {
		this.ihShipPo = ihShipPo;
	}

	public Double getIhExRate2() {
		return this.ihExRate2;
	}

	public void setIhExRate2(Double ihExRate2) {
		this.ihExRate2 = ihExRate2;
	}

	public String getIhExRatetype() {
		return this.ihExRatetype;
	}

	public void setIhExRatetype(String ihExRatetype) {
		this.ihExRatetype = ihExRatetype;
	}

	public String getIhDiv() {
		return this.ihDiv;
	}

	public void setIhDiv(String ihDiv) {
		this.ihDiv = ihDiv;
	}

	public Integer getIhExruSeq() {
		return this.ihExruSeq;
	}

	public void setIhExruSeq(Integer ihExruSeq) {
		this.ihExruSeq = ihExruSeq;
	}

	public Integer getIhExportBatch() {
		return this.ihExportBatch;
	}

	public void setIhExportBatch(Integer ihExportBatch) {
		this.ihExportBatch = ihExportBatch;
	}

	public Date getIhExportDate() {
		return this.ihExportDate;
	}

	public void setIhExportDate(Date ihExportDate) {
		this.ihExportDate = ihExportDate;
	}

	public Integer getIhExportTime() {
		return this.ihExportTime;
	}

	public void setIhExportTime(Integer ihExportTime) {
		this.ihExportTime = ihExportTime;
	}

	public String getIhArSub() {
		return this.ihArSub;
	}

	public void setIhArSub(String ihArSub) {
		this.ihArSub = ihArSub;
	}

	public Double getIhPrepTax() {
		return this.ihPrepTax;
	}

	public void setIhPrepTax(Double ihPrepTax) {
		this.ihPrepTax = ihPrepTax;
	}

	public Boolean getIhCustrefVal() {
		return this.ihCustrefVal;
	}

	public void setIhCustrefVal(Boolean ihCustrefVal) {
		this.ihCustrefVal = ihCustrefVal;
	}

	public Double getOidIhHist() {
		return this.oidIhHist;
	}

	public void setOidIhHist(Double oidIhHist) {
		this.oidIhHist = oidIhHist;
	}

}