package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SodDet entity. @author MyEclipse Persistence Tools
 */
public class SodDet extends AbstractSodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodDet() {
	}

	/** minimal constructor */
	public SodDet(SodDetId id, Boolean sodBonus, String sodBtbType,
			String sodBtbPo, Integer sodBtbPodLine, String sodBtbVend,
			Boolean sodDirAll, String sodOrderCategory, String sodModelyr,
			String sodCustref, Boolean sodConsignment, Integer sodMaxAgingDays,
			String sodConsignLoc, String sodIntransLoc,
			Boolean sodAutoReplenish, Boolean sodManualFrList, Double oidSodDet) {
		super(id, sodBonus, sodBtbType, sodBtbPo, sodBtbPodLine, sodBtbVend,
				sodDirAll, sodOrderCategory, sodModelyr, sodCustref,
				sodConsignment, sodMaxAgingDays, sodConsignLoc, sodIntransLoc,
				sodAutoReplenish, sodManualFrList, oidSodDet);
	}

	/** full constructor */
	public SodDet(SodDetId id, Date sodDueDate, Date sodPerDate,
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
		super(id, sodDueDate, sodPerDate, sodReqDate, sodPart, sodQtyOrd,
				sodQtyAll, sodQtyPick, sodQtyShip, sodQtyInv, sodLoc, sodType,
				sodPrice, sodStdCost, sodQtyChg, sodBoChg, sodAcct,
				sodAbnormal, sodTaxable, sodSerial, sodDesc, sodUm, sodCc,
				sodComment, sodLot, sodUmConv, sodFaNbr, sodDiscPct,
				sodProject, sodCmtindx, sodCustpart, sodQad01, sodStatus,
				sodXslspsn, sodXcommPct, sodDscAcct, sodDscCc, sodListPr,
				sodUser1, sodUser2, sodSobRev, sodSobStd, sodQtyQote,
				sodConsume, sodExpire, sodQad02, sodTaxc, sodInvNbr,
				sodPartial, sodSite, sodProdline, sodTaxIn, sodFstList, sodPst,
				sodChr01, sodChr02, sodChr03, sodChr04, sodChr05, sodChr06,
				sodChr07, sodChr08, sodChr09, sodChr10, sodDte01, sodDte02,
				sodDec01, sodDec02, sodLog01, sodTaxMax, sodCurrRlseId,
				sodSched, sodContrId, sodPickdate, sodConfirm, sodCumQty,
				sodCumDate, sodFor, sodRef, sodQtyPer, sodQtyItem, sodRmaType,
				sodOwner, sodCalcIsb, sodFrRate, sodSlspsn, sodCommPct,
				sodOrdMult, sodPkgCode, sodTransltDays, sodFsmType, sodConrep,
				sodSchData, sodSchMrp, sodRlseNbr, sodStartEff, sodEndEff,
				sodDock, sodPrList, sodTransltHrs, sodOutPo, sodRawDays,
				sodFabDays, sodTaxUsage, sodRbktDays, sodRbktWeeks,
				sodRbktMths, sodSchedChgd, sodPastdue, sodFixPr, sodFrWt,
				sodFrWtUm, sodFrClass, sodFrChg, sodShip, sodSaNbr, sodEnduser,
				sodIsbLoc, sodUpdIsb, sodIsbRef, sodAutoIns, sodDrpRef,
				sodTaxEnv, sodCrtInt, sodFrList, sodPricingDt, sodActPrice,
				sodCoveredAmt, sodFixedPrice, sodInvCost, sodCarLoad,
				sodCaLine, sodQtyCons, sodQtyRet, sodCaNbr, sodQtyPend,
				sodToLoc, sodToSite, sodToRef, sodLnRef, sodQtyExch,
				sodSadLine, sodWarrStart, sodModUserid, sodModDate, sodSvCode,
				sodAltPkg, sodForSerial, sodOverrideLmt, sodQadc01, sodQadc02,
				sodQadc03, sodQadc04, sodQadt01, sodQadt02, sodQadt03,
				sodQadt04, sodQadd01, sodQadd02, sodQadd03, sodQadl01,
				sodQadl02, sodQadl03, sodQadi01, sodQadi02, sodBonus,
				sodBtbType, sodBtbPo, sodBtbPodLine, sodBtbVend, sodExpDel,
				sodDirAll, sodCfgType, sodDiv, sodPlPriority, sodPrig1,
				sodPrig2, sodQadd04, sodSub, sodDscSub, sodDscProject,
				sodQtyIvcd, sodCumTime, sodShipPart, sodPromiseDate,
				sodChargeType, sodOrderCategory, sodModelyr, sodCustref,
				sodConsignment, sodMaxAgingDays, sodConsignLoc, sodIntransLoc,
				sodAutoReplenish, sodManualFrList, oidSodDet);
	}

}
