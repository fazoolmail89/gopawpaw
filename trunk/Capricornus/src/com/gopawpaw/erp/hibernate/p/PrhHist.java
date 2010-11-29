package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PrhHist entity. @author MyEclipse Persistence Tools
 */
public class PrhHist extends AbstractPrhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrhHist() {
	}

	/** minimal constructor */
	public PrhHist(PrhHistId id, Double prhExRate2, String prhExRatetype,
			Integer prhExruSeq, String prhQadc01, Double oidPrhHist) {
		super(id, prhExRate2, prhExRatetype, prhExruSeq, prhQadc01, oidPrhHist);
	}

	/** full constructor */
	public PrhHist(PrhHistId id, String prhPart, Double prhRcvd,
			Double prhPurCost, Double prhPurStd, Date prhRcpDate,
			String prhVend, String prhLot, String prhPsNbr, Double prhPsQty,
			Double prhBoQty, String prhQadc02, String prhXinvoice,
			Date prhXinvDt, Double prhQadd01, Double prhXinvCst,
			String prhQadc03, String prhQadc04, String prhQadc05,
			String prhRev, String prhType, Boolean prhPrint, Double prhLbrStd,
			Double prhMtlStd, Double prhBdnStd, Double prhSubStd,
			String prhBuyer, Double prhQad03, String prhQad02,
			String prhShipto, Boolean prhCstUp, String prhUm, Double prhUmConv,
			String prhCurr, Double prhExRate, Double prhCurrAmt,
			String prhPayUm, Double prhPumConv, String prhUser1,
			String prhUser2, Double prhOvhStd, String prhSite, String prhShip,
			Double prhQtyOrd, Date prhPerDate, String prhRcpType,
			String prhReason, String prhRequest, String prhApprove,
			Integer prhQad04, String prhTaxAt, String prhChr01,
			String prhChr02, String prhChr03, String prhChr04, String prhChr05,
			String prhChr06, String prhChr07, String prhChr08, String prhChr09,
			String prhChr10, Date prhDte01, Date prhDte02, Date prhDte03,
			Date prhDte04, Date prhDte05, Double prhDec01, Double prhDec02,
			Double prhDec03, Double prhDec04, Double prhDec05,
			Boolean prhLog01, Boolean prhLog02, String prhRmaType,
			Boolean prhFixRate, String prhPoSite, Double prhCumReq,
			Double prhCumRcvd, String prhFsmType, String prhBank,
			String prhCurrRlseId, Boolean prhFixPr, Double prhCrtInt,
			String prhTaxEnv, Boolean prhTaxIn, String prhTaxUsage,
			String prhTaxc, String prhVendLot, Date prhShipDate,
			Integer prhQadi01, Double prhExRate2, String prhExRatetype,
			Integer prhExruSeq, String prhQadc06, String prhQadc01,
			Double oidPrhHist) {
		super(id, prhPart, prhRcvd, prhPurCost, prhPurStd, prhRcpDate, prhVend,
				prhLot, prhPsNbr, prhPsQty, prhBoQty, prhQadc02, prhXinvoice,
				prhXinvDt, prhQadd01, prhXinvCst, prhQadc03, prhQadc04,
				prhQadc05, prhRev, prhType, prhPrint, prhLbrStd, prhMtlStd,
				prhBdnStd, prhSubStd, prhBuyer, prhQad03, prhQad02, prhShipto,
				prhCstUp, prhUm, prhUmConv, prhCurr, prhExRate, prhCurrAmt,
				prhPayUm, prhPumConv, prhUser1, prhUser2, prhOvhStd, prhSite,
				prhShip, prhQtyOrd, prhPerDate, prhRcpType, prhReason,
				prhRequest, prhApprove, prhQad04, prhTaxAt, prhChr01, prhChr02,
				prhChr03, prhChr04, prhChr05, prhChr06, prhChr07, prhChr08,
				prhChr09, prhChr10, prhDte01, prhDte02, prhDte03, prhDte04,
				prhDte05, prhDec01, prhDec02, prhDec03, prhDec04, prhDec05,
				prhLog01, prhLog02, prhRmaType, prhFixRate, prhPoSite,
				prhCumReq, prhCumRcvd, prhFsmType, prhBank, prhCurrRlseId,
				prhFixPr, prhCrtInt, prhTaxEnv, prhTaxIn, prhTaxUsage, prhTaxc,
				prhVendLot, prhShipDate, prhQadi01, prhExRate2, prhExRatetype,
				prhExruSeq, prhQadc06, prhQadc01, oidPrhHist);
	}

}
