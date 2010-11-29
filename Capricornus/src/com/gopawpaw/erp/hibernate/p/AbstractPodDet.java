package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractPodDet entity provides the base persistence definition of the PodDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPodDet implements java.io.Serializable {

	// Fields

	private PodDetId id;
	private Date podDueDate;
	private String podPart;
	private Double podQtyOrd;
	private Double podQtyRcvd;
	private Double podPurCost;
	private Double podStdCost;
	private String podSoJob;
	private Double podQtyChg;
	private Double podCostChg;
	private Double podBoChg;
	private String podAcct;
	private Date podPerDate;
	private String podType;
	private Boolean podInspRqd;
	private String podWoLot;
	private String podVpart;
	private Date podNeed;
	private Boolean podTaxable;
	private String podDesc;
	private String podCc;
	private String podQad04;
	private String podUm;
	private Double podDiscPct;
	private String podReqNbr;
	private String podQad10;
	private Double podUmConv;
	private String podLoc;
	private String podSerial;
	private Integer podOp;
	private String podContract;
	private String podStatus;
	private String podRev;
	private Integer podCmtindx;
	private Integer podReqLine;
	private String podProject;
	private Double podPsChg;
	private Boolean podCstUp;
	private String podRum;
	private String podUser1;
	private String podUser2;
	private Boolean podVat;
	private String podQad16;
	private String podQad06;
	private Boolean podPst;
	private Boolean podQad13;
	private String podQad07;
	private String podPayUm;
	private Double podPumConv;
	private Boolean podQad15;
	private String podSite;
	private Double podRumConv;
	private Double podQtyRtnd;
	private String podBlanket;
	private Integer podBlnktLn;
	private Date podQad01;
	private Integer podQad02;
	private String podQad03;
	private Boolean podQad05;
	private Date podQad08;
	private Integer podQad09;
	private String podQad11;
	private Boolean podQad12;
	private Date podQad14;
	private Integer podRelNbr;
	private Double podRelQty;
	private String podReason;
	private String podRequest;
	private String podApprove;
	private String podChr01;
	private String podChr02;
	private String podChr03;
	private String podChr04;
	private String podChr05;
	private String podChr06;
	private String podChr07;
	private String podChr08;
	private String podChr09;
	private String podChr10;
	private Date podDte01;
	private Date podDte02;
	private Double podDec01;
	private Double podDec02;
	private Boolean podLog01;
	private Double podTaxMax;
	private String podCurrRlseId;
	private Boolean podSched;
	private String podCumQty;
	private String podCumDate;
	private String podContrId;
	private String podAprCode;
	private String podTaxc;
	private String podRmaType;
	private String podPoSite;
	private String podPoDb;
	private Integer podFirmWeeks;
	private Double podMrpPct;
	private Integer podRawWeeks;
	private Integer podFabWeeks;
	private Integer podShipWeeks;
	private Integer podPlanWeeks;
	private Double podTransltDays;
	private String podFsmType;
	private String podSdPat;
	private String podSdTime;
	private BigDecimal podOrdMult;
	private String podPkgCode;
	private Boolean podSchMrp;
	private String podSchData;
	private Integer podRlseNbr;
	private Integer podPlanDays;
	private Integer podPlanMths;
	private Integer podFirmDays;
	private String podStartEff;
	private String podEndEff;
	private Integer podRawDays;
	private Integer podFabDays;
	private String podTaxUsage;
	private Boolean podTaxIn;
	private Boolean podSchedChgd;
	private String podPrList;
	private String podDock;
	private String podPastdue;
	private Boolean podFixPr;
	private String podDrpRef;
	private String podTaxEnv;
	private Double podCrtInt;
	private String podFrList;
	private Double podTransltHrs;
	private Double podSftyltDays;
	private Double podSftyltHrs;
	private String podLotNext;
	private Boolean podLotRcpt;
	private String podGrade;
	private Date podExpire;
	private String podRctstat;
	private Double podAssay;
	private Boolean podRctstatActive;
	private Date podPricingDt;
	private Integer podPrLstTp;
	private Integer podErsOpt;
	private Double podQadd01;
	private Double podQadd02;
	private Double podQadd03;
	private Integer podSodLine;
	private String podSoStatus;
	private Date podSubShipDate;
	private String podSubType;
	private String podSub;
	private String podWipLotser;
	private Integer podPjsLine;
	private Boolean podConsignment;
	private Integer podMaxAgingDays;
	private Boolean podMultiDueDates;
	private Double oidPodDet;

	// Constructors

	/** default constructor */
	public AbstractPodDet() {
	}

	/** minimal constructor */
	public AbstractPodDet(PodDetId id, Integer podSodLine, String podSoStatus,
			Integer podPjsLine, Boolean podConsignment,
			Integer podMaxAgingDays, Boolean podMultiDueDates, Double oidPodDet) {
		this.id = id;
		this.podSodLine = podSodLine;
		this.podSoStatus = podSoStatus;
		this.podPjsLine = podPjsLine;
		this.podConsignment = podConsignment;
		this.podMaxAgingDays = podMaxAgingDays;
		this.podMultiDueDates = podMultiDueDates;
		this.oidPodDet = oidPodDet;
	}

	/** full constructor */
	public AbstractPodDet(PodDetId id, Date podDueDate, String podPart,
			Double podQtyOrd, Double podQtyRcvd, Double podPurCost,
			Double podStdCost, String podSoJob, Double podQtyChg,
			Double podCostChg, Double podBoChg, String podAcct,
			Date podPerDate, String podType, Boolean podInspRqd,
			String podWoLot, String podVpart, Date podNeed, Boolean podTaxable,
			String podDesc, String podCc, String podQad04, String podUm,
			Double podDiscPct, String podReqNbr, String podQad10,
			Double podUmConv, String podLoc, String podSerial, Integer podOp,
			String podContract, String podStatus, String podRev,
			Integer podCmtindx, Integer podReqLine, String podProject,
			Double podPsChg, Boolean podCstUp, String podRum, String podUser1,
			String podUser2, Boolean podVat, String podQad16, String podQad06,
			Boolean podPst, Boolean podQad13, String podQad07, String podPayUm,
			Double podPumConv, Boolean podQad15, String podSite,
			Double podRumConv, Double podQtyRtnd, String podBlanket,
			Integer podBlnktLn, Date podQad01, Integer podQad02,
			String podQad03, Boolean podQad05, Date podQad08, Integer podQad09,
			String podQad11, Boolean podQad12, Date podQad14,
			Integer podRelNbr, Double podRelQty, String podReason,
			String podRequest, String podApprove, String podChr01,
			String podChr02, String podChr03, String podChr04, String podChr05,
			String podChr06, String podChr07, String podChr08, String podChr09,
			String podChr10, Date podDte01, Date podDte02, Double podDec01,
			Double podDec02, Boolean podLog01, Double podTaxMax,
			String podCurrRlseId, Boolean podSched, String podCumQty,
			String podCumDate, String podContrId, String podAprCode,
			String podTaxc, String podRmaType, String podPoSite,
			String podPoDb, Integer podFirmWeeks, Double podMrpPct,
			Integer podRawWeeks, Integer podFabWeeks, Integer podShipWeeks,
			Integer podPlanWeeks, Double podTransltDays, String podFsmType,
			String podSdPat, String podSdTime, BigDecimal podOrdMult,
			String podPkgCode, Boolean podSchMrp, String podSchData,
			Integer podRlseNbr, Integer podPlanDays, Integer podPlanMths,
			Integer podFirmDays, String podStartEff, String podEndEff,
			Integer podRawDays, Integer podFabDays, String podTaxUsage,
			Boolean podTaxIn, Boolean podSchedChgd, String podPrList,
			String podDock, String podPastdue, Boolean podFixPr,
			String podDrpRef, String podTaxEnv, Double podCrtInt,
			String podFrList, Double podTransltHrs, Double podSftyltDays,
			Double podSftyltHrs, String podLotNext, Boolean podLotRcpt,
			String podGrade, Date podExpire, String podRctstat,
			Double podAssay, Boolean podRctstatActive, Date podPricingDt,
			Integer podPrLstTp, Integer podErsOpt, Double podQadd01,
			Double podQadd02, Double podQadd03, Integer podSodLine,
			String podSoStatus, Date podSubShipDate, String podSubType,
			String podSub, String podWipLotser, Integer podPjsLine,
			Boolean podConsignment, Integer podMaxAgingDays,
			Boolean podMultiDueDates, Double oidPodDet) {
		this.id = id;
		this.podDueDate = podDueDate;
		this.podPart = podPart;
		this.podQtyOrd = podQtyOrd;
		this.podQtyRcvd = podQtyRcvd;
		this.podPurCost = podPurCost;
		this.podStdCost = podStdCost;
		this.podSoJob = podSoJob;
		this.podQtyChg = podQtyChg;
		this.podCostChg = podCostChg;
		this.podBoChg = podBoChg;
		this.podAcct = podAcct;
		this.podPerDate = podPerDate;
		this.podType = podType;
		this.podInspRqd = podInspRqd;
		this.podWoLot = podWoLot;
		this.podVpart = podVpart;
		this.podNeed = podNeed;
		this.podTaxable = podTaxable;
		this.podDesc = podDesc;
		this.podCc = podCc;
		this.podQad04 = podQad04;
		this.podUm = podUm;
		this.podDiscPct = podDiscPct;
		this.podReqNbr = podReqNbr;
		this.podQad10 = podQad10;
		this.podUmConv = podUmConv;
		this.podLoc = podLoc;
		this.podSerial = podSerial;
		this.podOp = podOp;
		this.podContract = podContract;
		this.podStatus = podStatus;
		this.podRev = podRev;
		this.podCmtindx = podCmtindx;
		this.podReqLine = podReqLine;
		this.podProject = podProject;
		this.podPsChg = podPsChg;
		this.podCstUp = podCstUp;
		this.podRum = podRum;
		this.podUser1 = podUser1;
		this.podUser2 = podUser2;
		this.podVat = podVat;
		this.podQad16 = podQad16;
		this.podQad06 = podQad06;
		this.podPst = podPst;
		this.podQad13 = podQad13;
		this.podQad07 = podQad07;
		this.podPayUm = podPayUm;
		this.podPumConv = podPumConv;
		this.podQad15 = podQad15;
		this.podSite = podSite;
		this.podRumConv = podRumConv;
		this.podQtyRtnd = podQtyRtnd;
		this.podBlanket = podBlanket;
		this.podBlnktLn = podBlnktLn;
		this.podQad01 = podQad01;
		this.podQad02 = podQad02;
		this.podQad03 = podQad03;
		this.podQad05 = podQad05;
		this.podQad08 = podQad08;
		this.podQad09 = podQad09;
		this.podQad11 = podQad11;
		this.podQad12 = podQad12;
		this.podQad14 = podQad14;
		this.podRelNbr = podRelNbr;
		this.podRelQty = podRelQty;
		this.podReason = podReason;
		this.podRequest = podRequest;
		this.podApprove = podApprove;
		this.podChr01 = podChr01;
		this.podChr02 = podChr02;
		this.podChr03 = podChr03;
		this.podChr04 = podChr04;
		this.podChr05 = podChr05;
		this.podChr06 = podChr06;
		this.podChr07 = podChr07;
		this.podChr08 = podChr08;
		this.podChr09 = podChr09;
		this.podChr10 = podChr10;
		this.podDte01 = podDte01;
		this.podDte02 = podDte02;
		this.podDec01 = podDec01;
		this.podDec02 = podDec02;
		this.podLog01 = podLog01;
		this.podTaxMax = podTaxMax;
		this.podCurrRlseId = podCurrRlseId;
		this.podSched = podSched;
		this.podCumQty = podCumQty;
		this.podCumDate = podCumDate;
		this.podContrId = podContrId;
		this.podAprCode = podAprCode;
		this.podTaxc = podTaxc;
		this.podRmaType = podRmaType;
		this.podPoSite = podPoSite;
		this.podPoDb = podPoDb;
		this.podFirmWeeks = podFirmWeeks;
		this.podMrpPct = podMrpPct;
		this.podRawWeeks = podRawWeeks;
		this.podFabWeeks = podFabWeeks;
		this.podShipWeeks = podShipWeeks;
		this.podPlanWeeks = podPlanWeeks;
		this.podTransltDays = podTransltDays;
		this.podFsmType = podFsmType;
		this.podSdPat = podSdPat;
		this.podSdTime = podSdTime;
		this.podOrdMult = podOrdMult;
		this.podPkgCode = podPkgCode;
		this.podSchMrp = podSchMrp;
		this.podSchData = podSchData;
		this.podRlseNbr = podRlseNbr;
		this.podPlanDays = podPlanDays;
		this.podPlanMths = podPlanMths;
		this.podFirmDays = podFirmDays;
		this.podStartEff = podStartEff;
		this.podEndEff = podEndEff;
		this.podRawDays = podRawDays;
		this.podFabDays = podFabDays;
		this.podTaxUsage = podTaxUsage;
		this.podTaxIn = podTaxIn;
		this.podSchedChgd = podSchedChgd;
		this.podPrList = podPrList;
		this.podDock = podDock;
		this.podPastdue = podPastdue;
		this.podFixPr = podFixPr;
		this.podDrpRef = podDrpRef;
		this.podTaxEnv = podTaxEnv;
		this.podCrtInt = podCrtInt;
		this.podFrList = podFrList;
		this.podTransltHrs = podTransltHrs;
		this.podSftyltDays = podSftyltDays;
		this.podSftyltHrs = podSftyltHrs;
		this.podLotNext = podLotNext;
		this.podLotRcpt = podLotRcpt;
		this.podGrade = podGrade;
		this.podExpire = podExpire;
		this.podRctstat = podRctstat;
		this.podAssay = podAssay;
		this.podRctstatActive = podRctstatActive;
		this.podPricingDt = podPricingDt;
		this.podPrLstTp = podPrLstTp;
		this.podErsOpt = podErsOpt;
		this.podQadd01 = podQadd01;
		this.podQadd02 = podQadd02;
		this.podQadd03 = podQadd03;
		this.podSodLine = podSodLine;
		this.podSoStatus = podSoStatus;
		this.podSubShipDate = podSubShipDate;
		this.podSubType = podSubType;
		this.podSub = podSub;
		this.podWipLotser = podWipLotser;
		this.podPjsLine = podPjsLine;
		this.podConsignment = podConsignment;
		this.podMaxAgingDays = podMaxAgingDays;
		this.podMultiDueDates = podMultiDueDates;
		this.oidPodDet = oidPodDet;
	}

	// Property accessors

	public PodDetId getId() {
		return this.id;
	}

	public void setId(PodDetId id) {
		this.id = id;
	}

	public Date getPodDueDate() {
		return this.podDueDate;
	}

	public void setPodDueDate(Date podDueDate) {
		this.podDueDate = podDueDate;
	}

	public String getPodPart() {
		return this.podPart;
	}

	public void setPodPart(String podPart) {
		this.podPart = podPart;
	}

	public Double getPodQtyOrd() {
		return this.podQtyOrd;
	}

	public void setPodQtyOrd(Double podQtyOrd) {
		this.podQtyOrd = podQtyOrd;
	}

	public Double getPodQtyRcvd() {
		return this.podQtyRcvd;
	}

	public void setPodQtyRcvd(Double podQtyRcvd) {
		this.podQtyRcvd = podQtyRcvd;
	}

	public Double getPodPurCost() {
		return this.podPurCost;
	}

	public void setPodPurCost(Double podPurCost) {
		this.podPurCost = podPurCost;
	}

	public Double getPodStdCost() {
		return this.podStdCost;
	}

	public void setPodStdCost(Double podStdCost) {
		this.podStdCost = podStdCost;
	}

	public String getPodSoJob() {
		return this.podSoJob;
	}

	public void setPodSoJob(String podSoJob) {
		this.podSoJob = podSoJob;
	}

	public Double getPodQtyChg() {
		return this.podQtyChg;
	}

	public void setPodQtyChg(Double podQtyChg) {
		this.podQtyChg = podQtyChg;
	}

	public Double getPodCostChg() {
		return this.podCostChg;
	}

	public void setPodCostChg(Double podCostChg) {
		this.podCostChg = podCostChg;
	}

	public Double getPodBoChg() {
		return this.podBoChg;
	}

	public void setPodBoChg(Double podBoChg) {
		this.podBoChg = podBoChg;
	}

	public String getPodAcct() {
		return this.podAcct;
	}

	public void setPodAcct(String podAcct) {
		this.podAcct = podAcct;
	}

	public Date getPodPerDate() {
		return this.podPerDate;
	}

	public void setPodPerDate(Date podPerDate) {
		this.podPerDate = podPerDate;
	}

	public String getPodType() {
		return this.podType;
	}

	public void setPodType(String podType) {
		this.podType = podType;
	}

	public Boolean getPodInspRqd() {
		return this.podInspRqd;
	}

	public void setPodInspRqd(Boolean podInspRqd) {
		this.podInspRqd = podInspRqd;
	}

	public String getPodWoLot() {
		return this.podWoLot;
	}

	public void setPodWoLot(String podWoLot) {
		this.podWoLot = podWoLot;
	}

	public String getPodVpart() {
		return this.podVpart;
	}

	public void setPodVpart(String podVpart) {
		this.podVpart = podVpart;
	}

	public Date getPodNeed() {
		return this.podNeed;
	}

	public void setPodNeed(Date podNeed) {
		this.podNeed = podNeed;
	}

	public Boolean getPodTaxable() {
		return this.podTaxable;
	}

	public void setPodTaxable(Boolean podTaxable) {
		this.podTaxable = podTaxable;
	}

	public String getPodDesc() {
		return this.podDesc;
	}

	public void setPodDesc(String podDesc) {
		this.podDesc = podDesc;
	}

	public String getPodCc() {
		return this.podCc;
	}

	public void setPodCc(String podCc) {
		this.podCc = podCc;
	}

	public String getPodQad04() {
		return this.podQad04;
	}

	public void setPodQad04(String podQad04) {
		this.podQad04 = podQad04;
	}

	public String getPodUm() {
		return this.podUm;
	}

	public void setPodUm(String podUm) {
		this.podUm = podUm;
	}

	public Double getPodDiscPct() {
		return this.podDiscPct;
	}

	public void setPodDiscPct(Double podDiscPct) {
		this.podDiscPct = podDiscPct;
	}

	public String getPodReqNbr() {
		return this.podReqNbr;
	}

	public void setPodReqNbr(String podReqNbr) {
		this.podReqNbr = podReqNbr;
	}

	public String getPodQad10() {
		return this.podQad10;
	}

	public void setPodQad10(String podQad10) {
		this.podQad10 = podQad10;
	}

	public Double getPodUmConv() {
		return this.podUmConv;
	}

	public void setPodUmConv(Double podUmConv) {
		this.podUmConv = podUmConv;
	}

	public String getPodLoc() {
		return this.podLoc;
	}

	public void setPodLoc(String podLoc) {
		this.podLoc = podLoc;
	}

	public String getPodSerial() {
		return this.podSerial;
	}

	public void setPodSerial(String podSerial) {
		this.podSerial = podSerial;
	}

	public Integer getPodOp() {
		return this.podOp;
	}

	public void setPodOp(Integer podOp) {
		this.podOp = podOp;
	}

	public String getPodContract() {
		return this.podContract;
	}

	public void setPodContract(String podContract) {
		this.podContract = podContract;
	}

	public String getPodStatus() {
		return this.podStatus;
	}

	public void setPodStatus(String podStatus) {
		this.podStatus = podStatus;
	}

	public String getPodRev() {
		return this.podRev;
	}

	public void setPodRev(String podRev) {
		this.podRev = podRev;
	}

	public Integer getPodCmtindx() {
		return this.podCmtindx;
	}

	public void setPodCmtindx(Integer podCmtindx) {
		this.podCmtindx = podCmtindx;
	}

	public Integer getPodReqLine() {
		return this.podReqLine;
	}

	public void setPodReqLine(Integer podReqLine) {
		this.podReqLine = podReqLine;
	}

	public String getPodProject() {
		return this.podProject;
	}

	public void setPodProject(String podProject) {
		this.podProject = podProject;
	}

	public Double getPodPsChg() {
		return this.podPsChg;
	}

	public void setPodPsChg(Double podPsChg) {
		this.podPsChg = podPsChg;
	}

	public Boolean getPodCstUp() {
		return this.podCstUp;
	}

	public void setPodCstUp(Boolean podCstUp) {
		this.podCstUp = podCstUp;
	}

	public String getPodRum() {
		return this.podRum;
	}

	public void setPodRum(String podRum) {
		this.podRum = podRum;
	}

	public String getPodUser1() {
		return this.podUser1;
	}

	public void setPodUser1(String podUser1) {
		this.podUser1 = podUser1;
	}

	public String getPodUser2() {
		return this.podUser2;
	}

	public void setPodUser2(String podUser2) {
		this.podUser2 = podUser2;
	}

	public Boolean getPodVat() {
		return this.podVat;
	}

	public void setPodVat(Boolean podVat) {
		this.podVat = podVat;
	}

	public String getPodQad16() {
		return this.podQad16;
	}

	public void setPodQad16(String podQad16) {
		this.podQad16 = podQad16;
	}

	public String getPodQad06() {
		return this.podQad06;
	}

	public void setPodQad06(String podQad06) {
		this.podQad06 = podQad06;
	}

	public Boolean getPodPst() {
		return this.podPst;
	}

	public void setPodPst(Boolean podPst) {
		this.podPst = podPst;
	}

	public Boolean getPodQad13() {
		return this.podQad13;
	}

	public void setPodQad13(Boolean podQad13) {
		this.podQad13 = podQad13;
	}

	public String getPodQad07() {
		return this.podQad07;
	}

	public void setPodQad07(String podQad07) {
		this.podQad07 = podQad07;
	}

	public String getPodPayUm() {
		return this.podPayUm;
	}

	public void setPodPayUm(String podPayUm) {
		this.podPayUm = podPayUm;
	}

	public Double getPodPumConv() {
		return this.podPumConv;
	}

	public void setPodPumConv(Double podPumConv) {
		this.podPumConv = podPumConv;
	}

	public Boolean getPodQad15() {
		return this.podQad15;
	}

	public void setPodQad15(Boolean podQad15) {
		this.podQad15 = podQad15;
	}

	public String getPodSite() {
		return this.podSite;
	}

	public void setPodSite(String podSite) {
		this.podSite = podSite;
	}

	public Double getPodRumConv() {
		return this.podRumConv;
	}

	public void setPodRumConv(Double podRumConv) {
		this.podRumConv = podRumConv;
	}

	public Double getPodQtyRtnd() {
		return this.podQtyRtnd;
	}

	public void setPodQtyRtnd(Double podQtyRtnd) {
		this.podQtyRtnd = podQtyRtnd;
	}

	public String getPodBlanket() {
		return this.podBlanket;
	}

	public void setPodBlanket(String podBlanket) {
		this.podBlanket = podBlanket;
	}

	public Integer getPodBlnktLn() {
		return this.podBlnktLn;
	}

	public void setPodBlnktLn(Integer podBlnktLn) {
		this.podBlnktLn = podBlnktLn;
	}

	public Date getPodQad01() {
		return this.podQad01;
	}

	public void setPodQad01(Date podQad01) {
		this.podQad01 = podQad01;
	}

	public Integer getPodQad02() {
		return this.podQad02;
	}

	public void setPodQad02(Integer podQad02) {
		this.podQad02 = podQad02;
	}

	public String getPodQad03() {
		return this.podQad03;
	}

	public void setPodQad03(String podQad03) {
		this.podQad03 = podQad03;
	}

	public Boolean getPodQad05() {
		return this.podQad05;
	}

	public void setPodQad05(Boolean podQad05) {
		this.podQad05 = podQad05;
	}

	public Date getPodQad08() {
		return this.podQad08;
	}

	public void setPodQad08(Date podQad08) {
		this.podQad08 = podQad08;
	}

	public Integer getPodQad09() {
		return this.podQad09;
	}

	public void setPodQad09(Integer podQad09) {
		this.podQad09 = podQad09;
	}

	public String getPodQad11() {
		return this.podQad11;
	}

	public void setPodQad11(String podQad11) {
		this.podQad11 = podQad11;
	}

	public Boolean getPodQad12() {
		return this.podQad12;
	}

	public void setPodQad12(Boolean podQad12) {
		this.podQad12 = podQad12;
	}

	public Date getPodQad14() {
		return this.podQad14;
	}

	public void setPodQad14(Date podQad14) {
		this.podQad14 = podQad14;
	}

	public Integer getPodRelNbr() {
		return this.podRelNbr;
	}

	public void setPodRelNbr(Integer podRelNbr) {
		this.podRelNbr = podRelNbr;
	}

	public Double getPodRelQty() {
		return this.podRelQty;
	}

	public void setPodRelQty(Double podRelQty) {
		this.podRelQty = podRelQty;
	}

	public String getPodReason() {
		return this.podReason;
	}

	public void setPodReason(String podReason) {
		this.podReason = podReason;
	}

	public String getPodRequest() {
		return this.podRequest;
	}

	public void setPodRequest(String podRequest) {
		this.podRequest = podRequest;
	}

	public String getPodApprove() {
		return this.podApprove;
	}

	public void setPodApprove(String podApprove) {
		this.podApprove = podApprove;
	}

	public String getPodChr01() {
		return this.podChr01;
	}

	public void setPodChr01(String podChr01) {
		this.podChr01 = podChr01;
	}

	public String getPodChr02() {
		return this.podChr02;
	}

	public void setPodChr02(String podChr02) {
		this.podChr02 = podChr02;
	}

	public String getPodChr03() {
		return this.podChr03;
	}

	public void setPodChr03(String podChr03) {
		this.podChr03 = podChr03;
	}

	public String getPodChr04() {
		return this.podChr04;
	}

	public void setPodChr04(String podChr04) {
		this.podChr04 = podChr04;
	}

	public String getPodChr05() {
		return this.podChr05;
	}

	public void setPodChr05(String podChr05) {
		this.podChr05 = podChr05;
	}

	public String getPodChr06() {
		return this.podChr06;
	}

	public void setPodChr06(String podChr06) {
		this.podChr06 = podChr06;
	}

	public String getPodChr07() {
		return this.podChr07;
	}

	public void setPodChr07(String podChr07) {
		this.podChr07 = podChr07;
	}

	public String getPodChr08() {
		return this.podChr08;
	}

	public void setPodChr08(String podChr08) {
		this.podChr08 = podChr08;
	}

	public String getPodChr09() {
		return this.podChr09;
	}

	public void setPodChr09(String podChr09) {
		this.podChr09 = podChr09;
	}

	public String getPodChr10() {
		return this.podChr10;
	}

	public void setPodChr10(String podChr10) {
		this.podChr10 = podChr10;
	}

	public Date getPodDte01() {
		return this.podDte01;
	}

	public void setPodDte01(Date podDte01) {
		this.podDte01 = podDte01;
	}

	public Date getPodDte02() {
		return this.podDte02;
	}

	public void setPodDte02(Date podDte02) {
		this.podDte02 = podDte02;
	}

	public Double getPodDec01() {
		return this.podDec01;
	}

	public void setPodDec01(Double podDec01) {
		this.podDec01 = podDec01;
	}

	public Double getPodDec02() {
		return this.podDec02;
	}

	public void setPodDec02(Double podDec02) {
		this.podDec02 = podDec02;
	}

	public Boolean getPodLog01() {
		return this.podLog01;
	}

	public void setPodLog01(Boolean podLog01) {
		this.podLog01 = podLog01;
	}

	public Double getPodTaxMax() {
		return this.podTaxMax;
	}

	public void setPodTaxMax(Double podTaxMax) {
		this.podTaxMax = podTaxMax;
	}

	public String getPodCurrRlseId() {
		return this.podCurrRlseId;
	}

	public void setPodCurrRlseId(String podCurrRlseId) {
		this.podCurrRlseId = podCurrRlseId;
	}

	public Boolean getPodSched() {
		return this.podSched;
	}

	public void setPodSched(Boolean podSched) {
		this.podSched = podSched;
	}

	public String getPodCumQty() {
		return this.podCumQty;
	}

	public void setPodCumQty(String podCumQty) {
		this.podCumQty = podCumQty;
	}

	public String getPodCumDate() {
		return this.podCumDate;
	}

	public void setPodCumDate(String podCumDate) {
		this.podCumDate = podCumDate;
	}

	public String getPodContrId() {
		return this.podContrId;
	}

	public void setPodContrId(String podContrId) {
		this.podContrId = podContrId;
	}

	public String getPodAprCode() {
		return this.podAprCode;
	}

	public void setPodAprCode(String podAprCode) {
		this.podAprCode = podAprCode;
	}

	public String getPodTaxc() {
		return this.podTaxc;
	}

	public void setPodTaxc(String podTaxc) {
		this.podTaxc = podTaxc;
	}

	public String getPodRmaType() {
		return this.podRmaType;
	}

	public void setPodRmaType(String podRmaType) {
		this.podRmaType = podRmaType;
	}

	public String getPodPoSite() {
		return this.podPoSite;
	}

	public void setPodPoSite(String podPoSite) {
		this.podPoSite = podPoSite;
	}

	public String getPodPoDb() {
		return this.podPoDb;
	}

	public void setPodPoDb(String podPoDb) {
		this.podPoDb = podPoDb;
	}

	public Integer getPodFirmWeeks() {
		return this.podFirmWeeks;
	}

	public void setPodFirmWeeks(Integer podFirmWeeks) {
		this.podFirmWeeks = podFirmWeeks;
	}

	public Double getPodMrpPct() {
		return this.podMrpPct;
	}

	public void setPodMrpPct(Double podMrpPct) {
		this.podMrpPct = podMrpPct;
	}

	public Integer getPodRawWeeks() {
		return this.podRawWeeks;
	}

	public void setPodRawWeeks(Integer podRawWeeks) {
		this.podRawWeeks = podRawWeeks;
	}

	public Integer getPodFabWeeks() {
		return this.podFabWeeks;
	}

	public void setPodFabWeeks(Integer podFabWeeks) {
		this.podFabWeeks = podFabWeeks;
	}

	public Integer getPodShipWeeks() {
		return this.podShipWeeks;
	}

	public void setPodShipWeeks(Integer podShipWeeks) {
		this.podShipWeeks = podShipWeeks;
	}

	public Integer getPodPlanWeeks() {
		return this.podPlanWeeks;
	}

	public void setPodPlanWeeks(Integer podPlanWeeks) {
		this.podPlanWeeks = podPlanWeeks;
	}

	public Double getPodTransltDays() {
		return this.podTransltDays;
	}

	public void setPodTransltDays(Double podTransltDays) {
		this.podTransltDays = podTransltDays;
	}

	public String getPodFsmType() {
		return this.podFsmType;
	}

	public void setPodFsmType(String podFsmType) {
		this.podFsmType = podFsmType;
	}

	public String getPodSdPat() {
		return this.podSdPat;
	}

	public void setPodSdPat(String podSdPat) {
		this.podSdPat = podSdPat;
	}

	public String getPodSdTime() {
		return this.podSdTime;
	}

	public void setPodSdTime(String podSdTime) {
		this.podSdTime = podSdTime;
	}

	public BigDecimal getPodOrdMult() {
		return this.podOrdMult;
	}

	public void setPodOrdMult(BigDecimal podOrdMult) {
		this.podOrdMult = podOrdMult;
	}

	public String getPodPkgCode() {
		return this.podPkgCode;
	}

	public void setPodPkgCode(String podPkgCode) {
		this.podPkgCode = podPkgCode;
	}

	public Boolean getPodSchMrp() {
		return this.podSchMrp;
	}

	public void setPodSchMrp(Boolean podSchMrp) {
		this.podSchMrp = podSchMrp;
	}

	public String getPodSchData() {
		return this.podSchData;
	}

	public void setPodSchData(String podSchData) {
		this.podSchData = podSchData;
	}

	public Integer getPodRlseNbr() {
		return this.podRlseNbr;
	}

	public void setPodRlseNbr(Integer podRlseNbr) {
		this.podRlseNbr = podRlseNbr;
	}

	public Integer getPodPlanDays() {
		return this.podPlanDays;
	}

	public void setPodPlanDays(Integer podPlanDays) {
		this.podPlanDays = podPlanDays;
	}

	public Integer getPodPlanMths() {
		return this.podPlanMths;
	}

	public void setPodPlanMths(Integer podPlanMths) {
		this.podPlanMths = podPlanMths;
	}

	public Integer getPodFirmDays() {
		return this.podFirmDays;
	}

	public void setPodFirmDays(Integer podFirmDays) {
		this.podFirmDays = podFirmDays;
	}

	public String getPodStartEff() {
		return this.podStartEff;
	}

	public void setPodStartEff(String podStartEff) {
		this.podStartEff = podStartEff;
	}

	public String getPodEndEff() {
		return this.podEndEff;
	}

	public void setPodEndEff(String podEndEff) {
		this.podEndEff = podEndEff;
	}

	public Integer getPodRawDays() {
		return this.podRawDays;
	}

	public void setPodRawDays(Integer podRawDays) {
		this.podRawDays = podRawDays;
	}

	public Integer getPodFabDays() {
		return this.podFabDays;
	}

	public void setPodFabDays(Integer podFabDays) {
		this.podFabDays = podFabDays;
	}

	public String getPodTaxUsage() {
		return this.podTaxUsage;
	}

	public void setPodTaxUsage(String podTaxUsage) {
		this.podTaxUsage = podTaxUsage;
	}

	public Boolean getPodTaxIn() {
		return this.podTaxIn;
	}

	public void setPodTaxIn(Boolean podTaxIn) {
		this.podTaxIn = podTaxIn;
	}

	public Boolean getPodSchedChgd() {
		return this.podSchedChgd;
	}

	public void setPodSchedChgd(Boolean podSchedChgd) {
		this.podSchedChgd = podSchedChgd;
	}

	public String getPodPrList() {
		return this.podPrList;
	}

	public void setPodPrList(String podPrList) {
		this.podPrList = podPrList;
	}

	public String getPodDock() {
		return this.podDock;
	}

	public void setPodDock(String podDock) {
		this.podDock = podDock;
	}

	public String getPodPastdue() {
		return this.podPastdue;
	}

	public void setPodPastdue(String podPastdue) {
		this.podPastdue = podPastdue;
	}

	public Boolean getPodFixPr() {
		return this.podFixPr;
	}

	public void setPodFixPr(Boolean podFixPr) {
		this.podFixPr = podFixPr;
	}

	public String getPodDrpRef() {
		return this.podDrpRef;
	}

	public void setPodDrpRef(String podDrpRef) {
		this.podDrpRef = podDrpRef;
	}

	public String getPodTaxEnv() {
		return this.podTaxEnv;
	}

	public void setPodTaxEnv(String podTaxEnv) {
		this.podTaxEnv = podTaxEnv;
	}

	public Double getPodCrtInt() {
		return this.podCrtInt;
	}

	public void setPodCrtInt(Double podCrtInt) {
		this.podCrtInt = podCrtInt;
	}

	public String getPodFrList() {
		return this.podFrList;
	}

	public void setPodFrList(String podFrList) {
		this.podFrList = podFrList;
	}

	public Double getPodTransltHrs() {
		return this.podTransltHrs;
	}

	public void setPodTransltHrs(Double podTransltHrs) {
		this.podTransltHrs = podTransltHrs;
	}

	public Double getPodSftyltDays() {
		return this.podSftyltDays;
	}

	public void setPodSftyltDays(Double podSftyltDays) {
		this.podSftyltDays = podSftyltDays;
	}

	public Double getPodSftyltHrs() {
		return this.podSftyltHrs;
	}

	public void setPodSftyltHrs(Double podSftyltHrs) {
		this.podSftyltHrs = podSftyltHrs;
	}

	public String getPodLotNext() {
		return this.podLotNext;
	}

	public void setPodLotNext(String podLotNext) {
		this.podLotNext = podLotNext;
	}

	public Boolean getPodLotRcpt() {
		return this.podLotRcpt;
	}

	public void setPodLotRcpt(Boolean podLotRcpt) {
		this.podLotRcpt = podLotRcpt;
	}

	public String getPodGrade() {
		return this.podGrade;
	}

	public void setPodGrade(String podGrade) {
		this.podGrade = podGrade;
	}

	public Date getPodExpire() {
		return this.podExpire;
	}

	public void setPodExpire(Date podExpire) {
		this.podExpire = podExpire;
	}

	public String getPodRctstat() {
		return this.podRctstat;
	}

	public void setPodRctstat(String podRctstat) {
		this.podRctstat = podRctstat;
	}

	public Double getPodAssay() {
		return this.podAssay;
	}

	public void setPodAssay(Double podAssay) {
		this.podAssay = podAssay;
	}

	public Boolean getPodRctstatActive() {
		return this.podRctstatActive;
	}

	public void setPodRctstatActive(Boolean podRctstatActive) {
		this.podRctstatActive = podRctstatActive;
	}

	public Date getPodPricingDt() {
		return this.podPricingDt;
	}

	public void setPodPricingDt(Date podPricingDt) {
		this.podPricingDt = podPricingDt;
	}

	public Integer getPodPrLstTp() {
		return this.podPrLstTp;
	}

	public void setPodPrLstTp(Integer podPrLstTp) {
		this.podPrLstTp = podPrLstTp;
	}

	public Integer getPodErsOpt() {
		return this.podErsOpt;
	}

	public void setPodErsOpt(Integer podErsOpt) {
		this.podErsOpt = podErsOpt;
	}

	public Double getPodQadd01() {
		return this.podQadd01;
	}

	public void setPodQadd01(Double podQadd01) {
		this.podQadd01 = podQadd01;
	}

	public Double getPodQadd02() {
		return this.podQadd02;
	}

	public void setPodQadd02(Double podQadd02) {
		this.podQadd02 = podQadd02;
	}

	public Double getPodQadd03() {
		return this.podQadd03;
	}

	public void setPodQadd03(Double podQadd03) {
		this.podQadd03 = podQadd03;
	}

	public Integer getPodSodLine() {
		return this.podSodLine;
	}

	public void setPodSodLine(Integer podSodLine) {
		this.podSodLine = podSodLine;
	}

	public String getPodSoStatus() {
		return this.podSoStatus;
	}

	public void setPodSoStatus(String podSoStatus) {
		this.podSoStatus = podSoStatus;
	}

	public Date getPodSubShipDate() {
		return this.podSubShipDate;
	}

	public void setPodSubShipDate(Date podSubShipDate) {
		this.podSubShipDate = podSubShipDate;
	}

	public String getPodSubType() {
		return this.podSubType;
	}

	public void setPodSubType(String podSubType) {
		this.podSubType = podSubType;
	}

	public String getPodSub() {
		return this.podSub;
	}

	public void setPodSub(String podSub) {
		this.podSub = podSub;
	}

	public String getPodWipLotser() {
		return this.podWipLotser;
	}

	public void setPodWipLotser(String podWipLotser) {
		this.podWipLotser = podWipLotser;
	}

	public Integer getPodPjsLine() {
		return this.podPjsLine;
	}

	public void setPodPjsLine(Integer podPjsLine) {
		this.podPjsLine = podPjsLine;
	}

	public Boolean getPodConsignment() {
		return this.podConsignment;
	}

	public void setPodConsignment(Boolean podConsignment) {
		this.podConsignment = podConsignment;
	}

	public Integer getPodMaxAgingDays() {
		return this.podMaxAgingDays;
	}

	public void setPodMaxAgingDays(Integer podMaxAgingDays) {
		this.podMaxAgingDays = podMaxAgingDays;
	}

	public Boolean getPodMultiDueDates() {
		return this.podMultiDueDates;
	}

	public void setPodMultiDueDates(Boolean podMultiDueDates) {
		this.podMultiDueDates = podMultiDueDates;
	}

	public Double getOidPodDet() {
		return this.oidPodDet;
	}

	public void setOidPodDet(Double oidPodDet) {
		this.oidPodDet = oidPodDet;
	}

}