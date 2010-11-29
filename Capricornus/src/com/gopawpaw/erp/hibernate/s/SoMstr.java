package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SoMstr entity. @author MyEclipse Persistence Tools
 */
public class SoMstr extends AbstractSoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SoMstr() {
	}

	/** minimal constructor */
	public SoMstr(SoMstrId id, Boolean soPrimary, String soCustPo,
			Double soExRate2, String soExRatetype, Integer soExruSeq,
			Double soPrepTax, Boolean soCustrefVal, Boolean soConsignment,
			Integer soMaxAgingDays, String soConsignLoc, String soIntransLoc,
			Boolean soAutoReplenish, String soRevenue, String soFsaccrAcct,
			String soFsaccrSub, String soFsaccrCc, String soFsdefAcct,
			String soFsdefSub, String soFsdefCc, Boolean soManualFrTerms,
			Double oidSoMstr) {
		super(id, soPrimary, soCustPo, soExRate2, soExRatetype, soExruSeq,
				soPrepTax, soCustrefVal, soConsignment, soMaxAgingDays,
				soConsignLoc, soIntransLoc, soAutoReplenish, soRevenue,
				soFsaccrAcct, soFsaccrSub, soFsaccrCc, soFsdefAcct, soFsdefSub,
				soFsdefCc, soManualFrTerms, oidSoMstr);
	}

	/** full constructor */
	public SoMstr(SoMstrId id, String soCust, String soShip, Date soOrdDate,
			Date soReqDate, Date soDueDate, String soRmks, String soCrTerms,
			String soFob, String soPo, String soShipvia, Boolean soPartial,
			Boolean soPrintSo, String soInvNbr, String soPrList,
			String soXslspsn, String soSource, String soXcommPct,
			String soCrCard, Boolean soPrintPl, String soCrInit, String soStat,
			Double soQad01, Double soQad02, Double soQad03, Double soDiscPct,
			String soTaxPct, Double soPrepaid, Boolean soToInv,
			Boolean soInvoiced, String soArAcct, String soArCc, Date soInvDate,
			Date soShipDate, Boolean soTaxable, Integer soCmtindx,
			Integer soQad04, String soUser1, String soUser2, String soCurr,
			Double soExRate, String soLang, String soType, Date soConfDate,
			Integer soRev, String soBol, String soQad05, Boolean soPst,
			String soFstId, Double soTrl1Amt, String soTrl1Cd,
			Double soTrl2Amt, String soTrl2Cd, Double soTrl3Amt,
			String soTrl3Cd, Double soWeight, String soWeightUm, Double soSize,
			String soSizeUm, Integer soCartons, String soSite, String soPstId,
			Date soCnclDate, String soQuote, String soTaxc, String soChr01,
			String soChr02, String soChr03, String soChr04, String soChr05,
			String soChr06, String soChr07, String soChr08, String soChr09,
			String soChr10, Date soDte01, Date soDte02, Double soDec01,
			Double soDec02, Boolean soLog01, Boolean soCredit, String soInvCr,
			String soProject, String soChannel, Double soPstPct,
			String soFrList, String soFrTerms, String soSlspsn,
			String soCommPct, String soInvMthd, Boolean soFixRate,
			Double soEntEx, String soBill, Boolean soPrintBl, String soUserid,
			Date soTaxDate, String soFsmType, String soConrep, String soBank,
			String soTaxEnv, Boolean soSched, Double soFrMinWt,
			String soPrList2, String soTaxUsage, String soSaNbr,
			Boolean soFixPr, String soSchMthd, Date soPricingDt,
			Date soPricedDt, String soCaNbr, String soEngCode,
			String soFcgCode, Boolean soShipEng, String soCrprlist,
			String soQadc01, String soQadc02, String soQadc03, String soQadc04,
			String soQadc05, Boolean soQadl01, Boolean soQadl02,
			Boolean soInclIss, Integer soQadi01, Integer soQadi02,
			Integer soQadi03, Double soQadd01, Double soQadd02,
			Double soQadd03, Date soQadt01, Date soQadt02, Date soQadt03,
			Integer soAuthDays, Boolean soCumAcct, Boolean soMergeRss,
			Integer soShipCmplt, Boolean soBumpAll, Boolean soPrimary,
			String soCustPo, Boolean soSecondary, String soShipPo,
			Double soExRate2, String soExRatetype, String soDiv,
			Integer soExruSeq, String soAppOwner, String soArSub,
			Boolean soSeqOrder, Boolean soIncInRss, Integer soFirmSeqDays,
			Double soPrepTax, Boolean soQadl04, Boolean soCustrefVal,
			Boolean soConsignment, Integer soMaxAgingDays, String soConsignLoc,
			String soIntransLoc, Boolean soAutoReplenish, String soRevenue,
			String soFsaccrAcct, String soFsaccrSub, String soFsaccrCc,
			String soFsdefAcct, String soFsdefSub, String soFsdefCc,
			Boolean soManualFrTerms, Double oidSoMstr) {
		super(id, soCust, soShip, soOrdDate, soReqDate, soDueDate, soRmks,
				soCrTerms, soFob, soPo, soShipvia, soPartial, soPrintSo,
				soInvNbr, soPrList, soXslspsn, soSource, soXcommPct, soCrCard,
				soPrintPl, soCrInit, soStat, soQad01, soQad02, soQad03,
				soDiscPct, soTaxPct, soPrepaid, soToInv, soInvoiced, soArAcct,
				soArCc, soInvDate, soShipDate, soTaxable, soCmtindx, soQad04,
				soUser1, soUser2, soCurr, soExRate, soLang, soType, soConfDate,
				soRev, soBol, soQad05, soPst, soFstId, soTrl1Amt, soTrl1Cd,
				soTrl2Amt, soTrl2Cd, soTrl3Amt, soTrl3Cd, soWeight, soWeightUm,
				soSize, soSizeUm, soCartons, soSite, soPstId, soCnclDate,
				soQuote, soTaxc, soChr01, soChr02, soChr03, soChr04, soChr05,
				soChr06, soChr07, soChr08, soChr09, soChr10, soDte01, soDte02,
				soDec01, soDec02, soLog01, soCredit, soInvCr, soProject,
				soChannel, soPstPct, soFrList, soFrTerms, soSlspsn, soCommPct,
				soInvMthd, soFixRate, soEntEx, soBill, soPrintBl, soUserid,
				soTaxDate, soFsmType, soConrep, soBank, soTaxEnv, soSched,
				soFrMinWt, soPrList2, soTaxUsage, soSaNbr, soFixPr, soSchMthd,
				soPricingDt, soPricedDt, soCaNbr, soEngCode, soFcgCode,
				soShipEng, soCrprlist, soQadc01, soQadc02, soQadc03, soQadc04,
				soQadc05, soQadl01, soQadl02, soInclIss, soQadi01, soQadi02,
				soQadi03, soQadd01, soQadd02, soQadd03, soQadt01, soQadt02,
				soQadt03, soAuthDays, soCumAcct, soMergeRss, soShipCmplt,
				soBumpAll, soPrimary, soCustPo, soSecondary, soShipPo,
				soExRate2, soExRatetype, soDiv, soExruSeq, soAppOwner, soArSub,
				soSeqOrder, soIncInRss, soFirmSeqDays, soPrepTax, soQadl04,
				soCustrefVal, soConsignment, soMaxAgingDays, soConsignLoc,
				soIntransLoc, soAutoReplenish, soRevenue, soFsaccrAcct,
				soFsaccrSub, soFsaccrCc, soFsdefAcct, soFsdefSub, soFsdefCc,
				soManualFrTerms, oidSoMstr);
	}

}
