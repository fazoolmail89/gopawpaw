package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPrjMstr entity provides the base persistence definition of the
 * PrjMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrjMstr implements java.io.Serializable {

	// Fields

	private PrjMstrId id;
	private String prjActionStat;
	private String prjArAcct;
	private String prjArSub;
	private String prjArCc;
	private Double prjBgAbove;
	private Double prjBgBelow;
	private String prjBillTo;
	private String prjChannel;
	private Integer prjCmtindx;
	private Date prjCloseDate;
	private String prjCommPct;
	private String prjCrCard;
	private String prjCrInit;
	private String prjCrTerms;
	private String prjCurr;
	private String prjCust;
	private String prjDesc;
	private Date prjEndDate;
	private String prjEngNbr;
	private String prjEuNbr;
	private Integer prjExruSeq;
	private Double prjExRate;
	private Double prjExRate2;
	private String prjExRatetype;
	private Boolean prjFixRate;
	private Boolean prjGlobalInv;
	private Boolean prjInvDet;
	private Boolean prjInvDetPr;
	private Boolean prjInvLvl;
	private String prjLang;
	private String prjLoc;
	private String prjMref;
	private Date prjOrdDate;
	private String prjPjtCode;
	private String prjPo;
	private String prjPrList;
	private Boolean prjPrRollup;
	private Double prjPrepaid;
	private Double prjPrepTax;
	private Date prjPricingDt;
	private String prjRmks;
	private Date prjShipDate;
	private String prjShipTo;
	private String prjShipvia;
	private String prjSite;
	private String prjSlspsn;
	private Date prjStDate;
	private String prjStatus;
	private Date prjTaxDate;
	private String prjTaxEnv;
	private Boolean prjTaxIn;
	private String prjTaxUsage;
	private Boolean prjTaxable;
	private String prjTaxc;
	private String prjTypeTaxc;
	private Double prjTrl1Amt;
	private String prjTrl1Cd;
	private Double prjTrl2Amt;
	private String prjTrl2Cd;
	private Double prjTrl3Amt;
	private String prjTrl3Cd;
	private String prjUserid;
	private Boolean prjUseBudgets;
	private Date prjModDate;
	private String prjModUserid;
	private String prjUser1;
	private String prjUser2;
	private Double prjDec01;
	private Boolean prjLog01;
	private Date prjDte01;
	private String prjQadc01;
	private String prjQadc02;
	private Double prjQadd01;
	private Double prjQadd02;
	private Integer prjQadi01;
	private Integer prjQadi02;
	private Boolean prjQadl01;
	private Boolean prjQadl02;
	private Date prjQadt01;
	private Date prjQadt02;
	private Double oidPrjMstr;

	// Constructors

	/** default constructor */
	public AbstractPrjMstr() {
	}

	/** minimal constructor */
	public AbstractPrjMstr(PrjMstrId id, String prjActionStat,
			String prjArAcct, String prjArSub, String prjArCc,
			Double prjBgAbove, Double prjBgBelow, String prjBillTo,
			String prjChannel, Integer prjCmtindx, String prjCommPct,
			String prjCrCard, String prjCrInit, String prjCrTerms,
			String prjCurr, String prjCust, String prjDesc, String prjEngNbr,
			String prjEuNbr, Integer prjExruSeq, Double prjExRate,
			Double prjExRate2, String prjExRatetype, Boolean prjFixRate,
			Boolean prjGlobalInv, Boolean prjInvDet, Boolean prjInvDetPr,
			Boolean prjInvLvl, String prjLang, String prjLoc, String prjMref,
			String prjPjtCode, String prjPo, String prjPrList,
			Boolean prjPrRollup, Double prjPrepaid, Double prjPrepTax,
			String prjRmks, String prjShipTo, String prjShipvia,
			String prjSite, String prjSlspsn, String prjStatus,
			String prjTaxEnv, Boolean prjTaxIn, String prjTaxUsage,
			Boolean prjTaxable, String prjTaxc, String prjTypeTaxc,
			Double prjTrl1Amt, String prjTrl1Cd, Double prjTrl2Amt,
			String prjTrl2Cd, Double prjTrl3Amt, String prjTrl3Cd,
			String prjUserid, Boolean prjUseBudgets, Date prjModDate,
			String prjModUserid, Double oidPrjMstr) {
		this.id = id;
		this.prjActionStat = prjActionStat;
		this.prjArAcct = prjArAcct;
		this.prjArSub = prjArSub;
		this.prjArCc = prjArCc;
		this.prjBgAbove = prjBgAbove;
		this.prjBgBelow = prjBgBelow;
		this.prjBillTo = prjBillTo;
		this.prjChannel = prjChannel;
		this.prjCmtindx = prjCmtindx;
		this.prjCommPct = prjCommPct;
		this.prjCrCard = prjCrCard;
		this.prjCrInit = prjCrInit;
		this.prjCrTerms = prjCrTerms;
		this.prjCurr = prjCurr;
		this.prjCust = prjCust;
		this.prjDesc = prjDesc;
		this.prjEngNbr = prjEngNbr;
		this.prjEuNbr = prjEuNbr;
		this.prjExruSeq = prjExruSeq;
		this.prjExRate = prjExRate;
		this.prjExRate2 = prjExRate2;
		this.prjExRatetype = prjExRatetype;
		this.prjFixRate = prjFixRate;
		this.prjGlobalInv = prjGlobalInv;
		this.prjInvDet = prjInvDet;
		this.prjInvDetPr = prjInvDetPr;
		this.prjInvLvl = prjInvLvl;
		this.prjLang = prjLang;
		this.prjLoc = prjLoc;
		this.prjMref = prjMref;
		this.prjPjtCode = prjPjtCode;
		this.prjPo = prjPo;
		this.prjPrList = prjPrList;
		this.prjPrRollup = prjPrRollup;
		this.prjPrepaid = prjPrepaid;
		this.prjPrepTax = prjPrepTax;
		this.prjRmks = prjRmks;
		this.prjShipTo = prjShipTo;
		this.prjShipvia = prjShipvia;
		this.prjSite = prjSite;
		this.prjSlspsn = prjSlspsn;
		this.prjStatus = prjStatus;
		this.prjTaxEnv = prjTaxEnv;
		this.prjTaxIn = prjTaxIn;
		this.prjTaxUsage = prjTaxUsage;
		this.prjTaxable = prjTaxable;
		this.prjTaxc = prjTaxc;
		this.prjTypeTaxc = prjTypeTaxc;
		this.prjTrl1Amt = prjTrl1Amt;
		this.prjTrl1Cd = prjTrl1Cd;
		this.prjTrl2Amt = prjTrl2Amt;
		this.prjTrl2Cd = prjTrl2Cd;
		this.prjTrl3Amt = prjTrl3Amt;
		this.prjTrl3Cd = prjTrl3Cd;
		this.prjUserid = prjUserid;
		this.prjUseBudgets = prjUseBudgets;
		this.prjModDate = prjModDate;
		this.prjModUserid = prjModUserid;
		this.oidPrjMstr = oidPrjMstr;
	}

	/** full constructor */
	public AbstractPrjMstr(PrjMstrId id, String prjActionStat,
			String prjArAcct, String prjArSub, String prjArCc,
			Double prjBgAbove, Double prjBgBelow, String prjBillTo,
			String prjChannel, Integer prjCmtindx, Date prjCloseDate,
			String prjCommPct, String prjCrCard, String prjCrInit,
			String prjCrTerms, String prjCurr, String prjCust, String prjDesc,
			Date prjEndDate, String prjEngNbr, String prjEuNbr,
			Integer prjExruSeq, Double prjExRate, Double prjExRate2,
			String prjExRatetype, Boolean prjFixRate, Boolean prjGlobalInv,
			Boolean prjInvDet, Boolean prjInvDetPr, Boolean prjInvLvl,
			String prjLang, String prjLoc, String prjMref, Date prjOrdDate,
			String prjPjtCode, String prjPo, String prjPrList,
			Boolean prjPrRollup, Double prjPrepaid, Double prjPrepTax,
			Date prjPricingDt, String prjRmks, Date prjShipDate,
			String prjShipTo, String prjShipvia, String prjSite,
			String prjSlspsn, Date prjStDate, String prjStatus,
			Date prjTaxDate, String prjTaxEnv, Boolean prjTaxIn,
			String prjTaxUsage, Boolean prjTaxable, String prjTaxc,
			String prjTypeTaxc, Double prjTrl1Amt, String prjTrl1Cd,
			Double prjTrl2Amt, String prjTrl2Cd, Double prjTrl3Amt,
			String prjTrl3Cd, String prjUserid, Boolean prjUseBudgets,
			Date prjModDate, String prjModUserid, String prjUser1,
			String prjUser2, Double prjDec01, Boolean prjLog01, Date prjDte01,
			String prjQadc01, String prjQadc02, Double prjQadd01,
			Double prjQadd02, Integer prjQadi01, Integer prjQadi02,
			Boolean prjQadl01, Boolean prjQadl02, Date prjQadt01,
			Date prjQadt02, Double oidPrjMstr) {
		this.id = id;
		this.prjActionStat = prjActionStat;
		this.prjArAcct = prjArAcct;
		this.prjArSub = prjArSub;
		this.prjArCc = prjArCc;
		this.prjBgAbove = prjBgAbove;
		this.prjBgBelow = prjBgBelow;
		this.prjBillTo = prjBillTo;
		this.prjChannel = prjChannel;
		this.prjCmtindx = prjCmtindx;
		this.prjCloseDate = prjCloseDate;
		this.prjCommPct = prjCommPct;
		this.prjCrCard = prjCrCard;
		this.prjCrInit = prjCrInit;
		this.prjCrTerms = prjCrTerms;
		this.prjCurr = prjCurr;
		this.prjCust = prjCust;
		this.prjDesc = prjDesc;
		this.prjEndDate = prjEndDate;
		this.prjEngNbr = prjEngNbr;
		this.prjEuNbr = prjEuNbr;
		this.prjExruSeq = prjExruSeq;
		this.prjExRate = prjExRate;
		this.prjExRate2 = prjExRate2;
		this.prjExRatetype = prjExRatetype;
		this.prjFixRate = prjFixRate;
		this.prjGlobalInv = prjGlobalInv;
		this.prjInvDet = prjInvDet;
		this.prjInvDetPr = prjInvDetPr;
		this.prjInvLvl = prjInvLvl;
		this.prjLang = prjLang;
		this.prjLoc = prjLoc;
		this.prjMref = prjMref;
		this.prjOrdDate = prjOrdDate;
		this.prjPjtCode = prjPjtCode;
		this.prjPo = prjPo;
		this.prjPrList = prjPrList;
		this.prjPrRollup = prjPrRollup;
		this.prjPrepaid = prjPrepaid;
		this.prjPrepTax = prjPrepTax;
		this.prjPricingDt = prjPricingDt;
		this.prjRmks = prjRmks;
		this.prjShipDate = prjShipDate;
		this.prjShipTo = prjShipTo;
		this.prjShipvia = prjShipvia;
		this.prjSite = prjSite;
		this.prjSlspsn = prjSlspsn;
		this.prjStDate = prjStDate;
		this.prjStatus = prjStatus;
		this.prjTaxDate = prjTaxDate;
		this.prjTaxEnv = prjTaxEnv;
		this.prjTaxIn = prjTaxIn;
		this.prjTaxUsage = prjTaxUsage;
		this.prjTaxable = prjTaxable;
		this.prjTaxc = prjTaxc;
		this.prjTypeTaxc = prjTypeTaxc;
		this.prjTrl1Amt = prjTrl1Amt;
		this.prjTrl1Cd = prjTrl1Cd;
		this.prjTrl2Amt = prjTrl2Amt;
		this.prjTrl2Cd = prjTrl2Cd;
		this.prjTrl3Amt = prjTrl3Amt;
		this.prjTrl3Cd = prjTrl3Cd;
		this.prjUserid = prjUserid;
		this.prjUseBudgets = prjUseBudgets;
		this.prjModDate = prjModDate;
		this.prjModUserid = prjModUserid;
		this.prjUser1 = prjUser1;
		this.prjUser2 = prjUser2;
		this.prjDec01 = prjDec01;
		this.prjLog01 = prjLog01;
		this.prjDte01 = prjDte01;
		this.prjQadc01 = prjQadc01;
		this.prjQadc02 = prjQadc02;
		this.prjQadd01 = prjQadd01;
		this.prjQadd02 = prjQadd02;
		this.prjQadi01 = prjQadi01;
		this.prjQadi02 = prjQadi02;
		this.prjQadl01 = prjQadl01;
		this.prjQadl02 = prjQadl02;
		this.prjQadt01 = prjQadt01;
		this.prjQadt02 = prjQadt02;
		this.oidPrjMstr = oidPrjMstr;
	}

	// Property accessors

	public PrjMstrId getId() {
		return this.id;
	}

	public void setId(PrjMstrId id) {
		this.id = id;
	}

	public String getPrjActionStat() {
		return this.prjActionStat;
	}

	public void setPrjActionStat(String prjActionStat) {
		this.prjActionStat = prjActionStat;
	}

	public String getPrjArAcct() {
		return this.prjArAcct;
	}

	public void setPrjArAcct(String prjArAcct) {
		this.prjArAcct = prjArAcct;
	}

	public String getPrjArSub() {
		return this.prjArSub;
	}

	public void setPrjArSub(String prjArSub) {
		this.prjArSub = prjArSub;
	}

	public String getPrjArCc() {
		return this.prjArCc;
	}

	public void setPrjArCc(String prjArCc) {
		this.prjArCc = prjArCc;
	}

	public Double getPrjBgAbove() {
		return this.prjBgAbove;
	}

	public void setPrjBgAbove(Double prjBgAbove) {
		this.prjBgAbove = prjBgAbove;
	}

	public Double getPrjBgBelow() {
		return this.prjBgBelow;
	}

	public void setPrjBgBelow(Double prjBgBelow) {
		this.prjBgBelow = prjBgBelow;
	}

	public String getPrjBillTo() {
		return this.prjBillTo;
	}

	public void setPrjBillTo(String prjBillTo) {
		this.prjBillTo = prjBillTo;
	}

	public String getPrjChannel() {
		return this.prjChannel;
	}

	public void setPrjChannel(String prjChannel) {
		this.prjChannel = prjChannel;
	}

	public Integer getPrjCmtindx() {
		return this.prjCmtindx;
	}

	public void setPrjCmtindx(Integer prjCmtindx) {
		this.prjCmtindx = prjCmtindx;
	}

	public Date getPrjCloseDate() {
		return this.prjCloseDate;
	}

	public void setPrjCloseDate(Date prjCloseDate) {
		this.prjCloseDate = prjCloseDate;
	}

	public String getPrjCommPct() {
		return this.prjCommPct;
	}

	public void setPrjCommPct(String prjCommPct) {
		this.prjCommPct = prjCommPct;
	}

	public String getPrjCrCard() {
		return this.prjCrCard;
	}

	public void setPrjCrCard(String prjCrCard) {
		this.prjCrCard = prjCrCard;
	}

	public String getPrjCrInit() {
		return this.prjCrInit;
	}

	public void setPrjCrInit(String prjCrInit) {
		this.prjCrInit = prjCrInit;
	}

	public String getPrjCrTerms() {
		return this.prjCrTerms;
	}

	public void setPrjCrTerms(String prjCrTerms) {
		this.prjCrTerms = prjCrTerms;
	}

	public String getPrjCurr() {
		return this.prjCurr;
	}

	public void setPrjCurr(String prjCurr) {
		this.prjCurr = prjCurr;
	}

	public String getPrjCust() {
		return this.prjCust;
	}

	public void setPrjCust(String prjCust) {
		this.prjCust = prjCust;
	}

	public String getPrjDesc() {
		return this.prjDesc;
	}

	public void setPrjDesc(String prjDesc) {
		this.prjDesc = prjDesc;
	}

	public Date getPrjEndDate() {
		return this.prjEndDate;
	}

	public void setPrjEndDate(Date prjEndDate) {
		this.prjEndDate = prjEndDate;
	}

	public String getPrjEngNbr() {
		return this.prjEngNbr;
	}

	public void setPrjEngNbr(String prjEngNbr) {
		this.prjEngNbr = prjEngNbr;
	}

	public String getPrjEuNbr() {
		return this.prjEuNbr;
	}

	public void setPrjEuNbr(String prjEuNbr) {
		this.prjEuNbr = prjEuNbr;
	}

	public Integer getPrjExruSeq() {
		return this.prjExruSeq;
	}

	public void setPrjExruSeq(Integer prjExruSeq) {
		this.prjExruSeq = prjExruSeq;
	}

	public Double getPrjExRate() {
		return this.prjExRate;
	}

	public void setPrjExRate(Double prjExRate) {
		this.prjExRate = prjExRate;
	}

	public Double getPrjExRate2() {
		return this.prjExRate2;
	}

	public void setPrjExRate2(Double prjExRate2) {
		this.prjExRate2 = prjExRate2;
	}

	public String getPrjExRatetype() {
		return this.prjExRatetype;
	}

	public void setPrjExRatetype(String prjExRatetype) {
		this.prjExRatetype = prjExRatetype;
	}

	public Boolean getPrjFixRate() {
		return this.prjFixRate;
	}

	public void setPrjFixRate(Boolean prjFixRate) {
		this.prjFixRate = prjFixRate;
	}

	public Boolean getPrjGlobalInv() {
		return this.prjGlobalInv;
	}

	public void setPrjGlobalInv(Boolean prjGlobalInv) {
		this.prjGlobalInv = prjGlobalInv;
	}

	public Boolean getPrjInvDet() {
		return this.prjInvDet;
	}

	public void setPrjInvDet(Boolean prjInvDet) {
		this.prjInvDet = prjInvDet;
	}

	public Boolean getPrjInvDetPr() {
		return this.prjInvDetPr;
	}

	public void setPrjInvDetPr(Boolean prjInvDetPr) {
		this.prjInvDetPr = prjInvDetPr;
	}

	public Boolean getPrjInvLvl() {
		return this.prjInvLvl;
	}

	public void setPrjInvLvl(Boolean prjInvLvl) {
		this.prjInvLvl = prjInvLvl;
	}

	public String getPrjLang() {
		return this.prjLang;
	}

	public void setPrjLang(String prjLang) {
		this.prjLang = prjLang;
	}

	public String getPrjLoc() {
		return this.prjLoc;
	}

	public void setPrjLoc(String prjLoc) {
		this.prjLoc = prjLoc;
	}

	public String getPrjMref() {
		return this.prjMref;
	}

	public void setPrjMref(String prjMref) {
		this.prjMref = prjMref;
	}

	public Date getPrjOrdDate() {
		return this.prjOrdDate;
	}

	public void setPrjOrdDate(Date prjOrdDate) {
		this.prjOrdDate = prjOrdDate;
	}

	public String getPrjPjtCode() {
		return this.prjPjtCode;
	}

	public void setPrjPjtCode(String prjPjtCode) {
		this.prjPjtCode = prjPjtCode;
	}

	public String getPrjPo() {
		return this.prjPo;
	}

	public void setPrjPo(String prjPo) {
		this.prjPo = prjPo;
	}

	public String getPrjPrList() {
		return this.prjPrList;
	}

	public void setPrjPrList(String prjPrList) {
		this.prjPrList = prjPrList;
	}

	public Boolean getPrjPrRollup() {
		return this.prjPrRollup;
	}

	public void setPrjPrRollup(Boolean prjPrRollup) {
		this.prjPrRollup = prjPrRollup;
	}

	public Double getPrjPrepaid() {
		return this.prjPrepaid;
	}

	public void setPrjPrepaid(Double prjPrepaid) {
		this.prjPrepaid = prjPrepaid;
	}

	public Double getPrjPrepTax() {
		return this.prjPrepTax;
	}

	public void setPrjPrepTax(Double prjPrepTax) {
		this.prjPrepTax = prjPrepTax;
	}

	public Date getPrjPricingDt() {
		return this.prjPricingDt;
	}

	public void setPrjPricingDt(Date prjPricingDt) {
		this.prjPricingDt = prjPricingDt;
	}

	public String getPrjRmks() {
		return this.prjRmks;
	}

	public void setPrjRmks(String prjRmks) {
		this.prjRmks = prjRmks;
	}

	public Date getPrjShipDate() {
		return this.prjShipDate;
	}

	public void setPrjShipDate(Date prjShipDate) {
		this.prjShipDate = prjShipDate;
	}

	public String getPrjShipTo() {
		return this.prjShipTo;
	}

	public void setPrjShipTo(String prjShipTo) {
		this.prjShipTo = prjShipTo;
	}

	public String getPrjShipvia() {
		return this.prjShipvia;
	}

	public void setPrjShipvia(String prjShipvia) {
		this.prjShipvia = prjShipvia;
	}

	public String getPrjSite() {
		return this.prjSite;
	}

	public void setPrjSite(String prjSite) {
		this.prjSite = prjSite;
	}

	public String getPrjSlspsn() {
		return this.prjSlspsn;
	}

	public void setPrjSlspsn(String prjSlspsn) {
		this.prjSlspsn = prjSlspsn;
	}

	public Date getPrjStDate() {
		return this.prjStDate;
	}

	public void setPrjStDate(Date prjStDate) {
		this.prjStDate = prjStDate;
	}

	public String getPrjStatus() {
		return this.prjStatus;
	}

	public void setPrjStatus(String prjStatus) {
		this.prjStatus = prjStatus;
	}

	public Date getPrjTaxDate() {
		return this.prjTaxDate;
	}

	public void setPrjTaxDate(Date prjTaxDate) {
		this.prjTaxDate = prjTaxDate;
	}

	public String getPrjTaxEnv() {
		return this.prjTaxEnv;
	}

	public void setPrjTaxEnv(String prjTaxEnv) {
		this.prjTaxEnv = prjTaxEnv;
	}

	public Boolean getPrjTaxIn() {
		return this.prjTaxIn;
	}

	public void setPrjTaxIn(Boolean prjTaxIn) {
		this.prjTaxIn = prjTaxIn;
	}

	public String getPrjTaxUsage() {
		return this.prjTaxUsage;
	}

	public void setPrjTaxUsage(String prjTaxUsage) {
		this.prjTaxUsage = prjTaxUsage;
	}

	public Boolean getPrjTaxable() {
		return this.prjTaxable;
	}

	public void setPrjTaxable(Boolean prjTaxable) {
		this.prjTaxable = prjTaxable;
	}

	public String getPrjTaxc() {
		return this.prjTaxc;
	}

	public void setPrjTaxc(String prjTaxc) {
		this.prjTaxc = prjTaxc;
	}

	public String getPrjTypeTaxc() {
		return this.prjTypeTaxc;
	}

	public void setPrjTypeTaxc(String prjTypeTaxc) {
		this.prjTypeTaxc = prjTypeTaxc;
	}

	public Double getPrjTrl1Amt() {
		return this.prjTrl1Amt;
	}

	public void setPrjTrl1Amt(Double prjTrl1Amt) {
		this.prjTrl1Amt = prjTrl1Amt;
	}

	public String getPrjTrl1Cd() {
		return this.prjTrl1Cd;
	}

	public void setPrjTrl1Cd(String prjTrl1Cd) {
		this.prjTrl1Cd = prjTrl1Cd;
	}

	public Double getPrjTrl2Amt() {
		return this.prjTrl2Amt;
	}

	public void setPrjTrl2Amt(Double prjTrl2Amt) {
		this.prjTrl2Amt = prjTrl2Amt;
	}

	public String getPrjTrl2Cd() {
		return this.prjTrl2Cd;
	}

	public void setPrjTrl2Cd(String prjTrl2Cd) {
		this.prjTrl2Cd = prjTrl2Cd;
	}

	public Double getPrjTrl3Amt() {
		return this.prjTrl3Amt;
	}

	public void setPrjTrl3Amt(Double prjTrl3Amt) {
		this.prjTrl3Amt = prjTrl3Amt;
	}

	public String getPrjTrl3Cd() {
		return this.prjTrl3Cd;
	}

	public void setPrjTrl3Cd(String prjTrl3Cd) {
		this.prjTrl3Cd = prjTrl3Cd;
	}

	public String getPrjUserid() {
		return this.prjUserid;
	}

	public void setPrjUserid(String prjUserid) {
		this.prjUserid = prjUserid;
	}

	public Boolean getPrjUseBudgets() {
		return this.prjUseBudgets;
	}

	public void setPrjUseBudgets(Boolean prjUseBudgets) {
		this.prjUseBudgets = prjUseBudgets;
	}

	public Date getPrjModDate() {
		return this.prjModDate;
	}

	public void setPrjModDate(Date prjModDate) {
		this.prjModDate = prjModDate;
	}

	public String getPrjModUserid() {
		return this.prjModUserid;
	}

	public void setPrjModUserid(String prjModUserid) {
		this.prjModUserid = prjModUserid;
	}

	public String getPrjUser1() {
		return this.prjUser1;
	}

	public void setPrjUser1(String prjUser1) {
		this.prjUser1 = prjUser1;
	}

	public String getPrjUser2() {
		return this.prjUser2;
	}

	public void setPrjUser2(String prjUser2) {
		this.prjUser2 = prjUser2;
	}

	public Double getPrjDec01() {
		return this.prjDec01;
	}

	public void setPrjDec01(Double prjDec01) {
		this.prjDec01 = prjDec01;
	}

	public Boolean getPrjLog01() {
		return this.prjLog01;
	}

	public void setPrjLog01(Boolean prjLog01) {
		this.prjLog01 = prjLog01;
	}

	public Date getPrjDte01() {
		return this.prjDte01;
	}

	public void setPrjDte01(Date prjDte01) {
		this.prjDte01 = prjDte01;
	}

	public String getPrjQadc01() {
		return this.prjQadc01;
	}

	public void setPrjQadc01(String prjQadc01) {
		this.prjQadc01 = prjQadc01;
	}

	public String getPrjQadc02() {
		return this.prjQadc02;
	}

	public void setPrjQadc02(String prjQadc02) {
		this.prjQadc02 = prjQadc02;
	}

	public Double getPrjQadd01() {
		return this.prjQadd01;
	}

	public void setPrjQadd01(Double prjQadd01) {
		this.prjQadd01 = prjQadd01;
	}

	public Double getPrjQadd02() {
		return this.prjQadd02;
	}

	public void setPrjQadd02(Double prjQadd02) {
		this.prjQadd02 = prjQadd02;
	}

	public Integer getPrjQadi01() {
		return this.prjQadi01;
	}

	public void setPrjQadi01(Integer prjQadi01) {
		this.prjQadi01 = prjQadi01;
	}

	public Integer getPrjQadi02() {
		return this.prjQadi02;
	}

	public void setPrjQadi02(Integer prjQadi02) {
		this.prjQadi02 = prjQadi02;
	}

	public Boolean getPrjQadl01() {
		return this.prjQadl01;
	}

	public void setPrjQadl01(Boolean prjQadl01) {
		this.prjQadl01 = prjQadl01;
	}

	public Boolean getPrjQadl02() {
		return this.prjQadl02;
	}

	public void setPrjQadl02(Boolean prjQadl02) {
		this.prjQadl02 = prjQadl02;
	}

	public Date getPrjQadt01() {
		return this.prjQadt01;
	}

	public void setPrjQadt01(Date prjQadt01) {
		this.prjQadt01 = prjQadt01;
	}

	public Date getPrjQadt02() {
		return this.prjQadt02;
	}

	public void setPrjQadt02(Date prjQadt02) {
		this.prjQadt02 = prjQadt02;
	}

	public Double getOidPrjMstr() {
		return this.oidPrjMstr;
	}

	public void setOidPrjMstr(Double oidPrjMstr) {
		this.oidPrjMstr = oidPrjMstr;
	}

}