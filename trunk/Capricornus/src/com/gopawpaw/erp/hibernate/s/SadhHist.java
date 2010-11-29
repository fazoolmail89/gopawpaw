package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SadhHist entity. @author MyEclipse Persistence Tools
 */
public class SadhHist extends AbstractSadhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SadhHist() {
	}

	/** minimal constructor */
	public SadhHist(SadhHistId id, Double oidSadhHist) {
		super(id, oidSadhHist);
	}

	/** full constructor */
	public SadhHist(SadhHistId id, String sadhQadc05, String sadhAmtType,
			String sadhArea, Date sadhCancel, String sadhCaNbr,
			String sadhQadc06, Integer sadhCmtindx, String sadhComment,
			String sadhCommPct, Double sadhCrtInt, String sadhCustpart,
			String sadhCycle, String sadhQadc07, String sadhQadc08,
			String sadhDesc, Boolean sadhDiscount, Double sadhDiscPct,
			String sadhQadc09, String sadhQadc10, Date sadhEndDate,
			String sadhEsNbr, String sadhEuNbr, Date sadhExpire,
			Boolean sadhFixPr, String sadhFor, Boolean sadhFstList,
			Date sadhLastbill, Integer sadhLine, Double sadhListPr,
			Date sadhLstcover, Date sadhLstBill, String sadhNbr,
			Date sadhNxtBill, String sadhPart, String sadhPctType,
			Date sadhPerDate, String sadhPrefix, Double sadhPrice,
			Integer sadhPriority, String sadhProdline, String sadhProject,
			String sadhPrList, Boolean sadhPst, Boolean sadhPvmBill,
			String sadhPvmBom, Boolean sadhPvmOnly, String sadhPvmRoute,
			Double sadhQtyBld, Double sadhQtyChg, Double sadhQtyItem,
			Double sadhQtyLitm, Double sadhQtyLst, Double sadhQtyPer,
			Integer sadhRef, String sadhSerial, String sadhSite,
			String sadhSlspsn, Integer sadhSoLine, String sadhSoShip,
			Integer sadhSoShipln, String sadhStatus, Double sadhStdCost,
			Date sadhStCover, Date sadhStDate, Boolean sadhTaxable,
			String sadhTaxc, String sadhTaxEnv, Boolean sadhTaxIn,
			String sadhTaxUsage, Double sadhTotalBld, Double sadhTotalPrice,
			String sadhType, String sadhUm, Double sadhUmConv,
			String sadhUser1, String sadhUser2, Double sadhVisits,
			String sadhChr01, String sadhChr02, String sadhChr03,
			String sadhChr04, String sadhChr05, String sadhChr06,
			String sadhChr07, String sadhChr08, String sadhChr09,
			String sadhChr10, Double sadhDec01, Double sadhDec02,
			Double sadhDec03, Date sadhDte01, Date sadhDte02, Date sadhDte03,
			Boolean sadhLog01, Boolean sadhLog02, Boolean sadhLog03,
			String sadhQadc01, String sadhQadc02, String sadhQadc03,
			String sadhQadc04, Date sadhQadt01, Date sadhQadt02,
			Date sadhQadt03, Double sadhQadd01, Double sadhQadd02,
			Double sadhQadd03, Boolean sadhPrlistFnd, Boolean sadhQadl02,
			Boolean sadhQadl03, Boolean sadhMrp, String sadhModUserid,
			Date sadhModDate, Date sadhPricingDt, Boolean sadhQadl01,
			Double oidSadhHist) {
		super(id, sadhQadc05, sadhAmtType, sadhArea, sadhCancel, sadhCaNbr,
				sadhQadc06, sadhCmtindx, sadhComment, sadhCommPct, sadhCrtInt,
				sadhCustpart, sadhCycle, sadhQadc07, sadhQadc08, sadhDesc,
				sadhDiscount, sadhDiscPct, sadhQadc09, sadhQadc10, sadhEndDate,
				sadhEsNbr, sadhEuNbr, sadhExpire, sadhFixPr, sadhFor,
				sadhFstList, sadhLastbill, sadhLine, sadhListPr, sadhLstcover,
				sadhLstBill, sadhNbr, sadhNxtBill, sadhPart, sadhPctType,
				sadhPerDate, sadhPrefix, sadhPrice, sadhPriority, sadhProdline,
				sadhProject, sadhPrList, sadhPst, sadhPvmBill, sadhPvmBom,
				sadhPvmOnly, sadhPvmRoute, sadhQtyBld, sadhQtyChg, sadhQtyItem,
				sadhQtyLitm, sadhQtyLst, sadhQtyPer, sadhRef, sadhSerial,
				sadhSite, sadhSlspsn, sadhSoLine, sadhSoShip, sadhSoShipln,
				sadhStatus, sadhStdCost, sadhStCover, sadhStDate, sadhTaxable,
				sadhTaxc, sadhTaxEnv, sadhTaxIn, sadhTaxUsage, sadhTotalBld,
				sadhTotalPrice, sadhType, sadhUm, sadhUmConv, sadhUser1,
				sadhUser2, sadhVisits, sadhChr01, sadhChr02, sadhChr03,
				sadhChr04, sadhChr05, sadhChr06, sadhChr07, sadhChr08,
				sadhChr09, sadhChr10, sadhDec01, sadhDec02, sadhDec03,
				sadhDte01, sadhDte02, sadhDte03, sadhLog01, sadhLog02,
				sadhLog03, sadhQadc01, sadhQadc02, sadhQadc03, sadhQadc04,
				sadhQadt01, sadhQadt02, sadhQadt03, sadhQadd01, sadhQadd02,
				sadhQadd03, sadhPrlistFnd, sadhQadl02, sadhQadl03, sadhMrp,
				sadhModUserid, sadhModDate, sadhPricingDt, sadhQadl01,
				oidSadhHist);
	}

}
