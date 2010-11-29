package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PodDet entity. @author MyEclipse Persistence Tools
 */
public class PodDet extends AbstractPodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PodDet() {
	}

	/** minimal constructor */
	public PodDet(PodDetId id, Integer podSodLine, String podSoStatus,
			Integer podPjsLine, Boolean podConsignment,
			Integer podMaxAgingDays, Boolean podMultiDueDates, Double oidPodDet) {
		super(id, podSodLine, podSoStatus, podPjsLine, podConsignment,
				podMaxAgingDays, podMultiDueDates, oidPodDet);
	}

	/** full constructor */
	public PodDet(PodDetId id, Date podDueDate, String podPart,
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
		super(id, podDueDate, podPart, podQtyOrd, podQtyRcvd, podPurCost,
				podStdCost, podSoJob, podQtyChg, podCostChg, podBoChg, podAcct,
				podPerDate, podType, podInspRqd, podWoLot, podVpart, podNeed,
				podTaxable, podDesc, podCc, podQad04, podUm, podDiscPct,
				podReqNbr, podQad10, podUmConv, podLoc, podSerial, podOp,
				podContract, podStatus, podRev, podCmtindx, podReqLine,
				podProject, podPsChg, podCstUp, podRum, podUser1, podUser2,
				podVat, podQad16, podQad06, podPst, podQad13, podQad07,
				podPayUm, podPumConv, podQad15, podSite, podRumConv,
				podQtyRtnd, podBlanket, podBlnktLn, podQad01, podQad02,
				podQad03, podQad05, podQad08, podQad09, podQad11, podQad12,
				podQad14, podRelNbr, podRelQty, podReason, podRequest,
				podApprove, podChr01, podChr02, podChr03, podChr04, podChr05,
				podChr06, podChr07, podChr08, podChr09, podChr10, podDte01,
				podDte02, podDec01, podDec02, podLog01, podTaxMax,
				podCurrRlseId, podSched, podCumQty, podCumDate, podContrId,
				podAprCode, podTaxc, podRmaType, podPoSite, podPoDb,
				podFirmWeeks, podMrpPct, podRawWeeks, podFabWeeks,
				podShipWeeks, podPlanWeeks, podTransltDays, podFsmType,
				podSdPat, podSdTime, podOrdMult, podPkgCode, podSchMrp,
				podSchData, podRlseNbr, podPlanDays, podPlanMths, podFirmDays,
				podStartEff, podEndEff, podRawDays, podFabDays, podTaxUsage,
				podTaxIn, podSchedChgd, podPrList, podDock, podPastdue,
				podFixPr, podDrpRef, podTaxEnv, podCrtInt, podFrList,
				podTransltHrs, podSftyltDays, podSftyltHrs, podLotNext,
				podLotRcpt, podGrade, podExpire, podRctstat, podAssay,
				podRctstatActive, podPricingDt, podPrLstTp, podErsOpt,
				podQadd01, podQadd02, podQadd03, podSodLine, podSoStatus,
				podSubShipDate, podSubType, podSub, podWipLotser, podPjsLine,
				podConsignment, podMaxAgingDays, podMultiDueDates, oidPodDet);
	}

}
