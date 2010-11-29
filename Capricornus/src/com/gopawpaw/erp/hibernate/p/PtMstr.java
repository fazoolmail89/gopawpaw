package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PtMstr entity. @author MyEclipse Persistence Tools
 */
public class PtMstr extends AbstractPtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtMstr() {
	}

	/** minimal constructor */
	public PtMstr(PtMstrId id, String ptUm, String ptBomCode, String ptLocType,
			String ptTranstype, Integer ptLlDrp, String ptPromo, Boolean ptWh,
			String ptBtbType, String ptRunSeq1, String ptRunSeq2,
			String ptAtpEnforcement, Boolean ptAtpFamily, Double oidPtMstr) {
		super(id, ptUm, ptBomCode, ptLocType, ptTranstype, ptLlDrp, ptPromo,
				ptWh, ptBtbType, ptRunSeq1, ptRunSeq2, ptAtpEnforcement,
				ptAtpFamily, oidPtMstr);
	}

	/** full constructor */
	public PtMstr(PtMstrId id, String ptDesc1, String ptDesc2, String ptUm,
			String ptQad13, Double ptQad12, String ptDraw, String ptProdLine,
			String ptGroup, String ptPartType, String ptStatus, String ptAbc,
			Boolean ptIssPol, Boolean ptPhantom, String ptLoc, Double ptQad01,
			Double ptQad02, Double ptAbcAmt, Double ptQad03, Double ptQad04,
			Integer ptAvgInt, Date ptQad05, Integer ptCycInt, Date ptQad06,
			Date ptQad07, Date ptQad08, Boolean ptMs, Boolean ptPlanOrd,
			Boolean ptMrp, String ptOrdPol, Double ptOrdQty, Integer ptOrdPer,
			BigDecimal ptSftyStk, BigDecimal ptSftyTime, BigDecimal ptRop,
			String ptBuyer, String ptVend, Double ptQad09, String ptPmCode,
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
		super(id, ptDesc1, ptDesc2, ptUm, ptQad13, ptQad12, ptDraw, ptProdLine,
				ptGroup, ptPartType, ptStatus, ptAbc, ptIssPol, ptPhantom,
				ptLoc, ptQad01, ptQad02, ptAbcAmt, ptQad03, ptQad04, ptAvgInt,
				ptQad05, ptCycInt, ptQad06, ptQad07, ptQad08, ptMs, ptPlanOrd,
				ptMrp, ptOrdPol, ptOrdQty, ptOrdPer, ptSftyStk, ptSftyTime,
				ptRop, ptBuyer, ptVend, ptQad09, ptPmCode, ptMfgLead,
				ptPurLead, ptInspRqd, ptInspLead, ptCumLead, ptOrdMin,
				ptOrdMax, ptOrdMult, ptYieldPct, ptQad16, ptSetup, ptSetupLl,
				ptRunLl, ptRun, ptPrice, ptXmtlTl, ptXlbrTl, ptXbdnTl,
				ptXsubTl, ptXmtlLl, ptXlbrLl, ptXbdnLl, ptXsubLl, ptXtotCur,
				ptCurDate, ptXmtlStdtl, ptXlbrStdtl, ptXbdnStdtl, ptXsubStdtl,
				ptXtotStd, ptStdDate, ptLlCode, ptAbcQty, ptQad10, ptQad11,
				ptRouting, ptLotSer, ptTimefence, ptXmtlStdll, ptXlbrStdll,
				ptXbdnStdll, ptXsubStdll, ptRev, ptLastEco, ptQad15, ptQad17,
				ptQcLead, ptAutoLot, ptAssay, ptBatch, ptQad14, ptUser3,
				ptUser1, ptUser2, ptNetWt, ptNetWtUm, ptSize, ptSizeUm,
				ptTaxable, ptTaxc, ptRollup, ptXovhLl, ptXovhTl, ptXovhStdll,
				ptXovhStdtl, ptSite, ptShelflife, ptCritical, ptSnglLot, ptUpc,
				ptHazard, ptAdded, ptChr01, ptChr02, ptChr03, ptChr04, ptChr05,
				ptChr06, ptChr07, ptChr08, ptChr09, ptChr10, ptDte01, ptDte02,
				ptDec01, ptDec02, ptLog01, ptLog02, ptQad18, ptQad21, ptQad19,
				ptQad20, ptLength, ptHeight, ptWidth, ptDimUm, ptPkgCode,
				ptNetwork, ptFrClass, ptSpecHdlg, ptBomCode, ptLocType,
				ptTranstype, ptWarrCd, ptPvmDays, ptIsb, ptMttr, ptMtbf,
				ptSvcType, ptSvcGroup, ptVenWarr, ptFru, ptMfgMttr, ptMfgMtbf,
				ptSttr, ptOrigin, ptTariff, ptSysType, ptInstCall, ptCover,
				ptUnitIsb, ptArticle, ptLlDrp, ptPoSite, ptShipWt, ptShipWtUm,
				ptUserid, ptModDate, ptQad26, ptCommCode, ptQad22, ptDea,
				ptFormula, ptQad23, ptQad24, ptQad25, ptObsDate, ptPvmBom,
				ptPvmRoute, ptPvmUm, ptRpBom, ptRpRoute, ptRpVendor,
				ptRctpoStatus, ptRollupId, ptSpecGrav, ptJointType, ptMfgPct,
				ptPurPct, ptDrpPct, ptPouCode, ptWksAvg, ptWksMax, ptWksMin,
				ptPickLogic, ptFiscalClass, ptDsgnGrp, ptDrwgLoc, ptEcnRev,
				ptDrwgSize, ptModel, ptRepairable, ptRctwoStatus,
				ptRctpoActive, ptLotGrp, ptRctwoActive, ptBreakCat, ptFscCode,
				ptTraceActive, ptTraceDetail, ptPmMrp, ptInsCallType, ptInsBom,
				ptInsRoute, ptPromo, ptMeterInterval, ptMeterUm, ptWh,
				ptBtbType, ptCfgType, ptAppOwner, ptOpYield, ptRunSeq1,
				ptRunSeq2, ptAtpEnforcement, ptAtpFamily, oidPtMstr);
	}

}
