package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractSodDet entity provides the base persistence definition of the SodDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodDet implements java.io.Serializable {

	// Fields

	private SodDetId id;
	private Date sodDueDate;
	private Date sodPerDate;
	private Date sodReqDate;
	private String sodPart;
	private Double sodQtyOrd;
	private Double sodQtyAll;
	private Double sodQtyPick;
	private Double sodQtyShip;
	private Double sodQtyInv;
	private String sodLoc;
	private String sodType;
	private Double sodPrice;
	private Double sodStdCost;
	private Double sodQtyChg;
	private Double sodBoChg;
	private String sodAcct;
	private Boolean sodAbnormal;
	private Boolean sodTaxable;
	private String sodSerial;
	private String sodDesc;
	private String sodUm;
	private String sodCc;
	private String sodComment;
	private String sodLot;
	private Double sodUmConv;
	private String sodFaNbr;
	private Double sodDiscPct;
	private String sodProject;
	private Integer sodCmtindx;
	private String sodCustpart;
	private Integer sodQad01;
	private String sodStatus;
	private String sodXslspsn;
	private String sodXcommPct;
	private String sodDscAcct;
	private String sodDscCc;
	private Double sodListPr;
	private String sodUser1;
	private String sodUser2;
	private Date sodSobRev;
	private Boolean sodSobStd;
	private Double sodQtyQote;
	private Boolean sodConsume;
	private Date sodExpire;
	private Boolean sodQad02;
	private String sodTaxc;
	private String sodInvNbr;
	private Boolean sodPartial;
	private String sodSite;
	private String sodProdline;
	private Boolean sodTaxIn;
	private Boolean sodFstList;
	private Boolean sodPst;
	private String sodChr01;
	private String sodChr02;
	private String sodChr03;
	private String sodChr04;
	private String sodChr05;
	private String sodChr06;
	private String sodChr07;
	private String sodChr08;
	private String sodChr09;
	private String sodChr10;
	private Date sodDte01;
	private Date sodDte02;
	private Double sodDec01;
	private Double sodDec02;
	private Boolean sodLog01;
	private Double sodTaxMax;
	private String sodCurrRlseId;
	private Boolean sodSched;
	private String sodContrId;
	private Date sodPickdate;
	private Boolean sodConfirm;
	private String sodCumQty;
	private String sodCumDate;
	private String sodFor;
	private Integer sodRef;
	private Double sodQtyPer;
	private Double sodQtyItem;
	private String sodRmaType;
	private String sodOwner;
	private Boolean sodCalcIsb;
	private Double sodFrRate;
	private String sodSlspsn;
	private String sodCommPct;
	private BigDecimal sodOrdMult;
	private String sodPkgCode;
	private Double sodTransltDays;
	private String sodFsmType;
	private String sodConrep;
	private String sodSchData;
	private Boolean sodSchMrp;
	private Integer sodRlseNbr;
	private String sodStartEff;
	private String sodEndEff;
	private String sodDock;
	private String sodPrList;
	private Double sodTransltHrs;
	private String sodOutPo;
	private Integer sodRawDays;
	private Integer sodFabDays;
	private String sodTaxUsage;
	private Integer sodRbktDays;
	private Integer sodRbktWeeks;
	private Integer sodRbktMths;
	private Boolean sodSchedChgd;
	private String sodPastdue;
	private Boolean sodFixPr;
	private Double sodFrWt;
	private String sodFrWtUm;
	private String sodFrClass;
	private Double sodFrChg;
	private String sodShip;
	private String sodSaNbr;
	private String sodEnduser;
	private String sodIsbLoc;
	private Boolean sodUpdIsb;
	private Integer sodIsbRef;
	private Boolean sodAutoIns;
	private String sodDrpRef;
	private String sodTaxEnv;
	private Double sodCrtInt;
	private String sodFrList;
	private Date sodPricingDt;
	private Double sodActPrice;
	private Double sodCoveredAmt;
	private Double sodFixedPrice;
	private Double sodInvCost;
	private Boolean sodCarLoad;
	private Integer sodCaLine;
	private Double sodQtyCons;
	private Double sodQtyRet;
	private String sodCaNbr;
	private Double sodQtyPend;
	private String sodToLoc;
	private String sodToSite;
	private String sodToRef;
	private String sodLnRef;
	private Double sodQtyExch;
	private Integer sodSadLine;
	private Date sodWarrStart;
	private String sodModUserid;
	private Date sodModDate;
	private String sodSvCode;
	private Boolean sodAltPkg;
	private String sodForSerial;
	private Boolean sodOverrideLmt;
	private String sodQadc01;
	private String sodQadc02;
	private String sodQadc03;
	private String sodQadc04;
	private Date sodQadt01;
	private Date sodQadt02;
	private Date sodQadt03;
	private Date sodQadt04;
	private Double sodQadd01;
	private Double sodQadd02;
	private Double sodQadd03;
	private Boolean sodQadl01;
	private Boolean sodQadl02;
	private Boolean sodQadl03;
	private Integer sodQadi01;
	private Integer sodQadi02;
	private Boolean sodBonus;
	private String sodBtbType;
	private String sodBtbPo;
	private Integer sodBtbPodLine;
	private String sodBtbVend;
	private Date sodExpDel;
	private Boolean sodDirAll;
	private String sodCfgType;
	private String sodDiv;
	private Integer sodPlPriority;
	private String sodPrig1;
	private String sodPrig2;
	private Double sodQadd04;
	private String sodSub;
	private String sodDscSub;
	private String sodDscProject;
	private Double sodQtyIvcd;
	private String sodCumTime;
	private String sodShipPart;
	private Date sodPromiseDate;
	private String sodChargeType;
	private String sodOrderCategory;
	private String sodModelyr;
	private String sodCustref;
	private Boolean sodConsignment;
	private Integer sodMaxAgingDays;
	private String sodConsignLoc;
	private String sodIntransLoc;
	private Boolean sodAutoReplenish;
	private Boolean sodManualFrList;
	private Double oidSodDet;

	// Constructors

	/** default constructor */
	public AbstractSodDet() {
	}

	/** minimal constructor */
	public AbstractSodDet(SodDetId id, Boolean sodBonus, String sodBtbType,
			String sodBtbPo, Integer sodBtbPodLine, String sodBtbVend,
			Boolean sodDirAll, String sodOrderCategory, String sodModelyr,
			String sodCustref, Boolean sodConsignment, Integer sodMaxAgingDays,
			String sodConsignLoc, String sodIntransLoc,
			Boolean sodAutoReplenish, Boolean sodManualFrList, Double oidSodDet) {
		this.id = id;
		this.sodBonus = sodBonus;
		this.sodBtbType = sodBtbType;
		this.sodBtbPo = sodBtbPo;
		this.sodBtbPodLine = sodBtbPodLine;
		this.sodBtbVend = sodBtbVend;
		this.sodDirAll = sodDirAll;
		this.sodOrderCategory = sodOrderCategory;
		this.sodModelyr = sodModelyr;
		this.sodCustref = sodCustref;
		this.sodConsignment = sodConsignment;
		this.sodMaxAgingDays = sodMaxAgingDays;
		this.sodConsignLoc = sodConsignLoc;
		this.sodIntransLoc = sodIntransLoc;
		this.sodAutoReplenish = sodAutoReplenish;
		this.sodManualFrList = sodManualFrList;
		this.oidSodDet = oidSodDet;
	}

	/** full constructor */
	public AbstractSodDet(SodDetId id, Date sodDueDate, Date sodPerDate,
			Date sodReqDate, String sodPart, Double sodQtyOrd,
			Double sodQtyAll, Double sodQtyPick, Double sodQtyShip,
			Double sodQtyInv, String sodLoc, String sodType, Double sodPrice,
			Double sodStdCost, Double sodQtyChg, Double sodBoChg,
			String sodAcct, Boolean sodAbnormal, Boolean sodTaxable,
			String sodSerial, String sodDesc, String sodUm, String sodCc,
			String sodComment, String sodLot, Double sodUmConv,
			String sodFaNbr, Double sodDiscPct, String sodProject,
			Integer sodCmtindx, String sodCustpart, Integer sodQad01,
			String sodStatus, String sodXslspsn, String sodXcommPct,
			String sodDscAcct, String sodDscCc, Double sodListPr,
			String sodUser1, String sodUser2, Date sodSobRev,
			Boolean sodSobStd, Double sodQtyQote, Boolean sodConsume,
			Date sodExpire, Boolean sodQad02, String sodTaxc, String sodInvNbr,
			Boolean sodPartial, String sodSite, String sodProdline,
			Boolean sodTaxIn, Boolean sodFstList, Boolean sodPst,
			String sodChr01, String sodChr02, String sodChr03, String sodChr04,
			String sodChr05, String sodChr06, String sodChr07, String sodChr08,
			String sodChr09, String sodChr10, Date sodDte01, Date sodDte02,
			Double sodDec01, Double sodDec02, Boolean sodLog01,
			Double sodTaxMax, String sodCurrRlseId, Boolean sodSched,
			String sodContrId, Date sodPickdate, Boolean sodConfirm,
			String sodCumQty, String sodCumDate, String sodFor, Integer sodRef,
			Double sodQtyPer, Double sodQtyItem, String sodRmaType,
			String sodOwner, Boolean sodCalcIsb, Double sodFrRate,
			String sodSlspsn, String sodCommPct, BigDecimal sodOrdMult,
			String sodPkgCode, Double sodTransltDays, String sodFsmType,
			String sodConrep, String sodSchData, Boolean sodSchMrp,
			Integer sodRlseNbr, String sodStartEff, String sodEndEff,
			String sodDock, String sodPrList, Double sodTransltHrs,
			String sodOutPo, Integer sodRawDays, Integer sodFabDays,
			String sodTaxUsage, Integer sodRbktDays, Integer sodRbktWeeks,
			Integer sodRbktMths, Boolean sodSchedChgd, String sodPastdue,
			Boolean sodFixPr, Double sodFrWt, String sodFrWtUm,
			String sodFrClass, Double sodFrChg, String sodShip,
			String sodSaNbr, String sodEnduser, String sodIsbLoc,
			Boolean sodUpdIsb, Integer sodIsbRef, Boolean sodAutoIns,
			String sodDrpRef, String sodTaxEnv, Double sodCrtInt,
			String sodFrList, Date sodPricingDt, Double sodActPrice,
			Double sodCoveredAmt, Double sodFixedPrice, Double sodInvCost,
			Boolean sodCarLoad, Integer sodCaLine, Double sodQtyCons,
			Double sodQtyRet, String sodCaNbr, Double sodQtyPend,
			String sodToLoc, String sodToSite, String sodToRef,
			String sodLnRef, Double sodQtyExch, Integer sodSadLine,
			Date sodWarrStart, String sodModUserid, Date sodModDate,
			String sodSvCode, Boolean sodAltPkg, String sodForSerial,
			Boolean sodOverrideLmt, String sodQadc01, String sodQadc02,
			String sodQadc03, String sodQadc04, Date sodQadt01, Date sodQadt02,
			Date sodQadt03, Date sodQadt04, Double sodQadd01, Double sodQadd02,
			Double sodQadd03, Boolean sodQadl01, Boolean sodQadl02,
			Boolean sodQadl03, Integer sodQadi01, Integer sodQadi02,
			Boolean sodBonus, String sodBtbType, String sodBtbPo,
			Integer sodBtbPodLine, String sodBtbVend, Date sodExpDel,
			Boolean sodDirAll, String sodCfgType, String sodDiv,
			Integer sodPlPriority, String sodPrig1, String sodPrig2,
			Double sodQadd04, String sodSub, String sodDscSub,
			String sodDscProject, Double sodQtyIvcd, String sodCumTime,
			String sodShipPart, Date sodPromiseDate, String sodChargeType,
			String sodOrderCategory, String sodModelyr, String sodCustref,
			Boolean sodConsignment, Integer sodMaxAgingDays,
			String sodConsignLoc, String sodIntransLoc,
			Boolean sodAutoReplenish, Boolean sodManualFrList, Double oidSodDet) {
		this.id = id;
		this.sodDueDate = sodDueDate;
		this.sodPerDate = sodPerDate;
		this.sodReqDate = sodReqDate;
		this.sodPart = sodPart;
		this.sodQtyOrd = sodQtyOrd;
		this.sodQtyAll = sodQtyAll;
		this.sodQtyPick = sodQtyPick;
		this.sodQtyShip = sodQtyShip;
		this.sodQtyInv = sodQtyInv;
		this.sodLoc = sodLoc;
		this.sodType = sodType;
		this.sodPrice = sodPrice;
		this.sodStdCost = sodStdCost;
		this.sodQtyChg = sodQtyChg;
		this.sodBoChg = sodBoChg;
		this.sodAcct = sodAcct;
		this.sodAbnormal = sodAbnormal;
		this.sodTaxable = sodTaxable;
		this.sodSerial = sodSerial;
		this.sodDesc = sodDesc;
		this.sodUm = sodUm;
		this.sodCc = sodCc;
		this.sodComment = sodComment;
		this.sodLot = sodLot;
		this.sodUmConv = sodUmConv;
		this.sodFaNbr = sodFaNbr;
		this.sodDiscPct = sodDiscPct;
		this.sodProject = sodProject;
		this.sodCmtindx = sodCmtindx;
		this.sodCustpart = sodCustpart;
		this.sodQad01 = sodQad01;
		this.sodStatus = sodStatus;
		this.sodXslspsn = sodXslspsn;
		this.sodXcommPct = sodXcommPct;
		this.sodDscAcct = sodDscAcct;
		this.sodDscCc = sodDscCc;
		this.sodListPr = sodListPr;
		this.sodUser1 = sodUser1;
		this.sodUser2 = sodUser2;
		this.sodSobRev = sodSobRev;
		this.sodSobStd = sodSobStd;
		this.sodQtyQote = sodQtyQote;
		this.sodConsume = sodConsume;
		this.sodExpire = sodExpire;
		this.sodQad02 = sodQad02;
		this.sodTaxc = sodTaxc;
		this.sodInvNbr = sodInvNbr;
		this.sodPartial = sodPartial;
		this.sodSite = sodSite;
		this.sodProdline = sodProdline;
		this.sodTaxIn = sodTaxIn;
		this.sodFstList = sodFstList;
		this.sodPst = sodPst;
		this.sodChr01 = sodChr01;
		this.sodChr02 = sodChr02;
		this.sodChr03 = sodChr03;
		this.sodChr04 = sodChr04;
		this.sodChr05 = sodChr05;
		this.sodChr06 = sodChr06;
		this.sodChr07 = sodChr07;
		this.sodChr08 = sodChr08;
		this.sodChr09 = sodChr09;
		this.sodChr10 = sodChr10;
		this.sodDte01 = sodDte01;
		this.sodDte02 = sodDte02;
		this.sodDec01 = sodDec01;
		this.sodDec02 = sodDec02;
		this.sodLog01 = sodLog01;
		this.sodTaxMax = sodTaxMax;
		this.sodCurrRlseId = sodCurrRlseId;
		this.sodSched = sodSched;
		this.sodContrId = sodContrId;
		this.sodPickdate = sodPickdate;
		this.sodConfirm = sodConfirm;
		this.sodCumQty = sodCumQty;
		this.sodCumDate = sodCumDate;
		this.sodFor = sodFor;
		this.sodRef = sodRef;
		this.sodQtyPer = sodQtyPer;
		this.sodQtyItem = sodQtyItem;
		this.sodRmaType = sodRmaType;
		this.sodOwner = sodOwner;
		this.sodCalcIsb = sodCalcIsb;
		this.sodFrRate = sodFrRate;
		this.sodSlspsn = sodSlspsn;
		this.sodCommPct = sodCommPct;
		this.sodOrdMult = sodOrdMult;
		this.sodPkgCode = sodPkgCode;
		this.sodTransltDays = sodTransltDays;
		this.sodFsmType = sodFsmType;
		this.sodConrep = sodConrep;
		this.sodSchData = sodSchData;
		this.sodSchMrp = sodSchMrp;
		this.sodRlseNbr = sodRlseNbr;
		this.sodStartEff = sodStartEff;
		this.sodEndEff = sodEndEff;
		this.sodDock = sodDock;
		this.sodPrList = sodPrList;
		this.sodTransltHrs = sodTransltHrs;
		this.sodOutPo = sodOutPo;
		this.sodRawDays = sodRawDays;
		this.sodFabDays = sodFabDays;
		this.sodTaxUsage = sodTaxUsage;
		this.sodRbktDays = sodRbktDays;
		this.sodRbktWeeks = sodRbktWeeks;
		this.sodRbktMths = sodRbktMths;
		this.sodSchedChgd = sodSchedChgd;
		this.sodPastdue = sodPastdue;
		this.sodFixPr = sodFixPr;
		this.sodFrWt = sodFrWt;
		this.sodFrWtUm = sodFrWtUm;
		this.sodFrClass = sodFrClass;
		this.sodFrChg = sodFrChg;
		this.sodShip = sodShip;
		this.sodSaNbr = sodSaNbr;
		this.sodEnduser = sodEnduser;
		this.sodIsbLoc = sodIsbLoc;
		this.sodUpdIsb = sodUpdIsb;
		this.sodIsbRef = sodIsbRef;
		this.sodAutoIns = sodAutoIns;
		this.sodDrpRef = sodDrpRef;
		this.sodTaxEnv = sodTaxEnv;
		this.sodCrtInt = sodCrtInt;
		this.sodFrList = sodFrList;
		this.sodPricingDt = sodPricingDt;
		this.sodActPrice = sodActPrice;
		this.sodCoveredAmt = sodCoveredAmt;
		this.sodFixedPrice = sodFixedPrice;
		this.sodInvCost = sodInvCost;
		this.sodCarLoad = sodCarLoad;
		this.sodCaLine = sodCaLine;
		this.sodQtyCons = sodQtyCons;
		this.sodQtyRet = sodQtyRet;
		this.sodCaNbr = sodCaNbr;
		this.sodQtyPend = sodQtyPend;
		this.sodToLoc = sodToLoc;
		this.sodToSite = sodToSite;
		this.sodToRef = sodToRef;
		this.sodLnRef = sodLnRef;
		this.sodQtyExch = sodQtyExch;
		this.sodSadLine = sodSadLine;
		this.sodWarrStart = sodWarrStart;
		this.sodModUserid = sodModUserid;
		this.sodModDate = sodModDate;
		this.sodSvCode = sodSvCode;
		this.sodAltPkg = sodAltPkg;
		this.sodForSerial = sodForSerial;
		this.sodOverrideLmt = sodOverrideLmt;
		this.sodQadc01 = sodQadc01;
		this.sodQadc02 = sodQadc02;
		this.sodQadc03 = sodQadc03;
		this.sodQadc04 = sodQadc04;
		this.sodQadt01 = sodQadt01;
		this.sodQadt02 = sodQadt02;
		this.sodQadt03 = sodQadt03;
		this.sodQadt04 = sodQadt04;
		this.sodQadd01 = sodQadd01;
		this.sodQadd02 = sodQadd02;
		this.sodQadd03 = sodQadd03;
		this.sodQadl01 = sodQadl01;
		this.sodQadl02 = sodQadl02;
		this.sodQadl03 = sodQadl03;
		this.sodQadi01 = sodQadi01;
		this.sodQadi02 = sodQadi02;
		this.sodBonus = sodBonus;
		this.sodBtbType = sodBtbType;
		this.sodBtbPo = sodBtbPo;
		this.sodBtbPodLine = sodBtbPodLine;
		this.sodBtbVend = sodBtbVend;
		this.sodExpDel = sodExpDel;
		this.sodDirAll = sodDirAll;
		this.sodCfgType = sodCfgType;
		this.sodDiv = sodDiv;
		this.sodPlPriority = sodPlPriority;
		this.sodPrig1 = sodPrig1;
		this.sodPrig2 = sodPrig2;
		this.sodQadd04 = sodQadd04;
		this.sodSub = sodSub;
		this.sodDscSub = sodDscSub;
		this.sodDscProject = sodDscProject;
		this.sodQtyIvcd = sodQtyIvcd;
		this.sodCumTime = sodCumTime;
		this.sodShipPart = sodShipPart;
		this.sodPromiseDate = sodPromiseDate;
		this.sodChargeType = sodChargeType;
		this.sodOrderCategory = sodOrderCategory;
		this.sodModelyr = sodModelyr;
		this.sodCustref = sodCustref;
		this.sodConsignment = sodConsignment;
		this.sodMaxAgingDays = sodMaxAgingDays;
		this.sodConsignLoc = sodConsignLoc;
		this.sodIntransLoc = sodIntransLoc;
		this.sodAutoReplenish = sodAutoReplenish;
		this.sodManualFrList = sodManualFrList;
		this.oidSodDet = oidSodDet;
	}

	// Property accessors

	public SodDetId getId() {
		return this.id;
	}

	public void setId(SodDetId id) {
		this.id = id;
	}

	public Date getSodDueDate() {
		return this.sodDueDate;
	}

	public void setSodDueDate(Date sodDueDate) {
		this.sodDueDate = sodDueDate;
	}

	public Date getSodPerDate() {
		return this.sodPerDate;
	}

	public void setSodPerDate(Date sodPerDate) {
		this.sodPerDate = sodPerDate;
	}

	public Date getSodReqDate() {
		return this.sodReqDate;
	}

	public void setSodReqDate(Date sodReqDate) {
		this.sodReqDate = sodReqDate;
	}

	public String getSodPart() {
		return this.sodPart;
	}

	public void setSodPart(String sodPart) {
		this.sodPart = sodPart;
	}

	public Double getSodQtyOrd() {
		return this.sodQtyOrd;
	}

	public void setSodQtyOrd(Double sodQtyOrd) {
		this.sodQtyOrd = sodQtyOrd;
	}

	public Double getSodQtyAll() {
		return this.sodQtyAll;
	}

	public void setSodQtyAll(Double sodQtyAll) {
		this.sodQtyAll = sodQtyAll;
	}

	public Double getSodQtyPick() {
		return this.sodQtyPick;
	}

	public void setSodQtyPick(Double sodQtyPick) {
		this.sodQtyPick = sodQtyPick;
	}

	public Double getSodQtyShip() {
		return this.sodQtyShip;
	}

	public void setSodQtyShip(Double sodQtyShip) {
		this.sodQtyShip = sodQtyShip;
	}

	public Double getSodQtyInv() {
		return this.sodQtyInv;
	}

	public void setSodQtyInv(Double sodQtyInv) {
		this.sodQtyInv = sodQtyInv;
	}

	public String getSodLoc() {
		return this.sodLoc;
	}

	public void setSodLoc(String sodLoc) {
		this.sodLoc = sodLoc;
	}

	public String getSodType() {
		return this.sodType;
	}

	public void setSodType(String sodType) {
		this.sodType = sodType;
	}

	public Double getSodPrice() {
		return this.sodPrice;
	}

	public void setSodPrice(Double sodPrice) {
		this.sodPrice = sodPrice;
	}

	public Double getSodStdCost() {
		return this.sodStdCost;
	}

	public void setSodStdCost(Double sodStdCost) {
		this.sodStdCost = sodStdCost;
	}

	public Double getSodQtyChg() {
		return this.sodQtyChg;
	}

	public void setSodQtyChg(Double sodQtyChg) {
		this.sodQtyChg = sodQtyChg;
	}

	public Double getSodBoChg() {
		return this.sodBoChg;
	}

	public void setSodBoChg(Double sodBoChg) {
		this.sodBoChg = sodBoChg;
	}

	public String getSodAcct() {
		return this.sodAcct;
	}

	public void setSodAcct(String sodAcct) {
		this.sodAcct = sodAcct;
	}

	public Boolean getSodAbnormal() {
		return this.sodAbnormal;
	}

	public void setSodAbnormal(Boolean sodAbnormal) {
		this.sodAbnormal = sodAbnormal;
	}

	public Boolean getSodTaxable() {
		return this.sodTaxable;
	}

	public void setSodTaxable(Boolean sodTaxable) {
		this.sodTaxable = sodTaxable;
	}

	public String getSodSerial() {
		return this.sodSerial;
	}

	public void setSodSerial(String sodSerial) {
		this.sodSerial = sodSerial;
	}

	public String getSodDesc() {
		return this.sodDesc;
	}

	public void setSodDesc(String sodDesc) {
		this.sodDesc = sodDesc;
	}

	public String getSodUm() {
		return this.sodUm;
	}

	public void setSodUm(String sodUm) {
		this.sodUm = sodUm;
	}

	public String getSodCc() {
		return this.sodCc;
	}

	public void setSodCc(String sodCc) {
		this.sodCc = sodCc;
	}

	public String getSodComment() {
		return this.sodComment;
	}

	public void setSodComment(String sodComment) {
		this.sodComment = sodComment;
	}

	public String getSodLot() {
		return this.sodLot;
	}

	public void setSodLot(String sodLot) {
		this.sodLot = sodLot;
	}

	public Double getSodUmConv() {
		return this.sodUmConv;
	}

	public void setSodUmConv(Double sodUmConv) {
		this.sodUmConv = sodUmConv;
	}

	public String getSodFaNbr() {
		return this.sodFaNbr;
	}

	public void setSodFaNbr(String sodFaNbr) {
		this.sodFaNbr = sodFaNbr;
	}

	public Double getSodDiscPct() {
		return this.sodDiscPct;
	}

	public void setSodDiscPct(Double sodDiscPct) {
		this.sodDiscPct = sodDiscPct;
	}

	public String getSodProject() {
		return this.sodProject;
	}

	public void setSodProject(String sodProject) {
		this.sodProject = sodProject;
	}

	public Integer getSodCmtindx() {
		return this.sodCmtindx;
	}

	public void setSodCmtindx(Integer sodCmtindx) {
		this.sodCmtindx = sodCmtindx;
	}

	public String getSodCustpart() {
		return this.sodCustpart;
	}

	public void setSodCustpart(String sodCustpart) {
		this.sodCustpart = sodCustpart;
	}

	public Integer getSodQad01() {
		return this.sodQad01;
	}

	public void setSodQad01(Integer sodQad01) {
		this.sodQad01 = sodQad01;
	}

	public String getSodStatus() {
		return this.sodStatus;
	}

	public void setSodStatus(String sodStatus) {
		this.sodStatus = sodStatus;
	}

	public String getSodXslspsn() {
		return this.sodXslspsn;
	}

	public void setSodXslspsn(String sodXslspsn) {
		this.sodXslspsn = sodXslspsn;
	}

	public String getSodXcommPct() {
		return this.sodXcommPct;
	}

	public void setSodXcommPct(String sodXcommPct) {
		this.sodXcommPct = sodXcommPct;
	}

	public String getSodDscAcct() {
		return this.sodDscAcct;
	}

	public void setSodDscAcct(String sodDscAcct) {
		this.sodDscAcct = sodDscAcct;
	}

	public String getSodDscCc() {
		return this.sodDscCc;
	}

	public void setSodDscCc(String sodDscCc) {
		this.sodDscCc = sodDscCc;
	}

	public Double getSodListPr() {
		return this.sodListPr;
	}

	public void setSodListPr(Double sodListPr) {
		this.sodListPr = sodListPr;
	}

	public String getSodUser1() {
		return this.sodUser1;
	}

	public void setSodUser1(String sodUser1) {
		this.sodUser1 = sodUser1;
	}

	public String getSodUser2() {
		return this.sodUser2;
	}

	public void setSodUser2(String sodUser2) {
		this.sodUser2 = sodUser2;
	}

	public Date getSodSobRev() {
		return this.sodSobRev;
	}

	public void setSodSobRev(Date sodSobRev) {
		this.sodSobRev = sodSobRev;
	}

	public Boolean getSodSobStd() {
		return this.sodSobStd;
	}

	public void setSodSobStd(Boolean sodSobStd) {
		this.sodSobStd = sodSobStd;
	}

	public Double getSodQtyQote() {
		return this.sodQtyQote;
	}

	public void setSodQtyQote(Double sodQtyQote) {
		this.sodQtyQote = sodQtyQote;
	}

	public Boolean getSodConsume() {
		return this.sodConsume;
	}

	public void setSodConsume(Boolean sodConsume) {
		this.sodConsume = sodConsume;
	}

	public Date getSodExpire() {
		return this.sodExpire;
	}

	public void setSodExpire(Date sodExpire) {
		this.sodExpire = sodExpire;
	}

	public Boolean getSodQad02() {
		return this.sodQad02;
	}

	public void setSodQad02(Boolean sodQad02) {
		this.sodQad02 = sodQad02;
	}

	public String getSodTaxc() {
		return this.sodTaxc;
	}

	public void setSodTaxc(String sodTaxc) {
		this.sodTaxc = sodTaxc;
	}

	public String getSodInvNbr() {
		return this.sodInvNbr;
	}

	public void setSodInvNbr(String sodInvNbr) {
		this.sodInvNbr = sodInvNbr;
	}

	public Boolean getSodPartial() {
		return this.sodPartial;
	}

	public void setSodPartial(Boolean sodPartial) {
		this.sodPartial = sodPartial;
	}

	public String getSodSite() {
		return this.sodSite;
	}

	public void setSodSite(String sodSite) {
		this.sodSite = sodSite;
	}

	public String getSodProdline() {
		return this.sodProdline;
	}

	public void setSodProdline(String sodProdline) {
		this.sodProdline = sodProdline;
	}

	public Boolean getSodTaxIn() {
		return this.sodTaxIn;
	}

	public void setSodTaxIn(Boolean sodTaxIn) {
		this.sodTaxIn = sodTaxIn;
	}

	public Boolean getSodFstList() {
		return this.sodFstList;
	}

	public void setSodFstList(Boolean sodFstList) {
		this.sodFstList = sodFstList;
	}

	public Boolean getSodPst() {
		return this.sodPst;
	}

	public void setSodPst(Boolean sodPst) {
		this.sodPst = sodPst;
	}

	public String getSodChr01() {
		return this.sodChr01;
	}

	public void setSodChr01(String sodChr01) {
		this.sodChr01 = sodChr01;
	}

	public String getSodChr02() {
		return this.sodChr02;
	}

	public void setSodChr02(String sodChr02) {
		this.sodChr02 = sodChr02;
	}

	public String getSodChr03() {
		return this.sodChr03;
	}

	public void setSodChr03(String sodChr03) {
		this.sodChr03 = sodChr03;
	}

	public String getSodChr04() {
		return this.sodChr04;
	}

	public void setSodChr04(String sodChr04) {
		this.sodChr04 = sodChr04;
	}

	public String getSodChr05() {
		return this.sodChr05;
	}

	public void setSodChr05(String sodChr05) {
		this.sodChr05 = sodChr05;
	}

	public String getSodChr06() {
		return this.sodChr06;
	}

	public void setSodChr06(String sodChr06) {
		this.sodChr06 = sodChr06;
	}

	public String getSodChr07() {
		return this.sodChr07;
	}

	public void setSodChr07(String sodChr07) {
		this.sodChr07 = sodChr07;
	}

	public String getSodChr08() {
		return this.sodChr08;
	}

	public void setSodChr08(String sodChr08) {
		this.sodChr08 = sodChr08;
	}

	public String getSodChr09() {
		return this.sodChr09;
	}

	public void setSodChr09(String sodChr09) {
		this.sodChr09 = sodChr09;
	}

	public String getSodChr10() {
		return this.sodChr10;
	}

	public void setSodChr10(String sodChr10) {
		this.sodChr10 = sodChr10;
	}

	public Date getSodDte01() {
		return this.sodDte01;
	}

	public void setSodDte01(Date sodDte01) {
		this.sodDte01 = sodDte01;
	}

	public Date getSodDte02() {
		return this.sodDte02;
	}

	public void setSodDte02(Date sodDte02) {
		this.sodDte02 = sodDte02;
	}

	public Double getSodDec01() {
		return this.sodDec01;
	}

	public void setSodDec01(Double sodDec01) {
		this.sodDec01 = sodDec01;
	}

	public Double getSodDec02() {
		return this.sodDec02;
	}

	public void setSodDec02(Double sodDec02) {
		this.sodDec02 = sodDec02;
	}

	public Boolean getSodLog01() {
		return this.sodLog01;
	}

	public void setSodLog01(Boolean sodLog01) {
		this.sodLog01 = sodLog01;
	}

	public Double getSodTaxMax() {
		return this.sodTaxMax;
	}

	public void setSodTaxMax(Double sodTaxMax) {
		this.sodTaxMax = sodTaxMax;
	}

	public String getSodCurrRlseId() {
		return this.sodCurrRlseId;
	}

	public void setSodCurrRlseId(String sodCurrRlseId) {
		this.sodCurrRlseId = sodCurrRlseId;
	}

	public Boolean getSodSched() {
		return this.sodSched;
	}

	public void setSodSched(Boolean sodSched) {
		this.sodSched = sodSched;
	}

	public String getSodContrId() {
		return this.sodContrId;
	}

	public void setSodContrId(String sodContrId) {
		this.sodContrId = sodContrId;
	}

	public Date getSodPickdate() {
		return this.sodPickdate;
	}

	public void setSodPickdate(Date sodPickdate) {
		this.sodPickdate = sodPickdate;
	}

	public Boolean getSodConfirm() {
		return this.sodConfirm;
	}

	public void setSodConfirm(Boolean sodConfirm) {
		this.sodConfirm = sodConfirm;
	}

	public String getSodCumQty() {
		return this.sodCumQty;
	}

	public void setSodCumQty(String sodCumQty) {
		this.sodCumQty = sodCumQty;
	}

	public String getSodCumDate() {
		return this.sodCumDate;
	}

	public void setSodCumDate(String sodCumDate) {
		this.sodCumDate = sodCumDate;
	}

	public String getSodFor() {
		return this.sodFor;
	}

	public void setSodFor(String sodFor) {
		this.sodFor = sodFor;
	}

	public Integer getSodRef() {
		return this.sodRef;
	}

	public void setSodRef(Integer sodRef) {
		this.sodRef = sodRef;
	}

	public Double getSodQtyPer() {
		return this.sodQtyPer;
	}

	public void setSodQtyPer(Double sodQtyPer) {
		this.sodQtyPer = sodQtyPer;
	}

	public Double getSodQtyItem() {
		return this.sodQtyItem;
	}

	public void setSodQtyItem(Double sodQtyItem) {
		this.sodQtyItem = sodQtyItem;
	}

	public String getSodRmaType() {
		return this.sodRmaType;
	}

	public void setSodRmaType(String sodRmaType) {
		this.sodRmaType = sodRmaType;
	}

	public String getSodOwner() {
		return this.sodOwner;
	}

	public void setSodOwner(String sodOwner) {
		this.sodOwner = sodOwner;
	}

	public Boolean getSodCalcIsb() {
		return this.sodCalcIsb;
	}

	public void setSodCalcIsb(Boolean sodCalcIsb) {
		this.sodCalcIsb = sodCalcIsb;
	}

	public Double getSodFrRate() {
		return this.sodFrRate;
	}

	public void setSodFrRate(Double sodFrRate) {
		this.sodFrRate = sodFrRate;
	}

	public String getSodSlspsn() {
		return this.sodSlspsn;
	}

	public void setSodSlspsn(String sodSlspsn) {
		this.sodSlspsn = sodSlspsn;
	}

	public String getSodCommPct() {
		return this.sodCommPct;
	}

	public void setSodCommPct(String sodCommPct) {
		this.sodCommPct = sodCommPct;
	}

	public BigDecimal getSodOrdMult() {
		return this.sodOrdMult;
	}

	public void setSodOrdMult(BigDecimal sodOrdMult) {
		this.sodOrdMult = sodOrdMult;
	}

	public String getSodPkgCode() {
		return this.sodPkgCode;
	}

	public void setSodPkgCode(String sodPkgCode) {
		this.sodPkgCode = sodPkgCode;
	}

	public Double getSodTransltDays() {
		return this.sodTransltDays;
	}

	public void setSodTransltDays(Double sodTransltDays) {
		this.sodTransltDays = sodTransltDays;
	}

	public String getSodFsmType() {
		return this.sodFsmType;
	}

	public void setSodFsmType(String sodFsmType) {
		this.sodFsmType = sodFsmType;
	}

	public String getSodConrep() {
		return this.sodConrep;
	}

	public void setSodConrep(String sodConrep) {
		this.sodConrep = sodConrep;
	}

	public String getSodSchData() {
		return this.sodSchData;
	}

	public void setSodSchData(String sodSchData) {
		this.sodSchData = sodSchData;
	}

	public Boolean getSodSchMrp() {
		return this.sodSchMrp;
	}

	public void setSodSchMrp(Boolean sodSchMrp) {
		this.sodSchMrp = sodSchMrp;
	}

	public Integer getSodRlseNbr() {
		return this.sodRlseNbr;
	}

	public void setSodRlseNbr(Integer sodRlseNbr) {
		this.sodRlseNbr = sodRlseNbr;
	}

	public String getSodStartEff() {
		return this.sodStartEff;
	}

	public void setSodStartEff(String sodStartEff) {
		this.sodStartEff = sodStartEff;
	}

	public String getSodEndEff() {
		return this.sodEndEff;
	}

	public void setSodEndEff(String sodEndEff) {
		this.sodEndEff = sodEndEff;
	}

	public String getSodDock() {
		return this.sodDock;
	}

	public void setSodDock(String sodDock) {
		this.sodDock = sodDock;
	}

	public String getSodPrList() {
		return this.sodPrList;
	}

	public void setSodPrList(String sodPrList) {
		this.sodPrList = sodPrList;
	}

	public Double getSodTransltHrs() {
		return this.sodTransltHrs;
	}

	public void setSodTransltHrs(Double sodTransltHrs) {
		this.sodTransltHrs = sodTransltHrs;
	}

	public String getSodOutPo() {
		return this.sodOutPo;
	}

	public void setSodOutPo(String sodOutPo) {
		this.sodOutPo = sodOutPo;
	}

	public Integer getSodRawDays() {
		return this.sodRawDays;
	}

	public void setSodRawDays(Integer sodRawDays) {
		this.sodRawDays = sodRawDays;
	}

	public Integer getSodFabDays() {
		return this.sodFabDays;
	}

	public void setSodFabDays(Integer sodFabDays) {
		this.sodFabDays = sodFabDays;
	}

	public String getSodTaxUsage() {
		return this.sodTaxUsage;
	}

	public void setSodTaxUsage(String sodTaxUsage) {
		this.sodTaxUsage = sodTaxUsage;
	}

	public Integer getSodRbktDays() {
		return this.sodRbktDays;
	}

	public void setSodRbktDays(Integer sodRbktDays) {
		this.sodRbktDays = sodRbktDays;
	}

	public Integer getSodRbktWeeks() {
		return this.sodRbktWeeks;
	}

	public void setSodRbktWeeks(Integer sodRbktWeeks) {
		this.sodRbktWeeks = sodRbktWeeks;
	}

	public Integer getSodRbktMths() {
		return this.sodRbktMths;
	}

	public void setSodRbktMths(Integer sodRbktMths) {
		this.sodRbktMths = sodRbktMths;
	}

	public Boolean getSodSchedChgd() {
		return this.sodSchedChgd;
	}

	public void setSodSchedChgd(Boolean sodSchedChgd) {
		this.sodSchedChgd = sodSchedChgd;
	}

	public String getSodPastdue() {
		return this.sodPastdue;
	}

	public void setSodPastdue(String sodPastdue) {
		this.sodPastdue = sodPastdue;
	}

	public Boolean getSodFixPr() {
		return this.sodFixPr;
	}

	public void setSodFixPr(Boolean sodFixPr) {
		this.sodFixPr = sodFixPr;
	}

	public Double getSodFrWt() {
		return this.sodFrWt;
	}

	public void setSodFrWt(Double sodFrWt) {
		this.sodFrWt = sodFrWt;
	}

	public String getSodFrWtUm() {
		return this.sodFrWtUm;
	}

	public void setSodFrWtUm(String sodFrWtUm) {
		this.sodFrWtUm = sodFrWtUm;
	}

	public String getSodFrClass() {
		return this.sodFrClass;
	}

	public void setSodFrClass(String sodFrClass) {
		this.sodFrClass = sodFrClass;
	}

	public Double getSodFrChg() {
		return this.sodFrChg;
	}

	public void setSodFrChg(Double sodFrChg) {
		this.sodFrChg = sodFrChg;
	}

	public String getSodShip() {
		return this.sodShip;
	}

	public void setSodShip(String sodShip) {
		this.sodShip = sodShip;
	}

	public String getSodSaNbr() {
		return this.sodSaNbr;
	}

	public void setSodSaNbr(String sodSaNbr) {
		this.sodSaNbr = sodSaNbr;
	}

	public String getSodEnduser() {
		return this.sodEnduser;
	}

	public void setSodEnduser(String sodEnduser) {
		this.sodEnduser = sodEnduser;
	}

	public String getSodIsbLoc() {
		return this.sodIsbLoc;
	}

	public void setSodIsbLoc(String sodIsbLoc) {
		this.sodIsbLoc = sodIsbLoc;
	}

	public Boolean getSodUpdIsb() {
		return this.sodUpdIsb;
	}

	public void setSodUpdIsb(Boolean sodUpdIsb) {
		this.sodUpdIsb = sodUpdIsb;
	}

	public Integer getSodIsbRef() {
		return this.sodIsbRef;
	}

	public void setSodIsbRef(Integer sodIsbRef) {
		this.sodIsbRef = sodIsbRef;
	}

	public Boolean getSodAutoIns() {
		return this.sodAutoIns;
	}

	public void setSodAutoIns(Boolean sodAutoIns) {
		this.sodAutoIns = sodAutoIns;
	}

	public String getSodDrpRef() {
		return this.sodDrpRef;
	}

	public void setSodDrpRef(String sodDrpRef) {
		this.sodDrpRef = sodDrpRef;
	}

	public String getSodTaxEnv() {
		return this.sodTaxEnv;
	}

	public void setSodTaxEnv(String sodTaxEnv) {
		this.sodTaxEnv = sodTaxEnv;
	}

	public Double getSodCrtInt() {
		return this.sodCrtInt;
	}

	public void setSodCrtInt(Double sodCrtInt) {
		this.sodCrtInt = sodCrtInt;
	}

	public String getSodFrList() {
		return this.sodFrList;
	}

	public void setSodFrList(String sodFrList) {
		this.sodFrList = sodFrList;
	}

	public Date getSodPricingDt() {
		return this.sodPricingDt;
	}

	public void setSodPricingDt(Date sodPricingDt) {
		this.sodPricingDt = sodPricingDt;
	}

	public Double getSodActPrice() {
		return this.sodActPrice;
	}

	public void setSodActPrice(Double sodActPrice) {
		this.sodActPrice = sodActPrice;
	}

	public Double getSodCoveredAmt() {
		return this.sodCoveredAmt;
	}

	public void setSodCoveredAmt(Double sodCoveredAmt) {
		this.sodCoveredAmt = sodCoveredAmt;
	}

	public Double getSodFixedPrice() {
		return this.sodFixedPrice;
	}

	public void setSodFixedPrice(Double sodFixedPrice) {
		this.sodFixedPrice = sodFixedPrice;
	}

	public Double getSodInvCost() {
		return this.sodInvCost;
	}

	public void setSodInvCost(Double sodInvCost) {
		this.sodInvCost = sodInvCost;
	}

	public Boolean getSodCarLoad() {
		return this.sodCarLoad;
	}

	public void setSodCarLoad(Boolean sodCarLoad) {
		this.sodCarLoad = sodCarLoad;
	}

	public Integer getSodCaLine() {
		return this.sodCaLine;
	}

	public void setSodCaLine(Integer sodCaLine) {
		this.sodCaLine = sodCaLine;
	}

	public Double getSodQtyCons() {
		return this.sodQtyCons;
	}

	public void setSodQtyCons(Double sodQtyCons) {
		this.sodQtyCons = sodQtyCons;
	}

	public Double getSodQtyRet() {
		return this.sodQtyRet;
	}

	public void setSodQtyRet(Double sodQtyRet) {
		this.sodQtyRet = sodQtyRet;
	}

	public String getSodCaNbr() {
		return this.sodCaNbr;
	}

	public void setSodCaNbr(String sodCaNbr) {
		this.sodCaNbr = sodCaNbr;
	}

	public Double getSodQtyPend() {
		return this.sodQtyPend;
	}

	public void setSodQtyPend(Double sodQtyPend) {
		this.sodQtyPend = sodQtyPend;
	}

	public String getSodToLoc() {
		return this.sodToLoc;
	}

	public void setSodToLoc(String sodToLoc) {
		this.sodToLoc = sodToLoc;
	}

	public String getSodToSite() {
		return this.sodToSite;
	}

	public void setSodToSite(String sodToSite) {
		this.sodToSite = sodToSite;
	}

	public String getSodToRef() {
		return this.sodToRef;
	}

	public void setSodToRef(String sodToRef) {
		this.sodToRef = sodToRef;
	}

	public String getSodLnRef() {
		return this.sodLnRef;
	}

	public void setSodLnRef(String sodLnRef) {
		this.sodLnRef = sodLnRef;
	}

	public Double getSodQtyExch() {
		return this.sodQtyExch;
	}

	public void setSodQtyExch(Double sodQtyExch) {
		this.sodQtyExch = sodQtyExch;
	}

	public Integer getSodSadLine() {
		return this.sodSadLine;
	}

	public void setSodSadLine(Integer sodSadLine) {
		this.sodSadLine = sodSadLine;
	}

	public Date getSodWarrStart() {
		return this.sodWarrStart;
	}

	public void setSodWarrStart(Date sodWarrStart) {
		this.sodWarrStart = sodWarrStart;
	}

	public String getSodModUserid() {
		return this.sodModUserid;
	}

	public void setSodModUserid(String sodModUserid) {
		this.sodModUserid = sodModUserid;
	}

	public Date getSodModDate() {
		return this.sodModDate;
	}

	public void setSodModDate(Date sodModDate) {
		this.sodModDate = sodModDate;
	}

	public String getSodSvCode() {
		return this.sodSvCode;
	}

	public void setSodSvCode(String sodSvCode) {
		this.sodSvCode = sodSvCode;
	}

	public Boolean getSodAltPkg() {
		return this.sodAltPkg;
	}

	public void setSodAltPkg(Boolean sodAltPkg) {
		this.sodAltPkg = sodAltPkg;
	}

	public String getSodForSerial() {
		return this.sodForSerial;
	}

	public void setSodForSerial(String sodForSerial) {
		this.sodForSerial = sodForSerial;
	}

	public Boolean getSodOverrideLmt() {
		return this.sodOverrideLmt;
	}

	public void setSodOverrideLmt(Boolean sodOverrideLmt) {
		this.sodOverrideLmt = sodOverrideLmt;
	}

	public String getSodQadc01() {
		return this.sodQadc01;
	}

	public void setSodQadc01(String sodQadc01) {
		this.sodQadc01 = sodQadc01;
	}

	public String getSodQadc02() {
		return this.sodQadc02;
	}

	public void setSodQadc02(String sodQadc02) {
		this.sodQadc02 = sodQadc02;
	}

	public String getSodQadc03() {
		return this.sodQadc03;
	}

	public void setSodQadc03(String sodQadc03) {
		this.sodQadc03 = sodQadc03;
	}

	public String getSodQadc04() {
		return this.sodQadc04;
	}

	public void setSodQadc04(String sodQadc04) {
		this.sodQadc04 = sodQadc04;
	}

	public Date getSodQadt01() {
		return this.sodQadt01;
	}

	public void setSodQadt01(Date sodQadt01) {
		this.sodQadt01 = sodQadt01;
	}

	public Date getSodQadt02() {
		return this.sodQadt02;
	}

	public void setSodQadt02(Date sodQadt02) {
		this.sodQadt02 = sodQadt02;
	}

	public Date getSodQadt03() {
		return this.sodQadt03;
	}

	public void setSodQadt03(Date sodQadt03) {
		this.sodQadt03 = sodQadt03;
	}

	public Date getSodQadt04() {
		return this.sodQadt04;
	}

	public void setSodQadt04(Date sodQadt04) {
		this.sodQadt04 = sodQadt04;
	}

	public Double getSodQadd01() {
		return this.sodQadd01;
	}

	public void setSodQadd01(Double sodQadd01) {
		this.sodQadd01 = sodQadd01;
	}

	public Double getSodQadd02() {
		return this.sodQadd02;
	}

	public void setSodQadd02(Double sodQadd02) {
		this.sodQadd02 = sodQadd02;
	}

	public Double getSodQadd03() {
		return this.sodQadd03;
	}

	public void setSodQadd03(Double sodQadd03) {
		this.sodQadd03 = sodQadd03;
	}

	public Boolean getSodQadl01() {
		return this.sodQadl01;
	}

	public void setSodQadl01(Boolean sodQadl01) {
		this.sodQadl01 = sodQadl01;
	}

	public Boolean getSodQadl02() {
		return this.sodQadl02;
	}

	public void setSodQadl02(Boolean sodQadl02) {
		this.sodQadl02 = sodQadl02;
	}

	public Boolean getSodQadl03() {
		return this.sodQadl03;
	}

	public void setSodQadl03(Boolean sodQadl03) {
		this.sodQadl03 = sodQadl03;
	}

	public Integer getSodQadi01() {
		return this.sodQadi01;
	}

	public void setSodQadi01(Integer sodQadi01) {
		this.sodQadi01 = sodQadi01;
	}

	public Integer getSodQadi02() {
		return this.sodQadi02;
	}

	public void setSodQadi02(Integer sodQadi02) {
		this.sodQadi02 = sodQadi02;
	}

	public Boolean getSodBonus() {
		return this.sodBonus;
	}

	public void setSodBonus(Boolean sodBonus) {
		this.sodBonus = sodBonus;
	}

	public String getSodBtbType() {
		return this.sodBtbType;
	}

	public void setSodBtbType(String sodBtbType) {
		this.sodBtbType = sodBtbType;
	}

	public String getSodBtbPo() {
		return this.sodBtbPo;
	}

	public void setSodBtbPo(String sodBtbPo) {
		this.sodBtbPo = sodBtbPo;
	}

	public Integer getSodBtbPodLine() {
		return this.sodBtbPodLine;
	}

	public void setSodBtbPodLine(Integer sodBtbPodLine) {
		this.sodBtbPodLine = sodBtbPodLine;
	}

	public String getSodBtbVend() {
		return this.sodBtbVend;
	}

	public void setSodBtbVend(String sodBtbVend) {
		this.sodBtbVend = sodBtbVend;
	}

	public Date getSodExpDel() {
		return this.sodExpDel;
	}

	public void setSodExpDel(Date sodExpDel) {
		this.sodExpDel = sodExpDel;
	}

	public Boolean getSodDirAll() {
		return this.sodDirAll;
	}

	public void setSodDirAll(Boolean sodDirAll) {
		this.sodDirAll = sodDirAll;
	}

	public String getSodCfgType() {
		return this.sodCfgType;
	}

	public void setSodCfgType(String sodCfgType) {
		this.sodCfgType = sodCfgType;
	}

	public String getSodDiv() {
		return this.sodDiv;
	}

	public void setSodDiv(String sodDiv) {
		this.sodDiv = sodDiv;
	}

	public Integer getSodPlPriority() {
		return this.sodPlPriority;
	}

	public void setSodPlPriority(Integer sodPlPriority) {
		this.sodPlPriority = sodPlPriority;
	}

	public String getSodPrig1() {
		return this.sodPrig1;
	}

	public void setSodPrig1(String sodPrig1) {
		this.sodPrig1 = sodPrig1;
	}

	public String getSodPrig2() {
		return this.sodPrig2;
	}

	public void setSodPrig2(String sodPrig2) {
		this.sodPrig2 = sodPrig2;
	}

	public Double getSodQadd04() {
		return this.sodQadd04;
	}

	public void setSodQadd04(Double sodQadd04) {
		this.sodQadd04 = sodQadd04;
	}

	public String getSodSub() {
		return this.sodSub;
	}

	public void setSodSub(String sodSub) {
		this.sodSub = sodSub;
	}

	public String getSodDscSub() {
		return this.sodDscSub;
	}

	public void setSodDscSub(String sodDscSub) {
		this.sodDscSub = sodDscSub;
	}

	public String getSodDscProject() {
		return this.sodDscProject;
	}

	public void setSodDscProject(String sodDscProject) {
		this.sodDscProject = sodDscProject;
	}

	public Double getSodQtyIvcd() {
		return this.sodQtyIvcd;
	}

	public void setSodQtyIvcd(Double sodQtyIvcd) {
		this.sodQtyIvcd = sodQtyIvcd;
	}

	public String getSodCumTime() {
		return this.sodCumTime;
	}

	public void setSodCumTime(String sodCumTime) {
		this.sodCumTime = sodCumTime;
	}

	public String getSodShipPart() {
		return this.sodShipPart;
	}

	public void setSodShipPart(String sodShipPart) {
		this.sodShipPart = sodShipPart;
	}

	public Date getSodPromiseDate() {
		return this.sodPromiseDate;
	}

	public void setSodPromiseDate(Date sodPromiseDate) {
		this.sodPromiseDate = sodPromiseDate;
	}

	public String getSodChargeType() {
		return this.sodChargeType;
	}

	public void setSodChargeType(String sodChargeType) {
		this.sodChargeType = sodChargeType;
	}

	public String getSodOrderCategory() {
		return this.sodOrderCategory;
	}

	public void setSodOrderCategory(String sodOrderCategory) {
		this.sodOrderCategory = sodOrderCategory;
	}

	public String getSodModelyr() {
		return this.sodModelyr;
	}

	public void setSodModelyr(String sodModelyr) {
		this.sodModelyr = sodModelyr;
	}

	public String getSodCustref() {
		return this.sodCustref;
	}

	public void setSodCustref(String sodCustref) {
		this.sodCustref = sodCustref;
	}

	public Boolean getSodConsignment() {
		return this.sodConsignment;
	}

	public void setSodConsignment(Boolean sodConsignment) {
		this.sodConsignment = sodConsignment;
	}

	public Integer getSodMaxAgingDays() {
		return this.sodMaxAgingDays;
	}

	public void setSodMaxAgingDays(Integer sodMaxAgingDays) {
		this.sodMaxAgingDays = sodMaxAgingDays;
	}

	public String getSodConsignLoc() {
		return this.sodConsignLoc;
	}

	public void setSodConsignLoc(String sodConsignLoc) {
		this.sodConsignLoc = sodConsignLoc;
	}

	public String getSodIntransLoc() {
		return this.sodIntransLoc;
	}

	public void setSodIntransLoc(String sodIntransLoc) {
		this.sodIntransLoc = sodIntransLoc;
	}

	public Boolean getSodAutoReplenish() {
		return this.sodAutoReplenish;
	}

	public void setSodAutoReplenish(Boolean sodAutoReplenish) {
		this.sodAutoReplenish = sodAutoReplenish;
	}

	public Boolean getSodManualFrList() {
		return this.sodManualFrList;
	}

	public void setSodManualFrList(Boolean sodManualFrList) {
		this.sodManualFrList = sodManualFrList;
	}

	public Double getOidSodDet() {
		return this.oidSodDet;
	}

	public void setOidSodDet(Double oidSodDet) {
		this.oidSodDet = oidSodDet;
	}

}