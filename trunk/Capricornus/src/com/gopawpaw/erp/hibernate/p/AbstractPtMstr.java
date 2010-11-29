package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractPtMstr entity provides the base persistence definition of the PtMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtMstr implements java.io.Serializable {

	// Fields

	private PtMstrId id;
	private String ptDesc1;
	private String ptDesc2;
	private String ptUm;
	private String ptQad13;
	private Double ptQad12;
	private String ptDraw;
	private String ptProdLine;
	private String ptGroup;
	private String ptPartType;
	private String ptStatus;
	private String ptAbc;
	private Boolean ptIssPol;
	private Boolean ptPhantom;
	private String ptLoc;
	private Double ptQad01;
	private Double ptQad02;
	private Double ptAbcAmt;
	private Double ptQad03;
	private Double ptQad04;
	private Integer ptAvgInt;
	private Date ptQad05;
	private Integer ptCycInt;
	private Date ptQad06;
	private Date ptQad07;
	private Date ptQad08;
	private Boolean ptMs;
	private Boolean ptPlanOrd;
	private Boolean ptMrp;
	private String ptOrdPol;
	private Double ptOrdQty;
	private Integer ptOrdPer;
	private BigDecimal ptSftyStk;
	private BigDecimal ptSftyTime;
	private BigDecimal ptRop;
	private String ptBuyer;
	private String ptVend;
	private Double ptQad09;
	private String ptPmCode;
	private BigDecimal ptMfgLead;
	private Integer ptPurLead;
	private Boolean ptInspRqd;
	private Integer ptInspLead;
	private Integer ptCumLead;
	private BigDecimal ptOrdMin;
	private BigDecimal ptOrdMax;
	private BigDecimal ptOrdMult;
	private Double ptYieldPct;
	private BigDecimal ptQad16;
	private Double ptSetup;
	private Double ptSetupLl;
	private Double ptRunLl;
	private Double ptRun;
	private Double ptPrice;
	private Double ptXmtlTl;
	private Double ptXlbrTl;
	private Double ptXbdnTl;
	private Double ptXsubTl;
	private Double ptXmtlLl;
	private Double ptXlbrLl;
	private Double ptXbdnLl;
	private Double ptXsubLl;
	private Double ptXtotCur;
	private Date ptCurDate;
	private Double ptXmtlStdtl;
	private Double ptXlbrStdtl;
	private Double ptXbdnStdtl;
	private Double ptXsubStdtl;
	private Double ptXtotStd;
	private Date ptStdDate;
	private Integer ptLlCode;
	private Double ptAbcQty;
	private Double ptQad10;
	private Double ptQad11;
	private String ptRouting;
	private String ptLotSer;
	private Integer ptTimefence;
	private Double ptXmtlStdll;
	private Double ptXlbrStdll;
	private Double ptXbdnStdll;
	private Double ptXsubStdll;
	private String ptRev;
	private Date ptLastEco;
	private Boolean ptQad15;
	private Boolean ptQad17;
	private Integer ptQcLead;
	private Boolean ptAutoLot;
	private Double ptAssay;
	private Double ptBatch;
	private Date ptQad14;
	private String ptUser3;
	private String ptUser1;
	private String ptUser2;
	private Double ptNetWt;
	private String ptNetWtUm;
	private Double ptSize;
	private String ptSizeUm;
	private Boolean ptTaxable;
	private String ptTaxc;
	private Boolean ptRollup;
	private Double ptXovhLl;
	private Double ptXovhTl;
	private Double ptXovhStdll;
	private Double ptXovhStdtl;
	private String ptSite;
	private Integer ptShelflife;
	private Boolean ptCritical;
	private Boolean ptSnglLot;
	private String ptUpc;
	private String ptHazard;
	private Date ptAdded;
	private String ptChr01;
	private String ptChr02;
	private String ptChr03;
	private String ptChr04;
	private String ptChr05;
	private String ptChr06;
	private String ptChr07;
	private String ptChr08;
	private String ptChr09;
	private String ptChr10;
	private Date ptDte01;
	private Date ptDte02;
	private Double ptDec01;
	private Double ptDec02;
	private Boolean ptLog01;
	private Boolean ptLog02;
	private Double ptQad18;
	private Double ptQad21;
	private Double ptQad19;
	private Double ptQad20;
	private Double ptLength;
	private Double ptHeight;
	private Double ptWidth;
	private String ptDimUm;
	private String ptPkgCode;
	private String ptNetwork;
	private String ptFrClass;
	private String ptSpecHdlg;
	private String ptBomCode;
	private String ptLocType;
	private String ptTranstype;
	private String ptWarrCd;
	private Integer ptPvmDays;
	private Boolean ptIsb;
	private Double ptMttr;
	private Double ptMtbf;
	private String ptSvcType;
	private String ptSvcGroup;
	private Boolean ptVenWarr;
	private Boolean ptFru;
	private Double ptMfgMttr;
	private Double ptMfgMtbf;
	private Double ptSttr;
	private String ptOrigin;
	private String ptTariff;
	private String ptSysType;
	private Boolean ptInstCall;
	private String ptCover;
	private Boolean ptUnitIsb;
	private String ptArticle;
	private Integer ptLlDrp;
	private String ptPoSite;
	private Double ptShipWt;
	private String ptShipWtUm;
	private String ptUserid;
	private Date ptModDate;
	private Boolean ptQad26;
	private String ptCommCode;
	private Boolean ptQad22;
	private Boolean ptDea;
	private Boolean ptFormula;
	private Integer ptQad23;
	private Integer ptQad24;
	private Integer ptQad25;
	private Date ptObsDate;
	private String ptPvmBom;
	private String ptPvmRoute;
	private String ptPvmUm;
	private String ptRpBom;
	private String ptRpRoute;
	private String ptRpVendor;
	private String ptRctpoStatus;
	private String ptRollupId;
	private Double ptSpecGrav;
	private String ptJointType;
	private Double ptMfgPct;
	private Double ptPurPct;
	private Double ptDrpPct;
	private String ptPouCode;
	private Double ptWksAvg;
	private Double ptWksMax;
	private Double ptWksMin;
	private Integer ptPickLogic;
	private String ptFiscalClass;
	private String ptDsgnGrp;
	private String ptDrwgLoc;
	private String ptEcnRev;
	private String ptDrwgSize;
	private String ptModel;
	private Boolean ptRepairable;
	private String ptRctwoStatus;
	private Boolean ptRctpoActive;
	private String ptLotGrp;
	private Boolean ptRctwoActive;
	private String ptBreakCat;
	private String ptFscCode;
	private Boolean ptTraceActive;
	private Boolean ptTraceDetail;
	private Boolean ptPmMrp;
	private String ptInsCallType;
	private String ptInsBom;
	private String ptInsRoute;
	private String ptPromo;
	private Double ptMeterInterval;
	private String ptMeterUm;
	private Boolean ptWh;
	private String ptBtbType;
	private String ptCfgType;
	private String ptAppOwner;
	private Boolean ptOpYield;
	private String ptRunSeq1;
	private String ptRunSeq2;
	private String ptAtpEnforcement;
	private Boolean ptAtpFamily;
	private Double oidPtMstr;

	// Constructors

	/** default constructor */
	public AbstractPtMstr() {
	}

	/** minimal constructor */
	public AbstractPtMstr(PtMstrId id, String ptUm, String ptBomCode,
			String ptLocType, String ptTranstype, Integer ptLlDrp,
			String ptPromo, Boolean ptWh, String ptBtbType, String ptRunSeq1,
			String ptRunSeq2, String ptAtpEnforcement, Boolean ptAtpFamily,
			Double oidPtMstr) {
		this.id = id;
		this.ptUm = ptUm;
		this.ptBomCode = ptBomCode;
		this.ptLocType = ptLocType;
		this.ptTranstype = ptTranstype;
		this.ptLlDrp = ptLlDrp;
		this.ptPromo = ptPromo;
		this.ptWh = ptWh;
		this.ptBtbType = ptBtbType;
		this.ptRunSeq1 = ptRunSeq1;
		this.ptRunSeq2 = ptRunSeq2;
		this.ptAtpEnforcement = ptAtpEnforcement;
		this.ptAtpFamily = ptAtpFamily;
		this.oidPtMstr = oidPtMstr;
	}

	/** full constructor */
	public AbstractPtMstr(PtMstrId id, String ptDesc1, String ptDesc2,
			String ptUm, String ptQad13, Double ptQad12, String ptDraw,
			String ptProdLine, String ptGroup, String ptPartType,
			String ptStatus, String ptAbc, Boolean ptIssPol, Boolean ptPhantom,
			String ptLoc, Double ptQad01, Double ptQad02, Double ptAbcAmt,
			Double ptQad03, Double ptQad04, Integer ptAvgInt, Date ptQad05,
			Integer ptCycInt, Date ptQad06, Date ptQad07, Date ptQad08,
			Boolean ptMs, Boolean ptPlanOrd, Boolean ptMrp, String ptOrdPol,
			Double ptOrdQty, Integer ptOrdPer, BigDecimal ptSftyStk,
			BigDecimal ptSftyTime, BigDecimal ptRop, String ptBuyer,
			String ptVend, Double ptQad09, String ptPmCode,
			BigDecimal ptMfgLead, Integer ptPurLead, Boolean ptInspRqd,
			Integer ptInspLead, Integer ptCumLead, BigDecimal ptOrdMin,
			BigDecimal ptOrdMax, BigDecimal ptOrdMult, Double ptYieldPct,
			BigDecimal ptQad16, Double ptSetup, Double ptSetupLl,
			Double ptRunLl, Double ptRun, Double ptPrice, Double ptXmtlTl,
			Double ptXlbrTl, Double ptXbdnTl, Double ptXsubTl, Double ptXmtlLl,
			Double ptXlbrLl, Double ptXbdnLl, Double ptXsubLl,
			Double ptXtotCur, Date ptCurDate, Double ptXmtlStdtl,
			Double ptXlbrStdtl, Double ptXbdnStdtl, Double ptXsubStdtl,
			Double ptXtotStd, Date ptStdDate, Integer ptLlCode,
			Double ptAbcQty, Double ptQad10, Double ptQad11, String ptRouting,
			String ptLotSer, Integer ptTimefence, Double ptXmtlStdll,
			Double ptXlbrStdll, Double ptXbdnStdll, Double ptXsubStdll,
			String ptRev, Date ptLastEco, Boolean ptQad15, Boolean ptQad17,
			Integer ptQcLead, Boolean ptAutoLot, Double ptAssay,
			Double ptBatch, Date ptQad14, String ptUser3, String ptUser1,
			String ptUser2, Double ptNetWt, String ptNetWtUm, Double ptSize,
			String ptSizeUm, Boolean ptTaxable, String ptTaxc,
			Boolean ptRollup, Double ptXovhLl, Double ptXovhTl,
			Double ptXovhStdll, Double ptXovhStdtl, String ptSite,
			Integer ptShelflife, Boolean ptCritical, Boolean ptSnglLot,
			String ptUpc, String ptHazard, Date ptAdded, String ptChr01,
			String ptChr02, String ptChr03, String ptChr04, String ptChr05,
			String ptChr06, String ptChr07, String ptChr08, String ptChr09,
			String ptChr10, Date ptDte01, Date ptDte02, Double ptDec01,
			Double ptDec02, Boolean ptLog01, Boolean ptLog02, Double ptQad18,
			Double ptQad21, Double ptQad19, Double ptQad20, Double ptLength,
			Double ptHeight, Double ptWidth, String ptDimUm, String ptPkgCode,
			String ptNetwork, String ptFrClass, String ptSpecHdlg,
			String ptBomCode, String ptLocType, String ptTranstype,
			String ptWarrCd, Integer ptPvmDays, Boolean ptIsb, Double ptMttr,
			Double ptMtbf, String ptSvcType, String ptSvcGroup,
			Boolean ptVenWarr, Boolean ptFru, Double ptMfgMttr,
			Double ptMfgMtbf, Double ptSttr, String ptOrigin, String ptTariff,
			String ptSysType, Boolean ptInstCall, String ptCover,
			Boolean ptUnitIsb, String ptArticle, Integer ptLlDrp,
			String ptPoSite, Double ptShipWt, String ptShipWtUm,
			String ptUserid, Date ptModDate, Boolean ptQad26,
			String ptCommCode, Boolean ptQad22, Boolean ptDea,
			Boolean ptFormula, Integer ptQad23, Integer ptQad24,
			Integer ptQad25, Date ptObsDate, String ptPvmBom,
			String ptPvmRoute, String ptPvmUm, String ptRpBom,
			String ptRpRoute, String ptRpVendor, String ptRctpoStatus,
			String ptRollupId, Double ptSpecGrav, String ptJointType,
			Double ptMfgPct, Double ptPurPct, Double ptDrpPct,
			String ptPouCode, Double ptWksAvg, Double ptWksMax,
			Double ptWksMin, Integer ptPickLogic, String ptFiscalClass,
			String ptDsgnGrp, String ptDrwgLoc, String ptEcnRev,
			String ptDrwgSize, String ptModel, Boolean ptRepairable,
			String ptRctwoStatus, Boolean ptRctpoActive, String ptLotGrp,
			Boolean ptRctwoActive, String ptBreakCat, String ptFscCode,
			Boolean ptTraceActive, Boolean ptTraceDetail, Boolean ptPmMrp,
			String ptInsCallType, String ptInsBom, String ptInsRoute,
			String ptPromo, Double ptMeterInterval, String ptMeterUm,
			Boolean ptWh, String ptBtbType, String ptCfgType,
			String ptAppOwner, Boolean ptOpYield, String ptRunSeq1,
			String ptRunSeq2, String ptAtpEnforcement, Boolean ptAtpFamily,
			Double oidPtMstr) {
		this.id = id;
		this.ptDesc1 = ptDesc1;
		this.ptDesc2 = ptDesc2;
		this.ptUm = ptUm;
		this.ptQad13 = ptQad13;
		this.ptQad12 = ptQad12;
		this.ptDraw = ptDraw;
		this.ptProdLine = ptProdLine;
		this.ptGroup = ptGroup;
		this.ptPartType = ptPartType;
		this.ptStatus = ptStatus;
		this.ptAbc = ptAbc;
		this.ptIssPol = ptIssPol;
		this.ptPhantom = ptPhantom;
		this.ptLoc = ptLoc;
		this.ptQad01 = ptQad01;
		this.ptQad02 = ptQad02;
		this.ptAbcAmt = ptAbcAmt;
		this.ptQad03 = ptQad03;
		this.ptQad04 = ptQad04;
		this.ptAvgInt = ptAvgInt;
		this.ptQad05 = ptQad05;
		this.ptCycInt = ptCycInt;
		this.ptQad06 = ptQad06;
		this.ptQad07 = ptQad07;
		this.ptQad08 = ptQad08;
		this.ptMs = ptMs;
		this.ptPlanOrd = ptPlanOrd;
		this.ptMrp = ptMrp;
		this.ptOrdPol = ptOrdPol;
		this.ptOrdQty = ptOrdQty;
		this.ptOrdPer = ptOrdPer;
		this.ptSftyStk = ptSftyStk;
		this.ptSftyTime = ptSftyTime;
		this.ptRop = ptRop;
		this.ptBuyer = ptBuyer;
		this.ptVend = ptVend;
		this.ptQad09 = ptQad09;
		this.ptPmCode = ptPmCode;
		this.ptMfgLead = ptMfgLead;
		this.ptPurLead = ptPurLead;
		this.ptInspRqd = ptInspRqd;
		this.ptInspLead = ptInspLead;
		this.ptCumLead = ptCumLead;
		this.ptOrdMin = ptOrdMin;
		this.ptOrdMax = ptOrdMax;
		this.ptOrdMult = ptOrdMult;
		this.ptYieldPct = ptYieldPct;
		this.ptQad16 = ptQad16;
		this.ptSetup = ptSetup;
		this.ptSetupLl = ptSetupLl;
		this.ptRunLl = ptRunLl;
		this.ptRun = ptRun;
		this.ptPrice = ptPrice;
		this.ptXmtlTl = ptXmtlTl;
		this.ptXlbrTl = ptXlbrTl;
		this.ptXbdnTl = ptXbdnTl;
		this.ptXsubTl = ptXsubTl;
		this.ptXmtlLl = ptXmtlLl;
		this.ptXlbrLl = ptXlbrLl;
		this.ptXbdnLl = ptXbdnLl;
		this.ptXsubLl = ptXsubLl;
		this.ptXtotCur = ptXtotCur;
		this.ptCurDate = ptCurDate;
		this.ptXmtlStdtl = ptXmtlStdtl;
		this.ptXlbrStdtl = ptXlbrStdtl;
		this.ptXbdnStdtl = ptXbdnStdtl;
		this.ptXsubStdtl = ptXsubStdtl;
		this.ptXtotStd = ptXtotStd;
		this.ptStdDate = ptStdDate;
		this.ptLlCode = ptLlCode;
		this.ptAbcQty = ptAbcQty;
		this.ptQad10 = ptQad10;
		this.ptQad11 = ptQad11;
		this.ptRouting = ptRouting;
		this.ptLotSer = ptLotSer;
		this.ptTimefence = ptTimefence;
		this.ptXmtlStdll = ptXmtlStdll;
		this.ptXlbrStdll = ptXlbrStdll;
		this.ptXbdnStdll = ptXbdnStdll;
		this.ptXsubStdll = ptXsubStdll;
		this.ptRev = ptRev;
		this.ptLastEco = ptLastEco;
		this.ptQad15 = ptQad15;
		this.ptQad17 = ptQad17;
		this.ptQcLead = ptQcLead;
		this.ptAutoLot = ptAutoLot;
		this.ptAssay = ptAssay;
		this.ptBatch = ptBatch;
		this.ptQad14 = ptQad14;
		this.ptUser3 = ptUser3;
		this.ptUser1 = ptUser1;
		this.ptUser2 = ptUser2;
		this.ptNetWt = ptNetWt;
		this.ptNetWtUm = ptNetWtUm;
		this.ptSize = ptSize;
		this.ptSizeUm = ptSizeUm;
		this.ptTaxable = ptTaxable;
		this.ptTaxc = ptTaxc;
		this.ptRollup = ptRollup;
		this.ptXovhLl = ptXovhLl;
		this.ptXovhTl = ptXovhTl;
		this.ptXovhStdll = ptXovhStdll;
		this.ptXovhStdtl = ptXovhStdtl;
		this.ptSite = ptSite;
		this.ptShelflife = ptShelflife;
		this.ptCritical = ptCritical;
		this.ptSnglLot = ptSnglLot;
		this.ptUpc = ptUpc;
		this.ptHazard = ptHazard;
		this.ptAdded = ptAdded;
		this.ptChr01 = ptChr01;
		this.ptChr02 = ptChr02;
		this.ptChr03 = ptChr03;
		this.ptChr04 = ptChr04;
		this.ptChr05 = ptChr05;
		this.ptChr06 = ptChr06;
		this.ptChr07 = ptChr07;
		this.ptChr08 = ptChr08;
		this.ptChr09 = ptChr09;
		this.ptChr10 = ptChr10;
		this.ptDte01 = ptDte01;
		this.ptDte02 = ptDte02;
		this.ptDec01 = ptDec01;
		this.ptDec02 = ptDec02;
		this.ptLog01 = ptLog01;
		this.ptLog02 = ptLog02;
		this.ptQad18 = ptQad18;
		this.ptQad21 = ptQad21;
		this.ptQad19 = ptQad19;
		this.ptQad20 = ptQad20;
		this.ptLength = ptLength;
		this.ptHeight = ptHeight;
		this.ptWidth = ptWidth;
		this.ptDimUm = ptDimUm;
		this.ptPkgCode = ptPkgCode;
		this.ptNetwork = ptNetwork;
		this.ptFrClass = ptFrClass;
		this.ptSpecHdlg = ptSpecHdlg;
		this.ptBomCode = ptBomCode;
		this.ptLocType = ptLocType;
		this.ptTranstype = ptTranstype;
		this.ptWarrCd = ptWarrCd;
		this.ptPvmDays = ptPvmDays;
		this.ptIsb = ptIsb;
		this.ptMttr = ptMttr;
		this.ptMtbf = ptMtbf;
		this.ptSvcType = ptSvcType;
		this.ptSvcGroup = ptSvcGroup;
		this.ptVenWarr = ptVenWarr;
		this.ptFru = ptFru;
		this.ptMfgMttr = ptMfgMttr;
		this.ptMfgMtbf = ptMfgMtbf;
		this.ptSttr = ptSttr;
		this.ptOrigin = ptOrigin;
		this.ptTariff = ptTariff;
		this.ptSysType = ptSysType;
		this.ptInstCall = ptInstCall;
		this.ptCover = ptCover;
		this.ptUnitIsb = ptUnitIsb;
		this.ptArticle = ptArticle;
		this.ptLlDrp = ptLlDrp;
		this.ptPoSite = ptPoSite;
		this.ptShipWt = ptShipWt;
		this.ptShipWtUm = ptShipWtUm;
		this.ptUserid = ptUserid;
		this.ptModDate = ptModDate;
		this.ptQad26 = ptQad26;
		this.ptCommCode = ptCommCode;
		this.ptQad22 = ptQad22;
		this.ptDea = ptDea;
		this.ptFormula = ptFormula;
		this.ptQad23 = ptQad23;
		this.ptQad24 = ptQad24;
		this.ptQad25 = ptQad25;
		this.ptObsDate = ptObsDate;
		this.ptPvmBom = ptPvmBom;
		this.ptPvmRoute = ptPvmRoute;
		this.ptPvmUm = ptPvmUm;
		this.ptRpBom = ptRpBom;
		this.ptRpRoute = ptRpRoute;
		this.ptRpVendor = ptRpVendor;
		this.ptRctpoStatus = ptRctpoStatus;
		this.ptRollupId = ptRollupId;
		this.ptSpecGrav = ptSpecGrav;
		this.ptJointType = ptJointType;
		this.ptMfgPct = ptMfgPct;
		this.ptPurPct = ptPurPct;
		this.ptDrpPct = ptDrpPct;
		this.ptPouCode = ptPouCode;
		this.ptWksAvg = ptWksAvg;
		this.ptWksMax = ptWksMax;
		this.ptWksMin = ptWksMin;
		this.ptPickLogic = ptPickLogic;
		this.ptFiscalClass = ptFiscalClass;
		this.ptDsgnGrp = ptDsgnGrp;
		this.ptDrwgLoc = ptDrwgLoc;
		this.ptEcnRev = ptEcnRev;
		this.ptDrwgSize = ptDrwgSize;
		this.ptModel = ptModel;
		this.ptRepairable = ptRepairable;
		this.ptRctwoStatus = ptRctwoStatus;
		this.ptRctpoActive = ptRctpoActive;
		this.ptLotGrp = ptLotGrp;
		this.ptRctwoActive = ptRctwoActive;
		this.ptBreakCat = ptBreakCat;
		this.ptFscCode = ptFscCode;
		this.ptTraceActive = ptTraceActive;
		this.ptTraceDetail = ptTraceDetail;
		this.ptPmMrp = ptPmMrp;
		this.ptInsCallType = ptInsCallType;
		this.ptInsBom = ptInsBom;
		this.ptInsRoute = ptInsRoute;
		this.ptPromo = ptPromo;
		this.ptMeterInterval = ptMeterInterval;
		this.ptMeterUm = ptMeterUm;
		this.ptWh = ptWh;
		this.ptBtbType = ptBtbType;
		this.ptCfgType = ptCfgType;
		this.ptAppOwner = ptAppOwner;
		this.ptOpYield = ptOpYield;
		this.ptRunSeq1 = ptRunSeq1;
		this.ptRunSeq2 = ptRunSeq2;
		this.ptAtpEnforcement = ptAtpEnforcement;
		this.ptAtpFamily = ptAtpFamily;
		this.oidPtMstr = oidPtMstr;
	}

	// Property accessors

	public PtMstrId getId() {
		return this.id;
	}

	public void setId(PtMstrId id) {
		this.id = id;
	}

	public String getPtDesc1() {
		return this.ptDesc1;
	}

	public void setPtDesc1(String ptDesc1) {
		this.ptDesc1 = ptDesc1;
	}

	public String getPtDesc2() {
		return this.ptDesc2;
	}

	public void setPtDesc2(String ptDesc2) {
		this.ptDesc2 = ptDesc2;
	}

	public String getPtUm() {
		return this.ptUm;
	}

	public void setPtUm(String ptUm) {
		this.ptUm = ptUm;
	}

	public String getPtQad13() {
		return this.ptQad13;
	}

	public void setPtQad13(String ptQad13) {
		this.ptQad13 = ptQad13;
	}

	public Double getPtQad12() {
		return this.ptQad12;
	}

	public void setPtQad12(Double ptQad12) {
		this.ptQad12 = ptQad12;
	}

	public String getPtDraw() {
		return this.ptDraw;
	}

	public void setPtDraw(String ptDraw) {
		this.ptDraw = ptDraw;
	}

	public String getPtProdLine() {
		return this.ptProdLine;
	}

	public void setPtProdLine(String ptProdLine) {
		this.ptProdLine = ptProdLine;
	}

	public String getPtGroup() {
		return this.ptGroup;
	}

	public void setPtGroup(String ptGroup) {
		this.ptGroup = ptGroup;
	}

	public String getPtPartType() {
		return this.ptPartType;
	}

	public void setPtPartType(String ptPartType) {
		this.ptPartType = ptPartType;
	}

	public String getPtStatus() {
		return this.ptStatus;
	}

	public void setPtStatus(String ptStatus) {
		this.ptStatus = ptStatus;
	}

	public String getPtAbc() {
		return this.ptAbc;
	}

	public void setPtAbc(String ptAbc) {
		this.ptAbc = ptAbc;
	}

	public Boolean getPtIssPol() {
		return this.ptIssPol;
	}

	public void setPtIssPol(Boolean ptIssPol) {
		this.ptIssPol = ptIssPol;
	}

	public Boolean getPtPhantom() {
		return this.ptPhantom;
	}

	public void setPtPhantom(Boolean ptPhantom) {
		this.ptPhantom = ptPhantom;
	}

	public String getPtLoc() {
		return this.ptLoc;
	}

	public void setPtLoc(String ptLoc) {
		this.ptLoc = ptLoc;
	}

	public Double getPtQad01() {
		return this.ptQad01;
	}

	public void setPtQad01(Double ptQad01) {
		this.ptQad01 = ptQad01;
	}

	public Double getPtQad02() {
		return this.ptQad02;
	}

	public void setPtQad02(Double ptQad02) {
		this.ptQad02 = ptQad02;
	}

	public Double getPtAbcAmt() {
		return this.ptAbcAmt;
	}

	public void setPtAbcAmt(Double ptAbcAmt) {
		this.ptAbcAmt = ptAbcAmt;
	}

	public Double getPtQad03() {
		return this.ptQad03;
	}

	public void setPtQad03(Double ptQad03) {
		this.ptQad03 = ptQad03;
	}

	public Double getPtQad04() {
		return this.ptQad04;
	}

	public void setPtQad04(Double ptQad04) {
		this.ptQad04 = ptQad04;
	}

	public Integer getPtAvgInt() {
		return this.ptAvgInt;
	}

	public void setPtAvgInt(Integer ptAvgInt) {
		this.ptAvgInt = ptAvgInt;
	}

	public Date getPtQad05() {
		return this.ptQad05;
	}

	public void setPtQad05(Date ptQad05) {
		this.ptQad05 = ptQad05;
	}

	public Integer getPtCycInt() {
		return this.ptCycInt;
	}

	public void setPtCycInt(Integer ptCycInt) {
		this.ptCycInt = ptCycInt;
	}

	public Date getPtQad06() {
		return this.ptQad06;
	}

	public void setPtQad06(Date ptQad06) {
		this.ptQad06 = ptQad06;
	}

	public Date getPtQad07() {
		return this.ptQad07;
	}

	public void setPtQad07(Date ptQad07) {
		this.ptQad07 = ptQad07;
	}

	public Date getPtQad08() {
		return this.ptQad08;
	}

	public void setPtQad08(Date ptQad08) {
		this.ptQad08 = ptQad08;
	}

	public Boolean getPtMs() {
		return this.ptMs;
	}

	public void setPtMs(Boolean ptMs) {
		this.ptMs = ptMs;
	}

	public Boolean getPtPlanOrd() {
		return this.ptPlanOrd;
	}

	public void setPtPlanOrd(Boolean ptPlanOrd) {
		this.ptPlanOrd = ptPlanOrd;
	}

	public Boolean getPtMrp() {
		return this.ptMrp;
	}

	public void setPtMrp(Boolean ptMrp) {
		this.ptMrp = ptMrp;
	}

	public String getPtOrdPol() {
		return this.ptOrdPol;
	}

	public void setPtOrdPol(String ptOrdPol) {
		this.ptOrdPol = ptOrdPol;
	}

	public Double getPtOrdQty() {
		return this.ptOrdQty;
	}

	public void setPtOrdQty(Double ptOrdQty) {
		this.ptOrdQty = ptOrdQty;
	}

	public Integer getPtOrdPer() {
		return this.ptOrdPer;
	}

	public void setPtOrdPer(Integer ptOrdPer) {
		this.ptOrdPer = ptOrdPer;
	}

	public BigDecimal getPtSftyStk() {
		return this.ptSftyStk;
	}

	public void setPtSftyStk(BigDecimal ptSftyStk) {
		this.ptSftyStk = ptSftyStk;
	}

	public BigDecimal getPtSftyTime() {
		return this.ptSftyTime;
	}

	public void setPtSftyTime(BigDecimal ptSftyTime) {
		this.ptSftyTime = ptSftyTime;
	}

	public BigDecimal getPtRop() {
		return this.ptRop;
	}

	public void setPtRop(BigDecimal ptRop) {
		this.ptRop = ptRop;
	}

	public String getPtBuyer() {
		return this.ptBuyer;
	}

	public void setPtBuyer(String ptBuyer) {
		this.ptBuyer = ptBuyer;
	}

	public String getPtVend() {
		return this.ptVend;
	}

	public void setPtVend(String ptVend) {
		this.ptVend = ptVend;
	}

	public Double getPtQad09() {
		return this.ptQad09;
	}

	public void setPtQad09(Double ptQad09) {
		this.ptQad09 = ptQad09;
	}

	public String getPtPmCode() {
		return this.ptPmCode;
	}

	public void setPtPmCode(String ptPmCode) {
		this.ptPmCode = ptPmCode;
	}

	public BigDecimal getPtMfgLead() {
		return this.ptMfgLead;
	}

	public void setPtMfgLead(BigDecimal ptMfgLead) {
		this.ptMfgLead = ptMfgLead;
	}

	public Integer getPtPurLead() {
		return this.ptPurLead;
	}

	public void setPtPurLead(Integer ptPurLead) {
		this.ptPurLead = ptPurLead;
	}

	public Boolean getPtInspRqd() {
		return this.ptInspRqd;
	}

	public void setPtInspRqd(Boolean ptInspRqd) {
		this.ptInspRqd = ptInspRqd;
	}

	public Integer getPtInspLead() {
		return this.ptInspLead;
	}

	public void setPtInspLead(Integer ptInspLead) {
		this.ptInspLead = ptInspLead;
	}

	public Integer getPtCumLead() {
		return this.ptCumLead;
	}

	public void setPtCumLead(Integer ptCumLead) {
		this.ptCumLead = ptCumLead;
	}

	public BigDecimal getPtOrdMin() {
		return this.ptOrdMin;
	}

	public void setPtOrdMin(BigDecimal ptOrdMin) {
		this.ptOrdMin = ptOrdMin;
	}

	public BigDecimal getPtOrdMax() {
		return this.ptOrdMax;
	}

	public void setPtOrdMax(BigDecimal ptOrdMax) {
		this.ptOrdMax = ptOrdMax;
	}

	public BigDecimal getPtOrdMult() {
		return this.ptOrdMult;
	}

	public void setPtOrdMult(BigDecimal ptOrdMult) {
		this.ptOrdMult = ptOrdMult;
	}

	public Double getPtYieldPct() {
		return this.ptYieldPct;
	}

	public void setPtYieldPct(Double ptYieldPct) {
		this.ptYieldPct = ptYieldPct;
	}

	public BigDecimal getPtQad16() {
		return this.ptQad16;
	}

	public void setPtQad16(BigDecimal ptQad16) {
		this.ptQad16 = ptQad16;
	}

	public Double getPtSetup() {
		return this.ptSetup;
	}

	public void setPtSetup(Double ptSetup) {
		this.ptSetup = ptSetup;
	}

	public Double getPtSetupLl() {
		return this.ptSetupLl;
	}

	public void setPtSetupLl(Double ptSetupLl) {
		this.ptSetupLl = ptSetupLl;
	}

	public Double getPtRunLl() {
		return this.ptRunLl;
	}

	public void setPtRunLl(Double ptRunLl) {
		this.ptRunLl = ptRunLl;
	}

	public Double getPtRun() {
		return this.ptRun;
	}

	public void setPtRun(Double ptRun) {
		this.ptRun = ptRun;
	}

	public Double getPtPrice() {
		return this.ptPrice;
	}

	public void setPtPrice(Double ptPrice) {
		this.ptPrice = ptPrice;
	}

	public Double getPtXmtlTl() {
		return this.ptXmtlTl;
	}

	public void setPtXmtlTl(Double ptXmtlTl) {
		this.ptXmtlTl = ptXmtlTl;
	}

	public Double getPtXlbrTl() {
		return this.ptXlbrTl;
	}

	public void setPtXlbrTl(Double ptXlbrTl) {
		this.ptXlbrTl = ptXlbrTl;
	}

	public Double getPtXbdnTl() {
		return this.ptXbdnTl;
	}

	public void setPtXbdnTl(Double ptXbdnTl) {
		this.ptXbdnTl = ptXbdnTl;
	}

	public Double getPtXsubTl() {
		return this.ptXsubTl;
	}

	public void setPtXsubTl(Double ptXsubTl) {
		this.ptXsubTl = ptXsubTl;
	}

	public Double getPtXmtlLl() {
		return this.ptXmtlLl;
	}

	public void setPtXmtlLl(Double ptXmtlLl) {
		this.ptXmtlLl = ptXmtlLl;
	}

	public Double getPtXlbrLl() {
		return this.ptXlbrLl;
	}

	public void setPtXlbrLl(Double ptXlbrLl) {
		this.ptXlbrLl = ptXlbrLl;
	}

	public Double getPtXbdnLl() {
		return this.ptXbdnLl;
	}

	public void setPtXbdnLl(Double ptXbdnLl) {
		this.ptXbdnLl = ptXbdnLl;
	}

	public Double getPtXsubLl() {
		return this.ptXsubLl;
	}

	public void setPtXsubLl(Double ptXsubLl) {
		this.ptXsubLl = ptXsubLl;
	}

	public Double getPtXtotCur() {
		return this.ptXtotCur;
	}

	public void setPtXtotCur(Double ptXtotCur) {
		this.ptXtotCur = ptXtotCur;
	}

	public Date getPtCurDate() {
		return this.ptCurDate;
	}

	public void setPtCurDate(Date ptCurDate) {
		this.ptCurDate = ptCurDate;
	}

	public Double getPtXmtlStdtl() {
		return this.ptXmtlStdtl;
	}

	public void setPtXmtlStdtl(Double ptXmtlStdtl) {
		this.ptXmtlStdtl = ptXmtlStdtl;
	}

	public Double getPtXlbrStdtl() {
		return this.ptXlbrStdtl;
	}

	public void setPtXlbrStdtl(Double ptXlbrStdtl) {
		this.ptXlbrStdtl = ptXlbrStdtl;
	}

	public Double getPtXbdnStdtl() {
		return this.ptXbdnStdtl;
	}

	public void setPtXbdnStdtl(Double ptXbdnStdtl) {
		this.ptXbdnStdtl = ptXbdnStdtl;
	}

	public Double getPtXsubStdtl() {
		return this.ptXsubStdtl;
	}

	public void setPtXsubStdtl(Double ptXsubStdtl) {
		this.ptXsubStdtl = ptXsubStdtl;
	}

	public Double getPtXtotStd() {
		return this.ptXtotStd;
	}

	public void setPtXtotStd(Double ptXtotStd) {
		this.ptXtotStd = ptXtotStd;
	}

	public Date getPtStdDate() {
		return this.ptStdDate;
	}

	public void setPtStdDate(Date ptStdDate) {
		this.ptStdDate = ptStdDate;
	}

	public Integer getPtLlCode() {
		return this.ptLlCode;
	}

	public void setPtLlCode(Integer ptLlCode) {
		this.ptLlCode = ptLlCode;
	}

	public Double getPtAbcQty() {
		return this.ptAbcQty;
	}

	public void setPtAbcQty(Double ptAbcQty) {
		this.ptAbcQty = ptAbcQty;
	}

	public Double getPtQad10() {
		return this.ptQad10;
	}

	public void setPtQad10(Double ptQad10) {
		this.ptQad10 = ptQad10;
	}

	public Double getPtQad11() {
		return this.ptQad11;
	}

	public void setPtQad11(Double ptQad11) {
		this.ptQad11 = ptQad11;
	}

	public String getPtRouting() {
		return this.ptRouting;
	}

	public void setPtRouting(String ptRouting) {
		this.ptRouting = ptRouting;
	}

	public String getPtLotSer() {
		return this.ptLotSer;
	}

	public void setPtLotSer(String ptLotSer) {
		this.ptLotSer = ptLotSer;
	}

	public Integer getPtTimefence() {
		return this.ptTimefence;
	}

	public void setPtTimefence(Integer ptTimefence) {
		this.ptTimefence = ptTimefence;
	}

	public Double getPtXmtlStdll() {
		return this.ptXmtlStdll;
	}

	public void setPtXmtlStdll(Double ptXmtlStdll) {
		this.ptXmtlStdll = ptXmtlStdll;
	}

	public Double getPtXlbrStdll() {
		return this.ptXlbrStdll;
	}

	public void setPtXlbrStdll(Double ptXlbrStdll) {
		this.ptXlbrStdll = ptXlbrStdll;
	}

	public Double getPtXbdnStdll() {
		return this.ptXbdnStdll;
	}

	public void setPtXbdnStdll(Double ptXbdnStdll) {
		this.ptXbdnStdll = ptXbdnStdll;
	}

	public Double getPtXsubStdll() {
		return this.ptXsubStdll;
	}

	public void setPtXsubStdll(Double ptXsubStdll) {
		this.ptXsubStdll = ptXsubStdll;
	}

	public String getPtRev() {
		return this.ptRev;
	}

	public void setPtRev(String ptRev) {
		this.ptRev = ptRev;
	}

	public Date getPtLastEco() {
		return this.ptLastEco;
	}

	public void setPtLastEco(Date ptLastEco) {
		this.ptLastEco = ptLastEco;
	}

	public Boolean getPtQad15() {
		return this.ptQad15;
	}

	public void setPtQad15(Boolean ptQad15) {
		this.ptQad15 = ptQad15;
	}

	public Boolean getPtQad17() {
		return this.ptQad17;
	}

	public void setPtQad17(Boolean ptQad17) {
		this.ptQad17 = ptQad17;
	}

	public Integer getPtQcLead() {
		return this.ptQcLead;
	}

	public void setPtQcLead(Integer ptQcLead) {
		this.ptQcLead = ptQcLead;
	}

	public Boolean getPtAutoLot() {
		return this.ptAutoLot;
	}

	public void setPtAutoLot(Boolean ptAutoLot) {
		this.ptAutoLot = ptAutoLot;
	}

	public Double getPtAssay() {
		return this.ptAssay;
	}

	public void setPtAssay(Double ptAssay) {
		this.ptAssay = ptAssay;
	}

	public Double getPtBatch() {
		return this.ptBatch;
	}

	public void setPtBatch(Double ptBatch) {
		this.ptBatch = ptBatch;
	}

	public Date getPtQad14() {
		return this.ptQad14;
	}

	public void setPtQad14(Date ptQad14) {
		this.ptQad14 = ptQad14;
	}

	public String getPtUser3() {
		return this.ptUser3;
	}

	public void setPtUser3(String ptUser3) {
		this.ptUser3 = ptUser3;
	}

	public String getPtUser1() {
		return this.ptUser1;
	}

	public void setPtUser1(String ptUser1) {
		this.ptUser1 = ptUser1;
	}

	public String getPtUser2() {
		return this.ptUser2;
	}

	public void setPtUser2(String ptUser2) {
		this.ptUser2 = ptUser2;
	}

	public Double getPtNetWt() {
		return this.ptNetWt;
	}

	public void setPtNetWt(Double ptNetWt) {
		this.ptNetWt = ptNetWt;
	}

	public String getPtNetWtUm() {
		return this.ptNetWtUm;
	}

	public void setPtNetWtUm(String ptNetWtUm) {
		this.ptNetWtUm = ptNetWtUm;
	}

	public Double getPtSize() {
		return this.ptSize;
	}

	public void setPtSize(Double ptSize) {
		this.ptSize = ptSize;
	}

	public String getPtSizeUm() {
		return this.ptSizeUm;
	}

	public void setPtSizeUm(String ptSizeUm) {
		this.ptSizeUm = ptSizeUm;
	}

	public Boolean getPtTaxable() {
		return this.ptTaxable;
	}

	public void setPtTaxable(Boolean ptTaxable) {
		this.ptTaxable = ptTaxable;
	}

	public String getPtTaxc() {
		return this.ptTaxc;
	}

	public void setPtTaxc(String ptTaxc) {
		this.ptTaxc = ptTaxc;
	}

	public Boolean getPtRollup() {
		return this.ptRollup;
	}

	public void setPtRollup(Boolean ptRollup) {
		this.ptRollup = ptRollup;
	}

	public Double getPtXovhLl() {
		return this.ptXovhLl;
	}

	public void setPtXovhLl(Double ptXovhLl) {
		this.ptXovhLl = ptXovhLl;
	}

	public Double getPtXovhTl() {
		return this.ptXovhTl;
	}

	public void setPtXovhTl(Double ptXovhTl) {
		this.ptXovhTl = ptXovhTl;
	}

	public Double getPtXovhStdll() {
		return this.ptXovhStdll;
	}

	public void setPtXovhStdll(Double ptXovhStdll) {
		this.ptXovhStdll = ptXovhStdll;
	}

	public Double getPtXovhStdtl() {
		return this.ptXovhStdtl;
	}

	public void setPtXovhStdtl(Double ptXovhStdtl) {
		this.ptXovhStdtl = ptXovhStdtl;
	}

	public String getPtSite() {
		return this.ptSite;
	}

	public void setPtSite(String ptSite) {
		this.ptSite = ptSite;
	}

	public Integer getPtShelflife() {
		return this.ptShelflife;
	}

	public void setPtShelflife(Integer ptShelflife) {
		this.ptShelflife = ptShelflife;
	}

	public Boolean getPtCritical() {
		return this.ptCritical;
	}

	public void setPtCritical(Boolean ptCritical) {
		this.ptCritical = ptCritical;
	}

	public Boolean getPtSnglLot() {
		return this.ptSnglLot;
	}

	public void setPtSnglLot(Boolean ptSnglLot) {
		this.ptSnglLot = ptSnglLot;
	}

	public String getPtUpc() {
		return this.ptUpc;
	}

	public void setPtUpc(String ptUpc) {
		this.ptUpc = ptUpc;
	}

	public String getPtHazard() {
		return this.ptHazard;
	}

	public void setPtHazard(String ptHazard) {
		this.ptHazard = ptHazard;
	}

	public Date getPtAdded() {
		return this.ptAdded;
	}

	public void setPtAdded(Date ptAdded) {
		this.ptAdded = ptAdded;
	}

	public String getPtChr01() {
		return this.ptChr01;
	}

	public void setPtChr01(String ptChr01) {
		this.ptChr01 = ptChr01;
	}

	public String getPtChr02() {
		return this.ptChr02;
	}

	public void setPtChr02(String ptChr02) {
		this.ptChr02 = ptChr02;
	}

	public String getPtChr03() {
		return this.ptChr03;
	}

	public void setPtChr03(String ptChr03) {
		this.ptChr03 = ptChr03;
	}

	public String getPtChr04() {
		return this.ptChr04;
	}

	public void setPtChr04(String ptChr04) {
		this.ptChr04 = ptChr04;
	}

	public String getPtChr05() {
		return this.ptChr05;
	}

	public void setPtChr05(String ptChr05) {
		this.ptChr05 = ptChr05;
	}

	public String getPtChr06() {
		return this.ptChr06;
	}

	public void setPtChr06(String ptChr06) {
		this.ptChr06 = ptChr06;
	}

	public String getPtChr07() {
		return this.ptChr07;
	}

	public void setPtChr07(String ptChr07) {
		this.ptChr07 = ptChr07;
	}

	public String getPtChr08() {
		return this.ptChr08;
	}

	public void setPtChr08(String ptChr08) {
		this.ptChr08 = ptChr08;
	}

	public String getPtChr09() {
		return this.ptChr09;
	}

	public void setPtChr09(String ptChr09) {
		this.ptChr09 = ptChr09;
	}

	public String getPtChr10() {
		return this.ptChr10;
	}

	public void setPtChr10(String ptChr10) {
		this.ptChr10 = ptChr10;
	}

	public Date getPtDte01() {
		return this.ptDte01;
	}

	public void setPtDte01(Date ptDte01) {
		this.ptDte01 = ptDte01;
	}

	public Date getPtDte02() {
		return this.ptDte02;
	}

	public void setPtDte02(Date ptDte02) {
		this.ptDte02 = ptDte02;
	}

	public Double getPtDec01() {
		return this.ptDec01;
	}

	public void setPtDec01(Double ptDec01) {
		this.ptDec01 = ptDec01;
	}

	public Double getPtDec02() {
		return this.ptDec02;
	}

	public void setPtDec02(Double ptDec02) {
		this.ptDec02 = ptDec02;
	}

	public Boolean getPtLog01() {
		return this.ptLog01;
	}

	public void setPtLog01(Boolean ptLog01) {
		this.ptLog01 = ptLog01;
	}

	public Boolean getPtLog02() {
		return this.ptLog02;
	}

	public void setPtLog02(Boolean ptLog02) {
		this.ptLog02 = ptLog02;
	}

	public Double getPtQad18() {
		return this.ptQad18;
	}

	public void setPtQad18(Double ptQad18) {
		this.ptQad18 = ptQad18;
	}

	public Double getPtQad21() {
		return this.ptQad21;
	}

	public void setPtQad21(Double ptQad21) {
		this.ptQad21 = ptQad21;
	}

	public Double getPtQad19() {
		return this.ptQad19;
	}

	public void setPtQad19(Double ptQad19) {
		this.ptQad19 = ptQad19;
	}

	public Double getPtQad20() {
		return this.ptQad20;
	}

	public void setPtQad20(Double ptQad20) {
		this.ptQad20 = ptQad20;
	}

	public Double getPtLength() {
		return this.ptLength;
	}

	public void setPtLength(Double ptLength) {
		this.ptLength = ptLength;
	}

	public Double getPtHeight() {
		return this.ptHeight;
	}

	public void setPtHeight(Double ptHeight) {
		this.ptHeight = ptHeight;
	}

	public Double getPtWidth() {
		return this.ptWidth;
	}

	public void setPtWidth(Double ptWidth) {
		this.ptWidth = ptWidth;
	}

	public String getPtDimUm() {
		return this.ptDimUm;
	}

	public void setPtDimUm(String ptDimUm) {
		this.ptDimUm = ptDimUm;
	}

	public String getPtPkgCode() {
		return this.ptPkgCode;
	}

	public void setPtPkgCode(String ptPkgCode) {
		this.ptPkgCode = ptPkgCode;
	}

	public String getPtNetwork() {
		return this.ptNetwork;
	}

	public void setPtNetwork(String ptNetwork) {
		this.ptNetwork = ptNetwork;
	}

	public String getPtFrClass() {
		return this.ptFrClass;
	}

	public void setPtFrClass(String ptFrClass) {
		this.ptFrClass = ptFrClass;
	}

	public String getPtSpecHdlg() {
		return this.ptSpecHdlg;
	}

	public void setPtSpecHdlg(String ptSpecHdlg) {
		this.ptSpecHdlg = ptSpecHdlg;
	}

	public String getPtBomCode() {
		return this.ptBomCode;
	}

	public void setPtBomCode(String ptBomCode) {
		this.ptBomCode = ptBomCode;
	}

	public String getPtLocType() {
		return this.ptLocType;
	}

	public void setPtLocType(String ptLocType) {
		this.ptLocType = ptLocType;
	}

	public String getPtTranstype() {
		return this.ptTranstype;
	}

	public void setPtTranstype(String ptTranstype) {
		this.ptTranstype = ptTranstype;
	}

	public String getPtWarrCd() {
		return this.ptWarrCd;
	}

	public void setPtWarrCd(String ptWarrCd) {
		this.ptWarrCd = ptWarrCd;
	}

	public Integer getPtPvmDays() {
		return this.ptPvmDays;
	}

	public void setPtPvmDays(Integer ptPvmDays) {
		this.ptPvmDays = ptPvmDays;
	}

	public Boolean getPtIsb() {
		return this.ptIsb;
	}

	public void setPtIsb(Boolean ptIsb) {
		this.ptIsb = ptIsb;
	}

	public Double getPtMttr() {
		return this.ptMttr;
	}

	public void setPtMttr(Double ptMttr) {
		this.ptMttr = ptMttr;
	}

	public Double getPtMtbf() {
		return this.ptMtbf;
	}

	public void setPtMtbf(Double ptMtbf) {
		this.ptMtbf = ptMtbf;
	}

	public String getPtSvcType() {
		return this.ptSvcType;
	}

	public void setPtSvcType(String ptSvcType) {
		this.ptSvcType = ptSvcType;
	}

	public String getPtSvcGroup() {
		return this.ptSvcGroup;
	}

	public void setPtSvcGroup(String ptSvcGroup) {
		this.ptSvcGroup = ptSvcGroup;
	}

	public Boolean getPtVenWarr() {
		return this.ptVenWarr;
	}

	public void setPtVenWarr(Boolean ptVenWarr) {
		this.ptVenWarr = ptVenWarr;
	}

	public Boolean getPtFru() {
		return this.ptFru;
	}

	public void setPtFru(Boolean ptFru) {
		this.ptFru = ptFru;
	}

	public Double getPtMfgMttr() {
		return this.ptMfgMttr;
	}

	public void setPtMfgMttr(Double ptMfgMttr) {
		this.ptMfgMttr = ptMfgMttr;
	}

	public Double getPtMfgMtbf() {
		return this.ptMfgMtbf;
	}

	public void setPtMfgMtbf(Double ptMfgMtbf) {
		this.ptMfgMtbf = ptMfgMtbf;
	}

	public Double getPtSttr() {
		return this.ptSttr;
	}

	public void setPtSttr(Double ptSttr) {
		this.ptSttr = ptSttr;
	}

	public String getPtOrigin() {
		return this.ptOrigin;
	}

	public void setPtOrigin(String ptOrigin) {
		this.ptOrigin = ptOrigin;
	}

	public String getPtTariff() {
		return this.ptTariff;
	}

	public void setPtTariff(String ptTariff) {
		this.ptTariff = ptTariff;
	}

	public String getPtSysType() {
		return this.ptSysType;
	}

	public void setPtSysType(String ptSysType) {
		this.ptSysType = ptSysType;
	}

	public Boolean getPtInstCall() {
		return this.ptInstCall;
	}

	public void setPtInstCall(Boolean ptInstCall) {
		this.ptInstCall = ptInstCall;
	}

	public String getPtCover() {
		return this.ptCover;
	}

	public void setPtCover(String ptCover) {
		this.ptCover = ptCover;
	}

	public Boolean getPtUnitIsb() {
		return this.ptUnitIsb;
	}

	public void setPtUnitIsb(Boolean ptUnitIsb) {
		this.ptUnitIsb = ptUnitIsb;
	}

	public String getPtArticle() {
		return this.ptArticle;
	}

	public void setPtArticle(String ptArticle) {
		this.ptArticle = ptArticle;
	}

	public Integer getPtLlDrp() {
		return this.ptLlDrp;
	}

	public void setPtLlDrp(Integer ptLlDrp) {
		this.ptLlDrp = ptLlDrp;
	}

	public String getPtPoSite() {
		return this.ptPoSite;
	}

	public void setPtPoSite(String ptPoSite) {
		this.ptPoSite = ptPoSite;
	}

	public Double getPtShipWt() {
		return this.ptShipWt;
	}

	public void setPtShipWt(Double ptShipWt) {
		this.ptShipWt = ptShipWt;
	}

	public String getPtShipWtUm() {
		return this.ptShipWtUm;
	}

	public void setPtShipWtUm(String ptShipWtUm) {
		this.ptShipWtUm = ptShipWtUm;
	}

	public String getPtUserid() {
		return this.ptUserid;
	}

	public void setPtUserid(String ptUserid) {
		this.ptUserid = ptUserid;
	}

	public Date getPtModDate() {
		return this.ptModDate;
	}

	public void setPtModDate(Date ptModDate) {
		this.ptModDate = ptModDate;
	}

	public Boolean getPtQad26() {
		return this.ptQad26;
	}

	public void setPtQad26(Boolean ptQad26) {
		this.ptQad26 = ptQad26;
	}

	public String getPtCommCode() {
		return this.ptCommCode;
	}

	public void setPtCommCode(String ptCommCode) {
		this.ptCommCode = ptCommCode;
	}

	public Boolean getPtQad22() {
		return this.ptQad22;
	}

	public void setPtQad22(Boolean ptQad22) {
		this.ptQad22 = ptQad22;
	}

	public Boolean getPtDea() {
		return this.ptDea;
	}

	public void setPtDea(Boolean ptDea) {
		this.ptDea = ptDea;
	}

	public Boolean getPtFormula() {
		return this.ptFormula;
	}

	public void setPtFormula(Boolean ptFormula) {
		this.ptFormula = ptFormula;
	}

	public Integer getPtQad23() {
		return this.ptQad23;
	}

	public void setPtQad23(Integer ptQad23) {
		this.ptQad23 = ptQad23;
	}

	public Integer getPtQad24() {
		return this.ptQad24;
	}

	public void setPtQad24(Integer ptQad24) {
		this.ptQad24 = ptQad24;
	}

	public Integer getPtQad25() {
		return this.ptQad25;
	}

	public void setPtQad25(Integer ptQad25) {
		this.ptQad25 = ptQad25;
	}

	public Date getPtObsDate() {
		return this.ptObsDate;
	}

	public void setPtObsDate(Date ptObsDate) {
		this.ptObsDate = ptObsDate;
	}

	public String getPtPvmBom() {
		return this.ptPvmBom;
	}

	public void setPtPvmBom(String ptPvmBom) {
		this.ptPvmBom = ptPvmBom;
	}

	public String getPtPvmRoute() {
		return this.ptPvmRoute;
	}

	public void setPtPvmRoute(String ptPvmRoute) {
		this.ptPvmRoute = ptPvmRoute;
	}

	public String getPtPvmUm() {
		return this.ptPvmUm;
	}

	public void setPtPvmUm(String ptPvmUm) {
		this.ptPvmUm = ptPvmUm;
	}

	public String getPtRpBom() {
		return this.ptRpBom;
	}

	public void setPtRpBom(String ptRpBom) {
		this.ptRpBom = ptRpBom;
	}

	public String getPtRpRoute() {
		return this.ptRpRoute;
	}

	public void setPtRpRoute(String ptRpRoute) {
		this.ptRpRoute = ptRpRoute;
	}

	public String getPtRpVendor() {
		return this.ptRpVendor;
	}

	public void setPtRpVendor(String ptRpVendor) {
		this.ptRpVendor = ptRpVendor;
	}

	public String getPtRctpoStatus() {
		return this.ptRctpoStatus;
	}

	public void setPtRctpoStatus(String ptRctpoStatus) {
		this.ptRctpoStatus = ptRctpoStatus;
	}

	public String getPtRollupId() {
		return this.ptRollupId;
	}

	public void setPtRollupId(String ptRollupId) {
		this.ptRollupId = ptRollupId;
	}

	public Double getPtSpecGrav() {
		return this.ptSpecGrav;
	}

	public void setPtSpecGrav(Double ptSpecGrav) {
		this.ptSpecGrav = ptSpecGrav;
	}

	public String getPtJointType() {
		return this.ptJointType;
	}

	public void setPtJointType(String ptJointType) {
		this.ptJointType = ptJointType;
	}

	public Double getPtMfgPct() {
		return this.ptMfgPct;
	}

	public void setPtMfgPct(Double ptMfgPct) {
		this.ptMfgPct = ptMfgPct;
	}

	public Double getPtPurPct() {
		return this.ptPurPct;
	}

	public void setPtPurPct(Double ptPurPct) {
		this.ptPurPct = ptPurPct;
	}

	public Double getPtDrpPct() {
		return this.ptDrpPct;
	}

	public void setPtDrpPct(Double ptDrpPct) {
		this.ptDrpPct = ptDrpPct;
	}

	public String getPtPouCode() {
		return this.ptPouCode;
	}

	public void setPtPouCode(String ptPouCode) {
		this.ptPouCode = ptPouCode;
	}

	public Double getPtWksAvg() {
		return this.ptWksAvg;
	}

	public void setPtWksAvg(Double ptWksAvg) {
		this.ptWksAvg = ptWksAvg;
	}

	public Double getPtWksMax() {
		return this.ptWksMax;
	}

	public void setPtWksMax(Double ptWksMax) {
		this.ptWksMax = ptWksMax;
	}

	public Double getPtWksMin() {
		return this.ptWksMin;
	}

	public void setPtWksMin(Double ptWksMin) {
		this.ptWksMin = ptWksMin;
	}

	public Integer getPtPickLogic() {
		return this.ptPickLogic;
	}

	public void setPtPickLogic(Integer ptPickLogic) {
		this.ptPickLogic = ptPickLogic;
	}

	public String getPtFiscalClass() {
		return this.ptFiscalClass;
	}

	public void setPtFiscalClass(String ptFiscalClass) {
		this.ptFiscalClass = ptFiscalClass;
	}

	public String getPtDsgnGrp() {
		return this.ptDsgnGrp;
	}

	public void setPtDsgnGrp(String ptDsgnGrp) {
		this.ptDsgnGrp = ptDsgnGrp;
	}

	public String getPtDrwgLoc() {
		return this.ptDrwgLoc;
	}

	public void setPtDrwgLoc(String ptDrwgLoc) {
		this.ptDrwgLoc = ptDrwgLoc;
	}

	public String getPtEcnRev() {
		return this.ptEcnRev;
	}

	public void setPtEcnRev(String ptEcnRev) {
		this.ptEcnRev = ptEcnRev;
	}

	public String getPtDrwgSize() {
		return this.ptDrwgSize;
	}

	public void setPtDrwgSize(String ptDrwgSize) {
		this.ptDrwgSize = ptDrwgSize;
	}

	public String getPtModel() {
		return this.ptModel;
	}

	public void setPtModel(String ptModel) {
		this.ptModel = ptModel;
	}

	public Boolean getPtRepairable() {
		return this.ptRepairable;
	}

	public void setPtRepairable(Boolean ptRepairable) {
		this.ptRepairable = ptRepairable;
	}

	public String getPtRctwoStatus() {
		return this.ptRctwoStatus;
	}

	public void setPtRctwoStatus(String ptRctwoStatus) {
		this.ptRctwoStatus = ptRctwoStatus;
	}

	public Boolean getPtRctpoActive() {
		return this.ptRctpoActive;
	}

	public void setPtRctpoActive(Boolean ptRctpoActive) {
		this.ptRctpoActive = ptRctpoActive;
	}

	public String getPtLotGrp() {
		return this.ptLotGrp;
	}

	public void setPtLotGrp(String ptLotGrp) {
		this.ptLotGrp = ptLotGrp;
	}

	public Boolean getPtRctwoActive() {
		return this.ptRctwoActive;
	}

	public void setPtRctwoActive(Boolean ptRctwoActive) {
		this.ptRctwoActive = ptRctwoActive;
	}

	public String getPtBreakCat() {
		return this.ptBreakCat;
	}

	public void setPtBreakCat(String ptBreakCat) {
		this.ptBreakCat = ptBreakCat;
	}

	public String getPtFscCode() {
		return this.ptFscCode;
	}

	public void setPtFscCode(String ptFscCode) {
		this.ptFscCode = ptFscCode;
	}

	public Boolean getPtTraceActive() {
		return this.ptTraceActive;
	}

	public void setPtTraceActive(Boolean ptTraceActive) {
		this.ptTraceActive = ptTraceActive;
	}

	public Boolean getPtTraceDetail() {
		return this.ptTraceDetail;
	}

	public void setPtTraceDetail(Boolean ptTraceDetail) {
		this.ptTraceDetail = ptTraceDetail;
	}

	public Boolean getPtPmMrp() {
		return this.ptPmMrp;
	}

	public void setPtPmMrp(Boolean ptPmMrp) {
		this.ptPmMrp = ptPmMrp;
	}

	public String getPtInsCallType() {
		return this.ptInsCallType;
	}

	public void setPtInsCallType(String ptInsCallType) {
		this.ptInsCallType = ptInsCallType;
	}

	public String getPtInsBom() {
		return this.ptInsBom;
	}

	public void setPtInsBom(String ptInsBom) {
		this.ptInsBom = ptInsBom;
	}

	public String getPtInsRoute() {
		return this.ptInsRoute;
	}

	public void setPtInsRoute(String ptInsRoute) {
		this.ptInsRoute = ptInsRoute;
	}

	public String getPtPromo() {
		return this.ptPromo;
	}

	public void setPtPromo(String ptPromo) {
		this.ptPromo = ptPromo;
	}

	public Double getPtMeterInterval() {
		return this.ptMeterInterval;
	}

	public void setPtMeterInterval(Double ptMeterInterval) {
		this.ptMeterInterval = ptMeterInterval;
	}

	public String getPtMeterUm() {
		return this.ptMeterUm;
	}

	public void setPtMeterUm(String ptMeterUm) {
		this.ptMeterUm = ptMeterUm;
	}

	public Boolean getPtWh() {
		return this.ptWh;
	}

	public void setPtWh(Boolean ptWh) {
		this.ptWh = ptWh;
	}

	public String getPtBtbType() {
		return this.ptBtbType;
	}

	public void setPtBtbType(String ptBtbType) {
		this.ptBtbType = ptBtbType;
	}

	public String getPtCfgType() {
		return this.ptCfgType;
	}

	public void setPtCfgType(String ptCfgType) {
		this.ptCfgType = ptCfgType;
	}

	public String getPtAppOwner() {
		return this.ptAppOwner;
	}

	public void setPtAppOwner(String ptAppOwner) {
		this.ptAppOwner = ptAppOwner;
	}

	public Boolean getPtOpYield() {
		return this.ptOpYield;
	}

	public void setPtOpYield(Boolean ptOpYield) {
		this.ptOpYield = ptOpYield;
	}

	public String getPtRunSeq1() {
		return this.ptRunSeq1;
	}

	public void setPtRunSeq1(String ptRunSeq1) {
		this.ptRunSeq1 = ptRunSeq1;
	}

	public String getPtRunSeq2() {
		return this.ptRunSeq2;
	}

	public void setPtRunSeq2(String ptRunSeq2) {
		this.ptRunSeq2 = ptRunSeq2;
	}

	public String getPtAtpEnforcement() {
		return this.ptAtpEnforcement;
	}

	public void setPtAtpEnforcement(String ptAtpEnforcement) {
		this.ptAtpEnforcement = ptAtpEnforcement;
	}

	public Boolean getPtAtpFamily() {
		return this.ptAtpFamily;
	}

	public void setPtAtpFamily(Boolean ptAtpFamily) {
		this.ptAtpFamily = ptAtpFamily;
	}

	public Double getOidPtMstr() {
		return this.oidPtMstr;
	}

	public void setOidPtMstr(Double oidPtMstr) {
		this.oidPtMstr = oidPtMstr;
	}

}