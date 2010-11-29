package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IhHist entity. @author MyEclipse Persistence Tools
 */
public class IhHist extends AbstractIhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhHist() {
	}

	/** minimal constructor */
	public IhHist(IhHistId id, Boolean ihPrimary, Double ihExRate2,
			String ihExRatetype, Integer ihExruSeq, Double ihPrepTax,
			Boolean ihCustrefVal, Double oidIhHist) {
		super(id, ihPrimary, ihExRate2, ihExRatetype, ihExruSeq, ihPrepTax,
				ihCustrefVal, oidIhHist);
	}

	/** full constructor */
	public IhHist(IhHistId id, String ihCust, String ihShip, Date ihOrdDate,
			Date ihReqDate, Date ihDueDate, String ihRmks, String ihCrTerms,
			String ihFob, String ihPo, String ihShipvia, Boolean ihPartial,
			Boolean ihPrintSo, String ihPrList, String ihXslspsn,
			String ihSource, String ihXcommPct, String ihCrCard,
			Boolean ihPrintPl, String ihCrInit, String ihStat, Double ihQad01,
			Double ihQad02, Double ihQad03, Double ihDiscPct, String ihTaxPct,
			Double ihPrepaid, Boolean ihToInv, Boolean ihInvoiced,
			String ihArAcct, String ihArCc, Date ihInvDate, Date ihShipDate,
			Boolean ihTaxable, Integer ihCmtindx, Integer ihQad04,
			String ihUser1, String ihUser2, String ihCurr, Double ihExRate,
			String ihLang, String ihType, Date ihConfDate, Integer ihRev,
			String ihBol, String ihQad05, Boolean ihPst, String ihFstId,
			Double ihTrl1Amt, String ihTrl1Cd, Double ihTrl2Amt,
			String ihTrl2Cd, Double ihTrl3Amt, String ihTrl3Cd,
			Double ihWeight, String ihWeightUm, Double ihSize, String ihSizeUm,
			Integer ihCartons, String ihSite, String ihQuote, String ihTaxc,
			String ihChr01, String ihChr02, String ihChr03, String ihChr04,
			String ihChr05, String ihChr06, String ihChr07, String ihChr08,
			String ihChr09, String ihChr10, Date ihDte01, Date ihDte02,
			Double ihDec01, Double ihDec02, Boolean ihLog01, Boolean ihCredit,
			String ihInvCr, String ihProject, Double ihPstPct, String ihFrList,
			String ihFrTerms, String ihCommPct, String ihSlspsn,
			Boolean ihFixRate, Double ihEntEx, String ihBill,
			Boolean ihPrintBl, String ihUserid, Date ihTaxDate,
			String ihChannel, String ihInvMthd, String ihPstId,
			String ihFsmType, String ihBank, Double ihFrMinWt,
			String ihPrList2, String ihTaxEnv, String ihTaxUsage,
			String ihSaNbr, String ihCrprlist, Boolean ihShipEng,
			Date ihCnclDate, String ihConrep, Boolean ihSched, Boolean ihFixPr,
			String ihSchMthd, String ihCaNbr, String ihFcgCode, Date ihModDate,
			Date ihPricedDt, Date ihPricingDt, Double ihRstkPct,
			String ihQadc01, String ihQadc02, String ihQadc03, String ihQadc04,
			String ihQadc05, Date ihQadt01, Date ihQadt02, Date ihQadt03,
			Double ihQadd01, Double ihQadd02, Double ihQadd03,
			Integer ihQadi01, Integer ihQadi02, Integer ihQadi03,
			Boolean ihQadl01, Boolean ihQadl02, Boolean ihQadl03,
			Boolean ihPrimary, String ihCustPo, Boolean ihSecondary,
			String ihShipPo, Double ihExRate2, String ihExRatetype,
			String ihDiv, Integer ihExruSeq, Integer ihExportBatch,
			Date ihExportDate, Integer ihExportTime, String ihArSub,
			Double ihPrepTax, Boolean ihCustrefVal, Double oidIhHist) {
		super(id, ihCust, ihShip, ihOrdDate, ihReqDate, ihDueDate, ihRmks,
				ihCrTerms, ihFob, ihPo, ihShipvia, ihPartial, ihPrintSo,
				ihPrList, ihXslspsn, ihSource, ihXcommPct, ihCrCard, ihPrintPl,
				ihCrInit, ihStat, ihQad01, ihQad02, ihQad03, ihDiscPct,
				ihTaxPct, ihPrepaid, ihToInv, ihInvoiced, ihArAcct, ihArCc,
				ihInvDate, ihShipDate, ihTaxable, ihCmtindx, ihQad04, ihUser1,
				ihUser2, ihCurr, ihExRate, ihLang, ihType, ihConfDate, ihRev,
				ihBol, ihQad05, ihPst, ihFstId, ihTrl1Amt, ihTrl1Cd, ihTrl2Amt,
				ihTrl2Cd, ihTrl3Amt, ihTrl3Cd, ihWeight, ihWeightUm, ihSize,
				ihSizeUm, ihCartons, ihSite, ihQuote, ihTaxc, ihChr01, ihChr02,
				ihChr03, ihChr04, ihChr05, ihChr06, ihChr07, ihChr08, ihChr09,
				ihChr10, ihDte01, ihDte02, ihDec01, ihDec02, ihLog01, ihCredit,
				ihInvCr, ihProject, ihPstPct, ihFrList, ihFrTerms, ihCommPct,
				ihSlspsn, ihFixRate, ihEntEx, ihBill, ihPrintBl, ihUserid,
				ihTaxDate, ihChannel, ihInvMthd, ihPstId, ihFsmType, ihBank,
				ihFrMinWt, ihPrList2, ihTaxEnv, ihTaxUsage, ihSaNbr,
				ihCrprlist, ihShipEng, ihCnclDate, ihConrep, ihSched, ihFixPr,
				ihSchMthd, ihCaNbr, ihFcgCode, ihModDate, ihPricedDt,
				ihPricingDt, ihRstkPct, ihQadc01, ihQadc02, ihQadc03, ihQadc04,
				ihQadc05, ihQadt01, ihQadt02, ihQadt03, ihQadd01, ihQadd02,
				ihQadd03, ihQadi01, ihQadi02, ihQadi03, ihQadl01, ihQadl02,
				ihQadl03, ihPrimary, ihCustPo, ihSecondary, ihShipPo,
				ihExRate2, ihExRatetype, ihDiv, ihExruSeq, ihExportBatch,
				ihExportDate, ihExportTime, ihArSub, ihPrepTax, ihCustrefVal,
				oidIhHist);
	}

}
