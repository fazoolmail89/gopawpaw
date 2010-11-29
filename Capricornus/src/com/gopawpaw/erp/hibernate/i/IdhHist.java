package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * IdhHist entity. @author MyEclipse Persistence Tools
 */
public class IdhHist extends AbstractIdhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhHist() {
	}

	/** minimal constructor */
	public IdhHist(IdhHistId id, Boolean idhBonus, String idhBtbType,
			String idhBtbPo, Integer idhBtbPodLine, String idhBtbVend,
			String idhModelyr, String idhCustref, Double oidIdhHist) {
		super(id, idhBonus, idhBtbType, idhBtbPo, idhBtbPodLine, idhBtbVend,
				idhModelyr, idhCustref, oidIdhHist);
	}

	/** full constructor */
	public IdhHist(IdhHistId id, Date idhDueDate, Date idhPerDate,
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
		super(id, idhDueDate, idhPerDate, idhReqDate, idhPart, idhQtyOrd,
				idhQtyAll, idhQtyPick, idhQtyShip, idhQtyInv, idhLoc, idhType,
				idhPrice, idhStdCost, idhQtyChg, idhBoChg, idhAcct,
				idhAbnormal, idhTaxable, idhSerial, idhDesc, idhUm, idhCc,
				idhComment, idhLot, idhUmConv, idhFaNbr, idhDiscPct,
				idhProject, idhCmtindx, idhCustpart, idhQad01, idhStatus,
				idhXslspsn, idhXcommPct, idhDscAcct, idhDscCc, idhListPr,
				idhUser1, idhUser2, idhSobRev, idhSobStd, idhQtyQote,
				idhConsume, idhExpire, idhQad02, idhTaxc, idhSite, idhProdline,
				idhChr01, idhChr02, idhChr03, idhChr04, idhChr05, idhChr06,
				idhChr07, idhChr08, idhChr09, idhChr10, idhDte01, idhDte02,
				idhDec01, idhDec02, idhLog01, idhDte03, idhDec03, idhDec04,
				idhDec05, idhTaxMax, idhTaxIn, idhPst, idhFor, idhRef,
				idhQtyPer, idhQtyItem, idhRmaType, idhOwner, idhCalcIsb,
				idhFrRate, idhSlspsn, idhCommPct, idhRetroPrice, idhFstList,
				idhCumDate, idhContrId, idhCumQty, idhCurrRlseId, idhOrdMult,
				idhPkgCode, idhRlseNbr, idhSchData, idhSchMrp, idhSched,
				idhTransLt, idhFsmType, idhSaNbr, idhFrChg, idhFrClass,
				idhFrWt, idhFrWtUm, idhFixPr, idhTaxUsage, idhTaxEnv,
				idhFrList, idhCrtInt, idhActPrice, idhAutoIns, idhCoveredAmt,
				idhOverrideLmt, idhEnduser, idhIsbLoc, idhIsbRef, idhShip,
				idhFixedPrice, idhInvCost, idhPartial, idhPickdate, idhConrep,
				idhStartEff, idhEndEff, idhOutPo, idhTransltHrs, idhPrList,
				idhDock, idhRawDays, idhFabDays, idhRbktDays, idhRbktWeeks,
				idhRbktMths, idhSchedChgd, idhPastdue, idhDrpRef, idhUpdIsb,
				idhCaNbr, idhCarLoad, idhCaLine, idhQtyCons, idhQtyRet,
				idhQtyPend, idhToLoc, idhToSite, idhLnRef, idhToRef,
				idhQtyExch, idhWarrStart, idhSadLine, idhModUserid, idhModDate,
				idhPricingDt, idhSvCode, idhForSerial, idhQadc01, idhQadc02,
				idhQadc03, idhQadc04, idhQadc05, idhQadc06, idhQadi01,
				idhQadi02, idhQadi03, idhQadi04, idhQadd01, idhQadd02,
				idhQadd03, idhQadd04, idhQadd05, idhQadl01, idhQadl02,
				idhQadl03, idhQadl04, idhQadl05, idhQadt01, idhQadt02,
				idhQadt03, idhQadt04, idhQadt05, idhBonus, idhBtbType,
				idhBtbPo, idhBtbPodLine, idhBtbVend, idhExpDel, idhCfgType,
				idhDiv, idhPlPriority, idhPrig1, idhPrig2, idhSub,
				idhDscProject, idhDscSub, idhPromiseDate, idhModelyr,
				idhCustref, oidIdhHist);
	}

}
