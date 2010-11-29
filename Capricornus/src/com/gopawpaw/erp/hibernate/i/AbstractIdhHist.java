package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractIdhHist entity provides the base persistence definition of the
 * IdhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhHist implements java.io.Serializable {

	// Fields

	private IdhHistId id;
	private Date idhDueDate;
	private Date idhPerDate;
	private Date idhReqDate;
	private String idhPart;
	private Double idhQtyOrd;
	private Double idhQtyAll;
	private Double idhQtyPick;
	private Double idhQtyShip;
	private Double idhQtyInv;
	private String idhLoc;
	private String idhType;
	private Double idhPrice;
	private Double idhStdCost;
	private Double idhQtyChg;
	private Double idhBoChg;
	private String idhAcct;
	private Boolean idhAbnormal;
	private Boolean idhTaxable;
	private String idhSerial;
	private String idhDesc;
	private String idhUm;
	private String idhCc;
	private String idhComment;
	private String idhLot;
	private Double idhUmConv;
	private String idhFaNbr;
	private Double idhDiscPct;
	private String idhProject;
	private Integer idhCmtindx;
	private String idhCustpart;
	private Integer idhQad01;
	private String idhStatus;
	private String idhXslspsn;
	private String idhXcommPct;
	private String idhDscAcct;
	private String idhDscCc;
	private Double idhListPr;
	private String idhUser1;
	private String idhUser2;
	private Date idhSobRev;
	private Boolean idhSobStd;
	private Double idhQtyQote;
	private Boolean idhConsume;
	private Date idhExpire;
	private Boolean idhQad02;
	private String idhTaxc;
	private String idhSite;
	private String idhProdline;
	private String idhChr01;
	private String idhChr02;
	private String idhChr03;
	private String idhChr04;
	private String idhChr05;
	private String idhChr06;
	private String idhChr07;
	private String idhChr08;
	private String idhChr09;
	private String idhChr10;
	private Date idhDte01;
	private Date idhDte02;
	private Double idhDec01;
	private Double idhDec02;
	private Boolean idhLog01;
	private Date idhDte03;
	private Double idhDec03;
	private Double idhDec04;
	private Double idhDec05;
	private Double idhTaxMax;
	private Boolean idhTaxIn;
	private Boolean idhPst;
	private String idhFor;
	private Integer idhRef;
	private Double idhQtyPer;
	private Double idhQtyItem;
	private String idhRmaType;
	private String idhOwner;
	private Boolean idhCalcIsb;
	private Double idhFrRate;
	private String idhSlspsn;
	private String idhCommPct;
	private Double idhRetroPrice;
	private Boolean idhFstList;
	private String idhCumDate;
	private String idhContrId;
	private String idhCumQty;
	private String idhCurrRlseId;
	private BigDecimal idhOrdMult;
	private String idhPkgCode;
	private Integer idhRlseNbr;
	private String idhSchData;
	private Boolean idhSchMrp;
	private Boolean idhSched;
	private Double idhTransLt;
	private String idhFsmType;
	private String idhSaNbr;
	private Double idhFrChg;
	private String idhFrClass;
	private Double idhFrWt;
	private String idhFrWtUm;
	private Boolean idhFixPr;
	private String idhTaxUsage;
	private String idhTaxEnv;
	private String idhFrList;
	private Double idhCrtInt;
	private Double idhActPrice;
	private Boolean idhAutoIns;
	private Double idhCoveredAmt;
	private Boolean idhOverrideLmt;
	private String idhEnduser;
	private String idhIsbLoc;
	private Integer idhIsbRef;
	private String idhShip;
	private Double idhFixedPrice;
	private Double idhInvCost;
	private Boolean idhPartial;
	private Date idhPickdate;
	private String idhConrep;
	private String idhStartEff;
	private String idhEndEff;
	private String idhOutPo;
	private Double idhTransltHrs;
	private String idhPrList;
	private String idhDock;
	private Integer idhRawDays;
	private Integer idhFabDays;
	private Integer idhRbktDays;
	private Integer idhRbktWeeks;
	private Integer idhRbktMths;
	private Boolean idhSchedChgd;
	private String idhPastdue;
	private String idhDrpRef;
	private Boolean idhUpdIsb;
	private String idhCaNbr;
	private Boolean idhCarLoad;
	private Integer idhCaLine;
	private Double idhQtyCons;
	private Double idhQtyRet;
	private Double idhQtyPend;
	private String idhToLoc;
	private String idhToSite;
	private String idhLnRef;
	private String idhToRef;
	private Double idhQtyExch;
	private Date idhWarrStart;
	private Integer idhSadLine;
	private String idhModUserid;
	private Date idhModDate;
	private Date idhPricingDt;
	private String idhSvCode;
	private String idhForSerial;
	private String idhQadc01;
	private String idhQadc02;
	private String idhQadc03;
	private String idhQadc04;
	private String idhQadc05;
	private String idhQadc06;
	private Integer idhQadi01;
	private Integer idhQadi02;
	private Integer idhQadi03;
	private Integer idhQadi04;
	private Double idhQadd01;
	private Double idhQadd02;
	private Double idhQadd03;
	private Double idhQadd04;
	private Double idhQadd05;
	private Boolean idhQadl01;
	private Boolean idhQadl02;
	private Boolean idhQadl03;
	private Boolean idhQadl04;
	private Boolean idhQadl05;
	private Date idhQadt01;
	private Date idhQadt02;
	private Date idhQadt03;
	private Date idhQadt04;
	private Date idhQadt05;
	private Boolean idhBonus;
	private String idhBtbType;
	private String idhBtbPo;
	private Integer idhBtbPodLine;
	private String idhBtbVend;
	private Date idhExpDel;
	private String idhCfgType;
	private String idhDiv;
	private Integer idhPlPriority;
	private String idhPrig1;
	private String idhPrig2;
	private String idhSub;
	private String idhDscProject;
	private String idhDscSub;
	private Date idhPromiseDate;
	private String idhModelyr;
	private String idhCustref;
	private Double oidIdhHist;

	// Constructors

	/** default constructor */
	public AbstractIdhHist() {
	}

	/** minimal constructor */
	public AbstractIdhHist(IdhHistId id, Boolean idhBonus, String idhBtbType,
			String idhBtbPo, Integer idhBtbPodLine, String idhBtbVend,
			String idhModelyr, String idhCustref, Double oidIdhHist) {
		this.id = id;
		this.idhBonus = idhBonus;
		this.idhBtbType = idhBtbType;
		this.idhBtbPo = idhBtbPo;
		this.idhBtbPodLine = idhBtbPodLine;
		this.idhBtbVend = idhBtbVend;
		this.idhModelyr = idhModelyr;
		this.idhCustref = idhCustref;
		this.oidIdhHist = oidIdhHist;
	}

	/** full constructor */
	public AbstractIdhHist(IdhHistId id, Date idhDueDate, Date idhPerDate,
			Date idhReqDate, String idhPart, Double idhQtyOrd,
			Double idhQtyAll, Double idhQtyPick, Double idhQtyShip,
			Double idhQtyInv, String idhLoc, String idhType, Double idhPrice,
			Double idhStdCost, Double idhQtyChg, Double idhBoChg,
			String idhAcct, Boolean idhAbnormal, Boolean idhTaxable,
			String idhSerial, String idhDesc, String idhUm, String idhCc,
			String idhComment, String idhLot, Double idhUmConv,
			String idhFaNbr, Double idhDiscPct, String idhProject,
			Integer idhCmtindx, String idhCustpart, Integer idhQad01,
			String idhStatus, String idhXslspsn, String idhXcommPct,
			String idhDscAcct, String idhDscCc, Double idhListPr,
			String idhUser1, String idhUser2, Date idhSobRev,
			Boolean idhSobStd, Double idhQtyQote, Boolean idhConsume,
			Date idhExpire, Boolean idhQad02, String idhTaxc, String idhSite,
			String idhProdline, String idhChr01, String idhChr02,
			String idhChr03, String idhChr04, String idhChr05, String idhChr06,
			String idhChr07, String idhChr08, String idhChr09, String idhChr10,
			Date idhDte01, Date idhDte02, Double idhDec01, Double idhDec02,
			Boolean idhLog01, Date idhDte03, Double idhDec03, Double idhDec04,
			Double idhDec05, Double idhTaxMax, Boolean idhTaxIn,
			Boolean idhPst, String idhFor, Integer idhRef, Double idhQtyPer,
			Double idhQtyItem, String idhRmaType, String idhOwner,
			Boolean idhCalcIsb, Double idhFrRate, String idhSlspsn,
			String idhCommPct, Double idhRetroPrice, Boolean idhFstList,
			String idhCumDate, String idhContrId, String idhCumQty,
			String idhCurrRlseId, BigDecimal idhOrdMult, String idhPkgCode,
			Integer idhRlseNbr, String idhSchData, Boolean idhSchMrp,
			Boolean idhSched, Double idhTransLt, String idhFsmType,
			String idhSaNbr, Double idhFrChg, String idhFrClass,
			Double idhFrWt, String idhFrWtUm, Boolean idhFixPr,
			String idhTaxUsage, String idhTaxEnv, String idhFrList,
			Double idhCrtInt, Double idhActPrice, Boolean idhAutoIns,
			Double idhCoveredAmt, Boolean idhOverrideLmt, String idhEnduser,
			String idhIsbLoc, Integer idhIsbRef, String idhShip,
			Double idhFixedPrice, Double idhInvCost, Boolean idhPartial,
			Date idhPickdate, String idhConrep, String idhStartEff,
			String idhEndEff, String idhOutPo, Double idhTransltHrs,
			String idhPrList, String idhDock, Integer idhRawDays,
			Integer idhFabDays, Integer idhRbktDays, Integer idhRbktWeeks,
			Integer idhRbktMths, Boolean idhSchedChgd, String idhPastdue,
			String idhDrpRef, Boolean idhUpdIsb, String idhCaNbr,
			Boolean idhCarLoad, Integer idhCaLine, Double idhQtyCons,
			Double idhQtyRet, Double idhQtyPend, String idhToLoc,
			String idhToSite, String idhLnRef, String idhToRef,
			Double idhQtyExch, Date idhWarrStart, Integer idhSadLine,
			String idhModUserid, Date idhModDate, Date idhPricingDt,
			String idhSvCode, String idhForSerial, String idhQadc01,
			String idhQadc02, String idhQadc03, String idhQadc04,
			String idhQadc05, String idhQadc06, Integer idhQadi01,
			Integer idhQadi02, Integer idhQadi03, Integer idhQadi04,
			Double idhQadd01, Double idhQadd02, Double idhQadd03,
			Double idhQadd04, Double idhQadd05, Boolean idhQadl01,
			Boolean idhQadl02, Boolean idhQadl03, Boolean idhQadl04,
			Boolean idhQadl05, Date idhQadt01, Date idhQadt02, Date idhQadt03,
			Date idhQadt04, Date idhQadt05, Boolean idhBonus,
			String idhBtbType, String idhBtbPo, Integer idhBtbPodLine,
			String idhBtbVend, Date idhExpDel, String idhCfgType,
			String idhDiv, Integer idhPlPriority, String idhPrig1,
			String idhPrig2, String idhSub, String idhDscProject,
			String idhDscSub, Date idhPromiseDate, String idhModelyr,
			String idhCustref, Double oidIdhHist) {
		this.id = id;
		this.idhDueDate = idhDueDate;
		this.idhPerDate = idhPerDate;
		this.idhReqDate = idhReqDate;
		this.idhPart = idhPart;
		this.idhQtyOrd = idhQtyOrd;
		this.idhQtyAll = idhQtyAll;
		this.idhQtyPick = idhQtyPick;
		this.idhQtyShip = idhQtyShip;
		this.idhQtyInv = idhQtyInv;
		this.idhLoc = idhLoc;
		this.idhType = idhType;
		this.idhPrice = idhPrice;
		this.idhStdCost = idhStdCost;
		this.idhQtyChg = idhQtyChg;
		this.idhBoChg = idhBoChg;
		this.idhAcct = idhAcct;
		this.idhAbnormal = idhAbnormal;
		this.idhTaxable = idhTaxable;
		this.idhSerial = idhSerial;
		this.idhDesc = idhDesc;
		this.idhUm = idhUm;
		this.idhCc = idhCc;
		this.idhComment = idhComment;
		this.idhLot = idhLot;
		this.idhUmConv = idhUmConv;
		this.idhFaNbr = idhFaNbr;
		this.idhDiscPct = idhDiscPct;
		this.idhProject = idhProject;
		this.idhCmtindx = idhCmtindx;
		this.idhCustpart = idhCustpart;
		this.idhQad01 = idhQad01;
		this.idhStatus = idhStatus;
		this.idhXslspsn = idhXslspsn;
		this.idhXcommPct = idhXcommPct;
		this.idhDscAcct = idhDscAcct;
		this.idhDscCc = idhDscCc;
		this.idhListPr = idhListPr;
		this.idhUser1 = idhUser1;
		this.idhUser2 = idhUser2;
		this.idhSobRev = idhSobRev;
		this.idhSobStd = idhSobStd;
		this.idhQtyQote = idhQtyQote;
		this.idhConsume = idhConsume;
		this.idhExpire = idhExpire;
		this.idhQad02 = idhQad02;
		this.idhTaxc = idhTaxc;
		this.idhSite = idhSite;
		this.idhProdline = idhProdline;
		this.idhChr01 = idhChr01;
		this.idhChr02 = idhChr02;
		this.idhChr03 = idhChr03;
		this.idhChr04 = idhChr04;
		this.idhChr05 = idhChr05;
		this.idhChr06 = idhChr06;
		this.idhChr07 = idhChr07;
		this.idhChr08 = idhChr08;
		this.idhChr09 = idhChr09;
		this.idhChr10 = idhChr10;
		this.idhDte01 = idhDte01;
		this.idhDte02 = idhDte02;
		this.idhDec01 = idhDec01;
		this.idhDec02 = idhDec02;
		this.idhLog01 = idhLog01;
		this.idhDte03 = idhDte03;
		this.idhDec03 = idhDec03;
		this.idhDec04 = idhDec04;
		this.idhDec05 = idhDec05;
		this.idhTaxMax = idhTaxMax;
		this.idhTaxIn = idhTaxIn;
		this.idhPst = idhPst;
		this.idhFor = idhFor;
		this.idhRef = idhRef;
		this.idhQtyPer = idhQtyPer;
		this.idhQtyItem = idhQtyItem;
		this.idhRmaType = idhRmaType;
		this.idhOwner = idhOwner;
		this.idhCalcIsb = idhCalcIsb;
		this.idhFrRate = idhFrRate;
		this.idhSlspsn = idhSlspsn;
		this.idhCommPct = idhCommPct;
		this.idhRetroPrice = idhRetroPrice;
		this.idhFstList = idhFstList;
		this.idhCumDate = idhCumDate;
		this.idhContrId = idhContrId;
		this.idhCumQty = idhCumQty;
		this.idhCurrRlseId = idhCurrRlseId;
		this.idhOrdMult = idhOrdMult;
		this.idhPkgCode = idhPkgCode;
		this.idhRlseNbr = idhRlseNbr;
		this.idhSchData = idhSchData;
		this.idhSchMrp = idhSchMrp;
		this.idhSched = idhSched;
		this.idhTransLt = idhTransLt;
		this.idhFsmType = idhFsmType;
		this.idhSaNbr = idhSaNbr;
		this.idhFrChg = idhFrChg;
		this.idhFrClass = idhFrClass;
		this.idhFrWt = idhFrWt;
		this.idhFrWtUm = idhFrWtUm;
		this.idhFixPr = idhFixPr;
		this.idhTaxUsage = idhTaxUsage;
		this.idhTaxEnv = idhTaxEnv;
		this.idhFrList = idhFrList;
		this.idhCrtInt = idhCrtInt;
		this.idhActPrice = idhActPrice;
		this.idhAutoIns = idhAutoIns;
		this.idhCoveredAmt = idhCoveredAmt;
		this.idhOverrideLmt = idhOverrideLmt;
		this.idhEnduser = idhEnduser;
		this.idhIsbLoc = idhIsbLoc;
		this.idhIsbRef = idhIsbRef;
		this.idhShip = idhShip;
		this.idhFixedPrice = idhFixedPrice;
		this.idhInvCost = idhInvCost;
		this.idhPartial = idhPartial;
		this.idhPickdate = idhPickdate;
		this.idhConrep = idhConrep;
		this.idhStartEff = idhStartEff;
		this.idhEndEff = idhEndEff;
		this.idhOutPo = idhOutPo;
		this.idhTransltHrs = idhTransltHrs;
		this.idhPrList = idhPrList;
		this.idhDock = idhDock;
		this.idhRawDays = idhRawDays;
		this.idhFabDays = idhFabDays;
		this.idhRbktDays = idhRbktDays;
		this.idhRbktWeeks = idhRbktWeeks;
		this.idhRbktMths = idhRbktMths;
		this.idhSchedChgd = idhSchedChgd;
		this.idhPastdue = idhPastdue;
		this.idhDrpRef = idhDrpRef;
		this.idhUpdIsb = idhUpdIsb;
		this.idhCaNbr = idhCaNbr;
		this.idhCarLoad = idhCarLoad;
		this.idhCaLine = idhCaLine;
		this.idhQtyCons = idhQtyCons;
		this.idhQtyRet = idhQtyRet;
		this.idhQtyPend = idhQtyPend;
		this.idhToLoc = idhToLoc;
		this.idhToSite = idhToSite;
		this.idhLnRef = idhLnRef;
		this.idhToRef = idhToRef;
		this.idhQtyExch = idhQtyExch;
		this.idhWarrStart = idhWarrStart;
		this.idhSadLine = idhSadLine;
		this.idhModUserid = idhModUserid;
		this.idhModDate = idhModDate;
		this.idhPricingDt = idhPricingDt;
		this.idhSvCode = idhSvCode;
		this.idhForSerial = idhForSerial;
		this.idhQadc01 = idhQadc01;
		this.idhQadc02 = idhQadc02;
		this.idhQadc03 = idhQadc03;
		this.idhQadc04 = idhQadc04;
		this.idhQadc05 = idhQadc05;
		this.idhQadc06 = idhQadc06;
		this.idhQadi01 = idhQadi01;
		this.idhQadi02 = idhQadi02;
		this.idhQadi03 = idhQadi03;
		this.idhQadi04 = idhQadi04;
		this.idhQadd01 = idhQadd01;
		this.idhQadd02 = idhQadd02;
		this.idhQadd03 = idhQadd03;
		this.idhQadd04 = idhQadd04;
		this.idhQadd05 = idhQadd05;
		this.idhQadl01 = idhQadl01;
		this.idhQadl02 = idhQadl02;
		this.idhQadl03 = idhQadl03;
		this.idhQadl04 = idhQadl04;
		this.idhQadl05 = idhQadl05;
		this.idhQadt01 = idhQadt01;
		this.idhQadt02 = idhQadt02;
		this.idhQadt03 = idhQadt03;
		this.idhQadt04 = idhQadt04;
		this.idhQadt05 = idhQadt05;
		this.idhBonus = idhBonus;
		this.idhBtbType = idhBtbType;
		this.idhBtbPo = idhBtbPo;
		this.idhBtbPodLine = idhBtbPodLine;
		this.idhBtbVend = idhBtbVend;
		this.idhExpDel = idhExpDel;
		this.idhCfgType = idhCfgType;
		this.idhDiv = idhDiv;
		this.idhPlPriority = idhPlPriority;
		this.idhPrig1 = idhPrig1;
		this.idhPrig2 = idhPrig2;
		this.idhSub = idhSub;
		this.idhDscProject = idhDscProject;
		this.idhDscSub = idhDscSub;
		this.idhPromiseDate = idhPromiseDate;
		this.idhModelyr = idhModelyr;
		this.idhCustref = idhCustref;
		this.oidIdhHist = oidIdhHist;
	}

	// Property accessors

	public IdhHistId getId() {
		return this.id;
	}

	public void setId(IdhHistId id) {
		this.id = id;
	}

	public Date getIdhDueDate() {
		return this.idhDueDate;
	}

	public void setIdhDueDate(Date idhDueDate) {
		this.idhDueDate = idhDueDate;
	}

	public Date getIdhPerDate() {
		return this.idhPerDate;
	}

	public void setIdhPerDate(Date idhPerDate) {
		this.idhPerDate = idhPerDate;
	}

	public Date getIdhReqDate() {
		return this.idhReqDate;
	}

	public void setIdhReqDate(Date idhReqDate) {
		this.idhReqDate = idhReqDate;
	}

	public String getIdhPart() {
		return this.idhPart;
	}

	public void setIdhPart(String idhPart) {
		this.idhPart = idhPart;
	}

	public Double getIdhQtyOrd() {
		return this.idhQtyOrd;
	}

	public void setIdhQtyOrd(Double idhQtyOrd) {
		this.idhQtyOrd = idhQtyOrd;
	}

	public Double getIdhQtyAll() {
		return this.idhQtyAll;
	}

	public void setIdhQtyAll(Double idhQtyAll) {
		this.idhQtyAll = idhQtyAll;
	}

	public Double getIdhQtyPick() {
		return this.idhQtyPick;
	}

	public void setIdhQtyPick(Double idhQtyPick) {
		this.idhQtyPick = idhQtyPick;
	}

	public Double getIdhQtyShip() {
		return this.idhQtyShip;
	}

	public void setIdhQtyShip(Double idhQtyShip) {
		this.idhQtyShip = idhQtyShip;
	}

	public Double getIdhQtyInv() {
		return this.idhQtyInv;
	}

	public void setIdhQtyInv(Double idhQtyInv) {
		this.idhQtyInv = idhQtyInv;
	}

	public String getIdhLoc() {
		return this.idhLoc;
	}

	public void setIdhLoc(String idhLoc) {
		this.idhLoc = idhLoc;
	}

	public String getIdhType() {
		return this.idhType;
	}

	public void setIdhType(String idhType) {
		this.idhType = idhType;
	}

	public Double getIdhPrice() {
		return this.idhPrice;
	}

	public void setIdhPrice(Double idhPrice) {
		this.idhPrice = idhPrice;
	}

	public Double getIdhStdCost() {
		return this.idhStdCost;
	}

	public void setIdhStdCost(Double idhStdCost) {
		this.idhStdCost = idhStdCost;
	}

	public Double getIdhQtyChg() {
		return this.idhQtyChg;
	}

	public void setIdhQtyChg(Double idhQtyChg) {
		this.idhQtyChg = idhQtyChg;
	}

	public Double getIdhBoChg() {
		return this.idhBoChg;
	}

	public void setIdhBoChg(Double idhBoChg) {
		this.idhBoChg = idhBoChg;
	}

	public String getIdhAcct() {
		return this.idhAcct;
	}

	public void setIdhAcct(String idhAcct) {
		this.idhAcct = idhAcct;
	}

	public Boolean getIdhAbnormal() {
		return this.idhAbnormal;
	}

	public void setIdhAbnormal(Boolean idhAbnormal) {
		this.idhAbnormal = idhAbnormal;
	}

	public Boolean getIdhTaxable() {
		return this.idhTaxable;
	}

	public void setIdhTaxable(Boolean idhTaxable) {
		this.idhTaxable = idhTaxable;
	}

	public String getIdhSerial() {
		return this.idhSerial;
	}

	public void setIdhSerial(String idhSerial) {
		this.idhSerial = idhSerial;
	}

	public String getIdhDesc() {
		return this.idhDesc;
	}

	public void setIdhDesc(String idhDesc) {
		this.idhDesc = idhDesc;
	}

	public String getIdhUm() {
		return this.idhUm;
	}

	public void setIdhUm(String idhUm) {
		this.idhUm = idhUm;
	}

	public String getIdhCc() {
		return this.idhCc;
	}

	public void setIdhCc(String idhCc) {
		this.idhCc = idhCc;
	}

	public String getIdhComment() {
		return this.idhComment;
	}

	public void setIdhComment(String idhComment) {
		this.idhComment = idhComment;
	}

	public String getIdhLot() {
		return this.idhLot;
	}

	public void setIdhLot(String idhLot) {
		this.idhLot = idhLot;
	}

	public Double getIdhUmConv() {
		return this.idhUmConv;
	}

	public void setIdhUmConv(Double idhUmConv) {
		this.idhUmConv = idhUmConv;
	}

	public String getIdhFaNbr() {
		return this.idhFaNbr;
	}

	public void setIdhFaNbr(String idhFaNbr) {
		this.idhFaNbr = idhFaNbr;
	}

	public Double getIdhDiscPct() {
		return this.idhDiscPct;
	}

	public void setIdhDiscPct(Double idhDiscPct) {
		this.idhDiscPct = idhDiscPct;
	}

	public String getIdhProject() {
		return this.idhProject;
	}

	public void setIdhProject(String idhProject) {
		this.idhProject = idhProject;
	}

	public Integer getIdhCmtindx() {
		return this.idhCmtindx;
	}

	public void setIdhCmtindx(Integer idhCmtindx) {
		this.idhCmtindx = idhCmtindx;
	}

	public String getIdhCustpart() {
		return this.idhCustpart;
	}

	public void setIdhCustpart(String idhCustpart) {
		this.idhCustpart = idhCustpart;
	}

	public Integer getIdhQad01() {
		return this.idhQad01;
	}

	public void setIdhQad01(Integer idhQad01) {
		this.idhQad01 = idhQad01;
	}

	public String getIdhStatus() {
		return this.idhStatus;
	}

	public void setIdhStatus(String idhStatus) {
		this.idhStatus = idhStatus;
	}

	public String getIdhXslspsn() {
		return this.idhXslspsn;
	}

	public void setIdhXslspsn(String idhXslspsn) {
		this.idhXslspsn = idhXslspsn;
	}

	public String getIdhXcommPct() {
		return this.idhXcommPct;
	}

	public void setIdhXcommPct(String idhXcommPct) {
		this.idhXcommPct = idhXcommPct;
	}

	public String getIdhDscAcct() {
		return this.idhDscAcct;
	}

	public void setIdhDscAcct(String idhDscAcct) {
		this.idhDscAcct = idhDscAcct;
	}

	public String getIdhDscCc() {
		return this.idhDscCc;
	}

	public void setIdhDscCc(String idhDscCc) {
		this.idhDscCc = idhDscCc;
	}

	public Double getIdhListPr() {
		return this.idhListPr;
	}

	public void setIdhListPr(Double idhListPr) {
		this.idhListPr = idhListPr;
	}

	public String getIdhUser1() {
		return this.idhUser1;
	}

	public void setIdhUser1(String idhUser1) {
		this.idhUser1 = idhUser1;
	}

	public String getIdhUser2() {
		return this.idhUser2;
	}

	public void setIdhUser2(String idhUser2) {
		this.idhUser2 = idhUser2;
	}

	public Date getIdhSobRev() {
		return this.idhSobRev;
	}

	public void setIdhSobRev(Date idhSobRev) {
		this.idhSobRev = idhSobRev;
	}

	public Boolean getIdhSobStd() {
		return this.idhSobStd;
	}

	public void setIdhSobStd(Boolean idhSobStd) {
		this.idhSobStd = idhSobStd;
	}

	public Double getIdhQtyQote() {
		return this.idhQtyQote;
	}

	public void setIdhQtyQote(Double idhQtyQote) {
		this.idhQtyQote = idhQtyQote;
	}

	public Boolean getIdhConsume() {
		return this.idhConsume;
	}

	public void setIdhConsume(Boolean idhConsume) {
		this.idhConsume = idhConsume;
	}

	public Date getIdhExpire() {
		return this.idhExpire;
	}

	public void setIdhExpire(Date idhExpire) {
		this.idhExpire = idhExpire;
	}

	public Boolean getIdhQad02() {
		return this.idhQad02;
	}

	public void setIdhQad02(Boolean idhQad02) {
		this.idhQad02 = idhQad02;
	}

	public String getIdhTaxc() {
		return this.idhTaxc;
	}

	public void setIdhTaxc(String idhTaxc) {
		this.idhTaxc = idhTaxc;
	}

	public String getIdhSite() {
		return this.idhSite;
	}

	public void setIdhSite(String idhSite) {
		this.idhSite = idhSite;
	}

	public String getIdhProdline() {
		return this.idhProdline;
	}

	public void setIdhProdline(String idhProdline) {
		this.idhProdline = idhProdline;
	}

	public String getIdhChr01() {
		return this.idhChr01;
	}

	public void setIdhChr01(String idhChr01) {
		this.idhChr01 = idhChr01;
	}

	public String getIdhChr02() {
		return this.idhChr02;
	}

	public void setIdhChr02(String idhChr02) {
		this.idhChr02 = idhChr02;
	}

	public String getIdhChr03() {
		return this.idhChr03;
	}

	public void setIdhChr03(String idhChr03) {
		this.idhChr03 = idhChr03;
	}

	public String getIdhChr04() {
		return this.idhChr04;
	}

	public void setIdhChr04(String idhChr04) {
		this.idhChr04 = idhChr04;
	}

	public String getIdhChr05() {
		return this.idhChr05;
	}

	public void setIdhChr05(String idhChr05) {
		this.idhChr05 = idhChr05;
	}

	public String getIdhChr06() {
		return this.idhChr06;
	}

	public void setIdhChr06(String idhChr06) {
		this.idhChr06 = idhChr06;
	}

	public String getIdhChr07() {
		return this.idhChr07;
	}

	public void setIdhChr07(String idhChr07) {
		this.idhChr07 = idhChr07;
	}

	public String getIdhChr08() {
		return this.idhChr08;
	}

	public void setIdhChr08(String idhChr08) {
		this.idhChr08 = idhChr08;
	}

	public String getIdhChr09() {
		return this.idhChr09;
	}

	public void setIdhChr09(String idhChr09) {
		this.idhChr09 = idhChr09;
	}

	public String getIdhChr10() {
		return this.idhChr10;
	}

	public void setIdhChr10(String idhChr10) {
		this.idhChr10 = idhChr10;
	}

	public Date getIdhDte01() {
		return this.idhDte01;
	}

	public void setIdhDte01(Date idhDte01) {
		this.idhDte01 = idhDte01;
	}

	public Date getIdhDte02() {
		return this.idhDte02;
	}

	public void setIdhDte02(Date idhDte02) {
		this.idhDte02 = idhDte02;
	}

	public Double getIdhDec01() {
		return this.idhDec01;
	}

	public void setIdhDec01(Double idhDec01) {
		this.idhDec01 = idhDec01;
	}

	public Double getIdhDec02() {
		return this.idhDec02;
	}

	public void setIdhDec02(Double idhDec02) {
		this.idhDec02 = idhDec02;
	}

	public Boolean getIdhLog01() {
		return this.idhLog01;
	}

	public void setIdhLog01(Boolean idhLog01) {
		this.idhLog01 = idhLog01;
	}

	public Date getIdhDte03() {
		return this.idhDte03;
	}

	public void setIdhDte03(Date idhDte03) {
		this.idhDte03 = idhDte03;
	}

	public Double getIdhDec03() {
		return this.idhDec03;
	}

	public void setIdhDec03(Double idhDec03) {
		this.idhDec03 = idhDec03;
	}

	public Double getIdhDec04() {
		return this.idhDec04;
	}

	public void setIdhDec04(Double idhDec04) {
		this.idhDec04 = idhDec04;
	}

	public Double getIdhDec05() {
		return this.idhDec05;
	}

	public void setIdhDec05(Double idhDec05) {
		this.idhDec05 = idhDec05;
	}

	public Double getIdhTaxMax() {
		return this.idhTaxMax;
	}

	public void setIdhTaxMax(Double idhTaxMax) {
		this.idhTaxMax = idhTaxMax;
	}

	public Boolean getIdhTaxIn() {
		return this.idhTaxIn;
	}

	public void setIdhTaxIn(Boolean idhTaxIn) {
		this.idhTaxIn = idhTaxIn;
	}

	public Boolean getIdhPst() {
		return this.idhPst;
	}

	public void setIdhPst(Boolean idhPst) {
		this.idhPst = idhPst;
	}

	public String getIdhFor() {
		return this.idhFor;
	}

	public void setIdhFor(String idhFor) {
		this.idhFor = idhFor;
	}

	public Integer getIdhRef() {
		return this.idhRef;
	}

	public void setIdhRef(Integer idhRef) {
		this.idhRef = idhRef;
	}

	public Double getIdhQtyPer() {
		return this.idhQtyPer;
	}

	public void setIdhQtyPer(Double idhQtyPer) {
		this.idhQtyPer = idhQtyPer;
	}

	public Double getIdhQtyItem() {
		return this.idhQtyItem;
	}

	public void setIdhQtyItem(Double idhQtyItem) {
		this.idhQtyItem = idhQtyItem;
	}

	public String getIdhRmaType() {
		return this.idhRmaType;
	}

	public void setIdhRmaType(String idhRmaType) {
		this.idhRmaType = idhRmaType;
	}

	public String getIdhOwner() {
		return this.idhOwner;
	}

	public void setIdhOwner(String idhOwner) {
		this.idhOwner = idhOwner;
	}

	public Boolean getIdhCalcIsb() {
		return this.idhCalcIsb;
	}

	public void setIdhCalcIsb(Boolean idhCalcIsb) {
		this.idhCalcIsb = idhCalcIsb;
	}

	public Double getIdhFrRate() {
		return this.idhFrRate;
	}

	public void setIdhFrRate(Double idhFrRate) {
		this.idhFrRate = idhFrRate;
	}

	public String getIdhSlspsn() {
		return this.idhSlspsn;
	}

	public void setIdhSlspsn(String idhSlspsn) {
		this.idhSlspsn = idhSlspsn;
	}

	public String getIdhCommPct() {
		return this.idhCommPct;
	}

	public void setIdhCommPct(String idhCommPct) {
		this.idhCommPct = idhCommPct;
	}

	public Double getIdhRetroPrice() {
		return this.idhRetroPrice;
	}

	public void setIdhRetroPrice(Double idhRetroPrice) {
		this.idhRetroPrice = idhRetroPrice;
	}

	public Boolean getIdhFstList() {
		return this.idhFstList;
	}

	public void setIdhFstList(Boolean idhFstList) {
		this.idhFstList = idhFstList;
	}

	public String getIdhCumDate() {
		return this.idhCumDate;
	}

	public void setIdhCumDate(String idhCumDate) {
		this.idhCumDate = idhCumDate;
	}

	public String getIdhContrId() {
		return this.idhContrId;
	}

	public void setIdhContrId(String idhContrId) {
		this.idhContrId = idhContrId;
	}

	public String getIdhCumQty() {
		return this.idhCumQty;
	}

	public void setIdhCumQty(String idhCumQty) {
		this.idhCumQty = idhCumQty;
	}

	public String getIdhCurrRlseId() {
		return this.idhCurrRlseId;
	}

	public void setIdhCurrRlseId(String idhCurrRlseId) {
		this.idhCurrRlseId = idhCurrRlseId;
	}

	public BigDecimal getIdhOrdMult() {
		return this.idhOrdMult;
	}

	public void setIdhOrdMult(BigDecimal idhOrdMult) {
		this.idhOrdMult = idhOrdMult;
	}

	public String getIdhPkgCode() {
		return this.idhPkgCode;
	}

	public void setIdhPkgCode(String idhPkgCode) {
		this.idhPkgCode = idhPkgCode;
	}

	public Integer getIdhRlseNbr() {
		return this.idhRlseNbr;
	}

	public void setIdhRlseNbr(Integer idhRlseNbr) {
		this.idhRlseNbr = idhRlseNbr;
	}

	public String getIdhSchData() {
		return this.idhSchData;
	}

	public void setIdhSchData(String idhSchData) {
		this.idhSchData = idhSchData;
	}

	public Boolean getIdhSchMrp() {
		return this.idhSchMrp;
	}

	public void setIdhSchMrp(Boolean idhSchMrp) {
		this.idhSchMrp = idhSchMrp;
	}

	public Boolean getIdhSched() {
		return this.idhSched;
	}

	public void setIdhSched(Boolean idhSched) {
		this.idhSched = idhSched;
	}

	public Double getIdhTransLt() {
		return this.idhTransLt;
	}

	public void setIdhTransLt(Double idhTransLt) {
		this.idhTransLt = idhTransLt;
	}

	public String getIdhFsmType() {
		return this.idhFsmType;
	}

	public void setIdhFsmType(String idhFsmType) {
		this.idhFsmType = idhFsmType;
	}

	public String getIdhSaNbr() {
		return this.idhSaNbr;
	}

	public void setIdhSaNbr(String idhSaNbr) {
		this.idhSaNbr = idhSaNbr;
	}

	public Double getIdhFrChg() {
		return this.idhFrChg;
	}

	public void setIdhFrChg(Double idhFrChg) {
		this.idhFrChg = idhFrChg;
	}

	public String getIdhFrClass() {
		return this.idhFrClass;
	}

	public void setIdhFrClass(String idhFrClass) {
		this.idhFrClass = idhFrClass;
	}

	public Double getIdhFrWt() {
		return this.idhFrWt;
	}

	public void setIdhFrWt(Double idhFrWt) {
		this.idhFrWt = idhFrWt;
	}

	public String getIdhFrWtUm() {
		return this.idhFrWtUm;
	}

	public void setIdhFrWtUm(String idhFrWtUm) {
		this.idhFrWtUm = idhFrWtUm;
	}

	public Boolean getIdhFixPr() {
		return this.idhFixPr;
	}

	public void setIdhFixPr(Boolean idhFixPr) {
		this.idhFixPr = idhFixPr;
	}

	public String getIdhTaxUsage() {
		return this.idhTaxUsage;
	}

	public void setIdhTaxUsage(String idhTaxUsage) {
		this.idhTaxUsage = idhTaxUsage;
	}

	public String getIdhTaxEnv() {
		return this.idhTaxEnv;
	}

	public void setIdhTaxEnv(String idhTaxEnv) {
		this.idhTaxEnv = idhTaxEnv;
	}

	public String getIdhFrList() {
		return this.idhFrList;
	}

	public void setIdhFrList(String idhFrList) {
		this.idhFrList = idhFrList;
	}

	public Double getIdhCrtInt() {
		return this.idhCrtInt;
	}

	public void setIdhCrtInt(Double idhCrtInt) {
		this.idhCrtInt = idhCrtInt;
	}

	public Double getIdhActPrice() {
		return this.idhActPrice;
	}

	public void setIdhActPrice(Double idhActPrice) {
		this.idhActPrice = idhActPrice;
	}

	public Boolean getIdhAutoIns() {
		return this.idhAutoIns;
	}

	public void setIdhAutoIns(Boolean idhAutoIns) {
		this.idhAutoIns = idhAutoIns;
	}

	public Double getIdhCoveredAmt() {
		return this.idhCoveredAmt;
	}

	public void setIdhCoveredAmt(Double idhCoveredAmt) {
		this.idhCoveredAmt = idhCoveredAmt;
	}

	public Boolean getIdhOverrideLmt() {
		return this.idhOverrideLmt;
	}

	public void setIdhOverrideLmt(Boolean idhOverrideLmt) {
		this.idhOverrideLmt = idhOverrideLmt;
	}

	public String getIdhEnduser() {
		return this.idhEnduser;
	}

	public void setIdhEnduser(String idhEnduser) {
		this.idhEnduser = idhEnduser;
	}

	public String getIdhIsbLoc() {
		return this.idhIsbLoc;
	}

	public void setIdhIsbLoc(String idhIsbLoc) {
		this.idhIsbLoc = idhIsbLoc;
	}

	public Integer getIdhIsbRef() {
		return this.idhIsbRef;
	}

	public void setIdhIsbRef(Integer idhIsbRef) {
		this.idhIsbRef = idhIsbRef;
	}

	public String getIdhShip() {
		return this.idhShip;
	}

	public void setIdhShip(String idhShip) {
		this.idhShip = idhShip;
	}

	public Double getIdhFixedPrice() {
		return this.idhFixedPrice;
	}

	public void setIdhFixedPrice(Double idhFixedPrice) {
		this.idhFixedPrice = idhFixedPrice;
	}

	public Double getIdhInvCost() {
		return this.idhInvCost;
	}

	public void setIdhInvCost(Double idhInvCost) {
		this.idhInvCost = idhInvCost;
	}

	public Boolean getIdhPartial() {
		return this.idhPartial;
	}

	public void setIdhPartial(Boolean idhPartial) {
		this.idhPartial = idhPartial;
	}

	public Date getIdhPickdate() {
		return this.idhPickdate;
	}

	public void setIdhPickdate(Date idhPickdate) {
		this.idhPickdate = idhPickdate;
	}

	public String getIdhConrep() {
		return this.idhConrep;
	}

	public void setIdhConrep(String idhConrep) {
		this.idhConrep = idhConrep;
	}

	public String getIdhStartEff() {
		return this.idhStartEff;
	}

	public void setIdhStartEff(String idhStartEff) {
		this.idhStartEff = idhStartEff;
	}

	public String getIdhEndEff() {
		return this.idhEndEff;
	}

	public void setIdhEndEff(String idhEndEff) {
		this.idhEndEff = idhEndEff;
	}

	public String getIdhOutPo() {
		return this.idhOutPo;
	}

	public void setIdhOutPo(String idhOutPo) {
		this.idhOutPo = idhOutPo;
	}

	public Double getIdhTransltHrs() {
		return this.idhTransltHrs;
	}

	public void setIdhTransltHrs(Double idhTransltHrs) {
		this.idhTransltHrs = idhTransltHrs;
	}

	public String getIdhPrList() {
		return this.idhPrList;
	}

	public void setIdhPrList(String idhPrList) {
		this.idhPrList = idhPrList;
	}

	public String getIdhDock() {
		return this.idhDock;
	}

	public void setIdhDock(String idhDock) {
		this.idhDock = idhDock;
	}

	public Integer getIdhRawDays() {
		return this.idhRawDays;
	}

	public void setIdhRawDays(Integer idhRawDays) {
		this.idhRawDays = idhRawDays;
	}

	public Integer getIdhFabDays() {
		return this.idhFabDays;
	}

	public void setIdhFabDays(Integer idhFabDays) {
		this.idhFabDays = idhFabDays;
	}

	public Integer getIdhRbktDays() {
		return this.idhRbktDays;
	}

	public void setIdhRbktDays(Integer idhRbktDays) {
		this.idhRbktDays = idhRbktDays;
	}

	public Integer getIdhRbktWeeks() {
		return this.idhRbktWeeks;
	}

	public void setIdhRbktWeeks(Integer idhRbktWeeks) {
		this.idhRbktWeeks = idhRbktWeeks;
	}

	public Integer getIdhRbktMths() {
		return this.idhRbktMths;
	}

	public void setIdhRbktMths(Integer idhRbktMths) {
		this.idhRbktMths = idhRbktMths;
	}

	public Boolean getIdhSchedChgd() {
		return this.idhSchedChgd;
	}

	public void setIdhSchedChgd(Boolean idhSchedChgd) {
		this.idhSchedChgd = idhSchedChgd;
	}

	public String getIdhPastdue() {
		return this.idhPastdue;
	}

	public void setIdhPastdue(String idhPastdue) {
		this.idhPastdue = idhPastdue;
	}

	public String getIdhDrpRef() {
		return this.idhDrpRef;
	}

	public void setIdhDrpRef(String idhDrpRef) {
		this.idhDrpRef = idhDrpRef;
	}

	public Boolean getIdhUpdIsb() {
		return this.idhUpdIsb;
	}

	public void setIdhUpdIsb(Boolean idhUpdIsb) {
		this.idhUpdIsb = idhUpdIsb;
	}

	public String getIdhCaNbr() {
		return this.idhCaNbr;
	}

	public void setIdhCaNbr(String idhCaNbr) {
		this.idhCaNbr = idhCaNbr;
	}

	public Boolean getIdhCarLoad() {
		return this.idhCarLoad;
	}

	public void setIdhCarLoad(Boolean idhCarLoad) {
		this.idhCarLoad = idhCarLoad;
	}

	public Integer getIdhCaLine() {
		return this.idhCaLine;
	}

	public void setIdhCaLine(Integer idhCaLine) {
		this.idhCaLine = idhCaLine;
	}

	public Double getIdhQtyCons() {
		return this.idhQtyCons;
	}

	public void setIdhQtyCons(Double idhQtyCons) {
		this.idhQtyCons = idhQtyCons;
	}

	public Double getIdhQtyRet() {
		return this.idhQtyRet;
	}

	public void setIdhQtyRet(Double idhQtyRet) {
		this.idhQtyRet = idhQtyRet;
	}

	public Double getIdhQtyPend() {
		return this.idhQtyPend;
	}

	public void setIdhQtyPend(Double idhQtyPend) {
		this.idhQtyPend = idhQtyPend;
	}

	public String getIdhToLoc() {
		return this.idhToLoc;
	}

	public void setIdhToLoc(String idhToLoc) {
		this.idhToLoc = idhToLoc;
	}

	public String getIdhToSite() {
		return this.idhToSite;
	}

	public void setIdhToSite(String idhToSite) {
		this.idhToSite = idhToSite;
	}

	public String getIdhLnRef() {
		return this.idhLnRef;
	}

	public void setIdhLnRef(String idhLnRef) {
		this.idhLnRef = idhLnRef;
	}

	public String getIdhToRef() {
		return this.idhToRef;
	}

	public void setIdhToRef(String idhToRef) {
		this.idhToRef = idhToRef;
	}

	public Double getIdhQtyExch() {
		return this.idhQtyExch;
	}

	public void setIdhQtyExch(Double idhQtyExch) {
		this.idhQtyExch = idhQtyExch;
	}

	public Date getIdhWarrStart() {
		return this.idhWarrStart;
	}

	public void setIdhWarrStart(Date idhWarrStart) {
		this.idhWarrStart = idhWarrStart;
	}

	public Integer getIdhSadLine() {
		return this.idhSadLine;
	}

	public void setIdhSadLine(Integer idhSadLine) {
		this.idhSadLine = idhSadLine;
	}

	public String getIdhModUserid() {
		return this.idhModUserid;
	}

	public void setIdhModUserid(String idhModUserid) {
		this.idhModUserid = idhModUserid;
	}

	public Date getIdhModDate() {
		return this.idhModDate;
	}

	public void setIdhModDate(Date idhModDate) {
		this.idhModDate = idhModDate;
	}

	public Date getIdhPricingDt() {
		return this.idhPricingDt;
	}

	public void setIdhPricingDt(Date idhPricingDt) {
		this.idhPricingDt = idhPricingDt;
	}

	public String getIdhSvCode() {
		return this.idhSvCode;
	}

	public void setIdhSvCode(String idhSvCode) {
		this.idhSvCode = idhSvCode;
	}

	public String getIdhForSerial() {
		return this.idhForSerial;
	}

	public void setIdhForSerial(String idhForSerial) {
		this.idhForSerial = idhForSerial;
	}

	public String getIdhQadc01() {
		return this.idhQadc01;
	}

	public void setIdhQadc01(String idhQadc01) {
		this.idhQadc01 = idhQadc01;
	}

	public String getIdhQadc02() {
		return this.idhQadc02;
	}

	public void setIdhQadc02(String idhQadc02) {
		this.idhQadc02 = idhQadc02;
	}

	public String getIdhQadc03() {
		return this.idhQadc03;
	}

	public void setIdhQadc03(String idhQadc03) {
		this.idhQadc03 = idhQadc03;
	}

	public String getIdhQadc04() {
		return this.idhQadc04;
	}

	public void setIdhQadc04(String idhQadc04) {
		this.idhQadc04 = idhQadc04;
	}

	public String getIdhQadc05() {
		return this.idhQadc05;
	}

	public void setIdhQadc05(String idhQadc05) {
		this.idhQadc05 = idhQadc05;
	}

	public String getIdhQadc06() {
		return this.idhQadc06;
	}

	public void setIdhQadc06(String idhQadc06) {
		this.idhQadc06 = idhQadc06;
	}

	public Integer getIdhQadi01() {
		return this.idhQadi01;
	}

	public void setIdhQadi01(Integer idhQadi01) {
		this.idhQadi01 = idhQadi01;
	}

	public Integer getIdhQadi02() {
		return this.idhQadi02;
	}

	public void setIdhQadi02(Integer idhQadi02) {
		this.idhQadi02 = idhQadi02;
	}

	public Integer getIdhQadi03() {
		return this.idhQadi03;
	}

	public void setIdhQadi03(Integer idhQadi03) {
		this.idhQadi03 = idhQadi03;
	}

	public Integer getIdhQadi04() {
		return this.idhQadi04;
	}

	public void setIdhQadi04(Integer idhQadi04) {
		this.idhQadi04 = idhQadi04;
	}

	public Double getIdhQadd01() {
		return this.idhQadd01;
	}

	public void setIdhQadd01(Double idhQadd01) {
		this.idhQadd01 = idhQadd01;
	}

	public Double getIdhQadd02() {
		return this.idhQadd02;
	}

	public void setIdhQadd02(Double idhQadd02) {
		this.idhQadd02 = idhQadd02;
	}

	public Double getIdhQadd03() {
		return this.idhQadd03;
	}

	public void setIdhQadd03(Double idhQadd03) {
		this.idhQadd03 = idhQadd03;
	}

	public Double getIdhQadd04() {
		return this.idhQadd04;
	}

	public void setIdhQadd04(Double idhQadd04) {
		this.idhQadd04 = idhQadd04;
	}

	public Double getIdhQadd05() {
		return this.idhQadd05;
	}

	public void setIdhQadd05(Double idhQadd05) {
		this.idhQadd05 = idhQadd05;
	}

	public Boolean getIdhQadl01() {
		return this.idhQadl01;
	}

	public void setIdhQadl01(Boolean idhQadl01) {
		this.idhQadl01 = idhQadl01;
	}

	public Boolean getIdhQadl02() {
		return this.idhQadl02;
	}

	public void setIdhQadl02(Boolean idhQadl02) {
		this.idhQadl02 = idhQadl02;
	}

	public Boolean getIdhQadl03() {
		return this.idhQadl03;
	}

	public void setIdhQadl03(Boolean idhQadl03) {
		this.idhQadl03 = idhQadl03;
	}

	public Boolean getIdhQadl04() {
		return this.idhQadl04;
	}

	public void setIdhQadl04(Boolean idhQadl04) {
		this.idhQadl04 = idhQadl04;
	}

	public Boolean getIdhQadl05() {
		return this.idhQadl05;
	}

	public void setIdhQadl05(Boolean idhQadl05) {
		this.idhQadl05 = idhQadl05;
	}

	public Date getIdhQadt01() {
		return this.idhQadt01;
	}

	public void setIdhQadt01(Date idhQadt01) {
		this.idhQadt01 = idhQadt01;
	}

	public Date getIdhQadt02() {
		return this.idhQadt02;
	}

	public void setIdhQadt02(Date idhQadt02) {
		this.idhQadt02 = idhQadt02;
	}

	public Date getIdhQadt03() {
		return this.idhQadt03;
	}

	public void setIdhQadt03(Date idhQadt03) {
		this.idhQadt03 = idhQadt03;
	}

	public Date getIdhQadt04() {
		return this.idhQadt04;
	}

	public void setIdhQadt04(Date idhQadt04) {
		this.idhQadt04 = idhQadt04;
	}

	public Date getIdhQadt05() {
		return this.idhQadt05;
	}

	public void setIdhQadt05(Date idhQadt05) {
		this.idhQadt05 = idhQadt05;
	}

	public Boolean getIdhBonus() {
		return this.idhBonus;
	}

	public void setIdhBonus(Boolean idhBonus) {
		this.idhBonus = idhBonus;
	}

	public String getIdhBtbType() {
		return this.idhBtbType;
	}

	public void setIdhBtbType(String idhBtbType) {
		this.idhBtbType = idhBtbType;
	}

	public String getIdhBtbPo() {
		return this.idhBtbPo;
	}

	public void setIdhBtbPo(String idhBtbPo) {
		this.idhBtbPo = idhBtbPo;
	}

	public Integer getIdhBtbPodLine() {
		return this.idhBtbPodLine;
	}

	public void setIdhBtbPodLine(Integer idhBtbPodLine) {
		this.idhBtbPodLine = idhBtbPodLine;
	}

	public String getIdhBtbVend() {
		return this.idhBtbVend;
	}

	public void setIdhBtbVend(String idhBtbVend) {
		this.idhBtbVend = idhBtbVend;
	}

	public Date getIdhExpDel() {
		return this.idhExpDel;
	}

	public void setIdhExpDel(Date idhExpDel) {
		this.idhExpDel = idhExpDel;
	}

	public String getIdhCfgType() {
		return this.idhCfgType;
	}

	public void setIdhCfgType(String idhCfgType) {
		this.idhCfgType = idhCfgType;
	}

	public String getIdhDiv() {
		return this.idhDiv;
	}

	public void setIdhDiv(String idhDiv) {
		this.idhDiv = idhDiv;
	}

	public Integer getIdhPlPriority() {
		return this.idhPlPriority;
	}

	public void setIdhPlPriority(Integer idhPlPriority) {
		this.idhPlPriority = idhPlPriority;
	}

	public String getIdhPrig1() {
		return this.idhPrig1;
	}

	public void setIdhPrig1(String idhPrig1) {
		this.idhPrig1 = idhPrig1;
	}

	public String getIdhPrig2() {
		return this.idhPrig2;
	}

	public void setIdhPrig2(String idhPrig2) {
		this.idhPrig2 = idhPrig2;
	}

	public String getIdhSub() {
		return this.idhSub;
	}

	public void setIdhSub(String idhSub) {
		this.idhSub = idhSub;
	}

	public String getIdhDscProject() {
		return this.idhDscProject;
	}

	public void setIdhDscProject(String idhDscProject) {
		this.idhDscProject = idhDscProject;
	}

	public String getIdhDscSub() {
		return this.idhDscSub;
	}

	public void setIdhDscSub(String idhDscSub) {
		this.idhDscSub = idhDscSub;
	}

	public Date getIdhPromiseDate() {
		return this.idhPromiseDate;
	}

	public void setIdhPromiseDate(Date idhPromiseDate) {
		this.idhPromiseDate = idhPromiseDate;
	}

	public String getIdhModelyr() {
		return this.idhModelyr;
	}

	public void setIdhModelyr(String idhModelyr) {
		this.idhModelyr = idhModelyr;
	}

	public String getIdhCustref() {
		return this.idhCustref;
	}

	public void setIdhCustref(String idhCustref) {
		this.idhCustref = idhCustref;
	}

	public Double getOidIdhHist() {
		return this.oidIdhHist;
	}

	public void setOidIdhHist(Double oidIdhHist) {
		this.oidIdhHist = oidIdhHist;
	}

}