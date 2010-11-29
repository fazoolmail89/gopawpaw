package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSoMstr entity provides the base persistence definition of the SoMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSoMstr implements java.io.Serializable {

	// Fields

	private SoMstrId id;
	private String soCust;
	private String soShip;
	private Date soOrdDate;
	private Date soReqDate;
	private Date soDueDate;
	private String soRmks;
	private String soCrTerms;
	private String soFob;
	private String soPo;
	private String soShipvia;
	private Boolean soPartial;
	private Boolean soPrintSo;
	private String soInvNbr;
	private String soPrList;
	private String soXslspsn;
	private String soSource;
	private String soXcommPct;
	private String soCrCard;
	private Boolean soPrintPl;
	private String soCrInit;
	private String soStat;
	private Double soQad01;
	private Double soQad02;
	private Double soQad03;
	private Double soDiscPct;
	private String soTaxPct;
	private Double soPrepaid;
	private Boolean soToInv;
	private Boolean soInvoiced;
	private String soArAcct;
	private String soArCc;
	private Date soInvDate;
	private Date soShipDate;
	private Boolean soTaxable;
	private Integer soCmtindx;
	private Integer soQad04;
	private String soUser1;
	private String soUser2;
	private String soCurr;
	private Double soExRate;
	private String soLang;
	private String soType;
	private Date soConfDate;
	private Integer soRev;
	private String soBol;
	private String soQad05;
	private Boolean soPst;
	private String soFstId;
	private Double soTrl1Amt;
	private String soTrl1Cd;
	private Double soTrl2Amt;
	private String soTrl2Cd;
	private Double soTrl3Amt;
	private String soTrl3Cd;
	private Double soWeight;
	private String soWeightUm;
	private Double soSize;
	private String soSizeUm;
	private Integer soCartons;
	private String soSite;
	private String soPstId;
	private Date soCnclDate;
	private String soQuote;
	private String soTaxc;
	private String soChr01;
	private String soChr02;
	private String soChr03;
	private String soChr04;
	private String soChr05;
	private String soChr06;
	private String soChr07;
	private String soChr08;
	private String soChr09;
	private String soChr10;
	private Date soDte01;
	private Date soDte02;
	private Double soDec01;
	private Double soDec02;
	private Boolean soLog01;
	private Boolean soCredit;
	private String soInvCr;
	private String soProject;
	private String soChannel;
	private Double soPstPct;
	private String soFrList;
	private String soFrTerms;
	private String soSlspsn;
	private String soCommPct;
	private String soInvMthd;
	private Boolean soFixRate;
	private Double soEntEx;
	private String soBill;
	private Boolean soPrintBl;
	private String soUserid;
	private Date soTaxDate;
	private String soFsmType;
	private String soConrep;
	private String soBank;
	private String soTaxEnv;
	private Boolean soSched;
	private Double soFrMinWt;
	private String soPrList2;
	private String soTaxUsage;
	private String soSaNbr;
	private Boolean soFixPr;
	private String soSchMthd;
	private Date soPricingDt;
	private Date soPricedDt;
	private String soCaNbr;
	private String soEngCode;
	private String soFcgCode;
	private Boolean soShipEng;
	private String soCrprlist;
	private String soQadc01;
	private String soQadc02;
	private String soQadc03;
	private String soQadc04;
	private String soQadc05;
	private Boolean soQadl01;
	private Boolean soQadl02;
	private Boolean soInclIss;
	private Integer soQadi01;
	private Integer soQadi02;
	private Integer soQadi03;
	private Double soQadd01;
	private Double soQadd02;
	private Double soQadd03;
	private Date soQadt01;
	private Date soQadt02;
	private Date soQadt03;
	private Integer soAuthDays;
	private Boolean soCumAcct;
	private Boolean soMergeRss;
	private Integer soShipCmplt;
	private Boolean soBumpAll;
	private Boolean soPrimary;
	private String soCustPo;
	private Boolean soSecondary;
	private String soShipPo;
	private Double soExRate2;
	private String soExRatetype;
	private String soDiv;
	private Integer soExruSeq;
	private String soAppOwner;
	private String soArSub;
	private Boolean soSeqOrder;
	private Boolean soIncInRss;
	private Integer soFirmSeqDays;
	private Double soPrepTax;
	private Boolean soQadl04;
	private Boolean soCustrefVal;
	private Boolean soConsignment;
	private Integer soMaxAgingDays;
	private String soConsignLoc;
	private String soIntransLoc;
	private Boolean soAutoReplenish;
	private String soRevenue;
	private String soFsaccrAcct;
	private String soFsaccrSub;
	private String soFsaccrCc;
	private String soFsdefAcct;
	private String soFsdefSub;
	private String soFsdefCc;
	private Boolean soManualFrTerms;
	private Double oidSoMstr;

	// Constructors

	/** default constructor */
	public AbstractSoMstr() {
	}

	/** minimal constructor */
	public AbstractSoMstr(SoMstrId id, Boolean soPrimary, String soCustPo,
			Double soExRate2, String soExRatetype, Integer soExruSeq,
			Double soPrepTax, Boolean soCustrefVal, Boolean soConsignment,
			Integer soMaxAgingDays, String soConsignLoc, String soIntransLoc,
			Boolean soAutoReplenish, String soRevenue, String soFsaccrAcct,
			String soFsaccrSub, String soFsaccrCc, String soFsdefAcct,
			String soFsdefSub, String soFsdefCc, Boolean soManualFrTerms,
			Double oidSoMstr) {
		this.id = id;
		this.soPrimary = soPrimary;
		this.soCustPo = soCustPo;
		this.soExRate2 = soExRate2;
		this.soExRatetype = soExRatetype;
		this.soExruSeq = soExruSeq;
		this.soPrepTax = soPrepTax;
		this.soCustrefVal = soCustrefVal;
		this.soConsignment = soConsignment;
		this.soMaxAgingDays = soMaxAgingDays;
		this.soConsignLoc = soConsignLoc;
		this.soIntransLoc = soIntransLoc;
		this.soAutoReplenish = soAutoReplenish;
		this.soRevenue = soRevenue;
		this.soFsaccrAcct = soFsaccrAcct;
		this.soFsaccrSub = soFsaccrSub;
		this.soFsaccrCc = soFsaccrCc;
		this.soFsdefAcct = soFsdefAcct;
		this.soFsdefSub = soFsdefSub;
		this.soFsdefCc = soFsdefCc;
		this.soManualFrTerms = soManualFrTerms;
		this.oidSoMstr = oidSoMstr;
	}

	/** full constructor */
	public AbstractSoMstr(SoMstrId id, String soCust, String soShip,
			Date soOrdDate, Date soReqDate, Date soDueDate, String soRmks,
			String soCrTerms, String soFob, String soPo, String soShipvia,
			Boolean soPartial, Boolean soPrintSo, String soInvNbr,
			String soPrList, String soXslspsn, String soSource,
			String soXcommPct, String soCrCard, Boolean soPrintPl,
			String soCrInit, String soStat, Double soQad01, Double soQad02,
			Double soQad03, Double soDiscPct, String soTaxPct,
			Double soPrepaid, Boolean soToInv, Boolean soInvoiced,
			String soArAcct, String soArCc, Date soInvDate, Date soShipDate,
			Boolean soTaxable, Integer soCmtindx, Integer soQad04,
			String soUser1, String soUser2, String soCurr, Double soExRate,
			String soLang, String soType, Date soConfDate, Integer soRev,
			String soBol, String soQad05, Boolean soPst, String soFstId,
			Double soTrl1Amt, String soTrl1Cd, Double soTrl2Amt,
			String soTrl2Cd, Double soTrl3Amt, String soTrl3Cd,
			Double soWeight, String soWeightUm, Double soSize, String soSizeUm,
			Integer soCartons, String soSite, String soPstId, Date soCnclDate,
			String soQuote, String soTaxc, String soChr01, String soChr02,
			String soChr03, String soChr04, String soChr05, String soChr06,
			String soChr07, String soChr08, String soChr09, String soChr10,
			Date soDte01, Date soDte02, Double soDec01, Double soDec02,
			Boolean soLog01, Boolean soCredit, String soInvCr,
			String soProject, String soChannel, Double soPstPct,
			String soFrList, String soFrTerms, String soSlspsn,
			String soCommPct, String soInvMthd, Boolean soFixRate,
			Double soEntEx, String soBill, Boolean soPrintBl, String soUserid,
			Date soTaxDate, String soFsmType, String soConrep, String soBank,
			String soTaxEnv, Boolean soSched, Double soFrMinWt,
			String soPrList2, String soTaxUsage, String soSaNbr,
			Boolean soFixPr, String soSchMthd, Date soPricingDt,
			Date soPricedDt, String soCaNbr, String soEngCode,
			String soFcgCode, Boolean soShipEng, String soCrprlist,
			String soQadc01, String soQadc02, String soQadc03, String soQadc04,
			String soQadc05, Boolean soQadl01, Boolean soQadl02,
			Boolean soInclIss, Integer soQadi01, Integer soQadi02,
			Integer soQadi03, Double soQadd01, Double soQadd02,
			Double soQadd03, Date soQadt01, Date soQadt02, Date soQadt03,
			Integer soAuthDays, Boolean soCumAcct, Boolean soMergeRss,
			Integer soShipCmplt, Boolean soBumpAll, Boolean soPrimary,
			String soCustPo, Boolean soSecondary, String soShipPo,
			Double soExRate2, String soExRatetype, String soDiv,
			Integer soExruSeq, String soAppOwner, String soArSub,
			Boolean soSeqOrder, Boolean soIncInRss, Integer soFirmSeqDays,
			Double soPrepTax, Boolean soQadl04, Boolean soCustrefVal,
			Boolean soConsignment, Integer soMaxAgingDays, String soConsignLoc,
			String soIntransLoc, Boolean soAutoReplenish, String soRevenue,
			String soFsaccrAcct, String soFsaccrSub, String soFsaccrCc,
			String soFsdefAcct, String soFsdefSub, String soFsdefCc,
			Boolean soManualFrTerms, Double oidSoMstr) {
		this.id = id;
		this.soCust = soCust;
		this.soShip = soShip;
		this.soOrdDate = soOrdDate;
		this.soReqDate = soReqDate;
		this.soDueDate = soDueDate;
		this.soRmks = soRmks;
		this.soCrTerms = soCrTerms;
		this.soFob = soFob;
		this.soPo = soPo;
		this.soShipvia = soShipvia;
		this.soPartial = soPartial;
		this.soPrintSo = soPrintSo;
		this.soInvNbr = soInvNbr;
		this.soPrList = soPrList;
		this.soXslspsn = soXslspsn;
		this.soSource = soSource;
		this.soXcommPct = soXcommPct;
		this.soCrCard = soCrCard;
		this.soPrintPl = soPrintPl;
		this.soCrInit = soCrInit;
		this.soStat = soStat;
		this.soQad01 = soQad01;
		this.soQad02 = soQad02;
		this.soQad03 = soQad03;
		this.soDiscPct = soDiscPct;
		this.soTaxPct = soTaxPct;
		this.soPrepaid = soPrepaid;
		this.soToInv = soToInv;
		this.soInvoiced = soInvoiced;
		this.soArAcct = soArAcct;
		this.soArCc = soArCc;
		this.soInvDate = soInvDate;
		this.soShipDate = soShipDate;
		this.soTaxable = soTaxable;
		this.soCmtindx = soCmtindx;
		this.soQad04 = soQad04;
		this.soUser1 = soUser1;
		this.soUser2 = soUser2;
		this.soCurr = soCurr;
		this.soExRate = soExRate;
		this.soLang = soLang;
		this.soType = soType;
		this.soConfDate = soConfDate;
		this.soRev = soRev;
		this.soBol = soBol;
		this.soQad05 = soQad05;
		this.soPst = soPst;
		this.soFstId = soFstId;
		this.soTrl1Amt = soTrl1Amt;
		this.soTrl1Cd = soTrl1Cd;
		this.soTrl2Amt = soTrl2Amt;
		this.soTrl2Cd = soTrl2Cd;
		this.soTrl3Amt = soTrl3Amt;
		this.soTrl3Cd = soTrl3Cd;
		this.soWeight = soWeight;
		this.soWeightUm = soWeightUm;
		this.soSize = soSize;
		this.soSizeUm = soSizeUm;
		this.soCartons = soCartons;
		this.soSite = soSite;
		this.soPstId = soPstId;
		this.soCnclDate = soCnclDate;
		this.soQuote = soQuote;
		this.soTaxc = soTaxc;
		this.soChr01 = soChr01;
		this.soChr02 = soChr02;
		this.soChr03 = soChr03;
		this.soChr04 = soChr04;
		this.soChr05 = soChr05;
		this.soChr06 = soChr06;
		this.soChr07 = soChr07;
		this.soChr08 = soChr08;
		this.soChr09 = soChr09;
		this.soChr10 = soChr10;
		this.soDte01 = soDte01;
		this.soDte02 = soDte02;
		this.soDec01 = soDec01;
		this.soDec02 = soDec02;
		this.soLog01 = soLog01;
		this.soCredit = soCredit;
		this.soInvCr = soInvCr;
		this.soProject = soProject;
		this.soChannel = soChannel;
		this.soPstPct = soPstPct;
		this.soFrList = soFrList;
		this.soFrTerms = soFrTerms;
		this.soSlspsn = soSlspsn;
		this.soCommPct = soCommPct;
		this.soInvMthd = soInvMthd;
		this.soFixRate = soFixRate;
		this.soEntEx = soEntEx;
		this.soBill = soBill;
		this.soPrintBl = soPrintBl;
		this.soUserid = soUserid;
		this.soTaxDate = soTaxDate;
		this.soFsmType = soFsmType;
		this.soConrep = soConrep;
		this.soBank = soBank;
		this.soTaxEnv = soTaxEnv;
		this.soSched = soSched;
		this.soFrMinWt = soFrMinWt;
		this.soPrList2 = soPrList2;
		this.soTaxUsage = soTaxUsage;
		this.soSaNbr = soSaNbr;
		this.soFixPr = soFixPr;
		this.soSchMthd = soSchMthd;
		this.soPricingDt = soPricingDt;
		this.soPricedDt = soPricedDt;
		this.soCaNbr = soCaNbr;
		this.soEngCode = soEngCode;
		this.soFcgCode = soFcgCode;
		this.soShipEng = soShipEng;
		this.soCrprlist = soCrprlist;
		this.soQadc01 = soQadc01;
		this.soQadc02 = soQadc02;
		this.soQadc03 = soQadc03;
		this.soQadc04 = soQadc04;
		this.soQadc05 = soQadc05;
		this.soQadl01 = soQadl01;
		this.soQadl02 = soQadl02;
		this.soInclIss = soInclIss;
		this.soQadi01 = soQadi01;
		this.soQadi02 = soQadi02;
		this.soQadi03 = soQadi03;
		this.soQadd01 = soQadd01;
		this.soQadd02 = soQadd02;
		this.soQadd03 = soQadd03;
		this.soQadt01 = soQadt01;
		this.soQadt02 = soQadt02;
		this.soQadt03 = soQadt03;
		this.soAuthDays = soAuthDays;
		this.soCumAcct = soCumAcct;
		this.soMergeRss = soMergeRss;
		this.soShipCmplt = soShipCmplt;
		this.soBumpAll = soBumpAll;
		this.soPrimary = soPrimary;
		this.soCustPo = soCustPo;
		this.soSecondary = soSecondary;
		this.soShipPo = soShipPo;
		this.soExRate2 = soExRate2;
		this.soExRatetype = soExRatetype;
		this.soDiv = soDiv;
		this.soExruSeq = soExruSeq;
		this.soAppOwner = soAppOwner;
		this.soArSub = soArSub;
		this.soSeqOrder = soSeqOrder;
		this.soIncInRss = soIncInRss;
		this.soFirmSeqDays = soFirmSeqDays;
		this.soPrepTax = soPrepTax;
		this.soQadl04 = soQadl04;
		this.soCustrefVal = soCustrefVal;
		this.soConsignment = soConsignment;
		this.soMaxAgingDays = soMaxAgingDays;
		this.soConsignLoc = soConsignLoc;
		this.soIntransLoc = soIntransLoc;
		this.soAutoReplenish = soAutoReplenish;
		this.soRevenue = soRevenue;
		this.soFsaccrAcct = soFsaccrAcct;
		this.soFsaccrSub = soFsaccrSub;
		this.soFsaccrCc = soFsaccrCc;
		this.soFsdefAcct = soFsdefAcct;
		this.soFsdefSub = soFsdefSub;
		this.soFsdefCc = soFsdefCc;
		this.soManualFrTerms = soManualFrTerms;
		this.oidSoMstr = oidSoMstr;
	}

	// Property accessors

	public SoMstrId getId() {
		return this.id;
	}

	public void setId(SoMstrId id) {
		this.id = id;
	}

	public String getSoCust() {
		return this.soCust;
	}

	public void setSoCust(String soCust) {
		this.soCust = soCust;
	}

	public String getSoShip() {
		return this.soShip;
	}

	public void setSoShip(String soShip) {
		this.soShip = soShip;
	}

	public Date getSoOrdDate() {
		return this.soOrdDate;
	}

	public void setSoOrdDate(Date soOrdDate) {
		this.soOrdDate = soOrdDate;
	}

	public Date getSoReqDate() {
		return this.soReqDate;
	}

	public void setSoReqDate(Date soReqDate) {
		this.soReqDate = soReqDate;
	}

	public Date getSoDueDate() {
		return this.soDueDate;
	}

	public void setSoDueDate(Date soDueDate) {
		this.soDueDate = soDueDate;
	}

	public String getSoRmks() {
		return this.soRmks;
	}

	public void setSoRmks(String soRmks) {
		this.soRmks = soRmks;
	}

	public String getSoCrTerms() {
		return this.soCrTerms;
	}

	public void setSoCrTerms(String soCrTerms) {
		this.soCrTerms = soCrTerms;
	}

	public String getSoFob() {
		return this.soFob;
	}

	public void setSoFob(String soFob) {
		this.soFob = soFob;
	}

	public String getSoPo() {
		return this.soPo;
	}

	public void setSoPo(String soPo) {
		this.soPo = soPo;
	}

	public String getSoShipvia() {
		return this.soShipvia;
	}

	public void setSoShipvia(String soShipvia) {
		this.soShipvia = soShipvia;
	}

	public Boolean getSoPartial() {
		return this.soPartial;
	}

	public void setSoPartial(Boolean soPartial) {
		this.soPartial = soPartial;
	}

	public Boolean getSoPrintSo() {
		return this.soPrintSo;
	}

	public void setSoPrintSo(Boolean soPrintSo) {
		this.soPrintSo = soPrintSo;
	}

	public String getSoInvNbr() {
		return this.soInvNbr;
	}

	public void setSoInvNbr(String soInvNbr) {
		this.soInvNbr = soInvNbr;
	}

	public String getSoPrList() {
		return this.soPrList;
	}

	public void setSoPrList(String soPrList) {
		this.soPrList = soPrList;
	}

	public String getSoXslspsn() {
		return this.soXslspsn;
	}

	public void setSoXslspsn(String soXslspsn) {
		this.soXslspsn = soXslspsn;
	}

	public String getSoSource() {
		return this.soSource;
	}

	public void setSoSource(String soSource) {
		this.soSource = soSource;
	}

	public String getSoXcommPct() {
		return this.soXcommPct;
	}

	public void setSoXcommPct(String soXcommPct) {
		this.soXcommPct = soXcommPct;
	}

	public String getSoCrCard() {
		return this.soCrCard;
	}

	public void setSoCrCard(String soCrCard) {
		this.soCrCard = soCrCard;
	}

	public Boolean getSoPrintPl() {
		return this.soPrintPl;
	}

	public void setSoPrintPl(Boolean soPrintPl) {
		this.soPrintPl = soPrintPl;
	}

	public String getSoCrInit() {
		return this.soCrInit;
	}

	public void setSoCrInit(String soCrInit) {
		this.soCrInit = soCrInit;
	}

	public String getSoStat() {
		return this.soStat;
	}

	public void setSoStat(String soStat) {
		this.soStat = soStat;
	}

	public Double getSoQad01() {
		return this.soQad01;
	}

	public void setSoQad01(Double soQad01) {
		this.soQad01 = soQad01;
	}

	public Double getSoQad02() {
		return this.soQad02;
	}

	public void setSoQad02(Double soQad02) {
		this.soQad02 = soQad02;
	}

	public Double getSoQad03() {
		return this.soQad03;
	}

	public void setSoQad03(Double soQad03) {
		this.soQad03 = soQad03;
	}

	public Double getSoDiscPct() {
		return this.soDiscPct;
	}

	public void setSoDiscPct(Double soDiscPct) {
		this.soDiscPct = soDiscPct;
	}

	public String getSoTaxPct() {
		return this.soTaxPct;
	}

	public void setSoTaxPct(String soTaxPct) {
		this.soTaxPct = soTaxPct;
	}

	public Double getSoPrepaid() {
		return this.soPrepaid;
	}

	public void setSoPrepaid(Double soPrepaid) {
		this.soPrepaid = soPrepaid;
	}

	public Boolean getSoToInv() {
		return this.soToInv;
	}

	public void setSoToInv(Boolean soToInv) {
		this.soToInv = soToInv;
	}

	public Boolean getSoInvoiced() {
		return this.soInvoiced;
	}

	public void setSoInvoiced(Boolean soInvoiced) {
		this.soInvoiced = soInvoiced;
	}

	public String getSoArAcct() {
		return this.soArAcct;
	}

	public void setSoArAcct(String soArAcct) {
		this.soArAcct = soArAcct;
	}

	public String getSoArCc() {
		return this.soArCc;
	}

	public void setSoArCc(String soArCc) {
		this.soArCc = soArCc;
	}

	public Date getSoInvDate() {
		return this.soInvDate;
	}

	public void setSoInvDate(Date soInvDate) {
		this.soInvDate = soInvDate;
	}

	public Date getSoShipDate() {
		return this.soShipDate;
	}

	public void setSoShipDate(Date soShipDate) {
		this.soShipDate = soShipDate;
	}

	public Boolean getSoTaxable() {
		return this.soTaxable;
	}

	public void setSoTaxable(Boolean soTaxable) {
		this.soTaxable = soTaxable;
	}

	public Integer getSoCmtindx() {
		return this.soCmtindx;
	}

	public void setSoCmtindx(Integer soCmtindx) {
		this.soCmtindx = soCmtindx;
	}

	public Integer getSoQad04() {
		return this.soQad04;
	}

	public void setSoQad04(Integer soQad04) {
		this.soQad04 = soQad04;
	}

	public String getSoUser1() {
		return this.soUser1;
	}

	public void setSoUser1(String soUser1) {
		this.soUser1 = soUser1;
	}

	public String getSoUser2() {
		return this.soUser2;
	}

	public void setSoUser2(String soUser2) {
		this.soUser2 = soUser2;
	}

	public String getSoCurr() {
		return this.soCurr;
	}

	public void setSoCurr(String soCurr) {
		this.soCurr = soCurr;
	}

	public Double getSoExRate() {
		return this.soExRate;
	}

	public void setSoExRate(Double soExRate) {
		this.soExRate = soExRate;
	}

	public String getSoLang() {
		return this.soLang;
	}

	public void setSoLang(String soLang) {
		this.soLang = soLang;
	}

	public String getSoType() {
		return this.soType;
	}

	public void setSoType(String soType) {
		this.soType = soType;
	}

	public Date getSoConfDate() {
		return this.soConfDate;
	}

	public void setSoConfDate(Date soConfDate) {
		this.soConfDate = soConfDate;
	}

	public Integer getSoRev() {
		return this.soRev;
	}

	public void setSoRev(Integer soRev) {
		this.soRev = soRev;
	}

	public String getSoBol() {
		return this.soBol;
	}

	public void setSoBol(String soBol) {
		this.soBol = soBol;
	}

	public String getSoQad05() {
		return this.soQad05;
	}

	public void setSoQad05(String soQad05) {
		this.soQad05 = soQad05;
	}

	public Boolean getSoPst() {
		return this.soPst;
	}

	public void setSoPst(Boolean soPst) {
		this.soPst = soPst;
	}

	public String getSoFstId() {
		return this.soFstId;
	}

	public void setSoFstId(String soFstId) {
		this.soFstId = soFstId;
	}

	public Double getSoTrl1Amt() {
		return this.soTrl1Amt;
	}

	public void setSoTrl1Amt(Double soTrl1Amt) {
		this.soTrl1Amt = soTrl1Amt;
	}

	public String getSoTrl1Cd() {
		return this.soTrl1Cd;
	}

	public void setSoTrl1Cd(String soTrl1Cd) {
		this.soTrl1Cd = soTrl1Cd;
	}

	public Double getSoTrl2Amt() {
		return this.soTrl2Amt;
	}

	public void setSoTrl2Amt(Double soTrl2Amt) {
		this.soTrl2Amt = soTrl2Amt;
	}

	public String getSoTrl2Cd() {
		return this.soTrl2Cd;
	}

	public void setSoTrl2Cd(String soTrl2Cd) {
		this.soTrl2Cd = soTrl2Cd;
	}

	public Double getSoTrl3Amt() {
		return this.soTrl3Amt;
	}

	public void setSoTrl3Amt(Double soTrl3Amt) {
		this.soTrl3Amt = soTrl3Amt;
	}

	public String getSoTrl3Cd() {
		return this.soTrl3Cd;
	}

	public void setSoTrl3Cd(String soTrl3Cd) {
		this.soTrl3Cd = soTrl3Cd;
	}

	public Double getSoWeight() {
		return this.soWeight;
	}

	public void setSoWeight(Double soWeight) {
		this.soWeight = soWeight;
	}

	public String getSoWeightUm() {
		return this.soWeightUm;
	}

	public void setSoWeightUm(String soWeightUm) {
		this.soWeightUm = soWeightUm;
	}

	public Double getSoSize() {
		return this.soSize;
	}

	public void setSoSize(Double soSize) {
		this.soSize = soSize;
	}

	public String getSoSizeUm() {
		return this.soSizeUm;
	}

	public void setSoSizeUm(String soSizeUm) {
		this.soSizeUm = soSizeUm;
	}

	public Integer getSoCartons() {
		return this.soCartons;
	}

	public void setSoCartons(Integer soCartons) {
		this.soCartons = soCartons;
	}

	public String getSoSite() {
		return this.soSite;
	}

	public void setSoSite(String soSite) {
		this.soSite = soSite;
	}

	public String getSoPstId() {
		return this.soPstId;
	}

	public void setSoPstId(String soPstId) {
		this.soPstId = soPstId;
	}

	public Date getSoCnclDate() {
		return this.soCnclDate;
	}

	public void setSoCnclDate(Date soCnclDate) {
		this.soCnclDate = soCnclDate;
	}

	public String getSoQuote() {
		return this.soQuote;
	}

	public void setSoQuote(String soQuote) {
		this.soQuote = soQuote;
	}

	public String getSoTaxc() {
		return this.soTaxc;
	}

	public void setSoTaxc(String soTaxc) {
		this.soTaxc = soTaxc;
	}

	public String getSoChr01() {
		return this.soChr01;
	}

	public void setSoChr01(String soChr01) {
		this.soChr01 = soChr01;
	}

	public String getSoChr02() {
		return this.soChr02;
	}

	public void setSoChr02(String soChr02) {
		this.soChr02 = soChr02;
	}

	public String getSoChr03() {
		return this.soChr03;
	}

	public void setSoChr03(String soChr03) {
		this.soChr03 = soChr03;
	}

	public String getSoChr04() {
		return this.soChr04;
	}

	public void setSoChr04(String soChr04) {
		this.soChr04 = soChr04;
	}

	public String getSoChr05() {
		return this.soChr05;
	}

	public void setSoChr05(String soChr05) {
		this.soChr05 = soChr05;
	}

	public String getSoChr06() {
		return this.soChr06;
	}

	public void setSoChr06(String soChr06) {
		this.soChr06 = soChr06;
	}

	public String getSoChr07() {
		return this.soChr07;
	}

	public void setSoChr07(String soChr07) {
		this.soChr07 = soChr07;
	}

	public String getSoChr08() {
		return this.soChr08;
	}

	public void setSoChr08(String soChr08) {
		this.soChr08 = soChr08;
	}

	public String getSoChr09() {
		return this.soChr09;
	}

	public void setSoChr09(String soChr09) {
		this.soChr09 = soChr09;
	}

	public String getSoChr10() {
		return this.soChr10;
	}

	public void setSoChr10(String soChr10) {
		this.soChr10 = soChr10;
	}

	public Date getSoDte01() {
		return this.soDte01;
	}

	public void setSoDte01(Date soDte01) {
		this.soDte01 = soDte01;
	}

	public Date getSoDte02() {
		return this.soDte02;
	}

	public void setSoDte02(Date soDte02) {
		this.soDte02 = soDte02;
	}

	public Double getSoDec01() {
		return this.soDec01;
	}

	public void setSoDec01(Double soDec01) {
		this.soDec01 = soDec01;
	}

	public Double getSoDec02() {
		return this.soDec02;
	}

	public void setSoDec02(Double soDec02) {
		this.soDec02 = soDec02;
	}

	public Boolean getSoLog01() {
		return this.soLog01;
	}

	public void setSoLog01(Boolean soLog01) {
		this.soLog01 = soLog01;
	}

	public Boolean getSoCredit() {
		return this.soCredit;
	}

	public void setSoCredit(Boolean soCredit) {
		this.soCredit = soCredit;
	}

	public String getSoInvCr() {
		return this.soInvCr;
	}

	public void setSoInvCr(String soInvCr) {
		this.soInvCr = soInvCr;
	}

	public String getSoProject() {
		return this.soProject;
	}

	public void setSoProject(String soProject) {
		this.soProject = soProject;
	}

	public String getSoChannel() {
		return this.soChannel;
	}

	public void setSoChannel(String soChannel) {
		this.soChannel = soChannel;
	}

	public Double getSoPstPct() {
		return this.soPstPct;
	}

	public void setSoPstPct(Double soPstPct) {
		this.soPstPct = soPstPct;
	}

	public String getSoFrList() {
		return this.soFrList;
	}

	public void setSoFrList(String soFrList) {
		this.soFrList = soFrList;
	}

	public String getSoFrTerms() {
		return this.soFrTerms;
	}

	public void setSoFrTerms(String soFrTerms) {
		this.soFrTerms = soFrTerms;
	}

	public String getSoSlspsn() {
		return this.soSlspsn;
	}

	public void setSoSlspsn(String soSlspsn) {
		this.soSlspsn = soSlspsn;
	}

	public String getSoCommPct() {
		return this.soCommPct;
	}

	public void setSoCommPct(String soCommPct) {
		this.soCommPct = soCommPct;
	}

	public String getSoInvMthd() {
		return this.soInvMthd;
	}

	public void setSoInvMthd(String soInvMthd) {
		this.soInvMthd = soInvMthd;
	}

	public Boolean getSoFixRate() {
		return this.soFixRate;
	}

	public void setSoFixRate(Boolean soFixRate) {
		this.soFixRate = soFixRate;
	}

	public Double getSoEntEx() {
		return this.soEntEx;
	}

	public void setSoEntEx(Double soEntEx) {
		this.soEntEx = soEntEx;
	}

	public String getSoBill() {
		return this.soBill;
	}

	public void setSoBill(String soBill) {
		this.soBill = soBill;
	}

	public Boolean getSoPrintBl() {
		return this.soPrintBl;
	}

	public void setSoPrintBl(Boolean soPrintBl) {
		this.soPrintBl = soPrintBl;
	}

	public String getSoUserid() {
		return this.soUserid;
	}

	public void setSoUserid(String soUserid) {
		this.soUserid = soUserid;
	}

	public Date getSoTaxDate() {
		return this.soTaxDate;
	}

	public void setSoTaxDate(Date soTaxDate) {
		this.soTaxDate = soTaxDate;
	}

	public String getSoFsmType() {
		return this.soFsmType;
	}

	public void setSoFsmType(String soFsmType) {
		this.soFsmType = soFsmType;
	}

	public String getSoConrep() {
		return this.soConrep;
	}

	public void setSoConrep(String soConrep) {
		this.soConrep = soConrep;
	}

	public String getSoBank() {
		return this.soBank;
	}

	public void setSoBank(String soBank) {
		this.soBank = soBank;
	}

	public String getSoTaxEnv() {
		return this.soTaxEnv;
	}

	public void setSoTaxEnv(String soTaxEnv) {
		this.soTaxEnv = soTaxEnv;
	}

	public Boolean getSoSched() {
		return this.soSched;
	}

	public void setSoSched(Boolean soSched) {
		this.soSched = soSched;
	}

	public Double getSoFrMinWt() {
		return this.soFrMinWt;
	}

	public void setSoFrMinWt(Double soFrMinWt) {
		this.soFrMinWt = soFrMinWt;
	}

	public String getSoPrList2() {
		return this.soPrList2;
	}

	public void setSoPrList2(String soPrList2) {
		this.soPrList2 = soPrList2;
	}

	public String getSoTaxUsage() {
		return this.soTaxUsage;
	}

	public void setSoTaxUsage(String soTaxUsage) {
		this.soTaxUsage = soTaxUsage;
	}

	public String getSoSaNbr() {
		return this.soSaNbr;
	}

	public void setSoSaNbr(String soSaNbr) {
		this.soSaNbr = soSaNbr;
	}

	public Boolean getSoFixPr() {
		return this.soFixPr;
	}

	public void setSoFixPr(Boolean soFixPr) {
		this.soFixPr = soFixPr;
	}

	public String getSoSchMthd() {
		return this.soSchMthd;
	}

	public void setSoSchMthd(String soSchMthd) {
		this.soSchMthd = soSchMthd;
	}

	public Date getSoPricingDt() {
		return this.soPricingDt;
	}

	public void setSoPricingDt(Date soPricingDt) {
		this.soPricingDt = soPricingDt;
	}

	public Date getSoPricedDt() {
		return this.soPricedDt;
	}

	public void setSoPricedDt(Date soPricedDt) {
		this.soPricedDt = soPricedDt;
	}

	public String getSoCaNbr() {
		return this.soCaNbr;
	}

	public void setSoCaNbr(String soCaNbr) {
		this.soCaNbr = soCaNbr;
	}

	public String getSoEngCode() {
		return this.soEngCode;
	}

	public void setSoEngCode(String soEngCode) {
		this.soEngCode = soEngCode;
	}

	public String getSoFcgCode() {
		return this.soFcgCode;
	}

	public void setSoFcgCode(String soFcgCode) {
		this.soFcgCode = soFcgCode;
	}

	public Boolean getSoShipEng() {
		return this.soShipEng;
	}

	public void setSoShipEng(Boolean soShipEng) {
		this.soShipEng = soShipEng;
	}

	public String getSoCrprlist() {
		return this.soCrprlist;
	}

	public void setSoCrprlist(String soCrprlist) {
		this.soCrprlist = soCrprlist;
	}

	public String getSoQadc01() {
		return this.soQadc01;
	}

	public void setSoQadc01(String soQadc01) {
		this.soQadc01 = soQadc01;
	}

	public String getSoQadc02() {
		return this.soQadc02;
	}

	public void setSoQadc02(String soQadc02) {
		this.soQadc02 = soQadc02;
	}

	public String getSoQadc03() {
		return this.soQadc03;
	}

	public void setSoQadc03(String soQadc03) {
		this.soQadc03 = soQadc03;
	}

	public String getSoQadc04() {
		return this.soQadc04;
	}

	public void setSoQadc04(String soQadc04) {
		this.soQadc04 = soQadc04;
	}

	public String getSoQadc05() {
		return this.soQadc05;
	}

	public void setSoQadc05(String soQadc05) {
		this.soQadc05 = soQadc05;
	}

	public Boolean getSoQadl01() {
		return this.soQadl01;
	}

	public void setSoQadl01(Boolean soQadl01) {
		this.soQadl01 = soQadl01;
	}

	public Boolean getSoQadl02() {
		return this.soQadl02;
	}

	public void setSoQadl02(Boolean soQadl02) {
		this.soQadl02 = soQadl02;
	}

	public Boolean getSoInclIss() {
		return this.soInclIss;
	}

	public void setSoInclIss(Boolean soInclIss) {
		this.soInclIss = soInclIss;
	}

	public Integer getSoQadi01() {
		return this.soQadi01;
	}

	public void setSoQadi01(Integer soQadi01) {
		this.soQadi01 = soQadi01;
	}

	public Integer getSoQadi02() {
		return this.soQadi02;
	}

	public void setSoQadi02(Integer soQadi02) {
		this.soQadi02 = soQadi02;
	}

	public Integer getSoQadi03() {
		return this.soQadi03;
	}

	public void setSoQadi03(Integer soQadi03) {
		this.soQadi03 = soQadi03;
	}

	public Double getSoQadd01() {
		return this.soQadd01;
	}

	public void setSoQadd01(Double soQadd01) {
		this.soQadd01 = soQadd01;
	}

	public Double getSoQadd02() {
		return this.soQadd02;
	}

	public void setSoQadd02(Double soQadd02) {
		this.soQadd02 = soQadd02;
	}

	public Double getSoQadd03() {
		return this.soQadd03;
	}

	public void setSoQadd03(Double soQadd03) {
		this.soQadd03 = soQadd03;
	}

	public Date getSoQadt01() {
		return this.soQadt01;
	}

	public void setSoQadt01(Date soQadt01) {
		this.soQadt01 = soQadt01;
	}

	public Date getSoQadt02() {
		return this.soQadt02;
	}

	public void setSoQadt02(Date soQadt02) {
		this.soQadt02 = soQadt02;
	}

	public Date getSoQadt03() {
		return this.soQadt03;
	}

	public void setSoQadt03(Date soQadt03) {
		this.soQadt03 = soQadt03;
	}

	public Integer getSoAuthDays() {
		return this.soAuthDays;
	}

	public void setSoAuthDays(Integer soAuthDays) {
		this.soAuthDays = soAuthDays;
	}

	public Boolean getSoCumAcct() {
		return this.soCumAcct;
	}

	public void setSoCumAcct(Boolean soCumAcct) {
		this.soCumAcct = soCumAcct;
	}

	public Boolean getSoMergeRss() {
		return this.soMergeRss;
	}

	public void setSoMergeRss(Boolean soMergeRss) {
		this.soMergeRss = soMergeRss;
	}

	public Integer getSoShipCmplt() {
		return this.soShipCmplt;
	}

	public void setSoShipCmplt(Integer soShipCmplt) {
		this.soShipCmplt = soShipCmplt;
	}

	public Boolean getSoBumpAll() {
		return this.soBumpAll;
	}

	public void setSoBumpAll(Boolean soBumpAll) {
		this.soBumpAll = soBumpAll;
	}

	public Boolean getSoPrimary() {
		return this.soPrimary;
	}

	public void setSoPrimary(Boolean soPrimary) {
		this.soPrimary = soPrimary;
	}

	public String getSoCustPo() {
		return this.soCustPo;
	}

	public void setSoCustPo(String soCustPo) {
		this.soCustPo = soCustPo;
	}

	public Boolean getSoSecondary() {
		return this.soSecondary;
	}

	public void setSoSecondary(Boolean soSecondary) {
		this.soSecondary = soSecondary;
	}

	public String getSoShipPo() {
		return this.soShipPo;
	}

	public void setSoShipPo(String soShipPo) {
		this.soShipPo = soShipPo;
	}

	public Double getSoExRate2() {
		return this.soExRate2;
	}

	public void setSoExRate2(Double soExRate2) {
		this.soExRate2 = soExRate2;
	}

	public String getSoExRatetype() {
		return this.soExRatetype;
	}

	public void setSoExRatetype(String soExRatetype) {
		this.soExRatetype = soExRatetype;
	}

	public String getSoDiv() {
		return this.soDiv;
	}

	public void setSoDiv(String soDiv) {
		this.soDiv = soDiv;
	}

	public Integer getSoExruSeq() {
		return this.soExruSeq;
	}

	public void setSoExruSeq(Integer soExruSeq) {
		this.soExruSeq = soExruSeq;
	}

	public String getSoAppOwner() {
		return this.soAppOwner;
	}

	public void setSoAppOwner(String soAppOwner) {
		this.soAppOwner = soAppOwner;
	}

	public String getSoArSub() {
		return this.soArSub;
	}

	public void setSoArSub(String soArSub) {
		this.soArSub = soArSub;
	}

	public Boolean getSoSeqOrder() {
		return this.soSeqOrder;
	}

	public void setSoSeqOrder(Boolean soSeqOrder) {
		this.soSeqOrder = soSeqOrder;
	}

	public Boolean getSoIncInRss() {
		return this.soIncInRss;
	}

	public void setSoIncInRss(Boolean soIncInRss) {
		this.soIncInRss = soIncInRss;
	}

	public Integer getSoFirmSeqDays() {
		return this.soFirmSeqDays;
	}

	public void setSoFirmSeqDays(Integer soFirmSeqDays) {
		this.soFirmSeqDays = soFirmSeqDays;
	}

	public Double getSoPrepTax() {
		return this.soPrepTax;
	}

	public void setSoPrepTax(Double soPrepTax) {
		this.soPrepTax = soPrepTax;
	}

	public Boolean getSoQadl04() {
		return this.soQadl04;
	}

	public void setSoQadl04(Boolean soQadl04) {
		this.soQadl04 = soQadl04;
	}

	public Boolean getSoCustrefVal() {
		return this.soCustrefVal;
	}

	public void setSoCustrefVal(Boolean soCustrefVal) {
		this.soCustrefVal = soCustrefVal;
	}

	public Boolean getSoConsignment() {
		return this.soConsignment;
	}

	public void setSoConsignment(Boolean soConsignment) {
		this.soConsignment = soConsignment;
	}

	public Integer getSoMaxAgingDays() {
		return this.soMaxAgingDays;
	}

	public void setSoMaxAgingDays(Integer soMaxAgingDays) {
		this.soMaxAgingDays = soMaxAgingDays;
	}

	public String getSoConsignLoc() {
		return this.soConsignLoc;
	}

	public void setSoConsignLoc(String soConsignLoc) {
		this.soConsignLoc = soConsignLoc;
	}

	public String getSoIntransLoc() {
		return this.soIntransLoc;
	}

	public void setSoIntransLoc(String soIntransLoc) {
		this.soIntransLoc = soIntransLoc;
	}

	public Boolean getSoAutoReplenish() {
		return this.soAutoReplenish;
	}

	public void setSoAutoReplenish(Boolean soAutoReplenish) {
		this.soAutoReplenish = soAutoReplenish;
	}

	public String getSoRevenue() {
		return this.soRevenue;
	}

	public void setSoRevenue(String soRevenue) {
		this.soRevenue = soRevenue;
	}

	public String getSoFsaccrAcct() {
		return this.soFsaccrAcct;
	}

	public void setSoFsaccrAcct(String soFsaccrAcct) {
		this.soFsaccrAcct = soFsaccrAcct;
	}

	public String getSoFsaccrSub() {
		return this.soFsaccrSub;
	}

	public void setSoFsaccrSub(String soFsaccrSub) {
		this.soFsaccrSub = soFsaccrSub;
	}

	public String getSoFsaccrCc() {
		return this.soFsaccrCc;
	}

	public void setSoFsaccrCc(String soFsaccrCc) {
		this.soFsaccrCc = soFsaccrCc;
	}

	public String getSoFsdefAcct() {
		return this.soFsdefAcct;
	}

	public void setSoFsdefAcct(String soFsdefAcct) {
		this.soFsdefAcct = soFsdefAcct;
	}

	public String getSoFsdefSub() {
		return this.soFsdefSub;
	}

	public void setSoFsdefSub(String soFsdefSub) {
		this.soFsdefSub = soFsdefSub;
	}

	public String getSoFsdefCc() {
		return this.soFsdefCc;
	}

	public void setSoFsdefCc(String soFsdefCc) {
		this.soFsdefCc = soFsdefCc;
	}

	public Boolean getSoManualFrTerms() {
		return this.soManualFrTerms;
	}

	public void setSoManualFrTerms(Boolean soManualFrTerms) {
		this.soManualFrTerms = soManualFrTerms;
	}

	public Double getOidSoMstr() {
		return this.oidSoMstr;
	}

	public void setOidSoMstr(Double oidSoMstr) {
		this.oidSoMstr = oidSoMstr;
	}

}